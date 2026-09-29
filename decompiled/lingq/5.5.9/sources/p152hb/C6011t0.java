package p152hb;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
import p176ib.C6268g;

/* JADX INFO: renamed from: hb.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6011t0 {

    /* JADX INFO: renamed from: a */
    public final C5949a<?> f35596a;

    /* JADX INFO: renamed from: b */
    public final Feature f35597b;

    public /* synthetic */ C6011t0(C5949a c5949a, Feature feature) {
        this.f35596a = c5949a;
        this.f35597b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C6011t0)) {
            C6011t0 c6011t0 = (C6011t0) obj;
            if (C6268g.m12905a(this.f35596a, c6011t0.f35596a) && C6268g.m12905a(this.f35597b, c6011t0.f35597b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35596a, this.f35597b});
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        aVar.m12906a(this.f35596a, "key");
        aVar.m12906a(this.f35597b, "feature");
        return aVar.toString();
    }
}
