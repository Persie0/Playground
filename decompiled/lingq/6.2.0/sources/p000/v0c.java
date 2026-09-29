package p000;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v0c extends jnb {

    /* JADX INFO: renamed from: c */
    public static final v0c f64680c;

    /* JADX INFO: renamed from: b */
    public final ArrayList f64681b;

    static {
        v0c v0cVar = new v0c(new ArrayList(10));
        f64680c = v0cVar;
        v0cVar.f45884a = false;
    }

    public v0c(ArrayList arrayList) {
        this.f64681b = arrayList;
    }

    @Override // p000.utb
    /* JADX INFO: renamed from: N */
    public final utb mo5294N(int i) {
        ArrayList arrayList = this.f64681b;
        if (i < arrayList.size()) {
            ij6.m13959q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new v0c(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m14564d();
        this.f64681b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f64681b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m14564d();
        Object objRemove = this.f64681b.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m14564d();
        Object obj2 = this.f64681b.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64681b.size();
    }
}
