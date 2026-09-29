package p165i0;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import tl.AbstractC9314b;

/* JADX INFO: renamed from: i0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6119l extends AbstractC9314b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35944a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f35945b;

    public C6119l(C6113f c6113f) {
        C5207g.m11111f(c6113f, "builder");
        this.f35945b = c6113f;
    }

    public C6119l(MapBuilder mapBuilder) {
        C5207g.m11111f(mapBuilder, "backing");
        this.f35945b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f35944a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f35944a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Object obj = this.f35945b;
        switch (this.f35944a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C6113f) obj).clear();
                break;
            default:
                ((MapBuilder) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object obj2 = this.f35945b;
        switch (this.f35944a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ((C6113f) obj2).containsValue(obj);
            default:
                return ((MapBuilder) obj2).containsValue(obj);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f35944a) {
            case 1:
                return ((MapBuilder) this.f35945b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object obj = this.f35945b;
        switch (this.f35944a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C6120m((C6113f) obj);
            default:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new MapBuilder.C6751f(mapBuilder);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        switch (this.f35944a) {
            case 1:
                MapBuilder mapBuilder = (MapBuilder) this.f35945b;
                mapBuilder.m13403b();
                int i11 = mapBuilder.f38063f;
                while (true) {
                    i10 = -1;
                    i11--;
                    if (i11 >= 0) {
                        if (mapBuilder.f38060c[i11] >= 0) {
                            Object[] objArr = mapBuilder.f38059b;
                            C5207g.m11108c(objArr);
                            if (C5207g.m11106a(objArr[i11], obj)) {
                                i10 = i11;
                            }
                        }
                    }
                }
                if (i10 < 0) {
                    return false;
                }
                mapBuilder.m13410q(i10);
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f35944a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                ((MapBuilder) this.f35945b).m13403b();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f35944a) {
            case 1:
                C5207g.m11111f(collection, "elements");
                ((MapBuilder) this.f35945b).m13403b();
                break;
        }
        return super.retainAll(collection);
    }
}
