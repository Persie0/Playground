package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.Consumer$CC;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eor implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14910a;

    /* JADX INFO: renamed from: b */
    private final oju f14911b;

    /* JADX INFO: renamed from: c */
    private final oju f14912c;

    /* JADX INFO: renamed from: d */
    private final oju f14913d;

    /* JADX INFO: renamed from: e */
    private final oju f14914e;

    /* JADX INFO: renamed from: f */
    private final oju f14915f;

    /* JADX INFO: renamed from: g */
    private final oju f14916g;

    /* JADX INFO: renamed from: h */
    private final oju f14917h;

    /* JADX INFO: renamed from: i */
    private final oju f14918i;

    /* JADX INFO: renamed from: j */
    private final oju f14919j;

    /* JADX INFO: renamed from: k */
    private final oju f14920k;

    /* JADX INFO: renamed from: l */
    private final oju f14921l;

    /* JADX INFO: renamed from: m */
    private final oju f14922m;

    /* JADX INFO: renamed from: n */
    private final /* synthetic */ int f14923n;

    public eor(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i) {
        this.f14923n = i;
        this.f14910a = ojuVar;
        this.f14911b = ojuVar2;
        this.f14912c = ojuVar3;
        this.f14913d = ojuVar4;
        this.f14914e = ojuVar5;
        this.f14915f = ojuVar6;
        this.f14916g = ojuVar7;
        this.f14917h = ojuVar8;
        this.f14918i = ojuVar9;
        this.f14919j = ojuVar10;
        this.f14920k = ojuVar11;
        this.f14921l = ojuVar12;
        this.f14922m = ojuVar13;
    }

    public eor(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, byte[] bArr) {
        this.f14923n = i;
        this.f14913d = ojuVar;
        this.f14917h = ojuVar2;
        this.f14915f = ojuVar3;
        this.f14921l = ojuVar4;
        this.f14911b = ojuVar5;
        this.f14912c = ojuVar6;
        this.f14910a = ojuVar7;
        this.f14918i = ojuVar8;
        this.f14914e = ojuVar9;
        this.f14919j = ojuVar10;
        this.f14916g = ojuVar11;
        this.f14920k = ojuVar12;
        this.f14922m = ojuVar13;
    }

    public eor(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, char[] cArr) {
        this.f14923n = i;
        this.f14916g = ojuVar;
        this.f14919j = ojuVar2;
        this.f14915f = ojuVar3;
        this.f14914e = ojuVar4;
        this.f14913d = ojuVar5;
        this.f14910a = ojuVar6;
        this.f14922m = ojuVar7;
        this.f14911b = ojuVar8;
        this.f14917h = ojuVar9;
        this.f14912c = ojuVar10;
        this.f14918i = ojuVar11;
        this.f14921l = ojuVar12;
        this.f14920k = ojuVar13;
    }

    public eor(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, short[] sArr) {
        this.f14923n = i;
        this.f14915f = ojuVar;
        this.f14913d = ojuVar2;
        this.f14916g = ojuVar3;
        this.f14920k = ojuVar4;
        this.f14917h = ojuVar5;
        this.f14919j = ojuVar6;
        this.f14914e = ojuVar7;
        this.f14910a = ojuVar8;
        this.f14918i = ojuVar9;
        this.f14922m = ojuVar10;
        this.f14911b = ojuVar11;
        this.f14921l = ojuVar12;
        this.f14912c = ojuVar13;
    }

    /* JADX INFO: renamed from: a */
    public static eor m7603a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13) {
        return new eor(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13, 0);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        switch (this.f14923n) {
            case 0:
                fba fbaVar = ((eru) this.f14910a).get();
                Context contextM6830a = ((dws) this.f14911b).m6830a();
                hbm hbmVar = ((hbn) this.f14912c).get();
                jww jwwVar = (jww) this.f14913d.get();
                jww jwwVar2 = (jww) this.f14914e.get();
                jww jwwVar3 = (jww) this.f14915f.get();
                jww jwwVar4 = (jww) this.f14916g.get();
                jww jwwVar5 = (jww) this.f14917h.get();
                jww jwwVar6 = (jww) this.f14918i.get();
                dhv dhvVar = (dhv) this.f14919j.get();
                fcp fcpVar = (fcp) this.f14920k.get();
                jvd jvdVar = (jvd) this.f14921l.get();
                eoq eoqVar = new eoq(hbmVar, contextM6830a, new mwb(), jwwVar, jwwVar2, jwwVar3, jwwVar4, jwwVar5, jwwVar6, dhvVar, fcpVar, (Executor) this.f14922m.get());
                fdh.m8265e(jvdVar, fbaVar, eoqVar);
                return eoqVar;
            case 1:
                return new cur(((dww) this.f14913d).m6836a(), (idl) this.f14917h.get(), ((cze) this.f14915f).get(), (gfa) this.f14921l.get(), (csx) this.f14911b.get(), (hnw) this.f14912c.get(), ((hoh) this.f14910a).m10533a(), ((hoh) this.f14918i).m10533a(), ((hog) this.f14914e).m10532a(), (jvd) this.f14919j.get(), (hah) this.f14916g.get(), (hai) this.f14920k.get(), (dhv) this.f14922m.get(), null);
            case 2:
                jvt jvtVar = (jvt) this.f14916g.get();
                oju ojuVar = this.f14919j;
                oju ojuVar2 = this.f14915f;
                oju ojuVar3 = this.f14914e;
                oju ojuVar4 = this.f14913d;
                oju ojuVar5 = this.f14910a;
                oju ojuVar6 = this.f14922m;
                oju ojuVar7 = this.f14911b;
                Executor executorM3825a = ((cjm) this.f14917h).m3825a();
                return new erw(jvtVar, ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, executorM3825a, ((dki) this.f14918i).get(), ((jvu) this.f14921l).get(), (kbz) this.f14920k.get(), null, null);
            default:
                final jfs jfsVar = (jfs) this.f14915f.get();
                final boolean zBooleanValue = ((ino) this.f14913d).get().booleanValue();
                final fls flsVar = (fls) this.f14916g.get();
                hai haiVar = (hai) this.f14920k.get();
                eby ebyVar = (eby) this.f14917h.get();
                msa msaVar = (msa) this.f14919j.get();
                hmw hmwVar = (hmw) this.f14914e.get();
                final jww jwwVar7 = (jww) this.f14910a.get();
                final gdc gdcVar = (gdc) this.f14918i.get();
                dox doxVar = (dox) this.f14922m.get();
                dsx dsxVar = ((dms) this.f14911b).get();
                final dhv dhvVar2 = (dhv) this.f14921l.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f14912c);
                if (dsxVar.m6692g()) {
                    final jwn jwnVar = ebyVar.f13316b;
                    final jww jwwVarMo10030b = haiVar.mo10030b(gzy.f27060s);
                    final jww jwwVarMo10030b2 = haiVar.mo10030b(gzy.f27061t);
                    final jwn jwnVarM13624c = jwj.m13624c(doxVar.mo6465a());
                    final jwn jwnVarM16852g = msaVar.m16852g();
                    final jwn jwnVarM10476a = hmwVar.m10476a();
                    dhx dhxVar = dib.f11240a;
                    dhvVar2.mo6177e();
                    dhvVar2.mo6178f();
                    final geu geuVar = new geu(haiVar.mo10030b(gzy.f27040ax), (Integer) gzy.f27040ax.m10026c(dhvVar2), 0, gfc.MICROVIDEO_OFF, 2, gfc.MICROVIDEO_ON, 1, gfc.MICROVIDEO_AUTO);
                    final fjv fjvVar = new fjv(0);
                    Predicate predicate = new Predicate() { // from class: fjw
                        public final /* synthetic */ Predicate and(Predicate predicate2) {
                            return Predicate$CC.$default$and(this, predicate2);
                        }

                        public final /* synthetic */ Predicate negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public final /* synthetic */ Predicate m8500or(Predicate predicate2) {
                            return Predicate$CC.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return (("on".equals(((gfa) obj).mo9107F() ? ((jwf) jwwVarMo10030b2).f34942d : ((jwf) jwwVarMo10030b).f34942d) && ((Boolean) jwnVarM13624c.mo3831be()).booleanValue()) || gdb.ON.equals(gdcVar.mo3831be()) || ((Boolean) jwwVar7.mo3831be()).booleanValue() || ((Boolean) jwnVar.mo3831be()).booleanValue() || ((Boolean) jwnVarM10476a.mo3831be()).booleanValue() || ((Boolean) jwnVarM16852g.mo3831be()).booleanValue()) ? false : true;
                        }
                    };
                    final byte[] bArr = null;
                    final byte[] bArr2 = null;
                    final byte[] bArr3 = null;
                    Consumer consumer = new Consumer(jfsVar, zBooleanValue, dhvVar2, flsVar, jwnVar, jwnVarM13624c, jwwVar7, jwnVarM10476a, jwnVarM16852g, jwwVarMo10030b, jwwVarMo10030b2, gdcVar, fjvVar, bArr, bArr2, bArr3) { // from class: fjx

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ boolean f22337b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ dhv f22338c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ fls f22339d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ jwn f22340e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ jwn f22341f;

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ jww f22342g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ jwn f22343h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ jwn f22344i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ jwn f22345j;

                        /* JADX INFO: renamed from: k */
                        public final /* synthetic */ jwn f22346k;

                        /* JADX INFO: renamed from: l */
                        public final /* synthetic */ gdc f22347l;

                        /* JADX INFO: renamed from: m */
                        public final /* synthetic */ Predicate f22348m;

                        /* JADX INFO: renamed from: n */
                        public final /* synthetic */ jfs f22349n;

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            jww jwwVar8 = this.f22336a;
                            jfs jfsVar2 = this.f22349n;
                            boolean z = this.f22337b;
                            dhv dhvVar3 = this.f22338c;
                            fls flsVar2 = this.f22339d;
                            jwn jwnVar2 = this.f22340e;
                            jwn jwnVar3 = this.f22341f;
                            jww jwwVar9 = this.f22342g;
                            jwn jwnVar4 = this.f22343h;
                            jwn jwnVar5 = this.f22344i;
                            jwn jwnVar6 = this.f22345j;
                            jwn jwnVar7 = this.f22346k;
                            gdc gdcVar2 = this.f22347l;
                            Predicate predicate2 = this.f22348m;
                            gfa gfaVar = (gfa) obj;
                            jvb jvbVarMo9110I = gfaVar.mo9110I();
                            jvbVarMo9110I.m13537d(jwwVar8.mo3830a(new kbg(gfaVar, jfsVar2, z, dhvVar3, flsVar2, null, null, null) { // from class: fju

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ gfa f22302b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ boolean f22303c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ dhv f22304d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ fls f22305e;

                                /* JADX INFO: renamed from: f */
                                public final /* synthetic */ jfs f22306f;

                                @Override // p000.kbg
                                /* JADX INFO: renamed from: bf */
                                public final void mo3415bf(Object obj2) {
                                    gfc gfcVar = this.f22301a;
                                    gfa gfaVar2 = this.f22302b;
                                    jfs jfsVar3 = this.f22306f;
                                    boolean z2 = this.f22303c;
                                    dhv dhvVar4 = this.f22304d;
                                    fls flsVar3 = this.f22305e;
                                    if (!((gfc) obj2).equals(gfcVar) && gfaVar2.mo9108G() && gfaVar2.mo9102A(gev.MICROVIDEO) && jfsVar3.m13088X("micro_tutorial_dismiss") == 0 && !z2 && !dhvVar4.mo6184l(dib.f11326bg) && dhvVar4.mo6184l(dii.f11541q)) {
                                        flsVar3.m8557a();
                                    }
                                }
                            }, not.INSTANCE));
                            jvbVarMo9110I.m13537d(jwr.m13632b(jwnVar2, jwnVar3, jwwVar9, jwnVar4, jwnVar5, jwnVar6, jwnVar7, gdcVar2).mo3830a(new ecr(predicate2, gfaVar, 8), not.INSTANCE));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9178r(gev.MICROVIDEO);
                    gfjVarM9181o.m9168h(C0100R.string.micro_option_desc);
                    gfjVarM9181o.m9163c(C0100R.string.micro_desc);
                    gfjVarM9181o.m9174n(gfc.MICROVIDEO_OFF, gfc.MICROVIDEO_AUTO, gfc.MICROVIDEO_ON);
                    gfjVarM9181o.m9170j(Integer.valueOf(C0100R.string.micro_off), Integer.valueOf(C0100R.string.micro_auto), Integer.valueOf(C0100R.string.micro_on));
                    gfjVarM9181o.m9165e(Integer.valueOf(C0100R.string.micro_off_desc), Integer.valueOf(C0100R.string.micro_auto_desc), Integer.valueOf(C0100R.string.micro_on_desc));
                    gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.quantum_ic_motion_photos_off_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_motion_photos_auto_white_24), Integer.valueOf(C0100R.drawable.quantum_ic_motion_photos_on_white_24));
                    gfjVarM9181o.f24545a = geuVar;
                    gfjVarM9181o.m9179s(fjvVar);
                    gfjVarM9181o.m9175o(predicate);
                    gfjVarM9181o.m9172l(consumer);
                    gfjVarM9181o.f24546b = new dqc(flsVar, 3);
                    gfjVarM9181o.m9171k((gfd) ohbVarM18485a.get());
                    objM17136H = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
        }
    }
}
