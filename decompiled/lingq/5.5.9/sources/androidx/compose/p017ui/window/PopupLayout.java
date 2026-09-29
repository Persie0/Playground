package androidx.compose.p017ui.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p017ui.platform.AbstractComposeView;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.ViewTreeLifecycleOwner;
import androidx.view.ViewTreeViewModelStoreOwner;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.linguist.R;
import dm.C5207g;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import p081e0.AbstractC5311g;
import p081e0.C5331q;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5647k;
import p338qd.C8573r0;
import p375s0.C8941c;
import p385sf.C9000b;
import p470x1.C10020h;
import p470x1.C10021i;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import p521z1.C10430d;
import p521z1.C10432f;
import p521z1.C10433g;
import p521z1.C10435i;
import p521z1.C10436j;
import p521z1.InterfaceC10431e;
import p521z1.InterfaceC10434h;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView {

    /* JADX INFO: renamed from: H */
    public final InterfaceC10431e f4731H;

    /* JADX INFO: renamed from: I */
    public final WindowManager f4732I;

    /* JADX INFO: renamed from: J */
    public final WindowManager.LayoutParams f4733J;

    /* JADX INFO: renamed from: K */
    public InterfaceC10434h f4734K;

    /* JADX INFO: renamed from: L */
    public LayoutDirection f4735L;

    /* JADX INFO: renamed from: M */
    public final ParcelableSnapshotMutableState f4736M;

    /* JADX INFO: renamed from: N */
    public final ParcelableSnapshotMutableState f4737N;

    /* JADX INFO: renamed from: O */
    public C10021i f4738O;

    /* JADX INFO: renamed from: P */
    public final DerivedSnapshotState f4739P;

    /* JADX INFO: renamed from: Q */
    public final Rect f4740Q;

    /* JADX INFO: renamed from: R */
    public final ParcelableSnapshotMutableState f4741R;

    /* JADX INFO: renamed from: S */
    public boolean f4742S;

    /* JADX INFO: renamed from: T */
    public final int[] f4743T;

    /* JADX INFO: renamed from: i */
    public InterfaceC2041a<C9072e> f4744i;

    /* JADX INFO: renamed from: j */
    public C10435i f4745j;

    /* JADX INFO: renamed from: k */
    public String f4746k;

    /* JADX INFO: renamed from: l */
    public final View f4747l;

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$a */
    public /* synthetic */ class C0715a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4750a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4750a = iArr;
        }
    }

    public PopupLayout() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(InterfaceC2041a interfaceC2041a, C10435i c10435i, String str, View view, InterfaceC10015c interfaceC10015c, InterfaceC10434h interfaceC10434h, UUID uuid) {
        InterfaceC10431e c10432f = Build.VERSION.SDK_INT >= 29 ? new C10432f() : new C10433g();
        C5207g.m11111f(c10435i, "properties");
        C5207g.m11111f(str, "testTag");
        C5207g.m11111f(view, "composeView");
        C5207g.m11111f(interfaceC10015c, "density");
        C5207g.m11111f(interfaceC10434h, "initialPositionProvider");
        Context context = view.getContext();
        C5207g.m11110e(context, "composeView.context");
        super(context, null, 6, 0);
        this.f4744i = interfaceC2041a;
        this.f4745j = c10435i;
        this.f4746k = str;
        this.f4747l = view;
        this.f4731H = c10432f;
        Object systemService = view.getContext().getSystemService("window");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f4732I = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f4733J = layoutParams;
        this.f4734K = interfaceC10434h;
        this.f4735L = LayoutDirection.Ltr;
        this.f4736M = C8573r0.m16684L0(null);
        this.f4737N = C8573r0.m16684L0(null);
        this.f4739P = C8573r0.m16713a0(new InterfaceC2041a<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Boolean mo807E() {
                PopupLayout popupLayout = this.f4751b;
                return Boolean.valueOf((popupLayout.getParentLayoutCoordinates() == null || popupLayout.m19589getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.f4740Q = new Rect();
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.m3912b(this, ViewTreeLifecycleOwner.m3911a(view));
        ViewTreeViewModelStoreOwner.m3914b(this, ViewTreeViewModelStoreOwner.m3913a(view));
        ViewTreeSavedStateRegistryOwner.m4583b(this, ViewTreeSavedStateRegistryOwner.m4582a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC10015c.mo1463i0((float) 8));
        setOutlineProvider(new C10430d());
        this.f4741R = C8573r0.m16684L0(ComposableSingletons$AndroidPopup_androidKt.f4729a);
        this.f4743T = new int[2];
    }

    private final InterfaceC2056p<InterfaceC0476a, Integer, C9072e> getContent() {
        return (InterfaceC2056p) this.f4741R.getValue();
    }

    private final int getDisplayHeight() {
        return C8573r0.m16710Y0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return C8573r0.m16710Y0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5647k getParentLayoutCoordinates() {
        return (InterfaceC5647k) this.f4737N.getValue();
    }

    private final void setClippingEnabled(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f4733J;
        layoutParams.flags = z10 ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.f4731H.mo19405a(this.f4732I, this, layoutParams);
    }

    private final void setContent(InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p) {
        this.f4741R.setValue(interfaceC2056p);
    }

    private final void setIsFocusable(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.f4733J;
        layoutParams.flags = !z10 ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.f4731H.mo19405a(this.f4732I, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(InterfaceC5647k interfaceC5647k) {
        this.f4737N.setValue(interfaceC5647k);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        C5331q c5331q = AndroidPopup_androidKt.f4691a;
        View view = this.f4747l;
        C5207g.m11111f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z10 = true;
        boolean z11 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        C5207g.m11111f(secureFlagPolicy, "<this>");
        int i10 = C10436j.f52278a[secureFlagPolicy.ordinal()];
        if (i10 == 1) {
            z10 = false;
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z10 = z11;
        }
        WindowManager.LayoutParams layoutParams3 = this.f4733J;
        layoutParams3.flags = z10 ? layoutParams3.flags | 8192 : layoutParams3.flags & (-8193);
        this.f4731H.mo19405a(this.f4732I, this, layoutParams3);
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: a */
    public final void mo2240a(InterfaceC0476a interfaceC0476a, final int i10) {
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-857613600);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        getContent().mo1337m0(composerImplMo1636j, 0);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                this.f4748b.mo2240a(interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C5207g.m11111f(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.f4745j.f52272b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC2041a<C9072e> interfaceC2041a = this.f4744i;
                if (interfaceC2041a != null) {
                    interfaceC2041a.mo807E();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: e */
    public final void mo2244e(boolean z10, int i10, int i11, int i12, int i13) {
        super.mo2244e(z10, i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f4733J;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f4731H.mo19405a(this.f4732I, this, layoutParams);
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: f */
    public final void mo2245f(int i10, int i11) {
        if (this.f4745j.f52277g) {
            super.mo2245f(i10, i11);
        } else {
            super.mo2245f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f4739P.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f4733J;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f4735L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C10022j m19589getPopupContentSizebOM6tXw() {
        return (C10022j) this.f4736M.getValue();
    }

    public final InterfaceC10434h getPositionProvider() {
        return this.f4734K;
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f4742S;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f4746k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m2621j(AbstractC5311g abstractC5311g, ComposableLambdaImpl composableLambdaImpl) {
        C5207g.m11111f(abstractC5311g, "parent");
        setParentCompositionContext(abstractC5311g);
        setContent(composableLambdaImpl);
        this.f4742S = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final void m2622k(InterfaceC2041a<C9072e> interfaceC2041a, C10435i c10435i, String str, LayoutDirection layoutDirection) {
        C5207g.m11111f(c10435i, "properties");
        C5207g.m11111f(str, "testTag");
        C5207g.m11111f(layoutDirection, "layoutDirection");
        this.f4744i = interfaceC2041a;
        this.f4745j = c10435i;
        this.f4746k = str;
        setIsFocusable(c10435i.f52271a);
        setSecurePolicy(c10435i.f52274d);
        setClippingEnabled(c10435i.f52276f);
        int i10 = C0715a.f4750a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    /* JADX INFO: renamed from: l */
    public final void m2623l() {
        InterfaceC5647k parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jMo2175c = parentLayoutCoordinates.mo2175c();
        long jMo2173b = parentLayoutCoordinates.mo2173b(C8941c.f46888b);
        long jM16752r = C8573r0.m16752r(C8573r0.m16710Y0(C8941c.m17164c(jMo2173b)), C8573r0.m16710Y0(C8941c.m17165d(jMo2173b)));
        int i10 = (int) (jM16752r >> 32);
        C10021i c10021i = new C10021i(i10, C10020h.m18625a(jM16752r), ((int) (jMo2175c >> 32)) + i10, C10022j.m18628b(jMo2175c) + C10020h.m18625a(jM16752r));
        if (C5207g.m11106a(c10021i, this.f4738O)) {
            return;
        }
        this.f4738O = c10021i;
        m2625n();
    }

    /* JADX INFO: renamed from: m */
    public final void m2624m(InterfaceC5647k interfaceC5647k) {
        setParentLayoutCoordinates(interfaceC5647k);
        m2623l();
    }

    /* JADX INFO: renamed from: n */
    public final void m2625n() {
        C10021i c10021i = this.f4738O;
        if (c10021i == null) {
            return;
        }
        C10022j c10022jM19589getPopupContentSizebOM6tXw = m19589getPopupContentSizebOM6tXw();
        if (c10022jM19589getPopupContentSizebOM6tXw != null) {
            long j10 = c10022jM19589getPopupContentSizebOM6tXw.f50980a;
            InterfaceC10431e interfaceC10431e = this.f4731H;
            View view = this.f4747l;
            Rect rect = this.f4740Q;
            interfaceC10431e.mo19407c(view, rect);
            C5331q c5331q = AndroidPopup_androidKt.f4691a;
            int i10 = rect.left;
            int i11 = rect.top;
            long jM17236a = C9000b.m17236a(rect.right - i10, rect.bottom - i11);
            long jMo5368a = this.f4734K.mo5368a(c10021i, jM17236a, this.f4735L, j10);
            WindowManager.LayoutParams layoutParams = this.f4733J;
            int i12 = C10020h.f50974c;
            layoutParams.x = (int) (jMo5368a >> 32);
            layoutParams.y = C10020h.m18625a(jMo5368a);
            if (this.f4745j.f52275e) {
                interfaceC10431e.mo19406b(this, (int) (jM17236a >> 32), C10022j.m18628b(jM17236a));
            }
            interfaceC10431e.mo19405a(this.f4732I, this, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4745j.f52273c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z10 = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC2041a<C9072e> interfaceC2041a = this.f4744i;
            if (interfaceC2041a != null) {
                interfaceC2041a.mo807E();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z10 = true;
        }
        if (!z10) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC2041a<C9072e> interfaceC2041a2 = this.f4744i;
        if (interfaceC2041a2 != null) {
            interfaceC2041a2.mo807E();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "<set-?>");
        this.f4735L = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m19590setPopupContentSizefhxjrPA(C10022j c10022j) {
        this.f4736M.setValue(c10022j);
    }

    public final void setPositionProvider(InterfaceC10434h interfaceC10434h) {
        C5207g.m11111f(interfaceC10434h, "<set-?>");
        this.f4734K = interfaceC10434h;
    }

    public final void setTestTag(String str) {
        C5207g.m11111f(str, "<set-?>");
        this.f4746k = str;
    }
}
