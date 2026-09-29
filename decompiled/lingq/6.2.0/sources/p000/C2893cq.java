package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: cq */
/* JADX INFO: loaded from: classes.dex */
public final class C2893cq {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f34364b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C2893cq f34365c;

    /* JADX INFO: renamed from: a */
    public a88 f34366a;

    /* JADX INFO: renamed from: a */
    public static synchronized C2893cq m9843a() {
        try {
            if (f34365c == null) {
                m9845d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f34365c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m9844c(int i, PorterDuff.Mode mode) {
        return a88.m173f(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m9845d() {
        if (f34365c == null) {
            C2893cq c2893cq = new C2893cq();
            f34365c = c2893cq;
            c2893cq.f34366a = a88.m172c();
            a88 a88Var = f34365c.f34366a;
            co7 co7Var = new co7(1);
            synchronized (a88Var) {
                a88Var.f362e = co7Var;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9846e(Drawable drawable, l1a l1aVar, int[] iArr) {
        PorterDuff.Mode mode = a88.f355f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = l1aVar.f48904d;
        if (!z && !l1aVar.f48903c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM173f = null;
        ColorStateList colorStateList = z ? l1aVar.f48901a : null;
        PorterDuff.Mode mode2 = l1aVar.f48903c ? l1aVar.f48902b : a88.f355f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM173f = a88.m173f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM173f);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m9847b(Context context, int i) {
        return this.f34366a.m176d(context, i);
    }
}
