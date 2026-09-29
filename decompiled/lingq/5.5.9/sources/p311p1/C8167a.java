package p311p1;

import dm.C5207g;
import dm.C5213m;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.collections.C6752c;
import no.C7814a0;
import sl.C9072e;

/* JADX INFO: renamed from: p1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8167a<K, V> {

    /* JADX INFO: renamed from: a */
    public final C7814a0 f44291a = new C7814a0();

    /* JADX INFO: renamed from: b */
    public final HashMap<K, V> f44292b = new HashMap<>(0, 0.75f);

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet<K> f44293c = new LinkedHashSet<>();

    /* JADX INFO: renamed from: d */
    public int f44294d;

    /* JADX INFO: renamed from: e */
    public int f44295e;

    /* JADX INFO: renamed from: f */
    public int f44296f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final V m16201a(K k10) {
        synchronized (this.f44291a) {
            V v10 = this.f44292b.get(k10);
            if (v10 == null) {
                this.f44296f++;
                return null;
            }
            this.f44293c.remove(k10);
            this.f44293c.add(k10);
            this.f44295e++;
            return v10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final V m16202b(K k10, V v10) {
        V vPut;
        Object objM13422P;
        V v11;
        if (k10 == null || v10 == null) {
            throw null;
        }
        synchronized (this.f44291a) {
            this.f44294d = m16204d() + 1;
            vPut = this.f44292b.put(k10, v10);
            if (vPut != null) {
                this.f44294d = m16204d() - 1;
            }
            if (this.f44293c.contains(k10)) {
                this.f44293c.remove(k10);
            }
            this.f44293c.add(k10);
        }
        while (true) {
            synchronized (this.f44291a) {
                try {
                    if (m16204d() < 0 || ((this.f44292b.isEmpty() && m16204d() != 0) || this.f44292b.isEmpty() != this.f44293c.isEmpty())) {
                        break;
                    }
                    if (m16204d() <= 16 || this.f44292b.isEmpty()) {
                        objM13422P = null;
                        v11 = null;
                    } else {
                        objM13422P = C6752c.m13422P(this.f44293c);
                        v11 = this.f44292b.get(objM13422P);
                        if (v11 == null) {
                            throw new IllegalStateException("inconsistent state");
                        }
                        C5213m.m11198c(this.f44292b).remove(objM13422P);
                        LinkedHashSet<K> linkedHashSet = this.f44293c;
                        C5213m.m11196a(linkedHashSet);
                        linkedHashSet.remove(objM13422P);
                        int iM16204d = m16204d();
                        C5207g.m11108c(objM13422P);
                        this.f44294d = iM16204d - 1;
                    }
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objM13422P == null && v11 == null) {
                return vPut;
            }
            C5207g.m11108c(objM13422P);
            C5207g.m11108c(v11);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    /* JADX INFO: renamed from: c */
    public final V m16203c(K k10) {
        V vRemove;
        k10.getClass();
        synchronized (this.f44291a) {
            vRemove = this.f44292b.remove(k10);
            this.f44293c.remove(k10);
            if (vRemove != null) {
                this.f44294d = m16204d() - 1;
            }
            C9072e c9072e = C9072e.f47360a;
        }
        return vRemove;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final int m16204d() {
        int i10;
        synchronized (this.f44291a) {
            i10 = this.f44294d;
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String str;
        synchronized (this.f44291a) {
            int i10 = this.f44295e;
            int i11 = this.f44296f + i10;
            str = "LruCache[maxSize=16,hits=" + this.f44295e + ",misses=" + this.f44296f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
