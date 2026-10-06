package p000;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ngp implements Consumer {

    /* JADX INFO: renamed from: a */
    Object f42228a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42228a = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
