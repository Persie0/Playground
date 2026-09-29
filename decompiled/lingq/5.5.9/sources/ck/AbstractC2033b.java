package ck;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.C1042k0;
import com.lingq.p055ui.settings.DataStoreSettingsFragment;
import dagger.hilt.android.internal.managers.C5119f;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dm.C5206f;
import ml.C7634a;
import p226kl.C6717a;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: ck.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2033b extends Fragment implements InterfaceC8405b {

    /* JADX INFO: renamed from: v0 */
    public ViewComponentManager$FragmentContextWrapper f10470v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f10471w0;

    /* JADX INFO: renamed from: x0 */
    public volatile C5119f f10472x0;

    /* JADX INFO: renamed from: y0 */
    public final Object f10473y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f10474z0;

    public AbstractC2033b() {
        this.f10473y0 = new Object();
        this.f10474z0 = false;
    }

    public AbstractC2033b(int i10) {
        super(i10);
        this.f10473y0 = new Object();
        this.f10474z0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: E */
    public final void mo466E(Activity activity) {
        this.f6090a0 = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f10470v0;
        C5206f.m11030y0(viewComponentManager$FragmentContextWrapper == null || C5119f.m10897b(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m6205m0();
        if (!this.f10474z0) {
            this.f10474z0 = true;
            ((InterfaceC2032a) mo469d()).mo6204o((DataStoreSettingsFragment) this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        m6205m0();
        if (!this.f10474z0) {
            this.f10474z0 = true;
            ((InterfaceC2032a) mo469d()).mo6204o((DataStoreSettingsFragment) this);
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
        if (this.f10472x0 == null) {
            synchronized (this.f10473y0) {
                if (this.f10472x0 == null) {
                    this.f10472x0 = new C5119f(this);
                }
            }
        }
        return this.f10472x0.mo469d();
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return C7634a.m15194a(this, super.mo470i());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: m */
    public final Context mo471m() {
        if (super.mo471m() == null && !this.f10471w0) {
            return null;
        }
        m6205m0();
        return this.f10470v0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6205m0() {
        if (this.f10470v0 == null) {
            this.f10470v0 = new ViewComponentManager$FragmentContextWrapper(super.mo471m(), this);
            this.f10471w0 = C6717a.m13334a(super.mo471m());
        }
    }
}
