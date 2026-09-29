package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w57 extends e67 {

    /* JADX INFO: renamed from: c */
    public final float f66427c;

    public w57(float f) {
        super(3);
        this.f66427c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w57) && Float.compare(this.f66427c, ((w57) obj).f66427c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66427c);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("RelativeHorizontalTo(dx="), this.f66427c, ')');
    }
}
