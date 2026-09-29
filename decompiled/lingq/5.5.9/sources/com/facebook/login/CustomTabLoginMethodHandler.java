package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import dm.C5207g;
import java.math.BigInteger;
import java.util.Random;
import kotlin.Metadata;
import mo.C7661i;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5063e;
import p067d8.C5083w;
import p067d8.C5086z;
import p266n.C7666c;
import p274n8.C7717b;
import p274n8.RunnableC7716a;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C2310a();

    /* JADX INFO: renamed from: i */
    public static boolean f11566i;

    /* JADX INFO: renamed from: d */
    public String f11567d;

    /* JADX INFO: renamed from: e */
    public final String f11568e;

    /* JADX INFO: renamed from: f */
    public final String f11569f;

    /* JADX INFO: renamed from: g */
    public final String f11570g;

    /* JADX INFO: renamed from: h */
    public final AccessTokenSource f11571h;

    /* JADX INFO: renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static final class C2310a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomTabLoginMethodHandler[] newArray(int i10) {
            return new CustomTabLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11570g = "custom_tab";
        this.f11571h = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.f11568e = parcel.readString();
        String[] strArr = C5063e.f32918a;
        this.f11569f = C5063e.m10754c(super.mo6682h());
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11570g = "custom_tab";
        this.f11571h = AccessTokenSource.CHROME_CUSTOM_TAB;
        C5086z c5086z = C5086z.f33015a;
        String string = new BigInteger(100, new Random()).toString(32);
        C5207g.m11110e(string, "BigInteger(length * 5, r).toString(32)");
        this.f11568e = string;
        f11566i = false;
        String[] strArr = C5063e.f32918a;
        this.f11569f = C5063e.m10754c(super.mo6682h());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF11598d() {
        return this.f11570g;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: h */
    public final String mo6682h() {
        return this.f11569f;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final boolean mo6683k(int i10, int i11, Intent intent) {
        LoginClient.Request request;
        boolean zM11106a;
        int i12;
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f11427i, false)) && i10 == 1 && (request = m6717d().f11607g) != null) {
            if (i11 != -1) {
                m6728x(request, null, new FacebookOperationCanceledException());
                return false;
            }
            String stringExtra = intent != null ? intent.getStringExtra(CustomTabMainActivity.f11424f) : null;
            if (stringExtra != null && (C7661i.m15256V2(stringExtra, "fbconnect://cct.", false) || C7661i.m15256V2(stringExtra, super.mo6682h(), false))) {
                Uri uri = Uri.parse(stringExtra);
                C5086z c5086z = C5086z.f33015a;
                Bundle bundleM10809H = C5086z.m10809H(uri.getQuery());
                bundleM10809H.putAll(C5086z.m10809H(uri.getFragment()));
                try {
                    String string = bundleM10809H.getString("state");
                    zM11106a = string == null ? false : C5207g.m11106a(new JSONObject(string).getString("7_challenge"), this.f11568e);
                } catch (JSONException unused) {
                }
                if (zM11106a) {
                    String string2 = bundleM10809H.getString("error");
                    if (string2 == null) {
                        string2 = bundleM10809H.getString("error_type");
                    }
                    String string3 = bundleM10809H.getString("error_msg");
                    if (string3 == null) {
                        string3 = bundleM10809H.getString("error_message");
                    }
                    if (string3 == null) {
                        string3 = bundleM10809H.getString("error_description");
                    }
                    String string4 = bundleM10809H.getString("error_code");
                    if (string4 != null) {
                        try {
                            i12 = Integer.parseInt(string4);
                        } catch (NumberFormatException unused2) {
                            i12 = -1;
                        }
                        if (!C5086z.m10802A(string2) && C5086z.m10802A(string3) && i12 == -1) {
                            if (bundleM10809H.containsKey("access_token")) {
                                m6728x(request, bundleM10809H, null);
                            } else {
                                C8004n.m15873c().execute(new RunnableC7716a(0, this, request, bundleM10809H));
                            }
                        } else if ((string2 == null && (C5207g.m11106a(string2, "access_denied") || C5207g.m11106a(string2, "OAuthAccessDeniedException"))) || i12 == 4201) {
                            m6728x(request, null, new FacebookOperationCanceledException());
                        } else {
                            m6728x(request, null, new FacebookServiceException(new FacebookRequestError(string2, i12, string3), string3));
                        }
                    }
                    i12 = -1;
                    if (!C5086z.m10802A(string2)) {
                        if (string2 == null) {
                            m6728x(request, null, new FacebookServiceException(new FacebookRequestError(string2, i12, string3), string3));
                        } else {
                            m6728x(request, null, new FacebookServiceException(new FacebookRequestError(string2, i12, string3), string3));
                        }
                    } else if (string2 == null) {
                        m6728x(request, null, new FacebookServiceException(new FacebookRequestError(string2, i12, string3), string3));
                    } else {
                        m6728x(request, null, new FacebookServiceException(new FacebookRequestError(string2, i12, string3), string3));
                    }
                } else {
                    m6728x(request, null, new FacebookException("Invalid state parameter"));
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: n */
    public final void mo6684n(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f11568e);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) throws Exception {
        Uri uriM10817b;
        LoginClient loginClientM6717d = m6717d();
        String str = this.f11569f;
        if (str.length() == 0) {
            return 0;
        }
        Bundle bundleM6727r = m6727r(request);
        bundleM6727r.putString("redirect_uri", str);
        LoginTargetApp loginTargetApp = LoginTargetApp.INSTAGRAM;
        LoginTargetApp loginTargetApp2 = request.f11630l;
        boolean z10 = loginTargetApp2 == loginTargetApp;
        String str2 = request.f11622d;
        if (z10) {
            bundleM6727r.putString("app_id", str2);
        } else {
            bundleM6727r.putString("client_id", str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "e2e.toString()");
        bundleM6727r.putString("e2e", string);
        LoginTargetApp loginTargetApp3 = LoginTargetApp.INSTAGRAM;
        if (loginTargetApp2 == loginTargetApp3) {
            bundleM6727r.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f11620b.contains("openid")) {
                bundleM6727r.putString("nonce", request.f11615J);
            }
            bundleM6727r.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundleM6727r.putString("code_challenge", request.f11617L);
        CodeChallengeMethod codeChallengeMethod = request.f11618M;
        bundleM6727r.putString("code_challenge_method", codeChallengeMethod == null ? null : codeChallengeMethod.name());
        bundleM6727r.putString("return_scopes", "true");
        bundleM6727r.putString("auth_type", request.f11626h);
        bundleM6727r.putString("login_behavior", request.f11619a.name());
        C8004n c8004n = C8004n.f43550a;
        bundleM6727r.putString("sdk", C5207g.m11116k("16.0.1", "android-"));
        bundleM6727r.putString("sso", "chrome_custom_tab");
        bundleM6727r.putString("cct_prefetching", C8004n.f43564o ? "1" : "0");
        if (request.f11613H) {
            bundleM6727r.putString("fx_app", loginTargetApp2.toString());
        }
        if (request.f11614I) {
            bundleM6727r.putString("skip_dedupe", "true");
        }
        String str3 = request.f11628j;
        if (str3 != null) {
            bundleM6727r.putString("messenger_page_id", str3);
            bundleM6727r.putString("reset_messenger_state", request.f11629k ? "1" : "0");
        }
        if (f11566i) {
            bundleM6727r.putString("cct_over_app_switch", "1");
        }
        if (C8004n.f43564o) {
            if (loginTargetApp2 == loginTargetApp3) {
                C7666c c7666c = C7717b.f42248b;
                if (C5207g.m11106a("oauth", "oauth")) {
                    C5086z c5086z = C5086z.f33015a;
                    uriM10817b = C5086z.m10817b(C5083w.m10801b(), "oauth/authorize", bundleM6727r);
                } else {
                    C5086z c5086z2 = C5086z.f33015a;
                    uriM10817b = C5086z.m10817b(C5083w.m10801b(), C8004n.m15874d() + "/dialog/oauth", bundleM6727r);
                }
                C7717b.a.m15308a(uriM10817b);
            } else {
                C7666c c7666c2 = C7717b.f42248b;
                C5086z c5086z3 = C5086z.f33015a;
                C7717b.a.m15308a(C5086z.m10817b(C5083w.m10800a(), C8004n.m15874d() + "/dialog/oauth", bundleM6727r));
            }
        }
        ActivityC0979t activityC0979tM6706e = loginClientM6717d.m6706e();
        if (activityC0979tM6706e == null) {
            return 0;
        }
        Intent intent = new Intent(activityC0979tM6706e, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f11421c, "oauth");
        intent.putExtra(CustomTabMainActivity.f11422d, bundleM6727r);
        String str4 = CustomTabMainActivity.f11423e;
        String strM10752a = this.f11567d;
        if (strM10752a == null) {
            strM10752a = C5063e.m10752a();
            this.f11567d = strM10752a;
        }
        intent.putExtra(str4, strM10752a);
        intent.putExtra(CustomTabMainActivity.f11425g, loginTargetApp2.toString());
        Fragment fragment = loginClientM6717d.f11603c;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: w */
    public final AccessTokenSource getF11648g() {
        return this.f11571h;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f11568e);
    }
}
