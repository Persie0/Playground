package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.review.AbstractC2752c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fs0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39549a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f39550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39552d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f39553e;

    public /* synthetic */ fs0(float f, t17 t17Var, InterfaceC3624tu interfaceC3624tu, long j, C0282a c0282a, long j2) {
        this.f39550b = f;
        this.f39551c = t17Var;
        this.f39552d = interfaceC3624tu;
        this.f39553e = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39549a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f39553e;
        Object obj4 = this.f39552d;
        Object obj5 = this.f39551c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b6d.m3382b((e16) obj5, (String) obj4, (String) obj3, this.f39550b, (ye1) obj, pk9.m19383z(385));
                break;
            case 1:
                t17 t17Var = (t17) obj5;
                InterfaceC3624tu interfaceC3624tu = (InterfaceC3624tu) obj4;
                C0282a c0282a = (C0282a) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4409b(AbstractC3423or.m18279s0(b16Var, intrinsicSize), 0.0f, this.f39550b, 1), t17Var);
                    fc0 fc0Var = nj0.f52789H;
                    sj8 sj8VarM20003a = qj8.m20003a(interfaceC3624tu, fc0Var, tj3Var, 48);
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
                    tj3Var.m22111b0(1940381975);
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, 0.0f));
                    tj3Var.m22139q(false);
                    as4 as4Var = new as4(1.0f, true);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 54);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    c0282a.invoke(tj3Var, 0);
                    tj3Var.m22139q(true);
                    tj3Var.m22111b0(1941196407);
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, 0.0f));
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9584g((hg8) obj4, this.f39550b, (vi3) obj3, (e16) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8602r((e16) obj5, (b29) obj4, this.f39550b, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ fs0(e16 e16Var, b29 b29Var, float f, ui3 ui3Var, int i) {
        this.f39551c = e16Var;
        this.f39552d = b29Var;
        this.f39550b = f;
        this.f39553e = ui3Var;
    }

    public /* synthetic */ fs0(e16 e16Var, String str, String str2, float f, int i) {
        this.f39551c = e16Var;
        this.f39552d = str;
        this.f39553e = str2;
        this.f39550b = f;
    }

    public /* synthetic */ fs0(hg8 hg8Var, float f, vi3 vi3Var, e16 e16Var, int i) {
        this.f39552d = hg8Var;
        this.f39550b = f;
        this.f39553e = vi3Var;
        this.f39551c = e16Var;
    }
}
