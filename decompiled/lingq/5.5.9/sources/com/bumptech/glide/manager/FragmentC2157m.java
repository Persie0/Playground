package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import java.util.HashSet;

/* JADX INFO: renamed from: com.bumptech.glide.manager.m */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class FragmentC2157m extends Fragment {

    /* JADX INFO: renamed from: a */
    public final C2145a f10863a;

    /* JADX INFO: renamed from: b */
    public final a f10864b;

    /* JADX INFO: renamed from: c */
    public final HashSet f10865c;

    /* JADX INFO: renamed from: d */
    public ComponentCallbacks2C2090l f10866d;

    /* JADX INFO: renamed from: e */
    public FragmentC2157m f10867e;

    /* JADX INFO: renamed from: f */
    public Fragment f10868f;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.m$a */
    public class a implements InterfaceC2159o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + FragmentC2157m.this + "}";
        }
    }

    public FragmentC2157m() {
        C2145a c2145a = new C2145a();
        this.f10864b = new a();
        this.f10865c = new HashSet();
        this.f10863a = c2145a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6369a(Activity activity) {
        FragmentC2157m fragmentC2157m = this.f10867e;
        if (fragmentC2157m != null) {
            fragmentC2157m.f10865c.remove(this);
            this.f10867e = null;
        }
        C2158n c2158n = ComponentCallbacks2C2080b.m6235a(activity).f10554e;
        c2158n.getClass();
        FragmentC2157m fragmentC2157mM6377h = c2158n.m6377h(activity.getFragmentManager(), null);
        this.f10867e = fragmentC2157mM6377h;
        if (!equals(fragmentC2157mM6377h)) {
            this.f10867e.f10865c.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6369a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10863a.m6364a();
        FragmentC2157m fragmentC2157m = this.f10867e;
        if (fragmentC2157m != null) {
            fragmentC2157m.f10865c.remove(this);
            this.f10867e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC2157m fragmentC2157m = this.f10867e;
        if (fragmentC2157m != null) {
            fragmentC2157m.f10865c.remove(this);
            this.f10867e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10863a.m6365b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10863a.m6366c();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f10868f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
