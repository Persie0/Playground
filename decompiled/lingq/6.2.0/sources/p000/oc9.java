package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class oc9 implements Set, yg4 {

    /* JADX INFO: renamed from: a */
    public final cd9 f54177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f54178b;

    public oc9(cd9 cd9Var, int i) {
        this.f54178b = i;
        this.f54177a = cd9Var;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m17912d(Collection collection) {
        m77 m77Var;
        int i;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        Set setM22627s1 = u91.m22627s1(collection);
        cd9 cd9Var = this.f54177a;
        boolean z = false;
        do {
            synchronized (AbstractC3695vr.f65812g) {
                bd9 bd9Var = cd9Var.f9940a;
                bd9Var.getClass();
                bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                m77Var = bd9Var2.f8392c;
                i = bd9Var2.f8393d;
            }
            m77Var.getClass();
            o77 o77VarMo15967b = m77Var.mo15967b();
            Iterator it = cd9Var.f9941b.iterator();
            while (((oh9) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((oh9) it).next();
                if (!setM22627s1.contains(entry.getKey())) {
                    o77VarMo15967b.remove(entry.getKey());
                    z = true;
                }
            }
            m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
            if (fa4.m11650l(m77VarMo14938b, m77Var)) {
                break;
            }
            bd9 bd9Var3 = cd9Var.f9940a;
            bd9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM4546a = cd9.m4546a(cd9Var, (bd9) nc9.m17371w(bd9Var3, cd9Var, jc9VarM17358j), i, m77VarMo14938b);
            }
            nc9.m17362n(jc9VarM17358j, cd9Var);
        } while (!zM4546a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f54178b) {
            case 0:
                AbstractC3695vr.m23487E();
                throw null;
            case 1:
                AbstractC3695vr.m23487E();
                throw null;
            default:
                AbstractC3695vr.m23487E();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f54178b) {
            case 0:
                AbstractC3695vr.m23487E();
                throw null;
            case 1:
                AbstractC3695vr.m23487E();
                throw null;
            default:
                AbstractC3695vr.m23487E();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f54177a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f54178b;
        cd9 cd9Var = this.f54177a;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof tg4) && !(obj instanceof wg4))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return fa4.m11650l(cd9Var.get(entry.getKey()), entry.getValue());
            case 1:
                return cd9Var.containsKey(obj);
            default:
                return cd9Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f54178b;
        cd9 cd9Var = this.f54177a;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!cd9Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!cd9Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f54177a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f54178b;
        cd9 cd9Var = this.f54177a;
        switch (i) {
            case 0:
                return new oh9(cd9Var, ((g14) cd9Var.m4547b().f8392c.entrySet()).iterator(), 0);
            case 1:
                return new oh9(cd9Var, ((g14) cd9Var.m4547b().f8392c.entrySet()).iterator(), 1);
            default:
                return new oh9(cd9Var, ((g14) cd9Var.m4547b().f8392c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f54178b
            r1 = 0
            r2 = 1
            cd9 r5 = r5.f54177a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            oc9 r0 = r5.f9941b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            oh9 r3 = (p000.oh9) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            oh9 r3 = (p000.oh9) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = p000.fa4.m11650l(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof p000.tg4
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof p000.wg4
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oc9.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        m77 m77Var;
        int i;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        boolean z = false;
        switch (this.f54178b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f54177a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f54177a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setM22627s1 = u91.m22627s1(collection);
                cd9 cd9Var = this.f54177a;
                do {
                    synchronized (AbstractC3695vr.f65812g) {
                        bd9 bd9Var = cd9Var.f9940a;
                        bd9Var.getClass();
                        bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                        m77Var = bd9Var2.f8392c;
                        i = bd9Var2.f8393d;
                    }
                    m77Var.getClass();
                    o77 o77VarMo15967b = m77Var.mo15967b();
                    Iterator it3 = cd9Var.f9941b.iterator();
                    while (((oh9) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((oh9) it3).next();
                        if (setM22627s1.contains(entry.getValue())) {
                            o77VarMo15967b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
                    if (!fa4.m11650l(m77VarMo14938b, m77Var)) {
                        bd9 bd9Var3 = cd9Var.f9940a;
                        bd9Var3.getClass();
                        synchronized (nc9.f52602c) {
                            jc9VarM17358j = nc9.m17358j();
                            zM4546a = cd9.m4546a(cd9Var, (bd9) nc9.m17371w(bd9Var3, cd9Var, jc9VarM17358j), i, m77VarMo14938b);
                        }
                        nc9.m17362n(jc9VarM17358j, cd9Var);
                    }
                    return z;
                } while (!zM4546a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        m77 m77Var;
        int i;
        jc9 jc9VarM17358j;
        boolean zM4546a;
        m77 m77Var2;
        int i2;
        jc9 jc9VarM17358j2;
        boolean zM4546a2;
        boolean z = false;
        switch (this.f54178b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(collection2, 10));
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                cd9 cd9Var = this.f54177a;
                do {
                    synchronized (AbstractC3695vr.f65812g) {
                        bd9 bd9Var = cd9Var.f9940a;
                        bd9Var.getClass();
                        bd9 bd9Var2 = (bd9) nc9.m17356h(bd9Var);
                        m77Var = bd9Var2.f8392c;
                        i = bd9Var2.f8393d;
                    }
                    m77Var.getClass();
                    o77 o77VarMo15967b = m77Var.mo15967b();
                    Iterator it = cd9Var.f9941b.iterator();
                    while (((oh9) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((oh9) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !fa4.m11650l(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            o77VarMo15967b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    m77 m77VarMo14938b = o77VarMo15967b.mo14938b();
                    if (!fa4.m11650l(m77VarMo14938b, m77Var)) {
                        bd9 bd9Var3 = cd9Var.f9940a;
                        bd9Var3.getClass();
                        synchronized (nc9.f52602c) {
                            jc9VarM17358j = nc9.m17358j();
                            zM4546a = cd9.m4546a(cd9Var, (bd9) nc9.m17371w(bd9Var3, cd9Var, jc9VarM17358j), i, m77VarMo14938b);
                        }
                        nc9.m17362n(jc9VarM17358j, cd9Var);
                    }
                    return z;
                } while (!zM4546a);
                return z;
            case 1:
                return m17912d(collection);
            default:
                Set setM22627s1 = u91.m22627s1(collection);
                cd9 cd9Var2 = this.f54177a;
                do {
                    synchronized (AbstractC3695vr.f65812g) {
                        bd9 bd9Var4 = cd9Var2.f9940a;
                        bd9Var4.getClass();
                        bd9 bd9Var5 = (bd9) nc9.m17356h(bd9Var4);
                        m77Var2 = bd9Var5.f8392c;
                        i2 = bd9Var5.f8393d;
                    }
                    m77Var2.getClass();
                    o77 o77VarMo15967b2 = m77Var2.mo15967b();
                    Iterator it2 = cd9Var2.f9941b.iterator();
                    while (((oh9) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((oh9) it2).next();
                        if (!setM22627s1.contains(entry3.getValue())) {
                            o77VarMo15967b2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    m77 m77VarMo14938b2 = o77VarMo15967b2.mo14938b();
                    if (!fa4.m11650l(m77VarMo14938b2, m77Var2)) {
                        bd9 bd9Var6 = cd9Var2.f9940a;
                        bd9Var6.getClass();
                        synchronized (nc9.f52602c) {
                            jc9VarM17358j2 = nc9.m17358j();
                            zM4546a2 = cd9.m4546a(cd9Var2, (bd9) nc9.m17371w(bd9Var6, cd9Var2, jc9VarM17358j2), i2, m77VarMo14938b2);
                        }
                        nc9.m17362n(jc9VarM17358j2, cd9Var2);
                    }
                    return z;
                } while (!zM4546a2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f54177a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }
}
