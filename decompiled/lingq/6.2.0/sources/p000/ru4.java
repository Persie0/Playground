package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ su4 f59827b;

    public /* synthetic */ ru4(su4 su4Var, int i) {
        this.f59826a = i;
        this.f59827b = su4Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f59826a;
        su4 su4Var = this.f59827b;
        switch (i) {
            case 0:
                return Float.valueOf(su4Var.f61411K.mo988b());
            case 1:
                return Float.valueOf(su4Var.f61411K.mo990d());
            default:
                return Float.valueOf(su4Var.f61411K.mo987a() - su4Var.f61411K.mo989c());
        }
    }
}
