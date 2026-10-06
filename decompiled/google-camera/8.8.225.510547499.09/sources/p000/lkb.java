package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkb extends ljw implements ljh, lho, lhv, lht, lhr {

    /* JADX INFO: renamed from: a */
    public static final nbh f38449a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");

    /* JADX INFO: renamed from: b */
    volatile lgp f38450b;

    /* JADX INFO: renamed from: c */
    public final ohb f38451c;

    /* JADX INFO: renamed from: d */
    public final ohb f38452d;

    /* JADX INFO: renamed from: f */
    public final oju f38454f;

    /* JADX INFO: renamed from: g */
    public final oju f38455g;

    /* JADX INFO: renamed from: h */
    public final ljs f38456h;

    /* JADX INFO: renamed from: j */
    private final boolean f38458j;

    /* JADX INFO: renamed from: k */
    private final Context f38459k;

    /* JADX INFO: renamed from: l */
    private final Executor f38460l;

    /* JADX INFO: renamed from: m */
    private final mrm f38461m;

    /* JADX INFO: renamed from: n */
    private final lhz f38462n;

    /* JADX INFO: renamed from: s */
    private final oju f38467s;

    /* JADX INFO: renamed from: t */
    private final mbl f38468t;

    /* JADX INFO: renamed from: u */
    private final liv f38469u;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f38457i = new AtomicBoolean();

    /* JADX INFO: renamed from: o */
    private final AtomicInteger f38463o = new AtomicInteger();

    /* JADX INFO: renamed from: p */
    private final AtomicInteger f38464p = new AtomicInteger();

    /* JADX INFO: renamed from: q */
    private final AtomicInteger f38465q = new AtomicInteger();

    /* JADX INFO: renamed from: r */
    private final AtomicBoolean f38466r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f38453e = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, oju] */
    public lkb(ljf ljfVar, Context context, Executor executor, ohb ohbVar, mrm mrmVar, lhz lhzVar, liv livVar, ohb ohbVar2, mrm mrmVar2, oju ojuVar, oju ojuVar2, oju ojuVar3, lie lieVar, byte[] bArr) {
        this.f38451c = ohbVar;
        this.f38461m = mrmVar;
        this.f38462n = lhzVar;
        this.f38469u = livVar;
        this.f38452d = ohbVar2;
        this.f38468t = ljfVar.m15526b(not.INSTANCE, ohbVar, null);
        this.f38459k = context;
        this.f38460l = executor;
        this.f38458j = ((Boolean) mrmVar2.mo16811e(Boolean.FALSE)).booleanValue();
        this.f38467s = ojuVar;
        this.f38454f = ojuVar2;
        this.f38455g = ojuVar3;
        ljy ljyVar = new ljy(context);
        lka lkaVar = new lka();
        Executor executor2 = (Executor) lieVar.f38294a.get();
        executor2.getClass();
        ohb ohbVar3 = ((ohl) lieVar.f38295b).get();
        ohbVar3.getClass();
        this.f38456h = new ljs(ljyVar, lkaVar, executor2, ohbVar3, ((ljg) lieVar.f38297d).get(), lieVar.f38296c);
    }

    /* JADX INFO: renamed from: j */
    private final void m15551j(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        kxk.m14970P(new nol() { // from class: ljx
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                lkb lkbVar = this.f38443a;
                return atomicInteger.getAndDecrement() <= 0 ? npp.f44031a : lkbVar.m15553g(i, (ljq) lkbVar.f38451c.get());
            }
        }, this.f38460l);
    }

    @Override // p000.lhr
    /* JADX INFO: renamed from: a */
    public final void mo15318a(Activity activity) {
        kxk.m14970P(new cnm(this, 10), this.f38460l);
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        ((lkf) ((oju) ((mrq) this.f38461m).f41482a).get()).mo4715a(this);
        this.f38462n.m15360a(this);
        m15551j(3, this.f38463o);
        kxk.m14970P(new cnm(this, 9), this.f38460l);
        if (this.f38458j) {
            mo15548e();
        }
    }

    @Override // p000.lho
    /* JADX INFO: renamed from: b */
    public final void mo15350b(Activity activity, Bundle bundle) {
        if (this.f38466r.getAndSet(true)) {
            return;
        }
        m15551j(4, this.f38464p);
    }

    @Override // p000.lht
    /* JADX INFO: renamed from: c */
    public final void mo15354c(Activity activity) {
        Class<?> cls = activity.getClass();
        this.f38450b = !mro.m16832b(null) ? new lgp("null".concat(String.valueOf(cls.getSimpleName()))) : new lgp(cls.getSimpleName());
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public final void mo15356d(Activity activity) {
        this.f38450b = null;
    }

    @Override // p000.ljw
    /* JADX INFO: renamed from: e */
    public final void mo15548e() {
        if (this.f38457i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new ljz(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX INFO: renamed from: f */
    public final void m15552f(paf pafVar) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        pae paeVar;
        paf pafVar2 = pafVar;
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        ljq ljqVar = (ljq) this.f38451c.get();
        if (ljqVar.mo15379b()) {
            mrm mrmVar = (mrm) this.f38468t.f39819d;
            lhm lhmVarM15349a = mrmVar.mo16813g() ? ((lhn) mrmVar.mo16809c()).m15349a() : lhm.f38276a;
            if (((lju) this.f38455g.get()).f38433a) {
                ljs ljsVar = this.f38456h;
                nxl nxlVarM18137O = pae.f47170d.m18137O();
                if (ljsVar.f38424e.getAndSet(false)) {
                    lju ljuVar = (lju) ljsVar.f38423d.get();
                    if (SystemClock.uptimeMillis() - ljsVar.f38425f > ljuVar.f38436d) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        pae paeVar2 = (pae) nxlVarM18137O.f44974b;
                        paeVar2.f47173b = 2;
                        paeVar2.f47172a |= 1;
                        paeVar = (pae) nxlVarM18137O.mo18103l();
                    } else {
                        Object objMo6051a = ljsVar.f38420a.mo6051a();
                        Object objMo6051a2 = ljsVar.f38421b.mo6051a();
                        mrm mrmVar2 = (mrm) objMo6051a;
                        if (mrmVar2.mo16813g()) {
                            mrm mrmVar3 = (mrm) objMo6051a2;
                            if (mrmVar3.mo16813g()) {
                                ljr ljrVar = new ljr((File) mrmVar2.mo16809c(), (String) mrmVar3.mo16809c());
                                int iM15544a = ljrVar.m15544a();
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                nxq nxqVar = nxlVarM18137O.f44974b;
                                pae paeVar3 = (pae) nxqVar;
                                paeVar3.f47172a = 2 | paeVar3.f47172a;
                                paeVar3.f47174c = iM15544a;
                                int i = iM15544a + 1;
                                if (i >= ljuVar.f38435c) {
                                    if (!nxqVar.m18142ac()) {
                                        nxlVarM18137O.mo18106p();
                                    }
                                    pae paeVar4 = (pae) nxlVarM18137O.f44974b;
                                    paeVar4.f47173b = 5;
                                    paeVar4.f47172a |= 1;
                                    paeVar = (pae) nxlVarM18137O.mo18103l();
                                } else {
                                    if (ljrVar.m15546c()) {
                                        ljrVar.f38416c++;
                                        nxl nxlVarM18137O2 = ljv.f38439c.m18137O();
                                        int i2 = ljrVar.f38416c;
                                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                            nxlVarM18137O2.mo18106p();
                                        }
                                        ljv ljvVar = (ljv) nxlVarM18137O2.f44974b;
                                        ljvVar.f38441a |= 1;
                                        ljvVar.f38442b = i2;
                                        ljv ljvVar2 = (ljv) nxlVarM18137O2.mo18103l();
                                        boolean z2 = false;
                                        while (true) {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(ljrVar.m15545b());
                                                try {
                                                    ljvVar2.mo17759I(fileOutputStream);
                                                    fileOutputStream.close();
                                                    break;
                                                } catch (Throwable th) {
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod(zuAgeeF.EVopU, Throwable.class).invoke(th, th2);
                                                        throw th;
                                                    }
                                                }
                                            } catch (FileNotFoundException e) {
                                                if (z2) {
                                                    break;
                                                }
                                                ljrVar.f38415b.mkdirs();
                                                z2 = true;
                                            } catch (IOException e2) {
                                                ((nbe) ((nbe) ((nbe) ljr.f38414a.m17252c()).mo17283h(e2)).mo17276G((char) 4515)).mo17290o("failed to write counter to disk.");
                                            }
                                        }
                                    }
                                    if (i >= ljuVar.f38434b) {
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        pae paeVar5 = (pae) nxlVarM18137O.f44974b;
                                        paeVar5.f47173b = 4;
                                        paeVar5.f47172a |= 1;
                                        paeVar = (pae) nxlVarM18137O.mo18103l();
                                    } else {
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        pae paeVar6 = (pae) nxlVarM18137O.f44974b;
                                        paeVar6.f47173b = 3;
                                        paeVar6.f47172a |= 1;
                                        paeVar = (pae) nxlVarM18137O.mo18103l();
                                    }
                                }
                            } else {
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                pae paeVar7 = (pae) nxlVarM18137O.f44974b;
                                paeVar7.f47173b = 6;
                                paeVar7.f47172a |= 1;
                                paeVar = (pae) nxlVarM18137O.mo18103l();
                            }
                        } else {
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            pae paeVar8 = (pae) nxlVarM18137O.f44974b;
                            paeVar8.f47173b = 6;
                            paeVar8.f47172a |= 1;
                            paeVar = (pae) nxlVarM18137O.mo18103l();
                        }
                    }
                } else {
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    pae paeVar9 = (pae) nxlVarM18137O.f44974b;
                    paeVar9.f47173b = 1;
                    paeVar9.f47172a |= 1;
                    paeVar = (pae) nxlVarM18137O.mo18103l();
                }
                nxl nxlVar = (nxl) pafVar2.m18143ad(5);
                nxlVar.m18108s(pafVar2);
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                paf pafVar3 = (paf) nxlVar.f44974b;
                paf pafVar4 = paf.f47175l;
                paeVar.getClass();
                pafVar3.f47187k = paeVar;
                pafVar3.f47177a |= 2048;
                pafVar2 = (paf) nxlVar.mo18103l();
                int iM15630Z = lku.m15630Z(paeVar.f47173b);
                z = iM15630Z != 0 && iM15630Z == 5;
            } else {
                z = false;
            }
            try {
                long j = lij.m15455y() ? ((lkc) this.f38467s.get()).f38472a : ((lkc) this.f38467s.get()).f38473b;
                mbl mblVar = this.f38468t;
                lja ljaVarM15522a = ljb.m15522a();
                nxl nxlVarM18137O3 = pat.f47274u.m18137O();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                pat patVar = (pat) nxlVarM18137O3.f44974b;
                pafVar2.getClass();
                patVar.f47282g = pafVar2;
                patVar.f47276a |= 64;
                ljaVarM15522a.m15515e((pat) nxlVarM18137O3.mo18103l());
                ljaVarM15522a.f38345d = null;
                ljaVarM15522a.f38348g = lhmVarM15349a;
                ljaVarM15522a.m15512b(ljqVar.f38411b);
                mblVar.m16298b(ljaVarM15522a.m15511a()).get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e4) {
            } catch (Throwable th3) {
            }
            while (this.f38463o.getAndDecrement() > 0) {
                m15553g(3, ljqVar);
            }
            if (((lju) this.f38455g.get()).f38433a && !this.f38453e.getAndSet(true)) {
                m15554h(6, ljqVar, ((lju) this.f38455g.get()).f38437e);
            }
            while (this.f38464p.getAndDecrement() > 0) {
                m15553g(4, ljqVar);
            }
            while (this.f38465q.getAndDecrement() > 0) {
                m15553g(5, ljqVar);
            }
            if (z) {
                mrm mrmVar4 = ljqVar.f38412c;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final nps m15553g(int i, ljq ljqVar) {
        return m15554h(i, ljqVar, ljqVar.f38410a / 100.0f);
    }

    /* JADX INFO: renamed from: h */
    public final nps m15554h(int i, ljq ljqVar, float f) {
        if (!ljqVar.mo15379b()) {
            return npp.f44031a;
        }
        lno lnoVarM15478a = this.f38469u.m15478a(f);
        if (lnoVarM15478a.f38767b.nextFloat() >= lnoVarM15478a.f38766a) {
            return npp.f44031a;
        }
        mbl mblVar = this.f38468t;
        lja ljaVarM15522a = ljb.m15522a();
        nxl nxlVarM18137O = pat.f47274u.m18137O();
        nxl nxlVarM18137O2 = par.f47262d.m18137O();
        float f2 = 1.0f / f;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        int i2 = (int) f2;
        nxq nxqVar = nxlVarM18137O2.f44974b;
        par parVar = (par) nxqVar;
        parVar.f47264a |= 2;
        parVar.f47266c = i2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        par parVar2 = (par) nxlVarM18137O2.f44974b;
        parVar2.f47265b = i - 1;
        parVar2.f47264a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pat patVar = (pat) nxlVarM18137O.f44974b;
        par parVar3 = (par) nxlVarM18137O2.mo18103l();
        parVar3.getClass();
        patVar.f47292q = parVar3;
        patVar.f47276a |= 33554432;
        ljaVarM15522a.m15515e((pat) nxlVarM18137O.mo18103l());
        return mblVar.m16298b(ljaVarM15522a.m15511a());
    }

    /* JADX INFO: renamed from: i */
    public final nxl m15555i() {
        nxl nxlVarM18137O = paf.f47175l.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        paf pafVar = (paf) nxlVarM18137O.f44974b;
        pafVar.f47177a |= 1;
        pafVar.f47178b = true;
        lgp lgpVar = this.f38450b;
        String str = lgpVar == null ? null : lgpVar.f38223a;
        if (str != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            paf pafVar2 = (paf) nxlVarM18137O.f44974b;
            pafVar2.f47177a |= 4;
            pafVar2.f47180d = str;
        }
        try {
            nxl nxlVarM18137O2 = ozz.f47128c.m18137O();
            ozy ozyVarM14874m = kua.m14874m(lib.m15377b(this.f38459k));
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            ozz ozzVar = (ozz) nxlVarM18137O2.f44974b;
            ozyVarM14874m.getClass();
            ozzVar.f47131b = ozyVarM14874m;
            ozzVar.f47130a |= 1;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            paf pafVar3 = (paf) nxlVarM18137O.f44974b;
            ozz ozzVar2 = (ozz) nxlVarM18137O2.mo18103l();
            ozzVar2.getClass();
            pafVar3.f47179c = ozzVar2;
            pafVar3.f47177a |= 2;
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) f38449a.m17252c()).mo17283h(e)).mo17276G((char) 4518)).mo17290o("Failed to get process stats.");
        }
        return nxlVarM18137O;
    }
}
