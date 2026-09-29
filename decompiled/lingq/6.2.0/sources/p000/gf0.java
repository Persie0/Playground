package p000;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends de6 {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f40693r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf0(int i, boolean z) {
        super(z);
        this.f40693r = i;
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        switch (this.f40693r) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                syc.m21782a(str);
                throw null;
            case 1:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                syc.m21782a(str);
                throw null;
            case 2:
                bundle.getClass();
                return Integer.valueOf(te1.m22007u(str, bundle));
            case 3:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                syc.m21782a(str);
                throw null;
            case 4:
                bundle.getClass();
                return Integer.valueOf(te1.m22007u(str, bundle));
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                syc.m21782a(str);
                throw null;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        switch (this.f40693r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: d */
    public final Object mo303d(String str) {
        int i;
        long j;
        int i2;
        boolean z = true;
        switch (this.f40693r) {
            case 0:
                str.getClass();
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        C3386nv.m17626m("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                if (cl9.m4842Y(str, "0x", false)) {
                    String strSubstring = str.substring(2);
                    ci8.m4727l(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                str.getClass();
                String strM24112h = cl9.m4833P(str, "L", false) ? wq1.m24112h(1, str, 0) : str;
                if (cl9.m4842Y(str, "0x", false)) {
                    String strSubstring2 = strM24112h.substring(2);
                    ci8.m4727l(16);
                    j = Long.parseLong(strSubstring2, 16);
                } else {
                    j = Long.parseLong(strM24112h);
                }
                return Long.valueOf(j);
            case 4:
                str.getClass();
                if (cl9.m4842Y(str, "0x", false)) {
                    String strSubstring3 = str.substring(2);
                    ci8.m4727l(16);
                    i2 = Integer.parseInt(strSubstring3, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        switch (this.f40693r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue2);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putString(str, str2);
                }
                break;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: f */
    public String mo10314f(Object obj) {
        switch (this.f40693r) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String strEncode = Uri.encode(str, null);
                strEncode.getClass();
                return strEncode;
            default:
                return super.mo10314f(obj);
        }
    }
}
