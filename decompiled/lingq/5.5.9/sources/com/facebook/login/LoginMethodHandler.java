package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import dm.C5207g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.text.C7076b;
import mo.C7653a;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p291o7.C7993c0;
import p291o7.C8004n;
import p291o7.C8010t;
import p317p7.C8201h;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "a", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: a */
    public HashMap f11641a;

    /* JADX INFO: renamed from: b */
    public LoginClient f11642b;

    /* JADX INFO: renamed from: com.facebook.login.LoginMethodHandler$a */
    public static final class C2325a {
        /* JADX INFO: renamed from: a */
        public static AccessToken m6720a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            String string;
            C5207g.m11111f(bundle, "bundle");
            C5207g.m11111f(str, "applicationId");
            C5086z c5086z = C5086z.f33015a;
            Date dateM10829n = C5086z.m10829n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateM10829n2 = C5086z.m10829n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null) {
                return null;
            }
            if ((string2.length() == 0) || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null) {
                return null;
            }
            if (string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, str, string, stringArrayList, null, null, accessTokenSource, dateM10829n, new Date(), dateM10829n2, bundle.getString("graph_domain"));
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0073  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
        /* JADX INFO: renamed from: b */
        public static AccessToken m6721b(Set set, Bundle bundle, AccessTokenSource accessTokenSource, String str) throws FacebookException {
            Collection collectionM17237c;
            ArrayList arrayListM17237c;
            ArrayList arrayListM17237c2;
            C5207g.m11111f(bundle, "bundle");
            C5207g.m11111f(str, "applicationId");
            C5086z c5086z = C5086z.f33015a;
            Date dateM10829n = C5086z.m10829n(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateM10829n2 = C5086z.m10829n(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null) {
                collectionM17237c = set;
            } else {
                if (string2.length() > 0) {
                    Object[] array = C7076b.m14299s3(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    collectionM17237c = C9000b.m17237c(Arrays.copyOf(strArr, strArr.length));
                } else {
                    collectionM17237c = set;
                }
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null) {
                arrayListM17237c = null;
            } else {
                if (string3.length() > 0) {
                    Object[] array2 = C7076b.m14299s3(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr2 = (String[]) array2;
                    arrayListM17237c = C9000b.m17237c(Arrays.copyOf(strArr2, strArr2.length));
                } else {
                    arrayListM17237c = null;
                }
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null) {
                arrayListM17237c2 = null;
            } else {
                if (string4.length() > 0) {
                    Object[] array3 = C7076b.m14299s3(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr3 = (String[]) array3;
                    arrayListM17237c2 = C9000b.m17237c(Arrays.copyOf(strArr3, strArr3.length));
                } else {
                    arrayListM17237c2 = null;
                }
            }
            if (C5086z.m10802A(string)) {
                return null;
            }
            String string5 = bundle.getString("graph_domain");
            String string6 = bundle.getString("signed_request");
            if (string6 != null) {
                if (!(string6.length() == 0)) {
                    try {
                        Object[] array4 = C7076b.m14299s3(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                        if (array4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        String[] strArr4 = (String[]) array4;
                        if (strArr4.length == 2) {
                            byte[] bArrDecode = Base64.decode(strArr4[1], 0);
                            C5207g.m11110e(bArrDecode, "data");
                            String string7 = new JSONObject(new String(bArrDecode, C7653a.f42116b)).getString("user_id");
                            C5207g.m11110e(string7, "jsonObject.getString(\"user_id\")");
                            return new AccessToken(string, str, string7, collectionM17237c, arrayListM17237c, arrayListM17237c2, accessTokenSource, dateM10829n, new Date(), dateM10829n2, string5);
                        }
                        throw new FacebookException("Failed to retrieve user_id from signed_request");
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                }
            }
            throw new FacebookException("Authorization response does not contain the signed_request");
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0045  */
        /* JADX INFO: renamed from: c */
        public static AuthenticationToken m6722c(Bundle bundle, String str) throws FacebookException {
            C5207g.m11111f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }
    }

    public LoginMethodHandler(Parcel parcel) {
        HashMap map;
        C5207g.m11111f(parcel, "source");
        C5086z c5086z = C5086z.f33015a;
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMapM13467T0 = null;
        if (i10 < 0) {
            map = null;
        } else {
            map = new HashMap();
            if (i10 > 0) {
                int i11 = 0;
                do {
                    i11++;
                    map.put(parcel.readString(), parcel.readString());
                } while (i11 < i10);
            }
        }
        if (map != null) {
            linkedHashMapM13467T0 = C6753d.m13467T0(map);
        }
        this.f11641a = linkedHashMapM13467T0;
    }

    public LoginMethodHandler(LoginClient loginClient) {
        this.f11642b = loginClient;
    }

    /* JADX INFO: renamed from: a */
    public final void m6715a(String str, String str2) {
        if (this.f11641a == null) {
            this.f11641a = new HashMap();
        }
        HashMap map = this.f11641a;
        if (map == null) {
            return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6699b() {
    }

    /* JADX INFO: renamed from: c */
    public final String m6716c(String str) {
        C5207g.m11111f(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", getF11647f());
            mo6684n(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", C5207g.m11116k(e10.getMessage(), "Error creating client state json: "));
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "param.toString()");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final LoginClient m6717d() {
        LoginClient loginClient = this.f11642b;
        if (loginClient != null) {
            return loginClient;
        }
        C5207g.m11117l("loginClient");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public abstract String getF11647f();

    /* JADX INFO: renamed from: h */
    public String mo6682h() {
        return "fb" + C8004n.m15872b() + "://authorize/";
    }

    /* JADX INFO: renamed from: j */
    public final void m6718j(String str) {
        LoginClient.Request request = m6717d().f11607g;
        String strM15872b = request == null ? null : request.f11622d;
        if (strM15872b == null) {
            strM15872b = C8004n.m15872b();
        }
        C8201h c8201h = new C8201h(m6717d().m6706e(), strM15872b);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strM15872b);
        C8004n c8004n = C8004n.f43550a;
        if (C7993c0.m15849b()) {
            c8201h.m16334f("fb_dialogs_web_login_dialog_complete", bundle);
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean mo6683k(int i10, int i11, Intent intent) {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: l */
    public final void m6719l(Bundle bundle, LoginClient.Request request) throws Throwable {
        GraphRequest graphRequestM6621g;
        String string = bundle.getString("code");
        if (C5086z.m10802A(string)) {
            throw new FacebookException("No code param found from the request");
        }
        String string2 = null;
        if (string == null) {
            graphRequestM6621g = null;
        } else {
            String strMo6682h = mo6682h();
            String str = request.f11616K;
            if (str == null) {
                str = "";
            }
            C5207g.m11111f(strMo6682h, "redirectUri");
            Bundle bundle2 = new Bundle();
            bundle2.putString("code", string);
            bundle2.putString("client_id", C8004n.m15872b());
            bundle2.putString("redirect_uri", strMo6682h);
            bundle2.putString("code_verifier", str);
            String str2 = GraphRequest.f11448j;
            graphRequestM6621g = GraphRequest.C2279c.m6621g(null, "oauth/access_token", null);
            graphRequestM6621g.m6613k(HttpMethod.GET);
            graphRequestM6621g.f11454d = bundle2;
        }
        if (graphRequestM6621g == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        C8010t c8010tM6606c = graphRequestM6621g.m6606c();
        FacebookRequestError facebookRequestError = c8010tM6606c.f43588c;
        if (facebookRequestError != null) {
            throw new FacebookServiceException(facebookRequestError, facebookRequestError.m6602a());
        }
        try {
            JSONObject jSONObject = c8010tM6606c.f43587b;
            if (jSONObject != null) {
                string2 = jSONObject.getString("access_token");
            }
            if (jSONObject == null || C5086z.m10802A(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e10) {
            throw new FacebookException(C5207g.m11116k(e10.getMessage(), "Fail to process code exchange response: "));
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo6684n(JSONObject jSONObject) throws JSONException {
    }

    /* JADX INFO: renamed from: q */
    public abstract int mo6685q(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        C5086z c5086z = C5086z.f33015a;
        HashMap map = this.f11641a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
