package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gb5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f40495c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f40496d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f40497e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f40498f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ui3 f40499g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ e16 f40500h;

    public /* synthetic */ gb5(String str, int i, String str2, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, int i2) {
        this.f40493a = 1;
        this.f40494b = str;
        this.f40495c = i;
        this.f40496d = str2;
        this.f40497e = vi3Var;
        this.f40498f = z;
        this.f40499g = ui3Var;
        this.f40500h = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f40493a;
        int i2 = this.f40495c;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hb5.m13184a(pk9.m19383z(i2 | 1), (ye1) obj, this.f40499g, this.f40497e, this.f40500h, this.f40494b, this.f40496d, this.f40498f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                n7d.m17275a(this.f40494b, this.f40495c, this.f40496d, this.f40497e, this.f40498f, this.f40499g, this.f40500h, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                h4b.m13047a(pk9.m19383z(i2 | 1), (ye1) obj, this.f40499g, this.f40497e, this.f40500h, this.f40494b, this.f40496d, this.f40498f);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gb5(String str, vi3 vi3Var, String str2, boolean z, ui3 ui3Var, e16 e16Var, int i, int i2) {
        this.f40493a = i2;
        this.f40494b = str;
        this.f40497e = vi3Var;
        this.f40496d = str2;
        this.f40498f = z;
        this.f40499g = ui3Var;
        this.f40500h = e16Var;
        this.f40495c = i;
    }
}
