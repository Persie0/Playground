package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kfd implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final kfd f35810a = new kfd(-1, -1, -1);

    /* JADX INFO: renamed from: b */
    public final long f35811b;

    /* JADX INFO: renamed from: c */
    public final long f35812c;

    /* JADX INFO: renamed from: d */
    public final long f35813d;

    public kfd(long j, long j2, long j3) {
        this.f35811b = j;
        this.f35812c = j2;
        this.f35813d = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(kfd kfdVar) {
        return (this.f35813d > kfdVar.f35813d ? 1 : (this.f35813d == kfdVar.f35813d ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kfd)) {
            return false;
        }
        kfd kfdVar = (kfd) obj;
        return this.f35813d == kfdVar.f35813d && this.f35811b == kfdVar.f35811b && this.f35812c == kfdVar.f35812c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f35811b), Long.valueOf(this.f35813d), Long.valueOf(this.f35812c)});
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16827f("timestamp", this.f35811b);
        mrlVarM16765d.m16827f("onStartedId", this.f35813d);
        mrlVarM16765d.m16827f("frameNumber", this.f35812c);
        return mrlVarM16765d.toString();
    }
}
