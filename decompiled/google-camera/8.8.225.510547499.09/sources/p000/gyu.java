package p000;

import android.os.Parcelable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gyu implements Comparable, Parcelable {

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f26873b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final int f26874a;

    public gyu() {
    }

    public gyu(int i) {
        this.f26874a = i;
    }

    /* JADX INFO: renamed from: a */
    public static gyu m10002a() {
        return new gyt(f26873b.getAndIncrement());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i = this.f26874a;
        int i2 = ((gyu) obj).f26874a;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gyu) && this.f26874a == ((gyu) obj).f26874a;
    }

    public final int hashCode() {
        return this.f26874a ^ 1000003;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "ShotId-%d", Integer.valueOf(this.f26874a));
    }
}
