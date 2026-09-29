package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: kv */
/* JADX INFO: loaded from: classes.dex */
public final class C3275kv extends l79 implements Map {

    /* JADX INFO: renamed from: d */
    public C3015fv f48445d;

    /* JADX INFO: renamed from: e */
    public C3089hv f48446e;

    /* JADX INFO: renamed from: f */
    public C3161jv f48447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275kv(l79 l79Var) {
        super(0);
        int i = l79Var.f49254c;
        m15970b(this.f49254c + i);
        if (this.f49254c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(l79Var.m15974f(i2), l79Var.m15977i(i2));
            }
        } else if (i > 0) {
            AbstractC3550rv.m20825S(0, 0, i, l79Var.f49252a, this.f49252a);
            AbstractC3550rv.m20826T(0, 0, i << 1, l79Var.f49253b, this.f49253b);
            this.f49254c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C3015fv c3015fv = this.f48445d;
        if (c3015fv != null) {
            return c3015fv;
        }
        C3015fv c3015fv2 = new C3015fv(this);
        this.f48445d = c3015fv2;
        return c3015fv2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15703j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15704k(Collection collection) {
        int i = this.f49254c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f49254c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3089hv c3089hv = this.f48446e;
        if (c3089hv != null) {
            return c3089hv;
        }
        C3089hv c3089hv2 = new C3089hv(this);
        this.f48446e = c3089hv2;
        return c3089hv2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m15970b(map.size() + this.f49254c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C3161jv c3161jv = this.f48447f;
        if (c3161jv != null) {
            return c3161jv;
        }
        C3161jv c3161jv2 = new C3161jv(this);
        this.f48447f = c3161jv2;
        return c3161jv2;
    }

    public C3275kv() {
        super(0);
    }
}
