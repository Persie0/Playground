package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvs extends lle {

    /* JADX INFO: renamed from: a */
    private final boolean f39412a;

    /* JADX INFO: renamed from: b */
    private final Long f39413b;

    /* JADX INFO: renamed from: c */
    private final Set f39414c;

    /* JADX INFO: renamed from: d */
    private final List f39415d;

    public lvs(Set set, List list) {
        super((char[]) null);
        this.f39412a = false;
        this.f39413b = null;
        this.f39414c = set;
        this.f39415d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvs)) {
            return false;
        }
        lvs lvsVar = (lvs) obj;
        boolean z = lvsVar.f39412a;
        Long l = lvsVar.f39413b;
        return ooc.m18737c(null, null) && ooc.m18737c(this.f39414c, lvsVar.f39414c) && ooc.m18737c(this.f39415d, lvsVar.f39415d);
    }

    public final int hashCode() {
        return (this.f39414c.hashCode() * 31) + 1;
    }

    public final String toString() {
        return "QueryResources(isSnapshot=false, onDeviceId=" + ((Object) null) + ", filters=" + this.f39414c + ", sortOrders=" + this.f39415d + ")";
    }
}
