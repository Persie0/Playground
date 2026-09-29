package p454wa;

import android.net.Uri;
import android.support.v4.media.session.C0166e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p150h9.C5941x;
import p479xa.C10129a;

/* JADX INFO: renamed from: wa.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9884i {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f50435k = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f50436a;

    /* JADX INFO: renamed from: b */
    public final long f50437b;

    /* JADX INFO: renamed from: c */
    public final int f50438c;

    /* JADX INFO: renamed from: d */
    public final byte[] f50439d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f50440e;

    /* JADX INFO: renamed from: f */
    public final long f50441f;

    /* JADX INFO: renamed from: g */
    public final long f50442g;

    /* JADX INFO: renamed from: h */
    public final String f50443h;

    /* JADX INFO: renamed from: i */
    public final int f50444i;

    /* JADX INFO: renamed from: j */
    public final Object f50445j;

    static {
        C5941x.m12374a("goog.exo.datasource");
    }

    public C9884i(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C9884i(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        C10129a.m18990b(j10 + j11 >= 0);
        C10129a.m18990b(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        this.f50436a = uri;
        this.f50437b = j10;
        this.f50438c = i10;
        this.f50439d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f50440e = Collections.unmodifiableMap(new HashMap(map));
        this.f50441f = j11;
        this.f50442g = j12;
        this.f50443h = str;
        this.f50444i = i11;
        this.f50445j = obj;
    }

    public C9884i(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f50438c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f50436a);
        sb2.append(", ");
        sb2.append(this.f50441f);
        sb2.append(", ");
        sb2.append(this.f50442g);
        sb2.append(", ");
        sb2.append(this.f50443h);
        sb2.append(", ");
        return C0166e.m768o(sb2, this.f50444i, "]");
    }
}
