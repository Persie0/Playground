package androidx.compose.runtime;

import p000.a02;
import p000.ag1;
import p000.aoa;
import p000.fa4;
import p000.lw4;
import p000.tr3;
import p000.ui3;
import p000.wh9;
import p000.wn2;
import p000.xc9;
import p000.yc9;

/* JADX INFO: renamed from: androidx.compose.runtime.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0279g {

    /* JADX INFO: renamed from: a */
    public final lw4 f3741a;

    public AbstractC0279g(ui3 ui3Var) {
        this.f3741a = new lw4(ui3Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract a02 mo1265a(Object obj);

    /* JADX INFO: renamed from: b */
    public aoa mo1266b() {
        return this.f3741a;
    }

    /* JADX INFO: renamed from: c */
    public final aoa m1267c(a02 a02Var, aoa aoaVar) {
        wn2 wn2Var;
        aoa aoaVar2 = null;
        aoaVar2 = null;
        aoaVar2 = null;
        aoaVar2 = null;
        aoaVar2 = null;
        aoaVar2 = null;
        if (aoaVar instanceof wn2) {
            if (a02Var.f12b) {
                wn2Var = (wn2) aoaVar;
                ((xc9) wn2Var.f67091a).setValue(a02Var.m4c());
            }
        } else if (aoaVar instanceof wh9) {
            if ((a02Var.f11a || a02Var.f16f != null) && !a02Var.f12b) {
                wh9 wh9Var = (wh9) aoaVar;
                if (fa4.m11650l(a02Var.m4c(), wh9Var.f66834a)) {
                    aoaVar2 = wh9Var;
                }
            }
        } else if (aoaVar instanceof ag1) {
            a02Var.getClass();
        }
        if (aoaVar2 != null) {
            aoaVar2 = wn2Var;
            return aoaVar2;
        }
        if (!a02Var.f12b) {
            aoaVar2 = wn2Var;
            return new wh9(a02Var.m4c());
        }
        Object obj = a02Var.f16f;
        yc9 yc9Var = (yc9) a02Var.f15e;
        if (yc9Var == null) {
            aoaVar2 = wn2Var;
            yc9Var = tr3.f62761g;
        }
        aoaVar2 = wn2Var;
        return new wn2(new ParcelableSnapshotMutableState(obj, yc9Var));
    }
}
