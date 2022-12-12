class Antivirus {
    private String name;
    private int virus_count;
    private static int max_virus;
    private static String name_max_virus;

    static {
        max_virus = 0;
        name_max_virus = "none";
    }

    Antivirus(String name, int virus_count) {
        this.name = name;
        this.virus_count = virus_count;
        if (virus_count > max_virus) {
            max_virus = virus_count;
            name_max_virus = name;
        }
    }

    void print_info(){
        System.out.println("\nAntivirus name: " + name);
        System.out.println("Number of viruses: " + virus_count);
    }

    static void print_max(){
        System.out.println("\nMax number of viruses: " + max_virus);
        System.out.println("Name: " + name_max_virus);
    }
    
    String get_name(){
        return name;
    }
    
    int get_count(){
        return virus_count;
    }
    
    String get_max_name(){
        return name_max_virus;
    }
    
    int get_max_num(){
        return max_virus;
    }
}

class Main {
    public static void main(String[] args) {
        Antivirus kaspersky = new Antivirus("Kaspersky", 420);
        Antivirus drweb = new Antivirus("Dr Web", 342);
        Antivirus avast = new Antivirus("Avast", 100);
        Antivirus antivirik = new Antivirus("Antivirik", 218);
        Antivirus jlu = new Antivirus("JesusLoveU", 55);

        kaspersky.print_info();
        drweb.print_info();
        avast.print_info();
        antivirik.print_info();
        jlu.print_info();
        Antivirus.print_max();
    }
}