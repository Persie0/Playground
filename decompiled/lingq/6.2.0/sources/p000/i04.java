package p000;

import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i04 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43278a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f43279b;

    public /* synthetic */ i04(ArrayList arrayList) {
        this.f43278a = 0;
        this.f43279b = arrayList;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f43278a;
        xfa xfaVar = xfa.f68157a;
        ArrayList arrayList = this.f43279b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC2868d.m9780a(arrayList, tj3Var, 0);
                }
                break;
            case 1:
                num.getClass();
                AbstractC2868d.m9780a(arrayList, ye1Var, pk9.m19383z(1));
                break;
            default:
                num.getClass();
                fbd.m11757g(arrayList, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ i04(ArrayList arrayList, int i, int i2) {
        this.f43278a = i2;
        this.f43279b = arrayList;
    }
}
