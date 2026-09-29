package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ne3 extends wta {

    /* JADX INFO: renamed from: h */
    public static final me3 f52635h = new me3(0);

    /* JADX INFO: renamed from: e */
    public final boolean f52639e;

    /* JADX INFO: renamed from: b */
    public final HashMap f52636b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f52637c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f52638d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f52640f = false;

    /* JADX INFO: renamed from: g */
    public boolean f52641g = false;

    public ne3(boolean z) {
        this.f52639e = z;
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f52640f = true;
    }

    /* JADX INFO: renamed from: V2 */
    public final void m17398V2(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (this.f52641g) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = abstractComponentCallbacksC0635c.f5693e;
        HashMap map = this.f52636b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(abstractComponentCallbacksC0635c.f5693e, abstractComponentCallbacksC0635c);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC0635c);
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m17399W2(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0635c);
        }
        m17401Y2(abstractComponentCallbacksC0635c.f5693e, z);
    }

    /* JADX INFO: renamed from: X2 */
    public final void m17400X2(String str, boolean z) {
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m17401Y2(str, z);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m17401Y2(String str, boolean z) {
        HashMap map = this.f52637c;
        ne3 ne3Var = (ne3) map.get(str);
        if (ne3Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ne3Var.f52637c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ne3Var.m17400X2((String) it.next(), true);
                }
            }
            ne3Var.mo8918U2();
            map.remove(str);
        }
        HashMap map2 = this.f52638d;
        cua cuaVar = (cua) map2.get(str);
        if (cuaVar != null) {
            cuaVar.m9899a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m17402Z2(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (this.f52641g) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f52636b.remove(abstractComponentCallbacksC0635c.f5693e) == null || !AbstractC0638f.m2128L(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0635c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne3.class == obj.getClass()) {
            ne3 ne3Var = (ne3) obj;
            if (this.f52636b.equals(ne3Var.f52636b) && this.f52637c.equals(ne3Var.f52637c) && this.f52638d.equals(ne3Var.f52638d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52638d.hashCode() + ((this.f52637c.hashCode() + (this.f52636b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f52636b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f52637c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f52638d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
