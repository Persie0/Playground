package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.lessoninfo.R$string;
import com.lingq.feature.lessoninfo.SharedByRole;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fjd {
    /* JADX INFO: renamed from: a */
    public static final void m11917a(String str, String str2, SharedByRole sharedByRole, boolean z, ye1 ye1Var, int i) {
        boolean z2;
        String str3;
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(853047112);
        int i3 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22116e(sharedByRole == null ? -1 : sharedByRole.ordinal()) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
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
            ss5.m21702b(str2, null, pb1.m19045o(c99.m4422o(b16Var, 40.0f), ui8.f63972a), null, hl1.f42564a, tj3Var, ((i3 >> 3) & 14) | 1572912, 4024);
            if (sharedByRole != null) {
                tj3Var.m22111b0(1212483277);
                int i4 = f45.f38413a[sharedByRole.ordinal()];
                if (i4 == 1) {
                    i2 = R$drawable.ic_profile_librarian;
                } else if (i4 == 2) {
                    i2 = R$drawable.ic_profile_chief_librarian;
                } else {
                    if (i4 != 3) {
                        gm5.m12750e();
                        return;
                    }
                    i2 = R$drawable.ic_profile_editor;
                }
                z2 = false;
                ty3.m22352b(AbstractC3423or.m18236U(i2, tj3Var, 0), null, ci0.f10109a.mo3727a(c99.m4422o(b16Var, 16.0f), nj0.f52816k), aa1.f412k, tj3Var, 3128, 0);
                tj3Var.m22139q(false);
            } else {
                z2 = false;
                tj3Var.m22111b0(1213145406);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d));
            if (z) {
                tj3Var.m22111b0(775676548);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(775502607);
                String upperCase = vz1.m23620a0(tj3Var, R$string.lesson_shared_by).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                lw9.m16554b(upperCase, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var, 0, 0, 131070);
                tj3Var.m22139q(z2);
            }
            if (z) {
                tj3Var = tj3Var;
                str3 = "PRIVATE";
            } else {
                tj3Var = tj3Var;
                str3 = str;
            }
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b(str3, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var2, 0, 24960, 110590);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(str, str2, sharedByRole, z, i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11918b(String str, int i, float f, long j, ye1 ye1Var, int i2) {
        int i3;
        tj3 tj3Var;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(851303566);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22120g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22114d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var2.m22118f(j) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var2, 6);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, i3 & 14, 0, 131070);
            lw9.m16554b(String.valueOf(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, 0, 0, 131070);
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d));
            boolean z = (i3 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new h61(1, f);
                tj3Var2.m22131l0(objM22097O);
            }
            dn7.m10494c((ui3) objM22097O, pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 6.0f), ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64856b), j, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55874r, 0, 0.0f, null, tj3Var2, (i3 >> 3) & 896, 112);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ki2(str, i, f, j, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11919c(final int i, final int i2, final int i3, final int i4, final int i5, final int i6, ye1 ye1Var, final int i7) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-441945649);
        int i8 = i7 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22116e(i2) ? 32 : 16) | (tj3Var.m22116e(i3) ? 256 : 128) | (tj3Var.m22116e(i5) ? 16384 : 8192) | (tj3Var.m22116e(i6) ? 131072 : 65536);
        if (tj3Var.m22099R(i8 & 1, (73875 & i8) != 73874)) {
            float f = i6 < 1 ? 1 : i6;
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            m11918b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.feed_words_new), i, i / f, cx2.m9917a(tj3Var).m4209b(), tj3Var, (i8 << 3) & 112);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38956e));
            m11918b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_lingqs), i2, i2 / f, cx2.m9917a(tj3Var).m4212e(), tj3Var, i8 & 112);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38956e));
            m11918b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_known_words), i3, i3 / f, cx2.m9917a(tj3Var).m4212e(), tj3Var, (i8 >> 3) & 112);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
            lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.content_info_totals, new Object[]{Integer.valueOf(i5), Integer.valueOf(i6)}, tj3Var), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, i2, i3, i4, i5, i6, i7) { // from class: e45

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f36693a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f36694b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f36695c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f36696d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f36697e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f36698f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    fjd.m11919c(this.f36693a, this.f36694b, this.f36695c, this.f36696d, this.f36697e, this.f36698f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
