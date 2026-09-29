package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class rp5 extends AbstractCollection implements Collection, ug4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59680a;

    /* JADX INFO: renamed from: b */
    public final Object f59681b;

    public /* synthetic */ rp5(Object obj, int i) {
        this.f59680a = i;
        this.f59681b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f59680a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f59680a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f59680a) {
            case 0:
                ((MapBuilder) this.f59681b).clear();
                break;
            default:
                ((o77) this.f59681b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f59680a) {
            case 0:
                return ((MapBuilder) this.f59681b).containsValue(obj);
            default:
                return ((o77) this.f59681b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f59680a) {
            case 0:
                return ((MapBuilder) this.f59681b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f59680a;
        Object obj = this.f59681b;
        switch (i) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new op5(mapBuilder, 2);
            default:
                o77 o77Var = (o77) obj;
                zba[] zbaVarArr = new zba[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zbaVarArr[i2] = new aca(2);
                }
                return new s77(o77Var, zbaVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f59680a) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) this.f59681b;
                mapBuilder.m15393c();
                int iM15398h = mapBuilder.m15398h(obj);
                if (iM15398h < 0) {
                    return false;
                }
                mapBuilder.m15401k(iM15398h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f59680a) {
            case 0:
                collection.getClass();
                ((MapBuilder) this.f59681b).m15393c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f59680a) {
            case 0:
                collection.getClass();
                ((MapBuilder) this.f59681b).m15393c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f59680a) {
            case 0:
                return ((MapBuilder) this.f59681b).f47669i;
            default:
                return ((o77) this.f59681b).f53941f;
        }
    }
}
