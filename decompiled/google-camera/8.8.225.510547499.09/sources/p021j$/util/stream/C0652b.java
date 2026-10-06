package p021j$.util.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import p021j$.desugar.sun.nio.p023fs.AbstractC0293g;
import p021j$.util.Optional;
import p021j$.util.StringJoiner;
import p021j$.util.function.BiConsumer$CC;
import p021j$.util.function.BiFunction$CC;
import p021j$.util.function.Consumer$CC;
import p021j$.util.function.Function$CC;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: renamed from: j$.util.stream.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0652b implements IntFunction, Function, BinaryOperator, Supplier, LongFunction, Consumer, BiConsumer, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33377a;

    public /* synthetic */ C0652b(int i) {
        this.f33377a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f33377a) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            default:
                break;
            case 6:
                break;
            case 11:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f33377a) {
            case 0:
                return new Object[i];
            case 8:
                int i2 = C0703s.f33466h;
                return new Object[i];
            case 9:
                return new Object[i];
            default:
                return Integer.valueOf(i);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f33377a) {
            case 1:
                break;
            case 5:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BiConsumer m12682d(BiConsumer biConsumer) {
        switch (this.f33377a) {
            case 17:
                break;
            case 19:
                break;
            case 20:
                break;
            case 24:
                break;
            case 26:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f33377a) {
            case 7:
                return new C0688n();
            case 18:
                return new HashSet();
            case 23:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m12683or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f33377a) {
            case 17:
                ((Collection) obj).add(obj2);
                break;
            case 19:
                ((Set) obj).add(obj2);
                break;
            case 20:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
            case 24:
                ((List) obj).add(obj2);
                break;
            case 26:
                ((LinkedHashSet) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        switch (this.f33377a) {
            case 10:
                return AbstractC0584E0.m12635n(j);
            default:
                return AbstractC0584E0.m12636o(j);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f33377a) {
            case 1:
                Set set = Collectors.f33294a;
                return obj;
            case 5:
                Set set2 = Collectors.f33294a;
                return AbstractC0293g.m11979b(((List) obj).toArray());
            default:
                return ((StringJoiner) obj).toString();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33377a) {
            case 15:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public final /* synthetic */ Function m19856andThen(Function function) {
        switch (this.f33377a) {
            case 1:
                break;
            case 5:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f33377a) {
            case 2:
                Collection collection = (Collection) obj;
                Set set = Collectors.f33294a;
                collection.addAll((Collection) obj2);
                return collection;
            case 3:
                List list = (List) obj;
                Set set2 = Collectors.f33294a;
                list.addAll((List) obj2);
                return list;
            case 4:
                List list2 = (List) obj;
                Set set3 = Collectors.f33294a;
                list2.addAll((List) obj2);
                return list2;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            default:
                return ((StringJoiner) obj).m12510c((StringJoiner) obj2);
            case 6:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = Collectors.f33294a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
            case 11:
                return new C0639X((InterfaceC0604L) obj, (InterfaceC0604L) obj2);
            case 13:
                return new C0642Y((InterfaceC0607M) obj, (InterfaceC0607M) obj2);
            case 14:
                return new C0649a0((InterfaceC0613O) obj, (InterfaceC0613O) obj2);
        }
    }
}
