package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum eqz {
    AUTO,
    LANDSCAPE,
    ACTION;

    /* JADX INFO: renamed from: a */
    public static eqz m7711a(int i) {
        switch (i) {
            case 1:
                return LANDSCAPE;
            case 2:
                return ACTION;
            default:
                return AUTO;
        }
    }
}
