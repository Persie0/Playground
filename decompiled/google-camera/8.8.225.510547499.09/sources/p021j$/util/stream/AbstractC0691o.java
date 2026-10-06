package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.o */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0691o implements InterfaceC0644Y1 {

    /* JADX INFO: renamed from: a */
    boolean f33450a;

    /* JADX INFO: renamed from: b */
    Object f33451b;

    AbstractC0691o() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
    public final boolean mo12600m() {
        return this.f33450a;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f33450a) {
            return;
        }
        this.f33450a = true;
        this.f33451b = obj;
    }
}
