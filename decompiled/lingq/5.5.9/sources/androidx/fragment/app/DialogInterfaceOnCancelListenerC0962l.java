package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0192k;
import androidx.fragment.app.FragmentManager.C0930o;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.InterfaceC1051q;
import androidx.view.InterfaceC1057w;
import androidx.view.ViewTreeLifecycleOwner;
import androidx.view.ViewTreeViewModelStoreOwner;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0962l extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: A0 */
    public int f6322A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f6323B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f6324C0;

    /* JADX INFO: renamed from: D0 */
    public int f6325D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f6326E0;

    /* JADX INFO: renamed from: F0 */
    public final d f6327F0;

    /* JADX INFO: renamed from: G0 */
    public Dialog f6328G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f6329H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f6330I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f6331J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f6332K0;

    /* JADX INFO: renamed from: v0 */
    public Handler f6333v0;

    /* JADX INFO: renamed from: w0 */
    public final a f6334w0;

    /* JADX INFO: renamed from: x0 */
    public final b f6335x0;

    /* JADX INFO: renamed from: y0 */
    public final c f6336y0;

    /* JADX INFO: renamed from: z0 */
    public int f6337z0;

    /* JADX INFO: renamed from: androidx.fragment.app.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = DialogInterfaceOnCancelListenerC0962l.this;
            dialogInterfaceOnCancelListenerC0962l.f6336y0.onDismiss(dialogInterfaceOnCancelListenerC0962l.f6328G0);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = DialogInterfaceOnCancelListenerC0962l.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0962l.f6328G0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0962l.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = DialogInterfaceOnCancelListenerC0962l.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0962l.f6328G0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0962l.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$d */
    public class d implements InterfaceC1057w<InterfaceC1051q> {
        public d() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.view.InterfaceC1057w
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b */
        public final void mo3773b(InterfaceC1051q interfaceC1051q) {
            if (interfaceC1051q != null) {
                DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = DialogInterfaceOnCancelListenerC0962l.this;
                if (dialogInterfaceOnCancelListenerC0962l.f6324C0) {
                    View viewM3580c0 = dialogInterfaceOnCancelListenerC0962l.m3580c0();
                    if (viewM3580c0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0962l.f6328G0 != null) {
                        if (FragmentManager.m3608K(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0962l.f6328G0);
                        }
                        dialogInterfaceOnCancelListenerC0962l.f6328G0.setContentView(viewM3580c0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$e */
    public class e extends AbstractC0140a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0140a f6342a;

        public e(Fragment.C0911b c0911b) {
            this.f6342a = c0911b;
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: V */
        public final View mo584V(int i10) {
            AbstractC0140a abstractC0140a = this.f6342a;
            if (abstractC0140a.mo588Z()) {
                return abstractC0140a.mo584V(i10);
            }
            Dialog dialog = DialogInterfaceOnCancelListenerC0962l.this.f6328G0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: Z */
        public final boolean mo588Z() {
            if (!this.f6342a.mo588Z() && !DialogInterfaceOnCancelListenerC0962l.this.f6332K0) {
                return false;
            }
            return true;
        }
    }

    public DialogInterfaceOnCancelListenerC0962l() {
        this.f6334w0 = new a();
        this.f6335x0 = new b();
        this.f6336y0 = new c();
        this.f6337z0 = 0;
        this.f6322A0 = 0;
        this.f6323B0 = true;
        this.f6324C0 = true;
        this.f6325D0 = -1;
        this.f6327F0 = new d();
        this.f6332K0 = false;
    }

    public DialogInterfaceOnCancelListenerC0962l(int i10) {
        super(i10);
        this.f6334w0 = new a();
        this.f6335x0 = new b();
        this.f6336y0 = new c();
        this.f6337z0 = 0;
        this.f6322A0 = 0;
        this.f6323B0 = true;
        this.f6324C0 = true;
        this.f6325D0 = -1;
        this.f6327F0 = new d();
        this.f6332K0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    /* JADX INFO: renamed from: C */
    public final void mo3558C() {
        this.f6090a0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public void mo467F(Context context) {
        super.mo467F(context);
        this.f6114n0.m3896e(this.f6327F0);
        if (this.f6331J0) {
            return;
        }
        this.f6330I0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
        this.f6333v0 = new Handler();
        this.f6324C0 = this.f6082T == 0;
        if (bundle != null) {
            this.f6337z0 = bundle.getInt("android:style", 0);
            this.f6322A0 = bundle.getInt("android:theme", 0);
            this.f6323B0 = bundle.getBoolean("android:cancelable", true);
            this.f6324C0 = bundle.getBoolean("android:showsDialog", this.f6324C0);
            this.f6325D0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: K */
    public void mo3563K() {
        this.f6090a0 = true;
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            this.f6329H0 = true;
            dialog.setOnDismissListener(null);
            this.f6328G0.dismiss();
            if (!this.f6330I0) {
                onDismiss(this.f6328G0);
            }
            this.f6328G0 = null;
            this.f6332K0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public final void mo3564L() {
        this.f6090a0 = true;
        if (!this.f6331J0 && !this.f6330I0) {
            this.f6330I0 = true;
        }
        this.f6114n0.mo3899h(this.f6327F0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: M */
    public LayoutInflater mo468M(Bundle bundle) {
        LayoutInflater layoutInflaterMo468M = super.mo468M(bundle);
        boolean z10 = this.f6324C0;
        if (z10 && !this.f6326E0) {
            if (z10 && !this.f6332K0) {
                try {
                    this.f6326E0 = true;
                    Dialog dialogMo3769p0 = mo3769p0(bundle);
                    this.f6328G0 = dialogMo3769p0;
                    if (this.f6324C0) {
                        mo3771r0(dialogMo3769p0, this.f6337z0);
                        Context contextMo471m = mo471m();
                        if (contextMo471m instanceof Activity) {
                            this.f6328G0.setOwnerActivity((Activity) contextMo471m);
                        }
                        this.f6328G0.setCancelable(this.f6323B0);
                        this.f6328G0.setOnCancelListener(this.f6335x0);
                        this.f6328G0.setOnDismissListener(this.f6336y0);
                        this.f6332K0 = true;
                    } else {
                        this.f6328G0 = null;
                    }
                    this.f6326E0 = false;
                } catch (Throwable th2) {
                    this.f6326E0 = false;
                    throw th2;
                }
            }
            if (FragmentManager.m3608K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f6328G0;
            return dialog != null ? layoutInflaterMo468M.cloneInContext(dialog.getContext()) : layoutInflaterMo468M;
        }
        if (FragmentManager.m3608K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f6324C0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterMo468M;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public void mo3569R(Bundle bundle) {
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f6337z0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f6322A0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f6323B0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f6324C0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f6325D0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public void mo3570S() {
        this.f6090a0 = true;
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            this.f6329H0 = false;
            dialog.show();
            View decorView = this.f6328G0.getWindow().getDecorView();
            ViewTreeLifecycleOwner.m3912b(decorView, this);
            ViewTreeViewModelStoreOwner.m3914b(decorView, this);
            ViewTreeSavedStateRegistryOwner.m4583b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public void mo3571T() {
        this.f6090a0 = true;
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: V */
    public final void mo3573V(Bundle bundle) {
        Bundle bundle2;
        this.f6090a0 = true;
        if (this.f6328G0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6328G0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: W */
    public final void mo3574W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3574W(layoutInflater, viewGroup, bundle);
        if (this.f6094c0 == null && this.f6328G0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f6328G0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: f */
    public final AbstractC0140a mo3584f() {
        return new e(new Fragment.C0911b());
    }

    /* JADX INFO: renamed from: m0 */
    public void mo3766m0() {
        m3767n0(false, false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m3767n0(boolean z10, boolean z11) {
        if (this.f6330I0) {
            return;
        }
        this.f6330I0 = true;
        this.f6331J0 = false;
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f6328G0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f6333v0.getLooper()) {
                    onDismiss(this.f6328G0);
                } else {
                    this.f6333v0.post(this.f6334w0);
                }
            }
        }
        this.f6329H0 = true;
        if (this.f6325D0 >= 0) {
            FragmentManager fragmentManagerM3598r = m3598r();
            int i10 = this.f6325D0;
            if (i10 < 0) {
                throw new IllegalArgumentException(C0166e.m761g("Bad id: ", i10));
            }
            fragmentManagerM3598r.m3665v(fragmentManagerM3598r.new C0930o(null, i10, 1), z10);
            this.f6325D0 = -1;
            return;
        }
        C0940a c0940a = new C0940a(m3598r());
        c0940a.f6359p = true;
        c0940a.m3700l(this);
        if (z10) {
            c0940a.m3698j(true);
        } else {
            c0940a.m3697i();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public int mo3768o0() {
        return this.f6322A0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f6329H0) {
            return;
        }
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m3767n0(true, true);
    }

    /* JADX INFO: renamed from: p0 */
    public Dialog mo3769p0(Bundle bundle) {
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0192k(m3578a0(), mo3768o0());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q0 */
    public final Dialog m3770q0() {
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* JADX INFO: renamed from: r0 */
    public void mo3771r0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX INFO: renamed from: s0 */
    public void mo3772s0(FragmentManager fragmentManager, String str) {
        this.f6330I0 = false;
        this.f6331J0 = true;
        fragmentManager.getClass();
        C0940a c0940a = new C0940a(fragmentManager);
        c0940a.f6359p = true;
        c0940a.mo3695f(0, this, str, 1);
        c0940a.m3697i();
    }
}
