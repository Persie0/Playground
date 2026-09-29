package p165i0;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import tl.AbstractC9317e;

/* JADX INFO: renamed from: i0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6117j extends AbstractC9317e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35942a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f35943b;

    public C6117j(C6113f c6113f) {
        C5207g.m11111f(c6113f, "builder");
        this.f35943b = c6113f;
    }

    public C6117j(MapBuilder mapBuilder) {
        C5207g.m11111f(mapBuilder, "backing");
        this.f35943b = mapBuilder;
    }

    @Override // tl.AbstractC9317e
    /* JADX INFO: renamed from: a */
    public final int mo12619a() {
        Object obj = this.f35943b;
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C6113f c6113f = (C6113f) obj;
                c6113f.getClass();
                return c6113f.f35935f;
            default:
                return ((MapBuilder) obj).f38065h;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C5207g.m11111f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f35942a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Object obj = this.f35943b;
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C6113f) obj).clear();
                break;
            default:
                ((MapBuilder) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ((C6113f) this.f35943b).containsKey(obj);
            default:
                return m12620l(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f35942a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                return ((MapBuilder) this.f35943b).m13404c(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f35942a) {
            case 1:
                return ((MapBuilder) this.f35943b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Object obj = this.f35943b;
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C6118k((C6113f) obj);
            default:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new MapBuilder.C6747b(mapBuilder);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12620l(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        return ((MapBuilder) this.f35943b).m13405d(entry);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12621q(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        MapBuilder mapBuilder = (MapBuilder) this.f35943b;
        mapBuilder.getClass();
        mapBuilder.m13403b();
        int iM13407k = mapBuilder.m13407k(entry.getKey());
        if (iM13407k < 0) {
            return false;
        }
        Object[] objArr = mapBuilder.f38059b;
        C5207g.m11108c(objArr);
        if (!C5207g.m11106a(objArr[iM13407k], entry.getValue())) {
            return false;
        }
        mapBuilder.m13410q(iM13407k);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f35942a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C6113f c6113f = (C6113f) this.f35943b;
                if (!c6113f.containsKey(obj)) {
                    return false;
                }
                c6113f.remove(obj);
                return true;
            default:
                return m12621q(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f35942a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                ((MapBuilder) this.f35943b).m13403b();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f35942a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                ((MapBuilder) this.f35943b).m13403b();
                break;
        }
        return super.retainAll(collection);
    }
}
