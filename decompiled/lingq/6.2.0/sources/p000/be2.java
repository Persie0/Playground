package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.runtime.R$id;

/* JADX INFO: loaded from: classes2.dex */
public class be2 extends AbstractComponentCallbacksC0635c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: F0 */
    public boolean f8415F0;

    /* JADX INFO: renamed from: H0 */
    public Dialog f8417H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f8418I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f8419J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f8420K0;

    /* JADX INFO: renamed from: w0 */
    public Handler f8422w0;

    /* JADX INFO: renamed from: x0 */
    public RunnableC3468pp f8423x0 = new RunnableC3468pp(this, 4);

    /* JADX INFO: renamed from: y0 */
    public xd2 f8424y0 = new xd2(this, 0);

    /* JADX INFO: renamed from: z0 */
    public yd2 f8425z0 = new yd2(this);

    /* JADX INFO: renamed from: A0 */
    public int f8410A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f8411B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public boolean f8412C0 = true;

    /* JADX INFO: renamed from: D0 */
    public boolean f8413D0 = true;

    /* JADX INFO: renamed from: E0 */
    public int f8414E0 = -1;

    /* JADX INFO: renamed from: G0 */
    public zd2 f8416G0 = new zd2(this);

    /* JADX INFO: renamed from: L0 */
    public boolean f8421L0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: C */
    public void mo2076C() {
        this.f5688b0 = true;
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            this.f8418I0 = true;
            dialog.setOnDismissListener(null);
            this.f8417H0.dismiss();
            if (!this.f8419J0) {
                onDismiss(this.f8417H0);
            }
            this.f8417H0 = null;
            this.f8421L0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: D */
    public final void mo2077D() {
        this.f5688b0 = true;
        if (!this.f8420K0 && !this.f8419J0) {
            this.f8419J0 = true;
        }
        this.f5711o0.mo13910h(this.f8416G0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        boolean z = this.f8413D0;
        if (z && !this.f8415F0) {
            if (z && !this.f8421L0) {
                try {
                    this.f8415F0 = true;
                    Dialog dialogMo3662h0 = mo3662h0(bundle);
                    this.f8417H0 = dialogMo3662h0;
                    if (this.f8413D0) {
                        mo3664j0(dialogMo3662h0, this.f8410A0);
                        Context contextMo2107i = mo2107i();
                        if (contextMo2107i instanceof Activity) {
                            this.f8417H0.setOwnerActivity((Activity) contextMo2107i);
                        }
                        this.f8417H0.setCancelable(this.f8412C0);
                        this.f8417H0.setOnCancelListener(this.f8424y0);
                        this.f8417H0.setOnDismissListener(this.f8425z0);
                        this.f8421L0 = true;
                    } else {
                        this.f8417H0 = null;
                    }
                    this.f8415F0 = false;
                } catch (Throwable th) {
                    this.f8415F0 = false;
                    throw th;
                }
            }
            if (AbstractC0638f.m2128L(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f8417H0;
            if (dialog != null) {
                return layoutInflaterMo2078E.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0638f.m2128L(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f8413D0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterMo2078E;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterMo2078E;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public void mo2082I(Bundle bundle) {
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f8410A0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f8411B0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f8412C0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f8413D0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f8414E0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: J */
    public void mo2083J() {
        this.f5688b0 = true;
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            this.f8418I0 = false;
            dialog.show();
            View decorView = this.f8417H0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R$id.view_tree_lifecycle_owner, this);
            decorView.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
            decorView.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public void mo2084L() {
        this.f5688b0 = true;
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: N */
    public final void mo2086N(Bundle bundle) {
        Bundle bundle2;
        this.f5688b0 = true;
        if (this.f8417H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f8417H0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: O */
    public final void mo2087O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo2087O(layoutInflater, viewGroup, bundle);
        if (this.f5692d0 != null || this.f8417H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f8417H0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: a */
    public final bq1 mo2099a() {
        return new ae2(this, new cd3(this));
    }

    /* JADX INFO: renamed from: c0 */
    public void mo3657c0() {
        m3659e0(false, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3658d0() {
        m3659e0(true, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3659e0(boolean z, boolean z2) {
        if (this.f8419J0) {
            return;
        }
        this.f8419J0 = true;
        this.f8420K0 = false;
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f8417H0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f8422w0.getLooper()) {
                    onDismiss(this.f8417H0);
                } else {
                    this.f8422w0.post(this.f8423x0);
                }
            }
        }
        this.f8418I0 = true;
        if (this.f8414E0 >= 0) {
            AbstractC0638f abstractC0638fM2109k = m2109k();
            int i = this.f8414E0;
            if (i < 0) {
                C3386nv.m17626m(ux5.m22988k(i, "Bad id: "));
                return;
            } else {
                abstractC0638fM2109k.m2189x(new je3(abstractC0638fM2109k, null, i, 1), z);
                this.f8414E0 = -1;
                return;
            }
        }
        g70 g70Var = new g70(m2109k());
        g70Var.f40302p = true;
        g70Var.m12400j(this);
        if (z) {
            g70Var.m12397g(true, true);
        } else {
            g70Var.m12396f();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final Dialog m3660f0() {
        return this.f8417H0;
    }

    /* JADX INFO: renamed from: g0 */
    public int mo3661g0() {
        return this.f8411B0;
    }

    /* JADX INFO: renamed from: h0 */
    public Dialog mo3662h0(Bundle bundle) {
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new xc1(m2090R(), mo3661g0());
    }

    /* JADX INFO: renamed from: i0 */
    public final Dialog m3663i0() {
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            return dialog;
        }
        v63.m23148z("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void mo3664j0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX INFO: renamed from: k0 */
    public void m3665k0(AbstractC0638f abstractC0638f, String str) {
        this.f8419J0 = false;
        this.f8420K0 = true;
        abstractC0638f.getClass();
        g70 g70Var = new g70(abstractC0638f);
        g70Var.f40302p = true;
        g70Var.m12398h(0, this, str, 1);
        g70Var.m12396f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8418I0) {
            return;
        }
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m3659e0(true, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: v */
    public final void mo2120v() {
        this.f5688b0 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public void mo2123y(Context context) {
        Object obj;
        super.mo2123y(context);
        zd2 zd2Var = this.f8416G0;
        w56 w56Var = this.f5711o0;
        w56Var.getClass();
        w56.m23760a("observeForever");
        zg5 zg5Var = new zg5(w56Var, zd2Var);
        pk8 pk8Var = w56Var.f66418b;
        mk8 mk8VarMo19364d = pk8Var.mo19364d(zd2Var);
        if (mk8VarMo19364d != null) {
            obj = mk8VarMo19364d.f51442b;
        } else {
            mk8 mk8Var = new mk8(zd2Var, zg5Var);
            pk8Var.f56355d++;
            mk8 mk8Var2 = pk8Var.f56353b;
            if (mk8Var2 == null) {
                pk8Var.f56352a = mk8Var;
                pk8Var.f56353b = mk8Var;
            } else {
                mk8Var2.f51443c = mk8Var;
                mk8Var.f51444d = mk8Var2;
                pk8Var.f56353b = mk8Var;
            }
            obj = null;
        }
        bh5 bh5Var = (bh5) obj;
        if (bh5Var instanceof ah5) {
            C3386nv.m17626m("Cannot add the same observer with different lifecycles");
            return;
        }
        if (bh5Var == null) {
            zg5Var.m3717a(true);
        }
        if (this.f8420K0) {
            return;
        }
        this.f8419J0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        this.f8422w0 = new Handler();
        this.f8413D0 = this.f5679U == 0;
        if (bundle != null) {
            this.f8410A0 = bundle.getInt("android:style", 0);
            this.f8411B0 = bundle.getInt("android:theme", 0);
            this.f8412C0 = bundle.getBoolean("android:cancelable", true);
            this.f8413D0 = bundle.getBoolean("android:showsDialog", this.f8413D0);
            this.f8414E0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
