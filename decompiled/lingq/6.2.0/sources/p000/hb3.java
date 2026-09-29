package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hb3 {

    /* JADX INFO: renamed from: a */
    public final String f42126a;

    /* JADX INFO: renamed from: b */
    public final String f42127b;

    /* JADX INFO: renamed from: c */
    public final String f42128c;

    /* JADX INFO: renamed from: d */
    public final List f42129d;

    /* JADX INFO: renamed from: e */
    public final String f42130e;

    /* JADX INFO: renamed from: f */
    public final String f42131f;

    /* JADX INFO: renamed from: g */
    public final String f42132g;

    public hb3(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f42126a = str;
        str2.getClass();
        this.f42127b = str2;
        this.f42128c = str3;
        list.getClass();
        this.f42129d = list;
        this.f42130e = str4;
        this.f42131f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.f42132g = wq1.m24125u(sb, "-", str4, "-", str5);
    }

    /* JADX INFO: renamed from: a */
    public final String m13182a() {
        return this.f42130e;
    }

    /* JADX INFO: renamed from: b */
    public final String m13183b() {
        return this.f42131f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f42126a + ", mProviderPackage: " + this.f42127b + ", mQuery: " + this.f42128c + ", mSystemFont: " + this.f42130e + ", mVariationSettings: " + this.f42131f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f42129d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public hb3(String str, String str2, List list) {
        this(str, str2, "emojicompat-emoji-font", list, null, null);
    }
}
