package classes.models;

import classes.models.unitmodels.CaseColor;

public class Case {

    private final CaseColor caseColor;

    public Case(CaseColor caseColor) {
        this.caseColor = caseColor;
    }

    public CaseColor getCaseColor() {
        return caseColor;
    }
}
