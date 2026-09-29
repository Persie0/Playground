package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        super(C0009a.m20h("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", C2549d.f13921a, " but found ", i10, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
