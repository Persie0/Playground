package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ge6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f40631a;

    /* JADX INFO: renamed from: b */
    public final hf6 f40632b;

    public ge6(String str, hf6 hf6Var) {
        str.getClass();
        this.f40631a = str;
        this.f40632b = hf6Var;
    }

    /* JADX INFO: renamed from: a */
    public final hf6 m12513a() {
        return this.f40632b;
    }

    /* JADX INFO: renamed from: b */
    public final String m12514b() {
        return this.f40631a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge6)) {
            return false;
        }
        ge6 ge6Var = (ge6) obj;
        return fa4.m11650l(this.f40631a, ge6Var.f40631a) && this.f40632b.equals(ge6Var.f40632b);
    }

    public final int hashCode() {
        return this.f40632b.hashCode() + (this.f40631a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeInterfaceLanguage(interfaceLanguage=" + this.f40631a + ", destination=" + this.f40632b + ")";
    }
}
