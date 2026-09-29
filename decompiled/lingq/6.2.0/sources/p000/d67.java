package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d67 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f35040c;

    public d67(float f) {
        super(3);
        this.f35040c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d67) && Float.compare(this.f35040c, ((d67) obj).f35040c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35040c);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("VerticalTo(y="), this.f35040c, ')');
    }
}
