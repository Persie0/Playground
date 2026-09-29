package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jl4 {

    /* JADX INFO: renamed from: a */
    public final String f45669a;

    /* JADX INFO: renamed from: b */
    public final int f45670b;

    public jl4(String str, int i) {
        str.getClass();
        this.f45669a = str;
        this.f45670b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl4)) {
            return false;
        }
        jl4 jl4Var = (jl4) obj;
        return fa4.m11650l(this.f45669a, jl4Var.f45669a) && this.f45670b == jl4Var.f45670b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45670b) + (this.f45669a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageActiveDictionaryJoin(code=" + this.f45669a + ", id=" + this.f45670b + ")";
    }
}
