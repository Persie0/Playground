package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dcy extends apo {
    public dcy(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        dcv dcvVar = (dcv) obj;
        arfVar.mo1845e(1, dcvVar.f10539a);
        arfVar.mo1845e(2, dcvVar.f10540b);
        arfVar.mo1845e(3, dcvVar.f10541c);
        arfVar.mo1845e(4, dcvVar.f10542d);
        arfVar.mo1845e(5, dcvVar.f10543e);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR REPLACE INTO `EnumerationErrorCounts` (`errorCode`,`failuresBeforeReboot`,`failuresAfterReboot`,`rebootCount`,`lastFailureTimestamp`) VALUES (?,?,?,?,?)";
    }
}
