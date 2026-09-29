package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AbstractC1044c;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w6d {

    /* JADX INFO: renamed from: a */
    public final HashMap f66460a;

    public w6d(Map map) {
        HashMap map2 = new HashMap();
        this.f66460a = map2;
        map2.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final String m23792a() {
        StringBuilder sb = new StringBuilder();
        ImmutableList immutableList = AbstractC1044c.f12335a;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) immutableList.get(i);
            HashMap map = this.f66460a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m23793b() {
        int iM23794c;
        HashMap map = this.f66460a;
        if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if ("1".equals(map.get("GoogleConsent")) && (iM23794c = m23794c()) >= 0) {
                    String str2 = (String) map.get("PurposeConsents");
                    if (TextUtils.isEmpty(str2)) {
                        return Bundle.EMPTY;
                    }
                    Bundle bundle = new Bundle();
                    if (str2.length() > 0) {
                        bundle.putString(zzjk.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str2.length() > 6 && iM23794c >= 4) {
                        String str3 = zzjk.AD_USER_DATA.zze;
                        if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                            str = "granted";
                        }
                        bundle.putString(str3, str);
                    }
                    return bundle;
                }
                return Bundle.EMPTY;
            }
            if (m23794c() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(zzjk.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString(zzjk.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (m23794c() >= 4) {
                    String str4 = zzjk.AD_USER_DATA.zze;
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString(str4, str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: c */
    public final int m23794c() {
        try {
            String str = (String) this.f66460a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w6d) {
            return m23792a().equalsIgnoreCase(((w6d) obj).m23792a());
        }
        return false;
    }

    public final int hashCode() {
        return m23792a().hashCode();
    }

    public final String toString() {
        return m23792a();
    }
}
