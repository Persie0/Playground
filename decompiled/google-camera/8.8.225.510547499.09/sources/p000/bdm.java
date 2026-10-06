package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdm extends apo {
    public bdm(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        dsx dsxVar = (dsx) obj;
        arfVar.mo1847g(1, (String) dsxVar.f12522b);
        arfVar.mo1847g(2, (String) dsxVar.f12521a);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
