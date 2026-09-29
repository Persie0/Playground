package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fx1 {

    /* JADX INFO: renamed from: a */
    public final String f39843a;

    /* JADX INFO: renamed from: b */
    public final ui3 f39844b;

    public fx1(String str, ui3 ui3Var) {
        this.f39843a = str;
        this.f39844b = ui3Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m12243a() {
        return this.f39843a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx1)) {
            return false;
        }
        fx1 fx1Var = (fx1) obj;
        return this.f39843a.equals(fx1Var.f39843a) && this.f39844b == fx1Var.f39844b;
    }

    public final int hashCode() {
        return this.f39844b.hashCode() + (this.f39843a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f39843a + ", action=" + this.f39844b + ')';
    }
}
