package p000;

import com.lingq.core.domain.model.notification.InAppNotificationType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h24 {

    /* JADX INFO: renamed from: a */
    public final InAppNotificationType f41695a;

    /* JADX INFO: renamed from: b */
    public final String f41696b;

    /* JADX INFO: renamed from: c */
    public final String f41697c;

    /* JADX INFO: renamed from: d */
    public final List f41698d;

    /* JADX INFO: renamed from: e */
    public final Object f41699e;

    public h24(InAppNotificationType inAppNotificationType, String str, String str2, List list, Object obj) {
        inAppNotificationType.getClass();
        this.f41695a = inAppNotificationType;
        this.f41696b = str;
        this.f41697c = str2;
        this.f41698d = list;
        this.f41699e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h24)) {
            return false;
        }
        h24 h24Var = (h24) obj;
        return this.f41695a == h24Var.f41695a && fa4.m11650l(this.f41696b, h24Var.f41696b) && fa4.m11650l(this.f41697c, h24Var.f41697c) && fa4.m11650l(this.f41698d, h24Var.f41698d) && fa4.m11650l(this.f41699e, h24Var.f41699e);
    }

    public final int hashCode() {
        int iHashCode = this.f41695a.hashCode() * 31;
        String str = this.f41696b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41697c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f41698d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f41699e;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppNotification(type=");
        sb.append(this.f41695a);
        sb.append(", title=");
        sb.append(this.f41696b);
        sb.append(", message=");
        hn1.m13366p(this.f41697c, ", actions=", ", data=", sb, this.f41698d);
        sb.append(this.f41699e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ h24(InAppNotificationType inAppNotificationType, List list, Object obj, int i) {
        this(inAppNotificationType, null, null, (i & 8) != 0 ? null : list, obj);
    }
}
