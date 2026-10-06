package p000;

import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsg {

    /* JADX INFO: renamed from: a */
    public final hsa f29403a;

    /* JADX INFO: renamed from: b */
    public final RectF f29404b;

    /* JADX INFO: renamed from: c */
    public final float f29405c;

    /* JADX INFO: renamed from: d */
    public final int f29406d;

    /* JADX INFO: renamed from: e */
    public final long f29407e;

    /* JADX INFO: renamed from: f */
    public final int f29408f;

    public hsg() {
    }

    public hsg(int i, hsa hsaVar, RectF rectF, float f, int i2, long j) {
        this.f29408f = i;
        this.f29403a = hsaVar;
        this.f29404b = rectF;
        this.f29405c = f;
        this.f29406d = i2;
        this.f29407e = j;
    }

    /* JADX INFO: renamed from: a */
    public static hsf m10692a() {
        hsf hsfVar = new hsf();
        hsfVar.f29396a = 1;
        hsfVar.m10691f(hsa.f29385a);
        hsfVar.m10689d(new RectF(-1.0f, -1.0f, -1.0f, -1.0f));
        hsfVar.m10687b(0.0f);
        hsfVar.m10688c(0);
        hsfVar.m10690e(0L);
        return hsfVar;
    }

    /* JADX INFO: renamed from: b */
    public static hsg m10693b() {
        return m10692a().m10686a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10694c() {
        return this.f29404b.centerX() >= 0.0f && this.f29404b.centerY() >= 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hsg)) {
            return false;
        }
        hsg hsgVar = (hsg) obj;
        int i = this.f29408f;
        int i2 = hsgVar.f29408f;
        if (i != 0) {
            return i == i2 && this.f29403a.equals(hsgVar.f29403a) && this.f29404b.equals(hsgVar.f29404b) && Float.floatToIntBits(this.f29405c) == Float.floatToIntBits(hsgVar.f29405c) && this.f29406d == hsgVar.f29406d && this.f29407e == hsgVar.f29407e;
        }
        throw null;
    }

    public final String toString() {
        String str;
        switch (this.f29408f) {
            case 1:
                str = "OFF";
                break;
            case 2:
                str = "ON";
                break;
            default:
                str = "null";
                break;
        }
        return "TrackingRoi{status=" + str + ", trackerType=" + String.valueOf(this.f29403a) + ", roi=" + String.valueOf(this.f29404b) + ", confidence=" + this.f29405c + ", numberOfRefresherCalls=" + this.f29406d + ", trackedLengthMs=" + this.f29407e + "}";
    }

    public final int hashCode() {
        int i = this.f29408f;
        if (i == 0) {
            throw null;
        }
        int iHashCode = ((((((((i ^ 1000003) * 1000003) ^ this.f29403a.hashCode()) * 1000003) ^ this.f29404b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f29405c)) * 1000003) ^ this.f29406d;
        long j = this.f29407e;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
