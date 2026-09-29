package com.clevertap.android.sdk.pushnotification;

import android.os.Bundle;
import p430v6.InterfaceC9655a;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2257c implements InterfaceC9655a {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C2257c f11334a = new C2257c();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6569b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("pt_id");
        return ("0".equals(string) || string == null || string.isEmpty()) ? false : true;
    }

    @Override // p430v6.InterfaceC9655a
    /* JADX INFO: renamed from: a */
    public final void mo6570a() {
    }
}
