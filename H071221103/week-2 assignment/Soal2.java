class Person{
    String name;
    int age;
    boolean isMale; 
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender () {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public static void main (String[] args) {
        Person person1 = new Person();


        person1.setName("Evangelista");
        person1.setAge(19);
        person1.setGender(false);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }

}
