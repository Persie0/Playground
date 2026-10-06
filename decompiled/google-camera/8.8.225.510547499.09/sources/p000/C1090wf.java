package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: wf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1090wf implements InterfaceC1083vz, InterfaceC1082vy {

    /* JADX INFO: renamed from: a */
    public final Object f47906a;

    /* JADX INFO: renamed from: b */
    public C1091wg f47907b;

    /* JADX INFO: renamed from: c */
    public boolean f47908c;

    /* JADX INFO: renamed from: d */
    public final ovm f47909d;

    /* JADX INFO: renamed from: e */
    private final C0948qz f47910e;

    /* JADX INFO: renamed from: f */
    private final oqs f47911f;

    /* JADX INFO: renamed from: g */
    private final List f47912g;

    /* JADX INFO: renamed from: h */
    private final List f47913h;

    /* JADX INFO: renamed from: i */
    private C0973rx f47914i;

    /* JADX INFO: renamed from: j */
    private C0973rx f47915j;

    /* JADX INFO: renamed from: k */
    private boolean f47916k;

    /* JADX INFO: renamed from: l */
    private boolean f47917l;

    /* JADX INFO: renamed from: m */
    private final C0861nt f47918m;

    /* JADX INFO: renamed from: n */
    private final drj f47919n;

    public C1090wf(drj drjVar, C0948qz c0948qz, C0861nt c0861nt, oqs oqsVar, List list, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        drjVar.getClass();
        c0861nt.getClass();
        oqsVar.getClass();
        list.getClass();
        this.f47919n = drjVar;
        this.f47910e = c0948qz;
        this.f47918m = c0861nt;
        this.f47911f = oqsVar;
        this.f47912g = list;
        this.f47906a = new Object();
        this.f47913h = new ArrayList();
        this.f47909d = ovw.m19110a(C0965rp.f47560a);
    }

    @Override // p000.InterfaceC1082vy
    /* JADX INFO: renamed from: a */
    public final void mo19510a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onGraphStarting");
        this.f47909d.mo19087d(C0964ro.f47559a);
    }

    @Override // p000.InterfaceC1083vz
    /* JADX INFO: renamed from: b */
    public final void mo19511b() {
        synchronized (this.f47906a) {
            if (this.f47908c) {
                return;
            }
            this.f47908c = true;
            C1091wg c1091wg = this.f47907b;
            this.f47907b = null;
            if (c1091wg != null) {
                c1091wg.m19523a();
            }
            ooi ooiVar = new ooi();
            ooi ooiVar2 = new ooi();
            synchronized (this.f47906a) {
                ooiVar.f46351a = this.f47907b;
                ooiVar2.f46351a = omn.m18673M(this.f47913h);
                this.f47913h.clear();
            }
            ooc.m18746l(this.f47911f, null, new C1085wa(ooiVar, ooiVar2, this, null), 3);
        }
    }

    @Override // p000.InterfaceC1083vz
    /* JADX INFO: renamed from: c */
    public final void mo19512c(C0973rx c0973rx) {
        synchronized (this.f47906a) {
            if (this.f47908c) {
                return;
            }
            this.f47915j = c0973rx;
            StringBuilder sb = new StringBuilder();
            sb.append("Request(");
            sb.append(c0973rx.f47566a);
            sb.append(")@");
            sb.append(Integer.toHexString(c0973rx.hashCode()));
            ooc.m18746l(this.f47911f, null, new C1087wc(this, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oly] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, oly] */
    @Override // p000.InterfaceC1083vz
    /* JADX INFO: renamed from: d */
    public final void mo19513d(List list) {
        synchronized (this.f47906a) {
            if (this.f47908c) {
                ooc.m18746l(this.f47911f, this.f47919n.f12399e, new C1088wd(this, list, null), 2);
            } else {
                this.f47913h.add(list);
                ooc.m18746l(this.f47911f, this.f47919n.f12399e, new C1089we(this, null), 2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19519e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0973rx c0973rx = (C0973rx) it.next();
            int size = this.f47912g.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC0972rw) this.f47912g.get(i)).mo14439a(c0973rx);
            }
            int size2 = c0973rx.f47568c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC0972rw) c0973rx.f47568c.get(i2)).mo14439a(c0973rx);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oly] */
    /* JADX INFO: renamed from: f */
    public final void m19520f() {
        ooc.m18746l(this.f47911f, this.f47919n.f12399e, new C1086wb(this, null), 2);
    }

    /* JADX INFO: renamed from: g */
    public final void m19521g() {
        boolean zM19524b;
        synchronized (this.f47906a) {
            if (this.f47908c) {
                return;
            }
            if (this.f47916k) {
                this.f47917l = true;
                return;
            }
            C1091wg c1091wg = this.f47907b;
            List list = (List) omn.m18672L(this.f47913h);
            if (c1091wg != null && list != null) {
                this.f47916k = true;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append("#submit");
                    Trace.beginSection(toString().concat("#submit"));
                    try {
                        synchronized (c1091wg) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            synchronized (this.f47918m) {
                            }
                            C0736jc.m12884b(linkedHashMap, this.f47910e.f47522i);
                            zM19524b = c1091wg.m19524b(false, list, this.f47910e.f47520g, linkedHashMap, this.f47912g);
                        }
                        Trace.endSection();
                        synchronized (this.f47906a) {
                            if (zM19524b) {
                                if (!this.f47913h.isEmpty() && this.f47913h.remove(0) != list) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                List list2 = (List) omn.m18672L(this.f47913h);
                                if (list2 == null) {
                                    this.f47917l = false;
                                    this.f47916k = false;
                                    return;
                                }
                                list = list2;
                            } else {
                                if (!this.f47917l) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Failed to submit ");
                                    sb2.append(list);
                                    sb2.append(", and the queue is not dirty.");
                                    this.f47916k = false;
                                    return;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Failed to submit ");
                                sb3.append(list);
                                sb3.append(" but the request queue or processor is dirty. Clearing dirty flag and attempting retry.");
                                this.f47917l = false;
                                C1091wg c1091wg2 = this.f47907b;
                                if (c1091wg2 != null) {
                                    c1091wg = c1091wg2;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        synchronized (this.f47906a) {
                            if (this.f47917l) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Failed to submit ");
                                sb4.append(list);
                                sb4.append(" but the request queue or processor is dirty. Clearing dirty flag and attempting retry.");
                                this.f47917l = false;
                                throw th;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Failed to submit ");
                            sb5.append(list);
                            sb5.append(", and the queue is not dirty.");
                            this.f47916k = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m19522h() {
        synchronized (this.f47906a) {
            if (this.f47908c) {
                return;
            }
            C1091wg c1091wg = this.f47907b;
            C0973rx c0973rx = this.f47915j;
            if (c0973rx == null) {
                c0973rx = this.f47914i;
            }
            C0973rx c0973rx2 = c0973rx;
            if (c1091wg == null || c0973rx2 == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append("#startRepeating");
            Trace.beginSection(toString().concat("#startRepeating"));
            synchronized (c1091wg) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                synchronized (this.f47918m) {
                }
                C0736jc.m12884b(linkedHashMap, this.f47910e.f47522i);
                if (c1091wg.m19524b(true, omn.m18666F(c0973rx2), this.f47910e.f47520g, linkedHashMap, this.f47912g)) {
                    synchronized (this.f47906a) {
                        if (c1091wg == this.f47907b) {
                            this.f47914i = c0973rx2;
                            if (ooc.m18737c(this.f47915j, c0973rx2)) {
                                this.f47915j = null;
                            }
                        }
                    }
                }
            }
            Trace.endSection();
        }
    }
}
