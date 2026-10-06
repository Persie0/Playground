package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mok extends mol {

    /* JADX INFO: renamed from: a */
    public static final mol f41193a;

    static {
        mok mokVar = new mok(new C1117xf(0));
        if (mokVar.f41195b) {
            throw new IllegalStateException("Already frozen");
        }
        mokVar.f41195b = true;
        f41193a = mokVar;
    }

    private mok(C1117xf c1117xf) {
        super(c1117xf);
    }
}
