package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sh1 extends omd {

    /* JADX INFO: renamed from: h */
    public static sh1 f60858h;

    /* JADX INFO: renamed from: i0 */
    public static synchronized sh1 m21371i0() {
        try {
            if (f60858h == null) {
                f60858h = new sh1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60858h;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: K */
    public final String mo13907K() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }
}
