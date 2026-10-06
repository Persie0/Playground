package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aia {

    /* JADX INFO: renamed from: e */
    private static final Interpolator f401e = new ahy(0);

    /* JADX INFO: renamed from: a */
    public int f402a;

    /* JADX INFO: renamed from: b */
    public int f403b;

    /* JADX INFO: renamed from: d */
    public View f405d;

    /* JADX INFO: renamed from: f */
    private float[] f406f;

    /* JADX INFO: renamed from: g */
    private float[] f407g;

    /* JADX INFO: renamed from: h */
    private float[] f408h;

    /* JADX INFO: renamed from: i */
    private float[] f409i;

    /* JADX INFO: renamed from: j */
    private int[] f410j;

    /* JADX INFO: renamed from: k */
    private int[] f411k;

    /* JADX INFO: renamed from: l */
    private int[] f412l;

    /* JADX INFO: renamed from: m */
    private int f413m;

    /* JADX INFO: renamed from: n */
    private VelocityTracker f414n;

    /* JADX INFO: renamed from: o */
    private final float f415o;

    /* JADX INFO: renamed from: p */
    private float f416p;

    /* JADX INFO: renamed from: q */
    private int f417q;

    /* JADX INFO: renamed from: r */
    private final OverScroller f418r;

    /* JADX INFO: renamed from: s */
    private final ahz f419s;

    /* JADX INFO: renamed from: t */
    private boolean f420t;

    /* JADX INFO: renamed from: u */
    private final ViewGroup f421u;

    /* JADX INFO: renamed from: c */
    public int f404c = -1;

    /* JADX INFO: renamed from: v */
    private final Runnable f422v = new RunnableC0852nk(this, 12);

    /* JADX INFO: renamed from: b */
    public static aia m728b(ViewGroup viewGroup, ahz ahzVar) {
        return new aia(viewGroup.getContext(), viewGroup, ahzVar);
    }

    /* JADX INFO: renamed from: m */
    private final int m729m(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.f421u.getWidth();
        int i4 = width / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            float f = i4;
            iAbs = Math.round(Math.abs((f + (fSin * f)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    /* JADX INFO: renamed from: n */
    private final void m730n(int i) {
        float[] fArr = this.f406f;
        if (fArr == null || !m747h(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.f407g[i] = 0.0f;
        this.f408h[i] = 0.0f;
        this.f409i[i] = 0.0f;
        this.f410j[i] = 0;
        this.f411k[i] = 0;
        this.f412l[i] = 0;
        this.f413m = ((1 << i) ^ (-1)) & this.f413m;
    }

    /* JADX INFO: renamed from: o */
    private final void m731o(float f, float f2) {
        this.f420t = true;
        this.f419s.mo711d(this.f405d, f, f2);
        this.f420t = false;
        if (this.f402a == 1) {
            m745f(0);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m732p() {
        this.f414n.computeCurrentVelocity(1000, this.f415o);
        m731o(m738v(this.f414n.getXVelocity(this.f404c), this.f416p, this.f415o), m738v(this.f414n.getYVelocity(this.f404c), this.f416p, this.f415o));
    }

    /* JADX INFO: renamed from: q */
    private final void m733q(float f, float f2, int i) {
        m740x(f, f2, i);
        m740x(f2, f, i);
        m740x(f, f2, i);
        m740x(f2, f, i);
    }

    /* JADX INFO: renamed from: r */
    private final void m734r(float f, float f2, int i) {
        float[] fArr = this.f406f;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f407g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f408h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f409i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f410j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f411k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f412l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f406f = fArr2;
            this.f407g = fArr3;
            this.f408h = fArr4;
            this.f409i = fArr5;
            this.f410j = iArr;
            this.f411k = iArr2;
            this.f412l = iArr3;
        }
        float[] fArr9 = this.f406f;
        this.f408h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f407g;
        this.f409i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f410j;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f421u.getLeft() + this.f417q ? 1 : 0;
        if (i4 < this.f421u.getTop() + this.f417q) {
            i5 |= 4;
        }
        if (i3 > this.f421u.getRight() - this.f417q) {
            i5 |= 2;
        }
        if (i4 > this.f421u.getBottom() - this.f417q) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f413m |= 1 << i;
    }

    /* JADX INFO: renamed from: s */
    private final void m735s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m737u(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f408h[pointerId] = x;
                this.f409i[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private final boolean m736t(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f419s.mo708a(view) > 0;
        boolean z2 = this.f419s.mo715h() > 0;
        if (z && z2) {
            int i = this.f403b;
            return (f * f) + (f2 * f2) > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f403b);
        }
        return z2 && Math.abs(f2) > ((float) this.f403b);
    }

    /* JADX INFO: renamed from: u */
    private final boolean m737u(int i) {
        return m747h(i);
    }

    /* JADX INFO: renamed from: v */
    private static final float m738v(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* JADX INFO: renamed from: w */
    private static final int m739w(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: x */
    private final void m740x(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.f410j[i];
    }

    /* JADX INFO: renamed from: a */
    public final View m741a(int i, int i2) {
        for (int childCount = this.f421u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f421u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m742c() {
        this.f404c = -1;
        float[] fArr = this.f406f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f407g, 0.0f);
            Arrays.fill(this.f408h, 0.0f);
            Arrays.fill(this.f409i, 0.0f);
            Arrays.fill(this.f410j, 0);
            Arrays.fill(this.f411k, 0);
            Arrays.fill(this.f412l, 0);
            this.f413m = 0;
        }
        VelocityTracker velocityTracker = this.f414n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f414n = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m743d(View view, int i) {
        if (view.getParent() == this.f421u) {
            this.f405d = view;
            this.f404c = i;
            this.f419s.mo709b(view, i);
            m745f(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f421u + ")");
    }

    /* JADX INFO: renamed from: e */
    public final void m744e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            m742c();
            actionMasked = 0;
        }
        if (this.f414n == null) {
            this.f414n = VelocityTracker.obtain();
        }
        this.f414n.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View viewM741a = m741a((int) x, (int) y);
                m734r(x, y, pointerId);
                m750k(viewM741a, pointerId);
                int i2 = this.f410j[pointerId];
                break;
            case 1:
                if (this.f402a == 1) {
                    m732p();
                }
                m742c();
                break;
            case 2:
                if (this.f402a == 1) {
                    int i3 = this.f404c;
                    if (m737u(i3) && (iFindPointerIndex = motionEvent.findPointerIndex(i3)) != -1) {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = this.f408h;
                        int i4 = this.f404c;
                        float f = x2 - fArr[i4];
                        float f2 = y2 - this.f409i[i4];
                        int i5 = (int) f;
                        int left = this.f405d.getLeft() + i5;
                        int i6 = (int) f2;
                        int top = this.f405d.getTop() + i6;
                        int left2 = this.f405d.getLeft();
                        int top2 = this.f405d.getTop();
                        if (i5 != 0) {
                            left = this.f419s.mo713f(this.f405d, left);
                            int[] iArr = afq.f274a;
                            this.f405d.offsetLeftAndRight(left - left2);
                        }
                        if (i6 != 0) {
                            top = this.f419s.mo714g(this.f405d, top);
                            int[] iArr2 = afq.f274a;
                            this.f405d.offsetTopAndBottom(top - top2);
                        }
                        if (i5 != 0 || i6 != 0) {
                            this.f419s.mo716i(this.f405d, left, top);
                        }
                    }
                } else {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (m737u(pointerId2)) {
                            float x3 = motionEvent.getX(i);
                            float y3 = motionEvent.getY(i);
                            float f3 = x3 - this.f406f[pointerId2];
                            float f4 = y3 - this.f407g[pointerId2];
                            m733q(f3, f4, pointerId2);
                            if (this.f402a != 1) {
                                View viewM741a2 = m741a((int) x3, (int) y3);
                                if (!m736t(viewM741a2, f3, f4) || !m750k(viewM741a2, pointerId2)) {
                                }
                            }
                        }
                        i++;
                    }
                }
                m735s(motionEvent);
                break;
            case 3:
                if (this.f402a == 1) {
                    m731o(0.0f, 0.0f);
                }
                m742c();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m734r(x4, y4, pointerId3);
                if (this.f402a != 0) {
                    int i7 = (int) x4;
                    int i8 = (int) y4;
                    View view = this.f405d;
                    if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                        m750k(this.f405d, pointerId3);
                    }
                } else {
                    m750k(m741a((int) x4, (int) y4), pointerId3);
                    int i9 = this.f410j[pointerId3];
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f402a == 1 && pointerId4 == this.f404c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i < pointerCount2) {
                        int pointerId5 = motionEvent.getPointerId(i);
                        if (pointerId5 != this.f404c) {
                            View viewM741a3 = m741a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view2 = this.f405d;
                            if (viewM741a3 == view2 && m750k(view2, pointerId5)) {
                                if (this.f404c == -1) {
                                    m732p();
                                }
                            }
                        }
                        i++;
                    }
                    m732p();
                }
                m730n(pointerId4);
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m745f(int i) {
        this.f421u.removeCallbacks(this.f422v);
        if (this.f402a != i) {
            this.f402a = i;
            this.f419s.mo710c(i);
            if (this.f402a == 0) {
                this.f405d = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m746g(int i, int i2, int i3, int i4) {
        int i5;
        int left = this.f405d.getLeft();
        int top = this.f405d.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else {
            if (i7 == 0) {
                this.f418r.abortAnimation();
                m745f(0);
                return false;
            }
            i5 = 0;
        }
        View view = this.f405d;
        int iM739w = m739w(i3, (int) this.f416p, (int) this.f415o);
        int iM739w2 = m739w(i4, (int) this.f416p, (int) this.f415o);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i7);
        int iAbs3 = Math.abs(iM739w);
        int iAbs4 = Math.abs(iM739w2);
        int i8 = iAbs3 + iAbs4;
        int i9 = iAbs + iAbs2;
        this.f418r.startScroll(left, top, i5, i7, (int) ((m729m(i5, iM739w, this.f419s.mo708a(view)) * (iM739w != 0 ? iAbs3 / i8 : iAbs / i9)) + (m729m(i7, iM739w2, this.f419s.mo715h()) * (iM739w2 != 0 ? iAbs4 / i8 : iAbs2 / i9))));
        m745f(2);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m747h(int i) {
        return ((1 << i) & this.f413m) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m748i(int i, int i2) {
        if (this.f420t) {
            return m746g(i, i2, (int) this.f414n.getXVelocity(this.f404c), (int) this.f414n.getYVelocity(this.f404c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX INFO: renamed from: j */
    public final boolean m749j(MotionEvent motionEvent) {
        View viewM741a;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m742c();
            actionMasked = 0;
        }
        if (this.f414n == null) {
            this.f414n = VelocityTracker.obtain();
        }
        this.f414n.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                m734r(x, y, pointerId);
                View viewM741a2 = m741a((int) x, (int) y);
                if (viewM741a2 == this.f405d && this.f402a == 2) {
                    m750k(viewM741a2, pointerId);
                }
                int i = this.f410j[pointerId];
                break;
            case 1:
            case 3:
                m742c();
                break;
            case 2:
                if (this.f406f != null && this.f407g != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m737u(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f406f[pointerId2];
                            float f2 = y2 - this.f407g[pointerId2];
                            View viewM741a3 = m741a((int) x2, (int) y2);
                            boolean zM736t = m736t(viewM741a3, f, f2);
                            if (zM736t) {
                                int left = viewM741a3.getLeft();
                                int iMo713f = this.f419s.mo713f(viewM741a3, ((int) f) + left);
                                int top = viewM741a3.getTop();
                                int iMo714g = this.f419s.mo714g(viewM741a3, ((int) f2) + top);
                                int iMo708a = this.f419s.mo708a(viewM741a3);
                                int iMo715h = this.f419s.mo715h();
                                if ((iMo708a != 0 && (iMo708a <= 0 || iMo713f != left)) || (iMo715h != 0 && (iMo715h <= 0 || iMo714g != top))) {
                                    m733q(f, f2, pointerId2);
                                    if (this.f402a != 1 || (zM736t && m750k(viewM741a3, pointerId2))) {
                                    }
                                }
                                m735s(motionEvent);
                            } else {
                                m733q(f, f2, pointerId2);
                                if (this.f402a != 1) {
                                }
                                m735s(motionEvent);
                            }
                            break;
                        }
                    }
                    m735s(motionEvent);
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m734r(x3, y3, pointerId3);
                int i3 = this.f402a;
                if (i3 == 0) {
                    int i4 = this.f410j[pointerId3];
                } else if (i3 == 2 && (viewM741a = m741a((int) x3, (int) y3)) == this.f405d) {
                    m750k(viewM741a, pointerId3);
                }
                break;
            case 6:
                m730n(motionEvent.getPointerId(actionIndex));
                break;
        }
        return this.f402a == 1;
    }

    /* JADX INFO: renamed from: k */
    final boolean m750k(View view, int i) {
        if (view == this.f405d && this.f404c == i) {
            return true;
        }
        if (view == null || !this.f419s.mo712e(view, i)) {
            return false;
        }
        this.f404c = i;
        m743d(view, i);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m751l() {
        if (this.f402a == 2) {
            boolean zComputeScrollOffset = this.f418r.computeScrollOffset();
            int currX = this.f418r.getCurrX();
            int currY = this.f418r.getCurrY();
            int left = currX - this.f405d.getLeft();
            int top = currY - this.f405d.getTop();
            if (left != 0) {
                View view = this.f405d;
                int[] iArr = afq.f274a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f405d;
                int[] iArr2 = afq.f274a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f419s.mo716i(this.f405d, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.f421u.post(this.f422v);
            } else if (currX == this.f418r.getFinalX() && currY == this.f418r.getFinalY()) {
                this.f418r.abortAnimation();
                this.f421u.post(this.f422v);
            }
        }
        return this.f402a == 2;
    }

    private aia(Context context, ViewGroup viewGroup, ahz ahzVar) {
        if (ahzVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f421u = viewGroup;
        this.f419s = ahzVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f417q = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f403b = viewConfiguration.getScaledTouchSlop();
        this.f415o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f416p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f418r = new OverScroller(context, f401e);
    }
}
