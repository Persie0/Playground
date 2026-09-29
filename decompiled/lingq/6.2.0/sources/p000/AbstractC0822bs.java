package p000;

import com.facebook.appevents.cloudbridge.AppEventType;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType;
import com.facebook.appevents.cloudbridge.ConversionsAPISection;

/* JADX INFO: renamed from: bs */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0822bs {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8907a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f8908b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f8909c;

    static {
        int[] iArr = new int[AppEventsConversionsAPITransformer$ValueTransformationType.values().length];
        try {
            iArr[AppEventsConversionsAPITransformer$ValueTransformationType.ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppEventsConversionsAPITransformer$ValueTransformationType.BOOL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppEventsConversionsAPITransformer$ValueTransformationType.INT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8907a = iArr;
        int[] iArr2 = new int[ConversionsAPISection.values().length];
        try {
            iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f8908b = iArr2;
        int[] iArr3 = new int[AppEventType.values().length];
        try {
            iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[AppEventType.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f8909c = iArr3;
    }
}
