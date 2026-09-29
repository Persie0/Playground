package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wy3 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final int f67512a;

    /* JADX INFO: renamed from: b */
    public final String f67513b;

    /* JADX INFO: renamed from: c */
    public final String f67514c;

    /* JADX INFO: renamed from: d */
    public final String f67515d;

    /* JADX INFO: renamed from: e */
    public final boolean f67516e;

    /* JADX INFO: renamed from: f */
    public final int f67517f;

    public wy3(String str, String str2, int i, boolean z, int i2, String str3) {
        bna.m3969q(i2 == -1 || i2 > 0);
        this.f67512a = i;
        this.f67513b = str;
        this.f67514c = str2;
        this.f67515d = str3;
        this.f67516e = z;
        this.f67517f = i2;
    }

    /* JADX INFO: renamed from: d */
    public static wy3 m24215d(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i2 = Integer.parseInt(str4) * DescriptorProtos.Edition.EDITION_2023_VALUE;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        ss5.m21707d0("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        hn1.m13365o("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        ss5.m21707d0("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        hn1.m13365o("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z) {
            return new wy3(str, str2, i, zEquals, i5, str3);
        }
        return null;
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        String str = this.f67514c;
        if (str != null) {
            su5Var.f61441x = str;
        }
        String str2 = this.f67513b;
        if (str2 != null) {
            su5Var.f61440w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wy3.class == obj.getClass()) {
            wy3 wy3Var = (wy3) obj;
            if (this.f67512a == wy3Var.f67512a && Objects.equals(this.f67513b, wy3Var.f67513b) && Objects.equals(this.f67514c, wy3Var.f67514c) && Objects.equals(this.f67515d, wy3Var.f67515d) && this.f67516e == wy3Var.f67516e && this.f67517f == wy3Var.f67517f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f67512a) * 31;
        String str = this.f67513b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67514c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67515d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f67516e ? 1 : 0)) * 31) + this.f67517f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f67514c + "\", genre=\"" + this.f67513b + "\", bitrate=" + this.f67512a + ", metadataInterval=" + this.f67517f;
    }
}
