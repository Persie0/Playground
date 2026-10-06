package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.D1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0582D1 implements InterfaceC0640X0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f33302b;

    public /* synthetic */ C0582D1(IntConsumer intConsumer, int i) {
        this.f33301a = i;
        this.f33302b = intConsumer;
    }

    @Override // p021j$.util.stream.InterfaceC0640X0, p021j$.util.stream.InterfaceC0646Z0
    public final void accept(int i) {
        int i2 = this.f33301a;
        IntConsumer intConsumer = this.f33302b;
        switch (i2) {
            case 0:
                ((C0687m1) intConsumer).accept(i);
                break;
            default:
                intConsumer.accept(i);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33301a) {
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

    @Override // p021j$.util.stream.InterfaceC0640X0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo12621j(Integer num) {
        switch (this.f33301a) {
            case 0:
                AbstractC0586F.m12641c(this, num);
                break;
            default:
                AbstractC0586F.m12641c(this, num);
                break;
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        switch (this.f33301a) {
            case 0:
                AbstractC0586F.m12645g();
                throw null;
            default:
                AbstractC0586F.m12645g();
                throw null;
        }
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f33301a) {
            case 0:
                intConsumer.getClass();
                break;
            default:
                intConsumer.getClass();
                break;
        }
        return new C0553e(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f33301a) {
            case 0:
                mo12621j((Integer) obj);
                break;
            default:
                mo12621j((Integer) obj);
                break;
        }
    }
}
