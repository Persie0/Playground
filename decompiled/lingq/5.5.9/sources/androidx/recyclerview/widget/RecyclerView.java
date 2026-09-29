package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.kochava.tracker.BuildConfig;
import dm.C5212l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p024b3.C1298e;
import p062d3.InterfaceC5041a;
import p190j4.C6407a;
import p326q.C8452h;
import p338qd.C8573r0;
import p385sf.C9000b;
import p389t2.C9191j;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10033d0;
import p471x2.C10041h0;
import p471x2.C10049l0;
import p471x2.C10052n;
import p471x2.InterfaceC10050m;
import p497y2.C10280b;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC10050m {

    /* JADX INFO: renamed from: W0 */
    public static final int[] f6956W0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: X0 */
    public static final float f6957X0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: Y0 */
    public static final boolean f6958Y0 = true;

    /* JADX INFO: renamed from: Z0 */
    public static final boolean f6959Z0 = true;

    /* JADX INFO: renamed from: a1 */
    public static final boolean f6960a1 = true;

    /* JADX INFO: renamed from: b1 */
    public static final Class<?>[] f6961b1;

    /* JADX INFO: renamed from: c1 */
    public static final InterpolatorC1110c f6962c1;

    /* JADX INFO: renamed from: d1 */
    public static final C1132y f6963d1;

    /* JADX INFO: renamed from: A0 */
    public final RunnableC1107a0 f6964A0;

    /* JADX INFO: renamed from: B0 */
    public RunnableC1164o f6965B0;

    /* JADX INFO: renamed from: C0 */
    public final RunnableC1164o.b f6966C0;

    /* JADX INFO: renamed from: D0 */
    public final C1131x f6967D0;

    /* JADX INFO: renamed from: E0 */
    public AbstractC1125r f6968E0;

    /* JADX INFO: renamed from: F0 */
    public ArrayList f6969F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f6970G0;

    /* JADX INFO: renamed from: H */
    public Adapter f6971H;

    /* JADX INFO: renamed from: H0 */
    public boolean f6972H0;

    /* JADX INFO: renamed from: I */
    public AbstractC1120m f6973I;

    /* JADX INFO: renamed from: I0 */
    public final C1118k f6974I0;

    /* JADX INFO: renamed from: J */
    public InterfaceC1128u f6975J;

    /* JADX INFO: renamed from: J0 */
    public boolean f6976J0;

    /* JADX INFO: renamed from: K */
    public final ArrayList f6977K;

    /* JADX INFO: renamed from: K0 */
    public C1149e0 f6978K0;

    /* JADX INFO: renamed from: L */
    public final ArrayList<AbstractC1119l> f6979L;

    /* JADX INFO: renamed from: L0 */
    public final int[] f6980L0;

    /* JADX INFO: renamed from: M */
    public final ArrayList<InterfaceC1124q> f6981M;

    /* JADX INFO: renamed from: M0 */
    public C10052n f6982M0;

    /* JADX INFO: renamed from: N */
    public InterfaceC1124q f6983N;

    /* JADX INFO: renamed from: N0 */
    public final int[] f6984N0;

    /* JADX INFO: renamed from: O */
    public boolean f6985O;

    /* JADX INFO: renamed from: O0 */
    public final int[] f6986O0;

    /* JADX INFO: renamed from: P */
    public boolean f6987P;

    /* JADX INFO: renamed from: P0 */
    public final int[] f6988P0;

    /* JADX INFO: renamed from: Q */
    public boolean f6989Q;

    /* JADX INFO: renamed from: Q0 */
    public final ArrayList f6990Q0;

    /* JADX INFO: renamed from: R */
    public int f6991R;

    /* JADX INFO: renamed from: R0 */
    public final RunnableC1108b f6992R0;

    /* JADX INFO: renamed from: S */
    public boolean f6993S;

    /* JADX INFO: renamed from: S0 */
    public boolean f6994S0;

    /* JADX INFO: renamed from: T */
    public boolean f6995T;

    /* JADX INFO: renamed from: T0 */
    public int f6996T0;

    /* JADX INFO: renamed from: U */
    public boolean f6997U;

    /* JADX INFO: renamed from: U0 */
    public int f6998U0;

    /* JADX INFO: renamed from: V */
    public int f6999V;

    /* JADX INFO: renamed from: V0 */
    public final C1111d f7000V0;

    /* JADX INFO: renamed from: W */
    public boolean f7001W;

    /* JADX INFO: renamed from: a */
    public final float f7002a;

    /* JADX INFO: renamed from: a0 */
    public final AccessibilityManager f7003a0;

    /* JADX INFO: renamed from: b */
    public final C1129v f7004b;

    /* JADX INFO: renamed from: b0 */
    public ArrayList f7005b0;

    /* JADX INFO: renamed from: c */
    public final C1127t f7006c;

    /* JADX INFO: renamed from: c0 */
    public boolean f7007c0;

    /* JADX INFO: renamed from: d */
    public SavedState f7008d;

    /* JADX INFO: renamed from: d0 */
    public boolean f7009d0;

    /* JADX INFO: renamed from: e */
    public C1140a f7010e;

    /* JADX INFO: renamed from: e0 */
    public int f7011e0;

    /* JADX INFO: renamed from: f */
    public C1150f f7012f;

    /* JADX INFO: renamed from: f0 */
    public int f7013f0;

    /* JADX INFO: renamed from: g */
    public final C1159j0 f7014g;

    /* JADX INFO: renamed from: g0 */
    public C1116i f7015g0;

    /* JADX INFO: renamed from: h */
    public boolean f7016h;

    /* JADX INFO: renamed from: h0 */
    public EdgeEffect f7017h0;

    /* JADX INFO: renamed from: i */
    public final RunnableC1106a f7018i;

    /* JADX INFO: renamed from: i0 */
    public EdgeEffect f7019i0;

    /* JADX INFO: renamed from: j */
    public final Rect f7020j;

    /* JADX INFO: renamed from: j0 */
    public EdgeEffect f7021j0;

    /* JADX INFO: renamed from: k */
    public final Rect f7022k;

    /* JADX INFO: renamed from: k0 */
    public EdgeEffect f7023k0;

    /* JADX INFO: renamed from: l */
    public final RectF f7024l;

    /* JADX INFO: renamed from: l0 */
    public AbstractC1117j f7025l0;

    /* JADX INFO: renamed from: m0 */
    public int f7026m0;

    /* JADX INFO: renamed from: n0 */
    public int f7027n0;

    /* JADX INFO: renamed from: o0 */
    public VelocityTracker f7028o0;

    /* JADX INFO: renamed from: p0 */
    public int f7029p0;

    /* JADX INFO: renamed from: q0 */
    public int f7030q0;

    /* JADX INFO: renamed from: r0 */
    public int f7031r0;

    /* JADX INFO: renamed from: s0 */
    public int f7032s0;

    /* JADX INFO: renamed from: t0 */
    public int f7033t0;

    /* JADX INFO: renamed from: u0 */
    public AbstractC1123p f7034u0;

    /* JADX INFO: renamed from: v0 */
    public final int f7035v0;

    /* JADX INFO: renamed from: w0 */
    public final int f7036w0;

    /* JADX INFO: renamed from: x0 */
    public final float f7037x0;

    /* JADX INFO: renamed from: y0 */
    public final float f7038y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f7039z0;

    public static abstract class Adapter<VH extends AbstractC1109b0> {

        /* JADX INFO: renamed from: a */
        public final C1113f f7040a = new C1113f();

        /* JADX INFO: renamed from: b */
        public boolean f7041b = false;

        /* JADX INFO: renamed from: c */
        public StateRestorationPolicy f7042c = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo4226e();

        /* JADX INFO: renamed from: f */
        public long mo4227f(int i10) {
            return -1L;
        }

        /* JADX INFO: renamed from: g */
        public int mo4228g(int i10) {
            return 0;
        }

        /* JADX INFO: renamed from: h */
        public void mo4229h(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public abstract void mo478i(VH vh2, int i10);

        /* JADX INFO: renamed from: j */
        public abstract AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10);

        /* JADX INFO: renamed from: k */
        public void mo4230k(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo4231l(VH vh2) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public void mo4232m(VH vh2) {
        }

        /* JADX INFO: renamed from: n */
        public void mo4233n(VH vh2) {
        }

        /* JADX INFO: renamed from: o */
        public final void m4234o(AbstractC1114g abstractC1114g) {
            this.f7040a.registerObserver(abstractC1114g);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1105a();

        /* JADX INFO: renamed from: c */
        public Parcelable f7043c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C1105a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = AbstractC1120m.class.getClassLoader();
            }
            this.f7043c = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeParcelable(this.f7043c, 0);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC1106a implements Runnable {
        public RunnableC1106a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6989Q && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.f6985O) {
                    recyclerView.requestLayout();
                } else if (recyclerView.f6995T) {
                    recyclerView.f6993S = true;
                } else {
                    recyclerView.m4213o();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public class RunnableC1107a0 implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f7045a;

        /* JADX INFO: renamed from: b */
        public int f7046b;

        /* JADX INFO: renamed from: c */
        public OverScroller f7047c;

        /* JADX INFO: renamed from: d */
        public Interpolator f7048d;

        /* JADX INFO: renamed from: e */
        public boolean f7049e;

        /* JADX INFO: renamed from: f */
        public boolean f7050f;

        public RunnableC1107a0() {
            InterpolatorC1110c interpolatorC1110c = RecyclerView.f6962c1;
            this.f7048d = interpolatorC1110c;
            this.f7049e = false;
            this.f7050f = false;
            this.f7047c = new OverScroller(RecyclerView.this.getContext(), interpolatorC1110c);
        }

        /* JADX INFO: renamed from: a */
        public final void m4235a(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f7046b = 0;
            this.f7045a = 0;
            Interpolator interpolator = this.f7048d;
            InterpolatorC1110c interpolatorC1110c = RecyclerView.f6962c1;
            if (interpolator != interpolatorC1110c) {
                this.f7048d = interpolatorC1110c;
                this.f7047c = new OverScroller(recyclerView.getContext(), interpolatorC1110c);
            }
            this.f7047c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m4236b();
        }

        /* JADX INFO: renamed from: b */
        public final void m4236b() {
            if (this.f7049e) {
                this.f7050f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18676m(recyclerView, this);
        }

        /* JADX INFO: renamed from: c */
        public final void m4237c(int i10, int i11, int i12, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i10);
                int iAbs2 = Math.abs(i11);
                boolean z10 = iAbs > iAbs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    iAbs = iAbs2;
                }
                i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f6962c1;
            }
            if (this.f7048d != interpolator) {
                this.f7048d = interpolator;
                this.f7047c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f7046b = 0;
            this.f7045a = 0;
            recyclerView.setScrollState(2);
            this.f7047c.startScroll(0, 0, i10, i11, i13);
            m4236b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6973I == null) {
                recyclerView.removeCallbacks(this);
                this.f7047c.abortAnimation();
                return;
            }
            this.f7050f = false;
            this.f7049e = true;
            recyclerView.m4213o();
            OverScroller overScroller = this.f7047c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f7045a;
                int i16 = currY - this.f7046b;
                this.f7045a = currX;
                this.f7046b = currY;
                int iM4168n = RecyclerView.m4168n(i15, recyclerView.f7017h0, recyclerView.f7021j0, recyclerView.getWidth());
                int iM4168n2 = RecyclerView.m4168n(i16, recyclerView.f7019i0, recyclerView.f7023k0, recyclerView.getHeight());
                int[] iArr = recyclerView.f6988P0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zM4220u = recyclerView.m4220u(iM4168n, iM4168n2, 1, iArr, null);
                int[] iArr2 = recyclerView.f6988P0;
                if (zM4220u) {
                    iM4168n -= iArr2[0];
                    iM4168n2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m4210m(iM4168n, iM4168n2);
                }
                if (recyclerView.f6971H != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.m4198f0(iM4168n, iM4168n2, iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    int i19 = iM4168n - i17;
                    int i20 = iM4168n2 - i18;
                    AbstractC1130w abstractC1130w = recyclerView.f6973I.f7088e;
                    if (abstractC1130w != null && !abstractC1130w.f7128d && abstractC1130w.f7129e) {
                        int iM4364b = recyclerView.f6967D0.m4364b();
                        if (iM4364b == 0) {
                            abstractC1130w.m4361d();
                        } else if (abstractC1130w.f7125a >= iM4364b) {
                            abstractC1130w.f7125a = iM4364b - 1;
                            abstractC1130w.m4359b(i17, i18);
                        } else {
                            abstractC1130w.m4359b(i17, i18);
                        }
                    }
                    i13 = i17;
                    i10 = i19;
                    i11 = i20;
                    i12 = i18;
                } else {
                    i10 = iM4168n;
                    i11 = iM4168n2;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.f6979L.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f6988P0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i21 = i12;
                recyclerView.m4221v(i13, i12, i10, i11, null, 1, iArr3);
                int i22 = i10 - iArr2[0];
                int i23 = i11 - iArr2[1];
                if (i13 != 0 || i21 != 0) {
                    recyclerView.m4222w(i13, i21);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
                AbstractC1130w abstractC1130w2 = recyclerView.f6973I.f7088e;
                if ((abstractC1130w2 != null && abstractC1130w2.f7128d) || !z10) {
                    m4236b();
                    RunnableC1164o runnableC1164o = recyclerView.f6965B0;
                    if (runnableC1164o != null) {
                        runnableC1164o.m4503a(recyclerView, i13, i21);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i22 < 0) {
                            i14 = -currVelocity;
                        } else {
                            i14 = i22 > 0 ? currVelocity : 0;
                        }
                        if (i23 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i23 <= 0) {
                            currVelocity = 0;
                        }
                        if (i14 < 0) {
                            recyclerView.m4224y();
                            if (recyclerView.f7017h0.isFinished()) {
                                recyclerView.f7017h0.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView.m4225z();
                            if (recyclerView.f7021j0.isFinished()) {
                                recyclerView.f7021j0.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.m4169A();
                            if (recyclerView.f7019i0.isFinished()) {
                                recyclerView.f7019i0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.m4223x();
                            if (recyclerView.f7023k0.isFinished()) {
                                recyclerView.f7023k0.onAbsorb(currVelocity);
                            }
                        }
                        if (i14 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                            C10029b0.d.m18674k(recyclerView);
                        }
                    }
                    if (RecyclerView.f6960a1) {
                        RunnableC1164o.b bVar = recyclerView.f6966C0;
                        int[] iArr4 = bVar.f7394c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f7395d = 0;
                    }
                }
            }
            AbstractC1130w abstractC1130w3 = recyclerView.f6973I.f7088e;
            if (abstractC1130w3 != null && abstractC1130w3.f7128d) {
                abstractC1130w3.m4359b(0, 0);
            }
            this.f7049e = false;
            if (!this.f7050f) {
                recyclerView.setScrollState(0);
                recyclerView.m4212n0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.d.m18676m(recyclerView, this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC1108b implements Runnable {
        public RunnableC1108b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            AbstractC1117j abstractC1117j = recyclerView.f7025l0;
            if (abstractC1117j != null) {
                abstractC1117j.mo4279h();
            }
            recyclerView.f6976J0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class AbstractC1109b0 {

        /* JADX INFO: renamed from: t */
        public static final List<Object> f7053t = Collections.emptyList();

        /* JADX INFO: renamed from: a */
        public final View f7054a;

        /* JADX INFO: renamed from: b */
        public WeakReference<RecyclerView> f7055b;

        /* JADX INFO: renamed from: j */
        public int f7063j;

        /* JADX INFO: renamed from: r */
        public RecyclerView f7071r;

        /* JADX INFO: renamed from: s */
        public Adapter<? extends AbstractC1109b0> f7072s;

        /* JADX INFO: renamed from: c */
        public int f7056c = -1;

        /* JADX INFO: renamed from: d */
        public int f7057d = -1;

        /* JADX INFO: renamed from: e */
        public long f7058e = -1;

        /* JADX INFO: renamed from: f */
        public int f7059f = -1;

        /* JADX INFO: renamed from: g */
        public int f7060g = -1;

        /* JADX INFO: renamed from: h */
        public AbstractC1109b0 f7061h = null;

        /* JADX INFO: renamed from: i */
        public AbstractC1109b0 f7062i = null;

        /* JADX INFO: renamed from: k */
        public ArrayList f7064k = null;

        /* JADX INFO: renamed from: l */
        public List<Object> f7065l = null;

        /* JADX INFO: renamed from: m */
        public int f7066m = 0;

        /* JADX INFO: renamed from: n */
        public C1127t f7067n = null;

        /* JADX INFO: renamed from: o */
        public boolean f7068o = false;

        /* JADX INFO: renamed from: p */
        public int f7069p = 0;

        /* JADX INFO: renamed from: q */
        public int f7070q = -1;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public AbstractC1109b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f7054a = view;
        }

        /* JADX INFO: renamed from: a */
        public final void m4238a(Object obj) {
            if (obj == null) {
                m4239b(1024);
                return;
            }
            if ((1024 & this.f7063j) == 0) {
                if (this.f7064k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f7064k = arrayList;
                    this.f7065l = Collections.unmodifiableList(arrayList);
                }
                this.f7064k.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4239b(int i10) {
            this.f7063j = i10 | this.f7063j;
        }

        /* JADX INFO: renamed from: c */
        public final int m4240c() {
            RecyclerView recyclerView = this.f7071r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m4176I(this);
        }

        /* JADX INFO: renamed from: d */
        public final int m4241d() {
            RecyclerView recyclerView;
            Adapter<? extends AbstractC1109b0> adapter;
            int iM4176I;
            if (this.f7072s == null || (recyclerView = this.f7071r) == null || (adapter = recyclerView.getAdapter()) == null || (iM4176I = this.f7071r.m4176I(this)) == -1 || this.f7072s != adapter) {
                return -1;
            }
            return iM4176I;
        }

        /* JADX INFO: renamed from: e */
        public final int m4242e() {
            int i10 = this.f7060g;
            if (i10 == -1) {
                i10 = this.f7056c;
            }
            return i10;
        }

        /* JADX INFO: renamed from: f */
        public final List<Object> m4243f() {
            ArrayList arrayList;
            return ((this.f7063j & 1024) != 0 || (arrayList = this.f7064k) == null || arrayList.size() == 0) ? f7053t : this.f7065l;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m4244g() {
            View view = this.f7054a;
            return (view.getParent() == null || view.getParent() == this.f7071r) ? false : true;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m4245h() {
            return (this.f7063j & 1) != 0;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m4246i() {
            return (this.f7063j & 4) != 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m4247j() {
            if ((this.f7063j & 16) == 0) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (!C10029b0.d.m18672i(this.f7054a)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m4248k() {
            return (this.f7063j & 8) != 0;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m4249l() {
            return this.f7067n != null;
        }

        /* JADX INFO: renamed from: m */
        public final boolean m4250m() {
            return (this.f7063j & 256) != 0;
        }

        /* JADX INFO: renamed from: n */
        public final void m4251n(int i10, boolean z10) {
            if (this.f7057d == -1) {
                this.f7057d = this.f7056c;
            }
            if (this.f7060g == -1) {
                this.f7060g = this.f7056c;
            }
            if (z10) {
                this.f7060g += i10;
            }
            this.f7056c += i10;
            View view = this.f7054a;
            if (view.getLayoutParams() != null) {
                ((C1121n) view.getLayoutParams()).f7107c = true;
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m4252o() {
            this.f7063j = 0;
            this.f7056c = -1;
            this.f7057d = -1;
            this.f7058e = -1L;
            this.f7060g = -1;
            this.f7066m = 0;
            this.f7061h = null;
            this.f7062i = null;
            ArrayList arrayList = this.f7064k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f7063j &= -1025;
            this.f7069p = 0;
            this.f7070q = -1;
            RecyclerView.m4167k(this);
        }

        /* JADX INFO: renamed from: p */
        public final void m4253p(boolean z10) {
            int i10 = this.f7066m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f7066m = i11;
            if (i11 < 0) {
                this.f7066m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.f7063j |= 16;
            } else if (z10 && i11 == 0) {
                this.f7063j &= -17;
            }
        }

        /* JADX INFO: renamed from: q */
        public final boolean m4254q() {
            return (this.f7063j & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m4255r() {
            return (this.f7063j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sbM26o = C0009a.m26o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbM26o.append(Integer.toHexString(hashCode()));
            sbM26o.append(" position=");
            sbM26o.append(this.f7056c);
            sbM26o.append(" id=");
            sbM26o.append(this.f7058e);
            sbM26o.append(", oldPos=");
            sbM26o.append(this.f7057d);
            sbM26o.append(", pLpos:");
            sbM26o.append(this.f7060g);
            StringBuilder sb2 = new StringBuilder(sbM26o.toString());
            if (m4249l()) {
                sb2.append(" scrap ");
                sb2.append(this.f7068o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m4246i()) {
                sb2.append(" invalid");
            }
            if (!m4245h()) {
                sb2.append(" unbound");
            }
            boolean z10 = true;
            if ((this.f7063j & 2) != 0) {
                sb2.append(" update");
            }
            if (m4248k()) {
                sb2.append(" removed");
            }
            if (m4254q()) {
                sb2.append(" ignored");
            }
            if (m4250m()) {
                sb2.append(" tmpDetached");
            }
            if (!m4247j()) {
                sb2.append(" not recyclable(" + this.f7066m + ")");
            }
            if ((this.f7063j & 512) == 0 && !m4246i()) {
                z10 = false;
            }
            if (z10) {
                sb2.append(" undefined adapter position");
            }
            if (this.f7054a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class InterpolatorC1110c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            float f10 = f3 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C1111d {
        public C1111d() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0032  */
        /* JADX INFO: renamed from: a */
        public final void m4256a(AbstractC1109b0 abstractC1109b0, AbstractC1117j.c cVar, AbstractC1117j.c cVar2) {
            boolean zMo4480k;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            abstractC1109b0.m4253p(false);
            AbstractC1153g0 abstractC1153g0 = (AbstractC1153g0) recyclerView.f7025l0;
            if (cVar != null) {
                abstractC1153g0.getClass();
                int i10 = cVar.f7081a;
                int i11 = cVar2.f7081a;
                if (i10 == i11 && cVar.f7082b == cVar2.f7082b) {
                    abstractC1153g0.mo4478i(abstractC1109b0);
                    zMo4480k = true;
                } else {
                    zMo4480k = abstractC1153g0.mo4480k(abstractC1109b0, i10, cVar.f7082b, i11, cVar2.f7082b);
                }
            } else {
                abstractC1153g0.mo4478i(abstractC1109b0);
                zMo4480k = true;
            }
            if (zMo4480k) {
                recyclerView.m4187U();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4257b(AbstractC1109b0 abstractC1109b0, AbstractC1117j.c cVar, AbstractC1117j.c cVar2) {
            boolean zMo4480k;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f7006c.m4354m(abstractC1109b0);
            recyclerView.m4197f(abstractC1109b0);
            abstractC1109b0.m4253p(false);
            AbstractC1153g0 abstractC1153g0 = (AbstractC1153g0) recyclerView.f7025l0;
            abstractC1153g0.getClass();
            int i10 = cVar.f7081a;
            int i11 = cVar.f7082b;
            View view = abstractC1109b0.f7054a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f7081a;
            int top = cVar2 == null ? view.getTop() : cVar2.f7082b;
            if (abstractC1109b0.m4248k() || (i10 == left && i11 == top)) {
                abstractC1153g0.mo4481l(abstractC1109b0);
                zMo4480k = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zMo4480k = abstractC1153g0.mo4480k(abstractC1109b0, i10, i11, left, top);
            }
            if (zMo4480k) {
                recyclerView.m4187U();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static /* synthetic */ class C1112e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7074a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f7074a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7074a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C1113f extends Observable<AbstractC1114g> {
        /* JADX INFO: renamed from: a */
        public final boolean m4258a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public final void m4259b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4265a();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m4260c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4269e(i10, i11);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m4261d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4267c(i10, i11, obj);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m4262e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4268d(i10, i11);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m4263f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4270f(i10, i11);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m4264g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1114g) ((Observable) this).mObservers.get(size)).mo4271g();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC1114g {
        /* JADX INFO: renamed from: a */
        public void mo4265a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo4266b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo4267c(int i10, int i11, Object obj) {
            mo4266b();
        }

        /* JADX INFO: renamed from: d */
        public void mo4268d(int i10, int i11) {
        }

        /* JADX INFO: renamed from: e */
        public void mo4269e(int i10, int i11) {
        }

        /* JADX INFO: renamed from: f */
        public void mo4270f(int i10, int i11) {
        }

        /* JADX INFO: renamed from: g */
        public void mo4271g() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface InterfaceC1115h {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C1116i {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC1117j {

        /* JADX INFO: renamed from: a */
        public b f7075a = null;

        /* JADX INFO: renamed from: b */
        public final ArrayList<a> f7076b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public final long f7077c = 120;

        /* JADX INFO: renamed from: d */
        public final long f7078d = 120;

        /* JADX INFO: renamed from: e */
        public final long f7079e = 250;

        /* JADX INFO: renamed from: f */
        public long f7080f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m4280a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface b {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f7081a;

            /* JADX INFO: renamed from: b */
            public int f7082b;

            /* JADX INFO: renamed from: a */
            public final void m4281a(AbstractC1109b0 abstractC1109b0) {
                View view = abstractC1109b0.f7054a;
                this.f7081a = view.getLeft();
                this.f7082b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m4272b(AbstractC1109b0 abstractC1109b0) {
            int i10 = abstractC1109b0.f7063j & 14;
            if (!abstractC1109b0.m4246i() && (i10 & 4) == 0) {
                abstractC1109b0.m4240c();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo4273a(AbstractC1109b0 abstractC1109b0, AbstractC1109b0 abstractC1109b1, c cVar, c cVar2);

        /* JADX INFO: renamed from: c */
        public boolean mo4274c(AbstractC1109b0 abstractC1109b0, List<Object> list) {
            if (((AbstractC1153g0) this).f7288g && !abstractC1109b0.m4246i()) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final void m4275d(AbstractC1109b0 abstractC1109b0) {
            b bVar = this.f7075a;
            if (bVar != null) {
                C1118k c1118k = (C1118k) bVar;
                boolean z10 = true;
                abstractC1109b0.m4253p(true);
                if (abstractC1109b0.f7061h != null && abstractC1109b0.f7062i == null) {
                    abstractC1109b0.f7061h = null;
                }
                abstractC1109b0.f7062i = null;
                if (!((abstractC1109b0.f7063j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.m4209l0();
                    C1150f c1150f = recyclerView.f7012f;
                    C1145c0 c1145c0 = (C1145c0) c1150f.f7254a;
                    RecyclerView recyclerView2 = c1145c0.f7226a;
                    View view = abstractC1109b0.f7054a;
                    int iIndexOfChild = recyclerView2.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c1150f.m4465k(view);
                    } else {
                        C1150f.a aVar = c1150f.f7255b;
                        if (aVar.m4469d(iIndexOfChild)) {
                            aVar.m4471f(iIndexOfChild);
                            c1150f.m4465k(view);
                            c1145c0.m4437b(iIndexOfChild);
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
                        C1127t c1127t = recyclerView.f7006c;
                        c1127t.m4354m(abstractC1109b0M4161L);
                        c1127t.m4351j(abstractC1109b0M4161L);
                    }
                    recyclerView.m4211m0(!z10);
                    if (!z10 && abstractC1109b0.m4250m()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo4276e(AbstractC1109b0 abstractC1109b0);

        /* JADX INFO: renamed from: f */
        public abstract void mo4277f();

        /* JADX INFO: renamed from: g */
        public abstract boolean mo4278g();

        /* JADX INFO: renamed from: h */
        public abstract void mo4279h();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C1118k implements AbstractC1117j.b {
        public C1118k() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC1119l {
        /* JADX INFO: renamed from: f */
        public void mo4282f(Rect rect, View view, RecyclerView recyclerView, C1131x c1131x) {
            ((C1121n) view.getLayoutParams()).m4333a();
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: g */
        public void mo4283g(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: h */
        public void mo4284h(Canvas canvas, RecyclerView recyclerView, C1131x c1131x) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC1120m {

        /* JADX INFO: renamed from: a */
        public C1150f f7084a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f7085b;

        /* JADX INFO: renamed from: c */
        public final C1157i0 f7086c;

        /* JADX INFO: renamed from: d */
        public final C1157i0 f7087d;

        /* JADX INFO: renamed from: e */
        public AbstractC1130w f7088e;

        /* JADX INFO: renamed from: f */
        public boolean f7089f;

        /* JADX INFO: renamed from: g */
        public boolean f7090g;

        /* JADX INFO: renamed from: h */
        public final boolean f7091h;

        /* JADX INFO: renamed from: i */
        public final boolean f7092i;

        /* JADX INFO: renamed from: j */
        public int f7093j;

        /* JADX INFO: renamed from: k */
        public boolean f7094k;

        /* JADX INFO: renamed from: l */
        public int f7095l;

        /* JADX INFO: renamed from: m */
        public int f7096m;

        /* JADX INFO: renamed from: n */
        public int f7097n;

        /* JADX INFO: renamed from: o */
        public int f7098o;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public class a implements C1157i0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: a */
            public final int mo4328a(View view) {
                C1121n c1121n = (C1121n) view.getLayoutParams();
                AbstractC1120m.this.getClass();
                return (view.getLeft() - AbstractC1120m.m4285E(view)) - ((ViewGroup.MarginLayoutParams) c1121n).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: b */
            public final int mo4329b() {
                return AbstractC1120m.this.m4303G();
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: c */
            public final int mo4330c() {
                AbstractC1120m abstractC1120m = AbstractC1120m.this;
                return abstractC1120m.f7097n - abstractC1120m.m4304H();
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: d */
            public final View mo4331d(int i10) {
                return AbstractC1120m.this.m4324x(i10);
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: e */
            public final int mo4332e(View view) {
                C1121n c1121n = (C1121n) view.getLayoutParams();
                AbstractC1120m.this.getClass();
                return AbstractC1120m.m4288L(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public class b implements C1157i0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: a */
            public final int mo4328a(View view) {
                C1121n c1121n = (C1121n) view.getLayoutParams();
                AbstractC1120m.this.getClass();
                return (view.getTop() - AbstractC1120m.m4289N(view)) - ((ViewGroup.MarginLayoutParams) c1121n).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: b */
            public final int mo4329b() {
                return AbstractC1120m.this.m4305I();
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: c */
            public final int mo4330c() {
                AbstractC1120m abstractC1120m = AbstractC1120m.this;
                return abstractC1120m.f7098o - abstractC1120m.m4301F();
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: d */
            public final View mo4331d(int i10) {
                return AbstractC1120m.this.m4324x(i10);
            }

            @Override // androidx.recyclerview.widget.C1157i0.b
            /* JADX INFO: renamed from: e */
            public final int mo4332e(View view) {
                C1121n c1121n = (C1121n) view.getLayoutParams();
                AbstractC1120m.this.getClass();
                return AbstractC1120m.m4293w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface c {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f7101a;

            /* JADX INFO: renamed from: b */
            public int f7102b;

            /* JADX INFO: renamed from: c */
            public boolean f7103c;

            /* JADX INFO: renamed from: d */
            public boolean f7104d;
        }

        public AbstractC1120m() {
            a aVar = new a();
            b bVar = new b();
            this.f7086c = new C1157i0(aVar);
            this.f7087d = new C1157i0(bVar);
            this.f7089f = false;
            this.f7090g = false;
            this.f7091h = true;
            this.f7092i = true;
        }

        /* JADX INFO: renamed from: E */
        public static int m4285E(View view) {
            return ((C1121n) view.getLayoutParams()).f7106b.left;
        }

        /* JADX INFO: renamed from: J */
        public static int m4286J(View view) {
            return ((C1121n) view.getLayoutParams()).m4333a();
        }

        /* JADX INFO: renamed from: K */
        public static d m4287K(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6407a.f36871a, i10, i11);
            dVar.f7101a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f7102b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f7103c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f7104d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: L */
        public static int m4288L(View view) {
            return ((C1121n) view.getLayoutParams()).f7106b.right;
        }

        /* JADX INFO: renamed from: N */
        public static int m4289N(View view) {
            return ((C1121n) view.getLayoutParams()).f7106b.top;
        }

        /* JADX INFO: renamed from: Q */
        public static boolean m4290Q(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* JADX INFO: renamed from: R */
        public static void m4291R(View view, int i10, int i11, int i12, int i13) {
            C1121n c1121n = (C1121n) view.getLayoutParams();
            Rect rect = c1121n.f7106b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c1121n).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c1121n).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c1121n).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin);
        }

        /* JADX INFO: renamed from: i */
        public static int m4292i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX INFO: renamed from: w */
        public static int m4293w(View view) {
            return ((C1121n) view.getLayoutParams()).f7106b.bottom;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0029  */
        /* JADX WARN: Code duplicated, block: B:29:0x003d  */
        /* JADX INFO: renamed from: z */
        public static int m4294z(boolean z10, int i10, int i11, int i12, int i13) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        /* JADX INFO: renamed from: A */
        public int mo4070A(C1127t c1127t, C1131x c1131x) {
            return -1;
        }

        /* JADX INFO: renamed from: A0 */
        public final void m4295A0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f7085b = null;
                this.f7084a = null;
                this.f7097n = 0;
                this.f7098o = 0;
            } else {
                this.f7085b = recyclerView;
                this.f7084a = recyclerView.f7012f;
                this.f7097n = recyclerView.getWidth();
                this.f7098o = recyclerView.getHeight();
            }
            this.f7095l = 1073741824;
            this.f7096m = 1073741824;
        }

        /* JADX INFO: renamed from: B */
        public void mo4296B(View view, Rect rect) {
            int[] iArr = RecyclerView.f6956W0;
            C1121n c1121n = (C1121n) view.getLayoutParams();
            Rect rect2 = c1121n.f7106b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1121n).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1121n).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin);
        }

        /* JADX INFO: renamed from: B0 */
        public final boolean m4297B0(View view, int i10, int i11, C1121n c1121n) {
            if (!view.isLayoutRequested() && this.f7091h && m4290Q(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c1121n).width)) {
                if (m4290Q(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c1121n).height)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: C */
        public final int m4298C() {
            RecyclerView recyclerView = this.f7085b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo4226e();
            }
            return 0;
        }

        /* JADX INFO: renamed from: C0 */
        public boolean mo4109C0() {
            return false;
        }

        /* JADX INFO: renamed from: D */
        public final int m4299D() {
            RecyclerView recyclerView = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            return C10029b0.e.m18686d(recyclerView);
        }

        /* JADX INFO: renamed from: D0 */
        public final boolean m4300D0(View view, int i10, int i11, C1121n c1121n) {
            return (this.f7091h && m4290Q(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c1121n).width) && m4290Q(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c1121n).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: E0 */
        public void mo4110E0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* JADX INFO: renamed from: F */
        public final int m4301F() {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: F0 */
        public final void m4302F0(C1169t c1169t) {
            AbstractC1130w abstractC1130w = this.f7088e;
            if (abstractC1130w != null && c1169t != abstractC1130w && abstractC1130w.f7129e) {
                abstractC1130w.m4361d();
            }
            this.f7088e = c1169t;
            RecyclerView recyclerView = this.f7085b;
            RunnableC1107a0 runnableC1107a0 = recyclerView.f6964A0;
            RecyclerView.this.removeCallbacks(runnableC1107a0);
            runnableC1107a0.f7047c.abortAnimation();
            if (c1169t.f7132h) {
                Log.w("RecyclerView", "An instance of " + c1169t.getClass().getSimpleName() + " was started more than once. Each instance of" + c1169t.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            c1169t.f7126b = recyclerView;
            c1169t.f7127c = this;
            int i10 = c1169t.f7125a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f6967D0.f7140a = i10;
            c1169t.f7129e = true;
            c1169t.f7128d = true;
            c1169t.f7130f = recyclerView.f6973I.mo4152s(i10);
            c1169t.f7126b.f6964A0.m4236b();
            c1169t.f7132h = true;
        }

        /* JADX INFO: renamed from: G */
        public final int m4303G() {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: G0 */
        public boolean mo4071G0() {
            return false;
        }

        /* JADX INFO: renamed from: H */
        public final int m4304H() {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: I */
        public final int m4305I() {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: M */
        public int mo4073M(C1127t c1127t, C1131x c1131x) {
            return -1;
        }

        /* JADX INFO: renamed from: O */
        public final void m4306O(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C1121n) view.getLayoutParams()).f7106b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f7085b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f7085b.f7024l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: P */
        public boolean mo4118P() {
            return false;
        }

        /* JADX INFO: renamed from: S */
        public void mo4307S(int i10) {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                int iM4459e = recyclerView.f7012f.m4459e();
                for (int i11 = 0; i11 < iM4459e; i11++) {
                    recyclerView.f7012f.m4458d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        /* JADX INFO: renamed from: T */
        public void mo4308T(int i10) {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                int iM4459e = recyclerView.f7012f.m4459e();
                for (int i11 = 0; i11 < iM4459e; i11++) {
                    recyclerView.f7012f.m4458d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        /* JADX INFO: renamed from: U */
        public void mo4309U() {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: V */
        public void mo4125V(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: W */
        public View mo4075W(View view, int i10, C1127t c1127t, C1131x c1131x) {
            return null;
        }

        /* JADX INFO: renamed from: X */
        public void mo4127X(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f7085b;
            C1127t c1127t = recyclerView.f7006c;
            C1131x c1131x = recyclerView.f6967D0;
            if (recyclerView != null) {
                if (accessibilityEvent == null) {
                    return;
                }
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f7085b.canScrollVertically(-1) && !this.f7085b.canScrollHorizontally(-1) && !this.f7085b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                Adapter adapter = this.f7085b.f6971H;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.mo4226e());
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        public void mo4076Y(C1127t c1127t, C1131x c1131x, C10284f c10284f) {
            if (this.f7085b.canScrollVertically(-1) || this.f7085b.canScrollHorizontally(-1)) {
                c10284f.m19256a(8192);
                c10284f.m19268m(true);
            }
            if (this.f7085b.canScrollVertically(1) || this.f7085b.canScrollHorizontally(1)) {
                c10284f.m19256a(4096);
                c10284f.m19268m(true);
            }
            c10284f.m19265j(C10284f.b.m19274a(mo4073M(c1127t, c1131x), mo4070A(c1127t, c1131x), 0));
        }

        /* JADX INFO: renamed from: Z */
        public final void m4310Z(View view, C10284f c10284f) {
            AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4248k() && !this.f7084a.m4464j(abstractC1109b0M4161L.f7054a)) {
                RecyclerView recyclerView = this.f7085b;
                mo4077a0(recyclerView.f7006c, recyclerView.f6967D0, view, c10284f);
            }
        }

        /* JADX INFO: renamed from: a0 */
        public void mo4077a0(C1127t c1127t, C1131x c1131x, View view, C10284f c10284f) {
        }

        /* JADX INFO: renamed from: b0 */
        public void mo4078b0(int i10, int i11) {
        }

        /* JADX WARN: Code duplicated, block: B:65:0x018c  */
        /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: c */
        public final void m4311c(View view, int i10, boolean z10) {
            int iM4467b;
            AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            if (z10 || abstractC1109b0M4161L.m4248k()) {
                C8452h<AbstractC1109b0, C1159j0.a> c8452h = this.f7085b.f7014g.f7314a;
                C1159j0.a orDefault = c8452h.getOrDefault(abstractC1109b0M4161L, null);
                if (orDefault == null) {
                    orDefault = C1159j0.a.m4495a();
                    c8452h.put(abstractC1109b0M4161L, orDefault);
                }
                orDefault.f7317a |= 1;
            } else {
                this.f7085b.f7014g.m4493c(abstractC1109b0M4161L);
            }
            C1121n c1121n = (C1121n) view.getLayoutParams();
            if (!abstractC1109b0M4161L.m4255r() && !abstractC1109b0M4161L.m4249l()) {
                if (view.getParent() == this.f7085b) {
                    C1150f c1150f = this.f7084a;
                    int iIndexOfChild = ((C1145c0) c1150f.f7254a).f7226a.indexOfChild(view);
                    if (iIndexOfChild != -1) {
                        C1150f.a aVar = c1150f.f7255b;
                        iM4467b = aVar.m4469d(iIndexOfChild) ? -1 : iIndexOfChild - aVar.m4467b(iIndexOfChild);
                    }
                    if (i10 == -1) {
                        i10 = this.f7084a.m4459e();
                    }
                    if (iM4467b == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7085b.indexOfChild(view) + this.f7085b.m4170B());
                    }
                    if (iM4467b != i10) {
                        AbstractC1120m abstractC1120m = this.f7085b.f6973I;
                        View viewM4324x = abstractC1120m.m4324x(iM4467b);
                        if (viewM4324x == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM4467b + abstractC1120m.f7085b.toString());
                        }
                        abstractC1120m.m4324x(iM4467b);
                        abstractC1120m.f7084a.m4457c(iM4467b);
                        C1121n c1121n2 = (C1121n) viewM4324x.getLayoutParams();
                        AbstractC1109b0 abstractC1109b0M4161L2 = RecyclerView.m4161L(viewM4324x);
                        if (abstractC1109b0M4161L2.m4248k()) {
                            C8452h<AbstractC1109b0, C1159j0.a> c8452h2 = abstractC1120m.f7085b.f7014g.f7314a;
                            C1159j0.a orDefault2 = c8452h2.getOrDefault(abstractC1109b0M4161L2, null);
                            if (orDefault2 == null) {
                                orDefault2 = C1159j0.a.m4495a();
                                c8452h2.put(abstractC1109b0M4161L2, orDefault2);
                            }
                            orDefault2.f7317a = 1 | orDefault2.f7317a;
                        } else {
                            abstractC1120m.f7085b.f7014g.m4493c(abstractC1109b0M4161L2);
                        }
                        abstractC1120m.f7084a.m4456b(viewM4324x, i10, c1121n2, abstractC1109b0M4161L2.m4248k());
                    }
                } else {
                    this.f7084a.m4455a(view, i10, false);
                    c1121n.f7107c = true;
                    AbstractC1130w abstractC1130w = this.f7088e;
                    if (abstractC1130w != null && abstractC1130w.f7129e) {
                        abstractC1130w.f7126b.getClass();
                        AbstractC1109b0 abstractC1109b0M4161L3 = RecyclerView.m4161L(view);
                        if ((abstractC1109b0M4161L3 != null ? abstractC1109b0M4161L3.m4242e() : -1) == abstractC1130w.f7125a) {
                            abstractC1130w.f7130f = view;
                        }
                    }
                }
                if (c1121n.f7108d) {
                    abstractC1109b0M4161L.f7054a.invalidate();
                    c1121n.f7108d = false;
                }
            }
            if (abstractC1109b0M4161L.m4249l()) {
                abstractC1109b0M4161L.f7067n.m4354m(abstractC1109b0M4161L);
            } else {
                abstractC1109b0M4161L.f7063j &= -33;
            }
            this.f7084a.m4456b(view, i10, view.getLayoutParams(), false);
            if (c1121n.f7108d) {
                abstractC1109b0M4161L.f7054a.invalidate();
                c1121n.f7108d = false;
            }
        }

        /* JADX INFO: renamed from: c0 */
        public void mo4080c0() {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: d */
        public void mo4134d(String str) {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                recyclerView.m4205j(str);
            }
        }

        /* JADX INFO: renamed from: d0 */
        public void mo4082d0(int i10, int i11) {
        }

        /* JADX INFO: renamed from: e */
        public final void m4312e(View view, Rect rect) {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m4179M(view));
            }
        }

        /* JADX INFO: renamed from: e0 */
        public void mo4083e0(int i10, int i11) {
        }

        /* JADX INFO: renamed from: f */
        public boolean mo4137f() {
            return this instanceof CarouselLayoutManager;
        }

        /* JADX INFO: renamed from: f0 */
        public void mo4084f0(int i10, int i11) {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo4139g() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: g0 */
        public void mo4085g0(C1127t c1127t, C1131x c1131x) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: h */
        public boolean mo4086h(C1121n c1121n) {
            return c1121n != null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: h0 */
        public void mo4087h0(C1131x c1131x) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: i0 */
        public void mo4142i0(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: j */
        public void mo4144j(int i10, int i11, C1131x c1131x, c cVar) {
        }

        /* JADX INFO: renamed from: j0 */
        public Parcelable mo4145j0() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: k */
        public void mo4146k(int i10, c cVar) {
        }

        /* JADX INFO: renamed from: k0 */
        public void mo4313k0(int i10) {
        }

        /* JADX INFO: renamed from: l */
        public int mo4148l(C1131x c1131x) {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ab A[PHI: r5
          0x00ab: PHI (r5v8 int) = (r5v5 int), (r5v11 int) binds: [B:28:0x0099, B:21:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: l0 */
        public boolean mo4314l0(C1127t c1127t, C1131x c1131x, int i10, Bundle bundle) {
            int iM4305I;
            int iM4303G;
            if (this.f7085b == null) {
                return false;
            }
            int iHeight = this.f7098o;
            int iWidth = this.f7097n;
            Rect rect = new Rect();
            if (this.f7085b.getMatrix().isIdentity() && this.f7085b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i10 == 4096) {
                iM4305I = this.f7085b.canScrollVertically(1) ? (iHeight - m4305I()) - m4301F() : 0;
                if (this.f7085b.canScrollHorizontally(1)) {
                    iM4303G = (iWidth - m4303G()) - m4304H();
                } else {
                    iM4303G = 0;
                }
            } else if (i10 != 8192) {
                iM4305I = 0;
                iM4303G = 0;
            } else {
                iM4305I = this.f7085b.canScrollVertically(-1) ? -((iHeight - m4305I()) - m4301F()) : 0;
                if (this.f7085b.canScrollHorizontally(-1)) {
                    iM4303G = -((iWidth - m4303G()) - m4304H());
                } else {
                    iM4303G = 0;
                }
            }
            if (iM4305I == 0 && iM4303G == 0) {
                return false;
            }
            this.f7085b.m4206j0(iM4303G, iM4305I, true);
            return true;
        }

        /* JADX INFO: renamed from: m */
        public int mo4089m(C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: m0 */
        public final void m4315m0(C1127t c1127t) {
            int iM4326y = m4326y();
            while (true) {
                iM4326y--;
                if (iM4326y < 0) {
                    return;
                }
                if (!RecyclerView.m4161L(m4324x(iM4326y)).m4254q()) {
                    m4318p0(iM4326y, c1127t);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public int mo4090n(C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: n0 */
        public final void m4316n0(C1127t c1127t) {
            ArrayList<AbstractC1109b0> arrayList;
            int size = c1127t.f7116a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = c1127t.f7116a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).f7054a;
                AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
                if (!abstractC1109b0M4161L.m4254q()) {
                    abstractC1109b0M4161L.m4253p(false);
                    if (abstractC1109b0M4161L.m4250m()) {
                        this.f7085b.removeDetachedView(view, false);
                    }
                    AbstractC1117j abstractC1117j = this.f7085b.f7025l0;
                    if (abstractC1117j != null) {
                        abstractC1117j.mo4276e(abstractC1109b0M4161L);
                    }
                    abstractC1109b0M4161L.m4253p(true);
                    AbstractC1109b0 abstractC1109b0M4161L2 = RecyclerView.m4161L(view);
                    abstractC1109b0M4161L2.f7067n = null;
                    abstractC1109b0M4161L2.f7068o = false;
                    abstractC1109b0M4161L2.f7063j &= -33;
                    c1127t.m4351j(abstractC1109b0M4161L2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<AbstractC1109b0> arrayList2 = c1127t.f7117b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f7085b.invalidate();
            }
        }

        /* JADX INFO: renamed from: o */
        public int mo4151o(C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: o0 */
        public final void m4317o0(View view, C1127t c1127t) {
            C1150f c1150f = this.f7084a;
            C1145c0 c1145c0 = (C1145c0) c1150f.f7254a;
            int iIndexOfChild = c1145c0.f7226a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c1150f.f7255b.m4471f(iIndexOfChild)) {
                    c1150f.m4465k(view);
                }
                c1145c0.m4437b(iIndexOfChild);
            }
            c1127t.m4350i(view);
        }

        /* JADX INFO: renamed from: p */
        public int mo4093p(C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: p0 */
        public final void m4318p0(int i10, C1127t c1127t) {
            View viewM4324x = m4324x(i10);
            m4319q0(i10);
            c1127t.m4350i(viewM4324x);
        }

        /* JADX INFO: renamed from: q */
        public int mo4095q(C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: q0 */
        public final void m4319q0(int i10) {
            if (m4324x(i10) != null) {
                C1150f c1150f = this.f7084a;
                int iM4460f = c1150f.m4460f(i10);
                C1145c0 c1145c0 = (C1145c0) c1150f.f7254a;
                View childAt = c1145c0.f7226a.getChildAt(iM4460f);
                if (childAt == null) {
                    return;
                }
                if (c1150f.f7255b.m4471f(iM4460f)) {
                    c1150f.m4465k(childAt);
                }
                c1145c0.m4437b(iM4460f);
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m4320r(C1127t c1127t) {
            int iM4326y = m4326y();
            while (true) {
                iM4326y--;
                if (iM4326y < 0) {
                    return;
                }
                View viewM4324x = m4324x(iM4326y);
                AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(viewM4324x);
                if (!abstractC1109b0M4161L.m4254q()) {
                    if (!abstractC1109b0M4161L.m4246i() || abstractC1109b0M4161L.m4248k() || this.f7085b.f6971H.f7041b) {
                        m4324x(iM4326y);
                        this.f7084a.m4457c(iM4326y);
                        c1127t.m4352k(viewM4324x);
                        this.f7085b.f7014g.m4493c(abstractC1109b0M4161L);
                    } else {
                        m4319q0(iM4326y);
                        c1127t.m4351j(abstractC1109b0M4161L);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        /* JADX INFO: renamed from: r0 */
        public boolean mo4321r0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            boolean z12;
            int iM4303G = m4303G();
            int iM4305I = m4305I();
            int iM4304H = this.f7097n - m4304H();
            int iM4301F = this.f7098o - m4301F();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iM4303G;
            int iMin = Math.min(0, i10);
            int i11 = top - iM4305I;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iM4304H;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iM4301F);
            if (m4299D() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            if (z11) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild == null) {
                    z12 = false;
                } else {
                    int iM4303G2 = m4303G();
                    int iM4305I2 = m4305I();
                    int iM4304H2 = this.f7097n - m4304H();
                    int iM4301F2 = this.f7098o - m4301F();
                    Rect rect2 = this.f7085b.f7020j;
                    mo4296B(focusedChild, rect2);
                    if (rect2.left - iMax < iM4304H2 && rect2.right - iMax > iM4303G2 && rect2.top - iMin2 < iM4301F2) {
                        if (rect2.bottom - iMin2 > iM4305I2) {
                            z12 = true;
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    if (iMax == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(iMax, iMin2);
                    } else {
                        recyclerView.m4206j0(iMax, iMin2, false);
                    }
                    return true;
                }
            } else if (iMax == 0 || iMin2 != 0) {
                if (z10) {
                    recyclerView.scrollBy(iMax, iMin2);
                } else {
                    recyclerView.m4206j0(iMax, iMin2, false);
                }
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: s */
        public View mo4152s(int i10) {
            int iM4326y = m4326y();
            for (int i11 = 0; i11 < iM4326y; i11++) {
                View viewM4324x = m4324x(i11);
                AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(viewM4324x);
                if (abstractC1109b0M4161L != null) {
                    if (abstractC1109b0M4161L.m4242e() == i10 && !abstractC1109b0M4161L.m4254q() && (this.f7085b.f6967D0.f7146g || !abstractC1109b0M4161L.m4248k())) {
                        return viewM4324x;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: s0 */
        public final void m4322s0() {
            RecyclerView recyclerView = this.f7085b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: t */
        public abstract C1121n mo4099t();

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: t0 */
        public int mo4100t0(int i10, C1127t c1127t, C1131x c1131x) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: u */
        public C1121n mo4102u(Context context, AttributeSet attributeSet) {
            return new C1121n(context, attributeSet);
        }

        /* JADX INFO: renamed from: u0 */
        public void mo4153u0(int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: v */
        public C1121n mo4104v(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1121n) {
                return new C1121n((C1121n) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1121n((ViewGroup.MarginLayoutParams) layoutParams) : new C1121n(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: v0 */
        public int mo4105v0(int i10, C1127t c1127t, C1131x c1131x) {
            return 0;
        }

        /* JADX INFO: renamed from: w0 */
        public final void m4323w0(RecyclerView recyclerView) {
            m4325x0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: x */
        public final View m4324x(int i10) {
            C1150f c1150f = this.f7084a;
            if (c1150f != null) {
                return c1150f.m4458d(i10);
            }
            return null;
        }

        /* JADX INFO: renamed from: x0 */
        public final void m4325x0(int i10, int i11) {
            this.f7097n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f7095l = mode;
            if (mode == 0 && !RecyclerView.f6958Y0) {
                this.f7097n = 0;
            }
            this.f7098o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f7096m = mode2;
            if (mode2 == 0 && !RecyclerView.f6958Y0) {
                this.f7098o = 0;
            }
        }

        /* JADX INFO: renamed from: y */
        public final int m4326y() {
            C1150f c1150f = this.f7084a;
            if (c1150f != null) {
                return c1150f.m4459e();
            }
            return 0;
        }

        /* JADX INFO: renamed from: y0 */
        public void mo4106y0(Rect rect, int i10, int i11) {
            int iM4304H = m4304H() + m4303G() + rect.width();
            int iM4301F = m4301F() + m4305I() + rect.height();
            RecyclerView recyclerView = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            this.f7085b.setMeasuredDimension(m4292i(i10, iM4304H, C10029b0.d.m18668e(recyclerView)), m4292i(i11, iM4301F, C10029b0.d.m18667d(this.f7085b)));
        }

        /* JADX INFO: renamed from: z0 */
        public final void m4327z0(int i10, int i11) {
            int iM4326y = m4326y();
            if (iM4326y == 0) {
                this.f7085b.m4215p(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iM4326y; i16++) {
                View viewM4324x = m4324x(i16);
                Rect rect = this.f7085b.f7020j;
                mo4296B(viewM4324x, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f7085b.f7020j.set(i15, i13, i12, i14);
            mo4106y0(this.f7085b.f7020j, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static class C1121n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC1109b0 f7105a;

        /* JADX INFO: renamed from: b */
        public final Rect f7106b;

        /* JADX INFO: renamed from: c */
        public boolean f7107c;

        /* JADX INFO: renamed from: d */
        public boolean f7108d;

        public C1121n(int i10, int i11) {
            super(i10, i11);
            this.f7106b = new Rect();
            this.f7107c = true;
            this.f7108d = false;
        }

        public C1121n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7106b = new Rect();
            this.f7107c = true;
            this.f7108d = false;
        }

        public C1121n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7106b = new Rect();
            this.f7107c = true;
            this.f7108d = false;
        }

        public C1121n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7106b = new Rect();
            this.f7107c = true;
            this.f7108d = false;
        }

        public C1121n(C1121n c1121n) {
            super((ViewGroup.LayoutParams) c1121n);
            this.f7106b = new Rect();
            this.f7107c = true;
            this.f7108d = false;
        }

        /* JADX INFO: renamed from: a */
        public final int m4333a() {
            return this.f7105a.m4242e();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m4334b() {
            return (this.f7105a.f7063j & 2) != 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m4335c() {
            return this.f7105a.m4248k();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface InterfaceC1122o {
        /* JADX INFO: renamed from: b */
        void mo66b(View view);

        /* JADX INFO: renamed from: d */
        void mo67d(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC1123p {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC1124q {
        /* JADX INFO: renamed from: a */
        void mo4336a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        boolean mo4337c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: e */
        void mo4338e(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC1125r {
        /* JADX INFO: renamed from: a */
        public void mo4339a(int i10, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: b */
        public void mo4340b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C1126s {

        /* JADX INFO: renamed from: a */
        public final SparseArray<a> f7109a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f7110b = 0;

        /* JADX INFO: renamed from: c */
        public final Set<Adapter<?>> f7111c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC1109b0> f7112a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public final int f7113b = 5;

            /* JADX INFO: renamed from: c */
            public long f7114c = 0;

            /* JADX INFO: renamed from: d */
            public long f7115d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final a m4341a(int i10) {
            SparseArray<a> sparseArray = this.f7109a;
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(i10, aVar);
            }
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public final class C1127t {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC1109b0> f7116a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC1109b0> f7117b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC1109b0> f7118c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC1109b0> f7119d;

        /* JADX INFO: renamed from: e */
        public int f7120e;

        /* JADX INFO: renamed from: f */
        public int f7121f;

        /* JADX INFO: renamed from: g */
        public C1126s f7122g;

        public C1127t() {
            ArrayList<AbstractC1109b0> arrayList = new ArrayList<>();
            this.f7116a = arrayList;
            this.f7117b = null;
            this.f7118c = new ArrayList<>();
            this.f7119d = Collections.unmodifiableList(arrayList);
            this.f7120e = 2;
            this.f7121f = 2;
        }

        /* JADX INFO: renamed from: a */
        public final void m4342a(AbstractC1109b0 abstractC1109b0, boolean z10) {
            RecyclerView.m4167k(abstractC1109b0);
            RecyclerView recyclerView = RecyclerView.this;
            C1149e0 c1149e0 = recyclerView.f6978K0;
            View view = abstractC1109b0.f7054a;
            if (c1149e0 != null) {
                C1149e0.a aVar = c1149e0.f7251e;
                C10029b0.m18658n(view, aVar instanceof C1149e0.a ? (C10026a) aVar.f7253e.remove(view) : null);
            }
            if (z10) {
                InterfaceC1128u interfaceC1128u = recyclerView.f6975J;
                if (interfaceC1128u != null) {
                    interfaceC1128u.m4356a();
                }
                ArrayList arrayList = recyclerView.f6977K;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC1128u) arrayList.get(i10)).m4356a();
                }
                Adapter adapter = recyclerView.f6971H;
                if (adapter != null) {
                    adapter.mo4233n(abstractC1109b0);
                }
                if (recyclerView.f6967D0 != null) {
                    recyclerView.f7014g.m4494d(abstractC1109b0);
                }
            }
            abstractC1109b0.f7072s = null;
            abstractC1109b0.f7071r = null;
            C1126s c1126sM4344c = m4344c();
            c1126sM4344c.getClass();
            int i11 = abstractC1109b0.f7059f;
            ArrayList<AbstractC1109b0> arrayList2 = c1126sM4344c.m4341a(i11).f7112a;
            if (c1126sM4344c.f7109a.get(i11).f7113b <= arrayList2.size()) {
                C8573r0.m16673G(view);
            } else {
                abstractC1109b0.m4252o();
                arrayList2.add(abstractC1109b0);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m4343b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f6967D0.m4364b()) {
                return !recyclerView.f6967D0.f7146g ? i10 : recyclerView.f7010e.m4416f(i10, 0);
            }
            StringBuilder sbM614j = C0141b.m614j("invalid position ", i10, ". State item count is ");
            sbM614j.append(recyclerView.f6967D0.m4364b());
            sbM614j.append(recyclerView.m4170B());
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }

        /* JADX INFO: renamed from: c */
        public final C1126s m4344c() {
            if (this.f7122g == null) {
                this.f7122g = new C1126s();
                m4346e();
            }
            return this.f7122g;
        }

        /* JADX INFO: renamed from: d */
        public final View m4345d(int i10) {
            return m4353l(i10, Long.MAX_VALUE).f7054a;
        }

        /* JADX INFO: renamed from: e */
        public final void m4346e() {
            if (this.f7122g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6971H == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                C1126s c1126s = this.f7122g;
                c1126s.f7111c.add(recyclerView.f6971H);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m4347f(Adapter<?> adapter, boolean z10) {
            C1126s c1126s = this.f7122g;
            if (c1126s != null) {
                Set<Adapter<?>> set = c1126s.f7111c;
                set.remove(adapter);
                if (set.size() == 0 && !z10) {
                    int i10 = 0;
                    while (true) {
                        SparseArray<C1126s.a> sparseArray = c1126s.f7109a;
                        if (i10 >= sparseArray.size()) {
                            break;
                        }
                        ArrayList<AbstractC1109b0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f7112a;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            C8573r0.m16673G(arrayList.get(i11).f7054a);
                        }
                        i10++;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m4348g() {
            ArrayList<AbstractC1109b0> arrayList = this.f7118c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m4349h(size);
            }
            arrayList.clear();
            if (RecyclerView.f6960a1) {
                RunnableC1164o.b bVar = RecyclerView.this.f6966C0;
                int[] iArr = bVar.f7394c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f7395d = 0;
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m4349h(int i10) {
            ArrayList<AbstractC1109b0> arrayList = this.f7118c;
            m4342a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        /* JADX INFO: renamed from: i */
        public final void m4350i(View view) {
            AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            boolean zM4250m = abstractC1109b0M4161L.m4250m();
            RecyclerView recyclerView = RecyclerView.this;
            if (zM4250m) {
                recyclerView.removeDetachedView(view, false);
            }
            if (abstractC1109b0M4161L.m4249l()) {
                abstractC1109b0M4161L.f7067n.m4354m(abstractC1109b0M4161L);
            } else if (abstractC1109b0M4161L.m4255r()) {
                abstractC1109b0M4161L.f7063j &= -33;
            }
            m4351j(abstractC1109b0M4161L);
            if (recyclerView.f7025l0 != null && !abstractC1109b0M4161L.m4247j()) {
                recyclerView.f7025l0.mo4276e(abstractC1109b0M4161L);
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0038  */
        /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: j */
        public final void m4351j(AbstractC1109b0 abstractC1109b0) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean zM4249l = abstractC1109b0.m4249l();
            boolean z15 = false;
            RecyclerView recyclerView = RecyclerView.this;
            View view = abstractC1109b0.f7054a;
            if (!zM4249l && view.getParent() == null) {
                if (abstractC1109b0.m4250m()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1109b0 + recyclerView.m4170B());
                }
                if (abstractC1109b0.m4254q()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.m4170B());
                }
                if ((abstractC1109b0.f7063j & 16) == 0) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    if (C10029b0.d.m18672i(view)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                Adapter adapter = recyclerView.f6971H;
                if ((adapter != null && z10 && adapter.mo4231l(abstractC1109b0)) || abstractC1109b0.m4247j()) {
                    if (this.f7121f <= 0) {
                        z12 = false;
                    } else {
                        if ((abstractC1109b0.f7063j & 526) != 0) {
                            z12 = false;
                        } else {
                            ArrayList<AbstractC1109b0> arrayList = this.f7118c;
                            int size = arrayList.size();
                            if (size >= this.f7121f && size > 0) {
                                m4349h(0);
                                size--;
                            }
                            if (RecyclerView.f6960a1 && size > 0) {
                                int i10 = abstractC1109b0.f7056c;
                                RunnableC1164o.b bVar = recyclerView.f6966C0;
                                if (bVar.f7394c == null) {
                                    z13 = false;
                                    break;
                                }
                                int i11 = bVar.f7395d * 2;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= i11) {
                                        z13 = false;
                                        break;
                                    } else {
                                        if (bVar.f7394c[i12] == i10) {
                                            z13 = true;
                                            break;
                                        }
                                        i12 += 2;
                                    }
                                }
                                if (!z13) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                        int i13 = arrayList.get(size).f7056c;
                                        if (bVar.f7394c == null) {
                                            z14 = false;
                                            break;
                                            break;
                                        }
                                        int i14 = bVar.f7395d * 2;
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= i14) {
                                                z14 = false;
                                                break;
                                            } else {
                                                if (bVar.f7394c[i15] == i13) {
                                                    z14 = true;
                                                    break;
                                                }
                                                i15 += 2;
                                            }
                                        }
                                    } while (z14);
                                    size++;
                                }
                            }
                            arrayList.add(size, abstractC1109b0);
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        m4342a(abstractC1109b0, true);
                        z15 = true;
                    }
                    z11 = z15;
                    z15 = z12;
                } else {
                    z11 = false;
                }
                recyclerView.f7014g.m4494d(abstractC1109b0);
                if (z15 || z11 || !z10) {
                    return;
                }
                C8573r0.m16673G(view);
                abstractC1109b0.f7072s = null;
                abstractC1109b0.f7071r = null;
                return;
            }
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC1109b0.m4249l());
            sb2.append(" isAttached:");
            if (view.getParent() != null) {
                z15 = true;
            }
            sb2.append(z15);
            sb2.append(recyclerView.m4170B());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0055  */
        /* JADX INFO: renamed from: k */
        public final void m4352k(View view) {
            AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            int i10 = abstractC1109b0M4161L.f7063j;
            boolean z10 = (i10 & 12) != 0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10) {
                if ((i10 & 2) != 0) {
                    AbstractC1117j abstractC1117j = recyclerView.f7025l0;
                    if (!(abstractC1117j == null || abstractC1117j.mo4274c(abstractC1109b0M4161L, abstractC1109b0M4161L.m4243f()))) {
                        if (this.f7117b == null) {
                            this.f7117b = new ArrayList<>();
                        }
                        abstractC1109b0M4161L.f7067n = this;
                        abstractC1109b0M4161L.f7068o = true;
                        this.f7117b.add(abstractC1109b0M4161L);
                        return;
                    }
                }
            }
            if (abstractC1109b0M4161L.m4246i() && !abstractC1109b0M4161L.m4248k() && !recyclerView.f6971H.f7041b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m4170B());
            }
            abstractC1109b0M4161L.f7067n = this;
            abstractC1109b0M4161L.f7068o = false;
            this.f7116a.add(abstractC1109b0M4161L);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:102:0x01be  */
        /* JADX WARN: Code duplicated, block: B:103:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:120:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:122:0x0201  */
        /* JADX WARN: Code duplicated, block: B:123:0x020c  */
        /* JADX WARN: Code duplicated, block: B:125:0x0212  */
        /* JADX WARN: Code duplicated, block: B:127:0x021e  */
        /* JADX WARN: Code duplicated, block: B:132:0x0240  */
        /* JADX WARN: Code duplicated, block: B:179:0x031a A[EDGE_INSN: B:179:0x031a->B:180:0x031b BREAK  A[LOOP:6: B:174:0x0303->B:360:?]] */
        /* JADX WARN: Code duplicated, block: B:222:0x03da  */
        /* JADX WARN: Code duplicated, block: B:223:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:225:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:227:0x03ea  */
        /* JADX WARN: Code duplicated, block: B:233:0x040d  */
        /* JADX WARN: Code duplicated, block: B:235:0x0413  */
        /* JADX WARN: Code duplicated, block: B:237:0x0418  */
        /* JADX WARN: Code duplicated, block: B:238:0x041b  */
        /* JADX WARN: Code duplicated, block: B:240:0x041e  */
        /* JADX WARN: Code duplicated, block: B:246:0x0447  */
        /* JADX WARN: Code duplicated, block: B:248:0x0455  */
        /* JADX WARN: Code duplicated, block: B:252:0x045d  */
        /* JADX WARN: Code duplicated, block: B:254:0x0461  */
        /* JADX WARN: Code duplicated, block: B:255:0x0466  */
        /* JADX WARN: Code duplicated, block: B:257:0x046f  */
        /* JADX WARN: Code duplicated, block: B:258:0x0472  */
        /* JADX WARN: Code duplicated, block: B:260:0x0475  */
        /* JADX WARN: Code duplicated, block: B:262:0x047b  */
        /* JADX WARN: Code duplicated, block: B:266:0x049c  */
        /* JADX WARN: Code duplicated, block: B:268:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:271:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:276:0x04d1  */
        /* JADX WARN: Code duplicated, block: B:279:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:282:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:284:0x04eb  */
        /* JADX WARN: Code duplicated, block: B:286:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:287:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:291:0x04ff  */
        /* JADX WARN: Code duplicated, block: B:293:0x0505  */
        /* JADX WARN: Code duplicated, block: B:296:0x050f  */
        /* JADX WARN: Code duplicated, block: B:298:0x0513  */
        /* JADX WARN: Code duplicated, block: B:299:0x0518  */
        /* JADX WARN: Code duplicated, block: B:301:0x051f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:305:0x052b  */
        /* JADX WARN: Code duplicated, block: B:308:0x0531  */
        /* JADX WARN: Code duplicated, block: B:312:0x053f  */
        /* JADX WARN: Code duplicated, block: B:313:0x0549  */
        /* JADX WARN: Code duplicated, block: B:315:0x054f  */
        /* JADX WARN: Code duplicated, block: B:316:0x0559  */
        /* JADX WARN: Code duplicated, block: B:319:0x0560 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:332:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:337:0x00f7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:342:0x01b3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x007f A[EDGE_INSN: B:35:0x007f->B:36:0x0080 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
        /* JADX WARN: Code duplicated, block: B:42:0x008f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0096  */
        /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:70:0x010d  */
        /* JADX WARN: Code duplicated, block: B:72:0x0115  */
        /* JADX WARN: Code duplicated, block: B:75:0x012a  */
        /* JADX WARN: Code duplicated, block: B:77:0x0132  */
        /* JADX WARN: Code duplicated, block: B:78:0x0134  */
        /* JADX WARN: Code duplicated, block: B:80:0x013b  */
        /* JADX WARN: Code duplicated, block: B:81:0x0149  */
        /* JADX WARN: Code duplicated, block: B:83:0x0164  */
        /* JADX WARN: Code duplicated, block: B:85:0x0178  */
        /* JADX WARN: Code duplicated, block: B:87:0x018c  */
        /* JADX WARN: Code duplicated, block: B:89:0x0193  */
        /* JADX WARN: Instruction removed from duplicated block: B:81:0x0149, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:83:0x0164, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:85:0x0178, please report this as an issue */
        /* JADX INFO: renamed from: l */
        public final AbstractC1109b0 m4353l(int i10, long j10) {
            AbstractC1109b0 abstractC1109b0;
            boolean z10;
            ArrayList<AbstractC1109b0> arrayList;
            ArrayList<AbstractC1109b0> arrayList2;
            int iM4416f;
            C10026a c10026a;
            int i11;
            long nanoTime;
            Adapter<? extends AbstractC1109b0> adapter;
            boolean z11;
            View view;
            long nanoTime2;
            long j11;
            AccessibilityManager accessibilityManager;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            C1149e0 c1149e0;
            C1149e0.a aVar;
            View.AccessibilityDelegate accessibilityDelegateM18648d;
            ArrayList arrayList3;
            ViewGroup.LayoutParams layoutParams;
            long j12;
            boolean z17;
            boolean z18;
            ViewGroup.LayoutParams layoutParams2;
            View view2;
            C1121n c1121n;
            int i12;
            boolean z19;
            int iM4416f2;
            RecyclerView recyclerViewM4160G;
            AbstractC1109b0 abstractC1109b0Remove;
            int size;
            int i13;
            C1150f c1150f;
            ArrayList arrayList4;
            int size2;
            int i14;
            View view3;
            int size3;
            int i15;
            AbstractC1109b0 abstractC1109b0M4161L;
            AbstractC1109b0 abstractC1109b1;
            C1150f c1150f2;
            int iIndexOfChild;
            C1150f.a aVar2;
            C1150f c1150f3;
            int iIndexOfChild2;
            int iM4467b;
            C1150f.a aVar3;
            AbstractC1109b0 abstractC1109b0M4161L2;
            int i16;
            boolean z20;
            AbstractC1109b0 abstractC1109b2;
            int size4;
            int iM4416f3;
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 < 0 || i10 >= recyclerView.f6967D0.m4364b()) {
                StringBuilder sbM25n = C0009a.m25n("Invalid item position ", i10, "(", i10, "). Item count:");
                sbM25n.append(recyclerView.f6967D0.m4364b());
                sbM25n.append(recyclerView.m4170B());
                throw new IndexOutOfBoundsException(sbM25n.toString());
            }
            C1131x c1131x = recyclerView.f6967D0;
            if (c1131x.f7146g) {
                ArrayList<AbstractC1109b0> arrayList5 = this.f7117b;
                if (arrayList5 != null && (size4 = arrayList5.size()) != 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size4) {
                            if (recyclerView.f6971H.f7041b && (iM4416f3 = recyclerView.f7010e.m4416f(i10, 0)) > 0 && iM4416f3 < recyclerView.f6971H.mo4226e()) {
                                long jMo4227f = recyclerView.f6971H.mo4227f(iM4416f3);
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size4) {
                                        abstractC1109b0 = null;
                                        break;
                                    }
                                    AbstractC1109b0 abstractC1109b3 = this.f7117b.get(i18);
                                    if (!abstractC1109b3.m4255r() && abstractC1109b3.f7058e == jMo4227f) {
                                        abstractC1109b3.m4239b(32);
                                        abstractC1109b0 = abstractC1109b3;
                                        break;
                                    }
                                    i18++;
                                }
                            } else {
                                abstractC1109b0 = null;
                                break;
                            }
                        } else {
                            abstractC1109b0 = this.f7117b.get(i17);
                            if (!abstractC1109b0.m4255r() && abstractC1109b0.m4242e() == i10) {
                                abstractC1109b0.m4239b(32);
                                break;
                            }
                            i17++;
                        }
                    }
                } else {
                    abstractC1109b0 = null;
                    break;
                }
                if (abstractC1109b0 != null) {
                    z10 = true;
                }
                arrayList = this.f7118c;
                arrayList2 = this.f7116a;
                if (abstractC1109b0 == null) {
                    size = arrayList2.size();
                    i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            c1150f = recyclerView.f7012f;
                            arrayList4 = c1150f.f7256c;
                            size2 = arrayList4.size();
                            i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    view3 = null;
                                    break;
                                }
                                view3 = (View) arrayList4.get(i14);
                                ((C1145c0) c1150f.f7254a).getClass();
                                abstractC1109b0M4161L2 = RecyclerView.m4161L(view3);
                                if (abstractC1109b0M4161L2.m4242e() != i10 && !abstractC1109b0M4161L2.m4246i() && !abstractC1109b0M4161L2.m4248k()) {
                                    break;
                                }
                                i14++;
                            }
                            if (view3 != null) {
                                abstractC1109b0M4161L = RecyclerView.m4161L(view3);
                                c1150f2 = recyclerView.f7012f;
                                iIndexOfChild = ((C1145c0) c1150f2.f7254a).f7226a.indexOfChild(view3);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view3);
                                }
                                aVar2 = c1150f2.f7255b;
                                if (aVar2.m4469d(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                                }
                                aVar2.m4466a(iIndexOfChild);
                                c1150f2.m4465k(view3);
                                c1150f3 = recyclerView.f7012f;
                                iIndexOfChild2 = ((C1145c0) c1150f3.f7254a).f7226a.indexOfChild(view3);
                                if (iIndexOfChild2 == -1) {
                                    iM4467b = -1;
                                } else {
                                    aVar3 = c1150f3.f7255b;
                                    if (aVar3.m4469d(iIndexOfChild2)) {
                                        iM4467b = -1;
                                    } else {
                                        iM4467b = iIndexOfChild2 - aVar3.m4467b(iIndexOfChild2);
                                    }
                                }
                                if (iM4467b != -1) {
                                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1109b0M4161L + recyclerView.m4170B());
                                }
                                recyclerView.f7012f.m4457c(iM4467b);
                                m4352k(view3);
                                abstractC1109b0M4161L.m4239b(8224);
                            } else {
                                size3 = arrayList.size();
                                i15 = 0;
                                while (true) {
                                    if (i15 < size3) {
                                        abstractC1109b1 = arrayList.get(i15);
                                        if (abstractC1109b1.m4246i() && abstractC1109b1.m4242e() == i10 && !abstractC1109b1.m4244g()) {
                                            arrayList.remove(i15);
                                            abstractC1109b0 = abstractC1109b1;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        abstractC1109b0M4161L = null;
                                    }
                                }
                            }
                            abstractC1109b0 = abstractC1109b0M4161L;
                            break;
                        }
                        abstractC1109b2 = arrayList2.get(i13);
                        if (abstractC1109b2.m4255r() && abstractC1109b2.m4242e() == i10 && !abstractC1109b2.m4246i() && (c1131x.f7146g || !abstractC1109b2.m4248k())) {
                            abstractC1109b2.m4239b(32);
                            abstractC1109b0 = abstractC1109b2;
                            break;
                        }
                        i13++;
                    }
                    if (abstractC1109b0 != null) {
                        if (!abstractC1109b0.m4248k()) {
                            z20 = c1131x.f7146g;
                        } else {
                            i16 = abstractC1109b0.f7056c;
                            if (i16 >= 0 || i16 >= recyclerView.f6971H.mo4226e()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1109b0 + recyclerView.m4170B());
                            }
                            if (c1131x.f7146g || recyclerView.f6971H.mo4228g(abstractC1109b0.f7056c) == abstractC1109b0.f7059f) {
                                Adapter adapter2 = recyclerView.f6971H;
                                if (!adapter2.f7041b || abstractC1109b0.f7058e == adapter2.mo4227f(abstractC1109b0.f7056c)) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            } else {
                                z20 = false;
                            }
                        }
                        if (z20) {
                            z10 = true;
                        } else {
                            abstractC1109b0.m4239b(4);
                            if (abstractC1109b0.m4249l()) {
                                recyclerView.removeDetachedView(abstractC1109b0.f7054a, false);
                                abstractC1109b0.f7067n.m4354m(abstractC1109b0);
                            } else if (abstractC1109b0.m4255r()) {
                                abstractC1109b0.f7063j &= -33;
                            }
                            m4351j(abstractC1109b0);
                            abstractC1109b0 = null;
                        }
                    }
                }
                if (abstractC1109b0 == null) {
                    iM4416f2 = recyclerView.f7010e.m4416f(i10, 0);
                    if (iM4416f2 >= 0 || iM4416f2 >= recyclerView.f6971H.mo4226e()) {
                        StringBuilder sbM25n2 = C0009a.m25n("Inconsistency detected. Invalid item position ", i10, "(offset:", iM4416f2, ").state:");
                        sbM25n2.append(c1131x.m4364b());
                        sbM25n2.append(recyclerView.m4170B());
                        throw new IndexOutOfBoundsException(sbM25n2.toString());
                    }
                    int iMo4228g = recyclerView.f6971H.mo4228g(iM4416f2);
                    Adapter adapter3 = recyclerView.f6971H;
                    if (adapter3.f7041b) {
                        long jMo4227f2 = adapter3.mo4227f(iM4416f2);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList.size();
                                while (true) {
                                    size6--;
                                    if (size6 >= 0) {
                                        AbstractC1109b0 abstractC1109b4 = arrayList.get(size6);
                                        if (abstractC1109b4.f7058e == jMo4227f2 && !abstractC1109b4.m4244g()) {
                                            if (iMo4228g == abstractC1109b4.f7059f) {
                                                arrayList.remove(size6);
                                                abstractC1109b0 = abstractC1109b4;
                                                break;
                                            }
                                            m4349h(size6);
                                        }
                                    }
                                    abstractC1109b0 = null;
                                    break;
                                }
                            }
                            AbstractC1109b0 abstractC1109b5 = arrayList2.get(size5);
                            if (abstractC1109b5.f7058e == jMo4227f2 && !abstractC1109b5.m4255r()) {
                                if (iMo4228g == abstractC1109b5.f7059f) {
                                    abstractC1109b5.m4239b(32);
                                    if (abstractC1109b5.m4248k() && !c1131x.f7146g) {
                                        abstractC1109b5.f7063j = (abstractC1109b5.f7063j & (-15)) | 2;
                                    }
                                    abstractC1109b0 = abstractC1109b5;
                                    break;
                                }
                                arrayList2.remove(size5);
                                View view4 = abstractC1109b5.f7054a;
                                recyclerView.removeDetachedView(view4, false);
                                AbstractC1109b0 abstractC1109b0M4161L3 = RecyclerView.m4161L(view4);
                                abstractC1109b0M4161L3.f7067n = null;
                                abstractC1109b0M4161L3.f7068o = false;
                                abstractC1109b0M4161L3.f7063j &= -33;
                                m4351j(abstractC1109b0M4161L3);
                            }
                            size5--;
                        }
                        if (abstractC1109b0 != null) {
                            abstractC1109b0.f7056c = iM4416f2;
                            z10 = true;
                        }
                    }
                    if (abstractC1109b0 == null) {
                        C1126s.a aVar4 = m4344c().f7109a.get(iMo4228g);
                        if (aVar4 == null) {
                            abstractC1109b0Remove = null;
                            break;
                        }
                        ArrayList<AbstractC1109b0> arrayList6 = aVar4.f7112a;
                        if (!arrayList6.isEmpty()) {
                            int size7 = arrayList6.size();
                            while (true) {
                                size7--;
                                if (size7 < 0) {
                                    abstractC1109b0Remove = null;
                                    break;
                                }
                                if (!arrayList6.get(size7).m4244g()) {
                                    abstractC1109b0Remove = arrayList6.remove(size7);
                                    break;
                                }
                            }
                        } else {
                            abstractC1109b0Remove = null;
                            break;
                        }
                        if (abstractC1109b0Remove != null) {
                            abstractC1109b0Remove.m4252o();
                            int[] iArr = RecyclerView.f6956W0;
                        }
                        abstractC1109b0 = abstractC1109b0Remove;
                    }
                    if (abstractC1109b0 == null) {
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j10 != Long.MAX_VALUE) {
                            long j13 = this.f7122g.m4341a(iMo4228g).f7114c;
                            if (!(j13 == 0 || j13 + nanoTime3 < j10)) {
                                return null;
                            }
                        }
                        Adapter adapter4 = recyclerView.f6971H;
                        adapter4.getClass();
                        try {
                            int i19 = C9191j.f47731a;
                            C9191j.a.m17531a("RV CreateView");
                            AbstractC1109b0 abstractC1109b0Mo479j = adapter4.mo479j(recyclerView, iMo4228g);
                            if (abstractC1109b0Mo479j.f7054a.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC1109b0Mo479j.f7059f = iMo4228g;
                            C9191j.a.m17532b();
                            if (RecyclerView.f6960a1 && (recyclerViewM4160G = RecyclerView.m4160G(abstractC1109b0Mo479j.f7054a)) != null) {
                                abstractC1109b0Mo479j.f7055b = new WeakReference<>(recyclerViewM4160G);
                            }
                            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                            C1126s.a aVarM4341a = this.f7122g.m4341a(iMo4228g);
                            long j14 = aVarM4341a.f7114c;
                            if (j14 != 0) {
                                nanoTime4 = (nanoTime4 / 4) + ((j14 / 4) * 3);
                            }
                            aVarM4341a.f7114c = nanoTime4;
                            abstractC1109b0 = abstractC1109b0Mo479j;
                        } catch (Throwable th2) {
                            int i20 = C9191j.f47731a;
                            C9191j.a.m17532b();
                            throw th2;
                        }
                    }
                }
                if (z10 && !c1131x.f7146g) {
                    i12 = abstractC1109b0.f7063j;
                    if ((i12 & 8192) != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        abstractC1109b0.f7063j = (i12 & (-8193)) | 0;
                        if (c1131x.f7149j) {
                            AbstractC1117j.m4272b(abstractC1109b0);
                            AbstractC1117j abstractC1117j = recyclerView.f7025l0;
                            abstractC1109b0.m4243f();
                            abstractC1117j.getClass();
                            AbstractC1117j.c cVar = new AbstractC1117j.c();
                            cVar.m4281a(abstractC1109b0);
                            recyclerView.m4190X(abstractC1109b0, cVar);
                        }
                    }
                }
                if (c1131x.f7146g || !abstractC1109b0.m4245h()) {
                    if (abstractC1109b0.m4245h()) {
                        if ((abstractC1109b0.f7063j & 2) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (!z18 || abstractC1109b0.m4246i()) {
                        }
                        layoutParams2 = abstractC1109b0.f7054a.getLayoutParams();
                        view2 = abstractC1109b0.f7054a;
                        if (layoutParams2 == null) {
                            c1121n = (C1121n) recyclerView.generateDefaultLayoutParams();
                            view2.setLayoutParams(c1121n);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                            c1121n = (C1121n) layoutParams2;
                        } else {
                            c1121n = (C1121n) recyclerView.generateLayoutParams(layoutParams2);
                            view2.setLayoutParams(c1121n);
                        }
                        c1121n.f7105a = abstractC1109b0;
                        if (z10 && z13) {
                            z15 = z14;
                        }
                        c1121n.f7108d = z15;
                        return abstractC1109b0;
                    }
                    iM4416f = recyclerView.f7010e.m4416f(i10, 0);
                    c10026a = null;
                    abstractC1109b0.f7072s = null;
                    abstractC1109b0.f7071r = recyclerView;
                    i11 = abstractC1109b0.f7059f;
                    nanoTime = recyclerView.getNanoTime();
                    if (j10 != Long.MAX_VALUE) {
                        j12 = this.f7122g.m4341a(i11).f7115d;
                        if (j12 != 0 || j12 + nanoTime < j10) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            adapter = recyclerView.f6971H;
                            adapter.getClass();
                            if (abstractC1109b0.f7072s == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                abstractC1109b0.f7056c = iM4416f;
                                if (adapter.f7041b) {
                                    abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                                }
                                abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                                int i21 = C9191j.f47731a;
                                C9191j.a.m17531a("RV OnBindView");
                            }
                            abstractC1109b0.f7072s = adapter;
                            abstractC1109b0.m4243f();
                            adapter.mo478i(abstractC1109b0, iM4416f);
                            view = abstractC1109b0.f7054a;
                            if (z11) {
                                arrayList3 = abstractC1109b0.f7064k;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                abstractC1109b0.f7063j &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof C1121n) {
                                    ((C1121n) layoutParams).f7107c = true;
                                }
                                int i22 = C9191j.f47731a;
                                C9191j.a.m17532b();
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            C1126s.a aVarM4341a2 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                            j11 = aVarM4341a2.f7115d;
                            if (j11 != 0) {
                                nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                            }
                            aVarM4341a2.f7115d = nanoTime2;
                            accessibilityManager = recyclerView.f7003a0;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                                if (C10029b0.d.m18666c(view) == 0) {
                                    z16 = true;
                                    C10029b0.d.m18682s(view, 1);
                                } else {
                                    z16 = true;
                                }
                                c1149e0 = recyclerView.f6978K0;
                                if (c1149e0 != null) {
                                    aVar = c1149e0.f7251e;
                                    if (aVar instanceof C1149e0.a) {
                                        aVar.getClass();
                                        accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                        if (accessibilityDelegateM18648d != null) {
                                            if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                                c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                            } else {
                                                c10026a = new C10026a(accessibilityDelegateM18648d);
                                            }
                                        }
                                        if (c10026a != null && c10026a != aVar) {
                                            aVar.f7253e.put(view, c10026a);
                                        }
                                    }
                                    C10029b0.m18658n(view, aVar);
                                }
                                z13 = z16;
                            } else {
                                z13 = true;
                            }
                            if (c1131x.f7146g) {
                                abstractC1109b0.f7060g = i10;
                            }
                            z14 = z13;
                            z15 = false;
                        } else {
                            z14 = true;
                            z15 = false;
                            z13 = false;
                        }
                    } else {
                        adapter = recyclerView.f6971H;
                        adapter.getClass();
                        if (abstractC1109b0.f7072s == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            abstractC1109b0.f7056c = iM4416f;
                            if (adapter.f7041b) {
                                abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                            }
                            abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                            int i23 = C9191j.f47731a;
                            C9191j.a.m17531a("RV OnBindView");
                        }
                        abstractC1109b0.f7072s = adapter;
                        abstractC1109b0.m4243f();
                        adapter.mo478i(abstractC1109b0, iM4416f);
                        view = abstractC1109b0.f7054a;
                        if (z11) {
                            arrayList3 = abstractC1109b0.f7064k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            abstractC1109b0.f7063j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof C1121n) {
                                ((C1121n) layoutParams).f7107c = true;
                            }
                            int i24 = C9191j.f47731a;
                            C9191j.a.m17532b();
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        C1126s.a aVarM4341a3 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                        j11 = aVarM4341a3.f7115d;
                        if (j11 != 0) {
                            nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                        }
                        aVarM4341a3.f7115d = nanoTime2;
                        accessibilityManager = recyclerView.f7003a0;
                        if (accessibilityManager == null) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                            if (C10029b0.d.m18666c(view) == 0) {
                                z16 = true;
                                C10029b0.d.m18682s(view, 1);
                            } else {
                                z16 = true;
                            }
                            c1149e0 = recyclerView.f6978K0;
                            if (c1149e0 != null) {
                                aVar = c1149e0.f7251e;
                                if (aVar instanceof C1149e0.a) {
                                    aVar.getClass();
                                    accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                    if (accessibilityDelegateM18648d != null) {
                                        if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                            c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                        } else {
                                            c10026a = new C10026a(accessibilityDelegateM18648d);
                                        }
                                    }
                                    if (c10026a != null) {
                                        aVar.f7253e.put(view, c10026a);
                                    }
                                }
                                C10029b0.m18658n(view, aVar);
                            }
                            z13 = z16;
                        } else {
                            z13 = true;
                        }
                        if (c1131x.f7146g) {
                            abstractC1109b0.f7060g = i10;
                        }
                        z14 = z13;
                        z15 = false;
                    }
                    layoutParams2 = abstractC1109b0.f7054a.getLayoutParams();
                    view2 = abstractC1109b0.f7054a;
                    if (layoutParams2 == null) {
                        c1121n = (C1121n) recyclerView.generateDefaultLayoutParams();
                        view2.setLayoutParams(c1121n);
                    } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                        c1121n = (C1121n) recyclerView.generateLayoutParams(layoutParams2);
                        view2.setLayoutParams(c1121n);
                    } else {
                        c1121n = (C1121n) layoutParams2;
                    }
                    c1121n.f7105a = abstractC1109b0;
                    if (z10) {
                        z15 = z14;
                    }
                    c1121n.f7108d = z15;
                    return abstractC1109b0;
                }
                abstractC1109b0.f7060g = i10;
                z15 = false;
                z14 = true;
                z13 = false;
                layoutParams2 = abstractC1109b0.f7054a.getLayoutParams();
                view2 = abstractC1109b0.f7054a;
                if (layoutParams2 == null) {
                    c1121n = (C1121n) recyclerView.generateDefaultLayoutParams();
                    view2.setLayoutParams(c1121n);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    c1121n = (C1121n) recyclerView.generateLayoutParams(layoutParams2);
                    view2.setLayoutParams(c1121n);
                } else {
                    c1121n = (C1121n) layoutParams2;
                }
                c1121n.f7105a = abstractC1109b0;
                if (z10) {
                    z15 = z14;
                }
                c1121n.f7108d = z15;
                return abstractC1109b0;
            }
            abstractC1109b0 = null;
            z10 = false;
            arrayList = this.f7118c;
            arrayList2 = this.f7116a;
            if (abstractC1109b0 == null) {
                size = arrayList2.size();
                i13 = 0;
                while (true) {
                    if (i13 < size) {
                        c1150f = recyclerView.f7012f;
                        arrayList4 = c1150f.f7256c;
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i14);
                            ((C1145c0) c1150f.f7254a).getClass();
                            abstractC1109b0M4161L2 = RecyclerView.m4161L(view3);
                            if (abstractC1109b0M4161L2.m4242e() != i10) {
                            }
                            i14++;
                        }
                        if (view3 != null) {
                            abstractC1109b0M4161L = RecyclerView.m4161L(view3);
                            c1150f2 = recyclerView.f7012f;
                            iIndexOfChild = ((C1145c0) c1150f2.f7254a).f7226a.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view3);
                            }
                            aVar2 = c1150f2.f7255b;
                            if (aVar2.m4469d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                            }
                            aVar2.m4466a(iIndexOfChild);
                            c1150f2.m4465k(view3);
                            c1150f3 = recyclerView.f7012f;
                            iIndexOfChild2 = ((C1145c0) c1150f3.f7254a).f7226a.indexOfChild(view3);
                            if (iIndexOfChild2 == -1) {
                                iM4467b = -1;
                            } else {
                                aVar3 = c1150f3.f7255b;
                                if (aVar3.m4469d(iIndexOfChild2)) {
                                    iM4467b = -1;
                                } else {
                                    iM4467b = iIndexOfChild2 - aVar3.m4467b(iIndexOfChild2);
                                }
                            }
                            if (iM4467b != -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1109b0M4161L + recyclerView.m4170B());
                            }
                            recyclerView.f7012f.m4457c(iM4467b);
                            m4352k(view3);
                            abstractC1109b0M4161L.m4239b(8224);
                        } else {
                            size3 = arrayList.size();
                            i15 = 0;
                            while (true) {
                                if (i15 < size3) {
                                    abstractC1109b1 = arrayList.get(i15);
                                    if (abstractC1109b1.m4246i()) {
                                    }
                                    i15++;
                                } else {
                                    abstractC1109b0M4161L = null;
                                }
                            }
                        }
                        abstractC1109b0 = abstractC1109b0M4161L;
                        break;
                    }
                    abstractC1109b2 = arrayList2.get(i13);
                    if (abstractC1109b2.m4255r()) {
                    }
                    i13++;
                }
                if (abstractC1109b0 != null) {
                    if (!abstractC1109b0.m4248k()) {
                        i16 = abstractC1109b0.f7056c;
                        if (i16 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1109b0 + recyclerView.m4170B());
                    }
                    z20 = c1131x.f7146g;
                    if (z20) {
                        abstractC1109b0.m4239b(4);
                        if (abstractC1109b0.m4249l()) {
                            recyclerView.removeDetachedView(abstractC1109b0.f7054a, false);
                            abstractC1109b0.f7067n.m4354m(abstractC1109b0);
                        } else if (abstractC1109b0.m4255r()) {
                            abstractC1109b0.f7063j &= -33;
                        }
                        m4351j(abstractC1109b0);
                        abstractC1109b0 = null;
                    } else {
                        z10 = true;
                    }
                }
            }
            if (abstractC1109b0 == null) {
                iM4416f2 = recyclerView.f7010e.m4416f(i10, 0);
                if (iM4416f2 >= 0) {
                }
                StringBuilder sbM25n3 = C0009a.m25n("Inconsistency detected. Invalid item position ", i10, "(offset:", iM4416f2, ").state:");
                sbM25n3.append(c1131x.m4364b());
                sbM25n3.append(recyclerView.m4170B());
                throw new IndexOutOfBoundsException(sbM25n3.toString());
            }
            if (z10) {
                i12 = abstractC1109b0.f7063j;
                if ((i12 & 8192) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z19) {
                    abstractC1109b0.f7063j = (i12 & (-8193)) | 0;
                    if (c1131x.f7149j) {
                        AbstractC1117j.m4272b(abstractC1109b0);
                        AbstractC1117j abstractC1117j2 = recyclerView.f7025l0;
                        abstractC1109b0.m4243f();
                        abstractC1117j2.getClass();
                        AbstractC1117j.c cVar2 = new AbstractC1117j.c();
                        cVar2.m4281a(abstractC1109b0);
                        recyclerView.m4190X(abstractC1109b0, cVar2);
                    }
                }
            }
            if (c1131x.f7146g) {
                if (abstractC1109b0.m4245h()) {
                    if ((abstractC1109b0.f7063j & 2) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                    }
                }
                iM4416f = recyclerView.f7010e.m4416f(i10, 0);
                c10026a = null;
                abstractC1109b0.f7072s = null;
                abstractC1109b0.f7071r = recyclerView;
                i11 = abstractC1109b0.f7059f;
                nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    j12 = this.f7122g.m4341a(i11).f7115d;
                    if (j12 != 0) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        z14 = true;
                        z15 = false;
                        z13 = false;
                    } else {
                        adapter = recyclerView.f6971H;
                        adapter.getClass();
                        if (abstractC1109b0.f7072s == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            abstractC1109b0.f7056c = iM4416f;
                            if (adapter.f7041b) {
                                abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                            }
                            abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                            int i25 = C9191j.f47731a;
                            C9191j.a.m17531a("RV OnBindView");
                        }
                        abstractC1109b0.f7072s = adapter;
                        abstractC1109b0.m4243f();
                        adapter.mo478i(abstractC1109b0, iM4416f);
                        view = abstractC1109b0.f7054a;
                        if (z11) {
                            arrayList3 = abstractC1109b0.f7064k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            abstractC1109b0.f7063j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof C1121n) {
                                ((C1121n) layoutParams).f7107c = true;
                            }
                            int i26 = C9191j.f47731a;
                            C9191j.a.m17532b();
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        C1126s.a aVarM4341a4 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                        j11 = aVarM4341a4.f7115d;
                        if (j11 != 0) {
                            nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                        }
                        aVarM4341a4.f7115d = nanoTime2;
                        accessibilityManager = recyclerView.f7003a0;
                        if (accessibilityManager == null) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                            if (C10029b0.d.m18666c(view) == 0) {
                                z16 = true;
                                C10029b0.d.m18682s(view, 1);
                            } else {
                                z16 = true;
                            }
                            c1149e0 = recyclerView.f6978K0;
                            if (c1149e0 != null) {
                                aVar = c1149e0.f7251e;
                                if (aVar instanceof C1149e0.a) {
                                    aVar.getClass();
                                    accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                    if (accessibilityDelegateM18648d != null) {
                                        if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                            c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                        } else {
                                            c10026a = new C10026a(accessibilityDelegateM18648d);
                                        }
                                    }
                                    if (c10026a != null) {
                                        aVar.f7253e.put(view, c10026a);
                                    }
                                }
                                C10029b0.m18658n(view, aVar);
                            }
                            z13 = z16;
                        } else {
                            z13 = true;
                        }
                        if (c1131x.f7146g) {
                            abstractC1109b0.f7060g = i10;
                        }
                        z14 = z13;
                        z15 = false;
                    }
                } else {
                    adapter = recyclerView.f6971H;
                    adapter.getClass();
                    if (abstractC1109b0.f7072s == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        abstractC1109b0.f7056c = iM4416f;
                        if (adapter.f7041b) {
                            abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                        }
                        abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                        int i27 = C9191j.f47731a;
                        C9191j.a.m17531a("RV OnBindView");
                    }
                    abstractC1109b0.f7072s = adapter;
                    abstractC1109b0.m4243f();
                    adapter.mo478i(abstractC1109b0, iM4416f);
                    view = abstractC1109b0.f7054a;
                    if (z11) {
                        arrayList3 = abstractC1109b0.f7064k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        abstractC1109b0.f7063j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C1121n) {
                            ((C1121n) layoutParams).f7107c = true;
                        }
                        int i28 = C9191j.f47731a;
                        C9191j.a.m17532b();
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C1126s.a aVarM4341a5 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                    j11 = aVarM4341a5.f7115d;
                    if (j11 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                    }
                    aVarM4341a5.f7115d = nanoTime2;
                    accessibilityManager = recyclerView.f7003a0;
                    if (accessibilityManager == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                        if (C10029b0.d.m18666c(view) == 0) {
                            z16 = true;
                            C10029b0.d.m18682s(view, 1);
                        } else {
                            z16 = true;
                        }
                        c1149e0 = recyclerView.f6978K0;
                        if (c1149e0 != null) {
                            aVar = c1149e0.f7251e;
                            if (aVar instanceof C1149e0.a) {
                                aVar.getClass();
                                accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                if (accessibilityDelegateM18648d != null) {
                                    if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                        c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                    } else {
                                        c10026a = new C10026a(accessibilityDelegateM18648d);
                                    }
                                }
                                if (c10026a != null) {
                                    aVar.f7253e.put(view, c10026a);
                                }
                            }
                            C10029b0.m18658n(view, aVar);
                        }
                        z13 = z16;
                    } else {
                        z13 = true;
                    }
                    if (c1131x.f7146g) {
                        abstractC1109b0.f7060g = i10;
                    }
                    z14 = z13;
                    z15 = false;
                }
            } else {
                if (abstractC1109b0.m4245h()) {
                    if ((abstractC1109b0.f7063j & 2) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                    }
                }
                iM4416f = recyclerView.f7010e.m4416f(i10, 0);
                c10026a = null;
                abstractC1109b0.f7072s = null;
                abstractC1109b0.f7071r = recyclerView;
                i11 = abstractC1109b0.f7059f;
                nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    j12 = this.f7122g.m4341a(i11).f7115d;
                    if (j12 != 0) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        z14 = true;
                        z15 = false;
                        z13 = false;
                    } else {
                        adapter = recyclerView.f6971H;
                        adapter.getClass();
                        if (abstractC1109b0.f7072s == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            abstractC1109b0.f7056c = iM4416f;
                            if (adapter.f7041b) {
                                abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                            }
                            abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                            int i29 = C9191j.f47731a;
                            C9191j.a.m17531a("RV OnBindView");
                        }
                        abstractC1109b0.f7072s = adapter;
                        abstractC1109b0.m4243f();
                        adapter.mo478i(abstractC1109b0, iM4416f);
                        view = abstractC1109b0.f7054a;
                        if (z11) {
                            arrayList3 = abstractC1109b0.f7064k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            abstractC1109b0.f7063j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof C1121n) {
                                ((C1121n) layoutParams).f7107c = true;
                            }
                            int i210 = C9191j.f47731a;
                            C9191j.a.m17532b();
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        C1126s.a aVarM4341a6 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                        j11 = aVarM4341a6.f7115d;
                        if (j11 != 0) {
                            nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                        }
                        aVarM4341a6.f7115d = nanoTime2;
                        accessibilityManager = recyclerView.f7003a0;
                        if (accessibilityManager == null) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, C10049l0> weakHashMap5 = C10029b0.f50993a;
                            if (C10029b0.d.m18666c(view) == 0) {
                                z16 = true;
                                C10029b0.d.m18682s(view, 1);
                            } else {
                                z16 = true;
                            }
                            c1149e0 = recyclerView.f6978K0;
                            if (c1149e0 != null) {
                                aVar = c1149e0.f7251e;
                                if (aVar instanceof C1149e0.a) {
                                    aVar.getClass();
                                    accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                    if (accessibilityDelegateM18648d != null) {
                                        if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                            c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                        } else {
                                            c10026a = new C10026a(accessibilityDelegateM18648d);
                                        }
                                    }
                                    if (c10026a != null) {
                                        aVar.f7253e.put(view, c10026a);
                                    }
                                }
                                C10029b0.m18658n(view, aVar);
                            }
                            z13 = z16;
                        } else {
                            z13 = true;
                        }
                        if (c1131x.f7146g) {
                            abstractC1109b0.f7060g = i10;
                        }
                        z14 = z13;
                        z15 = false;
                    }
                } else {
                    adapter = recyclerView.f6971H;
                    adapter.getClass();
                    if (abstractC1109b0.f7072s == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        abstractC1109b0.f7056c = iM4416f;
                        if (adapter.f7041b) {
                            abstractC1109b0.f7058e = adapter.mo4227f(iM4416f);
                        }
                        abstractC1109b0.f7063j = (abstractC1109b0.f7063j & (-520)) | 1;
                        int i211 = C9191j.f47731a;
                        C9191j.a.m17531a("RV OnBindView");
                    }
                    abstractC1109b0.f7072s = adapter;
                    abstractC1109b0.m4243f();
                    adapter.mo478i(abstractC1109b0, iM4416f);
                    view = abstractC1109b0.f7054a;
                    if (z11) {
                        arrayList3 = abstractC1109b0.f7064k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        abstractC1109b0.f7063j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C1121n) {
                            ((C1121n) layoutParams).f7107c = true;
                        }
                        int i212 = C9191j.f47731a;
                        C9191j.a.m17532b();
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C1126s.a aVarM4341a7 = this.f7122g.m4341a(abstractC1109b0.f7059f);
                    j11 = aVarM4341a7.f7115d;
                    if (j11 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                    }
                    aVarM4341a7.f7115d = nanoTime2;
                    accessibilityManager = recyclerView.f7003a0;
                    if (accessibilityManager == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        WeakHashMap<View, C10049l0> weakHashMap6 = C10029b0.f50993a;
                        if (C10029b0.d.m18666c(view) == 0) {
                            z16 = true;
                            C10029b0.d.m18682s(view, 1);
                        } else {
                            z16 = true;
                        }
                        c1149e0 = recyclerView.f6978K0;
                        if (c1149e0 != null) {
                            aVar = c1149e0.f7251e;
                            if (aVar instanceof C1149e0.a) {
                                aVar.getClass();
                                accessibilityDelegateM18648d = C10029b0.m18648d(view);
                                if (accessibilityDelegateM18648d != null) {
                                    if (accessibilityDelegateM18648d instanceof C10026a.a) {
                                        c10026a = ((C10026a.a) accessibilityDelegateM18648d).f50991a;
                                    } else {
                                        c10026a = new C10026a(accessibilityDelegateM18648d);
                                    }
                                }
                                if (c10026a != null) {
                                    aVar.f7253e.put(view, c10026a);
                                }
                            }
                            C10029b0.m18658n(view, aVar);
                        }
                        z13 = z16;
                    } else {
                        z13 = true;
                    }
                    if (c1131x.f7146g) {
                        abstractC1109b0.f7060g = i10;
                    }
                    z14 = z13;
                    z15 = false;
                }
            }
            layoutParams2 = abstractC1109b0.f7054a.getLayoutParams();
            view2 = abstractC1109b0.f7054a;
            if (layoutParams2 == null) {
                c1121n = (C1121n) recyclerView.generateDefaultLayoutParams();
                view2.setLayoutParams(c1121n);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c1121n = (C1121n) recyclerView.generateLayoutParams(layoutParams2);
                view2.setLayoutParams(c1121n);
            } else {
                c1121n = (C1121n) layoutParams2;
            }
            c1121n.f7105a = abstractC1109b0;
            if (z10) {
                z15 = z14;
            }
            c1121n.f7108d = z15;
            return abstractC1109b0;
        }

        /* JADX INFO: renamed from: m */
        public final void m4354m(AbstractC1109b0 abstractC1109b0) {
            if (abstractC1109b0.f7068o) {
                this.f7117b.remove(abstractC1109b0);
            } else {
                this.f7116a.remove(abstractC1109b0);
            }
            abstractC1109b0.f7067n = null;
            abstractC1109b0.f7068o = false;
            abstractC1109b0.f7063j &= -33;
        }

        /* JADX INFO: renamed from: n */
        public final void m4355n() {
            AbstractC1120m abstractC1120m = RecyclerView.this.f6973I;
            this.f7121f = this.f7120e + (abstractC1120m != null ? abstractC1120m.f7093j : 0);
            ArrayList<AbstractC1109b0> arrayList = this.f7118c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7121f; size--) {
                m4349h(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public interface InterfaceC1128u {
        /* JADX INFO: renamed from: a */
        void m4356a();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public class C1129v extends AbstractC1114g {
        public C1129v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: a */
        public final void mo4265a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m4205j(null);
            recyclerView.f6967D0.f7145f = true;
            recyclerView.m4189W(true);
            if (!recyclerView.f7010e.m4417g()) {
                recyclerView.requestLayout();
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0033  */
        /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: c */
        public final void mo4267c(int i10, int i11, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m4205j(null);
            C1140a c1140a = recyclerView.f7010e;
            boolean z10 = true;
            if (i11 >= 1) {
                ArrayList<C1140a.b> arrayList = c1140a.f7208b;
                arrayList.add(c1140a.m4418h(obj, 4, i10, i11));
                c1140a.f7212f |= 4;
                if (arrayList.size() == 1) {
                }
                if (z10) {
                    m4357h();
                }
            }
            c1140a.getClass();
            z10 = false;
            if (z10) {
                m4357h();
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: d */
        public final void mo4268d(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m4205j(null);
            C1140a c1140a = recyclerView.f7010e;
            boolean z10 = true;
            if (i11 >= 1) {
                ArrayList<C1140a.b> arrayList = c1140a.f7208b;
                arrayList.add(c1140a.m4418h(null, 1, i10, i11));
                c1140a.f7212f |= 1;
                if (arrayList.size() == 1) {
                }
                if (z10) {
                    m4357h();
                }
            }
            c1140a.getClass();
            z10 = false;
            if (z10) {
                m4357h();
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: e */
        public final void mo4269e(int i10, int i11) {
            boolean z10;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m4205j(null);
            C1140a c1140a = recyclerView.f7010e;
            c1140a.getClass();
            if (i10 != i11) {
                ArrayList<C1140a.b> arrayList = c1140a.f7208b;
                arrayList.add(c1140a.m4418h(null, 8, i10, i11));
                c1140a.f7212f |= 8;
                z10 = true;
                if (arrayList.size() != 1) {
                }
                if (z10) {
                    m4357h();
                }
            }
            z10 = false;
            if (z10) {
                m4357h();
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0031  */
        /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: f */
        public final void mo4270f(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m4205j(null);
            C1140a c1140a = recyclerView.f7010e;
            boolean z10 = true;
            if (i11 >= 1) {
                ArrayList<C1140a.b> arrayList = c1140a.f7208b;
                arrayList.add(c1140a.m4418h(null, 2, i10, i11));
                c1140a.f7212f |= 2;
                if (arrayList.size() != 1) {
                }
                if (z10) {
                    m4357h();
                }
            }
            c1140a.getClass();
            z10 = false;
            if (z10) {
                m4357h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: g */
        public final void mo4271g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f7008d == null || (adapter = recyclerView.f6971H) == null) {
                return;
            }
            int i10 = C1112e.f7074a[adapter.f7042c.ordinal()];
            boolean z10 = true;
            if (i10 == 1 || (i10 == 2 && adapter.mo4226e() <= 0)) {
                z10 = false;
            }
            if (z10) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m4357h() {
            boolean z10 = RecyclerView.f6959Z0;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.f6987P && recyclerView.f6985O) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18676m(recyclerView, recyclerView.f7018i);
            } else {
                recyclerView.f7001W = true;
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static abstract class AbstractC1130w {

        /* JADX INFO: renamed from: b */
        public RecyclerView f7126b;

        /* JADX INFO: renamed from: c */
        public AbstractC1120m f7127c;

        /* JADX INFO: renamed from: d */
        public boolean f7128d;

        /* JADX INFO: renamed from: e */
        public boolean f7129e;

        /* JADX INFO: renamed from: f */
        public View f7130f;

        /* JADX INFO: renamed from: h */
        public boolean f7132h;

        /* JADX INFO: renamed from: a */
        public int f7125a = -1;

        /* JADX INFO: renamed from: g */
        public final a f7131g = new a();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class a {

            /* JADX INFO: renamed from: d */
            public int f7136d = -1;

            /* JADX INFO: renamed from: f */
            public boolean f7138f = false;

            /* JADX INFO: renamed from: g */
            public int f7139g = 0;

            /* JADX INFO: renamed from: a */
            public int f7133a = 0;

            /* JADX INFO: renamed from: b */
            public int f7134b = 0;

            /* JADX INFO: renamed from: c */
            public int f7135c = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: e */
            public Interpolator f7137e = null;

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: a */
            public final void m4362a(RecyclerView recyclerView) {
                int i10 = this.f7136d;
                if (i10 >= 0) {
                    this.f7136d = -1;
                    recyclerView.m4181O(i10);
                    this.f7138f = false;
                    return;
                }
                if (!this.f7138f) {
                    this.f7139g = 0;
                    return;
                }
                Interpolator interpolator = this.f7137e;
                if (interpolator != null && this.f7135c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i11 = this.f7135c;
                if (i11 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f6964A0.m4237c(this.f7133a, this.f7134b, i11, interpolator);
                int i12 = this.f7139g + 1;
                this.f7139g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f7138f = false;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            PointF mo4131a(int i10);
        }

        /* JADX INFO: renamed from: a */
        public PointF mo4358a(int i10) {
            Object obj = this.f7127c;
            if (obj instanceof b) {
                return ((b) obj).mo4131a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m4359b(int i10, int i11) {
            PointF pointFMo4358a;
            RecyclerView recyclerView = this.f7126b;
            if (this.f7125a == -1 || recyclerView == null) {
                m4361d();
            }
            if (this.f7128d && this.f7130f == null && this.f7127c != null && (pointFMo4358a = mo4358a(this.f7125a)) != null) {
                float f3 = pointFMo4358a.x;
                if (f3 != 0.0f || pointFMo4358a.y != 0.0f) {
                    recyclerView.m4198f0((int) Math.signum(f3), (int) Math.signum(pointFMo4358a.y), null);
                }
            }
            boolean z10 = false;
            this.f7128d = false;
            View view = this.f7130f;
            a aVar = this.f7131g;
            if (view != null) {
                this.f7126b.getClass();
                AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
                if ((abstractC1109b0M4161L != null ? abstractC1109b0M4161L.m4242e() : -1) == this.f7125a) {
                    View view2 = this.f7130f;
                    C1131x c1131x = recyclerView.f6967D0;
                    mo4360c(view2, aVar);
                    aVar.m4362a(recyclerView);
                    m4361d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f7130f = null;
                }
            }
            if (this.f7129e) {
                C1131x c1131x2 = recyclerView.f6967D0;
                C1169t c1169t = (C1169t) this;
                if (c1169t.f7126b.f6973I.m4326y() == 0) {
                    c1169t.m4361d();
                } else {
                    int i12 = c1169t.f7469o;
                    int i13 = i12 - i10;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    c1169t.f7469o = i13;
                    int i14 = c1169t.f7470p;
                    int i15 = i14 - i11;
                    if (i14 * i15 <= 0) {
                        i15 = 0;
                    }
                    c1169t.f7470p = i15;
                    if (i13 == 0 && i15 == 0) {
                        PointF pointFMo4358a2 = c1169t.mo4358a(c1169t.f7125a);
                        if (pointFMo4358a2 != null) {
                            float f10 = pointFMo4358a2.x;
                            if (f10 != 0.0f || pointFMo4358a2.y != 0.0f) {
                                float f11 = pointFMo4358a2.y;
                                float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                                float f12 = pointFMo4358a2.x / fSqrt;
                                pointFMo4358a2.x = f12;
                                float f13 = pointFMo4358a2.y / fSqrt;
                                pointFMo4358a2.y = f13;
                                c1169t.f7465k = pointFMo4358a2;
                                c1169t.f7469o = (int) (f12 * 10000.0f);
                                c1169t.f7470p = (int) (f13 * 10000.0f);
                                int iMo4425h = c1169t.mo4425h(10000);
                                int i16 = (int) (c1169t.f7469o * 1.2f);
                                int i17 = (int) (c1169t.f7470p * 1.2f);
                                LinearInterpolator linearInterpolator = c1169t.f7463i;
                                aVar.f7133a = i16;
                                aVar.f7134b = i17;
                                aVar.f7135c = (int) (iMo4425h * 1.2f);
                                aVar.f7137e = linearInterpolator;
                                aVar.f7138f = true;
                            }
                        }
                        aVar.f7136d = c1169t.f7125a;
                        c1169t.m4361d();
                    }
                }
                if (aVar.f7136d >= 0) {
                    z10 = true;
                }
                aVar.m4362a(recyclerView);
                if (z10 && this.f7129e) {
                    this.f7128d = true;
                    recyclerView.f6964A0.m4236b();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo4360c(View view, a aVar);

        /* JADX INFO: renamed from: d */
        public final void m4361d() {
            if (this.f7129e) {
                this.f7129e = false;
                C1169t c1169t = (C1169t) this;
                c1169t.f7470p = 0;
                c1169t.f7469o = 0;
                c1169t.f7465k = null;
                this.f7126b.f6967D0.f7140a = -1;
                this.f7130f = null;
                this.f7125a = -1;
                this.f7128d = false;
                AbstractC1120m abstractC1120m = this.f7127c;
                if (abstractC1120m.f7088e == this) {
                    abstractC1120m.f7088e = null;
                }
                this.f7127c = null;
                this.f7126b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C1131x {

        /* JADX INFO: renamed from: a */
        public int f7140a = -1;

        /* JADX INFO: renamed from: b */
        public int f7141b = 0;

        /* JADX INFO: renamed from: c */
        public int f7142c = 0;

        /* JADX INFO: renamed from: d */
        public int f7143d = 1;

        /* JADX INFO: renamed from: e */
        public int f7144e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f7145f = false;

        /* JADX INFO: renamed from: g */
        public boolean f7146g = false;

        /* JADX INFO: renamed from: h */
        public boolean f7147h = false;

        /* JADX INFO: renamed from: i */
        public boolean f7148i = false;

        /* JADX INFO: renamed from: j */
        public boolean f7149j = false;

        /* JADX INFO: renamed from: k */
        public boolean f7150k = false;

        /* JADX INFO: renamed from: l */
        public int f7151l;

        /* JADX INFO: renamed from: m */
        public long f7152m;

        /* JADX INFO: renamed from: n */
        public int f7153n;

        /* JADX INFO: renamed from: a */
        public final void m4363a(int i10) {
            if ((this.f7143d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f7143d));
        }

        /* JADX INFO: renamed from: b */
        public final int m4364b() {
            return this.f7146g ? this.f7141b - this.f7142c : this.f7144e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f7140a + ", mData=null, mItemCount=" + this.f7144e + ", mIsMeasuring=" + this.f7148i + ", mPreviousLayoutItemCount=" + this.f7141b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7142c + ", mStructureChanged=" + this.f7145f + ", mInPreLayout=" + this.f7146g + ", mRunSimpleAnimations=" + this.f7149j + ", mRunPredictiveAnimations=" + this.f7150k + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C1132y extends C1116i {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC1133z {
    }

    static {
        Class<?> cls = Integer.TYPE;
        f6961b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f6962c1 = new InterpolatorC1110c();
        f6963d1 = new C1132y();
    }

    public RecyclerView() {
        throw null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.linguist.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        this.f7004b = new C1129v();
        this.f7006c = new C1127t();
        this.f7014g = new C1159j0();
        this.f7018i = new RunnableC1106a();
        this.f7020j = new Rect();
        this.f7022k = new Rect();
        this.f7024l = new RectF();
        this.f6977K = new ArrayList();
        this.f6979L = new ArrayList<>();
        this.f6981M = new ArrayList<>();
        this.f6991R = 0;
        this.f7007c0 = false;
        this.f7009d0 = false;
        this.f7011e0 = 0;
        this.f7013f0 = 0;
        this.f7015g0 = f6963d1;
        this.f7025l0 = new C1152g();
        this.f7026m0 = 0;
        this.f7027n0 = -1;
        this.f7037x0 = Float.MIN_VALUE;
        this.f7038y0 = Float.MIN_VALUE;
        this.f7039z0 = true;
        this.f6964A0 = new RunnableC1107a0();
        this.f6966C0 = f6960a1 ? new RunnableC1164o.b() : null;
        this.f6967D0 = new C1131x();
        this.f6970G0 = false;
        this.f6972H0 = false;
        C1118k c1118k = new C1118k();
        this.f6974I0 = c1118k;
        this.f6976J0 = false;
        char c10 = 2;
        this.f6980L0 = new int[2];
        this.f6984N0 = new int[2];
        this.f6986O0 = new int[2];
        this.f6988P0 = new int[2];
        this.f6990Q0 = new ArrayList();
        this.f6992R0 = new RunnableC1108b();
        this.f6996T0 = 0;
        this.f6998U0 = 0;
        this.f7000V0 = new C1111d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7033t0 = viewConfiguration.getScaledTouchSlop();
        this.f7037x0 = C10033d0.m18793a(viewConfiguration);
        this.f7038y0 = C10033d0.m18794b(viewConfiguration);
        this.f7035v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7036w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7002a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f7025l0.f7075a = c1118k;
        this.f7010e = new C1140a(new C1147d0(this));
        this.f7012f = new C1150f(new C1145c0(this));
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.l.m18744b(this) == 0) {
            C10029b0.l.m18754l(this, 8);
        }
        if (C10029b0.d.m18666c(this) == 0) {
            C10029b0.d.m18682s(this, 1);
        }
        this.f7003a0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1149e0(this));
        int[] iArr = C6407a.f36871a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f7016h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        int i11 = 4;
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m4170B());
            }
            Resources resources = getContext().getResources();
            new C1163n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.linguist.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.linguist.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.linguist.R.dimen.fastscroll_margin));
            i11 = 4;
            c10 = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1120m.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f6961b1);
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1120m) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = f6956W0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        C10029b0.m18657m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.linguist.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: G */
    public static RecyclerView m4160G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewM4160G = m4160G(viewGroup.getChildAt(i10));
            if (recyclerViewM4160G != null) {
                return recyclerViewM4160G;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC1109b0 m4161L(View view) {
        if (view == null) {
            return null;
        }
        return ((C1121n) view.getLayoutParams()).f7105a;
    }

    /* JADX INFO: renamed from: Z */
    private int m4162Z(int i10, float f3) {
        float width = f3 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f7019i0;
        float f10 = 0.0f;
        if (edgeEffect == null || C1298e.m4809a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7023k0;
            if (edgeEffect2 != null && C1298e.m4809a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f7023k0.onRelease();
                } else {
                    float fM4810b = C1298e.m4810b(this.f7023k0, height, 1.0f - width);
                    if (C1298e.m4809a(this.f7023k0) == 0.0f) {
                        this.f7023k0.onRelease();
                    }
                    f10 = fM4810b;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f7019i0.onRelease();
            } else {
                float f11 = -C1298e.m4810b(this.f7019i0, -height, width);
                if (C1298e.m4809a(this.f7019i0) == 0.0f) {
                    this.f7019i0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    private C10052n getScrollingChildHelper() {
        if (this.f6982M0 == null) {
            this.f6982M0 = new C10052n(this);
        }
        return this.f6982M0;
    }

    /* JADX INFO: renamed from: k */
    public static void m4167k(AbstractC1109b0 abstractC1109b0) {
        WeakReference<RecyclerView> weakReference = abstractC1109b0.f7055b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1109b0.f7054a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1109b0.f7055b = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m4168n(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && C1298e.m4809a(edgeEffect) != 0.0f) {
            int iRound = Math.round(C1298e.m4810b(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 < 0 && edgeEffect2 != null && C1298e.m4809a(edgeEffect2) != 0.0f) {
            float f3 = i11;
            int iRound2 = Math.round(C1298e.m4810b(edgeEffect2, (i10 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
            if (iRound2 != i10) {
                edgeEffect2.finish();
            }
            i10 -= iRound2;
        }
        return i10;
    }

    /* JADX INFO: renamed from: A */
    public final void m4169A() {
        if (this.f7019i0 != null) {
            return;
        }
        ((C1132y) this.f7015g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7019i0 = edgeEffect;
        if (this.f7016h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m4170B() {
        return " " + super.toString() + ", adapter:" + this.f6971H + ", layout:" + this.f6973I + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: C */
    public final void m4171C(C1131x c1131x) {
        if (getScrollState() != 2) {
            c1131x.getClass();
            return;
        }
        OverScroller overScroller = this.f6964A0.f7047c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1131x.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: D */
    public final View m4172D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4173E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<InterfaceC1124q> arrayList = this.f6981M;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC1124q interfaceC1124q = arrayList.get(i10);
            if (interfaceC1124q.mo4337c(this, motionEvent) && action != 3) {
                this.f6983N = interfaceC1124q;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m4174F(int[] iArr) {
        int iM4459e = this.f7012f.m4459e();
        if (iM4459e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iM4459e; i12++) {
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4458d(i12));
            if (!abstractC1109b0M4161L.m4254q()) {
                int iM4242e = abstractC1109b0M4161L.m4242e();
                if (iM4242e < i10) {
                    i10 = iM4242e;
                }
                if (iM4242e > i11) {
                    i11 = iM4242e;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC1109b0 m4175H(int i10) {
        AbstractC1109b0 abstractC1109b0 = null;
        if (this.f7007c0) {
            return null;
        }
        int iM4462h = this.f7012f.m4462h();
        for (int i11 = 0; i11 < iM4462h; i11++) {
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4461g(i11));
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4248k() && m4176I(abstractC1109b0M4161L) == i10) {
                if (!this.f7012f.m4464j(abstractC1109b0M4161L.f7054a)) {
                    return abstractC1109b0M4161L;
                }
                abstractC1109b0 = abstractC1109b0M4161L;
            }
        }
        return abstractC1109b0;
    }

    /* JADX INFO: renamed from: I */
    public final int m4176I(AbstractC1109b0 abstractC1109b0) {
        int i10;
        if (((abstractC1109b0.f7063j & 524) != 0) || !abstractC1109b0.m4245h()) {
            i10 = -1;
            break;
        }
        C1140a c1140a = this.f7010e;
        i10 = abstractC1109b0.f7056c;
        ArrayList<C1140a.b> arrayList = c1140a.f7208b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1140a.b bVar = arrayList.get(i11);
            int i12 = bVar.f7213a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f7214b;
                    if (i13 <= i10) {
                        int i14 = bVar.f7216d;
                        if (i13 + i14 > i10) {
                            i10 = -1;
                            break;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f7214b;
                    if (i15 == i10) {
                        i10 = bVar.f7216d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f7216d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f7214b <= i10) {
                i10 += bVar.f7216d;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: J */
    public final long m4177J(AbstractC1109b0 abstractC1109b0) {
        return this.f6971H.f7041b ? abstractC1109b0.f7058e : abstractC1109b0.f7056c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public final AbstractC1109b0 m4178K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4161L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: M */
    public final Rect m4179M(View view) {
        C1121n c1121n = (C1121n) view.getLayoutParams();
        boolean z10 = c1121n.f7107c;
        Rect rect = c1121n.f7106b;
        if (!z10) {
            return rect;
        }
        C1131x c1131x = this.f6967D0;
        if (!c1131x.f7146g || (!c1121n.m4334b() && !c1121n.f7105a.m4246i())) {
            rect.set(0, 0, 0, 0);
            ArrayList<AbstractC1119l> arrayList = this.f6979L;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Rect rect2 = this.f7020j;
                rect2.set(0, 0, 0, 0);
                arrayList.get(i10).mo4282f(rect2, view, this, c1131x);
                rect.left += rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            c1121n.f7107c = false;
            return rect;
        }
        return rect;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m4180N() {
        return this.f7011e0 > 0;
    }

    /* JADX INFO: renamed from: O */
    public final void m4181O(int i10) {
        if (this.f6973I == null) {
            return;
        }
        setScrollState(2);
        this.f6973I.mo4153u0(i10);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: P */
    public final void m4182P() {
        int iM4462h = this.f7012f.m4462h();
        for (int i10 = 0; i10 < iM4462h; i10++) {
            ((C1121n) this.f7012f.m4461g(i10).getLayoutParams()).f7107c = true;
        }
        ArrayList<AbstractC1109b0> arrayList = this.f7006c.f7118c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1121n c1121n = (C1121n) arrayList.get(i11).f7054a.getLayoutParams();
            if (c1121n != null) {
                c1121n.f7107c = true;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4183Q(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iM4462h = this.f7012f.m4462h();
        for (int i13 = 0; i13 < iM4462h; i13++) {
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4461g(i13));
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4254q()) {
                int i14 = abstractC1109b0M4161L.f7056c;
                C1131x c1131x = this.f6967D0;
                if (i14 >= i12) {
                    abstractC1109b0M4161L.m4251n(-i11, z10);
                    c1131x.f7145f = true;
                } else if (i14 >= i10) {
                    abstractC1109b0M4161L.m4239b(8);
                    abstractC1109b0M4161L.m4251n(-i11, z10);
                    abstractC1109b0M4161L.f7056c = i10 - 1;
                    c1131x.f7145f = true;
                }
            }
        }
        C1127t c1127t = this.f7006c;
        ArrayList<AbstractC1109b0> arrayList = c1127t.f7118c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC1109b0 abstractC1109b0 = arrayList.get(size);
            if (abstractC1109b0 != null) {
                int i15 = abstractC1109b0.f7056c;
                if (i15 >= i12) {
                    abstractC1109b0.m4251n(-i11, z10);
                } else if (i15 >= i10) {
                    abstractC1109b0.m4239b(8);
                    c1127t.m4349h(size);
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m4184R() {
        this.f7011e0++;
    }

    /* JADX INFO: renamed from: S */
    public final void m4185S(boolean z10) {
        int i10;
        int i11 = this.f7011e0 - 1;
        this.f7011e0 = i11;
        if (i11 < 1) {
            this.f7011e0 = 0;
            if (z10) {
                int i12 = this.f6999V;
                this.f6999V = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.f7003a0;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                        accessibilityEventObtain.setEventType(2048);
                        C10280b.m19253b(accessibilityEventObtain, i12);
                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    }
                }
                ArrayList arrayList = this.f6990Q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1109b0 abstractC1109b0 = (AbstractC1109b0) arrayList.get(size);
                    if (abstractC1109b0.f7054a.getParent() == this && !abstractC1109b0.m4254q() && (i10 = abstractC1109b0.f7070q) != -1) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        C10029b0.d.m18682s(abstractC1109b0.f7054a, i10);
                        abstractC1109b0.f7070q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m4186T(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7027n0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f7027n0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f7031r0 = x10;
            this.f7029p0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f7032s0 = y10;
            this.f7030q0 = y10;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m4187U() {
        if (this.f6976J0 || !this.f6985O) {
            return;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18676m(this, this.f6992R0);
        this.f6976J0 = true;
    }

    /* JADX INFO: renamed from: V */
    public final void m4188V() {
        boolean z10;
        boolean z11 = false;
        if (this.f7007c0) {
            C1140a c1140a = this.f7010e;
            c1140a.m4422l(c1140a.f7208b);
            c1140a.m4422l(c1140a.f7209c);
            c1140a.f7212f = 0;
            if (this.f7009d0) {
                this.f6973I.mo4080c0();
            }
        }
        if (this.f7025l0 != null && this.f6973I.mo4071G0()) {
            this.f7010e.m4420j();
        } else {
            this.f7010e.m4413c();
        }
        boolean z12 = this.f6970G0 || this.f6972H0;
        boolean z13 = this.f6989Q && this.f7025l0 != null && ((z10 = this.f7007c0) || z12 || this.f6973I.f7089f) && (!z10 || this.f6971H.f7041b);
        C1131x c1131x = this.f6967D0;
        c1131x.f7149j = z13;
        if (z13 && z12 && !this.f7007c0) {
            if (this.f7025l0 != null && this.f6973I.mo4071G0()) {
                z11 = true;
            }
        }
        c1131x.f7150k = z11;
    }

    /* JADX INFO: renamed from: W */
    public final void m4189W(boolean z10) {
        this.f7009d0 = z10 | this.f7009d0;
        this.f7007c0 = true;
        int iM4462h = this.f7012f.m4462h();
        for (int i10 = 0; i10 < iM4462h; i10++) {
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4461g(i10));
            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4254q()) {
                abstractC1109b0M4161L.m4239b(6);
            }
        }
        m4182P();
        C1127t c1127t = this.f7006c;
        ArrayList<AbstractC1109b0> arrayList = c1127t.f7118c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1109b0 abstractC1109b0 = arrayList.get(i11);
            if (abstractC1109b0 != null) {
                abstractC1109b0.m4239b(6);
                abstractC1109b0.m4238a(null);
            }
        }
        Adapter adapter = RecyclerView.this.f6971H;
        if (adapter == null || !adapter.f7041b) {
            c1127t.m4348g();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4190X(AbstractC1109b0 abstractC1109b0, AbstractC1117j.c cVar) {
        boolean z10 = false;
        int i10 = (abstractC1109b0.f7063j & (-8193)) | 0;
        abstractC1109b0.f7063j = i10;
        boolean z11 = this.f6967D0.f7147h;
        C1159j0 c1159j0 = this.f7014g;
        if (z11) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !abstractC1109b0.m4248k() && !abstractC1109b0.m4254q()) {
                c1159j0.f7315b.m16512g(m4177J(abstractC1109b0), abstractC1109b0);
            }
        }
        C8452h<AbstractC1109b0, C1159j0.a> c8452h = c1159j0.f7314a;
        C1159j0.a orDefault = c8452h.getOrDefault(abstractC1109b0, null);
        if (orDefault == null) {
            orDefault = C1159j0.a.m4495a();
            c8452h.put(abstractC1109b0, orDefault);
        }
        orDefault.f7318b = cVar;
        orDefault.f7317a |= 4;
    }

    /* JADX INFO: renamed from: Y */
    public final int m4191Y(int i10, float f3) {
        float height = f3 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f7017h0;
        float f10 = 0.0f;
        if (edgeEffect == null || C1298e.m4809a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7021j0;
            if (edgeEffect2 != null && C1298e.m4809a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f7021j0.onRelease();
                } else {
                    float fM4810b = C1298e.m4810b(this.f7021j0, width, height);
                    if (C1298e.m4809a(this.f7021j0) == 0.0f) {
                        this.f7021j0.onRelease();
                    }
                    f10 = fM4810b;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f7017h0.onRelease();
            } else {
                float f11 = -C1298e.m4810b(this.f7017h0, -width, 1.0f - height);
                if (C1298e.m4809a(this.f7017h0) == 0.0f) {
                    this.f7017h0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4192a0(AbstractC1119l abstractC1119l) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            abstractC1120m.mo4134d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC1119l> arrayList = this.f6979L;
        arrayList.remove(abstractC1119l);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m4182P();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            abstractC1120m.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b0 */
    public final void m4193b0() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            throw new IndexOutOfBoundsException(C0166e.m761g("0 is an invalid index for size ", itemDecorationCount));
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (itemDecorationCount2 <= 0) {
            throw new IndexOutOfBoundsException(C0166e.m761g("0 is an invalid index for size ", itemDecorationCount2));
        }
        m4192a0(this.f6979L.get(0));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4194c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f7020j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1121n) {
            C1121n c1121n = (C1121n) layoutParams;
            if (!c1121n.f7107c) {
                int i10 = rect.left;
                Rect rect2 = c1121n.f7106b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f6973I.mo4321r0(this, view, this.f7020j, !this.f6989Q, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1121n) && this.f6973I.mo4086h((C1121n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            return 0;
        }
        return abstractC1120m.mo4137f() ? this.f6973I.mo4148l(this.f6967D0) : 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1120m abstractC1120m = this.f6973I;
        int iMo4089m = 0;
        if (abstractC1120m == null) {
            return 0;
        }
        if (abstractC1120m.mo4137f()) {
            iMo4089m = this.f6973I.mo4089m(this.f6967D0);
        }
        return iMo4089m;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null && abstractC1120m.mo4137f()) {
            return this.f6973I.mo4090n(this.f6967D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            return 0;
        }
        return abstractC1120m.mo4139g() ? this.f6973I.mo4151o(this.f6967D0) : 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null && abstractC1120m.mo4139g()) {
            return this.f6973I.mo4093p(this.f6967D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null && abstractC1120m.mo4139g()) {
            return this.f6973I.mo4095q(this.f6967D0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4195d0() {
        VelocityTracker velocityTracker = this.f7028o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m4212n0(0);
        EdgeEffect edgeEffect = this.f7017h0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f7017h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f7019i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f7019i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7021j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f7021j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7023k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f7023k0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return getScrollingChildHelper().m18841a(f3, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return getScrollingChildHelper().m18842b(f3, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m18843c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m18845e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList<AbstractC1119l> arrayList = this.f6979L;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo4284h(canvas, this, this.f6967D0);
        }
        EdgeEffect edgeEffect = this.f7017h0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f7016h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f7017h0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f7019i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f7016h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f7019i0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f7021j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f7016h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f7021j0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f7023k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f7016h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f7023k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if (z10 || this.f7025l0 == null || arrayList.size() <= 0 || !this.f7025l0.mo4278g()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f A[DONT_INVERT, PHI: r4
      0x010f: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:32:0x00f6, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX INFO: renamed from: e0 */
    public final boolean m4196e0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        m4213o();
        Adapter adapter = this.f6971H;
        int[] iArr = this.f6988P0;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m4198f0(i10, i11, iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            i14 = i17;
            i13 = i18;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f6979L.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.f6988P0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int i19 = i13;
        m4221v(i14, i13, i15, i16, this.f6984N0, i12, iArr2);
        int i20 = iArr[0];
        int i21 = i15 - i20;
        int i22 = iArr[1];
        int i23 = i16 - i22;
        boolean z11 = (i20 == 0 && i22 == 0) ? false : true;
        int i24 = this.f7031r0;
        int[] iArr3 = this.f6984N0;
        int i25 = iArr3[0];
        this.f7031r0 = i24 - i25;
        int i26 = this.f7032s0;
        int i27 = iArr3[1];
        this.f7032s0 = i26 - i27;
        int[] iArr4 = this.f6986O0;
        iArr4[0] = iArr4[0] + i25;
        iArr4[1] = iArr4[1] + i27;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C5212l.m11152Y(motionEvent, 8194)) {
                float x10 = motionEvent.getX();
                float f3 = i21;
                float y10 = motionEvent.getY();
                float f10 = i23;
                if (f3 < 0.0f) {
                    m4224y();
                    C1298e.m4810b(this.f7017h0, (-f3) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    if (f3 > 0.0f) {
                        m4225z();
                        C1298e.m4810b(this.f7021j0, f3 / getWidth(), y10 / getHeight());
                    } else {
                        z10 = false;
                    }
                    if (f10 < 0.0f) {
                        m4169A();
                        C1298e.m4810b(this.f7019i0, (-f10) / getHeight(), x10 / getWidth());
                    } else if (f10 > 0.0f) {
                        m4223x();
                        C1298e.m4810b(this.f7023k0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                    } else if (z10 || f3 != 0.0f || f10 != 0.0f) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        C10029b0.d.m18674k(this);
                    }
                    z10 = true;
                    if (z10) {
                        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                        C10029b0.d.m18674k(this);
                    } else {
                        WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                        C10029b0.d.m18674k(this);
                    }
                }
                z10 = true;
                if (f10 < 0.0f) {
                    m4169A();
                    C1298e.m4810b(this.f7019i0, (-f10) / getHeight(), x10 / getWidth());
                } else if (f10 > 0.0f) {
                    m4223x();
                    C1298e.m4810b(this.f7023k0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                } else if (z10) {
                    WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                } else {
                    WeakHashMap<View, C10049l0> weakHashMap5 = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                }
                z10 = true;
                if (z10) {
                    WeakHashMap<View, C10049l0> weakHashMap6 = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                } else {
                    WeakHashMap<View, C10049l0> weakHashMap7 = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                }
            }
            m4210m(i10, i11);
        }
        if (i14 != 0 || i19 != 0) {
            m4222w(i14, i19);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i14 == 0 && i19 == 0) ? false : true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m4197f(AbstractC1109b0 abstractC1109b0) {
        View view = abstractC1109b0.f7054a;
        boolean z10 = view.getParent() == this;
        this.f7006c.m4354m(m4178K(view));
        if (abstractC1109b0.m4250m()) {
            this.f7012f.m4456b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f7012f.m4455a(view, -1, true);
            return;
        }
        C1150f c1150f = this.f7012f;
        int iIndexOfChild = ((C1145c0) c1150f.f7254a).f7226a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1150f.f7255b.m4473h(iIndexOfChild);
            c1150f.m4463i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4198f0(int i10, int i11, int[] iArr) {
        AbstractC1109b0 abstractC1109b0;
        m4209l0();
        m4184R();
        int i12 = C9191j.f47731a;
        C9191j.a.m17531a("RV Scroll");
        C1131x c1131x = this.f6967D0;
        m4171C(c1131x);
        C1127t c1127t = this.f7006c;
        int iMo4100t0 = i10 != 0 ? this.f6973I.mo4100t0(i10, c1127t, c1131x) : 0;
        int iMo4105v0 = i11 != 0 ? this.f6973I.mo4105v0(i11, c1127t, c1131x) : 0;
        C9191j.a.m17532b();
        int iM4459e = this.f7012f.m4459e();
        for (int i13 = 0; i13 < iM4459e; i13++) {
            View viewM4458d = this.f7012f.m4458d(i13);
            AbstractC1109b0 abstractC1109b0M4178K = m4178K(viewM4458d);
            if (abstractC1109b0M4178K != null && (abstractC1109b0 = abstractC1109b0M4178K.f7062i) != null) {
                int left = viewM4458d.getLeft();
                int top = viewM4458d.getTop();
                View view = abstractC1109b0.f7054a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m4185S(true);
        m4211m0(false);
        if (iArr != null) {
            iArr[0] = iMo4100t0;
            iArr[1] = iMo4105v0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        View viewMo4075W;
        int i11;
        byte b10;
        boolean z10;
        this.f6973I.getClass();
        boolean z11 = true;
        boolean z12 = (this.f6971H == null || this.f6973I == null || m4180N() || this.f6995T) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C1131x c1131x = this.f6967D0;
        C1127t c1127t = this.f7006c;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.f6973I.mo4139g()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f6973I.mo4137f()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f6973I.m4299D() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                m4213o();
                if (m4172D(view) == null) {
                    return null;
                }
                m4209l0();
                this.f6973I.mo4075W(view, i10, c1127t, c1131x);
                m4211m0(false);
            }
            viewMo4075W = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z12) {
                m4213o();
                if (m4172D(view) == null) {
                    return null;
                }
                m4209l0();
                viewMo4075W = this.f6973I.mo4075W(view, i10, c1127t, c1131x);
                m4211m0(false);
            } else {
                viewMo4075W = viewFindNextFocus;
            }
        }
        if (viewMo4075W != null && !viewMo4075W.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            m4194c0(viewMo4075W, null);
            return view;
        }
        if (viewMo4075W == null || viewMo4075W == this || viewMo4075W == view) {
            z11 = false;
        } else if (m4172D(viewMo4075W) == null) {
            z11 = false;
        } else if (view != null && m4172D(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f7020j;
            rect.set(0, 0, width, height);
            int width2 = viewMo4075W.getWidth();
            int height2 = viewMo4075W.getHeight();
            Rect rect2 = this.f7022k;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo4075W, rect2);
            int i12 = this.f6973I.m4299D() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b10 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i10 + m4170B());
                                }
                                if (b10 <= 0) {
                                    z11 = false;
                                }
                            } else if (i11 <= 0) {
                                z11 = false;
                            }
                        } else if (b10 >= 0) {
                            z11 = false;
                        }
                    } else if (i11 >= 0) {
                        z11 = false;
                    }
                } else if (b10 <= 0 && (b10 != 0 || i11 * i12 <= 0)) {
                    z11 = false;
                }
            } else if (b10 >= 0 && (b10 != 0 || i11 * i12 >= 0)) {
                z11 = false;
            }
        }
        return z11 ? viewMo4075W : super.focusSearch(view, i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m4199g(AbstractC1119l abstractC1119l) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            abstractC1120m.mo4134d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC1119l> arrayList = this.f6979L;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1119l);
        m4182P();
        requestLayout();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4200g0(int i10) {
        AbstractC1130w abstractC1130w;
        if (this.f6995T) {
            return;
        }
        setScrollState(0);
        RunnableC1107a0 runnableC1107a0 = this.f6964A0;
        RecyclerView.this.removeCallbacks(runnableC1107a0);
        runnableC1107a0.f7047c.abortAnimation();
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null && (abstractC1130w = abstractC1120m.f7088e) != null) {
            abstractC1130w.m4361d();
        }
        AbstractC1120m abstractC1120m2 = this.f6973I;
        if (abstractC1120m2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1120m2.mo4153u0(i10);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            return abstractC1120m.mo4099t();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4170B());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            return abstractC1120m.mo4102u(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4170B());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            return abstractC1120m.mo4104v(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4170B());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f6971H;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            return super.getBaseline();
        }
        abstractC1120m.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f7016h;
    }

    public C1149e0 getCompatAccessibilityDelegate() {
        return this.f6978K0;
    }

    public C1116i getEdgeEffectFactory() {
        return this.f7015g0;
    }

    public AbstractC1117j getItemAnimator() {
        return this.f7025l0;
    }

    public int getItemDecorationCount() {
        return this.f6979L.size();
    }

    public AbstractC1120m getLayoutManager() {
        return this.f6973I;
    }

    public int getMaxFlingVelocity() {
        return this.f7036w0;
    }

    public int getMinFlingVelocity() {
        return this.f7035v0;
    }

    long getNanoTime() {
        if (f6960a1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1123p getOnFlingListener() {
        return this.f7034u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f7039z0;
    }

    public C1126s getRecycledViewPool() {
        return this.f7006c.m4344c();
    }

    public int getScrollState() {
        return this.f7026m0;
    }

    /* JADX INFO: renamed from: h */
    public final void m4201h(InterfaceC1122o interfaceC1122o) {
        if (this.f7005b0 == null) {
            this.f7005b0 = new ArrayList();
        }
        this.f7005b0.add(interfaceC1122o);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4202h0(Adapter<?> adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.f6971H;
        C1129v c1129v = this.f7004b;
        if (adapter2 != null) {
            adapter2.f7040a.unregisterObserver(c1129v);
            this.f6971H.mo4230k(this);
        }
        C1127t c1127t = this.f7006c;
        if (!z10 || z11) {
            AbstractC1117j abstractC1117j = this.f7025l0;
            if (abstractC1117j != null) {
                abstractC1117j.mo4277f();
            }
            AbstractC1120m abstractC1120m = this.f6973I;
            if (abstractC1120m != null) {
                abstractC1120m.m4315m0(c1127t);
                this.f6973I.m4316n0(c1127t);
            }
            c1127t.f7116a.clear();
            c1127t.m4348g();
        }
        C1140a c1140a = this.f7010e;
        c1140a.m4422l(c1140a.f7208b);
        c1140a.m4422l(c1140a.f7209c);
        int i10 = 0;
        c1140a.f7212f = 0;
        Adapter<?> adapter3 = this.f6971H;
        this.f6971H = adapter;
        if (adapter != null) {
            adapter.m4234o(c1129v);
            adapter.mo4229h(this);
        }
        AbstractC1120m abstractC1120m2 = this.f6973I;
        if (abstractC1120m2 != null) {
            abstractC1120m2.mo4309U();
        }
        Adapter adapter4 = this.f6971H;
        c1127t.f7116a.clear();
        c1127t.m4348g();
        c1127t.m4347f(adapter3, true);
        C1126s c1126sM4344c = c1127t.m4344c();
        if (adapter3 != null) {
            c1126sM4344c.f7110b--;
        }
        if (!z10 && c1126sM4344c.f7110b == 0) {
            while (true) {
                SparseArray<C1126s.a> sparseArray = c1126sM4344c.f7109a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                C1126s.a aVarValueAt = sparseArray.valueAt(i10);
                Iterator<AbstractC1109b0> it = aVarValueAt.f7112a.iterator();
                while (it.hasNext()) {
                    C8573r0.m16673G(it.next().f7054a);
                }
                aVarValueAt.f7112a.clear();
                i10++;
            }
        }
        if (adapter4 != null) {
            c1126sM4344c.f7110b++;
        } else {
            c1126sM4344c.getClass();
        }
        c1127t.m4346e();
        this.f6967D0.f7145f = true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m18846f(0) != null;
    }

    /* JADX INFO: renamed from: i */
    public final void m4203i(AbstractC1125r abstractC1125r) {
        if (this.f6969F0 == null) {
            this.f6969F0 = new ArrayList();
        }
        this.f6969F0.add(abstractC1125r);
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m4204i0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fM4809a = C1298e.m4809a(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.f7002a * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d10 = f6957X0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f3))) < fM4809a;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f6985O;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f6995T;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f51045d;
    }

    /* JADX INFO: renamed from: j */
    public final void m4205j(String str) {
        if (m4180N()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m4170B());
        }
        if (this.f7013f0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m4170B()));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4206j0(int i10, int i11, boolean z10) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6995T) {
            return;
        }
        if (!abstractC1120m.mo4137f()) {
            i10 = 0;
        }
        if (!this.f6973I.mo4139g()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().m18847g(i12, 1);
        }
        this.f6964A0.m4237c(i10, i11, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m4207k0(int i10) {
        if (this.f6995T) {
            return;
        }
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1120m.mo4110E0(this, i10);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4208l() {
        int iM4462h = this.f7012f.m4462h();
        for (int i10 = 0; i10 < iM4462h; i10++) {
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4461g(i10));
            if (!abstractC1109b0M4161L.m4254q()) {
                abstractC1109b0M4161L.f7057d = -1;
                abstractC1109b0M4161L.f7060g = -1;
            }
        }
        C1127t c1127t = this.f7006c;
        ArrayList<AbstractC1109b0> arrayList = c1127t.f7118c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1109b0 abstractC1109b0 = arrayList.get(i11);
            abstractC1109b0.f7057d = -1;
            abstractC1109b0.f7060g = -1;
        }
        ArrayList<AbstractC1109b0> arrayList2 = c1127t.f7116a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AbstractC1109b0 abstractC1109b1 = arrayList2.get(i12);
            abstractC1109b1.f7057d = -1;
            abstractC1109b1.f7060g = -1;
        }
        ArrayList<AbstractC1109b0> arrayList3 = c1127t.f7117b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC1109b0 abstractC1109b2 = c1127t.f7117b.get(i13);
                abstractC1109b2.f7057d = -1;
                abstractC1109b2.f7060g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4209l0() {
        int i10 = this.f6991R + 1;
        this.f6991R = i10;
        if (i10 == 1 && !this.f6995T) {
            this.f6993S = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4210m(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7017h0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f7017h0.onRelease();
            zIsFinished = this.f7017h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f7021j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f7021j0.onRelease();
            zIsFinished |= this.f7021j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7019i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f7019i0.onRelease();
            zIsFinished |= this.f7019i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7023k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f7023k0.onRelease();
            zIsFinished |= this.f7023k0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4211m0(boolean z10) {
        if (this.f6991R < 1) {
            this.f6991R = 1;
        }
        if (!z10 && !this.f6995T) {
            this.f6993S = false;
        }
        if (this.f6991R == 1) {
            if (z10 && this.f6993S && !this.f6995T && this.f6973I != null && this.f6971H != null) {
                m4217r();
            }
            if (!this.f6995T) {
                this.f6993S = false;
            }
        }
        this.f6991R--;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m4212n0(int i10) {
        getScrollingChildHelper().m18848h(i10);
    }

    /* JADX INFO: renamed from: o */
    public final void m4213o() {
        if (!this.f6989Q || this.f7007c0) {
            int i10 = C9191j.f47731a;
            C9191j.a.m17531a("RV FullInvalidate");
            m4217r();
            C9191j.a.m17532b();
            return;
        }
        if (this.f7010e.m4417g()) {
            C1140a c1140a = this.f7010e;
            int i11 = c1140a.f7212f;
            boolean z10 = false;
            if ((4 & i11) != 0) {
                if (!((i11 & 11) != 0)) {
                    int i12 = C9191j.f47731a;
                    C9191j.a.m17531a("RV PartialInvalidate");
                    m4209l0();
                    m4184R();
                    this.f7010e.m4420j();
                    if (!this.f6993S) {
                        int iM4459e = this.f7012f.m4459e();
                        for (int i13 = 0; i13 < iM4459e; i13++) {
                            AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4458d(i13));
                            if (abstractC1109b0M4161L != null && !abstractC1109b0M4161L.m4254q()) {
                                if ((abstractC1109b0M4161L.f7063j & 2) != 0) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        if (z10) {
                            m4217r();
                        } else {
                            this.f7010e.m4412b();
                        }
                    }
                    m4211m0(true);
                    m4185S(true);
                    C9191j.a.m17532b();
                    return;
                }
            }
            if (c1140a.m4417g()) {
                int i14 = C9191j.f47731a;
                C9191j.a.m17531a("RV FullInvalidate");
                m4217r();
                C9191j.a.m17532b();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4214o0(AbstractC1170u abstractC1170u, boolean z10) {
        setLayoutFrozen(false);
        m4202h0(abstractC1170u, true, z10);
        m4189W(true);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f7011e0 = 0;
        this.f6985O = true;
        this.f6989Q = this.f6989Q && !isLayoutRequested();
        this.f7006c.m4346e();
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null) {
            abstractC1120m.f7090g = true;
        }
        this.f6976J0 = false;
        if (f6960a1) {
            ThreadLocal<RunnableC1164o> threadLocal = RunnableC1164o.f7386e;
            RunnableC1164o runnableC1164o = threadLocal.get();
            this.f6965B0 = runnableC1164o;
            if (runnableC1164o == null) {
                this.f6965B0 = new RunnableC1164o();
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                Display displayM18684b = C10029b0.e.m18684b(this);
                if (isInEditMode() || displayM18684b == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayM18684b.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1164o runnableC1164o2 = this.f6965B0;
                runnableC1164o2.f7390c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1164o2);
            }
            this.f6965B0.f7388a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1127t c1127t;
        RunnableC1164o runnableC1164o;
        AbstractC1130w abstractC1130w;
        super.onDetachedFromWindow();
        AbstractC1117j abstractC1117j = this.f7025l0;
        if (abstractC1117j != null) {
            abstractC1117j.mo4277f();
        }
        setScrollState(0);
        RunnableC1107a0 runnableC1107a0 = this.f6964A0;
        RecyclerView.this.removeCallbacks(runnableC1107a0);
        runnableC1107a0.f7047c.abortAnimation();
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m != null && (abstractC1130w = abstractC1120m.f7088e) != null) {
            abstractC1130w.m4361d();
        }
        this.f6985O = false;
        AbstractC1120m abstractC1120m2 = this.f6973I;
        if (abstractC1120m2 != null) {
            abstractC1120m2.f7090g = false;
            abstractC1120m2.mo4125V(this);
        }
        this.f6990Q0.clear();
        removeCallbacks(this.f6992R0);
        this.f7014g.getClass();
        while (C1159j0.a.f7316d.mo11465b() != null) {
        }
        int i10 = 0;
        while (true) {
            c1127t = this.f7006c;
            ArrayList<AbstractC1109b0> arrayList = c1127t.f7118c;
            if (i10 >= arrayList.size()) {
                break;
            }
            C8573r0.m16673G(arrayList.get(i10).f7054a);
            i10++;
        }
        c1127t.m4347f(RecyclerView.this.f6971H, false);
        C10041h0 c10041h0 = new C10041h0(this);
        while (c10041h0.hasNext()) {
            ArrayList<InterfaceC5041a> arrayList2 = C8573r0.m16756s0((View) c10041h0.next()).f32873a;
            for (int iM17249o = C9000b.m17249o(arrayList2); -1 < iM17249o; iM17249o--) {
                arrayList2.get(iM17249o).mo2423a();
            }
        }
        if (f6960a1 && (runnableC1164o = this.f6965B0) != null) {
            runnableC1164o.f7388a.remove(this);
            this.f6965B0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<AbstractC1119l> arrayList = this.f6979L;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo4283g(canvas, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float axisValue;
        if (this.f6973I != null && !this.f6995T && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f6973I.mo4139g() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f6973I.mo4137f() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f6973I.mo4139g()) {
                    f3 = -axisValue;
                } else if (this.f6973I.mo4137f()) {
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f3 = 0.0f;
                axisValue = 0.0f;
            }
            if (f3 != 0.0f || axisValue != 0.0f) {
                int i10 = (int) (axisValue * this.f7037x0);
                int i11 = (int) (f3 * this.f7038y0);
                AbstractC1120m abstractC1120m = this.f6973I;
                if (abstractC1120m == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f6995T) {
                    int[] iArr = this.f6988P0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo4137f = abstractC1120m.mo4137f();
                    boolean zMo4139g = this.f6973I.mo4139g();
                    int i12 = zMo4139g ? (zMo4137f ? 1 : 0) | 2 : zMo4137f ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x10 = motionEvent.getX();
                    int iM4191Y = i10 - m4191Y(i10, y10);
                    int iM4162Z = i11 - m4162Z(i11, x10);
                    getScrollingChildHelper().m18847g(i12, 1);
                    if (m4220u(zMo4137f ? iM4191Y : 0, zMo4139g ? iM4162Z : 0, 1, this.f6988P0, this.f6984N0)) {
                        iM4191Y -= iArr[0];
                        iM4162Z -= iArr[1];
                    }
                    m4196e0(zMo4137f ? iM4191Y : 0, zMo4139g ? iM4162Z : 0, motionEvent, 1);
                    RunnableC1164o runnableC1164o = this.f6965B0;
                    if (runnableC1164o != null && (iM4191Y != 0 || iM4162Z != 0)) {
                        runnableC1164o.m4503a(this, iM4191Y, iM4162Z);
                    }
                    m4212n0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.f6995T) {
            return false;
        }
        this.f6983N = null;
        if (m4173E(motionEvent)) {
            m4195d0();
            setScrollState(0);
            return true;
        }
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            return false;
        }
        boolean zMo4137f = abstractC1120m.mo4137f();
        boolean zMo4139g = this.f6973I.mo4139g();
        if (this.f7028o0 == null) {
            this.f7028o0 = VelocityTracker.obtain();
        }
        this.f7028o0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f7028o0.clear();
                m4212n0(0);
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7027n0);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7027n0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                if (this.f7026m0 != 1) {
                    int i10 = x10 - this.f7029p0;
                    int i11 = y10 - this.f7030q0;
                    if (!zMo4137f || Math.abs(i10) <= this.f7033t0) {
                        z11 = false;
                    } else {
                        this.f7031r0 = x10;
                        z11 = true;
                    }
                    if (zMo4139g && Math.abs(i11) > this.f7033t0) {
                        this.f7032s0 = y10;
                        z11 = true;
                    }
                    if (z11) {
                        setScrollState(1);
                    }
                }
            } else if (actionMasked == 3) {
                m4195d0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f7027n0 = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f7031r0 = x11;
                this.f7029p0 = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f7032s0 = y11;
                this.f7030q0 = y11;
            } else if (actionMasked == 6) {
                m4186T(motionEvent);
            }
            if (this.f7026m0 == 1) {
                return true;
            }
            return false;
        }
        if (this.f6997U) {
            this.f6997U = false;
        }
        this.f7027n0 = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.f7031r0 = x12;
        this.f7029p0 = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.f7032s0 = y12;
        this.f7030q0 = y12;
        EdgeEffect edgeEffect = this.f7017h0;
        if (edgeEffect == null || C1298e.m4809a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            C1298e.m4810b(this.f7017h0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f7021j0;
        boolean z12 = z10;
        if (edgeEffect2 != null && C1298e.m4809a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            z12 = z10;
            z12 = z10;
            C1298e.m4810b(this.f7021j0, 0.0f, motionEvent.getY() / getHeight());
            z12 = true;
        }
        z12 = z10;
        z12 = z10;
        z12 = z10;
        EdgeEffect edgeEffect3 = this.f7019i0;
        boolean z13 = z12;
        if (edgeEffect3 != null && C1298e.m4809a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            z13 = z12;
            z13 = z12;
            C1298e.m4810b(this.f7019i0, 0.0f, motionEvent.getX() / getWidth());
            z13 = true;
        }
        z13 = z12;
        z13 = z12;
        z13 = z12;
        EdgeEffect edgeEffect4 = this.f7023k0;
        boolean z14 = z13;
        if (edgeEffect4 != null && C1298e.m4809a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
            z14 = z13;
            z14 = z13;
            C1298e.m4810b(this.f7023k0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            z14 = true;
        }
        if (z14 || this.f7026m0 == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
            m4212n0(1);
        }
        int[] iArr = this.f6986O0;
        iArr[1] = 0;
        iArr[0] = 0;
        int i12 = zMo4137f;
        if (zMo4139g) {
            i12 = (zMo4137f ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m18847g(i12, 0);
        if (this.f7026m0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = C9191j.f47731a;
        C9191j.a.m17531a("RV OnLayout");
        m4217r();
        C9191j.a.m17532b();
        this.f6989Q = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            m4215p(i10, i11);
            return;
        }
        boolean zMo4118P = abstractC1120m.mo4118P();
        boolean z10 = false;
        C1131x c1131x = this.f6967D0;
        if (zMo4118P) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f6973I.f7085b.m4215p(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f6994S0 = z10;
            if (z10 || this.f6971H == null) {
                return;
            }
            if (c1131x.f7143d == 1) {
                m4218s();
            }
            this.f6973I.m4325x0(i10, i11);
            c1131x.f7148i = true;
            m4219t();
            this.f6973I.m4327z0(i10, i11);
            if (this.f6973I.mo4109C0()) {
                this.f6973I.m4325x0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c1131x.f7148i = true;
                m4219t();
                this.f6973I.m4327z0(i10, i11);
            }
            this.f6996T0 = getMeasuredWidth();
            this.f6998U0 = getMeasuredHeight();
            return;
        }
        if (this.f6987P) {
            this.f6973I.f7085b.m4215p(i10, i11);
            return;
        }
        if (this.f7001W) {
            m4209l0();
            m4184R();
            m4188V();
            m4185S(true);
            if (c1131x.f7150k) {
                c1131x.f7146g = true;
            } else {
                this.f7010e.m4413c();
                c1131x.f7146g = false;
            }
            this.f7001W = false;
            m4211m0(false);
        } else if (c1131x.f7150k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f6971H;
        if (adapter != null) {
            c1131x.f7144e = adapter.mo4226e();
        } else {
            c1131x.f7144e = 0;
        }
        m4209l0();
        this.f6973I.f7085b.m4215p(i10, i11);
        m4211m0(false);
        c1131x.f7146g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m4180N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f7008d = savedState;
        super.onRestoreInstanceState(savedState.f5635a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f7008d;
        if (savedState2 != null) {
            savedState.f7043c = savedState2.f7043c;
        } else {
            AbstractC1120m abstractC1120m = this.f6973I;
            if (abstractC1120m != null) {
                savedState.f7043c = abstractC1120m.mo4145j0();
            } else {
                savedState.f7043c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f7023k0 = null;
            this.f7019i0 = null;
            this.f7021j0 = null;
            this.f7017h0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0262  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x032f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0356  */
    /* JADX WARN: Code duplicated, block: B:278:0x043c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0444  */
    /* JADX WARN: Code duplicated, block: B:288:0x047a  */
    /* JADX WARN: Code duplicated, block: B:289:0x0482  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[PHI: r0
      0x00ff: PHI (r0v74 int) = (r0v60 int), (r0v78 int) binds: [B:51:0x00e8, B:55:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM4173E;
        RecyclerView recyclerView;
        int i10;
        boolean z10;
        MotionEvent motionEvent2;
        int iMax;
        int i11;
        boolean z11;
        RunnableC1107a0 runnableC1107a0;
        boolean z12;
        int iM4286J;
        AbstractC1175z abstractC1175zM4434g;
        PointF pointFMo4131a;
        RunnableC1107a0 runnableC1107a1;
        int i12;
        boolean z13;
        boolean z14 = false;
        if (this.f6995T || this.f6997U) {
            return false;
        }
        InterfaceC1124q interfaceC1124q = this.f6983N;
        if (interfaceC1124q == null) {
            zM4173E = motionEvent.getAction() == 0 ? false : m4173E(motionEvent);
        } else {
            interfaceC1124q.mo4336a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f6983N = null;
            }
            zM4173E = true;
        }
        if (zM4173E) {
            m4195d0();
            setScrollState(0);
            return true;
        }
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            return false;
        }
        boolean zMo4137f = abstractC1120m.mo4137f();
        boolean zMo4139g = this.f6973I.mo4139g();
        if (this.f7028o0 == null) {
            this.f7028o0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr = this.f6986O0;
        if (actionMasked == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr[0], iArr[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f7027n0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7027n0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax2 = this.f7031r0 - x10;
                    int iMax3 = this.f7032s0 - y10;
                    if (this.f7026m0 != 1) {
                        if (zMo4137f) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f7033t0) : Math.min(0, iMax2 + this.f7033t0);
                            if (iMax2 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = false;
                        }
                        if (zMo4139g) {
                            iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f7033t0) : Math.min(0, iMax3 + this.f7033t0);
                            if (iMax3 != 0) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            setScrollState(1);
                        }
                    }
                    if (this.f7026m0 == 1) {
                        int[] iArr2 = this.f6988P0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int iM4191Y = iMax2 - m4191Y(iMax2, motionEvent.getY());
                        int iM4162Z = iMax3 - m4162Z(iMax3, motionEvent.getX());
                        boolean zM4220u = m4220u(zMo4137f ? iM4191Y : 0, zMo4139g ? iM4162Z : 0, 0, this.f6988P0, this.f6984N0);
                        int[] iArr3 = this.f6984N0;
                        if (zM4220u) {
                            iM4191Y -= iArr2[0];
                            iM4162Z -= iArr2[1];
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i13 = iM4191Y;
                        int i14 = iM4162Z;
                        this.f7031r0 = x10 - iArr3[0];
                        this.f7032s0 = y10 - iArr3[1];
                        if (m4196e0(zMo4137f ? i13 : 0, zMo4139g ? i14 : 0, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC1164o runnableC1164o = this.f6965B0;
                        if (runnableC1164o != null && (i13 != 0 || i14 != 0)) {
                            runnableC1164o.m4503a(this, i13, i14);
                        }
                    }
                } else if (actionMasked == 3) {
                    m4195d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f7027n0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f7031r0 = x11;
                    this.f7029p0 = x11;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f7032s0 = y11;
                    this.f7030q0 = y11;
                } else if (actionMasked == 6) {
                    m4186T(motionEvent);
                }
                recyclerView = this;
            } else {
                this.f7028o0.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.f7028o0;
                int i15 = this.f7036w0;
                velocityTracker.computeCurrentVelocity(1000, i15);
                float f3 = zMo4137f ? -this.f7028o0.getXVelocity(this.f7027n0) : 0.0f;
                float f10 = zMo4139g ? -this.f7028o0.getYVelocity(this.f7027n0) : 0.0f;
                if (f3 == 0.0f && f10 == 0.0f) {
                    recyclerView = this;
                    i12 = 0;
                    motionEventObtain = motionEventObtain;
                } else {
                    int i16 = (int) f3;
                    int iMax4 = (int) f10;
                    AbstractC1120m abstractC1120m2 = this.f6973I;
                    if (abstractC1120m2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        if (!this.f6995T) {
                            int iMo4137f = abstractC1120m2.mo4137f();
                            boolean zMo4139g2 = this.f6973I.mo4139g();
                            int i17 = this.f7035v0;
                            if (iMo4137f == 0 || Math.abs(i16) < i17) {
                                i16 = 0;
                            }
                            if (!zMo4139g2 || Math.abs(iMax4) < i17) {
                                iMax4 = 0;
                            }
                            if (i16 != 0 || iMax4 != 0) {
                                if (i16 == 0) {
                                    iMax = 0;
                                } else {
                                    EdgeEffect edgeEffect = this.f7017h0;
                                    if (edgeEffect == null || C1298e.m4809a(edgeEffect) == 0.0f) {
                                        EdgeEffect edgeEffect2 = this.f7021j0;
                                        if (edgeEffect2 == null || C1298e.m4809a(edgeEffect2) == 0.0f) {
                                            iMax = 0;
                                        } else if (m4204i0(this.f7021j0, i16, getWidth())) {
                                            this.f7021j0.onAbsorb(i16);
                                            i16 = 0;
                                        }
                                    } else {
                                        int i18 = -i16;
                                        if (m4204i0(this.f7017h0, i18, getWidth())) {
                                            this.f7017h0.onAbsorb(i18);
                                            i16 = 0;
                                        }
                                    }
                                    iMax = i16;
                                    i16 = 0;
                                }
                                if (iMax4 == 0) {
                                    i11 = iMax4;
                                    iMax4 = 0;
                                } else {
                                    EdgeEffect edgeEffect3 = this.f7019i0;
                                    if (edgeEffect3 == null || C1298e.m4809a(edgeEffect3) == 0.0f) {
                                        EdgeEffect edgeEffect4 = this.f7023k0;
                                        if (edgeEffect4 == null || C1298e.m4809a(edgeEffect4) == 0.0f) {
                                            i11 = iMax4;
                                            iMax4 = 0;
                                        } else if (m4204i0(this.f7023k0, iMax4, getHeight())) {
                                            this.f7023k0.onAbsorb(iMax4);
                                            iMax4 = 0;
                                        }
                                    } else {
                                        int i19 = -iMax4;
                                        if (m4204i0(this.f7019i0, i19, getHeight())) {
                                            this.f7019i0.onAbsorb(i19);
                                            iMax4 = 0;
                                        }
                                    }
                                    i11 = 0;
                                }
                                RunnableC1107a0 runnableC1107a2 = this.f6964A0;
                                if (iMax != 0 || iMax4 != 0) {
                                    int i20 = -i15;
                                    iMax = Math.max(i20, Math.min(iMax, i15));
                                    iMax4 = Math.max(i20, Math.min(iMax4, i15));
                                    runnableC1107a2.m4235a(iMax, iMax4);
                                }
                                if (i16 == 0 && i11 == 0) {
                                    if (iMax != 0 || iMax4 != 0) {
                                        z11 = true;
                                    }
                                    motionEventObtain = motionEventObtain;
                                } else {
                                    float f11 = i16;
                                    float f12 = i11;
                                    if (dispatchNestedPreFling(f11, f12)) {
                                        motionEventObtain = motionEventObtain;
                                    } else {
                                        boolean z15 = iMo4137f != 0 || zMo4139g2;
                                        dispatchNestedFling(f11, f12, z15);
                                        AbstractC1123p abstractC1123p = this.f7034u0;
                                        if (abstractC1123p != null) {
                                            AbstractC1155h0 abstractC1155h0 = (AbstractC1155h0) abstractC1123p;
                                            AbstractC1120m layoutManager = abstractC1155h0.f7293a.getLayoutManager();
                                            if (layoutManager == 0 || abstractC1155h0.f7293a.getAdapter() == null) {
                                                runnableC1107a0 = runnableC1107a2;
                                                motionEventObtain = motionEventObtain;
                                            } else {
                                                int minFlingVelocity = abstractC1155h0.f7293a.getMinFlingVelocity();
                                                if (Math.abs(i11) > minFlingVelocity || Math.abs(i16) > minFlingVelocity) {
                                                    boolean z16 = layoutManager instanceof AbstractC1130w.b;
                                                    if (z16) {
                                                        C1143b0 c1143b0 = (C1143b0) abstractC1155h0;
                                                        C1141a0 c1141a0 = !z16 ? null : new C1141a0(c1143b0, c1143b0.f7293a.getContext());
                                                        if (c1141a0 == null) {
                                                            runnableC1107a0 = runnableC1107a2;
                                                            motionEventObtain = motionEventObtain;
                                                        } else {
                                                            int iM4298C = layoutManager.m4298C();
                                                            if (iM4298C != 0) {
                                                                if (layoutManager.mo4139g()) {
                                                                    abstractC1175zM4434g = c1143b0.m4435h(layoutManager);
                                                                } else {
                                                                    abstractC1175zM4434g = layoutManager.mo4137f() ? c1143b0.m4434g(layoutManager) : null;
                                                                }
                                                                if (abstractC1175zM4434g == null) {
                                                                    runnableC1107a0 = runnableC1107a2;
                                                                    motionEventObtain = motionEventObtain;
                                                                } else {
                                                                    int iM4326y = layoutManager.m4326y();
                                                                    motionEventObtain = motionEventObtain;
                                                                    int i21 = Integer.MIN_VALUE;
                                                                    int i22 = Integer.MAX_VALUE;
                                                                    int i23 = 0;
                                                                    View view = null;
                                                                    View view2 = null;
                                                                    while (i23 < iM4326y) {
                                                                        int i24 = iM4326y;
                                                                        View viewM4324x = layoutManager.m4324x(i23);
                                                                        if (viewM4324x == null) {
                                                                            runnableC1107a1 = runnableC1107a2;
                                                                        } else {
                                                                            runnableC1107a1 = runnableC1107a2;
                                                                            int iM4430e = C1143b0.m4430e(viewM4324x, abstractC1175zM4434g);
                                                                            if (iM4430e <= 0 && iM4430e > i21) {
                                                                                view2 = viewM4324x;
                                                                                i21 = iM4430e;
                                                                            }
                                                                            if (iM4430e >= 0 && iM4430e < i22) {
                                                                                view = viewM4324x;
                                                                                i22 = iM4430e;
                                                                            }
                                                                        }
                                                                        i23++;
                                                                        iM4326y = i24;
                                                                        runnableC1107a2 = runnableC1107a1;
                                                                    }
                                                                    runnableC1107a0 = runnableC1107a2;
                                                                    boolean z17 = !layoutManager.mo4137f() ? i11 <= 0 : i16 <= 0;
                                                                    if (z17 && view != null) {
                                                                        iM4286J = AbstractC1120m.m4286J(view);
                                                                    } else if (z17 || view2 == null) {
                                                                        if (z17) {
                                                                            view = view2;
                                                                        }
                                                                        if (view != null) {
                                                                            iM4286J = ((z16 && (pointFMo4131a = ((AbstractC1130w.b) layoutManager).mo4131a(layoutManager.m4298C() - 1)) != null && ((pointFMo4131a.x > 0.0f ? 1 : (pointFMo4131a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo4131a.y > 0.0f ? 1 : (pointFMo4131a.y == 0.0f ? 0 : -1)) < 0)) == z17 ? -1 : 1) + AbstractC1120m.m4286J(view);
                                                                            if (iM4286J < 0 || iM4286J >= iM4298C) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        iM4286J = AbstractC1120m.m4286J(view2);
                                                                    }
                                                                }
                                                                iM4286J = -1;
                                                            } else {
                                                                runnableC1107a0 = runnableC1107a2;
                                                                motionEventObtain = motionEventObtain;
                                                                iM4286J = -1;
                                                            }
                                                            if (iM4286J != -1) {
                                                                c1141a0.f7125a = iM4286J;
                                                                layoutManager.m4302F0(c1141a0);
                                                                z12 = true;
                                                            }
                                                        }
                                                        z12 = false;
                                                    } else {
                                                        runnableC1107a0 = runnableC1107a2;
                                                        motionEventObtain = motionEventObtain;
                                                        z12 = false;
                                                    }
                                                    if (z12) {
                                                        z14 = true;
                                                    }
                                                } else {
                                                    runnableC1107a0 = runnableC1107a2;
                                                    motionEventObtain = motionEventObtain;
                                                }
                                                z14 = false;
                                            }
                                            if (!z14) {
                                            }
                                            z11 = true;
                                        } else {
                                            runnableC1107a0 = runnableC1107a2;
                                            motionEventObtain = motionEventObtain;
                                        }
                                        if (z15) {
                                            if (zMo4139g2) {
                                                iMo4137f = (iMo4137f == true ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().m18847g(iMo4137f, 1);
                                            int i25 = -i15;
                                            runnableC1107a0.m4235a(Math.max(i25, Math.min(i16, i15)), Math.max(i25, Math.min(i11, i15)));
                                            z11 = true;
                                        }
                                    }
                                    z11 = false;
                                }
                            }
                        }
                        if (z11) {
                            recyclerView = this;
                        } else {
                            i12 = 0;
                            recyclerView = this;
                        }
                        m4195d0();
                        z10 = true;
                    }
                    z11 = false;
                    motionEventObtain = motionEventObtain;
                    if (z11) {
                        i12 = 0;
                        recyclerView = this;
                    } else {
                        recyclerView = this;
                    }
                    m4195d0();
                    z10 = true;
                }
                recyclerView.setScrollState(i12);
                m4195d0();
                z10 = true;
            }
            if (z10) {
                motionEvent2 = motionEventObtain;
            } else {
                motionEvent2 = motionEventObtain;
                recyclerView.f7028o0.addMovement(motionEvent2);
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.f7027n0 = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.f7031r0 = x12;
        recyclerView.f7029p0 = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.f7032s0 = y12;
        recyclerView.f7030q0 = y12;
        if (zMo4139g) {
            i10 = zMo4137f;
            i10 = (zMo4137f ? 1 : 0) | 2;
        }
        i10 = zMo4137f;
        getScrollingChildHelper().m18847g(i10, 0);
        z10 = false;
        if (z10) {
            motionEvent2 = motionEventObtain;
            recyclerView.f7028o0.addMovement(motionEvent2);
        } else {
            motionEvent2 = motionEventObtain;
        }
        motionEvent2.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m4215p(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        setMeasuredDimension(AbstractC1120m.m4292i(i10, paddingRight, C10029b0.d.m18668e(this)), AbstractC1120m.m4292i(i11, getPaddingBottom() + getPaddingTop(), C10029b0.d.m18667d(this)));
    }

    /* JADX INFO: renamed from: q */
    public final void m4216q(View view) {
        m4161L(view);
        Adapter adapter = this.f6971H;
        ArrayList arrayList = this.f7005b0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC1122o) this.f7005b0.get(size)).mo66b(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0333  */
    /* JADX WARN: Code duplicated, block: B:181:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0378  */
    /* JADX WARN: Code duplicated, block: B:189:0x038b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0393  */
    /* JADX WARN: Code duplicated, block: B:193:0x0399  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b2 A[LOOP:4: B:195:0x039f->B:202:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x03cd A[ADDED_TO_REGION, EDGE_INSN: B:256:0x03cd->B:212:0x03cd BREAK  A[LOOP:5: B:204:0x03b9->B:258:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.recyclerview.widget.RecyclerView$b0] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX INFO: renamed from: r */
    public final void m4217r() {
        long j10;
        ?? r10;
        int i10;
        int iM4364b;
        int i11;
        int iMin;
        AbstractC1109b0 abstractC1109b0M4175H;
        AbstractC1109b0 abstractC1109b0M4175H2;
        View view;
        int i12;
        View viewFindViewById;
        C1150f c1150f;
        View view2;
        boolean z10;
        boolean zMo4480k;
        if (this.f6971H == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f6973I == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C1131x c1131x = this.f6967D0;
        boolean z11 = false;
        c1131x.f7148i = false;
        int i13 = 1;
        boolean z12 = this.f6994S0 && !(this.f6996T0 == getWidth() && this.f6998U0 == getHeight());
        this.f6996T0 = 0;
        this.f6998U0 = 0;
        this.f6994S0 = false;
        if (c1131x.f7143d == 1) {
            m4218s();
            this.f6973I.m4323w0(this);
            m4219t();
        } else {
            C1140a c1140a = this.f7010e;
            if (!c1140a.f7209c.isEmpty() && !c1140a.f7208b.isEmpty()) {
                z11 = true;
            }
            if (z11 || z12 || this.f6973I.f7097n != getWidth() || this.f6973I.f7098o != getHeight()) {
                this.f6973I.m4323w0(this);
                m4219t();
            } else {
                this.f6973I.m4323w0(this);
            }
        }
        c1131x.m4363a(4);
        m4209l0();
        m4184R();
        c1131x.f7143d = 1;
        boolean z13 = c1131x.f7149j;
        View view3 = null;
        C1127t c1127t = this.f7006c;
        C1159j0 c1159j0 = this.f7014g;
        if (z13) {
            int iM4459e = this.f7012f.m4459e() - 1;
            while (iM4459e >= 0) {
                AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4458d(iM4459e));
                if (!abstractC1109b0M4161L.m4254q()) {
                    long jM4177J = m4177J(abstractC1109b0M4161L);
                    this.f7025l0.getClass();
                    AbstractC1117j.c cVar = new AbstractC1117j.c();
                    cVar.m4281a(abstractC1109b0M4161L);
                    AbstractC1109b0 abstractC1109b0 = (AbstractC1109b0) c1159j0.f7315b.m16510e(jM4177J, null);
                    if (abstractC1109b0 == null || abstractC1109b0.m4254q()) {
                        c1159j0.m4491a(abstractC1109b0M4161L, cVar);
                    } else {
                        C8452h<AbstractC1109b0, C1159j0.a> c8452h = c1159j0.f7314a;
                        C1159j0.a orDefault = c8452h.getOrDefault(abstractC1109b0, null);
                        int i14 = (orDefault == null || (orDefault.f7317a & i13) == 0) ? 0 : i13;
                        C1159j0.a orDefault2 = c8452h.getOrDefault(abstractC1109b0M4161L, null);
                        if (orDefault2 == null || (orDefault2.f7317a & i13) == 0) {
                            i13 = 0;
                        }
                        if (i14 == 0 || abstractC1109b0 != abstractC1109b0M4161L) {
                            AbstractC1117j.c cVarM4492b = c1159j0.m4492b(abstractC1109b0, 4);
                            c1159j0.m4491a(abstractC1109b0M4161L, cVar);
                            AbstractC1117j.c cVarM4492b2 = c1159j0.m4492b(abstractC1109b0M4161L, 8);
                            if (cVarM4492b == null) {
                                int iM4459e2 = this.f7012f.m4459e();
                                for (int i15 = 0; i15 < iM4459e2; i15++) {
                                    AbstractC1109b0 abstractC1109b0M4161L2 = m4161L(this.f7012f.m4458d(i15));
                                    if (abstractC1109b0M4161L2 != abstractC1109b0M4161L && m4177J(abstractC1109b0M4161L2) == jM4177J) {
                                        Adapter adapter = this.f6971H;
                                        if (adapter == null || !adapter.f7041b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC1109b0M4161L2 + " \n View Holder 2:" + abstractC1109b0M4161L + m4170B());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC1109b0M4161L2 + " \n View Holder 2:" + abstractC1109b0M4161L + m4170B());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1109b0 + " cannot be found but it is necessary for " + abstractC1109b0M4161L + m4170B());
                            } else {
                                abstractC1109b0.m4253p(false);
                                if (i14 != 0) {
                                    m4197f(abstractC1109b0);
                                }
                                if (abstractC1109b0 != abstractC1109b0M4161L) {
                                    if (i13 != 0) {
                                        m4197f(abstractC1109b0M4161L);
                                    }
                                    abstractC1109b0.f7061h = abstractC1109b0M4161L;
                                    m4197f(abstractC1109b0);
                                    c1127t.m4354m(abstractC1109b0);
                                    abstractC1109b0M4161L.m4253p(false);
                                    abstractC1109b0M4161L.f7062i = abstractC1109b0;
                                }
                                if (this.f7025l0.mo4273a(abstractC1109b0, abstractC1109b0M4161L, cVarM4492b, cVarM4492b2)) {
                                    m4187U();
                                }
                            }
                        } else {
                            c1159j0.m4491a(abstractC1109b0M4161L, cVar);
                        }
                    }
                }
                iM4459e--;
                i13 = 1;
            }
            C8452h<AbstractC1109b0, C1159j0.a> c8452h2 = c1159j0.f7314a;
            int i16 = c8452h2.f45619c;
            while (true) {
                i16--;
                if (i16 < 0) {
                    break;
                }
                AbstractC1109b0 abstractC1109b0M16529h = c8452h2.m16529h(i16);
                C1159j0.a aVarMo14869k = c8452h2.mo14869k(i16);
                int i17 = aVarMo14869k.f7317a;
                int i18 = i17 & 3;
                C1111d c1111d = this.f7000V0;
                if (i18 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.f6973I.m4317o0(abstractC1109b0M16529h.f7054a, recyclerView.f7006c);
                } else if ((i17 & 1) != 0) {
                    AbstractC1117j.c cVar2 = aVarMo14869k.f7318b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.f6973I.m4317o0(abstractC1109b0M16529h.f7054a, recyclerView2.f7006c);
                    } else {
                        c1111d.m4257b(abstractC1109b0M16529h, cVar2, aVarMo14869k.f7319c);
                    }
                } else if ((i17 & 14) == 14) {
                    c1111d.m4256a(abstractC1109b0M16529h, aVarMo14869k.f7318b, aVarMo14869k.f7319c);
                } else if ((i17 & 12) == 12) {
                    AbstractC1117j.c cVar3 = aVarMo14869k.f7318b;
                    AbstractC1117j.c cVar4 = aVarMo14869k.f7319c;
                    c1111d.getClass();
                    abstractC1109b0M16529h.m4253p(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    if (!recyclerView3.f7007c0) {
                        AbstractC1153g0 abstractC1153g0 = (AbstractC1153g0) recyclerView3.f7025l0;
                        abstractC1153g0.getClass();
                        int i19 = cVar3.f7081a;
                        int i20 = cVar4.f7081a;
                        if (i19 == i20 && cVar3.f7082b == cVar4.f7082b) {
                            abstractC1153g0.m4275d(abstractC1109b0M16529h);
                            zMo4480k = false;
                        } else {
                            zMo4480k = abstractC1153g0.mo4480k(abstractC1109b0M16529h, i19, cVar3.f7082b, i20, cVar4.f7082b);
                        }
                        if (zMo4480k) {
                            recyclerView3.m4187U();
                        }
                    } else if (recyclerView3.f7025l0.mo4273a(abstractC1109b0M16529h, abstractC1109b0M16529h, cVar3, cVar4)) {
                        recyclerView3.m4187U();
                    }
                } else if ((i17 & 4) != 0) {
                    c1111d.m4257b(abstractC1109b0M16529h, aVarMo14869k.f7318b, null);
                } else if ((i17 & 8) != 0) {
                    c1111d.m4256a(abstractC1109b0M16529h, aVarMo14869k.f7318b, aVarMo14869k.f7319c);
                }
                aVarMo14869k.f7317a = 0;
                view3 = null;
                aVarMo14869k.f7318b = null;
                aVarMo14869k.f7319c = null;
                C1159j0.a.f7316d.mo11464a(aVarMo14869k);
            }
        }
        this.f6973I.m4316n0(c1127t);
        c1131x.f7141b = c1131x.f7144e;
        this.f7007c0 = false;
        this.f7009d0 = false;
        c1131x.f7149j = false;
        c1131x.f7150k = false;
        this.f6973I.f7089f = false;
        ArrayList<AbstractC1109b0> arrayList = c1127t.f7117b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m.f7094k) {
            abstractC1120m.f7093j = 0;
            abstractC1120m.f7094k = false;
            c1127t.m4355n();
        }
        this.f6973I.mo4087h0(c1131x);
        boolean z14 = true;
        m4185S(true);
        m4211m0(false);
        c1159j0.f7314a.clear();
        c1159j0.f7315b.m16507b();
        int[] iArr = this.f6980L0;
        int i21 = iArr[0];
        int i22 = iArr[1];
        m4174F(iArr);
        if (iArr[0] == i21 && iArr[1] == i22) {
            z14 = false;
        }
        if (z14) {
            m4222w(0, 0);
        }
        if (this.f7039z0 && this.f6971H != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j10 = c1131x.f7152m;
                if (j10 == -1) {
                    r10 = view3;
                } else {
                    r10 = view3;
                }
                if (r10 != 0) {
                    c1150f = this.f7012f;
                    view2 = r10.f7054a;
                    if (c1150f.m4464j(view2)) {
                        if (this.f7012f.m4459e() > 0) {
                            int i23 = c1131x.f7151l;
                            if (i23 != -1) {
                            }
                            iM4364b = c1131x.m4364b();
                            i11 = i10;
                            while (true) {
                                if (i11 < iM4364b) {
                                    abstractC1109b0M4175H2 = m4175H(i11);
                                    if (abstractC1109b0M4175H2 != null) {
                                        view = abstractC1109b0M4175H2.f7054a;
                                        if (view.hasFocusable()) {
                                            view3 = view;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                iMin = Math.min(iM4364b, i10);
                                while (true) {
                                    iMin--;
                                    if (iMin < 0) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f7012f.m4459e() > 0) {
                        int i24 = c1131x.f7151l;
                        if (i24 != -1) {
                        }
                        iM4364b = c1131x.m4364b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iM4364b) {
                                abstractC1109b0M4175H2 = m4175H(i11);
                                if (abstractC1109b0M4175H2 != null) {
                                    view = abstractC1109b0M4175H2.f7054a;
                                    if (view.hasFocusable()) {
                                        view3 = view;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            iMin = Math.min(iM4364b, i10);
                            while (true) {
                                iMin--;
                                if (iMin < 0) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f7012f.m4459e() > 0) {
                    int i25 = c1131x.f7151l;
                    if (i25 != -1) {
                    }
                    iM4364b = c1131x.m4364b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iM4364b) {
                            abstractC1109b0M4175H2 = m4175H(i11);
                            if (abstractC1109b0M4175H2 != null) {
                                view = abstractC1109b0M4175H2.f7054a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(iM4364b, i10);
                        while (true) {
                            iMin--;
                            if (iMin < 0) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i12 = c1131x.f7153n;
                    if (i12 != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (this.f7012f.m4464j(getFocusedChild())) {
                j10 = c1131x.f7152m;
                if (j10 == -1 && (z10 = this.f6971H.f7041b) && z10) {
                    int iM4462h = this.f7012f.m4462h();
                    int i26 = 0;
                    r10 = view3;
                    while (i26 < iM4462h) {
                        AbstractC1109b0 abstractC1109b0M4161L3 = m4161L(this.f7012f.m4461g(i26));
                        if (abstractC1109b0M4161L3 != null && !abstractC1109b0M4161L3.m4248k() && abstractC1109b0M4161L3.f7058e == j10) {
                            if (!this.f7012f.m4464j(abstractC1109b0M4161L3.f7054a)) {
                                r10 = abstractC1109b0M4161L3;
                                break;
                            }
                            r10 = abstractC1109b0M4161L3;
                        }
                        i26++;
                        r10 = r10;
                    }
                } else {
                    r10 = view3;
                }
                if (r10 != 0) {
                    c1150f = this.f7012f;
                    view2 = r10.f7054a;
                    if (c1150f.m4464j(view2) || !view2.hasFocusable()) {
                        if (this.f7012f.m4459e() > 0) {
                            int i27 = c1131x.f7151l;
                            i10 = i27 != -1 ? i27 : 0;
                            iM4364b = c1131x.m4364b();
                            i11 = i10;
                            while (true) {
                                if (i11 < iM4364b) {
                                    abstractC1109b0M4175H2 = m4175H(i11);
                                    if (abstractC1109b0M4175H2 != null) {
                                        view = abstractC1109b0M4175H2.f7054a;
                                        if (view.hasFocusable()) {
                                            view3 = view;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                iMin = Math.min(iM4364b, i10);
                                while (true) {
                                    iMin--;
                                    if (iMin < 0 || (abstractC1109b0M4175H = m4175H(iMin)) == null) {
                                        break;
                                    }
                                    View view4 = abstractC1109b0M4175H.f7054a;
                                    if (view4.hasFocusable()) {
                                        view3 = view4;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view3 = view2;
                    }
                } else if (this.f7012f.m4459e() > 0) {
                    int i28 = c1131x.f7151l;
                    if (i28 != -1) {
                    }
                    iM4364b = c1131x.m4364b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iM4364b) {
                            abstractC1109b0M4175H2 = m4175H(i11);
                            if (abstractC1109b0M4175H2 != null) {
                                view = abstractC1109b0M4175H2.f7054a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(iM4364b, i10);
                        while (true) {
                            iMin--;
                            if (iMin < 0) {
                                break;
                            }
                            break;
                            break;
                        }
                    }
                }
                if (view3 != null) {
                    i12 = c1131x.f7153n;
                    if (i12 != -1 && (viewFindViewById = view3.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        c1131x.f7152m = -1L;
        c1131x.f7151l = -1;
        c1131x.f7153n = -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        AbstractC1109b0 abstractC1109b0M4161L = m4161L(view);
        if (abstractC1109b0M4161L != null) {
            if (abstractC1109b0M4161L.m4250m()) {
                abstractC1109b0M4161L.f7063j &= -257;
            } else if (!abstractC1109b0M4161L.m4254q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC1109b0M4161L + m4170B());
            }
        }
        view.clearAnimation();
        m4216q(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        AbstractC1130w abstractC1130w = this.f6973I.f7088e;
        boolean z10 = true;
        if (!(abstractC1130w != null && abstractC1130w.f7129e)) {
            if (!m4180N()) {
                z10 = false;
            }
        }
        if (!z10 && view2 != null) {
            m4194c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f6973I.mo4321r0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<InterfaceC1124q> arrayList = this.f6981M;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo4338e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f6991R != 0 || this.f6995T) {
            this.f6993S = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4218s() {
        View viewM4172D;
        C1131x c1131x = this.f6967D0;
        c1131x.m4363a(1);
        m4171C(c1131x);
        c1131x.f7148i = false;
        m4209l0();
        C1159j0 c1159j0 = this.f7014g;
        c1159j0.f7314a.clear();
        c1159j0.f7315b.m16507b();
        m4184R();
        m4188V();
        View focusedChild = (this.f7039z0 && hasFocus() && this.f6971H != null) ? getFocusedChild() : null;
        AbstractC1109b0 abstractC1109b0M4178K = (focusedChild == null || (viewM4172D = m4172D(focusedChild)) == null) ? null : m4178K(viewM4172D);
        if (abstractC1109b0M4178K == null) {
            c1131x.f7152m = -1L;
            c1131x.f7151l = -1;
            c1131x.f7153n = -1;
        } else {
            c1131x.f7152m = this.f6971H.f7041b ? abstractC1109b0M4178K.f7058e : -1L;
            c1131x.f7151l = this.f7007c0 ? -1 : abstractC1109b0M4178K.m4248k() ? abstractC1109b0M4178K.f7057d : abstractC1109b0M4178K.m4240c();
            View focusedChild2 = abstractC1109b0M4178K.f7054a;
            int id2 = focusedChild2.getId();
            loop3: while (true) {
                while (true) {
                    if (focusedChild2.isFocused() || !(focusedChild2 instanceof ViewGroup) || !focusedChild2.hasFocus()) {
                        break loop3;
                    }
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id2 = focusedChild2.getId();
                    }
                }
            }
            c1131x.f7153n = id2;
        }
        c1131x.f7147h = c1131x.f7149j && this.f6972H0;
        this.f6972H0 = false;
        this.f6970G0 = false;
        c1131x.f7146g = c1131x.f7150k;
        c1131x.f7144e = this.f6971H.mo4226e();
        m4174F(this.f6980L0);
        boolean z10 = c1131x.f7149j;
        C8452h<AbstractC1109b0, C1159j0.a> c8452h = c1159j0.f7314a;
        if (z10) {
            int iM4459e = this.f7012f.m4459e();
            for (int i10 = 0; i10 < iM4459e; i10++) {
                AbstractC1109b0 abstractC1109b0M4161L = m4161L(this.f7012f.m4458d(i10));
                if (!abstractC1109b0M4161L.m4254q() && (!abstractC1109b0M4161L.m4246i() || this.f6971H.f7041b)) {
                    AbstractC1117j abstractC1117j = this.f7025l0;
                    AbstractC1117j.m4272b(abstractC1109b0M4161L);
                    abstractC1109b0M4161L.m4243f();
                    abstractC1117j.getClass();
                    AbstractC1117j.c cVar = new AbstractC1117j.c();
                    cVar.m4281a(abstractC1109b0M4161L);
                    C1159j0.a orDefault = c8452h.getOrDefault(abstractC1109b0M4161L, null);
                    if (orDefault == null) {
                        orDefault = C1159j0.a.m4495a();
                        c8452h.put(abstractC1109b0M4161L, orDefault);
                    }
                    orDefault.f7318b = cVar;
                    orDefault.f7317a |= 4;
                    if (c1131x.f7147h) {
                        if (((abstractC1109b0M4161L.f7063j & 2) != 0) && !abstractC1109b0M4161L.m4248k() && !abstractC1109b0M4161L.m4254q() && !abstractC1109b0M4161L.m4246i()) {
                            c1159j0.f7315b.m16512g(m4177J(abstractC1109b0M4161L), abstractC1109b0M4161L);
                        }
                    }
                }
            }
        }
        if (c1131x.f7150k) {
            int iM4462h = this.f7012f.m4462h();
            for (int i11 = 0; i11 < iM4462h; i11++) {
                AbstractC1109b0 abstractC1109b0M4161L2 = m4161L(this.f7012f.m4461g(i11));
                if (!abstractC1109b0M4161L2.m4254q() && abstractC1109b0M4161L2.f7057d == -1) {
                    abstractC1109b0M4161L2.f7057d = abstractC1109b0M4161L2.f7056c;
                }
            }
            boolean z11 = c1131x.f7145f;
            c1131x.f7145f = false;
            this.f6973I.mo4085g0(this.f7006c, c1131x);
            c1131x.f7145f = z11;
            for (int i12 = 0; i12 < this.f7012f.m4459e(); i12++) {
                AbstractC1109b0 abstractC1109b0M4161L3 = m4161L(this.f7012f.m4458d(i12));
                if (!abstractC1109b0M4161L3.m4254q()) {
                    C1159j0.a orDefault2 = c8452h.getOrDefault(abstractC1109b0M4161L3, null);
                    if (!((orDefault2 == null || (orDefault2.f7317a & 4) == 0) ? false : true)) {
                        AbstractC1117j.m4272b(abstractC1109b0M4161L3);
                        boolean z12 = (abstractC1109b0M4161L3.f7063j & 8192) != 0;
                        AbstractC1117j abstractC1117j2 = this.f7025l0;
                        abstractC1109b0M4161L3.m4243f();
                        abstractC1117j2.getClass();
                        AbstractC1117j.c cVar2 = new AbstractC1117j.c();
                        cVar2.m4281a(abstractC1109b0M4161L3);
                        if (z12) {
                            m4190X(abstractC1109b0M4161L3, cVar2);
                        } else {
                            C1159j0.a orDefault3 = c8452h.getOrDefault(abstractC1109b0M4161L3, null);
                            if (orDefault3 == null) {
                                orDefault3 = C1159j0.a.m4495a();
                                c8452h.put(abstractC1109b0M4161L3, orDefault3);
                            }
                            orDefault3.f7317a |= 2;
                            orDefault3.f7318b = cVar2;
                        }
                    }
                }
            }
            m4208l();
        } else {
            m4208l();
        }
        m4185S(true);
        m4211m0(false);
        c1131x.f7143d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        AbstractC1120m abstractC1120m = this.f6973I;
        if (abstractC1120m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6995T) {
            return;
        }
        boolean zMo4137f = abstractC1120m.mo4137f();
        boolean zMo4139g = this.f6973I.mo4139g();
        if (zMo4137f || zMo4139g) {
            if (!zMo4137f) {
                i10 = 0;
            }
            if (!zMo4139g) {
                i11 = 0;
            }
            m4196e0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (m4180N()) {
            int iM19252a = accessibilityEvent != null ? C10280b.m19252a(accessibilityEvent) : 0;
            if (iM19252a != 0) {
                i10 = iM19252a;
            }
            this.f6999V |= i10;
            i10 = 1;
        }
        if (i10 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1149e0 c1149e0) {
        this.f6978K0 = c1149e0;
        C10029b0.m18658n(this, c1149e0);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        m4202h0(adapter, false, true);
        m4189W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1115h interfaceC1115h) {
        if (interfaceC1115h == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC1115h != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f7016h) {
            this.f7023k0 = null;
            this.f7019i0 = null;
            this.f7021j0 = null;
            this.f7017h0 = null;
        }
        this.f7016h = z10;
        super.setClipToPadding(z10);
        if (this.f6989Q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1116i c1116i) {
        c1116i.getClass();
        this.f7015g0 = c1116i;
        this.f7023k0 = null;
        this.f7019i0 = null;
        this.f7021j0 = null;
        this.f7017h0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f6987P = z10;
    }

    public void setItemAnimator(AbstractC1117j abstractC1117j) {
        AbstractC1117j abstractC1117j2 = this.f7025l0;
        if (abstractC1117j2 != null) {
            abstractC1117j2.mo4277f();
            this.f7025l0.f7075a = null;
        }
        this.f7025l0 = abstractC1117j;
        if (abstractC1117j != null) {
            abstractC1117j.f7075a = this.f6974I0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        C1127t c1127t = this.f7006c;
        c1127t.f7120e = i10;
        c1127t.m4355n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setLayoutManager(AbstractC1120m abstractC1120m) {
        C1150f.b bVar;
        RecyclerView recyclerView;
        AbstractC1130w abstractC1130w;
        if (abstractC1120m == this.f6973I) {
            return;
        }
        int i10 = 0;
        setScrollState(0);
        RunnableC1107a0 runnableC1107a0 = this.f6964A0;
        RecyclerView.this.removeCallbacks(runnableC1107a0);
        runnableC1107a0.f7047c.abortAnimation();
        AbstractC1120m abstractC1120m2 = this.f6973I;
        if (abstractC1120m2 != null && (abstractC1130w = abstractC1120m2.f7088e) != null) {
            abstractC1130w.m4361d();
        }
        AbstractC1120m abstractC1120m3 = this.f6973I;
        C1127t c1127t = this.f7006c;
        if (abstractC1120m3 != null) {
            AbstractC1117j abstractC1117j = this.f7025l0;
            if (abstractC1117j != null) {
                abstractC1117j.mo4277f();
            }
            this.f6973I.m4315m0(c1127t);
            this.f6973I.m4316n0(c1127t);
            c1127t.f7116a.clear();
            c1127t.m4348g();
            if (this.f6985O) {
                AbstractC1120m abstractC1120m4 = this.f6973I;
                abstractC1120m4.f7090g = false;
                abstractC1120m4.mo4125V(this);
            }
            this.f6973I.m4295A0(null);
            this.f6973I = null;
        } else {
            c1127t.f7116a.clear();
            c1127t.m4348g();
        }
        C1150f c1150f = this.f7012f;
        c1150f.f7255b.m4472g();
        ArrayList arrayList = c1150f.f7256c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = c1150f.f7254a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            C1145c0 c1145c0 = (C1145c0) bVar;
            c1145c0.getClass();
            AbstractC1109b0 abstractC1109b0M4161L = m4161L(view);
            if (abstractC1109b0M4161L != null) {
                int i11 = abstractC1109b0M4161L.f7069p;
                RecyclerView recyclerView2 = c1145c0.f7226a;
                if (recyclerView2.m4180N()) {
                    abstractC1109b0M4161L.f7070q = i11;
                    recyclerView2.f6990Q0.add(abstractC1109b0M4161L);
                } else {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18682s(abstractC1109b0M4161L.f7054a, i11);
                }
                abstractC1109b0M4161L.f7069p = 0;
            }
            arrayList.remove(size);
        }
        C1145c0 c1145c1 = (C1145c0) bVar;
        int iM4436a = c1145c1.m4436a();
        while (true) {
            recyclerView = c1145c1.f7226a;
            if (i10 >= iM4436a) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.m4216q(childAt);
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.f6973I = abstractC1120m;
        if (abstractC1120m != null) {
            if (abstractC1120m.f7085b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1120m + " is already attached to a RecyclerView:" + abstractC1120m.f7085b.m4170B());
            }
            abstractC1120m.m4295A0(this);
            if (this.f6985O) {
                this.f6973I.f7090g = true;
            }
        }
        c1127t.m4355n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C10052n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f51045d) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18732z(scrollingChildHelper.f51044c);
        }
        scrollingChildHelper.f51045d = z10;
    }

    public void setOnFlingListener(AbstractC1123p abstractC1123p) {
        this.f7034u0 = abstractC1123p;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1125r abstractC1125r) {
        this.f6968E0 = abstractC1125r;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f7039z0 = z10;
    }

    public void setRecycledViewPool(C1126s c1126s) {
        C1127t c1127t = this.f7006c;
        RecyclerView recyclerView = RecyclerView.this;
        c1127t.m4347f(recyclerView.f6971H, false);
        C1126s c1126s2 = c1127t.f7122g;
        if (c1126s2 != null) {
            c1126s2.f7110b--;
        }
        c1127t.f7122g = c1126s;
        if (c1126s != null && recyclerView.getAdapter() != null) {
            c1127t.f7122g.f7110b++;
        }
        c1127t.m4346e();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1128u interfaceC1128u) {
        this.f6975J = interfaceC1128u;
    }

    void setScrollState(int i10) {
        AbstractC1130w abstractC1130w;
        if (i10 == this.f7026m0) {
            return;
        }
        this.f7026m0 = i10;
        if (i10 != 2) {
            RunnableC1107a0 runnableC1107a0 = this.f6964A0;
            RecyclerView.this.removeCallbacks(runnableC1107a0);
            runnableC1107a0.f7047c.abortAnimation();
            AbstractC1120m abstractC1120m = this.f6973I;
            if (abstractC1120m != null && (abstractC1130w = abstractC1120m.f7088e) != null) {
                abstractC1130w.m4361d();
            }
        }
        AbstractC1120m abstractC1120m2 = this.f6973I;
        if (abstractC1120m2 != null) {
            abstractC1120m2.mo4313k0(i10);
        }
        AbstractC1125r abstractC1125r = this.f6968E0;
        if (abstractC1125r != null) {
            abstractC1125r.mo4339a(i10, this);
        }
        ArrayList arrayList = this.f6969F0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC1125r) this.f6969F0.get(size)).mo4339a(i10, this);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f7033t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f7033t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1133z abstractC1133z) {
        this.f7006c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m18847g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m18848h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        AbstractC1130w abstractC1130w;
        if (z10 != this.f6995T) {
            m4205j("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f6995T = false;
                if (this.f6993S && this.f6973I != null && this.f6971H != null) {
                    requestLayout();
                }
                this.f6993S = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f6995T = true;
            this.f6997U = true;
            setScrollState(0);
            RunnableC1107a0 runnableC1107a0 = this.f6964A0;
            RecyclerView.this.removeCallbacks(runnableC1107a0);
            runnableC1107a0.f7047c.abortAnimation();
            AbstractC1120m abstractC1120m = this.f6973I;
            if (abstractC1120m != null && (abstractC1130w = abstractC1120m.f7088e) != null) {
                abstractC1130w.m4361d();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4219t() {
        m4209l0();
        m4184R();
        C1131x c1131x = this.f6967D0;
        c1131x.m4363a(6);
        this.f7010e.m4413c();
        c1131x.f7144e = this.f6971H.mo4226e();
        c1131x.f7142c = 0;
        if (this.f7008d != null) {
            Adapter adapter = this.f6971H;
            adapter.getClass();
            int i10 = C1112e.f7074a[adapter.f7042c.ordinal()];
            if (i10 != 1 && (i10 != 2 || adapter.mo4226e() > 0)) {
                Parcelable parcelable = this.f7008d.f7043c;
                if (parcelable != null) {
                    this.f6973I.mo4142i0(parcelable);
                }
                this.f7008d = null;
            }
        }
        c1131x.f7146g = false;
        this.f6973I.mo4085g0(this.f7006c, c1131x);
        c1131x.f7145f = false;
        c1131x.f7149j = c1131x.f7149j && this.f7025l0 != null;
        c1131x.f7143d = 4;
        m4185S(true);
        m4211m0(false);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4220u(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m18843c(i10, i11, i12, iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public final void m4221v(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().m18845e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m4222w(int i10, int i11) {
        this.f7013f0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        AbstractC1125r abstractC1125r = this.f6968E0;
        if (abstractC1125r != null) {
            abstractC1125r.mo4340b(this, i10, i11);
        }
        ArrayList arrayList = this.f6969F0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC1125r) this.f6969F0.get(size)).mo4340b(this, i10, i11);
                }
            }
        }
        this.f7013f0--;
    }

    /* JADX INFO: renamed from: x */
    public final void m4223x() {
        if (this.f7023k0 != null) {
            return;
        }
        ((C1132y) this.f7015g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7023k0 = edgeEffect;
        if (this.f7016h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4224y() {
        if (this.f7017h0 != null) {
            return;
        }
        ((C1132y) this.f7015g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7017h0 = edgeEffect;
        if (this.f7016h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4225z() {
        if (this.f7021j0 != null) {
            return;
        }
        ((C1132y) this.f7015g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7021j0 = edgeEffect;
        if (this.f7016h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }
}
