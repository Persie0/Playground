package p000;

import kotlinx.datetime.format.AbstractC3250a;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class x22 extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f67669e;

    public x22(Padding padding) {
        super(AbstractC3250a.f48213a, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f67669e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x22) {
            return this.f67669e == ((x22) obj).f67669e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f67669e.hashCode();
    }
}
