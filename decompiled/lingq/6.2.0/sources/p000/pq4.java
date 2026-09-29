package p000;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.Owner;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq4 {

    /* JADX INFO: renamed from: a */
    public static final ib2 f56676a = vz1.m23621b();

    /* JADX INFO: renamed from: a */
    public static final Owner m19457a(C0357g c0357g) {
        Owner owner = c0357g.f4316I;
        if (owner != null) {
            return owner;
        }
        throw AbstractC3393o1.m17745t("LayoutNode should be attached to an owner");
    }
}
