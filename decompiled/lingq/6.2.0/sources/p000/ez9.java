package p000;

import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.theme.AbstractC1881a;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ez9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nz9 f38115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f38116c;

    public /* synthetic */ ez9(nz9 nz9Var, vi3 vi3Var, int i) {
        this.f38114a = i;
        this.f38115b = nz9Var;
        this.f38116c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        List listM23605K;
        int i = this.f38114a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f38116c;
        nz9 nz9Var = this.f38115b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    List list = nz9Var.f53457c;
                    ReaderFont readerFont = nz9Var.f53458d;
                    Pair pair = nz9Var.f53459e;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new ww8(vi3Var, 4);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC1881a.m8667f(list, readerFont, pair, (zi3) objM22097O, tj3Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    int i2 = nz9Var.f53455a;
                    List list2 = ua3.f63636a;
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new cx8(vi3Var, 21);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    AbstractC1881a.m8665d(i2, list2, (vi3) objM22097O2, tj3Var2, 0);
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                tj3 tj3Var3 = (tj3) ye1Var;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    double d = nz9Var.f53456b;
                    boolean z = nz9Var.f53463i;
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new cx8(vi3Var, 22);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    AbstractC1881a.m8672k(d, z, (vi3) objM22097O3, tj3Var3, 0);
                }
                break;
            case 3:
                num.getClass();
                AbstractC1881a.m8666e(nz9Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            case 4:
                int iIntValue4 = num.intValue();
                tj3 tj3Var4 = (tj3) ye1Var;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    List list3 = zz7.f72430e;
                    yz7 yz7Var = nz9Var.f53460f;
                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var4.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new cx8(vi3Var, 17);
                        tj3Var4.m22131l0(objM22097O4);
                    }
                    AbstractC1881a.m8678q(list3, yz7Var, (vi3) objM22097O4, tj3Var4, 0);
                }
                break;
            case 5:
                int iIntValue5 = num.intValue();
                tj3 tj3Var5 = (tj3) ye1Var;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    if (nz9Var.f53460f.f70705a.equals("default")) {
                        tj3Var5.m22111b0(1262554701);
                        listM23605K = AbstractC3423or.m18217B(tj3Var5) ? vz1.m23605K(xs3.f68637b, xs3.f68640e) : vz1.m23605K(xs3.f68636a, xs3.f68639d);
                        tj3Var5.m22139q(false);
                    } else {
                        tj3Var5.m22111b0(1263021313);
                        tj3Var5.m22139q(false);
                        listM23605K = nz9Var.f53460f.f70707c;
                    }
                    vs3 vs3Var = nz9Var.f53461g;
                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var);
                    Object objM22097O5 = tj3Var5.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new cx8(vi3Var, 16);
                        tj3Var5.m22131l0(objM22097O5);
                    }
                    AbstractC1881a.m8669h(listM23605K, vs3Var, (vi3) objM22097O5, tj3Var5, 0);
                }
                break;
            case 6:
                int iIntValue6 = num.intValue();
                tj3 tj3Var6 = (tj3) ye1Var;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    TextHighlightStyle textHighlightStyle = nz9Var.f53462h;
                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var);
                    Object objM22097O6 = tj3Var6.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var) {
                        objM22097O6 = new cx8(vi3Var, 24);
                        tj3Var6.m22131l0(objM22097O6);
                    }
                    AbstractC1881a.m8671j(textHighlightStyle, (vi3) objM22097O6, tj3Var6, 0);
                }
                break;
            case 7:
                int iIntValue7 = num.intValue();
                tj3 tj3Var7 = (tj3) ye1Var;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    boolean z2 = nz9Var.f53464j;
                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var);
                    Object objM22097O7 = tj3Var7.m22097O();
                    if (zM22120g7 || objM22097O7 == p84Var) {
                        objM22097O7 = new cx8(vi3Var, 18);
                        tj3Var7.m22131l0(objM22097O7);
                    }
                    AbstractC1881a.m8664c(z2, (vi3) objM22097O7, tj3Var7, 0);
                }
                break;
            case 8:
                int iIntValue8 = num.intValue();
                tj3 tj3Var8 = (tj3) ye1Var;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    AudioUnderlineMode audioUnderlineMode = nz9Var.f53471q;
                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var);
                    Object objM22097O8 = tj3Var8.m22097O();
                    if (zM22120g8 || objM22097O8 == p84Var) {
                        objM22097O8 = new cx8(vi3Var, 19);
                        tj3Var8.m22131l0(objM22097O8);
                    }
                    AbstractC1881a.m8662a(audioUnderlineMode, (vi3) objM22097O8, tj3Var8, 0);
                }
                break;
            case 9:
                int iIntValue9 = num.intValue();
                tj3 tj3Var9 = (tj3) ye1Var;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    List list4 = nz9Var.f53476v;
                    String str = nz9Var.f53477w;
                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var);
                    Object objM22097O9 = tj3Var9.m22097O();
                    if (zM22120g9 || objM22097O9 == p84Var) {
                        objM22097O9 = new cx8(vi3Var, 23);
                        tj3Var9.m22131l0(objM22097O9);
                    }
                    AbstractC1881a.m8675n(list4, str, (vi3) objM22097O9, tj3Var9, 0);
                }
                break;
            case 10:
                int iIntValue10 = num.intValue();
                tj3 tj3Var10 = (tj3) ye1Var;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    List list5 = nz9Var.f53478x;
                    String str2 = nz9Var.f53479y;
                    boolean zM22120g10 = tj3Var10.m22120g(vi3Var);
                    Object objM22097O10 = tj3Var10.m22097O();
                    if (zM22120g10 || objM22097O10 == p84Var) {
                        objM22097O10 = new cx8(vi3Var, 20);
                        tj3Var10.m22131l0(objM22097O10);
                    }
                    AbstractC1881a.m8675n(list5, str2, (vi3) objM22097O10, tj3Var10, 0);
                }
                break;
            default:
                num.getClass();
                AbstractC1881a.m8674m(nz9Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ez9(nz9 nz9Var, vi3 vi3Var, int i, int i2) {
        this.f38114a = i2;
        this.f38115b = nz9Var;
        this.f38116c = vi3Var;
    }
}
