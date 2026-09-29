package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.p012ui.util.AbstractC1935a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.reader.reader.AbstractC2501g;
import com.lingq.feature.review.components.AbstractC2753a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ln0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f49854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49855c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f49856d;

    public /* synthetic */ ln0(ui3 ui3Var, boolean z, t66 t66Var) {
        this.f49853a = 8;
        this.f49855c = ui3Var;
        this.f49854b = z;
        this.f49856d = t66Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f49853a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f49856d;
        boolean z = this.f49854b;
        Object obj4 = this.f49855c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1935a.m8801a(z, (C0282a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(433));
                break;
            case 1:
                ((Integer) obj2).getClass();
                r9d.m20480b((Integer) obj4, (e16) obj3, z, (ye1) obj, pk9.m19383z(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                s9d.m21183b((et1) obj4, z, (e16) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8974j((DictionaryData) obj4, z, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bid.m3747c((en4) obj4, z, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                q3c.m19631a(z, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2501g.m9400a(z, (ui3) obj3, (C0282a) obj4, (ye1) obj, pk9.m19383z(3463));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC2753a.m9587a((qc8) obj4, (vi3) obj3, z, (ye1) obj, pk9.m19383z(385));
                break;
            case 8:
                ui3 ui3Var = (ui3) obj4;
                t66 t66Var = (t66) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22120g = tj3Var.m22120g(ui3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new wy1(8, ui3Var, t66Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 506, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-665658006, new C3187kk(z, t66Var, i2), tj3Var), null, null, null, z && !((Boolean) t66Var.getValue()).booleanValue());
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8677p((yz7) obj4, z, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                z7d.m25488a((String) obj4, z, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ln0(Object obj, Object obj2, boolean z, int i, int i2) {
        this.f49853a = i2;
        this.f49855c = obj;
        this.f49856d = obj2;
        this.f49854b = z;
    }

    public /* synthetic */ ln0(Object obj, boolean z, Object obj2, int i, int i2) {
        this.f49853a = i2;
        this.f49855c = obj;
        this.f49854b = z;
        this.f49856d = obj2;
    }

    public /* synthetic */ ln0(boolean z, ui3 ui3Var, C0282a c0282a, int i) {
        this.f49853a = 6;
        this.f49854b = z;
        this.f49856d = ui3Var;
        this.f49855c = c0282a;
    }

    public /* synthetic */ ln0(boolean z, xi3 xi3Var, xi3 xi3Var2, int i, int i2) {
        this.f49853a = i2;
        this.f49854b = z;
        this.f49855c = xi3Var;
        this.f49856d = xi3Var2;
    }
}
