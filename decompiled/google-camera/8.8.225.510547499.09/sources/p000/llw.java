package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llw implements lic {

    /* JADX INFO: renamed from: a */
    private final int f38620a;

    /* JADX INFO: renamed from: b */
    private final mrm f38621b;

    /* JADX INFO: renamed from: c */
    private final int f38622c;

    public llw() {
    }

    public llw(mrm mrmVar) {
        this.f38622c = 2;
        this.f38620a = 50;
        this.f38621b = mrmVar;
    }

    @Override // p000.lic
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo15378a() {
        return Integer.MAX_VALUE;
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
        if (!(obj instanceof llw)) {
            return false;
        }
        llw llwVar = (llw) obj;
        int i = this.f38622c;
        int i2 = llwVar.f38622c;
        if (i != 0) {
            return i == i2 && this.f38620a == llwVar.f38620a && this.f38621b.equals(llwVar.f38621b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f38622c;
        lid.m15381b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.f38620a) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + lid.m15380a(this.f38622c) + ", batchSize=" + this.f38620a + ", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.f38621b) + "}";
    }
}
