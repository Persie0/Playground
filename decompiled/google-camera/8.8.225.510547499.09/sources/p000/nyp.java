package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyp implements nyu {

    /* JADX INFO: renamed from: a */
    private final nyu[] f45030a;

    public nyp(nyu... nyuVarArr) {
        this.f45030a = nyuVarArr;
    }

    @Override // p000.nyu
    /* JADX INFO: renamed from: a */
    public final nyt mo18187a(Class cls) {
        nyu[] nyuVarArr = this.f45030a;
        for (int i = 0; i < 2; i++) {
            nyu nyuVar = nyuVarArr[i];
            if (nyuVar.mo18188b(cls)) {
                return nyuVar.mo18187a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // p000.nyu
    /* JADX INFO: renamed from: b */
    public final boolean mo18188b(Class cls) {
        nyu[] nyuVarArr = this.f45030a;
        for (int i = 0; i < 2; i++) {
            if (nyuVarArr[i].mo18188b(cls)) {
                return true;
            }
        }
        return false;
    }
}
