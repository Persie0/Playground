package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class q77 extends AbstractC3022g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57351a;

    /* JADX INFO: renamed from: b */
    public final Object f57352b;

    public /* synthetic */ q77(Object obj, int i) {
        this.f57351a = i;
        this.f57352b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f57351a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f57351a) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f57351a) {
            case 0:
                ((o77) this.f57352b).clear();
                break;
            case 1:
                ((o77) this.f57352b).clear();
                break;
            default:
                ((MapBuilder) this.f57352b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f57351a;
        Object obj2 = this.f57352b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                o77 o77Var = (o77) this.f57352b;
                Object obj3 = o77Var.get(entry.getKey());
                if (obj3 != null) {
                    return obj3.equals(entry.getValue());
                }
                return entry.getValue() == null && o77Var.containsKey(entry.getKey());
            case 1:
                return ((o77) obj2).containsKey(obj);
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                MapBuilder mapBuilder = (MapBuilder) obj2;
                mapBuilder.getClass();
                int iM15397g = mapBuilder.m15397g(entry2.getKey());
                if (iM15397g < 0) {
                    return false;
                }
                Object[] objArr = mapBuilder.f47662b;
                objArr.getClass();
                return fa4.m11650l(objArr[iM15397g], entry2.getValue());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f57351a) {
            case 2:
                collection.getClass();
                return ((MapBuilder) this.f57352b).m15395e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // p000.AbstractC3022g1
    /* JADX INFO: renamed from: d */
    public final int mo12276d() {
        switch (this.f57351a) {
            case 0:
                return ((o77) this.f57352b).f53941f;
            case 1:
                return ((o77) this.f57352b).f53941f;
            default:
                return ((MapBuilder) this.f57352b).f47669i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f57351a) {
            case 2:
                return ((MapBuilder) this.f57352b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f57351a;
        Object obj = this.f57352b;
        switch (i) {
            case 0:
                return new r77((o77) obj);
            case 1:
                o77 o77Var = (o77) obj;
                zba[] zbaVarArr = new zba[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zbaVarArr[i2] = new aca(1);
                }
                return new s77(o77Var, zbaVarArr);
            default:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new op5(mapBuilder, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f57351a;
        Object obj2 = this.f57352b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((o77) this.f57352b).remove(entry.getKey(), entry.getValue());
            case 1:
                o77 o77Var = (o77) obj2;
                if (!o77Var.containsKey(obj)) {
                    return false;
                }
                o77Var.remove(obj);
                return true;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    MapBuilder mapBuilder = (MapBuilder) obj2;
                    mapBuilder.getClass();
                    mapBuilder.m15393c();
                    int iM15397g = mapBuilder.m15397g(entry2.getKey());
                    if (iM15397g >= 0) {
                        Object[] objArr = mapBuilder.f47662b;
                        objArr.getClass();
                        if (fa4.m11650l(objArr[iM15397g], entry2.getValue())) {
                            mapBuilder.m15401k(iM15397g);
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f57351a) {
            case 2:
                collection.getClass();
                ((MapBuilder) this.f57352b).m15393c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f57351a) {
            case 2:
                collection.getClass();
                ((MapBuilder) this.f57352b).m15393c();
                break;
        }
        return super.retainAll(collection);
    }
}
