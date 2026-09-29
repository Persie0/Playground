package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C1143b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.InterfaceC1223g;
import java.util.WeakHashMap;
import p006a5.C0020c;
import p006a5.C0021d;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p497y2.C10284f;
import p497y2.InterfaceC10288j;
import p524z4.C10441a;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: P */
    public static final C10063s0 f7731P;

    /* JADX INFO: renamed from: H */
    public C1235a f7732H;

    /* JADX INFO: renamed from: I */
    public C0020c f7733I;

    /* JADX INFO: renamed from: J */
    public C1236b f7734J;

    /* JADX INFO: renamed from: K */
    public RecyclerView.AbstractC1117j f7735K;

    /* JADX INFO: renamed from: L */
    public boolean f7736L;

    /* JADX INFO: renamed from: M */
    public boolean f7737M;

    /* JADX INFO: renamed from: N */
    public int f7738N;

    /* JADX INFO: renamed from: O */
    public C1230f f7739O;

    /* JADX INFO: renamed from: a */
    public final Rect f7740a;

    /* JADX INFO: renamed from: b */
    public final Rect f7741b;

    /* JADX INFO: renamed from: c */
    public final C1235a f7742c;

    /* JADX INFO: renamed from: d */
    public int f7743d;

    /* JADX INFO: renamed from: e */
    public boolean f7744e;

    /* JADX INFO: renamed from: f */
    public final C1225a f7745f;

    /* JADX INFO: renamed from: g */
    public C1228d f7746g;

    /* JADX INFO: renamed from: h */
    public int f7747h;

    /* JADX INFO: renamed from: i */
    public Parcelable f7748i;

    /* JADX INFO: renamed from: j */
    public C1233i f7749j;

    /* JADX INFO: renamed from: k */
    public C1232h f7750k;

    /* JADX INFO: renamed from: l */
    public C1237c f7751l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1224a();

        /* JADX INFO: renamed from: a */
        public int f7752a;

        /* JADX INFO: renamed from: b */
        public int f7753b;

        /* JADX INFO: renamed from: c */
        public Parcelable f7754c;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public class C1224a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState() {
            throw null;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7752a = parcel.readInt();
            this.f7753b = parcel.readInt();
            this.f7754c = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7752a);
            parcel.writeInt(this.f7753b);
            parcel.writeParcelable(this.f7754c, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C1225a extends AbstractC1227c {
        public C1225a() {
            super(0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1227c, androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: a */
        public final void mo4265a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f7744e = true;
            viewPager2.f7751l.f7779l = true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public abstract class AbstractC1226b {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public static abstract class AbstractC1227c extends RecyclerView.AbstractC1114g {
        public AbstractC1227c(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: a */
        public abstract void mo4265a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: b */
        public final void mo4266b() {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: c */
        public final void mo4267c(int i10, int i11, Object obj) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: d */
        public final void mo4268d(int i10, int i11) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: e */
        public final void mo4269e(int i10, int i11) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: f */
        public final void mo4270f(int i10, int i11) {
            mo4265a();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C1228d extends LinearLayoutManager {
        public C1228d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: H0 */
        public final void mo4111H0(RecyclerView.C1131x c1131x, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo4111H0(c1131x, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
        /* JADX INFO: renamed from: Y */
        public final void mo4076Y(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, C10284f c10284f) {
            super.mo4076Y(c1127t, c1131x, c10284f);
            ViewPager2.this.f7739O.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
        /* JADX INFO: renamed from: a0 */
        public final void mo4077a0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, View view, C10284f c10284f) {
            int iM4286J;
            int iM4286J2;
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.f7746g.getClass();
                iM4286J = RecyclerView.AbstractC1120m.m4286J(view);
            } else {
                iM4286J = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.f7746g.getClass();
                iM4286J2 = RecyclerView.AbstractC1120m.m4286J(view);
            } else {
                iM4286J2 = 0;
            }
            c10284f.m19266k(C10284f.c.m19275a(iM4286J, 1, iM4286J2, 1, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
        /* JADX INFO: renamed from: l0 */
        public final boolean mo4314l0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, int i10, Bundle bundle) {
            ViewPager2.this.f7739O.getClass();
            return super.mo4314l0(c1127t, c1131x, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
        /* JADX INFO: renamed from: r0 */
        public final boolean mo4321r0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class AbstractC1229e {
        /* JADX INFO: renamed from: a */
        public void mo4680a(int i10) {
        }

        /* JADX INFO: renamed from: b */
        public void mo4686b(float f3, int i10, int i11) {
        }

        /* JADX INFO: renamed from: c */
        public void mo4681c(int i10) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1230f extends AbstractC1226b {

        /* JADX INFO: renamed from: a */
        public final a f7757a = new a();

        /* JADX INFO: renamed from: b */
        public final b f7758b = new b();

        /* JADX INFO: renamed from: c */
        public C1240f f7759c;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f$a */
        public class a implements InterfaceC10288j {
            public a() {
            }

            @Override // p497y2.InterfaceC10288j
            /* JADX INFO: renamed from: a */
            public final boolean mo4689a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f7737M) {
                    viewPager2.m4684c(currentItem, true);
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f$b */
        public class b implements InterfaceC10288j {
            public b() {
            }

            @Override // p497y2.InterfaceC10288j
            /* JADX INFO: renamed from: a */
            public final boolean mo4689a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f7737M) {
                    viewPager2.m4684c(currentItem, true);
                }
                return true;
            }
        }

        public C1230f() {
        }

        /* JADX INFO: renamed from: a */
        public final void m4687a(RecyclerView recyclerView) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18682s(recyclerView, 2);
            this.f7759c = new C1240f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (C10029b0.d.m18666c(viewPager2) == 0) {
                C10029b0.d.m18682s(viewPager2, 1);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4688b() {
            int iMo4226e;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            C10029b0.m18655k(viewPager2, R.id.accessibilityActionPageLeft);
            boolean z10 = false;
            C10029b0.m18652h(viewPager2, 0);
            C10029b0.m18655k(viewPager2, R.id.accessibilityActionPageRight);
            C10029b0.m18652h(viewPager2, 0);
            C10029b0.m18655k(viewPager2, R.id.accessibilityActionPageUp);
            C10029b0.m18652h(viewPager2, 0);
            C10029b0.m18655k(viewPager2, R.id.accessibilityActionPageDown);
            C10029b0.m18652h(viewPager2, 0);
            if (viewPager2.getAdapter() != null && (iMo4226e = viewPager2.getAdapter().mo4226e()) != 0 && viewPager2.f7737M) {
                int orientation = viewPager2.getOrientation();
                b bVar = this.f7758b;
                a aVar = this.f7757a;
                if (orientation == 0) {
                    if (viewPager2.f7746g.m4299D() == 1) {
                        z10 = true;
                    }
                    int i11 = z10 ? 16908360 : 16908361;
                    if (z10) {
                        i10 = 16908361;
                    }
                    if (viewPager2.f7743d < iMo4226e - 1) {
                        C10029b0.m18656l(viewPager2, new C10284f.a(i11, (String) null), aVar);
                    }
                    if (viewPager2.f7743d > 0) {
                        C10029b0.m18656l(viewPager2, new C10284f.a(i10, (String) null), bVar);
                    }
                } else {
                    if (viewPager2.f7743d < iMo4226e - 1) {
                        C10029b0.m18656l(viewPager2, new C10284f.a(R.id.accessibilityActionPageDown, (String) null), aVar);
                    }
                    if (viewPager2.f7743d > 0) {
                        C10029b0.m18656l(viewPager2, new C10284f.a(R.id.accessibilityActionPageUp, (String) null), bVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public interface InterfaceC1231g {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1232h extends C1143b0 {
        public C1232h() {
        }

        @Override // androidx.recyclerview.widget.C1143b0, androidx.recyclerview.widget.AbstractC1155h0
        /* JADX INFO: renamed from: c */
        public final View mo4433c(RecyclerView.AbstractC1120m abstractC1120m) {
            if (((C1237c) ViewPager2.this.f7733I.f14b).f7780m) {
                return null;
            }
            return super.mo4433c(abstractC1120m);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public class C1233i extends RecyclerView {
        public C1233i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f7739O.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f7743d);
            accessibilityEvent.setToIndex(viewPager2.f7743d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f7737M && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f7737M && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static class RunnableC1234j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f7765a;

        /* JADX INFO: renamed from: b */
        public final RecyclerView f7766b;

        public RunnableC1234j(int i10, RecyclerView recyclerView) {
            this.f7765a = i10;
            this.f7766b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7766b.m4207k0(this.f7765a);
        }
    }

    static {
        C10063s0.e cVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            cVar = new C10063s0.d();
        } else {
            cVar = i10 >= 29 ? new C10063s0.c() : new C10063s0.b();
        }
        f7731P = cVar.mo18872b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7740a = new Rect();
        this.f7741b = new Rect();
        C1235a c1235a = new C1235a();
        this.f7742c = c1235a;
        this.f7744e = false;
        this.f7745f = new C1225a();
        this.f7747h = -1;
        this.f7735K = null;
        this.f7736L = false;
        this.f7737M = true;
        this.f7738N = -1;
        this.f7739O = new C1230f();
        C1233i c1233i = new C1233i(context);
        this.f7749j = c1233i;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        c1233i.setId(C10029b0.e.m18683a());
        this.f7749j.setDescendantFocusability(131072);
        C1228d c1228d = new C1228d();
        this.f7746g = c1228d;
        this.f7749j.setLayoutManager(c1228d);
        this.f7749j.setScrollingTouchSlop(1);
        int[] iArr = C10441a.f52283a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7749j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f7749j.m4201h(new C0021d());
            C1237c c1237c = new C1237c(this);
            this.f7751l = c1237c;
            this.f7733I = new C0020c(this, c1237c, this.f7749j);
            C1232h c1232h = new C1232h();
            this.f7750k = c1232h;
            c1232h.m4486a(this.f7749j);
            this.f7749j.m4203i(this.f7751l);
            C1235a c1235a2 = new C1235a();
            this.f7732H = c1235a2;
            this.f7751l.f7768a = c1235a2;
            C1238d c1238d = new C1238d(this);
            C1239e c1239e = new C1239e(this);
            this.f7732H.f7767a.add(c1238d);
            this.f7732H.f7767a.add(c1239e);
            this.f7739O.m4687a(this.f7749j);
            this.f7732H.f7767a.add(c1235a);
            C1236b c1236b = new C1236b(this.f7746g);
            this.f7734J = c1236b;
            this.f7732H.f7767a.add(c1236b);
            C1233i c1233i2 = this.f7749j;
            attachViewToParent(c1233i2, 0, c1233i2.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m4682a() {
        RecyclerView.Adapter adapter;
        if (this.f7747h != -1 && (adapter = getAdapter()) != 0) {
            Parcelable parcelable = this.f7748i;
            if (parcelable != null) {
                if (adapter instanceof InterfaceC1223g) {
                    ((InterfaceC1223g) adapter).mo4668b(parcelable);
                }
                this.f7748i = null;
            }
            int iMax = Math.max(0, Math.min(this.f7747h, adapter.mo4226e() - 1));
            this.f7743d = iMax;
            this.f7747h = -1;
            this.f7749j.m4200g0(iMax);
            this.f7739O.m4688b();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m4683b(int i10, boolean z10) {
        if (((C1237c) this.f7733I.f14b).f7780m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m4684c(i10, z10);
    }

    /* JADX INFO: renamed from: c */
    public final void m4684c(int i10, boolean z10) {
        RecyclerView.Adapter adapter = getAdapter();
        boolean z11 = false;
        if (adapter == null) {
            if (this.f7747h != -1) {
                this.f7747h = Math.max(i10, 0);
            }
            return;
        }
        if (adapter.mo4226e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.mo4226e() - 1);
        int i11 = this.f7743d;
        if (iMin == i11) {
            if (this.f7751l.f7773f == 0) {
                return;
            }
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f7743d = iMin;
        this.f7739O.m4688b();
        C1237c c1237c = this.f7751l;
        if (!(c1237c.f7773f == 0)) {
            c1237c.m4693f();
            C1237c.a aVar = c1237c.f7774g;
            d10 = ((double) aVar.f7781a) + ((double) aVar.f7782b);
        }
        C1237c c1237c2 = this.f7751l;
        c1237c2.getClass();
        c1237c2.f7772e = z10 ? 2 : 3;
        c1237c2.f7780m = false;
        if (c1237c2.f7776i != iMin) {
            z11 = true;
        }
        c1237c2.f7776i = iMin;
        c1237c2.m4691d(2);
        if (z11) {
            c1237c2.m4690c(iMin);
        }
        if (!z10) {
            this.f7749j.m4200g0(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f7749j.m4207k0(iMin);
            return;
        }
        this.f7749j.m4200g0(d11 > d10 ? iMin - 3 : iMin + 3);
        C1233i c1233i = this.f7749j;
        c1233i.post(new RunnableC1234j(iMin, c1233i));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f7749j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f7749j.canScrollVertically(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m4685d() {
        C1232h c1232h = this.f7750k;
        if (c1232h == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo4433c = c1232h.mo4433c(this.f7746g);
        if (viewMo4433c == null) {
            return;
        }
        this.f7746g.getClass();
        int iM4286J = RecyclerView.AbstractC1120m.m4286J(viewMo4433c);
        if (iM4286J != this.f7743d && getScrollState() == 0) {
            this.f7732H.mo4681c(iM4286J);
        }
        this.f7744e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f7752a;
            sparseArray.put(this.f7749j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m4682a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f7739O.getClass();
        this.f7739O.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f7749j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7743d;
    }

    public int getItemDecorationCount() {
        return this.f7749j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7738N;
    }

    public int getOrientation() {
        return this.f7746g.f6921p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C1233i c1233i = this.f7749j;
        if (getOrientation() == 0) {
            height = c1233i.getWidth() - c1233i.getPaddingLeft();
            paddingBottom = c1233i.getPaddingRight();
        } else {
            height = c1233i.getHeight() - c1233i.getPaddingTop();
            paddingBottom = c1233i.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7751l.f7773f;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets.isConsumed()) {
            return windowInsetsOnApplyWindowInsets;
        }
        int childCount = this.f7749j.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            this.f7749j.getChildAt(i10).dispatchApplyWindowInsets(new WindowInsets(windowInsetsOnApplyWindowInsets));
        }
        C10063s0 c10063s0 = f7731P;
        return c10063s0.m18870h() != null ? c10063s0.m18870h() : windowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo4226e;
        int iMo4226e2;
        int iMo4226e3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            iMo4226e = 0;
            iMo4226e2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iMo4226e = viewPager2.getAdapter().mo4226e();
            iMo4226e2 = 1;
        } else {
            iMo4226e2 = viewPager2.getAdapter().mo4226e();
            iMo4226e = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C10284f.b.m19274a(iMo4226e, iMo4226e2, 0).f51759a);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null && (iMo4226e3 = adapter.mo4226e()) != 0 && viewPager2.f7737M) {
            if (viewPager2.f7743d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f7743d < iMo4226e3 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f7749j.getMeasuredWidth();
        int measuredHeight = this.f7749j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7740a;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f7741b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7749j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7744e) {
            m4685d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f7749j, i10, i11);
        int measuredWidth = this.f7749j.getMeasuredWidth();
        int measuredHeight = this.f7749j.getMeasuredHeight();
        int measuredState = this.f7749j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7747h = savedState.f7753b;
        this.f7748i = savedState.f7754c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7752a = this.f7749j.getId();
        int i10 = this.f7747h;
        if (i10 == -1) {
            i10 = this.f7743d;
        }
        savedState.f7753b = i10;
        Parcelable parcelable = this.f7748i;
        if (parcelable != null) {
            savedState.f7754c = parcelable;
        } else {
            Object adapter = this.f7749j.getAdapter();
            if (adapter instanceof InterfaceC1223g) {
                savedState.f7754c = ((InterfaceC1223g) adapter).mo4667a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.f7739O.getClass();
        if (!(i10 == 8192 || i10 == 4096)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        C1230f c1230f = this.f7739O;
        c1230f.getClass();
        if (!(i10 == 8192 || i10 == 4096)) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f7737M) {
            viewPager2.m4684c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f7749j.getAdapter();
        C1230f c1230f = this.f7739O;
        if (adapter2 != null) {
            adapter2.f7040a.unregisterObserver(c1230f.f7759c);
        } else {
            c1230f.getClass();
        }
        C1225a c1225a = this.f7745f;
        if (adapter2 != null) {
            adapter2.f7040a.unregisterObserver(c1225a);
        }
        this.f7749j.setAdapter(adapter);
        this.f7743d = 0;
        m4682a();
        C1230f c1230f2 = this.f7739O;
        c1230f2.m4688b();
        if (adapter != null) {
            adapter.m4234o(c1230f2.f7759c);
        }
        if (adapter != null) {
            adapter.m4234o(c1225a);
        }
    }

    public void setCurrentItem(int i10) {
        m4683b(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f7739O.m4688b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f7738N = i10;
        this.f7749j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f7746g.m4143i1(i10);
        this.f7739O.m4688b();
    }

    public void setPageTransformer(InterfaceC1231g interfaceC1231g) {
        if (interfaceC1231g != null) {
            if (!this.f7736L) {
                this.f7735K = this.f7749j.getItemAnimator();
                this.f7736L = true;
            }
            this.f7749j.setItemAnimator(null);
        } else if (this.f7736L) {
            this.f7749j.setItemAnimator(this.f7735K);
            this.f7735K = null;
            this.f7736L = false;
        }
        this.f7734J.getClass();
        if (interfaceC1231g == null) {
            return;
        }
        this.f7734J.getClass();
        this.f7734J.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f7737M = z10;
        this.f7739O.m4688b();
    }
}
