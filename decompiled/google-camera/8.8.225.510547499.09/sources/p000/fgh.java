package p000;

import android.os.Handler;
import android.os.SystemClock;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgh implements fgw {

    /* JADX INFO: renamed from: a */
    public static final nbh f21843a;

    /* JADX INFO: renamed from: A */
    private final boolean f21844A;

    /* JADX INFO: renamed from: B */
    private final jwn f21845B;

    /* JADX INFO: renamed from: C */
    private final hah f21846C;

    /* JADX INFO: renamed from: D */
    private final jwn f21847D;

    /* JADX INFO: renamed from: E */
    private final jwl f21848E;

    /* JADX INFO: renamed from: F */
    private final bko f21849F;

    /* JADX INFO: renamed from: b */
    public final Executor f21850b;

    /* JADX INFO: renamed from: c */
    public final Executor f21851c;

    /* JADX INFO: renamed from: d */
    public final fgz f21852d;

    /* JADX INFO: renamed from: e */
    public final Object f21853e;

    /* JADX INFO: renamed from: f */
    public final ffq f21854f;

    /* JADX INFO: renamed from: g */
    public final mrm f21855g;

    /* JADX INFO: renamed from: h */
    public final mrm f21856h;

    /* JADX INFO: renamed from: i */
    public final fto f21857i;

    /* JADX INFO: renamed from: j */
    public final fhy f21858j;

    /* JADX INFO: renamed from: k */
    public final dhv f21859k;

    /* JADX INFO: renamed from: l */
    public final boolean f21860l;

    /* JADX INFO: renamed from: m */
    public final ffo f21861m;

    /* JADX INFO: renamed from: n */
    public final fgn f21862n;

    /* JADX INFO: renamed from: o */
    public final Handler f21863o;

    /* JADX INFO: renamed from: p */
    public final gvw f21864p;

    /* JADX INFO: renamed from: q */
    public final kmd f21865q;

    /* JADX INFO: renamed from: r */
    public final eat f21866r;

    /* JADX INFO: renamed from: s */
    public final msi f21867s = ffw.f21755a;

    /* JADX INFO: renamed from: t */
    public long f21868t;

    /* JADX INFO: renamed from: u */
    public final List f21869u;

    /* JADX INFO: renamed from: v */
    public final dsx f21870v;

    /* JADX INFO: renamed from: w */
    public final mca f21871w;

    /* JADX INFO: renamed from: x */
    public final glk f21872x;

    /* JADX INFO: renamed from: y */
    public final bkn f21873y;

    /* JADX INFO: renamed from: z */
    private final flc f21874z;

    static {
        Duration.ofSeconds(15L);
        f21843a = nbh.m17259h("com/google/android/apps/camera/microvideo/MicrovideoControllerImpl");
    }

    public fgh(Executor executor, Executor executor2, fgz fgzVar, ffq ffqVar, jwl jwlVar, mrm mrmVar, mrm mrmVar2, fto ftoVar, fhy fhyVar, mca mcaVar, flc flcVar, dhv dhvVar, ffo ffoVar, gvw gvwVar, kmd kmdVar, Handler handler, fgn fgnVar, eat eatVar, bko bkoVar, bkn bknVar, glk glkVar, dsx dsxVar, jwn jwnVar, hah hahVar, jwn jwnVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f21852d = fgzVar;
        executor.getClass();
        this.f21850b = executor;
        executor2.getClass();
        this.f21851c = executor2;
        this.f21854f = ffqVar;
        this.f21848E = jwlVar;
        this.f21855g = mrmVar;
        this.f21856h = mrmVar2;
        this.f21857i = ftoVar;
        this.f21858j = fhyVar;
        this.f21871w = mcaVar;
        this.f21874z = flcVar;
        this.f21859k = dhvVar;
        this.f21861m = ffoVar;
        this.f21862n = fgnVar;
        this.f21863o = handler;
        this.f21864p = gvwVar;
        this.f21865q = kmdVar;
        this.f21866r = eatVar;
        this.f21849F = bkoVar;
        this.f21870v = dsxVar;
        this.f21873y = bknVar;
        this.f21872x = glkVar;
        this.f21844A = dhvVar.mo6184l(dii.f11524C);
        this.f21845B = jwnVar;
        this.f21846C = hahVar;
        this.f21847D = jwnVar2;
        this.f21853e = new Object();
        this.f21869u = new ArrayList();
        dhvVar.mo6177e();
        this.f21860l = dhvVar.mo6184l(dii.f11535k);
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6177e();
    }

    /* JADX INFO: renamed from: b */
    public static nps m8373b(nps npsVar, nom nomVar, nom nomVar2) {
        return nnj.m17524j(nod.m17554j(npm.m17611q(npsVar), nomVar, not.INSTANCE), RuntimeException.class, new cnc(nomVar2, 5), not.INSTANCE);
    }

    /* JADX INFO: renamed from: d */
    public static void m8374d(fto ftoVar, gyu gyuVar, Handler handler) {
        handler.postDelayed(new ewo(ftoVar, gyuVar, 8), gyuVar, 3000L);
    }

    /* JADX INFO: renamed from: f */
    public static final nkm m8375f(fgg fggVar, long j) {
        fil filVarM8463a = fggVar.f21824d.m8463a();
        nxl nxlVarM18137O = nkm.f43229n.m18137O();
        long j2 = j - fggVar.f21826f;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        int i = (int) j2;
        nkm nkmVar = (nkm) nxlVarM18137O.f44974b;
        nkmVar.f43231a |= 1;
        nkmVar.f43232b = i;
        if (fggVar.f21835o && fggVar.f21837q.mo16813g()) {
            SystemClock.elapsedRealtime();
            ((Long) fggVar.f21837q.mo16809c()).longValue();
        }
        try {
            int iConvert = (int) TimeUnit.MILLISECONDS.convert(((Long) kxk.m14973S(fggVar.f21828h)).longValue() - filVarM8463a.f22123c, TimeUnit.MICROSECONDS);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkm nkmVar2 = (nkm) nxlVarM18137O.f44974b;
            nkmVar2.f43231a |= 2;
            nkmVar2.f43233c = iConvert;
            int iConvert2 = (int) TimeUnit.MILLISECONDS.convert(filVarM8463a.f22124d - fggVar.f21825e, TimeUnit.MICROSECONDS);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nkm nkmVar3 = (nkm) nxqVar;
            nkmVar3.f43231a |= 4;
            nkmVar3.f43234d = iConvert2;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nkm nkmVar4 = (nkm) nxqVar2;
            nkmVar4.f43231a |= 16;
            nkmVar4.f43236f = true;
            int i2 = filVarM8463a.f22122b;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O.f44974b;
            nkm nkmVar5 = (nkm) nxqVar3;
            nkmVar5.f43231a |= 8;
            nkmVar5.f43235e = i2;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkm nkmVar6 = (nkm) nxlVarM18137O.f44974b;
            nkmVar6.f43231a |= 32;
            nkmVar6.f43237g = false;
            int iM8379l = m8379l(fggVar.f21840t);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar4 = nxlVarM18137O.f44974b;
            nkm nkmVar7 = (nkm) nxqVar4;
            nkmVar7.f43238h = iM8379l - 1;
            nkmVar7.f43231a |= 64;
            int i3 = fggVar.f21841u;
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkm nkmVar8 = (nkm) nxlVarM18137O.f44974b;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            nkmVar8.f43242l = i4;
            nkmVar8.f43231a |= 512;
            lku.m15613H(fggVar.f21829i.isDone());
            if (((mrm) kxk.m14974T(fggVar.f21829i)).mo16813g()) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nkm nkmVar9 = (nkm) nxlVarM18137O.f44974b;
                nkmVar9.f43231a |= 128;
                nkmVar9.f43240j = true;
            }
            fggVar.f21842v.m15391h(nxlVarM18137O);
            return (nkm) nxlVarM18137O.mo18103l();
        } catch (ExecutionException e) {
            throw new IllegalStateException(aJFPpVSaoDO.wcRtHPAeVMGI, e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final nkm m8376g(fgg fggVar) {
        nxl nxlVarM18137O = nkm.f43229n.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar = (nkm) nxlVarM18137O.f44974b;
        nkmVar.f43231a |= 16;
        nkmVar.f43236f = false;
        int iM8379l = m8379l(fggVar.f21840t);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nkm nkmVar2 = (nkm) nxqVar;
        nkmVar2.f43238h = iM8379l - 1;
        nkmVar2.f43231a |= 64;
        int i = fggVar.f21841u;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar3 = (nkm) nxlVarM18137O.f44974b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nkmVar3.f43242l = i2;
        nkmVar3.f43231a |= 512;
        return (nkm) nxlVarM18137O.mo18103l();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hjy, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public static final void m8377i(fgg fggVar, drj drjVar) {
        lku.m15613H(fggVar.f21831k.get());
        try {
            try {
                kxk.m15019l((byte[]) drjVar.f12396b, (ExifInterface) ((mrm) drjVar.f12398d).mo16812f(), ((gyj) drjVar.f12395a).f26832a);
                drjVar.f12399e.mo10402d(((gyj) drjVar.f12395a).f26832a.mo14681a());
                ((gyj) drjVar.f12395a).m9977b();
                fggVar.f21823c.m9976a();
                lku.m15613H(!fggVar.f21833m.isDone());
                fggVar.f21833m.mo14894e(drjVar.f12397c);
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) f21843a.m17251b()).mo17283h(e)).mo17276G(2211)).mo17290o("Could not move original image to place");
                fggVar.f21833m.mo8566a(e);
                ((gyj) drjVar.f12395a).m9976a();
                fggVar.f21823c.m9976a();
            }
        } catch (Throwable th) {
            fggVar.f21823c.m9976a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8378k(fgg fggVar, Throwable th, drj drjVar) {
        String strConcat;
        gyu gyuVar = fggVar.f21821a;
        if (fggVar.f21831k.getAndSet(true)) {
            ((nbe) ((nbe) f21843a.m17252c()).mo17276G((char) 2223)).mo17290o("Cancelling microvideo but result has been submitted already");
            return;
        }
        if (fggVar.f21835o) {
            if (fggVar.f21839s.mo16813g()) {
                String strValueOf = String.valueOf(((fkv) fggVar.f21839s.mo16809c()).name());
                fggVar.f21830j.mo9917w(new dok(((fkv) fggVar.f21839s.mo16809c()).f22426i, th));
                strConcat = "LongShot Video Cancelled. Reason = ".concat(strValueOf);
            } else {
                fggVar.f21830j.mo9917w(new dok(th));
                strConcat = "LongShot Video Cancelled.";
            }
            fggVar.f21833m.mo8566a(new CancellationException(strConcat));
        } else {
            m8377i(fggVar, drjVar);
        }
        fggVar.f21823c.m9976a();
        Object obj = drjVar.f12399e;
        nxl nxlVarM18137O = nkm.f43229n.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nkm nkmVar = (nkm) nxqVar;
        nkmVar.f43231a |= 16;
        nkmVar.f43236f = false;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar2 = (nkm) nxlVarM18137O.f44974b;
        nkmVar2.f43231a |= 32;
        nkmVar2.f43237g = true;
        int iM8379l = m8379l(fggVar.f21840t);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nkm nkmVar3 = (nkm) nxqVar2;
        nkmVar3.f43238h = iM8379l - 1;
        nkmVar3.f43231a |= 64;
        int i = fggVar.f21841u;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar4 = (nkm) nxlVarM18137O.f44974b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nkmVar4.f43242l = i2;
        nkmVar4.f43231a |= 512;
        if (fggVar.f21839s.mo16813g()) {
            int i3 = ((fkv) fggVar.f21839s.mo16809c()).f22426i;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkm nkmVar5 = (nkm) nxlVarM18137O.f44974b;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            nkmVar5.f43243m = i4;
            nkmVar5.f43231a |= 1024;
        }
        ((hjz) obj).f28086l = (nkm) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: l */
    private static final int m8379l(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return 3;
            default:
                return 4;
        }
    }

    @Override // p000.fgw
    /* JADX INFO: renamed from: a */
    public final synchronized fgv mo8380a(final gyh gyhVar, final int i, final boolean z, final nps npsVar) {
        fgm fgmVar;
        final gyu gyuVarMo9902h = gyhVar.mo9902h();
        gyw gywVarMo9903i = gyhVar.mo9903i();
        gyw gywVar = gyw.LONG_SHOT;
        boolean zM8363g = this.f21854f.m8363g();
        final boolean z2 = gywVarMo9903i == gywVar;
        if (!zM8363g && !z2) {
            fgmVar = new fgm(gyuVarMo9902h);
        } else {
            if (z2 || (((Boolean) this.f21847D.mo3831be()).booleanValue() && !(this.f21844A && jeu.m12986j(((Integer) this.f21846C.mo10031c(gzy.f27040ax)).intValue()) == 2 && ((Float) this.f21845B.mo3831be()).floatValue() >= 2.5f))) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - System.currentTimeMillis();
                flu.m8559b();
                fhc.f21955b.clear();
                fhc.f21956c.clear();
                boolean z3 = fhc.f21954a;
                synchronized (this.f21853e) {
                    if (z2) {
                        this.f21874z.m8542b();
                        if (this.f21856h.mo16813g()) {
                            fhh fhhVar = (fhh) this.f21856h.mo16809c();
                            if (fhhVar.f21978c.mo16813g() && fhhVar.f21976a.mo16813g()) {
                                fhhVar.f21979d.execute(new fdo(fhhVar, 15));
                            }
                        }
                    }
                    final long jConvert = TimeUnit.MICROSECONDS.convert(gyhVar.mo9898d() + jElapsedRealtime, TimeUnit.MILLISECONDS);
                    if (this.f21868t == 0) {
                        ((nbe) ((nbe) f21843a.m17252c()).mo17276G(2191)).mo17290o("Taking picture before any frames came in; aborting.");
                        if (!z2) {
                            return new fgm(gyuVarMo9902h);
                        }
                        if (!this.f21859k.mo6184l(dii.f11548x)) {
                            gyhVar.mo9917w(new IllegalStateException("Taking long shot before any frames came in."));
                            return new fgm(gyuVarMo9902h);
                        }
                    }
                    this.f21869u.add(Long.valueOf(jConvert));
                    dhv dhvVar = this.f21859k;
                    dhx dhxVar = dii.f11525a;
                    dhvVar.mo6178f();
                    if (gyhVar.mo9903i() == gyw.LONG_SHOT && !this.f21848E.m13630f()) {
                        gyhVar.mo9917w(new hlm(null));
                        fgmVar = new fgm(gyuVarMo9902h);
                    }
                    if (gyhVar.mo9903i() == gyw.LONG_SHOT) {
                        gyhVar.mo9919y();
                    }
                    final kba kbaVarMo8731a = this.f21857i.mo8731a();
                    final nqf nqfVarM17621g = nqf.m17621g();
                    this.f21849F.m2622p(gyuVarMo9902h).m7221a(new ecy() { // from class: ffs
                        @Override // p000.ecy
                        /* JADX INFO: renamed from: a */
                        public final void mo7052a(eem eemVar, int i2, long j, kpp kppVar) {
                            kxk.m14975U(nqfVarM17621g, new eho(this.f21734a, j, 2), not.INSTANCE);
                        }
                    });
                    this.f21850b.execute(new Runnable() { // from class: ffu
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
                        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
                        /* JADX WARN: Type inference failed for: r1v1 */
                        /* JADX WARN: Type inference failed for: r1v10, types: [flf] */
                        /* JADX WARN: Type inference failed for: r1v2 */
                        /* JADX WARN: Type inference failed for: r1v26 */
                        /* JADX WARN: Type inference failed for: r1v27 */
                        /* JADX WARN: Type inference failed for: r38v0, types: [flf] */
                        /* JADX WARN: Type inference failed for: r3v2, types: [dhv, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v6, types: [dhv, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v7, types: [dhv, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v8, types: [dhv, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v1, types: [dhv, java.lang.Object] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            ?? M9744i;
                            gyj gyjVarM9989i;
                            int i2;
                            int i3;
                            kyt kytVar;
                            fgh fghVar = this.f21743a;
                            gyu gyuVar = gyuVarMo9902h;
                            nqf nqfVar = nqfVarM17621g;
                            long j = jConvert;
                            gyh gyhVar2 = gyhVar;
                            boolean z4 = z;
                            boolean z5 = z2;
                            int i4 = i;
                            nps npsVar2 = npsVar;
                            kba kbaVar = kbaVarMo8731a;
                            try {
                                fghVar.f21858j.mo8424c();
                                fghVar.f21866r.m7019d();
                                Object obj = fghVar.f21853e;
                                synchronized (obj) {
                                    try {
                                        fghVar.f21869u.remove(Long.valueOf(j));
                                        flu.m8559b();
                                        int i5 = fghVar.f21854f.f21725e;
                                        ljf ljfVarM8354a = fghVar.f21861m.m8354a(gyhVar2, z4);
                                        mca mcaVar = fghVar.f21871w;
                                        Object obj2 = ljfVarM8354a.f38371c;
                                        long jLongValue = ((mrm) obj2).mo16813g() ? ((Long) ((mrm) obj2).mo16809c()).longValue() : TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS);
                                        gyw gywVarMo9903i2 = gyhVar2.mo9903i();
                                        dsx dsxVar = fghVar.f21870v;
                                        ?? r4 = dsxVar.f12521a;
                                        dhx dhxVar2 = dii.f11525a;
                                        r4.mo6175c();
                                        dsxVar.f12521a.mo6175c();
                                        dsxVar.f12521a.mo6175c();
                                        if (gywVarMo9903i2 == gyw.AUTO_LONG_SHOT) {
                                            M9744i = ((gtd) mcaVar.f39915c).m9744i(((fzn) mcaVar.f39916d).m8982c());
                                        } else {
                                            gyw gywVar2 = gyw.LONG_SHOT;
                                            flf flhVar = new flh((dxx) mcaVar.f39918f, jLongValue, mcaVar.f39914b, i5, mcaVar.f39913a, (dsx) mcaVar.f39919g, mcaVar.f39920h, mrm.m16829i(mcaVar.f39921i), null, null);
                                            mcaVar.f39920h.mo6175c();
                                            if (gywVarMo9903i2 == gywVar2) {
                                                flhVar = ((flc) mcaVar.f39917e).m8541a(TimeUnit.NANOSECONDS.toMicros(jLongValue), flhVar);
                                            }
                                            M9744i = ((gtd) mcaVar.f39915c).m9744i(flhVar);
                                        }
                                        long jMo8530a = M9744i.mo8530a();
                                        Object objMo6051a = fghVar.f21867s.mo6051a();
                                        lih lihVar = new lih(null);
                                        nqf nqfVarM17621g2 = nqf.m17621g();
                                        nqf nqfVarM17621g3 = nqf.m17621g();
                                        final nqf nqfVarM17621g4 = nqf.m17621g();
                                        mrm mrmVar = fghVar.f21855g;
                                        final nps npsVarMo8756a = mrmVar.mo16813g() ? ((fti) mrmVar.mo16809c()).mo8756a(gyuVar) : kxk.m14965K(mqu.f41450a);
                                        npsVarMo8756a.mo2282d(new Runnable() { // from class: ffv
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                nqf nqfVar2 = nqfVarM17621g4;
                                                nps npsVar3 = npsVarMo8756a;
                                                nbh nbhVar = fgh.f21843a;
                                                nqfVar2.mo16665f(npsVar3);
                                            }
                                        }, not.INSTANCE);
                                        nqf nqfVarM17621g5 = nqf.m17621g();
                                        kxk.m14975U(nqfVarM17621g5, new ffx(nqfVarM17621g4, npsVarMo8756a), not.INSTANCE);
                                        nqf nqfVarM17621g6 = nqf.m17621g();
                                        if (!z5) {
                                            nqfVarM17621g6.mo14894e(mqu.f41450a);
                                        }
                                        boolean zMo16813g = fghVar.f21856h.mo16813g();
                                        if (z5) {
                                            gyj gyjVarMo9900f = gyhVar2.mo9900f();
                                            gyjVarMo9900f.f26832a.mo14688h("LS");
                                            gyjVarM9989i = gyjVarMo9900f;
                                        } else {
                                            try {
                                                try {
                                                    gyjVarM9989i = gyhVar2.mo9901g().m9989i();
                                                } catch (IllegalStateException e) {
                                                    ((nbe) ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17283h(e)).mo17276G(2210)).mo17293r("Could not create cached file for encoder output since %s is canceled", gyuVar);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                throw th;
                                            }
                                        }
                                        try {
                                            FileOutputStream fileOutputStreamMo14685e = gyjVarM9989i.f26832a.mo14685e();
                                            gyj gyjVar = gyjVarM9989i;
                                            fgz fgzVar = fghVar.f21852d;
                                            ?? r38 = M9744i;
                                            if (!fghVar.f21864p.mo9812h(fghVar.f21865q.mo14558k()) || fghVar.f21864p.mo9811g(kay.m13889b(i4))) {
                                                i2 = i4;
                                                i3 = i2;
                                            } else {
                                                i2 = i4;
                                                i3 = (i2 + 180) % 360;
                                            }
                                            kyq fhfVar = new fhf(new fix(new fhx(gyhVar2.mo9902h().toString(), fghVar.f21859k, fgzVar.mo8405a(fileOutputStreamMo14685e, i3, nqfVarM17621g6, kxk.m14956B(fghVar.f21851c))), new AmbientModeSupport.AmbientController(gyhVar2), null, null, null), fghVar.m8382e(z5), nqfVarM17621g3, nqfVarM17621g2, npsVar2, nqfVarM17621g4, nqfVarM17621g5, fghVar.f21860l, fghVar.f21850b);
                                            if (!z5 && !fghVar.f21860l) {
                                                fhfVar = new fig(fhfVar);
                                            }
                                            fim fimVar = new fim((fil) objMo6051a, fhfVar);
                                            kyt kytVarMo8410a = fimVar.mo8410a();
                                            kyt kytVarMo8410a2 = fimVar.mo8410a();
                                            if (fghVar.f21859k.mo6184l(dii.f11529e) && z5) {
                                                fip fipVar = new fip(kytVarMo8410a2, i2);
                                                fipVar.f22141a.mo2282d(new fdo(fipVar, 18), not.INSTANCE);
                                                nqfVarM17621g5.mo16665f(fipVar.f22142b);
                                                kytVar = fipVar;
                                            } else {
                                                nqfVarM17621g5.mo14894e(mqu.f41450a);
                                                kytVar = kytVarMo8410a2;
                                            }
                                            kyt kytVarMo8410a3 = zMo16813g ? fimVar.mo8410a() : null;
                                            fho fhoVar = new fho(fimVar.mo8410a());
                                            fimVar.mo8413d();
                                            kyt kytVar2 = kytVarMo8410a3;
                                            ftn ftnVarMo8742l = fghVar.f21857i.mo8742l(gyuVar, jMo8530a, kay.m13889b(i2), z5, lihVar, kytVar);
                                            kbaVar.close();
                                            fle fleVarMo8428g = fghVar.f21858j.mo8428g(gyuVar, new C1058va(kytVarMo8410a, kytVar2, (kyt) fhoVar), Math.max(0L, jMo8530a), z5);
                                            fgg fggVar = new fgg(gyuVar, gyhVar2, fleVarMo8428g, gyjVar, (fil) objMo6051a, j, nqfVarM17621g3, System.currentTimeMillis(), i5, fghVar.f21857i, lihVar, npsVar2, fimVar, z5, nqfVarM17621g2, nqfVarM17621g6, fghVar.f21873y.m2564N(), null, null);
                                            fggVar.f21841u = true != z5 ? 3 : 5;
                                            r38.mo8533d(new ffy(fghVar, ftnVarMo8742l, fleVarMo8428g, ljfVarM8354a, fggVar, fimVar, z5, null, null, null));
                                            fimVar.mo8411b().mo2282d(cik.f5810r, fghVar.f21850b);
                                            nqfVar.mo14894e(fggVar);
                                        } catch (IOException e2) {
                                            throw new RuntimeException(e2);
                                        } catch (IllegalStateException e3) {
                                            ((nbe) ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17283h(e3)).mo17276G(2209)).mo17293r("Could not create output stream for encoder output since %s is canceled", gyuVar);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        M9744i = obj;
                                    }
                                }
                            } catch (RuntimeException e4) {
                                nqfVar.mo8566a(e4);
                            }
                        }
                    });
                    return new fgd(this, gyuVarMo9902h, nqfVarM17621g, gyhVar);
                }
            }
            fgmVar = new fgm(gyuVarMo9902h);
        }
        return fgmVar;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8381c(fgg fggVar) {
        fggVar.f21822b.mo8368a(fkv.CANCELLED_EXTERNALLY);
        fggVar.f21834n.mo8412c();
        fggVar.f21823c.m9976a();
        gyu gyuVar = fggVar.f21821a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8382e(boolean z) {
        if (!z) {
            return this.f21859k.mo6184l(dii.f11536l);
        }
        dhv dhvVar = this.f21859k;
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6175c();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m8383h(fgg fggVar, Throwable th, drj drjVar) {
        ((nbe) ((nbe) ((nbe) f21843a.m17252c()).mo17283h(th)).mo17276G(2216)).mo17293r(rgoX.Jzkb, fggVar.f21821a);
        this.f21858j.mo8423b();
        if (fggVar.f21831k.getAndSet(true)) {
            return;
        }
        if (fggVar.f21835o) {
            fggVar.f21833m.mo8566a(new IllegalStateException("LongShot video failed!", th));
        } else {
            m8377i(fggVar, drjVar);
        }
        ((hjz) drjVar.f12399e).f28086l = m8376g(fggVar);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [hjy, java.lang.Object] */
    /* JADX INFO: renamed from: j */
    public final void m8384j(fgg fggVar, drj drjVar, long j) {
        gyu gyuVar = fggVar.f21821a;
        mrm mrmVar = fggVar.f21837q;
        if (mrmVar.mo16813g()) {
            ((hjz) drjVar.f12399e).f28075a = ((Long) mrmVar.mo16809c()).longValue();
        } else {
            ((nbe) ((nbe) f21843a.m17252c()).mo17276G(2219)).mo17293r("No recording-end timestamp recorded for %s", fggVar.f21821a);
        }
        try {
            kqc kqcVar = fggVar.f21823c.f26832a;
            if (fggVar.f21831k.getAndSet(true)) {
                throw new IllegalStateException("Trying to set final file but it has already been submitted.");
            }
            if (this.f21859k.mo6184l(dij.f11561K)) {
                this.f21862n.m8392a(kqcVar);
            }
            drjVar.f12399e.mo10402d(kqcVar.mo14681a());
            lku.m15613H(!fggVar.f21833m.isDone());
            ((hjz) drjVar.f12399e).f28086l = m8375f(fggVar, System.currentTimeMillis());
            kqcVar.mo14688h("LS");
            fggVar.f21823c.m9977b();
            nqf nqfVar = fggVar.f21833m;
            hln hlnVar = new hln(krd.MPEG4);
            TimeUnit.MICROSECONDS.toMillis(j);
            hlnVar.m10447a((ExifInterface) ((hln) drjVar.f12397c).f28268c.mo16812f());
            Object obj = drjVar.f12397c;
            hlnVar.f28269d = ((hln) obj).f28269d;
            hlnVar.m10448b((kay) ((hln) obj).f28267b.mo16812f());
            nqfVar.mo14894e(hlnVar);
        } catch (Exception e) {
            m8383h(fggVar, e, drjVar);
        }
    }
}
