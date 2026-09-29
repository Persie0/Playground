package p000;

import com.amplitude.core.utilities.http.HttpClient$Request$Method;
import com.kochava.core.BuildConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class vw3 {

    /* JADX INFO: renamed from: h */
    public static final Map f66013h = AbstractC3194a.m15365R(new Pair("Content-Type", "application/json; charset=utf-8"), new Pair("Accept", "application/json"));

    /* JADX INFO: renamed from: a */
    public final String f66014a;

    /* JADX INFO: renamed from: b */
    public final HttpClient$Request$Method f66015b;

    /* JADX INFO: renamed from: c */
    public final Map f66016c;

    /* JADX INFO: renamed from: d */
    public final String f66017d;

    /* JADX INFO: renamed from: e */
    public final boolean f66018e;

    /* JADX INFO: renamed from: f */
    public final int f66019f;

    /* JADX INFO: renamed from: g */
    public final int f66020g;

    public vw3(String str, HttpClient$Request$Method httpClient$Request$Method, Map map, String str2, boolean z, int i) {
        map = (i & 4) != 0 ? AbstractC3194a.m15360M() : map;
        str2 = (i & 8) != 0 ? null : str2;
        z = (i & 16) != 0 ? false : z;
        httpClient$Request$Method.getClass();
        this.f66014a = str;
        this.f66015b = httpClient$Request$Method;
        this.f66016c = map;
        this.f66017d = str2;
        this.f66018e = z;
        this.f66019f = 15000;
        this.f66020g = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3)) {
            return false;
        }
        vw3 vw3Var = (vw3) obj;
        return fa4.m11650l(this.f66014a, vw3Var.f66014a) && this.f66015b == vw3Var.f66015b && fa4.m11650l(this.f66016c, vw3Var.f66016c) && fa4.m11650l(this.f66017d, vw3Var.f66017d) && this.f66018e == vw3Var.f66018e && this.f66019f == vw3Var.f66019f && this.f66020g == vw3Var.f66020g;
    }

    public final int hashCode() {
        int iM10869a = e65.m10869a((this.f66015b.hashCode() + (this.f66014a.hashCode() * 31)) * 31, 31, this.f66016c);
        String str = this.f66017d;
        return Integer.hashCode(this.f66020g) + wq1.m24106b(this.f66019f, g9a.m12428e((iM10869a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66018e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request(url=");
        sb.append(this.f66014a);
        sb.append(", method=");
        sb.append(this.f66015b);
        sb.append(", headers=");
        sb.append(this.f66016c);
        sb.append(", body=");
        sb.append(this.f66017d);
        sb.append(", compressBody=");
        sb.append(this.f66018e);
        sb.append(", connectTimeoutMs=");
        sb.append(this.f66019f);
        sb.append(", readTimeoutMs=");
        return wq1.m24122r(sb, this.f66020g, ')');
    }
}
