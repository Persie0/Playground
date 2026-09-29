package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.lessoninfo.PlaylistButtonState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wid {
    /* JADX INFO: renamed from: a */
    public static final void m23994a(final PlaylistButtonState playlistButtonState, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final int i, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, final ui3 ui3Var4, ye1 ye1Var, final int i2) {
        p04 p04VarM17721b;
        long jM4215h;
        long jM4212e;
        playlistButtonState.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        ui3Var4.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1713980038);
        int i3 = i2 | (tj3Var.m22116e(playlistButtonState.ordinal()) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22122h(z3) ? 2048 : 1024) | (tj3Var.m22122h(z4) ? 16384 : 8192) | (tj3Var.m22122h(z5) ? 131072 : 65536) | (tj3Var.m22122h(z6) ? 1048576 : 524288) | (tj3Var.m22116e(i) ? 8388608 : 4194304) | (tj3Var.m22124i(ui3Var) ? 67108864 : 33554432) | (tj3Var.m22124i(ui3Var2) ? 536870912 : 268435456);
        int i4 = (tj3Var.m22124i(ui3Var3) ? 4 : 2) | (tj3Var.m22124i(ui3Var4) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var5 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            ss5.m21711g(e65.m10871c(tj3Var, e16VarM1322c, C0352b.f4301d, 1.0f, true), false, null, 0L, null, null, ui3Var, ci8.m4703P(-1430763021, new se0(playlistButtonState, 20), tj3Var), tj3Var, (3670016 & (i3 >> 6)) | 12582912, 62);
            tj3Var = tj3Var;
            if (z) {
                p04VarM17721b = fdd.f38920a;
                if (p04VarM17721b == null) {
                    o04 o04Var = new o04("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = soa.f61116a;
                    pd9 pd9Var = new pd9(aa1.f403b);
                    f57 f57Var = new f57();
                    f57Var.m11553h(12.0f, 21.35f);
                    f57Var.m11552g(-1.45f, -1.32f);
                    f57Var.m11547b(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
                    f57Var.m11547b(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
                    f57Var.m11548c(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
                    f57Var.m11547b(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
                    f57Var.m11547b(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
                    f57Var.m11548c(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
                    f57Var.m11551f(12.0f, 21.35f);
                    f57Var.m11546a();
                    o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                    p04VarM17721b = o04Var.m17721b();
                    fdd.f38920a = p04VarM17721b;
                }
            } else {
                p04VarM17721b = edd.f37095a;
                if (p04VarM17721b == null) {
                    o04 o04Var2 = new o04("Outlined.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i6 = soa.f61116a;
                    pd9 pd9Var2 = new pd9(aa1.f403b);
                    f57 f57VarM17730e = AbstractC3393o1.m17730e(16.5f, 3.0f);
                    f57VarM17730e.m11548c(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
                    f57VarM17730e.m11547b(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
                    f57VarM17730e.m11547b(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
                    f57VarM17730e.m11548c(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
                    f57VarM17730e.m11551f(12.0f, 21.35f);
                    f57VarM17730e.m11552g(1.45f, -1.32f);
                    f57VarM17730e.m11547b(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
                    f57VarM17730e.m11547b(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
                    f57VarM17730e.m11546a();
                    f57VarM17730e.m11553h(12.1f, 18.55f);
                    f57VarM17730e.m11552g(-0.1f, 0.1f);
                    f57VarM17730e.m11552g(-0.1f, -0.1f);
                    f57VarM17730e.m11547b(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
                    f57VarM17730e.m11547b(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
                    f57VarM17730e.m11548c(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
                    f57VarM17730e.m11550e(1.87f);
                    f57VarM17730e.m11547b(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
                    f57VarM17730e.m11548c(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
                    f57VarM17730e.m11548c(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
                    f57VarM17730e.m11546a();
                    o04.m17720a(o04Var2, f57VarM17730e.f38440a, pd9Var2);
                    p04 p04VarM17721b2 = o04Var2.m17721b();
                    edd.f37095a = p04VarM17721b2;
                    p04VarM17721b = p04VarM17721b2;
                }
            }
            p04 p04Var = p04VarM17721b;
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_like_present);
            if (z) {
                tj3Var.m22111b0(-974362207);
                jM4215h = cx2.m9917a(tj3Var).m4215h();
            } else {
                tj3Var.m22111b0(-974361081);
                jM4215h = p58.m18900f(tj3Var).f55873q;
            }
            tj3Var.m22139q(false);
            m23995b(p04Var, null, strM23620a0, ui3Var2, jM4215h, false, tj3Var, (i3 >> 18) & 7168, 34);
            y27 y27VarM18236U = AbstractC3423or.m18236U(z2 ? R$drawable.ic_check_thick : R$drawable.ic_plus_s, tj3Var, 0);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.lesson_save_lesson);
            if (z2) {
                tj3Var.m22111b0(-974348445);
                jM4212e = cx2.m9917a(tj3Var).m4212e();
            } else {
                tj3Var.m22111b0(-974347257);
                jM4212e = p58.m18900f(tj3Var).f55873q;
            }
            tj3Var.m22139q(false);
            m23995b(null, y27VarM18236U, strM23620a1, ui3Var3, jM4212e, false, tj3Var, 64 | ((i4 << 9) & 7168), 33);
            omd.m18141c(ui3Var4, d32.m10007D(b16Var, p58.m18900f(tj3Var).f55874r, ui8.f63972a), !(z3 || z5 || z6), null, null, ci8.m4703P(-26598788, new zi3() { // from class: q25
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    long jM4212e2;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        tj3Var2.m22102U();
                    } else if (z5) {
                        tj3Var2.m22111b0(-2130445463);
                        ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                        do7.m10527c(null, 0L, 16.0f, 2.0f, tj3Var2, 3072, 3);
                        tj3Var2.m22139q(false);
                    } else if (z6) {
                        tj3Var2.m22111b0(-2130154063);
                        int i7 = i;
                        boolean zM22116e = tj3Var2.m22116e(i7);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22116e || objM22097O == we1.f66679a) {
                            objM22097O = new kh4(i7, 1);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                        do7.m10526b((ui3) objM22097O, null, 0L, 16.0f, 2.0f, 0L, tj3Var2, 24576, 38);
                        tj3Var2.m22139q(false);
                    } else if (z3) {
                        tj3Var2.m22111b0(-2129815915);
                        ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                        do7.m10527c(null, 0L, 16.0f, 2.0f, tj3Var2, 3072, 3);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-2129542123);
                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var2, 0);
                        String strM23620a2 = vz1.m23620a0(tj3Var2, R$string.ui_download);
                        ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                        e16 e16VarM4422o = c99.m4422o(b16.f7762a, 16.0f);
                        if (z4) {
                            tj3Var2.m22111b0(-2129231193);
                            jM4212e2 = ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4212e();
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-2129131125);
                            jM4212e2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55873q;
                            tj3Var2.m22139q(false);
                        }
                        ty3.m22352b(y27VarM18236U2, strM23620a2, e16VarM4422o, jM4212e2, tj3Var2, 8, 0);
                        tj3Var2.m22139q(false);
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, ((i4 >> 3) & 14) | 1572864, 56);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, z2, z3, z4, z5, z6, i, ui3Var, ui3Var2, ui3Var3, ui3Var4, i2) { // from class: r25

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f58519b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f58520c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f58521d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f58522e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f58523f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ boolean f58524g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f58525h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ ui3 f58526i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ ui3 f58527j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ ui3 f58528k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ ui3 f58529l;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    wid.m23994a(this.f58518a, this.f58519b, this.f58520c, this.f58521d, this.f58522e, this.f58523f, this.f58524g, this.f58525h, this.f58526i, this.f58527j, this.f58528k, this.f58529l, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23995b(p04 p04Var, y27 y27Var, String str, ui3 ui3Var, long j, boolean z, ye1 ye1Var, int i, int i2) {
        p04 p04Var2;
        int i3;
        ui3 ui3Var2;
        boolean z2;
        p04 p04Var3;
        y27 y27Var2;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-217563233);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            p04Var2 = p04Var;
        } else if ((i & 6) == 0) {
            p04Var2 = p04Var;
            i3 = (tj3Var.m22120g(p04Var2) ? 4 : 2) | i;
        } else {
            p04Var2 = p04Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? tj3Var.m22120g(y27Var) : tj3Var.m22124i(y27Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var2 = ui3Var;
            i3 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22118f(j) ? 16384 : 8192;
        }
        int i6 = i3 | 196608;
        if (tj3Var.m22099R(i6 & 1, (74899 & i6) != 74898)) {
            p04 p04Var4 = i4 != 0 ? null : p04Var2;
            y27 y27Var3 = i5 != 0 ? null : y27Var;
            int i7 = i6 >> 9;
            omd.m18141c(ui3Var2, d32.m10007D(b16.f7762a, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55874r, ui8.f63972a), true, null, null, ci8.m4703P(1758462913, new ds0(p04Var4, str, j, y27Var3), tj3Var), tj3Var, (i7 & 14) | 1572864 | (i7 & 896), 56);
            y27Var2 = y27Var3;
            p04Var3 = p04Var4;
            z2 = true;
        } else {
            tj3Var.m22102U();
            z2 = z;
            p04Var3 = p04Var2;
            y27Var2 = y27Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new s25(p04Var3, y27Var2, str, ui3Var, j, z2, i, i2);
        }
    }
}
