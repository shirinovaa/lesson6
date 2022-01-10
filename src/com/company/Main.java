package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setWeapon(new Weapon("Grenade launcher","Scythe"));
        System.out.println("Жизнь босса " + boss.getHealth() + "Урон босса " + boss.getDamage() +
                "Тип оружия " + boss.weapon.getName() + "" +  "Название оружие" + boss.weapon.getType());
        System.out.println("Информация о боссе" + " " + boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(50);
        skeleton.setDamage(15);


        Skeleton skeleton1 = new Skeleton();
        skeleton.setHealth(100);
        skeleton.setDamage(50);
        System.out.println(skeleton.getHealth() + " " + skeleton.getDamage() + " " + skeleton.getArrows());
        System.out.println(skeleton1.getHealth() + " " + skeleton1.getDamage() + " " + skeleton1.getArrows());
    }



    }
