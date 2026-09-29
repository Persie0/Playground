package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i86 extends wta {

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f43688b = new LinkedHashMap();

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        LinkedHashMap linkedHashMap = this.f43688b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((cua) it.next()).m9899a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iM13170e = had.m13170e(this);
        ci8.m4727l(16);
        sb.append(dha.m10393e(16, ((long) iM13170e) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.f43688b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
