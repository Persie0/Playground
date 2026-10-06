package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmz extends kpu implements kpz {

    /* JADX INFO: renamed from: a */
    public final Object f36575a;

    /* JADX INFO: renamed from: b */
    public boolean f36576b;

    /* JADX INFO: renamed from: c */
    public int f36577c;

    /* JADX INFO: renamed from: d */
    private boolean f36578d;

    public kmz(kpz kpzVar) {
        super(kpzVar);
        this.f36575a = new Object();
        this.f36578d = false;
        this.f36577c = 0;
    }

    @Override // p000.kpu, p000.kpz, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36575a) {
            if (!this.f36578d && !this.f36576b) {
                this.f36576b = true;
                m14587j();
            }
        }
    }

    @Override // p000.kpu, p000.kpz
    /* JADX INFO: renamed from: f */
    public final kpw mo14511f() {
        kpw kpwVarMo14511f;
        synchronized (this.f36575a) {
            if (this.f36576b || this.f36578d || (kpwVarMo14511f = super.mo14511f()) == null) {
                return null;
            }
            this.f36577c++;
            return new kmy(this, kpwVarMo14511f);
        }
    }

    @Override // p000.kpu, p000.kpz
    /* JADX INFO: renamed from: g */
    public final kpw mo14512g() {
        kpw kpwVarMo14512g;
        synchronized (this.f36575a) {
            if (this.f36576b || this.f36578d || (kpwVarMo14512g = super.mo14512g()) == null) {
                return null;
            }
            this.f36577c++;
            return new kmy(this, kpwVarMo14512g);
        }
    }

    @Override // p000.kpu, p000.kpz
    /* JADX INFO: renamed from: i */
    public final void mo14514i(kpy kpyVar, Handler handler) {
        super.mo14514i(new kmx(this, kpyVar), handler);
    }

    /* JADX INFO: renamed from: j */
    public final void m14587j() {
        if (this.f36578d) {
            return;
        }
        if (this.f36577c == 0) {
            this.f36578d = true;
            super.close();
        } else {
            kpw kpwVarMo14511f = super.mo14511f();
            if (kpwVarMo14511f != null) {
                kpwVarMo14511f.close();
            }
            mo14513h();
        }
    }
}
