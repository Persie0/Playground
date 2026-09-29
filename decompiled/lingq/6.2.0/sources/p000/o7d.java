package p000;

import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o7d {

    /* JADX INFO: renamed from: a */
    public static p04 f53962a;

    /* JADX INFO: renamed from: a */
    public static v0a m17836a() {
        boolean zIsFixedOffset;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        if (zoneIdSystemDefault instanceof ZoneOffset) {
            ZoneOffset zoneOffset = (ZoneOffset) zoneIdSystemDefault;
            new UtcOffset(zoneOffset);
            return new g63(zoneOffset);
        }
        try {
            zIsFixedOffset = zoneIdSystemDefault.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new v0a(zoneIdSystemDefault);
        }
        ZoneId zoneIdNormalized = zoneIdSystemDefault.normalized();
        zoneIdNormalized.getClass();
        new UtcOffset((ZoneOffset) zoneIdNormalized);
        return new g63(zoneIdSystemDefault);
    }
}
