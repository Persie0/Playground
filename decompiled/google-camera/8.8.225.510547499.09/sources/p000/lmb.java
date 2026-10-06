package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lmb implements lic {

    /* JADX INFO: renamed from: a */
    public final mrm f38643a;

    /* JADX INFO: renamed from: b */
    public final mrm f38644b;

    /* JADX INFO: renamed from: c */
    private final int f38645c;

    public lmb() {
    }

    public lmb(mrm mrmVar, mrm mrmVar2) {
        this.f38645c = 1;
        this.f38643a = mrmVar;
        this.f38644b = mrmVar2;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: b */
    public final boolean mo15379b() {
        return this.f38645c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmb)) {
            return false;
        }
        lmb lmbVar = (lmb) obj;
        int i = this.f38645c;
        int i2 = lmbVar.f38645c;
        if (i != 0) {
            return i2 == 1 && this.f38643a.equals(lmbVar.f38643a) && this.f38644b.equals(lmbVar.f38644b);
        }
        throw null;
    }

    public final int hashCode() {
        lid.m15381b(this.f38645c);
        return 395873938;
    }

    public final String toString() {
        return "StartupConfigurations{enablement=" + lid.m15380a(this.f38645c) + ", metricExtensionProvider=" + String.valueOf(this.f38643a) + ", customTimestampProvider=" + String.valueOf(this.f38644b) + "}";
    }
}
