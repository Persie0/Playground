package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.v0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0713v0 extends C0693o1 implements InterfaceC0607M, InterfaceC0595I {
    C0713v0() {
    }

    @Override // p021j$.util.stream.C0693o1
    /* JADX INFO: renamed from: F */
    public final InterfaceC0731x spliterator() {
        return super.spliterator();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Long[] lArr, int i) {
        AbstractC0586F.m12649k(this, lArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0595I, p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0607M mo12596a() {
        return this;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        clear();
        m12728C(j);
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        return (long[]) super.mo12671i();
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: k */
    public final void mo12672k(Object obj) {
        super.mo12672k((LongConsumer) obj);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object[] mo12601n(IntFunction intFunction) {
        return AbstractC0586F.m12646h(this, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12655q(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0643Y0
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void mo12666s(Long l) {
        AbstractC0586F.m12643e(this, l);
    }

    @Override // p021j$.util.stream.C0693o1, java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final InterfaceC0498A spliterator() {
        return super.spliterator();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: y */
    public final void mo12673y(int i, Object obj) {
        super.mo12673y(i, (long[]) obj);
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0613O mo12596a() {
        return this;
    }

    @Override // p021j$.util.stream.C0693o1, java.util.function.LongConsumer
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.C0693o1, java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12666s((Long) obj);
    }
}
