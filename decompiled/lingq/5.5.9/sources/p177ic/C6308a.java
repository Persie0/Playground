package p177ic;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.activity.result.C0204c;
import p378s3.C8952a;
import p378s3.C8953b;
import p378s3.C8954c;

/* JADX INFO: renamed from: ic.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6308a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f36523a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C8953b f36524b = new C8953b();

    /* JADX INFO: renamed from: c */
    public static final C8952a f36525c = new C8952a();

    /* JADX INFO: renamed from: d */
    public static final C8954c f36526d = new C8954c();

    /* JADX INFO: renamed from: e */
    public static final DecelerateInterpolator f36527e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m12936a(float f3, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f3;
        }
        return f13 >= f12 ? f10 : C0204c.m845d(f10, f3, (f13 - f11) / (f12 - f11), f3);
    }

    /* JADX INFO: renamed from: b */
    public static int m12937b(float f3, int i10, int i11) {
        return Math.round(f3 * (i11 - i10)) + i10;
    }
}
