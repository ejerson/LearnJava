package com.edgedevelop.classdesign;

class HeavyAnimal {
}

interface GrayAnimal {
}

class Rhino extends HeavyAnimal {
}

class Elephant extends HeavyAnimal implements GrayAnimal {
}

public class InstanceOf {
    public static void main(String[] args) {
        Rhino rhino = new Rhino();
//        System.out.println(rhino instanceof Elephant);
        System.out.println(rhino instanceof GrayAnimal);
    }
}




