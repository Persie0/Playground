package p029b8;

import android.util.Patterns;
import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.text.C7076b;
import mo.C7653a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p173i8.C6205a;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1335a {

    /* JADX INFO: renamed from: a */
    public static final C1335a f8131a = new C1335a();

    /* JADX INFO: renamed from: b */
    public static Map<String, String> f8132b;

    /* JADX INFO: renamed from: c */
    public static Map<String, String> f8133c;

    /* JADX INFO: renamed from: d */
    public static Map<String, String> f8134d;

    /* JADX INFO: renamed from: e */
    public static JSONObject f8135e;

    /* JADX INFO: renamed from: f */
    public static boolean f8136f;

    /* JADX INFO: renamed from: a */
    public static final float[] m4894a(String str, JSONObject jSONObject) {
        if (C6205a.m12742b(C1335a.class)) {
            return null;
        }
        try {
            if (!f8136f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String strOptString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                C1335a c1335a = f8131a;
                c1335a.m4901h(jSONObject2, jSONArray);
                c1335a.m4904k(fArr, c1335a.m4900g(jSONObject2));
                JSONObject jSONObjectM4897b = c1335a.m4897b(jSONObject2);
                if (jSONObjectM4897b == null) {
                    return null;
                }
                C5207g.m11110e(strOptString, "screenName");
                String string = jSONObject2.toString();
                C5207g.m11110e(string, "viewTree.toString()");
                c1335a.m4904k(fArr, c1335a.m4899f(jSONObjectM4897b, jSONArray, strOptString, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C6205a.m12741a(C1335a.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m4895c(String str, String str2, String str3) {
        if (C6205a.m12742b(C1335a.class)) {
            return null;
        }
        try {
            C5207g.m11111f(str2, "activityName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str4.toLowerCase();
            C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            C6205a.m12741a(C1335a.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4896d(File file) {
        if (C6205a.m12742b(C1335a.class)) {
            return;
        }
        try {
            try {
                f8135e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f8135e = new JSONObject(new String(bArr, C7653a.f42116b));
                f8132b = C6753d.m13462O0(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                f8133c = C6753d.m13462O0(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                f8134d = C6753d.m13462O0(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f8136f = true;
            } catch (Throwable th2) {
                C6205a.m12741a(C1335a.class, th2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m4897b(JSONObject jSONObject) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    C5207g.m11110e(jSONObject2, "children.getJSONObject(i)");
                    JSONObject jSONObjectM4897b = m4897b(jSONObject2);
                    if (jSONObjectM4897b != null) {
                        return jSONObjectM4897b;
                    }
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4898e(String[] strArr, String[] strArr2) {
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (C7076b.m14278X2(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX INFO: renamed from: f */
    public final float[] m4899f(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        boolean z10;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        C5207g.m11110e(jSONObject2, "siblings.getJSONObject(i)");
                        if (C6205a.m12742b(this)) {
                            z10 = false;
                        } else {
                            try {
                                if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } catch (Throwable th2) {
                                C6205a.m12741a(this, th2);
                            }
                        }
                        if (z10) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            m4905l(jSONObject, sb3, sb2);
            String string = sb2.toString();
            C5207g.m11110e(string, "hintSB.toString()");
            String string2 = sb3.toString();
            C5207g.m11110e(string2, "textSB.toString()");
            fArr[15] = m4903j("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[16] = m4903j("COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = m4903j("COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
            fArr[18] = C7076b.m14278X2(str2, "password", false) ? 1.0f : 0.0f;
            fArr[19] = m4902i("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = m4902i("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = m4902i("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = m4903j("PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[24] = m4903j("PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = m4902i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
            fArr[27] = m4902i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = m4903j("LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[29] = m4903j("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final float[] m4900g(JSONObject jSONObject) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            C5207g.m11110e(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            C5207g.m11110e(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            C5207g.m11110e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            C5207g.m11110e(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            C5207g.m11110e(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m4898e(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m4898e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m4898e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m4898e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (C7076b.m14278X2(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m4898e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (C7076b.m14278X2(lowerCase3, "radio", false) && C7076b.m14278X2(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        C5207g.m11110e(jSONObject2, "childViews.getJSONObject(i)");
                        m4904k(fArr, m4900g(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4901h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length <= 0) {
                z10 = false;
                break;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                    z10 = true;
                    break;
                }
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                return z10;
            }
            int length3 = jSONArrayOptJSONArray.length();
            if (length3 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
                    C5207g.m11110e(jSONObject2, "child");
                    if (m4901h(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z10 = true;
                    }
                    if (i15 >= length3) {
                        break;
                    }
                    i14 = i15;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z10;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4902i(String str, String str2) {
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: j */
    public final boolean m4903j(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f8135e;
            String strOptString = null;
            if (jSONObject == null) {
                C5207g.m11117l("rules");
                throw null;
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject5 == null) {
                jSONObjectOptJSONObject = null;
            } else {
                Map<String, String> map = f8132b;
                if (map == null) {
                    C5207g.m11117l("languageInfo");
                    throw null;
                }
                jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject(map.get("ENGLISH"));
            }
            if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rulesForEvent")) == null) {
                jSONObjectOptJSONObject3 = null;
            } else {
                Map<String, String> map2 = f8133c;
                if (map2 == null) {
                    C5207g.m11117l("eventInfo");
                    throw null;
                }
                jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(map2.get(str));
            }
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("positiveRules")) != null) {
                Map<String, String> map3 = f8134d;
                if (map3 == null) {
                    C5207g.m11117l("textTypeInfo");
                    throw null;
                }
                strOptString = jSONObjectOptJSONObject4.optString(map3.get(str2));
            }
            if (strOptString == null) {
                return false;
            }
            return m4902i(strOptString, str3);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4904k(float[] fArr, float[] fArr2) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4905l(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            C5207g.m11110e(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            C5207g.m11110e(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            C5207g.m11110e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z10 = true;
            int i10 = 0;
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    C5207g.m11110e(jSONObject2, "currentChildView");
                    m4905l(jSONObject2, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
