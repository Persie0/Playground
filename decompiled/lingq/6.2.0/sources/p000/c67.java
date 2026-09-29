package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c67 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f9637c;

    public c67(float f) {
        super(3);
        this.f9637c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c67) && Float.compare(this.f9637c, ((c67) obj).f9637c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9637c);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("RelativeVerticalTo(dy="), this.f9637c, ')');
    }
}
