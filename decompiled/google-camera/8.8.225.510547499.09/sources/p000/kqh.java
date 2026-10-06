package p000;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqh implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f36839a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private final int f36840b;

    public kqh() {
    }

    public kqh(int i) {
        this.f36840b = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i = this.f36840b;
        int i2 = ((kqh) obj).f36840b;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kqh) && this.f36840b == ((kqh) obj).f36840b;
    }

    public final int hashCode() {
        return this.f36840b ^ 1000003;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "MediaGroup-%d", Integer.valueOf(this.f36840b));
    }
}
