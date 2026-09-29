package androidx.compose.foundation.text.contextmenu.modifier;

import p000.at9;
import p000.bt9;
import p000.cg7;
import p000.ct9;
import p000.ea2;
import p000.et9;
import p000.f66;
import p000.h66;
import p000.mt9;
import p000.qba;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0173b {
    /* JADX INFO: renamed from: a */
    public static final ct9 m1065a(ea2 ea2Var) {
        mt9 mt9Var;
        at9 at9Var = new at9();
        qba.m19852d(ea2Var, et9.f37831a, new cg7(new cg7(at9Var, 25), new TextContextMenuModifierKt$collectTextContextMenuData$1$1(1, at9Var, at9.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0)));
        h66 h66Var = new h66();
        h66 h66Var2 = at9Var.f7472a;
        Object[] objArr = h66Var2.f1293a;
        int i = h66Var2.f1294b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        bt9 bt9Var = null;
        while (true) {
            mt9Var = mt9.f51831b;
            if (i3 >= i) {
                break;
            }
            bt9 bt9Var2 = (bt9) objArr[i3];
            if (!z || bt9Var2 != mt9Var) {
                if (bt9Var2 == mt9Var && bt9Var == mt9Var) {
                    z = false;
                } else {
                    if (bt9Var2 != mt9Var) {
                        h66 h66Var3 = at9Var.f7473b;
                        Object[] objArr2 = h66Var3.f1293a;
                        int i4 = h66Var3.f1294b;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (((Boolean) ((vi3) objArr2[i5]).invoke(bt9Var2)).booleanValue()) {
                                    i5++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    h66Var.m13090g(bt9Var2);
                    z = false;
                    bt9Var = bt9Var2;
                }
            }
            i3++;
        }
        if (((bt9) (h66Var.m719d() ? null : h66Var.f1293a[h66Var.f1294b - 1])) == mt9Var) {
            h66Var.m13095l(h66Var.f1294b - 1);
        }
        f66 f66Var = h66Var.f41838c;
        if (f66Var == null) {
            f66Var = new f66(h66Var, i2);
            h66Var.f41838c = f66Var;
        }
        return new ct9(f66Var);
    }
}
