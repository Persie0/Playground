package p537zi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.C1042k0;
import com.google.android.material.bottomsheet.C2966c;
import dagger.hilt.android.internal.managers.C5119f;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dm.C5206f;
import ml.C7634a;
import p226kl.C6717a;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: zi.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10497g extends C2966c implements InterfaceC8405b {

    /* JADX INFO: renamed from: L0 */
    public ViewComponentManager$FragmentContextWrapper f52434L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f52435M0;

    /* JADX INFO: renamed from: N0 */
    public volatile C5119f f52436N0;

    /* JADX INFO: renamed from: O0 */
    public final Object f52437O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f52438P0;

    public AbstractC10497g() {
        this.f52437O0 = new Object();
        this.f52438P0 = false;
    }

    public AbstractC10497g(int i10) {
        super(i10);
        this.f52437O0 = new Object();
        this.f52438P0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: E */
    public final void mo466E(Activity activity) {
        this.f6090a0 = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f52434L0;
        C5206f.m11030y0(viewComponentManager$FragmentContextWrapper == null || C5119f.m10897b(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m19480t0();
        if (this.f52438P0) {
            return;
        }
        this.f52438P0 = true;
        ((InterfaceC10499i) mo469d()).mo15135u0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        m19480t0();
        if (this.f52438P0) {
            return;
        }
        this.f52438P0 = true;
        ((InterfaceC10499i) mo469d()).mo15135u0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: M */
    public final LayoutInflater mo468M(Bundle bundle) {
        LayoutInflater layoutInflaterMo468M = super.mo468M(bundle);
        return layoutInflaterMo468M.cloneInContext(new ViewComponentManager$FragmentContextWrapper(layoutInflaterMo468M, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f52436N0 == null) {
            synchronized (this.f52437O0) {
                if (this.f52436N0 == null) {
                    this.f52436N0 = new C5119f(this);
                }
            }
        }
        return this.f52436N0.mo469d();
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return C7634a.m15194a(this, super.mo470i());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: m */
    public final Context mo471m() {
        if (super.mo471m() == null && !this.f52435M0) {
            return null;
        }
        m19480t0();
        return this.f52434L0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m19480t0() {
        if (this.f52434L0 == null) {
            this.f52434L0 = new ViewComponentManager$FragmentContextWrapper(super.mo471m(), this);
            this.f52435M0 = C6717a.m13334a(super.mo471m());
        }
    }
}
