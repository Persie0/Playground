package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqm implements gqv {

    /* JADX INFO: renamed from: b */
    public final long f26068b;

    /* JADX INFO: renamed from: c */
    public final jwn f26069c;

    /* JADX INFO: renamed from: f */
    private final kao f26072f;

    /* JADX INFO: renamed from: i */
    private final gqq f26075i;

    /* JADX INFO: renamed from: a */
    public final jwf f26067a = new jwf(0L);

    /* JADX INFO: renamed from: g */
    private final LinkedList f26073g = new LinkedList();

    /* JADX INFO: renamed from: d */
    public final Object f26070d = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f26071e = false;

    /* JADX INFO: renamed from: h */
    private List f26074h = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, jwn] */
    public gqm(feq feqVar, lbn lbnVar, gqq gqqVar, byte[] bArr) {
        ?? r0;
        this.f26075i = gqqVar;
        this.f26068b = Math.min(300000000L, lbnVar.f37881a);
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        synchronized (feqVar.f21547a) {
            if (feqVar.f21549c.containsKey(fel.LIGHTCYCLE)) {
                fel.LIGHTCYCLE.name();
            } else {
                fel.LIGHTCYCLE.name();
                feqVar.f21549c.put(fel.LIGHTCYCLE, new fep(ambientController, new jwf(false), mws.m17098m(ambientController.m1663m().mo3830a(new feo(feqVar, 0), feqVar.f21548b), ambientController.m1662l().mo3830a(new feo(feqVar, 2), feqVar.f21548b)), 0, null, null, null, null, null));
                feqVar.m8302a();
            }
        }
        fel felVar = fel.LIGHTCYCLE;
        synchronized (feqVar.f21547a) {
            if (!feqVar.f21549c.containsKey(felVar)) {
                throw new IllegalStateException("Feature not registered: " + String.valueOf(felVar));
            }
            r0 = ((fep) feqVar.f21549c.get(felVar)).f21542a;
        }
        this.f26069c = r0;
        r0.mo3830a(new fnw(this, 2), kxk.m15033z());
        this.f26072f = new gqk(this);
    }

    /* JADX INFO: renamed from: d */
    private final void m9644d(gqs gqsVar) {
        synchronized (this.f26070d) {
            this.f26071e = true;
            jwf jwfVar = this.f26067a;
            jwfVar.mo3415bf(Long.valueOf(((Long) jwfVar.f34942d).longValue() + this.f26068b));
            gqsVar.mo7365c(this.f26072f);
            this.f26075i.m9649a(gqsVar);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m9645e() {
        synchronized (this.f26070d) {
            this.f26073g.size();
            List list = this.f26074h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((gql) it.next()).m9643a();
                }
            }
        }
    }

    @Override // p000.gqv
    /* JADX INFO: renamed from: a */
    public final long mo9646a() {
        return this.f26068b;
    }

    @Override // p000.gqv
    /* JADX INFO: renamed from: b */
    public final void mo9647b(gqs gqsVar) {
        synchronized (this.f26070d) {
            if (((Boolean) ((jwf) this.f26069c).f34942d).booleanValue()) {
                m9644d(gqsVar);
            } else {
                this.f26073g.add(gqsVar);
                m9645e();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9648c() {
        synchronized (this.f26070d) {
            if (!this.f26073g.isEmpty()) {
                m9644d((gqs) this.f26073g.removeFirst());
                m9645e();
            }
        }
    }
}
