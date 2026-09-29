package androidx.fragment.app;

import android.util.Log;
import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0951f0 extends AbstractC1036h0 {

    /* JADX INFO: renamed from: j */
    public static final a f6286j = new a();

    /* JADX INFO: renamed from: g */
    public final boolean f6290g;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Fragment> f6287d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<String, C0951f0> f6288e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final HashMap<String, C1046m0> f6289f = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public boolean f6291h = false;

    /* JADX INFO: renamed from: i */
    public boolean f6292i = false;

    /* JADX INFO: renamed from: androidx.fragment.app.f0$a */
    public class a implements C1042k0.b {
        @Override // androidx.view.C1042k0.b
        /* JADX INFO: renamed from: b */
        public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
            return new C0951f0(true);
        }
    }

    public C0951f0(boolean z10) {
        this.f6290g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0951f0.class == obj.getClass()) {
            C0951f0 c0951f0 = (C0951f0) obj;
            return this.f6287d.equals(c0951f0.f6287d) && this.f6288e.equals(c0951f0.f6288e) && this.f6289f.equals(c0951f0.f6289f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6289f.hashCode() + ((this.f6288e.hashCode() + (this.f6287d.hashCode() * 31)) * 31);
    }

    @Override // androidx.view.AbstractC1036h0
    /* JADX INFO: renamed from: j2 */
    public final void mo3725j2() {
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6291h = true;
    }

    /* JADX INFO: renamed from: l2 */
    public final void m3726l2(Fragment fragment) {
        if (this.f6292i) {
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> map = this.f6287d;
        if (map.containsKey(fragment.f6099f)) {
            return;
        }
        map.put(fragment.f6099f, fragment);
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m3727m2(Fragment fragment) {
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m3728n2(fragment.f6099f);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m3728n2(String str) {
        HashMap<String, C0951f0> map = this.f6288e;
        C0951f0 c0951f0 = map.get(str);
        if (c0951f0 != null) {
            c0951f0.mo3725j2();
            map.remove(str);
        }
        HashMap<String, C1046m0> map2 = this.f6289f;
        C1046m0 c1046m0 = map2.get(str);
        if (c1046m0 != null) {
            c1046m0.m3952a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m3729o2(Fragment fragment) {
        if (this.f6292i) {
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if ((this.f6287d.remove(fragment.f6099f) != null) && FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f6287d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f6288e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f6289f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
