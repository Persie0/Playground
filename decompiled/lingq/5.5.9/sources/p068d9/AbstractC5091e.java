package p068d9;

import android.support.v4.media.session.C0166e;
import com.google.auto.value.AutoValue;

/* JADX INFO: renamed from: d9.e */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC5091e {

    /* JADX INFO: renamed from: a */
    public static final C5087a f33031a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String strM765k = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strM765k = strM765k.concat(" loadBatchSize");
        }
        if (num2 == null) {
            strM765k = C0166e.m765k(strM765k, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            strM765k = C0166e.m765k(strM765k, " eventCleanUpAge");
        }
        if (num3 == null) {
            strM765k = C0166e.m765k(strM765k, " maxBlobByteSizePerRow");
        }
        if (!strM765k.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
        f33031a = new C5087a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo10844a();

    /* JADX INFO: renamed from: b */
    public abstract long mo10845b();

    /* JADX INFO: renamed from: c */
    public abstract int mo10846c();

    /* JADX INFO: renamed from: d */
    public abstract int mo10847d();

    /* JADX INFO: renamed from: e */
    public abstract long mo10848e();
}
