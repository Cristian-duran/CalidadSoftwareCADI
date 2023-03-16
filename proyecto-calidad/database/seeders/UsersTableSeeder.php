<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;

use App\Models\User;
use Spatie\Permission\Models\Role;
use Spatie\Permission\Models\Permission;

class UsersTableSeeder extends Seeder
{
    public function run()
    {
        $user = User::create([
            'name' => 'Administrador',
            'email' => 'admin@gmail.com',
            'password' => bcrypt('Mypassword01'),
        ]);

        $admin = Role::create([
            'name' => 'Admin',
            'description' => 'Administrador tiene privilegios de todo el sistema',
        ]);
        $permisos = Permission::pluck('id', 'id')->all();

        $admin->syncPermissions($permisos);

        $user->assignRole([$admin->id]);
    }
}
