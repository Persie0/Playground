package p000;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mgz extends aei {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mhc f40470a;

    public mgz(mhc mhcVar) {
        this.f40470a = mhcVar;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        if (!this.f40470a.f40480d) {
            agtVar.m635m(false);
        } else {
            agtVar.m627e(1048576);
            agtVar.m635m(true);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: h */
    public final boolean mo332h(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            mhc mhcVar = this.f40470a;
            if (mhcVar.f40480d) {
                mhcVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.mo332h(view, i, bundle);
    }
}
