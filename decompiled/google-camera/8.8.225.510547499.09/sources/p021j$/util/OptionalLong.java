package p021j$.util;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class OptionalLong {

    /* JADX INFO: renamed from: c */
    private static final OptionalLong f33143c = new OptionalLong();

    /* JADX INFO: renamed from: a */
    private final boolean f33144a;

    /* JADX INFO: renamed from: b */
    private final long f33145b;

    private OptionalLong() {
        this.f33144a = false;
        this.f33145b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static OptionalLong m12506a() {
        return f33143c;
    }

    /* JADX INFO: renamed from: b */
    public static OptionalLong m12507b(long j) {
        return new OptionalLong(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.f33144a;
        if (z && optionalLong.f33144a) {
            if (this.f33145b == optionalLong.f33145b) {
                return true;
            }
        } else if (z == optionalLong.f33144a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f33144a) {
            return 0;
        }
        long j = this.f33145b;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> long orElseThrow(Supplier<? extends X> supplier) throws X {
        if (this.f33144a) {
            return this.f33145b;
        }
        throw supplier.get();
    }

    public final String toString() {
        return this.f33144a ? String.format("OptionalLong[%s]", Long.valueOf(this.f33145b)) : "OptionalLong.empty";
    }

    private OptionalLong(long j) {
        this.f33144a = true;
        this.f33145b = j;
    }
}
