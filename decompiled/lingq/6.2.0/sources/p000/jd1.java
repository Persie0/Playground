package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.chat.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jd1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45436a;

    public /* synthetic */ jd1(int i) {
        this.f45436a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f45436a;
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
                    p04 p04VarM17721b = yad.f69586b;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("AutoMirrored.Filled.ViewSidebar", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i2 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        f57 f57Var = new f57();
                        f57Var.m11553h(16.0f, 20.0f);
                        f57Var.m11549d(2.0f);
                        f57Var.m11556k(4.0f);
                        f57Var.m11550e(14.0f);
                        f57Var.m11556k(20.0f);
                        f57Var.m11546a();
                        f57Var.m11553h(18.0f, 8.0f);
                        f57Var.m11550e(4.0f);
                        f57Var.m11556k(4.0f);
                        f57Var.m11550e(-4.0f);
                        f57Var.m11556k(8.0f);
                        f57Var.m11546a();
                        f57Var.m11553h(18.0f, 20.0f);
                        f57Var.m11550e(4.0f);
                        f57Var.m11557l(-4.0f);
                        f57Var.m11550e(-4.0f);
                        f57Var.m11556k(20.0f);
                        f57Var.m11546a();
                        f57Var.m11553h(18.0f, 14.0f);
                        f57Var.m11550e(4.0f);
                        f57Var.m11557l(-4.0f);
                        f57Var.m11550e(-4.0f);
                        f57Var.m11556k(14.0f);
                        f57Var.m11546a();
                        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        yad.f69586b = p04VarM17721b;
                    }
                    ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var, R$string.chat_open_sidebar), null, 0L, tj3Var, 0, 12);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    ty3.m22351a(AbstractC3122is.m14109w(), vz1.m23620a0(tj3Var4, R$string.lynx_settings), null, 0L, tj3Var4, 0, 12);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    ty3.m22351a(wdd.m23854a(), vz1.m23620a0(tj3Var5, com.lingq.core.p012ui.R$string.ui_change_font), null, 0L, tj3Var5, 0, 12);
                }
                break;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_import_s, tj3Var6, 0), vz1.m23620a0(tj3Var6, com.lingq.core.p012ui.R$string.feed_import), c99.m4422o(b16Var, 22.0f), 0L, tj3Var6, 392, 8);
                }
                break;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    ty3.m22351a(t3d.m21836b(), vz1.m23620a0(tj3Var7, com.lingq.core.p012ui.R$string.ui_send), null, 0L, tj3Var7, 0, 12);
                }
                break;
            case 7:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var8, 0), vz1.m23620a0(tj3Var8, com.lingq.core.p012ui.R$string.ui_play_audio), null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51799a.f55875s, tj3Var8, 8, 4);
                }
                break;
            case 8:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    ty3.m22351a(u8d.m22577a(), vz1.m23620a0(tj3Var9, com.lingq.core.p012ui.R$string.ui_copy_text), null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55875s, tj3Var9, 0, 4);
                }
                break;
            case 9:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var10, R$string.search_chats), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                }
                break;
            case 10:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    ty3.m22351a(do7.m10542r(), null, null, 0L, tj3Var11, 48, 12);
                }
                break;
            case 11:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    p04 p04VarM17721b2 = o7d.f53962a;
                    if (p04VarM17721b2 == null) {
                        o04 o04Var2 = new o04("Rounded.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = soa.f61116a;
                        pd9 pd9Var2 = new pd9(aa1.f403b);
                        f57 f57VarM17730e = AbstractC3393o1.m17730e(18.3f, 5.71f);
                        f57VarM17730e.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        f57VarM17730e.m11551f(12.0f, 10.59f);
                        f57VarM17730e.m11551f(7.11f, 5.7f);
                        f57VarM17730e.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        f57VarM17730e.m11551f(10.59f, 12.0f);
                        f57VarM17730e.m11551f(5.7f, 16.89f);
                        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        f57VarM17730e.m11551f(12.0f, 13.41f);
                        f57VarM17730e.m11552g(4.89f, 4.89f);
                        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        f57VarM17730e.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        f57VarM17730e.m11551f(13.41f, 12.0f);
                        f57VarM17730e.m11552g(4.89f, -4.89f);
                        f57VarM17730e.m11548c(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                        f57VarM17730e.m11546a();
                        o04.m17720a(o04Var2, f57VarM17730e.f38440a, pd9Var2);
                        p04VarM17721b2 = o04Var2.m17721b();
                        o7d.f53962a = p04VarM17721b2;
                    }
                    ty3.m22351a(p04VarM17721b2, vz1.m23620a0(tj3Var12, com.lingq.core.p012ui.R$string.ui_clear_search), null, 0L, tj3Var12, 0, 12);
                }
                break;
            case 12:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    ty3.m22351a(h2d.m13016b(), vz1.m23620a0(tj3Var13, R$string.chat_new_chat), null, 0L, tj3Var13, 0, 12);
                }
                break;
            case 13:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (!tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    tj3Var14.m22102U();
                } else {
                    p04 p04VarM17721b3 = y6d.f69389a;
                    if (p04VarM17721b3 == null) {
                        o04 o04Var3 = new o04("AutoMirrored.Filled.Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i4 = soa.f61116a;
                        pd9 pd9Var3 = new pd9(aa1.f403b);
                        f57 f57Var2 = new f57();
                        f57Var2.m11553h(20.0f, 2.0f);
                        f57Var2.m11551f(4.0f, 2.0f);
                        f57Var2.m11548c(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        f57Var2.m11551f(2.0f, 22.0f);
                        f57Var2.m11552g(4.0f, -4.0f);
                        f57Var2.m11550e(14.0f);
                        f57Var2.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        f57Var2.m11551f(22.0f, 4.0f);
                        f57Var2.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        f57Var2.m11546a();
                        f57Var2.m11553h(6.0f, 9.0f);
                        f57Var2.m11550e(12.0f);
                        f57Var2.m11557l(2.0f);
                        f57Var2.m11551f(6.0f, 11.0f);
                        f57Var2.m11551f(6.0f, 9.0f);
                        f57Var2.m11546a();
                        f57Var2.m11553h(14.0f, 14.0f);
                        f57Var2.m11551f(6.0f, 14.0f);
                        f57Var2.m11557l(-2.0f);
                        f57Var2.m11550e(8.0f);
                        f57Var2.m11557l(2.0f);
                        f57Var2.m11546a();
                        f57Var2.m11553h(18.0f, 8.0f);
                        f57Var2.m11551f(6.0f, 8.0f);
                        f57Var2.m11551f(6.0f, 6.0f);
                        f57Var2.m11550e(12.0f);
                        f57Var2.m11557l(2.0f);
                        f57Var2.m11546a();
                        o04.m17720a(o04Var3, f57Var2.f38440a, pd9Var3);
                        p04VarM17721b3 = o04Var3.m17721b();
                        y6d.f69389a = p04VarM17721b3;
                    }
                    ty3.m22351a(p04VarM17721b3, null, null, ((ms5) tj3Var14.m22128k(ps5.f56764b)).f51799a.f55852f, tj3Var14, 48, 4);
                }
                break;
            case 14:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (!tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tj3Var15.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var15, R$string.chat_delete), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                }
                break;
            case 15:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (!tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    tj3Var16.m22102U();
                } else {
                    p04 p04VarM17721b4 = xad.f68016a;
                    if (p04VarM17721b4 == null) {
                        o04 o04Var4 = new o04("Rounded.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = soa.f61116a;
                        pd9 pd9Var4 = new pd9(aa1.f403b);
                        f57 f57VarM17730e2 = AbstractC3393o1.m17730e(6.0f, 19.0f);
                        f57VarM17730e2.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        f57VarM17730e2.m11550e(8.0f);
                        f57VarM17730e2.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        f57VarM17730e2.m11556k(9.0f);
                        f57VarM17730e2.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        f57VarM17730e2.m11549d(8.0f);
                        f57VarM17730e2.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57VarM17730e2.m11557l(10.0f);
                        f57VarM17730e2.m11546a();
                        f57VarM17730e2.m11553h(18.0f, 4.0f);
                        f57VarM17730e2.m11550e(-2.5f);
                        f57VarM17730e2.m11552g(-0.71f, -0.71f);
                        f57VarM17730e2.m11548c(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
                        f57VarM17730e2.m11549d(9.91f);
                        f57VarM17730e2.m11548c(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
                        f57VarM17730e2.m11551f(8.5f, 4.0f);
                        f57VarM17730e2.m11549d(6.0f);
                        f57VarM17730e2.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        f57VarM17730e2.m11555j(0.45f, 1.0f, 1.0f, 1.0f);
                        f57VarM17730e2.m11550e(12.0f);
                        f57VarM17730e2.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        f57VarM17730e2.m11555j(-0.45f, -1.0f, -1.0f, -1.0f);
                        f57VarM17730e2.m11546a();
                        o04.m17720a(o04Var4, f57VarM17730e2.f38440a, pd9Var4);
                        p04VarM17721b4 = o04Var4.m17721b();
                        xad.f68016a = p04VarM17721b4;
                    }
                    ty3.m22351a(p04VarM17721b4, vz1.m23620a0(tj3Var16, R$string.chat_delete), null, 0L, tj3Var16, 0, 12);
                }
                break;
            case 16:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (!tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tj3Var17.m22102U();
                } else {
                    p04 p04VarM17721b5 = v8d.f65032a;
                    if (p04VarM17721b5 == null) {
                        o04 o04Var5 = new o04("Outlined.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = soa.f61116a;
                        pd9 pd9Var5 = new pd9(aa1.f403b);
                        f57 f57Var3 = new f57();
                        f57Var3.m11553h(16.0f, 1.0f);
                        f57Var3.m11551f(4.0f, 1.0f);
                        f57Var3.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57Var3.m11557l(14.0f);
                        f57Var3.m11550e(2.0f);
                        f57Var3.m11551f(4.0f, 3.0f);
                        f57Var3.m11550e(12.0f);
                        f57Var3.m11551f(16.0f, 1.0f);
                        f57Var3.m11546a();
                        f57Var3.m11553h(19.0f, 5.0f);
                        f57Var3.m11551f(8.0f, 5.0f);
                        f57Var3.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        f57Var3.m11557l(14.0f);
                        f57Var3.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        f57Var3.m11550e(11.0f);
                        f57Var3.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        f57Var3.m11551f(21.0f, 7.0f);
                        f57Var3.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        f57Var3.m11546a();
                        f57Var3.m11553h(19.0f, 21.0f);
                        f57Var3.m11551f(8.0f, 21.0f);
                        f57Var3.m11551f(8.0f, 7.0f);
                        f57Var3.m11550e(11.0f);
                        f57Var3.m11557l(14.0f);
                        f57Var3.m11546a();
                        o04.m17720a(o04Var5, f57Var3.f38440a, pd9Var5);
                        p04VarM17721b5 = o04Var5.m17721b();
                        v8d.f65032a = p04VarM17721b5;
                    }
                    ty3.m22351a(p04VarM17721b5, null, null, 0L, tj3Var17, 48, 12);
                }
                break;
            case 17:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (!tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tj3Var18.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_playlist_icon, tj3Var18, 0), null, null, ((ms5) tj3Var18.m22128k(ps5.f56764b)).f51799a.f55873q, tj3Var18, 56, 4);
                }
                break;
            case 18:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (!tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tj3Var19.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var19, com.lingq.core.p012ui.R$string.lesson_add_to_playlist), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var19, 0, 0, 262142);
                }
                break;
            case 19:
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (!tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj3Var20.m22102U();
                } else {
                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_playlist_icon, tj3Var20, 0);
                    ((fe9) tj3Var20.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var20, 56, 8);
                }
                break;
            case 20:
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (!tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    tj3Var21.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var21, com.lingq.feature.collections.R$string.texts_play_course), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var21, 0, 0, 262142);
                }
                break;
            case 21:
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (!tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    tj3Var22.m22102U();
                } else {
                    y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_headphones, tj3Var22, 0);
                    ((fe9) tj3Var22.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var22, 56, 8);
                }
                break;
            case 22:
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (!tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    tj3Var23.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var23, com.lingq.feature.collections.R$string.lesson_remove_all_lessons), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var23, 0, 0, 262142);
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var24 = (ye1) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (!tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    tj3Var24.m22102U();
                } else {
                    y27 y27VarM18236U3 = AbstractC3423or.m18236U(R$drawable.ic_trash, tj3Var24, 0);
                    ((fe9) tj3Var24.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var24, 56, 8);
                }
                break;
            case 24:
                ye1 ye1Var25 = (ye1) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                tj3 tj3Var25 = (tj3) ye1Var25;
                if (!tj3Var25.m22099R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    tj3Var25.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, com.lingq.core.p012ui.R$string.card_report), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var25, 0, 0, 262142);
                }
                break;
            case 25:
                ye1 ye1Var26 = (ye1) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                tj3 tj3Var26 = (tj3) ye1Var26;
                if (!tj3Var26.m22099R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    tj3Var26.m22102U();
                } else {
                    y27 y27VarM18236U4 = AbstractC3423or.m18236U(R$drawable.ic_report, tj3Var26, 0);
                    ((fe9) tj3Var26.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var26, 56, 8);
                }
                break;
            case 26:
                ye1 ye1Var27 = (ye1) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                tj3 tj3Var27 = (tj3) ye1Var27;
                if (!tj3Var27.m22099R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    tj3Var27.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var27, com.lingq.core.p012ui.R$string.course_not_interested_in_course), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var27, 0, 0, 262142);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var28 = (ye1) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                tj3 tj3Var28 = (tj3) ye1Var28;
                if (!tj3Var28.m22099R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    tj3Var28.m22102U();
                } else {
                    y27 y27VarM18236U5 = AbstractC3423or.m18236U(R$drawable.ic_no_interested_in_course, tj3Var28, 0);
                    ((fe9) tj3Var28.m22128k(ge9.f40637a)).getClass();
                    ty3.m22352b(y27VarM18236U5, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var28, 56, 8);
                }
                break;
            case 28:
                ye1 ye1Var29 = (ye1) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                tj3 tj3Var29 = (tj3) ye1Var29;
                if (!tj3Var29.m22099R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    tj3Var29.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_menu, tj3Var29, 0), null, c99.m4422o(b16Var, 16.0f), ((ms5) tj3Var29.m22128k(ps5.f56764b)).f51799a.f55816A, tj3Var29, 440, 0);
                }
                break;
            default:
                ye1 ye1Var30 = (ye1) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                tj3 tj3Var30 = (tj3) ye1Var30;
                if (!tj3Var30.m22099R(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    tj3Var30.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
