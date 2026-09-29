package p082e1;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5351a {

    /* JADX INFO: renamed from: a */
    public long f33654a;

    /* JADX INFO: renamed from: b */
    public float f33655b;

    public C5351a(float f3, long j10) {
        this.f33654a = j10;
        this.f33655b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5351a)) {
            return false;
        }
        C5351a c5351a = (C5351a) obj;
        return this.f33654a == c5351a.f33654a && Float.compare(this.f33655b, c5351a.f33655b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33655b) + (Long.hashCode(this.f33654a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f33654a);
        sb2.append(", dataPoint=");
        return C0141b.m612h(sb2, this.f33655b, ')');
    }
}
