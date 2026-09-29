package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vh1 extends omd {

    /* JADX INFO: renamed from: h */
    public static vh1 f65369h;

    /* JADX INFO: renamed from: i0 */
    public static synchronized vh1 m23285i0() {
        try {
            if (f65369h == null) {
                f65369h = new vh1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f65369h;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: K */
    public final String mo13907K() {
        return "sessions_memory_capture_frequency_bg_ms";
    }
}
