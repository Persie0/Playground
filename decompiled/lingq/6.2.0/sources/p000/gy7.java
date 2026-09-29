package p000;

import com.lingq.core.domain.model.theme.TextHighlightStyle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gy7 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f41526a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f41527b;

    /* JADX INFO: renamed from: c */
    public final xz7 f41528c;

    /* JADX INFO: renamed from: d */
    public final xz7 f41529d;

    /* JADX INFO: renamed from: e */
    public final TextHighlightStyle f41530e;

    /* JADX INFO: renamed from: f */
    public final int f41531f;

    public gy7(ArrayList arrayList, ArrayList arrayList2, xz7 xz7Var, xz7 xz7Var2, TextHighlightStyle textHighlightStyle, int i) {
        this.f41526a = arrayList;
        this.f41527b = arrayList2;
        this.f41528c = xz7Var;
        this.f41529d = xz7Var2;
        this.f41530e = textHighlightStyle;
        this.f41531f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return this.f41526a.equals(gy7Var.f41526a) && this.f41527b.equals(gy7Var.f41527b) && fa4.m11650l(this.f41528c, gy7Var.f41528c) && fa4.m11650l(this.f41529d, gy7Var.f41529d) && this.f41530e == gy7Var.f41530e && this.f41531f == gy7Var.f41531f;
    }

    public final int hashCode() {
        int iHashCode = (this.f41527b.hashCode() + (this.f41526a.hashCode() * 31)) * 31;
        xz7 xz7Var = this.f41528c;
        int iHashCode2 = (iHashCode + (xz7Var == null ? 0 : xz7Var.hashCode())) * 31;
        xz7 xz7Var2 = this.f41529d;
        return Integer.hashCode(this.f41531f) + ((this.f41530e.hashCode() + ((iHashCode2 + (xz7Var2 != null ? xz7Var2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "TokensSpanData(wordsSpans=" + this.f41526a + ", cardsSpans=" + this.f41527b + ", tokenClicked=" + this.f41528c + ", phraseClicked=" + this.f41529d + ", style=" + this.f41530e + ", fontSize=" + this.f41531f + ")";
    }
}
