package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2948e1 implements j56 {

    /* JADX INFO: renamed from: a */
    public transient Set f36547a;

    /* JADX INFO: renamed from: b */
    public transient Collection f36548b;

    /* JADX INFO: renamed from: c */
    public transient Map f36549c;

    @Override // p000.j56
    /* JADX INFO: renamed from: a */
    public Map mo10786a() {
        Map map = this.f36549c;
        if (map != null) {
            return map;
        }
        Map mapMo6317b = mo6317b();
        this.f36549c = mapMo6317b;
        return mapMo6317b;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map mo6317b();

    /* JADX INFO: renamed from: c */
    public abstract Set mo6318c();

    /* JADX INFO: renamed from: d */
    public abstract Collection mo6271d();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j56) {
            return mo10786a().equals(((j56) obj).mo10786a());
        }
        return false;
    }

    public final int hashCode() {
        return mo10786a().hashCode();
    }

    public final String toString() {
        return mo10786a().toString();
    }

    @Override // p000.j56
    public Collection values() {
        Collection collection = this.f36548b;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo6271d = mo6271d();
        this.f36548b = collectionMo6271d;
        return collectionMo6271d;
    }
}
