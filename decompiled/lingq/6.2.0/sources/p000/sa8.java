package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sa8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f60596a;

    /* JADX INFO: renamed from: b */
    public final boolean f60597b;

    public sa8(String str, boolean z) {
        this.f60596a = str;
        this.f60597b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa8)) {
            return false;
        }
        sa8 sa8Var = (sa8) obj;
        return this.f60596a.equals(sa8Var.f60596a) && this.f60597b == sa8Var.f60597b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60597b) + (this.f60596a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSpeakingTextUpdated(text=" + this.f60596a + ", isFinal=" + this.f60597b + ")";
    }
}
