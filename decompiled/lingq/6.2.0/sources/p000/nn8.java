package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.semantics.C0423c;

/* JADX INFO: loaded from: classes2.dex */
public final class nn8 {

    /* JADX INFO: renamed from: a */
    public final C0423c f53001a;

    /* JADX INFO: renamed from: b */
    public final int f53002b;

    /* JADX INFO: renamed from: c */
    public final j84 f53003c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0362l f53004d;

    public nn8(C0423c c0423c, int i, j84 j84Var, AbstractC0362l abstractC0362l) {
        this.f53001a = c0423c;
        this.f53002b = i;
        this.f53003c = j84Var;
        this.f53004d = abstractC0362l;
    }

    /* JADX INFO: renamed from: a */
    public final aq4 m17504a() {
        return this.f53004d;
    }

    /* JADX INFO: renamed from: b */
    public final C0423c m17505b() {
        return this.f53001a;
    }

    /* JADX INFO: renamed from: c */
    public final j84 m17506c() {
        return this.f53003c;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f53001a + ", depth=" + this.f53002b + ", viewportBoundsInWindow=" + this.f53003c + ", coordinates=" + this.f53004d + ')';
    }
}
