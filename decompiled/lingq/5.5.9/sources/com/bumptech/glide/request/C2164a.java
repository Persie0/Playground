package com.bumptech.glide.request;

import p171i6.InterfaceC6199d;

/* JADX INFO: renamed from: com.bumptech.glide.request.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2164a implements RequestCoordinator, InterfaceC6199d {

    /* JADX INFO: renamed from: a */
    public final Object f10928a;

    /* JADX INFO: renamed from: b */
    public final RequestCoordinator f10929b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC6199d f10930c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC6199d f10931d;

    /* JADX INFO: renamed from: e */
    public RequestCoordinator.RequestState f10932e;

    /* JADX INFO: renamed from: f */
    public RequestCoordinator.RequestState f10933f;

    public C2164a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f10932e = requestState;
        this.f10933f = requestState;
        this.f10928a = obj;
        this.f10929b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: a */
    public final boolean mo6381a() {
        boolean z10;
        synchronized (this.f10928a) {
            z10 = this.f10930c.mo6381a() || this.f10931d.mo6381a();
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: b */
    public final void mo6382b(InterfaceC6199d interfaceC6199d) {
        synchronized (this.f10928a) {
            if (interfaceC6199d.equals(this.f10930c)) {
                this.f10932e = RequestCoordinator.RequestState.SUCCESS;
            } else if (interfaceC6199d.equals(this.f10931d)) {
                this.f10933f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f10929b;
            if (requestCoordinator != null) {
                requestCoordinator.mo6382b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public final RequestCoordinator mo6383c() {
        RequestCoordinator requestCoordinatorMo6383c;
        synchronized (this.f10928a) {
            RequestCoordinator requestCoordinator = this.f10929b;
            requestCoordinatorMo6383c = requestCoordinator != null ? requestCoordinator.mo6383c() : this;
        }
        return requestCoordinatorMo6383c;
    }

    @Override // p171i6.InterfaceC6199d
    public final void clear() {
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f10932e = requestState;
            this.f10930c.clear();
            if (this.f10933f != requestState) {
                this.f10933f = requestState;
                this.f10931d.clear();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public final void mo6384d(InterfaceC6199d interfaceC6199d) {
        synchronized (this.f10928a) {
            if (interfaceC6199d.equals(this.f10931d)) {
                this.f10933f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f10929b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo6384d(this);
                }
                return;
            }
            this.f10932e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f10933f;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f10933f = requestState2;
                this.f10931d.mo6396j();
            }
        }
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: e */
    public final boolean mo6391e(InterfaceC6199d interfaceC6199d) {
        boolean z10 = false;
        if (interfaceC6199d instanceof C2164a) {
            C2164a c2164a = (C2164a) interfaceC6199d;
            if (this.f10930c.mo6391e(c2164a.f10930c) && this.f10931d.mo6391e(c2164a.f10931d)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public final boolean mo6385f(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        boolean zEquals;
        RequestCoordinator.RequestState requestState;
        synchronized (this.f10928a) {
            RequestCoordinator requestCoordinator = this.f10929b;
            z10 = false;
            if (requestCoordinator == null || requestCoordinator.mo6385f(this)) {
                RequestCoordinator.RequestState requestState2 = this.f10932e;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3) {
                    zEquals = interfaceC6199d.equals(this.f10930c);
                } else {
                    zEquals = interfaceC6199d.equals(this.f10931d) && ((requestState = this.f10933f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
                }
                if (zEquals) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: g */
    public final boolean mo6386g(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        synchronized (this.f10928a) {
            RequestCoordinator requestCoordinator = this.f10929b;
            z10 = requestCoordinator == null || requestCoordinator.mo6386g(this);
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: h */
    public final boolean mo6387h(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        synchronized (this.f10928a) {
            RequestCoordinator requestCoordinator = this.f10929b;
            z10 = false;
            if ((requestCoordinator == null || requestCoordinator.mo6387h(this)) && interfaceC6199d.equals(this.f10930c)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: i */
    public final boolean mo6395i() {
        boolean z10;
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = this.f10932e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z10 = requestState == requestState2 && this.f10933f == requestState2;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = this.f10932e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z10 = requestState == requestState2 || this.f10933f == requestState2;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: j */
    public final void mo6396j() {
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = this.f10932e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f10932e = requestState2;
                this.f10930c.mo6396j();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: k */
    public final boolean mo6397k() {
        boolean z10;
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = this.f10932e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z10 = requestState == requestState2 || this.f10933f == requestState2;
        }
        return z10;
    }

    @Override // p171i6.InterfaceC6199d
    public final void pause() {
        synchronized (this.f10928a) {
            RequestCoordinator.RequestState requestState = this.f10932e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f10932e = RequestCoordinator.RequestState.PAUSED;
                this.f10930c.pause();
            }
            if (this.f10933f == requestState2) {
                this.f10933f = RequestCoordinator.RequestState.PAUSED;
                this.f10931d.pause();
            }
        }
    }
}
