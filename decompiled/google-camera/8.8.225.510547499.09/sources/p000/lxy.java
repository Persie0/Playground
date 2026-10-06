package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxy extends aqa {
    public lxy(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "\n      DELETE FROM F250LogEntity \n        WHERE\n          id IN (SELECT id FROM F250LogEntity ORDER BY id DESC LIMIT -1 OFFSET 200)\n          OR logEpochTimestamp < ?\n    ";
    }
}
