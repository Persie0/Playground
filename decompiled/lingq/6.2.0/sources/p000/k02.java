package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k02 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f46461h = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f46462a;

    /* JADX INFO: renamed from: b */
    public final int f46463b;

    /* JADX INFO: renamed from: c */
    public final byte[] f46464c;

    /* JADX INFO: renamed from: d */
    public final Map f46465d;

    /* JADX INFO: renamed from: e */
    public final long f46466e;

    /* JADX INFO: renamed from: f */
    public final long f46467f;

    /* JADX INFO: renamed from: g */
    public final int f46468g;

    static {
        qu5.m20178a("media3.datasource");
    }

    public k02(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        bna.m3969q(j >= 0);
        bna.m3969q(j >= 0);
        bna.m3969q(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f46462a = uri;
        this.f46463b = i;
        this.f46464c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f46465d = Collections.unmodifiableMap(new HashMap(map));
        this.f46466e = j;
        this.f46467f = j2;
        this.f46468g = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14757a(int i) {
        return (this.f46468g & i) == i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f46463b;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                uk9.m22770c();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f46462a);
        sb.append(", ");
        sb.append(this.f46466e);
        sb.append(", ");
        sb.append(this.f46467f);
        sb.append(", null, ");
        return wq1.m24123s(sb, this.f46468g, "]");
    }

    public k02(Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, 0);
    }
}
