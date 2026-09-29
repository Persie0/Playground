package tl;

import java.util.AbstractList;
import java.util.List;
import p100em.InterfaceC5431c;

/* JADX INFO: renamed from: tl.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9315c<E> extends AbstractList<E> implements List<E>, InterfaceC5431c {
    /* JADX INFO: renamed from: a */
    public abstract int mo1822a();

    /* JADX INFO: renamed from: l */
    public abstract E mo1830l(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return mo1830l(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo1822a();
    }
}
