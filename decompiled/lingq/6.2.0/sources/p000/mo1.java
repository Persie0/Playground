package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.reader.video.components.AbstractC2587a;
import com.lingq.feature.review.views.result.ReviewResultType;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mo1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51620a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f51622c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f51623d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f51624e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f51625f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f51626g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f51627h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f51628i;

    public /* synthetic */ mo1(wo1 wo1Var, tb7 tb7Var, String str, CoursePlaylistSort coursePlaylistSort, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, int i) {
        this.f51622c = wo1Var;
        this.f51623d = tb7Var;
        this.f51624e = str;
        this.f51625f = coursePlaylistSort;
        this.f51621b = vi3Var;
        this.f51626g = vi3Var2;
        this.f51627h = vi3Var3;
        this.f51628i = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51620a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f51627h;
        Object obj4 = this.f51628i;
        Object obj5 = this.f51626g;
        Object obj6 = this.f51621b;
        Object obj7 = this.f51625f;
        Object obj8 = this.f51624e;
        Object obj9 = this.f51623d;
        Object obj10 = this.f51622c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2253c.m9218d((wo1) obj10, (tb7) obj9, (String) obj8, (CoursePlaylistSort) obj7, (vi3) obj6, (vi3) obj5, (vi3) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(65));
                break;
            case 1:
                du7 du7Var = (du7) obj10;
                wz7 wz7Var = (wz7) obj9;
                tpa tpaVar = (tpa) obj8;
                final vi3 vi3Var = (vi3) obj6;
                final un1 un1Var = (un1) obj7;
                final t66 t66Var = (t66) obj5;
                final t66 t66Var2 = (t66) obj3;
                final t66 t66Var3 = (t66) obj4;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    e16 e16VarM23904F = wfb.m23904F(e16VarM4412e, ho5.m13397r(tj3Var).f49210f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM23904F);
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
                    boolean z = du7Var instanceof cu7;
                    int i2 = z ? ((cu7) du7Var).f34549b : 0;
                    int i3 = z ? ((cu7) du7Var).f34548a : 0;
                    int i4 = z ? ((cu7) du7Var).f34550c : 0;
                    int i5 = i3 > 0 ? i2 - 1 : 0;
                    boolean z2 = wz7Var.f67572i;
                    boolean z3 = tpaVar.f62712g;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new fl4(vi3Var, 1);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O;
                    boolean zM22120g2 = tj3Var.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fl4(vi3Var, 2);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O2;
                    boolean zM22124i = tj3Var.m22124i(un1Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22124i || objM22097O3 == p84Var) {
                        final int i6 = 0;
                        objM22097O3 = new ui3() { // from class: dl4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i7 = i6;
                                xfa xfaVar2 = xfa.f68157a;
                                t66 t66Var4 = t66Var3;
                                t66 t66Var5 = t66Var2;
                                t66 t66Var6 = t66Var;
                                un1 un1Var2 = un1Var;
                                vi3 vi3Var2 = vi3Var;
                                switch (i7) {
                                    case 0:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(hra.f42848a);
                                        break;
                                    case 1:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(fra.f39534a);
                                        break;
                                    default:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(bra.f8903a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O3;
                    boolean zM22124i2 = tj3Var.m22124i(un1Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O4 == p84Var) {
                        final int i7 = 1;
                        objM22097O4 = new ui3() { // from class: dl4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i8 = i7;
                                xfa xfaVar2 = xfa.f68157a;
                                t66 t66Var4 = t66Var3;
                                t66 t66Var5 = t66Var2;
                                t66 t66Var6 = t66Var;
                                un1 un1Var2 = un1Var;
                                vi3 vi3Var2 = vi3Var;
                                switch (i8) {
                                    case 0:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(hra.f42848a);
                                        break;
                                    case 1:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(fra.f39534a);
                                        break;
                                    default:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(bra.f8903a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var5 = (ui3) objM22097O4;
                    boolean zM22124i3 = tj3Var.m22124i(un1Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O5 = tj3Var.m22097O();
                    if (zM22124i3 || objM22097O5 == p84Var) {
                        final int i8 = 0;
                        objM22097O5 = new vi3() { // from class: el4
                            @Override // p000.vi3
                            public final Object invoke(Object obj11) {
                                int i9 = i8;
                                xfa xfaVar2 = xfa.f68157a;
                                t66 t66Var4 = t66Var3;
                                t66 t66Var5 = t66Var2;
                                t66 t66Var6 = t66Var;
                                un1 un1Var2 = un1Var;
                                vi3 vi3Var2 = vi3Var;
                                int iIntValue2 = ((Integer) obj11).intValue();
                                switch (i9) {
                                    case 0:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(new zqa(iIntValue2 + 1));
                                        break;
                                    default:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var2.invoke(new ara(iIntValue2 + 1));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O5;
                    boolean zM22124i4 = tj3Var.m22124i(un1Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O6 = tj3Var.m22097O();
                    if (zM22124i4 || objM22097O6 == p84Var) {
                        final int i9 = 1;
                        objM22097O6 = new vi3() { // from class: el4
                            @Override // p000.vi3
                            public final Object invoke(Object obj11) {
                                int i10 = i9;
                                xfa xfaVar2 = xfa.f68157a;
                                t66 t66Var4 = t66Var3;
                                t66 t66Var5 = t66Var2;
                                t66 t66Var6 = t66Var;
                                un1 un1Var2 = un1Var;
                                vi3 vi3Var3 = vi3Var;
                                int iIntValue2 = ((Integer) obj11).intValue();
                                switch (i10) {
                                    case 0:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var3.invoke(new zqa(iIntValue2 + 1));
                                        break;
                                    default:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var3.invoke(new ara(iIntValue2 + 1));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O6;
                    boolean zM22124i5 = tj3Var.m22124i(un1Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O7 = tj3Var.m22097O();
                    if (zM22124i5 || objM22097O7 == p84Var) {
                        final int i10 = 2;
                        objM22097O7 = new ui3() { // from class: dl4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i11 = i10;
                                xfa xfaVar2 = xfa.f68157a;
                                t66 t66Var4 = t66Var3;
                                t66 t66Var5 = t66Var2;
                                t66 t66Var6 = t66Var;
                                un1 un1Var2 = un1Var;
                                vi3 vi3Var4 = vi3Var;
                                switch (i11) {
                                    case 0:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var4.invoke(hra.f42848a);
                                        break;
                                    case 1:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var4.invoke(fra.f39534a);
                                        break;
                                    default:
                                        AbstractC2587a.m9514b(un1Var2, t66Var6, t66Var5, t66Var4);
                                        vi3Var4.invoke(bra.f8903a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O7);
                    }
                    xkc.m24603a(i5, i3, i4, i3, z2, z3, true, ui3Var2, ui3Var3, ui3Var4, ui3Var5, vi3Var2, vi3Var3, (ui3) objM22097O7, null, tj3Var, 1572864, 16384);
                    tj3Var.m22139q(true);
                }
                break;
            case 2:
                ui3 ui3Var6 = (ui3) obj4;
                ui3 ui3Var7 = (ui3) obj10;
                t66 t66Var4 = (t66) obj9;
                vi3 vi3Var4 = (vi3) obj6;
                t66 t66Var5 = (t66) obj8;
                Milestone milestone = (Milestone) obj7;
                Context context = (Context) obj5;
                t66 t66Var6 = (t66) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM14092f = AbstractC3122is.m14092f(b16Var, null, 3);
                    ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM14092f);
                    se1.f60731q.getClass();
                    ui3 ui3Var8 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var8);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    if (((Boolean) t66Var4.getValue()).booleanValue()) {
                        tj3Var2.m22111b0(233447023);
                        tcd.m21954a(null, null, false, ui3Var6, ci8.m4703P(110531424, new xy0(vi3Var4, t66Var5, milestone, context, t66Var6), tj3Var2), tj3Var2, 24576);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(237935885);
                        String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.quickstart_congratulations);
                        p04 p04VarM19521q = pvc.m19521q();
                        C0282a c0282aM4703P = ci8.m4703P(-976952416, new dz5(context, milestone), tj3Var2);
                        boolean zM22120g3 = tj3Var2.m22120g(ui3Var7);
                        Object objM22097O8 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O8 == p84Var) {
                            objM22097O8 = new wy1(2, ui3Var7, t66Var4);
                            tj3Var2.m22131l0(objM22097O8);
                        }
                        l4d.m15801a(null, strM23620a0, c0282aM4703P, p04VarM19521q, false, false, (ui3) objM22097O8, ci8.m4703P(1420541563, new dz5(1, context, milestone), tj3Var2), tj3Var2, 12583296, 49);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                }
                break;
            default:
                InterfaceC0067f interfaceC0067f = (InterfaceC0067f) obj10;
                Context context2 = (Context) obj9;
                String str = (String) obj8;
                ReviewResultType reviewResultType = (ReviewResultType) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                ui3 ui3Var9 = (ui3) obj4;
                ui3 ui3Var10 = (ui3) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    WeakHashMap weakHashMap2 = l6b.f49204w;
                    e16 e16VarM4429v = c99.m4429v(c99.m4410c(AbstractC3584sr.m21607T(wfb.m23904F(b16Var, ho5.m13397r(tj3Var3).f49211g), ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e), 0.9f));
                    ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4429v);
                    se1.f60731q.getClass();
                    ui3 ui3Var11 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var11);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d3);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                    e16 e16VarM18559e = ox1.m18559e(c99.m4429v(b16Var));
                    vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.5f, 1);
                    fda fdaVarM21703b0 = ss5.m21703b0(400, 60, null, 4);
                    Object objM22097O9 = tj3Var3.m22097O();
                    if (objM22097O9 == p84Var) {
                        objM22097O9 = new qv7(14);
                        tj3Var3.m22131l0(objM22097O9);
                    }
                    e16 e16VarMo764a = interfaceC0067f.mo764a(e16VarM18559e, vs2VarM772g.m23531a(AbstractC0070i.m777l(fdaVarM21703b0, (vi3) objM22097O9)), AbstractC0070i.m773h(null, 3));
                    vh9 vh9Var = ps5.f56764b;
                    bq1.m4039O(d32.m10007D(e16VarMo764a, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55872p, ((ms5) tj3Var3.m22128k(vh9Var)).f51801c.f64859e), null, null, te1.m22003q(63, 0.0f), null, ci8.m4703P(-1591984084, new sg8(context2, str, reviewResultType, str2, str3, ui3Var9, ui3Var10, 1), tj3Var3), tj3Var3, 196608, 22);
                    tj3Var3.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ mo1(ui3 ui3Var, ui3 ui3Var2, t66 t66Var, vi3 vi3Var, t66 t66Var2, Milestone milestone, Context context, t66 t66Var3) {
        this.f51628i = ui3Var;
        this.f51622c = ui3Var2;
        this.f51623d = t66Var;
        this.f51621b = vi3Var;
        this.f51624e = t66Var2;
        this.f51625f = milestone;
        this.f51626g = context;
        this.f51627h = t66Var3;
    }

    public /* synthetic */ mo1(du7 du7Var, wz7 wz7Var, tpa tpaVar, vi3 vi3Var, un1 un1Var, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f51622c = du7Var;
        this.f51623d = wz7Var;
        this.f51624e = tpaVar;
        this.f51621b = vi3Var;
        this.f51625f = un1Var;
        this.f51626g = t66Var;
        this.f51627h = t66Var2;
        this.f51628i = t66Var3;
    }

    public /* synthetic */ mo1(InterfaceC0067f interfaceC0067f, Context context, String str, ReviewResultType reviewResultType, String str2, String str3, ui3 ui3Var, ui3 ui3Var2) {
        this.f51622c = interfaceC0067f;
        this.f51623d = context;
        this.f51624e = str;
        this.f51625f = reviewResultType;
        this.f51621b = str2;
        this.f51626g = str3;
        this.f51628i = ui3Var;
        this.f51627h = ui3Var2;
    }
}
