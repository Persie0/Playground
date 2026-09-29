package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class smb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61028a = new C0282a(2011019233, false, new z70(5));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61029b = new C0282a(-1381027485, false, new z70(6));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61030c = new C0282a(-355357272, false, new jx0(14));

    /* JADX INFO: renamed from: a */
    public static final void m21484a(Exception exc, pj5 pj5Var, String str) {
        pj5Var.getClass();
        String message = exc.getMessage();
        if (message != null) {
            pj5Var.mo16255a(str + ": " + message);
        }
        if (exc.getStackTrace() != null) {
            pj5Var.mo16255a("Stack trace: ".concat(lda.m16112L(exc)));
        }
    }
}
