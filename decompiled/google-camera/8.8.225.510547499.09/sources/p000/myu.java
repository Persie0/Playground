package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class myu extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private transient Set f41822a;

    /* JADX INFO: renamed from: b */
    private transient Set f41823b;

    /* JADX INFO: renamed from: c */
    private transient Collection f41824c;

    /* JADX INFO: renamed from: a */
    public abstract Set mo16890a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f41822a;
        if (set != null) {
            return set;
        }
        Set setMo16890a = mo16890a();
        this.f41822a = setMo16890a;
        return setMo16890a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f41823b;
        if (set != null) {
            return set;
        }
        mys mysVar = new mys(this);
        this.f41823b = mysVar;
        return mysVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f41824c;
        if (collection != null) {
            return collection;
        }
        myt mytVar = new myt(this);
        this.f41824c = mytVar;
        return mytVar;
    }
}
