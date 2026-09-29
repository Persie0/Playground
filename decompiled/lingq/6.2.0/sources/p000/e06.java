package p000;

import kotlinx.datetime.format.AbstractC3253d;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3260e;

/* JADX INFO: loaded from: classes3.dex */
public final class e06 extends AbstractC3260e {

    /* JADX INFO: renamed from: e */
    public final Padding f36534e;

    public e06(Padding padding) {
        super(AbstractC3253d.f48219b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        this.f36534e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e06) {
            return this.f36534e == ((e06) obj).f36534e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36534e.hashCode();
    }
}
