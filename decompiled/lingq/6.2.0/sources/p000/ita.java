package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ita {

    /* JADX INFO: renamed from: w */
    public static final wa4 f44539w = new wa4(3);

    /* JADX INFO: renamed from: a */
    public int f44540a;

    /* JADX INFO: renamed from: b */
    public final int f44541b;

    /* JADX INFO: renamed from: d */
    public float[] f44543d;

    /* JADX INFO: renamed from: e */
    public float[] f44544e;

    /* JADX INFO: renamed from: f */
    public float[] f44545f;

    /* JADX INFO: renamed from: g */
    public float[] f44546g;

    /* JADX INFO: renamed from: h */
    public int[] f44547h;

    /* JADX INFO: renamed from: i */
    public int[] f44548i;

    /* JADX INFO: renamed from: j */
    public int[] f44549j;

    /* JADX INFO: renamed from: k */
    public int f44550k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f44551l;

    /* JADX INFO: renamed from: m */
    public final float f44552m;

    /* JADX INFO: renamed from: n */
    public final float f44553n;

    /* JADX INFO: renamed from: o */
    public final int f44554o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f44555p;

    /* JADX INFO: renamed from: q */
    public final tad f44556q;

    /* JADX INFO: renamed from: r */
    public View f44557r;

    /* JADX INFO: renamed from: s */
    public boolean f44558s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f44559t;

    /* JADX INFO: renamed from: u */
    public wa4 f44560u;

    /* JADX INFO: renamed from: c */
    public int f44542c = -1;

    /* JADX INFO: renamed from: v */
    public final RunnableC3468pp f44561v = new RunnableC3468pp(this, 18);

    public ita(Context context, CoordinatorLayout coordinatorLayout, tad tadVar) {
        if (tadVar == null) {
            C3386nv.m17635v("Callback may not be null");
            throw null;
        }
        this.f44559t = coordinatorLayout;
        this.f44556q = tadVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f44554o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f44541b = viewConfiguration.getScaledTouchSlop();
        this.f44552m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f44553n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f44560u = f44539w;
        this.f44555p = new OverScroller(context, new x26(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final void m14128a() {
        this.f44542c = -1;
        float[] fArr = this.f44543d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f44544e, 0.0f);
            Arrays.fill(this.f44545f, 0.0f);
            Arrays.fill(this.f44546g, 0.0f);
            Arrays.fill(this.f44547h, 0);
            Arrays.fill(this.f44548i, 0);
            Arrays.fill(this.f44549j, 0);
            this.f44550k = 0;
        }
        VelocityTracker velocityTracker = this.f44551l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f44551l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14129b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f44559t;
        if (parent != coordinatorLayout) {
            ij6.m13965w("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", coordinatorLayout, ")");
            return;
        }
        this.f44557r = view;
        this.f44542c = i;
        this.f44556q.mo19433e(view, i);
        m14140m(1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public final boolean m14130c(View view, float f, float f2) {
        if (view != null) {
            tad tadVar = this.f44556q;
            boolean z = tadVar.mo13887c(view) > 0;
            boolean z2 = tadVar.mo13888d() > 0;
            int i = this.f44541b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m14131d(int i) {
        float[] fArr = this.f44543d;
        if (fArr != null) {
            int i2 = this.f44550k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f44544e[i] = 0.0f;
                this.f44545f[i] = 0.0f;
                this.f44546g[i] = 0.0f;
                this.f44547h[i] = 0;
                this.f44548i[i] = 0;
                this.f44549j[i] = 0;
                this.f44550k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m14132e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f44559t.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14133f() {
        if (this.f44540a == 2) {
            OverScroller overScroller = this.f44555p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f44557r.getLeft();
            int top = currY - this.f44557r.getTop();
            if (left != 0) {
                View view = this.f44557r;
                WeakHashMap weakHashMap = dta.f36217a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f44557r;
                WeakHashMap weakHashMap2 = dta.f36217a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f44556q.mo13890g(this.f44557r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f44559t.post(this.f44561v);
            }
        }
        return this.f44540a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m14134g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f44559t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f44556q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14135h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f44557r.getLeft();
        int top = this.f44557r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f44555p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m14140m(0);
            return false;
        }
        View view = this.f44557r;
        int i7 = (int) this.f44553n;
        int i8 = (int) this.f44552m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        tad tadVar = this.f44556q;
        int iM14132e = (int) ((m14132e(i6, i4, tadVar.mo13888d()) * f6) + (m14132e(i5, i3, tadVar.mo13887c(view)) * f5));
        this.f44560u = f44539w;
        overScroller.startScroll(left, top, i5, i6, iM14132e);
        m14140m(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m14136i(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m14128a();
        }
        if (this.f44551l == null) {
            this.f44551l = VelocityTracker.obtain();
        }
        this.f44551l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM14134g = m14134g((int) x, (int) y);
            m14138k(x, y, pointerId);
            m14143p(viewM14134g, pointerId);
            int i3 = this.f44547h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f44540a == 1) {
                m14137j();
            }
            m14128a();
            return;
        }
        tad tadVar = this.f44556q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f44540a == 1) {
                    this.f44558s = true;
                    tadVar.mo13891h(this.f44557r, 0.0f, 0.0f);
                    this.f44558s = false;
                    if (this.f44540a == 1) {
                        m14140m(0);
                    }
                }
                m14128a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m14138k(x2, y2, pointerId2);
                if (this.f44540a == 0) {
                    m14143p(m14134g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f44547h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f44557r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m14143p(this.f44557r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f44540a == 1 && pointerId3 == this.f44542c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f44542c) {
                        View viewM14134g2 = m14134g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f44557r;
                        if (viewM14134g2 == view2 && m14143p(view2, pointerId4)) {
                            i = this.f44542c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m14137j();
                }
            }
            m14131d(pointerId3);
            return;
        }
        if (this.f44540a == 1) {
            int i7 = this.f44542c;
            if ((this.f44550k & (1 << i7)) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f44545f;
            int i8 = this.f44542c;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.f44546g[i8]);
            int left = this.f44557r.getLeft() + i9;
            int top = this.f44557r.getTop() + i10;
            int left2 = this.f44557r.getLeft();
            int top2 = this.f44557r.getTop();
            if (i9 != 0) {
                left = tadVar.mo13885a(this.f44557r, left);
                WeakHashMap weakHashMap = dta.f36217a;
                this.f44557r.offsetLeftAndRight(left - left2);
            }
            if (i10 != 0) {
                top = tadVar.mo13886b(this.f44557r, top);
                WeakHashMap weakHashMap2 = dta.f36217a;
                this.f44557r.offsetTopAndBottom(top - top2);
            }
            if (i9 != 0 || i10 != 0) {
                tadVar.mo13890g(this.f44557r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if ((this.f44550k & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i2);
                    float y4 = motionEvent.getY(i2);
                    float f = x4 - this.f44543d[pointerId5];
                    float f2 = y4 - this.f44544e[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i11 = this.f44547h[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i12 = this.f44547h[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i13 = this.f44547h[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i14 = this.f44547h[pointerId5];
                    if (this.f44540a != 1) {
                        View viewM14134g3 = m14134g((int) x4, (int) y4);
                        if (m14130c(viewM14134g3, f, f2) && m14143p(viewM14134g3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        m14139l(motionEvent);
    }

    /* JADX INFO: renamed from: j */
    public final void m14137j() {
        VelocityTracker velocityTracker = this.f44551l;
        float f = this.f44552m;
        velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, f);
        float xVelocity = this.f44551l.getXVelocity(this.f44542c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f44553n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f44551l.getYVelocity(this.f44542c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f44558s = true;
        this.f44556q.mo13891h(this.f44557r, xVelocity, f);
        this.f44558s = false;
        if (this.f44540a == 1) {
            m14140m(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m14138k(float f, float f2, int i) {
        float[] fArr = this.f44543d;
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
                float[] fArr6 = this.f44544e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f44545f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f44546g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f44547h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f44548i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f44549j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f44543d = fArr2;
            this.f44544e = fArr3;
            this.f44545f = fArr4;
            this.f44546g = fArr5;
            this.f44547h = iArr;
            this.f44548i = iArr2;
            this.f44549j = iArr3;
        }
        float[] fArr9 = this.f44543d;
        this.f44545f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f44544e;
        this.f44546g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f44547h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f44559t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f44554o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f44550k |= 1 << i;
    }

    /* JADX INFO: renamed from: l */
    public final void m14139l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f44550k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f44545f[pointerId] = x;
                this.f44546g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14140m(int i) {
        this.f44559t.removeCallbacks(this.f44561v);
        if (this.f44540a != i) {
            this.f44540a = i;
            this.f44556q.mo13889f(i);
            if (this.f44540a == 0) {
                this.f44557r = null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14141n(int i, int i2) {
        if (this.f44558s) {
            return m14135h(i, i2, (int) this.f44551l.getXVelocity(this.f44542c), (int) this.f44551l.getYVelocity(this.f44542c));
        }
        C3386nv.m17633t("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX INFO: renamed from: o */
    public final boolean m14142o(MotionEvent motionEvent) {
        View viewM14134g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m14128a();
        }
        if (this.f44551l == null) {
            this.f44551l = VelocityTracker.obtain();
        }
        this.f44551l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m14138k(x, y, pointerId);
            View viewM14134g2 = m14134g((int) x, (int) y);
            if (viewM14134g2 == this.f44557r && this.f44540a == 2) {
                m14143p(viewM14134g2, pointerId);
            }
            int i = this.f44547h[pointerId];
        } else if (actionMasked == 1) {
            m14128a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m14128a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m14138k(x2, y2, pointerId2);
                int i2 = this.f44540a;
                if (i2 == 0) {
                    int i3 = this.f44547h[pointerId2];
                } else if (i2 == 2 && (viewM14134g = m14134g((int) x2, (int) y2)) == this.f44557r) {
                    m14143p(viewM14134g, pointerId2);
                }
            } else if (actionMasked == 6) {
                m14131d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f44543d != null && this.f44544e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f44550k & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f44543d[pointerId3];
                    float f2 = y3 - this.f44544e[pointerId3];
                    View viewM14134g3 = m14134g((int) x3, (int) y3);
                    boolean zM14130c = m14130c(viewM14134g3, f, f2);
                    if (!zM14130c) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f44547h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f44547h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f44547h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f44547h[pointerId3];
                        if (this.f44540a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM14134g3.getLeft();
                        tad tadVar = this.f44556q;
                        int iMo13885a = tadVar.mo13885a(viewM14134g3, ((int) f) + left);
                        int top = viewM14134g3.getTop();
                        int iMo13886b = tadVar.mo13886b(viewM14134g3, ((int) f2) + top);
                        int iMo13887c = tadVar.mo13887c(viewM14134g3);
                        int iMo13888d = tadVar.mo13888d();
                        if ((iMo13887c == 0 || (iMo13887c > 0 && iMo13885a == left)) && (iMo13888d == 0 || (iMo13888d > 0 && iMo13886b == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f44547h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f44547h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.f44547h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.f44547h[pointerId3];
                        if (this.f44540a != 1 || (zM14130c && m14143p(viewM14134g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m14139l(motionEvent);
        }
        return this.f44540a == 1;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m14143p(View view, int i) {
        if (view == this.f44557r && this.f44542c == i) {
            return true;
        }
        if (view == null || !this.f44556q.mo13892i(view, i)) {
            return false;
        }
        this.f44542c = i;
        m14129b(view, i);
        return true;
    }
}
