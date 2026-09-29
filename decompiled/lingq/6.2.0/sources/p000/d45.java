package p000;

import com.lingq.feature.lessoninfo.OpenLessonButtonState;
import com.lingq.feature.lessoninfo.PlaylistButtonState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d45 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f34991a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f34992b;

    static {
        int[] iArr = new int[PlaylistButtonState.values().length];
        try {
            iArr[PlaylistButtonState.Add.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaylistButtonState.Remove.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f34991a = iArr;
        int[] iArr2 = new int[OpenLessonButtonState.values().length];
        try {
            iArr2[OpenLessonButtonState.Open.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[OpenLessonButtonState.Import.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[OpenLessonButtonState.Buy.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f34992b = iArr2;
    }
}
