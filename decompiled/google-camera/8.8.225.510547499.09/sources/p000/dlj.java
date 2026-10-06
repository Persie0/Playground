package p000;

import java.util.HashMap;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlj {
    public dlj() {
    }

    public dlj(dhv dhvVar) {
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
    }

    /* JADX INFO: renamed from: b */
    public static void m6338b(dhy dhyVar, dhv dhvVar, dja djaVar, hcg hcgVar) {
        dhyVar.mo6187n(dhf.f11044e, Float.valueOf(1.3229325E7f));
        dhyVar.mo6187n(dhf.f11045f, Float.valueOf(3.807744E7f));
        djg djgVar = (djg) dhyVar;
        djgVar.mo6194u(dib.f11333bn, true);
        dhyVar.mo6186m(dib.f11372n, 1000);
        djgVar.mo6194u(dib.f11285as, true);
        djgVar.mo6194u(dib.f11286at, true);
        dhyVar.mo6187n(dib.f11302bI, Float.valueOf(1.580689f));
        djgVar.mo6194u(dib.f11263aW, false);
        djgVar.mo6192s(dib.f11244aD, true);
        djgVar.mo6194u(dib.f11317bX, true);
        djgVar.mo6194u(dib.f11292az, false);
        dhyVar.mo6186m(dib.f11362d, 2);
        djgVar.mo6194u(dib.f11342bw, true);
        djgVar.mo6194u(dib.f11313bT, true);
        djgVar.mo6194u(dhu.f11205g, true);
        djgVar.mo6194u(dhu.f11206h, true);
        djgVar.mo6194u(dho.f11143c, true);
        djgVar.mo6194u(dhs.f11164b, true);
        djgVar.mo6194u(dhs.f11165c, true);
        djgVar.mo6194u(dhs.f11166d, true);
        djgVar.mo6194u(dhh.f11054G, false);
        djgVar.mo6194u(dhh.f11056I, false);
        djgVar.mo6194u(dhh.f11058K, false);
        djgVar.mo6194u(dhh.f11087am, false);
        djgVar.mo6194u(dhh.f11088an, false);
        djgVar.mo6194u(dhh.f11082ah, false);
        djgVar.mo6194u(dhh.f11067T, false);
        djgVar.mo6194u(dhh.f11065R, true);
        djgVar.mo6194u(dhh.f11073Z, true);
        djgVar.mo6194u(dhh.f11075aa, true);
        djgVar.mo6194u(dhh.f11077ac, false);
        djgVar.mo6194u(dib.f11238Y, false);
        djgVar.mo6194u(dhh.f11078ad, true);
        djgVar.mo6194u(dhq.f11154a, true);
        djgVar.mo6194u(dhq.f11155b, true);
        djgVar.mo6194u(dhq.f11158e, true);
        djgVar.mo6194u(dhq.f11157d, true);
        dhyVar.mo6188o(dhq.f11160g, "deeprestore_face_float32_512x512_v7_1-graph-custom_op.tflite.uncompressed");
        djgVar.mo6194u(dhu.f11207i, true);
        boolean zM10104b = hcgVar.m10104b();
        djgVar.mo6192s(dii.f11531g, false);
        djgVar.mo6194u(dii.f11542r, true);
        djgVar.mo6194u(dii.f11535k, false);
        djgVar.mo6194u(dii.f11546v, true);
        djgVar.mo6194u(dii.f11545u, zM10104b);
        djgVar.mo6194u(dii.f11543s, false);
        djgVar.mo6194u(dij.f11595s, true);
        djgVar.mo6194u(dij.f11569S, true);
        djgVar.mo6194u(dij.f11565O, true);
        djgVar.mo6194u(dij.f11570T, true);
        djgVar.mo6194u(dij.f11596t, true);
        djgVar.mo6194u(dij.f11567Q, true);
        djgVar.mo6194u(dij.f11586j, true);
        djgVar.mo6194u(dij.f11588l, true);
        djgVar.mo6194u(dij.f11598v, true);
        djgVar.mo6194u(dij.f11568R, true);
        djgVar.mo6194u(dij.f11589m, true);
        djgVar.mo6194u(dij.f11583g, true);
        djgVar.mo6194u(dij.f11584h, true);
        djgVar.mo6194u(dij.f11581e, true);
        djgVar.mo6194u(dij.f11582f, true);
        djgVar.mo6194u(dij.f11558H, true);
        dhyVar.mo6186m(dil.f11616b, Integer.valueOf(((Integer) dhvVar.mo6173a(dil.f11617c).get()).intValue() * 4));
        djgVar.mo6194u(dil.f11625k, false);
        djgVar.mo6194u(dil.f11626l, true);
        djgVar.mo6194u(dhg.f11046a, false);
        djgVar.mo6194u(dim.f11639b, false);
        djgVar.mo6194u(dim.f11638a, true);
        djgVar.mo6194u(dio.f11668j, false);
        djgVar.mo6194u(dio.f11682x, true);
        djgVar.mo6194u(dio.f11676r, true);
        if (djaVar.m6200b(dja.FISHFOOD)) {
            djgVar.mo6194u(dio.f11653J, false);
        }
        djgVar.mo6194u(dio.f11655L, false);
        djgVar.mo6194u(dib.f11276aj, true);
        djgVar.mo6194u(dik.f11607e, true);
        djgVar.mo6194u(dik.f11608f, false);
        djgVar.mo6194u(dik.f11609g, true);
        djgVar.mo6194u(dik.f11611i, true);
        dhyVar.mo6188o(dik.f11612j, "motion-custom_op-janeiro.tflite.enc");
        dhyVar.mo6188o(dik.f11613k, "saliency-custom_op-janeiro.tflite.enc");
        dhyVar.mo6188o(dik.f11614l, "scene_classification-custom_op-janeiro.tflite.enc");
        djgVar.mo6194u(did.f11404O, true);
        dhyVar.mo6188o(did.f11405P, "lancet_hdrp42_2x_516x263_1u8_1u8-p22.tflite.uncompressed");
        djgVar.mo6194u(did.f11443av, false);
        dhyVar.mo6188o(did.f11444aw, "pecan-p22-custom_op.tflite.uncompressed");
        djaVar.m6200b(dja.DOGFOOD);
        djgVar.mo6194u(dhp.f11153j, true);
        djgVar.mo6194u(dib.f11262aV, false);
        djgVar.mo6194u(dib.f11304bK, false);
        djgVar.mo6194u(did.f11472z, false);
        djgVar.mo6194u(did.f11434am, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m6339c(dhy dhyVar, dhv dhvVar, kpb kpbVar, dja djaVar, hcg hcgVar) {
        dhyVar.mo6187n(dhf.f11044e, Float.valueOf(1.3229325E7f));
        dhyVar.mo6187n(dhf.f11045f, Float.valueOf(3.807744E7f));
        djg djgVar = (djg) dhyVar;
        djgVar.mo6194u(dib.f11237X, true);
        djgVar.mo6194u(dib.f11333bn, true);
        djgVar.mo6194u(dib.f11337br, true);
        djgVar.mo6194u(dib.f11340bu, true);
        dhyVar.mo6186m(dib.f11372n, 1400);
        dhyVar.mo6187n(dib.f11302bI, Float.valueOf(1.580689f));
        djgVar.mo6194u(dib.f11263aW, false);
        djgVar.mo6192s(dib.f11244aD, true);
        djgVar.mo6194u(dib.f11285as, true);
        djgVar.mo6194u(dib.f11286at, true);
        djgVar.mo6194u(dib.f11314bU, false);
        djgVar.mo6194u(dif.f11479c, true);
        djgVar.mo6194u(dib.f11311bR, true);
        djgVar.mo6194u(dib.f11312bS, true);
        djgVar.mo6194u(dib.f11317bX, true);
        djgVar.mo6194u(dib.f11307bN, true);
        djgVar.mo6194u(dib.f11349cc, true);
        dhyVar.mo6186m(dib.f11362d, 2);
        djgVar.mo6194u(dib.f11242aB, false);
        djgVar.mo6194u(dib.f11342bw, true);
        djgVar.mo6194u(dhu.f11205g, true);
        dhyVar.mo6187n(dhu.f11200b, Float.valueOf(1.0f));
        djgVar.mo6194u(dhu.f11206h, true);
        djgVar.mo6194u(dhs.f11164b, true);
        djgVar.mo6194u(dho.f11143c, true);
        djgVar.mo6194u(dhs.f11165c, true);
        djgVar.mo6194u(dhs.f11166d, true);
        djgVar.mo6194u(dhh.f11082ah, true);
        djgVar.mo6194u(dhh.f11067T, true);
        djgVar.mo6194u(dhh.f11065R, true);
        djgVar.mo6194u(dhh.f11061N, true);
        djgVar.mo6194u(dhh.f11069V, true);
        djgVar.mo6194u(dhh.f11070W, true);
        djgVar.mo6194u(dhh.f11071X, true);
        djgVar.mo6194u(dhh.f11073Z, true);
        djgVar.mo6194u(dhh.f11075aa, true);
        djgVar.mo6194u(dhh.f11077ac, false);
        dhw dhwVar = dhh.f11049B;
        Float fValueOf = Float.valueOf(7.0f);
        dhyVar.mo6187n(dhwVar, fValueOf);
        dhyVar.mo6187n(dhh.f11050C, fValueOf);
        dhyVar.mo6187n(dhh.f11051D, fValueOf);
        dhyVar.mo6187n(dhh.f11048A, fValueOf);
        djgVar.mo6194u(dib.f11238Y, false);
        djgVar.mo6194u(dhh.f11078ad, true);
        djgVar.mo6194u(did.f11415Z, true);
        djgVar.mo6194u(dik.f11607e, true);
        djgVar.mo6194u(dik.f11608f, true);
        djgVar.mo6194u(dik.f11609g, true);
        djgVar.mo6194u(dhu.f11207i, true);
        djgVar.mo6194u(dig.f11506t, true);
        boolean zM10104b = hcgVar.m10104b();
        djgVar.mo6192s(dii.f11531g, false);
        djgVar.mo6194u(dii.f11542r, true);
        djgVar.mo6194u(dii.f11535k, false);
        djgVar.mo6194u(dii.f11546v, true);
        djgVar.mo6194u(dii.f11545u, zM10104b);
        djgVar.mo6194u(dij.f11595s, true);
        djgVar.mo6194u(dij.f11569S, true);
        djgVar.mo6194u(dij.f11565O, true);
        djgVar.mo6194u(dij.f11570T, true);
        djgVar.mo6194u(dij.f11596t, true);
        djgVar.mo6194u(dij.f11567Q, true);
        djgVar.mo6194u(dij.f11586j, true);
        djgVar.mo6194u(dij.f11588l, true);
        djgVar.mo6194u(dij.f11598v, true);
        djgVar.mo6194u(dij.f11568R, true);
        djgVar.mo6194u(dij.f11589m, true);
        djgVar.mo6194u(dij.f11583g, true);
        djgVar.mo6194u(dij.f11584h, true);
        djgVar.mo6194u(dij.f11581e, true);
        djgVar.mo6194u(dij.f11582f, true);
        djgVar.mo6194u(dij.f11558H, true);
        dhyVar.mo6186m(dil.f11616b, Integer.valueOf(((Integer) dhvVar.mo6173a(dil.f11617c).get()).intValue() * (true != kpbVar.f36776i ? 4 : 5)));
        dhyVar.mo6186m(dil.f11615a, 300);
        djgVar.mo6194u(dil.f11625k, false);
        djgVar.mo6194u(dil.f11626l, true);
        djgVar.mo6194u(dhg.f11047b, true);
        djgVar.mo6194u(dio.f11682x, true);
        djgVar.mo6194u(dio.f11650G, true);
        djgVar.mo6194u(dio.f11651H, true);
        djgVar.mo6194u(dio.f11676r, true);
        djgVar.mo6194u(dio.f11677s, true);
        djgVar.mo6194u(dio.f11654K, false);
        if (djaVar.m6200b(dja.FISHFOOD)) {
            djgVar.mo6194u(dio.f11653J, false);
        }
        djgVar.mo6194u(dio.f11655L, false);
        djgVar.mo6194u(dib.f11273ag, true);
        djgVar.mo6194u(dib.f11276aj, true);
        djgVar.mo6194u(dib.f11279am, false);
        djgVar.mo6194u(dhq.f11154a, djaVar.m6200b(dja.FISHFOOD));
        djgVar.mo6194u(dhq.f11156c, true);
        djgVar.mo6194u(dhq.f11157d, true);
        djgVar.mo6194u(dht.f11176d, true);
        djgVar.mo6194u(dht.f11182j, true);
        djgVar.mo6194u(dhm.f11138c, true);
        djaVar.m6200b(dja.DOGFOOD);
        djgVar.mo6194u(dib.f11315bV, true);
        djgVar.mo6194u(dhp.f11153j, true);
        djgVar.mo6194u(dhu.f11202d, false);
        djgVar.mo6194u(did.f11397H, false);
        djgVar.mo6194u(did.f11398I, false);
    }

    public dlj(byte[] bArr) {
        Executors.newScheduledThreadPool(1);
        new HashMap();
    }
}
