package p000;

import android.graphics.Bitmap;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.AbstractC0640a;
import com.lingq.feature.widget.R$drawable;
import com.lingq.feature.widget.R$string;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: de */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2925de implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35481a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f35482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35483c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35484d;

    public /* synthetic */ C2925de(float f, LayoutDirection layoutDirection, C0282a c0282a) {
        this.f35482b = f;
        this.f35483c = layoutDirection;
        this.f35484d = c0282a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.f35481a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f35484d;
        float f = this.f35482b;
        Object obj5 = this.f35483c;
        boolean z = 0;
        int i2 = 1;
        switch (i) {
            case 0:
                LayoutDirection layoutDirection = (LayoutDirection) obj5;
                C0282a c0282a = (C0282a) obj4;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 1;
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC3423or.m18244b(null, new C3661uu(8.0f, true, new gm5(28)), new C3661uu(f, true, new gm5(28)), null, 0, 0, ci8.m4703P(879927511, new C3180kd(i3, layoutDirection, c0282a), tj3Var), tj3Var, 1572864, 57);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                List<Pair> list = (List) obj5;
                Object obj6 = (vi3) obj4;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    tj3Var2.m22111b0(-2011024998);
                    tj3 tj3Var3 = tj3Var2;
                    for (Pair pair : list) {
                        String str = (String) pair.f47623a;
                        float fFloatValue = ((Number) pair.f47624b).floatValue();
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        boolean zM22120g = tj3Var3.m22120g(obj6) | tj3Var3.m22114d(fFloatValue);
                        Object objM22097O = tj3Var3.m22097O();
                        Object obj7 = we1.f66679a;
                        if (zM22120g || objM22097O == obj7) {
                            obj3 = objM22097O;
                            Object ef9Var = new ef9(obj6, fFloatValue, z);
                            tj3Var3.m22131l0(ef9Var);
                            obj3 = ef9Var;
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, z, (ui3) obj3, e16VarM4412e, 15);
                        AbstractC0279g abstractC0279g = ge9.f40637a;
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM815b, 0.0f, ((fe9) tj3Var3.m22128k(abstractC0279g)).f38955d, i2);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                        b16 b16Var2 = b16Var;
                        boolean z2 = fFloatValue == f;
                        boolean zM22120g2 = tj3Var3.m22120g(obj6) | tj3Var3.m22114d(fFloatValue);
                        Object objM22097O2 = tj3Var3.m22097O();
                        if (zM22120g2 || objM22097O2 == obj7) {
                            objM22097O2 = new ef9(obj6, fFloatValue, 1);
                            tj3Var3.m22131l0(objM22097O2);
                        }
                        kic.m15264a(z2, (ui3) objM22097O2, null, false, null, tj3Var3, 0);
                        tj3 tj3Var4 = tj3Var3;
                        lw9.m16554b(str, AbstractC3584sr.m21611X(b16Var2, ((fe9) tj3Var3.m22128k(abstractC0279g)).f38952a, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var4, 0, 0, 131068);
                        tj3 tj3Var5 = tj3Var4;
                        tj3Var5.m22139q(true);
                        b16Var = b16Var2;
                        i2 = 1;
                        z = 0;
                        tj3Var3 = tj3Var5;
                    }
                    tj3Var3.m22139q(z);
                    tj3Var3.m22139q(i2);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj5;
                ek9 ek9Var = (ek9) obj4;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var3;
                if (tj3Var6.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0850ck c0850ck = new C0850ck(R$drawable.streak_play_button_bg);
                    mn3 mn3Var = mn3.f51554a;
                    AbstractC0640a.m2210a(c0850ck, null, ci8.m4734s(mn3Var), 0, new ea1(new j1a(dk9.f35752e)), tj3Var6, 32816, 8);
                    AbstractC0640a.m2210a(new gd0(bitmap), null, ci8.m4734s(mn3Var), 0, null, tj3Var6, 48, 24);
                    AbstractC0640a.m2210a(new C0850ck(R$drawable.ic_fire_no_star), vz1.m23620a0(tj3Var6, R$string.widget_today_in_progress), ci8.m4706S(mn3Var, f), 0, new ea1(new j1a(ek9Var.f37393b >= ek9Var.f37394c ? dk9.f35749b : dk9.f35748a)), tj3Var6, 32768, 8);
                } else {
                    tj3Var6.m22102U();
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C2925de(Bitmap bitmap, float f, ek9 ek9Var) {
        this.f35483c = bitmap;
        this.f35482b = f;
        this.f35484d = ek9Var;
    }

    public /* synthetic */ C2925de(List list, vi3 vi3Var, float f) {
        this.f35483c = list;
        this.f35484d = vi3Var;
        this.f35482b = f;
    }
}
