package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rna implements una {

    /* JADX INFO: renamed from: a */
    public final int f59597a;

    public rna(int i) {
        this.f59597a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rna) && this.f59597a == ((rna) obj).f59597a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59597a);
    }

    public final String toString() {
        return ux5.m22989l("Invalid(errorResId=", this.f59597a, ")");
    }
}
