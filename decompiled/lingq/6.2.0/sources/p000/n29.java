package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n29 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52242a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.InterfaceLanguage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.Theme.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.TimezoneAlert.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f52242a = iArr;
    }
}
