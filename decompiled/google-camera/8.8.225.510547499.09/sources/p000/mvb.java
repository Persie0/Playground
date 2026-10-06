package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvb extends mzc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mvc f41674a;

    public mvb(mvc mvcVar) {
        this.f41674a = mvcVar;
    }

    @Override // p000.mzc
    /* JADX INFO: renamed from: a */
    public final myy mo16917a() {
        return this.f41674a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f41674a.mo16927e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41674a.mo3817b().mo16921g().size();
    }
}
