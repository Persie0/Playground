package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.feature.onboarding.R$string;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q7a {

    /* JADX INFO: renamed from: a */
    public static final List f57354a = vz1.m23605K(FeedTopic.Entertainment, FeedTopic.Food, FeedTopic.Health, FeedTopic.Kids, FeedTopic.SelfHelp, FeedTopic.Sports, FeedTopic.Travel);

    /* JADX INFO: renamed from: b */
    public static final List f57355b = vz1.m23605K(FeedTopic.Books, FeedTopic.Culture, FeedTopic.History, FeedTopic.News, FeedTopic.Podcasts, FeedTopic.Songs, FeedTopic.Youtubers);

    /* JADX INFO: renamed from: c */
    public static final List f57356c = vz1.m23605K(FeedTopic.Business, FeedTopic.Grammar, FeedTopic.Language, FeedTopic.Politics, FeedTopic.Pronunciation, FeedTopic.Science, FeedTopic.Technology);

    /* JADX INFO: renamed from: a */
    public static final void m19706a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, boolean z) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-754019151);
        int i3 = i2 | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            if (z) {
                tj3Var.m22111b0(-305213975);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-305137312);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4038N(ui3Var, e16VarM4412e, false, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(315034982, new u75(str, i), tj3Var), tj3Var, ((i3 >> 12) & 14) | 100663296, 164);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new v75(e16Var, str, i, z, ui3Var, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19707b(List list, Set set, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        Set set2 = set;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2140127863);
        vi3 vi3Var2 = vi3Var;
        int i2 = i | (tj3Var2.m22124i(list) ? 4 : 2) | (tj3Var2.m22124i(set2) ? 32 : 16) | (tj3Var2.m22124i(vi3Var2) ? 256 : 128);
        boolean z = true;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 28;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
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
            tj3Var2.m22111b0(2141458453);
            for (List<FeedTopic> list2 : u91.m22632y0(list, 2)) {
                float f = 1.0f;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, z, new gm5(i3)), nj0.f52817l, tj3Var2, 0);
                b16 b16Var2 = b16Var;
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                tj3Var2.m22111b0(735547094);
                for (FeedTopic feedTopic : list2) {
                    String strM15203K = AbstractC3184kh.m15203K(feedTopic);
                    boolean zContains = set2.contains(strM15203K);
                    String strM23620a0 = vz1.m23620a0(tj3Var2, fbd.m11760j(feedTopic));
                    int iM14421d = jfa.m14421d(feedTopic);
                    if (f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    as4 as4Var = new as4(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, z);
                    boolean zM22122h = tj3Var2.m22122h(zContains) | tj3Var2.m22124i(set2) | tj3Var2.m22120g(strM15203K) | ((i2 & 896) == 256);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22122h || objM22097O == we1.f66679a) {
                        C3560s4 c3560s4 = new C3560s4(4, set, strM15203K, vi3Var2, zContains);
                        tj3Var2.m22131l0(c3560s4);
                        objM22097O = c3560s4;
                    }
                    ui3 ui3Var3 = (ui3) objM22097O;
                    tj3 tj3Var3 = tj3Var2;
                    m19706a(iM14421d, 0, tj3Var3, ui3Var3, as4Var, strM23620a0, zContains);
                    set2 = set;
                    vi3Var2 = vi3Var;
                    f = f;
                    tj3Var2 = tj3Var3;
                    z = true;
                }
                tj3 tj3Var4 = tj3Var2;
                float f2 = f;
                tj3Var4.m22139q(false);
                boolean z2 = true;
                if (list2.size() == 1) {
                    tj3Var4.m22111b0(1328003836);
                    if (f2 <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    z2 = true;
                    thb.m22044c(tj3Var4, new as4(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, true));
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22111b0(1328078794);
                    tj3Var4.m22139q(false);
                }
                tj3Var4.m22139q(z2);
                set2 = set;
                vi3Var2 = vi3Var;
                z = z2;
                tj3Var2 = tj3Var4;
                b16Var = b16Var2;
                i3 = 28;
            }
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
            tj3Var.m22139q(z);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fe0(list, set, vi3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19708c(Set set, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        set.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1924405899);
        int i2 = i | (tj3Var.m22124i(set) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            gxb.m12968d(vz1.m23620a0(tj3Var, R$string.onboarding_v2_topics_title), z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, vz1.m23620a0(tj3Var, R$string.onboarding_v2_topics_subtitle), ci8.m4703P(238649575, new p7a(set, vi3Var, 0), tj3Var), tj3Var, (i2 & 7168) | ((i2 >> 3) & 112) | 1572864 | 24576, 0);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new n99(set, vi3Var, z, ui3Var, e16Var2, i, 1);
        }
    }
}
