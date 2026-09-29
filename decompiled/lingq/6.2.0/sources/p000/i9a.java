package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i9a implements i90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43748b;

    public /* synthetic */ i9a(Object obj, int i) {
        this.f43747a = i;
        this.f43748b = obj;
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        int i = this.f43747a;
        Object obj = this.f43748b;
        switch (i) {
            case 0:
                ((j9a) obj).f45252k = true;
                break;
            case 1:
                ((j9a) obj).f45252k = true;
                break;
            case 2:
                ((j9a) obj).f45252k = true;
                break;
            default:
                o90 o90Var = (o90) obj;
                boolean z = o90Var.f54062r.m14316m() == 1.0f;
                if (z != o90Var.f54068x) {
                    o90Var.f54068x = z;
                    o90Var.f54059o.invalidateSelf();
                }
                break;
        }
    }
}
