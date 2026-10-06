package p021j$.nio.file;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.nio.file.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0409v implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f32896b;

    public /* synthetic */ C0409v(Consumer consumer, int i) {
        this.f32895a = i;
        this.f32896b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f32895a;
        Consumer consumer = this.f32896b;
        switch (i) {
            case 0:
                consumer.accept(AbstractC0335a.m12109h(obj));
                break;
            default:
                consumer.accept(AbstractC0335a.m12109h(obj));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f32895a) {
            case 0:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
