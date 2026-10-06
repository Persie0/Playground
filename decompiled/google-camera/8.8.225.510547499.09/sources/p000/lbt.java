package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lbt implements lde {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f37891a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37892b;

    public /* synthetic */ lbt(kzh kzhVar, int i) {
        this.f37892b = i;
        this.f37891a = kzhVar;
    }

    public /* synthetic */ lbt(lcy lcyVar, int i) {
        this.f37892b = i;
        this.f37891a = lcyVar;
    }

    @Override // p000.lde
    /* JADX INFO: renamed from: a */
    public final String mo8767a() {
        switch (this.f37892b) {
            case 0:
                return "createCanvasForSurface(" + this.f37891a.toString() + ")";
            default:
                ((lcy) this.f37891a).m15193g();
                return "attachImageToTexture(RGBA8888)";
        }
    }
}
