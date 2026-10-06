package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ndd extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ndf f42034a;

    public ndd(ndf ndfVar) {
        this.f42034a = ndfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lgh(this, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42034a.f42040b;
    }
}
