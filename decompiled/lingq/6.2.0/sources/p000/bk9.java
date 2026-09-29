package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.glance.layout.AbstractC0686a;
import androidx.glance.text.AbstractC0704a;
import com.lingq.feature.widget.R$string;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bk9 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f8644c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f8645d;

    public /* synthetic */ bk9(long j, Context context, wy5 wy5Var) {
        this.f8642a = 2;
        this.f8644c = j;
        this.f8645d = context;
        this.f8643b = wy5Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8642a;
        mn3 mn3Var = mn3.f51554a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f8643b;
        Context context = this.f8645d;
        long j = this.f8644c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                String strValueOf = String.valueOf(((fk9) obj4).f39228b);
                a63 a63Var = dk9.f35752e;
                AbstractC0704a.m2506a(strValueOf, null, new ux9(a63Var, new zx9(j), new ac3(700), 120), 0, ye1Var, 0, 10);
                AbstractC0686a.m2488d(ci8.m4717b0(mn3Var, 4.0f), ye1Var, 0);
                String string = context.getString(R$string.streak_widget_day_streak);
                string.getClass();
                AbstractC0704a.m2506a(string, null, new ux9(a63Var, new zx9(j), null, 124), 0, ye1Var, 0, 10);
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                String str = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(((fk9) obj4).f39229c)}, 1));
                a63 a63Var2 = dk9.f35752e;
                AbstractC0704a.m2506a(str, null, new ux9(a63Var2, new zx9(j), new ac3(700), 120), 0, ye1Var2, 0, 10);
                AbstractC0686a.m2488d(ci8.m4717b0(mn3Var, 4.0f), ye1Var2, 0);
                String string2 = context.getString(R$string.streak_widget_coins);
                string2.getClass();
                AbstractC0704a.m2506a(string2, null, new ux9(a63Var2, new zx9(j), null, 124), 0, ye1Var2, 0, 10);
                break;
            default:
                wy5 wy5Var = (wy5) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var3;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38956e);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
                    e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 56.0f), p58.m18901i(tj3Var).f64857c), j, ss5.f61356d);
                    gc0 gc0Var = nj0.f52812g;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    bq1.m4042R(AbstractC3423or.m18236U(ss5.m21679D(context, "ic_level_" + wy5Var.f67522c), tj3Var, 0), AbstractC3423or.m18229N(wy5Var, context), te1.m21995i(1.0f, c99.m4422o(b16Var, 48.0f), false), gc0Var, hl1.f42565b, 0.0f, null, tj3Var, 28040, 96);
                    tj3Var.m22139q(true);
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                    as4 as4Var = new as4(1.0f, true);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m3 = tj3Var.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                    lw9.m16554b(vz1.m23618Z(com.lingq.feature.reader.R$string.stats_reached_level, new Object[]{AbstractC3423or.m18229N(wy5Var, context)}, tj3Var), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131002);
                    lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.reader.R$string.stats_level_milestone_desc), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ bk9(fk9 fk9Var, long j, Context context, int i) {
        this.f8642a = i;
        this.f8643b = fk9Var;
        this.f8644c = j;
        this.f8645d = context;
    }
}
