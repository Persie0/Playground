package p000;

import android.util.ArrayMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dfv implements dgn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Executor f10819a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Set f10820b;

    public dfv(Executor executor, Set set) {
        this.f10819a = executor;
        this.f10820b = set;
    }

    @Override // p000.dgn
    /* JADX INFO: renamed from: bq */
    public final void mo6081bq(long j, Map map) {
        this.f10819a.execute(new dcr(this.f10820b, j, map, 3));
    }

    @Override // p000.dgn
    /* JADX INFO: renamed from: br */
    public final Map mo6082br() {
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = this.f10820b.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((dgn) it.next()).mo6082br().entrySet()) {
                String str = (String) entry.getKey();
                Float f = (Float) entry.getValue();
                if (!arrayMap.containsKey(str) || ((Float) arrayMap.get(str)).compareTo(f) > 0) {
                    arrayMap.put(str, f);
                }
            }
        }
        return arrayMap;
    }
}
