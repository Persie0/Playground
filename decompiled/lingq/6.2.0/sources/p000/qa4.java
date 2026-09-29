package p000;

import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qa4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f57494c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f57495d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f57496e;

    public /* synthetic */ qa4(e16 e16Var, int i, o39 o39Var, int i2, int i3) {
        this.f57492a = 1;
        this.f57493b = e16Var;
        this.f57494c = i;
        this.f57496e = o39Var;
        this.f57495d = i3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57492a;
        int i2 = this.f57495d;
        int i3 = this.f57494c;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f57496e;
        Object obj4 = this.f57493b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                igd.m13904c((e16) obj4, (ArrayList) obj3, this.f57494c, this.f57495d, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(49);
                yhd.m25146b((e16) obj4, this.f57494c, (o39) obj3, (ye1) obj, iM19383z2, this.f57495d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                AbstractC2231b.m9193f(i3, iM19383z3, (ye1) obj, (String) obj4, (String) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                e5d.m10858b((e16) obj4, (uj9) obj3, (ye1) obj, pk9.m19383z(i3 | 1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                bad.m3546a((ui3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i3 | 1), i2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ qa4(int i, int i2, int i3, Object obj, Object obj2) {
        this.f57492a = i3;
        this.f57493b = obj;
        this.f57496e = obj2;
        this.f57494c = i;
        this.f57495d = i2;
    }

    public /* synthetic */ qa4(e16 e16Var, ArrayList arrayList, int i, int i2, int i3) {
        this.f57492a = 0;
        this.f57493b = e16Var;
        this.f57496e = arrayList;
        this.f57494c = i;
        this.f57495d = i2;
    }

    public /* synthetic */ qa4(String str, int i, String str2, int i2) {
        this.f57492a = 2;
        this.f57493b = str;
        this.f57494c = i;
        this.f57496e = str2;
        this.f57495d = i2;
    }
}
