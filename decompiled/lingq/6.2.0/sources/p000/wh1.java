package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wh1 extends omd {

    /* JADX INFO: renamed from: h */
    public static wh1 f66814h;

    /* JADX INFO: renamed from: i0 */
    public static synchronized wh1 m23951i0() {
        try {
            if (f66814h == null) {
                f66814h = new wh1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f66814h;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: K */
    public final String mo13907K() {
        return "sessions_memory_capture_frequency_fg_ms";
    }
}
