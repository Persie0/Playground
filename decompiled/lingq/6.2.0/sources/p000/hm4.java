package p000;

import android.content.Context;
import com.lingq.core.domain.model.LanguageLearn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hm4 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f42610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f42611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f42612d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f42613e;

    public /* synthetic */ hm4(ArrayList arrayList, Context context, String str, vi3 vi3Var, int i) {
        this.f42609a = i;
        this.f42610b = arrayList;
        this.f42611c = context;
        this.f42612d = str;
        this.f42613e = vi3Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f42609a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        String str = this.f42612d;
        ArrayList arrayList = this.f42610b;
        Context context = this.f42611c;
        vi3 vi3Var = this.f42613e;
        switch (i) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    tj3Var.m22102U();
                } else {
                    LanguageLearn languageLearn = (LanguageLearn) arrayList.get(iIntValue);
                    tj3Var.m22111b0(-652890045);
                    String strM17093L = AbstractC3352my.m17093L(context, languageLearn.getCode());
                    boolean zM11650l = fa4.m11650l(str, languageLearn.getCode());
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(languageLearn.ordinal());
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new fm4(vi3Var, languageLearn, 0);
                        tj3Var.m22131l0(objM22097O);
                    }
                    txb.m22336b(strM17093L, zM11650l, (ui3) objM22097O, AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, languageLearn.getCode()), tj3Var, 0), null, null, null, tj3Var, 4096, 112);
                    tj3Var.m22139q(false);
                }
                break;
            default:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    tj3Var2.m22102U();
                } else {
                    LanguageLearn languageLearn2 = (LanguageLearn) arrayList.get(iIntValue3);
                    tj3Var2.m22111b0(89764972);
                    String strM17093L2 = AbstractC3352my.m17093L(context, languageLearn2.getCode());
                    boolean zM11650l2 = fa4.m11650l(str, languageLearn2.getCode());
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22116e(languageLearn2.ordinal());
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fm4(vi3Var, languageLearn2, 1);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    txb.m22336b(strM17093L2, zM11650l2, (ui3) objM22097O2, AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, languageLearn2.getCode()), tj3Var2, 0), null, null, null, tj3Var2, 4096, 112);
                    tj3Var2.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }
}
