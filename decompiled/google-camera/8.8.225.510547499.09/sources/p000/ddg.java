package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ddg extends aqa {
    public ddg(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE FatalErrorCounts SET failuresBeforeRebootDuringOpen = 0 , failuresAfterRebootDuringOpen = 0 WHERE cameraId = ?";
    }
}
