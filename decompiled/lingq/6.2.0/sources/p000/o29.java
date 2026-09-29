package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o29 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53655a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.DownloadOn3G.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.TimezoneAlert.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53655a = iArr;
    }
}
