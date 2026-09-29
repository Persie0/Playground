package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.navigation.fragment.NavHostFragment;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3584sr;
import p000.bk1;
import p000.ct5;
import p000.dk1;
import p000.e5b;
import p000.l87;
import p000.qm9;
import p000.u64;
import p000.vi3;
import p000.x17;
import p000.xc9;
import p000.xp7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b34 {

    /* JADX INFO: renamed from: a */
    public static final z04 f7840a = new z04(false);

    /* JADX INFO: renamed from: b */
    public static final C3835zj f7841b = new C3835zj(9);

    /* JADX INFO: renamed from: c */
    public static final byte[] f7842c = {48, 49, 53, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f7843d = {48, 49, 48, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f7844e = {48, 48, 57, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f7845f = {48, 48, 53, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f7846g = {48, 48, 49, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f7847h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f7848i = {48, 48, 50, 0};

    /* JADX INFO: renamed from: j */
    public static final Object f7849j = new Object();

    /* JADX INFO: renamed from: k */
    public static final Object f7850k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Object f7851l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f7852m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f7853n = new Object();

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f7854o = 0;

    /* JADX INFO: renamed from: p */
    public static Boolean f7855p;

    /* JADX INFO: renamed from: q */
    public static Boolean f7856q;

    /* JADX INFO: renamed from: r */
    public static Boolean f7857r;

    /* JADX INFO: renamed from: s */
    public static Boolean f7858s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f7859t = 0;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f7860u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f7861v = 0;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f7862w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f7863x = 0;

    /* JADX INFO: renamed from: A */
    public static String[] m3206A(ff4 ff4Var) {
        String strM3217L;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ef4 ef4Var = (ef4) ff4Var;
            if (i >= ef4Var.m11093f()) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            synchronized (ef4Var) {
                strM3217L = m3217L(ef4Var.m11089a(i));
                if (strM3217L == null) {
                    strM3217L = null;
                }
            }
            if (strM3217L != null) {
                arrayList.add(strM3217L);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m3207B(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM17742q = AbstractC3393o1.m17742q("<", str2, " threw ");
                    sbM17742q.append(e.getClass().getName());
                    sbM17742q.append(">");
                    string = sbM17742q.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static final int m3208C(du4 du4Var, boolean z) {
        int iMo10675i;
        int iMo10667a;
        if (z) {
            iMo10675i = du4Var.mo10669c();
            iMo10667a = du4Var.mo10672f();
        } else {
            iMo10675i = du4Var.mo10675i();
            iMo10667a = du4Var.mo10667a();
        }
        return iMo10667a + iMo10675i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX INFO: renamed from: D */
    public static Boolean m3209D(Object obj, Boolean bool) {
        Boolean bool2;
        Number number;
        if (obj instanceof Boolean) {
            bool2 = (Boolean) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (Boolean.toString(true).equalsIgnoreCase(str) || Integer.toString(1).equalsIgnoreCase(str)) {
                bool2 = Boolean.TRUE;
            } else if (Boolean.toString(false).equalsIgnoreCase(str) || Integer.toString(0).equalsIgnoreCase(str)) {
                bool2 = Boolean.FALSE;
            } else if (obj instanceof Number) {
                number = (Number) obj;
                if (1 == number.intValue()) {
                    bool2 = Boolean.TRUE;
                } else if (number.intValue() == 0) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = null;
                }
            } else {
                bool2 = null;
            }
        } else if (obj instanceof Number) {
            number = (Number) obj;
            if (1 == number.intValue()) {
                bool2 = Boolean.TRUE;
            } else if (number.intValue() == 0) {
                bool2 = Boolean.FALSE;
            } else {
                bool2 = null;
            }
        } else {
            bool2 = null;
        }
        return bool2 != null ? bool2 : bool;
    }

    /* JADX INFO: renamed from: E */
    public static Double m3210E(Object obj, Double d) {
        Double dValueOf;
        if (obj instanceof Double) {
            dValueOf = (Double) obj;
        } else if (obj instanceof Number) {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            try {
                dValueOf = Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
                dValueOf = null;
            }
        } else {
            dValueOf = null;
        }
        return dValueOf != null ? dValueOf : d;
    }

    /* JADX INFO: renamed from: F */
    public static Integer m3211F(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static ff4 m3212G(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ff4) {
            return (ff4) obj;
        }
        if (obj instanceof JSONArray) {
            return new ef4((JSONArray) obj);
        }
        try {
            if (obj instanceof Collection) {
                return new ef4(new JSONArray((Collection) obj));
            }
            if (obj instanceof String) {
                return new ef4(new JSONArray((String) obj));
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray = new JSONArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    jSONArray.put(Array.get(obj, i));
                }
                return new ef4(jSONArray);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: H */
    public static ff4 m3213H(Object obj, boolean z) {
        ff4 ff4VarM3212G = m3212G(obj);
        return (ff4VarM3212G == null && z) ? ef4.m11088d() : ff4VarM3212G;
    }

    /* JADX INFO: renamed from: I */
    public static eg4 m3214I(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof eg4) {
            return (eg4) obj;
        }
        if (obj instanceof JSONObject) {
            return new dg4((JSONObject) obj);
        }
        try {
            if (obj instanceof String) {
                return new dg4(new JSONObject((String) obj));
            }
            if (obj instanceof Map) {
                return new dg4(new JSONObject((Map) obj));
            }
            if (obj instanceof Bundle) {
                return new dg4(new JSONObject(m3237e((Bundle) obj)));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static eg4 m3215J(Object obj, boolean z) {
        eg4 eg4VarM3214I = m3214I(obj);
        return (eg4VarM3214I == null && z) ? dg4.m10328c() : eg4VarM3214I;
    }

    /* JADX INFO: renamed from: K */
    public static Long m3216K(Object obj, Long l) {
        Long lValueOf;
        if (obj instanceof Number) {
            lValueOf = Long.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            try {
                lValueOf = Long.valueOf(Long.parseLong((String) obj));
            } catch (Throwable unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf : l;
    }

    /* JADX INFO: renamed from: L */
    public static String m3217L(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof eg4) || (obj instanceof ff4)) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static Uri m3218M(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static final JSONObject m3219N(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public static final String m3220O(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m3221Q(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX INFO: renamed from: S */
    public static bj8 m3222S(int i, en1 en1Var) {
        en1Var.getClass();
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = jna.f45883b / i;
            long jM14563c = jna.m14563c(1.0f, 2.0f * f * i3);
            fArr[i2] = do7.m10544t(jM14563c) + 0.0f;
            fArr[i2 + 1] = do7.m10545u(jM14563c) + 0.0f;
            long jM14563c2 = jna.m14563c(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = do7.m10544t(jM14563c2) + 0.0f;
            i2 += 4;
            fArr[i4] = do7.m10545u(jM14563c2) + 0.0f;
        }
        return pb1.m19036f(fArr, en1Var, null, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: T */
    public static ef4 m3223T(String[] strArr) {
        ef4 ef4VarM11088d = ef4.m11088d();
        for (String str : strArr) {
            if (str != null) {
                synchronized (ef4VarM11088d) {
                    ef4VarM11088d.m11090b(str);
                }
            }
        }
        return ef4VarM11088d;
    }

    /* JADX INFO: renamed from: U */
    public static ArrayList m3224U(List list) {
        ArrayList arrayList;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static final b90 m3225V(JSONObject jSONObject) throws JSONException {
        ny8 ny8VarM17753a;
        jSONObject.getClass();
        b90 b90Var = new b90();
        String string = jSONObject.getString("event_type");
        string.getClass();
        b90Var.f8137L = string;
        b90Var.f8142a = m3220O("user_id", jSONObject);
        b90Var.f8143b = m3220O("device_id", jSONObject);
        sc2 sc2VarM23933a = null;
        b90Var.f8144c = jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null;
        JSONObject jSONObjectM3219N = m3219N("event_properties", jSONObject);
        b90Var.f8138M = jSONObjectM3219N != null ? new LinkedHashMap(vz1.m23634h0(jSONObjectM3219N)) : null;
        JSONObject jSONObjectM3219N2 = m3219N("user_properties", jSONObject);
        b90Var.f8139N = jSONObjectM3219N2 != null ? new LinkedHashMap(vz1.m23634h0(jSONObjectM3219N2)) : null;
        JSONObject jSONObjectM3219N3 = m3219N("groups", jSONObject);
        b90Var.f8140O = jSONObjectM3219N3 != null ? new LinkedHashMap(vz1.m23634h0(jSONObjectM3219N3)) : null;
        JSONObject jSONObjectM3219N4 = m3219N("group_properties", jSONObject);
        b90Var.f8141P = jSONObjectM3219N4 != null ? new LinkedHashMap(vz1.m23634h0(jSONObjectM3219N4)) : null;
        b90Var.f8150i = m3220O("app_version", jSONObject);
        b90Var.f8152k = m3220O("platform", jSONObject);
        b90Var.f8153l = m3220O("os_name", jSONObject);
        b90Var.f8154m = m3220O("os_version", jSONObject);
        b90Var.f8155n = m3220O("device_brand", jSONObject);
        b90Var.f8156o = m3220O("device_manufacturer", jSONObject);
        b90Var.f8157p = m3220O("device_model", jSONObject);
        b90Var.f8158q = m3220O("carrier", jSONObject);
        b90Var.f8159r = m3220O("country", jSONObject);
        b90Var.f8160s = m3220O("region", jSONObject);
        b90Var.f8161t = m3220O("city", jSONObject);
        b90Var.f8162u = m3220O("dma", jSONObject);
        b90Var.f8126A = m3220O("language", jSONObject);
        b90Var.f8132G = jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null;
        b90Var.f8133H = jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null;
        b90Var.f8131F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        b90Var.f8134I = m3220O("productId", jSONObject);
        b90Var.f8135J = m3220O("revenueType", jSONObject);
        b90Var.f8148g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        b90Var.f8149h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        b90Var.f8128C = m3220O("ip", jSONObject);
        b90Var.f8163v = m3220O("idfa", jSONObject);
        b90Var.f8164w = m3220O("idfv", jSONObject);
        b90Var.f8165x = m3220O("adid", jSONObject);
        b90Var.f8167z = m3220O("android_id", jSONObject);
        b90Var.f8166y = jSONObject.optString("android_app_set_id", null);
        b90Var.f8145d = jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null;
        b90Var.f8146e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        b90Var.f8147f = m3220O("insert_id", jSONObject);
        b90Var.f8127B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        b90Var.f8136K = m3220O("partner_id", jSONObject);
        if (jSONObject.has("plan")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            jSONObject2.getClass();
            ny8VarM17753a = o1c.m17753a(jSONObject2);
        } else {
            ny8VarM17753a = null;
        }
        b90Var.f8129D = ny8VarM17753a;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            jSONObject3.getClass();
            sc2VarM23933a = wfd.m23933a(jSONObject3);
        }
        b90Var.f8130E = sc2VarM23933a;
        return b90Var;
    }

    /* JADX INFO: renamed from: W */
    public static final ArrayList m3226W(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = l70.m15922M(0, jSONArray.length()).iterator();
        while (((h84) it).f41941c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((a84) it).nextInt());
            jSONObject.getClass();
            arrayList.add(m3225V(jSONObject));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public static final int[] m3227X(JSONArray jSONArray) {
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: Y */
    public static final ArrayList m3228Y(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = l70.m15922M(0, jSONArray.length()).iterator();
        while (((h84) it).f41941c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((a84) it).nextInt());
            jSONObject.getClass();
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static String m3229Z(long j) {
        if (m3243i(j, 12884901888L)) {
            return "Rgb";
        }
        if (m3243i(j, 12884901889L)) {
            return "Xyz";
        }
        if (m3243i(j, 12884901890L)) {
            return "Lab";
        }
        return m3243i(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    /* JADX INFO: renamed from: a */
    public static final yr1 m3230a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new yr1(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    /* JADX INFO: renamed from: a0 */
    public static String m3231a0(int i, String str) {
        return str.length() > Math.max(0, i) ? str.substring(0, Math.max(0, i)) : str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x017c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01da  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    /* JADX INFO: renamed from: b */
    public static final void m3232b(e16 e16Var, zi3 zi3Var, zi3 zi3Var2, zi3 zi3Var3, zi3 zi3Var4, int i, long j, long j2, e5b e5bVar, final C0282a c0282a, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        zi3 zi3Var5;
        int i5;
        zi3 zi3Var6;
        int i6;
        int i7;
        zi3 zi3Var7;
        int i8;
        int i9;
        zi3 zi3Var8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        final e16 e16Var2;
        final e5b e5bVar2;
        final zi3 zi3Var9;
        final zi3 zi3Var10;
        final zi3 zi3Var11;
        final zi3 zi3Var12;
        final int i17;
        final long j3;
        final long j4;
        x18 x18VarM22143u;
        e16 e16Var3;
        zi3 zi3Var13;
        zi3 zi3Var14;
        zi3 zi3Var15;
        zi3 zi3Var16;
        long j5;
        long jM20489b;
        int i18;
        e16 e16Var4;
        e5b e5bVarM10543s;
        long j6;
        boolean zM22120g;
        Object objM22097O;
        z66 z66Var;
        boolean zM22120g2;
        Object objM22097O2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1211482744);
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i20 = i3 & 2;
        if (i20 == 0) {
            if ((i2 & 48) == 0) {
                zi3Var5 = zi3Var;
                i4 |= tj3Var.m22124i(zi3Var5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    zi3Var6 = zi3Var2;
                    if (tj3Var.m22124i(zi3Var6)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        zi3Var7 = zi3Var3;
                        if (tj3Var.m22124i(zi3Var7)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            zi3Var8 = zi3Var4;
                            if (tj3Var.m22124i(zi3Var8)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            i14 = i4 | 196608;
                            i12 = i;
                        } else {
                            i12 = i;
                            if (tj3Var.m22116e(i12)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i14 = i4 | i13;
                        }
                        if ((i3 & 64) == 0 || !tj3Var.m22118f(j)) {
                            i15 = 524288;
                        } else {
                            i15 = 1048576;
                        }
                        i16 = i14 | i15 | 37748736;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (tj3Var.m22099R(i16 & 1, z)) {
                            tj3Var.m22104W();
                            if ((i2 & 1) != 0 || tj3Var.m22084B()) {
                                if (i19 != 0) {
                                    e16Var3 = b16.f7762a;
                                } else {
                                    e16Var3 = e16Var;
                                }
                                if (i20 != 0) {
                                    zi3Var13 = pvc.f56872c;
                                } else {
                                    zi3Var13 = zi3Var5;
                                }
                                if (i5 != 0) {
                                    zi3Var14 = pvc.f56873d;
                                } else {
                                    zi3Var14 = zi3Var6;
                                }
                                if (i7 != 0) {
                                    zi3Var15 = pvc.f56874e;
                                } else {
                                    zi3Var15 = zi3Var7;
                                }
                                if (i9 != 0) {
                                    zi3Var16 = pvc.f56875f;
                                } else {
                                    zi3Var16 = zi3Var8;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                    i16 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jM20489b = ra1.m20489b(j5, tj3Var);
                                i18 = (-264241153) & i16;
                                e16Var4 = e16Var3;
                                e5bVarM10543s = do7.m10543s(tj3Var);
                                j6 = j5;
                            } else {
                                tj3Var.m22102U();
                                if ((i3 & 64) != 0) {
                                    i16 &= -3670017;
                                }
                                e16Var4 = e16Var;
                                j6 = j;
                                i18 = i16 & (-264241153);
                                zi3Var13 = zi3Var5;
                                zi3Var14 = zi3Var6;
                                zi3Var15 = zi3Var7;
                                zi3Var16 = zi3Var8;
                                jM20489b = j2;
                                e5bVarM10543s = e5bVar;
                            }
                            tj3Var.m22140r();
                            zM22120g = tj3Var.m22120g(e5bVarM10543s);
                            objM22097O = tj3Var.m22097O();
                            int i21 = i18;
                            p84 p84Var = we1.f66679a;
                            if (zM22120g || objM22097O == p84Var) {
                                objM22097O = new z66(e5bVarM10543s);
                                tj3Var.m22131l0(objM22097O);
                            }
                            z66Var = (z66) objM22097O;
                            zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                            long j7 = j6;
                            objM22097O2 = tj3Var.m22097O();
                            if (zM22120g2 || objM22097O2 == p84Var) {
                                objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            zi3 zi3Var17 = zi3Var13;
                            zi3 zi3Var18 = zi3Var14;
                            zi3 zi3Var19 = zi3Var15;
                            zi3 zi3Var20 = zi3Var16;
                            int i22 = i12;
                            long j8 = jM20489b;
                            ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j7, j8, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i22, zi3Var17, c0282a, zi3Var19, zi3Var20, z66Var, zi3Var18), tj3Var), tj3Var, ((i21 >> 12) & 896) | 12582912, 114);
                            j3 = j7;
                            e16Var2 = e16Var4;
                            zi3Var9 = zi3Var17;
                            zi3Var10 = zi3Var18;
                            i17 = i22;
                            e5bVar2 = e5bVarM10543s;
                            j4 = j8;
                            zi3Var11 = zi3Var19;
                            zi3Var12 = zi3Var20;
                        } else {
                            tj3Var.m22102U();
                            e16Var2 = e16Var;
                            e5bVar2 = e5bVar;
                            zi3Var9 = zi3Var5;
                            zi3Var10 = zi3Var6;
                            zi3Var11 = zi3Var7;
                            zi3Var12 = zi3Var8;
                            i17 = i12;
                            j3 = j;
                            j4 = j2;
                        }
                        x18VarM22143u = tj3Var.m22143u();
                        if (x18VarM22143u != null) {
                            x18VarM22143u.f67642d = new zi3() { // from class: gm8
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i2 | 1);
                                    b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                                    return xfa.f68157a;
                                }
                            };
                        }
                    }
                    i4 |= 24576;
                    zi3Var8 = zi3Var4;
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i14 = i4 | 196608;
                        i12 = i;
                    } else {
                        i12 = i;
                        if (tj3Var.m22116e(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i14 = i4 | i13;
                    }
                    if ((i3 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i16 = i14 | i15 | 37748736;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i16 & 1, z)) {
                        tj3Var.m22104W();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        } else {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        }
                        tj3Var.m22140r();
                        zM22120g = tj3Var.m22120g(e5bVarM10543s);
                        objM22097O = tj3Var.m22097O();
                        int i23 = i18;
                        p84 p84Var2 = we1.f66679a;
                        if (zM22120g) {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        }
                        z66Var = (z66) objM22097O;
                        zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                        long j9 = j6;
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2) {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        zi3 zi3Var110 = zi3Var13;
                        zi3 zi3Var111 = zi3Var14;
                        zi3 zi3Var112 = zi3Var15;
                        zi3 zi3Var21 = zi3Var16;
                        int i24 = i12;
                        long j10 = jM20489b;
                        ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j9, j10, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i24, zi3Var110, c0282a, zi3Var112, zi3Var21, z66Var, zi3Var111), tj3Var), tj3Var, ((i23 >> 12) & 896) | 12582912, 114);
                        j3 = j9;
                        e16Var2 = e16Var4;
                        zi3Var9 = zi3Var110;
                        zi3Var10 = zi3Var111;
                        i17 = i24;
                        e5bVar2 = e5bVarM10543s;
                        j4 = j10;
                        zi3Var11 = zi3Var112;
                        zi3Var12 = zi3Var21;
                    } else {
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        e5bVar2 = e5bVar;
                        zi3Var9 = zi3Var5;
                        zi3Var10 = zi3Var6;
                        zi3Var11 = zi3Var7;
                        zi3Var12 = zi3Var8;
                        i17 = i12;
                        j3 = j;
                        j4 = j2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: gm8
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i2 | 1);
                                b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i4 |= 3072;
                zi3Var7 = zi3Var3;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        zi3Var8 = zi3Var4;
                        if (tj3Var.m22124i(zi3Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i14 = i4 | 196608;
                        i12 = i;
                    } else {
                        i12 = i;
                        if (tj3Var.m22116e(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i14 = i4 | i13;
                    }
                    if ((i3 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i16 = i14 | i15 | 37748736;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i16 & 1, z)) {
                        tj3Var.m22104W();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        } else {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        }
                        tj3Var.m22140r();
                        zM22120g = tj3Var.m22120g(e5bVarM10543s);
                        objM22097O = tj3Var.m22097O();
                        int i25 = i18;
                        p84 p84Var3 = we1.f66679a;
                        if (zM22120g) {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        }
                        z66Var = (z66) objM22097O;
                        zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                        long j11 = j6;
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2) {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        zi3 zi3Var113 = zi3Var13;
                        zi3 zi3Var114 = zi3Var14;
                        zi3 zi3Var115 = zi3Var15;
                        zi3 zi3Var22 = zi3Var16;
                        int i26 = i12;
                        long j12 = jM20489b;
                        ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j11, j12, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i26, zi3Var113, c0282a, zi3Var115, zi3Var22, z66Var, zi3Var114), tj3Var), tj3Var, ((i25 >> 12) & 896) | 12582912, 114);
                        j3 = j11;
                        e16Var2 = e16Var4;
                        zi3Var9 = zi3Var113;
                        zi3Var10 = zi3Var114;
                        i17 = i26;
                        e5bVar2 = e5bVarM10543s;
                        j4 = j12;
                        zi3Var11 = zi3Var115;
                        zi3Var12 = zi3Var22;
                    } else {
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        e5bVar2 = e5bVar;
                        zi3Var9 = zi3Var5;
                        zi3Var10 = zi3Var6;
                        zi3Var11 = zi3Var7;
                        zi3Var12 = zi3Var8;
                        i17 = i12;
                        j3 = j;
                        j4 = j2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: gm8
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i2 | 1);
                                b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                zi3Var8 = zi3Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i27 = i18;
                    p84 p84Var4 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j13 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var116 = zi3Var13;
                    zi3 zi3Var117 = zi3Var14;
                    zi3 zi3Var118 = zi3Var15;
                    zi3 zi3Var23 = zi3Var16;
                    int i28 = i12;
                    long j14 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j13, j14, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i28, zi3Var116, c0282a, zi3Var118, zi3Var23, z66Var, zi3Var117), tj3Var), tj3Var, ((i27 >> 12) & 896) | 12582912, 114);
                    j3 = j13;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var116;
                    zi3Var10 = zi3Var117;
                    i17 = i28;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j14;
                    zi3Var11 = zi3Var118;
                    zi3Var12 = zi3Var23;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 384;
            zi3Var6 = zi3Var2;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    zi3Var7 = zi3Var3;
                    if (tj3Var.m22124i(zi3Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        zi3Var8 = zi3Var4;
                        if (tj3Var.m22124i(zi3Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i14 = i4 | 196608;
                        i12 = i;
                    } else {
                        i12 = i;
                        if (tj3Var.m22116e(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i14 = i4 | i13;
                    }
                    if ((i3 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i16 = i14 | i15 | 37748736;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i16 & 1, z)) {
                        tj3Var.m22104W();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        } else {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        }
                        tj3Var.m22140r();
                        zM22120g = tj3Var.m22120g(e5bVarM10543s);
                        objM22097O = tj3Var.m22097O();
                        int i29 = i18;
                        p84 p84Var5 = we1.f66679a;
                        if (zM22120g) {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        }
                        z66Var = (z66) objM22097O;
                        zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                        long j15 = j6;
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2) {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        zi3 zi3Var119 = zi3Var13;
                        zi3 zi3Var1110 = zi3Var14;
                        zi3 zi3Var1111 = zi3Var15;
                        zi3 zi3Var24 = zi3Var16;
                        int i210 = i12;
                        long j16 = jM20489b;
                        ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j15, j16, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i210, zi3Var119, c0282a, zi3Var1111, zi3Var24, z66Var, zi3Var1110), tj3Var), tj3Var, ((i29 >> 12) & 896) | 12582912, 114);
                        j3 = j15;
                        e16Var2 = e16Var4;
                        zi3Var9 = zi3Var119;
                        zi3Var10 = zi3Var1110;
                        i17 = i210;
                        e5bVar2 = e5bVarM10543s;
                        j4 = j16;
                        zi3Var11 = zi3Var1111;
                        zi3Var12 = zi3Var24;
                    } else {
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        e5bVar2 = e5bVar;
                        zi3Var9 = zi3Var5;
                        zi3Var10 = zi3Var6;
                        zi3Var11 = zi3Var7;
                        zi3Var12 = zi3Var8;
                        i17 = i12;
                        j3 = j;
                        j4 = j2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: gm8
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i2 | 1);
                                b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                zi3Var8 = zi3Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i211 = i18;
                    p84 p84Var6 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j17 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var1112 = zi3Var13;
                    zi3 zi3Var1113 = zi3Var14;
                    zi3 zi3Var1114 = zi3Var15;
                    zi3 zi3Var25 = zi3Var16;
                    int i212 = i12;
                    long j18 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j17, j18, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i212, zi3Var1112, c0282a, zi3Var1114, zi3Var25, z66Var, zi3Var1113), tj3Var), tj3Var, ((i211 >> 12) & 896) | 12582912, 114);
                    j3 = j17;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var1112;
                    zi3Var10 = zi3Var1113;
                    i17 = i212;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j18;
                    zi3Var11 = zi3Var1114;
                    zi3Var12 = zi3Var25;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 3072;
            zi3Var7 = zi3Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    zi3Var8 = zi3Var4;
                    if (tj3Var.m22124i(zi3Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i213 = i18;
                    p84 p84Var7 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j19 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var1115 = zi3Var13;
                    zi3 zi3Var1116 = zi3Var14;
                    zi3 zi3Var1117 = zi3Var15;
                    zi3 zi3Var26 = zi3Var16;
                    int i214 = i12;
                    long j110 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j19, j110, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i214, zi3Var1115, c0282a, zi3Var1117, zi3Var26, z66Var, zi3Var1116), tj3Var), tj3Var, ((i213 >> 12) & 896) | 12582912, 114);
                    j3 = j19;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var1115;
                    zi3Var10 = zi3Var1116;
                    i17 = i214;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j110;
                    zi3Var11 = zi3Var1117;
                    zi3Var12 = zi3Var26;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 24576;
            zi3Var8 = zi3Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i14 = i4 | 196608;
                i12 = i;
            } else {
                i12 = i;
                if (tj3Var.m22116e(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 = i4 | i13;
            }
            if ((i3 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i16 = i14 | i15 | 37748736;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i16 & 1, z)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                } else {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                }
                tj3Var.m22140r();
                zM22120g = tj3Var.m22120g(e5bVarM10543s);
                objM22097O = tj3Var.m22097O();
                int i215 = i18;
                p84 p84Var8 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                }
                z66Var = (z66) objM22097O;
                zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                long j111 = j6;
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g2) {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3 zi3Var1118 = zi3Var13;
                zi3 zi3Var1119 = zi3Var14;
                zi3 zi3Var11110 = zi3Var15;
                zi3 zi3Var27 = zi3Var16;
                int i216 = i12;
                long j112 = jM20489b;
                ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j111, j112, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i216, zi3Var1118, c0282a, zi3Var11110, zi3Var27, z66Var, zi3Var1119), tj3Var), tj3Var, ((i215 >> 12) & 896) | 12582912, 114);
                j3 = j111;
                e16Var2 = e16Var4;
                zi3Var9 = zi3Var1118;
                zi3Var10 = zi3Var1119;
                i17 = i216;
                e5bVar2 = e5bVarM10543s;
                j4 = j112;
                zi3Var11 = zi3Var11110;
                zi3Var12 = zi3Var27;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                e5bVar2 = e5bVar;
                zi3Var9 = zi3Var5;
                zi3Var10 = zi3Var6;
                zi3Var11 = zi3Var7;
                zi3Var12 = zi3Var8;
                i17 = i12;
                j3 = j;
                j4 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: gm8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 48;
        zi3Var5 = zi3Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                zi3Var6 = zi3Var2;
                if (tj3Var.m22124i(zi3Var6)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    zi3Var7 = zi3Var3;
                    if (tj3Var.m22124i(zi3Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        zi3Var8 = zi3Var4;
                        if (tj3Var.m22124i(zi3Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i14 = i4 | 196608;
                        i12 = i;
                    } else {
                        i12 = i;
                        if (tj3Var.m22116e(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i14 = i4 | i13;
                    }
                    if ((i3 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i16 = i14 | i15 | 37748736;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i16 & 1, z)) {
                        tj3Var.m22104W();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        } else {
                            if (i19 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if (i20 != 0) {
                                zi3Var13 = pvc.f56872c;
                            } else {
                                zi3Var13 = zi3Var5;
                            }
                            if (i5 != 0) {
                                zi3Var14 = pvc.f56873d;
                            } else {
                                zi3Var14 = zi3Var6;
                            }
                            if (i7 != 0) {
                                zi3Var15 = pvc.f56874e;
                            } else {
                                zi3Var15 = zi3Var7;
                            }
                            if (i9 != 0) {
                                zi3Var16 = pvc.f56875f;
                            } else {
                                zi3Var16 = zi3Var8;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                                i16 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jM20489b = ra1.m20489b(j5, tj3Var);
                            i18 = (-264241153) & i16;
                            e16Var4 = e16Var3;
                            e5bVarM10543s = do7.m10543s(tj3Var);
                            j6 = j5;
                        }
                        tj3Var.m22140r();
                        zM22120g = tj3Var.m22120g(e5bVarM10543s);
                        objM22097O = tj3Var.m22097O();
                        int i217 = i18;
                        p84 p84Var9 = we1.f66679a;
                        if (zM22120g) {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new z66(e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O);
                        }
                        z66Var = (z66) objM22097O;
                        zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                        long j113 = j6;
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2) {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        } else {
                            objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        zi3 zi3Var11111 = zi3Var13;
                        zi3 zi3Var11112 = zi3Var14;
                        zi3 zi3Var11113 = zi3Var15;
                        zi3 zi3Var28 = zi3Var16;
                        int i218 = i12;
                        long j114 = jM20489b;
                        ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j113, j114, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i218, zi3Var11111, c0282a, zi3Var11113, zi3Var28, z66Var, zi3Var11112), tj3Var), tj3Var, ((i217 >> 12) & 896) | 12582912, 114);
                        j3 = j113;
                        e16Var2 = e16Var4;
                        zi3Var9 = zi3Var11111;
                        zi3Var10 = zi3Var11112;
                        i17 = i218;
                        e5bVar2 = e5bVarM10543s;
                        j4 = j114;
                        zi3Var11 = zi3Var11113;
                        zi3Var12 = zi3Var28;
                    } else {
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        e5bVar2 = e5bVar;
                        zi3Var9 = zi3Var5;
                        zi3Var10 = zi3Var6;
                        zi3Var11 = zi3Var7;
                        zi3Var12 = zi3Var8;
                        i17 = i12;
                        j3 = j;
                        j4 = j2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: gm8
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i2 | 1);
                                b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                zi3Var8 = zi3Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i219 = i18;
                    p84 p84Var10 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j115 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var11114 = zi3Var13;
                    zi3 zi3Var11115 = zi3Var14;
                    zi3 zi3Var11116 = zi3Var15;
                    zi3 zi3Var29 = zi3Var16;
                    int i2110 = i12;
                    long j116 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j115, j116, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i2110, zi3Var11114, c0282a, zi3Var11116, zi3Var29, z66Var, zi3Var11115), tj3Var), tj3Var, ((i219 >> 12) & 896) | 12582912, 114);
                    j3 = j115;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var11114;
                    zi3Var10 = zi3Var11115;
                    i17 = i2110;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j116;
                    zi3Var11 = zi3Var11116;
                    zi3Var12 = zi3Var29;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 3072;
            zi3Var7 = zi3Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    zi3Var8 = zi3Var4;
                    if (tj3Var.m22124i(zi3Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i2111 = i18;
                    p84 p84Var11 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j117 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var11117 = zi3Var13;
                    zi3 zi3Var11118 = zi3Var14;
                    zi3 zi3Var11119 = zi3Var15;
                    zi3 zi3Var210 = zi3Var16;
                    int i2112 = i12;
                    long j118 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j117, j118, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i2112, zi3Var11117, c0282a, zi3Var11119, zi3Var210, z66Var, zi3Var11118), tj3Var), tj3Var, ((i2111 >> 12) & 896) | 12582912, 114);
                    j3 = j117;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var11117;
                    zi3Var10 = zi3Var11118;
                    i17 = i2112;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j118;
                    zi3Var11 = zi3Var11119;
                    zi3Var12 = zi3Var210;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 24576;
            zi3Var8 = zi3Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i14 = i4 | 196608;
                i12 = i;
            } else {
                i12 = i;
                if (tj3Var.m22116e(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 = i4 | i13;
            }
            if ((i3 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i16 = i14 | i15 | 37748736;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i16 & 1, z)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                } else {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                }
                tj3Var.m22140r();
                zM22120g = tj3Var.m22120g(e5bVarM10543s);
                objM22097O = tj3Var.m22097O();
                int i2113 = i18;
                p84 p84Var12 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                }
                z66Var = (z66) objM22097O;
                zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                long j119 = j6;
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g2) {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3 zi3Var111110 = zi3Var13;
                zi3 zi3Var111111 = zi3Var14;
                zi3 zi3Var111112 = zi3Var15;
                zi3 zi3Var211 = zi3Var16;
                int i2114 = i12;
                long j1110 = jM20489b;
                ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j119, j1110, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i2114, zi3Var111110, c0282a, zi3Var111112, zi3Var211, z66Var, zi3Var111111), tj3Var), tj3Var, ((i2113 >> 12) & 896) | 12582912, 114);
                j3 = j119;
                e16Var2 = e16Var4;
                zi3Var9 = zi3Var111110;
                zi3Var10 = zi3Var111111;
                i17 = i2114;
                e5bVar2 = e5bVarM10543s;
                j4 = j1110;
                zi3Var11 = zi3Var111112;
                zi3Var12 = zi3Var211;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                e5bVar2 = e5bVar;
                zi3Var9 = zi3Var5;
                zi3Var10 = zi3Var6;
                zi3Var11 = zi3Var7;
                zi3Var12 = zi3Var8;
                i17 = i12;
                j3 = j;
                j4 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: gm8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 384;
        zi3Var6 = zi3Var2;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                zi3Var7 = zi3Var3;
                if (tj3Var.m22124i(zi3Var7)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    zi3Var8 = zi3Var4;
                    if (tj3Var.m22124i(zi3Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i14 = i4 | 196608;
                    i12 = i;
                } else {
                    i12 = i;
                    if (tj3Var.m22116e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 = i4 | i13;
                }
                if ((i3 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i16 = i14 | i15 | 37748736;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i16 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    } else {
                        if (i19 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if (i20 != 0) {
                            zi3Var13 = pvc.f56872c;
                        } else {
                            zi3Var13 = zi3Var5;
                        }
                        if (i5 != 0) {
                            zi3Var14 = pvc.f56873d;
                        } else {
                            zi3Var14 = zi3Var6;
                        }
                        if (i7 != 0) {
                            zi3Var15 = pvc.f56874e;
                        } else {
                            zi3Var15 = zi3Var7;
                        }
                        if (i9 != 0) {
                            zi3Var16 = pvc.f56875f;
                        } else {
                            zi3Var16 = zi3Var8;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                            i16 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jM20489b = ra1.m20489b(j5, tj3Var);
                        i18 = (-264241153) & i16;
                        e16Var4 = e16Var3;
                        e5bVarM10543s = do7.m10543s(tj3Var);
                        j6 = j5;
                    }
                    tj3Var.m22140r();
                    zM22120g = tj3Var.m22120g(e5bVarM10543s);
                    objM22097O = tj3Var.m22097O();
                    int i2115 = i18;
                    p84 p84Var13 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new z66(e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O);
                    }
                    z66Var = (z66) objM22097O;
                    zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                    long j1111 = j6;
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2) {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var111113 = zi3Var13;
                    zi3 zi3Var111114 = zi3Var14;
                    zi3 zi3Var111115 = zi3Var15;
                    zi3 zi3Var212 = zi3Var16;
                    int i2116 = i12;
                    long j1112 = jM20489b;
                    ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j1111, j1112, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i2116, zi3Var111113, c0282a, zi3Var111115, zi3Var212, z66Var, zi3Var111114), tj3Var), tj3Var, ((i2115 >> 12) & 896) | 12582912, 114);
                    j3 = j1111;
                    e16Var2 = e16Var4;
                    zi3Var9 = zi3Var111113;
                    zi3Var10 = zi3Var111114;
                    i17 = i2116;
                    e5bVar2 = e5bVarM10543s;
                    j4 = j1112;
                    zi3Var11 = zi3Var111115;
                    zi3Var12 = zi3Var212;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    e5bVar2 = e5bVar;
                    zi3Var9 = zi3Var5;
                    zi3Var10 = zi3Var6;
                    zi3Var11 = zi3Var7;
                    zi3Var12 = zi3Var8;
                    i17 = i12;
                    j3 = j;
                    j4 = j2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: gm8
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 |= 24576;
            zi3Var8 = zi3Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i14 = i4 | 196608;
                i12 = i;
            } else {
                i12 = i;
                if (tj3Var.m22116e(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 = i4 | i13;
            }
            if ((i3 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i16 = i14 | i15 | 37748736;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i16 & 1, z)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                } else {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                }
                tj3Var.m22140r();
                zM22120g = tj3Var.m22120g(e5bVarM10543s);
                objM22097O = tj3Var.m22097O();
                int i2117 = i18;
                p84 p84Var14 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                }
                z66Var = (z66) objM22097O;
                zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                long j1113 = j6;
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g2) {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3 zi3Var111116 = zi3Var13;
                zi3 zi3Var111117 = zi3Var14;
                zi3 zi3Var111118 = zi3Var15;
                zi3 zi3Var213 = zi3Var16;
                int i2118 = i12;
                long j1114 = jM20489b;
                ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j1113, j1114, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i2118, zi3Var111116, c0282a, zi3Var111118, zi3Var213, z66Var, zi3Var111117), tj3Var), tj3Var, ((i2117 >> 12) & 896) | 12582912, 114);
                j3 = j1113;
                e16Var2 = e16Var4;
                zi3Var9 = zi3Var111116;
                zi3Var10 = zi3Var111117;
                i17 = i2118;
                e5bVar2 = e5bVarM10543s;
                j4 = j1114;
                zi3Var11 = zi3Var111118;
                zi3Var12 = zi3Var213;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                e5bVar2 = e5bVar;
                zi3Var9 = zi3Var5;
                zi3Var10 = zi3Var6;
                zi3Var11 = zi3Var7;
                zi3Var12 = zi3Var8;
                i17 = i12;
                j3 = j;
                j4 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: gm8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 3072;
        zi3Var7 = zi3Var3;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                zi3Var8 = zi3Var4;
                if (tj3Var.m22124i(zi3Var8)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i14 = i4 | 196608;
                i12 = i;
            } else {
                i12 = i;
                if (tj3Var.m22116e(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 = i4 | i13;
            }
            if ((i3 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i16 = i14 | i15 | 37748736;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i16 & 1, z)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                } else {
                    if (i19 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i20 != 0) {
                        zi3Var13 = pvc.f56872c;
                    } else {
                        zi3Var13 = zi3Var5;
                    }
                    if (i5 != 0) {
                        zi3Var14 = pvc.f56873d;
                    } else {
                        zi3Var14 = zi3Var6;
                    }
                    if (i7 != 0) {
                        zi3Var15 = pvc.f56874e;
                    } else {
                        zi3Var15 = zi3Var7;
                    }
                    if (i9 != 0) {
                        zi3Var16 = pvc.f56875f;
                    } else {
                        zi3Var16 = zi3Var8;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                        i16 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jM20489b = ra1.m20489b(j5, tj3Var);
                    i18 = (-264241153) & i16;
                    e16Var4 = e16Var3;
                    e5bVarM10543s = do7.m10543s(tj3Var);
                    j6 = j5;
                }
                tj3Var.m22140r();
                zM22120g = tj3Var.m22120g(e5bVarM10543s);
                objM22097O = tj3Var.m22097O();
                int i2119 = i18;
                p84 p84Var15 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new z66(e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O);
                }
                z66Var = (z66) objM22097O;
                zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
                long j1115 = j6;
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g2) {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3 zi3Var111119 = zi3Var13;
                zi3 zi3Var1111110 = zi3Var14;
                zi3 zi3Var1111111 = zi3Var15;
                zi3 zi3Var214 = zi3Var16;
                int i21110 = i12;
                long j1116 = jM20489b;
                ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j1115, j1116, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i21110, zi3Var111119, c0282a, zi3Var1111111, zi3Var214, z66Var, zi3Var1111110), tj3Var), tj3Var, ((i2119 >> 12) & 896) | 12582912, 114);
                j3 = j1115;
                e16Var2 = e16Var4;
                zi3Var9 = zi3Var111119;
                zi3Var10 = zi3Var1111110;
                i17 = i21110;
                e5bVar2 = e5bVarM10543s;
                j4 = j1116;
                zi3Var11 = zi3Var1111111;
                zi3Var12 = zi3Var214;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                e5bVar2 = e5bVar;
                zi3Var9 = zi3Var5;
                zi3Var10 = zi3Var6;
                zi3Var11 = zi3Var7;
                zi3Var12 = zi3Var8;
                i17 = i12;
                j3 = j;
                j4 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: gm8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 24576;
        zi3Var8 = zi3Var4;
        i11 = i3 & 32;
        if (i11 != 0) {
            i14 = i4 | 196608;
            i12 = i;
        } else {
            i12 = i;
            if (tj3Var.m22116e(i12)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i14 = i4 | i13;
        }
        if ((i3 & 64) == 0) {
            i15 = 524288;
        } else {
            i15 = 524288;
        }
        i16 = i14 | i15 | 37748736;
        if ((i16 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i16 & 1, z)) {
            tj3Var.m22104W();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var;
                }
                if (i20 != 0) {
                    zi3Var13 = pvc.f56872c;
                } else {
                    zi3Var13 = zi3Var5;
                }
                if (i5 != 0) {
                    zi3Var14 = pvc.f56873d;
                } else {
                    zi3Var14 = zi3Var6;
                }
                if (i7 != 0) {
                    zi3Var15 = pvc.f56874e;
                } else {
                    zi3Var15 = zi3Var7;
                }
                if (i9 != 0) {
                    zi3Var16 = pvc.f56875f;
                } else {
                    zi3Var16 = zi3Var8;
                }
                if (i11 != 0) {
                    i12 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                    i16 &= -3670017;
                } else {
                    j5 = j;
                }
                jM20489b = ra1.m20489b(j5, tj3Var);
                i18 = (-264241153) & i16;
                e16Var4 = e16Var3;
                e5bVarM10543s = do7.m10543s(tj3Var);
                j6 = j5;
            } else {
                if (i19 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var;
                }
                if (i20 != 0) {
                    zi3Var13 = pvc.f56872c;
                } else {
                    zi3Var13 = zi3Var5;
                }
                if (i5 != 0) {
                    zi3Var14 = pvc.f56873d;
                } else {
                    zi3Var14 = zi3Var6;
                }
                if (i7 != 0) {
                    zi3Var15 = pvc.f56874e;
                } else {
                    zi3Var15 = zi3Var7;
                }
                if (i9 != 0) {
                    zi3Var16 = pvc.f56875f;
                } else {
                    zi3Var16 = zi3Var8;
                }
                if (i11 != 0) {
                    i12 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n;
                    i16 &= -3670017;
                } else {
                    j5 = j;
                }
                jM20489b = ra1.m20489b(j5, tj3Var);
                i18 = (-264241153) & i16;
                e16Var4 = e16Var3;
                e5bVarM10543s = do7.m10543s(tj3Var);
                j6 = j5;
            }
            tj3Var.m22140r();
            zM22120g = tj3Var.m22120g(e5bVarM10543s);
            objM22097O = tj3Var.m22097O();
            int i21111 = i18;
            p84 p84Var16 = we1.f66679a;
            if (zM22120g) {
                objM22097O = new z66(e5bVarM10543s);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new z66(e5bVarM10543s);
                tj3Var.m22131l0(objM22097O);
            }
            z66Var = (z66) objM22097O;
            zM22120g2 = tj3Var.m22120g(z66Var) | tj3Var.m22120g(e5bVarM10543s);
            long j1117 = j6;
            objM22097O2 = tj3Var.m22097O();
            if (zM22120g2) {
                objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new ui5(13, z66Var, e5bVarM10543s);
                tj3Var.m22131l0(objM22097O2);
            }
            zi3 zi3Var1111112 = zi3Var13;
            zi3 zi3Var1111113 = zi3Var14;
            zi3 zi3Var1111114 = zi3Var15;
            zi3 zi3Var215 = zi3Var16;
            int i21112 = i12;
            long j1118 = jM20489b;
            ho9.m13414a(wfb.m23927v(e16Var4, (vi3) objM22097O2), null, j1117, j1118, 0.0f, 0.0f, null, ci8.m4703P(848889571, new id1(i21112, zi3Var1111112, c0282a, zi3Var1111114, zi3Var215, z66Var, zi3Var1111113), tj3Var), tj3Var, ((i21111 >> 12) & 896) | 12582912, 114);
            j3 = j1117;
            e16Var2 = e16Var4;
            zi3Var9 = zi3Var1111112;
            zi3Var10 = zi3Var1111113;
            i17 = i21112;
            e5bVar2 = e5bVarM10543s;
            j4 = j1118;
            zi3Var11 = zi3Var1111114;
            zi3Var12 = zi3Var215;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            e5bVar2 = e5bVar;
            zi3Var9 = zi3Var5;
            zi3Var10 = zi3Var6;
            zi3Var11 = zi3Var7;
            zi3Var12 = zi3Var8;
            i17 = i12;
            j3 = j;
            j4 = j2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: gm8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    b34.m3232b(e16Var2, zi3Var9, zi3Var10, zi3Var11, zi3Var12, i17, j3, j4, e5bVar2, c0282a, (ye1) obj, iM19383z, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static Object m3233b0(Object obj) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (obj instanceof eg4) {
            dg4 dg4Var = (dg4) ((eg4) obj);
            synchronized (dg4Var) {
                jSONObject = dg4Var.f35593a;
            }
            return jSONObject;
        }
        if (!(obj instanceof ff4)) {
            return obj;
        }
        ef4 ef4Var = (ef4) ((ff4) obj);
        synchronized (ef4Var) {
            jSONArray = ef4Var.f37181a;
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: c */
    public static final void m3234c(final int i, final zi3 zi3Var, C0282a c0282a, final zi3 zi3Var2, final zi3 zi3Var3, final e5b e5bVar, final zi3 zi3Var4, ye1 ye1Var, int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-280287501);
        int i4 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22124i(zi3Var) ? 32 : 16) | (tj3Var.m22124i(c0282a) ? 256 : 128) | (tj3Var.m22124i(zi3Var2) ? 2048 : 1024) | (tj3Var.m22124i(zi3Var3) ? 16384 : 8192) | (tj3Var.m22120g(e5bVar) ? 131072 : 65536) | (tj3Var.m22124i(zi3Var4) ? 1048576 : 524288);
        if (tj3Var.m22099R(i4 & 1, (599187 & i4) != 599186)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new im8();
                tj3Var.m22131l0(objM22097O);
            }
            final im8 im8Var = (im8) objM22097O;
            boolean z = (i4 & 896) == 256;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new C0282a(-1776388365, true, new C3794yf(18, c0282a, im8Var));
                tj3Var.m22131l0(objM22097O2);
            }
            final zi3 zi3Var5 = (zi3) objM22097O2;
            boolean zM22120g = ((i4 & 3670016) == 1048576) | ((458752 & i4) == 131072) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | tj3Var.m22120g(zi3Var5);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                i3 = 0;
                zi3 zi3Var6 = new zi3() { // from class: androidx.compose.material3.x
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        int i5;
                        Object obj4;
                        Object obj5;
                        final xp7 xp7Var;
                        Object obj6;
                        int i6;
                        final Integer numValueOf;
                        int iIntValue;
                        int iMo916w0;
                        int iMo4001c;
                        Object obj7;
                        Object obj8;
                        int iMo916w1;
                        int iMo916w2;
                        final qm9 qm9Var = (qm9) obj;
                        bk1 bk1Var = (bk1) obj2;
                        int iM3801i = bk1.m3801i(bk1Var.f8631a);
                        int iM3800h = bk1.m3800h(bk1Var.f8631a);
                        long jM3794b = bk1.m3794b(0, 0, 0, 0, 10, bk1Var.f8631a);
                        LayoutDirection layoutDirection = qm9Var.getLayoutDirection();
                        final e5b e5bVar2 = e5bVar;
                        int iMo4000b = e5bVar2.mo4000b(qm9Var, layoutDirection);
                        int iMo4002d = e5bVar2.mo4002d(qm9Var, qm9Var.getLayoutDirection());
                        int iMo4001c2 = e5bVar2.mo4001c(qm9Var);
                        List listMo20032J = qm9Var.mo20032J(ScaffoldLayoutContent.TopBar, zi3Var);
                        ArrayList arrayList = new ArrayList(listMo20032J.size());
                        int size = listMo20032J.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.add(((ct5) listMo20032J.get(i7)).mo1514r(jM3794b));
                        }
                        int i8 = 1;
                        if (!arrayList.isEmpty()) {
                            obj3 = arrayList.get(0);
                            int i9 = ((l87) obj3).f49302b;
                            int size2 = arrayList.size() - 1;
                            i5 = 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj9 = arrayList.get(i8);
                                    int i10 = ((l87) obj9).f49302b;
                                    if (i9 < i10) {
                                        i9 = i10;
                                        obj3 = obj9;
                                    }
                                    if (i8 == size2) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            i5 = 1;
                            obj3 = null;
                        }
                        l87 l87Var = (l87) obj3;
                        int i11 = l87Var != null ? l87Var.f49302b : 0;
                        List listMo20032J2 = qm9Var.mo20032J(ScaffoldLayoutContent.Snackbar, zi3Var2);
                        final ArrayList arrayList2 = new ArrayList(listMo20032J2.size());
                        int size3 = listMo20032J2.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            int i13 = iMo4002d;
                            arrayList2.add(((ct5) listMo20032J2.get(i12)).mo1514r(dk1.m10431i(jM3794b, (-iMo4000b) - i13, -iMo4001c2)));
                            i12++;
                            iM3801i = iM3801i;
                            iMo4002d = i13;
                            iM3800h = iM3800h;
                            arrayList = arrayList;
                        }
                        int i14 = iMo4002d;
                        final int i15 = iM3801i;
                        final int i16 = iM3800h;
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList2.get(0);
                            int i17 = ((l87) obj4).f49302b;
                            int size4 = arrayList2.size() - 1;
                            if (i5 <= size4) {
                                Object obj10 = obj4;
                                int i18 = i17;
                                int i19 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i19);
                                    int i20 = ((l87) obj11).f49302b;
                                    if (i18 < i20) {
                                        obj10 = obj11;
                                        i18 = i20;
                                    }
                                    if (i19 == size4) {
                                        break;
                                    }
                                    i19++;
                                }
                                obj4 = obj10;
                            }
                        }
                        l87 l87Var2 = (l87) obj4;
                        int i21 = l87Var2 != null ? l87Var2.f49302b : 0;
                        if (arrayList2.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList2.get(0);
                            int i22 = ((l87) obj5).f49301a;
                            int size5 = arrayList2.size() - 1;
                            if (1 <= size5) {
                                Object obj12 = obj5;
                                int i23 = i22;
                                int i24 = 1;
                                while (true) {
                                    Object obj13 = arrayList2.get(i24);
                                    int i25 = ((l87) obj13).f49301a;
                                    if (i23 < i25) {
                                        obj12 = obj13;
                                        i23 = i25;
                                    }
                                    if (i24 == size5) {
                                        break;
                                    }
                                    i24++;
                                }
                                obj5 = obj12;
                            }
                        }
                        l87 l87Var3 = (l87) obj5;
                        int i26 = l87Var3 != null ? l87Var3.f49301a : 0;
                        List listMo20032J3 = qm9Var.mo20032J(ScaffoldLayoutContent.Fab, zi3Var3);
                        final ArrayList arrayList4 = new ArrayList(listMo20032J3.size());
                        int size6 = listMo20032J3.size();
                        int i27 = 0;
                        while (i27 < size6) {
                            int i28 = i21;
                            int i29 = iMo4000b;
                            l87 l87VarMo1514r = ((ct5) listMo20032J3.get(i27)).mo1514r(dk1.m10431i(jM3794b, (-iMo4000b) - i14, -iMo4001c2));
                            if (l87VarMo1514r.f49302b == 0 || l87VarMo1514r.f49301a == 0) {
                                l87VarMo1514r = null;
                            }
                            if (l87VarMo1514r != null) {
                                arrayList4.add(l87VarMo1514r);
                            }
                            i27++;
                            i21 = i28;
                            iMo4000b = i29;
                        }
                        int i30 = iMo4000b;
                        int i31 = i21;
                        boolean zIsEmpty = arrayList4.isEmpty();
                        int i32 = i;
                        if (zIsEmpty) {
                            xp7Var = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i33 = ((l87) obj7).f49301a;
                                int size7 = arrayList4.size() - 1;
                                if (1 <= size7) {
                                    Object obj14 = obj7;
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i35);
                                        int i36 = ((l87) obj15).f49301a;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj14 = obj15;
                                        }
                                        if (i35 == size7) {
                                            break;
                                        }
                                        i35++;
                                    }
                                    obj7 = obj14;
                                }
                            }
                            obj7.getClass();
                            int i37 = ((l87) obj7).f49301a;
                            if (arrayList4.isEmpty()) {
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i38 = ((l87) obj8).f49302b;
                                int size8 = arrayList4.size() - 1;
                                if (1 <= size8) {
                                    Object obj16 = obj8;
                                    int i39 = i38;
                                    int i40 = 1;
                                    while (true) {
                                        Object obj17 = arrayList4.get(i40);
                                        int i41 = ((l87) obj17).f49302b;
                                        if (i39 < i41) {
                                            i39 = i41;
                                            obj16 = obj17;
                                        }
                                        if (i40 == size8) {
                                            break;
                                        }
                                        i40++;
                                    }
                                    obj8 = obj16;
                                }
                            }
                            obj8.getClass();
                            int i42 = ((l87) obj8).f49302b;
                            if (i32 == 0) {
                                if (qm9Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo916w1 = qm9Var.mo916w0(16.0f);
                                    iMo916w2 = iMo916w1 + i30;
                                } else {
                                    iMo916w2 = ((i15 - qm9Var.mo916w0(16.0f)) - i37) - i14;
                                }
                            } else if (i32 != 2 && i32 != 3) {
                                iMo916w2 = (((i15 - i37) + i30) - i14) / 2;
                            } else if (qm9Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                iMo916w2 = ((i15 - qm9Var.mo916w0(16.0f)) - i37) - i14;
                            } else {
                                iMo916w1 = qm9Var.mo916w0(16.0f);
                                iMo916w2 = iMo916w1 + i30;
                            }
                            xp7Var = new xp7(iMo916w2, i42, 1);
                        }
                        List listMo20032J4 = qm9Var.mo20032J(ScaffoldLayoutContent.BottomBar, zi3Var4);
                        final ArrayList arrayList5 = new ArrayList(listMo20032J4.size());
                        int size9 = listMo20032J4.size();
                        for (int i43 = 0; i43 < size9; i43++) {
                            arrayList5.add(((ct5) listMo20032J4.get(i43)).mo1514r(jM3794b));
                        }
                        if (arrayList5.isEmpty()) {
                            i6 = i26;
                            obj6 = null;
                        } else {
                            obj6 = arrayList5.get(0);
                            int i44 = ((l87) obj6).f49302b;
                            int size10 = arrayList5.size() - 1;
                            if (1 <= size10) {
                                int i45 = 1;
                                int i46 = i44;
                                while (true) {
                                    Object obj18 = arrayList5.get(i45);
                                    i6 = i26;
                                    int i47 = ((l87) obj18).f49302b;
                                    if (i46 < i47) {
                                        i46 = i47;
                                        obj6 = obj18;
                                    }
                                    if (i45 == size10) {
                                        break;
                                    }
                                    i45++;
                                    i26 = i6;
                                }
                            } else {
                                i6 = i26;
                            }
                        }
                        l87 l87Var4 = (l87) obj6;
                        final Integer numValueOf2 = l87Var4 != null ? Integer.valueOf(l87Var4.f49302b) : null;
                        if (xp7Var != null) {
                            int i48 = xp7Var.f68499c;
                            if (numValueOf2 == null || i32 == 3) {
                                iMo916w0 = qm9Var.mo916w0(16.0f) + i48;
                                iMo4001c = e5bVar2.mo4001c(qm9Var);
                            } else {
                                iMo916w0 = numValueOf2.intValue() + i48;
                                iMo4001c = qm9Var.mo916w0(16.0f);
                            }
                            numValueOf = Integer.valueOf(iMo4001c + iMo916w0);
                        } else {
                            numValueOf = null;
                        }
                        if (i31 != 0) {
                            iIntValue = i31 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : e5bVar2.mo4001c(qm9Var));
                        } else {
                            iIntValue = 0;
                        }
                        u64 u64Var = new u64(e5bVar2, qm9Var);
                        final int i49 = iIntValue;
                        ((xc9) im8Var.f44293a).setValue(new x17(AbstractC3584sr.m21643u(u64Var, qm9Var.getLayoutDirection()), arrayList3.isEmpty() ? u64Var.mo14021d() : qm9Var.mo905T(i11), AbstractC3584sr.m21642t(u64Var, qm9Var.getLayoutDirection()), numValueOf2 != null ? qm9Var.mo905T(numValueOf2.intValue()) : u64Var.mo14018a()));
                        List listMo20032J5 = qm9Var.mo20032J(ScaffoldLayoutContent.MainContent, zi3Var5);
                        final ArrayList arrayList6 = new ArrayList(listMo20032J5.size());
                        int size11 = listMo20032J5.size();
                        for (int i50 = 0; i50 < size11; i50++) {
                            arrayList6.add(((ct5) listMo20032J5.get(i50)).mo1514r(jM3794b));
                        }
                        final int i51 = i6;
                        return qm9Var.mo9895M0(i15, i16, AbstractC3194a.m15360M(), new vi3() { // from class: hm8
                            @Override // p000.vi3
                            public final Object invoke(Object obj19) {
                                int i52;
                                AbstractC0343j abstractC0343j = (AbstractC0343j) obj19;
                                ArrayList arrayList7 = arrayList6;
                                int size12 = arrayList7.size();
                                for (int i53 = 0; i53 < size12; i53++) {
                                    abstractC0343j.m1530f((l87) arrayList7.get(i53), 0, 0, 0.0f);
                                }
                                ArrayList arrayList8 = arrayList3;
                                int size13 = arrayList8.size();
                                for (int i54 = 0; i54 < size13; i54++) {
                                    abstractC0343j.m1530f((l87) arrayList8.get(i54), 0, 0, 0.0f);
                                }
                                ArrayList arrayList9 = arrayList2;
                                int size14 = arrayList9.size();
                                int i55 = 0;
                                while (true) {
                                    i52 = i16;
                                    if (i55 >= size14) {
                                        break;
                                    }
                                    l87 l87Var5 = (l87) arrayList9.get(i55);
                                    int i56 = i15 - i51;
                                    qm9 qm9Var2 = qm9Var;
                                    LayoutDirection layoutDirection2 = qm9Var2.getLayoutDirection();
                                    e5b e5bVar3 = e5bVar2;
                                    abstractC0343j.m1530f(l87Var5, ((e5bVar3.mo4000b(qm9Var2, layoutDirection2) + i56) - e5bVar3.mo4002d(qm9Var2, qm9Var2.getLayoutDirection())) / 2, i52 - i49, 0.0f);
                                    i55++;
                                }
                                ArrayList arrayList10 = arrayList5;
                                int size15 = arrayList10.size();
                                for (int i57 = 0; i57 < size15; i57++) {
                                    l87 l87Var6 = (l87) arrayList10.get(i57);
                                    Integer num = numValueOf2;
                                    abstractC0343j.m1530f(l87Var6, 0, i52 - (num != null ? num.intValue() : 0), 0.0f);
                                }
                                xp7 xp7Var2 = xp7Var;
                                if (xp7Var2 != null) {
                                    ArrayList arrayList11 = arrayList4;
                                    int size16 = arrayList11.size();
                                    for (int i58 = 0; i58 < size16; i58++) {
                                        l87 l87Var7 = (l87) arrayList11.get(i58);
                                        int i59 = xp7Var2.f68498b;
                                        Integer num2 = numValueOf;
                                        num2.getClass();
                                        abstractC0343j.m1530f(l87Var7, i59, i52 - num2.intValue(), 0.0f);
                                    }
                                }
                                return xfa.f68157a;
                            }
                        });
                    }
                };
                tj3Var.m22131l0(zi3Var6);
                objM22097O3 = zi3Var6;
            } else {
                i3 = 0;
            }
            AbstractC0337d.m1486a(null, (zi3) objM22097O3, tj3Var, i3, 1);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new id1(i, zi3Var, c0282a, zi3Var2, zi3Var3, e5bVar, zi3Var4, i2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final List m3235c0(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            du4 du4Var = (du4) arrayList.get(i3);
            int index = du4Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(du4Var);
            }
        }
        x91.m24414t0(arrayList2, f7841b);
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static e16 m3236d(e16 e16Var) {
        fg2 fg2Var = ci8.f10120d;
        float f = ci8.f10121e;
        return e16Var.mo3161g(new jq5(1200, fg2Var, 30.0f));
    }

    /* JADX INFO: renamed from: e */
    public static HashMap m3237e(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.put(str, m3237e((Bundle) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: e0 */
    public static Object m3238e0(Object obj) {
        if (obj instanceof JSONObject) {
            return new dg4((JSONObject) obj);
        }
        return obj instanceof JSONArray ? new ef4((JSONArray) obj) : obj;
    }

    /* JADX INFO: renamed from: f */
    public static void m3239f(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ij6.m13949f(i3, ux5.m22994q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C3386nv.m17626m(wq1.m24115k("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m3240f0(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public static bj8 m3241g(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float fCos = 1.0f / ((float) Math.cos(jna.f45883b / f));
        en1 en1Var = new en1(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jM10549y = do7.m10549y(jna.m14563c(fCos, (jna.f45883b / f) * 2.0f * i4), i73.m13710a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = do7.m10544t(jM10549y);
            i3 += 2;
            fArr[i5] = do7.m10545u(jM10549y);
        }
        return pb1.m19036f(fArr, en1Var, null, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public static final Set m3242h(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            jSONArray.getClass();
            for (int i : m3227X(jSONArray)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return u91.m22627s1(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3243i(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: j */
    public static final ud6 m3244j(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        Dialog dialogM3660f0;
        Window window;
        abstractComponentCallbacksC0635c.getClass();
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c; abstractComponentCallbacksC0635c2 != null; abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c2.f5677S) {
            if (abstractComponentCallbacksC0635c2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0635c2).m2573c0();
            }
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = abstractComponentCallbacksC0635c2.m2109k().f5723A;
            if (abstractComponentCallbacksC0635c3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0635c3).m2573c0();
            }
        }
        View view = abstractComponentCallbacksC0635c.f5692d0;
        if (view != null) {
            return xwc.m24782t(view);
        }
        be2 be2Var = abstractComponentCallbacksC0635c instanceof be2 ? (be2) abstractComponentCallbacksC0635c : null;
        View decorView = (be2Var == null || (dialogM3660f0 = be2Var.m3660f0()) == null || (window = dialogM3660f0.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return xwc.m24782t(decorView);
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " does not have a NavController set"));
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Charset m3245k() {
        return Charset.isSupported("UTF-8") ? Charset.forName("UTF-8") : Charset.defaultCharset();
    }

    /* JADX INFO: renamed from: l */
    public static final Class m3246l(String str) {
        if (lp1.f49971a.contains(b34.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            lp1.m16420a(b34.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Method m3247m(Class cls, String str, Class... clsArr) {
        if (!lp1.f49971a.contains(b34.class)) {
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                lp1.m16420a(b34.class, th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m3248o(String str, String str2, String... strArr) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        for (String str3 : strArr) {
            if (str3 != null) {
                return str3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final Method m3249p(Class cls, String str, Class... clsArr) {
        if (!lp1.f49971a.contains(b34.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                lp1.m16420a(b34.class, th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final t16 m3250q(kn1 kn1Var) {
        t16 t16Var = (t16) kn1Var.get(gz8.f41565f);
        if (t16Var != null) {
            return t16Var;
        }
        C3386nv.m17633t("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final String m3251r(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("error")) {
            return "";
        }
        String string = jSONObject.getString("error");
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m3252s(Class cls, Object obj, Method method, Object... objArr) {
        if (!lp1.f49971a.contains(b34.class)) {
            try {
                cls.getClass();
                method.getClass();
                if (obj != null) {
                    obj = cls.cast(obj);
                }
                try {
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            } catch (Throwable th) {
                lp1.m16420a(b34.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m3253t(String str, pj5 pj5Var) {
        Class<?> cls;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (pj5Var != null) {
                pj5Var.mo16256b("Class not available:" + str + ": " + e);
            }
            cls = null;
        } catch (UnsatisfiedLinkError e2) {
            if (pj5Var != null) {
                pj5Var.mo16255a("Failed to load (UnsatisfiedLinkError) " + str + ": " + e2);
            }
            cls = null;
        } catch (Throwable th) {
            if (pj5Var != null) {
                pj5Var.mo16255a("Failed to initialize " + str + ": " + th);
            }
            cls = null;
        }
        return cls != null;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m3254v(Object obj, Object obj2) {
        if (obj != null && obj == obj2) {
            return true;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Float) && (obj2 instanceof Float)) {
            return ((double) Math.abs(((Float) obj).floatValue() - ((Float) obj2).floatValue())) < 1.0E-4d;
        }
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return Math.abs(((Double) obj).doubleValue() - ((Double) obj2).doubleValue()) < 1.0E-6d;
        }
        if ((obj instanceof eg4) && (obj2 instanceof eg4)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof ff4) && (obj2 instanceof ff4)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof rf4) && (obj2 instanceof rf4)) {
            return obj.equals(obj2);
        }
        return (obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3255w(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m3256x(C0357g c0357g) {
        if (c0357g.f4348h == null) {
            return false;
        }
        C0357g c0357gM1610w = c0357g.m1610w();
        return (c0357gM1610w != null ? c0357gM1610w.f4348h : null) == null || c0357g.f4337b0.f58056b;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m3257y(Uri uri) {
        return (uri == null || Uri.EMPTY.equals(uri)) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m3258z(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f7855p == null) {
            f7855p = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f7855p.booleanValue();
        if (f7856q == null) {
            f7856q = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f7856q.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo3259P(boolean z);

    /* JADX INFO: renamed from: R */
    public abstract void mo3260R(boolean z);

    /* JADX INFO: renamed from: d0 */
    public abstract TransformationMethod mo3261d0(TransformationMethod transformationMethod);

    /* JADX INFO: renamed from: n */
    public abstract InputFilter[] mo3262n(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: u */
    public abstract boolean mo3263u();
}
