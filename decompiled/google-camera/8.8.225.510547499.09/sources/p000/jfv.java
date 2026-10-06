package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfv {

    /* JADX INFO: renamed from: a */
    public final Object f33919a;

    /* JADX INFO: renamed from: b */
    public final String f33920b;

    public jfv(Object obj, String str) {
        this.f33919a = obj;
        this.f33920b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfv)) {
            return false;
        }
        jfv jfvVar = (jfv) obj;
        return this.f33919a == jfvVar.f33919a && this.f33920b.equals(jfvVar.f33920b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f33919a) * 31) + this.f33920b.hashCode();
    }
}
