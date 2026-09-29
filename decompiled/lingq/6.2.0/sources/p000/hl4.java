package p000;

import com.lingq.core.domain.model.theme.ColorSchemeName;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hl4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f42575a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f42576b;

    static {
        int[] iArr = new int[PlayerConstants$PlayerState.values().length];
        try {
            iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f42575a = iArr;
        int[] iArr2 = new int[ColorSchemeName.values().length];
        try {
            iArr2[ColorSchemeName.Yellow.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ColorSchemeName.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f42576b = iArr2;
    }
}
