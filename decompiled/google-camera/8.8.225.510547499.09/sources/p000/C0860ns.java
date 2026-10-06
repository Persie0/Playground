package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ns */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0860ns implements InterfaceC0758jy {

    /* JADX INFO: renamed from: a */
    public final Toolbar f44333a;

    /* JADX INFO: renamed from: b */
    public int f44334b;

    /* JADX INFO: renamed from: c */
    CharSequence f44335c;

    /* JADX INFO: renamed from: d */
    public Window.Callback f44336d;

    /* JADX INFO: renamed from: e */
    boolean f44337e;

    /* JADX INFO: renamed from: f */
    private View f44338f;

    /* JADX INFO: renamed from: g */
    private Drawable f44339g;

    /* JADX INFO: renamed from: h */
    private Drawable f44340h;

    /* JADX INFO: renamed from: i */
    private Drawable f44341i;

    /* JADX INFO: renamed from: j */
    private boolean f44342j;

    /* JADX INFO: renamed from: k */
    private CharSequence f44343k;

    /* JADX INFO: renamed from: l */
    private CharSequence f44344l;

    /* JADX INFO: renamed from: m */
    private C0259ic f44345m;

    /* JADX INFO: renamed from: n */
    private int f44346n;

    /* JADX INFO: renamed from: o */
    private Drawable f44347o;

    public C0860ns(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f44346n = 0;
        this.f44333a = toolbar;
        this.f44335c = toolbar.f1242s;
        this.f44343k = toolbar.f1243t;
        this.f44342j = this.f44335c != null;
        this.f44341i = toolbar.m1337e();
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(toolbar.getContext(), null, C0193fr.f23257a, C0100R.attr.actionBarStyle, 0);
        int i = 15;
        this.f44347o = ambientDelegateM1568D.m1618u(15);
        if (z) {
            CharSequence charSequenceM1620w = ambientDelegateM1568D.m1620w(27);
            if (!TextUtils.isEmpty(charSequenceM1620w)) {
                mo13683k(charSequenceM1620w);
            }
            CharSequence charSequenceM1620w2 = ambientDelegateM1568D.m1620w(25);
            if (!TextUtils.isEmpty(charSequenceM1620w2)) {
                this.f44343k = charSequenceM1620w2;
                if ((this.f44334b & 8) != 0) {
                    toolbar.m1351s(charSequenceM1620w2);
                }
            }
            Drawable drawableM1618u = ambientDelegateM1568D.m1618u(20);
            if (drawableM1618u != null) {
                mo13680h(drawableM1618u);
            }
            Drawable drawableM1618u2 = ambientDelegateM1568D.m1618u(17);
            if (drawableM1618u2 != null) {
                this.f44339g = drawableM1618u2;
                m17640C();
            }
            if (this.f44341i == null && (drawable = this.f44347o) != null) {
                this.f44341i = drawable;
                m17639B();
            }
            mo13679g(ambientDelegateM1568D.m1613p(10, 0));
            int iM1616s = ambientDelegateM1568D.m1616s(9, 0);
            if (iM1616s != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iM1616s, (ViewGroup) toolbar, false);
                View view = this.f44338f;
                if (view != null && (this.f44334b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f44338f = viewInflate;
                if (viewInflate != null && (this.f44334b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                mo13679g(this.f44334b | 16);
            }
            int iM1615r = ambientDelegateM1568D.m1615r(13, 0);
            if (iM1615r > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iM1615r;
                toolbar.setLayoutParams(layoutParams);
            }
            int iM1611n = ambientDelegateM1568D.m1611n(7, -1);
            int iM1611n2 = ambientDelegateM1568D.m1611n(3, -1);
            if (iM1611n >= 0 || iM1611n2 >= 0) {
                int iMax = Math.max(iM1611n, 0);
                int iMax2 = Math.max(iM1611n2, 0);
                toolbar.m1344l();
                toolbar.f1241r.m16938a(iMax, iMax2);
            }
            int iM1616s2 = ambientDelegateM1568D.m1616s(28, 0);
            if (iM1616s2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1234k = iM1616s2;
                TextView textView = toolbar.f1225b;
                if (textView != null) {
                    textView.setTextAppearance(context, iM1616s2);
                }
            }
            int iM1616s3 = ambientDelegateM1568D.m1616s(26, 0);
            if (iM1616s3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1235l = iM1616s3;
                TextView textView2 = toolbar.f1226c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iM1616s3);
                }
            }
            int iM1616s4 = ambientDelegateM1568D.m1616s(22, 0);
            if (iM1616s4 != 0) {
                toolbar.m1350r(iM1616s4);
            }
        } else {
            if (toolbar.m1337e() != null) {
                this.f44347o = toolbar.m1337e();
            } else {
                i = 11;
            }
            this.f44334b = i;
        }
        ambientDelegateM1568D.m1622y();
        if (this.f44346n != C0100R.string.abc_action_bar_up_description) {
            this.f44346n = C0100R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.m1341i())) {
                int i2 = this.f44346n;
                this.f44344l = i2 != 0 ? mo13674b().getString(i2) : null;
                m17638A();
            }
        }
        this.f44344l = toolbar.m1341i();
        ViewOnClickListenerC0858nq viewOnClickListenerC0858nq = new ViewOnClickListenerC0858nq(this);
        toolbar.m1346n();
        toolbar.f1227d.setOnClickListener(viewOnClickListenerC0858nq);
    }

    /* JADX INFO: renamed from: A */
    private final void m17638A() {
        if ((this.f44334b & 4) != 0) {
            if (!TextUtils.isEmpty(this.f44344l)) {
                this.f44333a.m1348p(this.f44344l);
                return;
            }
            Toolbar toolbar = this.f44333a;
            int i = this.f44346n;
            toolbar.m1348p(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m17639B() {
        if ((this.f44334b & 4) == 0) {
            this.f44333a.m1349q(null);
            return;
        }
        Toolbar toolbar = this.f44333a;
        Drawable drawable = this.f44341i;
        if (drawable == null) {
            drawable = this.f44347o;
        }
        toolbar.m1349q(drawable);
    }

    /* JADX INFO: renamed from: C */
    private final void m17640C() {
        Drawable drawable;
        int i = this.f44334b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f44340h) == null) {
            drawable = this.f44339g;
        }
        this.f44333a.m1347o(drawable);
    }

    /* JADX INFO: renamed from: z */
    private final void m17641z(CharSequence charSequence) {
        this.f44335c = charSequence;
        if ((this.f44334b & 8) != 0) {
            this.f44333a.m1352t(charSequence);
            if (this.f44342j) {
                afq.m548h(this.f44333a.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: a */
    public final int mo13673a() {
        return this.f44334b;
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: b */
    public final Context mo13674b() {
        return this.f44333a.getContext();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: c */
    public final void mo13675c() {
        this.f44333a.m1343k();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: d */
    public final void mo13676d() {
        ActionMenuView actionMenuView = this.f44333a.f1224a;
        if (actionMenuView != null) {
            actionMenuView.m1075h();
        }
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: e */
    public final void mo13677e() {
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: f */
    public final void mo13678f() {
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: g */
    public final void mo13679g(int i) {
        View view;
        int i2 = this.f44334b ^ i;
        this.f44334b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m17638A();
                }
                m17639B();
            }
            if ((i2 & 3) != 0) {
                m17640C();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f44333a.m1352t(this.f44335c);
                    this.f44333a.m1351s(this.f44343k);
                } else {
                    this.f44333a.m1352t(null);
                    this.f44333a.m1351s(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f44338f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f44333a.addView(view);
            } else {
                this.f44333a.removeView(view);
            }
        }
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: h */
    public final void mo13680h(Drawable drawable) {
        this.f44340h = drawable;
        m17640C();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: i */
    public final void mo13681i(Menu menu, InterfaceC0238hi interfaceC0238hi) {
        if (this.f44345m == null) {
            this.f44345m = new C0259ic(this.f44333a.getContext());
        }
        C0259ic c0259ic = this.f44345m;
        c0259ic.f25575e = interfaceC0238hi;
        Toolbar toolbar = this.f44333a;
        if (menu == null && toolbar.f1224a == null) {
            return;
        }
        toolbar.m1345m();
        C0225gw c0225gw = toolbar.f1224a.f987a;
        if (c0225gw == menu) {
            return;
        }
        if (c0225gw != null) {
            c0225gw.m9833m(toolbar.f1246w);
            c0225gw.m9833m(toolbar.f1247x);
        }
        if (toolbar.f1247x == null) {
            toolbar.f1247x = new C0855nn(toolbar);
        }
        c0259ic.m11040o();
        if (menu != null) {
            C0225gw c0225gw2 = (C0225gw) menu;
            c0225gw2.m9828h(c0259ic, toolbar.f1232i);
            c0225gw2.m9828h(toolbar.f1247x, toolbar.f1232i);
        } else {
            c0259ic.mo9484b(toolbar.f1232i, null);
            toolbar.f1247x.mo9484b(toolbar.f1232i, null);
            c0259ic.mo9491i();
            toolbar.f1247x.mo9491i();
        }
        toolbar.f1224a.m1077j(toolbar.f1233j);
        toolbar.f1224a.m1078k(c0259ic);
        toolbar.f1246w = c0259ic;
        toolbar.m1353u();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: j */
    public final void mo13682j() {
        this.f44337e = true;
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: k */
    public final void mo13683k(CharSequence charSequence) {
        this.f44342j = true;
        m17641z(charSequence);
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: l */
    public final void mo13684l(int i) {
        this.f44333a.setVisibility(i);
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: m */
    public final void mo13685m(Window.Callback callback) {
        this.f44336d = callback;
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: n */
    public final void mo13686n(CharSequence charSequence) {
        if (this.f44342j) {
            return;
        }
        m17641z(charSequence);
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: o */
    public final boolean mo13687o() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f44333a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1224a) != null && actionMenuView.f988b;
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: p */
    public final boolean mo13688p() {
        return this.f44333a.m1354v();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: q */
    public final boolean mo13689q() {
        C0259ic c0259ic;
        ActionMenuView actionMenuView = this.f44333a.f1224a;
        return (actionMenuView == null || (c0259ic = actionMenuView.f989c) == null || !c0259ic.m11036k()) ? false : true;
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: r */
    public final boolean mo13690r() {
        C0259ic c0259ic;
        ActionMenuView actionMenuView = this.f44333a.f1224a;
        if (actionMenuView == null || (c0259ic = actionMenuView.f989c) == null) {
            return false;
        }
        return c0259ic.f30286k != null || c0259ic.m11037l();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: s */
    public final boolean mo13691s() {
        return this.f44333a.m1355w();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: t */
    public final boolean mo13692t() {
        return this.f44333a.m1356x();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: u */
    public final void mo13693u() {
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: v */
    public final void mo13694v() {
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: w */
    public final void mo13695w() {
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: x */
    public final void mo13696x() {
        this.f44333a.requestLayout();
    }

    @Override // p000.InterfaceC0758jy
    /* JADX INFO: renamed from: y */
    public final bkn mo13697y(int i, long j) {
        bkn bknVarM551k = afq.m551k(this.f44333a);
        bknVarM551k.m2594o(i == 0 ? 1.0f : 0.0f);
        bknVarM551k.m2595p(j);
        bknVarM551k.m2596q(new C0859nr(this, i));
        return bknVarM551k;
    }
}
