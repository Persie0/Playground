package p375s0;

import ae.C0062b;
import androidx.activity.result.C0204c;
import p349qo.C8656b;

/* JADX INFO: renamed from: s0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8943e {

    /* JADX INFO: renamed from: a */
    public final float f46898a;

    /* JADX INFO: renamed from: b */
    public final float f46899b;

    /* JADX INFO: renamed from: c */
    public final float f46900c;

    /* JADX INFO: renamed from: d */
    public final float f46901d;

    /* JADX INFO: renamed from: e */
    public final long f46902e;

    /* JADX INFO: renamed from: f */
    public final long f46903f;

    /* JADX INFO: renamed from: g */
    public final long f46904g;

    /* JADX INFO: renamed from: h */
    public final long f46905h;

    static {
        int i10 = C8939a.f46883b;
        C8656b.m16897e(0.0f, 0.0f, 0.0f, 0.0f, C8939a.f46882a);
    }

    public C8943e(float f3, float f10, float f11, float f12, long j10, long j11, long j12, long j13) {
        this.f46898a = f3;
        this.f46899b = f10;
        this.f46900c = f11;
        this.f46901d = f12;
        this.f46902e = j10;
        this.f46903f = j11;
        this.f46904g = j12;
        this.f46905h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8943e)) {
            return false;
        }
        C8943e c8943e = (C8943e) obj;
        return Float.compare(this.f46898a, c8943e.f46898a) == 0 && Float.compare(this.f46899b, c8943e.f46899b) == 0 && Float.compare(this.f46900c, c8943e.f46900c) == 0 && Float.compare(this.f46901d, c8943e.f46901d) == 0 && C8939a.m17156a(this.f46902e, c8943e.f46902e) && C8939a.m17156a(this.f46903f, c8943e.f46903f) && C8939a.m17156a(this.f46904g, c8943e.f46904g) && C8939a.m17156a(this.f46905h, c8943e.f46905h);
    }

    public final int hashCode() {
        int iM846e = C0204c.m846e(this.f46901d, C0204c.m846e(this.f46900c, C0204c.m846e(this.f46899b, Float.hashCode(this.f46898a) * 31, 31), 31), 31);
        int i10 = C8939a.f46883b;
        return Long.hashCode(this.f46905h) + C0204c.m847f(this.f46904g, C0204c.m847f(this.f46903f, C0204c.m847f(this.f46902e, iM846e, 31), 31), 31);
    }

    public final String toString() {
        String str = C0062b.m391r2(this.f46898a) + ", " + C0062b.m391r2(this.f46899b) + ", " + C0062b.m391r2(this.f46900c) + ", " + C0062b.m391r2(this.f46901d);
        long j10 = this.f46902e;
        long j11 = this.f46903f;
        boolean zM17156a = C8939a.m17156a(j10, j11);
        long j12 = this.f46904g;
        long j13 = this.f46905h;
        if (!zM17156a || !C8939a.m17156a(j11, j12) || !C8939a.m17156a(j12, j13)) {
            StringBuilder sbM854m = C0204c.m854m("RoundRect(rect=", str, ", topLeft=");
            sbM854m.append((Object) C8939a.m17159d(j10));
            sbM854m.append(", topRight=");
            sbM854m.append((Object) C8939a.m17159d(j11));
            sbM854m.append(", bottomRight=");
            sbM854m.append((Object) C8939a.m17159d(j12));
            sbM854m.append(", bottomLeft=");
            sbM854m.append((Object) C8939a.m17159d(j13));
            sbM854m.append(')');
            return sbM854m.toString();
        }
        if (C8939a.m17157b(j10) == C8939a.m17158c(j10)) {
            StringBuilder sbM854m2 = C0204c.m854m("RoundRect(rect=", str, ", radius=");
            sbM854m2.append(C0062b.m391r2(C8939a.m17157b(j10)));
            sbM854m2.append(')');
            return sbM854m2.toString();
        }
        StringBuilder sbM854m3 = C0204c.m854m("RoundRect(rect=", str, ", x=");
        sbM854m3.append(C0062b.m391r2(C8939a.m17157b(j10)));
        sbM854m3.append(", y=");
        sbM854m3.append(C0062b.m391r2(C8939a.m17158c(j10)));
        sbM854m3.append(')');
        return sbM854m3.toString();
    }
}
