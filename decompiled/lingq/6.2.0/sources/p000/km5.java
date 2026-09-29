package p000;

import com.lingq.core.analytics.C1240a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class km5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3757xf f47512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kv4 f47513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1240a f47514c;

    public km5(C3757xf c3757xf, kv4 kv4Var, C1240a c1240a) {
        this.f47512a = c3757xf;
        this.f47513b = kv4Var;
        this.f47514c = c1240a;
    }

    /* JADX INFO: renamed from: a */
    public final void m15337a() {
        ArrayList arrayList = fb4.f38769t.m11694e().f57538b;
        ArrayList<Iterable> arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) fb4.f38769t.m11694e().f57537a.get(Long.valueOf(((Number) it.next()).longValue()));
            arrayList2.add(list != null ? u91.m22587E0(list) : null);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Iterable iterable : arrayList2) {
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            u91.m22630w0(iterable, arrayList3);
        }
        C1240a c1240a = this.f47514c;
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(lnb.m16397a((rb4) it2.next(), c1240a.f14300c));
        }
        this.f47513b.invoke(arrayList4);
    }
}
