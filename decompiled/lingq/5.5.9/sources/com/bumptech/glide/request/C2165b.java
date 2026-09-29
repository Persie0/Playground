package com.bumptech.glide.request;

import p171i6.InterfaceC6199d;

/* JADX INFO: renamed from: com.bumptech.glide.request.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2165b implements RequestCoordinator, InterfaceC6199d {

    /* JADX INFO: renamed from: a */
    public final RequestCoordinator f10934a;

    /* JADX INFO: renamed from: b */
    public final Object f10935b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC6199d f10936c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC6199d f10937d;

    /* JADX INFO: renamed from: e */
    public RequestCoordinator.RequestState f10938e;

    /* JADX INFO: renamed from: f */
    public RequestCoordinator.RequestState f10939f;

    /* JADX INFO: renamed from: g */
    public boolean f10940g;

    public C2165b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f10938e = requestState;
        this.f10939f = requestState;
        this.f10935b = obj;
        this.f10934a = requestCoordinator;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator, p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: a */
    public final boolean mo6381a() {
        boolean z10;
        synchronized (this.f10935b) {
            z10 = this.f10937d.mo6381a() || this.f10936c.mo6381a();
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: b */
    public final void mo6382b(InterfaceC6199d interfaceC6199d) {
        synchronized (this.f10935b) {
            if (interfaceC6199d.equals(this.f10937d)) {
                this.f10939f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f10938e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f10934a;
            if (requestCoordinator != null) {
                requestCoordinator.mo6382b(this);
            }
            if (!this.f10939f.isComplete()) {
                this.f10937d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public final RequestCoordinator mo6383c() {
        RequestCoordinator requestCoordinatorMo6383c;
        synchronized (this.f10935b) {
            RequestCoordinator requestCoordinator = this.f10934a;
            requestCoordinatorMo6383c = requestCoordinator != null ? requestCoordinator.mo6383c() : this;
        }
        return requestCoordinatorMo6383c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    public final void clear() {
        synchronized (this.f10935b) {
            this.f10940g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f10938e = requestState;
            this.f10939f = requestState;
            this.f10937d.clear();
            this.f10936c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public final void mo6384d(InterfaceC6199d interfaceC6199d) {
        synchronized (this.f10935b) {
            if (!interfaceC6199d.equals(this.f10936c)) {
                this.f10939f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f10938e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f10934a;
            if (requestCoordinator != null) {
                requestCoordinator.mo6384d(this);
            }
        }
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: e */
    public final boolean mo6391e(InterfaceC6199d interfaceC6199d) {
        boolean z10 = false;
        if (interfaceC6199d instanceof C2165b) {
            C2165b c2165b = (C2165b) interfaceC6199d;
            if (this.f10936c != null ? this.f10936c.mo6391e(c2165b.f10936c) : c2165b.f10936c == null) {
                if (this.f10937d == null) {
                    if (c2165b.f10937d == null) {
                        z10 = true;
                    }
                } else if (this.f10937d.mo6391e(c2165b.f10937d)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public final boolean mo6385f(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        synchronized (this.f10935b) {
            RequestCoordinator requestCoordinator = this.f10934a;
            z10 = false;
            if ((requestCoordinator == null || requestCoordinator.mo6385f(this)) && interfaceC6199d.equals(this.f10936c) && !mo6381a()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: g */
    public final boolean mo6386g(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        synchronized (this.f10935b) {
            RequestCoordinator requestCoordinator = this.f10934a;
            z10 = false;
            if ((requestCoordinator == null || requestCoordinator.mo6386g(this)) && (interfaceC6199d.equals(this.f10936c) || this.f10938e != RequestCoordinator.RequestState.SUCCESS)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: h */
    public final boolean mo6387h(InterfaceC6199d interfaceC6199d) {
        boolean z10;
        synchronized (this.f10935b) {
            RequestCoordinator requestCoordinator = this.f10934a;
            z10 = false;
            if ((requestCoordinator == null || requestCoordinator.mo6387h(this)) && interfaceC6199d.equals(this.f10936c) && this.f10938e != RequestCoordinator.RequestState.PAUSED) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: i */
    public final boolean mo6395i() {
        boolean z10;
        synchronized (this.f10935b) {
            z10 = this.f10938e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // p171i6.InterfaceC6199d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f10935b) {
            z10 = this.f10938e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: j */
    public final void mo6396j() {
        synchronized (this.f10935b) {
            this.f10940g = true;
            try {
                if (this.f10938e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f10939f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f10939f = requestState2;
                        this.f10937d.mo6396j();
                    }
                }
                if (this.f10940g) {
                    RequestCoordinator.RequestState requestState3 = this.f10938e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f10938e = requestState4;
                        this.f10936c.mo6396j();
                    }
                }
                this.f10940g = false;
            } catch (Throwable th2) {
                this.f10940g = false;
                throw th2;
            }
        }
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: k */
    public final boolean mo6397k() {
        boolean z10;
        synchronized (this.f10935b) {
            z10 = this.f10938e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // p171i6.InterfaceC6199d
    public final void pause() {
        synchronized (this.f10935b) {
            if (!this.f10939f.isComplete()) {
                this.f10939f = RequestCoordinator.RequestState.PAUSED;
                this.f10937d.pause();
            }
            if (!this.f10938e.isComplete()) {
                this.f10938e = RequestCoordinator.RequestState.PAUSED;
                this.f10936c.pause();
            }
        }
    }
}
