package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f80 extends g80 {

    /* JADX INFO: renamed from: a */
    public final List f38606a;

    public f80(List list) {
        this.f38606a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f80) && this.f38606a.equals(((f80) obj).f38606a);
    }

    public final int hashCode() {
        return this.f38606a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(badges=", ")", this.f38606a);
    }
}
