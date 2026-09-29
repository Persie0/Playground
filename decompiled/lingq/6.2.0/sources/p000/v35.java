package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class v35 implements w35 {

    /* JADX INFO: renamed from: a */
    public final c35 f64783a;

    /* JADX INFO: renamed from: b */
    public final d35 f64784b;

    /* JADX INFO: renamed from: c */
    public final e35 f64785c;

    /* JADX INFO: renamed from: d */
    public final t35 f64786d;

    /* JADX INFO: renamed from: e */
    public final u25 f64787e;

    /* JADX INFO: renamed from: f */
    public final f35 f64788f;

    /* JADX INFO: renamed from: g */
    public final b35 f64789g;

    public v35(c35 c35Var, d35 d35Var, e35 e35Var, t35 t35Var, u25 u25Var, f35 f35Var, b35 b35Var) {
        this.f64783a = c35Var;
        this.f64784b = d35Var;
        this.f64785c = e35Var;
        this.f64786d = t35Var;
        this.f64787e = u25Var;
        this.f64788f = f35Var;
        this.f64789g = b35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v35)) {
            return false;
        }
        v35 v35Var = (v35) obj;
        return this.f64783a.equals(v35Var.f64783a) && this.f64784b.equals(v35Var.f64784b) && fa4.m11650l(this.f64785c, v35Var.f64785c) && this.f64786d.equals(v35Var.f64786d) && this.f64787e.equals(v35Var.f64787e) && this.f64788f.equals(v35Var.f64788f) && this.f64789g.equals(v35Var.f64789g);
    }

    public final int hashCode() {
        int iHashCode = (this.f64784b.hashCode() + (this.f64783a.hashCode() * 31)) * 31;
        e35 e35Var = this.f64785c;
        return this.f64789g.hashCode() + ((this.f64788f.hashCode() + ((this.f64787e.hashCode() + ((this.f64786d.hashCode() + ((iHashCode + (e35Var == null ? 0 : e35Var.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Success(lesson=" + this.f64783a + ", counters=" + this.f64784b + ", course=" + this.f64785c + ", preview=" + this.f64786d + ", actions=" + this.f64787e + ", dialogs=" + this.f64788f + ", config=" + this.f64789g + ")";
    }
}
