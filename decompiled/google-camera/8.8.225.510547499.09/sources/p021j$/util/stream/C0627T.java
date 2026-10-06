package p021j$.util.stream;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.Collection$EL;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.T */
/* JADX INFO: loaded from: classes3.dex */
final class C0627T implements InterfaceC0613O {

    /* JADX INFO: renamed from: a */
    private final Collection f33355a;

    C0627T(Collection collection) {
        this.f33355a = collection;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0613O mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return this.f33355a.size();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final void forEach(Consumer consumer) {
        Collection$EL.forEach(this.f33355a, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final Object[] mo12601n(IntFunction intFunction) {
        Collection collection = this.f33355a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12656r(this, j, j2, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: r */
    public final void mo12603r(Object[] objArr, int i) {
        Iterator it = this.f33355a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return Collection$EL.stream(this.f33355a).spliterator();
    }

    public final String toString() {
        Collection collection = this.f33355a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }
}
