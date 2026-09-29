package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.feature.karaoke.AbstractC2117b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class py3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56977a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f56978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f56979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f56980d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f56981e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f56982f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f56983g;

    public /* synthetic */ py3(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, ly3 ly3Var, C0282a c0282a, int i) {
        this.f56980d = ui3Var;
        this.f56978b = e16Var;
        this.f56979c = z;
        this.f56981e = o39Var;
        this.f56982f = ly3Var;
        this.f56983g = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56977a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f56983g;
        Object obj4 = this.f56982f;
        Object obj5 = this.f56981e;
        Object obj6 = this.f56978b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                omd.m18139b(this.f56980d, (e16) obj6, this.f56979c, (o39) obj5, (ly3) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(1572865));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2117b.m9029i((e16) obj6, (LessonTranslationSentence) obj5, this.f56979c, (Integer) obj4, (String) obj3, this.f56980d, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                txb.m22340f((String) obj5, (String) obj4, this.f56979c, this.f56980d, (e16) obj6, (String) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                d32.m10059s((yf7) obj6, this.f56979c, (vi3) obj5, (vi3) obj4, (vi3) obj3, this.f56980d, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                cjc.m4786b(this.f56979c, this.f56980d, (ui3) obj5, (ui3) obj4, (ui3) obj3, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                zi3 zi3Var = (zi3) obj6;
                Context context = (Context) obj5;
                t66 t66Var = (t66) obj4;
                t66 t66Var2 = (t66) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22120g = tj3Var.m22120g(zi3Var) | tj3Var.m22124i(context);
                    ui3 ui3Var = this.f56980d;
                    boolean zM22120g2 = zM22120g | tj3Var.m22120g(ui3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O == p84Var) {
                        um3 um3Var = new um3(t66Var, zi3Var, context, ui3Var, t66Var2, 1);
                        tj3Var.m22131l0(um3Var);
                        objM22097O = um3Var;
                    }
                    AbstractC0231g.m1148a((ui3) objM22097O, null, this.f56979c, null, null, null, null, null, cjc.f10184a, tj3Var, 805306368, 506);
                }
                break;
            default:
                sxa sxaVar = (sxa) obj6;
                ui3 ui3Var2 = (ui3) obj5;
                vi3 vi3Var = (vi3) obj4;
                t66 t66Var3 = (t66) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean z = this.f56979c;
                    ui3 ui3Var3 = this.f56980d;
                    if (!z) {
                        tj3Var2.m22111b0(1578870723);
                        fbd.m11756f(0, tj3Var2, ui3Var3, ui3Var2, vi3Var, sxaVar);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(1578355317);
                        boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = new mya(2, t66Var3);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O2;
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new tia(3, t66Var3);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        vi3 vi3Var2 = (vi3) objM22097O3;
                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O4 == p84Var) {
                            objM22097O4 = new rza(vi3Var, t66Var3, 1);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        fbd.m11754d(sxaVar, zBooleanValue, ui3Var3, ui3Var2, ui3Var4, vi3Var2, (vi3) objM22097O4, tj3Var2, 221184);
                        tj3Var2.m22139q(false);
                    }
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ py3(zi3 zi3Var, Context context, ui3 ui3Var, boolean z, t66 t66Var, t66 t66Var2) {
        this.f56978b = zi3Var;
        this.f56981e = context;
        this.f56980d = ui3Var;
        this.f56979c = z;
        this.f56982f = t66Var;
        this.f56983g = t66Var2;
    }

    public /* synthetic */ py3(e16 e16Var, LessonTranslationSentence lessonTranslationSentence, boolean z, Integer num, String str, ui3 ui3Var, int i) {
        this.f56978b = e16Var;
        this.f56981e = lessonTranslationSentence;
        this.f56979c = z;
        this.f56982f = num;
        this.f56983g = str;
        this.f56980d = ui3Var;
    }

    public /* synthetic */ py3(yf7 yf7Var, boolean z, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, int i) {
        this.f56978b = yf7Var;
        this.f56979c = z;
        this.f56981e = vi3Var;
        this.f56982f = vi3Var2;
        this.f56983g = vi3Var3;
        this.f56980d = ui3Var;
    }

    public /* synthetic */ py3(String str, String str2, boolean z, ui3 ui3Var, e16 e16Var, String str3, int i) {
        this.f56981e = str;
        this.f56982f = str2;
        this.f56979c = z;
        this.f56980d = ui3Var;
        this.f56978b = e16Var;
        this.f56983g = str3;
    }

    public /* synthetic */ py3(boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4, e16 e16Var, int i) {
        this.f56979c = z;
        this.f56980d = ui3Var;
        this.f56981e = ui3Var2;
        this.f56982f = ui3Var3;
        this.f56983g = ui3Var4;
        this.f56978b = e16Var;
    }

    public /* synthetic */ py3(boolean z, sxa sxaVar, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, t66 t66Var) {
        this.f56979c = z;
        this.f56978b = sxaVar;
        this.f56980d = ui3Var;
        this.f56981e = ui3Var2;
        this.f56982f = vi3Var;
        this.f56983g = t66Var;
    }
}
