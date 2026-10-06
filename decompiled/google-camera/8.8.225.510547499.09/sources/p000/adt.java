package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adt {

    /* JADX INFO: renamed from: a */
    public final String f168a;

    /* JADX INFO: renamed from: b */
    public final String f169b;

    /* JADX INFO: renamed from: c */
    public final String f170c;

    /* JADX INFO: renamed from: d */
    public final List f171d;

    /* JADX INFO: renamed from: e */
    public final String f172e;

    public adt(String str, String str2, String str3, List list) {
        this.f168a = str;
        this.f169b = str2;
        this.f170c = str3;
        abf.m90c(list);
        this.f171d = list;
        this.f172e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f168a + ", mProviderPackage: " + this.f169b + ", mQuery: " + this.f170c + ", mCertificates:");
        for (int i = 0; i < this.f171d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f171d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}mCertificatesArray: 0");
        return sb.toString();
    }
}
