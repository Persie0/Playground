package p040c4;

import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1685j extends AbstractC1036h0 implements InterfaceC1693r {

    /* JADX INFO: renamed from: e */
    public static final a f9412e = new a();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f9413d = new LinkedHashMap();

    /* JADX INFO: renamed from: c4.j$a */
    public static final class a implements C1042k0.b {
        @Override // androidx.view.C1042k0.b
        /* JADX INFO: renamed from: b */
        public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
            return new C1685j();
        }
    }

    @Override // p040c4.InterfaceC1693r
    /* JADX INFO: renamed from: H */
    public final C1046m0 mo5406H(String str) {
        C5207g.m11111f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f9413d;
        C1046m0 c1046m0 = (C1046m0) linkedHashMap.get(str);
        if (c1046m0 != null) {
            return c1046m0;
        }
        C1046m0 c1046m1 = new C1046m0();
        linkedHashMap.put(str, c1046m1);
        return c1046m1;
    }

    @Override // androidx.view.AbstractC1036h0
    /* JADX INFO: renamed from: j2 */
    public final void mo3725j2() {
        LinkedHashMap linkedHashMap = this.f9413d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C1046m0) it.next()).m3952a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f9413d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }
}
