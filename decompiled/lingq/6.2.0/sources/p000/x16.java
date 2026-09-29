package p000;

import com.lingq.core.domain.model.notification.Notice;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class x16 {

    /* JADX INFO: renamed from: a */
    public final boolean f67632a;

    /* JADX INFO: renamed from: b */
    public final Notice f67633b;

    /* JADX INFO: renamed from: c */
    public final List f67634c;

    public /* synthetic */ x16(int i) {
        this(false, new Notice((31 & 1) != 0 ? 0 : 1, (31 & 2) != 0 ? "" : "Join the Monthly Challenge!", "", "", ""), EmptyList.f47638a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x16)) {
            return false;
        }
        x16 x16Var = (x16) obj;
        return this.f67632a == x16Var.f67632a && fa4.m11650l(this.f67633b, x16Var.f67633b) && fa4.m11650l(this.f67634c, x16Var.f67634c);
    }

    public final int hashCode() {
        return this.f67634c.hashCode() + ((this.f67633b.hashCode() + (Boolean.hashCode(this.f67632a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonthlyChallengesDialogState(show=");
        sb.append(this.f67632a);
        sb.append(", userNotice=");
        sb.append(this.f67633b);
        sb.append(", images=");
        return hn1.m13356f(sb, this.f67634c, ")");
    }

    public x16(boolean z, Notice notice, List list) {
        notice.getClass();
        this.f67632a = z;
        this.f67633b = notice;
        this.f67634c = list;
    }
}
