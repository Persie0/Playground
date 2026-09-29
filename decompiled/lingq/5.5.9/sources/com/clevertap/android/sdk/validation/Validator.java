package com.clevertap.android.sdk.validation;

import android.support.v4.media.session.C0166e;
import androidx.fragment.app.C0987y;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p088e7.C5382b;

/* JADX INFO: loaded from: classes.dex */
public final class Validator {

    /* JADX INFO: renamed from: b */
    public static final String[] f11361b = {".", ":", "$", "'", "\"", "\\"};

    /* JADX INFO: renamed from: c */
    public static final String[] f11362c = {".", ":", "$", "'", "\"", "\\"};

    /* JADX INFO: renamed from: d */
    public static final String[] f11363d = {"'", "\"", "\\"};

    /* JADX INFO: renamed from: e */
    public static final String[] f11364e = {"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced", "Geocluster Entered", "Geocluster Exited", "SCOutgoing", "SCIncoming", "SCEnd"};

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f11365a;

    public enum RestrictedMultiValueFields {
        Name,
        Email,
        Education,
        Married,
        DOB,
        Gender,
        Phone,
        Age,
        FBID,
        GPID,
        Birthday
    }

    public enum ValidationContext {
        Profile,
        Event
    }

    /* JADX INFO: renamed from: a */
    public static C5382b m6586a(String str) {
        C5382b c5382b = new C5382b();
        String strTrim = str.trim();
        String[] strArr = f11361b;
        for (int i10 = 0; i10 < 6; i10++) {
            strTrim = strTrim.replace(strArr[i10], "");
        }
        if (strTrim.length() > 512) {
            strTrim = strTrim.substring(0, 511);
            C5382b c5382bM3821c = C0987y.m3821c(510, 11, strTrim.trim(), "512");
            c5382b.f33798b = c5382bM3821c.f33798b;
            c5382b.f33797a = c5382bM3821c.f33797a;
        }
        c5382b.f33799c = strTrim.trim();
        return c5382b;
    }

    /* JADX INFO: renamed from: b */
    public static C5382b m6587b(String str) {
        C5382b c5382bM6589d = m6589d(str);
        String str2 = (String) c5382bM6589d.f33799c;
        try {
            if (RestrictedMultiValueFields.valueOf(str2) != null) {
                C5382b c5382bM3821c = C0987y.m3821c(523, 24, str2);
                c5382bM6589d.f33798b = c5382bM3821c.f33798b;
                c5382bM6589d.f33797a = c5382bM3821c.f33797a;
                c5382bM6589d.f33799c = null;
            }
        } catch (Throwable unused) {
        }
        return c5382bM6589d;
    }

    /* JADX INFO: renamed from: c */
    public static C5382b m6588c(String str) {
        C5382b c5382b = new C5382b();
        String lowerCase = str.trim().toLowerCase();
        String[] strArr = f11363d;
        for (int i10 = 0; i10 < 3; i10++) {
            lowerCase = lowerCase.replace(strArr[i10], "");
        }
        try {
            if (lowerCase.length() > 512) {
                lowerCase = lowerCase.substring(0, 511);
                C5382b c5382bM3821c = C0987y.m3821c(521, 11, lowerCase, "512");
                c5382b.f33798b = c5382bM3821c.f33798b;
                c5382b.f33797a = c5382bM3821c.f33797a;
            }
        } catch (Exception unused) {
        }
        c5382b.f33799c = lowerCase;
        return c5382b;
    }

    /* JADX INFO: renamed from: d */
    public static C5382b m6589d(String str) {
        C5382b c5382b = new C5382b();
        String strTrim = str.trim();
        String[] strArr = f11362c;
        for (int i10 = 0; i10 < 6; i10++) {
            strTrim = strTrim.replace(strArr[i10], "");
        }
        if (strTrim.length() > 120) {
            strTrim = strTrim.substring(0, 119);
            C5382b c5382bM3821c = C0987y.m3821c(520, 11, strTrim.trim(), "120");
            c5382b.f33798b = c5382bM3821c.f33798b;
            c5382b.f33797a = c5382bM3821c.f33797a;
        }
        c5382b.f33799c = strTrim.trim();
        return c5382b;
    }

