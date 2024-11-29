import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

// Clase que representa un desarrollador tecnológico
class TechProfessional {
    // Atributos del desarrollador
    String firstName;       // Nombre
    String lastName;        // Apellido
    String city;            // Ciudad
    String region;          // Región (reemplaza continente)
    int age;                // Edad
    String programmingLanguage; // Lenguaje de programación
    String specialization;  // Especialización
    String greeting;        // Saludo personalizado

    // Constructor para crear un desarrollador
    public TechProfessional(String firstName, String lastName, String city, 
                             String region, int age, String programmingLanguage, 
                             String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.region = region;
        this.age = age;
        this.programmingLanguage = programmingLanguage;
        this.specialization = specialization;
        this.greeting = "";
    }
}

public class TechCommunity {

    // Método para verificar diversidad regional
    public static boolean isGlobalTechMeetup(ArrayList<TechProfessional> professionals) {
        // Conjunto para almacenar regiones únicas
        HashSet<String> regions = new HashSet<>();
        
        // Agregamos cada región al conjunto
        for (TechProfessional pro : professionals) {
            regions.add(pro.region);
        }
        
        // Verificamos si hay representación de al menos 4 regiones diferentes
        return regions.size() >= 4;
    }

    // Método para contar desarrolladores de un lenguaje específico en una región
    public static int countSpecificDevelopers(ArrayList<TechProfessional> professionals, 
                                               String language, String targetRegion) {
        return (int) professionals.stream()
                .filter(p -> p.programmingLanguage.equals(language) && 
                             p.region.equals(targetRegion))
                .count();
    }

    // Método para obtener lenguajes representados
    public static HashSet<String> getRepresentedLanguages(ArrayList<TechProfessional> professionals) {
        HashSet<String> languages = new HashSet<>();
        for (TechProfessional pro : professionals) {
            languages.add(pro.programmingLanguage);
        }
        return languages;
    }

    // Método para generar saludos personalizados
    public static void generatePersonalGreetings(ArrayList<TechProfessional> professionals) {
        String[] greetingTemplates = {
            "Hey %s, what's your favorite part of %s development?",
            "Greetings %s! Tell me about your coolest %s project.",
            "Welcome %s! How did you get started with %s?"
        };

        Random random = new Random();

        for (TechProfessional pro : professionals) {
            // Selecciona un saludo aleatorio
            String selectedGreeting = greetingTemplates[random.nextInt(greetingTemplates.length)];
            pro.greeting = String.format(selectedGreeting, 
                                         pro.firstName, 
                                         pro.programmingLanguage);
        }
    }

    public static void main(String[] args) {
        // Crear lista de desarrolladores con más diversidad
        ArrayList<TechProfessional> professionals = new ArrayList<>();
        
        professionals.add(new TechProfessional(
            "Elena", "Rodriguez", "Buenos Aires", "South America", 28, 
            "Python", "Machine Learning"
        ));
        
        professionals.add(new TechProfessional(
            "Raj", "Patel", "Bangalore", "South Asia", 35, 
            "Java", "Enterprise Solutions"
        ));
        
        professionals.add(new TechProfessional(
            "Yuki", "Tanaka", "Tokyo", "East Asia", 30, 
            "Kotlin", "Mobile Development"
        ));
        
        professionals.add(new TechProfessional(
            "Mohammed", "Al-Fayed", "Dubai", "Middle East", 40, 
            "JavaScript", "Web Technologies"
        ));
        
        professionals.add(new TechProfessional(
            "Lars", "Andersen", "Copenhagen", "Northern Europe", 33, 
            "Rust", "Systems Programming"
        ));

        // Verificar diversidad regional
        System.out.println("¿Es un encuentro tecnológico global? " + 
                           isGlobalTechMeetup(professionals));
        
        // Contar desarrolladores específicos
        System.out.println("Desarrolladores de JavaScript en Medio Oriente: " + 
            countSpecificDevelopers(professionals, "JavaScript", "Middle East"));
        
        // Generar y mostrar saludos
        generatePersonalGreetings(professionals);
        for (TechProfessional pro : professionals) {
            System.out.println(pro.greeting);
        }
        
        // Mostrar lenguajes representados
        System.out.println("Lenguajes representados: " + 
                           getRepresentedLanguages(professionals));
    }
}