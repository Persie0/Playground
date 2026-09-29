package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 {

    /* JADX INFO: renamed from: a */
    public final float f38829a;

    public fc0(float f) {
        this.f38829a = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m11762a(int i, int i2) {
        return Math.round((1.0f + this.f38829a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc0) && Float.compare(this.f38829a, ((fc0) obj).f38829a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38829a);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("Vertical(bias="), this.f38829a, ')');
    }
}
