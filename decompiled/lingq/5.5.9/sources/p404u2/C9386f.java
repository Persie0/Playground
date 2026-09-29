package p404u2;

import android.support.v4.media.session.C0166e;
import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: u2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9386f {

    /* JADX INFO: renamed from: a */
    public final String f48179a;

    /* JADX INFO: renamed from: b */
    public final String f48180b;

    /* JADX INFO: renamed from: c */
    public final String f48181c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f48182d;

    /* JADX INFO: renamed from: e */
    public final String f48183e;

    public C9386f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f48179a = str;
        str2.getClass();
        this.f48180b = str2;
        this.f48181c = str3;
        list.getClass();
        this.f48182d = list;
        this.f48183e = C0166e.m766l(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f48179a + ", mProviderPackage: " + this.f48180b + ", mQuery: " + this.f48181c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f48182d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
