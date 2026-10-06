package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxj extends aqa {
    public lxj(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "\n      UPDATE AnnotachmentEntity SET status_airlockFileState = ?\n      WHERE resourceOnDeviceId = ?\n    ";
    }
}
