package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.x1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0720x1 implements Consumer {

    /* JADX INFO: renamed from: a */
    int f33525a;

    /* JADX INFO: renamed from: b */
    final Object[] f33526b;

    C0720x1(int i) {
        this.f33526b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33525a;
        this.f33525a = i + 1;
        this.f33526b[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
