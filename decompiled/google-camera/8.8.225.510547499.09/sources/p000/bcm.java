package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bcm extends apo {
    public bcm(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        bck bckVar = (bck) obj;
        arfVar.mo1847g(1, (String) bckVar.f2948a);
        arfVar.mo1847g(2, (String) bckVar.f2949b);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
