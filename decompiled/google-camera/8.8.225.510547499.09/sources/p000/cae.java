package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cae implements bzy, bzw {

    /* JADX INFO: renamed from: a */
    public volatile bzw f4908a;

    /* JADX INFO: renamed from: b */
    public volatile bzw f4909b;

    /* JADX INFO: renamed from: c */
    private final bzy f4910c;

    /* JADX INFO: renamed from: d */
    private final Object f4911d;

    /* JADX INFO: renamed from: e */
    private bzx f4912e = bzx.CLEARED;

    /* JADX INFO: renamed from: f */
    private bzx f4913f = bzx.CLEARED;

    /* JADX INFO: renamed from: g */
    private boolean f4914g;

    public cae(Object obj, bzy bzyVar) {
        this.f4911d = obj;
        this.f4910c = bzyVar;
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: a */
    public final bzy mo3321a() {
        bzy bzyVarMo3321a;
        synchronized (this.f4911d) {
            bzy bzyVar = this.f4910c;
            bzyVarMo3321a = bzyVar != null ? bzyVar.mo3321a() : this;
        }
        return bzyVarMo3321a;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: b */
    public final void mo3322b() {
        synchronized (this.f4911d) {
            this.f4914g = true;
            try {
                if (this.f4912e != bzx.SUCCESS) {
                    bzx bzxVar = this.f4913f;
                    bzx bzxVar2 = bzx.RUNNING;
                    if (bzxVar != bzxVar2) {
                        this.f4913f = bzxVar2;
                        this.f4909b.mo3322b();
                    }
                }
                if (this.f4914g) {
                    bzx bzxVar3 = this.f4912e;
                    bzx bzxVar4 = bzx.RUNNING;
                    if (bzxVar3 != bzxVar4) {
                        this.f4912e = bzxVar4;
                        this.f4908a.mo3322b();
                    }
                }
                this.f4914g = false;
            } catch (Throwable th) {
                this.f4914g = false;
                throw th;
            }
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: c */
    public final void mo3323c() {
        synchronized (this.f4911d) {
            this.f4914g = false;
            this.f4912e = bzx.CLEARED;
            this.f4913f = bzx.CLEARED;
            this.f4909b.mo3323c();
            this.f4908a.mo3323c();
        }
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: d */
    public final void mo3324d(bzw bzwVar) {
        synchronized (this.f4911d) {
            if (!bzwVar.equals(this.f4908a)) {
                this.f4913f = bzx.FAILED;
                return;
            }
            this.f4912e = bzx.FAILED;
            bzy bzyVar = this.f4910c;
            if (bzyVar != null) {
                bzyVar.mo3324d(this);
            }
        }
    }

    @Override // p000.bzy
    /* JADX INFO: renamed from: e */
    public final void mo3325e(bzw bzwVar) {
        synchronized (this.f4911d) {
            if (bzwVar.equals(this.f4909b)) {
                this.f4913f = bzx.SUCCESS;
                return;
            }
            this.f4912e = bzx.SUCCESS;
            bzy bzyVar = this.f4910c;
            if (bzyVar != null) {
                bzyVar.mo3325e(this);
            }
            if (!this.f4913f.f4867f) {
                this.f4909b.mo3323c();
            }
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: f */
    public final void mo3326f() {
        synchronized (this.f4911d) {
            if (!this.f4913f.f4867f) {
                this.f4913f = bzx.PAUSED;
                this.f4909b.mo3326f();
            }
            if (!this.f4912e.f4867f) {
                this.f4912e = bzx.PAUSED;
                this.f4908a.mo3326f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // p000.bzy
    /* JADX INFO: renamed from: g */
    public final boolean mo3327g(bzw bzwVar) {
        boolean z;
        synchronized (this.f4911d) {
            bzy bzyVar = this.f4910c;
            z = false;
            if (bzyVar == null || bzyVar.mo3327g(this)) {
                if (bzwVar.equals(this.f4908a) && this.f4912e != bzx.PAUSED) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // p000.bzy
    /* JADX INFO: renamed from: h */
    public final boolean mo3328h(bzw bzwVar) {
        boolean z;
        synchronized (this.f4911d) {
            bzy bzyVar = this.f4910c;
            z = false;
            if (bzyVar == null || bzyVar.mo3328h(this)) {
                if (bzwVar.equals(this.f4908a) && !mo3330j()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // p000.bzy
    /* JADX INFO: renamed from: i */
    public final boolean mo3329i(bzw bzwVar) {
        boolean z;
        synchronized (this.f4911d) {
            bzy bzyVar = this.f4910c;
            z = false;
            if (bzyVar == null || bzyVar.mo3329i(this)) {
                if (bzwVar.equals(this.f4908a) || this.f4912e != bzx.SUCCESS) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.bzy, p000.bzw
    /* JADX INFO: renamed from: j */
    public final boolean mo3330j() {
        boolean z;
        synchronized (this.f4911d) {
            z = true;
            if (!this.f4909b.mo3330j() && !this.f4908a.mo3330j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: k */
    public final boolean mo3331k() {
        boolean z;
        synchronized (this.f4911d) {
            z = this.f4912e == bzx.CLEARED;
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: l */
    public final boolean mo3332l() {
        boolean z;
        synchronized (this.f4911d) {
            z = this.f4912e == bzx.SUCCESS;
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: m */
    public final boolean mo3333m(bzw bzwVar) {
        if (!(bzwVar instanceof cae)) {
            return false;
        }
        cae caeVar = (cae) bzwVar;
        if (this.f4908a != null ? this.f4908a.mo3333m(caeVar.f4908a) : caeVar.f4908a == null) {
            if (this.f4909b == null) {
                if (caeVar.f4909b == null) {
                    return true;
                }
            } else if (this.f4909b.mo3333m(caeVar.f4909b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: n */
    public final boolean mo3334n() {
        boolean z;
        synchronized (this.f4911d) {
            z = this.f4912e == bzx.RUNNING;
        }
        return z;
    }
}
