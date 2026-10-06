package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mtm extends mtq implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: a */
    public transient Map f41598a;

    /* JADX INFO: renamed from: b */
    public transient int f41599b;

    protected mtm(Map map) {
        lku.m15669w(map.isEmpty());
        this.f41598a = map;
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m16897l(mtm mtmVar) {
        mtmVar.f41599b++;
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ void m16898m(mtm mtmVar) {
        mtmVar.f41599b--;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ void m16899n(mtm mtmVar, int i) {
        mtmVar.f41599b += i;
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ void m16900o(mtm mtmVar, int i) {
        mtmVar.f41599b -= i;
    }

    /* JADX INFO: renamed from: a */
    public abstract Collection mo16884a();

    @Override // p000.myv
    /* JADX INFO: renamed from: b */
    public Collection mo16885b(Object obj) {
        Collection collectionMo16884a = (Collection) this.f41598a.get(obj);
        if (collectionMo16884a == null) {
            collectionMo16884a = mo16884a();
        }
        return mo16886c(obj, collectionMo16884a);
    }

    /* JADX INFO: renamed from: c */
    public Collection mo16886c(Object obj, Collection collection) {
        throw null;
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: e */
    public final int mo16901e() {
        return this.f41599b;
    }

    @Override // p000.mtq
    /* JADX INFO: renamed from: f */
    public final Iterator mo16902f() {
        return new msy(this);
    }

    /* JADX INFO: renamed from: g */
    final List m16903g(Object obj, List list, mti mtiVar) {
        return list instanceof RandomAccess ? new mtg(this, obj, list, mtiVar) : new mtk(this, obj, list, mtiVar);
    }

    @Override // p000.mtq
    /* JADX INFO: renamed from: h */
    public final Map mo16904h() {
        return new mtc(this, this.f41598a);
    }

    @Override // p000.mtq
    /* JADX INFO: renamed from: i */
    public final Set mo16905i() {
        return new mtf(this, this.f41598a);
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: j */
    public final void mo16906j() {
        Iterator it = this.f41598a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f41598a.clear();
        this.f41599b = 0;
    }

    /* JADX INFO: renamed from: k */
    final void m16907k(Map map) {
        this.f41598a = map;
        this.f41599b = 0;
        for (Collection collection : map.values()) {
            lku.m15669w(!collection.isEmpty());
            this.f41599b += collection.size();
        }
    }

    @Override // p000.mtq
    /* JADX INFO: renamed from: p */
    public final void mo16908p(Object obj, Object obj2) {
        Collection collection = (Collection) this.f41598a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.f41599b++;
            }
        } else {
            Collection collectionMo16884a = mo16884a();
            if (!collectionMo16884a.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.f41599b++;
            this.f41598a.put(obj, collectionMo16884a);
        }
    }
}
