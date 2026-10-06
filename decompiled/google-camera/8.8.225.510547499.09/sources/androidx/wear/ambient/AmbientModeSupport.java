package androidx.wear.ambient;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.wearable.compat.WearableActivityController;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0118cx;
import p000.ActivityC0080bz;
import p000.C0111cq;
import p000.C1058va;
import p000.ComponentCallbacksC0077bw;
import p000.avf;
import p000.cdc;
import p000.cdh;
import p000.cxk;
import p000.cxo;
import p000.dab;
import p000.dav;
import p000.dbh;
import p000.dib;
import p000.eat;
import p000.epm;
import p000.exm;
import p000.fpa;
import p000.ges;
import p000.gfa;
import p000.gqm;
import p000.gzy;
import p000.hes;
import p000.het;
import p000.hfu;
import p000.hgk;
import p000.hoj;
import p000.hqc;
import p000.hqk;
import p000.ibs;
import p000.ifa;
import p000.iig;
import p000.ikw;
import p000.imn;
import p000.iqh;
import p000.jvh;
import p000.jwf;
import p000.jwn;
import p000.jwr;
import p000.not;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AmbientModeSupport extends ComponentCallbacksC0077bw {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";

    /* JADX INFO: renamed from: a */
    AmbientDelegate f1698a;

    /* JADX INFO: renamed from: b */
    AmbientCallback f1699b;

    /* JADX INFO: renamed from: c */
    private final AmbientDelegate.AmbientCallback f1700c = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientModeSupport.1
        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onAmbientOffloadInvalidated() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onEnterAmbient(Bundle bundle) {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onExitAmbient() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onUpdateAmbient() {
        }
    };

    /* JADX INFO: renamed from: d */
    private final AmbientController f1701d = new AmbientController(this);

    /* JADX INFO: compiled from: PG */
    public final class AmbientCallback {
        public final void onAmbientOffloadInvalidated() {
        }

        public final void onEnterAmbient(Bundle bundle) {
        }

        public final void onExitAmbient() {
        }

        public final void onUpdateAmbient() {
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface AmbientCallbackProvider {
        AmbientCallback getAmbientCallback();
    }

    public static AmbientController attach(ActivityC0080bz activityC0080bz) {
        C0111cq c0111cqM3206bA = activityC0080bz.m3206bA();
        AmbientModeSupport ambientModeSupport = (AmbientModeSupport) c0111cqM3206bA.m5325e("android.support.wearable.ambient.AmbientMode");
        if (ambientModeSupport == null) {
            ambientModeSupport = new AmbientModeSupport();
            AbstractC0118cx abstractC0118cxM5327i = c0111cqM3206bA.m5327i();
            abstractC0118cxM5327i.m5699o(ambientModeSupport, "android.support.wearable.ambient.AmbientMode");
            abstractC0118cxM5327i.mo2021h();
        }
        return ambientModeSupport.f1701d;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.f1698a;
        if (ambientDelegate != null) {
            ambientDelegate.m1595a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ComponentCallbacksC0077bw
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f1698a = new AmbientDelegate(getActivity(), this.f1700c);
        if (context instanceof AmbientCallbackProvider) {
            this.f1699b = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientModeSupport", "No callback provided - enabling only smart resume");
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1698a.m1599b();
        if (this.f1699b != null) {
            this.f1698a.m1604g();
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroy() {
        this.f1698a.m1600c();
        super.onDestroy();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDetach() {
        this.f1698a = null;
        super.onDetach();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onPause() {
        this.f1698a.m1601d();
        super.onPause();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onResume() {
        super.onResume();
        this.f1698a.m1602e();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStop() {
        this.f1698a.m1603f();
        super.onStop();
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public final class AmbientController {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f1702a;

        public AmbientController(AmbientModeSupport ambientModeSupport) {
            this.f1702a = ambientModeSupport;
        }

        public AmbientController(avf avfVar) {
            this.f1702a = avfVar;
        }

        public /* synthetic */ AmbientController(cdh cdhVar) {
            this.f1702a = cdhVar;
        }

        public /* synthetic */ AmbientController(ModeSwitcher modeSwitcher) {
            this.f1702a = modeSwitcher;
        }

        public AmbientController(dab dabVar) {
            this.f1702a = dabVar;
        }

        public AmbientController(dav davVar) {
            this.f1702a = davVar;
        }

        public AmbientController(exm exmVar) {
            this.f1702a = exmVar;
        }

        public /* synthetic */ AmbientController(ges gesVar) {
            this.f1702a = gesVar;
        }

        public /* synthetic */ AmbientController(gfa gfaVar) {
            this.f1702a = gfaVar;
        }

        public AmbientController(gqm gqmVar) {
            this.f1702a = gqmVar;
        }

        public AmbientController(hfu hfuVar) {
            this.f1702a = hfuVar;
        }

        public /* synthetic */ AmbientController(hoj hojVar) {
            this.f1702a = hojVar;
        }

        public AmbientController(ibs ibsVar) {
            this.f1702a = ibsVar;
        }

        public /* synthetic */ AmbientController(ifa ifaVar) {
            this.f1702a = ifaVar;
        }

        public AmbientController(imn imnVar) {
            this.f1702a = imnVar;
        }

        public AmbientController(iqh iqhVar) {
            this.f1702a = iqhVar;
        }

        public /* synthetic */ AmbientController(C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f1702a = c1058va;
        }

        /* JADX INFO: renamed from: a */
        public final void m1651a() {
            synchronized (((dav) this.f1702a).f10342w) {
                ((dav) this.f1702a).f10321b.mo5867a();
                ((dav) this.f1702a).f10329j.mo10033e(gzy.f26993E, true);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1652b(dbh dbhVar) {
            synchronized (((dav) this.f1702a).f10342w) {
                if (((dav) this.f1702a).f10327h.mo6184l(dib.f11361co)) {
                    ((dav) this.f1702a).m5860o();
                } else {
                    ((dav) this.f1702a).f10320a.mo5871b();
                }
                ((dav) this.f1702a).m5855j(dbhVar);
                AmbientController ambientController = ((dav) this.f1702a).f10345z;
                if (ambientController != null) {
                    ambientController.m1653c(dbhVar, true);
                }
                if (dbhVar.equals(dbh.LOCKED)) {
                    Object obj = this.f1702a;
                    ((dav) obj).f10326g.mo9221k(((dav) obj).f10344y);
                    Object obj2 = this.f1702a;
                    ((dav) obj2).f10326g.mo9217g(((dav) obj2).f10339t);
                } else {
                    Object obj3 = this.f1702a;
                    ((dav) obj3).f10326g.mo9222l(((dav) obj3).f10344y);
                    Object obj4 = this.f1702a;
                    ((dav) obj4).f10326g.mo9218h(((dav) obj4).f10339t);
                    ((dav) this.f1702a).f10341v = -1;
                }
                if (!((Boolean) ((jwf) ((dav) this.f1702a).f10329j.mo10030b(gzy.f26993E)).f34942d).booleanValue() && !dbhVar.equals(dbh.STANDARD)) {
                    ((dav) this.f1702a).f10321b.mo5867a();
                    ((dav) this.f1702a).f10329j.mo10033e(gzy.f26993E, true);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m1653c(dbh dbhVar, boolean z) {
            cxk cxkVar;
            Object obj = this.f1702a;
            dbh dbhVar2 = dbh.STANDARD;
            switch (dbhVar.ordinal()) {
                case 0:
                    cxkVar = cxk.DEFAULT;
                    break;
                case 1:
                    cxkVar = cxk.LOCKED;
                    break;
                case 2:
                    cxkVar = cxk.ACTIVE;
                    break;
                case 3:
                    cxkVar = cxk.CINEMATIC;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported option: ".concat(String.valueOf(String.valueOf(dbhVar))));
            }
            ((cxo) obj).m5719d(cxkVar, z);
        }

        /* JADX INFO: renamed from: e */
        public final void m1655e() {
            C1058va c1058va = (C1058va) this.f1702a;
            if (((AtomicInteger) c1058va.f47804c).decrementAndGet() == 0) {
                ((eat) c1058va.f47802a).m7018c();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m1656f() {
            ((exm) this.f1702a).f20760b.f20854r = true;
        }

        /* JADX INFO: renamed from: g */
        public final void m1657g(long j, float f) {
            hqk hqkVar = (hqk) this.f1702a;
            hqkVar.f29088k.m13541c(new hqc(hqkVar, j, f, 0));
        }

        /* JADX INFO: renamed from: h */
        public final void m1658h() {
            ((hgk) ((hfu) this.f1702a).f27587c.get()).mo10202k();
        }

        /* JADX INFO: renamed from: i */
        public final void m1659i() {
            ((hfu) this.f1702a).m10212g(false);
        }

        public final boolean isAmbient() {
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.f1702a).f1698a;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.m1605h();
        }

        /* JADX INFO: renamed from: j */
        public final void m1660j() {
            ((hfu) this.f1702a).m10212g(true);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nps] */
        /* JADX INFO: renamed from: k */
        public final void m1661k(hes hesVar, het hetVar) {
            jvh.m13562j(this.f1702a, new cdc(hesVar, hetVar, 8), not.INSTANCE);
        }

        /* JADX INFO: renamed from: l */
        public final jwn m1662l() {
            return jwr.m13637g(Long.valueOf(((gqm) this.f1702a).f26068b));
        }

        /* JADX INFO: renamed from: m */
        public final jwn m1663m() {
            return ((gqm) this.f1702a).f26067a;
        }

        public final void setAmbientOffloadEnabled(boolean z) {
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.f1702a).f1698a;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z);
            }
        }

        public final void setAutoResumeEnabled(boolean z) {
            Object obj;
            AmbientDelegate ambientDelegate = ((AmbientModeSupport) this.f1702a).f1698a;
            if (ambientDelegate == null || (obj = ambientDelegate.f1685a) == null) {
                return;
            }
            ((WearableActivityController) obj).setAutoResumeEnabled(z);
        }

        /* JADX INFO: renamed from: d */
        public final void m1654d(ikw ikwVar) {
            Object obj = this.f1702a;
            synchronized (((fpa) obj).f23000b) {
                if (((fpa) obj).f23013o == ikwVar) {
                    return;
                }
                ViewfinderCover viewfinderCover = ((iig) ((fpa) obj).f23007i).get().f31068e;
                if (((fpa) obj).f23013o == ikw.SLOW_MOTION || ikwVar != ikw.SLOW_MOTION) {
                    ikw ikwVar2 = ((fpa) obj).f23013o;
                    ikw ikwVar3 = ikw.VIDEO;
                    if (ikwVar2 == ikwVar3 || ikwVar != ikwVar3) {
                        ikw ikwVar4 = ikw.TIME_LAPSE;
                        if (ikwVar2 == ikwVar4 || ikwVar != ikwVar4) {
                            ((fpa) obj).f23013o = ikwVar;
                        } else {
                            ((fpa) obj).f23004f.m13541c(new epm((fpa) obj, viewfinderCover, ikwVar, 11));
                        }
                    } else {
                        ((fpa) obj).f23004f.m13541c(new epm((fpa) obj, viewfinderCover, ikwVar, 10));
                    }
                } else {
                    ((fpa) obj).f23004f.m13541c(new epm((fpa) obj, viewfinderCover, ikwVar, 9));
                }
            }
        }
    }
}
