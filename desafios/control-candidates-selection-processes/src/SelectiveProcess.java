import java.util.Random;

public class SelectiveProcess {
    public static void main(String[] args) {
        double baseSalary = 1320;

        String [] selectedCandidates = selectCandidates(baseSalary);

        for(String candidate : selectedCandidates) {
            if(candidate == null) {
                continue; 
            }
            
            System.out.println(candidate);
            callTheCandidate(candidate);
        }
    }

    public static boolean toConnect(double baseSalary, double intendedSalary) {
        if(baseSalary >= intendedSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void mensage(double baseSalary, double intendedSalary) {
        boolean result = toConnect(baseSalary, intendedSalary);

        if(result) {
            if(baseSalary == intendedSalary) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            } else {
                System.out.println("LIGAR PARA O CANDIDATO");
            } 
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static String [] candidateList() {
        String [] candidates = {"FELIPE",
                                "MÁRCIA",
                                "JULIA",
                                "PAULO",
                                "AUGUSTO",
                                "MÔNICA",
                                "FABRÍCIO",
                                "MIRELA",
                                "DANIELA",
                                "JORGE"};
        return candidates;
    }

    public static String [] selectCandidates(double baseSalary) {
        String [] candidates = candidateList();
        String [] selectedCandidates = new String[5];
        
        int totalSelected = 0;
		int nextCandidate = 0; 

		while(totalSelected < 5 && nextCandidate < candidates.length) {
			String candidate = candidates[nextCandidate++];
            double intendedSalary = intendedSalary(candidate);

			System.out.println("O candidato " + candidate + " está pedindo " + intendedSalary);

            boolean result = toConnect(baseSalary, intendedSalary);

			if(!result) {
				System.out.println("QUE PENA!! O candidato " + candidate + " NÃO foi selecionado ");
				
			} else {
				System.out.println("LEGAL!! O candidato " + candidate + " foi selecionado ");

                selectedCandidates[totalSelected] = candidate;

				totalSelected++;
			}
			
		}

		System.out.println("Total de selecionados: " + totalSelected);
		System.out.println("Total de consultados: " + nextCandidate);

        return selectedCandidates;
    }

    public static double intendedSalary(String candidate) {
	    int seed = candidate.hashCode();
        Random random = new Random(seed);

        return 1000 + (2200 - 1000) * random.nextDouble();
	}

    public static void callTheCandidate(String candidate) {
        int attemptMade = 1;
        boolean keepTrying = true;
        boolean answered = false;

        do{
            answered = toConnect(attemptMade, attemptMade);
            keepTrying = !answered;

            if(keepTrying) {
                attemptMade++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(keepTrying && attemptMade < 3);

        if(answered) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidate + " NA " + attemptMade + "ª TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidate + ", NÚMERO MAXIMO DE TENTATIVAS " + attemptMade + " REALIZADAS");
        }
    }
}
