package com.lingq.core.p012ui.dragdrop;

import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.runtime.AbstractC0278f;
import p000.AbstractC3489q9;
import p000.qc9;
import p000.sc9;
import p000.t66;
import p000.un1;
import p000.wfb;
import p000.xc9;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.ui.dragdrop.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1919b {

    /* JADX INFO: renamed from: a */
    public final C0127b f23968a;

    /* JADX INFO: renamed from: b */
    public final un1 f23969b;

    /* JADX INFO: renamed from: c */
    public final zi3 f23970c;

    /* JADX INFO: renamed from: d */
    public final qc9 f23971d;

    /* JADX INFO: renamed from: e */
    public final sc9 f23972e;

    /* JADX INFO: renamed from: f */
    public final t66 f23973f;

    /* JADX INFO: renamed from: g */
    public final C0059a f23974g;

    /* JADX INFO: renamed from: h */
    public final t66 f23975h;

    /* JADX INFO: renamed from: i */
    public final t66 f23976i;

    public C1919b(C0127b c0127b, un1 un1Var, zi3 zi3Var) {
        c0127b.getClass();
        un1Var.getClass();
        zi3Var.getClass();
        this.f23968a = c0127b;
        this.f23969b = un1Var;
        this.f23970c = zi3Var;
        this.f23971d = AbstractC0278f.m1256f(0.0f);
        this.f23972e = AbstractC0278f.m1257g(0);
        this.f23973f = AbstractC0278f.m1260j(null);
        this.f23974g = AbstractC3489q9.m19771a(0.0f);
        this.f23975h = AbstractC0278f.m1260j(null);
        this.f23976i = AbstractC0278f.m1260j(null);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8797a() {
        return (Integer) ((xc9) this.f23976i).getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m8798b() {
        if (m8797a() != null) {
            ((xc9) this.f23973f).setValue(m8797a());
            wfb.m23926u(this.f23969b, null, null, new DragDropState$onDragInterrupted$1(this, null), 3);
        }
        this.f23972e.m21223i(0);
        this.f23971d.m19862i(0.0f);
        ((xc9) this.f23976i).setValue(null);
        ((xc9) this.f23975h).setValue(null);
    }
}
