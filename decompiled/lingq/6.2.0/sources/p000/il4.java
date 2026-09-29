package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class il4 {

    /* JADX INFO: renamed from: a */
    public final String f44255a;

    /* JADX INFO: renamed from: b */
    public final boolean f44256b;

    public il4(String str, boolean z) {
        str.getClass();
        this.f44255a = str;
        this.f44256b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4)) {
            return false;
        }
        il4 il4Var = (il4) obj;
        return fa4.m11650l(this.f44255a, il4Var.f44255a) && this.f44256b == il4Var.f44256b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44256b) + (this.f44255a.hashCode() * 31);
    }

    public final String toString() {
        return "Language(code=" + this.f44255a + ", isSupported=" + this.f44256b + ")";
    }
}
