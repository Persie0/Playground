package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cd9 implements ph9, Map, xg4 {

    /* JADX INFO: renamed from: a */
    public bd9 f9940a;

    /* JADX INFO: renamed from: b */
    public final oc9 f9941b;

    /* JADX INFO: renamed from: c */
    public final oc9 f9942c;

    /* JADX INFO: renamed from: d */
    public final oc9 f9943d;

    public cd9() {
        m77 m77Var = m77.f50732c;
        jc9 jc9VarM17358j = nc9.m17358j();
        bd9 bd9Var = new bd9(jc9VarM17358j.mo3582g(), m77Var);
        if (!(jc9VarM17358j instanceof yn3)) {
            bd9Var.f59323b = new bd9(1L, m77Var);
        }
        this.f9940a = bd9Var;
        this.f9941b = new oc9(this, 0);
        this.f9942c = new oc9(this, 1);
        this.f9943d = new oc9(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4546a(cd9 cd9Var, bd9 bd9Var, int i, m77 m77Var) {
        boolean z;
        synchronized (AbstractC3695vr.f65812g) {
            int i2 = bd9Var.f8393d;
            if (i2 == i) {
                bd9Var.f8392c = m77Var;
                z = true;
                bd9Var.f8393d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final bd9 m4547b() {
        bd9 bd9Var = this.f9940a;
        bd9Var.getClass();
        return (bd9) nc9.m17368t(bd9Var, this);
    }

    @Override // java.util.Map
    public final void clear() {
        jc9 jc9VarM17358j;
        bd9 bd9Var = this.f9940a;
        bd9Var.getClass();
        bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
        m77 m77Var = m77.f50732c;
        if (m77Var != bd9Var2.f8392c) {
            bd9 bd9Var3 = this.f9940a;
            bd9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                bd9 bd9Var4 = (bd9) nc9.m17371w(bd9Var3, this, jc9VarM17358j);
                synchronized (AbstractC3695vr.f65812g) {
                    bd9Var4.f8392c = m77Var;
                    bd9Var4.f8393d++;
                }
            }
            nc9.m17362n(jc9VarM17358j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m4547b().f8392c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m4547b().f8392c.containsValue(obj);
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f9940a;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9941b;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f9940a = (bd9) rh9Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m4547b().f8392c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m4547b().f8392c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9942c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m77 m77Var;
        int i;
        Object objPut;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        do {
            synchronized (AbstractC3695vr.f65812g) {
                bd9 bd9Var = this.f9940a;
                bd9Var.getClass();
                bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                m77Var = bd9Var2.f8392c;
                i = bd9Var2.f8393d;
            }
            m77Var.getClass();
            o77 o77VarMo15967b = m77Var.mo15967b();
            objPut = o77VarMo15967b.put(obj, obj2);
            m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
            if (fa4.m11650l(m77VarMo14938b, m77Var)) {
                break;
            }
            bd9 bd9Var3 = this.f9940a;
            bd9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM4546a = m4546a(this, (bd9) nc9.m17371w(bd9Var3, this, jc9VarM17358j), i, m77VarMo14938b);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM4546a);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m77 m77Var;
        int i;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        do {
            synchronized (AbstractC3695vr.f65812g) {
                bd9 bd9Var = this.f9940a;
                bd9Var.getClass();
                bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                m77Var = bd9Var2.f8392c;
                i = bd9Var2.f8393d;
            }
            m77Var.getClass();
            o77 o77VarMo15967b = m77Var.mo15967b();
            o77VarMo15967b.putAll(map);
            m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
            if (fa4.m11650l(m77VarMo14938b, m77Var)) {
                return;
            }
            bd9 bd9Var3 = this.f9940a;
            bd9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM4546a = m4546a(this, (bd9) nc9.m17371w(bd9Var3, this, jc9VarM17358j), i, m77VarMo14938b);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM4546a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m77 m77Var;
        int i;
        V vRemove;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        do {
            synchronized (AbstractC3695vr.f65812g) {
                bd9 bd9Var = this.f9940a;
                bd9Var.getClass();
                bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                m77Var = bd9Var2.f8392c;
                i = bd9Var2.f8393d;
            }
            m77Var.getClass();
            o77 o77VarMo15967b = m77Var.mo15967b();
            vRemove = o77VarMo15967b.remove(obj);
            m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
            if (fa4.m11650l(m77VarMo14938b, m77Var)) {
                break;
            }
            bd9 bd9Var3 = this.f9940a;
            bd9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM4546a = m4546a(this, (bd9) nc9.m17371w(bd9Var3, this, jc9VarM17358j), i, m77VarMo14938b);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM4546a);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        m77 m77Var = m4547b().f8392c;
        m77Var.getClass();
        return m77Var.f50734b;
    }

    public final String toString() {
        bd9 bd9Var = this.f9940a;
        bd9Var.getClass();
        return "SnapshotStateMap(value=" + ((bd9) nc9.m17356h(bd9Var)).f8392c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9943d;
    }
}
