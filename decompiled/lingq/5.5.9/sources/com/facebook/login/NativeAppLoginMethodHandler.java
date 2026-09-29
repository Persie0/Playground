package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.emoji2.text.RunnableC0893g;
import androidx.fragment.app.C0964m;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import p067d8.C5083w;
import p067d8.C5086z;
import p291o7.C8004n;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: c */
    public final AccessTokenSource f11643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11643c = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11643c = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m6723A(Intent intent) {
        if (intent != null) {
            List<ResolveInfo> listQueryIntentActivities = C8004n.m15871a().getPackageManager().queryIntentActivities(intent, 65536);
            C5207g.m11110e(listQueryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!listQueryIntentActivities.isEmpty()) {
                Fragment fragment = m6717d().f11603c;
                C9072e c9072e = null;
                C2332c c2332c = fragment instanceof C2332c ? (C2332c) fragment : null;
                if (c2332c != null) {
                    C0964m c0964m = c2332c.f11667y0;
                    if (c0964m == null) {
                        C5207g.m11117l("launcher");
                        throw null;
                    }
                    c0964m.mo844a(intent);
                    c9072e = C9072e.f47360a;
                }
                return c9072e != null;
            }
        }
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final boolean mo6683k(int i10, int i11, Intent intent) {
        String str;
        Object obj;
        LoginClient.Request request = m6717d().f11607g;
        if (intent == null) {
            m6724r(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, "Operation canceled", null));
        } else {
            String string = null;
            if (i11 == 0) {
                Bundle extras = intent.getExtras();
                String string2 = extras == null ? null : extras.getString("error");
                if (string2 != null) {
                    str = string2;
                } else if (extras == null) {
                    str = null;
                } else {
                    string2 = extras.getString("error_type");
                    str = string2;
                }
                String string3 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
                int i12 = C5083w.f33011a;
                if (C5207g.m11106a("CONNECTION_FAILURE", string3)) {
                    String string4 = extras == null ? null : extras.getString("error_message");
                    if (string4 != null) {
                        string = string4;
                    } else if (extras != null) {
                        string = extras.getString("error_description");
                    }
                    ArrayList arrayList = new ArrayList();
                    if (str != null) {
                        arrayList.add(str);
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                    m6724r(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), string3));
                } else {
                    m6724r(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, str, null));
                }
            } else if (i11 != -1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("Unexpected resultCode from authorization.");
                m6724r(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), null));
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    m6724r(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string5 = extras2.getString("error");
                if (string5 == null) {
                    string5 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                if (obj2 != null) {
                    string = obj2.toString();
                }
                String string6 = extras2.getString("error_message");
                if (string6 == null) {
                    string6 = extras2.getString("error_description");
                }
                String string7 = extras2.getString("e2e");
                if (!C5086z.m10802A(string7)) {
                    m6718j(string7);
                }
                if (string5 != null || string != null || string6 != null || request == null) {
                    m6725x(request, string5, string6, string);
                } else if (!extras2.containsKey("code") || C5086z.m10802A(extras2.getString("code"))) {
                    m6726z(extras2, request);
                } else {
                    C8004n.m15873c().execute(new RunnableC0893g(2, this, request, extras2));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m6724r(LoginClient.Result result) {
        if (result != null) {
            m6717d().m6705d(result);
        } else {
            m6717d().m6711n();
        }
    }

    /* JADX INFO: renamed from: w */
    public AccessTokenSource mo6701w() {
        return this.f11643c;
    }

    /* JADX INFO: renamed from: x */
    public final void m6725x(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && C5207g.m11106a(str, "logged_out")) {
            CustomTabLoginMethodHandler.f11566i = true;
            m6724r(null);
            return;
        }
        int i10 = C5083w.f33011a;
        if (C6752c.m13415I(C9000b.m17252r("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m6724r(null);
            return;
        }
        if (C6752c.m13415I(C9000b.m17252r("access_denied", "OAuthAccessDeniedException"), str)) {
            m6724r(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m6724r(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    /* JADX INFO: renamed from: z */
    public final void m6726z(Bundle bundle, LoginClient.Request request) {
        try {
            m6724r(new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, LoginMethodHandler.C2325a.m6721b(request.f11620b, bundle, mo6701w(), request.f11622d), LoginMethodHandler.C2325a.m6722c(bundle, request.f11615J), null, null));
        } catch (FacebookException e10) {
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m6724r(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }
}
