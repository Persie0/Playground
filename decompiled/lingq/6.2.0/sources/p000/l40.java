package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l40 {

    /* JADX INFO: renamed from: a */
    public final String f49001a;

    /* JADX INFO: renamed from: b */
    public final Integer f49002b;

    /* JADX INFO: renamed from: c */
    public final vr2 f49003c;

    /* JADX INFO: renamed from: d */
    public final long f49004d;

    /* JADX INFO: renamed from: e */
    public final long f49005e;

    /* JADX INFO: renamed from: f */
    public final Map f49006f;

    /* JADX INFO: renamed from: g */
    public final Integer f49007g;

    /* JADX INFO: renamed from: h */
    public final String f49008h;

    /* JADX INFO: renamed from: i */
    public final byte[] f49009i;

    /* JADX INFO: renamed from: j */
    public final byte[] f49010j;

    public l40(String str, Integer num, vr2 vr2Var, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f49001a = str;
        this.f49002b = num;
        this.f49003c = vr2Var;
        this.f49004d = j;
        this.f49005e = j2;
        this.f49006f = map;
        this.f49007g = num2;
        this.f49008h = str2;
        this.f49009i = bArr;
        this.f49010j = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public final String m15776a(String str) {
        String str2 = (String) this.f49006f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m15777b(String str) {
        String str2 = (String) this.f49006f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final k40 m15778c() {
        k40 k40Var = new k40();
        String str = this.f49001a;
        if (str == null) {
            C3386nv.m17635v("Null transportName");
            return null;
        }
        k40Var.f46674b = str;
        k40Var.f46676d = this.f49002b;
        k40Var.f46677e = this.f49007g;
        k40Var.f46675c = this.f49008h;
        k40Var.f46682j = this.f49009i;
        k40Var.f46683k = this.f49010j;
        vr2 vr2Var = this.f49003c;
        if (vr2Var == null) {
            C3386nv.m17635v("Null encodedPayload");
            return null;
        }
        k40Var.f46678f = vr2Var;
        k40Var.f46679g = Long.valueOf(this.f49004d);
        k40Var.f46680h = Long.valueOf(this.f49005e);
        k40Var.f46681i = new HashMap(this.f49006f);
        return k40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l40) {
            l40 l40Var = (l40) obj;
            if (this.f49001a.equals(l40Var.f49001a)) {
                Integer num = l40Var.f49002b;
                Integer num2 = this.f49002b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f49003c.equals(l40Var.f49003c) && this.f49004d == l40Var.f49004d && this.f49005e == l40Var.f49005e && this.f49006f.equals(l40Var.f49006f)) {
                        Integer num3 = l40Var.f49007g;
                        Integer num4 = this.f49007g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = l40Var.f49008h;
                            String str2 = this.f49008h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                boolean z = l40Var instanceof l40;
                                if (Arrays.equals(this.f49009i, z ? l40Var.f49009i : l40Var.f49009i)) {
                                    if (Arrays.equals(this.f49010j, z ? l40Var.f49010j : l40Var.f49010j)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f49001a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f49002b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f49003c.hashCode()) * 1000003;
        long j = this.f49004d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f49005e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f49006f.hashCode()) * 1000003;
        Integer num2 = this.f49007g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f49008h;
        return Arrays.hashCode(this.f49010j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f49009i)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f49001a + ", code=" + this.f49002b + ", encodedPayload=" + this.f49003c + ", eventMillis=" + this.f49004d + ", uptimeMillis=" + this.f49005e + ", autoMetadata=" + this.f49006f + ", productId=" + this.f49007g + ", pseudonymousId=" + this.f49008h + ", experimentIdsClear=" + Arrays.toString(this.f49009i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f49010j) + "}";
    }
}
