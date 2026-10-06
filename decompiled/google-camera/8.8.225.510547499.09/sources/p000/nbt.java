package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nbt {

    /* JADX INFO: renamed from: a */
    public final TimeUnit f41958a;

    /* JADX INFO: renamed from: b */
    public int f41959b = -1;

    /* JADX INFO: renamed from: c */
    private final int f41960c = 10000;

    public nbt(TimeUnit timeUnit) {
        nea.m17397k(timeUnit, "time unit");
        this.f41958a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nbt) {
            nbt nbtVar = (nbt) obj;
            int i = nbtVar.f41960c;
            if (this.f41958a == nbtVar.f41958a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41958a.hashCode() ^ 370000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("10000 ");
        sb.append(this.f41958a);
        if (this.f41959b > 0) {
            sb.append(" [skipped: ");
            sb.append(this.f41959b);
            sb.append(']');
        }
        return sb.toString();
    }
}
