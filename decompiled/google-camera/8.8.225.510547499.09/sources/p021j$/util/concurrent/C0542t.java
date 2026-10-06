package p021j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import p021j$.util.function.BiConsumer$CC;
import p021j$.util.function.BiFunction$CC;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.concurrent.t */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0542t implements BiConsumer, BiFunction, Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33239c;

    public /* synthetic */ C0542t(int i, Object obj, Object obj2) {
        this.f33237a = i;
        this.f33238b = obj;
        this.f33239c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Consumer consumer = (Consumer) this.f33238b;
        Consumer consumer2 = (Consumer) this.f33239c;
        consumer.accept(obj);
        consumer2.accept(obj);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f33238b).apply(((BiFunction) this.f33239c).apply(obj, obj2));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BiConsumer m12576d(BiConsumer biConsumer) {
        switch (this.f33237a) {
            case 0:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ C0542t(BiFunction biFunction, Function function) {
        this.f33237a = 2;
        this.f33239c = biFunction;
        this.f33238b = function;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f33237a;
        Object obj3 = this.f33239c;
        Object obj4 = this.f33238b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
