package p000;

/* JADX INFO: loaded from: classes.dex */
public final class l50 {

    /* JADX INFO: renamed from: a */
    public final m50 f49060a;

    /* JADX INFO: renamed from: b */
    public final o50 f49061b;

    /* JADX INFO: renamed from: c */
    public final n50 f49062c;

    public l50(m50 m50Var, o50 o50Var, n50 n50Var) {
        this.f49060a = m50Var;
        this.f49061b = o50Var;
        this.f49062c = n50Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return this.f49060a.equals(l50Var.f49060a) && this.f49061b.equals(l50Var.f49061b) && this.f49062c.equals(l50Var.f49062c);
    }

    public final int hashCode() {
        return this.f49062c.hashCode() ^ ((((this.f49060a.hashCode() ^ 1000003) * 1000003) ^ this.f49061b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49060a + ", osData=" + this.f49061b + ", deviceData=" + this.f49062c + "}";
    }
}
