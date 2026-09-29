package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;

/* JADX INFO: loaded from: classes2.dex */
public final class sg9 extends uw5 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: Q */
    public static final int f60828Q = R$layout.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: H */
    public View f60829H;

    /* JADX INFO: renamed from: I */
    public View f60830I;

    /* JADX INFO: renamed from: J */
    public dx5 f60831J;

    /* JADX INFO: renamed from: K */
    public ViewTreeObserver f60832K;

    /* JADX INFO: renamed from: L */
    public boolean f60833L;

    /* JADX INFO: renamed from: M */
    public boolean f60834M;

    /* JADX INFO: renamed from: N */
    public int f60835N;

    /* JADX INFO: renamed from: P */
    public boolean f60837P;

    /* JADX INFO: renamed from: b */
    public final Context f60838b;

    /* JADX INFO: renamed from: c */
    public final hw5 f60839c;

    /* JADX INFO: renamed from: d */
    public final ew5 f60840d;

    /* JADX INFO: renamed from: e */
    public final boolean f60841e;

    /* JADX INFO: renamed from: f */
    public final int f60842f;

    /* JADX INFO: renamed from: g */
    public final int f60843g;

    /* JADX INFO: renamed from: h */
    public final int f60844h;

    /* JADX INFO: renamed from: i */
    public final ax5 f60845i;

    /* JADX INFO: renamed from: l */
    public PopupWindow.OnDismissListener f60848l;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC3507qq f60846j = new ViewTreeObserverOnGlobalLayoutListenerC3507qq(this, 3);

    /* JADX INFO: renamed from: k */
    public final io0 f60847k = new io0(this, 4);

    /* JADX INFO: renamed from: O */
    public int f60836O = 0;

    public sg9(int i, int i2, hw5 hw5Var, Context context, View view, boolean z) {
        this.f60838b = context;
        this.f60839c = hw5Var;
        this.f60841e = z;
        this.f60840d = new ew5(hw5Var, LayoutInflater.from(context), z, f60828Q);
        this.f60843g = i;
        this.f60844h = i2;
        Resources resources = context.getResources();
        this.f60842f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f60829H = view;
        this.f60845i = new ax5(context, null, i, i2);
        hw5Var.m13519b(this, context);
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: a */
    public final boolean mo10357a() {
        return !this.f60833L && this.f60845i.f35607U.isShowing();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
        if (hw5Var != this.f60839c) {
            return;
        }
        dismiss();
        dx5 dx5Var = this.f60831J;
        if (dx5Var != null) {
            dx5Var.mo10740b(hw5Var, z);
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        this.f60834M = false;
        ew5 ew5Var = this.f60840d;
        if (ew5Var != null) {
            ew5Var.notifyDataSetChanged();
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        boolean z;
        if (om9Var.hasVisibleItems()) {
            ww5 ww5Var = new ww5(this.f60843g, this.f60844h, om9Var, this.f60838b, this.f60830I, this.f60841e);
            dx5 dx5Var = this.f60831J;
            ww5Var.f67420i = dx5Var;
            uw5 uw5Var = ww5Var.f67421j;
            if (uw5Var != null) {
                uw5Var.mo709i(dx5Var);
            }
            int size = om9Var.f43042f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = om9Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ww5Var.m24179e(z);
            ww5Var.f67422k = this.f60848l;
            this.f60848l = null;
            this.f60839c.m13520c(false);
            ax5 ax5Var = this.f60845i;
            int width = ax5Var.f35613f;
            int iM10365o = ax5Var.m10365o();
            if ((Gravity.getAbsoluteGravity(this.f60836O, this.f60829H.getLayoutDirection()) & 7) == 5) {
                width += this.f60829H.getWidth();
            }
            if (!ww5Var.m24178c()) {
                if (ww5Var.f67417f != null) {
                    ww5Var.m24181g(width, iM10365o, true, true);
                }
            }
            dx5 dx5Var2 = this.f60831J;
            if (dx5Var2 != null) {
                dx5Var2.mo10741j(om9Var);
            }
            return true;
        }
        return false;
    }

    @Override // p000.k69
    public final void dismiss() {
        if (mo10357a()) {
            this.f60845i.dismiss();
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        return false;
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: f */
    public final void mo10360f() {
        View view;
        if (mo10357a()) {
            return;
        }
        if (this.f60833L || (view = this.f60829H) == null) {
            C3386nv.m17633t("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f60830I = view;
        ax5 ax5Var = this.f60845i;
        C3120iq c3120iq = ax5Var.f35607U;
        C3120iq c3120iq2 = ax5Var.f35607U;
        c3120iq.setOnDismissListener(this);
        ax5Var.f35597K = this;
        ax5Var.f35606T = true;
        c3120iq2.setFocusable(true);
        View view2 = this.f60830I;
        boolean z = this.f60832K == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f60832K = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f60846j);
        }
        view2.addOnAttachStateChangeListener(this.f60847k);
        ax5Var.f35596J = view2;
        ax5Var.f35619l = this.f60836O;
        boolean z2 = this.f60834M;
        Context context = this.f60838b;
        ew5 ew5Var = this.f60840d;
        if (!z2) {
            this.f60835N = uw5.m22968o(ew5Var, context, this.f60842f);
            this.f60834M = true;
        }
        ax5Var.m10367r(this.f60835N);
        c3120iq2.setInputMethodMode(2);
        Rect rect = this.f64467a;
        ax5Var.f35605S = rect != null ? new Rect(rect) : null;
        ax5Var.mo10360f();
        nm2 nm2Var = ax5Var.f35610c;
        nm2Var.setOnKeyListener(this);
        if (this.f60837P) {
            hw5 hw5Var = this.f60839c;
            if (hw5Var.f43049m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) nm2Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(hw5Var.f43049m);
                }
                frameLayout.setEnabled(false);
                nm2Var.addHeaderView(frameLayout, null, false);
            }
        }
        ax5Var.mo10366p(ew5Var);
        ax5Var.mo10360f();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: i */
    public final void mo709i(dx5 dx5Var) {
        this.f60831J = dx5Var;
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: k */
    public final nm2 mo10364k() {
        return this.f60845i.f35610c;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        return null;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: n */
    public final void mo16399n(hw5 hw5Var) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f60833L = true;
        this.f60839c.m13520c(true);
        ViewTreeObserver viewTreeObserver = this.f60832K;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f60832K = this.f60830I.getViewTreeObserver();
            }
            this.f60832K.removeGlobalOnLayoutListener(this.f60846j);
            this.f60832K = null;
        }
        this.f60830I.removeOnAttachStateChangeListener(this.f60847k);
        PopupWindow.OnDismissListener onDismissListener = this.f60848l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: p */
    public final void mo16400p(View view) {
        this.f60829H = view;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: q */
    public final void mo16401q(boolean z) {
        this.f60840d.f37990c = z;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: r */
    public final void mo16402r(int i) {
        this.f60836O = i;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: s */
    public final void mo16403s(int i) {
        this.f60845i.f35613f = i;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: t */
    public final void mo16404t(PopupWindow.OnDismissListener onDismissListener) {
        this.f60848l = onDismissListener;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: u */
    public final void mo16405u(boolean z) {
        this.f60837P = z;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: v */
    public final void mo16406v(int i) {
        this.f60845i.m10363j(i);
    }
}
