package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22363a;

    /* JADX INFO: renamed from: b */
    private final oju f22364b;

    public fkb(oju ojuVar, oju ojuVar2) {
        this.f22363a = ojuVar;
        this.f22364b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get() {
        return (((Boolean) ((hah) this.f22363a.get()).mo10031c(gzy.f26990B)).booleanValue() && ((dhv) this.f22364b.get()).mo6184l(dii.f11528d)) ? "video/hevc" : "video/avc";
    }
}
