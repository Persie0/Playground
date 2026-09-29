package p000;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fm5 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3309ls f39284a;

    public fm5(C3309ls c3309ls) {
        this.f39284a = c3309ls;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((gm5) this.f39284a.f50064b).getClass();
        return bundle;
    }
}
