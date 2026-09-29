package p000;

import kotlinx.datetime.format.AbstractC3252c;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class pma extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f56485e;

    public pma(Padding padding) {
        super(AbstractC3252c.f48215a, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f56485e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pma) {
            return this.f56485e == ((pma) obj).f56485e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f56485e.hashCode();
    }
}
