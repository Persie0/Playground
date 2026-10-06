package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class maf extends aqa {
    public maf(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "\n      UPDATE ResourceEntity\n      SET\n        f250ResourceId = ?,\n        status_uploadToF250CompletedEpochTimestamp = ?,\n        status_uploadState = ?,\n        status_uploadProgressPercent = 1.0\n      WHERE onDeviceId = ?\n    ";
    }
}
