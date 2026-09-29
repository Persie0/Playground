package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dya implements fya {

    /* JADX INFO: renamed from: a */
    public final int f36428a;

    /* JADX INFO: renamed from: b */
    public final int f36429b;

    public dya(int i, int i2) {
        this.f36428a = i;
        this.f36429b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dya)) {
            return false;
        }
        dya dyaVar = (dya) obj;
        return this.f36428a == dyaVar.f36428a && this.f36429b == dyaVar.f36429b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36429b) + (Integer.hashCode(this.f36428a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f36428a, this.f36429b, "SuccessSkritter(added=", ", skipped=", ")");
    }
}
