package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import java.util.HashSet;

/* JADX INFO: renamed from: com.bumptech.glide.manager.r */
/* JADX INFO: loaded from: classes.dex */
public class C2162r extends Fragment {

    /* JADX INFO: renamed from: v0 */
    public final C2145a f10893v0;

    /* JADX INFO: renamed from: w0 */
    public final HashSet f10894w0;

    /* JADX INFO: renamed from: x0 */
    public C2162r f10895x0;

    /* JADX INFO: renamed from: y0 */
    public Fragment f10896y0;

    public C2162r() {
        C2145a c2145a = new C2145a();
        this.f10894w0 = new HashSet();
        this.f10893v0 = c2145a;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        super.mo467F(context);
        Fragment fragment = this;
        while (true) {
            Fragment fragment2 = fragment.f6080R;
            if (fragment2 == null) {
                break;
            } else {
                fragment = fragment2;
            }
        }
        FragmentManager fragmentManager = fragment.f6077O;
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context contextMo471m = mo471m();
            C2162r c2162r = this.f10895x0;
            if (c2162r != null) {
                c2162r.f10894w0.remove(this);
                this.f10895x0 = null;
            }
            C2162r c2162rM6378i = ComponentCallbacks2C2080b.m6235a(contextMo471m).f10554e.m6378i(fragmentManager);
            this.f10895x0 = c2162rM6378i;
            if (equals(c2162rM6378i)) {
                return;
            }
            this.f10895x0.f10894w0.add(this);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        this.f6090a0 = true;
        this.f10893v0.m6364a();
        C2162r c2162r = this.f10895x0;
        if (c2162r != null) {
            c2162r.f10894w0.remove(this);
            this.f10895x0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public final void mo3564L() {
        this.f6090a0 = true;
        this.f10896y0 = null;
        C2162r c2162r = this.f10895x0;
        if (c2162r != null) {
            c2162r.f10894w0.remove(this);
            this.f10895x0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public final void mo3570S() {
        this.f6090a0 = true;
        this.f10893v0.m6365b();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        this.f10893v0.m6366c();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment fragment = this.f6080R;
        if (fragment == null) {
            fragment = this.f10896y0;
        }
        sb2.append(fragment);
        sb2.append("}");
        return sb2.toString();
    }
}
