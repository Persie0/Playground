package p021j$.util;

/* JADX INFO: renamed from: j$.util.A */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0498A extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // p021j$.util.Spliterator
    InterfaceC0498A trySplit();
}
