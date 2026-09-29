package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.token.components.AbstractC1901a;
import com.lingq.feature.review.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ce1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9963a;

    public /* synthetic */ ce1(int i) {
        this.f9963a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9963a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.review_play_audio), c99.m4422o(b16Var, 34.0f), 0L, tj3Var, 392, 8);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_edit_outline, tj3Var2, 0), vz1.m23620a0(tj3Var2, com.lingq.core.p012ui.R$string.ui_edit), null, 0L, tj3Var2, 8, 12);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.review_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.activities_select_one_activity), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var5, R$string.activities_no_lingqs), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                }
                break;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.activities_not_enough_lingqs), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                }
                break;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    ty3.m22351a(s7d.m21149b(), vz1.m23620a0(tj3Var7, com.lingq.core.p012ui.R$string.ui_close), null, 0L, tj3Var7, 0, 12);
                }
                break;
            case 7:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    p04 p04VarM17721b = s2d.f60221a;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        f57 f57VarM17730e = AbstractC3393o1.m17730e(19.14f, 12.94f);
                        f57VarM17730e.m11548c(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                        f57VarM17730e.m11548c(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                        f57VarM17730e.m11552g(2.03f, -1.58f);
                        f57VarM17730e.m11548c(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                        f57VarM17730e.m11552g(-1.92f, -3.32f);
                        f57VarM17730e.m11548c(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                        f57VarM17730e.m11552g(-2.39f, 0.96f);
                        f57VarM17730e.m11548c(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                        f57VarM17730e.m11551f(14.4f, 2.81f);
                        f57VarM17730e.m11548c(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                        f57VarM17730e.m11550e(-3.84f);
                        f57VarM17730e.m11548c(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                        f57VarM17730e.m11551f(9.25f, 5.35f);
                        f57VarM17730e.m11547b(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                        f57VarM17730e.m11551f(5.24f, 5.33f);
                        f57VarM17730e.m11548c(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                        f57VarM17730e.m11551f(2.74f, 8.87f);
                        f57VarM17730e.m11547b(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                        f57VarM17730e.m11552g(2.03f, 1.58f);
                        f57VarM17730e.m11547b(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                        f57VarM17730e.m11555j(0.02f, 0.64f, 0.07f, 0.94f);
                        f57VarM17730e.m11552g(-2.03f, 1.58f);
                        f57VarM17730e.m11548c(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                        f57VarM17730e.m11552g(1.92f, 3.32f);
                        f57VarM17730e.m11548c(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                        f57VarM17730e.m11552g(2.39f, -0.96f);
                        f57VarM17730e.m11548c(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                        f57VarM17730e.m11552g(0.36f, 2.54f);
                        f57VarM17730e.m11548c(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                        f57VarM17730e.m11550e(3.84f);
                        f57VarM17730e.m11548c(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                        f57VarM17730e.m11552g(0.36f, -2.54f);
                        f57VarM17730e.m11548c(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                        f57VarM17730e.m11552g(2.39f, 0.96f);
                        f57VarM17730e.m11548c(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                        f57VarM17730e.m11552g(1.92f, -3.32f);
                        f57VarM17730e.m11548c(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                        f57VarM17730e.m11551f(19.14f, 12.94f);
                        f57VarM17730e.m11546a();
                        f57VarM17730e.m11553h(12.0f, 15.6f);
                        f57VarM17730e.m11548c(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                        f57VarM17730e.m11555j(1.62f, -3.6f, 3.6f, -3.6f);
                        f57VarM17730e.m11555j(3.6f, 1.62f, 3.6f, 3.6f);
                        f57VarM17730e.m11554i(13.98f, 15.6f, 12.0f, 15.6f);
                        f57VarM17730e.m11546a();
                        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        s2d.f60221a = p04VarM17721b;
                    }
                    ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var8, R$string.review_settings), null, 0L, tj3Var8, 0, 12);
                }
                break;
            case 8:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                }
                break;
            case 9:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var10, R$string.activities_select_one_activity), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                }
                break;
            case 10:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var11, 0), vz1.m23620a0(tj3Var11, R$string.review_play_audio), c99.m4422o(b16Var, 20.0f), 0L, tj3Var11, 392, 8);
                }
                break;
            case 11:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    ty3.m22351a(ihd.m13932a(), vz1.m23620a0(tj3Var12, R$string.review_open_term), null, 0L, tj3Var12, 0, 12);
                }
                break;
            case 12:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var13, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var13, 0, 12);
                }
                break;
            case 13:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (!tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    tj3Var14.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, com.lingq.core.settings.R$string.activities_one_selected_activity), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (!tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tj3Var15.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var15, com.lingq.core.settings.R$string.settings_cards_per_session), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                }
                break;
            case 15:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (!tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    tj3Var16.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var16, com.lingq.core.p012ui.R$string.import_input_text), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var16, 0, 0, 262142);
                }
                break;
            case 16:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (!tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tj3Var17.m22102U();
                } else {
                    TokenMeaning tokenMeaning = new TokenMeaning(1, "en", "Possess, own, or hold.", 0, false, null, false, 0, 1016);
                    Object objM22097O = tj3Var17.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new ce1(19);
                        tj3Var17.m22131l0(objM22097O);
                    }
                    zi3 zi3Var = (zi3) objM22097O;
                    Object objM22097O2 = tj3Var17.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new ae1(8);
                        tj3Var17.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var = (vi3) objM22097O2;
                    Object objM22097O3 = tj3Var17.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new ae1(9);
                        tj3Var17.m22131l0(objM22097O3);
                    }
                    AbstractC1901a.m8709a(tokenMeaning, true, false, false, zi3Var, vi3Var, (vi3) objM22097O3, null, tj3Var17, 1794096, 140);
                }
                break;
            case 17:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (!tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tj3Var18.m22102U();
                } else {
                    TokenMeaning tokenMeaning2 = new TokenMeaning(1, "en", "Experience; undergo.", 0, false, null, false, 0, 1016);
                    Object objM22097O4 = tj3Var18.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new ce1(18);
                        tj3Var18.m22131l0(objM22097O4);
                    }
                    zi3 zi3Var2 = (zi3) objM22097O4;
                    Object objM22097O5 = tj3Var18.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new ae1(6);
                        tj3Var18.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O5;
                    Object objM22097O6 = tj3Var18.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new ae1(7);
                        tj3Var18.m22131l0(objM22097O6);
                    }
                    AbstractC1901a.m8709a(tokenMeaning2, false, false, false, zi3Var2, vi3Var2, (vi3) objM22097O6, null, tj3Var18, 1794096, 140);
                }
                break;
            case 18:
                ((TokenMeaning) obj).getClass();
                ((String) obj2).getClass();
                break;
            case 19:
                ((TokenMeaning) obj).getClass();
                ((String) obj2).getClass();
                break;
            case 20:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (!tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tj3Var19.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_menu, tj3Var19, 0), null, c99.m4422o(b16Var, 16.0f), ((ms5) tj3Var19.m22128k(ps5.f56764b)).f51799a.f55816A, tj3Var19, 440, 0);
                }
                break;
            case 21:
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (!tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj3Var20.m22102U();
                }
                break;
            case 22:
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (!tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    tj3Var21.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_search_s, tj3Var21, 0), vz1.m23620a0(tj3Var21, com.lingq.core.p012ui.R$string.search_search), null, 0L, tj3Var21, 8, 12);
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (!tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    tj3Var22.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var22, com.lingq.core.p012ui.R$string.search_search), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var22, 0, 0, 262142);
                }
                break;
            case 24:
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (!tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    tj3Var23.m22102U();
                } else {
                    ty3.m22351a(do7.m10542r(), null, null, 0L, tj3Var23, 48, 12);
                }
                break;
            case 25:
                ye1 ye1Var24 = (ye1) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (!tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    tj3Var24.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var24, com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var24, 0, 0, 262142);
                }
                break;
            case 26:
                ye1 ye1Var25 = (ye1) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                tj3 tj3Var25 = (tj3) ye1Var25;
                if (!tj3Var25.m22099R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    tj3Var25.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, com.lingq.core.p012ui.R$string.remove_paid_lesson_warning), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var25, 0, 0, 262142);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var26 = (ye1) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                tj3 tj3Var26 = (tj3) ye1Var26;
                if (!tj3Var26.m22099R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    tj3Var26.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var26, com.lingq.core.p012ui.R$string.remove_lesson_warning), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var26, 0, 0, 262142);
                }
                break;
            case 28:
                ye1 ye1Var27 = (ye1) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                tj3 tj3Var27 = (tj3) ye1Var27;
                if (!tj3Var27.m22099R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    tj3Var27.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var27, com.lingq.core.p012ui.R$string.course_download_course), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var27, 0, 0, 262142);
                }
                break;
            default:
                ye1 ye1Var28 = (ye1) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                tj3 tj3Var28 = (tj3) ye1Var28;
                if (!tj3Var28.m22099R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    tj3Var28.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var28, com.lingq.core.p012ui.R$string.course_download_course_desc), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var28, 0, 0, 262142);
                }
                break;
        }
        return xfaVar;
    }
}
