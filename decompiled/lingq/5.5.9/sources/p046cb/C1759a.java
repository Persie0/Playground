package p046cb;

import ae.C0062b;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.ActivityC0979t;
import bb.C1350a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.api.AbstractC2543b;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import p070db.C5129i;
import p070db.C5133m;
import p136gc.C5752h;
import p152hb.C5986l;
import p152hb.C6020w0;
import p176ib.C6252a0;
import p176ib.C6272i;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1759a extends AbstractC2543b<GoogleSignInOptions> {

    /* JADX INFO: renamed from: k */
    public static int f9659k = 1;

    public C1759a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C1350a.f8182a, googleSignInOptions, new AbstractC2543b.a(new C8573r0(), Looper.getMainLooper()));
    }

    public C1759a(ActivityC0979t activityC0979t, GoogleSignInOptions googleSignInOptions) {
        C2542a<GoogleSignInOptions> c2542a = C1350a.f8182a;
        C8573r0 c8573r0 = new C8573r0();
        Looper mainLooper = activityC0979t.getMainLooper();
        C6272i.m12916j(mainLooper, "Looper must not be null.");
        super(activityC0979t, activityC0979t, c2542a, googleSignInOptions, new AbstractC2543b.a(c8573r0, mainLooper));
    }

    /* JADX INFO: renamed from: b */
    public final void m5487b() {
        BasePendingResult c5129i;
        boolean z10 = m5488c() == 3;
        C5133m.f33116a.m13287a("Signing out", new Object[0]);
        C5133m.m10913c(this.f13887a);
        C6020w0 c6020w0 = this.f13894h;
        if (z10) {
            Status status = Status.f13873f;
            C6272i.m12916j(status, "Result must not be null");
            c5129i = new C5986l(c6020w0);
            c5129i.m7567f(status);
        } else {
            c5129i = new C5129i(c6020w0);
            c6020w0.m12471j(c5129i);
        }
        c5129i.m7562a(new C6252a0(c5129i, new C5752h(), new C0062b()));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m5488c() {
        int i10;
        try {
            i10 = f9659k;
            if (i10 == 1) {
                Context context = this.f13887a;
                C2548c c2548c = C2548c.f13920d;
                int iMo7586c = c2548c.mo7586c(context, 12451000);
                if (iMo7586c == 0) {
                    i10 = 4;
                    f9659k = 4;
                } else if (c2548c.mo7585a(context, iMo7586c, null) != null || DynamiteModule.m7624a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f9659k = 2;
                } else {
                    i10 = 3;
                    f9659k = 3;
                }
            }
        } finally {
        }
        return i10;
    }
}
