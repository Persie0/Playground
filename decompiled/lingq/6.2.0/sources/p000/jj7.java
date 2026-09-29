package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jj7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f45624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f45626d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f45627e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f45628f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f45629g;

    public /* synthetic */ jj7(boolean z, int i, int i2, ui3 ui3Var, ui3 ui3Var2, int i3, int i4) {
        this.f45623a = i4;
        this.f45624b = z;
        this.f45625c = i;
        this.f45626d = i2;
        this.f45627e = ui3Var;
        this.f45628f = ui3Var2;
        this.f45629g = i3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f45623a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f45629g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                xgc.m24512a(this.f45624b, this.f45625c, this.f45626d, this.f45627e, this.f45628f, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                xgc.m24513b(this.f45624b, this.f45625c, this.f45626d, this.f45627e, this.f45628f, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
