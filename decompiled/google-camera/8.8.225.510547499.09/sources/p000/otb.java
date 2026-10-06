package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class otb extends otc implements oqy {
    private volatile otb _immediate;

    /* JADX INFO: renamed from: c */
    public final Handler f46511c;

    /* JADX INFO: renamed from: d */
    private final String f46512d;

    /* JADX INFO: renamed from: e */
    private final boolean f46513e;

    /* JADX INFO: renamed from: f */
    private final otb f46514f;

    public otb(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: renamed from: h */
    private final void m19024h(oly olyVar, Runnable runnable) {
        ooc.m18754t(olyVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ord.f46447b.mo18915d(olyVar, runnable);
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: a */
    public final void mo18944a(opx opxVar) {
        lll lllVar = new lll(opxVar, this, 11);
        if (this.f46511c.postDelayed(lllVar, 1000L)) {
            opxVar.mo18870a(new apk(this, lllVar, 2));
        } else {
            m19024h(((opy) opxVar).f46407b, lllVar);
        }
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        if (this.f46511c.post(runnable)) {
            return;
        }
        m19024h(olyVar, runnable);
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: e */
    public final boolean mo18916e(oly olyVar) {
        olyVar.getClass();
        return (this.f46513e && ooc.m18737c(Looper.myLooper(), this.f46511c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof otb) && ((otb) obj).f46511c == this.f46511c;
    }

    @Override // p000.otc, p000.oqy
    /* JADX INFO: renamed from: f */
    public final orf mo18940f(long j, Runnable runnable, oly olyVar) {
        olyVar.getClass();
        if (this.f46511c.postDelayed(runnable, j)) {
            return new ota(this, runnable);
        }
        m19024h(olyVar, runnable);
        return osl.f46497a;
    }

    @Override // p000.osi
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ osi mo19019g() {
        return this.f46514f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f46511c);
    }

    @Override // p000.osi, p000.oqo
    public final String toString() {
        String strM19018c = m19018c();
        if (strM19018c != null) {
            return strM19018c;
        }
        String string = this.f46512d;
        if (string == null) {
            string = this.f46511c.toString();
        }
        return this.f46513e ? String.valueOf(string).concat(".immediate") : string;
    }

    private otb(Handler handler, String str, boolean z) {
        this.f46511c = handler;
        this.f46512d = str;
        this.f46513e = z;
        this._immediate = true != z ? null : this;
        otb otbVar = this._immediate;
        if (otbVar == null) {
            otbVar = new otb(handler, str, true);
            this._immediate = otbVar;
        }
        this.f46514f = otbVar;
    }
}
