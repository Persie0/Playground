package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class icz implements kba {

    /* JADX INFO: renamed from: a */
    private elx f30403a;

    /* JADX INFO: renamed from: h */
    public final Context f30404h;

    /* JADX INFO: renamed from: i */
    protected idb f30405i;

    /* JADX INFO: renamed from: j */
    protected boolean f30406j = false;

    protected icz(Context context) {
        this.f30404h = context;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m11102d();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m11102d() {
        this.f30406j = false;
        m11104f();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m11103e(elx elxVar) {
        this.f30403a = elxVar;
        this.f30406j = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m11104f() {
        elx elxVar;
        idb idbVar = this.f30405i;
        if (idbVar == null || (elxVar = this.f30403a) == null) {
            return;
        }
        elxVar.mo7485g(idbVar);
        this.f30405i = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m11105g(idb idbVar) {
        idb idbVar2;
        if (this.f30403a != null) {
            idb idbVar3 = this.f30405i;
            this.f30405i = idbVar;
            if (idbVar3 != null && !idbVar.equals(idbVar3)) {
                this.f30403a.mo7485g(idbVar3);
            }
            synchronized (this) {
                if (this.f30406j && (idbVar2 = this.f30405i) != null) {
                    this.f30403a.mo7482d(idbVar2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final idb m11106h(String str, int i, int i2) {
        boolean z;
        int i3;
        Context context = this.f30404h;
        if (i == -1) {
            z = true;
            i3 = 3000;
        } else {
            z = false;
            i3 = i;
        }
        return jpd.m13426g(z, i3, null, null, str, context, false, -1, i2);
    }
}
