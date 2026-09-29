package p000;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.AbstractC0640a;
import androidx.glance.appwidget.lazy.AbstractC0665a;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.C1979f;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.dictionary.C2066j;
import com.lingq.feature.edit.AbstractC2076b;
import com.lingq.feature.edit.C2077c;
import com.lingq.feature.karaoke.AbstractC2117b;
import com.lingq.feature.karaoke.C2118c;
import com.lingq.feature.language.AbstractC2119a;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.more.C2160a;
import com.lingq.feature.onboarding.auth.login.magiclink.AbstractC2185b;
import com.lingq.feature.onboarding.auth.login.magiclink.C2186c;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.stats.C2532g;
import com.lingq.feature.search.fastsearch.C2768b;
import java.util.WeakHashMap;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.cy4;
import p000.dtb;
import p000.omd;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rw1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59897c;

    public /* synthetic */ rw1(vi3 vi3Var, ra4 ra4Var) {
        this.f59895a = 15;
        this.f59897c = vi3Var;
        this.f59896b = ra4Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.f59895a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59897c;
        Object obj4 = this.f59896b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8826i((C1979f) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x9d.m24419b((e16) obj4, (vw1) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((v52) obj4).m23123a((C3329mb) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                u82.m22532a((nt9) obj4, (ct9) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8976l((DictionaryLocale) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                Context context = (Context) obj4;
                DictionaryLocale dictionaryLocale = (DictionaryLocale) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(AbstractC3352my.m17093L(context, dictionaryLocale.f19021a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8971g((ui3) obj4, (C2066j) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                float fFloatValue = ((Float) obj).floatValue();
                ((C0809bg) obj4).m3692a(fFloatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).f47715a = fFloatValue;
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2185b.m9115a((C2186c) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vcd.m23230a((yz2) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                C2768b c2768b = (C2768b) obj4;
                String str = (String) obj;
                str.getClass();
                c2768b.mo8951f0(c2768b.f32878b.mo4589b2(), ((y03) ((z03) obj3)).f69047a.f19426a, str, (String) obj2);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ddd.m10304a((d03) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ls3.m16524b((ms3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                h04 h04Var = (h04) obj4;
                on3 on3Var = (on3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    Bitmap bitmap = h04Var.f41608d;
                    AbstractC0640a.m2210a(bitmap != null ? new gd0(bitmap) : new C0850ck(R$drawable.ic_playlist_icon), null, ci8.m4706S(l70.m15951n(on3Var, 12.0f), 68.0f), 0, null, tj3Var2, 48, 16);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                igd.m13903b((C2160a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                vi3 vi3Var = (vi3) obj3;
                ra4 ra4Var = (ra4) obj4;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4411d, ((fe9) tj3Var3.m22128k(zf1Var)).f38960i);
                    ec0 ec0Var = nj0.f52792K;
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38958g, true, new gm5(28));
                    boolean zM22120g = tj3Var3.m22120g(vi3Var) | tj3Var3.m22124i(ra4Var);
                    Object objM22097O = tj3Var3.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new ke2(8, vi3Var, ra4Var);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM21607T, null, null, c3661uu, ec0Var, null, false, null, (vi3) objM22097O, tj3Var3, 196608, 462);
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC2117b.m9026f((e16) obj4, (u45) obj3, (ye1) obj, pk9.m19383z(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC2117b.m9023c((C2118c) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC2119a.m9037b((LanguageToLearn) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                bid.m3748d((jo4) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                cid.m4751b((e16) obj4, (z41) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                cid.m4757h((dt0) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC0665a.m2256a((on3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                b32 b32Var = (b32) obj4;
                vi3 vi3Var2 = (vi3) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    tj3Var4.m22111b0(936733015);
                    e16 e16VarM10007D = d32.m10007D(c99.m4430w(b16Var, null, 3), d32.m10035e(285212672), ss5.f61356d);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m = tj3Var4.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM10007D);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                    boolean zM22120g2 = tj3Var4.m22120g(vi3Var2);
                    Object objM22097O2 = tj3Var4.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fl4(vi3Var2, 10);
                        tj3Var4.m22131l0(objM22097O2);
                    }
                    ss5.m21708e(1572864, 30, null, tj3Var4, (ui3) objM22097O2, ci8.m4703P(-817029295, new se0(b32Var, 17), tj3Var4), e16VarM21609V, null, null, false);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var4, pvc.m19502J(ho5.m13397r(tj3Var4).f49211g));
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(false);
                }
                break;
            case 24:
                rv2 rv2Var = (rv2) obj4;
                final cy4 cy4Var = (cy4) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i2 = 1;
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    AbstractC0218a.m1121a(dtb.f36221a, null, ci8.m4703P(547612299, new zi3() { // from class: com.lingq.feature.reader.stats.i
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            ye1 ye1Var6 = (ye1) obj5;
                            int iIntValue6 = ((Integer) obj6).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                cy4 cy4Var2 = cy4Var;
                                boolean zM22124i = tj3Var6.m22124i(cy4Var2);
                                Object objM22097O3 = tj3Var6.m22097O();
                                if (zM22124i || objM22097O3 == we1.f66679a) {
                                    LessonCompleteScreenKt$LessonCompleteScreen$1$1$1$1 lessonCompleteScreenKt$LessonCompleteScreen$1$1$1$1 = new LessonCompleteScreenKt$LessonCompleteScreen$1$1$1$1(0, cy4Var2, cy4.class, "onBack", "onBack()V", 0);
                                    tj3Var6.m22131l0(lessonCompleteScreenKt$LessonCompleteScreen$1$1$1$1);
                                    objM22097O3 = lessonCompleteScreenKt$LessonCompleteScreen$1$1$1$1;
                                }
                                omd.m18141c((ui3) ((FunctionReference) objM22097O3), null, false, null, null, dtb.f36222b, tj3Var6, 1572864, 62);
                            } else {
                                tj3Var6.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var5), ci8.m4703P(1632508980, new C2532g(cy4Var, i2), tj3Var5), 0.0f, null, h7a.m13119f(tj3Var5), rv2Var, null, tj3Var5, 3462, 306);
                }
                break;
            case 25:
                s65 s65Var = (s65) obj4;
                final cy4 cy4Var2 = (cy4) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    b16 b16Var2 = b16.f7762a;
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var6).f38957f);
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var2 = nj0.f52791J;
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var2, tj3Var6, 0);
                    int iHashCode2 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m2 = tj3Var6.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var6, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var6, zi3Var, bb1VarM230a2);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var6, zi3Var2, l77VarM22132m2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var6, zi3Var3, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var6, vi3Var3);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var6, zi3Var4, e16VarM1322c2);
                    fc0 fc0Var = nj0.f52789H;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var2, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var6).f38956e, 7);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var6, 48);
                    int iHashCode3 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m3 = tj3Var6.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var6, e16VarM21611X);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var6, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var6, zi3Var3, tj3Var6, vi3Var3);
                    oha.m18001g(tj3Var6, zi3Var4, e16VarM1322c3);
                    bq1.m4042R(AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_lesson_stats, tj3Var6, 0), null, wq1.m24108d(tj3Var6, b16Var2, 24.0f), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var6).f55873q), tj3Var6, 56, 56);
                    thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ge9.m12515a(tj3Var6).f38952a));
                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var2, tj3Var6, 0);
                    int iHashCode4 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m4 = tj3Var6.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var6, b16Var2);
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, zi3Var, bb1VarM230a3);
                    oha.m18001g(tj3Var6, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var6, zi3Var3, tj3Var6, vi3Var3);
                    oha.m18001g(tj3Var6, zi3Var4, e16VarM1322c4);
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.complete_lesson_stats_title), null, p58.m18900f(tj3Var6).f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71404h, tj3Var6, 1572864, 0, 131002);
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.complete_lesson_stats_description), null, p58.m18900f(tj3Var6).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71408l, tj3Var6, 0, 0, 131066);
                    tj3Var6.m22139q(true);
                    tj3Var6.m22139q(true);
                    boolean zM22124i = tj3Var6.m22124i(cy4Var2);
                    Object objM22097O3 = tj3Var6.m22097O();
                    if (zM22124i || objM22097O3 == p84Var) {
                        final int i3 = 0;
                        objM22097O3 = new vi3() { // from class: jz4
                            @Override // p000.vi3
                            public final Object invoke(Object obj5) {
                                int i4 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                cy4 cy4Var3 = cy4Var2;
                                double dDoubleValue = ((Double) obj5).doubleValue();
                                switch (i4) {
                                    case 0:
                                        cy4Var3.mo9440f(dDoubleValue, "Listen");
                                        break;
                                    default:
                                        cy4Var3.mo9440f(dDoubleValue, "Read");
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O3);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O3;
                    boolean zM22124i2 = tj3Var6.m22124i(cy4Var2);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22124i2 || objM22097O4 == p84Var) {
                        z = true;
                        final char c = 1 == true ? 1 : 0;
                        objM22097O4 = new vi3() { // from class: jz4
                            @Override // p000.vi3
                            public final Object invoke(Object obj5) {
                                int i4 = c;
                                xfa xfaVar2 = xfa.f68157a;
                                cy4 cy4Var3 = cy4Var2;
                                double dDoubleValue = ((Double) obj5).doubleValue();
                                switch (i4) {
                                    case 0:
                                        cy4Var3.mo9440f(dDoubleValue, "Listen");
                                        break;
                                    default:
                                        cy4Var3.mo9440f(dDoubleValue, "Read");
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O4);
                    } else {
                        z = true;
                    }
                    ljd.m16308a(s65Var, vi3Var4, (vi3) objM22097O4, tj3Var6, 0, 0);
                    tj3Var6.m22139q(z);
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC2076b.m8984a((vi3) obj3, (C2077c) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC2131b.m9042a((g35) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                hjd.m13302a((LessonProcessingStatus) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                String str2 = (String) obj4;
                he9 he9Var = (he9) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    C3419on c3419onM21186e = s9d.m21186e(str2, he9Var);
                    vx9 vx9Var = ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71406j;
                    zf1 zf1Var2 = ge9.f40637a;
                    lw9.m16555c(c3419onM21186e, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var7.m22128k(zf1Var2)).f38956e, ((fe9) tj3Var7.m22128k(zf1Var2)).f38952a), 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, vx9Var, tj3Var7, 0, 0, 261116);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rw1(int i, Object obj, Object obj2) {
        this.f59895a = i;
        this.f59896b = obj;
        this.f59897c = obj2;
    }

    public /* synthetic */ rw1(vi3 vi3Var, C2077c c2077c, int i) {
        this.f59895a = 26;
        this.f59897c = vi3Var;
        this.f59896b = c2077c;
    }

    public /* synthetic */ rw1(Object obj, int i, int i2, Object obj2) {
        this.f59895a = i2;
        this.f59896b = obj;
        this.f59897c = obj2;
    }
}
