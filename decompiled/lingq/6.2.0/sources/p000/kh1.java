package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends omd {

    /* JADX INFO: renamed from: h */
    public static kh1 f47286h;

    /* JADX INFO: renamed from: i0 */
    public static synchronized kh1 m15232i0() {
        try {
            if (f47286h == null) {
                f47286h = new kh1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47286h;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: K */
    public final String mo13907K() {
        return "experiment_app_start_ttid";
    }
}
