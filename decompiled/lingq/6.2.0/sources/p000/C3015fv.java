package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes.dex */
public final class C3015fv extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3275kv f39724a;

    public C3015fv(C3275kv c3275kv) {
        this.f39724a = c3275kv;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3124iv(this.f39724a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39724a.f49254c;
    }
}
