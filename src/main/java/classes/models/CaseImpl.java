package classes.models;

import classes.models.unitmodels.CaseColor;

public class CaseImpl implements Case {

    private final CaseColor caseColor;

    public CaseImpl(CaseColor caseColor) {
        this.caseColor = caseColor;
    }

    public CaseColor getCaseColor() {
        return caseColor;
    }
}
