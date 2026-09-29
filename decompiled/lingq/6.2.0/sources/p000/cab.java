package p000;

import kotlinx.datetime.format.AbstractC3254e;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AbstractC3259d;

/* JADX INFO: loaded from: classes3.dex */
public final class cab extends AbstractC3259d {

    /* JADX INFO: renamed from: d */
    public final Padding f9804d;

    public cab(Padding padding) {
        super(AbstractC3254e.f48222a, Integer.valueOf(padding != Padding.ZERO ? 1 : 4), padding != Padding.SPACE ? null : 4);
        this.f9804d = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cab) {
            return this.f9804d == ((cab) obj).f9804d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f9804d.hashCode() * 31);
    }
}
