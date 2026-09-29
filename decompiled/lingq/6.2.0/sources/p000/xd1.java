package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xd1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68090a;

    public /* synthetic */ xd1(int i) {
        this.f68090a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f68090a;
        int i2 = 7;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var, R$string.welcome_tell_us_your_level), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var2, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var2, 0, 12);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.onboarding_notification_prompt_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), null, null, 0L, tj3Var4, 48, 12);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var5, R$string.welcome_create_profile), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                }
                break;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.welcome_name), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                }
                break;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b("", null, ((ms5) tj3Var7.m22128k(vh9Var)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(vh9Var)).f51800b.f71408l, tj3Var7, 6, 0, 131066);
                }
                break;
            case 7:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var8, R$string.welcome_email), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                }
                break;
            case 8:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var9, R$string.welcome_password), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                }
                break;
            case 9:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b("", null, ((ms5) tj3Var10.m22128k(vh9Var2)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var10.m22128k(vh9Var2)).f51800b.f71408l, tj3Var10, 6, 0, 131066);
                }
                break;
            case 10:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var11, com.lingq.core.p012ui.R$string.welcome_username), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var11, 0, 0, 262142);
                }
                break;
            case 11:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var12, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var12, 0, 12);
                }
                break;
            case 12:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, R$string.welcome_referral_id), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                }
                break;
            case 13:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (!tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    tj3Var14.m22102U();
                } else {
                    vh9 vh9Var3 = ps5.f56764b;
                    lw9.m16554b("", null, ((ms5) tj3Var14.m22128k(vh9Var3)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var14.m22128k(vh9Var3)).f51800b.f71408l, tj3Var14, 6, 0, 131066);
                }
                break;
            case 14:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (!tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tj3Var15.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var15, R$string.welcome_what_topics_love), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                }
                break;
            case 15:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (!tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    tj3Var16.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var16, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var16, 0, 12);
                }
                break;
            case 16:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (!tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tj3Var17.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var17, com.lingq.core.p012ui.R$string.ui_back), null, ((ms5) tj3Var17.m22128k(ps5.f56764b)).f51799a.f55870o, tj3Var17, 0, 4);
                }
                break;
            case 17:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (!tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tj3Var18.m22102U();
                } else {
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_audio_tts, tj3Var18, 0), vz1.m23620a0(tj3Var18, com.lingq.core.p012ui.R$string.ui_play_word_audio), c99.m4411d(b16.f7762a, 1.0f), null, null, 0.0f, new qd0(5, ((ms5) tj3Var18.m22128k(ps5.f56764b)).f51799a.f55875s), tj3Var18, 392, 56);
                }
                break;
            case 18:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (!tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tj3Var19.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var19, com.lingq.feature.playlist.R$string.playlist_archive_failed), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var19, 0, 0, 262142);
                }
                break;
            case 19:
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (!tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj3Var20.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var20, com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var20, 0, 0, 262142);
                }
                break;
            case 20:
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (!tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    tj3Var21.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var21, com.lingq.feature.playlist.R$string.playlist_archive_confirmation_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var21, 0, 0, 262142);
                }
                break;
            case 21:
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (!tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    tj3Var22.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var22, com.lingq.feature.playlist.R$string.playlist_archive_confirmation_message), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var22, 0, 0, 262142);
                }
                break;
            case 22:
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (!tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    tj3Var23.m22102U();
                } else {
                    p04 p04VarM17721b = vbd.f65175a;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("Rounded.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        f57 f57Var = new f57();
                        f57Var.m11553h(3.0f, 17.46f);
                        f57Var.m11557l(3.04f);
                        f57Var.m11548c(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
                        f57Var.m11550e(3.04f);
                        f57Var.m11548c(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
                        f57Var.m11551f(17.81f, 9.94f);
                        f57Var.m11552g(-3.75f, -3.75f);
                        f57Var.m11551f(3.15f, 17.1f);
                        f57Var.m11548c(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.36f);
                        f57Var.m11546a();
                        f57Var.m11553h(20.71f, 7.04f);
                        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        f57Var.m11552g(-2.34f, -2.34f);
                        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        f57Var.m11552g(-1.83f, 1.83f);
                        f57Var.m11552g(3.75f, 3.75f);
                        f57Var.m11552g(1.83f, -1.83f);
                        f57Var.m11546a();
                        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        vbd.f65175a = p04VarM17721b;
                    }
                    ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var23, com.lingq.core.p012ui.R$string.ui_edit), null, 0L, tj3Var23, 0, 12);
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var24 = (ye1) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (!tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    tj3Var24.m22102U();
                } else {
                    p04 p04VarM17721b2 = zpb.f71950f;
                    if (p04VarM17721b2 == null) {
                        o04 o04Var2 = new o04("Rounded.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = soa.f61116a;
                        pd9 pd9Var2 = new pd9(aa1.f403b);
                        f57 f57VarM17730e = AbstractC3393o1.m17730e(6.0f, 10.0f);
                        f57VarM17730e.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57VarM17730e.m11555j(0.9f, 2.0f, 2.0f, 2.0f);
                        f57VarM17730e.m11555j(2.0f, -0.9f, 2.0f, -2.0f);
                        f57VarM17730e.m11555j(-0.9f, -2.0f, -2.0f, -2.0f);
                        f57VarM17730e.m11546a();
                        f57VarM17730e.m11553h(18.0f, 10.0f);
                        f57VarM17730e.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57VarM17730e.m11555j(0.9f, 2.0f, 2.0f, 2.0f);
                        f57VarM17730e.m11555j(2.0f, -0.9f, 2.0f, -2.0f);
                        f57VarM17730e.m11555j(-0.9f, -2.0f, -2.0f, -2.0f);
                        f57VarM17730e.m11546a();
                        f57VarM17730e.m11553h(12.0f, 10.0f);
                        f57VarM17730e.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57VarM17730e.m11555j(0.9f, 2.0f, 2.0f, 2.0f);
                        f57VarM17730e.m11555j(2.0f, -0.9f, 2.0f, -2.0f);
                        f57VarM17730e.m11555j(-0.9f, -2.0f, -2.0f, -2.0f);
                        f57VarM17730e.m11546a();
                        o04.m17720a(o04Var2, f57VarM17730e.f38440a, pd9Var2);
                        p04VarM17721b2 = o04Var2.m17721b();
                        zpb.f71950f = p04VarM17721b2;
                    }
                    ty3.m22351a(p04VarM17721b2, vz1.m23620a0(tj3Var24, com.lingq.core.p012ui.R$string.ui_menu), null, 0L, tj3Var24, 0, 12);
                }
                break;
            case 24:
                ye1 ye1Var25 = (ye1) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                tj3 tj3Var25 = (tj3) ye1Var25;
                if (!tj3Var25.m22099R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    tj3Var25.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, com.lingq.core.p012ui.R$string.generate_lesson_audio), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var25, 0, 0, 262142);
                }
                break;
            case 25:
                ye1 ye1Var26 = (ye1) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                tj3 tj3Var26 = (tj3) ye1Var26;
                if (!tj3Var26.m22099R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    tj3Var26.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var26, com.lingq.feature.playlist.R$string.lesson_generate_unavailable), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var26, 0, 0, 262142);
                }
                break;
            case 26:
                ye1 ye1Var27 = (ye1) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                tj3 tj3Var27 = (tj3) ye1Var27;
                if (!tj3Var27.m22099R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    tj3Var27.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var27, com.lingq.feature.playlist.R$string.tts_not_support), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var27, 0, 0, 262142);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var28 = (ye1) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                tj3 tj3Var28 = (tj3) ye1Var28;
                if (!tj3Var28.m22099R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    tj3Var28.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var28, com.lingq.core.p012ui.R$string.generate_lesson_audio), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var28, 0, 0, 262142);
                }
                break;
            case 28:
                ye1 ye1Var29 = (ye1) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                tj3 tj3Var29 = (tj3) ye1Var29;
                if (!tj3Var29.m22099R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    tj3Var29.m22102U();
                } else {
                    List listM23605K = vz1.m23605K(new Playlist("en::My First Playlist", 1, "My First Playlist"), new Playlist("en::Favorites", 2, "Favorites"));
                    Object objM22097O = tj3Var29.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new C3013ft(24);
                        tj3Var29.m22131l0(objM22097O);
                    }
                    vi3 vi3Var = (vi3) objM22097O;
                    Object objM22097O2 = tj3Var29.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new C3013ft(25);
                        tj3Var29.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O2;
                    Object objM22097O3 = tj3Var29.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C3013ft(26);
                        tj3Var29.m22131l0(objM22097O3);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O3;
                    Object objM22097O4 = tj3Var29.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new C3288l7(i2);
                        tj3Var29.m22131l0(objM22097O4);
                    }
                    d32.m10057q(listM23605K, true, true, vi3Var, vi3Var2, vi3Var3, (ui3) objM22097O4, tj3Var29, 1797552);
                }
                break;
            default:
                ye1 ye1Var30 = (ye1) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                tj3 tj3Var30 = (tj3) ye1Var30;
                if (!tj3Var30.m22099R(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    tj3Var30.m22102U();
                } else {
                    List listM23604J = vz1.m23604J(new Playlist("en::My First Playlist", 1, "My First Playlist"));
                    Object objM22097O5 = tj3Var30.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new C3013ft(21);
                        tj3Var30.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O5;
                    Object objM22097O6 = tj3Var30.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new C3013ft(22);
                        tj3Var30.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var5 = (vi3) objM22097O6;
                    Object objM22097O7 = tj3Var30.m22097O();
                    if (objM22097O7 == p84Var) {
                        objM22097O7 = new C3013ft(23);
                        tj3Var30.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var6 = (vi3) objM22097O7;
                    Object objM22097O8 = tj3Var30.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new C3288l7(i2);
                        tj3Var30.m22131l0(objM22097O8);
                    }
                    d32.m10057q(listM23604J, false, false, vi3Var4, vi3Var5, vi3Var6, (ui3) objM22097O8, tj3Var30, 1797552);
                }
                break;
        }
        return xfaVar;
    }
}
