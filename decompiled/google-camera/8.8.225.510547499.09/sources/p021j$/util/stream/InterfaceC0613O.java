package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.O */
/* JADX INFO: loaded from: classes3.dex */
interface InterfaceC0613O {
    /* JADX INFO: renamed from: c */
    InterfaceC0613O mo12597c(int i);

    long count();

    void forEach(Consumer consumer);

    /* JADX INFO: renamed from: n */
    Object[] mo12601n(IntFunction intFunction);

    /* JADX INFO: renamed from: q */
    InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction);

    /* JADX INFO: renamed from: r */
    void mo12603r(Object[] objArr, int i);

    Spliterator spliterator();

    /* JADX INFO: renamed from: u */
    int mo12604u();
}
