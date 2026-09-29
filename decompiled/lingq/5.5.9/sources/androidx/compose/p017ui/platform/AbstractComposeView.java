package androidx.compose.p017ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.Recomposer;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.linguist.R;
import dm.C5207g;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.android.C7080a;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7818b1;
import no.C7832g0;
import no.C7848l1;
import p062d3.InterfaceC5041a;
import p081e0.AbstractC5311g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5308f;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p307oo.C8102f;
import p338qd.C8573r0;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public WeakReference<AbstractC5311g> f3927a;

    /* JADX INFO: renamed from: b */
    public IBinder f3928b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5308f f3929c;

    /* JADX INFO: renamed from: d */
    public AbstractC5311g f3930d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2041a<C9072e> f3931e;

    /* JADX INFO: renamed from: f */
    public boolean f3932f;

    /* JADX INFO: renamed from: g */
    public boolean f3933g;

    /* JADX INFO: renamed from: h */
    public boolean f3934h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        C5207g.m11111f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C5207g.m11111f(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        final ViewOnAttachStateChangeListenerC0638k1 viewOnAttachStateChangeListenerC0638k1 = new ViewOnAttachStateChangeListenerC0638k1(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0638k1);
        final C0641l1 c0641l1 = new C0641l1(this);
        C8573r0.m16756s0(this).f32873a.add(c0641l1);
        this.f3931e = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                AbstractComposeView abstractComposeView = this.f4201b;
                abstractComposeView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0638k1);
                InterfaceC5041a interfaceC5041a = c0641l1;
                C5207g.m11111f(interfaceC5041a, "listener");
                C8573r0.m16756s0(abstractComposeView).f32873a.remove(interfaceC5041a);
                return C9072e.f47360a;
            }
        };
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2239g(AbstractC5311g abstractC5311g) {
        if ((abstractC5311g instanceof Recomposer) && ((Recomposer.State) ((Recomposer) abstractC5311g).f3066o.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC5311g abstractC5311g) {
        if (this.f3930d != abstractC5311g) {
            this.f3930d = abstractC5311g;
            if (abstractC5311g != null) {
                this.f3927a = null;
            }
            InterfaceC5308f interfaceC5308f = this.f3929c;
            if (interfaceC5308f != null) {
                interfaceC5308f.mo1722a();
                this.f3929c = null;
                if (isAttachedToWindow()) {
                    m2243d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f3928b != iBinder) {
            this.f3928b = iBinder;
            this.f3927a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2240a(InterfaceC0476a interfaceC0476a, int i10);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m2241b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        m2241b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        m2241b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m2241b();
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m2241b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m2241b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        m2241b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m2241b() {
        if (this.f3933g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: c */
    public final void m2242c() {
        InterfaceC5308f interfaceC5308f = this.f3929c;
        if (interfaceC5308f != null) {
            interfaceC5308f.mo1722a();
        }
        this.f3929c = null;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: d */
    public final void m2243d() {
        if (this.f3929c == null) {
            try {
                this.f3933g = true;
                this.f3929c = C0617d2.m2347a(this, m2246h(), C7204a.m14523c(-656146368, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                        InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                            interfaceC0476a2.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                            this.f3935b.mo2240a(interfaceC0476a2, 8);
                        }
                        return C9072e.f47360a;
                    }
                }, true));
            } finally {
                this.f3933g = false;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo2244e(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo2245f(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f3929c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f3932f;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[LOOP:1: B:35:0x0071->B:40:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x008d A[EDGE_INSN: B:79:0x008d->B:42:0x008d BREAK  A[LOOP:1: B:35:0x0071->B:40:0x0083], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0142, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final AbstractC5311g m2246h() {
        AbstractC5311g abstractC5311gM2330b;
        WeakReference<AbstractC5311g> weakReference;
        Object parent;
        View view;
        AbstractC5311g abstractC5311gM2330b2;
        C7080a c7080a;
        C0596xbfd085b3 c0596xbfd085b3;
        CoroutineContext coroutineContext;
        CoroutineStart coroutineStart;
        CoroutineContext coroutineContextM14307a;
        C7178b c7178b;
        C7848l1 c7848l1;
        View view2;
        AbstractC5311g abstractC5311g;
        AbstractC5311g abstractC5311g2 = this.f3930d;
        if (abstractC5311g2 == null) {
            abstractC5311gM2330b = C0604a2.m2330b(this);
            if (abstractC5311gM2330b == null) {
                ViewParent parent2 = getParent();
                while (true) {
                    if (abstractC5311gM2330b != null || !(parent2 instanceof View)) {
                        abstractC5311gM2330b = abstractC5311gM2330b;
                        break;
                    }
                    abstractC5311gM2330b = abstractC5311gM2330b;
                    abstractC5311gM2330b = C0604a2.m2330b((View) parent2);
                    parent2 = parent2.getParent();
                }
            }
            AbstractC5311g abstractC5311g3 = null;
            if (abstractC5311gM2330b != null) {
                AbstractC5311g abstractC5311g4 = m2239g(abstractC5311gM2330b) ? abstractC5311gM2330b : null;
                if (abstractC5311g4 != null) {
                    this.f3927a = new WeakReference<>(abstractC5311g4);
                }
                if (abstractC5311g2 == null) {
                    weakReference = this.f3927a;
                    if (weakReference != null || (abstractC5311g = weakReference.get()) == null || !m2239g(abstractC5311g)) {
                        abstractC5311g2 = abstractC5311gM2330b;
                        abstractC5311g2 = abstractC5311gM2330b;
                        abstractC5311g2 = abstractC5311gM2330b;
                        abstractC5311g2 = null;
                    }
                    if (abstractC5311g2 == null) {
                        if (isAttachedToWindow()) {
                            abstractC5311g2 = abstractC5311gM2330b;
                            abstractC5311g2 = abstractC5311g;
                            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                        }
                        abstractC5311g2 = abstractC5311gM2330b;
                        abstractC5311g2 = abstractC5311g;
                        parent = getParent();
                        view = this;
                        while (parent instanceof View) {
                            view2 = (View) parent;
                            if (view2.getId() == 16908290) {
                                break;
                            }
                            view = view2;
                            parent = view2.getParent();
                        }
                        abstractC5311gM2330b2 = C0604a2.m2330b(view);
                        if (abstractC5311gM2330b2 == null) {
                            Recomposer recomposerMo2495a = C0677x1.f4387a.get().mo2495a(view);
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerMo2495a);
                            Handler handler = view.getHandler();
                            C5207g.m11110e(handler, "rootView.handler");
                            int i10 = C8102f.f43924a;
                            c7080a = new C7080a(handler, "windowRecomposer cleanup", false);
                            c0596xbfd085b3 = new C0596xbfd085b3(recomposerMo2495a, view, null);
                            if ((2 & 1) != 0) {
                                coroutineContext = EmptyCoroutineContext.f38093a;
                            } else {
                                coroutineContext = c7080a.f40006f;
                            }
                            if ((2 & 2) != 0) {
                                coroutineStart = CoroutineStart.DEFAULT;
                            } else {
                                coroutineStart = null;
                            }
                            coroutineContextM14307a = CoroutineContextKt.m14307a(EmptyCoroutineContext.f38093a, coroutineContext, true);
                            c7178b = C7832g0.f42930a;
                            if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(InterfaceC9969d.a.f50692a) == null) {
                                coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
                            }
                            if (coroutineStart.isLazy()) {
                                c7848l1 = new C7818b1(coroutineContextM14307a, c0596xbfd085b3);
                            } else {
                                c7848l1 = new C7848l1(coroutineContextM14307a, true);
                            }
                            coroutineStart.invoke(c0596xbfd085b3, c7848l1, c7848l1);
                            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0674w1(c7848l1));
                            abstractC5311g2 = recomposerMo2495a;
                        } else {
                            if (abstractC5311gM2330b2 instanceof Recomposer) {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                            }
                            abstractC5311g2 = (Recomposer) abstractC5311gM2330b2;
                        }
                        if (m2239g(abstractC5311g2)) {
                            abstractC5311g3 = abstractC5311g2;
                        }
                        if (abstractC5311g3 != null) {
                            this.f3927a = new WeakReference<>(abstractC5311g3);
                        }
                    }
                }
            } else {
                abstractC5311gM2330b = null;
            }
            abstractC5311g2 = abstractC5311gM2330b;
            if (abstractC5311g2 == null) {
                weakReference = this.f3927a;
                if (weakReference != null) {
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = null;
                } else {
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = null;
                }
                if (abstractC5311g2 == null) {
                    if (isAttachedToWindow()) {
                        abstractC5311g2 = abstractC5311gM2330b;
                        abstractC5311g2 = abstractC5311g;
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    abstractC5311g2 = abstractC5311gM2330b;
                    abstractC5311g2 = abstractC5311g;
                    parent = getParent();
                    view = this;
                    while (parent instanceof View) {
                        view2 = (View) parent;
                        if (view2.getId() == 16908290) {
                            break;
                            break;
                        }
                        view = view2;
                        parent = view2.getParent();
                    }
                    abstractC5311gM2330b2 = C0604a2.m2330b(view);
                    if (abstractC5311gM2330b2 == null) {
                        Recomposer recomposerMo2495a2 = C0677x1.f4387a.get().mo2495a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerMo2495a2);
                        Handler handler2 = view.getHandler();
                        C5207g.m11110e(handler2, "rootView.handler");
                        int i11 = C8102f.f43924a;
                        c7080a = new C7080a(handler2, "windowRecomposer cleanup", false);
                        c0596xbfd085b3 = new C0596xbfd085b3(recomposerMo2495a2, view, null);
                        if ((2 & 1) != 0) {
                            coroutineContext = EmptyCoroutineContext.f38093a;
                        } else {
                            coroutineContext = c7080a.f40006f;
                        }
                        if ((2 & 2) != 0) {
                            coroutineStart = CoroutineStart.DEFAULT;
                        } else {
                            coroutineStart = null;
                        }
                        coroutineContextM14307a = CoroutineContextKt.m14307a(EmptyCoroutineContext.f38093a, coroutineContext, true);
                        c7178b = C7832g0.f42930a;
                        if (coroutineContextM14307a != c7178b) {
                            coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
                        }
                        if (coroutineStart.isLazy()) {
                            c7848l1 = new C7818b1(coroutineContextM14307a, c0596xbfd085b3);
                        } else {
                            c7848l1 = new C7848l1(coroutineContextM14307a, true);
                        }
                        coroutineStart.invoke(c0596xbfd085b3, c7848l1, c7848l1);
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0674w1(c7848l1));
                        abstractC5311g2 = recomposerMo2495a2;
                    } else {
                        if (abstractC5311gM2330b2 instanceof Recomposer) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        abstractC5311g2 = (Recomposer) abstractC5311gM2330b2;
                    }
                    if (m2239g(abstractC5311g2)) {
                        abstractC5311g3 = abstractC5311g2;
                    }
                    if (abstractC5311g3 != null) {
                        this.f3927a = new WeakReference<>(abstractC5311g3);
                    }
                }
            }
        }
        abstractC5311g2 = abstractC5311gM2330b;
        abstractC5311g2 = abstractC5311g;
        abstractC5311g2 = abstractC5311gM2330b;
        return abstractC5311g2;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f3934h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m2243d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mo2244e(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m2243d();
        mo2245f(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC5311g abstractC5311g) {
        setParentContext(abstractC5311g);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f3932f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC0549h) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f3934h = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        C5207g.m11111f(viewCompositionStrategy, "strategy");
        InterfaceC2041a<C9072e> interfaceC2041a = this.f3931e;
        if (interfaceC2041a != null) {
            interfaceC2041a.mo807E();
        }
        this.f3931e = viewCompositionStrategy.mo2322a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
