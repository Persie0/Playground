package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.more.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ls3 {

    /* JADX INFO: renamed from: a */
    public static final List f50071a = vz1.m23605K(new ns3(R$string.help_brief_overview, "https://youtu.be/bDCwK-ZOpuU", R$string.help_brief_overview_description), new ns3(R$string.feed_library, "https://youtu.be/ysBoR8fjyvU", R$string.help_find_content), new ns3(R$string.settings_reader, "https://youtu.be/q9dVfNdKM_g", R$string.help_study_lessons), new ns3(R$string.quickstart_advanced_reader, "https://youtu.be/KxLevx9DjS8", R$string.help_customize_lingQ), new ns3(R$string.feed_imports, "https://youtu.be/Uly24S4sLXs", R$string.help_create_lessons), new ns3(com.lingq.core.p012ui.R$string.card_only_phrases, "https://youtu.be/SFmLxJrR9Uk", R$string.help_natives_speak), new ns3(com.lingq.core.p012ui.R$string.stats_stats, "https://youtu.be/LpKLlYgCYVs", R$string.help_track_progress), new ns3(com.lingq.core.p012ui.R$string.lingq_vocabulary, "https://youtu.be/phq1n6u5v74", R$string.help_personal_database), new ns3(R$string.help_how_to_earn_coins, "https://youtu.be/fv5HVWbrnC8", R$string.help_how_to_earn_coins_description), new ns3(com.lingq.core.p012ui.R$string.playlist_playlists, "https://youtu.be/qOnyU_cI8Zw", R$string.help_playlists_description));

    /* JADX INFO: renamed from: a */
    public static final void m16523a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2) {
        String str3;
        int i3;
        e16 e16Var2;
        String str4;
        float f;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1228195215);
        int i4 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (tj3Var.m22120g(str3) ? 256 : 128);
        }
        int i6 = i3 | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                str3 = null;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15);
            e41 e41Var = eh0.f37240f;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(e41Var, ec0Var, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
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
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a2 = ab1.m230a(e41Var, ec0Var, tj3Var, 54);
            String str5 = str3;
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, (i6 >> 3) & 14, 0, 131070);
            tj3Var = tj3Var;
            if (str5 == null) {
                tj3Var.m22111b0(-1544038294);
                tj3Var.m22139q(false);
                str4 = str5;
            } else {
                tj3Var.m22111b0(-1544038293);
                lw9.m16554b(str5, pvc.m19514j(b16Var, 0.5f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, ((i6 >> 6) & 14) | 48, 0, 131068);
                str4 = str5;
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            if (str4 == null) {
                tj3Var.m22111b0(1541723014);
                f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1541795492);
                f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a;
                tj3Var.m22139q(false);
            }
            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21611X(b16Var, 0.0f, f, 0.0f, 0.0f, 13));
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
            str3 = str4;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new js3(e16Var2, str, str3, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16524b(ms3 ms3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1204393236);
        int i2 = 16;
        int i3 = (tj3Var.m22124i(vi3Var) ? 32 : 16) | i;
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 17) != 16)) {
            b34.m3232b(c99.m4410c(b16.f7762a, 1.0f), ci8.m4703P(-249307944, new ks3(vi3Var, i4), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-1589945373, new qe0(vi3Var, i2), tj3Var), tj3Var, 805306422, 508);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(ms3Var, i, 12, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16525c(vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1176197607);
        int i2 = (tj3Var.m22124i(vi3Var) ? 4 : 2) | i;
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ms3 ms3Var = new ms3();
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new te0(vi3Var, 20);
                tj3Var.m22131l0(objM22097O);
            }
            m16524b(ms3Var, (vi3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ks3(vi3Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16526d(int i, ye1 ye1Var, e16 e16Var, String str) {
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1554609424);
        int i2 = i | 6 | (tj3Var2.m22120g(str) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(str, e16VarM4412e, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55852f, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71405i, tj3Var, (i2 >> 3) & 14, 0, 131064);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gs0(e16Var2, str, i, 3);
        }
    }
}
