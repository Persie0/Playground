package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.achievements.StreakChallengeType;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.R$string;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.token.TokenParentFragment;
import com.lingq.feature.edit.components.AbstractC2079b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iz4 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f44805c;

    public /* synthetic */ iz4(int i, Object obj, Object obj2) {
        this.f44803a = i;
        this.f44804b = obj;
        this.f44805c = obj2;
    }

    /* JADX INFO: renamed from: d */
    private final Object m14211d(Object obj, Object obj2, Object obj3) {
        Pair pair = ((sq8) this.f44804b).f61267c;
        Context context = (Context) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4416i(e16VarM4412e, 48.0f, 0.0f, 2), ((fe9) tj3Var.m22128k(zf1Var)).f38952a, ((fe9) tj3Var.m22128k(zf1Var)).f38955d);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(AbstractC3393o1.m17735j(AbstractC3423or.m18231P((LearningLevel) pair.f47623a, context), " - ", AbstractC3423or.m18231P((LearningLevel) pair.f47624b, context)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, 0, 24576, 114686);
            p04 p04VarM17721b = e9d.f36891a;
            if (p04VarM17721b == null) {
                o04 o04Var = new o04("Rounded.Tune", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = soa.f61116a;
                pd9 pd9Var = new pd9(aa1.f403b);
                f57 f57VarM17730e = AbstractC3393o1.m17730e(3.0f, 18.0f);
                f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11550e(5.0f);
                f57VarM17730e.m11557l(-2.0f);
                f57VarM17730e.m11551f(4.0f, 17.0f);
                f57VarM17730e.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11546a();
                f57VarM17730e.m11553h(3.0f, 6.0f);
                f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11550e(9.0f);
                f57VarM17730e.m11551f(13.0f, 5.0f);
                f57VarM17730e.m11551f(4.0f, 5.0f);
                f57VarM17730e.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11546a();
                f57VarM17730e.m11553h(13.0f, 20.0f);
                f57VarM17730e.m11557l(-1.0f);
                f57VarM17730e.m11550e(7.0f);
                f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11555j(-0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11550e(-7.0f);
                f57VarM17730e.m11557l(-1.0f);
                f57VarM17730e.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11555j(-1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11557l(4.0f);
                f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11555j(1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11546a();
                f57VarM17730e.m11553h(7.0f, 10.0f);
                f57VarM17730e.m11557l(1.0f);
                f57VarM17730e.m11551f(4.0f, 11.0f);
                f57VarM17730e.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11555j(0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11550e(3.0f);
                f57VarM17730e.m11557l(1.0f);
                f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11555j(1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11557l(-4.0f);
                f57VarM17730e.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11555j(-1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11546a();
                f57VarM17730e.m11553h(21.0f, 12.0f);
                f57VarM17730e.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11550e(-9.0f);
                f57VarM17730e.m11557l(2.0f);
                f57VarM17730e.m11550e(9.0f);
                f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11546a();
                f57VarM17730e.m11553h(16.0f, 9.0f);
                f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11551f(17.0f, 7.0f);
                f57VarM17730e.m11550e(3.0f);
                f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                f57VarM17730e.m11555j(-0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11550e(-3.0f);
                f57VarM17730e.m11551f(17.0f, 4.0f);
                f57VarM17730e.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                f57VarM17730e.m11555j(-1.0f, 0.45f, -1.0f, 1.0f);
                f57VarM17730e.m11557l(4.0f);
                f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                f57VarM17730e.m11546a();
                o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
                p04VarM17721b = o04Var.m17721b();
                e9d.f36891a = p04VarM17721b;
            }
            ty3.m22351a(p04VarM17721b, null, null, 0L, tj3Var, 48, 12);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m14212g(Object obj, Object obj2, Object obj3) {
        long j;
        s19 s19Var = (s19) this.f44804b;
        String str = (String) this.f44805c;
        tj8 tj8Var = (tj8) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tj8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(tj8Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e16 e16VarMo12420a = tj8Var.mo12420a(1.0f, b16.f7762a, true);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            if (s19Var.f60159a != null || s19Var.f60160b == null) {
                tj3Var.m22111b0(-26877025);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-26956168);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s;
                tj3Var.m22139q(false);
            }
            lw9.m16554b(str, e16VarMo12420a, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 131064);
            ty3.m22351a(n7d.m17276b(), null, null, 0L, tj3Var, 48, 12);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m14213j(Object obj, Object obj2, Object obj3) {
        gt8 gt8Var = (gt8) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            d1d d1dVar = gt8Var.f41303b;
            boolean zM11650l = fa4.m11650l(d1dVar, et8.f37830a);
            p84 p84Var = we1.f66679a;
            if (zM11650l) {
                tj3Var.m22111b0(1455952008);
                jq8 jq8Var = gt8Var.f41304c;
                boolean zM22120g = tj3Var.m22120g(vi3Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == p84Var) {
                    objM22097O = new wh7(vi3Var, 23);
                    tj3Var.m22131l0(objM22097O);
                }
                gzc.m12982a(jq8Var, (vi3) objM22097O, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                if (!fa4.m11650l(d1dVar, ft8.f39631a)) {
                    throw ux5.m23001x(tj3Var, 324058980, false);
                }
                tj3Var.m22111b0(1456278841);
                gq8 gq8Var = gt8Var.f41305d;
                boolean zM22120g2 = tj3Var.m22120g(vi3Var);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O2 == p84Var) {
                    objM22097O2 = new wh7(vi3Var, 24);
                    tj3Var.m22131l0(objM22097O2);
                }
                qzc.m20224a(gq8Var, (vi3) objM22097O2, tj3Var, 0);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m14214k(Object obj, Object obj2, Object obj3) {
        kx8 kx8Var = (kx8) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = kx8Var.f48548a;
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new wh7(vi3Var, 28);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC2079b.m8993a(str, (vi3) objM22097O, null, null, null, tj3Var, 0, 60);
            thb.m22044c(tj3Var, c99.m4414g(b16.f7762a, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f));
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m14215l(Object obj, Object obj2, Object obj3) {
        fx8 fx8Var = (fx8) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = fx8Var.f39902b;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(998257591);
                e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21606S);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 63);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(998535475);
                e16 e16VarM21606S2 = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var);
                boolean zM22124i = tj3Var.m22124i(fx8Var) | tj3Var.m22120g(vi3Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new sx7(23, fx8Var, vi3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                fa4.m11642c(e16VarM21606S2, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m14216m(Object obj, Object obj2, Object obj3) {
        rc2 rc2Var = (rc2) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e29 e29Var = new e29(R$string.dev_options_server_environment, null, ViewKeys.About, rc2Var.f59061a.getDisplayName(), null, 104);
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new ex8(vi3Var, 11);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC1858a.m8604t(null, e29Var, (ui3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m14217n(Object obj, Object obj2, Object obj3) {
        ui3 ui3Var = (ui3) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
            thb.m22044c(tj3Var, e65.m10871c(tj3Var, e16VarM1322c2, zi3Var4, 1.0f, true));
            boolean zM22120g = tj3Var.m22120g(ui3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new zy7(13, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            omd.m18141c((ui3) objM22097O, null, false, null, null, opc.f54707a, tj3Var, 1572864, 62);
            tj3Var.m22139q(true);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_fire_red, tj3Var, 0), null, c99.m4422o(b16Var, 48.0f), null, null, 0.0f, new qd0(5, j8d.m14343a(tj3Var, R$color.orange_activity_7)), tj3Var, 440, 56);
            lw9.m16554b(vz1.m23618Z(com.lingq.core.achievements.R$string.streak_keep_it_going, new Object[]{1}, tj3Var), AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), ge9.m12515a(tj3Var).f38958g, 0.0f, 2), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 130040);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_challenge_yourself_streak_goal), AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38956e, 7), ge9.m12515a(tj3Var).f38958g, 0.0f, 2), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 130044);
            tj3Var.m22111b0(1906990536);
            for (StreakChallengeType streakChallengeType : StreakChallengeType.getEntries()) {
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38958g, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
                boolean zM22120g2 = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(streakChallengeType.ordinal());
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O2 == p84Var) {
                    objM22097O2 = new a45(29, vi3Var, streakChallengeType);
                    tj3Var.m22131l0(objM22097O2);
                }
                u4d.m22467b(e16VarM21608U, streakChallengeType, (ui3) objM22097O2, tj3Var, 0);
            }
            tj3Var.m22139q(false);
            ux5.m23003z(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, tj3Var, true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m14218o(Object obj, Object obj2, Object obj3) {
        boolean z;
        qj9 qj9Var = (qj9) this.f44804b;
        Context context = (Context) this.f44805c;
        db1 db1Var = (db1) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ec0 ec0Var = nj0.f52791J;
        db1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(db1Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            ec0 ec0Var2 = nj0.f52792K;
            b16 b16Var = b16.f7762a;
            e16 e16VarM10265a = db1Var.m10265a(b16Var, ec0Var2);
            e41 e41Var = eh0.f37240f;
            sj8 sj8VarM20003a = qj8.m20003a(e41Var, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10265a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            if (fa4.m11650l(qj9Var, oj9.f54467a)) {
                tj3Var.m22111b0(-1638704671);
                zf1 zf1Var = ge9.f40637a;
                qh0.m19963a(x74.m24341H(pb1.m19045o(te1.m21995i(1.0f, c99.m4420m(AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 1), 0.0f, 0.0f, 120.0f, 0.0f, 11), false), ui8.f63972a)), tj3Var, 0);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38957f));
                bb1 bb1VarM230a = ab1.m230a(e41Var, ec0Var, tj3Var, 6);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                e16 e16VarM4414g = c99.m4414g(c99.m4426s(b16Var, 70.0f), 24.0f);
                vh9 vh9Var = ps5.f56764b;
                qh0.m19963a(x74.m24341H(pb1.m19045o(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 170.0f), 24.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
                z = true;
            } else {
                if (!(qj9Var instanceof pj9)) {
                    throw ux5.m23001x(tj3Var, -2131069724, false);
                }
                tj3Var.m22111b0(-1637218624);
                e16 e16VarM21995i = te1.m21995i(1.0f, c99.m4420m(AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38957f, 1), 0.0f, 0.0f, 120.0f, 0.0f, 11), false);
                dx1 dx1Var = ((pj9) qj9Var).f56324a;
                x4d.m24284a(e16VarM21995i, dx1Var.f36354b, dx1Var.f36355c, dx1Var.f36356d, tj3Var, 0);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38957f));
                bb1 bb1VarM230a2 = ab1.m230a(e41Var, ec0Var, tj3Var, 6);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                Locale locale = Locale.getDefault();
                String string = context.getString(com.lingq.core.achievements.R$string.stats_coins_goal);
                string.getClass();
                String str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(dx1Var.f36354b), Integer.valueOf(dx1Var.f36355c)}, 2));
                tj3Var.m22111b0(2101632250);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(str);
                arrayList.add(new C3304ln(new he9(0L, p58.m18902j(tj3Var).f71401e.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var).f71401e.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, vk9.m23371G0(str, "/").length(), 8));
                arrayList.add(new C3304ln(new he9(p58.m18900f(tj3Var).f55875s, p58.m18902j(tj3Var).f71403g.f66065a.f42265b, null, p58.m18902j(tj3Var).f71403g.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65524), vk9.m23371G0(str, "/").length(), str.length(), 8));
                String string2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(((C3304ln) arrayList.get(i)).m16392a(sb.length()));
                }
                C3419on c3419on = new C3419on(string2, arrayList2);
                tj3Var.m22139q(false);
                lw9.m16555c(c3419on, AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 7), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, new ks9(5), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71401e, tj3Var, 0, 0, 261112);
                lw9.m16554b(vz1.m23620a0(tj3Var, dx1Var.f36357e ? com.lingq.core.achievements.R$string.stats_daily_goal_met : com.lingq.core.achievements.R$string.stats_daily_goal_almost), c99.m4420m(c99.m4430w(b16Var, null, 3), 0.0f, 0.0f, 170.0f, 0.0f, 11), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 130040);
                tj3Var = tj3Var;
                z = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m14219p(Object obj, Object obj2, Object obj3) {
        uj9 uj9Var = (uj9) this.f44804b;
        String str = (String) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        C3549ru c3549ru = eh0.f37236b;
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zM11650l = fa4.m11650l(uj9Var, sj9.f60941a);
            b16 b16Var = b16.f7762a;
            if (zM11650l) {
                tj3Var.m22111b0(-1514484178);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 0.0f, 2);
                sj8 sj8VarM20003a = qj8.m20003a(c3549ru, nj0.f52789H, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                tj3Var.m22111b0(-1213436354);
                int i = 0;
                while (i < 7) {
                    e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, AbstractC3423or.m18285y(b16Var, IntrinsicSize.Min), true);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM17728c);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                    e16 e16VarM21995i = te1.m21995i(1.0f, c99.m4422o(b16Var, 60.0f), false);
                    zf1 zf1Var = ge9.f40637a;
                    qh0.m19963a(x74.m24341H(pb1.m19045o(AbstractC3584sr.m21607T(e16VarM21995i, ((fe9) tj3Var.m22128k(zf1Var)).f38955d), ui8.f63972a)), tj3Var, 0);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 7);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b("dom", x74.m24341H(pb1.m19045o(e16VarM21611X, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c)), ((bx2) tj3Var.m22128k(cx2.f34676a)).m4216i(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71411o, tj3Var, 6, 0, 131064);
                    tj3Var.m22139q(true);
                    i++;
                    b16Var = b16Var;
                }
            } else if (uj9Var instanceof tj9) {
                tj3Var.m22111b0(-1512858817);
                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 0.0f, 2);
                sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var, 0);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V2);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var3);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a2);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                tj3Var.m22111b0(690888486);
                for (mj9 mj9Var : ((tj9) uj9Var).f62422b) {
                    e16 e16VarM17728c2 = AbstractC3393o1.m17728c(1.0f, AbstractC3423or.m18285y(b16Var, IntrinsicSize.Min), true);
                    int i2 = mj9Var.f51409c;
                    String str2 = mj9Var.f51408b;
                    e5d.m10857a(e16VarM17728c2, i2, mj9Var.f51410d, mj9Var.f51407a, mj9Var.f51409c < mj9Var.f51410d && !vk9.m23391n0(str2) && str2.compareTo(str) < 0, !vk9.m23391n0(str2) && str2.compareTo(str) > 0, str2.equals(str), tj3Var, 0);
                }
            } else {
                if (!fa4.m11650l(uj9Var, rj9.f59415a)) {
                    throw ux5.m23001x(tj3Var, 366786491, false);
                }
                tj3Var.m22111b0(-1512018531);
                tj3Var.m22139q(false);
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m14220q(Object obj, Object obj2, Object obj3) {
        int i;
        Context context = (Context) this.f44804b;
        InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            inAppNotificationAction.getClass();
            switch (si2.f60888a[inAppNotificationAction.ordinal()]) {
                case 1:
                    i = com.lingq.core.p012ui.R$string.ui_yes;
                    break;
                case 2:
                    i = com.lingq.core.p012ui.R$string.ui_no;
                    break;
                case 3:
                    i = com.lingq.core.p012ui.R$string.notification_adjust_settings;
                    break;
                case 4:
                    i = com.lingq.core.p012ui.R$string.ui_reload_lesson;
                    break;
                case 5:
                    i = com.lingq.core.p012ui.R$string.ui_close;
                    break;
                case 6:
                    i = com.lingq.core.p012ui.R$string.ui_action_understood;
                    break;
                default:
                    gm5.m12750e();
                    return null;
            }
            String string = context.getString(i);
            string.getClass();
            lw9.m16554b(string, null, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, 0, 0, 131066);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m14221r(Object obj, Object obj2, Object obj3) {
        br9 br9Var = (br9) this.f44804b;
        vi3 vi3Var = (vi3) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = br9Var.f8901a;
            boolean z = br9Var.f8902b;
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(br9Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new qk9(8, vi3Var, br9Var);
                tj3Var.m22131l0(objM22097O);
            }
            z7d.m25488a(str, z, (ui3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m14222s(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f44804b;
        wia wiaVar = (wia) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            AbstractC1839a.m8524b(AbstractC3352my.m17093L(context, wiaVar.f66876a), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    private final Object m14223t(Object obj, Object obj2, Object obj3) {
        float f;
        zi3 zi3Var;
        C3587su c3587su;
        zi3 zi3Var2;
        float f2;
        vx9 vx9VarM23584b;
        b16 b16Var;
        boolean z;
        boolean z2;
        long j;
        aia aiaVar = (aia) this.f44804b;
        up6 up6Var = (up6) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        C3549ru c3549ru = eh0.f37236b;
        fc0 fc0Var = nj0.f52789H;
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            long j2 = p58.m18900f(tj3Var).f55821F;
            mv3 mv3Var = ss5.f61356d;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(b16Var2, j2, mv3Var);
            boolean z3 = aiaVar.f708h;
            if (z3) {
                tj3Var.m22111b0(2084766175);
                tj3Var.m22139q(false);
                f = 0.0f;
            } else {
                tj3Var.m22111b0(2084832515);
                float f3 = ge9.m12515a(tj3Var).f38957f;
                tj3Var.m22139q(false);
                f = f3;
            }
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM10007D, 0.0f, f, 0.0f, 0.0f, 13);
            C3587su c3587su2 = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su2, ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            boolean z4 = aiaVar.f712l.f65546e;
            boolean z5 = z4 && up6Var != null;
            if (up6Var == null || !z4) {
                zi3Var = zi3Var3;
                c3587su = c3587su2;
                zi3Var2 = zi3Var5;
                tj3Var.m22111b0(464785489);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(463693793);
                aa1 aa1VarM8521G = AbstractC1839a.m8521G(AbstractC3423or.m18217B(tj3Var) ? up6Var.f64189q : up6Var.f64188p);
                if (aa1VarM8521G == null) {
                    tj3Var.m22111b0(846248152);
                    j = p58.m18900f(tj3Var).f55842a;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(846245517);
                    tj3Var.m22139q(false);
                    j = aa1VarM8521G.f414a;
                }
                long j3 = j;
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38957f, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, ge9.m12515a(tj3Var).f38952a, 5);
                sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                zi3Var = zi3Var3;
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
                e16 e16VarM4412e = c99.m4412e(b16Var2, 0.5f);
                vk8 vk8Var = aiaVar.f712l;
                c3587su = c3587su2;
                zi3Var2 = zi3Var5;
                u9d.m22641e(vk8Var, e16VarM4412e, j3, true, tj3Var, 3120);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            if (z3) {
                tj3Var.m22111b0(465117158);
                if (z5) {
                    tj3Var.m22111b0(465161612);
                    f2 = ge9.m12515a(tj3Var).f38952a;
                    z2 = false;
                    tj3Var.m22139q(false);
                } else {
                    z2 = false;
                    tj3Var.m22111b0(465268066);
                    f2 = ge9.m12515a(tj3Var).f38958g * 1.3f;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(465413332);
                f2 = ge9.m12515a(tj3Var).f38952a;
                tj3Var.m22139q(false);
            }
            e16 e16VarM21611X3 = AbstractC3584sr.m21611X(e16VarM21609V, 0.0f, f2, 0.0f, ge9.m12515a(tj3Var).f38952a, 5);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var2, tj3Var, vi3Var);
            as4 as4VarM10871c = e65.m10871c(tj3Var, e16VarM1322c3, zi3Var6, 1.0f, true);
            C3587su c3587su3 = c3587su;
            bb1 bb1VarM230a2 = ab1.m230a(c3587su3, ec0Var, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, as4VarM10871c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var2, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c4);
            String str = aiaVar.f702b;
            if (z3) {
                tj3Var.m22111b0(693035132);
                vx9VarM23584b = vx9.m23584b(p58.m18902j(tj3Var).f71404h, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(693243111);
                vx9VarM23584b = p58.m18902j(tj3Var).f71404h;
                tj3Var.m22139q(false);
            }
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
            bb1 bb1VarM230a3 = ab1.m230a(c3587su3, nj0.f52793L, tj3Var, 48);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a3);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var2, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c5);
            lw9.m16554b(aiaVar.f705e, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131066);
            tj3 tj3Var2 = tj3Var;
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(true);
            if (z3) {
                tj3Var2.m22111b0(466880841);
                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(b16Var2, ge9.m12515a(tj3Var2).f38957f, 0.0f, 2);
                bb1 bb1VarM230a4 = ab1.m230a(c3587su3, ec0Var, tj3Var2, 0);
                int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m6 = tj3Var2.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a4);
                oha.m18001g(tj3Var2, zi3Var4, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var2, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c6);
                String str2 = aiaVar.f704d;
                vx9 vx9VarM23584b2 = vx9.m23584b(p58.m18902j(tj3Var2).f71404h, 0L, 0L, bc3.f8321g, null, null, 0L, rt9.f59803d, null, 0, 0L, null, 16773115);
                b16Var = b16Var2;
                lw9.m16554b(str2, AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38954c, 0.0f, 11), aa1.m198b(0.7f, p58.m18900f(tj3Var2).f55875s), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23584b2, tj3Var2, 0, 0, 131064);
                sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                int iHashCode7 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m7 = tj3Var2.m22132m();
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a3);
                oha.m18001g(tj3Var2, zi3Var4, l77VarM22132m7);
                AbstractC3393o1.m17747v(iHashCode7, tj3Var2, zi3Var2, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c7);
                lw9.m16554b(aiaVar.f703c, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38955d, 0.0f, 11), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var2).f71404h, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var2, 0, 0, 131064);
                String lowerCase = vz1.m23620a0(tj3Var2, com.lingq.core.premium.R$string.upgrade_charged_every_twelve_months).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                lw9.m16554b(lowerCase, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38955d, 0.0f, 11), p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 131064);
                tj3Var2 = tj3Var2;
                z = true;
                AbstractC3393o1.m17723A(tj3Var2, true, true, false);
            } else {
                b16Var = b16Var2;
                z = true;
                tj3Var2.m22111b0(468672145);
                tj3Var2.m22139q(false);
            }
            ux5.m23003z(b16Var, ge9.m12515a(tj3Var2).f38957f, tj3Var2, z);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    private final Object m14224u(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f44804b;
        wia wiaVar = (wia) this.f44805c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4428u = c99.m4428u(b16.f7762a, 0.0f, 600.0f, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4428u);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            AbstractC1839a.m8519E(fa4.m11650l(str, wiaVar.f66890o), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:239:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:244:0x0b12  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean zM22120g;
        Object objM22097O;
        int i = this.f44803a;
        int i2 = 2;
        b16 b16Var = b16.f7762a;
        Object obj5 = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj6 = this.f44805c;
        Object obj7 = this.f44804b;
        switch (i) {
            case 0:
                InterfaceC3066h8 interfaceC3066h8 = (InterfaceC3066h8) obj7;
                ql9 ql9Var = (ql9) obj6;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h5d.m13069b(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f, 7), interfaceC3066h8 instanceof C3029g8 ? (int) (((C3029g8) interfaceC3066h8).f40370b.f19087i.f19076a / 60.0d) : 0, ql9Var.f57913a, ql9Var.f57914b, ql9Var.f57915c, ql9Var.f57916d, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                e1b e1bVar = (e1b) obj7;
                vi3 vi3Var = (vi3) obj6;
                t17 t17Var = (t17) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    xz4.m24795c(t17Var, e1bVar, vi3Var, tj3Var2, iIntValue2 & 14);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                String str = (String) obj7;
                ui3 ui3Var = (ui3) obj6;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    vx9 vx9Var = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71404h;
                    zf1 zf1Var = ge9.f40637a;
                    lw9.m16554b(str, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e, ((fe9) tj3Var3.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, vx9Var, tj3Var3, 0, 24960, 110588);
                    int i3 = hf5.f42302a;
                    of5.m17959a(myb.f52051c, AbstractC3584sr.m21611X(AbstractC0080f.m815b(null, false, ui3Var, b16Var, 15), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e, 7), myb.f52052d, hf5.m13217a(aa1.f411j, tj3Var3), tj3Var3, 24582, 428);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                zi3 zi3Var = (zi3) obj6;
                ye1 ye1Var4 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((cb1) obj).getClass();
                ((C0282a) obj7).invoke(ye1Var4, 0);
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (zi3Var == null) {
                    tj3Var4.m22111b0(959702378);
                } else {
                    tj3Var4.m22111b0(959702379);
                    zi3Var.invoke(tj3Var4, 0);
                }
                tj3Var4.m22139q(false);
                return xfaVar;
            case 4:
                C0282a c0282a = (C0282a) obj7;
                t66 t66Var = (t66) obj6;
                Object obj8 = (db1) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                obj8.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((tj3) ye1Var5).m22120g(obj8) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object objM22097O2 = tj3Var5.m22097O();
                    if (objM22097O2 == obj5) {
                        objM22097O2 = new do4(12, t66Var);
                        tj3Var5.m22131l0(objM22097O2);
                    }
                    c0282a.mo825e(obj8, (ui3) objM22097O2, tj3Var5, Integer.valueOf((iIntValue4 & 14) | 48));
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                yn6 yn6Var = (yn6) obj7;
                vi3 vi3Var2 = (vi3) obj6;
                t17 t17Var2 = (t17) obj;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t17Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((tj3) ye1Var6).m22120g(t17Var2) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var6).f38960i), t17Var2);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var6).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var6, 0);
                    int iHashCode = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m = tj3Var6.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var6, e16VarM21606S);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    zi3 zi3Var2 = C0352b.f4303f;
                    oha.m18001g(tj3Var6, zi3Var2, bb1VarM230a);
                    zi3 zi3Var3 = C0352b.f4302e;
                    oha.m18001g(tj3Var6, zi3Var3, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var4 = C0352b.f4304g;
                    oha.m18001g(tj3Var6, zi3Var4, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var6, vi3Var3);
                    zi3 zi3Var5 = C0352b.f4301d;
                    oha.m18001g(tj3Var6, zi3Var5, e16VarM1322c);
                    lw9.m16554b(yn6Var.f70105a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71403g, tj3Var6, 0, 0, 131070);
                    e16 e16VarM19045o = pb1.m19045o(c99.m4412e(b16Var, 1.0f), p58.m18901i(tj3Var6).f64856b);
                    boolean zM22120g2 = tj3Var6.m22120g(vi3Var2);
                    Object objM22097O3 = tj3Var6.m22097O();
                    if (zM22120g2 || objM22097O3 == obj5) {
                        objM22097O3 = new q65(vi3Var2, 20);
                        tj3Var6.m22131l0(objM22097O3);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM19045o, 15);
                    fc0 fc0Var = nj0.f52789H;
                    C3549ru c3549ru = eh0.f37236b;
                    sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var6, 48);
                    int iHashCode2 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m2 = tj3Var6.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var6, e16VarM815b);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var2, sj8VarM20003a);
                    oha.m18001g(tj3Var6, zi3Var3, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var6, zi3Var4, tj3Var6, vi3Var3);
                    oha.m18001g(tj3Var6, zi3Var5, e16VarM1322c2);
                    vj8 vj8Var = vj8.f65508a;
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.settings_count), vj8Var.mo12420a(1.0f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131068);
                    Integer num = yn6Var.f70106b;
                    if (num == null) {
                        tj3Var6.m22111b0(770227637);
                    } else {
                        tj3Var6.m22111b0(770227638);
                        lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131070);
                    }
                    tj3Var6.m22139q(false);
                    ty3.m22351a(n7d.m17276b(), null, null, 0L, tj3Var6, 48, 12);
                    tj3Var6.m22139q(true);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var6, 48);
                    int iHashCode3 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m3 = tj3Var6.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var6, e16VarM4412e);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var2, sj8VarM20003a2);
                    oha.m18001g(tj3Var6, zi3Var3, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var6, zi3Var4, tj3Var6, vi3Var3);
                    oha.m18001g(tj3Var6, zi3Var5, e16VarM1322c3);
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.settings_send_email), vj8Var.mo12420a(1.0f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131068);
                    boolean z = yn6Var.f70107c;
                    boolean zM22120g3 = tj3Var6.m22120g(vi3Var2);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22120g3) {
                        obj4 = obj5;
                    } else {
                        obj4 = obj5;
                        if (objM22097O4 == obj4) {
                        }
                        ap9.m2973a(z, (vi3) objM22097O4, null, false, null, tj3Var6, 0);
                        tj3Var6.m22139q(true);
                        e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var6, 48);
                        int iHashCode4 = Long.hashCode(tj3Var6.f62385T);
                        l77 l77VarM22132m4 = tj3Var6.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var6, e16VarM4412e2);
                        tj3Var6.m22119f0();
                        if (tj3Var6.f62384S) {
                            tj3Var6.m22130l(ui3Var2);
                        } else {
                            tj3Var6.m22137o0();
                        }
                        oha.m18001g(tj3Var6, zi3Var2, sj8VarM20003a3);
                        oha.m18001g(tj3Var6, zi3Var3, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var6, zi3Var4, tj3Var6, vi3Var3);
                        oha.m18001g(tj3Var6, zi3Var5, e16VarM1322c4);
                        lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.settings_send_notification), vj8Var.mo12420a(1.0f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131068);
                        boolean z2 = yn6Var.f70108d;
                        zM22120g = tj3Var6.m22120g(vi3Var2);
                        objM22097O = tj3Var6.m22097O();
                        if (zM22120g || objM22097O == obj4) {
                            objM22097O = new i75(vi3Var2, 11);
                            tj3Var6.m22131l0(objM22097O);
                        }
                        ap9.m2973a(z2, (vi3) objM22097O, null, false, null, tj3Var6, 0);
                        tj3Var6.m22139q(true);
                        tj3Var6.m22139q(true);
                    }
                    objM22097O4 = new i75(vi3Var2, 10);
                    tj3Var6.m22131l0(objM22097O4);
                    ap9.m2973a(z, (vi3) objM22097O4, null, false, null, tj3Var6, 0);
                    tj3Var6.m22139q(true);
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru, fc0Var, tj3Var6, 48);
                    int iHashCode5 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m5 = tj3Var6.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var6, e16VarM4412e3);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var2, sj8VarM20003a4);
                    oha.m18001g(tj3Var6, zi3Var3, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var6, zi3Var4, tj3Var6, vi3Var3);
                    oha.m18001g(tj3Var6, zi3Var5, e16VarM1322c5);
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.settings_send_notification), vj8Var.mo12420a(1.0f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131068);
                    boolean z3 = yn6Var.f70108d;
                    zM22120g = tj3Var6.m22120g(vi3Var2);
                    objM22097O = tj3Var6.m22097O();
                    if (zM22120g) {
                        objM22097O = new i75(vi3Var2, 11);
                        tj3Var6.m22131l0(objM22097O);
                    } else {
                        objM22097O = new i75(vi3Var2, 11);
                        tj3Var6.m22131l0(objM22097O);
                    }
                    ap9.m2973a(z3, (vi3) objM22097O, null, false, null, tj3Var6, 0);
                    tj3Var6.m22139q(true);
                    tj3Var6.m22139q(true);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                vi3 vi3Var4 = (vi3) obj7;
                vi3 vi3Var5 = (vi3) obj6;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zf1 zf1Var2 = ge9.f40637a;
                    float f = ((fe9) tj3Var7.m22128k(zf1Var2)).f38960i;
                    b16 b16Var2 = b16.f7762a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, f, 0.0f, 11);
                    sj8 sj8VarM20003a5 = qj8.m20003a(new C3661uu(((fe9) tj3Var7.m22128k(zf1Var2)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var7, 48);
                    int iHashCode6 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m6 = tj3Var7.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var7, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var3);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, sj8VarM20003a5);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c6);
                    ((fe9) tj3Var7.m22128k(zf1Var2)).getClass();
                    e16 e16VarM4422o = c99.m4422o(b16Var2, 32.0f);
                    boolean zM22120g4 = tj3Var7.m22120g(vi3Var4);
                    Object objM22097O5 = tj3Var7.m22097O();
                    if (zM22120g4 || objM22097O5 == obj5) {
                        objM22097O5 = new q65(vi3Var4, 21);
                        tj3Var7.m22131l0(objM22097O5);
                    }
                    bq1.m4042R(AbstractC3423or.m18236U(com.lingq.feature.notifications.R$drawable.ic_notifications_mark_selected, tj3Var7, 0), vz1.m23620a0(tj3Var7, com.lingq.core.p012ui.R$string.ui_mark_all_read), AbstractC0080f.m815b(null, false, (ui3) objM22097O5, e16VarM4422o, 15), null, null, 0.0f, null, tj3Var7, 8, 120);
                    ((fe9) tj3Var7.m22128k(zf1Var2)).getClass();
                    e16 e16VarM4422o2 = c99.m4422o(b16Var2, 32.0f);
                    boolean zM22120g5 = tj3Var7.m22120g(vi3Var5);
                    Object objM22097O6 = tj3Var7.m22097O();
                    if (zM22120g5 || objM22097O6 == obj5) {
                        objM22097O6 = new q65(vi3Var5, 22);
                        tj3Var7.m22131l0(objM22097O6);
                    }
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_library_settings, tj3Var7, 0), vz1.m23620a0(tj3Var7, com.lingq.core.p012ui.R$string.settings_text_settings), AbstractC0080f.m815b(null, false, (ui3) objM22097O6, e16VarM4422o2, 15), null, null, 0.0f, null, tj3Var7, 8, 120);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                mo6 mo6Var = (mo6) obj7;
                vi3 vi3Var6 = (vi3) obj6;
                t17 t17Var3 = (t17) obj;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t17Var3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((tj3) ye1Var8).m22120g(t17Var3) ? 4 : 2;
                }
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e16 e16VarM21606S2 = AbstractC3584sr.m21606S(b16Var, t17Var3);
                    zf1 zf1Var3 = ge9.f40637a;
                    ((fe9) tj3Var8.m22128k(zf1Var3)).getClass();
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM21606S2, 16.0f, 0.0f, 2);
                    ((fe9) tj3Var8.m22128k(zf1Var3)).getClass();
                    e16 e16VarM21609V2 = AbstractC3584sr.m21609V(e16VarM21609V, 0.0f, 16.0f, 1);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var8.m22128k(zf1Var3)).f38955d, true, new gm5(28));
                    boolean zM22124i = tj3Var8.m22124i(mo6Var) | tj3Var8.m22120g(vi3Var6);
                    Object objM22097O7 = tj3Var8.m22097O();
                    if (zM22124i || objM22097O7 == obj5) {
                        objM22097O7 = new h85(20, mo6Var, vi3Var6);
                        tj3Var8.m22131l0(objM22097O7);
                    }
                    fa4.m11642c(e16VarM21609V2, null, null, c3661uu, null, null, false, null, (vi3) objM22097O7, tj3Var8, 0, 494);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                String str2 = (String) obj7;
                t66 t66Var2 = (t66) obj6;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    lw9.m16554b(str2, c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 48, 0, 262140);
                    if (((Boolean) t66Var2.getValue()).booleanValue()) {
                        tj3Var9.m22111b0(-754654586);
                        ty3.m22351a(jhd.m14483a(), null, null, 0L, tj3Var9, 48, 12);
                        tj3Var9.m22139q(false);
                    } else {
                        tj3Var9.m22111b0(-754444189);
                        ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var9, 48, 12);
                        tj3Var9.m22139q(false);
                    }
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                sz7 sz7Var = (sz7) obj7;
                vi3 vi3Var7 = (vi3) obj6;
                t17 t17Var4 = (t17) obj;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t17Var4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((tj3) ye1Var10).m22120g(t17Var4) ? 4 : 2;
                }
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e16 e16VarM21606S3 = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var4);
                    zf1 zf1Var4 = ge9.f40637a;
                    ((fe9) tj3Var10.m22128k(zf1Var4)).getClass();
                    e16 e16VarM21609V3 = AbstractC3584sr.m21609V(e16VarM21606S3, 16.0f, 0.0f, 2);
                    ((fe9) tj3Var10.m22128k(zf1Var4)).getClass();
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(e16VarM21609V3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    C3661uu c3661uu2 = new C3661uu(((fe9) tj3Var10.m22128k(zf1Var4)).f38952a, true, new gm5(28));
                    boolean zM22124i2 = tj3Var10.m22124i(sz7Var) | tj3Var10.m22120g(vi3Var7);
                    Object objM22097O8 = tj3Var10.m22097O();
                    if (zM22124i2 || objM22097O8 == obj5) {
                        objM22097O8 = new sx7(i2, sz7Var, vi3Var7);
                        tj3Var10.m22131l0(objM22097O8);
                    }
                    fa4.m11642c(e16VarM21611X2, null, null, c3661uu2, null, null, false, null, (vi3) objM22097O8, tj3Var10, 0, 494);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                hg8 hg8Var = (hg8) obj7;
                vi3 vi3Var8 = (vi3) obj6;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    pg8 pg8Var = hg8Var.f42326a;
                    tj3Var11.m22111b0(1650904104);
                    boolean zM22120g6 = tj3Var11.m22120g(vi3Var8);
                    Object objM22097O9 = tj3Var11.m22097O();
                    if (zM22120g6 || objM22097O9 == obj5) {
                        objM22097O9 = new nc8(vi3Var8, 2);
                        tj3Var11.m22131l0(objM22097O9);
                    }
                    omd.m18141c((ui3) objM22097O9, null, false, null, null, mjc.f51416c, tj3Var11, 1572864, 62);
                    tj3Var11.m22139q(false);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                ze8 ze8Var = (ze8) obj7;
                vi3 vi3Var9 = (vi3) obj6;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    boolean zM22124i3 = tj3Var12.m22124i(ze8Var) | tj3Var12.m22120g(vi3Var9);
                    Object objM22097O10 = tj3Var12.m22097O();
                    if (zM22124i3 || objM22097O10 == obj5) {
                        objM22097O10 = new sx7(11, ze8Var, vi3Var9);
                        tj3Var12.m22131l0(objM22097O10);
                    }
                    fa4.m11642c(e16VarM4411d, null, null, null, null, null, false, null, (vi3) objM22097O10, tj3Var12, 6, 510);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 12:
                yf8 yf8Var = (yf8) obj7;
                vi3 vi3Var10 = (vi3) obj6;
                t17 t17Var5 = (t17) obj;
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t17Var5.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((tj3) ye1Var13).m22120g(t17Var5) ? 4 : 2;
                }
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    e16 e16VarM21606S4 = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var5);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    e16 e16VarM23904F = wfb.m23904F(e16VarM21606S4, ho5.m13397r(tj3Var13).f49209e);
                    zf1 zf1Var5 = ge9.f40637a;
                    ((fe9) tj3Var13.m22128k(zf1Var5)).getClass();
                    e16 e16VarM21609V4 = AbstractC3584sr.m21609V(e16VarM23904F, 16.0f, 0.0f, 2);
                    ((fe9) tj3Var13.m22128k(zf1Var5)).getClass();
                    e16 e16VarM21609V5 = AbstractC3584sr.m21609V(e16VarM21609V4, 0.0f, 16.0f, 1);
                    C3661uu c3661uu3 = new C3661uu(((fe9) tj3Var13.m22128k(zf1Var5)).f38952a, true, new gm5(28));
                    boolean zM22124i4 = tj3Var13.m22124i(yf8Var) | tj3Var13.m22120g(vi3Var10);
                    Object objM22097O11 = tj3Var13.m22097O();
                    if (zM22124i4 || objM22097O11 == obj5) {
                        objM22097O11 = new sx7(13, yf8Var, vi3Var10);
                        tj3Var13.m22131l0(objM22097O11);
                    }
                    fa4.m11642c(e16VarM21609V5, null, null, c3661uu3, null, null, false, null, (vi3) objM22097O11, tj3Var13, 0, 494);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 13:
                vi3 vi3Var11 = (vi3) obj7;
                tpa tpaVar = (tpa) obj6;
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    e16 e16VarM4414g = c99.m4414g(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var14.m22128k(ge9.f40637a)).f38957f, 1), 48.0f);
                    boolean zM22120g7 = tj3Var14.m22120g(vi3Var11);
                    Object objM22097O12 = tj3Var14.m22097O();
                    if (zM22120g7 || objM22097O12 == obj5) {
                        objM22097O12 = new nc8(vi3Var11, 14);
                        tj3Var14.m22131l0(objM22097O12);
                    }
                    ss5.m21711g(e16VarM4414g, false, null, 0L, null, null, (ui3) objM22097O12, ci8.m4703P(-1722027881, new fo8(tpaVar, 1), tj3Var14), tj3Var14, 12582912, 62);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 14:
                return m14211d(obj, obj2, obj3);
            case 15:
                return m14212g(obj, obj2, obj3);
            case 16:
                return m14213j(obj, obj2, obj3);
            case 17:
                return m14214k(obj, obj2, obj3);
            case 18:
                return m14215l(obj, obj2, obj3);
            case 19:
                return m14216m(obj, obj2, obj3);
            case 20:
                return m14217n(obj, obj2, obj3);
            case 21:
                return m14218o(obj, obj2, obj3);
            case 22:
                return m14219p(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m14220q(obj, obj2, obj3);
            case 24:
                View view = (View) obj7;
                TokenParentFragment tokenParentFragment = (TokenParentFragment) obj6;
                f6b f6bVar = (f6b) obj2;
                ((View) obj).getClass();
                f6bVar.getClass();
                ((mua) obj3).getClass();
                c6b c6bVar = f6bVar.f38536a;
                c6bVar.mo136i(519).getClass();
                c6bVar.mo136i(8).getClass();
                View viewFindViewById = view.findViewById(R$id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
                    DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                    bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels);
                    ConstraintLayout constraintLayout = ((tf3) tokenParentFragment.f23318S0.getValue(tokenParentFragment, TokenParentFragment.f23317U0[0])).f62219a;
                    constraintLayout.getClass();
                    jfa.m14426i(constraintLayout, displayMetrics.heightPixels);
                    bottomSheetBehaviorM6021C.m6029J(true);
                }
                return xfaVar;
            case 25:
                return m14221r(obj, obj2, obj3);
            case 26:
                return m14222s(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m14223t(obj, obj2, obj3);
            case 28:
                return m14224u(obj, obj2, obj3);
            default:
                kxa kxaVar = (kxa) obj7;
                vi3 vi3Var12 = (vi3) obj6;
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var6 = ge9.f40637a;
                    e16 e16VarM21611X3 = AbstractC3584sr.m21611X(thb.m22066y(AbstractC3584sr.m21609V(e16VarM4412e4, ((fe9) tj3Var15.m22128k(zf1Var6)).f38960i, 0.0f, 2)), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var15.m22128k(zf1Var6)).f38957f, 7);
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var15.m22128k(zf1Var6)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var15, 0);
                    int iHashCode7 = Long.hashCode(tj3Var15.f62385T);
                    l77 l77VarM22132m7 = tj3Var15.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var15, e16VarM21611X3);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var15.m22119f0();
                    if (tj3Var15.f62384S) {
                        tj3Var15.m22130l(ui3Var4);
                    } else {
                        tj3Var15.m22137o0();
                    }
                    zi3 zi3Var6 = C0352b.f4303f;
                    oha.m18001g(tj3Var15, zi3Var6, bb1VarM230a2);
                    zi3 zi3Var7 = C0352b.f4302e;
                    oha.m18001g(tj3Var15, zi3Var7, l77VarM22132m7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    zi3 zi3Var8 = C0352b.f4304g;
                    oha.m18001g(tj3Var15, zi3Var8, numValueOf2);
                    vi3 vi3Var13 = C0352b.f4305h;
                    oha.m18000f(tj3Var15, vi3Var13);
                    zi3 zi3Var9 = C0352b.f4301d;
                    oha.m18001g(tj3Var15, zi3Var9, e16VarM1322c7);
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a6 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var15, 54);
                    int iHashCode8 = Long.hashCode(tj3Var15.f62385T);
                    l77 l77VarM22132m8 = tj3Var15.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var15, e16VarM4412e5);
                    tj3Var15.m22119f0();
                    if (tj3Var15.f62384S) {
                        tj3Var15.m22130l(ui3Var4);
                    } else {
                        tj3Var15.m22137o0();
                    }
                    oha.m18001g(tj3Var15, zi3Var6, sj8VarM20003a6);
                    oha.m18001g(tj3Var15, zi3Var7, l77VarM22132m8);
                    AbstractC3393o1.m17747v(iHashCode8, tj3Var15, zi3Var8, tj3Var15, vi3Var13);
                    oha.m18001g(tj3Var15, zi3Var9, e16VarM1322c8);
                    boolean zM22120g8 = tj3Var15.m22120g(vi3Var12);
                    Object objM22097O13 = tj3Var15.m22097O();
                    if (zM22120g8 || objM22097O13 == obj5) {
                        objM22097O13 = new hsa(vi3Var12, 3);
                        tj3Var15.m22131l0(objM22097O13);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var15, (ui3) objM22097O13, hsc.f42893a, null, null, null, false);
                    boolean zM22120g9 = tj3Var15.m22120g(vi3Var12);
                    Object objM22097O14 = tj3Var15.m22097O();
                    if (zM22120g9 || objM22097O14 == obj5) {
                        objM22097O14 = new hsa(vi3Var12, 4);
                        tj3Var15.m22131l0(objM22097O14);
                    }
                    AbstractC0231g.m1153f(805306368, 506, null, tj3Var15, (ui3) objM22097O14, hsc.f42894b, null, null, null, kxaVar.f48568b);
                    tj3Var15.m22139q(true);
                    String strM23620a0 = vz1.m23620a0(tj3Var15, com.lingq.feature.vocabulary.R$string.card_add_lingq_for_term);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, ((ms5) tj3Var15.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var15.m22128k(vh9Var)).f51800b.f71403g, tj3Var15, 0, 0, 131066);
                    String str3 = kxaVar.f48567a;
                    boolean zM22120g10 = tj3Var15.m22120g(vi3Var12);
                    Object objM22097O15 = tj3Var15.m22097O();
                    if (zM22120g10 || objM22097O15 == obj5) {
                        objM22097O15 = new v4a(vi3Var12, 14);
                        tj3Var15.m22131l0(objM22097O15);
                    }
                    bna.m3942c(str3, (vi3) objM22097O15, c99.m4412e(b16Var, 1.0f), false, null, hsc.f42895c, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, tj3Var15, 1573248, 12582912, 8257464);
                    tj3Var15.m22139q(true);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
        }
    }
}
