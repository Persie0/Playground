package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;
import p000.da7;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoPlayer extends da7 {
    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
