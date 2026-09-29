package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.C0204c;
import androidx.customview.view.AbsSavedState;
import com.linguist.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p023b2.C1292a;
import p167i2.C6172a;
import p188j2.C6404a;
import p254m2.C7472a;
import p326q.C8452h;
import p329q2.C8488a;
import p446w2.C9804b;
import p446w2.C9807e;
import p471x2.C10029b0;
import p471x2.C10036f;
import p471x2.C10049l0;
import p471x2.C10058q;
import p471x2.C10063s0;
import p471x2.InterfaceC10054o;
import p471x2.InterfaceC10056p;
import p471x2.InterfaceC10060r;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC10054o, InterfaceC10056p {

    /* JADX INFO: renamed from: O */
    public static final String f5523O;

    /* JADX INFO: renamed from: P */
    public static final Class<?>[] f5524P;

    /* JADX INFO: renamed from: Q */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0768c>>> f5525Q;

    /* JADX INFO: renamed from: R */
    public static final C0773h f5526R;

    /* JADX INFO: renamed from: S */
    public static final C9807e f5527S;

    /* JADX INFO: renamed from: H */
    public boolean f5528H;

    /* JADX INFO: renamed from: I */
    public C10063s0 f5529I;

    /* JADX INFO: renamed from: J */
    public boolean f5530J;

    /* JADX INFO: renamed from: K */
    public Drawable f5531K;

    /* JADX INFO: renamed from: L */
    public ViewGroup.OnHierarchyChangeListener f5532L;

    /* JADX INFO: renamed from: M */
    public C0766a f5533M;

    /* JADX INFO: renamed from: N */
    public final C10058q f5534N;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5535a;

    /* JADX INFO: renamed from: b */
    public final C1292a f5536b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5537c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f5538d;

    /* JADX INFO: renamed from: e */
    public final int[] f5539e;

    /* JADX INFO: renamed from: f */
    public final int[] f5540f;

    /* JADX INFO: renamed from: g */
    public boolean f5541g;

    /* JADX INFO: renamed from: h */
    public boolean f5542h;

    /* JADX INFO: renamed from: i */
    public final int[] f5543i;

    /* JADX INFO: renamed from: j */
    public View f5544j;

    /* JADX INFO: renamed from: k */
    public View f5545k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0772g f5546l;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0765a();

        /* JADX INFO: renamed from: c */
        public SparseArray<Parcelable> f5547c;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C0765a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f5547c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f5547c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            SparseArray<Parcelable> sparseArray = this.f5547c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f5547c.keyAt(i11);
                parcelableArr[i11] = this.f5547c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0766a implements InterfaceC10060r {
        public C0766a() {
        }

        @Override // p471x2.InterfaceC10060r
        /* JADX INFO: renamed from: c */
        public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C9804b.m18286a(coordinatorLayout.f5529I, c10063s0)) {
                coordinatorLayout.f5529I = c10063s0;
                boolean z10 = c10063s0.m18868e() > 0;
                coordinatorLayout.f5530J = z10;
                coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                C10063s0.k kVar = c10063s0.f51077a;
                if (!kVar.mo18896m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        if (C10029b0.d.m18665b(childAt) && ((C0771f) childAt.getLayoutParams()).f5550a != null && kVar.mo18896m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c10063s0;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0767b {
        AbstractC0768c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0768c<V extends View> {
        public AbstractC0768c() {
        }

        public AbstractC0768c(Context context, AttributeSet attributeSet) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo2935a(View view) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo2936b(View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void mo2937c(C0771f c0771f) {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo2938d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void mo2939e(CoordinatorLayout coordinatorLayout, View view) {
        }

        /* JADX INFO: renamed from: f */
        public void mo2940f() {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo2941g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: i */
        public boolean mo2943i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public boolean mo2944j(View view) {
            return false;
        }

        /* JADX INFO: renamed from: k */
        public void mo2945k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        /* JADX INFO: renamed from: l */
        public void mo2946l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        /* JADX INFO: renamed from: m */
        public boolean mo2947m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public void mo2948n(View view, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: o */
        public Parcelable mo2949o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo2950p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public void mo2951q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        /* JADX INFO: renamed from: r */
        public boolean mo2952r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0769d {
        Class<? extends AbstractC0768c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0770e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0770e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f5532L;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.m2927p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f5532L;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0771f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0768c f5550a;

        /* JADX INFO: renamed from: b */
        public boolean f5551b;

        /* JADX INFO: renamed from: c */
        public final int f5552c;

        /* JADX INFO: renamed from: d */
        public int f5553d;

        /* JADX INFO: renamed from: e */
        public final int f5554e;

        /* JADX INFO: renamed from: f */
        public final int f5555f;

        /* JADX INFO: renamed from: g */
        public int f5556g;

        /* JADX INFO: renamed from: h */
        public int f5557h;

        /* JADX INFO: renamed from: i */
        public int f5558i;

        /* JADX INFO: renamed from: j */
        public int f5559j;

        /* JADX INFO: renamed from: k */
        public View f5560k;

        /* JADX INFO: renamed from: l */
        public View f5561l;

        /* JADX INFO: renamed from: m */
        public boolean f5562m;

        /* JADX INFO: renamed from: n */
        public boolean f5563n;

        /* JADX INFO: renamed from: o */
        public boolean f5564o;

        /* JADX INFO: renamed from: p */
        public boolean f5565p;

        /* JADX INFO: renamed from: q */
        public final Rect f5566q;

        public C0771f() {
            super(-2, -2);
            this.f5551b = false;
            this.f5552c = 0;
            this.f5553d = 0;
            this.f5554e = -1;
            this.f5555f = -1;
            this.f5556g = 0;
            this.f5557h = 0;
            this.f5566q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C0771f(Context context, AttributeSet attributeSet) {
            AbstractC0768c abstractC0768cNewInstance;
            super(context, attributeSet);
            this.f5551b = false;
            this.f5552c = 0;
            this.f5553d = 0;
            this.f5554e = -1;
            this.f5555f = -1;
            this.f5556g = 0;
            this.f5557h = 0;
            this.f5566q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6172a.f36010b);
            this.f5552c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f5555f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f5553d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f5554e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f5556g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f5557h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f5551b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f5523O;
                if (TextUtils.isEmpty(string)) {
                    abstractC0768cNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f5523O;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0768c>>> threadLocal = CoordinatorLayout.f5525Q;
                        Map<String, Constructor<AbstractC0768c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0768c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5524P);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        abstractC0768cNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(C0204c.m852k("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f5550a = abstractC0768cNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0768c abstractC0768c = this.f5550a;
            if (abstractC0768c != null) {
                abstractC0768c.mo2937c(this);
            }
        }

        public C0771f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5551b = false;
            this.f5552c = 0;
            this.f5553d = 0;
            this.f5554e = -1;
            this.f5555f = -1;
            this.f5556g = 0;
            this.f5557h = 0;
            this.f5566q = new Rect();
        }

        public C0771f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5551b = false;
            this.f5552c = 0;
            this.f5553d = 0;
            this.f5554e = -1;
            this.f5555f = -1;
            this.f5556g = 0;
            this.f5557h = 0;
            this.f5566q = new Rect();
        }

        public C0771f(C0771f c0771f) {
            super((ViewGroup.MarginLayoutParams) c0771f);
            this.f5551b = false;
            this.f5552c = 0;
            this.f5553d = 0;
            this.f5554e = -1;
            this.f5555f = -1;
            this.f5556g = 0;
            this.f5557h = 0;
            this.f5566q = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m2953a(int i10) {
            if (i10 == 0) {
                return this.f5563n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f5564o;
        }

        /* JADX INFO: renamed from: b */
        public final void m2954b(AbstractC0768c abstractC0768c) {
            AbstractC0768c abstractC0768c2 = this.f5550a;
            if (abstractC0768c2 != abstractC0768c) {
                if (abstractC0768c2 != null) {
                    abstractC0768c2.mo2940f();
                }
                this.f5550a = abstractC0768c;
                this.f5551b = true;
                if (abstractC0768c != null) {
                    abstractC0768c.mo2937c(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0772g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0772g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.m2927p(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0773h implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            float fM18719m = C10029b0.i.m18719m(view);
            float fM18719m2 = C10029b0.i.m18719m(view2);
            if (fM18719m > fM18719m2) {
                return -1;
            }
            return fM18719m < fM18719m2 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f5523O = r10 != null ? r10.getName() : null;
        f5526R = new C0773h();
        f5524P = new Class[]{Context.class, AttributeSet.class};
        f5525Q = new ThreadLocal<>();
        f5527S = new C9807e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f5535a = new ArrayList();
        this.f5536b = new C1292a(1);
        this.f5537c = new ArrayList();
        this.f5538d = new ArrayList();
        this.f5539e = new int[2];
        this.f5540f = new int[2];
        this.f5534N = new C10058q();
        int[] iArr = C6172a.f36009a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f5543i = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f5543i;
                iArr2[i10] = (int) (iArr2[i10] * f3);
            }
        }
        this.f5531K = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m2933x();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0770e());
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18666c(this) == 0) {
            C10029b0.d.m18682s(this, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m2916a() {
        Rect rect = (Rect) f5527S.mo11465b();
        if (rect == null) {
            rect = new Rect();
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX INFO: renamed from: g */
    public static void m2917g(int i10, Rect rect, Rect rect2, C0771f c0771f, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = c0771f.f5552c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = c0771f.f5553d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                iWidth -= i11;
            }
            if (i16 != 16) {
                if (i16 != 80) {
                    iHeight -= i12;
                }
                rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
            }
            iHeight -= i12 / 2;
            rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
        }
        iWidth -= i11 / 2;
        if (i16 != 16) {
            if (i16 != 80) {
                iHeight -= i12;
            }
            rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
        }
        iHeight -= i12 / 2;
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static C0771f m2918i(View view) {
        C0771f c0771f = (C0771f) view.getLayoutParams();
        if (!c0771f.f5551b) {
            if (view instanceof InterfaceC0767b) {
                AbstractC0768c behavior = ((InterfaceC0767b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0771f.m2954b(behavior);
                c0771f.f5551b = true;
            } else {
                InterfaceC0769d interfaceC0769d = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0769d = (InterfaceC0769d) superclass.getAnnotation(InterfaceC0769d.class);
                    if (interfaceC0769d != null) {
                        break;
                    }
                }
                if (interfaceC0769d != null) {
                    try {
                        c0771f.m2954b(interfaceC0769d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0769d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                c0771f.f5551b = true;
            }
        }
        return c0771f;
    }

    /* JADX INFO: renamed from: v */
    public static void m2919v(View view, int i10) {
        C0771f c0771f = (C0771f) view.getLayoutParams();
        int i11 = c0771f.f5558i;
        if (i11 != i10) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            view.offsetLeftAndRight(i10 - i11);
            c0771f.f5558i = i10;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2920w(View view, int i10) {
        C0771f c0771f = (C0771f) view.getLayoutParams();
        int i11 = c0771f.f5559j;
        if (i11 != i10) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            view.offsetTopAndBottom(i10 - i11);
            c0771f.f5559j = i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2921b(C0771f c0771f, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c0771f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0771f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2922c(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                m2924f(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0771f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m2923d(View view) {
        C8452h c8452h = (C8452h) this.f5536b.f8004b;
        int i10 = c8452h.f45619c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) c8452h.m16530m(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c8452h.m16529h(i11));
            }
        }
        ArrayList arrayList3 = this.f5538d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        AbstractC0768c abstractC0768c = ((C0771f) view.getLayoutParams()).f5550a;
        if (abstractC0768c != null) {
            abstractC0768c.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5531K;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // p471x2.InterfaceC10056p
    /* JADX INFO: renamed from: e */
    public final void mo964e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC0768c abstractC0768c;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0771f c0771f = (C0771f) childAt.getLayoutParams();
                if (c0771f.m2953a(i14) && (abstractC0768c = c0771f.f5550a) != null) {
                    int[] iArr2 = this.f5539e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0768c.mo2946l(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            m2927p(1);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2924f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C6404a.f36867a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C6404a.f36867a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C6404a.m13029a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C6404a.f36868b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0771f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0771f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0771f) {
            return new C0771f((C0771f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0771f((ViewGroup.MarginLayoutParams) layoutParams) : new C0771f(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m2931t();
        return Collections.unmodifiableList(this.f5535a);
    }

    public final C10063s0 getLastWindowInsets() {
        return this.f5529I;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C10058q c10058q = this.f5534N;
        return c10058q.f51048b | c10058q.f51047a;
    }

    public Drawable getStatusBarBackground() {
        return this.f5531K;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final int m2925h(int i10) {
        int[] iArr = this.f5543i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2926j(View view, int i10, int i11) {
        C9807e c9807e = f5527S;
        Rect rectM2916a = m2916a();
        m2924f(view, rectM2916a);
        try {
            boolean zContains = rectM2916a.contains(i10, i11);
            rectM2916a.setEmpty();
            return zContains;
        } finally {
            rectM2916a.setEmpty();
            c9807e.mo11464a(rectM2916a);
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: k */
    public final void mo970k(View view, int i10, int i11, int i12, int i13, int i14) {
        mo964e(view, i10, i11, i12, i13, 0, this.f5540f);
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: l */
    public final boolean mo971l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0771f c0771f = (C0771f) childAt.getLayoutParams();
                AbstractC0768c abstractC0768c = c0771f.f5550a;
                if (abstractC0768c != null) {
                    boolean zMo2950p = abstractC0768c.mo2950p(this, childAt, view, view2, i10, i11);
                    z10 |= zMo2950p;
                    if (i11 == 0) {
                        c0771f.f5563n = zMo2950p;
                    } else if (i11 == 1) {
                        c0771f.f5564o = zMo2950p;
                    }
                } else if (i11 == 0) {
                    c0771f.f5563n = false;
                } else if (i11 == 1) {
                    c0771f.f5564o = false;
                }
            }
        }
        return z10;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: m */
    public final void mo972m(View view, View view2, int i10, int i11) {
        C10058q c10058q = this.f5534N;
        if (i11 == 1) {
            c10058q.f51048b = i10;
        } else {
            c10058q.f51047a = i10;
        }
        this.f5545k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((C0771f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: n */
    public final void mo973n(View view, int i10) {
        C10058q c10058q = this.f5534N;
        if (i10 == 1) {
            c10058q.f51048b = 0;
        } else {
            c10058q.f51047a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0771f c0771f = (C0771f) childAt.getLayoutParams();
            if (c0771f.m2953a(i10)) {
                AbstractC0768c abstractC0768c = c0771f.f5550a;
                if (abstractC0768c != null) {
                    abstractC0768c.mo2951q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    c0771f.f5563n = false;
                } else if (i10 == 1) {
                    c0771f.f5564o = false;
                }
                c0771f.f5565p = false;
            }
        }
        this.f5545k = null;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: o */
    public final void mo974o(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC0768c abstractC0768c;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0771f c0771f = (C0771f) childAt.getLayoutParams();
                if (c0771f.m2953a(i12) && (abstractC0768c = c0771f.f5550a) != null) {
                    int[] iArr2 = this.f5539e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0768c.mo2945k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f5539e;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            m2927p(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2932u(false);
        if (this.f5528H) {
            if (this.f5546l == null) {
                this.f5546l = new ViewTreeObserverOnPreDrawListenerC0772g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5546l);
        }
        if (this.f5529I == null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.d.m18665b(this)) {
                C10029b0.h.m18706c(this);
            }
        }
        this.f5542h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2932u(false);
        if (this.f5528H && this.f5546l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5546l);
        }
        View view = this.f5545k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f5542h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5530J && this.f5531K != null) {
            C10063s0 c10063s0 = this.f5529I;
            int iM18868e = c10063s0 != null ? c10063s0.m18868e() : 0;
            if (iM18868e > 0) {
                this.f5531K.setBounds(0, 0, getWidth(), iM18868e);
                this.f5531K.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2932u(true);
        }
        boolean zM2930s = m2930s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2932u(true);
        }
        return zM2930s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18686d = C10029b0.e.m18686d(this);
        ArrayList arrayList = this.f5535a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8) {
                AbstractC0768c abstractC0768c = ((C0771f) view.getLayoutParams()).f5550a;
                if (abstractC0768c == null || !abstractC0768c.mo2942h(this, view, iM18686d)) {
                    m2928q(view, iM18686d);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0768c abstractC0768c;
        int i14;
        ArrayList arrayList;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        m2931t();
        int childCount = getChildCount();
        int i22 = 0;
        while (true) {
            if (i22 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i22);
            C8452h c8452h = (C8452h) this.f5536b.f8004b;
            int i23 = c8452h.f45619c;
            int i24 = 0;
            while (true) {
                if (i24 < i23) {
                    ArrayList arrayList2 = (ArrayList) c8452h.m16530m(i24);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z12 = true;
                        break;
                    }
                    i24++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                z10 = true;
                break;
            }
            i22++;
        }
        if (z10 != this.f5528H) {
            if (z10) {
                if (this.f5542h) {
                    if (this.f5546l == null) {
                        this.f5546l = new ViewTreeObserverOnPreDrawListenerC0772g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f5546l);
                }
                this.f5528H = true;
            } else {
                if (this.f5542h && this.f5546l != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f5546l);
                }
                this.f5528H = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18686d = C10029b0.e.m18686d(this);
        boolean z13 = iM18686d == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z14 = this.f5529I != null && C10029b0.d.m18665b(this);
        ArrayList arrayList3 = this.f5535a;
        int size3 = arrayList3.size();
        int i27 = suggestedMinimumWidth;
        int i28 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i29 = 0;
        while (i29 < size3) {
            View view = (View) arrayList3.get(i29);
            int i30 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i14 = size3;
                arrayList = arrayList3;
                i17 = paddingLeft;
                i20 = paddingRight;
                i15 = iM18686d;
                iCombineMeasuredStates = i30;
                z11 = false;
                i19 = i29;
            } else {
                C0771f c0771f = (C0771f) view.getLayoutParams();
                int i31 = c0771f.f5554e;
                if (i31 < 0 || mode == 0) {
                    i12 = i29;
                    i13 = i28;
                } else {
                    int iM2925h = m2925h(i31);
                    i12 = i29;
                    int i32 = c0771f.f5552c;
                    if (i32 == 0) {
                        i32 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, iM18686d) & 7;
                    i13 = i28;
                    if ((absoluteGravity == 3 && !z13) || (absoluteGravity == 5 && z13)) {
                        iMax = Math.max(0, (size - paddingRight) - iM2925h);
                    } else if ((absoluteGravity == 5 && !z13) || (absoluteGravity == 3 && z13)) {
                        iMax = Math.max(0, iM2925h - paddingLeft);
                    }
                    if (z14 || C10029b0.d.m18665b(view)) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        int iM18867d = this.f5529I.m18867d() + this.f5529I.m18866c();
                        int iM18865b = this.f5529I.m18865b() + this.f5529I.m18868e();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM18867d, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM18865b, mode2);
                    }
                    abstractC0768c = c0771f.f5550a;
                    if (abstractC0768c != null) {
                        i19 = i12;
                        i17 = paddingLeft;
                        z11 = false;
                        i18 = i30;
                        int i33 = i13;
                        i20 = paddingRight;
                        i21 = i33;
                        i15 = iM18686d;
                        i16 = i27;
                        i14 = size3;
                        arrayList = arrayList3;
                        if (!abstractC0768c.mo2943i(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                        }
                        int iMax2 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin + ((ViewGroup.MarginLayoutParams) c0771f).rightMargin);
                        int iMax3 = Math.max(i21, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) c0771f).topMargin + ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin);
                        i27 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                        i28 = iMax3;
                    } else {
                        i14 = size3;
                        arrayList = arrayList3;
                        i15 = iM18686d;
                        z11 = false;
                        i16 = i27;
                        int i34 = i12;
                        i17 = paddingLeft;
                        i18 = i30;
                        i19 = i34;
                        int i35 = i13;
                        i20 = paddingRight;
                        i21 = i35;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    int iMax4 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin + ((ViewGroup.MarginLayoutParams) c0771f).rightMargin);
                    int iMax5 = Math.max(i21, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) c0771f).topMargin + ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin);
                    i27 = iMax4;
                    iCombineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                    i28 = iMax5;
                }
                iMax = 0;
                if (z14) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                abstractC0768c = c0771f.f5550a;
                if (abstractC0768c != null) {
                    i19 = i12;
                    i17 = paddingLeft;
                    z11 = false;
                    i18 = i30;
                    int i36 = i13;
                    i20 = paddingRight;
                    i21 = i36;
                    i15 = iM18686d;
                    i16 = i27;
                    i14 = size3;
                    arrayList = arrayList3;
                    if (!abstractC0768c.mo2943i(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                    }
                    int iMax6 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin + ((ViewGroup.MarginLayoutParams) c0771f).rightMargin);
                    int iMax7 = Math.max(i21, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) c0771f).topMargin + ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin);
                    i27 = iMax6;
                    iCombineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                    i28 = iMax7;
                } else {
                    i14 = size3;
                    arrayList = arrayList3;
                    i15 = iM18686d;
                    z11 = false;
                    i16 = i27;
                    int i37 = i12;
                    i17 = paddingLeft;
                    i18 = i30;
                    i19 = i37;
                    int i38 = i13;
                    i20 = paddingRight;
                    i21 = i38;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                int iMax8 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) c0771f).leftMargin + ((ViewGroup.MarginLayoutParams) c0771f).rightMargin);
                int iMax9 = Math.max(i21, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) c0771f).topMargin + ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin);
                i27 = iMax8;
                iCombineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                i28 = iMax9;
            }
            i29 = i19 + 1;
            paddingLeft = i17;
            paddingRight = i20;
            iM18686d = i15;
            size3 = i14;
            arrayList3 = arrayList;
        }
        int i39 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i27, i10, (-16777216) & i39), View.resolveSizeAndState(i28, i11, i39 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0771f c0771f = (C0771f) childAt.getLayoutParams();
                if (c0771f.m2953a(0)) {
                    AbstractC0768c abstractC0768c = c0771f.f5550a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        int childCount = getChildCount();
        boolean zMo2944j = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0771f c0771f = (C0771f) childAt.getLayoutParams();
                if (c0771f.m2953a(0)) {
                    AbstractC0768c abstractC0768c = c0771f.f5550a;
                    if (abstractC0768c != null) {
                        zMo2944j |= abstractC0768c.mo2944j(view);
                    }
                }
            }
        }
        return zMo2944j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo974o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo970k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo972m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        SparseArray<Parcelable> sparseArray = savedState.f5547c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0768c abstractC0768c = m2918i(childAt).f5550a;
            if (id2 != -1 && abstractC0768c != null && (parcelable2 = sparseArray.get(id2)) != null) {
                abstractC0768c.mo2948n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo2949o;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0768c abstractC0768c = ((C0771f) childAt.getLayoutParams()).f5550a;
            if (id2 != -1 && abstractC0768c != null && (parcelableMo2949o = abstractC0768c.mo2949o(childAt)) != null) {
                sparseArray.append(id2, parcelableMo2949o);
            }
        }
        savedState.f5547c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo971l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo973n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2930s;
        boolean zMo2952r;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5544j == null) {
            zM2930s = m2930s(motionEvent, 1);
            if (!zM2930s) {
                zMo2952r = false;
            }
            motionEventObtain = null;
            if (this.f5544j == null) {
                zMo2952r |= super.onTouchEvent(motionEvent);
            } else if (zM2930s) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m2932u(false);
            }
            return zMo2952r;
        }
        zM2930s = false;
        AbstractC0768c abstractC0768c = ((C0771f) this.f5544j.getLayoutParams()).f5550a;
        if (abstractC0768c != null) {
            zMo2952r = abstractC0768c.mo2952r(this, this.f5544j, motionEvent);
        } else {
            zMo2952r = false;
        }
        motionEventObtain = null;
        if (this.f5544j == null) {
            zMo2952r |= super.onTouchEvent(motionEvent);
        } else if (zM2930s) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            m2932u(false);
        } else {
            m2932u(false);
        }
        return zMo2952r;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX INFO: renamed from: p */
    public final void m2927p(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean zMo2938d;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        View view;
        C9807e c9807e;
        AbstractC0768c abstractC0768c;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18686d = C10029b0.e.m18686d(this);
        ArrayList arrayList2 = this.f5535a;
        int size = arrayList2.size();
        Rect rectM2916a = m2916a();
        Rect rectM2916a2 = m2916a();
        Rect rectM2916a3 = m2916a();
        int i19 = i10;
        int i20 = 0;
        while (true) {
            C9807e c9807e2 = f5527S;
            if (i20 >= size) {
                Rect rect2 = rectM2916a3;
                rectM2916a.setEmpty();
                c9807e2.mo11464a(rectM2916a);
                rectM2916a2.setEmpty();
                c9807e2.mo11464a(rectM2916a2);
                rect2.setEmpty();
                c9807e2.mo11464a(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i20);
            C0771f c0771f = (C0771f) view2.getLayoutParams();
            if (i19 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i12 = size;
                rect = rectM2916a3;
                i11 = i20;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (c0771f.f5561l == ((View) arrayList2.get(i21))) {
                        C0771f c0771f2 = (C0771f) view2.getLayoutParams();
                        if (c0771f2.f5560k != null) {
                            Rect rectM2916a4 = m2916a();
                            Rect rectM2916a5 = m2916a();
                            Rect rectM2916a6 = m2916a();
                            m2924f(c0771f2.f5560k, rectM2916a4);
                            m2922c(view2, rectM2916a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            c9807e = c9807e2;
                            m2917g(iM18686d, rectM2916a4, rectM2916a6, c0771f2, measuredWidth, measuredHeight);
                            boolean z13 = (rectM2916a6.left == rectM2916a5.left && rectM2916a6.top == rectM2916a5.top) ? false : true;
                            m2921b(r16, rectM2916a6, measuredWidth, measuredHeight);
                            int i22 = rectM2916a6.left - rectM2916a5.left;
                            int i23 = rectM2916a6.top - rectM2916a5.top;
                            if (i22 != 0) {
                                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z13 && (abstractC0768c = r16.f5550a) != null) {
                                abstractC0768c.mo2938d(this, view, c0771f2.f5560k);
                            }
                            rectM2916a4.setEmpty();
                            c9807e.mo11464a(rectM2916a4);
                            rectM2916a5.setEmpty();
                            c9807e.mo11464a(rectM2916a5);
                            rectM2916a6.setEmpty();
                            c9807e.mo11464a(rectM2916a6);
                        } else {
                            view = view2;
                            c9807e = c9807e2;
                        }
                    } else {
                        view = view2;
                        c9807e = c9807e2;
                    }
                    i21++;
                    c9807e2 = c9807e;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i20 = i20;
                    c0771f = c0771f;
                    rectM2916a3 = rectM2916a3;
                }
                C0771f c0771f3 = c0771f;
                ArrayList arrayList3 = arrayList2;
                int i24 = size;
                Rect rect3 = rectM2916a3;
                i11 = i20;
                View view3 = view2;
                C9807e c9807e3 = c9807e2;
                m2922c(view3, rectM2916a2, true);
                if (c0771f3.f5556g != 0 && !rectM2916a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0771f3.f5556g, iM18686d);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rectM2916a.top = Math.max(rectM2916a.top, rectM2916a2.bottom);
                    } else if (i25 == 80) {
                        rectM2916a.bottom = Math.max(rectM2916a.bottom, getHeight() - rectM2916a2.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rectM2916a.left = Math.max(rectM2916a.left, rectM2916a2.right);
                    } else if (i26 == 5) {
                        rectM2916a.right = Math.max(rectM2916a.right, getWidth() - rectM2916a2.left);
                    }
                }
                if (c0771f3.f5557h != 0 && view3.getVisibility() == 0) {
                    WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                    if (C10029b0.g.m18699c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        C0771f c0771f4 = (C0771f) view3.getLayoutParams();
                        AbstractC0768c abstractC0768c2 = c0771f4.f5550a;
                        Rect rectM2916a7 = m2916a();
                        Rect rectM2916a8 = m2916a();
                        rectM2916a8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (abstractC0768c2 == null || !abstractC0768c2.mo2935a(view3)) {
                            rectM2916a7.set(rectM2916a8);
                        } else if (!rectM2916a8.contains(rectM2916a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM2916a7.toShortString() + " | Bounds:" + rectM2916a8.toShortString());
                        }
                        rectM2916a8.setEmpty();
                        c9807e3.mo11464a(rectM2916a8);
                        if (rectM2916a7.isEmpty()) {
                            rectM2916a7.setEmpty();
                            c9807e3.mo11464a(rectM2916a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0771f4.f5557h, iM18686d);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (rectM2916a7.top - ((ViewGroup.MarginLayoutParams) c0771f4).topMargin) - c0771f4.f5559j) >= (i18 = rectM2916a.top)) {
                                z10 = false;
                            } else {
                                m2920w(view3, i18 - i17);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM2916a7.bottom) - ((ViewGroup.MarginLayoutParams) c0771f4).bottomMargin) + c0771f4.f5559j) < (i16 = rectM2916a.bottom)) {
                                m2920w(view3, height - i16);
                                z10 = true;
                            }
                            if (!z10) {
                                m2920w(view3, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (rectM2916a7.left - ((ViewGroup.MarginLayoutParams) c0771f4).leftMargin) - c0771f4.f5558i) >= (i15 = rectM2916a.left)) {
                                z11 = false;
                            } else {
                                m2919v(view3, i15 - i14);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - rectM2916a7.right) - ((ViewGroup.MarginLayoutParams) c0771f4).rightMargin) + c0771f4.f5558i) >= (i13 = rectM2916a.right)) {
                                z12 = z11;
                            } else {
                                m2919v(view3, width - i13);
                                z12 = true;
                            }
                            if (!z12) {
                                m2919v(view3, 0);
                            }
                            rectM2916a7.setEmpty();
                            c9807e3.mo11464a(rectM2916a7);
                        }
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((C0771f) view3.getLayoutParams()).f5566q);
                    if (rect.equals(rectM2916a2)) {
                        arrayList = arrayList3;
                        i12 = i24;
                    } else {
                        ((C0771f) view3.getLayoutParams()).f5566q.set(rectM2916a2);
                    }
                    i19 = i10;
                } else {
                    rect = rect3;
                }
                int i27 = i11 + 1;
                i12 = i24;
                while (true) {
                    arrayList = arrayList3;
                    if (i27 >= i12) {
                        break;
                    }
                    View view4 = (View) arrayList.get(i27);
                    C0771f c0771f5 = (C0771f) view4.getLayoutParams();
                    AbstractC0768c abstractC0768c3 = c0771f5.f5550a;
                    if (abstractC0768c3 != null && abstractC0768c3.mo2936b(view4, view3)) {
                        if (i10 == 0 && c0771f5.f5565p) {
                            c0771f5.f5565p = false;
                        } else {
                            if (i10 != 2) {
                                zMo2938d = abstractC0768c3.mo2938d(this, view4, view3);
                            } else {
                                abstractC0768c3.mo2939e(this, view3);
                                zMo2938d = true;
                            }
                            if (i10 == 1) {
                                c0771f5.f5565p = zMo2938d;
                            }
                        }
                    }
                    i27++;
                    arrayList3 = arrayList;
                }
                i19 = i10;
            }
            i20 = i11 + 1;
            rectM2916a3 = rect;
            size = i12;
            arrayList2 = arrayList;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final void m2928q(View view, int i10) {
        C0771f c0771f = (C0771f) view.getLayoutParams();
        View view2 = c0771f.f5560k;
        int i11 = 0;
        if (view2 == null && c0771f.f5555f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C9807e c9807e = f5527S;
        if (view2 != null) {
            Rect rectM2916a = m2916a();
            Rect rectM2916a2 = m2916a();
            try {
                m2924f(view2, rectM2916a);
                C0771f c0771f2 = (C0771f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m2917g(i10, rectM2916a, rectM2916a2, c0771f2, measuredWidth, measuredHeight);
                m2921b(c0771f2, rectM2916a2, measuredWidth, measuredHeight);
                view.layout(rectM2916a2.left, rectM2916a2.top, rectM2916a2.right, rectM2916a2.bottom);
                rectM2916a.setEmpty();
                c9807e.mo11464a(rectM2916a);
                rectM2916a2.setEmpty();
                return;
            } finally {
                rectM2916a.setEmpty();
                c9807e.mo11464a(rectM2916a);
                rectM2916a2.setEmpty();
                c9807e.mo11464a(rectM2916a2);
            }
        }
        int i12 = c0771f.f5554e;
        if (i12 < 0) {
            C0771f c0771f3 = (C0771f) view.getLayoutParams();
            Rect rectM2916a3 = m2916a();
            rectM2916a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0771f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0771f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0771f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0771f3).bottomMargin);
            if (this.f5529I != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.d.m18665b(this) && !C10029b0.d.m18665b(view)) {
                    rectM2916a3.left = this.f5529I.m18866c() + rectM2916a3.left;
                    rectM2916a3.top = this.f5529I.m18868e() + rectM2916a3.top;
                    rectM2916a3.right -= this.f5529I.m18867d();
                    rectM2916a3.bottom -= this.f5529I.m18865b();
                }
            }
            Rect rectM2916a4 = m2916a();
            int i13 = c0771f3.f5552c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            C10036f.m18798b(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM2916a3, rectM2916a4, i10);
            view.layout(rectM2916a4.left, rectM2916a4.top, rectM2916a4.right, rectM2916a4.bottom);
            rectM2916a3.setEmpty();
            c9807e.mo11464a(rectM2916a3);
            rectM2916a4.setEmpty();
            c9807e.mo11464a(rectM2916a4);
            return;
        }
        C0771f c0771f4 = (C0771f) view.getLayoutParams();
        int i14 = c0771f4.f5552c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iM2925h = m2925h(i12) - measuredWidth2;
        if (i15 == 1) {
            iM2925h += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iM2925h += measuredWidth2;
        }
        if (i16 == 16) {
            i11 = 0 + (measuredHeight2 / 2);
        } else if (i16 == 80) {
            i11 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0771f4).leftMargin, Math.min(iM2925h, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0771f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0771f4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0771f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final void m2929r(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0768c abstractC0768c = ((C0771f) view.getLayoutParams()).f5550a;
        if (abstractC0768c == null || !abstractC0768c.mo2947m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f5541g) {
            m2932u(false);
            this.f5541g = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2930s(MotionEvent motionEvent, int i10) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5537c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        C0773h c0773h = f5526R;
        if (c0773h != null) {
            Collections.sort(arrayList, c0773h);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo2941g = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            C0771f c0771f = (C0771f) view.getLayoutParams();
            AbstractC0768c abstractC0768c = c0771f.f5550a;
            if (!(zMo2941g || z11) || actionMasked == 0) {
                if (!zMo2941g && abstractC0768c != null) {
                    if (i10 == 0) {
                        zMo2941g = abstractC0768c.mo2941g(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zMo2941g = abstractC0768c.mo2952r(this, view, motionEvent);
                    }
                    if (zMo2941g) {
                        this.f5544j = view;
                    }
                }
                if (c0771f.f5550a == null) {
                    c0771f.f5562m = false;
                }
                boolean z12 = c0771f.f5562m;
                if (z12) {
                    z10 = true;
                } else {
                    z10 = z12 | false;
                    c0771f.f5562m = z10;
                }
                z11 = z10 && !z12;
                if (z10 && !z11) {
                    break;
                }
            } else if (abstractC0768c != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    abstractC0768c.mo2941g(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    abstractC0768c.mo2952r(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zMo2941g;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m2933x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5532L = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5531K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5531K = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5531K.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5531K;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C8488a.c.m16573b(drawable3, C10029b0.e.m18686d(this));
                this.f5531K.setVisible(getVisibility() == 0, false);
                this.f5531K.setCallback(this);
            }
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawableM14849b;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = C7472a.f41322a;
            drawableM14849b = C7472a.c.m14849b(context, i10);
        } else {
            drawableM14849b = null;
        }
        setStatusBarBackground(drawableM14849b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f5531K;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f5531K.setVisible(z10, false);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:41:0x0097
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: t */
    public final void m2931t() {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m2931t():void");
    }

    /* JADX INFO: renamed from: u */
    public final void m2932u(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0768c abstractC0768c = ((C0771f) childAt.getLayoutParams()).f5550a;
            if (abstractC0768c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    abstractC0768c.mo2941g(this, childAt, motionEventObtain);
                } else {
                    abstractC0768c.mo2952r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C0771f) getChildAt(i11).getLayoutParams()).f5562m = false;
        }
        this.f5544j = null;
        this.f5541g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5531K;
    }

    /* JADX INFO: renamed from: x */
    public final void m2933x() {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.d.m18665b(this)) {
            C10029b0.i.m18727u(this, null);
            return;
        }
        if (this.f5533M == null) {
            this.f5533M = new C0766a();
        }
        C10029b0.i.m18727u(this, this.f5533M);
        setSystemUiVisibility(1280);
    }
}
