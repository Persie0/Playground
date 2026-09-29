package si;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.C1042k0;
import dagger.hilt.android.internal.managers.C5119f;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dm.C5206f;
import ml.C7634a;
import p226kl.C6717a;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: si.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9040x extends Fragment implements InterfaceC8405b {

    /* JADX INFO: renamed from: v0 */
    public ViewComponentManager$FragmentContextWrapper f47287v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f47288w0;

    /* JADX INFO: renamed from: x0 */
    public volatile C5119f f47289x0;

    /* JADX INFO: renamed from: y0 */
    public final Object f47290y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f47291z0;

    public AbstractC9040x() {
        this.f47290y0 = new Object();
        this.f47291z0 = false;
    }

    public AbstractC9040x(int i10) {
        super(i10);
        this.f47290y0 = new Object();
        this.f47291z0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: E */
    public final void mo466E(Activity activity) {
        this.f6090a0 = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f47287v0;
        C5206f.m11030y0(viewComponentManager$FragmentContextWrapper == null || C5119f.m10897b(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m17268m0();
        if (this.f47291z0) {
            return;
        }
        this.f47291z0 = true;
        ((InterfaceC9034r) mo469d()).mo15097F();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        m17268m0();
        if (!this.f47291z0) {
            this.f47291z0 = true;
            ((InterfaceC9034r) mo469d()).mo15097F();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: M */
    public final LayoutInflater mo468M(Bundle bundle) {
        LayoutInflater layoutInflaterMo468M = super.mo468M(bundle);
        return layoutInflaterMo468M.cloneInContext(new ViewComponentManager$FragmentContextWrapper(layoutInflaterMo468M, this));
    }

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f47289x0 == null) {
            synchronized (this.f47290y0) {
                if (this.f47289x0 == null) {
                    this.f47289x0 = new C5119f(this);
                }
            }
        }
        return this.f47289x0.mo469d();
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return C7634a.m15194a(this, super.mo470i());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: m */
    public final Context mo471m() {
        if (super.mo471m() == null && !this.f47288w0) {
            return null;
        }
        m17268m0();
        return this.f47287v0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m17268m0() {
        if (this.f47287v0 == null) {
            this.f47287v0 = new ViewComponentManager$FragmentContextWrapper(super.mo471m(), this);
            this.f47288w0 = C6717a.m13334a(super.mo471m());
        }
    }
}
