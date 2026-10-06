package p021j$.util;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.J */
/* JADX INFO: loaded from: classes3.dex */
final class C0507J implements Consumer {

    /* JADX INFO: renamed from: a */
    Object f33132a;

    C0507J() {
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33132a = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
