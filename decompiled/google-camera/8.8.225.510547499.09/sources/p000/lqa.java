package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqa extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f38948a;

    /* JADX WARN: Illegal instructions before constructor call */
    public lqa(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.f38948a = i;
    }
}
