package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.edit.R$string;
import com.lingq.feature.edit.components.AbstractC2078a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw8 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56911a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3849zx f56912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f56913c;

    public /* synthetic */ pw8(C3849zx c3849zx, vi3 vi3Var) {
        this.f56912b = c3849zx;
        this.f56913c = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.f56911a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        vi3 vi3Var = this.f56913c;
        C3849zx c3849zx = this.f56912b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    fc0 fc0Var = nj0.f52789H;
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var, 54);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    e2d.m10812a(vz1.m23620a0(tj3Var, R$string.lesson_edit_audio), tj3Var, 0);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new nc8(vi3Var, 21);
                        tj3Var.m22131l0(objM22097O);
                    }
                    omd.m18141c((ui3) objM22097O, null, false, null, null, ci8.m4703P(-461402998, new ht6(c3849zx, 24), tj3Var), tj3Var, 1572864, 62);
                    long j = (long) ((c3849zx.f72327a * 1000.0d) + c3849zx.f72330d);
                    if (j == 0) {
                        str = "00:00:00";
                    } else {
                        long j2 = j / 1000;
                        str = String.format(Locale.getDefault(), "%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60), Long.valueOf((j / 10) % 100)}, 3));
                    }
                    lw9.m16554b(str, c99.m4428u(b16Var, 56.0f, 0.0f, 2), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, 48, 0, 131068);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC2078a.m8991b(c3849zx, vi3Var, null, tj3Var2, 0);
                    thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f));
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ pw8(vi3 vi3Var, C3849zx c3849zx) {
        this.f56913c = vi3Var;
        this.f56912b = c3849zx;
    }
}
