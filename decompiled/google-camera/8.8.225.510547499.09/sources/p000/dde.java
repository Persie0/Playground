package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dde extends apo {
    public dde(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        ddc ddcVar = (ddc) obj;
        String str = ddcVar.f10550a;
        if (str == null) {
            arfVar.mo1846f(1);
        } else {
            arfVar.mo1847g(1, str);
        }
        arfVar.mo1845e(2, ddcVar.f10551b);
        arfVar.mo1845e(3, ddcVar.f10552c);
        arfVar.mo1845e(4, ddcVar.f10553d);
        arfVar.mo1845e(5, ddcVar.f10554e);
        arfVar.mo1845e(6, ddcVar.f10555f);
        arfVar.mo1845e(7, ddcVar.f10556g);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR IGNORE INTO `FatalErrorCounts` (`cameraId`,`failuresBeforeRebootDuringOpen`,`failuresAfterRebootDuringOpen`,`failuresBeforeRebootDuringSession`,`failuresAfterRebootDuringSession`,`lastFatalErrorTimestamp`,`rebootCount`) VALUES (?,?,?,?,?,?,?)";
    }
}
