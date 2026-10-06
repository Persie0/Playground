package p000;

import android.os.SystemClock;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Duration;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjp implements gbi {

    /* JADX INFO: renamed from: a */
    public static final nbh f25030a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckHdrPlusImageCaptureCommand");

    /* JADX INFO: renamed from: A */
    private final ego f25031A;

    /* JADX INFO: renamed from: B */
    private final ggs f25032B;

    /* JADX INFO: renamed from: C */
    private final jwn f25033C;

    /* JADX INFO: renamed from: D */
    private final fdt f25034D;

    /* JADX INFO: renamed from: E */
    private final ewq f25035E;

    /* JADX INFO: renamed from: F */
    private final gva f25036F;

    /* JADX INFO: renamed from: G */
    private final gkz f25037G;

    /* JADX INFO: renamed from: H */
    private final gtd f25038H;

    /* JADX INFO: renamed from: I */
    private final bko f25039I;

    /* JADX INFO: renamed from: b */
    public final jwn f25040b;

    /* JADX INFO: renamed from: c */
    public final AmbientDelegate f25041c;

    /* JADX INFO: renamed from: d */
    private final kbz f25042d;

    /* JADX INFO: renamed from: e */
    private final gdz f25043e;

    /* JADX INFO: renamed from: f */
    private final gdm f25044f;

    /* JADX INFO: renamed from: g */
    private final kfk f25045g;

    /* JADX INFO: renamed from: h */
    private final msi f25046h;

    /* JADX INFO: renamed from: i */
    private final ecq f25047i;

    /* JADX INFO: renamed from: j */
    private final gjj f25048j;

    /* JADX INFO: renamed from: k */
    private final gjt f25049k;

    /* JADX INFO: renamed from: l */
    private final edm f25050l;

    /* JADX INFO: renamed from: m */
    private final ggx f25051m;

    /* JADX INFO: renamed from: n */
    private final msi f25052n;

    /* JADX INFO: renamed from: o */
    private final eby f25053o;

    /* JADX INFO: renamed from: p */
    private final gib f25054p;

    /* JADX INFO: renamed from: q */
    private final eci f25055q;

    /* JADX INFO: renamed from: r */
    private final kmd f25056r;

    /* JADX INFO: renamed from: s */
    private final gof f25057s;

    /* JADX INFO: renamed from: t */
    private final oju f25058t;

    /* JADX INFO: renamed from: u */
    private final mrm f25059u;

    /* JADX INFO: renamed from: v */
    private final dhv f25060v;

    /* JADX INFO: renamed from: w */
    private final kpb f25061w;

    /* JADX INFO: renamed from: x */
    private final goo f25062x;

    /* JADX INFO: renamed from: y */
    private final inm f25063y;

    /* JADX INFO: renamed from: z */
    private final jwn f25064z;

    public gjp(kbz kbzVar, gdz gdzVar, gdm gdmVar, kfk kfkVar, gmo gmoVar, ecq ecqVar, gjj gjjVar, edm edmVar, gkz gkzVar, ewq ewqVar, bko bkoVar, jwn jwnVar, msi msiVar, eby ebyVar, gjt gjtVar, eci eciVar, kmd kmdVar, gof gofVar, dhv dhvVar, kpb kpbVar, oju ojuVar, mrm mrmVar, inm inmVar, jwn jwnVar2, ego egoVar, gva gvaVar, AmbientDelegate ambientDelegate, ggs ggsVar, jwn jwnVar3, gtd gtdVar, fdt fdtVar, ggx ggxVar, gib gibVar, goo gooVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f25042d = kbzVar;
        this.f25043e = gdzVar;
        this.f25044f = gdmVar;
        this.f25045g = kfkVar;
        this.f25046h = gmoVar;
        this.f25047i = ecqVar;
        this.f25048j = gjjVar;
        this.f25049k = gjtVar;
        this.f25050l = edmVar;
        this.f25037G = gkzVar;
        this.f25035E = ewqVar;
        this.f25039I = bkoVar;
        this.f25040b = jwnVar;
        this.f25051m = ggxVar;
        this.f25052n = msiVar;
        this.f25053o = ebyVar;
        this.f25056r = kmdVar;
        this.f25057s = gofVar;
        this.f25054p = gibVar;
        this.f25055q = eciVar;
        this.f25058t = ojuVar;
        this.f25059u = mrmVar;
        this.f25060v = dhvVar;
        this.f25061w = kpbVar;
        this.f25062x = gooVar;
        this.f25063y = inmVar;
        this.f25064z = jwnVar2;
        this.f25031A = egoVar;
        this.f25036F = gvaVar;
        this.f25041c = ambientDelegate;
        this.f25032B = ggsVar;
        this.f25033C = jwnVar3;
        this.f25038H = gtdVar;
        this.f25034D = fdtVar;
    }

    /* JADX INFO: renamed from: d */
    private final mrm m9340d(ebn ebnVar) {
        mrm mrmVarM16828h;
        ggs ggsVar;
        if (!ebnVar.f13257l) {
            return mqu.f41450a;
        }
        nqf nqfVarM17621g = nqf.m17621g();
        gjo gjoVar = new gjo(nqfVarM17621g);
        try {
            try {
                this.f25032B.m9230n(gjoVar);
                mrmVarM16828h = mrm.m16828h((kpl) nqfVarM17621g.get(140L, TimeUnit.MILLISECONDS));
                ggsVar = this.f25032B;
            } catch (Throwable th) {
                this.f25032B.m9231o(gjoVar);
                throw th;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) ((nbe) f25030a.m17252c()).mo17283h(e)).mo17276G(2754)).mo17290o("Not able to get partial frame metadata");
            mrmVarM16828h = mqu.f41450a;
            ggsVar = this.f25032B;
        }
        ggsVar.m9231o(gjoVar);
        return mrmVarM16828h;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25040b;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        if (ivr.f32309a == null) {
            return jwr.m13637g(fxo.m8931e());
        }
        return jwr.m13637g(fxo.m8928b(ivr.f32309a, Integer.valueOf(this.f25049k.m9345a())));
    }

    /* JADX WARN: Code duplicated, block: B:251:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:348:0x086e A[Catch: all -> 0x0897, TryCatch #54 {all -> 0x0897, blocks: (B:346:0x0866, B:348:0x086e, B:349:0x0877, B:350:0x0878, B:351:0x0896), top: B:484:0x0866 }] */
    /* JADX WARN: Code duplicated, block: B:350:0x0878 A[Catch: all -> 0x0897, TryCatch #54 {all -> 0x0897, blocks: (B:346:0x0866, B:348:0x086e, B:349:0x0877, B:350:0x0878, B:351:0x0896), top: B:484:0x0866 }] */
    /* JADX WARN: Code duplicated, block: B:358:0x08ad A[Catch: all -> 0x08d4, TRY_LEAVE, TryCatch #19 {all -> 0x08d4, blocks: (B:356:0x08a7, B:358:0x08ad, B:367:0x08d3), top: B:453:0x08a7 }] */
    /* JADX WARN: Code duplicated, block: B:360:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:365:0x08ce A[Catch: all -> 0x0921, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0921, blocks: (B:215:0x05ff, B:400:0x0920, B:399:0x091d, B:365:0x08ce, B:281:0x076e, B:395:0x0917), top: B:436:0x00c9, inners: #59 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x08d3 A[Catch: all -> 0x08d4, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x08d4, blocks: (B:356:0x08a7, B:358:0x08ad, B:367:0x08d3), top: B:453:0x08a7 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:428:0x0954  */
    /* JADX WARN: Code duplicated, block: B:478:0x0802 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0917 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:? A[Catch: all -> 0x080c, dos -> 0x0810, ExecutionException -> 0x0813, CancellationException -> 0x0816, SYNTHETIC, TRY_LEAVE, TryCatch #45 {dos -> 0x0810, CancellationException -> 0x0816, ExecutionException -> 0x0813, all -> 0x080c, blocks: (B:327:0x080b, B:326:0x0808), top: B:499:0x0808 }] */
    /* JADX WARN: Code duplicated, block: B:503:? A[ADDED_TO_REGION, Catch: all -> 0x08ee, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #30 {all -> 0x08ee, blocks: (B:212:0x05e8, B:373:0x08db, B:374:0x08ed, B:362:0x08b7), top: B:461:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:506:? A[Catch: all -> 0x0921, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0921, blocks: (B:215:0x05ff, B:400:0x0920, B:399:0x091d, B:365:0x08ce, B:281:0x076e, B:395:0x0917), top: B:436:0x00c9, inners: #59 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:350:0x0878, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v7, types: [eem] */
    /* JADX WARN: Type inference failed for: r13v8, types: [eem] */
    /* JADX WARN: Type inference failed for: r1v126, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v43, types: [ecq] */
    /* JADX WARN: Type inference failed for: r2v106, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v143, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r2v25, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [ecq] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v67, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [gjp] */
    /* JADX WARN: Type inference failed for: r8v18, types: [gjp] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [gjp] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31, types: [gjp] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55, types: [gjp] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r9v0, types: [gjp] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14, types: [glk] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4, types: [glk] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws Throwable {
        Throwable th;
        ?? r9;
        kfo kfoVar;
        Throwable th2;
        Throwable th3;
        jvb jvbVar;
        Throwable th4;
        nps npsVarM14965K;
        ?? r8;
        Throwable th5;
        ?? r13;
        int iM9331b;
        ?? r10;
        ExecutionException executionException;
        Object obj;
        ?? r11;
        ?? r12;
        CancellationException cancellationException;
        ?? r14;
        ?? r15;
        dos dosVar;
        Object obj2;
        ?? r16;
        Object obj3;
        Throwable th6;
        ?? r17;
        ?? r18;
        Object obj4;
        Object obj5;
        ?? r19;
        ?? r20;
        kpp kppVar;
        kmg kmgVar;
        mrm mrmVarM16828h;
        ?? r21;
        kmg kmgVar2;
        IllegalArgumentException illegalArgumentException;
        ?? r22;
        Throwable th7;
        gdg gdgVar;
        ebn ebnVar;
        glk glkVar2;
        eem eemVar;
        boolean z;
        eem eemVarMo7133H;
        glk glkVar3;
        eem eemVar2;
        eem eemVarMo7131F;
        ?? r23;
        ?? r24;
        kpp kppVar2;
        mrm mrmVarM16829i;
        ?? r25;
        mrm mrmVar;
        int i;
        Boolean boolValueOf;
        gau gauVarMo9008a;
        boolean z2;
        String str;
        String strE;
        String str2;
        ?? r26 = this;
        if (!((Boolean) r26.f25040b.mo3831be()).booleanValue()) {
            ((nbe) ((nbe) f25030a.m17251b()).mo17276G((char) 2770)).mo17290o("WARNING: HdrPlusImageCaptureCommand was executed, but the command is not available. This may result in deadlocks or other unintended behavior.");
        }
        r26.f25042d.mo13961e("settingsCollector");
        ebn ebnVarM9396a = r26.f25037G.m9396a();
        AmbientDelegate ambientDelegate = r26.f25041c;
        if (ebnVarM9396a.f13256k) {
            ambientDelegate.f1685a = nku.f43324g.m18137O();
            if (((ebv) ambientDelegate.f1687c).f13306h) {
                Object obj6 = ambientDelegate.f1685a;
                obj6.getClass();
                int i2 = true != ebnVarM9396a.f13257l ? 4 : 3;
                nxl nxlVar = (nxl) obj6;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nku nkuVar = (nku) nxlVar.f44974b;
                nkuVar.f43327b = i2 - 1;
                nkuVar.f43326a |= 1;
                Object obj7 = ambientDelegate.f1685a;
                obj7.getClass();
                long millis = ((Duration) ambientDelegate.f1686b.mo3831be()).toMillis();
                nxl nxlVar2 = (nxl) obj7;
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                nku nkuVar2 = (nku) nxlVar2.f44974b;
                nkuVar2.f43326a |= 16;
                nkuVar2.f43331f = millis;
            }
        } else {
            ambientDelegate.f1685a = null;
        }
        r26.f25042d.mo13963g("selectFrameStream");
        kho khoVarMo9585b = r26.f25062x.mo9585b((kho) r26.f25046h.mo6051a());
        mxk mxkVar = khoVarMo9585b.f36067c;
        r26.f25042d.mo13963g("HdrPlusCapture");
        r26.f25042d.mo13961e("SessionAnd3AConvergence");
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        mrm mrmVarM16829i2 = mqu.f41450a;
        try {
            try {
                try {
                    kfo kfoVarMo14117d = r26.f25045g.mo14117d();
                    try {
                        try {
                            gia giaVarMo9273a = r26.f25054p.mo9273a(kfoVarMo14117d);
                            try {
                                try {
                                    jvb jvbVar2 = new jvb();
                                    try {
                                        if (ebnVarM9396a.f13257l) {
                                            try {
                                                npsVarM14965K = kxk.m14965K(new ghj());
                                            } catch (Throwable th8) {
                                                th4 = th8;
                                                jvbVar = jvbVar2;
                                                kfoVar = kfoVarMo14117d;
                                                try {
                                                    jvbVar.close();
                                                    throw th4;
                                                } catch (Throwable th9) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th9);
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            npsVarM14965K = r26.f25051m.mo9235a(kfoVarMo14117d, giaVarMo9273a.mo9272a());
                                        }
                                        r26.f25042d.mo13961e("CreateBurstTaker");
                                        gji gjiVarM9335c = r26.f25048j.m9335c(kfoVarMo14117d, glkVar, r26.f25057s);
                                        r26.f25042d.mo13962f();
                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                        jvb jvbVar3 = jvbVar2;
                                        kfoVar = kfoVarMo14117d;
                                        ?? r27 = 0;
                                        try {
                                            try {
                                                glkVar.f25502c.mo9915u(new gjn(this, atomicBoolean2, npsVarM14965K, gjiVarM9335c, glkVar, null, null));
                                                try {
                                                    fuw fuwVar = (fuw) npsVarM14965K.get();
                                                    try {
                                                        atomicBoolean.set(false);
                                                        if (r26.f25060v.mo6184l(did.f11472z)) {
                                                            try {
                                                                r26.f25042d.mo13963g("stopRepeating");
                                                                ((khm) kfoVar).f36060a.m14313g();
                                                            } catch (Throwable th10) {
                                                                th6 = th10;
                                                                r18 = r26;
                                                                r17 = glkVar;
                                                                obj4 = null;
                                                                obj5 = obj4;
                                                                iM9331b = 1;
                                                                r20 = r18;
                                                                r19 = r17;
                                                            }
                                                        }
                                                        kfj kfjVarMo14154c = kfoVar.mo14154c();
                                                        r26.f25042d.mo13963g("Metering");
                                                        r26.f25042d.mo13961e("SmartMetering");
                                                        gdg gdgVarMo9076c = r26.f25044f.mo9076c(fuwVar.mo8816a());
                                                        jvbVar3.m13537d(gdgVarMo9076c);
                                                        mrn mrnVar = gdgVarMo9076c.f24290a;
                                                        kmg kmgVarM14575b = mrnVar == null ? null : (kmg) mrnVar.f41479a;
                                                        kpp kppVar3 = mrnVar == null ? null : (kpp) mrnVar.f41480b;
                                                        if (kppVar3 == null) {
                                                            String str3 = "SmartMetering failed, using last known good metadata instead.";
                                                            ((nbe) ((nbe) f25030a.m17252c()).mo17276G(2769)).mo17290o("SmartMetering failed, using last known good metadata instead.");
                                                            kpp kppVar4 = r26.f25050l.f13500a;
                                                            if (kppVar4 != null && (strE = kppVar4.mo9518e()) != null) {
                                                                gva gvaVar = r26.f25036F;
                                                                String strE2 = kppVar4.mo9518e();
                                                                mxk mxkVarKeySet = ((mwx) kppVar4.mo9520g()).keySet();
                                                                if (mxkVarKeySet.size() == 1) {
                                                                    str = str3;
                                                                    str = strE;
                                                                    str2 = (String) mkv.m16517Y(mxkVarKeySet);
                                                                } else if (mxkVarKeySet.size() > 1) {
                                                                    String strM9783b = gva.m9783b(gvaVar.f26475f, mxkVarKeySet);
                                                                    if (strM9783b == null) {
                                                                        str = str3;
                                                                        str = strE;
                                                                        str2 = strE2;
                                                                        strM9783b = gva.m9783b(gvaVar.f26476g, mxkVarKeySet);
                                                                    }
                                                                    str2 = strM9783b == null ? strE2 : strM9783b;
                                                                }
                                                                str = str3;
                                                                str = strE;
                                                                str2 = strE2;
                                                                str2.getClass();
                                                                kmgVarM14575b = kmg.m14575b(str2);
                                                                str = str2;
                                                            }
                                                            str = str3;
                                                            str = strE;
                                                            str = str3;
                                                            kppVar = kppVar4;
                                                            kmgVar = kmgVarM14575b;
                                                            obj3 = str;
                                                        } else {
                                                            kppVar = kppVar3;
                                                            kmgVar = kmgVarM14575b;
                                                            obj3 = atomicBoolean2;
                                                        }
                                                        r26.f25042d.mo13962f();
                                                        try {
                                                            if (kppVar == null || kmgVar == null) {
                                                                throw new dom("Viewfinder metering metadata is not available, aborting shot.");
                                                            }
                                                            mrm mrmVarMo9074a = r26.f25044f.mo9074a();
                                                            if (mrmVarMo9074a.mo16813g()) {
                                                                mrmVarM16828h = mrmVarMo9074a;
                                                            } else {
                                                                try {
                                                                    key keyVarMo9305c = r26.f25057s.mo9305c();
                                                                    mrmVarM16828h = keyVarMo9305c != null ? mrm.m16828h(r26.f25036F.m9784a(keyVarMo9305c).m9496e()) : mqu.f41450a;
                                                                } catch (InterruptedException e) {
                                                                    ((nbe) ((nbe) ((nbe) f25030a.m17252c()).mo17283h(e)).mo17276G((char) 2756)).mo17290o("Error getting the metering frame.");
                                                                }
                                                            }
                                                            if (!mrmVarM16828h.mo16813g()) {
                                                                throw new don(null);
                                                            }
                                                            jvbVar3.m13537d((kpw) mrmVarM16828h.mo16809c());
                                                            r26.f25042d.mo13963g("Shot");
                                                            kppVar.mo9515b();
                                                            try {
                                                                try {
                                                                    r26.f25042d.mo13961e("getGcamPhysicalCameraId");
                                                                    int iMo7135b = r26.f25047i.mo7135b(r26.f25047i.mo7145l(kppVar, kmgVar));
                                                                    r26.f25042d.mo13963g("createPortraitShotParams");
                                                                    gtd gtdVarM2606B = r26.f25039I.m2606B(kppVar, iMo7135b);
                                                                    int iM3564b = cem.m3564b(((fua) glkVar.f25503d).f23573a, r26.f25063y, r26.f25056r, r26.f25064z, r26.f25060v);
                                                                    r26.f25042d.mo13963g("fusionDetector");
                                                                    egm egmVarMo7294a = r26.f25031A.mo7294a(kppVar, true);
                                                                    r26.f25042d.mo13963g("shotConfigFactory#populate");
                                                                    kpp kppVar5 = kppVar;
                                                                    kmg kmgVar3 = kmgVar;
                                                                    try {
                                                                        r26.f25035E.m7955d(glkVar, gtdVarM2606B, ebnVarM9396a, iM3564b, false, egmVarMo7294a.f13974b);
                                                                        r26.f25042d.mo13963g(voNZjxiJou.oLzMBCwbmeKgIU);
                                                                        PostviewParams postviewParamsM7070b = ebq.m7070b(r26.f25056r, r26.f25043e);
                                                                        r26.f25042d.mo13963g("startShotCapture");
                                                                        gcy gcyVar = ebnVarM9396a.f13252g;
                                                                        if (ebnVarM9396a.f13257l) {
                                                                            try {
                                                                                atomicBoolean = atomicBoolean;
                                                                                jvbVar3 = jvbVar3;
                                                                                gdgVar = gdgVarMo9076c;
                                                                                z = true;
                                                                                eemVar = null;
                                                                                ebnVar = ebnVarM9396a;
                                                                                glkVar2 = glkVar;
                                                                                try {
                                                                                    try {
                                                                                        eemVarMo7133H = r26.f25047i.mo7133H(kmgVar3, glkVar, postviewParamsM7070b, gcyVar, kppVar5, 0, -1, false, egmVarMo7294a);
                                                                                    } catch (ExecutionException e2) {
                                                                                        e = e2;
                                                                                        ((nbe) ((nbe) ((nbe) f25030a.m17251b()).mo17283h(e)).mo17276G((char) 2752)).mo17290o("Unable to start ZSL shot. Using PSL as fallback.");
                                                                                        eemVarMo7133H = eemVar;
                                                                                    }
                                                                                } catch (IllegalArgumentException e3) {
                                                                                    illegalArgumentException = e3;
                                                                                    r21 = r26;
                                                                                    kmgVar2 = kmgVar3;
                                                                                    try {
                                                                                        throw new dog("Valid metadata not available. Invalid camera id: " + kmgVar2.f36540a, illegalArgumentException);
                                                                                    } catch (Throwable th11) {
                                                                                        th = th11;
                                                                                        th7 = th;
                                                                                        r22 = r21;
                                                                                        r22.f25042d.mo13962f();
                                                                                        throw th7;
                                                                                    }
                                                                                } catch (Throwable th12) {
                                                                                    th7 = th12;
                                                                                    r22 = r26;
                                                                                    r22.f25042d.mo13962f();
                                                                                    throw th7;
                                                                                }
                                                                            } catch (IllegalArgumentException e4) {
                                                                                illegalArgumentException = e4;
                                                                                r21 = r26;
                                                                                kmgVar2 = kmgVar3;
                                                                                throw new dog("Valid metadata not available. Invalid camera id: " + kmgVar2.f36540a, illegalArgumentException);
                                                                            } catch (ExecutionException e5) {
                                                                                e = e5;
                                                                                atomicBoolean = atomicBoolean;
                                                                                jvbVar3 = jvbVar3;
                                                                                gdgVar = gdgVarMo9076c;
                                                                                ebnVar = ebnVarM9396a;
                                                                                glkVar2 = glkVar;
                                                                                eemVar = null;
                                                                                z = true;
                                                                            } catch (Throwable th13) {
                                                                                th7 = th13;
                                                                                r22 = r26;
                                                                                r22.f25042d.mo13962f();
                                                                                throw th7;
                                                                            }
                                                                        } else {
                                                                            atomicBoolean = atomicBoolean;
                                                                            jvbVar3 = jvbVar3;
                                                                            gdgVar = gdgVarMo9076c;
                                                                            ebnVar = ebnVarM9396a;
                                                                            glkVar2 = glkVar;
                                                                            eemVar = null;
                                                                            z = true;
                                                                            eemVarMo7133H = null;
                                                                        }
                                                                        if (eemVarMo7133H == null) {
                                                                            try {
                                                                                glkVar3 = glkVar2;
                                                                                eemVar2 = eemVar;
                                                                                try {
                                                                                    try {
                                                                                        eemVarMo7131F = r26.f25047i.mo7131F(kmgVar3, glkVar, postviewParamsM7070b, gcyVar, kppVar5, egmVarMo7294a);
                                                                                    } catch (IllegalStateException e6) {
                                                                                        e = e6;
                                                                                        IllegalStateException illegalStateException = e;
                                                                                        ((nbe) ((nbe) ((nbe) f25030a.m17251b()).mo17283h(illegalStateException)).mo17276G((char) 2751)).mo17290o("Error starting shot.");
                                                                                        throw new kec(illegalStateException);
                                                                                    }
                                                                                } catch (IllegalArgumentException e7) {
                                                                                    illegalArgumentException = e7;
                                                                                    r21 = r26;
                                                                                    kmgVar2 = kmgVar3;
                                                                                    throw new dog("Valid metadata not available. Invalid camera id: " + kmgVar2.f36540a, illegalArgumentException);
                                                                                } catch (Throwable th14) {
                                                                                    th7 = th14;
                                                                                    r22 = r26;
                                                                                    r22.f25042d.mo13962f();
                                                                                    throw th7;
                                                                                }
                                                                            } catch (IllegalStateException e8) {
                                                                                e = e8;
                                                                                glkVar3 = glkVar2;
                                                                                eemVar2 = eemVar;
                                                                            }
                                                                        } else {
                                                                            glkVar3 = glkVar2;
                                                                            eemVarMo7131F = eemVarMo7133H;
                                                                        }
                                                                        try {
                                                                            r26.f25042d.mo13962f();
                                                                            try {
                                                                                if (eemVarMo7131F == null) {
                                                                                    throw new doi("startShotCapture returned null. Shot failed.");
                                                                                }
                                                                                r26.f25053o.m7104o(glkVar3);
                                                                                r26.f25042d.mo13961e("BuildPsafBurstSpec");
                                                                                if (((Boolean) r26.f25052n.mo6051a()).booleanValue()) {
                                                                                    try {
                                                                                        kppVar2 = kppVar5;
                                                                                        mrmVarM16829i = mrm.m16829i(r26.f25047i.mo7140g(eemVarMo7131F, (kpw) mrmVarM16828h.mo16809c(), kppVar2, r26.m9340d(ebnVar)));
                                                                                    } catch (Throwable th15) {
                                                                                        th6 = th15;
                                                                                        r25 = r26;
                                                                                        r23 = glkVar3;
                                                                                        r24 = r25;
                                                                                        obj5 = eemVarMo7131F;
                                                                                        iM9331b = 1;
                                                                                        r20 = r24;
                                                                                        r19 = r23;
                                                                                        if (fuwVar == null) {
                                                                                            throw th6;
                                                                                        }
                                                                                        try {
                                                                                            fuwVar.close();
                                                                                            throw th6;
                                                                                        } catch (Throwable th16) {
                                                                                            try {
                                                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th16);
                                                                                                throw th6;
                                                                                            } catch (dos e9) {
                                                                                                dosVar = e9;
                                                                                                r15 = r20;
                                                                                                obj2 = obj5;
                                                                                                try {
                                                                                                    ((nbe) ((nbe) f25030a.m17251b()).mo17276G(2759)).mo17293r("%s", dosVar.getMessage());
                                                                                                    throw new kec(dosVar);
                                                                                                } catch (Throwable th17) {
                                                                                                    th5 = th17;
                                                                                                    r8 = r15;
                                                                                                    r13 = obj2;
                                                                                                    if (r13 == 0) {
                                                                                                        throw th5;
                                                                                                    }
                                                                                                    throw th5;
                                                                                                }
                                                                                            } catch (CancellationException e10) {
                                                                                                cancellationException = e10;
                                                                                                r11 = r20;
                                                                                                r12 = r19;
                                                                                                r14 = obj5;
                                                                                                try {
                                                                                                    if (!atomicBoolean.get()) {
                                                                                                        throw cancellationException;
                                                                                                    }
                                                                                                    r12.f25502c.mo9917w(cancellationException);
                                                                                                    if (r14 != 0) {
                                                                                                        r11.f25047i.mo7147n(r14);
                                                                                                        r11.f25055q.mo7111d(r14.f13675v.f25502c.mo9902h());
                                                                                                    }
                                                                                                    jvbVar3.close();
                                                                                                    r16 = r11;
                                                                                                    if (giaVarMo9273a != null) {
                                                                                                        giaVarMo9273a.close();
                                                                                                        r16 = r11;
                                                                                                    }
                                                                                                    kfoVar.close();
                                                                                                    atomicBoolean.get();
                                                                                                    gbhVar.close();
                                                                                                    r16.f25054p.mo9274b();
                                                                                                    r16.f25042d.mo13962f();
                                                                                                    r16.f25042d.mo13962f();
                                                                                                    return;
                                                                                                } catch (Throwable th18) {
                                                                                                    th5 = th18;
                                                                                                    r8 = r11;
                                                                                                    r13 = r14;
                                                                                                    if (r13 == 0 || iM9331b == 2) {
                                                                                                        throw th5;
                                                                                                    }
                                                                                                    r8.f25047i.mo7147n(r13);
                                                                                                    r8.f25055q.mo7111d(r13.f13675v.f25502c.mo9902h());
                                                                                                    throw th5;
                                                                                                }
                                                                                            } catch (ExecutionException e11) {
                                                                                                executionException = e11;
                                                                                                r10 = r20;
                                                                                                obj = obj5;
                                                                                                try {
                                                                                                    if (executionException.getCause() instanceof kec) {
                                                                                                        throw new kec(executionException.getCause());
                                                                                                    }
                                                                                                    throw new InterruptedException("Capture was interrupted" + String.valueOf(executionException.getCause()));
                                                                                                } catch (Throwable th19) {
                                                                                                    th5 = th19;
                                                                                                    r8 = r10;
                                                                                                    r13 = obj;
                                                                                                    if (r13 == 0) {
                                                                                                        throw th5;
                                                                                                    }
                                                                                                    throw th5;
                                                                                                }
                                                                                            } catch (Throwable th20) {
                                                                                                th5 = th20;
                                                                                                r8 = r20;
                                                                                                r13 = obj5;
                                                                                                if (r13 == 0) {
                                                                                                    throw th5;
                                                                                                }
                                                                                                throw th5;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    kppVar2 = kppVar5;
                                                                                    mrmVarM16829i = mqu.f41450a;
                                                                                }
                                                                                int iIntValue = ((Integer) khoVarMo9585b.m14271a().mo3831be()).intValue();
                                                                                if (mrmVarM16829i.mo16813g()) {
                                                                                    mrm mrmVarMo16808b = mrmVarM16829i.mo16808b(fod.f22911p);
                                                                                    int iM4967a = mrmVarMo16808b.mo16813g() ? (int) ((FrameRequestVector) mrmVarMo16808b.mo16809c()).m4967a() : 0;
                                                                                    if (iIntValue - iM4967a <= 0) {
                                                                                        mrmVar = mqu.f41450a;
                                                                                        i = 0;
                                                                                    } else {
                                                                                        mrmVar = mrmVarM16829i;
                                                                                        i = iM4967a;
                                                                                    }
                                                                                } else {
                                                                                    mrmVar = mrmVarM16829i;
                                                                                    i = 0;
                                                                                }
                                                                                boolean z3 = r26.f25061w.f36770c;
                                                                                Optional optionalEmpty = Optional.empty();
                                                                                if (r26.f25047i.mo7137d().f13306h) {
                                                                                    try {
                                                                                        if (ebnVar.f13256k) {
                                                                                            r26.f25042d.mo13963g("AdjustMaxCaptureTime");
                                                                                            long jM9538f = (long) (i > 0 ? gmz.m9538f(mrmVar, i, TimeUnit.NANOSECONDS.toMillis(nta.m17663c(r26.f25056r)), z3) : 0.0f);
                                                                                            long millis2 = ((Duration) r26.f25033C.mo3831be()).toMillis();
                                                                                            if (jM9538f != 0) {
                                                                                                millis2 -= Math.max((jM9538f + millis2) - Math.max(millis2, 1000L), 0L);
                                                                                            }
                                                                                            optionalEmpty = Optional.m12505of(Long.valueOf(millis2));
                                                                                        }
                                                                                    } catch (Throwable th21) {
                                                                                        th = th21;
                                                                                        r27 = this;
                                                                                        th6 = th;
                                                                                        r25 = r27;
                                                                                        r23 = glkVar3;
                                                                                        r24 = r25;
                                                                                        obj5 = eemVarMo7131F;
                                                                                        iM9331b = 1;
                                                                                        r20 = r24;
                                                                                        r19 = r23;
                                                                                        if (fuwVar == null) {
                                                                                            throw th6;
                                                                                        }
                                                                                        fuwVar.close();
                                                                                        throw th6;
                                                                                    }
                                                                                }
                                                                                Optional optional = optionalEmpty;
                                                                                r27 = this;
                                                                                try {
                                                                                    r27.f25042d.mo13963g("BuildPayloadBurstSpec");
                                                                                    ecq ecqVar = r27.f25047i;
                                                                                    kpw kpwVar = (kpw) mrmVarM16828h.mo16809c();
                                                                                    if (r27.f25053o.m7100k()) {
                                                                                        try {
                                                                                            boolValueOf = Boolean.valueOf(z);
                                                                                        } catch (Throwable th22) {
                                                                                            th = th22;
                                                                                            th6 = th;
                                                                                            r25 = r27;
                                                                                            r23 = glkVar3;
                                                                                            r24 = r25;
                                                                                            obj5 = eemVarMo7131F;
                                                                                            iM9331b = 1;
                                                                                            r20 = r24;
                                                                                            r19 = r23;
                                                                                        }
                                                                                    } else {
                                                                                        boolValueOf = null;
                                                                                    }
                                                                                    ebn ebnVar2 = ebnVar;
                                                                                    glk glkVar4 = glkVar3;
                                                                                    BurstSpec burstSpecMo7127B = ecqVar.mo7127B(eemVarMo7131F, kpwVar, kppVar2, false, boolValueOf, ebnVar2, optional);
                                                                                    r27.f25042d.mo13962f();
                                                                                    r27.f25042d.mo13961e("notifyExtendedCaptureSignal");
                                                                                    int iM4967a2 = (int) burstSpecMo7127B.m4911b().m4967a();
                                                                                    int iMin = Math.min(iM4967a2, iIntValue - i);
                                                                                    boolean z4 = gmz.m9539g(r27.f25056r, burstSpecMo7127B, mqu.f41450a, iMin, 0, false, kppVar2) > TimeUnit.SECONDS.toMillis(6L);
                                                                                    r27.f25034D.mo8226b(z4, r27.f25056r.mo14558k(), ebnVar2.f13258m);
                                                                                    r27.f25042d.mo13963g("setTotalCaptureTime");
                                                                                    if (r27.f25053o.m7101l()) {
                                                                                        long jM9539g = gmz.m9539g(r27.f25056r, burstSpecMo7127B, mrmVar, iMin, i, z3, kppVar2);
                                                                                        gauVarMo9008a = glkVar4.f25501b.mo9009b();
                                                                                        gauVarMo9008a.mo9004g(jM9539g);
                                                                                        ((gnm) r27.f25058t.get()).m9559j(jM9539g);
                                                                                        mrm mrmVar2 = r27.f25059u;
                                                                                        if (mrmVar2.mo16813g()) {
                                                                                            ((eol) mrmVar2.mo16809c()).mo7593k(jM9539g);
                                                                                        }
                                                                                    } else {
                                                                                        long jM9539g2 = gmz.m9539g(r27.f25056r, burstSpecMo7127B, mrmVar, iMin, i, z3, kppVar2);
                                                                                        if (!eemVarMo7131F.f13666m.equals(edk.PORTRAIT)) {
                                                                                            ((gnm) r27.f25058t.get()).m9559j(jM9539g2);
                                                                                        }
                                                                                        gauVarMo9008a = glkVar4.f25501b.mo9008a();
                                                                                        gauVarMo9008a.mo9004g(jM9539g2);
                                                                                        Object obj8 = r27.f25041c.f1685a;
                                                                                        if (obj8 != null) {
                                                                                            if (!((nxl) obj8).f44974b.m18142ac()) {
                                                                                                ((nxl) obj8).mo18106p();
                                                                                            }
                                                                                            nku nkuVar3 = (nku) ((nxl) obj8).f44974b;
                                                                                            nku nkuVar4 = nku.f43324g;
                                                                                            nkuVar3.f43326a |= 8;
                                                                                            nkuVar3.f43330e = jM9539g2;
                                                                                        }
                                                                                    }
                                                                                    gau gauVar = gauVarMo9008a;
                                                                                    ((kpw) mrmVarM16828h.mo16809c()).close();
                                                                                    if (burstSpecMo7127B.m4911b().m4970d()) {
                                                                                        ((nbe) ((nbe) f25030a.m17251b()).mo17276G(2763)).mo17290o("payloadBurstSpec is empty. Payload failed.");
                                                                                        if (fuwVar != null) {
                                                                                            try {
                                                                                                fuwVar.close();
                                                                                            } catch (dos e12) {
                                                                                                obj2 = eemVarMo7131F;
                                                                                                iM9331b = 1;
                                                                                                dosVar = e12;
                                                                                                r15 = r27;
                                                                                                ((nbe) ((nbe) f25030a.m17251b()).mo17276G(2759)).mo17293r("%s", dosVar.getMessage());
                                                                                                throw new kec(dosVar);
                                                                                            } catch (CancellationException e13) {
                                                                                                r14 = eemVarMo7131F;
                                                                                                iM9331b = 1;
                                                                                                cancellationException = e13;
                                                                                                r11 = r27;
                                                                                                r12 = glkVar4;
                                                                                                if (!atomicBoolean.get()) {
                                                                                                    throw cancellationException;
                                                                                                }
                                                                                                r12.f25502c.mo9917w(cancellationException);
                                                                                                if (r14 != 0 && iM9331b != 2) {
                                                                                                    r11.f25047i.mo7147n(r14);
                                                                                                    r11.f25055q.mo7111d(r14.f13675v.f25502c.mo9902h());
                                                                                                }
                                                                                                jvbVar3.close();
                                                                                                r16 = r11;
                                                                                                if (giaVarMo9273a != null) {
                                                                                                    giaVarMo9273a.close();
                                                                                                    r16 = r11;
                                                                                                }
                                                                                            } catch (ExecutionException e14) {
                                                                                                obj = eemVarMo7131F;
                                                                                                iM9331b = 1;
                                                                                                executionException = e14;
                                                                                                r10 = r27;
                                                                                                if (executionException.getCause() instanceof kec) {
                                                                                                    throw new kec(executionException.getCause());
                                                                                                }
                                                                                                throw new InterruptedException("Capture was interrupted" + String.valueOf(executionException.getCause()));
                                                                                            } catch (Throwable th23) {
                                                                                                r13 = eemVarMo7131F;
                                                                                                iM9331b = 1;
                                                                                                th5 = th23;
                                                                                                r8 = r27;
                                                                                                if (r13 == 0) {
                                                                                                    throw th5;
                                                                                                }
                                                                                                throw th5;
                                                                                            }
                                                                                        }
                                                                                        r27.f25047i.mo7147n(eemVarMo7131F);
                                                                                        r27.f25055q.mo7111d(eemVarMo7131F.f13675v.f25502c.mo9902h());
                                                                                        jvbVar3.close();
                                                                                        r16 = r27;
                                                                                        if (giaVarMo9273a != null) {
                                                                                            giaVarMo9273a.close();
                                                                                            r16 = r27;
                                                                                        }
                                                                                        kfoVar.close();
                                                                                        atomicBoolean.get();
                                                                                        gbhVar.close();
                                                                                        r16.f25054p.mo9274b();
                                                                                        r16.f25042d.mo13962f();
                                                                                        r16.f25042d.mo13962f();
                                                                                        return;
                                                                                    }
                                                                                    r27.f25042d.mo13963g(BEeWZPor.oAIYU);
                                                                                    kfjVarMo14154c.mo14111c();
                                                                                    r27.f25042d.mo13963g("clearMeteringLock");
                                                                                    int i3 = i;
                                                                                    mrm mrmVar3 = mrmVar;
                                                                                    kpp kppVar6 = kppVar2;
                                                                                    gjm gjmVar = new gjm(fuwVar, giaVarMo9273a, kfoVar, gdgVar, 0);
                                                                                    r27.f25042d.mo13963g("takePayloadBurst");
                                                                                    hjy hjyVarMo9905k = glkVar4.f25502c.mo9905k();
                                                                                    Long lMo10399a = hjyVarMo9905k.mo10399a();
                                                                                    Object obj9 = r27.f25041c.f1685a;
                                                                                    if (obj9 != null && !z4 && lMo10399a != null) {
                                                                                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - lMo10399a.longValue();
                                                                                        if (!((nxl) obj9).f44974b.m18142ac()) {
                                                                                            ((nxl) obj9).mo18106p();
                                                                                        }
                                                                                        nku nkuVar5 = (nku) ((nxl) obj9).f44974b;
                                                                                        nku nkuVar6 = nku.f43324g;
                                                                                        nkuVar5.f43326a |= 2;
                                                                                        nkuVar5.f43328c = jElapsedRealtimeNanos;
                                                                                    }
                                                                                    Object obj10 = r27.f25041c.f1685a;
                                                                                    if (obj10 != null && !z4) {
                                                                                        ((hjz) hjyVarMo9905k).f28098x = (nku) ((nxl) obj10).mo18103l();
                                                                                    }
                                                                                    kgw kgwVarM14226g = kgw.m14226g((kgw) kfjVarMo14154c);
                                                                                    gtd gtdVar = r27.f25038H;
                                                                                    boolean z5 = ((gzk) gtdVar.f26334a.mo3831be()).equals(gzk.ON) || ((gzk) gtdVar.f26334a.mo3831be()).equals(gzk.ON_LOCKED);
                                                                                    boolean z6 = ebnVar2.f13258m && !z5;
                                                                                    if (!ebnVar2.f13257l) {
                                                                                        z2 = false;
                                                                                    } else if (!((imu) gtdVar.f26335b).m11486a(kmgVar3.f36540a).mo14538G()) {
                                                                                        z2 = false;
                                                                                    } else if (!((imu) gtdVar.f26335b).m11486a(kmgVar3.f36540a).mo14537F() || z6) {
                                                                                        z2 = false;
                                                                                    } else {
                                                                                        z2 = true;
                                                                                    }
                                                                                    iM9331b = gjiVarM9335c.m9331b(eemVarMo7131F, burstSpecMo7127B, mrmVar3, kppVar6, gauVar, kgwVarM14226g, khoVarMo9585b, gjmVar, hjyVarMo9905k, iMin, iM4967a2, i3, z2, ebnVar2);
                                                                                    try {
                                                                                        r27.f25042d.mo13962f();
                                                                                        if (iM9331b != 2) {
                                                                                            switch (iM9331b - 1) {
                                                                                                case 2:
                                                                                                    throw new dod("No payload was requested.");
                                                                                                case 3:
                                                                                                    throw new kec("Required resource not found.");
                                                                                                case 4:
                                                                                                    throw new dom("Required metadata not found.");
                                                                                                case 5:
                                                                                                    throw new doo(null);
                                                                                                default:
                                                                                                    throw new dos("Something went wrong.");
                                                                                            }
                                                                                        }
                                                                                        if (fuwVar != null) {
                                                                                            try {
                                                                                                fuwVar.close();
                                                                                            } catch (dos e15) {
                                                                                                obj2 = eemVarMo7131F;
                                                                                                dosVar = e15;
                                                                                                r15 = r27;
                                                                                                ((nbe) ((nbe) f25030a.m17251b()).mo17276G(2759)).mo17293r("%s", dosVar.getMessage());
                                                                                                throw new kec(dosVar);
                                                                                            } catch (CancellationException e16) {
                                                                                                r14 = eemVarMo7131F;
                                                                                                cancellationException = e16;
                                                                                                r11 = r27;
                                                                                                r12 = glkVar4;
                                                                                                if (!atomicBoolean.get()) {
                                                                                                    throw cancellationException;
                                                                                                }
                                                                                                r12.f25502c.mo9917w(cancellationException);
                                                                                                if (r14 != 0) {
                                                                                                    r11.f25047i.mo7147n(r14);
                                                                                                    r11.f25055q.mo7111d(r14.f13675v.f25502c.mo9902h());
                                                                                                }
                                                                                                jvbVar3.close();
                                                                                                r16 = r11;
                                                                                                if (giaVarMo9273a != null) {
                                                                                                    giaVarMo9273a.close();
                                                                                                    r16 = r11;
                                                                                                }
                                                                                            } catch (ExecutionException e17) {
                                                                                                obj = eemVarMo7131F;
                                                                                                executionException = e17;
                                                                                                r10 = r27;
                                                                                                if (executionException.getCause() instanceof kec) {
                                                                                                    throw new kec(executionException.getCause());
                                                                                                }
                                                                                                throw new InterruptedException("Capture was interrupted" + String.valueOf(executionException.getCause()));
                                                                                            } catch (Throwable th24) {
                                                                                                r13 = eemVarMo7131F;
                                                                                                th5 = th24;
                                                                                                r8 = r27;
                                                                                                if (r13 == 0) {
                                                                                                    throw th5;
                                                                                                }
                                                                                                throw th5;
                                                                                            }
                                                                                        }
                                                                                        jvbVar3.close();
                                                                                        r16 = r27;
                                                                                        if (giaVarMo9273a != null) {
                                                                                            giaVarMo9273a.close();
                                                                                            r16 = r27;
                                                                                        }
                                                                                        kfoVar.close();
                                                                                        atomicBoolean.get();
                                                                                        gbhVar.close();
                                                                                        r16.f25054p.mo9274b();
                                                                                        r16.f25042d.mo13962f();
                                                                                        r16.f25042d.mo13962f();
                                                                                        return;
                                                                                    } catch (Throwable th25) {
                                                                                        th6 = th25;
                                                                                        obj5 = eemVarMo7131F;
                                                                                        r20 = r27;
                                                                                        r19 = glkVar4;
                                                                                        if (fuwVar == null) {
                                                                                            throw th6;
                                                                                        }
                                                                                        fuwVar.close();
                                                                                        throw th6;
                                                                                    }
                                                                                } catch (Throwable th26) {
                                                                                    th = th26;
                                                                                    r26 = glkVar3;
                                                                                    th6 = th;
                                                                                    r24 = r27;
                                                                                    r23 = r26;
                                                                                    obj5 = eemVarMo7131F;
                                                                                    iM9331b = 1;
                                                                                    r20 = r24;
                                                                                    r19 = r23;
                                                                                }
                                                                            } catch (Throwable th27) {
                                                                                th = th27;
                                                                                th6 = th;
                                                                                r24 = r27;
                                                                                r23 = r26;
                                                                            }
                                                                        } catch (Throwable th28) {
                                                                            th = th28;
                                                                            r27 = r26;
                                                                        }
                                                                        r26 = glkVar3;
                                                                        th6 = th;
                                                                        r24 = r27;
                                                                        r23 = r26;
                                                                        obj5 = eemVarMo7131F;
                                                                        iM9331b = 1;
                                                                        r20 = r24;
                                                                        r19 = r23;
                                                                    } catch (IllegalArgumentException e18) {
                                                                        e = e18;
                                                                        kmgVar2 = kmgVar3;
                                                                        illegalArgumentException = e;
                                                                        r21 = r26;
                                                                        throw new dog("Valid metadata not available. Invalid camera id: " + kmgVar2.f36540a, illegalArgumentException);
                                                                    }
                                                                } catch (IllegalArgumentException e19) {
                                                                    e = e19;
                                                                    kmgVar2 = kmgVar;
                                                                }
                                                            } catch (Throwable th29) {
                                                                th = th29;
                                                                r21 = r26;
                                                                th7 = th;
                                                                r22 = r21;
                                                                r22.f25042d.mo13962f();
                                                                throw th7;
                                                            }
                                                            if (fuwVar == null) {
                                                                throw th6;
                                                            }
                                                            fuwVar.close();
                                                            throw th6;
                                                        } catch (Throwable th30) {
                                                            th = th30;
                                                            th6 = th;
                                                            obj4 = obj3;
                                                            r18 = r27;
                                                            r17 = r26;
                                                            obj5 = obj4;
                                                            iM9331b = 1;
                                                            r20 = r18;
                                                            r19 = r17;
                                                        }
                                                    } catch (Throwable th31) {
                                                        th = th31;
                                                        r27 = r26;
                                                        r26 = glkVar;
                                                        obj3 = null;
                                                    }
                                                    th6 = th;
                                                    obj4 = obj3;
                                                    r18 = r27;
                                                    r17 = r26;
                                                    obj5 = obj4;
                                                    iM9331b = 1;
                                                    r20 = r18;
                                                    r19 = r17;
                                                    if (fuwVar == null) {
                                                        throw th6;
                                                    }
                                                    fuwVar.close();
                                                    throw th6;
                                                } catch (dos e20) {
                                                    r15 = r26;
                                                    dosVar = e20;
                                                    obj2 = null;
                                                    iM9331b = 1;
                                                } catch (CancellationException e21) {
                                                    r11 = r26;
                                                    atomicBoolean = atomicBoolean;
                                                    jvbVar3 = jvbVar3;
                                                    r12 = glkVar;
                                                    cancellationException = e21;
                                                    r14 = 0;
                                                    iM9331b = 1;
                                                } catch (ExecutionException e22) {
                                                    r10 = r26;
                                                    executionException = e22;
                                                    obj = null;
                                                    iM9331b = 1;
                                                } catch (Throwable th32) {
                                                    r8 = r26;
                                                    th5 = th32;
                                                    r13 = 0;
                                                    iM9331b = 1;
                                                }
                                            } catch (Throwable th33) {
                                                th = th33;
                                                th4 = th;
                                                jvbVar.close();
                                                throw th4;
                                            }
                                        } catch (Throwable th34) {
                                            th = th34;
                                            jvbVar = jvbVar3;
                                            th4 = th;
                                            jvbVar.close();
                                            throw th4;
                                        }
                                    } catch (Throwable th35) {
                                        th = th35;
                                        jvbVar = jvbVar2;
                                        kfoVar = kfoVarMo14117d;
                                    }
                                } catch (Throwable th36) {
                                    th = th36;
                                    th3 = th;
                                    if (giaVarMo9273a != null) {
                                        throw th3;
                                    }
                                    try {
                                        giaVarMo9273a.close();
                                        throw th3;
                                    } catch (Throwable th37) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th37);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th38) {
                                th = th38;
                                kfoVar = kfoVarMo14117d;
                                th3 = th;
                                if (giaVarMo9273a != null) {
                                    throw th3;
                                }
                                giaVarMo9273a.close();
                                throw th3;
                            }
                        } catch (Throwable th39) {
                            th = th39;
                            th2 = th;
                            try {
                                kfoVar.close();
                                throw th2;
                            } catch (Throwable th40) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th40);
                                throw th2;
                            }
                        }
                    } catch (Throwable th41) {
                        th = th41;
                        kfoVar = kfoVarMo14117d;
                        th2 = th;
                        kfoVar.close();
                        throw th2;
                    }
                } catch (Throwable th42) {
                    th = th42;
                    th = th;
                    r9 = r26;
                    if (atomicBoolean.get()) {
                        r9.f25502c.mo9917w((Throwable) mrmVarM16829i2.mo16809c());
                    }
                    gbhVar.close();
                    r26.f25054p.mo9274b();
                    r26.f25042d.mo13962f();
                    r26.f25042d.mo13962f();
                    throw th;
                }
            } catch (InterruptedException e23) {
                e = e23;
                InterruptedException interruptedException = e;
                mrmVarM16829i2 = mrm.m16829i(interruptedException);
                try {
                    throw interruptedException;
                } catch (Throwable th43) {
                    th = th43;
                    r9 = r26;
                    if (atomicBoolean.get() && mrmVarM16829i2.mo16813g()) {
                        r9.f25502c.mo9917w((Throwable) mrmVarM16829i2.mo16809c());
                    }
                    gbhVar.close();
                    r26.f25054p.mo9274b();
                    r26.f25042d.mo13962f();
                    r26.f25042d.mo13962f();
                    throw th;
                }
            }
        } catch (InterruptedException e24) {
            e = e24;
            r26 = glkVar;
            InterruptedException interruptedException2 = e;
            mrmVarM16829i2 = mrm.m16829i(interruptedException2);
            throw interruptedException2;
        } catch (Throwable th44) {
            th = th44;
            r26 = glkVar;
            th = th;
            r9 = r26;
            if (atomicBoolean.get()) {
                r9.f25502c.mo9917w((Throwable) mrmVarM16829i2.mo16809c());
            }
            gbhVar.close();
            r26.f25054p.mo9274b();
            r26.f25042d.mo13962f();
            r26.f25042d.mo13962f();
            throw th;
        }
    }
}
