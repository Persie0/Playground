package p000;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aop extends aei {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aoq f1912a;

    public aop(aoq aoqVar) {
        this.f1912a = aoqVar;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        this.f1912a.f1914e.mo326b(view, agtVar);
        int iM1251c = this.f1912a.f1913d.m1251c(view);
        AbstractC0806ls abstractC0806ls = this.f1912a.f1913d.f1123m;
        if (abstractC0806ls instanceof aoj) {
            ((aoj) abstractC0806ls).m1767j(iM1251c);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: h */
    public final boolean mo332h(View view, int i, Bundle bundle) {
        return this.f1912a.f1914e.mo332h(view, i, bundle);
    }
}
