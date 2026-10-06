package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwe extends mws {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mzp f41723a;

    public mwe() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.mws, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41723a.contains(obj);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lku.m15620O(i, size());
        mzp mzpVar = this.f41723a;
        return mzpVar.f41669a.mo17022e(mzpVar.first(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41723a.size();
    }

    @Override // p000.mws, p000.mwj
    Object writeReplace() {
        return new mwd(this.f41723a);
    }

    public mwe(mzp mzpVar) {
        this.f41723a = mzpVar;
    }
}
