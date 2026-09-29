package p000;

import kotlinx.datetime.format.AbstractC3252c;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class mma extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f51537e;

    public mma(Padding padding) {
        super(AbstractC3252c.f48216b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f51537e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mma) {
            return this.f51537e == ((mma) obj).f51537e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51537e.hashCode();
    }
}
