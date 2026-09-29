package p152hb;

import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p176ib.C6254b;
import p176ib.C6282n;

/* JADX INFO: renamed from: hb.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6028z extends AbstractRunnableC5962d0 {

    /* JADX INFO: renamed from: b */
    public final ArrayList<C2542a.e> f35630b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5966e0 f35631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6028z(C5966e0 c5966e0, ArrayList<C2542a.e> arrayList) {
        super(c5966e0);
        this.f35631c = c5966e0;
        this.f35630b = arrayList;
    }

    @Override // p152hb.AbstractRunnableC5962d0
    /* JADX INFO: renamed from: a */
    public final void mo12406a() {
        Set<Scope> setEmptySet;
        C5966e0 c5966e0 = this.f35631c;
        C5978i0 c5978i0 = c5966e0.f35463a.f35542m;
        C5990m0 c5990m0 = c5966e0.f35463a;
        C6254b c6254b = c5966e0.f35480r;
        if (c6254b == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(c6254b.f36440b);
            Map<C2542a<?>, C6282n> map = c6254b.f36442d;
            Iterator<C2542a<?>> it = map.keySet().iterator();
            loop1: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop1;
                    }
                    C2542a<?> next = it.next();
                    if (!c5990m0.f35536g.containsKey(next.f13885b)) {
                        map.get(next).getClass();
                        hashSet.addAll(null);
                    }
                }
            }
            setEmptySet = hashSet;
        }
        c5978i0.f35500K = setEmptySet;
        ArrayList<C2542a.e> arrayList = this.f35630b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo7541e(c5966e0.f35477o, c5990m0.f35542m.f35500K);
        }
    }
}
