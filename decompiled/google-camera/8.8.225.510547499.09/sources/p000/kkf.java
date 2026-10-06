package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class kkf implements kjn {

    /* JADX INFO: renamed from: a */
    protected final kfx f36342a;

    /* JADX INFO: renamed from: b */
    protected final kbo f36343b;

    /* JADX INFO: renamed from: c */
    protected final kbz f36344c;

    /* JADX INFO: renamed from: d */
    protected final int f36345d;

    /* JADX INFO: renamed from: e */
    private final kkz f36346e;

    /* JADX INFO: renamed from: f */
    private final kkk f36347f;

    protected kkf(int i, kfx kfxVar, kkz kkzVar, kkk kkkVar, kbo kboVar, kbz kbzVar) {
        this.f36345d = i;
        this.f36342a = kfxVar;
        this.f36346e = kkzVar;
        this.f36347f = kkkVar;
        this.f36344c = kbzVar;
        this.f36343b = kboVar.mo6314a("SessionOpener");
    }

    /* JADX INFO: renamed from: c */
    private static final void m14415c(kjr kjrVar, Executor executor) {
        kjrVar.f36307c.mo2282d(new jzq(kjrVar.f36305a.f36403a.mo3830a(new ijp(kjrVar, 18), executor), 15), not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo14372a(kpj kpjVar, kjo kjoVar, List list, Handler handler);

    /* JADX INFO: renamed from: b */
    public final void m14416b(kpj kpjVar, kjo kjoVar, List list, List list2, jvb jvbVar, Handler handler, Executor executor) {
        this.f36344c.mo13961e("Create-".concat(String.valueOf(String.valueOf(kjoVar))));
        try {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surfaceM14395c = ((kjs) it.next()).m14395c();
                surfaceM14395c.getClass();
                arrayList.add(surfaceM14395c);
            }
            this.f36347f.m14435d(kjoVar);
            kkk kkkVar = this.f36347f;
            synchronized (kkkVar) {
                lku.m15659m(kkkVar.f36373d != null, hiCTUJiAxf.rYCscV, new Object[0]);
                if (kjoVar == kkkVar.f36373d) {
                    boolean zAddAll = kkkVar.f36370a.addAll(arrayList);
                    if (zAddAll) {
                        kkkVar.m14434c();
                    }
                }
            }
            mwn mwnVarM17090e = mws.m17090e();
            mwnVarM17090e.m17083h(list2);
            mwnVarM17090e.m17083h(list);
            mws mwsVarM17103r = mws.m17103r(C1143ye.f48117a, mwnVarM17090e.m17081f());
            this.f36343b.mo13944f("Create " + String.valueOf(kjoVar) + " using " + String.valueOf(mwsVarM17103r));
            mo14372a(kpjVar, kjoVar, mwsVarM17103r, handler);
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list2.size());
                ArrayList arrayList3 = new ArrayList(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    kjp kjpVar = (kjp) it2.next();
                    m14415c(kjpVar, executor);
                    arrayList2.add(kjpVar.f36307c);
                    arrayList3.add(kjpVar.mo14393a());
                }
                kxk.m14975U(kxk.m14961G(arrayList2), new kke(this, jvbVar, kjoVar, list2, arrayList3), executor);
            }
            this.f36344c.mo13962f();
        } catch (Throwable th) {
            this.f36344c.mo13962f();
            throw th;
        }
    }

    @Override // p000.kjn
    /* JADX INFO: renamed from: d */
    public final void mo14373d(kpj kpjVar, kjo kjoVar, jvb jvbVar, Handler handler) {
        int i;
        OutputConfiguration outputConfiguration;
        juy juyVar = new juy(handler);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        kkz kkzVar = this.f36346e;
        mxk<kkq> mxkVar = kkzVar.f36449b;
        mxk<kkr> mxkVar2 = kkzVar.f36450c;
        boolean z = (mxkVar.isEmpty() && mxkVar2.isEmpty()) ? false : true;
        lku.m15670x(z, "Cannot create a capture session without streams.");
        if (this.f36342a == kfx.HIGH_SPEED) {
            lku.m15670x(mxkVar.isEmpty(), "HIGH_SPEED Sessions cannot use buffered streams.");
            lku.m15670x(!mxkVar2.isEmpty(), "HIGH_SPEED Sessions must have streams.");
            lku.m15670x(mxkVar2.size() <= 2, "HIGH_SPEED Sessions may only have 1 or 2 streams.");
        }
        for (kkq kkqVar : mxkVar) {
            Surface surfaceMo14452g = kkqVar.mo14452g();
            surfaceMo14452g.getClass();
            arrayList.add(kjt.m14396b(kkqVar, surfaceMo14452g));
            int i2 = kkqVar.f36447h.f35912n;
        }
        for (kkr kkrVar : mxkVar2) {
            Surface surfaceMo14452g2 = kkrVar.mo14452g();
            if (surfaceMo14452g2 != null) {
                if (surfaceMo14452g2.isValid()) {
                    arrayList.add(kjt.m14396b(kkrVar, surfaceMo14452g2));
                } else {
                    this.f36343b.mo13947i(kfv.m14168E("%s for %s was not valid, this may prevent the viewfinder from starting!", surfaceMo14452g2, kkrVar));
                }
            }
            if (this.f36342a != kfx.HIGH_SPEED && (i = this.f36345d) != 5 && i != 3) {
                if (kkrVar.mo14453h() == kgj.SURFACE_TEXTURE) {
                    int i3 = kju.f36309a;
                    outputConfiguration = new OutputConfiguration(kkrVar.mo14192b().m13906c(), SurfaceTexture.class);
                    kju.m14398b(kkrVar, outputConfiguration);
                } else if (kkrVar.mo14453h() == kgj.SURFACE_VIEW) {
                    int i4 = kju.f36309a;
                    outputConfiguration = new OutputConfiguration(kkrVar.mo14192b().m13906c(), SurfaceHolder.class);
                    kju.m14398b(kkrVar, outputConfiguration);
                } else {
                    outputConfiguration = null;
                }
                kjp kjpVar = outputConfiguration != null ? new kjp(kkrVar, outputConfiguration) : null;
                if (kjpVar != null) {
                    arrayList2.add(kjpVar);
                }
            }
            arrayList3.add(new kjq(kkrVar));
        }
        if (arrayList3.isEmpty()) {
            m14416b(kpjVar, kjoVar, mws.m17095j(arrayList), arrayList2, jvbVar, handler, juyVar);
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size = arrayList3.size();
        for (int i5 = 0; i5 < size; i5++) {
            kjq kjqVar = (kjq) arrayList3.get(i5);
            m14415c(kjqVar, juyVar);
            arrayList4.add(kjqVar.f36307c);
        }
        this.f36343b.mo13944f("Awaiting required outputs for " + String.valueOf(kjoVar) + " " + arrayList3.toString());
        kxk.m14975U(kxk.m14961G(arrayList4), new kkd(this, jvbVar, kjoVar, arrayList3, kpjVar, arrayList, arrayList2, handler, juyVar), juyVar);
    }
}
