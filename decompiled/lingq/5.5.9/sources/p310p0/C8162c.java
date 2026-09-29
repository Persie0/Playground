package p310p0;

import android.view.ViewStructure;
import dm.C5207g;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8162c {

    /* JADX INFO: renamed from: a */
    public static final C8162c f44287a = new C8162c();

    /* JADX INFO: renamed from: a */
    public final int m16186a(ViewStructure viewStructure, int i10) {
        C5207g.m11111f(viewStructure, "structure");
        return viewStructure.addChildCount(i10);
    }

    /* JADX INFO: renamed from: b */
    public final ViewStructure m16187b(ViewStructure viewStructure, int i10) {
        C5207g.m11111f(viewStructure, "structure");
        return viewStructure.newChild(i10);
    }

    /* JADX INFO: renamed from: c */
    public final void m16188c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        C5207g.m11111f(viewStructure, "structure");
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    /* JADX INFO: renamed from: d */
    public final void m16189d(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        C5207g.m11111f(viewStructure, "structure");
        viewStructure.setId(i10, str, str2, str3);
    }
}
