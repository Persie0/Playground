package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ld7 implements nd7 {

    /* JADX INFO: renamed from: a */
    public final String f49504a;

    /* JADX INFO: renamed from: b */
    public final String f49505b;

    public ld7(String str, String str2) {
        str.getClass();
        this.f49504a = str;
        this.f49505b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m16099a() {
        return this.f49505b;
    }

    /* JADX INFO: renamed from: b */
    public final String m16100b() {
        return this.f49504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld7)) {
            return false;
        }
        ld7 ld7Var = (ld7) obj;
        return fa4.m11650l(this.f49504a, ld7Var.f49504a) && fa4.m11650l(this.f49505b, ld7Var.f49505b);
    }

    public final int hashCode() {
        int iHashCode = this.f49504a.hashCode() * 31;
        String str = this.f49505b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("Edit(playlistName=", this.f49504a, ", errorMessage=", this.f49505b, ")");
    }
}
