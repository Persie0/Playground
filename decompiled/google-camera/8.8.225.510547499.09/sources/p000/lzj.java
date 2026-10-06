package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzj extends aqa {
    public lzj(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "\n      UPDATE ResourceEntity SET status_uploadState = ?\n      WHERE \n        onDeviceId = ?\n    ";
    }
}
