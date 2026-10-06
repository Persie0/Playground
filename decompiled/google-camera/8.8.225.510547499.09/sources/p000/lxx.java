package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxx extends apo {
    public lxx(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        throw null;
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR ABORT INTO `F250LogEntity` (`id`,`resourceOnDeviceIds`,`f250LogAction`,`logEpochTimestamp`,`f250LogReason`,`errorMessage`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }
}
