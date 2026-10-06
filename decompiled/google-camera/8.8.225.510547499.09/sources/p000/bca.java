package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bca extends apo {
    public bca(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        bby bbyVar = (bby) obj;
        arfVar.mo1847g(1, bbyVar.f2931a);
        arfVar.mo1845e(2, bbyVar.f2932b.longValue());
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
