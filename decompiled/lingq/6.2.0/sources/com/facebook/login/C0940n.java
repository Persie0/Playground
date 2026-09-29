package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import p000.c3b;

/* JADX INFO: renamed from: com.facebook.login.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C0940n implements c3b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebViewLoginMethodHandler f11525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginClient.Request f11526b;

    public C0940n(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
        this.f11525a = webViewLoginMethodHandler;
        this.f11526b = request;
    }

    @Override // p000.c3b
    /* JADX INFO: renamed from: a */
    public final void mo4304a(Bundle bundle, FacebookException facebookException) {
        LoginClient.Request request = this.f11526b;
        request.getClass();
        this.f11525a.m5248p(request, bundle, facebookException);
    }
}
