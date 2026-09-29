package p267n0;

import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p100em.InterfaceC5432d;

/* JADX INFO: renamed from: n0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7685p implements Map.Entry<Object, Object>, InterfaceC5432d.a {

    /* JADX INFO: renamed from: a */
    public final Object f42180a;

    /* JADX INFO: renamed from: b */
    public Object f42181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7686q<Object, Object> f42182c;

    public C7685p(C7686q<Object, Object> c7686q) {
        this.f42182c = c7686q;
        Map.Entry<? extends Object, ? extends Object> entry = c7686q.f42186d;
        C5207g.m11108c(entry);
        this.f42180a = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = c7686q.f42186d;
        C5207g.m11108c(entry2);
        this.f42181b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42180a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42181b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C7686q<Object, Object> c7686q = this.f42182c;
        if (c7686q.f42183a.m15278a().f42175d != c7686q.f42185c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f42181b;
        c7686q.f42183a.put(this.f42180a, obj);
        this.f42181b = obj;
        return obj2;
    }
}
