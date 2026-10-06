package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ave {

    /* JADX INFO: renamed from: a */
    protected final avf f2496a;

    /* JADX INFO: renamed from: c */
    public final int f2498c;

    /* JADX INFO: renamed from: d */
    public final float f2499d;

    /* JADX INFO: renamed from: e */
    public final avm f2500e;

    /* JADX INFO: renamed from: f */
    public int f2501f;

    /* JADX INFO: renamed from: g */
    public float f2502g;

    /* JADX INFO: renamed from: h */
    public float f2503h;

    /* JADX INFO: renamed from: i */
    public float f2504i;

    /* JADX INFO: renamed from: j */
    public boolean f2505j;

    /* JADX INFO: renamed from: k */
    public boolean f2506k;

    /* JADX INFO: renamed from: l */
    public boolean f2507l;

    /* JADX INFO: renamed from: n */
    protected AmbientModeSupport.AmbientController f2509n;

    /* JADX INFO: renamed from: o */
    private final int f2510o;

    /* JADX INFO: renamed from: b */
    public final float f2497b = 0.33f;

    /* JADX INFO: renamed from: m */
    public boolean f2508m = false;

    public ave(Context context, avf avfVar) {
        this.f2496a = avfVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2510o = viewConfiguration.getScaledTouchSlop();
        this.f2498c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2499d = Resources.getSystem().getDisplayMetrics().widthPixels * 0.1f;
        this.f2500e = new avm(context, avfVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m2050a(MotionEvent motionEvent) {
        aiv aivVar;
        if (motionEvent.getActionMasked() == 0) {
            avm avmVar = this.f2500e;
            aiv aivVar2 = avmVar.f2538l;
            boolean z = true;
            if ((aivVar2 == null || !aivVar2.f453m) && ((aivVar = avmVar.f2539m) == null || !aivVar.f453m)) {
                z = false;
            }
            this.f2508m = z;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2051b() {
        VelocityTracker velocityTracker = this.f2500e.f2532f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f2500e.f2532f = null;
        this.f2502g = 0.0f;
        this.f2503h = 0.0f;
        this.f2505j = false;
        this.f2504i = -2.1474836E9f;
        this.f2506k = false;
        this.f2507l = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m2052c(MotionEvent motionEvent) {
        if (this.f2505j) {
            return;
        }
        float rawX = motionEvent.getRawX() - this.f2502g;
        float rawY = motionEvent.getRawY() - this.f2503h;
        int i = this.f2510o;
        boolean z = false;
        if ((rawX * rawX) + (rawY * rawY) > i * i && rawX > i + i && Math.abs(rawY) < Math.abs(rawX)) {
            z = true;
        }
        this.f2505j = z;
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m2053d(View view, boolean z, float f, float f2, float f3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float f4 = f2 + scrollX;
                if (f4 >= childAt.getLeft() && f4 < childAt.getRight()) {
                    float f5 = f3 + scrollY;
                    if (f5 >= childAt.getTop() && f5 < childAt.getBottom()) {
                        if (m2053d(childAt, true, f, f4 - childAt.getLeft(), f5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && view.canScrollHorizontally((int) (-f));
    }
}
