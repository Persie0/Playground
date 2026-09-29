package p152hb;

import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import p326q.C8448d;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6001q extends AbstractDialogInterfaceOnCancelListenerC6018v1 {

    /* JADX INFO: renamed from: f */
    public final C8448d<C5949a<?>> f35575f;

    /* JADX INFO: renamed from: g */
    public final C5961d f35576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6001q(InterfaceC5968f interfaceC5968f, C5961d c5961d) {
        super(interfaceC5968f);
        Object obj = C2548c.f13919c;
        this.f35575f = new C8448d<>();
        this.f35576g = c5961d;
        interfaceC5968f.mo12394a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: f */
    public final void mo7576f() {
        if (!this.f35575f.isEmpty()) {
            this.f35576g.m12401a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: h */
    public final void mo7578h() {
        this.f35614b = true;
        if (this.f35575f.isEmpty()) {
            return;
        }
        this.f35576g.m12401a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: i */
    public final void mo7579i() {
        this.f35614b = false;
        C5961d c5961d = this.f35576g;
        c5961d.getClass();
        synchronized (C5961d.f35437M) {
            if (c5961d.f35452k == this) {
                c5961d.f35452k = null;
                c5961d.f35453l.clear();
            }
        }
    }

    @Override // p152hb.AbstractDialogInterfaceOnCancelListenerC6018v1
    /* JADX INFO: renamed from: j */
    public final void mo12450j(ConnectionResult connectionResult, int i10) {
        this.f35576g.m12405g(connectionResult, i10);
    }

    @Override // p152hb.AbstractDialogInterfaceOnCancelListenerC6018v1
    /* JADX INFO: renamed from: k */
    public final void mo12451k() {
        HandlerC9517f handlerC9517f = this.f35576g.f35440I;
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(3));
    }
}
