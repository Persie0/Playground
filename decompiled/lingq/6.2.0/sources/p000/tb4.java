package p000;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tb4 {

    /* JADX INFO: renamed from: a */
    public final Date f62098a;

    /* JADX INFO: renamed from: b */
    public final String f62099b;

    public tb4(Date date) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.f62098a = date;
        this.f62099b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb4)) {
            return false;
        }
        tb4 tb4Var = (tb4) obj;
        return fa4.m11650l(this.f62098a, tb4Var.f62098a) && fa4.m11650l(this.f62099b, tb4Var.f62099b);
    }

    public final int hashCode() {
        Date date = this.f62098a;
        return this.f62099b.hashCode() + ((date == null ? 0 : date.hashCode()) * 29791);
    }

    public final String toString() {
        return "IterableEmbeddedSession(start=" + this.f62098a + ", end=null, impressions=null, id=" + this.f62099b + ")";
    }
}
