package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.C0357g;
import p000.C3386nv;
import p000.kf1;
import p000.sm9;
import p000.wq4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.layout.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0345l {

    /* JADX INFO: renamed from: a */
    public final sm9 f4218a;

    /* JADX INFO: renamed from: b */
    public C0339f f4219b;

    /* JADX INFO: renamed from: c */
    public final zi3 f4220c = new zi3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            C0357g c0357g = (C0357g) obj;
            C0345l c0345l = this.f4176b;
            sm9 sm9Var = c0345l.f4218a;
            C0339f c0339f = c0357g.f4339c0;
            if (c0339f == null) {
                c0339f = new C0339f(c0357g, sm9Var);
                c0357g.f4339c0 = c0339f;
            }
            c0345l.f4219b = c0339f;
            c0345l.m1531a().m1501h();
            C0339f c0339fM1531a = c0345l.m1531a();
            if (c0339fM1531a.f4195c != sm9Var) {
                c0339fM1531a.f4195c = sm9Var;
                c0339fM1531a.m1503j(false);
                C0357g.m1555b0(c0339fM1531a.f4193a, false, 7);
            }
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: d */
    public final zi3 f4221d = new zi3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            this.f4174b.m1531a().f4194b = (kf1) obj2;
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: e */
    public final zi3 f4222e = new zi3() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            C0339f c0339fM1531a = this.f4175b.m1531a();
            ((C0357g) obj).m1594i0(new wq4(c0339fM1531a, (zi3) obj2, c0339fM1531a.f4192K));
            return xfa.f68157a;
        }
    };

    public C0345l(sm9 sm9Var) {
        this.f4218a = sm9Var;
    }

    /* JADX INFO: renamed from: a */
    public final C0339f m1531a() {
        C0339f c0339f = this.f4219b;
        if (c0339f != null) {
            return c0339f;
        }
        C3386nv.m17626m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
