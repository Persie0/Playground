package p229l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes.dex */
public class C7203b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public c<K, V> f40531a;

    /* JADX INFO: renamed from: b */
    public c<K, V> f40532b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<f<K, V>, Boolean> f40533c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f40534d = 0;

    /* JADX INFO: renamed from: l.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p229l.C7203b.e
        /* JADX INFO: renamed from: b */
        public final c<K, V> mo14518b(c<K, V> cVar) {
            return cVar.f40538d;
        }

        @Override // p229l.C7203b.e
        /* JADX INFO: renamed from: c */
        public final c<K, V> mo14519c(c<K, V> cVar) {
            return cVar.f40537c;
        }
    }

    /* JADX INFO: renamed from: l.b$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p229l.C7203b.e
        /* JADX INFO: renamed from: b */
        public final c<K, V> mo14518b(c<K, V> cVar) {
            return cVar.f40537c;
        }

        @Override // p229l.C7203b.e
        /* JADX INFO: renamed from: c */
        public final c<K, V> mo14519c(c<K, V> cVar) {
            return cVar.f40538d;
        }
    }

    /* JADX INFO: renamed from: l.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f40535a;

        /* JADX INFO: renamed from: b */
        public final V f40536b;

        /* JADX INFO: renamed from: c */
        public c<K, V> f40537c;

        /* JADX INFO: renamed from: d */
        public c<K, V> f40538d;

        public c(K k10, V v10) {
            this.f40535a = k10;
            this.f40536b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f40535a.equals(cVar.f40535a) && this.f40536b.equals(cVar.f40536b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f40535a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f40536b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f40535a.hashCode() ^ this.f40536b.hashCode();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f40535a + "=" + this.f40536b;
        }
    }

    /* JADX INFO: renamed from: l.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f40539a;

        /* JADX INFO: renamed from: b */
        public boolean f40540b = true;

        public d() {
        }

        @Override // p229l.C7203b.f
        /* JADX INFO: renamed from: a */
        public final void mo14520a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f40539a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f40538d;
                this.f40539a = cVar3;
                this.f40540b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f40540b) {
                return C7203b.this.f40531a != null;
            }
            c<K, V> cVar = this.f40539a;
            return (cVar == null || cVar.f40537c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f40540b) {
                this.f40540b = false;
                this.f40539a = C7203b.this.f40531a;
            } else {
                c<K, V> cVar = this.f40539a;
                this.f40539a = cVar != null ? cVar.f40537c : null;
            }
            return this.f40539a;
        }
    }

    /* JADX INFO: renamed from: l.b$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f40542a;

        /* JADX INFO: renamed from: b */
        public c<K, V> f40543b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f40542a = cVar2;
            this.f40543b = cVar;
        }

        @Override // p229l.C7203b.f
        /* JADX INFO: renamed from: a */
        public final void mo14520a(c<K, V> cVar) {
            c<K, V> cVarMo14519c = null;
            if (this.f40542a == cVar && cVar == this.f40543b) {
                this.f40543b = null;
                this.f40542a = null;
            }
            c<K, V> cVar2 = this.f40542a;
            if (cVar2 == cVar) {
                this.f40542a = mo14518b(cVar2);
            }
            c<K, V> cVar3 = this.f40543b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f40542a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarMo14519c = mo14519c(cVar3);
                }
                this.f40543b = cVarMo14519c;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract c<K, V> mo14518b(c<K, V> cVar);

        /* JADX INFO: renamed from: c */
        public abstract c<K, V> mo14519c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f40543b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f40543b;
            c<K, V> cVar2 = this.f40542a;
            this.f40543b = (cVar == cVar2 || cVar2 == null) ? null : mo14519c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: l.b$f */
    public static abstract class f<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo14520a(c<K, V> cVar);
    }

    /* JADX INFO: renamed from: a */
    public c<K, V> mo14515a(K k10) {
        c<K, V> cVar = this.f40531a;
        while (cVar != null && !cVar.f40535a.equals(k10)) {
            cVar = cVar.f40537c;
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7203b)) {
            return false;
        }
        C7203b c7203b = (C7203b) obj;
        if (this.f40534d != c7203b.f40534d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c7203b.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if (entry != null || next == null) {
                if (entry == null || entry.equals(next)) {
                }
            }
            return false;
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public V mo14516f(K k10, V v10) {
        c<K, V> cVarMo14515a = mo14515a(k10);
        if (cVarMo14515a != null) {
            return cVarMo14515a.f40536b;
        }
        c<K, V> cVar = new c<>(k10, v10);
        this.f40534d++;
        c<K, V> cVar2 = this.f40532b;
        if (cVar2 == null) {
            this.f40531a = cVar;
            this.f40532b = cVar;
        } else {
            cVar2.f40537c = cVar;
            cVar.f40538d = cVar2;
            this.f40532b = cVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public V mo14517g(K k10) {
        c<K, V> cVarMo14515a = mo14515a(k10);
        if (cVarMo14515a == null) {
            return null;
        }
        this.f40534d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f40533c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo14520a(cVarMo14515a);
            }
        }
        c<K, V> cVar = cVarMo14515a.f40538d;
        if (cVar != null) {
            cVar.f40537c = cVarMo14515a.f40537c;
        } else {
            this.f40531a = cVarMo14515a.f40537c;
        }
        c<K, V> cVar2 = cVarMo14515a.f40537c;
        if (cVar2 != null) {
            cVar2.f40538d = cVar;
        } else {
            this.f40532b = cVar;
        }
        cVarMo14515a.f40537c = null;
        cVarMo14515a.f40538d = null;
        return cVarMo14515a.f40536b;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f40531a, this.f40532b);
        this.f40533c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            while (true) {
                e eVar = (e) it;
                if (!eVar.hasNext()) {
                    sb2.append("]");
                    return sb2.toString();
                }
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            }
        }
    }
}
