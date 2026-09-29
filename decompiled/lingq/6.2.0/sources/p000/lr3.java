package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr3 extends fua {

    /* JADX INFO: renamed from: c */
    public kr3 f50034c;

    /* JADX INFO: renamed from: d */
    public OverScroller f50035d;

    /* JADX INFO: renamed from: e */
    public boolean f50036e;

    /* JADX INFO: renamed from: f */
    public int f50037f;

    /* JADX INFO: renamed from: g */
    public int f50038g;

    /* JADX INFO: renamed from: h */
    public int f50039h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f50040i;

    /* JADX INFO: renamed from: A */
    public final void m16469A(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo6003z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // p000.im1
    /* JADX INFO: renamed from: k */
    public final boolean mo6017k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.f50039h < 0) {
            this.f50039h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f50036e) {
            int i = this.f50037f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f50038g) > this.f50039h) {
                    this.f50038g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f50037f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f12594n;
                    if (weakReference == null) {
                    }
                    this.f50036e = z;
                    if (z) {
                        this.f50038g = y;
                        this.f50037f = motionEvent.getPointerId(0);
                        if (this.f50040i == null) {
                            this.f50040i = VelocityTracker.obtain();
                        }
                        overScroller = this.f50035d;
                        if (overScroller != null) {
                            this.f50035d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.f50040i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f50037f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).f12594n;
                z = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.m1982o(view, x2, y);
                this.f50036e = z;
                if (z) {
                    this.f50038g = y;
                    this.f50037f = motionEvent.getPointerId(0);
                    if (this.f50040i == null) {
                        this.f50040i = VelocityTracker.obtain();
                    }
                    overScroller = this.f50035d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f50035d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f50040i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa A[ADDED_TO_REGION] */
    @Override // p000.im1
    /* JADX INFO: renamed from: v */
    public final boolean mo6018v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f50037f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f50038g - y;
                    this.f50038g = y;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    mo6003z(coordinatorLayout, view, mo6002y() - i2, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f50037f = motionEvent.getPointerId(i3);
                    this.f50038g = (int) (motionEvent.getY(i3) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f50040i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f50036e || z;
        }
        VelocityTracker velocityTracker3 = this.f50040i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f50040i.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE);
            float yVelocity = this.f50040i.getYVelocity(this.f50037f);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i4 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f50034c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f50034c = null;
            }
            if (this.f50035d == null) {
                this.f50035d = new OverScroller(view.getContext());
            }
            this.f50035d.fling(0, m12201w(), 0, Math.round(yVelocity), 0, 0, i4, 0);
            if (this.f50035d.computeScrollOffset()) {
                kr3 kr3Var = new kr3(this, coordinatorLayout, view, i);
                this.f50034c = kr3Var;
                view.postOnAnimation(kr3Var);
            } else {
                ((AppBarLayout.BaseBehavior) this).m5993G(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f12589l) {
                    appBarLayout2.m5984f(appBarLayout2.m5985g(AppBarLayout.BaseBehavior.m5988D(coordinatorLayout)));
                }
            }
            z = true;
        }
        this.f50036e = false;
        this.f50037f = -1;
        velocityTracker = this.f50040i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f50040i = null;
        }
        velocityTracker2 = this.f50040i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f50036e) {
        }
        z = false;
        this.f50036e = false;
        this.f50037f = -1;
        velocityTracker = this.f50040i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f50040i = null;
        }
        velocityTracker2 = this.f50040i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f50036e) {
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract int mo6002y();

    /* JADX INFO: renamed from: z */
    public abstract int mo6003z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);
}
