package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1057v implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public boolean f47799a = false;

    /* JADX INFO: renamed from: b */
    public final List f47800b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m19460a(C1030u c1030u) {
        String str = c1030u.f47719a;
        Iterator it = this.f47800b.iterator();
        while (it.hasNext()) {
            if (str.equals(((C1030u) it.next()).f47719a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        this.f47800b.add(c1030u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C1030u c1030u : this.f47800b) {
            if (sb.length() != 0) {
                sb.append(VzWFSVj.WjdLBi);
            }
            sb.append(c1030u);
        }
        return sb.toString();
    }
}
