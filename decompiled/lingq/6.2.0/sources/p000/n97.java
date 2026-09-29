package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n97 {

    /* JADX INFO: renamed from: d */
    public static final n97 f52509d = new n97(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f52510a;

    /* JADX INFO: renamed from: b */
    public final float f52511b;

    /* JADX INFO: renamed from: c */
    public final int f52512c;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public n97(float f, float f2) {
        bna.m3969q(f > 0.0f);
        bna.m3969q(f2 > 0.0f);
        this.f52510a = f;
        this.f52511b = f2;
        this.f52512c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n97.class == obj.getClass()) {
            n97 n97Var = (n97) obj;
            if (this.f52510a == n97Var.f52510a && this.f52511b == n97Var.f52511b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f52511b) + ((Float.floatToRawIntBits(this.f52510a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f52510a), Float.valueOf(this.f52511b)};
        String str = uma.f64080a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
