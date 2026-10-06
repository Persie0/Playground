package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzt implements bzy, bzw {

    /* JADX INFO: renamed from: a */
    public volatile bzw f4855a;

    /* JADX INFO: renamed from: b */
    public volatile bzw f4856b;

    /* JADX INFO: renamed from: c */
    private final Object f4857c;

    /* JADX INFO: renamed from: d */
    private final bzy f4858d;

    /* JADX INFO: renamed from: e */
    private bzx f4859e = bzx.CLEARED;

    /* JADX INFO: renamed from: f */
    private bzx f4860f = bzx.CLEARED;

    public bzt(Object obj, bzy bzyVar) {
        this.f4857c = obj;
        this.f4858d = bzyVar;
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: a */
    public final bzy mo3321a() {
        bzy bzyVarMo3321a;
        synchronized (this.f4857c) {
            bzy bzyVar = this.f4858d;
            bzyVarMo3321a = bzyVar != null ? bzyVar.mo3321a() : this;
        }
        return bzyVarMo3321a;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: b */
    public final void mo3322b() {
        synchronized (this.f4857c) {
            if (this.f4859e != bzx.RUNNING) {
                this.f4859e = bzx.RUNNING;
                this.f4855a.mo3322b();
            }
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: c */
    public final void mo3323c() {
        synchronized (this.f4857c) {
            this.f4859e = bzx.CLEARED;
            this.f4855a.mo3323c();
            bzx bzxVar = this.f4860f;
            bzx bzxVar2 = bzx.CLEARED;
            if (bzxVar != bzxVar2) {
                this.f4860f = bzxVar2;
                this.f4856b.mo3323c();
            }
        }
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: d */
    public final void mo3324d(bzw bzwVar) {
        synchronized (this.f4857c) {
            if (bzwVar.equals(this.f4856b)) {
                this.f4860f = bzx.FAILED;
                bzy bzyVar = this.f4858d;
                if (bzyVar != null) {
                    bzyVar.mo3324d(this);
                }
                return;
            }
            this.f4859e = bzx.FAILED;
            bzx bzxVar = this.f4860f;
            bzx bzxVar2 = bzx.RUNNING;
            if (bzxVar != bzxVar2) {
                this.f4860f = bzxVar2;
                this.f4856b.mo3322b();
            }
        }
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: e */
    public final void mo3325e(bzw bzwVar) {
        synchronized (this.f4857c) {
            if (bzwVar.equals(this.f4855a)) {
                this.f4859e = bzx.SUCCESS;
            } else if (bzwVar.equals(this.f4856b)) {
                this.f4860f = bzx.SUCCESS;
            }
            bzy bzyVar = this.f4858d;
            if (bzyVar != null) {
                bzyVar.mo3325e(this);
            }
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: f */
    public final void mo3326f() {
        synchronized (this.f4857c) {
            if (this.f4859e == bzx.RUNNING) {
                this.f4859e = bzx.PAUSED;
                this.f4855a.mo3326f();
            }
            if (this.f4860f == bzx.RUNNING) {
                this.f4860f = bzx.PAUSED;
                this.f4856b.mo3326f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // p000.bzy
    /* JADX INFO: renamed from: g */
    public final boolean mo3327g(bzw bzwVar) {
        boolean z;
        synchronized (this.f4857c) {
            bzy bzyVar = this.f4858d;
            z = false;
            if (bzyVar == null || bzyVar.mo3327g(this)) {
                if (bzwVar.equals(this.f4855a)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    @Override // p000.bzy
    /* JADX INFO: renamed from: h */
    public final boolean mo3328h(bzw bzwVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.f4857c) {
            bzy bzyVar = this.f4858d;
            z = false;
            if (bzyVar == null || bzyVar.mo3328h(this)) {
                if (this.f4859e != bzx.FAILED) {
                    zEquals = bzwVar.equals(this.f4855a);
                } else if (bzwVar.equals(this.f4856b)) {
                    bzx bzxVar = this.f4860f;
                    if (bzxVar == bzx.SUCCESS) {
                        zEquals = true;
                    } else if (bzxVar == bzx.FAILED) {
                        z = true;
                    } else {
                        zEquals = false;
                    }
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: i */
    public final boolean mo3329i(bzw bzwVar) {
        boolean z;
        synchronized (this.f4857c) {
            bzy bzyVar = this.f4858d;
            z = true;
            if (bzyVar != null && !bzyVar.mo3329i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.bzy, p000.bzw
    /* JADX INFO: renamed from: j */
    public final boolean mo3330j() {
        boolean z;
        synchronized (this.f4857c) {
            z = true;
            if (!this.f4855a.mo3330j() && !this.f4856b.mo3330j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: k */
    public final boolean mo3331k() {
        boolean z;
        synchronized (this.f4857c) {
            z = false;
            if (this.f4859e == bzx.CLEARED && this.f4860f == bzx.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: l */
    public final boolean mo3332l() {
        boolean z;
        synchronized (this.f4857c) {
            z = true;
            if (this.f4859e != bzx.SUCCESS && this.f4860f != bzx.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: m */
    public final boolean mo3333m(bzw bzwVar) {
        if (bzwVar instanceof bzt) {
            bzt bztVar = (bzt) bzwVar;
            if (this.f4855a.mo3333m(bztVar.f4855a) && this.f4856b.mo3333m(bztVar.f4856b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: n */
    public final boolean mo3334n() {
        boolean z;
        synchronized (this.f4857c) {
            z = true;
            if (this.f4859e != bzx.RUNNING && this.f4860f != bzx.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
