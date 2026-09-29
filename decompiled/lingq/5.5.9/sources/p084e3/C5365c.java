package p084e3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5365c {

    /* JADX INFO: renamed from: v */
    public static final a f33708v = new a();

    /* JADX INFO: renamed from: a */
    public int f33709a;

    /* JADX INFO: renamed from: b */
    public int f33710b;

    /* JADX INFO: renamed from: d */
    public float[] f33712d;

    /* JADX INFO: renamed from: e */
    public float[] f33713e;

    /* JADX INFO: renamed from: f */
    public float[] f33714f;

    /* JADX INFO: renamed from: g */
    public float[] f33715g;

    /* JADX INFO: renamed from: h */
    public int[] f33716h;

    /* JADX INFO: renamed from: i */
    public int[] f33717i;

    /* JADX INFO: renamed from: j */
    public int[] f33718j;

    /* JADX INFO: renamed from: k */
    public int f33719k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f33720l;

    /* JADX INFO: renamed from: m */
    public final float f33721m;

    /* JADX INFO: renamed from: n */
    public final float f33722n;

    /* JADX INFO: renamed from: o */
    public final int f33723o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f33724p;

    /* JADX INFO: renamed from: q */
    public final c f33725q;

    /* JADX INFO: renamed from: r */
    public View f33726r;

    /* JADX INFO: renamed from: s */
    public boolean f33727s;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f33728t;

    /* JADX INFO: renamed from: c */
    public int f33711c = -1;

    /* JADX INFO: renamed from: u */
    public final b f33729u = new b();

    /* JADX INFO: renamed from: e3.c$a */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            float f10 = f3 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: e3.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5365c.this.m11536p(0);
        }
    }

    /* JADX INFO: renamed from: e3.c$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo8584a(View view, int i10);

        /* JADX INFO: renamed from: b */
        public abstract int mo8585b(View view, int i10);

        /* JADX INFO: renamed from: c */
        public int mo8586c(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int mo8620d() {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public void mo8587e(View view, int i10) {
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo8588f(int i10);

        /* JADX INFO: renamed from: g */
        public abstract void mo8589g(View view, int i10, int i11);

        /* JADX INFO: renamed from: h */
        public abstract void mo8590h(View view, float f3, float f10);

        /* JADX INFO: renamed from: i */
        public abstract boolean mo8591i(View view, int i10);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C5365c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f33728t = viewGroup;
        this.f33725q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f33723o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f33710b = viewConfiguration.getScaledTouchSlop();
        this.f33721m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f33722n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33724p = new OverScroller(context, f33708v);
    }

    /* JADX INFO: renamed from: a */
    public final void m11521a() {
        this.f33711c = -1;
        float[] fArr = this.f33712d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f33713e, 0.0f);
            Arrays.fill(this.f33714f, 0.0f);
            Arrays.fill(this.f33715g, 0.0f);
            Arrays.fill(this.f33716h, 0);
            Arrays.fill(this.f33717i, 0);
            Arrays.fill(this.f33718j, 0);
            this.f33719k = 0;
        }
        VelocityTracker velocityTracker = this.f33720l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33720l = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m11522b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f33728t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f33726r = view;
        this.f33711c = i10;
        this.f33725q.mo8587e(view, i10);
        m11536p(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11523c(float f3, float f10, int i10, int i11) {
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f10);
        if ((this.f33716h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f33718j[i10] & i11) == i11 || (this.f33717i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f33710b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f33725q.getClass();
        }
        return (this.f33717i[i10] & i11) == 0 && fAbs > ((float) this.f33710b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11524d(View view, float f3, float f10) {
        boolean z10 = false;
        if (view == null) {
            return false;
        }
        c cVar = this.f33725q;
        boolean z11 = cVar.mo8586c(view) > 0;
        boolean z12 = cVar.mo8620d() > 0;
        if (z11 && z12) {
            float f11 = (f10 * f10) + (f3 * f3);
            int i10 = this.f33710b;
            return f11 > ((float) (i10 * i10));
        }
        if (z11) {
            return Math.abs(f3) > ((float) this.f33710b);
        }
        if (z12 && Math.abs(f10) > this.f33710b) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: e */
    public final void m11525e(int i10) {
        float[] fArr = this.f33712d;
        if (fArr != null) {
            int i11 = this.f33719k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            fArr[i10] = 0.0f;
            this.f33713e[i10] = 0.0f;
            this.f33714f[i10] = 0.0f;
            this.f33715g[i10] = 0.0f;
            this.f33716h[i10] = 0;
            this.f33717i[i10] = 0;
            this.f33718j[i10] = 0;
            this.f33719k = (~i12) & i11;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m11526f(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f33728t.getWidth();
        float f3 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f3) + f3;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11527g() {
        boolean z10 = false;
        if (this.f33709a == 2) {
            OverScroller overScroller = this.f33724p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f33726r.getLeft();
            int top = currY - this.f33726r.getTop();
            if (left != 0) {
                View view = this.f33726r;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f33726r;
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f33725q.mo8589g(this.f33726r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f33728t.post(this.f33729u);
            }
        }
        if (this.f33709a == 2) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: h */
    public final View m11528h(int i10, int i11) {
        ViewGroup viewGroup = this.f33728t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f33725q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX INFO: renamed from: i */
    public final boolean m11529i(int i10, int i11, int i12, int i13) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i14;
        int i15;
        float f3;
        float f10;
        float f11;
        float f12;
        int left = this.f33726r.getLeft();
        int top = this.f33726r.getTop();
        int i16 = i10 - left;
        int i17 = i11 - top;
        OverScroller overScroller = this.f33724p;
        int i18 = 0;
        if (i16 == 0 && i17 == 0) {
            overScroller.abortAnimation();
            m11536p(0);
            return false;
        }
        View view = this.f33726r;
        int i19 = (int) this.f33722n;
        int i20 = (int) this.f33721m;
        int iAbs5 = Math.abs(i12);
        if (iAbs5 < i19) {
            i12 = 0;
        } else if (iAbs5 > i20) {
            i12 = i12 > 0 ? i20 : -i20;
        }
        int iAbs6 = Math.abs(i13);
        if (iAbs6 >= i19) {
            if (iAbs6 > i20) {
                if (i13 > 0) {
                    i13 = i20;
                } else {
                    i18 = -i20;
                }
            }
            iAbs = Math.abs(i16);
            iAbs2 = Math.abs(i17);
            iAbs3 = Math.abs(i12);
            iAbs4 = Math.abs(i13);
            i14 = iAbs3 + iAbs4;
            i15 = iAbs + iAbs2;
            if (i12 != 0) {
                f3 = iAbs3;
                f10 = i14;
            } else {
                f3 = iAbs;
                f10 = i15;
            }
            float f13 = f3 / f10;
            if (i13 != 0) {
                f11 = iAbs4;
                f12 = i14;
            } else {
                f11 = iAbs2;
                f12 = i15;
            }
            float f14 = f11 / f12;
            c cVar = this.f33725q;
            overScroller.startScroll(left, top, i16, i17, (int) ((m11526f(i17, i13, cVar.mo8620d()) * f14) + (m11526f(i16, i12, cVar.mo8586c(view)) * f13)));
            m11536p(2);
            return true;
        }
        i13 = i18;
        iAbs = Math.abs(i16);
        iAbs2 = Math.abs(i17);
        iAbs3 = Math.abs(i12);
        iAbs4 = Math.abs(i13);
        i14 = iAbs3 + iAbs4;
        i15 = iAbs + iAbs2;
        if (i12 != 0) {
            f3 = iAbs3;
            f10 = i14;
        } else {
            f3 = iAbs;
            f10 = i15;
        }
        float f15 = f3 / f10;
        if (i13 != 0) {
            f11 = iAbs4;
            f12 = i14;
        } else {
            f11 = iAbs2;
            f12 = i15;
        }
        float f16 = f11 / f12;
        c cVar2 = this.f33725q;
        overScroller.startScroll(left, top, i16, i17, (int) ((m11526f(i17, i13, cVar2.mo8620d()) * f16) + (m11526f(i16, i12, cVar2.mo8586c(view)) * f15)));
        m11536p(2);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11530j(int i10) {
        if ((this.f33719k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m11531k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m11521a();
        }
        if (this.f33720l == null) {
            this.f33720l = VelocityTracker.obtain();
        }
        this.f33720l.addMovement(motionEvent);
        int i11 = 0;
        c cVar = this.f33725q;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM11528h = m11528h((int) x10, (int) y10);
            m11534n(x10, y10, pointerId);
            m11539s(viewM11528h, pointerId);
            if ((this.f33716h[pointerId] & 0) != 0) {
                cVar.getClass();
            }
        } else {
            if (actionMasked == 1) {
                if (this.f33709a == 1) {
                    m11532l();
                }
                m11521a();
                return;
            }
            if (actionMasked == 2) {
                if (this.f33709a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i11 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (m11530j(pointerId2)) {
                            float x11 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f3 = x11 - this.f33712d[pointerId2];
                            float f10 = y11 - this.f33713e[pointerId2];
                            m11533m(f3, f10, pointerId2);
                            if (this.f33709a != 1) {
                                View viewM11528h2 = m11528h((int) x11, (int) y11);
                                if (m11524d(viewM11528h2, f3, f10) && m11539s(viewM11528h2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                    m11535o(motionEvent);
                    return;
                }
                if (m11530j(this.f33711c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f33711c);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f33714f;
                    int i12 = this.f33711c;
                    int i13 = (int) (x12 - fArr[i12]);
                    int i14 = (int) (y12 - this.f33715g[i12]);
                    int left = this.f33726r.getLeft() + i13;
                    int top = this.f33726r.getTop() + i14;
                    int left2 = this.f33726r.getLeft();
                    int top2 = this.f33726r.getTop();
                    if (i13 != 0) {
                        left = cVar.mo8584a(this.f33726r, left);
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        this.f33726r.offsetLeftAndRight(left - left2);
                    }
                    if (i14 != 0) {
                        top = cVar.mo8585b(this.f33726r, top);
                        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                        this.f33726r.offsetTopAndBottom(top - top2);
                    }
                    if (i13 != 0 || i14 != 0) {
                        cVar.mo8589g(this.f33726r, left, top);
                    }
                    m11535o(motionEvent);
                    return;
                }
                return;
            }
            if (actionMasked == 3) {
                if (this.f33709a == 1) {
                    this.f33727s = true;
                    cVar.mo8590h(this.f33726r, 0.0f, 0.0f);
                    this.f33727s = false;
                    if (this.f33709a == 1) {
                        m11536p(0);
                    }
                }
                m11521a();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f33709a == 1 && pointerId3 == this.f33711c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount2) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f33711c) {
                            View viewM11528h3 = m11528h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f33726r;
                            if (viewM11528h3 == view && m11539s(view, pointerId4)) {
                                i10 = this.f33711c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        m11532l();
                    }
                }
                m11525e(pointerId3);
                return;
            }
            int pointerId5 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            m11534n(x13, y13, pointerId5);
            if (this.f33709a == 0) {
                m11539s(m11528h((int) x13, (int) y13), pointerId5);
                if ((this.f33716h[pointerId5] & 0) != 0) {
                    cVar.getClass();
                }
            } else {
                int i15 = (int) x13;
                int i16 = (int) y13;
                View view2 = this.f33726r;
                if (view2 != null && i15 >= view2.getLeft() && i15 < view2.getRight() && i16 >= view2.getTop() && i16 < view2.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    m11539s(this.f33726r, pointerId5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11532l() {
        VelocityTracker velocityTracker = this.f33720l;
        float f3 = this.f33721m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f33720l.getXVelocity(this.f33711c);
        float fAbs = Math.abs(xVelocity);
        float f10 = this.f33722n;
        float f11 = 0.0f;
        if (fAbs < f10) {
            xVelocity = 0.0f;
        } else if (fAbs > f3) {
            if (xVelocity > 0.0f) {
                xVelocity = f3;
            } else {
                xVelocity = -f3;
            }
        }
        float yVelocity = this.f33720l.getYVelocity(this.f33711c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f10) {
            if (fAbs2 > f3) {
                if (yVelocity <= 0.0f) {
                    f3 = -f3;
                }
                f11 = f3;
            } else {
                f11 = yVelocity;
            }
        }
        this.f33727s = true;
        this.f33725q.mo8590h(this.f33726r, xVelocity, f11);
        this.f33727s = false;
        if (this.f33709a == 1) {
            m11536p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: m */
    public final void m11533m(float f3, float f10, int i10) {
        boolean zM11523c = m11523c(f3, f10, i10, 1);
        ?? r10 = zM11523c;
        if (m11523c(f10, f3, i10, 4)) {
            r10 = (zM11523c ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (m11523c(f3, f10, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (m11523c(f10, f3, i10, 8)) {
            r12 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 != 0) {
            int[] iArr = this.f33717i;
            iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
            this.f33725q.getClass();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11534n(float f3, float f10, int i10) {
        float[] fArr = this.f33712d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f33713e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f33714f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f33715g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f33716h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f33717i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f33718j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f33712d = fArr2;
            this.f33713e = fArr3;
            this.f33714f = fArr4;
            this.f33715g = fArr5;
            this.f33716h = iArr;
            this.f33717i = iArr2;
            this.f33718j = iArr3;
        }
        float[] fArr9 = this.f33712d;
        this.f33714f[i10] = f3;
        fArr9[i10] = f3;
        float[] fArr10 = this.f33713e;
        this.f33715g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f33716h;
        int i13 = (int) f3;
        int i14 = (int) f10;
        ViewGroup viewGroup = this.f33728t;
        int left = viewGroup.getLeft();
        int i15 = this.f33723o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f33719k |= 1 << i10;
    }

    /* JADX INFO: renamed from: o */
    public final void m11535o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m11530j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f33714f[pointerId] = x10;
                this.f33715g[pointerId] = y10;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11536p(int i10) {
        this.f33728t.removeCallbacks(this.f33729u);
        if (this.f33709a != i10) {
            this.f33709a = i10;
            this.f33725q.mo8588f(i10);
            if (this.f33709a == 0) {
                this.f33726r = null;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m11537q(int i10, int i11) {
        if (this.f33727s) {
            return m11529i(i10, i11, (int) this.f33720l.getXVelocity(this.f33711c), (int) this.f33720l.getYVelocity(this.f33711c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX INFO: renamed from: r */
    public final boolean m11538r(MotionEvent motionEvent) {
        View viewM11528h;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m11521a();
        }
        if (this.f33720l == null) {
            this.f33720l = VelocityTracker.obtain();
        }
        this.f33720l.addMovement(motionEvent);
        c cVar = this.f33725q;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m11534n(x10, y10, pointerId);
            View viewM11528h2 = m11528h((int) x10, (int) y10);
            if (viewM11528h2 == this.f33726r && this.f33709a == 2) {
                m11539s(viewM11528h2, pointerId);
            }
            if ((this.f33716h[pointerId] & 0) != 0) {
                cVar.getClass();
            }
        } else if (actionMasked == 1) {
            m11521a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m11521a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                m11534n(x11, y11, pointerId2);
                int i10 = this.f33709a;
                if (i10 == 0) {
                    if ((this.f33716h[pointerId2] & 0) != 0) {
                        cVar.getClass();
                    }
                } else if (i10 == 2 && (viewM11528h = m11528h((int) x11, (int) y11)) == this.f33726r) {
                    m11539s(viewM11528h, pointerId2);
                }
            } else if (actionMasked == 6) {
                m11525e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f33712d != null && this.f33713e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 0; i11 < pointerCount; i11++) {
                int pointerId3 = motionEvent.getPointerId(i11);
                if (m11530j(pointerId3)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f3 = x12 - this.f33712d[pointerId3];
                    float f10 = y12 - this.f33713e[pointerId3];
                    View viewM11528h3 = m11528h((int) x12, (int) y12);
                    boolean z10 = viewM11528h3 != null && m11524d(viewM11528h3, f3, f10);
                    if (!z10) {
                        m11533m(f3, f10, pointerId3);
                        if (this.f33709a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM11528h3.getLeft();
                        int iMo8584a = cVar.mo8584a(viewM11528h3, ((int) f3) + left);
                        int top = viewM11528h3.getTop();
                        int iMo8585b = cVar.mo8585b(viewM11528h3, ((int) f10) + top);
                        int iMo8586c = cVar.mo8586c(viewM11528h3);
                        int iMo8620d = cVar.mo8620d();
                        if ((iMo8586c == 0 || (iMo8586c > 0 && iMo8584a == left)) && (iMo8620d == 0 || (iMo8620d > 0 && iMo8585b == top))) {
                            break;
                        }
                        m11533m(f3, f10, pointerId3);
                        if (this.f33709a != 1 || (z10 && m11539s(viewM11528h3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m11535o(motionEvent);
        }
        return this.f33709a == 1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11539s(View view, int i10) {
        if (view == this.f33726r && this.f33711c == i10) {
            return true;
        }
        if (view == null || !this.f33725q.mo8591i(view, i10)) {
            return false;
        }
        this.f33711c = i10;
        m11522b(view, i10);
        return true;
    }
}
