package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class th1 extends omd {

    /* JADX INFO: renamed from: h */
    public static th1 f62272h;

    /* JADX INFO: renamed from: i0 */
    public static synchronized th1 m22034i0() {
        try {
            if (f62272h == null) {
                f62272h = new th1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62272h;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: K */
    public final String mo13907K() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }
}
