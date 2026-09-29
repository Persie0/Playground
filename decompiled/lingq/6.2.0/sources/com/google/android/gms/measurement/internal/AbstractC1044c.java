package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1044c {

    /* JADX INFO: renamed from: a */
    public static final ImmutableList f12335a = ImmutableList.m6281C("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* JADX INFO: renamed from: a */
    public static String m5874a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5875b(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        zzoe zzoeVar;
        char c;
        int iM5876c = m5876c(zzabwVar);
        if (iM5876c > 0 && (i2 != 1 || i != 1)) {
            cArr[iM5876c] = '2';
        }
        if (m5880g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && immutableSet.contains(str)) {
                if (iM5876c > 0 && cArr[iM5876c] != '2') {
                    cArr[iM5876c] = '1';
                }
                return true;
            }
            if (immutableMap.containsKey(zzabwVar) && (zzoeVar = (zzoe) immutableMap.get(zzabwVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m5880g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? m5879f(zzabwVar, cArr, str3, z2) : m5878e(zzabwVar, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return m5880g(zzabwVar, immutableMap2) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? m5878e(zzabwVar, cArr, str2, z) : m5879f(zzabwVar, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (m5880g(zzabwVar, immutableMap2) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return m5879f(zzabwVar, cArr, str3, z2);
                    }
                } else if (m5880g(zzabwVar, immutableMap2) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return m5878e(zzabwVar, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iM5876c <= 0 || cArr[iM5876c] == '2') {
            return false;
        }
        cArr[iM5876c] = c;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final int m5876c(zzabw zzabwVar) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static final String m5877d(zzabw zzabwVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < zzabwVar.zza()) ? "0" : String.valueOf(str.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzabwVar.zza()) {
            strValueOf = String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5878e(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int iM5876c = m5876c(zzabwVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char cCharAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iM5876c > 0 && cArr[iM5876c] != '2') {
                    cArr[iM5876c] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM5876c > 0 && cArr[iM5876c] != '2') {
            cArr[iM5876c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5879f(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int iM5876c = m5876c(zzabwVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char cCharAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iM5876c > 0 && cArr[iM5876c] != '2') {
                    cArr[iM5876c] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM5876c > 0 && cArr[iM5876c] != '2') {
            cArr[iM5876c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final zzabx m5880g(zzabw zzabwVar, ImmutableMap immutableMap) {
        Object obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = immutableMap.get(zzabwVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (zzabx) obj;
    }
}
