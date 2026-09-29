package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonWord;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vf2 {

    /* JADX INFO: renamed from: a */
    public static final Map f65303a = AbstractC3194a.m15365R(new Pair("en", "Hello"), new Pair("de", "Hallo"), new Pair("fr", "Bonjour"), new Pair("es", "Hola"), new Pair("it", "Ciao"), new Pair("pt", "Olá"), new Pair("nl", "Hallo"), new Pair("ja", "こんにちは"), new Pair("ko", "안녕하세요"), new Pair("zh", "你好"), new Pair("ru", "Привет"), new Pair("pl", "Cześć"), new Pair("tr", "Merhaba"), new Pair("uk", "Привіт"), new Pair("el", "Γεια"), new Pair("lt", "Labas"));

    /* JADX INFO: renamed from: a */
    public static final void m23259a(String str, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(616989974);
        int i3 = (tj3Var.m22120g(str) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var, d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), p58.m18901i(tj3Var).f64857c), p58.m18900f(tj3Var).f55874r, ss5.f61356d), 15), ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (str.length() > 0) {
                tj3Var.m22111b0(-227339547);
                float f = 1.0f;
                bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str), tj3Var, 0), null, pb1.m19045o(c99.m4422o(b16Var, 40.0f), ui8.f63972a), null, null, 0.0f, null, tj3Var, 56, 120);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                String strM17093L = AbstractC3352my.m17093L(context, str);
                vx9 vx9Var = p58.m18902j(tj3Var).f71406j;
                bc3 bc3Var = bc3.f8322h;
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                i2 = 0;
                lw9.m16554b(strM17093L, new as4(f, true), 0L, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131004);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                i2 = 0;
                float f2 = 1.0f;
                tj3Var.m22111b0(-226732722);
                thb.m22044c(tj3Var, c99.m4422o(b16Var, 40.0f));
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_dictionary_dropdown_placeholder);
                vx9 vx9Var2 = p58.m18902j(tj3Var).f71406j;
                long j = p58.m18900f(tj3Var).f55875s;
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                lw9.m16554b(strM23620a0, new as4(f2, true), j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var2, tj3Var, 0, 0, 131064);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            ty3.m22351a(ehd.m11157a(), null, null, p58.m18900f(tj3Var).f55875s, tj3Var, 48, 4);
            tj3Var.m22139q(true);
        } else {
            i2 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tf2(str, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23260b(List list, String str, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var2;
        String str2 = str;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1021065287);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i4 = i2;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_dictionary_picker_title), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38956e, 7), p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7);
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38963l, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(context) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                str2 = str;
                vi3Var2 = vi3Var;
                objM22097O = new C3445p2(list, context, str2, vi3Var2);
                tj3Var.m22131l0(objM22097O);
            } else {
                str2 = str;
                vi3Var2 = vi3Var;
            }
            fa4.m11642c(e16VarM4411d, null, x17VarM21626g, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 6, 490);
            tj3Var.m22139q(true);
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(list, str2, vi3Var2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m23261c(final String str, final String str2, final List list, final wf2 wf2Var, final boolean z, final ui3 ui3Var, final vi3 vi3Var, final boolean z2, final ui3 ui3Var2, e16 e16Var, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        final e16 e16Var2;
        str.getClass();
        str2.getClass();
        list.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1894635860);
        int i2 = 805306368 | i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22120g(str2) ? 32 : 16) | (tj3Var2.m22124i(list) ? 256 : 128) | (tj3Var2.m22124i(wf2Var) ? 2048 : 1024) | (tj3Var2.m22122h(z) ? 16384 : 8192) | (tj3Var2.m22124i(ui3Var) ? 131072 : 65536) | (tj3Var2.m22124i(vi3Var) ? 1048576 : 524288) | (tj3Var2.m22122h(z2) ? 8388608 : 4194304) | (tj3Var2.m22124i(ui3Var2) ? 67108864 : 33554432);
        if (tj3Var2.m22099R(i2 & 1, (306783379 & i2) != 306783378)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var2.m22120g(list) | ((i2 & 14) == 4) | tj3Var2.m22120g(context);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!fa4.m11650l(((DictionaryLocale) obj).f19021a, str)) {
                        arrayList.add(obj);
                    }
                }
                objM22097O = u91.m22614f1(arrayList, new C2993f9(context, 2));
                tj3Var2.m22131l0(objM22097O);
            }
            List list2 = (List) objM22097O;
            if (z) {
                tj3Var2.m22111b0(1364145663);
                m23260b(list2, str2, vi3Var, tj3Var2, (i2 & 112) | ((i2 >> 12) & 896) | 3072);
                tj3Var2.m22139q(false);
                x18 x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3(str, str2, list, wf2Var, z, ui3Var, vi3Var, z2, ui3Var2, i) { // from class: rf2

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ String f59191a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ String f59192b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ List f59193c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ wf2 f59194d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ boolean f59195e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ ui3 f59196f;

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ vi3 f59197g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ boolean f59198h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ ui3 f59199i;

                        @Override // p000.zi3
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iM19383z = pk9.m19383z(1);
                            vf2.m23261c(this.f59191a, this.f59192b, this.f59193c, this.f59194d, this.f59195e, this.f59196f, this.f59197g, this.f59198h, this.f59199i, b16.f7762a, (ye1) obj2, iM19383z);
                            return xfa.f68157a;
                        }
                    };
                    return;
                }
                return;
            }
            tj3Var2.m22111b0(1364383030);
            tj3Var2.m22139q(false);
            b16 b16Var = b16.f7762a;
            tj3Var = tj3Var2;
            gxb.m12966b(vz1.m23620a0(tj3Var2, R$string.onboarding_v2_dictionary_language_title), z2, vz1.m23620a0(tj3Var2, com.lingq.core.p012ui.R$string.ui_continue), ui3Var2, b16Var, null, ci8.m4703P(535206906, new C3357n2(str2, ui3Var, str, wf2Var, 6, false), tj3Var2), tj3Var, ((i2 >> 18) & 112) | 1572864 | ((i2 >> 15) & 7168) | 24576, 32);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new zi3(str, str2, list, wf2Var, z, ui3Var, vi3Var, z2, ui3Var2, e16Var2, i) { // from class: sf2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f60780a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f60781b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ List f60782c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ wf2 f60783d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f60784e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ui3 f60785f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ vi3 f60786g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f60787h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ ui3 f60788i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ e16 f60789j;

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(1);
                    vf2.m23261c(this.f60780a, this.f60781b, this.f60782c, this.f60783d, this.f60784e, this.f60785f, this.f60786g, this.f60787h, this.f60788i, this.f60789j, (ye1) obj2, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m23262d(String str, String str2, MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, ye1 ye1Var, int i) {
        vz5 vz5Var2;
        MiniLessonTemplate miniLessonTemplate2;
        b16 b16Var;
        int i2;
        zi3 zi3Var;
        zf1 zf1Var;
        zi3 zi3Var2;
        vi3 vi3Var;
        String str3 = str;
        String str4 = str2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1746312490);
        int i3 = i | (tj3Var.m22120g(str3) ? 4 : 2) | (tj3Var.m22120g(str4) ? 32 : 16) | (tj3Var.m22124i(miniLessonTemplate) ? 256 : 128) | (tj3Var.m22124i(vz5Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(pb1.m19045o(r46.m20387m(e16VarM4412e, 1.0f, aa1.m198b(0.4f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A), ui8.m22753b(16.0f)), ui8.m22753b(16.0f)), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, ss5.f61356d);
            zf1 zf1Var2 = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM10007D, ((fe9) tj3Var.m22128k(zf1Var2)).f38956e);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 48);
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
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            if (str3.length() > 0) {
                tj3Var.m22111b0(709517320);
                b16Var = b16Var2;
                zi3Var = zi3Var6;
                vi3Var = vi3Var2;
                zf1Var = zf1Var2;
                zi3Var2 = zi3Var4;
                bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str3), tj3Var, 0), null, pb1.m19045o(c99.m4422o(b16Var2, 40.0f), ui8.f63972a), null, null, 0.0f, null, tj3Var, 56, 120);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                i2 = 0;
                tj3Var.m22139q(false);
            } else {
                b16Var = b16Var2;
                i2 = 0;
                zi3Var = zi3Var6;
                zf1Var = zf1Var2;
                zi3Var2 = zi3Var4;
                vi3Var = vi3Var2;
                tj3Var.m22111b0(709863280);
                tj3Var.m22139q(false);
            }
            as4 as4Var = new as4(1.0f, true);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, i2);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var, e16VarM1322c2);
            str4 = str2;
            miniLessonTemplate2 = miniLessonTemplate;
            vz5Var2 = vz5Var;
            m23264f(miniLessonTemplate2, vz5Var2, str4, tj3Var, ((i3 >> 6) & 126) | ((i3 << 3) & 896));
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d));
            str3 = str;
            m23263e(str3, miniLessonTemplate2, tj3Var, (i3 & 14) | ((i3 >> 3) & 112));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            vz5Var2 = vz5Var;
            miniLessonTemplate2 = miniLessonTemplate;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9(str3, str4, miniLessonTemplate2, vz5Var2, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[PHI: r3
      0x0071: PHI (r3v18 java.lang.String) = (r3v12 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String) binds: [B:54:0x00b7, B:48:0x008b, B:36:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7 A[PHI: r6
      0x00a7: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v4 java.lang.String) binds: [B:51:0x00b1, B:47:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public static final void m23263e(String str, MiniLessonTemplate miniLessonTemplate, ye1 ye1Var, int i) {
        String str2;
        Map map;
        List list;
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-585418421);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(miniLessonTemplate) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean zM22120g = ((i2 & 14) == 4) | tj3Var.m22120g(miniLessonTemplate);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                MiniLessonWord miniLessonWord = (miniLessonTemplate == null || (list = miniLessonTemplate.f27419d) == null) ? null : (MiniLessonWord) u91.m22591I0(list);
                if (str.length() != 0) {
                    String str3 = (miniLessonWord == null || (map = miniLessonWord.f27425c) == null) ? null : (String) map.get(str);
                    if (str3 == null) {
                        str3 = (String) f65303a.get(str);
                        if (str3 == null) {
                            str2 = miniLessonWord != null ? miniLessonWord.f27423a : null;
                            if (str2 == null) {
                                objM22097O = "Hola";
                            } else {
                                objM22097O = str2;
                            }
                        } else {
                            objM22097O = str3;
                        }
                    } else if (str3.length() > 0) {
                        str2 = Character.toUpperCase(str3.charAt(0)) + str3.substring(1);
                        objM22097O = str2;
                    } else {
                        objM22097O = str3;
                    }
                } else if (miniLessonWord == null || (str2 = miniLessonWord.f27423a) == null) {
                    objM22097O = "Hola";
                } else {
                    objM22097O = str2;
                }
                tj3Var.m22131l0(objM22097O);
            }
            String str4 = (String) objM22097O;
            long j = p58.m18900f(tj3Var).f55872p;
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4422o = c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14), 12.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4422o);
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
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            boolean zM22118f = tj3Var.m22118f(j);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22118f || objM22097O2 == p84Var) {
                z = true;
                objM22097O2 = new C3405od(1, j);
                tj3Var.m22131l0(objM22097O2);
            } else {
                z = true;
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O2, tj3Var, 6);
            tj3Var.m22139q(z);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(d32.m10007D(vz1.m23616X(c99.m4412e(b16Var, 1.0f), 4.0f, ui8.m22753b(20.0f), 0L, 0L, 28), p58.m18900f(tj3Var).f55872p, ui8.m22753b(20.0f)), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38952a);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            boolean z2 = z;
            lw9.m16554b(str4, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131002);
            pb1.m19031a(0.0f, 0, 2, p58.m18900f(tj3Var).f55817B, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38955d, z2 ? 1 : 0));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_dictionary_preview_hint), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(z2);
            tj3Var.m22139q(z2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(str, i, 11, miniLessonTemplate);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m23264f(final MiniLessonTemplate miniLessonTemplate, final vz5 vz5Var, final String str, ye1 ye1Var, final int i) {
        int i2;
        x18 x18VarM22143u;
        zi3 zi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1015317124);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(miniLessonTemplate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vz5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(str) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            if (miniLessonTemplate == null || vz5Var == null) {
                tj3Var.m22111b0(2142408538);
                vh9 vh9Var = ps5.f56764b;
                lw9.m16554b("Hola, cómo estás?", null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 6, 0, 131066);
                tj3Var.m22139q(false);
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i3 = 0;
                zi3Var = new zi3() { // from class: uf2
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        xfa xfaVar = xfa.f68157a;
                        int i5 = i;
                        String str2 = str;
                        vz5 vz5Var2 = vz5Var;
                        MiniLessonTemplate miniLessonTemplate2 = miniLessonTemplate;
                        ye1 ye1Var2 = (ye1) obj;
                        ((Integer) obj2).intValue();
                        switch (i4) {
                            case 0:
                                vf2.m23264f(miniLessonTemplate2, vz5Var2, str2, ye1Var2, pk9.m19383z(i5 | 1));
                                break;
                            default:
                                vf2.m23264f(miniLessonTemplate2, vz5Var2, str2, ye1Var2, pk9.m19383z(i5 | 1));
                                break;
                        }
                        return xfaVar;
                    }
                };
            } else {
                tj3Var.m22111b0(2142604582);
                tj3Var.m22139q(false);
                boolean zM22120g = tj3Var.m22120g(miniLessonTemplate);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    MiniLessonWord miniLessonWord = (MiniLessonWord) u91.m22591I0(miniLessonTemplate.f27419d);
                    String str2 = miniLessonWord != null ? miniLessonWord.f27423a : null;
                    objM22097O = sz5.m21798i(miniLessonTemplate, str2 != null ? AbstractC3489q9.m19766C(str2) : EmptySet.f47640a);
                    tj3Var.m22131l0(objM22097O);
                }
                sz5.m21793d(((i2 << 3) & 7168) | (i2 & 112), tj3Var, vz5Var, miniLessonTemplate.f27418c, str, (List) objM22097O);
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i4 = 1;
            zi3Var = new zi3() { // from class: uf2
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    xfa xfaVar = xfa.f68157a;
                    int i6 = i;
                    String str3 = str;
                    vz5 vz5Var2 = vz5Var;
                    MiniLessonTemplate miniLessonTemplate2 = miniLessonTemplate;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            vf2.m23264f(miniLessonTemplate2, vz5Var2, str3, ye1Var2, pk9.m19383z(i6 | 1));
                            break;
                        default:
                            vf2.m23264f(miniLessonTemplate2, vz5Var2, str3, ye1Var2, pk9.m19383z(i6 | 1));
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }
}
