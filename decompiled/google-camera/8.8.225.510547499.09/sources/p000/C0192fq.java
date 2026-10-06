package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: fq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0192fq extends AbstractC0146dy implements InterfaceC0252hw {

    /* JADX INFO: renamed from: r */
    private static final Interpolator f23151r = new AccelerateInterpolator();

    /* JADX INFO: renamed from: s */
    private static final Interpolator f23152s = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    Context f23153a;

    /* JADX INFO: renamed from: b */
    ActionBarOverlayLayout f23154b;

    /* JADX INFO: renamed from: c */
    public ActionBarContainer f23155c;

    /* JADX INFO: renamed from: d */
    InterfaceC0758jy f23156d;

    /* JADX INFO: renamed from: e */
    ActionBarContextView f23157e;

    /* JADX INFO: renamed from: f */
    View f23158f;

    /* JADX INFO: renamed from: g */
    C0191fp f23159g;

    /* JADX INFO: renamed from: h */
    AbstractC0199fx f23160h;

    /* JADX INFO: renamed from: i */
    InterfaceC0198fw f23161i;

    /* JADX INFO: renamed from: j */
    public int f23162j;

    /* JADX INFO: renamed from: k */
    public boolean f23163k;

    /* JADX INFO: renamed from: l */
    public boolean f23164l;

    /* JADX INFO: renamed from: m */
    public C0208gf f23165m;

    /* JADX INFO: renamed from: n */
    boolean f23166n;

    /* JADX INFO: renamed from: o */
    final aga f23167o;

    /* JADX INFO: renamed from: p */
    final aga f23168p;

    /* JADX INFO: renamed from: q */
    final AmbientMode.AmbientController f23169q;

    /* JADX INFO: renamed from: t */
    private Context f23170t;

    /* JADX INFO: renamed from: u */
    private boolean f23171u;

    /* JADX INFO: renamed from: v */
    private boolean f23172v;

    /* JADX INFO: renamed from: w */
    private final ArrayList f23173w;

    /* JADX INFO: renamed from: x */
    private boolean f23174x;

    /* JADX INFO: renamed from: y */
    private boolean f23175y;

    /* JADX INFO: renamed from: z */
    private boolean f23176z;

    public C0192fq(Activity activity, boolean z) {
        new ArrayList();
        this.f23173w = new ArrayList();
        this.f23162j = 0;
        this.f23163k = true;
        this.f23175y = true;
        this.f23167o = new C0189fn(this);
        this.f23168p = new C0190fo(this);
        this.f23169q = new AmbientMode.AmbientController(this);
        View decorView = activity.getWindow().getDecorView();
        m8689z(decorView);
        if (z) {
            return;
        }
        this.f23158f = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: y */
    static boolean m8688y(boolean z, boolean z2) {
        return z2 || !z;
    }

    /* JADX INFO: renamed from: z */
    private final void m8689z(View view) {
        InterfaceC0758jy interfaceC0758jyM1338f;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0100R.id.decor_content_parent);
        this.f23154b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f968h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C0192fq) actionBarOverlayLayout.f968h).f23162j = actionBarOverlayLayout.f962b;
                int i = actionBarOverlayLayout.f967g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    aff.m467c(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(C0100R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0758jy) {
            interfaceC0758jyM1338f = (InterfaceC0758jy) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't make a decor toolbar out of ");
                sb.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sb.toString());
            }
            interfaceC0758jyM1338f = ((Toolbar) callbackFindViewById).m1338f();
        }
        this.f23156d = interfaceC0758jyM1338f;
        this.f23157e = (ActionBarContextView) view.findViewById(C0100R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0100R.id.action_bar_container);
        this.f23155c = actionBarContainer;
        InterfaceC0758jy interfaceC0758jy = this.f23156d;
        if (interfaceC0758jy == null || this.f23157e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.f23153a = interfaceC0758jy.mo13674b();
        if ((this.f23156d.mo13673a() & 4) != 0) {
            this.f23171u = true;
        }
        Context context = this.f23153a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f23156d.mo13695w();
        m8687A(C0138dq.m6568d(context));
        TypedArray typedArrayObtainStyledAttributes = this.f23153a.obtainStyledAttributes(null, C0193fr.f23257a, C0100R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f23154b;
            if (!actionBarOverlayLayout2.f964d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f23166n = true;
            actionBarOverlayLayout2.m1058k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            afh.m481l(this.f23155c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: a */
    public final int mo6894a() {
        return this.f23156d.mo13673a();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: b */
    public final Context mo6895b() {
        if (this.f23170t == null) {
            TypedValue typedValue = new TypedValue();
            this.f23153a.getTheme().resolveAttribute(C0100R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f23170t = new ContextThemeWrapper(this.f23153a, i);
            } else {
                this.f23170t = this.f23153a;
            }
        }
        return this.f23170t;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: c */
    public final AbstractC0199fx mo6896c(InterfaceC0198fw interfaceC0198fw) {
        C0191fp c0191fp = this.f23159g;
        if (c0191fp != null) {
            c0191fp.mo8648f();
        }
        this.f23154b.m1058k(false);
        this.f23157e.m1045i();
        C0191fp c0191fp2 = new C0191fp(this, this.f23157e.getContext(), interfaceC0198fw);
        c0191fp2.f22994a.m9839s();
        try {
            boolean zMo7671c = c0191fp2.f22995b.mo7671c(c0191fp2, c0191fp2.f22994a);
            c0191fp2.f22994a.m9838r();
            if (!zMo7671c) {
                return null;
            }
            this.f23159g = c0191fp2;
            c0191fp2.mo8649g();
            this.f23157e.m1044h(c0191fp2);
            m8690v(true);
            return c0191fp2;
        } catch (Throwable th) {
            c0191fp2.f22994a.m9838r();
            throw th;
        }
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: d */
    public final void mo6897d(boolean z) {
        if (z == this.f23172v) {
            return;
        }
        this.f23172v = z;
        int size = this.f23173w.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0145dx) this.f23173w.get(i)).m6842a();
        }
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: f */
    public final void mo6899f(boolean z) {
        if (this.f23171u) {
            return;
        }
        mo6900g(z);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: g */
    public final void mo6900g(boolean z) {
        m8691w(true != z ? 0 : 4, 4);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: h */
    public final void mo6901h(boolean z) {
        C0208gf c0208gf;
        this.f23176z = z;
        if (z || (c0208gf = this.f23165m) == null) {
            return;
        }
        c0208gf.m9154a();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: i */
    public final void mo6902i(CharSequence charSequence) {
        this.f23156d.mo13683k(charSequence);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: j */
    public final void mo6903j(CharSequence charSequence) {
        this.f23156d.mo13686n(charSequence);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: l */
    public final boolean mo6905l() {
        InterfaceC0758jy interfaceC0758jy = this.f23156d;
        if (interfaceC0758jy == null || !interfaceC0758jy.mo13688p()) {
            return false;
        }
        interfaceC0758jy.mo13675c();
        return true;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: n */
    public final boolean mo6907n(int i, KeyEvent keyEvent) {
        C0191fp c0191fp = this.f23159g;
        if (c0191fp == null) {
            return false;
        }
        C0225gw c0225gw = c0191fp.f22994a;
        c0225gw.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c0225gw.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: q */
    public final void mo6910q() {
        m8687A(C0138dq.m6568d(this.f23153a));
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: r */
    public final void mo6911r() {
        m8691w(2, 2);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: s */
    public final void mo6912s() {
        m8691w(8, 8);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: t */
    public final void mo6913t() {
        this.f23156d.mo13680h(null);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: u */
    public final void mo6914u() {
        mo6902i(this.f23153a.getString(C0100R.string.pref_camera_settings_category));
    }

    /* JADX INFO: renamed from: v */
    public final void m8690v(boolean z) {
        bkn bknVarMo13697y;
        bkn bknVarG;
        if (z) {
            if (!this.f23174x) {
                this.f23174x = true;
                m8692x(false);
            }
        } else if (this.f23174x) {
            this.f23174x = false;
            m8692x(false);
        }
        if (!afe.m462f(this.f23155c)) {
            if (z) {
                this.f23156d.mo13684l(4);
                this.f23157e.setVisibility(0);
                return;
            } else {
                this.f23156d.mo13684l(0);
                this.f23157e.setVisibility(8);
                return;
            }
        }
        if (z) {
            bknVarG = this.f23156d.mo13697y(4, 100L);
            bknVarMo13697y = this.f23157e.m10681g(0, 200L);
        } else {
            bknVarMo13697y = this.f23156d.mo13697y(0, 200L);
            bknVarG = this.f23157e.m10681g(8, 100L);
        }
        C0208gf c0208gf = new C0208gf();
        c0208gf.f24467a.add(bknVarG);
        View view = (View) ((WeakReference) bknVarG.f3651a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) bknVarMo13697y.f3651a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c0208gf.f24467a.add(bknVarMo13697y);
        c0208gf.m9155b();
    }

    /* JADX INFO: renamed from: w */
    public final void m8691w(int i, int i2) {
        int iMo13673a = this.f23156d.mo13673a();
        if ((i2 & 4) != 0) {
            this.f23171u = true;
        }
        this.f23156d.mo13679g((i & i2) | ((i2 ^ (-1)) & iMo13673a));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX INFO: renamed from: x */
    public final void m8692x(boolean z) {
        View view;
        View view2;
        View view3;
        if (!m8688y(this.f23164l, this.f23174x)) {
            if (this.f23175y) {
                this.f23175y = false;
                C0208gf c0208gf = this.f23165m;
                if (c0208gf != null) {
                    c0208gf.m9154a();
                }
                if (this.f23162j == 0) {
                    if (!this.f23176z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.f23155c.setAlpha(1.0f);
                    this.f23155c.m1041a(true);
                    C0208gf c0208gf2 = new C0208gf();
                    float f = -this.f23155c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f23155c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    bkn bknVarM551k = afq.m551k(this.f23155c);
                    bknVarM551k.m2597r(f);
                    bknVarM551k.m2553B(this.f23169q);
                    c0208gf2.m9159f(bknVarM551k);
                    if (this.f23163k && (view = this.f23158f) != null) {
                        bkn bknVarM551k2 = afq.m551k(view);
                        bknVarM551k2.m2597r(f);
                        c0208gf2.m9159f(bknVarM551k2);
                    }
                    c0208gf2.m9157d(f23151r);
                    c0208gf2.m9156c();
                    c0208gf2.m9158e(this.f23167o);
                    this.f23165m = c0208gf2;
                    c0208gf2.m9155b();
                    return;
                }
                this.f23167o.mo571a();
                return;
            }
            return;
        }
        if (this.f23175y) {
            return;
        }
        this.f23175y = true;
        C0208gf c0208gf3 = this.f23165m;
        if (c0208gf3 != null) {
            c0208gf3.m9154a();
        }
        this.f23155c.setVisibility(0);
        if (this.f23162j != 0) {
            this.f23155c.setAlpha(1.0f);
            this.f23155c.setTranslationY(0.0f);
            if (this.f23163k && (view2 = this.f23158f) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f23168p.mo571a();
        } else {
            if (!this.f23176z) {
                if (z) {
                    z = true;
                } else {
                    this.f23155c.setAlpha(1.0f);
                    this.f23155c.setTranslationY(0.0f);
                    if (this.f23163k) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f23168p.mo571a();
                }
            }
            this.f23155c.setTranslationY(0.0f);
            float f2 = -this.f23155c.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f23155c.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f23155c.setTranslationY(f2);
            C0208gf c0208gf4 = new C0208gf();
            bkn bknVarM551k3 = afq.m551k(this.f23155c);
            bknVarM551k3.m2597r(0.0f);
            bknVarM551k3.m2553B(this.f23169q);
            c0208gf4.m9159f(bknVarM551k3);
            if (this.f23163k && (view3 = this.f23158f) != null) {
                view3.setTranslationY(f2);
                bkn bknVarM551k4 = afq.m551k(this.f23158f);
                bknVarM551k4.m2597r(0.0f);
                c0208gf4.m9159f(bknVarM551k4);
            }
            c0208gf4.m9157d(f23152s);
            c0208gf4.m9156c();
            c0208gf4.m9158e(this.f23168p);
            this.f23165m = c0208gf4;
            c0208gf4.m9155b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f23154b;
        if (actionBarOverlayLayout != null) {
            aff.m467c(actionBarOverlayLayout);
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m8687A(boolean z) {
        if (z) {
            this.f23156d.mo13694v();
        } else {
            this.f23156d.mo13694v();
        }
        this.f23156d.mo13693u();
        this.f23156d.mo13696x();
        this.f23154b.f965e = false;
    }

    public C0192fq(Dialog dialog) {
        new ArrayList();
        this.f23173w = new ArrayList();
        this.f23162j = 0;
        this.f23163k = true;
        this.f23175y = true;
        this.f23167o = new C0189fn(this);
        this.f23168p = new C0190fo(this);
        this.f23169q = new AmbientMode.AmbientController(this);
        m8689z(dialog.getWindow().getDecorView());
    }
}
