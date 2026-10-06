package p000;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecp {

    /* JADX INFO: renamed from: a */
    public final float f13392a;

    /* JADX INFO: renamed from: b */
    public final float f13393b;

    public ecp(float f, float f2) {
        this.f13392a = f;
        this.f13393b = f2;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "ShortTeT: %f, LongTeT: %f", Float.valueOf(this.f13392a), Float.valueOf(this.f13393b));
    }
}
