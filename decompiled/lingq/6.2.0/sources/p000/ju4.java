package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ju4 {

    /* JADX INFO: renamed from: a */
    public final int f46158a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f46159b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lu4 f46160c;

    public ju4(lu4 lu4Var, int i) {
        this.f46160c = lu4Var;
        this.f46158a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m14656a(int i) {
        lu4 lu4Var = this.f46160c;
        C3552rx c3552rx = lu4Var.f50141c;
        if (c3552rx == null) {
            return;
        }
        this.f46159b.add(new ej7(c3552rx, i, lu4Var.f50140b, null));
    }
}
