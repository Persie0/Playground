package com.facebook.appevents;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"com/facebook/appevents/AppEventsLogger$FlushBehavior", "", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "<init>", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public enum AppEventsLogger$FlushBehavior {
    AUTO,
    EXPLICIT_ONLY;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AppEventsLogger$FlushBehavior[] valuesCustom() {
        AppEventsLogger$FlushBehavior[] appEventsLogger$FlushBehaviorArrValuesCustom = values();
        return (AppEventsLogger$FlushBehavior[]) Arrays.copyOf(appEventsLogger$FlushBehaviorArrValuesCustom, appEventsLogger$FlushBehaviorArrValuesCustom.length);
    }
}
