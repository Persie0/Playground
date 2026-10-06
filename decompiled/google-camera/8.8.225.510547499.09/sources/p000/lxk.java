package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxk extends aqa {
    public lxk(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "\n      UPDATE ResourceEntity \n      SET approximateTotalSize = ?, status_airlockFileState = ?\n      WHERE onDeviceId = ?\n    ";
    }
}
