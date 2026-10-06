package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsl implements cbl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4334a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4335b;

    public bsl(dfn dfnVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4335b = i;
        this.f4334a = dfnVar;
    }

    public bsl(ilo iloVar, int i, byte[] bArr) {
        this.f4335b = i;
        this.f4334a = iloVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aed, java.lang.Object] */
    @Override // p000.cbl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2998a() {
        switch (this.f4335b) {
            case 0:
                dfn dfnVar = (dfn) this.f4334a;
                Object obj = dfnVar.f10790c;
                Object obj2 = dfnVar.f10793f;
                Object obj3 = dfnVar.f10791d;
                Object obj4 = dfnVar.f10789b;
                return new bsr((buj) obj, (buj) obj2, (buj) obj3, (ljf) obj4, (ljf) dfnVar.f10788a, dfnVar.f10792e, null, null, null, null);
            default:
                ilo iloVar = (ilo) this.f4334a;
                return new bsf((bsm) iloVar.f31457c, iloVar.f31456b);
        }
    }
}
