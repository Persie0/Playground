package p000;

import com.lingq.core.domain.model.theme.TextHighlightStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ty9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final TextHighlightStyle f63100a;

    public ty9(TextHighlightStyle textHighlightStyle) {
        textHighlightStyle.getClass();
        this.f63100a = textHighlightStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty9) && this.f63100a == ((ty9) obj).f63100a;
    }

    public final int hashCode() {
        return this.f63100a.hashCode();
    }

    public final String toString() {
        return "UpdateTextHighlightStyle(textHighlightStyle=" + this.f63100a + ")";
    }
}
