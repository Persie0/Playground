package p000;

import com.lingq.core.domain.model.reader.ReaderPageMode;

/* JADX INFO: loaded from: classes2.dex */
public final class kz9 {

    /* JADX INFO: renamed from: a */
    public final vs3 f48821a;

    /* JADX INFO: renamed from: b */
    public final vj2 f48822b;

    /* JADX INFO: renamed from: c */
    public final boolean f48823c;

    /* JADX INFO: renamed from: d */
    public final boolean f48824d;

    /* JADX INFO: renamed from: e */
    public final ReaderPageMode f48825e;

    public kz9(vs3 vs3Var, vj2 vj2Var, boolean z, boolean z2, ReaderPageMode readerPageMode) {
        vs3Var.getClass();
        vj2Var.getClass();
        readerPageMode.getClass();
        this.f48821a = vs3Var;
        this.f48822b = vj2Var;
        this.f48823c = z;
        this.f48824d = z2;
        this.f48825e = readerPageMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz9)) {
            return false;
        }
        kz9 kz9Var = (kz9) obj;
        return fa4.m11650l(this.f48821a, kz9Var.f48821a) && fa4.m11650l(this.f48822b, kz9Var.f48822b) && this.f48823c == kz9Var.f48823c && this.f48824d == kz9Var.f48824d && this.f48825e == kz9Var.f48825e;
    }

    public final int hashCode() {
        return this.f48825e.hashCode() + g9a.m12428e(g9a.m12428e((this.f48822b.hashCode() + (this.f48821a.hashCode() * 31)) * 31, 31, this.f48823c), 31, this.f48824d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderUiSettings(colorScheme=");
        sb.append(this.f48821a);
        sb.append(", downloadFontState=");
        sb.append(this.f48822b);
        sb.append(", hasScripting=");
        wq1.m24101A(sb, this.f48823c, ", dockTokenPopup=", this.f48824d, ", pageViewMode=");
        sb.append(this.f48825e);
        sb.append(")");
        return sb.toString();
    }
}
