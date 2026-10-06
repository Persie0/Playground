package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lld implements lic {

    /* JADX INFO: renamed from: a */
    private final int f38559a;

    /* JADX INFO: renamed from: b */
    private final int f38560b;

    public lld() {
    }

    public lld(byte[] bArr) {
        this.f38560b = 2;
        this.f38559a = 10;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final int mo15378a() {
        return this.f38559a;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lld)) {
            return false;
        }
        lld lldVar = (lld) obj;
        int i = this.f38560b;
        int i2 = lldVar.f38560b;
        if (i != 0) {
            return i == i2 && this.f38559a == lldVar.f38559a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38560b;
        lid.m15381b(i);
        return ((i ^ 1000003) * 1000003) ^ this.f38559a;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + lid.m15380a(this.f38560b) + ", rateLimitPerSecond=" + this.f38559a + "}";
    }
}
