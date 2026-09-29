package androidx.media3.common.util;

import p000.uk9;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class StuckPlayerException extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final int f6418a;

    /* JADX INFO: renamed from: b */
    public final int f6419b;

    /* JADX WARN: Illegal instructions before constructor call */
    public StuckPlayerException(int i, int i2) {
        String strM22989l;
        if (i == 0) {
            strM22989l = ux5.m22989l("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strM22989l = ux5.m22989l("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strM22989l = ux5.m22989l("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strM22989l = ux5.m22989l("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                uk9.m22770c();
                throw null;
            }
            strM22989l = ux5.m22989l("Player stuck suppressed for ", i2, " ms");
        }
        super(strM22989l);
        this.f6418a = i;
        this.f6419b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.f6418a == stuckPlayerException.f6418a && this.f6419b == stuckPlayerException.f6419b;
    }

    public final int hashCode() {
        return ((527 + this.f6418a) * 31) + this.f6419b;
    }
}
