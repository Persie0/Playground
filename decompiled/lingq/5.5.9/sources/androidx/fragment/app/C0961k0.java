package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0961k0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Fragment> f6318a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, C0959j0> f6319b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, FragmentState> f6320c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public C0951f0 f6321d;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m3757a(Fragment fragment) {
        if (this.f6318a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f6318a) {
            this.f6318a.add(fragment);
        }
        fragment.f6111l = true;
    }

    /* JADX INFO: renamed from: b */
    public final Fragment m3758b(String str) {
        C0959j0 c0959j0 = this.f6319b.get(str);
        if (c0959j0 != null) {
            return c0959j0.f6311c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Fragment m3759c(String str) {
        for (C0959j0 c0959j0 : this.f6319b.values()) {
            if (c0959j0 != null) {
                Fragment fragmentM3759c = c0959j0.f6311c;
                if (!str.equals(fragmentM3759c.f6099f)) {
                    fragmentM3759c = fragmentM3759c.f6079Q.f6160c.m3759c(str);
                }
                if (fragmentM3759c != null) {
                    return fragmentM3759c;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m3760d() {
        ArrayList arrayList = new ArrayList();
        for (C0959j0 c0959j0 : this.f6319b.values()) {
            if (c0959j0 != null) {
                arrayList.add(c0959j0);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m3761e() {
        ArrayList arrayList = new ArrayList();
        for (C0959j0 c0959j0 : this.f6319b.values()) {
            if (c0959j0 != null) {
                arrayList.add(c0959j0.f6311c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final List<Fragment> m3762f() {
        ArrayList arrayList;
        if (this.f6318a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f6318a) {
            arrayList = new ArrayList(this.f6318a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m3763g(C0959j0 c0959j0) {
        Fragment fragment = c0959j0.f6311c;
        String str = fragment.f6099f;
        HashMap<String, C0959j0> map = this.f6319b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.f6099f, c0959j0);
        if (fragment.f6087Y) {
            if (fragment.f6086X) {
                this.f6321d.m3726l2(fragment);
            } else {
                this.f6321d.m3729o2(fragment);
            }
            fragment.f6087Y = false;
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3764h(C0959j0 c0959j0) {
        Fragment fragment = c0959j0.f6311c;
        if (fragment.f6086X) {
            this.f6321d.m3729o2(fragment);
        }
        if (this.f6319b.put(fragment.f6099f, null) == null) {
            return;
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    /* JADX INFO: renamed from: i */
    public final FragmentState m3765i(String str, FragmentState fragmentState) {
        HashMap<String, FragmentState> map = this.f6320c;
        return fragmentState != null ? map.put(str, fragmentState) : map.remove(str);
    }
}
