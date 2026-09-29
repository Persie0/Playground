package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.player.C1808b;
import com.lingq.feature.library.LibraryUpdateFragment;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class st3 extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public final Object f61386A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f61387B0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f61388w0;

    /* JADX INFO: renamed from: x0 */
    public eta f61389x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f61390y0;

    /* JADX INFO: renamed from: z0 */
    public volatile C3159jt f61391z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st3(int i, int i2) {
        super(i);
        this.f61388w0 = i2;
        switch (i2) {
            case 1:
                super(i);
                this.f61390y0 = false;
                this.f61386A0 = new Object();
                this.f61387B0 = false;
                break;
            default:
                this.f61390y0 = false;
                this.f61386A0 = new Object();
                this.f61387B0 = false;
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        switch (this.f61388w0) {
            case 0:
                LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
                return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
            case 1:
                LayoutInflater layoutInflaterMo2078E2 = super.mo2078E(bundle);
                return layoutInflaterMo2078E2.cloneInContext(new eta(layoutInflaterMo2078E2, this));
            default:
                LayoutInflater layoutInflaterMo2078E3 = super.mo2078E(bundle);
                return layoutInflaterMo2078E3.cloneInContext(new eta(layoutInflaterMo2078E3, this));
        }
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        switch (this.f61388w0) {
            case 0:
                if (this.f61391z0 == null) {
                    synchronized (this.f61386A0) {
                        try {
                            if (this.f61391z0 == null) {
                                this.f61391z0 = new C3159jt(this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return this.f61391z0.mo6995b();
            case 1:
                if (this.f61391z0 == null) {
                    synchronized (this.f61386A0) {
                        try {
                            if (this.f61391z0 == null) {
                                this.f61391z0 = new C3159jt(this);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return this.f61391z0.mo6995b();
            default:
                if (this.f61391z0 == null) {
                    synchronized (this.f61386A0) {
                        try {
                            if (this.f61391z0 == null) {
                                this.f61391z0 = new C3159jt(this);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return this.f61391z0.mo6995b();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m21737c0() {
        if (this.f61389x0 == null) {
            this.f61389x0 = new eta(super.mo2107i(), this);
            this.f61390y0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        switch (this.f61388w0) {
            case 0:
                break;
            case 1:
                break;
        }
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public void m21738d0() {
        if (this.f61389x0 == null) {
            this.f61389x0 = new eta(super.mo2107i(), this);
            this.f61390y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m21739e0() {
        if (this.f61389x0 == null) {
            this.f61389x0 = new eta(super.mo2107i(), this);
            this.f61390y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m21740f0() {
        switch (this.f61388w0) {
            case 0:
                if (!this.f61387B0) {
                    this.f61387B0 = true;
                    av3 av3Var = (av3) mo6995b();
                    HomeFragment homeFragment = (HomeFragment) this;
                    fy1 fy1Var = (fy1) av3Var;
                    ky1 ky1Var = fy1Var.f39919b;
                    homeFragment.f33893I0 = (hm5) ky1Var.f48736r.get();
                    homeFragment.f33894J0 = (C3509qs) ky1Var.f48768z.get();
                    homeFragment.f33895K0 = (og8) ky1Var.f48671a2.get();
                    homeFragment.f33896L0 = (C1808b) ky1Var.f48667Z1.get();
                    homeFragment.f33897M0 = fy1Var.m12244a();
                }
                break;
            case 1:
                if (!this.f61387B0) {
                    this.f61387B0 = true;
                    ky1 ky1Var2 = ((fy1) ((t55) mo6995b())).f39919b;
                    ((LessonPreviewFragment) this).f26706F0 = (ob1) ky1Var2.f48696h.get();
                }
                break;
            default:
                if (!this.f61387B0) {
                    this.f61387B0 = true;
                    ka5 ka5Var = (ka5) mo6995b();
                    LibraryUpdateFragment libraryUpdateFragment = (LibraryUpdateFragment) this;
                    fy1 fy1Var2 = (fy1) ka5Var;
                    libraryUpdateFragment.f26437D0 = fy1Var2.m12244a();
                    libraryUpdateFragment.f26438E0 = (hm5) fy1Var2.f39919b.f48736r.get();
                }
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        switch (this.f61388w0) {
            case 0:
                if (super.mo2107i() == null && !this.f61390y0) {
                    return null;
                }
                m21739e0();
                return this.f61389x0;
            case 1:
                if (super.mo2107i() == null && !this.f61390y0) {
                    return null;
                }
                m21738d0();
                return this.f61389x0;
            default:
                if (super.mo2107i() == null && !this.f61390y0) {
                    return null;
                }
                m21737c0();
                return this.f61389x0;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        switch (this.f61388w0) {
            case 0:
                this.f5688b0 = true;
                eta etaVar = this.f61389x0;
                if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m21739e0();
                m21740f0();
                break;
            case 1:
                this.f5688b0 = true;
                eta etaVar2 = this.f61389x0;
                if (etaVar2 != null && C3159jt.m14640c(etaVar2) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m21738d0();
                m21740f0();
                break;
            default:
                this.f5688b0 = true;
                eta etaVar3 = this.f61389x0;
                if (etaVar3 != null && C3159jt.m14640c(etaVar3) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m21737c0();
                m21740f0();
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        switch (this.f61388w0) {
            case 0:
                super.mo2123y(context);
                m21739e0();
                m21740f0();
                break;
            case 1:
                super.mo2123y(context);
                m21738d0();
                m21740f0();
                break;
            default:
                super.mo2123y(context);
                m21737c0();
                m21740f0();
                break;
        }
    }

    public st3() {
        this.f61388w0 = 2;
        this.f61390y0 = false;
        this.f61386A0 = new Object();
        this.f61387B0 = false;
    }
}
