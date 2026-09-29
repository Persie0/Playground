package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.playlists.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zd1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71380a;

    public /* synthetic */ zd1(int i) {
        this.f71380a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71380a;
        int i2 = 5;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        int i3 = 2;
        boolean z = false;
        int i4 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22351a(eqb.m11322a(), vz1.m23620a0(tj3Var, R$string.ui_menu), null, 0L, tj3Var, 0, 12);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, com.lingq.core.p012ui.R$string.ui_edit), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.ui_delete), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.core.p012ui.R$string.ui_more), null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55842a, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262106);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_chevron_right_s, tj3Var5, 0), vz1.m23620a0(tj3Var5, com.lingq.core.p012ui.R$string.ui_more), null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51799a.f55842a, tj3Var5, 8, 4);
                }
                break;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    ty3.m22351a(h2d.m13016b(), vz1.m23620a0(tj3Var6, com.lingq.feature.token.R$string.token_add_meaning_hint), null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51799a.f55875s, tj3Var6, 0, 4);
                }
                break;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    TokenMeaning tokenMeaning = new TokenMeaning(101, "pt", "ter", 10, false, null, false, 0, DescriptorProtos.Edition.EDITION_2023_VALUE);
                    Object objM22097O = tj3Var7.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new C3013ft(29);
                        tj3Var7.m22131l0(objM22097O);
                    }
                    vi3 vi3Var = (vi3) objM22097O;
                    Object objM22097O2 = tj3Var7.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new ae1(z ? 1 : 0);
                        tj3Var7.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O2;
                    Object objM22097O3 = tj3Var7.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new ae1(i4);
                        tj3Var7.m22131l0(objM22097O3);
                    }
                    bgc.m3707a(tokenMeaning, false, true, vi3Var, vi3Var2, (vi3) objM22097O3, tj3Var7, 224688);
                }
                break;
            case 7:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    TokenMeaning tokenMeaning2 = new TokenMeaning(-33, "en", "AI generated hint text", 0, false, null, true, 0, 760);
                    Object objM22097O4 = tj3Var8.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new ae1(i3);
                        tj3Var8.m22131l0(objM22097O4);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O4;
                    Object objM22097O5 = tj3Var8.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new ae1(3);
                        tj3Var8.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O5;
                    Object objM22097O6 = tj3Var8.m22097O();
                    if (objM22097O6 == p84Var) {
                        objM22097O6 = new ae1(4);
                        tj3Var8.m22131l0(objM22097O6);
                    }
                    bgc.m3707a(tokenMeaning2, false, false, vi3Var3, vi3Var4, (vi3) objM22097O6, tj3Var8, 224688);
                }
                break;
            case 8:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    TokenMeaning tokenMeaning3 = new TokenMeaning(102, "pt", "possuir", 8, false, null, false, 0, DescriptorProtos.Edition.EDITION_2023_VALUE);
                    Object objM22097O7 = tj3Var9.m22097O();
                    if (objM22097O7 == p84Var) {
                        objM22097O7 = new ae1(i2);
                        tj3Var9.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var5 = (vi3) objM22097O7;
                    Object objM22097O8 = tj3Var9.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new C3013ft(27);
                        tj3Var9.m22131l0(objM22097O8);
                    }
                    vi3 vi3Var6 = (vi3) objM22097O8;
                    Object objM22097O9 = tj3Var9.m22097O();
                    if (objM22097O9 == p84Var) {
                        objM22097O9 = new C3013ft(28);
                        tj3Var9.m22131l0(objM22097O9);
                    }
                    bgc.m3707a(tokenMeaning3, true, false, vi3Var5, vi3Var6, (vi3) objM22097O9, tj3Var9, 224688);
                }
                break;
            case 9:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_playlist_backwards, tj3Var10, 0), vz1.m23620a0(tj3Var10, com.lingq.core.p012ui.R$string.ui_back_5_seconds), c99.m4422o(b16Var, 20.0f), aa1.f406e, tj3Var10, 3464, 0);
                }
                break;
            case 10:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_playlist_forward, tj3Var11, 0), vz1.m23620a0(tj3Var11, com.lingq.core.p012ui.R$string.ui_forward_5_seconds), c99.m4422o(b16Var, 20.0f), aa1.f406e, tj3Var11, 3464, 0);
                }
                break;
            case 11:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    ty3.m22351a(ied.m13854a(), vz1.m23620a0(tj3Var12, com.lingq.feature.reader.R$string.reader_enter_fullscreen), c99.m4422o(b16Var, 20.0f), aa1.f406e, tj3Var12, 3456, 0);
                }
                break;
            case 12:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                }
                break;
            case 13:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (!tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    tj3Var14.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (!tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tj3Var15.m22102U();
                } else {
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_close_m, tj3Var15, 0), vz1.m23620a0(tj3Var15, com.lingq.core.p012ui.R$string.ui_close), c99.m4411d(b16Var, 1.0f), null, null, 0.0f, new qd0(5, ((ms5) tj3Var15.m22128k(ps5.f56764b)).f51799a.f55868n), tj3Var15, 392, 56);
                }
                break;
            case 15:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (!tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    tj3Var16.m22102U();
                } else {
                    String strM23620a0 = vz1.m23620a0(tj3Var16, com.lingq.feature.reader.R$string.rating_type_review);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, aa1.m198b(0.5f, ((ms5) tj3Var16.m22128k(vh9Var)).f51799a.f55870o), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var16.m22128k(vh9Var)).f51800b.f71407k, tj3Var16, 0, 0, 131066);
                }
                break;
            case 16:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (!tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tj3Var17.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.feature.player.R$drawable.ic_player_expand, tj3Var17, 0), vz1.m23620a0(tj3Var17, com.lingq.feature.reader.R$string.reader_expand_player), null, ((ms5) tj3Var17.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var17, 8, 4);
                }
                break;
            case 17:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (!tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tj3Var18.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.feature.player.R$drawable.ic_player_backwards, tj3Var18, 0), vz1.m23620a0(tj3Var18, com.lingq.feature.reader.R$string.reader_rewind), null, ((ms5) tj3Var18.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var18, 8, 4);
                }
                break;
            case 18:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (!tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tj3Var19.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_close_s, tj3Var19, 0), vz1.m23620a0(tj3Var19, com.lingq.feature.reader.R$string.reader_close_player), null, ((ms5) tj3Var19.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var19, 8, 4);
                }
                break;
            case 19:
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (!tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj3Var20.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_chevron_left_s, tj3Var20, 0), vz1.m23620a0(tj3Var20, com.lingq.feature.reader.R$string.reader_previous_lesson), null, ((ms5) tj3Var20.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var20, 8, 4);
                }
                break;
            case 20:
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (!tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    tj3Var21.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_chevron_right_s, tj3Var21, 0), vz1.m23620a0(tj3Var21, com.lingq.feature.reader.R$string.lesson_next_lesson), null, ((ms5) tj3Var21.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var21, 8, 4);
                }
                break;
            case 21:
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (!tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    tj3Var22.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var22, com.lingq.core.p012ui.R$string.settings_text_lesson_settings), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var22, 0, 0, 262142);
                }
                break;
            case 22:
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (!tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    tj3Var23.m22102U();
                } else {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var23, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var23, 0, 12);
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var24 = (ye1) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (!tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    tj3Var24.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var24, com.lingq.feature.library.R$string.remove_lesson_dialog_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var24, 0, 0, 262142);
                }
                break;
            case 24:
                ye1 ye1Var25 = (ye1) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                tj3 tj3Var25 = (tj3) ye1Var25;
                if (!tj3Var25.m22099R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    tj3Var25.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, com.lingq.feature.library.R$string.remove_lesson_dialog_message), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var25, 0, 0, 262142);
                }
                break;
            case 25:
                ye1 ye1Var26 = (ye1) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                tj3 tj3Var26 = (tj3) ye1Var26;
                if (!tj3Var26.m22099R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    tj3Var26.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var26, com.lingq.core.p012ui.R$string.welcome_are_you_sure), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var26, 0, 0, 262142);
                }
                break;
            case 26:
                ye1 ye1Var27 = (ye1) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                tj3 tj3Var27 = (tj3) ye1Var27;
                if (!tj3Var27.m22099R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    tj3Var27.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var27, com.lingq.core.p012ui.R$string.remove_paid_lesson_warning), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var27, 0, 0, 262142);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var28 = (ye1) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                tj3 tj3Var28 = (tj3) ye1Var28;
                if (!tj3Var28.m22099R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    tj3Var28.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var28, com.lingq.core.p012ui.R$string.card_report), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var28, 0, 0, 262142);
                }
                break;
            case 28:
                ye1 ye1Var29 = (ye1) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                tj3 tj3Var29 = (tj3) ye1Var29;
                if (!tj3Var29.m22099R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    tj3Var29.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var29, 0), vz1.m23620a0(tj3Var29, com.lingq.feature.review.R$string.review_play_audio), c99.m4422o(b16Var, 34.0f), 0L, tj3Var29, 392, 8);
                }
                break;
            default:
                ye1 ye1Var30 = (ye1) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                tj3 tj3Var30 = (tj3) ye1Var30;
                if (!tj3Var30.m22099R(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    tj3Var30.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var30, 0), vz1.m23620a0(tj3Var30, com.lingq.feature.review.R$string.review_play_audio), c99.m4422o(b16Var, 34.0f), 0L, tj3Var30, 392, 8);
                }
                break;
        }
        return xfaVar;
    }
}
