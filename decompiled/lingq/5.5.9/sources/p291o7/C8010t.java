package p291o7;

import android.util.Log;
import androidx.activity.result.C0204c;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p067d8.C5078r;
import p067d8.C5086z;
import tl.C9325m;

/* JADX INFO: renamed from: o7.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8010t {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f43585e = 0;

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f43586a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f43587b;

    /* JADX INFO: renamed from: c */
    public final FacebookRequestError f43588c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f43589d;

    /* JADX INFO: renamed from: o7.t$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static ArrayList m15884a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C5207g.m11111f(list, "requests");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C8010t((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00e7 A[Catch: JSONException -> 0x0137, TryCatch #0 {JSONException -> 0x0137, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0028, B:11:0x002c, B:14:0x0039, B:48:0x00e7, B:35:0x007d, B:32:0x0073, B:29:0x0069, B:26:0x0061, B:23:0x005a, B:20:0x0050, B:17:0x0046, B:36:0x0084, B:39:0x0091, B:41:0x009a, B:45:0x00b5, B:56:0x0106, B:58:0x0121, B:59:0x0127), top: B:101:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:54:0x0103  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106 A[Catch: JSONException -> 0x0137, TryCatch #0 {JSONException -> 0x0137, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0028, B:11:0x002c, B:14:0x0039, B:48:0x00e7, B:35:0x007d, B:32:0x0073, B:29:0x0069, B:26:0x0061, B:23:0x005a, B:20:0x0050, B:17:0x0046, B:36:0x0084, B:39:0x0091, B:41:0x009a, B:45:0x00b5, B:56:0x0106, B:58:0x0121, B:59:0x0127), top: B:101:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: JSONException -> 0x0137, TryCatch #0 {JSONException -> 0x0137, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0028, B:11:0x002c, B:14:0x0039, B:48:0x00e7, B:35:0x007d, B:32:0x0073, B:29:0x0069, B:26:0x0061, B:23:0x005a, B:20:0x0050, B:17:0x0046, B:36:0x0084, B:39:0x0091, B:41:0x009a, B:45:0x00b5, B:56:0x0106, B:58:0x0121, B:59:0x0127), top: B:101:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0137  */
        /* JADX INFO: renamed from: b */
        public static C8010t m15885b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            FacebookRequestError facebookRequestError;
            AccessToken accessToken;
            boolean z10;
            FacebookRequestError facebookRequestError2;
            String strOptString;
            int iOptInt;
            String strOptString2;
            boolean zOptBoolean;
            String strOptString3;
            String strOptString4;
            boolean z11;
            boolean z12;
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            Object obj3 = obj;
            if (obj3 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj3;
                boolean z13 = false;
                try {
                    if (jSONObject.has("code")) {
                        int i11 = jSONObject.getInt("code");
                        Object objM10835t = C5086z.m10835t("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                        if (objM10835t == null || !(objM10835t instanceof JSONObject)) {
                            if (i11 <= 299 || 200 > i11) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                facebookRequestError = null;
                            } else {
                                if (jSONObject.has("body")) {
                                }
                                facebookRequestError2 = new FacebookRequestError(i11, -1, -1, null, null, null, null, obj2, null, false);
                            }
                        } else {
                            int iOptInt2 = -1;
                            if (((JSONObject) objM10835t).has("error")) {
                                JSONObject jSONObject2 = (JSONObject) C5086z.m10835t("error", null, (JSONObject) objM10835t);
                                strOptString2 = jSONObject2 == null ? null : jSONObject2.optString("type", null);
                                strOptString = jSONObject2 == null ? null : jSONObject2.optString("message", null);
                                iOptInt = jSONObject2 == null ? -1 : jSONObject2.optInt("code", -1);
                                if (jSONObject2 != null) {
                                    iOptInt2 = jSONObject2.optInt("error_subcode", -1);
                                }
                                strOptString4 = jSONObject2 == null ? null : jSONObject2.optString("error_user_msg", null);
                                strOptString3 = jSONObject2 == null ? null : jSONObject2.optString("error_user_title", null);
                                zOptBoolean = jSONObject2 == null ? false : jSONObject2.optBoolean("is_transient", false);
                            } else {
                                if (((JSONObject) objM10835t).has("error_code") || ((JSONObject) objM10835t).has("error_msg") || ((JSONObject) objM10835t).has("error_reason")) {
                                    String strOptString5 = ((JSONObject) objM10835t).optString("error_reason", null);
                                    strOptString = ((JSONObject) objM10835t).optString("error_msg", null);
                                    iOptInt = ((JSONObject) objM10835t).optInt("error_code", -1);
                                    iOptInt2 = ((JSONObject) objM10835t).optInt("error_subcode", -1);
                                    strOptString2 = strOptString5;
                                    zOptBoolean = false;
                                    strOptString3 = null;
                                    strOptString4 = null;
                                } else {
                                    z11 = false;
                                    z12 = false;
                                    i10 = -1;
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                    str4 = null;
                                }
                                if (z11) {
                                    facebookRequestError2 = new FacebookRequestError(i11, i10, iOptInt2, str, str2, str3, str4, obj2, null, z12);
                                } else {
                                    if (i11 <= 299) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        if (jSONObject.has("body")) {
                                        }
                                        facebookRequestError2 = new FacebookRequestError(i11, -1, -1, null, null, null, null, obj2, null, false);
                                    } else {
                                        facebookRequestError = null;
                                    }
                                }
                            }
                            z12 = zOptBoolean;
                            str = strOptString2;
                            str3 = strOptString3;
                            str2 = strOptString;
                            str4 = strOptString4;
                            z11 = true;
                            i10 = iOptInt;
                            if (z11) {
                                facebookRequestError2 = new FacebookRequestError(i11, i10, iOptInt2, str, str2, str3, str4, obj2, null, z12);
                            } else {
                                if (i11 <= 299) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (jSONObject.has("body")) {
                                    }
                                    facebookRequestError2 = new FacebookRequestError(i11, -1, -1, null, null, null, null, obj2, null, false);
                                } else {
                                    facebookRequestError = null;
                                }
                            }
                        }
                        facebookRequestError = facebookRequestError2;
                    } else {
                        facebookRequestError = null;
                    }
                } catch (JSONException unused) {
                }
                if (facebookRequestError != null) {
                    int i12 = C8010t.f43585e;
                    Log.e("o7.t", facebookRequestError.toString());
                    if (facebookRequestError.f11439b == 190) {
                        C5086z c5086z = C5086z.f33015a;
                        AccessToken accessToken2 = graphRequest.f11451a;
                        if (accessToken2 != null) {
                            Date date = AccessToken.f11370l;
                            if (C5207g.m11106a(accessToken2, AccessToken.C2262b.m6595b())) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            int i13 = facebookRequestError.f11440c;
                            C7995e.a aVar = C7995e.f43517f;
                            if (i13 != 493) {
                                Date date2 = AccessToken.f11370l;
                                aVar.m15863a().m15862c(null, true);
                            } else {
                                Date date3 = AccessToken.f11370l;
                                AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                                if (C5207g.m11106a(accessTokenM6595b == null ? null : Boolean.valueOf(new Date().after(accessTokenM6595b.f11371a)), Boolean.FALSE) && (accessToken = aVar.m15863a().f43521c) != null) {
                                    aVar.m15863a().m15862c(new AccessToken(accessToken.f11375e, accessToken.f11378h, accessToken.f11379i, accessToken.f11372b, accessToken.f11373c, accessToken.f11374d, accessToken.f11376f, new Date(), new Date(), accessToken.f11380j), true);
                                }
                            }
                        }
                    }
                    return new C8010t(graphRequest, httpURLConnection, facebookRequestError);
                }
                Object objM10835t2 = C5086z.m10835t("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                if (objM10835t2 instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) objM10835t2;
                    return new C8010t(graphRequest, httpURLConnection, jSONObject3.toString(), jSONObject3);
                }
                if (objM10835t2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM10835t2;
                    String string = jSONArray.toString();
                    C5207g.m11111f(graphRequest, "request");
                    C5207g.m11111f(string, "rawResponse");
                    return new C8010t(graphRequest, httpURLConnection, null, jSONArray, null);
                }
                obj3 = JSONObject.NULL;
                C5207g.m11110e(obj3, "NULL");
            }
            if (obj3 == JSONObject.NULL) {
                return new C8010t(graphRequest, httpURLConnection, obj3.toString(), null);
            }
            throw new FacebookException(C5207g.m11116k(obj3.getClass().getSimpleName(), "Got unexpected object type in response, class: "));
        }

        /* JADX INFO: renamed from: c */
        public static ArrayList m15886c(InputStream inputStream, HttpURLConnection httpURLConnection, C8009s c8009s) throws Throwable {
            Object obj;
            C5207g.m11111f(c8009s, "requests");
            String strM10812K = C5086z.m10812K(inputStream);
            C5078r.f32986e.m10781c(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strM10812K.length()), strM10812K);
            Object objNextValue = new JSONTokener(strM10812K).nextValue();
            C5207g.m11110e(objNextValue, "resultObject");
            int size = c8009s.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) c8009s.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", objNextValue);
                    jSONObject.put("code", httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new C8010t(graphRequest, httpURLConnection, new FacebookRequestError(e10)));
                    obj = objNextValue;
                } catch (JSONException e11) {
                    arrayList.add(new C8010t(graphRequest, httpURLConnection, new FacebookRequestError(e11)));
                    obj = objNextValue;
                }
            } else {
                obj = objNextValue;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            GraphRequest graphRequest2 = (GraphRequest) c8009s.get(i10);
                            try {
                                Object obj2 = ((JSONArray) obj).get(i10);
                                C5207g.m11110e(obj2, "obj");
                                arrayList.add(m15885b(graphRequest2, httpURLConnection, obj2, objNextValue));
                            } catch (FacebookException e12) {
                                arrayList.add(new C8010t(graphRequest2, httpURLConnection, new FacebookRequestError(e12)));
                            } catch (JSONException e13) {
                                arrayList.add(new C8010t(graphRequest2, httpURLConnection, new FacebookRequestError(e13)));
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    C5078r.f32986e.m10781c(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", c8009s.f43582b, Integer.valueOf(strM10812K.length()), arrayList);
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8010t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, facebookRequestError);
        C5207g.m11111f(graphRequest, "request");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8010t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, jSONObject, null, null);
        C5207g.m11111f(graphRequest, "request");
        C5207g.m11111f(str, "rawResponse");
    }

    public C8010t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        C5207g.m11111f(graphRequest, "request");
        this.f43586a = httpURLConnection;
        this.f43587b = jSONObject;
        this.f43588c = facebookRequestError;
        this.f43589d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f43586a;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C5207g.m11110e(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbM854m = C0204c.m854m("{Response:  responseCode: ", str, ", graphObject: ");
        sbM854m.append(this.f43587b);
        sbM854m.append(", error: ");
        sbM854m.append(this.f43588c);
        sbM854m.append("}");
        String string = sbM854m.toString();
        C5207g.m11110e(string, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return string;
    }
}
