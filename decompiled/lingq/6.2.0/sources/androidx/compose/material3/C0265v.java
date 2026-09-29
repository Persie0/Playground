package androidx.compose.material3;

import android.view.KeyEvent;
import p000.bi4;
import p000.chd;
import p000.dhd;
import p000.rh4;
import p000.un1;
import p000.vi3;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.material3.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C0265v implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0253l f3633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f3634b;

    public C0265v(C0253l c0253l, un1 un1Var) {
        this.f3633a = c0253l;
        this.f3634b = un1Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((bi4) obj).f8562a;
        C0253l c0253l = this.f3633a;
        if (!c0253l.m1182c() || chd.m4668b(keyEvent) != 1 || !rh4.m20661a(dhd.m10397a(keyEvent.getKeyCode()), rh4.f59301u)) {
            return Boolean.FALSE;
        }
        wfb.m23926u(this.f3634b, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$5$1$1(c0253l, null), 3);
        return Boolean.TRUE;
    }
}
