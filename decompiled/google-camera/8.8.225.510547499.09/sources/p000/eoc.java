package p000;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoc {

    /* JADX INFO: renamed from: a */
    public static final nbh f14822a = nbh.m17259h("com/google/android/apps/camera/kepler/AstrolapseController");

    /* JADX INFO: renamed from: b */
    public final long f14823b;

    /* JADX INFO: renamed from: c */
    public final ohb f14824c;

    /* JADX INFO: renamed from: d */
    public final Executor f14825d;

    /* JADX INFO: renamed from: e */
    public final kbz f14826e;

    /* JADX INFO: renamed from: f */
    public final fem f14827f;

    /* JADX INFO: renamed from: g */
    public final inm f14828g;

    /* JADX INFO: renamed from: h */
    public final dhv f14829h;

    /* JADX INFO: renamed from: i */
    public final jwn f14830i;

    /* JADX INFO: renamed from: j */
    public final Map f14831j = new HashMap();

    /* JADX INFO: renamed from: k */
    public final fvu f14832k;

    /* JADX INFO: renamed from: l */
    public final bko f14833l;

    /* JADX INFO: renamed from: m */
    public final glk f14834m;

    /* JADX INFO: renamed from: n */
    private final int f14835n;

    public eoc(dhv dhvVar, ohb ohbVar, bko bkoVar, fvu fvuVar, Executor executor, glk glkVar, kbz kbzVar, fem femVar, inm inmVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14835n = ((Integer) dhvVar.mo6173a(did.f11463q).get()).intValue();
        this.f14823b = ((Integer) dhvVar.mo6173a(did.f11465s).orElse(100)).intValue();
        this.f14824c = ohbVar;
        this.f14833l = bkoVar;
        this.f14832k = fvuVar;
        this.f14825d = executor;
        this.f14834m = glkVar;
        this.f14826e = kbzVar;
        this.f14827f = femVar;
        this.f14828g = inmVar;
        this.f14829h = dhvVar;
        this.f14830i = jwnVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7583a(eem eemVar) {
        nbz nbzVar = nch.f41987a;
        eemVar.m7218a();
        eob eobVar = (eob) this.f14831j.get(eemVar);
        if (eobVar == null) {
            ((nbe) ((nbe) f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17276G(1651)).mo17291p("Missing InflightSession for shot id %s", eemVar.m7218a());
        } else {
            m7584b(eobVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7584b(eob eobVar) {
        Iterator it = eobVar.f14813f.iterator();
        while (it.hasNext()) {
            ((gnj) it.next()).m9554g();
        }
        eobVar.f14814g.cancel(true);
        eobVar.f14815h.cancel(true);
        eobVar.f14809b.m9554g();
        eod eodVar = eobVar.f14821n;
        if (eodVar != null) {
            eodVar.m7589c();
        }
        this.f14831j.remove(eobVar.f14808a);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7585c(eem eemVar, gnj gnjVar, int i, kqc kqcVar, nqf nqfVar) {
        nbz nbzVar = nch.f41987a;
        eemVar.m7218a();
        lku.m15613H(!this.f14831j.containsKey(eemVar));
        this.f14831j.put(eemVar, new eob(eemVar, gnjVar, i, kqcVar, nqfVar));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final synchronized void m7586d(final eem eemVar) {
        final ArrayList arrayList;
        mzj mzjVarM17175e;
        int i;
        nbz nbzVar = nch.f41987a;
        eemVar.m7218a();
        final eob eobVar = (eob) this.f14831j.get(eemVar);
        int i2 = 0;
        if (eobVar == null) {
            ((nbe) ((nbe) f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17276G(1647)).mo17291p("Missing InflightSession for shot id %s", eemVar.m7218a());
            kxk.m14965K(false);
            return;
        }
        gnj gnjVar = eobVar.f14809b;
        glk glkVar = gnjVar.f25745t;
        glk glkVar2 = new glk((fua) glkVar.f25503d, (gyh) glkVar.f25502c, new gat(), new gbg());
        List listM9553f = gnjVar.m9553f();
        if (((mzr) listM9553f).f41859c < this.f14835n) {
            arrayList = new ArrayList();
        } else {
            BurstSpec burstSpec = gnjVar.f25740o;
            if (burstSpec == null) {
                throw new IllegalStateException("PayloadBurstSpec not provided");
            }
            ArrayList arrayList2 = new ArrayList();
            int size = eobVar.f14813f.size();
            while (size < ((mzr) listM9553f).f41859c) {
                int i3 = this.f14835n;
                if (size < i3) {
                    mzjVarM17175e = mzj.m17175e(Integer.valueOf(i2), Integer.valueOf(this.f14835n - 1));
                    i = size;
                } else {
                    mzjVarM17175e = mzj.m17175e(Integer.valueOf((size - i3) + 1), Integer.valueOf(size));
                    i = this.f14835n - 1;
                }
                FrameRequestVector frameRequestVector = new FrameRequestVector(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
                int iIntValue = ((Integer) mzjVarM17175e.m17180i()).intValue();
                while (iIntValue <= ((Integer) mzjVarM17175e.m17181j()).intValue()) {
                    FrameRequest frameRequestM4968b = burstSpec.m4911b().m4968b(iIntValue);
                    GcamModuleJNI.FrameRequestVector_add(frameRequestVector.f8269a, frameRequestVector, frameRequestM4968b.f8267a, frameRequestM4968b);
                    iIntValue++;
                    size = size;
                    gnjVar = gnjVar;
                }
                gnj gnjVar2 = gnjVar;
                int i4 = size;
                BurstSpec burstSpec2 = new BurstSpec();
                GcamModuleJNI.BurstSpec_frame_requests_set(burstSpec2.f8234a, burstSpec2, frameRequestVector.f8269a, frameRequestVector);
                gnj gnjVar3 = new gnj(glkVar2, gnjVar2.f25744s, burstSpec2, gnjVar2.f25739n, null, null);
                gnjVar3.m9555h(i);
                mws mwsVarSubList = ((mws) listM9553f).subList(((Integer) mzjVarM17175e.m17180i()).intValue(), ((Integer) mzjVarM17175e.m17181j()).intValue() + 1);
                Iterator it = mwsVarSubList.iterator();
                while (it.hasNext()) {
                    key keyVarMo7040a = ((key) it.next()).mo7040a();
                    if (keyVarMo7040a != null) {
                        gnjVar3.mo7644c(keyVarMo7040a);
                    }
                }
                mwsVarSubList.size();
                arrayList2.add(gnjVar3);
                size = i4 + 1;
                gnjVar = gnjVar2;
                i2 = 0;
            }
            arrayList = arrayList2;
        }
        eobVar.f14813f.addAll(arrayList);
        final nqf nqfVarM17621g = nqf.m17621g();
        this.f14825d.execute(new Runnable() { // from class: enz
            /* JADX WARN: Code duplicated, block: B:78:0x016d A[Catch: all -> 0x01b0, TryCatch #8 {all -> 0x01b0, blocks: (B:76:0x0169, B:78:0x016d, B:79:0x0174), top: B:87:0x0169 }] */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
            
                r2.f14833l.m2622p(r4.f13675v.f25502c.mo9902h()).m7222b(new p000.eoa(r2, r3, r2.f14826e.mo13957a("KeplerController#processKeplerShot"), r6));
                r9 = p000.mqu.f41450a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
            
                if (r3.f14818k <= 0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
            
                r18 = p000.mrm.m16828h((com.google.googlex.gcam.AwbInfo) r3.f14814g.get());
                r19 = p000.mrm.m16828h((p000.ecp) r3.f14815h.get());
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
            
                r18 = r9;
                r19 = r18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
            
                r9 = r2.f14827f;
                r10 = r8.f25743r;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
            
                if (r10 <= 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
            
                r12 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
            
                r12 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
            
                p000.lku.m15672z(r12, "%s is an illegal frame count. (Must be > 0", r10);
                p000.lku.m15607B(true, "%s is an illegal size factor. (Must be > 0", java.lang.Float.valueOf(0.25f));
                r9 = (p000.kba) r9.f21536b.m14606c((long) ((p000.lme.m15724j(37, r9.f21537c.m9083b()) * ((long) r10)) * 0.25f)).get();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
            
                r21 = r0;
                ((p000.gkb) r2.f14824c.get()).m9355b(r8.m9553f(), r8.f25745t, ((java.lang.Integer) r8.f25737l.get()).intValue(), r8.f25739n, r8.f25744s, r8.f25740o, r18, r19, r3.f14818k + 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
            
                r8.m9554g();
                r3.f14817j.add(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0117, code lost:
            
                r3.f14818k++;
                r3.f14816i.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
            
                r6 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x012e, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0132, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0133, code lost:
            
                r6 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
            
                r8.m9554g();
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0141, code lost:
            
                throw r0;
             */
            /* JADX WARN: Type inference failed for: r10v2, types: [gyh, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() throws Throwable {
                boolean z;
                Boolean boolValueOf;
                Iterator it2;
                eoc eocVar = this.f14798a;
                List list = arrayList;
                eob eobVar2 = eobVar;
                eem eemVar2 = eemVar;
                nqf nqfVar = nqfVarM17621g;
                int i5 = 0;
                try {
                    Iterator it3 = list.iterator();
                    boolean z2 = false;
                    while (true) {
                        try {
                            if (!it3.hasNext()) {
                                if (eobVar2.f14818k < eobVar2.f14810c) {
                                    break;
                                }
                                eobVar2.f14809b.m9554g();
                                break;
                            } else {
                                gnj gnjVar4 = (gnj) it3.next();
                                eobVar2.f14816i.block();
                                nbz nbzVar2 = nch.f41987a;
                                synchronized (eocVar) {
                                    if (!eocVar.f14831j.containsKey(eobVar2.f14808a)) {
                                        ((nbe) ((nbe) eoc.f14822a.m17252c().mo17282g(nch.f41987a, "KeplerController")).mo17276G(1656)).mo17291p("Stop processing since shot id: %d already removed", eobVar2.f14808a.m7218a());
                                    }
                                }
                                break;
                            }
                            it3 = it2;
                            i5 = 0;
                            z2 = true;
                        } catch (dos e) {
                            e = e;
                            z = z2;
                            try {
                                if (e instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                                eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                                eocVar.m7584b(eobVar2);
                                boolValueOf = Boolean.valueOf(z);
                                nqfVar.mo14894e(boolValueOf);
                            } catch (Throwable th) {
                                th = th;
                                nqfVar.mo14894e(Boolean.valueOf(z));
                                throw th;
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            z = z2;
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                            eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                            eocVar.m7584b(eobVar2);
                            boolValueOf = Boolean.valueOf(z);
                            nqfVar.mo14894e(boolValueOf);
                        } catch (InterruptedException e3) {
                            e = e3;
                            z = z2;
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                            eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                            eocVar.m7584b(eobVar2);
                            boolValueOf = Boolean.valueOf(z);
                            nqfVar.mo14894e(boolValueOf);
                        } catch (ExecutionException e4) {
                            e = e4;
                            z = z2;
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                            eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                            eocVar.m7584b(eobVar2);
                            boolValueOf = Boolean.valueOf(z);
                            nqfVar.mo14894e(boolValueOf);
                        } catch (Throwable th2) {
                            th = th2;
                            z = z2;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } catch (dos e5) {
                    e = e5;
                    z = false;
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                    eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                    eocVar.m7584b(eobVar2);
                    boolValueOf = Boolean.valueOf(z);
                    nqfVar.mo14894e(boolValueOf);
                } catch (IllegalStateException e6) {
                    e = e6;
                    z = false;
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                    eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                    eocVar.m7584b(eobVar2);
                    boolValueOf = Boolean.valueOf(z);
                    nqfVar.mo14894e(boolValueOf);
                } catch (InterruptedException e7) {
                    e = e7;
                    z = false;
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                    eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                    eocVar.m7584b(eobVar2);
                    boolValueOf = Boolean.valueOf(z);
                    nqfVar.mo14894e(boolValueOf);
                } catch (ExecutionException e8) {
                    e = e8;
                    z = false;
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G(1653)).mo17291p("Error processing shot id %s", eemVar2.m7218a());
                    eobVar2.f14812e.mo8566a(new dos("Kepler processing failed!"));
                    eocVar.m7584b(eobVar2);
                    boolValueOf = Boolean.valueOf(z);
                    nqfVar.mo14894e(boolValueOf);
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                nqfVar.mo14894e(boolValueOf);
            }
        });
    }
}
