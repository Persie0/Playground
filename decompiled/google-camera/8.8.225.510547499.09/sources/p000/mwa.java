package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mwa extends AbstractSet {

    /* JADX INFO: renamed from: b */
    final mwb f41705b;

    public mwa(mwb mwbVar) {
        this.f41705b = mwbVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo17039a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41705b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mvz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41705b.f41708c;
    }
}
