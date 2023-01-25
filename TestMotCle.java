package TP2.bac3;

import java.util.*;

import ht.bac3.Article;

public class TestMotCle {

	public static void main(String[] args) {
		ArrayList<Etudiant> Liste = new ArrayList<Etudiant>();
		Liste.add(new Etudiant(2020022116, "KANDA JEANIS", "BAC3 IG", 23, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022125, "KAMIBA HANS", "BAC3 RT", 25, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022122, "MUKOSA ROMY", "BAC3 ISI", 22, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022113, "ILUNGA GERMAIN", "BAC1 IG", 20, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022130, "KIBWE JONATHAN", "BAC1 IG", 24, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022108, "KALONGA FRANCIS", "BAC2 IG", 26, "MARIE"));
		Liste.add(new Etudiant(2020022190, "KALONGA JOSUE", "BAC2 RT", 29, "DIVORCE"));
		Liste.add(new Etudiant(2020022109, "MUTUNDA NGOIE", "BAC1 ISI", 22, "MARIE"));
		Liste.add(new Etudiant(2020022100, "NGUV A MUJING", "BAC1 RT", 20, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022101, "TSHIBANG MBANG", "BAC1 RT", 23, "CELIBATAIRE"));
		
		Liste.add(new Etudiant(2020022117, "KAJ KAFAND", "BAC1 IG", 19, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022162, "MPEZ KUL", "BAC3 RT", 20, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022100, "DIPONDO EDDY", "BAC3 IG", 23, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022119, "MULUMBA GLODY", "BAC3 ISI", 27, "MARIE"));
		Liste.add(new Etudiant(2020022216, "BILONGA KASONGO", "BAC3 IG", 25, "MARIEE"));
		Liste.add(new Etudiant(2020022124, "MBIOLA HERVE", "BAC1 IG", 24, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022118, "MITONGA YVONNE", "BAC2 ISI", 19, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022300, "KAMBA YVE", "BAC3 IG", 21, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022104, "KASONGO BILL", "BAC1 IG", 23, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020022401, "ALONGE NYEMBO", "BAC2 IG", 22, "CELIBATAIRE"));
		
		Liste.add(new Etudiant(2020023113, "KALONJI KASONGO", "BAC3 IG", 23, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020003121, "YABILI MUKENA", "BAC3 RT", 25, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020024122, "MPTATA ALIN", "BAC3 ISI", 22, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020029113, "KUNDA HENNOCK", "BAC1 IG", 20, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020027140, "MAPENDO ANGE", "BAC1 IG", 24, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020024108, "MUJINGA ILUNGA", "BAC2 IG", 26, "MARIE"));
		Liste.add(new Etudiant(2020011190, "MUKEINA LYDIA", "BAC2 RT", 29, "DIVORCE"));
		Liste.add(new Etudiant(2020023108, "KALONGA JUNIOR", "BAC1 ISI", 22, "MARIE"));
		Liste.add(new Etudiant(2020000100, "MUJINGA BOPE", "BAC1 RT", 20, "CELIBATAIRE"));
		Liste.add(new Etudiant(2020035100, "TSHIBANGU LYDIA", "BAC1 RT", 23, "CELIBATAIRE"));
		
		Scanner lect = new Scanner(System.in);
		System.out.println("Quel Etudiant ?");
		String rech = lect.nextLine();
		
		for(Etudiant e : Liste) {
			if(e.getNom().contains(rech))
				System.out.println(e);
		}

	}

}
