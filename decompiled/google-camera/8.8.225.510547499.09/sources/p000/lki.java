package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lki implements lic {

    /* JADX INFO: renamed from: a */
    public final String f38486a;

    /* JADX INFO: renamed from: b */
    private final int f38487b;

    public lki() {
    }

    public lki(byte[] bArr) {
        this.f38487b = 1;
        this.f38486a = "";
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38487b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lki)) {
            return false;
        }
        lki lkiVar = (lki) obj;
        int i = this.f38487b;
        int i2 = lkiVar.f38487b;
        if (i != 0) {
            return i2 == 1 && this.f38486a.equals(lkiVar.f38486a);
        }
        throw null;
    }

    public final int hashCode() {
        lid.m15381b(this.f38487b);
        return this.f38486a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + lid.m15380a(this.f38487b) + ", reportingProcessShortName=" + this.f38486a + "}";
    }
}
