package p000;

import kotlinx.datetime.format.AbstractC3253d;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class qv3 extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f58244e;

    public qv3(Padding padding) {
        super(AbstractC3253d.f48218a, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f58244e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qv3) {
            return this.f58244e == ((qv3) obj).f58244e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f58244e.hashCode();
    }
}
