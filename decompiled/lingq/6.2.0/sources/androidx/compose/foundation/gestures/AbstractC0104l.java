package androidx.compose.foundation.gestures;

import androidx.compose.runtime.AbstractC0278f;
import p000.aj3;
import p000.dpa;
import p000.e16;
import p000.el2;
import p000.gb0;
import p000.hl2;
import p000.t66;
import p000.tj3;
import p000.uea;
import p000.v56;
import p000.vi3;
import p000.we1;
import p000.ye1;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0104l {

    /* JADX INFO: renamed from: a */
    public static final aj3 f2286a = new DraggableKt$NoOpOnDragStarted$1(3, null);

    /* JADX INFO: renamed from: b */
    public static final aj3 f2287b = new DraggableKt$NoOpOnDragStopped$1(3, null);

    /* JADX INFO: renamed from: a */
    public static e16 m891a(hl2 hl2Var, Orientation orientation, boolean z, v56 v56Var, boolean z2, aj3 aj3Var, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            v56Var = null;
        }
        return new el2(hl2Var, orientation, z4, v56Var, (i & 16) != 0 ? false : z2, f2286a, aj3Var, (i & 128) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: b */
    public static final hl2 m892b(ye1 ye1Var, vi3 vi3Var) {
        t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, ye1Var);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            C0099g c0099g = new C0099g(new gb0(2, t66VarM1263m));
            tj3Var.m22131l0(c0099g);
            objM22097O = c0099g;
        }
        return (hl2) objM22097O;
    }

    /* JADX INFO: renamed from: c */
    public static final long m893c(long j) {
        return uea.m22716a(Float.isNaN(dpa.m10571b(j)) ? 0.0f : dpa.m10571b(j), Float.isNaN(dpa.m10572c(j)) ? 0.0f : dpa.m10572c(j));
    }
}
