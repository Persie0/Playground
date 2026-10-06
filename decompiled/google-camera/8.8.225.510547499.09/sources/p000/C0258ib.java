package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: ib */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0258ib extends C0237hh {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0259ic f30193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258ib(C0259ic c0259ic, Context context, C0225gw c0225gw, View view) {
        super(context, c0225gw, view, true);
        this.f30193d = c0259ic;
        this.f27772b = 8388613;
        m10278e(c0259ic.f30287l);
    }

    @Override // p000.C0237hh
    /* JADX INFO: renamed from: c */
    public final void mo10276c() {
        C0225gw c0225gw = this.f30193d.f25573c;
        if (c0225gw != null) {
            c0225gw.close();
        }
        this.f30193d.f30284i = null;
        super.mo10276c();
    }
}
