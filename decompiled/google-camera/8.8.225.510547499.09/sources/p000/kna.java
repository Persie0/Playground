package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kna {

    /* JADX INFO: renamed from: a */
    public final int f36580a;

    /* JADX INFO: renamed from: b */
    public final kbc f36581b;

    public kna(int i, kbc kbcVar) {
        this.f36580a = i;
        this.f36581b = kbcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kna)) {
            return false;
        }
        kna knaVar = (kna) obj;
        return knaVar.f36580a == this.f36580a && knaVar.f36581b.equals(this.f36581b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36580a), this.f36581b});
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("ImageReaderFormat");
        mrlVarM16766e.m16823b("ImageFormat", lme.m15725k(this.f36580a));
        mrlVarM16766e.m16823b("Size", this.f36581b);
        return mrlVarM16766e.toString();
    }
}
