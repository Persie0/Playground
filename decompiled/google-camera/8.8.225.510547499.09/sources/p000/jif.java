package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jif {

    /* JADX INFO: renamed from: b */
    private static jif f34119b = null;

    /* JADX INFO: renamed from: c */
    private static final jig f34120c = new jig(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a */
    public jig f34121a;

    private jif() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized jif m13225a() {
        if (f34119b == null) {
            f34119b = new jif();
        }
        return f34119b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m13226b(jig jigVar) {
        try {
            if (jigVar == null) {
                this.f34121a = f34120c;
                return;
            }
            jig jigVar2 = this.f34121a;
            if (jigVar2 == null || jigVar2.f34122a < jigVar.f34122a) {
                this.f34121a = jigVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
