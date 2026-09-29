package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class it9 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44538b;

    public /* synthetic */ it9(Object obj, int i) {
        this.f44537a = i;
        this.f44538b = obj;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f44537a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f44538b;
        switch (i) {
            case 0:
                long j = ((aa1) obj).f414a;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Number) obj3).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    u06.f63178f.m22376c((Drawable) obj4, tj3Var, 48);
                }
                break;
            case 1:
                long j2 = ((aa1) obj).f414a;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    u06.f63178f.m22376c((Drawable) obj4, tj3Var2, 48);
                }
                break;
            default:
                long j3 = ((aa1) obj).f414a;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((tj3) ye1Var3).m22118f(j3) ? 4 : 2;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    tj3Var3.m22102U();
                } else {
                    u82.m22533b(((jt9) obj4).f46134c, j3, tj3Var3, (iIntValue3 << 3) & 112);
                }
                break;
        }
        return xfaVar;
    }
}
