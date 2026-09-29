package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.view.Lifecycle;
import p499y4.AbstractC10290a;

/* JADX INFO: renamed from: androidx.fragment.app.h0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC0955h0 extends AbstractC10290a {

    /* JADX INFO: renamed from: c */
    public final FragmentManager f6300c;

    /* JADX INFO: renamed from: g */
    public boolean f6304g;

    /* JADX INFO: renamed from: e */
    public C0940a f6302e = null;

    /* JADX INFO: renamed from: f */
    public Fragment f6303f = null;

    /* JADX INFO: renamed from: d */
    public final int f6301d = 0;

    @Deprecated
    public AbstractC0955h0(C0949e0 c0949e0) {
        this.f6300c = c0949e0;
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: a */
    public final void mo3731a(ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f6302e == null) {
            FragmentManager fragmentManager = this.f6300c;
            fragmentManager.getClass();
            this.f6302e = new C0940a(fragmentManager);
        }
        C0940a c0940a = this.f6302e;
        c0940a.getClass();
        FragmentManager fragmentManager2 = fragment.f6077O;
        if (fragmentManager2 == null || fragmentManager2 == c0940a.f6250q) {
            c0940a.m3774c(new AbstractC0963l0.a(6, fragment));
            if (fragment.equals(this.f6303f)) {
                this.f6303f = null;
            }
        } else {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: b */
    public final void mo3732b() {
        C0940a c0940a = this.f6302e;
        if (c0940a != null) {
            if (!this.f6304g) {
                try {
                    this.f6304g = true;
                    if (c0940a.f6350g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c0940a.f6351h = false;
                    c0940a.f6250q.m3668y(c0940a, true);
                    this.f6304g = false;
                } catch (Throwable th2) {
                    this.f6304g = false;
                    throw th2;
                }
            }
            this.f6302e = null;
        }
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: f */
    public final boolean mo3733f(View view, Object obj) {
        return ((Fragment) obj).f6094c0 == view;
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: g */
    public final void mo3734g() {
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: h */
    public final void mo3735h() {
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: i */
    public final void mo3736i(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f6303f;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f6300c;
            int i10 = this.f6301d;
            if (fragment2 != null) {
                if (fragment2.f6088Z) {
                    fragment2.f6088Z = false;
                }
                if (i10 == 1) {
                    if (this.f6302e == null) {
                        fragmentManager.getClass();
                        this.f6302e = new C0940a(fragmentManager);
                    }
                    this.f6302e.m3701m(this.f6303f, Lifecycle.State.STARTED);
                } else {
                    fragment2.m3593k0(false);
                }
            }
            if (!fragment.f6088Z) {
                fragment.f6088Z = true;
            }
            if (i10 == 1) {
                if (this.f6302e == null) {
                    fragmentManager.getClass();
                    this.f6302e = new C0940a(fragmentManager);
                }
                this.f6302e.m3701m(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.m3593k0(true);
            }
            this.f6303f = fragment;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: j */
    public final void mo3737j(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
