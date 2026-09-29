package p000;

import androidx.compose.p002ui.text.style.ResolvedTextDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ou8 {

    /* JADX INFO: renamed from: a */
    public final ResolvedTextDirection f55004a;

    /* JADX INFO: renamed from: b */
    public final int f55005b;

    /* JADX INFO: renamed from: c */
    public final long f55006c;

    public ou8(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.f55004a = resolvedTextDirection;
        this.f55005b = i;
        this.f55006c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou8)) {
            return false;
        }
        ou8 ou8Var = (ou8) obj;
        return this.f55004a == ou8Var.f55004a && this.f55005b == ou8Var.f55005b && this.f55006c == ou8Var.f55006c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55006c) + wq1.m24106b(this.f55005b, this.f55004a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f55004a + ", offset=" + this.f55005b + ", selectableId=" + this.f55006c + ')';
    }
}
