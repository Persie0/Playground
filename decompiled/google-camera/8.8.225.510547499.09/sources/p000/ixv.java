package p000;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ixv extends C0830mp {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ixw f32611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixv(ixw ixwVar) {
        super(ixwVar);
        this.f32611d = ixwVar;
    }

    @Override // p000.C0830mp, p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        agtVar.m632j(true);
        agtVar.f355a.setLongClickable(false);
        agtVar.m642t(agr.f329e);
        agtVar.m628f(new agr(agr.f329e.m619a(), this.f32611d.f32618j));
    }

    @Override // p000.C0830mp, p000.aei
    /* JADX INFO: renamed from: h */
    public final boolean mo332h(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo332h(view, i, bundle);
        }
        Iterator it = this.f32611d.f32612d.f7485aa.iterator();
        while (it.hasNext()) {
            ((ixt) it.next()).m11876a();
        }
        return true;
    }
}
