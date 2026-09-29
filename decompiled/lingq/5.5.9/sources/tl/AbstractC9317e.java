package tl;

import java.util.AbstractSet;
import java.util.Set;
import p100em.InterfaceC5433e;

/* JADX INFO: renamed from: tl.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9317e<E> extends AbstractSet<E> implements Set<E>, InterfaceC5433e {
    /* JADX INFO: renamed from: a */
    public abstract int mo12619a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo12619a();
    }
}
