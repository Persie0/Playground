package p000;

import kotlinx.datetime.format.AbstractC3253d;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class lt8 extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f50117e;

    public lt8(Padding padding) {
        super(AbstractC3253d.f48220c, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f50117e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lt8) {
            return this.f50117e == ((lt8) obj).f50117e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50117e.hashCode();
    }
}
