package p375s0;

import ae.C0062b;
import androidx.activity.result.C0204c;
import p260m8.C7499b;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8942d {

    /* JADX INFO: renamed from: e */
    public static final C8942d f46893e = new C8942d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f46894a;

    /* JADX INFO: renamed from: b */
    public final float f46895b;

    /* JADX INFO: renamed from: c */
    public final float f46896c;

    /* JADX INFO: renamed from: d */
    public final float f46897d;

    public C8942d(float f3, float f10, float f11, float f12) {
        this.f46894a = f3;
        this.f46895b = f10;
        this.f46896c = f11;
        this.f46897d = f12;
    }

    /* JADX INFO: renamed from: a */
    public final long m17170a() {
        float f3 = this.f46896c;
        float f10 = this.f46894a;
        float f11 = ((f3 - f10) / 2.0f) + f10;
        float f12 = this.f46897d;
        float f13 = this.f46895b;
        return C7499b.m14932c(f11, ((f12 - f13) / 2.0f) + f13);
    }

    /* JADX INFO: renamed from: b */
    public final C8942d m17171b(C8942d c8942d) {
        return new C8942d(Math.max(this.f46894a, c8942d.f46894a), Math.max(this.f46895b, c8942d.f46895b), Math.min(this.f46896c, c8942d.f46896c), Math.min(this.f46897d, c8942d.f46897d));
    }

    /* JADX INFO: renamed from: c */
    public final C8942d m17172c(float f3, float f10) {
        return new C8942d(this.f46894a + f3, this.f46895b + f10, this.f46896c + f3, this.f46897d + f10);
    }

    /* JADX INFO: renamed from: d */
    public final C8942d m17173d(long j10) {
        return new C8942d(C8941c.m17164c(j10) + this.f46894a, C8941c.m17165d(j10) + this.f46895b, C8941c.m17164c(j10) + this.f46896c, C8941c.m17165d(j10) + this.f46897d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8942d)) {
            return false;
        }
        C8942d c8942d = (C8942d) obj;
        if (Float.compare(this.f46894a, c8942d.f46894a) == 0 && Float.compare(this.f46895b, c8942d.f46895b) == 0 && Float.compare(this.f46896c, c8942d.f46896c) == 0 && Float.compare(this.f46897d, c8942d.f46897d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46897d) + C0204c.m846e(this.f46896c, C0204c.m846e(this.f46895b, Float.hashCode(this.f46894a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + C0062b.m391r2(this.f46894a) + ", " + C0062b.m391r2(this.f46895b) + ", " + C0062b.m391r2(this.f46896c) + ", " + C0062b.m391r2(this.f46897d) + ')';
    }
}
