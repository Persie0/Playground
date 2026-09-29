package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1166q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165p.f f7451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1165p f7452b;

    public RunnableC1166q(C1165p c1165p, C1165p.f fVar, int i10) {
        this.f7452b = c1165p;
        this.f7451a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1165p c1165p = this.f7452b;
        RecyclerView recyclerView = c1165p.f7420r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        C1165p.f fVar = this.f7451a;
        if (fVar.f7448k) {
            return;
        }
        RecyclerView.AbstractC1109b0 abstractC1109b0 = fVar.f7442e;
        if (abstractC1109b0.m4240c() != -1) {
            RecyclerView.AbstractC1117j itemAnimator = c1165p.f7420r.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.mo4278g()) {
                ArrayList arrayList = c1165p.f7418p;
                int size = arrayList.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    if (!((C1165p.f) arrayList.get(i10)).f7449l) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    c1165p.f7415m.mo4525f(abstractC1109b0);
                    return;
                }
            }
            c1165p.f7420r.post(this);
        }
    }
}
