package p000;

import android.app.PictureInPictureUiState;
import android.os.Build;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l1c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f48906a = new C0282a(161041792, false, new ud1(15));

    /* JADX INFO: renamed from: b */
    public static final C0282a f48907b = new C0282a(1124078291, false, new ud1(16));

    /* JADX INFO: renamed from: a */
    public static bw8 m15742a(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new bw8();
        }
        if (i < 31) {
            return new bw8();
        }
        pictureInPictureUiState.isStashed();
        return new bw8();
    }
}
