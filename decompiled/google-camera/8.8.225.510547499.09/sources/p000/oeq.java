package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oeq extends Exception {

    /* JADX INFO: renamed from: a */
    public final oep f45772a;

    public oeq(oep oepVar, String str) {
        this(oepVar, str, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18438a() {
        return this.f45772a.f45771g;
    }

    public oeq(oep oepVar, String str, Throwable th) {
        super(str, th);
        this.f45772a = oepVar;
    }

    public oeq(oep oepVar, Throwable th) {
        this(oepVar, null, th);
    }
}
