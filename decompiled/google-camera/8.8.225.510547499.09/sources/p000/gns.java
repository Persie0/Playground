package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToLongBiFunction;
import p021j$.util.Collection$EL;
import p021j$.util.function.Function$CC;
import p021j$.util.function.IntUnaryOperator$CC;
import p021j$.util.stream.IntStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gns implements ech, ecy, edi, ecx {

    /* JADX INFO: renamed from: a */
    public static final nbh f25778a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/SecondaryStereoProcessor");

    /* JADX INFO: renamed from: b */
    public final mrm f25779b;

    /* JADX INFO: renamed from: c */
    public final gol f25780c;

    /* JADX INFO: renamed from: d */
    public final gva f25781d;

    /* JADX INFO: renamed from: e */
    private final Executor f25782e;

    /* JADX INFO: renamed from: f */
    private final HashMap f25783f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final ohb f25784g;

    /* JADX INFO: renamed from: h */
    private final efw f25785h;

    /* JADX INFO: renamed from: i */
    private final boolean f25786i;

    /* JADX INFO: renamed from: j */
    private final nta f25787j;

    /* JADX INFO: renamed from: k */
    private final gkz f25788k;

    /* JADX INFO: renamed from: l */
    private final bko f25789l;

    /* JADX INFO: renamed from: m */
    private final cwd f25790m;

    public gns(gva gvaVar, gkz gkzVar, mrm mrmVar, ohb ohbVar, Executor executor, bko bkoVar, gol golVar, efw efwVar, ohb ohbVar2, dhv dhvVar, nta ntaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25781d = gvaVar;
        this.f25788k = gkzVar;
        this.f25779b = mrmVar;
        this.f25784g = ohbVar;
        this.f25782e = executor;
        this.f25789l = bkoVar;
        this.f25780c = golVar;
        this.f25785h = efwVar;
        this.f25790m = cwd.m5640N(ohbVar2);
        this.f25786i = dhvVar.mo6183k(dht.f11169B);
        lku.m15613H(mrmVar.mo16813g());
        this.f25787j = ntaVar;
        dhvVar.mo6178f();
    }

    /* JADX INFO: renamed from: l */
    private static void m9565l(edg edgVar, edh edhVar, Throwable th) {
        if (th == null) {
            th = new Throwable();
        }
        edc edcVar = new edc(th);
        if (edgVar != null) {
            edgVar.mo7175b(edcVar);
        }
        if (edhVar != null) {
            ((nbe) ((nbe) ((nbe) f25778a.m17252c()).mo17283h(edcVar)).mo17276G((char) 3062)).mo17293r("Error getting RGB image from secondary shot: %s", edcVar.getMessage());
            int i = mws.f41739d;
            ((gnq) edhVar).m9563b(null, null, mzr.f41857a);
        }
    }

    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        eemVar.m7218a();
        gnr gnrVar = (gnr) this.f25783f.get(eemVar);
        if (gnrVar == null) {
            ((nbe) ((nbe) f25778a.m17252c()).mo17276G(3092)).mo17291p("Shot %s hasn't been started yet or was aborted!", eemVar.m7218a());
        } else {
            gnrVar.f25737l.mo14894e(Integer.valueOf(i));
            gnrVar.f25775a.mo14894e(Long.valueOf(j));
        }
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7058c(eem eemVar, edc edcVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7111d(gyu gyuVar) {
        eem eemVar;
        Iterator it = this.f25783f.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar == null) {
            return;
        }
        ((nbe) ((nbe) f25778a.m17252c()).mo17276G(3066)).mo17291p("Aborting shot %s", eemVar.m7218a());
        this.f25789l.m2623q(gyuVar);
        gnj gnjVar = (gnj) this.f25783f.remove(eemVar);
        if (gnjVar != null) {
            gnjVar.mo7643b();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7112e(eem eemVar, key keyVar) {
        gnr gnrVar = (gnr) this.f25783f.get(eemVar);
        if (gnrVar != null) {
            gnrVar.mo7644c(keyVar);
            return;
        }
        keyVar.mo7041b();
        eemVar.m7218a();
        keyVar.close();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        eemVar.m7218a();
        lku.m15613H(!this.f25783f.containsKey(eemVar));
        this.f25783f.put(eemVar, new gnr(this, eemVar.f13675v, this.f25788k.m9396a(), burstSpec, kppVar, null, null));
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final synchronized void mo7114g(gyu gyuVar) {
        een eenVarM2622p = this.f25789l.m2622p(gyuVar);
        eenVarM2622p.m7221a(this);
        eenVarM2622p.m7226f(this);
        if (this.f25790m.m5652K()) {
            if (eenVarM2622p.f13686f == null) {
                eenVarM2622p.f13686f = mxk.m17132D();
            }
            eenVarM2622p.f13686f.mo17072d(this);
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final synchronized void mo7115h(eem eemVar) {
        eemVar.m7218a();
        gnr gnrVar = (gnr) this.f25783f.get(eemVar);
        if (gnrVar == null) {
            ((nbe) ((nbe) f25778a.m17252c()).mo17276G(3095)).mo17291p("Shot %s hasn't started yet or was aborted!", eemVar.m7218a());
        } else {
            this.f25782e.execute(new ghc(this, eemVar, gnrVar, 5));
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    @Override // p000.ecx
    /* JADX INFO: renamed from: j */
    public final void mo7171j(eem eemVar, AeResults aeResults) {
        gnr gnrVar = (gnr) this.f25783f.get(eemVar);
        if (gnrVar == null) {
            eemVar.m7218a();
        } else if (this.f25790m.m5652K()) {
            gnrVar.m9564a(new ecp(aeResults.m4882a(nqz.f44120a) * ((Float) this.f25790m.m5651J()).floatValue(), aeResults.m4882a(nqz.f44121b) * ((Float) this.f25790m.m5651J()).floatValue()));
        } else {
            gnrVar.m9564a(new ecp(-1.0f, -1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0333 A[Catch: all -> 0x0321, TryCatch #2 {all -> 0x0321, blocks: (B:3:0x000a, B:7:0x001e, B:9:0x0022, B:16:0x002f, B:20:0x0048, B:22:0x0052, B:28:0x0090, B:30:0x00a4, B:40:0x00eb, B:45:0x0108, B:47:0x0127, B:49:0x0134, B:52:0x0150, B:57:0x01d4, B:59:0x01e7, B:61:0x020a, B:63:0x0212, B:65:0x0220, B:67:0x0228, B:69:0x023b, B:71:0x0243, B:73:0x024b, B:75:0x0253, B:77:0x0259, B:85:0x028a, B:87:0x02a4, B:81:0x027c, B:83:0x0285, B:84:0x0288, B:86:0x029c, B:68:0x0239, B:58:0x01e5, B:55:0x0158, B:48:0x012e, B:31:0x00b5, B:32:0x00bd, B:34:0x00c3, B:36:0x00d5, B:116:0x032f, B:118:0x0333, B:119:0x033a, B:125:0x0359, B:127:0x0376, B:18:0x003a, B:101:0x02f1), top: B:138:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:122:0x034a  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x029c A[Catch: dos -> 0x02e5, CancellationException -> 0x02e7, ExecutionException -> 0x02e9, InterruptedException -> 0x02eb, doh -> 0x02ef, all -> 0x0321, TryCatch #2 {all -> 0x0321, blocks: (B:3:0x000a, B:7:0x001e, B:9:0x0022, B:16:0x002f, B:20:0x0048, B:22:0x0052, B:28:0x0090, B:30:0x00a4, B:40:0x00eb, B:45:0x0108, B:47:0x0127, B:49:0x0134, B:52:0x0150, B:57:0x01d4, B:59:0x01e7, B:61:0x020a, B:63:0x0212, B:65:0x0220, B:67:0x0228, B:69:0x023b, B:71:0x0243, B:73:0x024b, B:75:0x0253, B:77:0x0259, B:85:0x028a, B:87:0x02a4, B:81:0x027c, B:83:0x0285, B:84:0x0288, B:86:0x029c, B:68:0x0239, B:58:0x01e5, B:55:0x0158, B:48:0x012e, B:31:0x00b5, B:32:0x00bd, B:34:0x00c3, B:36:0x00d5, B:116:0x032f, B:118:0x0333, B:119:0x033a, B:125:0x0359, B:127:0x0376, B:18:0x003a, B:101:0x02f1), top: B:138:0x000a }] */
    /* JADX WARN: Type inference failed for: r12v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [gaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9566k(eem eemVar, gnr gnrVar) {
        Throwable th;
        gnq gnqVar;
        gnp gnpVar;
        gnp gnpVar2;
        nbe nbeVar;
        int i;
        boolean z;
        kpp kppVarM9557b;
        kmg kmgVarMo14193c;
        mrn mrnVarM16830a;
        int i2;
        String str = DNTdN.SRNfW;
        try {
            try {
                boolean z2 = this.f25779b.mo16809c() instanceof efx;
                egl eglVar = eemVar.f13669p.f13974b;
                boolean z3 = eglVar == egl.ZOOM;
                if (eglVar != egl.DEBLUR) {
                    z = eglVar == egl.NONE && !z2;
                } else {
                    z = true;
                }
                try {
                    if (!z3) {
                        if (z) {
                            gnpVar2 = new gnp(this, gnrVar.f25745t, 0, (byte[]) null, (byte[]) null);
                            gnqVar = null;
                        } else {
                            nbh nbhVar = f25778a;
                            ((nbe) ((nbe) nbhVar.m17252c()).mo17276G(3070)).mo17290o("Aborting secondary shot!!");
                            gnrVar.mo7643b();
                            gnrVar.m9554g();
                            if (((gnr) this.f25783f.remove(eemVar)) != null) {
                                return;
                            }
                            nbeVar = (nbe) nbhVar.m17252c();
                            i = 3071;
                        }
                        ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
                    }
                    gnqVar = new gnq(this, gnrVar.f25745t, null, null);
                    gnpVar2 = null;
                    List listM9553f = gnrVar.m9553f();
                    if (listM9553f.isEmpty()) {
                        nbh nbhVar2 = f25778a;
                        ((nbe) ((nbe) nbhVar2.m17252c()).mo17276G(3088)).mo17290o("No payload frames found, aborting shot.");
                        gnrVar.mo7643b();
                        m9565l(gnpVar2, gnqVar, null);
                        gnrVar.m9554g();
                        if (((gnr) this.f25783f.remove(eemVar)) != null) {
                            return;
                        }
                        nbeVar = (nbe) nbhVar2.m17252c();
                        i = 3089;
                    } else {
                        kpp kppVar = eemVar.f13668o;
                        kgg kggVarM9493b = this.f25781d.m9784a((key) listM9553f.get(0)).m9493b();
                        if (kggVarM9493b == null) {
                            nba it = ((mws) listM9553f).iterator();
                            kpp kppVar2 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    kppVarM9557b = kppVar2;
                                    kmgVarMo14193c = null;
                                    break;
                                }
                                gmc gmcVarM9784a = this.f25781d.m9784a((key) it.next());
                                kpp kppVarM9556a = gnk.m9556a(gmcVarM9784a, false);
                                if (kppVarM9556a != null) {
                                    kgg kggVarM9493b2 = gmcVarM9784a.m9493b();
                                    kggVarM9493b2.getClass();
                                    kmgVarMo14193c = kggVarM9493b2.mo14193c();
                                    kppVarM9557b = kppVarM9556a;
                                    break;
                                }
                                kppVar2 = kppVarM9556a;
                            }
                        } else {
                            kppVarM9557b = gnk.m9557b(kppVar, kggVarM9493b.mo14193c().f36540a);
                            kmgVarMo14193c = kggVarM9493b.mo14193c();
                        }
                        if (kppVarM9557b == null) {
                            m9565l(gnpVar2, gnqVar, null);
                            gnrVar.m9554g();
                            if (((gnr) this.f25783f.remove(eemVar)) != null) {
                                return;
                            }
                            nbeVar = (nbe) f25778a.m17252c();
                            i = 3086;
                        } else {
                            int iIntValue = ((Integer) gnrVar.f25737l.get()).intValue();
                            eemVar.m7218a();
                            een eenVarM2622p = this.f25789l.m2622p(eemVar.f13675v.f25502c.mo9902h());
                            if (gnqVar != null) {
                                eemVar.m7218a();
                                eenVarM2622p.m7225e(gnqVar);
                            } else {
                                eemVar.m7218a();
                                eenVarM2622p.m7224d(gnpVar2);
                            }
                            List listM9553f2 = gnrVar.m9553f();
                            final long jLongValue = ((Long) gnrVar.f25775a.get()).longValue();
                            if (eemVar.f13669p.f13974b != egl.NONE || iIntValue < 0 || iIntValue >= ((mzr) listM9553f2).f41859c) {
                                ngu nguVarM17471c = new ngt(IntStream.CC.iterate(0, new IntUnaryOperator() { // from class: ngv
                                    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                                        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                                    }

                                    @Override // java.util.function.IntUnaryOperator
                                    public final int applyAsInt(int i3) {
                                        return i3 + 1;
                                    }

                                    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                                        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                                    }
                                }).boxed(), Collection$EL.stream(listM9553f2)).m17471c(fjv.f22316j);
                                final ToLongBiFunction toLongBiFunction = new ToLongBiFunction() { // from class: gno
                                    @Override // java.util.function.ToLongBiFunction
                                    public final long applyAsLong(Object obj, Object obj2) {
                                        long j = jLongValue;
                                        kfd kfdVarMo7041b = ((key) obj2).mo7041b();
                                        kfdVarMo7041b.getClass();
                                        return Math.abs(kfdVarMo7041b.f35811b - j);
                                    }
                                };
                                ngh[] nghVarArr = new ngh[0];
                                iIntValue = ((Integer) ((ngk) ngu.m17469d(((ngn) nguVarM17471c).f42224a.sorted(new ngh() { // from class: ngf
                                    @Override // p000.ngh
                                    /* JADX INFO: renamed from: a */
                                    public final int mo17462a(Object obj, Object obj2, Object obj3, Object obj4) {
                                        ToLongBiFunction toLongBiFunction2 = toLongBiFunction;
                                        return (toLongBiFunction2.applyAsLong(obj, obj2) > toLongBiFunction2.applyAsLong(obj3, obj4) ? 1 : (toLongBiFunction2.applyAsLong(obj, obj2) == toLongBiFunction2.applyAsLong(obj3, obj4) ? 0 : -1));
                                    }

                                    @Override // p000.ngh
                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ngh mo17463b(ngh nghVar) {
                                        return nea.m17405s(this, nghVar);
                                    }

                                    @Override // p000.ngh
                                    /* JADX INFO: renamed from: c */
                                    public final /* synthetic */ Comparator mo17464c(Function function, Function function2) {
                                        return nea.m17406t(this, function, function2);
                                    }
                                }.mo17464c(igl.f30788u, ngl.f42222a))).m17471c(new gfw(this, 8)).mo17468b(ifs.f30685e).findFirst().map(Function$CC.identity()).map(igl.f30787t).orElse(ngk.f42221a)).mo17465a(fal.f21115b).orElse(-1)).intValue();
                            }
                            mrm mrmVarMo4178a = iIntValue >= 0 ? this.f25785h.mo4178a((key) gnrVar.m9553f().get(iIntValue)) : mqu.f41450a;
                            eemVar.m7218a();
                            glk glkVar = gnrVar.f25745t;
                            ftz ftzVar = new ftz((fua) glkVar.f25503d);
                            ftzVar.f23563c = mrmVarMo4178a;
                            glk glkVar2 = new glk(ftzVar.m8800a(), (gyh) glkVar.f25502c, (gav) glkVar.f25501b, (gaw) glkVar.f25500a);
                            mrm mrmVarM16829i = mqu.f41450a;
                            if (z3 && this.f25790m.m5652K()) {
                                mrmVarM16829i = mrm.m16829i((ecp) gnrVar.f25776b.get());
                            }
                            mrm mrmVar = mrmVarM16829i;
                            mrm mrmVarM16829i2 = mrmVar.mo16813g() ? mrm.m16829i(Float.valueOf(((ecp) mrmVar.mo16809c()).f13393b)) : mqu.f41450a;
                            egl eglVar2 = eemVar.f13669p.f13974b;
                            if (this.f25786i && eglVar2.equals(egl.ZOOM) && ((mzr) listM9553f).f41859c > 3 && mrmVarM16829i2.mo16813g()) {
                                float[] fArrM17687q = this.f25787j.m17687q(kppVarM9557b);
                                if ((((Float) mrmVarM16829i2.mo16809c()).floatValue() / fArrM17687q[0]) / fArrM17687q[1] < 10.0f) {
                                    if (iIntValue == 0) {
                                        iIntValue = 0;
                                        i2 = 0;
                                    } else {
                                        i2 = iIntValue == ((mzr) listM9553f).f41859c + (-1) ? iIntValue - 2 : iIntValue - 1;
                                    }
                                    mrnVarM16830a = mrn.m16830a(((mws) listM9553f).subList(i2, i2 + 3), Integer.valueOf(iIntValue - i2));
                                } else {
                                    mrnVarM16830a = mrn.m16830a(listM9553f, Integer.valueOf(iIntValue));
                                }
                            } else {
                                mrnVarM16830a = mrn.m16830a(listM9553f, Integer.valueOf(iIntValue));
                            }
                            gnn gnnVar = (gnn) this.f25784g.get();
                            kmgVarMo14193c.getClass();
                            gnnVar.mo9354a(kmgVarMo14193c, (List) mrnVarM16830a.f41479a, gkh.f25277d, glkVar2, ((Integer) mrnVarM16830a.f41480b).intValue(), kppVarM9557b, gnrVar.f25744s, mrmVar);
                            gnrVar.m9554g();
                            if (((gnr) this.f25783f.remove(eemVar)) != null) {
                                return;
                            }
                            nbeVar = (nbe) f25778a.m17252c();
                            i = 3081;
                        }
                    }
                } catch (doh e) {
                    nbh nbhVar3 = f25778a;
                    ((nbe) ((nbe) nbhVar3.m17252c()).mo17276G(3072)).mo17290o("Secondary shot didn't proceed.");
                    if (eemVar.f13669p.f13974b != egl.NONE) {
                        ((nbe) ((nbe) nbhVar3.m17252c()).mo17276G(3074)).mo17290o("Notifying error.");
                        m9565l(gnpVar2, gnqVar, null);
                    }
                    gnrVar.m9554g();
                    if (((gnr) this.f25783f.remove(eemVar)) != null) {
                        return;
                    }
                    nbeVar = (nbe) nbhVar3.m17252c();
                    i = 3073;
                } catch (dos e2) {
                    e = e2;
                    th = e;
                    gnpVar = gnpVar2;
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m9565l(gnpVar, gnqVar, th);
                    gnrVar.m9554g();
                    if (((gnr) this.f25783f.remove(eemVar)) == null) {
                        return;
                    }
                    nbeVar = (nbe) f25778a.m17252c();
                    i = 3076;
                } catch (InterruptedException e3) {
                    e = e3;
                    th = e;
                    gnpVar = gnpVar2;
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m9565l(gnpVar, gnqVar, th);
                    gnrVar.m9554g();
                    if (((gnr) this.f25783f.remove(eemVar)) == null) {
                        return;
                    }
                    nbeVar = (nbe) f25778a.m17252c();
                    i = 3076;
                } catch (CancellationException e4) {
                    e = e4;
                    th = e;
                    gnpVar = gnpVar2;
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m9565l(gnpVar, gnqVar, th);
                    gnrVar.m9554g();
                    if (((gnr) this.f25783f.remove(eemVar)) == null) {
                        return;
                    }
                    nbeVar = (nbe) f25778a.m17252c();
                    i = 3076;
                } catch (ExecutionException e5) {
                    e = e5;
                    th = e;
                    gnpVar = gnpVar2;
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m9565l(gnpVar, gnqVar, th);
                    gnrVar.m9554g();
                    if (((gnr) this.f25783f.remove(eemVar)) == null) {
                        return;
                    }
                    nbeVar = (nbe) f25778a.m17252c();
                    i = 3076;
                }
            } catch (Throwable th2) {
                gnrVar.m9554g();
                if (((gnr) this.f25783f.remove(eemVar)) != null) {
                    throw th2;
                }
                ((nbe) ((nbe) f25778a.m17252c()).mo17276G(3075)).mo17291p(str, eemVar.m7218a());
                throw th2;
            }
        } catch (doh e6) {
            gnqVar = null;
            gnpVar2 = null;
        } catch (dos e7) {
            e = e7;
            th = e;
            gnqVar = null;
            gnpVar = null;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m9565l(gnpVar, gnqVar, th);
            gnrVar.m9554g();
            if (((gnr) this.f25783f.remove(eemVar)) == null) {
                nbeVar = (nbe) f25778a.m17252c();
                i = 3076;
                ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
            }
            return;
        } catch (InterruptedException e8) {
            e = e8;
            th = e;
            gnqVar = null;
            gnpVar = null;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m9565l(gnpVar, gnqVar, th);
            gnrVar.m9554g();
            if (((gnr) this.f25783f.remove(eemVar)) == null) {
                nbeVar = (nbe) f25778a.m17252c();
                i = 3076;
                ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
            }
            return;
        } catch (CancellationException e9) {
            e = e9;
            th = e;
            gnqVar = null;
            gnpVar = null;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m9565l(gnpVar, gnqVar, th);
            gnrVar.m9554g();
            if (((gnr) this.f25783f.remove(eemVar)) == null) {
                nbeVar = (nbe) f25778a.m17252c();
                i = 3076;
                ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
            }
            return;
        } catch (ExecutionException e10) {
            e = e10;
            th = e;
            gnqVar = null;
            gnpVar = null;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m9565l(gnpVar, gnqVar, th);
            gnrVar.m9554g();
            if (((gnr) this.f25783f.remove(eemVar)) == null) {
                nbeVar = (nbe) f25778a.m17252c();
                i = 3076;
                ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
            }
            return;
        }
        ((nbe) nbeVar.mo17276G(i)).mo17291p(str, eemVar.m7218a());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final synchronized void mo7059p(eem eemVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }
}
