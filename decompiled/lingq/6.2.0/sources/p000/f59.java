package p000;

import com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f59 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38442a;

    static {
        int[] iArr = new int[SharedSessionRepositoryImpl$NotificationType.values().length];
        try {
            iArr[SharedSessionRepositoryImpl$NotificationType.GENERAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedSessionRepositoryImpl$NotificationType.FALLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f38442a = iArr;
    }
}
