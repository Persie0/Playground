package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f61632a;

    public sy9(boolean z) {
        this.f61632a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy9) && this.f61632a == ((sy9) obj).f61632a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61632a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateTapToPage(enabled=", ")", this.f61632a);
    }
}
