package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n92 {

    /* JADX INFO: renamed from: a */
    public final String f52504a;

    /* JADX INFO: renamed from: b */
    public final qn3 f52505b;

    public n92(Set set, qn3 qn3Var) {
        this.f52504a = m17289b(set);
        this.f52505b = qn3Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m17289b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            u40 u40Var = (u40) it.next();
            sb.append(u40Var.f63375a);
            sb.append('/');
            sb.append(u40Var.f63376b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m17290a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        qn3 qn3Var = this.f52505b;
        synchronized (((HashSet) qn3Var.f57974a)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) qn3Var.f57974a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f52504a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) qn3Var.f57974a)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) qn3Var.f57974a);
        }
        sb.append(m17289b(setUnmodifiableSet2));
        return sb.toString();
    }
}
