package p274n8;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;

/* JADX INFO: renamed from: n8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7722g implements C5086z.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f42261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GetTokenLoginMethodHandler f42262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LoginClient.Request f42263c;

    public C7722g(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f42261a = bundle;
        this.f42262b = getTokenLoginMethodHandler;
        this.f42263c = request;
    }

    @Override // p067d8.C5086z.a
    /* JADX INFO: renamed from: d */
    public final void mo10842d(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f42261a;
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f42262b;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e10) {
                LoginClient loginClientM6717d = getTokenLoginMethodHandler.m6717d();
                LoginClient.Request request = getTokenLoginMethodHandler.m6717d().f11607g;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                loginClientM6717d.m6704c(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        getTokenLoginMethodHandler.m6700r(bundle, this.f42263c);
    }

    @Override // p067d8.C5086z.a
    /* JADX INFO: renamed from: f */
    public final void mo10843f(FacebookException facebookException) {
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.f42262b;
        LoginClient loginClientM6717d = getTokenLoginMethodHandler.m6717d();
        LoginClient.Request request = getTokenLoginMethodHandler.m6717d().f11607g;
        String message = facebookException == null ? null : facebookException.getMessage();
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        loginClientM6717d.m6704c(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
    }
}
