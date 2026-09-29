package p000;

import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ty0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63083a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f63084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f63085c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f63086d;

    public /* synthetic */ ty0(String str, boolean z, boolean z2) {
        this.f63084b = z;
        this.f63085c = z2;
        this.f63086d = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        p04 p04VarM17721b;
        long jM4215h;
        int i = this.f63083a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f63085c;
        boolean z2 = this.f63084b;
        Serializable serializable = this.f63086d;
        switch (i) {
            case 0:
                String str = (String) serializable;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    if (z2) {
                        p04VarM17721b = j7d.f45175a;
                        if (p04VarM17721b == null) {
                            o04 o04Var = new o04("Outlined.ThumbUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = soa.f61116a;
                            pd9 pd9Var = new pd9(aa1.f403b);
                            f57 f57Var = new f57();
                            f57Var.m11553h(9.0f, 21.0f);
                            f57Var.m11550e(9.0f);
                            f57Var.m11548c(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
                            f57Var.m11552g(3.02f, -7.05f);
                            f57Var.m11548c(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
                            f57Var.m11557l(-2.0f);
                            f57Var.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            f57Var.m11550e(-6.31f);
                            f57Var.m11552g(0.95f, -4.57f);
                            f57Var.m11552g(0.03f, -0.32f);
                            f57Var.m11548c(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
                            f57Var.m11551f(14.17f, 1.0f);
                            f57Var.m11551f(7.58f, 7.59f);
                            f57Var.m11547b(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
                            f57Var.m11557l(10.0f);
                            f57Var.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            f57Var.m11546a();
                            f57Var.m11553h(9.0f, 9.0f);
                            f57Var.m11552g(4.34f, -4.34f);
                            f57Var.m11551f(12.0f, 10.0f);
                            f57Var.m11550e(9.0f);
                            f57Var.m11557l(2.0f);
                            f57Var.m11552g(-3.0f, 7.0f);
                            f57Var.m11549d(9.0f);
                            f57Var.m11556k(9.0f);
                            f57Var.m11546a();
                            f57Var.m11553h(1.0f, 9.0f);
                            f57Var.m11550e(4.0f);
                            f57Var.m11557l(12.0f);
                            f57Var.m11549d(1.0f);
                            f57Var.m11546a();
                            o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                            p04VarM17721b = o04Var.m17721b();
                            j7d.f45175a = p04VarM17721b;
                        }
                        tj3Var = tj3Var;
                    } else {
                        p04 p04VarM17721b2 = h7d.f41926b;
                        if (p04VarM17721b2 == null) {
                            o04 o04Var2 = new o04("Outlined.ThumbDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = soa.f61116a;
                            pd9 pd9Var2 = new pd9(aa1.f403b);
                            f57 f57Var2 = new f57();
                            f57Var2.m11553h(15.0f, 3.0f);
                            f57Var2.m11551f(6.0f, 3.0f);
                            f57Var2.m11548c(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
                            f57Var2.m11552g(-3.02f, 7.05f);
                            f57Var2.m11548c(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
                            f57Var2.m11557l(2.0f);
                            f57Var2.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            f57Var2.m11550e(6.31f);
                            f57Var2.m11552g(-0.95f, 4.57f);
                            f57Var2.m11552g(-0.03f, 0.32f);
                            f57Var2.m11548c(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
                            f57Var2.m11551f(9.83f, 23.0f);
                            f57Var2.m11552g(6.59f, -6.59f);
                            f57Var2.m11548c(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f);
                            f57Var2.m11551f(17.0f, 5.0f);
                            f57Var2.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            f57Var2.m11546a();
                            f57Var2.m11553h(15.0f, 15.0f);
                            f57Var2.m11552g(-4.34f, 4.34f);
                            f57Var2.m11551f(12.0f, 14.0f);
                            f57Var2.m11551f(3.0f, 14.0f);
                            f57Var2.m11557l(-2.0f);
                            f57Var2.m11552g(3.0f, -7.0f);
                            f57Var2.m11550e(9.0f);
                            f57Var2.m11557l(10.0f);
                            f57Var2.m11546a();
                            f57Var2.m11553h(19.0f, 3.0f);
                            f57Var2.m11550e(4.0f);
                            f57Var2.m11557l(12.0f);
                            f57Var2.m11550e(-4.0f);
                            f57Var2.m11546a();
                            o04.m17720a(o04Var2, f57Var2.f38440a, pd9Var2);
                            p04VarM17721b2 = o04Var2.m17721b();
                            h7d.f41926b = p04VarM17721b2;
                        }
                        p04VarM17721b = p04VarM17721b2;
                    }
                    p04 p04Var = p04VarM17721b;
                    if (!z) {
                        tj3Var.m22111b0(1333565920);
                        jM4215h = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55875s;
                        tj3Var.m22139q(false);
                    } else if (z2) {
                        tj3Var.m22111b0(1333568373);
                        jM4215h = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1333570419);
                        jM4215h = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4215h();
                        tj3Var.m22139q(false);
                    }
                    ty3.m22351a(p04Var, str, c99.m4422o(b16.f7762a, 18.0f), jM4215h, tj3Var, 384, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2868d.m9784e((ArrayList) serializable, z2, z, (ye1) obj, pk9.m19383z(49));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ty0(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.f63086d = arrayList;
        this.f63084b = z;
        this.f63085c = z2;
    }
}
