package p000;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class frw {

    /* JADX INFO: renamed from: a */
    int f23363a = 0;

    /* JADX INFO: renamed from: b */
    int f23364b = 0;

    /* JADX INFO: renamed from: c */
    int f23365c = 0;

    /* JADX INFO: renamed from: d */
    int f23366d = 0;

    /* JADX INFO: renamed from: e */
    int f23367e = 0;

    /* JADX INFO: renamed from: f */
    int f23368f = 0;

    /* JADX INFO: renamed from: g */
    int f23369g = 0;

    /* JADX INFO: renamed from: h */
    int f23370h = 0;

    public final String toString() {
        return String.format(Locale.US, "Counts: has %d ready, %d in-flight, %d failed. In the frame buffer: %d not connected, %d main shots (ignored), %d not qualified, %d already started and %d waiting to launch", Integer.valueOf(this.f23368f), Integer.valueOf(this.f23363a), Integer.valueOf(this.f23370h), Integer.valueOf(this.f23366d), Integer.valueOf(this.f23369g), Integer.valueOf(this.f23365c), Integer.valueOf(this.f23367e), Integer.valueOf(this.f23364b));
    }
}