    /* JADX INFO: renamed from: e */
    public static C5382b m6590e(Object obj, ValidationContext validationContext) throws IllegalArgumentException {
        C5382b c5382b = new C5382b();
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Long)) {
            if (!(obj instanceof String) && !(obj instanceof Character)) {
                if (obj instanceof Date) {
                    c5382b.f33799c = "$D_" + (((Date) obj).getTime() / 1000);
                    return c5382b;
                }
                boolean z10 = obj instanceof String[];
                if (z10 || (obj instanceof ArrayList)) {
                    if (validationContext.equals(ValidationContext.Profile)) {
                        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                        String[] strArr = z10 ? (String[]) obj : null;
                        ArrayList arrayList2 = new ArrayList();
                        if (strArr != null) {
                            for (String str : strArr) {
                                try {
                                    arrayList2.add(str);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList2.add((String) it.next());
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                        if (strArr2.length <= 0 || strArr2.length > 100) {
                            C5382b c5382bM3821c = C0987y.m3821c(521, 13, C0166e.m768o(new StringBuilder(), strArr2.length, ""), "100");
                            c5382b.f33798b = c5382bM3821c.f33798b;
                            c5382b.f33797a = c5382bM3821c.f33797a;
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            JSONObject jSONObject = new JSONObject();
                            for (String str2 : strArr2) {
                                jSONArray.put(str2);
                            }
                            try {
                                jSONObject.put("$set", jSONArray);
                            } catch (JSONException unused3) {
                            }
                            c5382b.f33799c = jSONObject;
                        }
                        return c5382b;
                    }
                }
                throw new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
            }
            String strTrim = (obj instanceof Character ? String.valueOf(obj) : (String) obj).trim();
            String[] strArr3 = f11363d;
            for (int i10 = 0; i10 < 3; i10++) {
                strTrim = strTrim.replace(strArr3[i10], "");
            }
            try {
                if (strTrim.length() > 512) {
                    strTrim = strTrim.substring(0, 511);
                    C5382b c5382bM3821c2 = C0987y.m3821c(521, 11, strTrim.trim(), "512");
                    c5382b.f33798b = c5382bM3821c2.f33798b;
                    c5382b.f33797a = c5382bM3821c2.f33797a;
                }
            } catch (Exception unused4) {
            }
            c5382b.f33799c = strTrim.trim();
            return c5382b;
        }
        c5382b.f33799c = obj;
        return c5382b;
    }

    /* JADX INFO: renamed from: f */
    public static C5382b m6591f(JSONArray jSONArray, JSONArray jSONArray2, String str, String str2) {
        C5382b c5382b = new C5382b();
        boolean zEquals = "multiValuePropertyRemoveValues".equals(str);
        if (jSONArray == null) {
            c5382b.f33799c = null;
        } else if (jSONArray2 == null) {
            c5382b.f33799c = jSONArray;
        } else {
            JSONArray jSONArray3 = new JSONArray();
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            int length2 = jSONArray2.length();
            BitSet bitSet = zEquals ? null : new BitSet(length + length2);
            int iM6592g = m6592g(jSONArray2, hashSet, bitSet, length);
            int iM6592g2 = (zEquals || hashSet.size() >= 100) ? 0 : m6592g(jSONArray, hashSet, bitSet, 0);
            for (int i10 = iM6592g2; i10 < length; i10++) {
                if (zEquals) {
                    try {
                        String str3 = (String) jSONArray.get(i10);
                        if (!hashSet.contains(str3)) {
                            jSONArray3.put(str3);
                        }
                    } catch (Throwable unused) {
                    }
                } else if (!bitSet.get(i10)) {
                    jSONArray3.put(jSONArray.get(i10));
                }
            }
            if (!zEquals && jSONArray3.length() < 100) {
                for (int i11 = iM6592g; i11 < length2; i11++) {
                    try {
                        if (!bitSet.get(i11 + length)) {
                            jSONArray3.put(jSONArray2.get(i11));
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (iM6592g > 0 || iM6592g2 > 0) {
                C5382b c5382bM3821c = C0987y.m3821c(521, 12, str2, "100");
                c5382b.f33797a = c5382bM3821c.f33797a;
                c5382b.f33798b = c5382bM3821c.f33798b;
            }
            c5382b.f33799c = jSONArray3;
        }
        return c5382b;
    }

    /* JADX INFO: renamed from: g */
    public static int m6592g(JSONArray jSONArray, HashSet hashSet, BitSet bitSet, int i10) {
        if (jSONArray != null) {
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                try {
                    Object obj = jSONArray.get(length);
                    String string = obj != null ? obj.toString() : null;
                    if (bitSet == null) {
                        if (string != null) {
                            hashSet.add(string);
                        }
                    } else if (string == null || hashSet.contains(string)) {
                        bitSet.set(length + i10, true);
                    } else {
                        hashSet.add(string);
                        if (hashSet.size() == 100) {
                            return length;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }
}
