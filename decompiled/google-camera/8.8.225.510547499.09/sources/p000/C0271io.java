package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: io */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0271io {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f31622a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    private static C0271io f31623b;

    /* JADX INFO: renamed from: c */
    private C0833ms f31624c;

    /* JADX INFO: renamed from: b */
    public static synchronized PorterDuffColorFilter m11551b(int i, PorterDuff.Mode mode) {
        return C0833ms.m16836b(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C0271io m11552d() {
        if (f31623b == null) {
            m11553f();
        }
        return f31623b;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m11553f() {
        if (f31623b == null) {
            C0271io c0271io = new C0271io();
            f31623b = c0271io;
            c0271io.f31624c = C0833ms.m16837e();
            f31623b.f31624c.m16845g(new C0270in());
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized ColorStateList m11554a(Context context, int i) {
        return this.f31624c.m16841a(context, i);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m11555c(Context context, int i) {
        return this.f31624c.m16842c(context, i);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m11556e(Context context) {
        this.f31624c.m16844f(context);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Drawable m11557g(Context context, int i) {
        return this.f31624c.m16843d(context, i, true);
    }
}
