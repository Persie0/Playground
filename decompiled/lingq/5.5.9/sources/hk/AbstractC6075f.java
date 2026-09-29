package hk;

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

/* JADX INFO: renamed from: hk.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6075f extends C2966c implements InterfaceC8405b {

    /* JADX INFO: renamed from: L0 */
    public ViewComponentManager$FragmentContextWrapper f35798L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f35799M0;

    /* JADX INFO: renamed from: N0 */
    public volatile C5119f f35800N0;

    /* JADX INFO: renamed from: O0 */
    public final Object f35801O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f35802P0;

    public AbstractC6075f() {
        this.f35801O0 = new Object();
        this.f35802P0 = false;
    }

    public AbstractC6075f(int i10) {
        super(i10);
        this.f35801O0 = new Object();
        this.f35802P0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: E */
    public final void mo466E(Activity activity) {
        this.f6090a0 = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f35798L0;
        C5206f.m11030y0(viewComponentManager$FragmentContextWrapper == null || C5119f.m10897b(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m12505t0();
        if (!this.f35802P0) {
            this.f35802P0 = true;
            ((InterfaceC6071b) mo469d()).mo12502q();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        m12505t0();
        if (this.f35802P0) {
            return;
        }
        this.f35802P0 = true;
        ((InterfaceC6071b) mo469d()).mo12502q();
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
        if (this.f35800N0 == null) {
            synchronized (this.f35801O0) {
                if (this.f35800N0 == null) {
                    this.f35800N0 = new C5119f(this);
                }
            }
        }
        return this.f35800N0.mo469d();
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return C7634a.m15194a(this, super.mo470i());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: m */
    public final Context mo471m() {
        if (super.mo471m() == null && !this.f35799M0) {
            return null;
        }
        m12505t0();
        return this.f35798L0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12505t0() {
        if (this.f35798L0 == null) {
            this.f35798L0 = new ViewComponentManager$FragmentContextWrapper(super.mo471m(), this);
            this.f35799M0 = C6717a.m13334a(super.mo471m());
        }
    }
}
