package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mtq implements myv {

    /* JADX INFO: renamed from: a */
    private transient Set f41601a;

    /* JADX INFO: renamed from: b */
    private transient Map f41602b;

    /* JADX INFO: renamed from: c */
    public transient Collection f41603c;

    /* JADX INFO: renamed from: d */
    public transient Collection f41604d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myv) {
            return mo16912q().equals(((myv) obj).mo16912q());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Iterator mo16902f() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract Map mo16904h();

    public final int hashCode() {
        return mo16912q().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public abstract Set mo16905i();

    /* JADX INFO: renamed from: p */
    public void mo16908p(Object obj, Object obj2) {
        throw null;
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: q */
    public final Map mo16912q() {
        Map map = this.f41602b;
        if (map != null) {
            return map;
        }
        Map mapMo16904h = mo16904h();
        this.f41602b = mapMo16904h;
        return mapMo16904h;
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: r */
    public final Set mo16913r() {
        Set set = this.f41601a;
        if (set != null) {
            return set;
        }
        Set setMo16905i = mo16905i();
        this.f41601a = setMo16905i;
        return setMo16905i;
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: s */
    public final boolean mo16914s(Object obj, Object obj2) {
        Collection collection = (Collection) mo16912q().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16915t() {
        return mo16901e() == 0;
    }

    public final String toString() {
        return mo16912q().toString();
    }

    @Override // p000.myv
    /* JADX INFO: renamed from: u */
    public final boolean mo16916u(Object obj, Object obj2) {
        Collection collection = (Collection) mo16912q().get(obj);
        return collection != null && collection.remove(obj2);
    }
}
