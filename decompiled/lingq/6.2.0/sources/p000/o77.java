package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class o77 extends AbstractMap implements Map, xg4 {

    /* JADX INFO: renamed from: a */
    public m77 f53936a;

    /* JADX INFO: renamed from: b */
    public u06 f53937b = new u06(13);

    /* JADX INFO: renamed from: c */
    public yba f53938c;

    /* JADX INFO: renamed from: d */
    public Object f53939d;

    /* JADX INFO: renamed from: e */
    public int f53940e;

    /* JADX INFO: renamed from: f */
    public int f53941f;

    public o77(m77 m77Var) {
        this.f53936a = m77Var;
        this.f53938c = m77Var.f50733a;
        this.f53941f = m77Var.f50734b;
    }

    /* JADX INFO: renamed from: a */
    public m77 mo14938b() {
        yba ybaVar = this.f53938c;
        m77 m77Var = this.f53936a;
        if (ybaVar != m77Var.f50733a) {
            this.f53937b = new u06(13);
            m77Var = new m77(this.f53938c, this.f53941f);
        }
        this.f53936a = m77Var;
        return m77Var;
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ m77 mo14938b() {
        return mo14938b();
    }

    /* JADX INFO: renamed from: c */
    public final void m17830c(int i) {
        this.f53941f = i;
        this.f53940e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f53938c = yba.f69611e;
        m17830c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f53938c.m25038d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new q77(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f53938c.m25041g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new q77(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f53939d = null;
        this.f53938c = this.f53938c.m25045l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f53939d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m77 m77VarMo14938b = null;
        m77 m77Var = map instanceof m77 ? (m77) map : null;
        if (m77Var == null) {
            o77 o77Var = map instanceof o77 ? (o77) map : null;
            if (o77Var != null) {
                m77VarMo14938b = o77Var.mo14938b();
            }
        } else {
            m77VarMo14938b = m77Var;
        }
        if (m77VarMo14938b == null) {
            super.putAll(map);
            return;
        }
        eb2 eb2Var = new eb2();
        eb2Var.f36969a = 0;
        int i = this.f53941f;
        yba ybaVar = this.f53938c;
        yba ybaVar2 = m77VarMo14938b.f50733a;
        ybaVar2.getClass();
        this.f53938c = ybaVar.m25046m(ybaVar2, 0, eb2Var, this);
        int i2 = (m77VarMo14938b.f50734b + i) - eb2Var.f36969a;
        if (i != i2) {
            m17830c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f53941f;
        yba ybaVarM25048o = this.f53938c.m25048o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (ybaVarM25048o == null) {
            ybaVarM25048o = yba.f69611e;
        }
        this.f53938c = ybaVarM25048o;
        return i != this.f53941f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f53941f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new rp5(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f53939d = null;
        yba ybaVarM25047n = this.f53938c.m25047n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (ybaVarM25047n == null) {
            ybaVarM25047n = yba.f69611e;
        }
        this.f53938c = ybaVarM25047n;
        return this.f53939d;
    }
}
