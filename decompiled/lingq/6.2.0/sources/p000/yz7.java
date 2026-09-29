package p000;

import com.lingq.core.domain.model.theme.LqTheme;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yz7 {

    /* JADX INFO: renamed from: a */
    public final String f70705a;

    /* JADX INFO: renamed from: b */
    public final List f70706b;

    /* JADX INFO: renamed from: c */
    public final List f70707c;

    /* JADX INFO: renamed from: d */
    public final LqTheme f70708d;

    /* JADX INFO: renamed from: e */
    public final boolean f70709e;

    public yz7(String str, List list, List list2, LqTheme lqTheme, boolean z) {
        lqTheme.getClass();
        this.f70705a = str;
        this.f70706b = list;
        this.f70707c = list2;
        this.f70708d = lqTheme;
        this.f70709e = z;
    }

    /* JADX INFO: renamed from: a */
    public final LqTheme m25389a() {
        return this.f70708d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz7)) {
            return false;
        }
        yz7 yz7Var = (yz7) obj;
        return this.f70705a.equals(yz7Var.f70705a) && this.f70706b.equals(yz7Var.f70706b) && this.f70707c.equals(yz7Var.f70707c) && this.f70708d == yz7Var.f70708d && this.f70709e == yz7Var.f70709e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70709e) + ((this.f70708d.hashCode() + ux5.m22979b(ux5.m22979b(this.f70705a.hashCode() * 31, 31, this.f70706b), 31, this.f70707c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderTheme(id=");
        sb.append(this.f70705a);
        sb.append(", backgroundColors=");
        sb.append(this.f70706b);
        sb.append(", highlightColors=");
        sb.append(this.f70707c);
        sb.append(", theme=");
        sb.append(this.f70708d);
        sb.append(", useSystemColors=");
        return AbstractC3393o1.m17740o(sb, this.f70709e, ")");
    }
}
