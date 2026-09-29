package p000;

import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class orb {

    /* JADX INFO: renamed from: a */
    public final C3329mb f54800a;

    /* JADX INFO: renamed from: b */
    public C3329mb f54801b;

    /* JADX INFO: renamed from: c */
    public final mq7 f54802c;

    /* JADX INFO: renamed from: d */
    public final cdb f54803d;

    public orb() {
        C3329mb c3329mb = new C3329mb(18);
        this.f54800a = c3329mb;
        this.f54801b = ((C3329mb) c3329mb.f50861c).m16736n();
        this.f54802c = new mq7(8);
        this.f54803d = new cdb(25);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: lfb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ orb f49610b;

            {
                this.f49610b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                orb orbVar = this.f49610b;
                switch (i2) {
                    case 0:
                        return new trc(orbVar.f54802c);
                    default:
                        return new trc(orbVar.f54803d);
                }
            }
        };
        jh9 jh9Var = (jh9) c3329mb.f50863e;
        jh9Var.m14478o("internal.registerCallback", callable);
        final int i2 = 0;
        jh9Var.m14478o("internal.eventLogger", new Callable(this) { // from class: lfb

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ orb f49610b;

            {
                this.f49610b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                orb orbVar = this.f49610b;
                switch (i3) {
                    case 0:
                        return new trc(orbVar.f54802c);
                    default:
                        return new trc(orbVar.f54803d);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18330a(ofb ofbVar) throws zzd {
        mq7 mq7Var = this.f54802c;
        try {
            mq7Var.m17004o(ofbVar);
            ((C3329mb) this.f54800a.f50862d).m16738p("runtime.counter", new bkb(Double.valueOf(0.0d)));
            this.f54803d.m4563l(this.f54801b.m16736n(), mq7Var);
            return (mq7Var.m17005q().equals(mq7Var.m17003n()) && ((ArrayList) mq7Var.m17006r()).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18331b(pnc pncVar) {
        vkb vkbVar;
        try {
            C3329mb c3329mb = this.f54800a;
            this.f54801b = ((C3329mb) c3329mb.f50861c).m16736n();
            if (c3329mb.m16733k(this.f54801b, (koc[]) pncVar.m19416s().toArray(new koc[0])) instanceof jjb) {
                throw new IllegalStateException("Program loading failed");
            }
            for (ymc ymcVar : pncVar.m19417t().m19400s()) {
                List listM25203t = ymcVar.m25203t();
                String strM25202s = ymcVar.m25202s();
                Iterator it = listM25203t.iterator();
                while (it.hasNext()) {
                    kmb kmbVarM16733k = c3329mb.m16733k(this.f54801b, (koc) it.next());
                    if (!(kmbVarM16733k instanceof bmb)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C3329mb c3329mb2 = this.f54801b;
                    if (c3329mb2.m16737o(strM25202s)) {
                        kmb kmbVarM16740r = c3329mb2.m16740r(strM25202s);
                        if (!(kmbVarM16740r instanceof vkb)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM25202s)));
                        }
                        vkbVar = (vkb) kmbVarM16740r;
                    } else {
                        vkbVar = null;
                    }
                    if (vkbVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM25202s)));
                    }
                    vkbVar.mo12757a(this.f54801b, Collections.singletonList(kmbVarM16733k));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
