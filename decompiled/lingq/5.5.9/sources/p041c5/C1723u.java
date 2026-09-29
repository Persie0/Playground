package p041c5;

import android.support.v4.media.AbstractC0140a;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1318k;
import p026b5.InterfaceC1316i;
import p235l5.RunnableC7258e;

/* JADX INFO: renamed from: c5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1723u extends AbstractC0140a {

    /* JADX INFO: renamed from: j */
    public static final String f9554j = AbstractC1314g.m4868f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final C1699a0 f9555a;

    /* JADX INFO: renamed from: b */
    public final String f9556b;

    /* JADX INFO: renamed from: c */
    public final ExistingWorkPolicy f9557c;

    /* JADX INFO: renamed from: d */
    public final List<? extends AbstractC1318k> f9558d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f9559e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f9560f;

    /* JADX INFO: renamed from: g */
    public final List<C1723u> f9561g;

    /* JADX INFO: renamed from: h */
    public boolean f9562h;

    /* JADX INFO: renamed from: i */
    public C1716n f9563i;

    public C1723u() {
        throw null;
    }

    public C1723u(C1699a0 c1699a0, String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        this.f9555a = c1699a0;
        this.f9556b = str;
        this.f9557c = existingWorkPolicy;
        this.f9558d = list;
        this.f9561g = null;
        this.f9559e = new ArrayList(list.size());
        this.f9560f = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((AbstractC1318k) list.get(i10)).f8066a.toString();
            C5207g.m11110e(string, "id.toString()");
            this.f9559e.add(string);
            this.f9560f.add(string);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m5464l0(C1723u c1723u, HashSet hashSet) {
        hashSet.addAll(c1723u.f9559e);
        HashSet hashSetM5465m0 = m5465m0(c1723u);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetM5465m0.contains((String) it.next())) {
                return true;
            }
        }
        List<C1723u> list = c1723u.f9561g;
        if (list != null && !list.isEmpty()) {
            Iterator<C1723u> it2 = list.iterator();
            while (it2.hasNext()) {
                if (m5464l0(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(c1723u.f9559e);
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static HashSet m5465m0(C1723u c1723u) {
        HashSet hashSet = new HashSet();
        List<C1723u> list = c1723u.f9561g;
        if (list != null && !list.isEmpty()) {
            Iterator<C1723u> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f9559e);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k0 */
    public final InterfaceC1316i m5466k0() {
        if (this.f9562h) {
            AbstractC1314g.m4867d().mo4873g(f9554j, "Already enqueued work ids (" + TextUtils.join(", ", this.f9559e) + ")");
        } else {
            RunnableC7258e runnableC7258e = new RunnableC7258e(this);
            this.f9555a.f9478d.m14863a(runnableC7258e);
            this.f9563i = runnableC7258e.f40751b;
        }
        return this.f9563i;
    }
}
