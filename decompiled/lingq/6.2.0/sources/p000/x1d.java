package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x1d implements uo7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gba f67654b;

    public /* synthetic */ x1d(gba gbaVar, int i) {
        this.f67653a = i;
        this.f67654b = gbaVar;
    }

    @Override // p000.uo7
    public final Object get() {
        int i = this.f67653a;
        gba gbaVar = this.f67654b;
        switch (i) {
            case 0:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("json"), wkd.f66986d);
            case 1:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("proto"), mkd.f51460d);
            case 2:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("json"), n58.f52378f);
            case 3:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("proto"), my5.f52036g);
            case 4:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("json"), new gna());
            default:
                return gbaVar.m12466a("FIREBASE_ML_SDK", new bs2("proto"), new bw8());
        }
    }
}
