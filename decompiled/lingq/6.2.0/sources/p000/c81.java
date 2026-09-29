package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.material3.AbstractC0257p;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.player.R$drawable;
import com.lingq.feature.review.AbstractC2752c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c81 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9699b;

    public /* synthetic */ c81(int i, int i2, boolean z) {
        this.f9698a = i2;
        this.f9699b = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long jM4212e;
        p04 p04VarM17721b;
        String strM23620a0;
        long j;
        long j2;
        int i = this.f9698a;
        b16 b16Var = b16.f7762a;
        boolean z = this.f9699b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    p04 p04VarM11590a = z ? f7d.m11590a() : h2d.m13016b();
                    if (z) {
                        tj3Var.m22111b0(405154197);
                        jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(405270137);
                        jM4212e = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                        tj3Var.m22139q(false);
                    }
                    ty3.m22351a(p04VarM11590a, null, null, jM4212e, tj3Var, 48, 4);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8830m(z, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean z2 = this.f9699b;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4425r(b16Var, z2 ? AbstractC0257p.f3577j : ky2.f48772a, 0.0f, 0.0f, 14), z2 ? AbstractC0257p.f3574g : 0.0f, 0.0f, z2 ? AbstractC0257p.f3576i : 0.0f, 0.0f, 10);
                    sj8 sj8VarM20003a = qj8.m20003a(z2 ? eh0.f37236b : eh0.f37240f, nj0.f52789H, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    atc.f7481b.invoke(tj3Var2, 0);
                    vs2 vs2VarM772g = AbstractC0070i.m772g(ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var2), 0.0f, 2);
                    l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var2);
                    ec0 ec0Var = nj0.f52791J;
                    AbstractC0054a.m730e(z2, null, vs2VarM772g.m23531a(AbstractC0070i.m767b(l43VarM21705c0, ec0Var, 12)), AbstractC0070i.m773h(ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var2), 2).m20180a(AbstractC0070i.m774i(ss5.m21705c0(MotionSchemeKeyTokens.DefaultSpatial, tj3Var2), ec0Var, 12)), null, ci8.m4703P(-660008666, new ie1(5), tj3Var2), tj3Var2, 1572870, 18);
                    tj3Var2.m22139q(true);
                }
                break;
            case 3:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    ty3.m22351a(z ? xzb.m24801a() : z1c.m25402a(), z ? "Pause Icon" : "Play Icon", null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55844b, tj3Var3, 0, 4);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                rfd.m20652a(z, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    if (z) {
                        p04VarM17721b = xzb.m24801a();
                    } else {
                        p04VarM17721b = c2c.f9380e;
                        if (p04VarM17721b == null) {
                            o04 o04Var = new o04("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = soa.f61116a;
                            pd9 pd9Var = new pd9(aa1.f403b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new q57(8.0f, 5.0f));
                            arrayList.add(new c67(14.0f));
                            arrayList.add(new x57(11.0f, -7.0f));
                            arrayList.add(m57.f50613c);
                            o04.m17720a(o04Var, arrayList, pd9Var);
                            p04VarM17721b = o04Var.m17721b();
                            c2c.f9380e = p04VarM17721b;
                        }
                    }
                    ty3.m22351a(p04VarM17721b, z ? "Pause" : "Play from sentence", c99.m4422o(b16Var, 24.0f), aa1.f406e, tj3Var4, 3456, 0);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                wnb.m24086c(z, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    ty3.m22351a(z ? xzb.m24801a() : z1c.m25402a(), z ? "Pause Icon" : "Play Icon", null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51799a.f55844b, tj3Var5, 0, 4);
                }
                break;
            case 8:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(z ? R$drawable.ic_player_pause : R$drawable.ic_player_play, tj3Var6, 0), z ? "Pause" : "Play", null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51799a.f55848d, tj3Var6, 8, 4);
                }
                break;
            case 9:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else if (!z) {
                    tj3Var7.m22111b0(-891281913);
                    y27 y27VarM18236U = AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_close_s, tj3Var7, 0);
                    String strM23620a1 = vz1.m23620a0(tj3Var7, R$string.ui_close);
                    long j3 = ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q;
                    ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U, strM23620a1, c99.m4422o(b16Var, 24.0f), j3, tj3Var7, 8, 0);
                    tj3Var7.m22139q(false);
                } else {
                    tj3Var7.m22111b0(-891649604);
                    y27 y27VarM18236U2 = AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_chevron_down_s, tj3Var7, 0);
                    String strM23620a2 = vz1.m23620a0(tj3Var7, com.lingq.feature.reader.R$string.button_go_back);
                    long j4 = ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55873q;
                    ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U2, strM23620a2, c99.m4422o(b16Var, 24.0f), j4, tj3Var7, 8, 0);
                    tj3Var7.m22139q(false);
                }
                break;
            case 10:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_font, tj3Var8, 0), vz1.m23620a0(tj3Var8, com.lingq.feature.reader.R$string.reader_settings_title), null, aa1.m198b(z ? 0.38f : 1.0f, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51799a.f55873q), tj3Var8, 8, 4);
                }
                break;
            case 11:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_menu_re, tj3Var9, 0), vz1.m23620a0(tj3Var9, com.lingq.feature.reader.R$string.reader_menu), null, aa1.m198b(z ? 0.38f : 1.0f, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55873q), tj3Var9, 8, 4);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9582e(z, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    ty3.m22351a(z ? xzb.m24801a() : z1c.m25402a(), z ? "Pause" : "Play sentence", c99.m4422o(b16Var, 20.0f), 0L, tj3Var10, 384, 8);
                }
                break;
            case 14:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    if (z) {
                        tj3Var11.m22111b0(-244042747);
                        strM23620a0 = vz1.m23620a0(tj3Var11, com.lingq.feature.onboarding.R$string.onboarding_v2_password_hint);
                        tj3Var11.m22139q(false);
                    } else {
                        tj3Var11.m22111b0(1024665421);
                        tj3Var11.m22139q(false);
                        strM23620a0 = "";
                    }
                    String str = strM23620a0;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str, null, ((ms5) tj3Var11.m22128k(vh9Var)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var11.m22128k(vh9Var)).f51800b.f71408l, tj3Var11, 0, 0, 131066);
                }
                break;
            case 15:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    String strM23620a3 = vz1.m23620a0(tj3Var12, R$string.settings_landscape_popup_floating);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var12.m22128k(zf1Var)).f38952a, ((fe9) tj3Var12.m22128k(zf1Var)).f38956e);
                    vh9 vh9Var2 = ps5.f56764b;
                    vx9 vx9Var = ((ms5) tj3Var12.m22128k(vh9Var2)).f51800b.f71407k;
                    if (z) {
                        tj3Var12.m22111b0(775804483);
                        j = ((ms5) tj3Var12.m22128k(vh9Var2)).f51799a.f55873q;
                    } else {
                        tj3Var12.m22111b0(775802892);
                        j = ((ms5) tj3Var12.m22128k(vh9Var2)).f51799a.f55848d;
                    }
                    tj3Var12.m22139q(false);
                    lw9.m16554b(strM23620a3, e16VarM21608U, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var12, 0, 0, 131064);
                }
                break;
            case 16:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    String strM23620a4 = vz1.m23620a0(tj3Var13, R$string.settings_reader_dock_token);
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21608U2 = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var13.m22128k(zf1Var2)).f38952a, ((fe9) tj3Var13.m22128k(zf1Var2)).f38956e);
                    vh9 vh9Var3 = ps5.f56764b;
                    vx9 vx9Var2 = ((ms5) tj3Var13.m22128k(vh9Var3)).f51800b.f71407k;
                    if (z) {
                        tj3Var13.m22111b0(-119773213);
                        j2 = ((ms5) tj3Var13.m22128k(vh9Var3)).f51799a.f55848d;
                    } else {
                        tj3Var13.m22111b0(-119771622);
                        j2 = ((ms5) tj3Var13.m22128k(vh9Var3)).f51799a.f55873q;
                    }
                    tj3Var13.m22139q(false);
                    lw9.m16554b(strM23620a4, e16VarM21608U2, j2, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var2, tj3Var13, 0, 0, 131064);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8519E(z, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ c81(int i, boolean z) {
        this.f9698a = i;
        this.f9699b = z;
    }
}
