package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eud implements nph {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f19907a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f19908b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f19909c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f19910d;

    public eud(civ civVar, String str, oju ojuVar, int i) {
        this.f19910d = i;
        this.f19907a = civVar;
        this.f19909c = str;
        this.f19908b = ojuVar;
    }

    public eud(euf eufVar, cjp cjpVar, jvb jvbVar, int i) {
        this.f19910d = i;
        this.f19909c = eufVar;
        this.f19907a = cjpVar;
        this.f19908b = jvbVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f19910d) {
            case 0:
                if (th instanceof CancellationException) {
                    ((nbe) ((nbe) ((nbe) euf.f19913b.m17252c()).mo17283h(th)).mo17276G((char) 1911)).mo17290o("OneCamera open sequence was canceled, shutting down lifetime.");
                } else {
                    ((nbe) ((nbe) ((nbe) euf.f19913b.m17252c()).mo17283h(th)).mo17276G((char) 1910)).mo17290o("OneCamera failed to open, closing lifetime.");
                }
                ((jvb) this.f19908b).close();
                ((euf) this.f19909c).f20008o.m11110a();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oju] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        switch (this.f19910d) {
            case 0:
                final fuc fucVar = (fuc) obj;
                fucVar.getClass();
                if (!((cjp) this.f19907a).m3826a()) {
                    kbz kbzVar = ((euf) this.f19909c).f20000g;
                    final jvb jvbVar = (jvb) this.f19908b;
                    kbzVar.mo13960d("onCameraStarted", new Runnable() { // from class: euc
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, jwn] */
                        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, nps] */
                        /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object, jwn] */
                        /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, jwn] */
                        /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, jwn] */
                        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, jwn] */
                        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, oju] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // java.lang.Runnable
                        public final void run() {
                            eud eudVar = this.f19904a;
                            fuc fucVar2 = fucVar;
                            jvb jvbVar2 = jvbVar;
                            euf eufVar = (euf) eudVar.f19909c;
                            fuc fucVar3 = eufVar.f19923J;
                            boolean z = fucVar3 != null && fucVar3 == fucVar2;
                            eufVar.f19923J = fucVar2;
                            eufVar.f19922I = null;
                            if (z) {
                                eufVar.f19934U.m8577d(fucVar2.mo8575i().f39918f);
                                return;
                            }
                            jvh.m13562j(fucVar2.mo8575i().f39914b, new cis(eufVar, 10), eufVar.f19997d);
                            eufVar.m7901z();
                            kmq kmqVarMo5895d = eufVar.f20007n.mo5895d();
                            fuc fucVar4 = eufVar.f19923J;
                            fucVar4.getClass();
                            hee heeVar = eufVar.f19986au;
                            kmq kmqVarMo5895d2 = eufVar.f20007n.mo5895d();
                            ekr ekrVar = new ekr(eufVar, kmqVarMo5895d, 17);
                            dhv dhvVar = (dhv) heeVar.f27440d.get();
                            dhvVar.getClass();
                            cwd cwdVar = ((dce) heeVar.f27438b).get();
                            dbr dbrVar = (dbr) heeVar.f27437a.get();
                            dbrVar.getClass();
                            jvd jvdVar = (jvd) heeVar.f27444h.get();
                            jvdVar.getClass();
                            kms kmsVar = (kms) heeVar.f27442f.get();
                            kmsVar.getClass();
                            doe doeVar = (doe) heeVar.f27443g.get();
                            doeVar.getClass();
                            dnn dnnVar = (dnn) heeVar.f27439c.get();
                            dnnVar.getClass();
                            ddq ddqVar = (ddq) heeVar.f27441e.get();
                            ddqVar.getClass();
                            kmqVarMo5895d2.getClass();
                            jvbVar2.m13537d(fucVar4.mo8569c(new dbx(dhvVar, cwdVar, dbrVar, jvdVar, kmsVar, doeVar, dnnVar, ddqVar, kmqVarMo5895d2, ekrVar, null, null, null)));
                            if (eufVar.f20018y.mo16813g()) {
                                ((cld) eufVar.f20018y.mo16809c()).mo3902f(fucVar2, jvbVar2);
                            }
                            if (eufVar.f20017x.mo16813g()) {
                                jvbVar2.m13537d(((hnn) eufVar.f20017x.mo16809c()).mo10494a(ikw.PHOTO));
                            }
                            if (eufVar.f19936W.mo16813g()) {
                                hmu hmuVar = (hmu) eufVar.f19936W.mo16809c();
                                eufVar.f19923J.getClass();
                                jvbVar2.m13537d(hmuVar.m10475d());
                            }
                            if (eufVar.f19937X.mo16813g()) {
                                jvbVar2.m13537d(((cgv) eufVar.f19937X.mo16809c()).mo3651a());
                            }
                            idf idfVar = eufVar.f20008o;
                            eufVar.f19981ap.mo14558k();
                            ikw ikwVar = ikw.UNINITIALIZED;
                            idfVar.m11112c();
                            mca mcaVarMo8575i = fucVar2.mo8575i();
                            jwn jwnVarM13640j = jwr.m13640j(jwr.m13632b(mcaVarMo8575i.f39921i, mcaVarMo8575i.f39918f, eufVar.f19966aa), new etx(eufVar, 0));
                            jvbVar2.m13537d(eufVar.f19971af.m3417a(fucVar2, eufVar.f19981ap, fucVar2.mo8575i().f39915c, jwr.m13639i(fucVar2.mo8575i().f39921i, jwnVarM13640j), eufVar.f20015v.mo16813g() && eufVar.f19981ap.mo14558k() == kmq.BACK, eufVar.f20019z.mo16813g(), 1));
                            eufVar.f19915B.mo3693g().mo3717g();
                            eufVar.f20013t.mo11013l(true);
                            jvh.m13561i(eufVar.f19926M, new cdc(eufVar, eufVar.f19935V, 5));
                            eufVar.f19934U.m8577d(fucVar2.mo8575i().f39918f);
                            jvbVar2.m13537d(jwnVarM13640j.mo3830a(new dsu(eufVar, 18), eufVar.f19997d));
                            AccessibilityManager accessibilityManager = eufVar.f19919F;
                            dpx dpxVar = eufVar.f19918E;
                            fvu fvuVar = eufVar.f19981ap;
                            ggm ggmVar = eufVar.f19999f;
                            flz flzVar = eufVar.f19921H;
                            flzVar.getClass();
                            dnr dnrVar = ((ciq) eufVar.f19915B.mo3693g()).f5818C;
                            dhv dhvVar2 = eufVar.f19968ac;
                            dhx dhxVar = dib.f11240a;
                            dhvVar2.mo6175c();
                            dhv dhvVar3 = eufVar.f19968ac;
                            dhx dhxVar2 = diw.f11719a;
                            dhvVar3.mo6179g();
                            eufVar.f19983ar = new hsu(accessibilityManager, dpxVar, fvuVar, ggmVar, flzVar, dnrVar, dhvVar2, eufVar.f19920G, null, null);
                            jvb jvbVar3 = eufVar.f19935V;
                            hsu hsuVar = eufVar.f19983ar;
                            fuc fucVar5 = eufVar.f19923J;
                            fucVar5.getClass();
                            jvbVar3.m13537d(hsuVar.m10716a(fucVar5.mo8575i().f39917e, eufVar.f19997d));
                            if (eufVar.f19936W.mo16813g()) {
                                jvb jvbVar4 = eufVar.f19935V;
                                fuc fucVar6 = eufVar.f19923J;
                                fucVar6.getClass();
                                ?? r3 = fucVar6.mo8575i().f39920h;
                                jwn jwnVarM10472a = ((hmu) eufVar.f19936W.mo16809c()).m10472a();
                                jvd jvdVar2 = eufVar.f19997d;
                                AtomicReference atomicReference = new AtomicReference();
                                jvbVar4.m13537d(new eip(atomicReference, jwnVarM10472a.mo3830a(new ctz(atomicReference, (jwn) r3, jvdVar2, 4), jvdVar2), 12));
                            }
                            hsu hsuVar2 = eufVar.f19983ar;
                            flz flzVar2 = eufVar.f19921H;
                            flzVar2.getClass();
                            hsuVar2.m10717b(flzVar2.f22532d.f31019a);
                            eufVar.f19924K = ((ciq) eufVar.f19915B.mo3693g()).f5844j;
                            eufVar.f19924K.m6429b();
                            if (eufVar.f19968ac.mo6184l(dib.f11357ck)) {
                                hys hysVar = eufVar.f19920G;
                                flz flzVar3 = eufVar.f19921H;
                                flzVar3.getClass();
                                hysVar.m10881d(flzVar3.f22532d.f31019a);
                            }
                            eufVar.m7898w();
                            if (((Boolean) eufVar.f19969ad.f34942d).booleanValue()) {
                                return;
                            }
                            eufVar.f19969ad.mo3415bf(true);
                        }
                    });
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ((civ) this.f19907a).f5900a.execute(new bmj(this, (String) this.f19909c, (oju) this.f19908b, 8, (byte[]) null));
                }
                break;
        }
    }
}
