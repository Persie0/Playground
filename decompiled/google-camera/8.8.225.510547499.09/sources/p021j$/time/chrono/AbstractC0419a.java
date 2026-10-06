package p021j$.time.chrono;

import java.util.Locale;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0419a implements InterfaceC0425g {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC0419a() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((InterfaceC0425g) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0419a)) {
            return false;
        }
        ((AbstractC0419a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
