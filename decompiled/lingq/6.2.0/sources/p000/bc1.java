package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bc1 {

    /* JADX INFO: renamed from: a */
    public final Object f8308a;

    /* JADX INFO: renamed from: b */
    public final nm0 f8309b;

    /* JADX INFO: renamed from: c */
    public final aj3 f8310c;

    /* JADX INFO: renamed from: d */
    public final Object f8311d;

    /* JADX INFO: renamed from: e */
    public final Throwable f8312e;

    public /* synthetic */ bc1(Object obj, nm0 nm0Var, aj3 aj3Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : nm0Var, (i & 4) != 0 ? null : aj3Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: a */
    public static bc1 m3606a(bc1 bc1Var, nm0 nm0Var, Throwable th, int i) {
        Object obj = bc1Var.f8308a;
        if ((i & 2) != 0) {
            nm0Var = bc1Var.f8309b;
        }
        nm0 nm0Var2 = nm0Var;
        aj3 aj3Var = bc1Var.f8310c;
        Object obj2 = bc1Var.f8311d;
        if ((i & 16) != 0) {
            th = bc1Var.f8312e;
        }
        return new bc1(obj, nm0Var2, aj3Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc1)) {
            return false;
        }
        bc1 bc1Var = (bc1) obj;
        return fa4.m11650l(this.f8308a, bc1Var.f8308a) && fa4.m11650l(this.f8309b, bc1Var.f8309b) && fa4.m11650l(this.f8310c, bc1Var.f8310c) && fa4.m11650l(this.f8311d, bc1Var.f8311d) && fa4.m11650l(this.f8312e, bc1Var.f8312e);
    }

    public final int hashCode() {
        Object obj = this.f8308a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        nm0 nm0Var = this.f8309b;
        int iHashCode2 = (iHashCode + (nm0Var == null ? 0 : nm0Var.hashCode())) * 31;
        aj3 aj3Var = this.f8310c;
        int iHashCode3 = (iHashCode2 + (aj3Var == null ? 0 : aj3Var.hashCode())) * 31;
        Object obj2 = this.f8311d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8312e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8308a + ", cancelHandler=" + this.f8309b + ", onCancellation=" + this.f8310c + ", idempotentResume=" + this.f8311d + ", cancelCause=" + this.f8312e + ')';
    }

    public bc1(Object obj, nm0 nm0Var, aj3 aj3Var, Object obj2, Throwable th) {
        this.f8308a = obj;
        this.f8309b = nm0Var;
        this.f8310c = aj3Var;
        this.f8311d = obj2;
        this.f8312e = th;
    }
}
