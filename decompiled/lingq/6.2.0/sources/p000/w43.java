package p000;

import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w43 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66372a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f66373b;

    static {
        int[] iArr = new int[TokenResult$ResponseCode.values().length];
        f66373b = iArr;
        try {
            iArr[TokenResult$ResponseCode.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f66373b[TokenResult$ResponseCode.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f66373b[TokenResult$ResponseCode.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[InstallationResponse$ResponseCode.values().length];
        f66372a = iArr2;
        try {
            iArr2[InstallationResponse$ResponseCode.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f66372a[InstallationResponse$ResponseCode.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
