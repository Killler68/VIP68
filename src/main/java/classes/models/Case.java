package main.java.classes.models;

import main.java.classes.models.unitmodels.CaseColor;

public class Case {

    private final CaseColor caseColor;

    public Case(CaseColor caseColor) {
        this.caseColor = caseColor;
    }

    public CaseColor getCaseColor() {
        return caseColor;
    }
}
