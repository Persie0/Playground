package p471x2;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p007a6.C0026e;
import p150h9.C5939v;
import p312p2.C8170b;
import p326q.C8452h;
import p497y2.C10284f;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: x2.b0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C10029b0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, C10049l0> f50993a;

    /* JADX INFO: renamed from: b */
    public static Field f50994b;

    /* JADX INFO: renamed from: c */
    public static boolean f50995c;

    /* JADX INFO: renamed from: d */
    public static final int[] f50996d;

    /* JADX INFO: renamed from: e */
    public static final C10069w f50997e;

    /* JADX INFO: renamed from: f */
    public static final a f50998f;

    /* JADX INFO: renamed from: x2.b0$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f50999a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f50999a;
                Iterator<Map.Entry<View, Boolean>> it = weakHashMap.entrySet().iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Map.Entry<View, Boolean> next = it.next();
                        View key = next.getKey();
                        boolean zBooleanValue = next.getValue().booleanValue();
                        boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                        if (zBooleanValue != z10) {
                            C10029b0.m18652h(key, z10 ? 16 : 32);
                            weakHashMap.put(key, Boolean.valueOf(z10));
                        }
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: x2.b0$b */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a */
        public final int f51000a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f51001b;

        /* JADX INFO: renamed from: c */
        public final int f51002c;

        /* JADX INFO: renamed from: d */
        public final int f51003d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f51000a = i10;
            this.f51001b = cls;
            this.f51003d = i11;
            this.f51002c = i12;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m18660a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo18642b(View view);

        /* JADX INFO: renamed from: c */
        public abstract void mo18643c(View view, T t10);

        /* JADX INFO: renamed from: d */
        public final T m18661d(View view) {
            if (Build.VERSION.SDK_INT >= this.f51002c) {
                return mo18642b(view);
            }
            T t10 = (T) view.getTag(this.f51000a);
            if (this.f51001b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final void m18662e(View view, T t10) {
            C10026a c10026a;
            if (Build.VERSION.SDK_INT >= this.f51002c) {
                mo18643c(view, t10);
                return;
            }
            if (mo18644f(m18661d(view), t10)) {
                View.AccessibilityDelegate accessibilityDelegateM18648d = C10029b0.m18648d(view);
                if (accessibilityDelegateM18648d == null) {
                    c10026a = null;
                } else {
                    c10026a = accessibilityDelegateM18648d instanceof C10026a.a ? ((C10026a.a) accessibilityDelegateM18648d).f50991a : new C10026a(accessibilityDelegateM18648d);
                }
                if (c10026a == null) {
                    c10026a = new C10026a();
                }
                C10029b0.m18658n(view, c10026a);
                view.setTag(this.f51000a, t10);
                C10029b0.m18652h(view, this.f51003d);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract boolean mo18644f(T t10, T t11);
    }

    /* JADX INFO: renamed from: x2.b0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static boolean m18663a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: renamed from: x2.b0$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeProvider m18664a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18665b(View view) {
            return view.getFitsSystemWindows();
        }

        /* JADX INFO: renamed from: c */
        public static int m18666c(View view) {
            return view.getImportantForAccessibility();
        }

        /* JADX INFO: renamed from: d */
        public static int m18667d(View view) {
            return view.getMinimumHeight();
        }

        /* JADX INFO: renamed from: e */
        public static int m18668e(View view) {
            return view.getMinimumWidth();
        }

        /* JADX INFO: renamed from: f */
        public static ViewParent m18669f(View view) {
            return view.getParentForAccessibility();
        }

        /* JADX INFO: renamed from: g */
        public static int m18670g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* JADX INFO: renamed from: h */
        public static boolean m18671h(View view) {
            return view.hasOverlappingRendering();
        }

        /* JADX INFO: renamed from: i */
        public static boolean m18672i(View view) {
            return view.hasTransientState();
        }

        /* JADX INFO: renamed from: j */
        public static boolean m18673j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        /* JADX INFO: renamed from: k */
        public static void m18674k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* JADX INFO: renamed from: l */
        public static void m18675l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: m */
        public static void m18676m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* JADX INFO: renamed from: n */
        public static void m18677n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        /* JADX INFO: renamed from: o */
        public static void m18678o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* JADX INFO: renamed from: p */
        public static void m18679p(View view) {
            view.requestFitSystemWindows();
        }

        /* JADX INFO: renamed from: q */
        public static void m18680q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* JADX INFO: renamed from: r */
        public static void m18681r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        /* JADX INFO: renamed from: s */
        public static void m18682s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* JADX INFO: renamed from: x2.b0$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static int m18683a() {
            return View.generateViewId();
        }

        /* JADX INFO: renamed from: b */
        public static Display m18684b(View view) {
            return view.getDisplay();
        }

        /* JADX INFO: renamed from: c */
        public static int m18685c(View view) {
            return view.getLabelFor();
        }

        /* JADX INFO: renamed from: d */
        public static int m18686d(View view) {
            return view.getLayoutDirection();
        }

        /* JADX INFO: renamed from: e */
        public static int m18687e(View view) {
            return view.getPaddingEnd();
        }

        /* JADX INFO: renamed from: f */
        public static int m18688f(View view) {
            return view.getPaddingStart();
        }

        /* JADX INFO: renamed from: g */
        public static boolean m18689g(View view) {
            return view.isPaddingRelative();
        }

        /* JADX INFO: renamed from: h */
        public static void m18690h(View view, int i10) {
            view.setLabelFor(i10);
        }

        /* JADX INFO: renamed from: i */
        public static void m18691i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* JADX INFO: renamed from: j */
        public static void m18692j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        /* JADX INFO: renamed from: k */
        public static void m18693k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: x2.b0$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static Rect m18694a(View view) {
            return view.getClipBounds();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18695b(View view) {
            return view.isInLayout();
        }

        /* JADX INFO: renamed from: c */
        public static void m18696c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: renamed from: x2.b0$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static int m18697a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18698b(View view) {
            return view.isAttachedToWindow();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m18699c(View view) {
            return view.isLaidOut();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m18700d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* JADX INFO: renamed from: e */
        public static void m18701e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        /* JADX INFO: renamed from: f */
        public static void m18702f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        /* JADX INFO: renamed from: g */
        public static void m18703g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: renamed from: x2.b0$h */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static WindowInsets m18704a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsets m18705b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        public static void m18706c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: x2.b0$i */
    public static class i {

        /* JADX INFO: renamed from: x2.b0$i$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public C10063s0 f51004a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f51005b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC10060r f51006c;

            public a(View view, InterfaceC10060r interfaceC10060r) {
                this.f51005b = view;
                this.f51006c = interfaceC10060r;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C10063s0 c10063s0M18863i = C10063s0.m18863i(view, windowInsets);
                int i10 = Build.VERSION.SDK_INT;
                InterfaceC10060r interfaceC10060r = this.f51006c;
                if (i10 < 30) {
                    i.m18707a(windowInsets, this.f51005b);
                    if (c10063s0M18863i.equals(this.f51004a)) {
                        return interfaceC10060r.mo2934c(view, c10063s0M18863i).m18870h();
                    }
                }
                this.f51004a = c10063s0M18863i;
                C10063s0 c10063s0Mo2934c = interfaceC10060r.mo2934c(view, c10063s0M18863i);
                if (i10 >= 30) {
                    return c10063s0Mo2934c.m18870h();
                }
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                h.m18706c(view);
                return c10063s0Mo2934c.m18870h();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m18707a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static C10063s0 m18708b(View view, C10063s0 c10063s0, Rect rect) {
            WindowInsets windowInsetsM18870h = c10063s0.m18870h();
            if (windowInsetsM18870h != null) {
                return C10063s0.m18863i(view, view.computeSystemWindowInsets(windowInsetsM18870h, rect));
            }
            rect.setEmpty();
            return c10063s0;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m18709c(View view, float f3, float f10, boolean z10) {
            return view.dispatchNestedFling(f3, f10, z10);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m18710d(View view, float f3, float f10) {
            return view.dispatchNestedPreFling(f3, f10);
        }

        /* JADX INFO: renamed from: e */
        public static boolean m18711e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m18712f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        /* JADX INFO: renamed from: g */
        public static ColorStateList m18713g(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: h */
        public static PorterDuff.Mode m18714h(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: i */
        public static float m18715i(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: j */
        public static C10063s0 m18716j(View view) {
            C10063s0.e cVar;
            if (C10063s0.a.f51081d) {
                if (view.isAttachedToWindow()) {
                    try {
                        Object obj = C10063s0.a.f51078a.get(view.getRootView());
                        if (obj != null) {
                            Rect rect = (Rect) C10063s0.a.f51079b.get(obj);
                            Rect rect2 = (Rect) C10063s0.a.f51080c.get(obj);
                            if (rect != null && rect2 != null) {
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 30) {
                                    cVar = new C10063s0.d();
                                } else {
                                    cVar = i10 >= 29 ? new C10063s0.c() : new C10063s0.b();
                                }
                                cVar.mo18873e(C8170b.m16218b(rect.left, rect.top, rect.right, rect.bottom));
                                cVar.mo18874g(C8170b.m16218b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                                C10063s0 c10063s0Mo18872b = cVar.mo18872b();
                                c10063s0Mo18872b.f51077a.mo18890p(c10063s0Mo18872b);
                                c10063s0Mo18872b.f51077a.mo18884d(view.getRootView());
                                return c10063s0Mo18872b;
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        public static String m18717k(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: l */
        public static float m18718l(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: m */
        public static float m18719m(View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: n */
        public static boolean m18720n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* JADX INFO: renamed from: o */
        public static boolean m18721o(View view) {
            return view.isImportantForAccessibility();
        }

        /* JADX INFO: renamed from: p */
        public static boolean m18722p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: q */
        public static void m18723q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: r */
        public static void m18724r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: s */
        public static void m18725s(View view, float f3) {
            view.setElevation(f3);
        }

        /* JADX INFO: renamed from: t */
        public static void m18726t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        /* JADX INFO: renamed from: u */
        public static void m18727u(View view, InterfaceC10060r interfaceC10060r) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, interfaceC10060r);
            }
            if (interfaceC10060r == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC10060r));
            }
        }

        /* JADX INFO: renamed from: v */
        public static void m18728v(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: w */
        public static void m18729w(View view, float f3) {
            view.setTranslationZ(f3);
        }

        /* JADX INFO: renamed from: x */
        public static void m18730x(View view, float f3) {
            view.setZ(f3);
        }

        /* JADX INFO: renamed from: y */
        public static boolean m18731y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        /* JADX INFO: renamed from: z */
        public static void m18732z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: x2.b0$j */
    public static class j {
        /* JADX INFO: renamed from: a */
        public static C10063s0 m18733a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C10063s0 c10063s0M18863i = C10063s0.m18863i(null, rootWindowInsets);
            C10063s0.k kVar = c10063s0M18863i.f51077a;
            kVar.mo18890p(c10063s0M18863i);
            kVar.mo18884d(view.getRootView());
            return c10063s0M18863i;
        }

        /* JADX INFO: renamed from: b */
        public static int m18734b(View view) {
            return view.getScrollIndicators();
        }

        /* JADX INFO: renamed from: c */
        public static void m18735c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        /* JADX INFO: renamed from: d */
        public static void m18736d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: x2.b0$k */
    public static class k {
        /* JADX INFO: renamed from: a */
        public static void m18737a(View view) {
            view.cancelDragAndDrop();
        }

        /* JADX INFO: renamed from: b */
        public static void m18738b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* JADX INFO: renamed from: c */
        public static void m18739c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* JADX INFO: renamed from: d */
        public static void m18740d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* JADX INFO: renamed from: e */
        public static boolean m18741e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        /* JADX INFO: renamed from: f */
        public static void m18742f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: renamed from: x2.b0$l */
    public static class l {
        /* JADX INFO: renamed from: a */
        public static void m18743a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        /* JADX INFO: renamed from: b */
        public static int m18744b(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: c */
        public static int m18745c(View view) {
            return view.getNextClusterForwardId();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m18746d(View view) {
            return view.hasExplicitFocusable();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m18747e(View view) {
            return view.isFocusedByDefault();
        }

        /* JADX INFO: renamed from: f */
        public static boolean m18748f(View view) {
            return view.isImportantForAutofill();
        }

        /* JADX INFO: renamed from: g */
        public static boolean m18749g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* JADX INFO: renamed from: h */
        public static View m18750h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        /* JADX INFO: renamed from: i */
        public static boolean m18751i(View view) {
            return view.restoreDefaultFocus();
        }

        /* JADX INFO: renamed from: j */
        public static void m18752j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* JADX INFO: renamed from: k */
        public static void m18753k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        /* JADX INFO: renamed from: l */
        public static void m18754l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        /* JADX INFO: renamed from: m */
        public static void m18755m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        /* JADX INFO: renamed from: n */
        public static void m18756n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        /* JADX INFO: renamed from: o */
        public static void m18757o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: x2.b0$m */
    public static class m {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x2.c0] */
        /* JADX INFO: renamed from: a */
        public static void m18758a(View view, final r rVar) {
            C8452h c8452h = (C8452h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c8452h == null) {
                c8452h = new C8452h();
                view.setTag(R.id.tag_unhandled_key_listeners, c8452h);
            }
            Objects.requireNonNull(rVar);
            ?? r10 = new View.OnUnhandledKeyEventListener() { // from class: x2.c0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return rVar.m18776a();
                }
            };
            c8452h.put(rVar, r10);
            view.addOnUnhandledKeyEventListener(r10);
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m18759b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m18760c(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m18761d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: e */
        public static void m18762e(View view, r rVar) {
            C8452h c8452h = (C8452h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c8452h == null) {
                return;
            }
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListenerM141l = C0026e.m141l(c8452h.getOrDefault(rVar, null));
            if (onUnhandledKeyEventListenerM141l != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListenerM141l);
            }
        }

        /* JADX INFO: renamed from: f */
        public static <T> T m18763f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        /* JADX INFO: renamed from: g */
        public static void m18764g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* JADX INFO: renamed from: h */
        public static void m18765h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: i */
        public static void m18766i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: renamed from: x2.b0$n */
    public static class n {
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m18767a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        public static List<Rect> m18768b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* JADX INFO: renamed from: c */
        public static void m18769c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        /* JADX INFO: renamed from: d */
        public static void m18770d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: x2.b0$o */
    public static class o {
        /* JADX INFO: renamed from: a */
        public static CharSequence m18771a(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m18772b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: x2.b0$p */
    public static final class p {
        /* JADX INFO: renamed from: a */
        public static String[] m18773a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* JADX INFO: renamed from: b */
        public static C10030c m18774b(View view, C10030c c10030c) {
            ContentInfo contentInfoMo18784b = c10030c.f51012a.mo18784b();
            Objects.requireNonNull(contentInfoMo18784b);
            ContentInfo contentInfoM12355h = C5939v.m12355h(contentInfoMo18784b);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM12355h);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM12355h ? c10030c : new C10030c(new C10030c.d(contentInfoPerformReceiveContent));
        }

        /* JADX INFO: renamed from: c */
        public static void m18775c(View view, String[] strArr, InterfaceC10062s interfaceC10062s) {
            if (interfaceC10062s == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(interfaceC10062s));
            }
        }
    }

    /* JADX INFO: renamed from: x2.b0$q */
    public static final class q implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a */
        public final InterfaceC10062s f51007a;

        public q(InterfaceC10062s interfaceC10062s) {
            this.f51007a = interfaceC10062s;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C10030c c10030c = new C10030c(new C10030c.d(contentInfo));
            C10030c c10030cMo4864a = this.f51007a.mo4864a(view, c10030c);
            if (c10030cMo4864a == null) {
                return null;
            }
            if (c10030cMo4864a == c10030c) {
                return contentInfo;
            }
            ContentInfo contentInfoMo18784b = c10030cMo4864a.f51012a.mo18784b();
            Objects.requireNonNull(contentInfoMo18784b);
            return C5939v.m12355h(contentInfoMo18784b);
        }
    }

    /* JADX INFO: renamed from: x2.b0$r */
    public interface r {
        /* JADX INFO: renamed from: a */
        boolean m18776a();
    }

    /* JADX INFO: renamed from: x2.b0$s */
    public static class s {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f51008d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public WeakHashMap<View, Boolean> f51009a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f51010b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f51011c = null;

        /* JADX INFO: renamed from: b */
        public static boolean m18777b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).m18776a()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public final View m18778a(View view, KeyEvent keyEvent) {
            View viewM18778a;
            WeakHashMap<View, Boolean> weakHashMap = this.f51009a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    do {
                        childCount--;
                        if (childCount >= 0) {
                            viewM18778a = m18778a(viewGroup.getChildAt(childCount), keyEvent);
                        }
                    } while (viewM18778a == null);
                    return viewM18778a;
                }
                if (m18777b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [x2.w] */
    static {
        new AtomicInteger(1);
        f50993a = null;
        f50995c = false;
        f50996d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f50997e = new InterfaceC10064t() { // from class: x2.w
            @Override // p471x2.InterfaceC10064t
            /* JADX INFO: renamed from: a */
            public final C10030c mo990a(C10030c c10030c) {
                return c10030c;
            }
        };
        f50998f = new a();
    }

    /* JADX INFO: renamed from: a */
    public static C10049l0 m18645a(View view) {
        if (f50993a == null) {
            f50993a = new WeakHashMap<>();
        }
        C10049l0 c10049l0 = f50993a.get(view);
        if (c10049l0 != null) {
            return c10049l0;
        }
        C10049l0 c10049l1 = new C10049l0(view);
        f50993a.put(view, c10049l1);
        return c10049l1;
    }

    /* JADX INFO: renamed from: b */
    public static C10063s0 m18646b(View view, C10063s0 c10063s0) {
        WindowInsets windowInsetsM18870h = c10063s0.m18870h();
        if (windowInsetsM18870h != null) {
            WindowInsets windowInsetsM18704a = h.m18704a(view, windowInsetsM18870h);
            if (!windowInsetsM18704a.equals(windowInsetsM18870h)) {
                return C10063s0.m18863i(view, windowInsetsM18704a);
            }
        }
        return c10063s0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18647c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f51008d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f51009a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f51008d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f51009a == null) {
                        sVar.f51009a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    loop0: while (true) {
                        while (true) {
                            size--;
                            if (size < 0) {
                                break loop0;
                            }
                            ArrayList<WeakReference<View>> arrayList3 = s.f51008d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                sVar.f51009a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    sVar.f51009a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
        }
        View viewM18778a = sVar.m18778a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM18778a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f51010b == null) {
                    sVar.f51010b = new SparseArray<>();
                }
                sVar.f51010b.put(keyCode, new WeakReference<>(viewM18778a));
            }
        }
        return viewM18778a != null;
    }

    /* JADX INFO: renamed from: d */
    public static View.AccessibilityDelegate m18648d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.m18767a(view);
        }
        if (f50995c) {
            return null;
        }
        if (f50994b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f50994b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f50995c = true;
                return null;
            }
        }
        try {
            Object obj = f50994b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
        } catch (Throwable unused2) {
            f50995c = true;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m18649e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = m.m18759b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m18650f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m18651g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.m18773a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: h */
    public static void m18652h(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m18649e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (g.m18697a(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                accessibilityEventObtain.setEventType(i11);
                g.m18703g(accessibilityEventObtain, i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(m18649e(view));
                    if (d.m18666c(view) == 0) {
                        d.m18682s(view, 1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (d.m18666c((View) parent) == 4) {
                            d.m18682s(view, 2);
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        g.m18701e(view.getParent(), view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            g.m18703g(accessibilityEventObtain2, i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m18649e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C10063s0 m18653i(View view, C10063s0 c10063s0) {
        WindowInsets windowInsetsM18870h = c10063s0.m18870h();
        if (windowInsetsM18870h != null) {
            WindowInsets windowInsetsM18705b = h.m18705b(view, windowInsetsM18870h);
            if (!windowInsetsM18705b.equals(windowInsetsM18870h)) {
                return C10063s0.m18863i(view, windowInsetsM18705b);
            }
        }
        return c10063s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static C10030c m18654j(View view, C10030c c10030c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c10030c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.m18774b(view, c10030c);
        }
        InterfaceC10062s interfaceC10062s = (InterfaceC10062s) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC10064t interfaceC10064t = f50997e;
        if (interfaceC10062s == null) {
            if (view instanceof InterfaceC10064t) {
                interfaceC10064t = (InterfaceC10064t) view;
            }
            return interfaceC10064t.mo990a(c10030c);
        }
        C10030c c10030cMo4864a = interfaceC10062s.mo4864a(view, c10030c);
        if (c10030cMo4864a == null) {
            return null;
        }
        if (view instanceof InterfaceC10064t) {
            interfaceC10064t = (InterfaceC10064t) view;
        }
        return interfaceC10064t.mo990a(c10030cMo4864a);
    }

    /* JADX INFO: renamed from: k */
    public static void m18655k(View view, int i10) {
        ArrayList arrayListM18650f = m18650f(view);
        for (int i11 = 0; i11 < arrayListM18650f.size(); i11++) {
            if (((C10284f.a) arrayListM18650f.get(i11)).m19273a() == i10) {
                arrayListM18650f.remove(i11);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m18656l(View view, C10284f.a aVar, InterfaceC10288j interfaceC10288j) {
        C10026a c10026a;
        if (interfaceC10288j == null) {
            m18655k(view, aVar.m19273a());
            m18652h(view, 0);
            return;
        }
        C10284f.a aVar2 = new C10284f.a(null, aVar.f51756b, null, interfaceC10288j, aVar.f51757c);
        View.AccessibilityDelegate accessibilityDelegateM18648d = m18648d(view);
        if (accessibilityDelegateM18648d == null) {
            c10026a = null;
        } else {
            c10026a = accessibilityDelegateM18648d instanceof C10026a.a ? ((C10026a.a) accessibilityDelegateM18648d).f50991a : new C10026a(accessibilityDelegateM18648d);
        }
        if (c10026a == null) {
            c10026a = new C10026a();
        }
        m18658n(view, c10026a);
        m18655k(view, aVar2.m19273a());
        m18650f(view).add(aVar2);
        m18652h(view, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m18657m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.m18769c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m18658n(View view, C10026a c10026a) {
        if (c10026a == null && (m18648d(view) instanceof C10026a.a)) {
            c10026a = new C10026a();
        }
        view.setAccessibilityDelegate(c10026a == null ? null : c10026a.f50990b);
    }

    /* JADX INFO: renamed from: o */
    public static void m18659o(View view, CharSequence charSequence) {
        new C10071y().m18662e(view, charSequence);
        a aVar = f50998f;
        if (charSequence != null) {
            aVar.f50999a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.m18698b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        } else {
            aVar.f50999a.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            d.m18678o(view.getViewTreeObserver(), aVar);
        }
    }
}
