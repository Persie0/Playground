package p000;

import androidx.compose.p002ui.focus.C0302d;

/* JADX INFO: loaded from: classes.dex */
public final class z93 {

    /* JADX INFO: renamed from: b */
    public static final z93 f71219b = new z93();

    /* JADX INFO: renamed from: c */
    public static final z93 f71220c = new z93();

    /* JADX INFO: renamed from: d */
    public static final z93 f71221d = new z93();

    /* JADX INFO: renamed from: a */
    public final x66 f71222a = new x66(new ba3[16]);

    /* JADX INFO: renamed from: a */
    public static void m25512a(z93 z93Var) {
        z93Var.getClass();
        if (z93Var == f71219b) {
            C3386nv.m17633t("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (z93Var == f71220c) {
            C3386nv.m17633t("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        x66 x66Var = z93Var.f71222a;
        int i = x66Var.f67832c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = x66Var.f67830a;
        for (int i2 = 0; i2 < i; i2++) {
            ea2 ea2Var = (ba3) objArr[i2];
            if (!((d16) ea2Var).f34837a.f34836I) {
                i54.m13663b("visitChildren called on an unattached node");
            }
            x66 x66Var2 = new x66(new d16[16]);
            d16 d16Var = ((d16) ea2Var).f34837a;
            d16 d16Var2 = d16Var.f34842f;
            if (d16Var2 == null) {
                te1.m21990d(x66Var2, d16Var);
            } else {
                x66Var2.m24305c(d16Var2);
            }
            while (true) {
                int i3 = x66Var2.f67832c;
                if (i3 == 0) {
                    break;
                }
                d16 d16VarM21992f = (d16) x66Var2.m24314l(i3 - 1);
                if ((d16VarM21992f.f34840d & 1024) == 0) {
                    te1.m21990d(x66Var2, d16VarM21992f);
                } else {
                    while (d16VarM21992f != null) {
                        if ((d16VarM21992f.f34839c & 1024) != 0) {
                            x66 x66Var3 = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof C0302d) {
                                    if (((C0302d) d16VarM21992f).m1375g1(7)) {
                                        break;
                                    }
                                } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i4 = 0;
                                    for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                        if ((d16Var3.f34839c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                d16VarM21992f = d16Var3;
                                            } else {
                                                if (x66Var3 == null) {
                                                    x66Var3 = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var3.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var3.m24305c(d16Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                d16VarM21992f = te1.m21992f(x66Var3);
                            }
                            break;
                        }
                        d16VarM21992f = d16VarM21992f.f34842f;
                    }
                }
            }
        }
    }
}
