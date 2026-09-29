package p000;

import com.lingq.feature.onboarding.auth.registration.RegistrationField;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nw6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53328a;

    static {
        int[] iArr = new int[RegistrationField.values().length];
        try {
            iArr[RegistrationField.Username.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RegistrationField.Email.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53328a = iArr;
    }
}
