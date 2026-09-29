package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vu0 implements Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final char f65908a;

    /* JADX INFO: renamed from: b */
    public final char f65909b;

    /* JADX INFO: renamed from: c */
    public final int f65910c = 1;

    static {
        new vu0((char) 1, (char) 0);
    }

    public vu0(char c, char c2) {
        this.f65908a = c;
        this.f65909b = (char) AbstractC3695vr.m23507r(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu0)) {
            return false;
        }
        if (isEmpty() && ((vu0) obj).isEmpty()) {
            return true;
        }
        vu0 vu0Var = (vu0) obj;
        return this.f65908a == vu0Var.f65908a && this.f65909b == vu0Var.f65909b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f65908a * 31) + this.f65909b;
    }

    public final boolean isEmpty() {
        return fa4.m11651m(this.f65908a, this.f65909b) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new uu0(this.f65908a, this.f65909b, this.f65910c);
    }

    public final String toString() {
        return this.f65908a + ".." + this.f65909b;
    }
}
