package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ddn extends aqa {
    public ddn(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE HardwareHelpDialogCounts SET rebootCount = rebootCount+1 WHERE reason=? AND impressionsBeforeReboot > ?";
    }
}
