package p000;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu5 {
    /* JADX INFO: renamed from: a */
    public static Uri m14152a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m14153b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
