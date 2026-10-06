package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: hy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0254hy extends C0237hh {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0259ic f29891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254hy(C0259ic c0259ic, Context context, SubMenuC0246hq subMenuC0246hq, View view) {
        super(context, subMenuC0246hq, view, false);
        this.f29891d = c0259ic;
        if (!subMenuC0246hq.f29025k.m9958o()) {
            View view2 = c0259ic.f30282g;
            this.f27771a = view2 == null ? (View) c0259ic.f25576f : view2;
        }
        m10278e(c0259ic.f30287l);
    }

    @Override // p000.C0237hh
    /* JADX INFO: renamed from: c */
    public final void mo10276c() {
        this.f29891d.f30285j = null;
        super.mo10276c();
    }
}
