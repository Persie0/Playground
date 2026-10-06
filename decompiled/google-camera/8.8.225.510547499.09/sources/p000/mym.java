package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mym extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final List f41816a;

    /* JADX INFO: renamed from: b */
    final mrf f41817b;

    public mym(List list, mrf mrfVar) {
        list.getClass();
        this.f41816a = list;
        mrfVar.getClass();
        this.f41817b = mrfVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f41816a.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new myl(this, this.f41816a.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41816a.size();
    }
}
