package p000;

import com.lingq.core.domain.model.theme.TextHighlightStyle;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jz9 {

    /* JADX INFO: renamed from: a */
    public final Map f46435a;

    /* JADX INFO: renamed from: b */
    public final int f46436b;

    /* JADX INFO: renamed from: c */
    public final double f46437c;

    /* JADX INFO: renamed from: d */
    public final TextHighlightStyle f46438d;

    /* JADX INFO: renamed from: e */
    public final String f46439e;

    public jz9(Map map, int i, double d, TextHighlightStyle textHighlightStyle, String str) {
        map.getClass();
        textHighlightStyle.getClass();
        str.getClass();
        this.f46435a = map;
        this.f46436b = i;
        this.f46437c = d;
        this.f46438d = textHighlightStyle;
        this.f46439e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz9)) {
            return false;
        }
        jz9 jz9Var = (jz9) obj;
        return fa4.m11650l(this.f46435a, jz9Var.f46435a) && this.f46436b == jz9Var.f46436b && Double.compare(this.f46437c, jz9Var.f46437c) == 0 && this.f46438d == jz9Var.f46438d && fa4.m11650l(this.f46439e, jz9Var.f46439e);
    }

    public final int hashCode() {
        return this.f46439e.hashCode() + ((this.f46438d.hashCode() + g9a.m12424a(this.f46437c, wq1.m24106b(this.f46436b, this.f46435a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderSettings(font=");
        sb.append(this.f46435a);
        sb.append(", size=");
        sb.append(this.f46436b);
        sb.append(", lineHeight=");
        sb.append(this.f46437c);
        sb.append(", style=");
        sb.append(this.f46438d);
        return AbstractC3393o1.m17739n(sb, ", theme=", this.f46439e, ")");
    }
}
