package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class vq1 {

    /* JADX INFO: renamed from: a */
    public static final Charset f65777a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public abstract w20 mo23463a();

    /* JADX INFO: renamed from: b */
    public final x20 m23464b(long j, String str, boolean z) {
        w20 w20VarMo23463a = mo23463a();
        uq1 uq1Var = ((x20) this).f67665k;
        if (uq1Var != null) {
            f30 f30VarMo12307a = uq1Var.mo12307a();
            f30VarMo12307a.f38324e = Long.valueOf(j);
            f30VarMo12307a.f38325f = z;
            f30VarMo12307a.f38332m = (byte) (f30VarMo12307a.f38332m | 2);
            if (str != null) {
                fo2 fo2Var = new fo2(3);
                fo2Var.m11966e(str);
                f30VarMo12307a.f38327h = fo2Var.m11965a();
            }
            w20VarMo23463a.f66246j = f30VarMo12307a.m11510a();
        }
        return w20VarMo23463a.m23675a();
    }
}
