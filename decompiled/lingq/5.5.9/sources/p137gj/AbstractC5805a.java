package p137gj;

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

/* JADX INFO: renamed from: gj.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5805a extends C2966c implements InterfaceC8405b {

    /* JADX INFO: renamed from: L0 */
    public ViewComponentManager$FragmentContextWrapper f35077L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f35078M0;

    /* JADX INFO: renamed from: N0 */
    public volatile C5119f f35079N0;

    /* JADX INFO: renamed from: O0 */
    public final Object f35080O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f35081P0;

    public AbstractC5805a() {
        this.f35080O0 = new Object();
        this.f35081P0 = false;
    }

    public AbstractC5805a(int i10) {
        super(i10);
        this.f35080O0 = new Object();
        this.f35081P0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: E */
    public final void mo466E(Activity activity) {
        this.f6090a0 = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f35077L0;
        C5206f.m11030y0(viewComponentManager$FragmentContextWrapper == null || C5119f.m10897b(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m12222t0();
        if (this.f35081P0) {
            return;
        }
        this.f35081P0 = true;
        ((InterfaceC5809e) mo469d()).mo12223N();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        m12222t0();
        if (this.f35081P0) {
            return;
        }
        this.f35081P0 = true;
        ((InterfaceC5809e) mo469d()).mo12223N();
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
        if (this.f35079N0 == null) {
            synchronized (this.f35080O0) {
                if (this.f35079N0 == null) {
                    this.f35079N0 = new C5119f(this);
                }
            }
        }
        return this.f35079N0.mo469d();
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return C7634a.m15194a(this, super.mo470i());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: m */
    public final Context mo471m() {
        if (super.mo471m() == null && !this.f35078M0) {
            return null;
        }
        m12222t0();
        return this.f35077L0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12222t0() {
        if (this.f35077L0 == null) {
            this.f35077L0 = new ViewComponentManager$FragmentContextWrapper(super.mo471m(), this);
            this.f35078M0 = C6717a.m13334a(super.mo471m());
        }
    }
}
