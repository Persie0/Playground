package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbq extends RuntimeException {
    public lbq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static lbq m15150a(leb lebVar) {
        return new lbq("Could not create EGL context for version " + lebVar.toString() + ".");
    }
}
