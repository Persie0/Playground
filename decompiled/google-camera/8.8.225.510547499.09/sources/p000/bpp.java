package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpp implements ComponentCallbacks2, bza {

    /* JADX INFO: renamed from: e */
    private static final cab f4085e;

    /* JADX INFO: renamed from: a */
    protected final box f4086a;

    /* JADX INFO: renamed from: b */
    protected final Context f4087b;

    /* JADX INFO: renamed from: c */
    public final byz f4088c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f4089d;

    /* JADX INFO: renamed from: f */
    private final bzi f4090f;

    /* JADX INFO: renamed from: g */
    private final bzh f4091g;

    /* JADX INFO: renamed from: h */
    private final bzo f4092h;

    /* JADX INFO: renamed from: i */
    private final Runnable f4093i;

    /* JADX INFO: renamed from: j */
    private final byx f4094j;

    /* JADX INFO: renamed from: k */
    private cab f4095k;

    static {
        cab cabVarM3346b = cab.m3346b(Bitmap.class);
        cabVarM3346b.m3304N();
        f4085e = cabVarM3346b;
        cab.m3346b(byh.class).m3304N();
    }

    public bpp(box boxVar, byz byzVar, bzh bzhVar, Context context) {
        bzi bziVar = new bzi();
        bzq bzqVar = boxVar.f4037f;
        this.f4092h = new bzo();
        baa baaVar = new baa(this, 11);
        this.f4093i = baaVar;
        this.f4086a = boxVar;
        this.f4088c = byzVar;
        this.f4091g = bzhVar;
        this.f4090f = bziVar;
        this.f4087b = context;
        Context applicationContext = context.getApplicationContext();
        byx byyVar = abx.m170b(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new byy(applicationContext, new bpo(this, bziVar)) : new bzd();
        this.f4094j = byyVar;
        synchronized (boxVar.f4036e) {
            if (boxVar.f4036e.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            boxVar.f4036e.add(this);
        }
        if (cbi.m3390k()) {
            cbi.m3388i(baaVar);
        } else {
            byzVar.mo3200a(this);
        }
        byzVar.mo3200a(byyVar);
        this.f4089d = new CopyOnWriteArrayList(boxVar.f4033b.f4042c);
        m2872l(boxVar.f4033b.m2832b());
    }

    /* JADX INFO: renamed from: a */
    public final bpn m2861a(Class cls) {
        return new bpn(this.f4086a, this, cls, this.f4087b);
    }

    /* JADX INFO: renamed from: b */
    public final bpn m2862b() {
        return m2861a(Bitmap.class).mo2855h(f4085e);
    }

    /* JADX INFO: renamed from: c */
    public final bpn m2863c() {
        return m2861a(Drawable.class);
    }

    /* JADX INFO: renamed from: d */
    public final bpn m2864d(String str) {
        return m2863c().m2853f(str);
    }

    /* JADX INFO: renamed from: e */
    final synchronized cab m2865e() {
        return this.f4095k;
    }

    /* JADX INFO: renamed from: f */
    public final void m2866f(cal calVar) {
        if (calVar == null) {
            return;
        }
        boolean zM2874n = m2874n(calVar);
        bzw bzwVarMo3337c = calVar.mo3337c();
        if (zM2874n) {
            return;
        }
        box boxVar = this.f4086a;
        synchronized (boxVar.f4036e) {
            Iterator it = boxVar.f4036e.iterator();
            while (it.hasNext()) {
                if (((bpp) it.next()).m2874n(calVar)) {
                    return;
                }
            }
            if (bzwVarMo3337c != null) {
                calVar.mo3342k(null);
                bzwVarMo3337c.mo3323c();
            }
        }
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: g */
    public final synchronized void mo2867g() {
        this.f4092h.mo2867g();
        Iterator it = cbi.m3385f(this.f4092h.f4825a).iterator();
        while (it.hasNext()) {
            m2866f((cal) it.next());
        }
        this.f4092h.f4825a.clear();
        bzi bziVar = this.f4090f;
        Iterator it2 = cbi.m3385f(bziVar.f4812a).iterator();
        while (it2.hasNext()) {
            bziVar.m3216a((bzw) it2.next());
        }
        bziVar.f4813b.clear();
        this.f4088c.mo3204e(this);
        this.f4088c.mo3204e(this.f4094j);
        cbi.m3384e().removeCallbacks(this.f4093i);
        box boxVar = this.f4086a;
        synchronized (boxVar.f4036e) {
            if (!boxVar.f4036e.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            boxVar.f4036e.remove(this);
        }
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: h */
    public final synchronized void mo2868h() {
        m2871k();
        this.f4092h.mo2868h();
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: i */
    public final synchronized void mo2869i() {
        m2870j();
        this.f4092h.mo2869i();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m2870j() {
        bzi bziVar = this.f4090f;
        bziVar.f4814c = true;
        for (bzw bzwVar : cbi.m3385f(bziVar.f4812a)) {
            if (bzwVar.mo3334n()) {
                bzwVar.mo3326f();
                bziVar.f4813b.add(bzwVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m2871k() {
        bzi bziVar = this.f4090f;
        bziVar.f4814c = false;
        for (bzw bzwVar : cbi.m3385f(bziVar.f4812a)) {
            if (!bzwVar.mo3332l() && !bzwVar.mo3334n()) {
                bzwVar.mo3322b();
            }
        }
        bziVar.f4813b.clear();
    }

    /* JADX INFO: renamed from: l */
    protected final synchronized void m2872l(cab cabVar) {
        cab cabVar2 = (cab) cabVar.mo2856i();
        cabVar2.m3306P();
        this.f4095k = cabVar2;
    }

    /* JADX INFO: renamed from: m */
    final synchronized void m2873m(cal calVar, bzw bzwVar) {
        this.f4092h.f4825a.add(calVar);
        bzi bziVar = this.f4090f;
        bziVar.f4812a.add(bzwVar);
        if (!bziVar.f4814c) {
            bzwVar.mo3322b();
        } else {
            bzwVar.mo3323c();
            bziVar.f4813b.add(bzwVar);
        }
    }

    /* JADX INFO: renamed from: n */
    final synchronized boolean m2874n(cal calVar) {
        bzw bzwVarMo3337c = calVar.mo3337c();
        if (bzwVarMo3337c == null) {
            return true;
        }
        if (!this.f4090f.m3216a(bzwVarMo3337c)) {
            return false;
        }
        this.f4092h.f4825a.remove(calVar);
        calVar.mo3342k(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + String.valueOf(this.f4090f) + ", treeNode=" + String.valueOf(this.f4091g) + "}";
    }
}
