package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftk implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23551a;

    public ftk(oju ojuVar) {
        this.f23551a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static ftk m8790b(oju ojuVar) {
        return new ftk(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ftd get() {
        dhv dhvVar = (dhv) this.f23551a.get();
        ftc ftcVar = new ftc();
        ftcVar.f23539a = 5;
        ftcVar.f23543e = (byte) (ftcVar.f23543e | 1);
        ftcVar.m8786b(2);
        ftcVar.m8785a();
        ftcVar.f23541c = 2000L;
        byte b = ftcVar.f23543e;
        ftcVar.f23542d = 2;
        ftcVar.f23543e = (byte) (b | 24);
        dhw dhwVar = dij.f11577a;
        dhvVar.mo6175c();
        ftcVar.m8785a();
        if (dhvVar.mo6184l(dij.f11598v) || dhvVar.mo6184l(dij.f11599w)) {
            ftcVar.m8786b(1);
        }
        if (ftcVar.f23543e == 31) {
            return new ftd(ftcVar.f23539a, ftcVar.f23540b, ftcVar.f23541c, ftcVar.f23542d);
        }
        throw new IllegalStateException();
    }
}
