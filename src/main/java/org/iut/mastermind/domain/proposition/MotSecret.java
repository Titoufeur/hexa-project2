package org.iut.mastermind.domain.proposition;

import org.iut.mastermind.domain.partie.Partie;

public class MotSecret {
    private final String motSecret;

    public MotSecret(String mot) {
        this.motSecret = mot;
    }

    // on retourne le résultat de la comparaison
    // du mot essayé avec le mot secret
    public Reponse compareProposition(String essai) {
        Reponse r = new Reponse(this.motSecret);
        r.compare(essai);
        return r;
    }
}
