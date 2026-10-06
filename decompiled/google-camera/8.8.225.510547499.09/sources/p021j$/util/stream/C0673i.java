package p021j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0673i implements Consumer, Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33429c;

    public /* synthetic */ C0673i(int i, Object obj, Object obj2) {
        this.f33427a = i;
        this.f33428b = obj;
        this.f33429c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33427a;
        Object obj2 = this.f33429c;
        Object obj3 = this.f33428b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 1:
            default:
                ((C0579C1) obj3).m12611b((Consumer) obj2, obj);
                break;
            case 2:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33427a) {
            case 0:
                break;
            case 1:
            default:
                break;
            case 2:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new C0574B((EnumC0577C) this.f33428b, (Predicate) this.f33429c);
    }
}
