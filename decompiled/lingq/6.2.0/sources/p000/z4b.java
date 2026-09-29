package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z4b implements InterfaceC3323m5 {

    /* JADX INFO: renamed from: y */
    public static final AccelerateInterpolator f70903y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z */
    public static final DecelerateInterpolator f70904z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Context f70905a;

    /* JADX INFO: renamed from: b */
    public Context f70906b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f70907c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f70908d;

    /* JADX INFO: renamed from: e */
    public p32 f70909e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f70910f;

    /* JADX INFO: renamed from: g */
    public final View f70911g;

    /* JADX INFO: renamed from: h */
    public boolean f70912h;

    /* JADX INFO: renamed from: i */
    public y4b f70913i;

    /* JADX INFO: renamed from: j */
    public y4b f70914j;

    /* JADX INFO: renamed from: k */
    public C3156jq f70915k;

    /* JADX INFO: renamed from: l */
    public boolean f70916l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f70917m;

    /* JADX INFO: renamed from: n */
    public int f70918n;

    /* JADX INFO: renamed from: o */
    public boolean f70919o;

    /* JADX INFO: renamed from: p */
    public boolean f70920p;

    /* JADX INFO: renamed from: q */
    public boolean f70921q;

    /* JADX INFO: renamed from: r */
    public boolean f70922r;

    /* JADX INFO: renamed from: s */
    public yua f70923s;

    /* JADX INFO: renamed from: t */
    public boolean f70924t;

    /* JADX INFO: renamed from: u */
    public boolean f70925u;

    /* JADX INFO: renamed from: v */
    public final x4b f70926v;

    /* JADX INFO: renamed from: w */
    public final x4b f70927w;

    /* JADX INFO: renamed from: x */
    public final nr9 f70928x;

    public z4b(Activity activity, boolean z) {
        new ArrayList();
        this.f70917m = new ArrayList();
        this.f70918n = 0;
        this.f70919o = true;
        this.f70922r = true;
        this.f70926v = new x4b(this, 0);
        this.f70927w = new x4b(this, 1);
        this.f70928x = new nr9(this);
        View decorView = activity.getWindow().getDecorView();
        m25460c(decorView);
        if (z) {
            return;
        }
        this.f70911g = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: a */
    public final void m25458a(boolean z) {
        xua xuaVarM657i;
        xua xuaVarM657i2;
        boolean z2 = this.f70921q;
        if (z) {
            if (!z2) {
                this.f70921q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f70907c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m25463f(false);
            }
        } else if (z2) {
            this.f70921q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f70907c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m25463f(false);
        }
        boolean zIsLaidOut = this.f70908d.isLaidOut();
        p32 p32Var = this.f70909e;
        if (!zIsLaidOut) {
            if (z) {
                ((x5a) p32Var).f67786a.setVisibility(4);
                this.f70910f.setVisibility(0);
                return;
            } else {
                ((x5a) p32Var).f67786a.setVisibility(0);
                this.f70910f.setVisibility(8);
                return;
            }
        }
        if (z) {
            x5a x5aVar = (x5a) p32Var;
            xuaVarM657i = dta.m10630a(x5aVar.f67786a);
            xuaVarM657i.m24703a(0.0f);
            xuaVarM657i.m24705c(100L);
            xuaVarM657i.m24706d(new w5a(x5aVar, 4));
            xuaVarM657i2 = this.f70910f.m657i(0, 200L);
        } else {
            x5a x5aVar2 = (x5a) p32Var;
            xua xuaVarM10630a = dta.m10630a(x5aVar2.f67786a);
            xuaVarM10630a.m24703a(1.0f);
            xuaVarM10630a.m24705c(200L);
            xuaVarM10630a.m24706d(new w5a(x5aVar2, 0));
            xuaVarM657i = this.f70910f.m657i(8, 100L);
            xuaVarM657i2 = xuaVarM10630a;
        }
        yua yuaVar = new yua();
        yuaVar.m25348c(xuaVarM657i, xuaVarM657i2);
        yuaVar.m25352g();
    }

    /* JADX INFO: renamed from: b */
    public final Context m25459b() {
        if (this.f70906b == null) {
            TypedValue typedValue = new TypedValue();
            this.f70905a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f70906b = new ContextThemeWrapper(this.f70905a, i);
            } else {
                this.f70906b = this.f70905a;
            }
        }
        return this.f70906b;
    }

    /* JADX INFO: renamed from: c */
    public final void m25460c(View view) {
        p32 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.f70907c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R$id.action_bar);
        if (callbackFindViewById instanceof p32) {
            wrapper = (p32) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f70909e = wrapper;
        this.f70910f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.f70908d = actionBarContainer;
        p32 p32Var = this.f70909e;
        if (p32Var == null || this.f70910f == null || actionBarContainer == null) {
            C3386nv.m17633t(z4b.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((x5a) p32Var).f67786a.getContext();
        this.f70905a = context;
        if ((((x5a) this.f70909e).f67787b & 4) != 0) {
            this.f70912h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f70909e.getClass();
        m25462e(context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f70905a.obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f70907c;
            if (!actionBarOverlayLayout2.f1101g) {
                C3386nv.m17633t("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f70925u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f70908d;
            WeakHashMap weakHashMap = dta.f36217a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final void m25461d(boolean z) {
        if (this.f70912h) {
            return;
        }
        int i = z ? 4 : 0;
        x5a x5aVar = (x5a) this.f70909e;
        int i2 = x5aVar.f67787b;
        this.f70912h = true;
        x5aVar.m24288a((i & 4) | (i2 & (-5)));
    }

    /* JADX INFO: renamed from: e */
    public final void m25462e(boolean z) {
        if (z) {
            this.f70908d.setTabContainer(null);
            ((x5a) this.f70909e).getClass();
        } else {
            ((x5a) this.f70909e).getClass();
            this.f70908d.setTabContainer(null);
        }
        this.f70909e.getClass();
        ((x5a) this.f70909e).f67786a.setCollapsible(false);
        this.f70907c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m25463f(boolean z) {
        int i = 1;
        boolean z2 = this.f70921q || !this.f70920p;
        boolean z3 = this.f70922r;
        nr9 nr9Var = this.f70928x;
        View view = this.f70911g;
        if (!z2) {
            if (z3) {
                this.f70922r = false;
                yua yuaVar = this.f70923s;
                if (yuaVar != null) {
                    yuaVar.m25346a();
                }
                int i2 = this.f70918n;
                x4b x4bVar = this.f70926v;
                if (i2 != 0 || (!this.f70924t && !z)) {
                    x4bVar.mo17716c();
                    return;
                }
                this.f70908d.setAlpha(1.0f);
                this.f70908d.setTransitioning(true);
                yua yuaVar2 = new yua();
                float f = -this.f70908d.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f70908d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                xua xuaVarM10630a = dta.m10630a(this.f70908d);
                xuaVarM10630a.m24707e(f);
                View view2 = (View) xuaVarM10630a.f68829a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(nr9Var != null ? new C3692vo(i, nr9Var, view2) : null);
                }
                yuaVar2.m25347b(xuaVarM10630a);
                if (this.f70919o && view != null) {
                    xua xuaVarM10630a2 = dta.m10630a(view);
                    xuaVarM10630a2.m24707e(f);
                    yuaVar2.m25347b(xuaVarM10630a2);
                }
                yuaVar2.m25350e(f70903y);
                yuaVar2.m25349d();
                yuaVar2.m25351f(x4bVar);
                this.f70923s = yuaVar2;
                yuaVar2.m25352g();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f70922r = true;
        yua yuaVar3 = this.f70923s;
        if (yuaVar3 != null) {
            yuaVar3.m25346a();
        }
        this.f70908d.setVisibility(0);
        int i3 = this.f70918n;
        x4b x4bVar2 = this.f70927w;
        if (i3 == 0 && (this.f70924t || z)) {
            this.f70908d.setTranslationY(0.0f);
            float f2 = -this.f70908d.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f70908d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f70908d.setTranslationY(f2);
            yua yuaVar4 = new yua();
            xua xuaVarM10630a3 = dta.m10630a(this.f70908d);
            xuaVarM10630a3.m24707e(0.0f);
            View view3 = (View) xuaVarM10630a3.f68829a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(nr9Var != null ? new C3692vo(i, nr9Var, view3) : null);
            }
            yuaVar4.m25347b(xuaVarM10630a3);
            if (this.f70919o && view != null) {
                view.setTranslationY(f2);
                xua xuaVarM10630a4 = dta.m10630a(view);
                xuaVarM10630a4.m24707e(0.0f);
                yuaVar4.m25347b(xuaVarM10630a4);
            }
            yuaVar4.m25350e(f70904z);
            yuaVar4.m25349d();
            yuaVar4.m25351f(x4bVar2);
            this.f70923s = yuaVar4;
            yuaVar4.m25352g();
        } else {
            this.f70908d.setAlpha(1.0f);
            this.f70908d.setTranslationY(0.0f);
            if (this.f70919o && view != null) {
                view.setTranslationY(0.0f);
            }
            x4bVar2.mo17716c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f70907c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = dta.f36217a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public z4b(Dialog dialog) {
        new ArrayList();
        this.f70917m = new ArrayList();
        this.f70918n = 0;
        this.f70919o = true;
        this.f70922r = true;
        this.f70926v = new x4b(this, 0);
        this.f70927w = new x4b(this, 1);
        this.f70928x = new nr9(this);
        m25460c(dialog.getWindow().getDecorView());
    }
}
