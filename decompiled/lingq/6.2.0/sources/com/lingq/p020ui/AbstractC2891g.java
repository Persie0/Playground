package com.lingq.p020ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import com.lingq.p020ui.AbstractC2891g;
import p000.aa1;
import p000.ci8;
import p000.d32;
import p000.h0a;
import p000.p84;
import p000.r43;
import p000.ra5;
import p000.rp1;
import p000.sm5;
import p000.tj3;
import p000.tp1;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.yq7;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.ui.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2891g {
    /* JADX INFO: renamed from: a */
    public static final void m9817a(final yq7 yq7Var, final ui3 ui3Var, final vi3 vi3Var, final vi3 vi3Var2, final ui3 ui3Var2, final vi3 vi3Var3, final vi3 vi3Var4, final ui3 ui3Var3, final vi3 vi3Var5, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        yq7Var.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        ui3Var2.getClass();
        vi3Var3.getClass();
        vi3Var4.getClass();
        ui3Var3.getClass();
        vi3Var5.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-195693659);
        int i2 = (tj3Var2.m22124i(vi3Var5) ? 67108864 : 33554432) | i | (tj3Var2.m22120g(yq7Var) ? 4 : 2) | (tj3Var2.m22124i(ui3Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | (tj3Var2.m22124i(vi3Var2) ? 2048 : 1024) | (tj3Var2.m22124i(ui3Var2) ? 16384 : 8192) | (tj3Var2.m22124i(vi3Var3) ? 131072 : 65536) | (tj3Var2.m22124i(vi3Var4) ? 1048576 : 524288) | (tj3Var2.m22124i(ui3Var3) ? 8388608 : 4194304);
        if (tj3Var2.m22099R(i2 & 1, (38347923 & i2) != 38347922)) {
            Boolean boolValueOf = Boolean.valueOf(yq7Var.f70296c);
            boolean z = ((i2 & 14) == 4) | ((234881024 & i2) == 67108864);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new RatingPromptOverlayKt$RatingPromptOverlay$1$1(yq7Var, vi3Var5, null);
                tj3Var2.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O, boolValueOf);
            if (yq7Var.f70294a) {
                tj3Var2.m22111b0(-1638652090);
                C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
                boolean z2 = (i2 & 112) == 32;
                Object objM22097O2 = tj3Var2.m22097O();
                if (z2 || objM22097O2 == p84Var) {
                    objM22097O2 = new RatingPromptOverlayKt$RatingPromptOverlay$2$1(ui3Var, null);
                    tj3Var2.m22131l0(objM22097O2);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O2, xfa.f68157a);
                AbstractC0231g.m1150c(ui3Var3, null, c0269zM1154g, 0.0f, false, null, aa1.f411j, 0L, 0L, null, null, null, ci8.m4703P(1320713566, new ra5(yq7Var, vi3Var3, vi3Var, ui3Var2, vi3Var2, vi3Var4, 1), tj3Var2), tj3Var2, ((i2 >> 21) & 14) | 1572864, 3078, 7098);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22111b0(-1637922691);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(ui3Var, vi3Var, vi3Var2, ui3Var2, vi3Var3, vi3Var4, ui3Var3, vi3Var5, i) { // from class: zq7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f71977b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f71978c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ vi3 f71979d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ui3 f71980e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vi3 f71981f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ vi3 f71982g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ui3 f71983h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ vi3 f71984i;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2891g.m9817a(this.f71976a, this.f71977b, this.f71978c, this.f71979d, this.f71980e, this.f71981f, this.f71982g, this.f71983h, this.f71984i, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9818b(String str, Exception exc) {
        String strConcat = "[PlayReview] ".concat(str);
        sm5.Companion.getClass();
        if (exc != null) {
            h0a.f41641a.mo11431b(strConcat, new Object[0]);
        } else {
            h0a.f41641a.mo11430a(strConcat, new Object[0]);
        }
        r43 r43VarM20289a = r43.m20289a();
        tp1 tp1Var = r43VarM20289a.f58599a;
        tp1Var.f62668o.f13668a.m9856b(new rp1(tp1Var, System.currentTimeMillis() - tp1Var.f62657d, strConcat));
        if (exc == null) {
            exc = new PlayReviewLog(str);
        }
        r43VarM20289a.m20290b(exc);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9819c(Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + activity.getPackageName()));
        intent.addFlags(1208483840);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + activity.getPackageName())));
        }
    }
}
