package p000;

import java.util.function.BiFunction;
import p021j$.util.Objects;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngj extends ngk {

    /* JADX INFO: renamed from: b */
    private final Object f42219b;

    /* JADX INFO: renamed from: c */
    private final Object f42220c;

    public ngj(Object obj, Object obj2) {
        this.f42219b = obj;
        this.f42220c = obj2;
    }

    @Override // p000.ngk
    /* JADX INFO: renamed from: a */
    public final Optional mo17465a(BiFunction biFunction) {
        return Optional.ofNullable(biFunction.apply(this.f42219b, this.f42220c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngj) {
            ngj ngjVar = (ngj) obj;
            if (Objects.equals(this.f42219b, ngjVar.f42219b) && Objects.equals(this.f42220c, ngjVar.f42220c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42219b, this.f42220c);
    }

    public final String toString() {
        return "of(" + this.f42219b.toString() + ", " + this.f42220c.toString() + ")";
    }
}
