package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzy extends Exception {
    protected kzy(Throwable th) {
        super(th);
        setStackTrace(th.getStackTrace());
    }

    /* JADX INFO: renamed from: a */
    public static kzy m15111a(Throwable th) {
        return th instanceof kzy ? (kzy) th : new kzy(th);
    }
}
