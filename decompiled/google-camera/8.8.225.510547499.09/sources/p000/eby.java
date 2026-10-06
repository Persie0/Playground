package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eby implements ebx {

    /* JADX INFO: renamed from: a */
    public final jww f13315a;

    /* JADX INFO: renamed from: b */
    public final jwn f13316b;

    /* JADX INFO: renamed from: c */
    public final jwf f13317c;

    /* JADX INFO: renamed from: d */
    public boolean f13318d;

    /* JADX INFO: renamed from: e */
    private boolean f13319e = false;

    /* JADX INFO: renamed from: f */
    private boolean f13320f = false;

    /* JADX INFO: renamed from: g */
    private boolean f13321g = false;

    /* JADX INFO: renamed from: h */
    private final List f13322h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    private final jwn f13323i;

    public eby(dhv dhvVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, chx chxVar, jvd jvdVar) {
        jwf jwfVar = new jwf(false);
        this.f13315a = jwfVar;
        jwf jwfVar2 = new jwf(false);
        this.f13317c = jwfVar2;
        this.f13323i = jwnVar2;
        int i = 2;
        this.f13316b = jwj.m13624c(jwr.m13634d(jwnVar, jwfVar, jwfVar2));
        if (dhvVar.mo6184l(did.f11424ac)) {
            chxVar.f5767b.m13537d(jwnVar3.mo3830a(new dsu(this, i), jvdVar));
        }
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: a */
    public final void mo7090a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13320f = z;
        if (!z4) {
            this.f13321g = z;
        }
        Iterator it = this.f13322h.iterator();
        while (it.hasNext()) {
            ((ebx) it.next()).mo7090a(z, z2, z3, z4);
        }
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: b */
    public final void mo7091b(boolean z) {
        Iterator it = this.f13322h.iterator();
        while (it.hasNext()) {
            ((ebx) it.next()).mo7091b(z);
        }
    }

    @Override // p000.ebx
    /* JADX INFO: renamed from: c */
    public final void mo7092c() {
        Iterator it = this.f13322h.iterator();
        while (it.hasNext()) {
            ((ebx) it.next()).mo7092c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final jwn m7093d() {
        return jwj.m13624c(this.f13315a);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized kba m7094e(ebx ebxVar) {
        if (this.f13322h.contains(ebxVar)) {
            return new gog(14);
        }
        this.f13322h.add(ebxVar);
        return new eip(this, ebxVar, 1);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m7095f() {
        this.f13318d = true;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m7096g(ebx ebxVar) {
        this.f13322h.remove(ebxVar);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m7097h(boolean z) {
        this.f13317c.mo3415bf(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m7098i(boolean z) {
        this.f13319e = z;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m7099j() {
        this.f13318d = false;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m7100k() {
        return this.f13320f;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized boolean m7101l() {
        return this.f13321g;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized boolean m7102m() {
        return this.f13319e;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m7103n() {
        return this.f13318d;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public final void m7104o(glk glkVar) {
        if (((Boolean) this.f13317c.f34942d).booleanValue()) {
            hjy hjyVarMo9905k = glkVar.f25502c.mo9905k();
            nxl nxlVarM18137O = nhg.f42306e.m18137O();
            boolean zBooleanValue = ((Boolean) this.f13316b.mo3831be()).booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhg nhgVar = (nhg) nxlVarM18137O.f44974b;
            nhgVar.f42308a |= 1;
            nhgVar.f42309b = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) m7093d().mo3831be()).booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhg nhgVar2 = (nhg) nxlVarM18137O.f44974b;
            nhgVar2.f42308a |= 2;
            nhgVar2.f42310c = zBooleanValue2;
            float fFloatValue = ((Float) this.f13323i.mo3831be()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhg nhgVar3 = (nhg) nxlVarM18137O.f44974b;
            nhgVar3.f42308a |= 4;
            nhgVar3.f42311d = fFloatValue;
            ((hjz) hjyVarMo9905k).f28089o = (nhg) nxlVarM18137O.mo18103l();
        }
    }
}
