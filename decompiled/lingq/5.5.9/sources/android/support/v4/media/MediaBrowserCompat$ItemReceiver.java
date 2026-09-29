package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.support.v4.os.ResultReceiver
    /* JADX INFO: renamed from: a */
    public final void mo534a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m635e(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
