package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.T1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0629T1 implements InterfaceC0646Z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f33357b;

    public /* synthetic */ C0629T1(Consumer consumer, int i) {
        this.f33356a = i;
        this.f33357b = consumer;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        switch (this.f33356a) {
            case 0:
                AbstractC0586F.m12640b();
                throw null;
            default:
                AbstractC0586F.m12640b();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33356a) {
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

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        switch (this.f33356a) {
            case 0:
                AbstractC0586F.m12645g();
                throw null;
            default:
                AbstractC0586F.m12645g();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33356a;
        Consumer consumer = this.f33357b;
        switch (i) {
            case 0:
                ((C0702r1) consumer).accept(obj);
                break;
            default:
                consumer.accept(obj);
                break;
        }
    }
}
