package p080e;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.InterfaceC0305d0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p058d.C4999a;
import p080e.C5292x;
import p164i.AbstractC6100a;
import p164i.C6105f;
import p164i.C6106g;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10053n0;
import p471x2.InterfaceC10055o0;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5292x extends AbstractC5269a implements ActionBarOverlayLayout.InterfaceC0236d {

    /* JADX INFO: renamed from: a */
    public Context f33530a;

    /* JADX INFO: renamed from: b */
    public Context f33531b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f33532c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f33533d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0305d0 f33534e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f33535f;

    /* JADX INFO: renamed from: g */
    public final View f33536g;

    /* JADX INFO: renamed from: h */
    public boolean f33537h;

    /* JADX INFO: renamed from: i */
    public d f33538i;

    /* JADX INFO: renamed from: j */
    public d f33539j;

    /* JADX INFO: renamed from: k */
    public AbstractC6100a.a f33540k;

    /* JADX INFO: renamed from: l */
    public boolean f33541l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<AbstractC5269a.b> f33542m;

    /* JADX INFO: renamed from: n */
    public boolean f33543n;

    /* JADX INFO: renamed from: o */
    public int f33544o;

    /* JADX INFO: renamed from: p */
    public boolean f33545p;

    /* JADX INFO: renamed from: q */
    public boolean f33546q;

    /* JADX INFO: renamed from: r */
    public boolean f33547r;

    /* JADX INFO: renamed from: s */
    public boolean f33548s;

    /* JADX INFO: renamed from: t */
    public C6106g f33549t;

    /* JADX INFO: renamed from: u */
    public boolean f33550u;

    /* JADX INFO: renamed from: v */
    public boolean f33551v;

    /* JADX INFO: renamed from: w */
    public final a f33552w;

    /* JADX INFO: renamed from: x */
    public final b f33553x;

    /* JADX INFO: renamed from: y */
    public final c f33554y;

    /* JADX INFO: renamed from: z */
    public static final AccelerateInterpolator f33529z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public static final DecelerateInterpolator f33528A = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e.x$a */
    public class a extends C10053n0 {
        public a() {
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            View view;
            C5292x c5292x = C5292x.this;
            if (c5292x.f33545p && (view = c5292x.f33536g) != null) {
                view.setTranslationY(0.0f);
                c5292x.f33533d.setTranslationY(0.0f);
            }
            c5292x.f33533d.setVisibility(8);
            c5292x.f33533d.setTransitioning(false);
            c5292x.f33549t = null;
            AbstractC6100a.a aVar = c5292x.f33540k;
            if (aVar != null) {
                aVar.mo11377b(c5292x.f33539j);
                c5292x.f33539j = null;
                c5292x.f33540k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c5292x.f33532c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.h.m18706c(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e.x$b */
    public class b extends C10053n0 {
        public b() {
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            C5292x c5292x = C5292x.this;
            c5292x.f33549t = null;
            c5292x.f33533d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: e.x$c */
    public class c implements InterfaceC10055o0 {
        public c() {
        }
    }

    /* JADX INFO: renamed from: e.x$d */
    public class d extends AbstractC6100a implements C0224f.a {

        /* JADX INFO: renamed from: c */
        public final Context f33558c;

        /* JADX INFO: renamed from: d */
        public final C0224f f33559d;

        /* JADX INFO: renamed from: e */
        public AbstractC6100a.a f33560e;

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f33561f;

        public d(Context context, LayoutInflaterFactory2C5275g.d dVar) {
            this.f33558c = context;
            this.f33560e = dVar;
            C0224f c0224f = new C0224f(context);
            c0224f.f704l = 1;
            this.f33559d = c0224f;
            c0224f.f697e = this;
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
            AbstractC6100a.a aVar = this.f33560e;
            if (aVar != null) {
                return aVar.mo11376a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: b */
        public final void mo941b(C0224f c0224f) {
            if (this.f33560e == null) {
                return;
            }
            mo11422i();
            ActionMenuPresenter actionMenuPresenter = C5292x.this.f33535f.f1121d;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.m981n();
            }
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: c */
        public final void mo11416c() {
            C5292x c5292x = C5292x.this;
            if (c5292x.f33538i != this) {
                return;
            }
            if (!c5292x.f33546q) {
                this.f33560e.mo11377b(this);
            } else {
                c5292x.f33539j = this;
                c5292x.f33540k = this.f33560e;
            }
            this.f33560e = null;
            c5292x.m11412q(false);
            ActionBarContextView actionBarContextView = c5292x.f33535f;
            if (actionBarContextView.f807k == null) {
                actionBarContextView.m958h();
            }
            c5292x.f33532c.setHideOnContentScrollEnabled(c5292x.f33551v);
            c5292x.f33538i = null;
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: d */
        public final View mo11417d() {
            WeakReference<View> weakReference = this.f33561f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: e */
        public final C0224f mo11418e() {
            return this.f33559d;
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: f */
        public final MenuInflater mo11419f() {
            return new C6105f(this.f33558c);
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: g */
        public final CharSequence mo11420g() {
            return C5292x.this.f33535f.getSubtitle();
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: h */
        public final CharSequence mo11421h() {
            return C5292x.this.f33535f.getTitle();
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: i */
        public final void mo11422i() {
            if (C5292x.this.f33538i != this) {
                return;
            }
            C0224f c0224f = this.f33559d;
            c0224f.m939w();
            try {
                this.f33560e.mo11378c(this, c0224f);
                c0224f.m938v();
            } catch (Throwable th2) {
                c0224f.m938v();
                throw th2;
            }
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: j */
        public final boolean mo11423j() {
            return C5292x.this.f33535f.f803N;
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: k */
        public final void mo11424k(View view) {
            C5292x.this.f33535f.setCustomView(view);
            this.f33561f = new WeakReference<>(view);
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: l */
        public final void mo11425l(int i10) {
            mo11426m(C5292x.this.f33530a.getResources().getString(i10));
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: m */
        public final void mo11426m(CharSequence charSequence) {
            C5292x.this.f33535f.setSubtitle(charSequence);
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: n */
        public final void mo11427n(int i10) {
            mo11428o(C5292x.this.f33530a.getResources().getString(i10));
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: o */
        public final void mo11428o(CharSequence charSequence) {
            C5292x.this.f33535f.setTitle(charSequence);
        }

        @Override // p164i.AbstractC6100a
        /* JADX INFO: renamed from: p */
        public final void mo11429p(boolean z10) {
            this.f35851b = z10;
            C5292x.this.f33535f.setTitleOptional(z10);
        }
    }

    public C5292x(Activity activity, boolean z10) {
        new ArrayList();
        this.f33542m = new ArrayList<>();
        this.f33544o = 0;
        this.f33545p = true;
        this.f33548s = true;
        this.f33552w = new a();
        this.f33553x = new b();
        this.f33554y = new c();
        View decorView = activity.getWindow().getDecorView();
        m11413r(decorView);
        if (z10) {
            return;
        }
        this.f33536g = decorView.findViewById(R.id.content);
    }

    public C5292x(Dialog dialog) {
        new ArrayList();
        this.f33542m = new ArrayList<>();
        this.f33544o = 0;
        this.f33545p = true;
        this.f33548s = true;
        this.f33552w = new a();
        this.f33553x = new b();
        this.f33554y = new c();
        m11413r(dialog.getWindow().getDecorView());
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: b */
    public final boolean mo11310b() {
        InterfaceC0305d0 interfaceC0305d0 = this.f33534e;
        if (interfaceC0305d0 == null || !interfaceC0305d0.mo1144k()) {
            return false;
        }
        this.f33534e.collapseActionView();
        return true;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: c */
    public final void mo11311c(boolean z10) {
        if (z10 == this.f33541l) {
            return;
        }
        this.f33541l = z10;
        ArrayList<AbstractC5269a.b> arrayList = this.f33542m;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).m11325a();
        }
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: d */
    public final int mo11312d() {
        return this.f33534e.mo1150q();
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: e */
    public final Context mo11313e() {
        if (this.f33531b == null) {
            TypedValue typedValue = new TypedValue();
            this.f33530a.getTheme().resolveAttribute(com.linguist.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f33531b = new ContextThemeWrapper(this.f33530a, i10);
            } else {
                this.f33531b = this.f33530a;
            }
        }
        return this.f33531b;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: g */
    public final void mo11315g() {
        m11414s(this.f33530a.getResources().getBoolean(com.linguist.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: i */
    public final boolean mo11317i(int i10, KeyEvent keyEvent) {
        C0224f c0224f;
        d dVar = this.f33538i;
        if (dVar != null && (c0224f = dVar.f33559d) != null) {
            boolean z10 = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z10 = false;
            }
            c0224f.setQwertyMode(z10);
            return c0224f.performShortcut(i10, keyEvent, 0);
        }
        return false;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: l */
    public final void mo11320l(boolean z10) {
        if (this.f33537h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        int iMo1150q = this.f33534e.mo1150q();
        this.f33537h = true;
        this.f33534e.mo1145l((i10 & 4) | (iMo1150q & (-5)));
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: m */
    public final void mo11321m(boolean z10) {
        C6106g c6106g;
        this.f33550u = z10;
        if (!z10 && (c6106g = this.f33549t) != null) {
            c6106g.m12607a();
        }
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: n */
    public final void mo11322n(String str) {
        this.f33534e.setTitle(str);
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: o */
    public final void mo11323o(CharSequence charSequence) {
        this.f33534e.setWindowTitle(charSequence);
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: p */
    public final AbstractC6100a mo11324p(LayoutInflaterFactory2C5275g.d dVar) {
        d dVar2 = this.f33538i;
        if (dVar2 != null) {
            dVar2.mo11416c();
        }
        this.f33532c.setHideOnContentScrollEnabled(false);
        this.f33535f.m958h();
        d dVar3 = new d(this.f33535f.getContext(), dVar);
        C0224f c0224f = dVar3.f33559d;
        c0224f.m939w();
        try {
            boolean zMo11379d = dVar3.f33560e.mo11379d(dVar3, c0224f);
            c0224f.m938v();
            if (!zMo11379d) {
                return null;
            }
            this.f33538i = dVar3;
            dVar3.mo11422i();
            this.f33535f.m956f(dVar3);
            m11412q(true);
            return dVar3;
        } catch (Throwable th2) {
            c0224f.m938v();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11412q(boolean z10) {
        C10049l0 c10049l0Mo1149p;
        C10049l0 c10049l0M1077e;
        if (z10) {
            if (!this.f33547r) {
                this.f33547r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f33532c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m11415t(false);
            }
        } else if (this.f33547r) {
            this.f33547r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f33532c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m11415t(false);
        }
        ActionBarContainer actionBarContainer = this.f33533d;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.g.m18699c(actionBarContainer)) {
            if (z10) {
                this.f33534e.setVisibility(4);
                this.f33535f.setVisibility(0);
                return;
            } else {
                this.f33534e.setVisibility(0);
                this.f33535f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c10049l0M1077e = this.f33534e.mo1149p(4, 100L);
            c10049l0Mo1149p = this.f33535f.m1077e(0, 200L);
        } else {
            c10049l0Mo1149p = this.f33534e.mo1149p(0, 200L);
            c10049l0M1077e = this.f33535f.m1077e(8, 100L);
        }
        C6106g c6106g = new C6106g();
        ArrayList<C10049l0> arrayList = c6106g.f35910a;
        arrayList.add(c10049l0M1077e);
        View view = c10049l0M1077e.f51041a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c10049l0Mo1149p.f51041a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c10049l0Mo1149p);
        c6106g.m12608b();
    }

    /* JADX INFO: renamed from: r */
    public final void m11413r(View view) {
        InterfaceC0305d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.linguist.R.id.decor_content_parent);
        this.f33532c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.linguist.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0305d0) {
            wrapper = (InterfaceC0305d0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f33534e = wrapper;
        this.f33535f = (ActionBarContextView) view.findViewById(com.linguist.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.linguist.R.id.action_bar_container);
        this.f33533d = actionBarContainer;
        InterfaceC0305d0 interfaceC0305d0 = this.f33534e;
        if (interfaceC0305d0 == null || this.f33535f == null || actionBarContainer == null) {
            throw new IllegalStateException(C5292x.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f33530a = interfaceC0305d0.mo1138e();
        if ((this.f33534e.mo1150q() & 4) != 0) {
            this.f33537h = true;
        }
        Context context = this.f33530a;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f33534e.mo1143j();
        m11414s(context.getResources().getBoolean(com.linguist.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f33530a.obtainStyledAttributes(null, C4999a.f32587a, com.linguist.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f33532c;
            if (!actionBarOverlayLayout2.f833h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f33551v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f33533d;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18725s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: s */
    public final void m11414s(boolean z10) {
        this.f33543n = z10;
        if (z10) {
            this.f33533d.setTabContainer(null);
            this.f33534e.mo1146m();
        } else {
            this.f33534e.mo1146m();
            this.f33533d.setTabContainer(null);
        }
        this.f33534e.mo1148o();
        InterfaceC0305d0 interfaceC0305d0 = this.f33534e;
        boolean z11 = this.f33543n;
        interfaceC0305d0.mo1153t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f33532c;
        boolean z12 = this.f33543n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final void m11415t(boolean z10) {
        boolean z11 = this.f33547r || !this.f33546q;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f33536g;
        final c cVar = this.f33554y;
        if (z11) {
            if (!this.f33548s) {
                this.f33548s = true;
                C6106g c6106g = this.f33549t;
                if (c6106g != null) {
                    c6106g.m12607a();
                }
                this.f33533d.setVisibility(0);
                int i10 = this.f33544o;
                b bVar = this.f33553x;
                if (i10 == 0 && (this.f33550u || z10)) {
                    this.f33533d.setTranslationY(0.0f);
                    float f3 = -this.f33533d.getHeight();
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.f33533d.getLocationInWindow(iArr);
                        f3 -= iArr[1];
                    }
                    this.f33533d.setTranslationY(f3);
                    C6106g c6106g2 = new C6106g();
                    C10049l0 c10049l0M18645a = C10029b0.m18645a(this.f33533d);
                    c10049l0M18645a.m18839e(0.0f);
                    final View view2 = c10049l0M18645a.f51041a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: x2.j0

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ InterfaceC10055o0 f51038a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) C5292x.this.f33533d.getParent()).invalidate();
                                }
                            };
                        }
                        C10049l0.a.m18840a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z12 = c6106g2.f35914e;
                    ArrayList<C10049l0> arrayList = c6106g2.f35910a;
                    if (!z12) {
                        arrayList.add(c10049l0M18645a);
                    }
                    if (this.f33545p && view != null) {
                        view.setTranslationY(f3);
                        C10049l0 c10049l0M18645a2 = C10029b0.m18645a(view);
                        c10049l0M18645a2.m18839e(0.0f);
                        if (!c6106g2.f35914e) {
                            arrayList.add(c10049l0M18645a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f33528A;
                    boolean z13 = c6106g2.f35914e;
                    if (!z13) {
                        c6106g2.f35912c = decelerateInterpolator;
                    }
                    if (!z13) {
                        c6106g2.f35911b = 250L;
                    }
                    if (!z13) {
                        c6106g2.f35913d = bVar;
                    }
                    this.f33549t = c6106g2;
                    c6106g2.m12608b();
                } else {
                    this.f33533d.setAlpha(1.0f);
                    this.f33533d.setTranslationY(0.0f);
                    if (this.f33545p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.mo1078a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f33532c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.h.m18706c(actionBarOverlayLayout);
                }
            }
        } else if (this.f33548s) {
            this.f33548s = false;
            C6106g c6106g3 = this.f33549t;
            if (c6106g3 != null) {
                c6106g3.m12607a();
            }
            int i11 = this.f33544o;
            a aVar = this.f33552w;
            if (i11 != 0 || (!this.f33550u && !z10)) {
                aVar.mo1078a();
            }
            this.f33533d.setAlpha(1.0f);
            this.f33533d.setTransitioning(true);
            C6106g c6106g4 = new C6106g();
            float f10 = -this.f33533d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f33533d.getLocationInWindow(iArr2);
                f10 -= iArr2[1];
            }
            C10049l0 c10049l0M18645a3 = C10029b0.m18645a(this.f33533d);
            c10049l0M18645a3.m18839e(f10);
            final View view3 = c10049l0M18645a3.f51041a.get();
            if (view3 != null) {
                if (cVar != null) {
                    animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: x2.j0

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC10055o0 f51038a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) C5292x.this.f33533d.getParent()).invalidate();
                        }
                    };
                }
                C10049l0.a.m18840a(view3.animate(), animatorUpdateListener);
            }
            boolean z14 = c6106g4.f35914e;
            ArrayList<C10049l0> arrayList2 = c6106g4.f35910a;
            if (!z14) {
                arrayList2.add(c10049l0M18645a3);
            }
            if (this.f33545p && view != null) {
                C10049l0 c10049l0M18645a4 = C10029b0.m18645a(view);
                c10049l0M18645a4.m18839e(f10);
                if (!c6106g4.f35914e) {
                    arrayList2.add(c10049l0M18645a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f33529z;
            boolean z15 = c6106g4.f35914e;
            if (!z15) {
                c6106g4.f35912c = accelerateInterpolator;
            }
            if (!z15) {
                c6106g4.f35911b = 250L;
            }
            if (!z15) {
                c6106g4.f35913d = aVar;
            }
            this.f33549t = c6106g4;
            c6106g4.m12608b();
        }
    }
}
