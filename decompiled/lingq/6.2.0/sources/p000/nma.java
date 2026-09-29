package p000;

import kotlinx.datetime.format.AbstractC3252c;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class nma extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f52974e;

    public nma(Padding padding) {
        super(AbstractC3252c.f48217c, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f52974e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nma) {
            return this.f52974e == ((nma) obj).f52974e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52974e.hashCode();
    }
}
