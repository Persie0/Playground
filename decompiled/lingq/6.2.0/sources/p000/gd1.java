package p000;

import androidx.compose.foundation.text.C0180h;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0232g0;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f40561c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40562d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f40563e;

    public /* synthetic */ gd1(yt4 yt4Var, Object obj, int i, Object obj2, int i2) {
        this.f40559a = 1;
        this.f40563e = yt4Var;
        this.f40560b = obj;
        this.f40561c = i;
        this.f40562d = obj2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f40559a;
        int i2 = this.f40561c;
        Object obj3 = this.f40562d;
        Object obj4 = this.f40560b;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f40563e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0282a) obj5).m1293k(obj4, obj3, (ye1) obj, pk9.m19383z(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                ci8.m4719d((yt4) obj5, this.f40560b, this.f40561c, this.f40562d, (ye1) obj, iM19383z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((ov4) obj3).mo11934c(obj4, (C0282a) obj5, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC3352my.m17112c((ub5) obj5, (ac5) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((gl8) obj3).mo11934c(obj4, (C0282a) obj5, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC0231g.m1152e((C0232g0) obj5, (e16) obj4, (aj3) obj3, (ye1) obj, pk9.m19383z(7), this.f40561c);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((C0180h) obj5).m1078b((Object[]) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                te1.m21989c((e16) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gd1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f40559a = i2;
        this.f40563e = obj;
        this.f40560b = obj2;
        this.f40562d = obj3;
        this.f40561c = i;
    }

    public /* synthetic */ gd1(fl8 fl8Var, Object obj, C0282a c0282a, int i, int i2) {
        this.f40559a = i2;
        this.f40562d = fl8Var;
        this.f40560b = obj;
        this.f40563e = c0282a;
        this.f40561c = i;
    }

    public /* synthetic */ gd1(C0232g0 c0232g0, e16 e16Var, aj3 aj3Var, int i, int i2) {
        this.f40559a = 5;
        this.f40563e = c0232g0;
        this.f40560b = e16Var;
        this.f40562d = aj3Var;
        this.f40561c = i2;
    }
}
