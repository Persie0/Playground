package cc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import java.util.EnumMap;

/* JADX INFO: renamed from: cc.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1811f {

    /* JADX INFO: renamed from: b */
    public static final C1811f f9788b = new C1811f(null, null);

    /* JADX INFO: renamed from: a */
    public final EnumMap f9789a;

    public C1811f(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f9789a = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        enumMap.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    public C1811f(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f9789a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX INFO: renamed from: a */
    public static C1811f m5592a(Bundle bundle) {
        if (bundle == null) {
            return f9788b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            String string = bundle.getString(zzahVar.zzd);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put(zzahVar, bool);
        }
        return new C1811f(enumMap);
    }

    /* JADX INFO: renamed from: b */
    public static C1811f m5593b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzahVar, bool);
                }
                i10++;
            }
        }
        return new C1811f(enumMap);
    }

    /* JADX INFO: renamed from: c */
    public final C1811f m5594c(C1811f c1811f) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean boolValueOf = (Boolean) this.f9789a.get(zzahVar);
            Boolean bool = (Boolean) c1811f.f9789a.get(zzahVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(zzahVar, boolValueOf);
        }
        return new C1811f(enumMap);
    }

    /* JADX INFO: renamed from: d */
    public final C1811f m5595d(C1811f c1811f) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.f9789a.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) c1811f.f9789a.get(zzahVar);
            }
            enumMap.put(zzahVar, bool);
        }
        return new C1811f(enumMap);
    }

    /* JADX INFO: renamed from: e */
    public final String m5596e() {
        StringBuilder sb2 = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f9789a.get(zzahVarArr[i10]);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        char c10;
        if (!(obj instanceof C1811f)) {
            return false;
        }
        C1811f c1811f = (C1811f) obj;
        zzah[] zzahVarArrValues = zzah.values();
        int length = zzahVarArrValues.length;
        int i10 = 0;
        while (true) {
            char c11 = 1;
            if (i10 >= length) {
                return true;
            }
            zzah zzahVar = zzahVarArrValues[i10];
            Boolean bool = (Boolean) this.f9789a.get(zzahVar);
            if (bool == null) {
                c10 = 0;
            } else {
                c10 = bool.booleanValue() ? (char) 1 : (char) 2;
            }
            Boolean bool2 = (Boolean) c1811f.f9789a.get(zzahVar);
            if (bool2 == null) {
                c11 = 0;
            } else if (!bool2.booleanValue()) {
                c11 = 2;
            }
            if (c10 != c11) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5597f(zzah zzahVar) {
        Boolean bool = (Boolean) this.f9789a.get(zzahVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5598g(C1811f c1811f, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.f9789a.get(zzahVar);
            Boolean bool2 = (Boolean) c1811f.f9789a.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17;
        for (Boolean bool : this.f9789a.values()) {
            i10 = (i10 * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        zzah[] zzahVarArrValues = zzah.values();
        int length = zzahVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzah zzahVar = zzahVarArrValues[i10];
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(zzahVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f9789a.get(zzahVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb2.toString();
    }
}
