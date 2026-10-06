package p000;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtl extends mti implements Set {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mtm f41597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtl(mtm mtmVar, Object obj, Set set) {
        super(mtmVar, obj, set, null);
        this.f41597f = mtmVar;
    }

    @Override // p000.mti, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zM16753E = mpw.m16753E((Set) this.f41591b, collection);
        if (zM16753E) {
            mtm.m16899n(this.f41597f, this.f41591b.size() - size);
            m16894c();
        }
        return zM16753E;
    }
}
