package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.reader.old.ReaderPageFragment;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rx7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f59998b;

    public /* synthetic */ rx7(ReaderPageFragment readerPageFragment, int i) {
        this.f59997a = i;
        this.f59998b = readerPageFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59997a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vx7 vx7Var = ReaderPageFragment.Companion;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ReaderPageFragment readerPageFragment = this.f59998b;
                    t66 t66VarM2513c = AbstractC0711a.m2513c(readerPageFragment.m9299X0().f29205J, tj3Var);
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(readerPageFragment.m9299X0().f29215T, tj3Var);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(readerPageFragment.m9299X0().f29201F, tj3Var);
                    t66 t66VarM2513c4 = AbstractC0711a.m2513c(readerPageFragment.m9299X0().f29203H, tj3Var);
                    t66 t66VarM2513c5 = AbstractC0711a.m2513c(readerPageFragment.m9299X0().f29223b.mo4594r1(), tj3Var);
                    if (((Boolean) t66VarM2513c2.getValue()).booleanValue() && !((List) t66VarM2513c.getValue()).isEmpty()) {
                        i2 = 1;
                    }
                    AbstractC0054a.m729d(i2, null, AbstractC0070i.m772g(null, 0.3f, 1), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(-1834112891, new hn0(readerPageFragment, t66VarM2513c5, t66VarM2513c4, t66VarM2513c, t66VarM2513c3, 14), tj3Var), tj3Var, 200064, 18);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-1823079507, new rx7(this.f59998b, i2), tj3Var2), tj3Var2, 384);
                }
                break;
        }
        return xfaVar;
    }
}
