package p150h9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: renamed from: h9.l0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5924l0 {
    /* JADX INFO: renamed from: j */
    static int m12343j(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 0 | BuildConfig.SDK_TRUNCATE_LENGTH;
    }

    /* JADX INFO: renamed from: a */
    String mo6875a();

    /* JADX INFO: renamed from: b */
    int mo7144b(C2416m c2416m) throws ExoPlaybackException;

    /* JADX INFO: renamed from: o */
    int mo7001o() throws ExoPlaybackException;
}
