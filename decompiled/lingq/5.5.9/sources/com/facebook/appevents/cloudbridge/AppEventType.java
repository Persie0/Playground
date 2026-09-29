package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13365d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "MOBILE_APP_INSTALL", "CUSTOM", "OTHER", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventType$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AppEventType[] valuesCustom() {
        AppEventType[] appEventTypeArrValuesCustom = values();
        return (AppEventType[]) Arrays.copyOf(appEventTypeArrValuesCustom, appEventTypeArrValuesCustom.length);
    }
}
