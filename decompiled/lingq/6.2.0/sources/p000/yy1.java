package p000;

import com.lingq.core.achievements.AbstractC1234a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70634b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f70635c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f70636d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f70637e;

    public /* synthetic */ yy1(int i, int i2, int i3, e16 e16Var) {
        this.f70633a = 1;
        this.f70634b = i;
        this.f70635c = i2;
        this.f70636d = e16Var;
        this.f70637e = i3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f70633a;
        int i2 = this.f70637e;
        int i3 = this.f70635c;
        int i4 = this.f70634b;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f70636d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(7);
                AbstractC1234a.m6999b((e16) obj3, this.f70634b, this.f70635c, this.f70637e, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ezb.m11403a(i4, i3, (e16) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                x4d.m24284a((e16) obj3, this.f70634b, this.f70635c, this.f70637e, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                ppb.m19441a(i4, i3, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ yy1(int i, int i2, ui3 ui3Var, int i3) {
        this.f70633a = 3;
        this.f70634b = i;
        this.f70635c = i2;
        this.f70636d = ui3Var;
        this.f70637e = i3;
    }

    public /* synthetic */ yy1(e16 e16Var, int i, int i2, int i3, int i4, int i5) {
        this.f70633a = i5;
        this.f70636d = e16Var;
        this.f70634b = i;
        this.f70635c = i2;
        this.f70637e = i3;
    }
}
