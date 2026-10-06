package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.function.C0555g;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.F1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0588F1 implements InterfaceC0643Y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongConsumer f33313b;

    public /* synthetic */ C0588F1(LongConsumer longConsumer, int i) {
        this.f33312a = i;
        this.f33313b = longConsumer;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        switch (this.f33312a) {
            case 0:
                AbstractC0586F.m12640b();
                throw null;
            default:
                AbstractC0586F.m12640b();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33312a) {
            case 0:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo12599h(long j) {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0643Y0
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void mo12666s(Long l) {
        switch (this.f33312a) {
            case 0:
                AbstractC0586F.m12643e(this, l);
                break;
            default:
                AbstractC0586F.m12643e(this, l);
                break;
        }
    }

    @Override // p021j$.util.stream.InterfaceC0643Y0, p021j$.util.stream.InterfaceC0646Z0
    public final void accept(long j) {
        int i = this.f33312a;
        LongConsumer longConsumer = this.f33313b;
        switch (i) {
            case 0:
                ((C0693o1) longConsumer).accept(j);
                break;
            default:
                longConsumer.accept(j);
                break;
        }
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f33312a) {
            case 0:
                longConsumer.getClass();
                break;
            default:
                longConsumer.getClass();
                break;
        }
        return new C0555g(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f33312a) {
            case 0:
                mo12666s((Long) obj);
                break;
            default:
                mo12666s((Long) obj);
                break;
        }
    }
}
