package p209k0;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6562a {

    /* JADX INFO: renamed from: a */
    public int f37361a;

    public C6562a() {
        this(0);
    }

    public C6562a(int i10) {
        this.f37361a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6562a) && this.f37361a == ((C6562a) obj).f37361a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37361a);
    }

    public final String toString() {
        return C0204c.m853l(new StringBuilder("DeltaCounter(count="), this.f37361a, ')');
    }
}
