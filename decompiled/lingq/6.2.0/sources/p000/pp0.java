package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pp0 implements qp0 {

    /* JADX INFO: renamed from: a */
    public final List f56619a;

    public pp0(List list) {
        this.f56619a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp0) && this.f56619a.equals(((pp0) obj).f56619a);
    }

    public final int hashCode() {
        return this.f56619a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(badges=", ")", this.f56619a);
    }
}
