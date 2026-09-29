package com.facebook.appevents.internal;

import kotlin.jvm.internal.Lambda;
import p000.sy2;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class AppLinkManager$preferences$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final AppLinkManager$preferences$2 f11408b = new AppLinkManager$preferences$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        return sy2.m21766a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
    }
}
