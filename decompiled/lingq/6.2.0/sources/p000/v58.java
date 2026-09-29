package p000;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class v58 {

    /* JADX INFO: renamed from: a */
    public final RemoteViews f64893a;

    /* JADX INFO: renamed from: b */
    public final j64 f64894b;

    public v58(RemoteViews remoteViews, j64 j64Var) {
        this.f64893a = remoteViews;
        this.f64894b = j64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v58)) {
            return false;
        }
        v58 v58Var = (v58) obj;
        return this.f64893a.equals(v58Var.f64893a) && this.f64894b.equals(v58Var.f64894b);
    }

    public final int hashCode() {
        return this.f64894b.hashCode() + (this.f64893a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f64893a + ", view=" + this.f64894b + ')';
    }
}
