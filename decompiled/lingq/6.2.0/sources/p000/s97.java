package p000;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s97 {
    /* JADX INFO: renamed from: a */
    public static Bundle m21173a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: renamed from: b */
    public static void m21174b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
