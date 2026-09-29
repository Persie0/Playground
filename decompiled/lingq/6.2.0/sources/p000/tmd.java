package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tmd extends end {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f62550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmd(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f62550f = i;
    }

    @Override // p000.end
    /* JADX INFO: renamed from: a */
    public void mo11276a(Iterator it, qnd qndVar) {
        switch (this.f62550f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f37584a;
                    if (!zHasNext) {
                        qndVar.m20086a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        qndVar.m20086a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.mo11276a(it, qndVar);
                break;
        }
    }

    @Override // p000.end
    /* JADX INFO: renamed from: b */
    public void mo11277b(Object obj, qnd qndVar) {
        switch (this.f62550f) {
            case 1:
                ngb ngbVar = (ngb) obj;
                if (ngbVar != null) {
                    lgb lgbVar = ngbVar.f52718a.f51311c;
                    lgbVar.getClass();
                    kgb kgbVar = new kgb(lgbVar, 0);
                    while (kgbVar.hasNext()) {
                        Map.Entry entry = (Map.Entry) kgbVar.next();
                        if (((Set) entry.getValue()).isEmpty()) {
                            qndVar.m20086a(null, (String) entry.getKey());
                        } else {
                            Iterator it = ((Set) entry.getValue()).iterator();
                            while (it.hasNext()) {
                                qndVar.m20086a(it.next(), (String) entry.getKey());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                super.mo11277b(obj, qndVar);
                break;
        }
    }
}
