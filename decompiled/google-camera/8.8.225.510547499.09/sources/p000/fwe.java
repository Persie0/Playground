package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwe implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23737a;

    /* JADX INFO: renamed from: b */
    private final oju f23738b;

    /* JADX INFO: renamed from: c */
    private final oju f23739c;

    /* JADX INFO: renamed from: d */
    private final oju f23740d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f23741e;

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23738b = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23739c = ojuVar2;
        this.f23737a = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr, byte[] bArr2) {
        this.f23741e = i;
        this.f23739c = ojuVar;
        this.f23737a = ojuVar2;
        this.f23740d = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f23741e = i;
        this.f23740d = ojuVar;
        this.f23738b = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23737a = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr, byte[] bArr) {
        this.f23741e = i;
        this.f23739c = ojuVar;
        this.f23740d = ojuVar2;
        this.f23737a = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f23741e = i;
        this.f23740d = ojuVar;
        this.f23738b = ojuVar2;
        this.f23737a = ojuVar3;
        this.f23739c = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23737a = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23739c = ojuVar2;
        this.f23740d = ojuVar3;
        this.f23737a = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23740d = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23739c = ojuVar2;
        this.f23738b = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23739c = ojuVar2;
        this.f23740d = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23739c = ojuVar2;
        this.f23740d = ojuVar3;
        this.f23737a = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23739c = ojuVar2;
        this.f23740d = ojuVar3;
        this.f23737a = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23737a = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f23741e = i;
        this.f23739c = ojuVar;
        this.f23737a = ojuVar2;
        this.f23738b = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f23741e = i;
        this.f23740d = ojuVar;
        this.f23737a = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23739c = ojuVar2;
        this.f23738b = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][][] fArr) {
        this.f23741e = i;
        this.f23740d = ojuVar;
        this.f23738b = ojuVar2;
        this.f23737a = ojuVar3;
        this.f23739c = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f23741e = i;
        this.f23737a = ojuVar;
        this.f23740d = ojuVar2;
        this.f23739c = ojuVar3;
        this.f23738b = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f23741e = i;
        this.f23739c = ojuVar;
        this.f23737a = ojuVar2;
        this.f23738b = ojuVar3;
        this.f23740d = ojuVar4;
    }

    public fwe(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f23741e = i;
        this.f23738b = ojuVar;
        this.f23740d = ojuVar2;
        this.f23737a = ojuVar3;
        this.f23739c = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static fwe m8863a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 0);
    }

    /* JADX INFO: renamed from: b */
    public static fwe m8864b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static fwe m8865c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static fwe m8866d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static fwe m8867e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static fwe m8868f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static fwe m8869g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static fwe m8870h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 10, (int[][]) null);
    }

    /* JADX INFO: renamed from: i */
    public static fwe m8871i(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: j */
    public static fwe m8872j(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: k */
    public static fwe m8873k(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: l */
    public static fwe m8874l(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 16, (int[][][]) null);
    }

    /* JADX INFO: renamed from: m */
    public static fwe m8875m(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 17, (boolean[][][]) null);
    }

    /* JADX INFO: renamed from: n */
    public static fwe m8876n(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 18, (float[][][]) null);
    }

    /* JADX INFO: renamed from: o */
    public static fwe m8877o(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 19, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: p */
    public static fwe m8878p(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fwe(ojuVar, ojuVar2, ojuVar3, ojuVar4, 20, (char[]) null, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r12v0, types: [fzu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kfk] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        jwn jwnVarM13637g;
        fzu fzuVar;
        Object objM17136H;
        kho khoVarMo14135v;
        switch (this.f23741e) {
            case 0:
                jwn jwnVar = (jwn) this.f23737a.get();
                jwn jwnVar2 = (jwn) this.f23738b.get();
                kmd kmdVar = ((fxk) this.f23739c).get();
                if (!((dhv) this.f23740d.get()).mo6184l(dib.f11313bT) || ivw.f32434t == null) {
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                } else {
                    CaptureRequest.Key key = ivw.f32434t;
                    Iterator it = kmdVar.mo14573z().iterator();
                    while (it.hasNext()) {
                        if (((CaptureRequest.Key) it.next()).getName().equals(key.getName())) {
                            jwnVarM13637g = fxo.m8932f(ivw.f32434t, jwr.m13640j(jwr.m13632b(jwnVar, jwnVar2), fod.f22900e));
                        }
                    }
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                }
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            case 1:
                return new glk((hjk) this.f23738b.get(), ((fmg) this.f23739c).get(), (glk) this.f23737a.get(), (nps) this.f23740d.get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 2:
                ExecutorService executorServiceM13821i = jzn.m13821i("ImageSaver");
                executorServiceM13821i.getClass();
                return new fyl(executorServiceM13821i, (jfs) this.f23739c.get(), ((fxy) this.f23740d).get(), (gvw) this.f23738b.get(), (kbz) this.f23737a.get(), null, null, null);
            case 3:
                return new gae(this.f23738b, (jvz) this.f23739c.get(), Optional.m12505of(((cjj) this.f23740d).m3824a()), (kbz) this.f23737a.get());
            case 4:
                return gaa.m8989a((Executor) this.f23738b.get(), (Executor) this.f23737a.get(), this.f23739c, this.f23740d);
            case 5:
                jww jwwVar = (jww) this.f23737a.get();
                kme kmeVar = ((kak) this.f23740d).get();
                kmd kmdVar2 = ((fxk) this.f23739c).get();
                dhv dhvVar = (dhv) this.f23738b.get();
                Executor executorM8795a = ftx.m8795a();
                jwwVar.mo3415bf(Integer.valueOf(kmdVar2.mo14553f()));
                Object objM17136H2 = !dhvVar.mo6184l(dib.f11315bV) ? mzx.f41874a : mxk.m17136H(new gaf(jwwVar, kmeVar, kmdVar2, executorM8795a));
                objM17136H2.getClass();
                return objM17136H2;
            case 6:
                jwn jwnVarM9065a = ((gcw) this.f23740d).m9065a();
                jwn jwnVarM9065a2 = ((gcw) this.f23738b).m9065a();
                jwn jwnVar3 = (jwn) this.f23737a.get();
                drj drjVar = (drj) this.f23739c.get();
                return new gcx(jwnVarM9065a, jwnVarM9065a2, drjVar.f12397c, drjVar.f12396b, drjVar.f12395a, jwnVar3);
            case 7:
                return new gbu((jwn) this.f23737a.get(), (jwn) this.f23739c.get(), (ebv) this.f23738b.get(), (dhv) this.f23740d.get());
            case 8:
                gof gofVar = (gof) this.f23737a.get();
                Object obj = this.f23739c.get();
                Executor executor = (Executor) this.f23740d.get();
                jvb jvbVar = (jvb) this.f23738b.get();
                gbu gbuVar = (gbu) obj;
                if (gbuVar.f24139a || gbuVar.f24140b) {
                    jvbVar.m13537d(jwj.m13624c(gbuVar).mo3830a(new feo(gofVar, 3), kxk.m14956B(executor)));
                }
                gofVar.getClass();
                return gofVar;
            case 9:
                return ((gjx) this.f23737a).get().m9348a(((gjr) this.f23738b).get().m9341a(((gby) this.f23739c).get(), new gie((dhv) this.f23740d.get()), new gop()));
            case 10:
                kbn kbnVar = ((dki) this.f23738b).get();
                jwn jwnVar4 = (jwn) this.f23739c.get();
                glk glkVar = ((gjh) this.f23740d).get();
                ljf ljfVar = ((gkg) this.f23737a).get();
                ArrayList arrayList = new ArrayList(3);
                if (ivs.f32329i != null) {
                    arrayList.add(kgq.m14215e(ivs.f32329i, 1));
                }
                if (ivr.f32309a != null) {
                    arrayList.add(kgq.m14215e(ivr.f32309a, 1));
                }
                gkn gknVar = new gkn(glkVar.f25501b, glkVar.f25500a, (kho) glkVar.f25502c, glkVar.f25503d, fxo.m8929c(arrayList));
                gbi gbiVarM15531g = ljfVar.m15531g();
                return new gka(kbnVar, new gaz(jwnVar4, gknVar, gbiVarM15531g, gknVar, gbiVarM15531g, gknVar, gbiVarM15531g), 1);
            case 11:
                ikw ikwVarM11415a = ((ikv) this.f23739c).m11415a();
                mrm mrmVar = (mrm) this.f23737a.get();
                oju ojuVar = this.f23738b;
                oju ojuVar2 = this.f23740d;
                if (ikwVarM11415a == ikw.IMAGE_INTENT) {
                    lku.m15669w(mrmVar.mo16813g());
                    fzuVar = (fzu) ojuVar2.get();
                } else {
                    fzuVar = (fzu) ojuVar.get();
                }
                fzuVar.getClass();
                return fzuVar;
            case 12:
                kbn kbnVar2 = ((dki) this.f23738b).get();
                jwn jwnVar5 = (jwn) this.f23739c.get();
                hee heeVar = ((git) this.f23740d).get();
                ljf ljfVar2 = ((gkg) this.f23737a).get();
                gbi gbiVarM10144c = heeVar.m10144c(heeVar.f27441e.mo14131r((kho) heeVar.f27442f, 3), heeVar.m10143b(3));
                gbi gbiVarM15531g2 = ljfVar2.m15531g();
                return new gka(kbnVar2, new gaz(jwnVar5, gbiVarM10144c, gbiVarM15531g2, gbiVarM10144c, gbiVarM15531g2, gbiVarM10144c, gbiVarM15531g2), 1);
            case 13:
                kfk kfkVar = (kfk) this.f23740d.get();
                Map map = (Map) this.f23737a.get();
                ikw ikwVarM11415a2 = ((ikv) this.f23739c).m11415a();
                dhv dhvVar2 = (dhv) this.f23738b.get();
                EnumMap enumMap = new EnumMap(gnf.class);
                for (gnf gnfVar : map.keySet()) {
                    enumMap.put(gnfVar, kfkVar.mo14116c().mo14137b((kgi) map.get(gnfVar)));
                }
                if (dhvVar2.mo6184l(dht.f11186n) && dht.m6171a(dhvVar2).contains(ikwVarM11415a2) && enumMap.get(gnf.f25701c) != null && enumMap.get(gnf.RAW_WIDE_ZOOM) != null) {
                    gnf gnfVar2 = gnf.RAW_WIDE_UPPER;
                    kgg kggVar = (kgg) enumMap.get(gnf.f25701c);
                    kggVar.getClass();
                    enumMap.put(gnfVar2, kggVar);
                    gnf gnfVar3 = gnf.RAW_WIDE_ZOOM_UPPER;
                    kgg kggVar2 = (kgg) enumMap.get(gnf.RAW_WIDE_ZOOM);
                    kggVar2.getClass();
                    enumMap.put(gnfVar3, kggVar2);
                }
                return enumMap;
            case 14:
                return new geh(this.f23737a, (jwn) this.f23739c.get(), (jvd) this.f23738b.get(), ((erp) this.f23740d).get());
            case 15:
                cdu cduVar = ((err) this.f23739c).get();
                hai haiVar = (hai) this.f23737a.get();
                dhv dhvVar3 = (dhv) this.f23738b.get();
                fmz fmzVar = (fmz) this.f23740d.get();
                nbh nbhVar = gfy.f24631a;
                if (dhvVar3.mo6184l(dib.f11311bR)) {
                    jww jwwVarM13645b = jwv.m13645b(haiVar.mo10030b(gzy.f27047f), fod.f22908m, fod.f22909n);
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9178r(gev.f24463w);
                    gfjVarM9181o.m9168h(C0100R.string.aspect_ratio_desc);
                    gfjVarM9181o.m9163c(C0100R.string.aspect_ratio_desc);
                    gfjVarM9181o.f24545a = jwwVarM13645b;
                    gfjVarM9181o.m9174n(gfc.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE, gfc.VIDEO_ASPECT_RATIO_THREE_BY_FOUR);
                    gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.ic_ratio_full), Integer.valueOf(C0100R.drawable.ic_ratio_3by4_rotate));
                    gfjVarM9181o.m9170j(Integer.valueOf(C0100R.string.sixteen_by_nine), Integer.valueOf(C0100R.string.three_by_four));
                    gfjVarM9181o.m9165e(Integer.valueOf(C0100R.string.sixteen_by_nine_desc), Integer.valueOf(C0100R.string.three_by_four_desc));
                    gfjVarM9181o.m9179s(new dam(fmzVar, 19));
                    gfjVarM9181o.m9172l(new cwu(cduVar, fmzVar, 3));
                    objM17136H = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 16:
                gtd gtdVar = ((gic) this.f23737a).get();
                kmd kmdVar3 = ((fxk) this.f23740d).get();
                ikw ikwVarM11415a3 = ((ikv) this.f23739c).m11415a();
                Object objM17136H3 = (gtd.m9733e() && ((dhv) this.f23738b.get()).mo6184l(dil.f11624j) && kmdVar3.mo14558k().equals(kmq.BACK) && (ikwVarM11415a3.equals(ikw.PHOTO) || ikwVarM11415a3.equals(ikw.PORTRAIT))) ? mxk.m17136H(fxo.m8930d(kgq.m14215e(ivv.f32394c, true), kgq.m14215e(ivv.f32393b, Integer.valueOf(gtdVar.m9740d(kmdVar3))))) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 17:
                return new gio(((fwy) this.f23738b).get(), (jvd) this.f23740d.get(), (bkn) this.f23737a.get(), (dhv) this.f23739c.get(), null, null, null);
            case 18:
                return new gir((kfk) this.f23740d.get(), (dhv) this.f23738b.get(), (kbz) this.f23737a.get(), (Executor) this.f23739c.get());
            case 19:
                jwn jwnVar6 = (jwn) this.f23739c.get();
                jwn jwnVar7 = (jwn) this.f23737a.get();
                Map map2 = (Map) this.f23740d.get();
                jvb jvbVar2 = (jvb) this.f23738b.get();
                jwf jwfVar = new jwf((String) jwnVar6.mo3831be());
                jvbVar2.m13537d(jwr.m13632b(jwnVar6, jwnVar7).mo3830a(new ecr(map2, jwfVar, 20), not.INSTANCE));
                return jwfVar;
            default:
                kfk kfkVar2 = (kfk) this.f23739c.get();
                Map map3 = (Map) this.f23740d.get();
                Map map4 = (Map) this.f23737a.get();
                boolean zBooleanValue = ((egx) this.f23738b).m7318b().booleanValue();
                Map mapM9339b = gjl.m9339b(map3, map4);
                if (zBooleanValue) {
                    for (Map.Entry entry : map3.entrySet()) {
                        gnf gnfVar4 = (gnf) entry.getKey();
                        kho khoVar = (kho) entry.getValue();
                        if (gnfVar4.equals(gnf.RAW_WIDE_UPPER) || gnfVar4.equals(gnf.RAW_WIDE_ZOOM_UPPER)) {
                            mxk<kgg> mxkVar = khoVar.f36067c;
                            kmg kmgVar = (kmg) map4.get(gnf.RAW_TELE);
                            kmgVar.getClass();
                            String str = kmgVar.f36540a;
                            HashSet hashSet = new HashSet();
                            for (kgg kggVar3 : mxkVar) {
                                if (!kggVar3.mo14193c().f36540a.equals(str)) {
                                    hashSet.add(kggVar3);
                                }
                            }
                            khoVarMo14135v = kfkVar2.mo14135v(hashSet, khoVar.f36068d);
                        } else {
                            khoVarMo14135v = null;
                        }
                        if (khoVarMo14135v != null) {
                            mapM9339b.put(String.valueOf(String.valueOf(map4.get(gnfVar4))).concat("_t"), khoVarMo14135v);
                        }
                    }
                }
                return mapM9339b;
        }
    }
}
