package p000;

import java.time.ZoneId;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes2.dex */
public class v0a {

    /* JADX INFO: renamed from: b */
    public static final g63 f64669b;

    /* JADX INFO: renamed from: a */
    public final ZoneId f64670a;

    static {
        UtcOffset.Companion.getClass();
        UtcOffset utcOffset = UtcOffset.f48193b;
        ZoneId zoneIdOf = ZoneId.of("UTC");
        zoneIdOf.getClass();
        utcOffset.getClass();
        f64669b = new g63(zoneIdOf);
    }

    public v0a(ZoneId zoneId) {
        this.f64670a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0a) {
            return this.f64670a.equals(((v0a) obj).f64670a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f64670a.hashCode();
    }

    public final String toString() {
        String string = this.f64670a.toString();
        string.getClass();
        return string;
    }
}
