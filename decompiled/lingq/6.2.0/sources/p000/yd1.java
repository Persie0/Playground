package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.playlist.AbstractC2253c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yd1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69676a;

    public /* synthetic */ yd1(int i) {
        this.f69676a = i;
    }

    /* JADX INFO: renamed from: d */
    private final Object m25076d(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.ui_confirm), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m25077g(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.ui_cancel), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m25078j(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.achievements.R$string.streak_repair_it), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m25079k(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.ui_not_now), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f69676a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    zf1 zf1Var = ge9.f40637a;
                    ((fe9) tj3Var.m22128k(zf1Var)).getClass();
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4422o(b16Var, 32.0f), 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 11);
                    p04 p04VarM17721b = y2d.f69196a;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("Rounded.Shuffle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        f57 f57Var = new f57();
                        f57Var.m11553h(10.59f, 9.17f);
                        f57Var.m11551f(6.12f, 4.7f);
                        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        f57Var.m11552g(4.46f, 4.46f);
                        f57Var.m11552g(1.42f, -1.4f);
                        f57Var.m11546a();
                        f57Var.m11553h(15.35f, 4.85f);
                        f57Var.m11552g(1.19f, 1.19f);
                        f57Var.m11551f(4.7f, 17.88f);
                        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        f57Var.m11551f(17.96f, 7.46f);
                        f57Var.m11552g(1.19f, 1.19f);
                        f57Var.m11548c(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
                        f57Var.m11551f(20.0f, 4.5f);
                        f57Var.m11548c(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
                        f57Var.m11550e(-3.79f);
                        f57Var.m11548c(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
                        f57Var.m11546a();
                        f57Var.m11553h(14.83f, 13.41f);
                        f57Var.m11552g(-1.41f, 1.41f);
                        f57Var.m11552g(3.13f, 3.13f);
                        f57Var.m11552g(-1.2f, 1.2f);
                        f57Var.m11548c(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
                        f57Var.m11550e(3.79f);
                        f57Var.m11548c(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
                        f57Var.m11557l(-3.79f);
                        f57Var.m11548c(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
                        f57Var.m11552g(-1.19f, 1.19f);
                        f57Var.m11552g(-3.13f, -3.14f);
                        f57Var.m11546a();
                        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        y2d.f69196a = p04VarM17721b;
                    }
                    ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var, com.lingq.feature.playlist.R$string.audio_shuffle), e16VarM21611X, 0L, tj3Var, 0, 8);
                    lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.playlist.R$string.audio_shuffle), new as4(1.0f, true), 0L, new m20(vs9.f65864a, ((vx9) tj3Var.m22128k(lw9.f50220a)).f66065a.f42265b, d32.m10017O(0.25d)), 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 24576, 114676);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC2253c.m9219e(null, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    do7.m10527c(AbstractC3584sr.m21611X(b16.f7762a, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38958g, 0.0f, 0.0f, 13), 0L, 0.0f, 0.0f, tj3Var3, 0, 14);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_playlist_icon, tj3Var4, 0);
                    long j = ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55873q;
                    ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var, 32.0f), j, tj3Var4, 56, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var5, R$string.ui_yes), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.ui_ok), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var7, R$string.ui_yes), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var8, R$string.ui_no), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var9, R$string.ui_buy_points), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    thb.m22044c(tj3Var10, c99.m4414g(b16Var, 48.0f));
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var11, R$string.ui_buy_points), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var11, 0, 0, 262142);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var12, R$string.ui_cancel), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var12, 0, 0, 262142);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, R$string.ui_yes), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 13:
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, R$string.ui_no), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 14:
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    String strM23620a0 = vz1.m23620a0(tj3Var15, R$string.ui_not_now);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, e16VarM4412e, aa1.m198b(0.6f, ((ms5) tj3Var15.m22128k(vh9Var)).f51799a.f55870o), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var15.m22128k(vh9Var)).f51800b.f71409m, tj3Var15, 48, 0, 130040);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 15:
                ye1 ye1Var16 = (ye1) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var16, com.lingq.feature.reader.R$string.rating_send_feedback), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var16, 0, 0, 262142);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case 16:
                ye1 ye1Var17 = (ye1) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var17, com.lingq.feature.reader.R$string.rating_rate_us), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var17, 0, 0, 262142);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 17:
                ye1 ye1Var18 = (ye1) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var18, com.lingq.feature.reader.R$string.button_go_back), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var18, 0, 0, 262142);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
            case 18:
                ye1 ye1Var19 = (ye1) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var19, com.lingq.feature.reader.R$string.warning_retry), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var19, 0, 0, 262142);
                } else {
                    tj3Var19.m22102U();
                }
                return xfaVar;
            case 19:
                ei0 ei0Var = (ei0) obj;
                ye1 ye1Var20 = (ye1) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ei0Var.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= ((tj3) ye1Var20).m22120g(ei0Var) ? 4 : 2;
                }
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    fb2 fb2Var = (fb2) tj3Var20.m22128k(AbstractC0402n.f4816h);
                    int iM3800h = (int) (((bk1.m3800h(ei0Var.f37275b) - fb2Var.mo912g0(81.0f)) - fb2Var.mo912g0(16.0f)) / (fb2Var.mo912g0(12.0f) + fb2Var.mo912g0(18.0f)));
                    if (iM3800h < 5) {
                        iM3800h = 5;
                    }
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var20, 0);
                    int iHashCode2 = Long.hashCode(tj3Var20.f62385T);
                    l77 l77VarM22132m2 = tj3Var20.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var20, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var20.m22119f0();
                    if (tj3Var20.f62384S) {
                        tj3Var20.m22130l(ui3Var2);
                    } else {
                        tj3Var20.m22137o0();
                    }
                    oha.m18001g(tj3Var20, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var20, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var20, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var20, C0352b.f4305h);
                    oha.m18001g(tj3Var20, C0352b.f4301d, e16VarM1322c2);
                    qjc.m20011b(tj3Var20, 0);
                    thb.m22044c(tj3Var20, c99.m4414g(b16Var, 16.0f));
                    qjc.m20012c(iM3800h, tj3Var20, 0);
                    tj3Var20.m22139q(true);
                } else {
                    tj3Var20.m22102U();
                }
                return xfaVar;
            case 20:
                ye1 ye1Var21 = (ye1) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, 16.0f, 8.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(8.0f, true, new gm5(28)), nj0.f52789H, tj3Var21, 54);
                    int iHashCode3 = Long.hashCode(tj3Var21.f62385T);
                    l77 l77VarM22132m3 = tj3Var21.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var21, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var21.m22119f0();
                    if (tj3Var21.f62384S) {
                        tj3Var21.m22130l(ui3Var3);
                    } else {
                        tj3Var21.m22137o0();
                    }
                    oha.m18001g(tj3Var21, C0352b.f4303f, sj8VarM20003a2);
                    oha.m18001g(tj3Var21, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var21, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var21, C0352b.f4305h);
                    oha.m18001g(tj3Var21, C0352b.f4301d, e16VarM1322c3);
                    e16 e16VarM4422o = c99.m4422o(b16Var, 16.0f);
                    vh9 vh9Var2 = ps5.f56764b;
                    dn7.m10492a(e16VarM4422o, ((ms5) tj3Var21.m22128k(vh9Var2)).f51799a.f55848d, 2.0f, 0L, 0, 0.0f, tj3Var21, 390, 56);
                    lw9.m16554b(vz1.m23620a0(tj3Var21, com.lingq.feature.reader.R$string.ui_refreshing), null, ((ms5) tj3Var21.m22128k(vh9Var2)).f51799a.f55848d, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var21.m22128k(vh9Var2)).f51800b.f71410n, tj3Var21, 0, 0, 131066);
                    tj3Var21.m22139q(true);
                } else {
                    tj3Var21.m22102U();
                }
                return xfaVar;
            case 21:
                ye1 ye1Var22 = (ye1) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_lesson_review, tj3Var22, 0);
                    zf1 zf1Var2 = ge9.f40637a;
                    ((fe9) tj3Var22.m22128k(zf1Var2)).getClass();
                    ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var, 24.0f), 0L, tj3Var22, 56, 8);
                    thb.m22044c(tj3Var22, c99.m4426s(b16Var, ((fe9) tj3Var22.m22128k(zf1Var2)).f38955d));
                    lw9.m16554b(vz1.m23620a0(tj3Var22, com.lingq.feature.reader.R$string.stats_review), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var22, 0, 0, 262142);
                } else {
                    tj3Var22.m22102U();
                }
                return xfaVar;
            case 22:
                ye1 ye1Var23 = (ye1) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    y27 y27VarM18236U3 = AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_repeat, tj3Var23, 0);
                    zf1 zf1Var3 = ge9.f40637a;
                    ((fe9) tj3Var23.m22128k(zf1Var3)).getClass();
                    ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var, 24.0f), 0L, tj3Var23, 56, 8);
                    thb.m22044c(tj3Var23, c99.m4426s(b16Var, ((fe9) tj3Var23.m22128k(zf1Var3)).f38955d));
                    lw9.m16554b(vz1.m23620a0(tj3Var23, com.lingq.feature.reader.R$string.stats_replay), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var23, 0, 0, 262142);
                } else {
                    tj3Var23.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var24 = (ye1) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var24, R$string.lesson_unsave_lesson), null, ((ms5) tj3Var24.m22128k(ps5.f56764b)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var24, 0, 0, 262138);
                } else {
                    tj3Var24.m22102U();
                }
                return xfaVar;
            case 24:
                ye1 ye1Var25 = (ye1) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var25 = (tj3) ye1Var25;
                if (tj3Var25.m22099R(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, R$string.ui_cancel), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var25, 0, 0, 262142);
                } else {
                    tj3Var25.m22102U();
                }
                return xfaVar;
            case 25:
                return m25076d(obj, obj2, obj3);
            case 26:
                return m25077g(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m25078j(obj, obj2, obj3);
            case 28:
                return m25079k(obj, obj2, obj3);
            default:
                ye1 ye1Var26 = (ye1) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var26 = (tj3) ye1Var26;
                if (tj3Var26.m22099R(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var26, R$string.card_report), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var26, 0, 0, 262142);
                } else {
                    tj3Var26.m22102U();
                }
                return xfaVar;
        }
    }
}
