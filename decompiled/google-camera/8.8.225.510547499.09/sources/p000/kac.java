package p000;

import android.media.MediaRecorder;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kac implements MediaRecorder.OnErrorListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kad f35445a;

    public kac(kad kadVar) {
        this.f35445a = kadVar;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 1) {
            Log.e("VidRecMedRec", "MEDIA_RECORDER_ERROR_UNKNOWN: extra=" + i2);
        } else if (i == 100) {
            Log.e("VidRecMedRec", "MEDIA_ERROR_SERVER_DIED: extra=" + i2);
        } else {
            if (i2 == -1007) {
                Log.e("VidRecMedRec", "MEDIA_ERROR_MALFORMED: what=" + i + " extra=-1007");
                return;
            }
            Log.e("VidRecMedRec", "MediaRecorder onError: what=" + i + " extra=" + i2);
        }
        this.f35445a.f35448c.mo5248a();
    }
}
