package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dm.C5207g;
import kotlin.Metadata;
import p291o7.C7997g;
import p498y3.C10289a;

/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d */
    public static final C2270a f11412d = new C2270a();

    /* JADX INFO: renamed from: e */
    public static AuthenticationTokenManager f11413e;

    /* JADX INFO: renamed from: a */
    public final C10289a f11414a;

    /* JADX INFO: renamed from: b */
    public final C7997g f11415b;

    /* JADX INFO: renamed from: c */
    public AuthenticationToken f11416c;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenManager$a */
    public static final class C2270a {
    }

    public AuthenticationTokenManager(C10289a c10289a, C7997g c7997g) {
        this.f11414a = c10289a;
        this.f11415b = c7997g;
    }
}
