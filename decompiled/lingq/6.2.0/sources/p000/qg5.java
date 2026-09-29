package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qg5 {

    /* JADX INFO: renamed from: a */
    public final Object f57757a;

    /* JADX INFO: renamed from: b */
    public final String f57758b;

    public qg5(ccd ccdVar, String str) {
        this.f57757a = ccdVar;
        this.f57758b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        return this.f57757a == qg5Var.f57757a && this.f57758b.equals(qg5Var.f57758b);
    }

    public final int hashCode() {
        return this.f57758b.hashCode() + (System.identityHashCode(this.f57757a) * 31);
    }
}
