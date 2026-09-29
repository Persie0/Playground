package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f53866c;

    public o57(float f) {
        super(3);
        this.f53866c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o57) && Float.compare(this.f53866c, ((o57) obj).f53866c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f53866c);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("HorizontalTo(x="), this.f53866c, ')');
    }
}
