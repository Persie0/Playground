package p152hb;

import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.C2542a.c;
import java.util.Arrays;
import p176ib.C6268g;

/* JADX INFO: renamed from: hb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5949a<O extends C2542a.c> {

    /* JADX INFO: renamed from: a */
    public final int f35407a;

    /* JADX INFO: renamed from: b */
    public final C2542a<O> f35408b;

    /* JADX INFO: renamed from: c */
    public final O f35409c;

    /* JADX INFO: renamed from: d */
    public final String f35410d;

    public C5949a(C2542a<O> c2542a, O o10, String str) {
        this.f35408b = c2542a;
        this.f35409c = o10;
        this.f35410d = str;
        this.f35407a = Arrays.hashCode(new Object[]{c2542a, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5949a)) {
            return false;
        }
        C5949a c5949a = (C5949a) obj;
        return C6268g.m12905a(this.f35408b, c5949a.f35408b) && C6268g.m12905a(this.f35409c, c5949a.f35409c) && C6268g.m12905a(this.f35410d, c5949a.f35410d);
    }

    public final int hashCode() {
        return this.f35407a;
    }
}
