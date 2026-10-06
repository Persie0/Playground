package p021j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import p000.aag;

/* JADX INFO: loaded from: classes3.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b */
    private static final Optional f33141b = new Optional();

    /* JADX INFO: renamed from: a */
    private final Object f33142a;

    private Optional() {
        this.f33142a = null;
    }

    public static <T> Optional<T> empty() {
        return f33141b;
    }

    /* JADX INFO: renamed from: of */
    public static <T> Optional<T> m12505of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : m12505of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f33142a, ((Optional) obj).f33142a);
        }
        return false;
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        predicate.getClass();
        if (isPresent()) {
            return predicate.test((Object) this.f33142a) ? this : empty();
        }
        return this;
    }

    public T get() {
        T t = (T) this.f33142a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.f33142a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        aag aagVar = (Object) this.f33142a;
        if (aagVar != null) {
            consumer.accept(aagVar);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        aag aagVar = (Object) this.f33142a;
        if (aagVar != null) {
            consumer.accept(aagVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.f33142a == null;
    }

    public boolean isPresent() {
        return this.f33142a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        return !isPresent() ? empty() : ofNullable(function.apply((Object) this.f33142a));
    }

    public T orElse(T t) {
        T t2 = (T) this.f33142a;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.f33142a;
        return t != null ? t : supplier.get();
    }

    public T orElseThrow() {
        T t = (T) this.f33142a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final String toString() {
        Object obj = this.f33142a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    private Optional(Object obj) {
        obj.getClass();
        this.f33142a = obj;
    }
}
