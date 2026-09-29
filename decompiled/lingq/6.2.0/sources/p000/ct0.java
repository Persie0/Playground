package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ct0 extends dt0 {

    /* JADX INFO: renamed from: a */
    public final List f34502a;

    public ct0(List list) {
        this.f34502a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct0) && this.f34502a.equals(((ct0) obj).f34502a);
    }

    public final int hashCode() {
        return this.f34502a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(challenges=", ")", this.f34502a);
    }
}
