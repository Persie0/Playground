package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class v78 implements oa1 {

    /* JADX INFO: renamed from: a */
    public final int f64981a;

    public v78(int i) {
        this.f64981a = i;
    }

    @Override // p000.oa1
    /* JADX INFO: renamed from: a */
    public final long mo134a(Context context) {
        return d32.m10035e(g8d.m12418c(context, this.f64981a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v78) && this.f64981a == ((v78) obj).f64981a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64981a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("ResourceColorProvider(resId="), this.f64981a, ')');
    }
}
