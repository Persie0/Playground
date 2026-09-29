package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.ExoPlayer;
import com.linguist.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p301oh.C8044c;
import p471x2.C10029b0;
import p471x2.C10034e;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1165p extends RecyclerView.AbstractC1119l implements RecyclerView.InterfaceC1122o {

    /* JADX INFO: renamed from: A */
    public Rect f7401A;

    /* JADX INFO: renamed from: B */
    public long f7402B;

    /* JADX INFO: renamed from: d */
    public float f7406d;

    /* JADX INFO: renamed from: e */
    public float f7407e;

    /* JADX INFO: renamed from: f */
    public float f7408f;

    /* JADX INFO: renamed from: g */
    public float f7409g;

    /* JADX INFO: renamed from: h */
    public float f7410h;

    /* JADX INFO: renamed from: i */
    public float f7411i;

    /* JADX INFO: renamed from: j */
    public float f7412j;

    /* JADX INFO: renamed from: k */
    public float f7413k;

    /* JADX INFO: renamed from: m */
    public final d f7415m;

    /* JADX INFO: renamed from: o */
    public int f7417o;

    /* JADX INFO: renamed from: q */
    public int f7419q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f7420r;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f7422t;

    /* JADX INFO: renamed from: u */
    public ArrayList f7423u;

    /* JADX INFO: renamed from: v */
    public ArrayList f7424v;

    /* JADX INFO: renamed from: x */
    public C10034e f7426x;

    /* JADX INFO: renamed from: y */
    public e f7427y;

    /* JADX INFO: renamed from: a */
    public final ArrayList f7403a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f7404b = new float[2];

    /* JADX INFO: renamed from: c */
    public RecyclerView.AbstractC1109b0 f7405c = null;

    /* JADX INFO: renamed from: l */
    public int f7414l = -1;

    /* JADX INFO: renamed from: n */
    public int f7416n = 0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f7418p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final a f7421s = new a();

    /* JADX INFO: renamed from: w */
    public View f7425w = null;

    /* JADX INFO: renamed from: z */
    public final b f7428z = new b();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        @Override // java.lang.Runnable
        public final void run() {
            int iM4523c;
            int iM4523c2;
            int i10;
            C1165p c1165p = C1165p.this;
            if (c1165p.f7405c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = c1165p.f7402B;
                long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
                RecyclerView.AbstractC1120m layoutManager = c1165p.f7420r.getLayoutManager();
                if (c1165p.f7401A == null) {
                    c1165p.f7401A = new Rect();
                }
                layoutManager.m4312e(c1165p.f7405c.f7054a, c1165p.f7401A);
                boolean z10 = false;
                if (layoutManager.mo4137f()) {
                    int i11 = (int) (c1165p.f7412j + c1165p.f7410h);
                    iM4523c = (i11 - c1165p.f7401A.left) - c1165p.f7420r.getPaddingLeft();
                    float f3 = c1165p.f7410h;
                    if ((f3 >= 0.0f || iM4523c >= 0) && (f3 <= 0.0f || (iM4523c = ((c1165p.f7405c.f7054a.getWidth() + i11) + c1165p.f7401A.right) - (c1165p.f7420r.getWidth() - c1165p.f7420r.getPaddingRight())) <= 0)) {
                        iM4523c = 0;
                    }
                } else {
                    iM4523c = 0;
                }
                if (layoutManager.mo4139g()) {
                    int i12 = (int) (c1165p.f7413k + c1165p.f7411i);
                    int paddingTop = (i12 - c1165p.f7401A.top) - c1165p.f7420r.getPaddingTop();
                    float f10 = c1165p.f7411i;
                    if ((f10 >= 0.0f || paddingTop >= 0) && (f10 <= 0.0f || (paddingTop = ((c1165p.f7405c.f7054a.getHeight() + i12) + c1165p.f7401A.bottom) - (c1165p.f7420r.getHeight() - c1165p.f7420r.getPaddingBottom())) <= 0)) {
                        iM4523c2 = 0;
                    } else {
                        iM4523c2 = paddingTop;
                    }
                } else {
                    iM4523c2 = 0;
                }
                if (iM4523c != 0) {
                    d dVar = c1165p.f7415m;
                    RecyclerView recyclerView = c1165p.f7420r;
                    int width = c1165p.f7405c.f7054a.getWidth();
                    c1165p.f7420r.getWidth();
                    iM4523c = dVar.m4523c(recyclerView, width, iM4523c, j11);
                }
                int i13 = iM4523c;
                if (iM4523c2 != 0) {
                    d dVar2 = c1165p.f7415m;
                    RecyclerView recyclerView2 = c1165p.f7420r;
                    int height = c1165p.f7405c.f7054a.getHeight();
                    c1165p.f7420r.getHeight();
                    i10 = i13;
                    iM4523c2 = dVar2.m4523c(recyclerView2, height, iM4523c2, j11);
                } else {
                    i10 = i13;
                }
                if (i10 == 0 && iM4523c2 == 0) {
                    c1165p.f7402B = Long.MIN_VALUE;
                } else {
                    if (c1165p.f7402B == Long.MIN_VALUE) {
                        c1165p.f7402B = jCurrentTimeMillis;
                    }
                    c1165p.f7420r.scrollBy(i10, iM4523c2);
                    z10 = true;
                }
                if (z10) {
                    RecyclerView.AbstractC1109b0 abstractC1109b0 = c1165p.f7405c;
                    if (abstractC1109b0 != null) {
                        c1165p.m4515q(abstractC1109b0);
                    }
                    c1165p.f7420r.removeCallbacks(c1165p.f7421s);
                    RecyclerView recyclerView3 = c1165p.f7420r;
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18676m(recyclerView3, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$b */
    public class b implements RecyclerView.InterfaceC1124q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
        /* JADX INFO: renamed from: a */
        public final void mo4336a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1165p c1165p = C1165p.this;
            c1165p.f7426x.f51027a.f51028a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = c1165p.f7422t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c1165p.f7414l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(c1165p.f7414l);
            if (iFindPointerIndex >= 0) {
                c1165p.m4510k(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.AbstractC1109b0 abstractC1109b0 = c1165p.f7405c;
            if (abstractC1109b0 == null) {
                return;
            }
            int i10 = 0;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c1165p.m4519u(c1165p.f7417o, iFindPointerIndex, motionEvent);
                        c1165p.m4515q(abstractC1109b0);
                        RecyclerView recyclerView2 = c1165p.f7420r;
                        a aVar = c1165p.f7421s;
                        recyclerView2.removeCallbacks(aVar);
                        aVar.run();
                        c1165p.f7420r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == c1165p.f7414l) {
                        if (actionIndex == 0) {
                            i10 = 1;
                        }
                        c1165p.f7414l = motionEvent.getPointerId(i10);
                        c1165p.m4519u(c1165p.f7417o, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c1165p.f7422t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            c1165p.m4517s(null, 0);
            c1165p.f7414l = -1;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
        /* JADX INFO: renamed from: c */
        public final boolean mo4337c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            C1165p c1165p = C1165p.this;
            c1165p.f7426x.f51027a.f51028a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                c1165p.f7414l = motionEvent.getPointerId(0);
                c1165p.f7406d = motionEvent.getX();
                c1165p.f7407e = motionEvent.getY();
                VelocityTracker velocityTracker = c1165p.f7422t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c1165p.f7422t = VelocityTracker.obtain();
                if (c1165p.f7405c == null) {
                    ArrayList arrayList = c1165p.f7418p;
                    if (!arrayList.isEmpty()) {
                        View viewM4513n = c1165p.m4513n(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f7442e.f7054a == viewM4513n) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        c1165p.f7406d -= fVar.f7446i;
                        c1165p.f7407e -= fVar.f7447j;
                        RecyclerView.AbstractC1109b0 abstractC1109b0 = fVar.f7442e;
                        c1165p.m4512m(abstractC1109b0, true);
                        if (c1165p.f7403a.remove(abstractC1109b0.f7054a)) {
                            c1165p.f7415m.mo4521a(c1165p.f7420r, abstractC1109b0);
                        }
                        c1165p.m4517s(abstractC1109b0, fVar.f7443f);
                        c1165p.m4519u(c1165p.f7417o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                c1165p.f7414l = -1;
                c1165p.m4517s(null, 0);
            } else {
                int i10 = c1165p.f7414l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    c1165p.m4510k(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = c1165p.f7422t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return c1165p.f7405c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
        /* JADX INFO: renamed from: e */
        public final void mo4338e(boolean z10) {
            if (z10) {
                C1165p.this.m4517s(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$c */
    public class c extends f {

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f7431n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ RecyclerView.AbstractC1109b0 f7432o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, int i11, float f3, float f10, float f11, float f12, int i12, RecyclerView.AbstractC1109b0 abstractC1109b1) {
            super(abstractC1109b0, i11, f3, f10, f11, f12);
            this.f7431n = i12;
            this.f7432o = abstractC1109b1;
        }

        @Override // androidx.recyclerview.widget.C1165p.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f7448k) {
                return;
            }
            int i10 = this.f7431n;
            RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7432o;
            C1165p c1165p = C1165p.this;
            if (i10 <= 0) {
                c1165p.f7415m.mo4521a(c1165p.f7420r, abstractC1109b0);
            } else {
                c1165p.f7403a.add(abstractC1109b0.f7054a);
                this.f7445h = true;
                if (i10 > 0) {
                    c1165p.f7420r.post(new RunnableC1166q(c1165p, this, i10));
                }
            }
            View view = c1165p.f7425w;
            View view2 = abstractC1109b0.f7054a;
            if (view == view2) {
                c1165p.m4516r(view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$d */
    public static abstract class d {

        /* JADX INFO: renamed from: b */
        public static final b f7434b;

        /* JADX INFO: renamed from: a */
        public int f7435a = -1;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.p$d$a */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                return f3 * f3 * f3 * f3 * f3;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.p$d$b */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                float f10 = f3 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            }
        }

        static {
            new a();
            f7434b = new b();
        }

        /* JADX INFO: renamed from: d */
        public static void m4520d(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0, float f3, float f10, boolean z10) {
            View view = abstractC1109b0.f7054a;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                Float fValueOf = Float.valueOf(C10029b0.i.m18715i(view));
                int childCount = recyclerView.getChildCount();
                float f11 = 0.0f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    if (childAt != view) {
                        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                        float fM18715i = C10029b0.i.m18715i(childAt);
                        if (fM18715i > f11) {
                            f11 = fM18715i;
                        }
                    }
                }
                C10029b0.i.m18725s(view, f11 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f3);
            view.setTranslationY(f10);
        }

        /* JADX INFO: renamed from: a */
        public void mo4521a(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0) {
            View view = abstractC1109b0.f7054a;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.i.m18725s(view, fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        /* JADX INFO: renamed from: b */
        public abstract int mo4522b(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0);

        /* JADX INFO: renamed from: c */
        public final int m4523c(RecyclerView recyclerView, int i10, int i11, long j10) {
            if (this.f7435a == -1) {
                this.f7435a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            float f3 = 1.0f;
            int interpolation = (int) (f7434b.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * this.f7435a);
            if (j10 <= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                f3 = j10 / 2000.0f;
            }
            int i12 = (int) (f3 * f3 * f3 * f3 * f3 * interpolation);
            if (i12 == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return i12;
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo4524e(RecyclerView recyclerView, RecyclerView.AbstractC1109b0 abstractC1109b0, RecyclerView.AbstractC1109b0 abstractC1109b1);

        /* JADX INFO: renamed from: f */
        public abstract void mo4525f(RecyclerView.AbstractC1109b0 abstractC1109b0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$e */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public boolean f7436a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4178K;
            int i10;
            if (this.f7436a) {
                C1165p c1165p = C1165p.this;
                View viewM4513n = c1165p.m4513n(motionEvent);
                if (viewM4513n != null && (abstractC1109b0M4178K = c1165p.f7420r.m4178K(viewM4513n)) != null) {
                    RecyclerView recyclerView = c1165p.f7420r;
                    d dVar = c1165p.f7415m;
                    int iMo4522b = dVar.mo4522b(recyclerView, abstractC1109b0M4178K);
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    int iM18686d = C10029b0.e.m18686d(recyclerView);
                    int i11 = iMo4522b & 3158064;
                    if (i11 != 0) {
                        int i12 = iMo4522b & (~i11);
                        if (iM18686d == 0) {
                            i10 = i11 >> 2;
                        } else {
                            int i13 = i11 >> 1;
                            i12 |= (-3158065) & i13;
                            i10 = (i13 & 3158064) >> 2;
                        }
                        iMo4522b = i12 | i10;
                    }
                    if (!((16711680 & iMo4522b) != 0)) {
                        return;
                    }
                    int pointerId = motionEvent.getPointerId(0);
                    int i14 = c1165p.f7414l;
                    if (pointerId == i14) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        c1165p.f7406d = x10;
                        c1165p.f7407e = y10;
                        c1165p.f7411i = 0.0f;
                        c1165p.f7410h = 0.0f;
                        dVar.getClass();
                        if (!(dVar instanceof C8044c)) {
                            c1165p.m4517s(abstractC1109b0M4178K, 2);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$f */
    public static class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final float f7438a;

        /* JADX INFO: renamed from: b */
        public final float f7439b;

        /* JADX INFO: renamed from: c */
        public final float f7440c;

        /* JADX INFO: renamed from: d */
        public final float f7441d;

        /* JADX INFO: renamed from: e */
        public final RecyclerView.AbstractC1109b0 f7442e;

        /* JADX INFO: renamed from: f */
        public final int f7443f;

        /* JADX INFO: renamed from: g */
        public final ValueAnimator f7444g;

        /* JADX INFO: renamed from: h */
        public boolean f7445h;

        /* JADX INFO: renamed from: i */
        public float f7446i;

        /* JADX INFO: renamed from: j */
        public float f7447j;

        /* JADX INFO: renamed from: k */
        public boolean f7448k = false;

        /* JADX INFO: renamed from: l */
        public boolean f7449l = false;

        /* JADX INFO: renamed from: m */
        public float f7450m;

        public f(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, float f3, float f10, float f11, float f12) {
            this.f7443f = i10;
            this.f7442e = abstractC1109b0;
            this.f7438a = f3;
            this.f7439b = f10;
            this.f7440c = f11;
            this.f7441d = f12;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7444g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C1167r(this));
            valueAnimatorOfFloat.setTarget(abstractC1109b0.f7054a);
            valueAnimatorOfFloat.addListener(this);
            this.f7450m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7450m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f7449l) {
                this.f7442e.m4253p(true);
            }
            this.f7449l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$g */
    public interface g {
        /* JADX INFO: renamed from: b */
        void mo4133b(View view, View view2);
    }

    public C1165p(C8044c c8044c) {
        this.f7415m = c8044c;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m4507p(View view, float f3, float f10, float f11, float f12) {
        return f3 >= f11 && f3 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
    /* JADX INFO: renamed from: b */
    public final void mo66b(View view) {
        m4516r(view);
        RecyclerView.AbstractC1109b0 abstractC1109b0M4178K = this.f7420r.m4178K(view);
        if (abstractC1109b0M4178K == null) {
            return;
        }
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7405c;
        if (abstractC1109b0 != null && abstractC1109b0M4178K == abstractC1109b0) {
            m4517s(null, 0);
            return;
        }
        m4512m(abstractC1109b0M4178K, false);
        if (this.f7403a.remove(abstractC1109b0M4178K.f7054a)) {
            this.f7415m.mo4521a(this.f7420r, abstractC1109b0M4178K);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
    /* JADX INFO: renamed from: d */
    public final void mo67d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f */
    public final void mo4282f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public final void mo4283g(Canvas canvas, RecyclerView recyclerView) {
        float f3;
        float f10;
        if (this.f7405c != null) {
            float[] fArr = this.f7404b;
            m4514o(fArr);
            f3 = fArr[0];
            f10 = fArr[1];
        } else {
            f3 = 0.0f;
            f10 = 0.0f;
        }
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7405c;
        ArrayList arrayList = this.f7418p;
        this.f7415m.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            float f11 = fVar.f7438a;
            float f12 = fVar.f7440c;
            RecyclerView.AbstractC1109b0 abstractC1109b1 = fVar.f7442e;
            if (f11 == f12) {
                fVar.f7446i = abstractC1109b1.f7054a.getTranslationX();
            } else {
                fVar.f7446i = C0204c.m845d(f12, f11, fVar.f7450m, f11);
            }
            float f13 = fVar.f7439b;
            float f14 = fVar.f7441d;
            if (f13 == f14) {
                fVar.f7447j = abstractC1109b1.f7054a.getTranslationY();
            } else {
                fVar.f7447j = C0204c.m845d(f14, f13, fVar.f7450m, f13);
            }
            int iSave = canvas.save();
            d.m4520d(recyclerView, abstractC1109b1, fVar.f7446i, fVar.f7447j, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC1109b0 != null) {
            int iSave2 = canvas.save();
            d.m4520d(recyclerView, abstractC1109b0, f3, f10, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    /* JADX INFO: renamed from: h */
    public final void mo4284h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
        boolean z10 = false;
        if (this.f7405c != null) {
            float[] fArr = this.f7404b;
            m4514o(fArr);
            float f3 = fArr[0];
            float f10 = fArr[1];
        }
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7405c;
        ArrayList arrayList = this.f7418p;
        this.f7415m.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            int iSave = canvas.save();
            View view = fVar.f7442e.f7054a;
            canvas.restoreToCount(iSave);
        }
        if (abstractC1109b0 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            f fVar2 = (f) arrayList.get(i11);
            boolean z11 = fVar2.f7449l;
            if (z11 && !fVar2.f7445h) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4508i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7420r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f7428z;
        if (recyclerView2 != null) {
            recyclerView2.m4192a0(this);
            RecyclerView recyclerView3 = this.f7420r;
            recyclerView3.f6981M.remove(bVar);
            if (recyclerView3.f6983N == bVar) {
                recyclerView3.f6983N = null;
            }
            ArrayList arrayList = this.f7420r.f7005b0;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f7418p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.f7444g.cancel();
                this.f7415m.mo4521a(this.f7420r, fVar.f7442e);
            }
            arrayList2.clear();
            this.f7425w = null;
            VelocityTracker velocityTracker = this.f7422t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7422t = null;
            }
            e eVar = this.f7427y;
            if (eVar != null) {
                eVar.f7436a = false;
                this.f7427y = null;
            }
            if (this.f7426x != null) {
                this.f7426x = null;
            }
        }
        this.f7420r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f7408f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f7409g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f7419q = ViewConfiguration.get(this.f7420r.getContext()).getScaledTouchSlop();
            this.f7420r.m4199g(this);
            this.f7420r.f6981M.add(bVar);
            this.f7420r.m4201h(this);
            this.f7427y = new e();
            this.f7426x = new C10034e(this.f7420r.getContext(), this.f7427y);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m4509j(int i10) {
        if ((i10 & 12) != 0) {
            int i11 = 8;
            int i12 = this.f7410h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f7422t;
            d dVar = this.f7415m;
            if (velocityTracker != null && this.f7414l > -1) {
                float f3 = this.f7409g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f3);
                float xVelocity = this.f7422t.getXVelocity(this.f7414l);
                float yVelocity = this.f7422t.getYVelocity(this.f7414l);
                if (xVelocity <= 0.0f) {
                    i11 = 4;
                }
                float fAbs = Math.abs(xVelocity);
                if ((i11 & i10) != 0 && i12 == i11 && fAbs >= this.f7408f && fAbs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float width = this.f7420r.getWidth();
            dVar.getClass();
            float f10 = width * 0.5f;
            if ((i10 & i12) != 0 && Math.abs(this.f7410h) > f10) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: k */
    public final void m4510k(int i10, int i11, MotionEvent motionEvent) {
        RecyclerView.AbstractC1109b0 abstractC1109b0M4178K;
        int i12;
        View viewM4513n;
        if (this.f7405c == null && i10 == 2 && this.f7416n != 2) {
            d dVar = this.f7415m;
            dVar.getClass();
            if ((!(dVar instanceof C8044c)) && this.f7420r.getScrollState() != 1) {
                RecyclerView.AbstractC1120m layoutManager = this.f7420r.getLayoutManager();
                int i13 = this.f7414l;
                if (i13 == -1) {
                    abstractC1109b0M4178K = null;
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i13);
                    float x10 = motionEvent.getX(iFindPointerIndex) - this.f7406d;
                    float y10 = motionEvent.getY(iFindPointerIndex) - this.f7407e;
                    float fAbs = Math.abs(x10);
                    float fAbs2 = Math.abs(y10);
                    float f3 = this.f7419q;
                    if ((fAbs >= f3 || fAbs2 >= f3) && ((fAbs <= fAbs2 || !layoutManager.mo4137f()) && ((fAbs2 <= fAbs || !layoutManager.mo4139g()) && (viewM4513n = m4513n(motionEvent)) != null))) {
                        abstractC1109b0M4178K = this.f7420r.m4178K(viewM4513n);
                    } else {
                        abstractC1109b0M4178K = null;
                    }
                }
                if (abstractC1109b0M4178K == null) {
                    return;
                }
                RecyclerView recyclerView = this.f7420r;
                int iMo4522b = dVar.mo4522b(recyclerView, abstractC1109b0M4178K);
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                int iM18686d = C10029b0.e.m18686d(recyclerView);
                int i14 = iMo4522b & 3158064;
                if (i14 != 0) {
                    int i15 = iMo4522b & (~i14);
                    if (iM18686d == 0) {
                        i12 = i14 >> 2;
                    } else {
                        int i16 = i14 >> 1;
                        i15 |= (-3158065) & i16;
                        i12 = (i16 & 3158064) >> 2;
                    }
                    iMo4522b = i15 | i12;
                }
                int i17 = (iMo4522b & 65280) >> 8;
                if (i17 == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f10 = x11 - this.f7406d;
                float f11 = y11 - this.f7407e;
                float fAbs3 = Math.abs(f10);
                float fAbs4 = Math.abs(f11);
                float f12 = this.f7419q;
                if (fAbs3 >= f12 || fAbs4 >= f12) {
                    if (fAbs3 > fAbs4) {
                        if (f10 < 0.0f && (i17 & 4) == 0) {
                            return;
                        }
                        if (f10 > 0.0f && (i17 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f11 < 0.0f && (i17 & 1) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (i17 & 2) == 0) {
                            return;
                        }
                    }
                    this.f7411i = 0.0f;
                    this.f7410h = 0.0f;
                    this.f7414l = motionEvent.getPointerId(0);
                    m4517s(abstractC1109b0M4178K, 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m4511l(int i10) {
        if ((i10 & 3) != 0) {
            int i11 = 2;
            int i12 = this.f7411i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f7422t;
            d dVar = this.f7415m;
            if (velocityTracker != null && this.f7414l > -1) {
                float f3 = this.f7409g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f3);
                float xVelocity = this.f7422t.getXVelocity(this.f7414l);
                float yVelocity = this.f7422t.getYVelocity(this.f7414l);
                if (yVelocity <= 0.0f) {
                    i11 = 1;
                }
                float fAbs = Math.abs(yVelocity);
                if ((i11 & i10) != 0 && i11 == i12 && fAbs >= this.f7408f && fAbs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float height = this.f7420r.getHeight();
            dVar.getClass();
            float f10 = height * 0.5f;
            if ((i10 & i12) != 0 && Math.abs(this.f7411i) > f10) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m4512m(RecyclerView.AbstractC1109b0 abstractC1109b0, boolean z10) {
        f fVar;
        ArrayList arrayList = this.f7418p;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                fVar = (f) arrayList.get(size);
            }
        } while (fVar.f7442e != abstractC1109b0);
        fVar.f7448k |= z10;
        if (!fVar.f7449l) {
            fVar.f7444g.cancel();
        }
        arrayList.remove(size);
    }

    /* JADX INFO: renamed from: n */
    public final View m4513n(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7405c;
        if (abstractC1109b0 != null) {
            float f3 = this.f7412j + this.f7410h;
            float f10 = this.f7413k + this.f7411i;
            View view2 = abstractC1109b0.f7054a;
            if (m4507p(view2, x10, y10, f3, f10)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f7418p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
                view = fVar.f7442e.f7054a;
            } else {
                RecyclerView recyclerView = this.f7420r;
                int iM4459e = recyclerView.f7012f.m4459e();
                while (true) {
                    iM4459e--;
                    if (iM4459e < 0) {
                        return null;
                    }
                    View viewM4458d = recyclerView.f7012f.m4458d(iM4459e);
                    float translationX = viewM4458d.getTranslationX();
                    float translationY = viewM4458d.getTranslationY();
                    if (x10 >= viewM4458d.getLeft() + translationX && x10 <= viewM4458d.getRight() + translationX && y10 >= viewM4458d.getTop() + translationY && y10 <= viewM4458d.getBottom() + translationY) {
                        return viewM4458d;
                    }
                }
            }
        } while (!m4507p(view, x10, y10, fVar.f7446i, fVar.f7447j));
        return view;
    }

    /* JADX INFO: renamed from: o */
    public final void m4514o(float[] fArr) {
        if ((this.f7417o & 12) != 0) {
            fArr[0] = (this.f7412j + this.f7410h) - this.f7405c.f7054a.getLeft();
        } else {
            fArr[0] = this.f7405c.f7054a.getTranslationX();
        }
        if ((this.f7417o & 3) != 0) {
            fArr[1] = (this.f7413k + this.f7411i) - this.f7405c.f7054a.getTop();
        } else {
            fArr[1] = this.f7405c.f7054a.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m4515q(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        ArrayList arrayList;
        int i10;
        int i11;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int iAbs4;
        RecyclerView.AbstractC1120m abstractC1120m;
        char c10;
        if (!this.f7420r.isLayoutRequested() && this.f7416n == 2) {
            d dVar = this.f7415m;
            dVar.getClass();
            int i12 = (int) (this.f7412j + this.f7410h);
            int i13 = (int) (this.f7413k + this.f7411i);
            float fAbs = Math.abs(i13 - abstractC1109b0.f7054a.getTop());
            View view = abstractC1109b0.f7054a;
            if (fAbs >= view.getHeight() * 0.5f || Math.abs(i12 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f7423u;
                if (arrayList2 == null) {
                    this.f7423u = new ArrayList();
                    this.f7424v = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f7424v.clear();
                }
                int i14 = 0;
                int iRound = Math.round(this.f7412j + this.f7410h) - 0;
                int iRound2 = Math.round(this.f7413k + this.f7411i) - 0;
                int width = view.getWidth() + iRound + 0;
                int height = view.getHeight() + iRound2 + 0;
                int i15 = (iRound + width) / 2;
                int i16 = (iRound2 + height) / 2;
                RecyclerView.AbstractC1120m layoutManager = this.f7420r.getLayoutManager();
                int iM4326y = layoutManager.m4326y();
                while (i14 < iM4326y) {
                    View viewM4324x = layoutManager.m4324x(i14);
                    if (viewM4324x == view) {
                        abstractC1120m = layoutManager;
                    } else {
                        abstractC1120m = layoutManager;
                        if (viewM4324x.getBottom() >= iRound2 && viewM4324x.getTop() <= height && viewM4324x.getRight() >= iRound && viewM4324x.getLeft() <= width) {
                            RecyclerView.AbstractC1109b0 abstractC1109b0M4178K = this.f7420r.m4178K(viewM4324x);
                            c10 = 2;
                            int iAbs5 = Math.abs(i15 - ((viewM4324x.getRight() + viewM4324x.getLeft()) / 2));
                            int iAbs6 = Math.abs(i16 - ((viewM4324x.getBottom() + viewM4324x.getTop()) / 2));
                            int i17 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            iRound = iRound;
                            int size = this.f7423u.size();
                            iRound2 = iRound2;
                            width = width;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.f7424v.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.f7423u.add(i19, abstractC1109b0M4178K);
                            this.f7424v.add(i19, Integer.valueOf(i17));
                        }
                        i14++;
                        layoutManager = abstractC1120m;
                        iRound = iRound;
                        iRound2 = iRound2;
                        width = width;
                    }
                    c10 = 2;
                    i14++;
                    layoutManager = abstractC1120m;
                    iRound = iRound;
                    iRound2 = iRound2;
                    width = width;
                }
                ArrayList arrayList3 = this.f7423u;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i12;
                int height2 = view.getHeight() + i13;
                int left2 = i12 - view.getLeft();
                int top2 = i13 - view.getTop();
                int size2 = arrayList3.size();
                int i21 = -1;
                RecyclerView.AbstractC1109b0 abstractC1109b1 = null;
                int i22 = 0;
                while (i22 < size2) {
                    RecyclerView.AbstractC1109b0 abstractC1109b2 = (RecyclerView.AbstractC1109b0) arrayList3.get(i22);
                    if (left2 > 0) {
                        arrayList = arrayList3;
                        int right = abstractC1109b2.f7054a.getRight() - width2;
                        i10 = width2;
                        if (right < 0) {
                            i11 = size2;
                            if (abstractC1109b2.f7054a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i21) {
                                i21 = iAbs4;
                                abstractC1109b1 = abstractC1109b2;
                            }
                        }
                        if (left2 < 0 && (left = abstractC1109b2.f7054a.getLeft() - i12) > 0 && abstractC1109b2.f7054a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i21) {
                            i21 = iAbs3;
                            abstractC1109b1 = abstractC1109b2;
                        }
                        if (top2 < 0 && (top = abstractC1109b2.f7054a.getTop() - i13) > 0 && abstractC1109b2.f7054a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i21) {
                            i21 = iAbs2;
                            abstractC1109b1 = abstractC1109b2;
                        }
                        if (top2 <= 0 && (bottom = abstractC1109b2.f7054a.getBottom() - height2) < 0 && abstractC1109b2.f7054a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i21) {
                            i21 = iAbs;
                            abstractC1109b1 = abstractC1109b2;
                        }
                        i22++;
                        arrayList3 = arrayList;
                        width2 = i10;
                        size2 = i11;
                    } else {
                        arrayList = arrayList3;
                        i10 = width2;
                    }
                    i11 = size2;
                    if (left2 < 0) {
                        i21 = iAbs3;
                        abstractC1109b1 = abstractC1109b2;
                    }
                    if (top2 < 0) {
                        i21 = iAbs2;
                        abstractC1109b1 = abstractC1109b2;
                    }
                    if (top2 <= 0) {
                    }
                    i22++;
                    arrayList3 = arrayList;
                    width2 = i10;
                    size2 = i11;
                }
                if (abstractC1109b1 == null) {
                    this.f7423u.clear();
                    this.f7424v.clear();
                    return;
                }
                int iM4240c = abstractC1109b1.m4240c();
                abstractC1109b0.m4240c();
                dVar.mo4524e(this.f7420r, abstractC1109b0, abstractC1109b1);
                RecyclerView recyclerView = this.f7420r;
                RecyclerView.AbstractC1120m layoutManager2 = recyclerView.getLayoutManager();
                boolean z10 = layoutManager2 instanceof g;
                View view2 = abstractC1109b1.f7054a;
                if (z10) {
                    ((g) layoutManager2).mo4133b(view, view2);
                    return;
                }
                if (layoutManager2.mo4137f()) {
                    if (view2.getLeft() - RecyclerView.AbstractC1120m.m4285E(view2) <= recyclerView.getPaddingLeft()) {
                        recyclerView.m4200g0(iM4240c);
                    }
                    if (RecyclerView.AbstractC1120m.m4288L(view2) + view2.getRight() >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.m4200g0(iM4240c);
                    }
                }
                if (layoutManager2.mo4139g()) {
                    if (view2.getTop() - RecyclerView.AbstractC1120m.m4289N(view2) <= recyclerView.getPaddingTop()) {
                        recyclerView.m4200g0(iM4240c);
                    }
                    if (RecyclerView.AbstractC1120m.m4293w(view2) + view2.getBottom() >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.m4200g0(iM4240c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4516r(View view) {
        if (view == this.f7425w) {
            this.f7425w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0202  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[PHI: r1 r2
      0x00b7: PHI (r1v37 int) = (r1v34 int), (r1v38 int) binds: [B:61:0x00e8, B:43:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r2v21 int) = (r2v16 int), (r2v24 int) binds: [B:61:0x00e8, B:43:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba A[PHI: r1 r2
      0x00ba: PHI (r1v35 int) = (r1v34 int), (r1v38 int) binds: [B:61:0x00e8, B:43:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r2v17 int) = (r2v16 int), (r2v24 int) binds: [B:61:0x00e8, B:43:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX INFO: renamed from: s */
    public final void m4517s(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        d dVar;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        RecyclerView.AbstractC1109b0 abstractC1109b1;
        int iM4511l;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float fSignum;
        float fSignum2;
        int i19;
        long j10;
        if (abstractC1109b0 == this.f7405c && i10 == this.f7416n) {
            return;
        }
        this.f7402B = Long.MIN_VALUE;
        int i20 = this.f7416n;
        m4512m(abstractC1109b0, true);
        this.f7416n = i10;
        if (i10 == 2) {
            if (abstractC1109b0 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f7425w = abstractC1109b0.f7054a;
        }
        int i21 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.AbstractC1109b0 abstractC1109b2 = this.f7405c;
        d dVar2 = this.f7415m;
        if (abstractC1109b2 != null) {
            View view = abstractC1109b2.f7054a;
            if (view.getParent() != null) {
                if (i20 == 2) {
                    i13 = 0;
                } else {
                    if (this.f7416n == 2) {
                        iM4511l = 0;
                    } else {
                        int iMo4522b = dVar2.mo4522b(this.f7420r, abstractC1109b2);
                        RecyclerView recyclerView = this.f7420r;
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        int iM18686d = C10029b0.e.m18686d(recyclerView);
                        int i22 = iMo4522b & 3158064;
                        if (i22 == 0) {
                            i15 = iMo4522b;
                        } else {
                            int i23 = (~i22) & iMo4522b;
                            if (iM18686d == 0) {
                                i14 = i22 >> 2;
                            } else {
                                int i24 = i22 >> 1;
                                i23 |= i24 & (-3158065);
                                i14 = (i24 & 3158064) >> 2;
                            }
                            i15 = i14 | i23;
                        }
                        int i25 = (i15 & 65280) >> 8;
                        if (i25 == 0) {
                            iM4511l = 0;
                        } else {
                            int i26 = (iMo4522b & 65280) >> 8;
                            if (Math.abs(this.f7410h) > Math.abs(this.f7411i)) {
                                iM4511l = m4509j(i25);
                                if (iM4511l <= 0) {
                                    iM4511l = m4511l(i25);
                                    if (iM4511l <= 0) {
                                        iM4511l = 0;
                                    }
                                } else if ((i26 & iM4511l) == 0) {
                                    int iM18686d2 = C10029b0.e.m18686d(this.f7420r);
                                    i16 = iM4511l & 789516;
                                    if (i16 != 0) {
                                        i17 = iM4511l & (~i16);
                                        if (iM18686d2 == 0) {
                                            i18 = i16 << 2;
                                        } else {
                                            int i27 = i16 << 1;
                                            i17 |= i27 & (-789517);
                                            i18 = (i27 & 789516) << 2;
                                        }
                                        iM4511l = i18 | i17;
                                    }
                                }
                            } else {
                                iM4511l = m4511l(i25);
                                if (iM4511l <= 0) {
                                    iM4511l = m4509j(i25);
                                    if (iM4511l <= 0) {
                                        iM4511l = 0;
                                    } else if ((i26 & iM4511l) == 0) {
                                        int iM18686d3 = C10029b0.e.m18686d(this.f7420r);
                                        i16 = iM4511l & 789516;
                                        if (i16 != 0) {
                                            i17 = iM4511l & (~i16);
                                            if (iM18686d3 == 0) {
                                                i18 = i16 << 2;
                                            } else {
                                                int i28 = i16 << 1;
                                                i17 |= i28 & (-789517);
                                                i18 = (i28 & 789516) << 2;
                                            }
                                            iM4511l = i18 | i17;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i13 = iM4511l;
                }
                VelocityTracker velocityTracker = this.f7422t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f7422t = null;
                }
                if (i13 == 1 || i13 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f7411i) * this.f7420r.getHeight();
                } else if (i13 == 4 || i13 == 8 || i13 == 16 || i13 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f7410h) * this.f7420r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i20 == 2) {
                    i19 = 8;
                } else {
                    i19 = i13 > 0 ? 2 : 4;
                }
                float[] fArr = this.f7404b;
                m4514o(fArr);
                int i29 = i19;
                i11 = 8;
                c cVar = new c(abstractC1109b2, i19, i20, fArr[0], fArr[1], fSignum, fSignum2, i13, abstractC1109b2);
                RecyclerView recyclerView2 = this.f7420r;
                dVar2.getClass();
                RecyclerView.AbstractC1117j itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j10 = i29 == 8 ? 200L : 250L;
                } else {
                    j10 = i29 == 8 ? itemAnimator.f7079e : itemAnimator.f7078d;
                }
                ValueAnimator valueAnimator = cVar.f7444g;
                valueAnimator.setDuration(j10);
                this.f7418p.add(cVar);
                abstractC1109b2.m4253p(false);
                valueAnimator.start();
                dVar = dVar2;
                abstractC1109b1 = null;
                z10 = true;
            } else {
                i11 = 8;
                m4516r(view);
                dVar = dVar2;
                dVar.mo4521a(this.f7420r, abstractC1109b2);
                abstractC1109b1 = null;
                z10 = false;
            }
            this.f7405c = abstractC1109b1;
        } else {
            dVar = dVar2;
            i11 = 8;
            z10 = false;
        }
        if (abstractC1109b0 != null) {
            RecyclerView recyclerView3 = this.f7420r;
            int iMo4522b2 = dVar.mo4522b(recyclerView3, abstractC1109b0);
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            int iM18686d4 = C10029b0.e.m18686d(recyclerView3);
            int i30 = iMo4522b2 & 3158064;
            if (i30 != 0) {
                int i31 = iMo4522b2 & (~i30);
                if (iM18686d4 == 0) {
                    i12 = 2;
                } else {
                    i12 = 2;
                    int i32 = i30 >> 1;
                    i31 |= i32 & (-3158065);
                    i30 = i32 & 3158064;
                }
                iMo4522b2 = i31 | (i30 >> i12);
            }
            this.f7417o = (iMo4522b2 & i21) >> (this.f7416n * i11);
            View view2 = abstractC1109b0.f7054a;
            this.f7412j = view2.getLeft();
            this.f7413k = view2.getTop();
            this.f7405c = abstractC1109b0;
            if (i10 == 2) {
                z11 = false;
                view2.performHapticFeedback(0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewParent parent = this.f7420r.getParent();
        if (parent != null) {
            if (this.f7405c != null) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z10) {
            this.f7420r.getLayoutManager().f7089f = true;
        }
        dVar.getClass();
        this.f7420r.invalidate();
    }

    /* JADX INFO: renamed from: t */
    public final void m4518t(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        int i10;
        RecyclerView recyclerView = this.f7420r;
        int iMo4522b = this.f7415m.mo4522b(recyclerView, abstractC1109b0);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18686d = C10029b0.e.m18686d(recyclerView);
        int i11 = iMo4522b & 3158064;
        boolean z10 = true;
        if (i11 != 0) {
            int i12 = iMo4522b & (~i11);
            if (iM18686d == 0) {
                i10 = i11 >> 2;
            } else {
                int i13 = i11 >> 1;
                i12 |= (-3158065) & i13;
                i10 = (i13 & 3158064) >> 2;
            }
            iMo4522b = i12 | i10;
        }
        if ((16711680 & iMo4522b) == 0) {
            z10 = false;
        }
        if (!z10) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (abstractC1109b0.f7054a.getParent() != this.f7420r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.f7422t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f7422t = VelocityTracker.obtain();
        this.f7411i = 0.0f;
        this.f7410h = 0.0f;
        m4517s(abstractC1109b0, 2);
    }

    /* JADX INFO: renamed from: u */
    public final void m4519u(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f3 = x10 - this.f7406d;
        this.f7410h = f3;
        this.f7411i = y10 - this.f7407e;
        if ((i10 & 4) == 0) {
            this.f7410h = Math.max(0.0f, f3);
        }
        if ((i10 & 8) == 0) {
            this.f7410h = Math.min(0.0f, this.f7410h);
        }
        if ((i10 & 1) == 0) {
            this.f7411i = Math.max(0.0f, this.f7411i);
        }
        if ((i10 & 2) == 0) {
            this.f7411i = Math.min(0.0f, this.f7411i);
        }
    }
}
