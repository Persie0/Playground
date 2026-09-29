package p000;

import com.facebook.appevents.ParameterClassification;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class iz6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44807a;

    static {
        int[] iArr = new int[ParameterClassification.values().length];
        try {
            iArr[ParameterClassification.CustomData.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParameterClassification.OperationalData.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f44807a = iArr;
    }
}
