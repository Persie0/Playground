package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gz0 extends a7d {

    /* JADX INFO: renamed from: a */
    public final List f41541a;

    public gz0(List list) {
        this.f41541a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz0) && this.f41541a.equals(((gz0) obj).f41541a);
    }

    public final int hashCode() {
        return this.f41541a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(chatHistory=", ")", this.f41541a);
    }
}
