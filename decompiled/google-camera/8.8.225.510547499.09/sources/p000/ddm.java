package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ddm extends apo {
    public ddm(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        ddj ddjVar = (ddj) obj;
        arfVar.mo1845e(1, ddjVar.f10562a.ordinal());
        arfVar.mo1845e(2, ddjVar.f10563b);
        arfVar.mo1845e(3, ddjVar.f10564c);
        arfVar.mo1845e(4, ddjVar.f10565d);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR REPLACE INTO `HardwareHelpDialogCounts` (`reason`,`impressionsBeforeReboot`,`impressionsAfterReboot`,`rebootCount`) VALUES (?,?,?,?)";
    }
}
