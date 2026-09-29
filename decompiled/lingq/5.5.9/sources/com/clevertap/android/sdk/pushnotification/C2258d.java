package com.clevertap.android.sdk.pushnotification;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2258d {
    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m6571a() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (PushConstants.PushType pushType : PushConstants.PushType.values()) {
            arrayList.add(pushType.name());
        }
        return arrayList;
    }
}
