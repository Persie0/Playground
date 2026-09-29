package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class a63 implements oa1 {

    /* JADX INFO: renamed from: a */
    public final long f280a;

    public a63(long j) {
        this.f280a = j;
    }

    @Override // p000.oa1
    /* JADX INFO: renamed from: a */
    public final long mo134a(Context context) {
        return this.f280a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a63) && aa1.m199c(this.f280a, ((a63) obj).f280a);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f280a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) aa1.m205i(this.f280a)) + ')';
    }
}
