package p021j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.q */
/* JADX INFO: loaded from: classes3.dex */
final class C0697q extends AbstractC0700r {

    /* JADX INFO: renamed from: b */
    final Consumer f33460b;

    C0697q(Consumer consumer, boolean z) {
        super(z);
        this.f33460b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33460b.accept(obj);
    }
}
