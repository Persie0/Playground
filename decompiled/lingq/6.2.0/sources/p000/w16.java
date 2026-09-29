package p000;

import kotlinx.datetime.format.AbstractC3254e;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class w16 extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f66222e;

    public w16(Padding padding) {
        super(AbstractC3254e.f48223b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f66222e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w16) {
            return this.f66222e == ((w16) obj).f66222e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f66222e.hashCode();
    }
}
