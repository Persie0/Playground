package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s25 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60195a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f60196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f60197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f60198d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f60199e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f60200f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f60201g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f60202h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f60203i;

    public /* synthetic */ s25(p04 p04Var, y27 y27Var, String str, ui3 ui3Var, long j, boolean z, int i, int i2) {
        this.f60200f = p04Var;
        this.f60201g = y27Var;
        this.f60202h = str;
        this.f60203i = ui3Var;
        this.f60197c = j;
        this.f60196b = z;
        this.f60198d = i;
        this.f60199e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f60195a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f60198d;
        Object obj3 = this.f60203i;
        Object obj4 = this.f60202h;
        Object obj5 = this.f60201g;
        Object obj6 = this.f60200f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                wid.m23995b((p04) obj6, (y27) obj5, (String) obj4, (ui3) obj3, this.f60197c, this.f60196b, (ye1) obj, iM19383z, this.f60199e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                ((la9) obj6).m16045a((v56) obj5, (e16) obj4, (fa9) obj3, this.f60196b, this.f60197c, (ye1) obj, iM19383z2, this.f60199e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ s25(la9 la9Var, v56 v56Var, e16 e16Var, fa9 fa9Var, boolean z, long j, int i, int i2) {
        this.f60200f = la9Var;
        this.f60201g = v56Var;
        this.f60202h = e16Var;
        this.f60203i = fa9Var;
        this.f60196b = z;
        this.f60197c = j;
        this.f60198d = i;
        this.f60199e = i2;
    }
}
