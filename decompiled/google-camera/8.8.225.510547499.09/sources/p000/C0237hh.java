package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: hh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0237hh {

    /* JADX INFO: renamed from: a */
    public View f27771a;

    /* JADX INFO: renamed from: b */
    public int f27772b;

    /* JADX INFO: renamed from: c */
    public PopupWindow.OnDismissListener f27773c;

    /* JADX INFO: renamed from: d */
    private final Context f27774d;

    /* JADX INFO: renamed from: e */
    private final C0225gw f27775e;

    /* JADX INFO: renamed from: f */
    private final boolean f27776f;

    /* JADX INFO: renamed from: g */
    private final int f27777g;

    /* JADX INFO: renamed from: h */
    private boolean f27778h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0238hi f27779i;

    /* JADX INFO: renamed from: j */
    private AbstractC0235hf f27780j;

    /* JADX INFO: renamed from: k */
    private final PopupWindow.OnDismissListener f27781k;

    public C0237hh(Context context, C0225gw c0225gw, View view, boolean z) {
        this(context, c0225gw, view, z, C0100R.attr.actionOverflowMenuStyle);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0235hf m10274a() {
        if (this.f27780j == null) {
            Display defaultDisplay = ((WindowManager) this.f27774d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            C0236hg.m10228a(defaultDisplay, point);
            AbstractC0235hf viewOnKeyListenerC0219gq = Math.min(point.x, point.y) >= this.f27774d.getResources().getDimensionPixelSize(C0100R.dimen.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0219gq(this.f27774d, this.f27771a, this.f27777g, this.f27776f) : new ViewOnKeyListenerC0245hp(this.f27774d, this.f27775e, this.f27771a, this.f27777g, this.f27776f);
            viewOnKeyListenerC0219gq.mo9625j(this.f27775e);
            viewOnKeyListenerC0219gq.mo9631p(this.f27781k);
            viewOnKeyListenerC0219gq.mo9627l(this.f27771a);
            viewOnKeyListenerC0219gq.mo9486d(this.f27779i);
            viewOnKeyListenerC0219gq.mo9628m(this.f27778h);
            viewOnKeyListenerC0219gq.mo9629n(this.f27772b);
            this.f27780j = viewOnKeyListenerC0219gq;
        }
        return this.f27780j;
    }

    /* JADX INFO: renamed from: b */
    public final void m10275b() {
        if (m10280g()) {
            this.f27780j.mo9626k();
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo10276c() {
        this.f27780j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f27773c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10277d(boolean z) {
        this.f27778h = z;
        AbstractC0235hf abstractC0235hf = this.f27780j;
        if (abstractC0235hf != null) {
            abstractC0235hf.mo9628m(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10278e(InterfaceC0238hi interfaceC0238hi) {
        this.f27779i = interfaceC0238hi;
        AbstractC0235hf abstractC0235hf = this.f27780j;
        if (abstractC0235hf != null) {
            abstractC0235hf.mo9486d(interfaceC0238hi);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10279f(int i, int i2, boolean z, boolean z2) {
        AbstractC0235hf abstractC0235hfM10274a = m10274a();
        abstractC0235hfM10274a.mo9632q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f27772b, afc.m442c(this.f27771a)) & 7) == 5) {
                i -= this.f27771a.getWidth();
            }
            abstractC0235hfM10274a.mo9630o(i);
            abstractC0235hfM10274a.mo9633r(i2);
            int i3 = (int) ((this.f27774d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            abstractC0235hfM10274a.f27531g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        abstractC0235hfM10274a.mo9634s();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10280g() {
        AbstractC0235hf abstractC0235hf = this.f27780j;
        return abstractC0235hf != null && abstractC0235hf.mo9636u();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10281h() {
        if (m10280g()) {
            return true;
        }
        if (this.f27771a == null) {
            return false;
        }
        m10279f(0, 0, false, false);
        return true;
    }

    public C0237hh(Context context, C0225gw c0225gw, View view, boolean z, int i) {
        this.f27772b = 8388611;
        this.f27781k = new dbd(this, 1);
        this.f27774d = context;
        this.f27775e = c0225gw;
        this.f27771a = view;
        this.f27776f = z;
        this.f27777g = i;
    }
}
