package com.google.android.gms.common;

import p000.po3;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = po3.f56583a;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 104 + String.valueOf(i).length() + 194);
        wq1.m24127w(i2, i, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(sb.toString());
    }
}
