package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.p012ui.ImageSize;
import com.lingq.core.p012ui.R$plurals;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ly0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f50291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f50292c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f50293d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f50294e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f50295f;

    public /* synthetic */ ly0(Object obj, int i, Object obj2, Object obj3, t66 t66Var, int i2) {
        this.f50290a = i2;
        this.f50293d = obj;
        this.f50291b = i;
        this.f50294e = obj2;
        this.f50295f = obj3;
        this.f50292c = t66Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f50290a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        Object obj4 = this.f50295f;
        Object obj5 = this.f50294e;
        int i2 = this.f50291b;
        Object obj6 = this.f50293d;
        switch (i) {
            case 0:
                jv0 jv0Var = (jv0) obj6;
                ChatMessage chatMessage = (ChatMessage) obj5;
                jw0 jw0Var = (jw0) obj4;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                boolean zM22124i = tj3Var.m22124i(jv0Var) | tj3Var.m22116e(i2) | tj3Var.m22124i(chatMessage);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    objM22097O = new by0(jv0Var, i2, chatMessage, 0);
                    tj3Var.m22131l0(objM22097O);
                }
                omd.m18141c((ui3) objM22097O, c99.m4422o(b16.f7762a, 18.0f), false, null, null, ci8.m4703P(651256403, new C3598t4(10, jw0Var, this.f50292c), tj3Var), tj3Var, 1572912, 60);
                break;
            default:
                pq8 pq8Var = (pq8) obj6;
                vi3 vi3Var = (vi3) obj5;
                vi3 vi3Var2 = (vi3) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    float f = ge9.m12515a(tj3Var2).f38956e;
                    float f2 = ge9.m12515a(tj3Var2).f38956e;
                    float f3 = ge9.m12515a(tj3Var2).f38955d;
                    float f4 = ge9.m12515a(tj3Var2).f38952a;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21610W = AbstractC3584sr.m21610W(b16Var, f, f2, f3, f4);
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var = nj0.f52791J;
                    bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21610W);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var3);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var2).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var2, 0);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var3);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                    LibraryItem libraryItem = pq8Var.f56682a;
                    LibraryItemCounter libraryItemCounter = pq8Var.f56683b;
                    String strM14422e = jfa.m14422e(libraryItem.f19409J, libraryItem.f19436h, ImageSize.Medium);
                    String str = libraryItem.f19433e;
                    ss5.m21702b(strM14422e, str, pb1.m19045o(c99.m4422o(b16Var, 92.0f), p58.m18901i(tj3Var2).f64857c), null, hl1.f42564a, tj3Var2, 1572864, 4024);
                    as4 as4Var = new as4(1.0f, true);
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
                    int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m3 = tj3Var2.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a2);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var3);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                    lw9.m16554b(str == null ? "" : str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, p58.m18902j(tj3Var2).f71405i, tj3Var2, 0, 24960, 110590);
                    lw9.m16554b(vz1.m23612R(R$plurals.lingq_lessons_count_Lessons, i2, new Object[]{Integer.valueOf(i2)}, tj3Var2), null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71408l, tj3Var2, 0, 0, 131066);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var2).f38955d, 0.0f, 0.0f, 13);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var2).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                    int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m4 = tj3Var2.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var3);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
                    czc.m9947c(libraryItemCounter != null ? libraryItemCounter.f19464j : 0, cx2.m9917a(tj3Var2).m4209b(), tj3Var2, 0);
                    czc.m9947c(libraryItemCounter != null ? libraryItemCounter.f19466l : 0, cx2.m9917a(tj3Var2).m4212e(), tj3Var2, 0);
                    lw9.m16554b(ux5.m22989l("· ", (int) libraryItem.f19416Q, "%"), null, cx2.m9917a(tj3Var2).m4215h(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71408l, tj3Var2, 0, 0, 131066);
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(true);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m5 = tj3Var2.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var3);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
                    Object objM22097O2 = tj3Var2.m22097O();
                    t66 t66Var = this.f50292c;
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new un7(7, t66Var);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38954c, 0.0f, 11);
                    vf0 vf0VarM4714a = ci8.m4714a(1.0f, p58.m18900f(tj3Var2).f55816A);
                    omd.m18141c((ui3) objM22097O2, c99.m4422o(r46.m20388n(e16VarM21611X2, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, ui8.f63972a), 24.0f), false, null, null, nkc.f52897a, tj3Var2, 1572870, 60);
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var2.m22111b0(-573830890);
                        String str2 = str == null ? "" : str;
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new un7(8, t66Var);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        ui3 ui3Var2 = (ui3) objM22097O3;
                        do1 do1Var = new do1((libraryItemCounter != null && libraryItemCounter.f19456b) || fa4.m11650l(libraryItem.f19451w, Boolean.TRUE), fa4.m11650l(libraryItem.f19418S, Boolean.TRUE), true, false, false, false, false);
                        boolean zM22120g = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(pq8Var) | tj3Var2.m22120g(vi3Var2);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O4 == p84Var) {
                            C3445p2 c3445p2 = new C3445p2(vi3Var, (Object) pq8Var, vi3Var2, t66Var, 17);
                            tj3Var2.m22131l0(c3445p2);
                            objM22097O4 = c3445p2;
                        }
                        m9d.m16704a(str2, ui3Var2, do1Var, (vi3) objM22097O4, tj3Var2, 48);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-571941564);
                        tj3Var2.m22139q(false);
                    }
                    AbstractC3393o1.m17723A(tj3Var2, true, true, true);
                }
                break;
        }
        return xfaVar;
    }
}
