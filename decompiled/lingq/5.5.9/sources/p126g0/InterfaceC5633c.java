package p126g0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import cm.InterfaceC2052l;
import java.util.Collection;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: g0.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5633c<E> extends InterfaceC5631a<E>, Collection, InterfaceC5429a {
    /* JADX INFO: renamed from: M */
    InterfaceC5633c<E> mo1845M(int i10);

    /* JADX INFO: renamed from: T */
    InterfaceC5633c<E> mo1846T(InterfaceC2052l<? super E, Boolean> interfaceC2052l);

    InterfaceC5633c<E> add(int i10, E e10);

    @Override // java.util.List, p126g0.InterfaceC5633c
    InterfaceC5633c<E> add(E e10);

    @Override // java.util.List, p126g0.InterfaceC5633c
    InterfaceC5633c<E> addAll(Collection<? extends E> collection);

    /* JADX INFO: renamed from: j */
    PersistentVectorBuilder mo1848j();

    @Override // java.util.List, p126g0.InterfaceC5633c
    InterfaceC5633c<E> remove(E e10);

    @Override // java.util.List, p126g0.InterfaceC5633c
    InterfaceC5633c<E> removeAll(Collection<? extends E> collection);

    InterfaceC5633c<E> set(int i10, E e10);
}
