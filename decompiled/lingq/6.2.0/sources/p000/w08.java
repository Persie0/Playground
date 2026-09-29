package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;

/* JADX INFO: loaded from: classes2.dex */
public final class w08 {

    /* JADX INFO: renamed from: a */
    public final boolean f66182a;

    /* JADX INFO: renamed from: b */
    public final boolean f66183b;

    /* JADX INFO: renamed from: c */
    public final boolean f66184c;

    /* JADX INFO: renamed from: d */
    public final boolean f66185d;

    /* JADX INFO: renamed from: e */
    public final AudioUnderlineMode f66186e;

    public w08(boolean z, boolean z2, boolean z3, boolean z4, AudioUnderlineMode audioUnderlineMode) {
        audioUnderlineMode.getClass();
        this.f66182a = z;
        this.f66183b = z2;
        this.f66184c = z3;
        this.f66185d = z4;
        this.f66186e = audioUnderlineMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w08)) {
            return false;
        }
        w08 w08Var = (w08) obj;
        return this.f66182a == w08Var.f66182a && this.f66183b == w08Var.f66183b && this.f66184c == w08Var.f66184c && this.f66185d == w08Var.f66185d && this.f66186e == w08Var.f66186e;
    }

    public final int hashCode() {
        return this.f66186e.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f66182a) * 31, 31, this.f66183b), 31, this.f66184c), 31, this.f66185d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ReadingPreferences(sentenceTranslation=", ", tapToPage=", ", statusBar=", this.f66182a, this.f66183b);
        wq1.m24101A(sbM13357g, this.f66184c, ", showVocabulary=", this.f66185d, ", audioUnderlineMode=");
        sbM13357g.append(this.f66186e);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
