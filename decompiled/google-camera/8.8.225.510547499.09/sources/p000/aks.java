package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aks {

    /* JADX INFO: renamed from: a */
    public akr f598a;

    /* JADX INFO: renamed from: b */
    private C0936qn f599b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f600c;

    /* JADX INFO: renamed from: d */
    private int f601d;

    /* JADX INFO: renamed from: e */
    private boolean f602e;

    /* JADX INFO: renamed from: f */
    private boolean f603f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f604g;

    public aks() {
        new AtomicReference();
    }

    /* JADX INFO: renamed from: e */
    public static void m873e(String str) {
        if (C0933qk.m19346b().m19347c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX INFO: renamed from: f */
    private final akr m874f(aku akuVar) {
        C0936qn c0936qn = this.f599b;
        akr akrVar = null;
        C0939qq c0939qq = c0936qn.m19350c(akuVar) ? ((C0939qq) c0936qn.f47498a.get(akuVar)).f47502d : null;
        Object obj = c0939qq != null ? ((akw) c0939qq.f47500b).f605a : null;
        if (!this.f604g.isEmpty()) {
            ArrayList arrayList = this.f604g;
            akrVar = (akr) arrayList.get(arrayList.size() - 1);
        }
        return abw.m169b(abw.m169b(this.f598a, (akr) obj), akrVar);
    }

    /* JADX INFO: renamed from: g */
    private final void m875g(akr akrVar) {
        akr akrVar2 = this.f598a;
        if (akrVar2 == akrVar) {
            return;
        }
        if (akrVar2 == akr.f593b && akrVar == akr.DESTROYED) {
            throw new IllegalStateException(TVkaNXnfP.bmfmGmReTUZum + this.f598a + " in component " + this.f600c.get());
        }
        this.f598a = akrVar;
        if (this.f602e || this.f601d != 0) {
            this.f603f = true;
            return;
        }
        this.f602e = true;
        m878j();
        this.f602e = false;
        if (this.f598a == akr.DESTROYED) {
            this.f599b = new C0936qn();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m876h() {
        ArrayList arrayList = this.f604g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: i */
    private final void m877i(akr akrVar) {
        this.f604g.add(akrVar);
    }

    /* JADX INFO: renamed from: j */
    private final void m878j() {
        akq akqVar;
        akv akvVar = (akv) this.f600c.get();
        if (akvVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0936qn c0936qn = this.f599b;
            if (c0936qn.f47511e != 0) {
                C0939qq c0939qq = c0936qn.f47508b;
                c0939qq.getClass();
                Object obj = ((akw) c0939qq.f47500b).f605a;
                C0939qq c0939qq2 = c0936qn.f47509c;
                c0939qq2.getClass();
                Object obj2 = ((akw) c0939qq2.f47500b).f605a;
                if (obj != obj2 || this.f598a != obj2) {
                    this.f603f = false;
                    akr akrVar = this.f598a;
                    c0939qq.getClass();
                    if (akrVar.compareTo((Enum) obj) < 0) {
                        C0936qn c0936qn2 = this.f599b;
                        C0938qp c0938qp = new C0938qp(c0936qn2.f47509c, c0936qn2.f47508b);
                        c0936qn2.f47510d.put(c0938qp, false);
                        while (c0938qp.hasNext() && !this.f603f) {
                            Map.Entry entryM19356c = c0938qp.next();
                            entryM19356c.getClass();
                            C0939qq c0939qq3 = (C0939qq) entryM19356c;
                            aku akuVar = (aku) c0939qq3.f47499a;
                            akw akwVar = (akw) c0939qq3.f47500b;
                            while (true) {
                                if (((akr) akwVar.f605a).compareTo(this.f598a) > 0 && !this.f603f && this.f599b.m19350c(akuVar)) {
                                    akp akpVar = akq.Companion;
                                    Object obj3 = akwVar.f605a;
                                    obj3.getClass();
                                    switch (((akr) obj3).ordinal()) {
                                        case 2:
                                            akqVar = akq.ON_DESTROY;
                                            break;
                                        case 3:
                                            akqVar = akq.ON_STOP;
                                            break;
                                        case 4:
                                            akqVar = akq.ON_PAUSE;
                                            break;
                                        default:
                                            akqVar = null;
                                            break;
                                    }
                                    if (akqVar == null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("no event down from ");
                                        Object obj4 = akwVar.f605a;
                                        sb.append(obj4);
                                        throw new IllegalStateException("no event down from ".concat(String.valueOf(obj4)));
                                    }
                                    m877i(akqVar.m871a());
                                    akwVar.m884a(akvVar, akqVar);
                                    m876h();
                                }
                            }
                        }
                    }
                    C0939qq c0939qq4 = this.f599b.f47509c;
                    if (!this.f603f && c0939qq4 != null && this.f598a.compareTo((Enum) ((akw) c0939qq4.f47500b).f605a) > 0) {
                        C0940qr c0940qrM19358e = this.f599b.m19358e();
                        while (c0940qrM19358e.hasNext() && !this.f603f) {
                            C0939qq c0939qq5 = (C0939qq) c0940qrM19358e.next();
                            aku akuVar2 = (aku) c0939qq5.f47499a;
                            akw akwVar2 = (akw) c0939qq5.f47500b;
                            while (true) {
                                if (((akr) akwVar2.f605a).compareTo(this.f598a) >= 0 || this.f603f || !this.f599b.m19350c(akuVar2)) {
                                    break;
                                }
                                m877i((akr) akwVar2.f605a);
                                akp akpVar2 = akq.Companion;
                                akq akqVarM870a = akp.m870a((akr) akwVar2.f605a);
                                if (akqVarM870a == null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("no event up from ");
                                    Object obj5 = akwVar2.f605a;
                                    sb2.append(obj5);
                                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj5)));
                                }
                                akwVar2.m884a(akvVar, akqVarM870a);
                                m876h();
                            }
                        }
                    }
                }
            }
        }
        this.f603f = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m879a(aku akuVar) {
        Object obj;
        akv akvVar;
        akuVar.getClass();
        m873e("addObserver");
        akw akwVar = new akw(akuVar, this.f598a == akr.DESTROYED ? akr.DESTROYED : akr.f593b);
        C0936qn c0936qn = this.f599b;
        C0939qq c0939qqMo19348a = c0936qn.mo19348a(akuVar);
        if (c0939qqMo19348a != null) {
            obj = c0939qqMo19348a.f47500b;
        } else {
            c0936qn.f47498a.put(akuVar, c0936qn.m19357d(akuVar, akwVar));
            obj = null;
        }
        if (((akw) obj) == null && (akvVar = (akv) this.f600c.get()) != null) {
            boolean z = this.f601d != 0 || this.f602e;
            akr akrVarM874f = m874f(akuVar);
            this.f601d++;
            while (((akr) akwVar.f605a).compareTo(akrVarM874f) < 0 && this.f599b.m19350c(akuVar)) {
                m877i((akr) akwVar.f605a);
                akp akpVar = akq.Companion;
                akq akqVarM870a = akp.m870a((akr) akwVar.f605a);
                if (akqVarM870a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("no event up from ");
                    Object obj2 = akwVar.f605a;
                    sb.append(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
                akwVar.m884a(akvVar, akqVarM870a);
                m876h();
                akrVarM874f = m874f(akuVar);
            }
            if (!z) {
                m878j();
            }
            this.f601d--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m880b(akq akqVar) {
        akqVar.getClass();
        m873e("handleLifecycleEvent");
        m875g(akqVar.m871a());
    }

    /* JADX INFO: renamed from: c */
    public final void m881c(aku akuVar) {
        akuVar.getClass();
        m873e("removeObserver");
        this.f599b.mo19349b(akuVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m882d(akr akrVar) {
        akrVar.getClass();
        m873e("setCurrentState");
        m875g(akrVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aks(akv akvVar) {
        this();
        akvVar.getClass();
        this.f599b = new C0936qn();
        this.f598a = akr.f593b;
        this.f604g = new ArrayList();
        this.f600c = new WeakReference(akvVar);
    }
}
