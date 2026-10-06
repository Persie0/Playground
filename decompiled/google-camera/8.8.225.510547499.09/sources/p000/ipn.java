package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ipn {

    /* JADX INFO: renamed from: a */
    public final ipm f31751a;

    /* JADX INFO: renamed from: b */
    public final jwn f31752b;

    /* JADX INFO: renamed from: c */
    public final ipl f31753c;

    public ipn(ipm ipmVar, jwn jwnVar, ipl iplVar) {
        if (ipmVar == null) {
            throw new NullPointerException("Null effectFactory");
        }
        this.f31751a = ipmVar;
        if (jwnVar == null) {
            throw new NullPointerException("Null activation");
        }
        this.f31752b = jwnVar;
        if (iplVar == null) {
            throw new NullPointerException("Null order");
        }
        this.f31753c = iplVar;
    }

    /* JADX INFO: renamed from: a */
    public static ipn m11594a(ipm ipmVar, jwn jwnVar, ipl iplVar) {
        return new ipn(ipmVar, jwnVar, iplVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipn) {
            ipn ipnVar = (ipn) obj;
            if (this.f31751a.equals(ipnVar.f31751a) && this.f31752b.equals(ipnVar.f31752b) && this.f31753c.equals(ipnVar.f31753c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f31751a.hashCode() ^ 1000003) * 1000003) ^ this.f31752b.hashCode()) * 1000003) ^ this.f31753c.hashCode();
    }

    public final String toString() {
        return "ViewfinderEffectElement{effectFactory=" + this.f31751a.toString() + ", activation=" + this.f31752b.toString() + ", order=" + this.f31753c.toString() + "}";
    }

    public ipn() {
    }
}
