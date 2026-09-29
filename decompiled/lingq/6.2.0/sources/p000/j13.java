package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.util.Patterns;
import android.view.Display;
import android.view.DisplayCutout;
import com.facebook.login.C0936j;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.lingq.core.domain.model.lesson.Lesson;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j13 implements jh0, o52, xr2, e94, gr9, d94, lkd, xoc, yr6 {

    /* JADX INFO: renamed from: b */
    public static Map f44885b;

    /* JADX INFO: renamed from: c */
    public static Map f44886c;

    /* JADX INFO: renamed from: d */
    public static Map f44887d;

    /* JADX INFO: renamed from: e */
    public static JSONObject f44888e;

    /* JADX INFO: renamed from: f */
    public static boolean f44889f;

    /* JADX INFO: renamed from: i */
    public static C0936j f44892i;

    /* JADX INFO: renamed from: a */
    public static final j13 f44884a = new j13();

    /* JADX INFO: renamed from: g */
    public static final j13 f44890g = new j13();

    /* JADX INFO: renamed from: h */
    public static final j13 f44891h = new j13();

    /* JADX INFO: renamed from: j */
    public static final j13 f44893j = new j13();

    /* JADX INFO: renamed from: k */
    public static final j13 f44894k = new j13();

    /* JADX INFO: renamed from: a */
    public static String m14248a(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            C3386nv.m17633t("StringBuilder must not be empty");
            return null;
        }
        int iCharAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (length >= 2) {
            sb2.append(c2);
        }
        if (length >= 3) {
            sb2.append(c3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m14249c(String str, JSONObject jSONObject) {
        if (!lp1.f49971a.contains(j13.class)) {
            try {
                if (f44889f) {
                    float[] fArr = new float[30];
                    for (int i = 0; i < 30; i++) {
                        fArr[i] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        lowerCase.getClass();
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String strOptString = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        j13 j13Var = f44884a;
                        j13Var.m14260p(jSONObject2, jSONArray);
                        j13Var.m14263s(fArr, j13Var.m14259o(jSONObject2));
                        JSONObject jSONObjectM14255e = j13Var.m14255e(jSONObject2);
                        if (jSONObjectM14255e != null) {
                            strOptString.getClass();
                            String string = jSONObject2.toString();
                            string.getClass();
                            j13Var.m14263s(fArr, j13Var.m14258n(jSONObjectM14255e, jSONArray, strOptString, string, lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(j13.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final String m14250g(String str, String str2, String str3) {
        if (lp1.f49971a.contains(j13.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            lp1.m16420a(j13.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m14251i(File file) {
        if (lp1.f49971a.contains(j13.class)) {
            return;
        }
        try {
            try {
                f44888e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f44888e = new JSONObject(new String(bArr, yu0.f70463a));
                f44885b = AbstractC3194a.m15365R(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                f44886c = AbstractC3194a.m15365R(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                f44887d = AbstractC3194a.m15365R(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f44889f = true;
            } catch (Throwable th) {
                lp1.m16420a(j13.class, th);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static v15 m14252j(Lesson lesson, Integer num) {
        if (lesson == null || !lesson.f19166y) {
            return new v15(0, false, false);
        }
        int iIntValue = num != null ? num.intValue() : 0;
        String str = lesson.f19147f;
        return new v15(iIntValue, true, !(str == null || vk9.m23391n0(str)));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m14253k() {
        if (lp1.f49971a.contains(j13.class)) {
            return false;
        }
        try {
            return f44889f;
        } catch (Throwable th) {
            lp1.m16420a(j13.class, th);
            return false;
        }
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: b */
    public Rect mo14254b(Activity activity) throws Exception {
        ih0 ih0Var = jh0.f45539n;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            ih0Var.getClass();
            Log.w(ih0.f44101b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                ih0Var.getClass();
                Log.w(ih0.f44101b, e2);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // p000.xr2
    /* JADX INFO: renamed from: d */
    public void mo10679d(as2 as2Var) {
        boolean z;
        String str = as2Var.f7417a;
        StringBuilder sb = as2Var.f7419c;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z = true;
            if (!as2Var.m3017b()) {
                break;
            }
            char cM3016a = as2Var.m3016a();
            if (cM3016a >= ' ' && cM3016a <= '?') {
                sb2.append(cM3016a);
            } else {
                if (cM3016a < '@' || cM3016a > '^') {
                    zed.m25583b(cM3016a);
                    throw null;
                }
                sb2.append((char) (cM3016a - '@'));
            }
            as2Var.f7420d++;
            if (sb2.length() >= 4) {
                sb.append(m14248a(sb2));
                sb2.delete(0, 4);
                if (zed.m25587f(str, as2Var.f7420d, 4) != 4) {
                    as2Var.f7421e = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                as2Var.f7421e = 0;
                return;
            }
            if (length == 1) {
                as2Var.m3018c(sb.length());
                int length2 = as2Var.f7422f.f34352b - sb.length();
                int length3 = (str.length() - as2Var.f7423g) - as2Var.f7420d;
                if (length3 > length2) {
                    as2Var.m3018c(sb.length() + 1);
                    length2 = as2Var.f7422f.f34352b - sb.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    as2Var.f7421e = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strM14248a = m14248a(sb2);
            if (as2Var.m3017b() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                as2Var.m3018c(sb.length() + i);
                if (as2Var.f7422f.f34352b - sb.length() >= 3) {
                    as2Var.m3018c(sb.length() + strM14248a.length());
                    z = false;
                }
            }
            if (z) {
                as2Var.f7422f = null;
                as2Var.f7420d -= i;
            } else {
                sb.append(strM14248a);
            }
            as2Var.f7421e = 0;
        } catch (Throwable th) {
            as2Var.f7421e = 0;
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m14255e(JSONObject jSONObject) {
        if (!lp1.f49971a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return jSONObject;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        jSONObject2.getClass();
                        JSONObject jSONObjectM14255e = m14255e(jSONObject2);
                        if (jSONObjectM14255e != null) {
                            return jSONObjectM14255e;
                        }
                    }
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public synchronized C0936j m14256f(Context context) {
        if (context == null) {
            try {
                context = sy2.m21766a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f44892i == null) {
            f44892i = new C0936j(context, sy2.m21767b());
        }
        return f44892i;
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        zzvj zzvjVar = (zzvj) obj;
        return new hs9(zzvjVar.f12171a, zzvjVar.f12172b, zzvjVar.f12173c, "");
    }

    /* JADX INFO: renamed from: l */
    public boolean m14257l(String[] strArr, String[] strArr2) {
        if (!lp1.f49971a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (vk9.m23380c0(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return false;
            }
        }
        return false;
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x013e  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX INFO: renamed from: n */
    public float[] m14258n(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        String str4;
        String string;
        String string2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float[] fArr2 = null;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i = 0;
            while (true) {
                if (i >= 30) {
                    break;
                }
                fArr3[i] = 0.0f;
                i++;
                lp1.m16420a(this, th);
                return fArr;
            }
            int length = jSONArray.length();
            boolean z = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i2 = 0;
                while (i2 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            jSONObject2.getClass();
                            boolean z2 = z;
                            if (!lp1.f49971a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    lp1.m16420a(this, th);
                                }
                            }
                            i2++;
                            fArr2 = fArr;
                            z = z2;
                        } catch (JSONException unused) {
                            fArr3[13] = -1.0f;
                            fArr3[14] = -1.0f;
                            str4 = str + '|' + str3;
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            m14264t(jSONObject, sb2, sb);
                            string = sb.toString();
                            string2 = sb2.toString();
                            if (m14262r("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            fArr3[15] = f;
                            if (m14262r("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                                f2 = 1.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            fArr3[16] = f2;
                            if (m14262r("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            fArr3[17] = f3;
                            if (vk9.m23380c0(str2, "password", false)) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            fArr3[18] = f4;
                            if (m14261q("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            fArr3[19] = f5;
                            if (m14261q("(?i)(sign in)|login|signIn", str2)) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            fArr3[20] = f6;
                            if (m14261q("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fArr3[21] = f7;
                            if (m14262r("PURCHASE", "BUTTON_TEXT", string2)) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            fArr3[22] = f8;
                            if (m14262r("PURCHASE", "PAGE_TITLE", str4)) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            fArr3[24] = f9;
                            if (m14261q("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fArr3[25] = f10;
                            if (m14261q("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            fArr3[27] = f11;
                            if (m14262r("LEAD", "BUTTON_TEXT", string2)) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            fArr3[28] = f12;
                            fArr3[29] = m14262r("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
                            return fArr3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            m14264t(jSONObject, sb4, sb3);
            string = sb3.toString();
            string2 = sb4.toString();
            if (m14262r("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr3[15] = f;
            if (m14262r("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr3[16] = f2;
            if (m14262r("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr3[17] = f3;
            if (vk9.m23380c0(str2, "password", false)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr3[18] = f4;
            if (m14261q("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr3[19] = f5;
            if (m14261q("(?i)(sign in)|login|signIn", str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr3[20] = f6;
            if (m14261q("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr3[21] = f7;
            if (m14262r("PURCHASE", "BUTTON_TEXT", string2)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr3[22] = f8;
            if (m14262r("PURCHASE", "PAGE_TITLE", str4)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr3[24] = f9;
            if (m14261q("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr3[25] = f10;
            if (m14261q("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr3[27] = f11;
            if (m14262r("LEAD", "BUTTON_TEXT", string2)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr3[28] = f12;
            fArr3[29] = m14262r("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public float[] m14259o(JSONObject jSONObject) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            String strOptString3 = jSONObject.optString("classname");
            strOptString3.getClass();
            String lowerCase3 = strOptString3.toLowerCase();
            lowerCase3.getClass();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m14257l(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m14257l(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m14257l(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m14257l(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (vk9.m23380c0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m14257l(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (vk9.m23380c0(lowerCase3, "radio", false) && vk9.m23380c0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    m14263s(fArr, m14259o(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m14260p(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!lp1.f49971a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                    }
                    return z2;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    if (m14260p(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m14261q(String str, String str2) {
        if (lp1.f49971a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m14262r(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!lp1.f49971a.contains(this)) {
            try {
                JSONObject jSONObject = f44888e;
                String strOptString = null;
                if (jSONObject == null) {
                    fa4.m11636J("rules");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    Map map = f44885b;
                    if (map == null) {
                        fa4.m11636J("languageInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Map map2 = f44886c;
                        if (map2 == null) {
                            fa4.m11636J("eventInfo");
                            throw null;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map2.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            Map map3 = f44887d;
                            if (map3 == null) {
                                fa4.m11636J("textTypeInfo");
                                throw null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) map3.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return m14261q(strOptString, str3);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m14263s(float[] fArr, float[] fArr2) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = fArr[i] + fArr2[i];
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m14264t(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint", "");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    jSONObject2.getClass();
                    m14264t(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
