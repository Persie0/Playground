package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ana;

/* JADX INFO: renamed from: com.facebook.login.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0931e implements ana {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f11502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GetTokenLoginMethodHandler f11503b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LoginClient.Request f11504c;

    public C0931e(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f11502a = bundle;
        this.f11503b = getTokenLoginMethodHandler;
        this.f11504c = request;
    }

    @Override // p000.ana
    /* JADX INFO: renamed from: a */
    public final void mo617a(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f11502a;
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f11503b;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e) {
                LoginClient loginClientM5240d = getTokenLoginMethodHandler.m5240d();
                LoginClient.Request request = getTokenLoginMethodHandler.m5240d().f11450g;
                String message = e.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                loginClientM5240d.m5219c(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        getTokenLoginMethodHandler.m5215l(bundle, this.f11504c);
    }

    @Override // p000.ana
    /* JADX INFO: renamed from: c */
    public final void mo618c(FacebookException facebookException) {
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f11503b;
        LoginClient loginClientM5240d = getTokenLoginMethodHandler.m5240d();
        LoginClient.Request request = getTokenLoginMethodHandler.m5240d().f11450g;
        String message = facebookException != null ? facebookException.getMessage() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        loginClientM5240d.m5219c(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
    }
}
