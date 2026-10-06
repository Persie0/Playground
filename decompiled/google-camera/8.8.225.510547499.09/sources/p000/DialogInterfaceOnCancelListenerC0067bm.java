package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;

/* JADX INFO: renamed from: bm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0067bm extends ComponentCallbacksC0077bw implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ai */
    private boolean f3744ai;

    /* JADX INFO: renamed from: ak */
    private boolean f3746ak;

    /* JADX INFO: renamed from: al */
    private boolean f3747al;

    /* JADX INFO: renamed from: am */
    private boolean f3748am;

    /* JADX INFO: renamed from: c */
    public Dialog f3750c;

    /* JADX INFO: renamed from: ad */
    private final DialogInterface.OnCancelListener f3739ad = new DialogInterfaceOnCancelListenerC0063bi(this);

    /* JADX INFO: renamed from: a */
    public final DialogInterface.OnDismissListener f3738a = new DialogInterfaceOnDismissListenerC0064bj(this);

    /* JADX INFO: renamed from: ae */
    private int f3740ae = 0;

    /* JADX INFO: renamed from: af */
    private int f3741af = 0;

    /* JADX INFO: renamed from: ag */
    private boolean f3742ag = true;

    /* JADX INFO: renamed from: b */
    public boolean f3749b = true;

    /* JADX INFO: renamed from: ah */
    private int f3743ah = -1;

    /* JADX INFO: renamed from: aj */
    private final ale f3745aj = new C0065bk(this);

    /* JADX INFO: renamed from: d */
    public boolean f3751d = false;

    @Override // p000.ComponentCallbacksC0077bw
    /* JADX INFO: renamed from: aT */
    public final AbstractC0083cb mo2698aT() {
        return new C0066bl(this, super.mo2698aT());
    }

    /* JADX INFO: renamed from: c */
    public final void m2699c(C0111cq c0111cq, String str) {
        this.f3747al = false;
        this.f3748am = true;
        AbstractC0118cx abstractC0118cxM5327i = c0111cq.m5327i();
        abstractC0118cxM5327i.m5701q();
        abstractC0118cxM5327i.m5699o(this, str);
        abstractC0118cxM5327i.mo2021h();
    }

    @Override // p000.ComponentCallbacksC0077bw
    /* JADX INFO: renamed from: cj */
    public final void mo2700cj(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo2700cj(layoutInflater, viewGroup, bundle);
        if (this.f4586N != null || this.f3750c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3750c.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: d */
    public Dialog mo1739d() {
        if (C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new DialogC0908pm(requireContext(), this.f3741af);
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onAttach(Context context) {
        super.onAttach(context);
        ald aldVar = this.f4596X;
        ale aleVar = this.f3745aj;
        alc.m897a("observeForever");
        ala alaVar = new ala(aldVar, aleVar);
        alb albVar = (alb) aldVar.f625c.m19359f(aleVar, alaVar);
        if (albVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (albVar == null) {
            alaVar.m896d(true);
        }
        if (this.f3748am) {
            return;
        }
        this.f3747al = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // p000.ComponentCallbacksC0077bw
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f3749b = this.f4576D == 0;
        if (bundle != null) {
            this.f3740ae = bundle.getInt("android:style", 0);
            this.f3741af = bundle.getInt("android:theme", 0);
            this.f3742ag = bundle.getBoolean("android:cancelable", true);
            this.f3749b = bundle.getBoolean("android:showsDialog", this.f3749b);
            this.f3743ah = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f3750c;
        if (dialog != null) {
            this.f3746ak = true;
            dialog.setOnDismissListener(null);
            this.f3750c.dismiss();
            if (!this.f3747al) {
                onDismiss(this.f3750c);
            }
            this.f3750c = null;
            this.f3751d = false;
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDetach() {
        super.onDetach();
        if (!this.f3748am && !this.f3747al) {
            this.f3747al = true;
        }
        this.f4596X.mo903f(this.f3745aj);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3746ak) {
            return;
        }
        if (C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        if (this.f3747al) {
            return;
        }
        this.f3747al = true;
        this.f3748am = false;
        Dialog dialog = this.f3750c;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3750c.dismiss();
        }
        this.f3746ak = true;
        if (this.f3743ah < 0) {
            AbstractC0118cx abstractC0118cxM5327i = getParentFragmentManager().m5327i();
            abstractC0118cxM5327i.m5701q();
            abstractC0118cxM5327i.mo2024k(this);
            abstractC0118cxM5327i.mo2022i();
            return;
        }
        C0111cq parentFragmentManager = getParentFragmentManager();
        int i = this.f3743ah;
        if (i >= 0) {
            parentFragmentManager.m5296D(new C0110cp(parentFragmentManager, i), true);
            this.f3743ah = -1;
        } else {
            throw new IllegalArgumentException("Bad id: " + i);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = getLayoutInflater(bundle);
        if (!this.f3749b || this.f3744ai) {
            if (C0111cq.m5275S(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
            }
            return layoutInflater;
        }
        if (!this.f3751d) {
            try {
                this.f3744ai = true;
                Dialog dialogMo1739d = mo1739d();
                this.f3750c = dialogMo1739d;
                if (this.f3749b) {
                    switch (this.f3740ae) {
                        case 3:
                            Window window = dialogMo1739d.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                                break;
                            }
                        case 1:
                        case 2:
                            dialogMo1739d.requestWindowFeature(1);
                            break;
                    }
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f3750c.setOwnerActivity((Activity) context);
                    }
                    this.f3750c.setCancelable(this.f3742ag);
                    this.f3750c.setOnCancelListener(this.f3739ad);
                    this.f3750c.setOnDismissListener(this.f3738a);
                    this.f3751d = true;
                } else {
                    this.f3750c = null;
                }
                this.f3744ai = false;
            } catch (Throwable th) {
                this.f3744ai = false;
                throw th;
            }
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get layout inflater for DialogFragment ");
            sb2.append(this);
            sb2.append(" from dialog context");
        }
        Dialog dialog = this.f3750c;
        return dialog != null ? layoutInflater.cloneInContext(dialog.getContext()) : layoutInflater;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.f3750c;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f3740ae;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3741af;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.f3742ag) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.f3749b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.f3743ah;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f3750c;
        if (dialog != null) {
            this.f3746ak = false;
            dialog.show();
            View decorView = this.f3750c.getWindow().getDecorView();
            aci.m194c(decorView, this);
            acj.m196b(decorView, this);
            afh.m469A(decorView, this);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f3750c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f3750c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3750c.onRestoreInstanceState(bundle2);
    }
}
