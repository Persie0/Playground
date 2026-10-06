package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25526a;

    /* JADX INFO: renamed from: b */
    private final oju f25527b;

    /* JADX INFO: renamed from: c */
    private final oju f25528c;

    /* JADX INFO: renamed from: d */
    private final oju f25529d;

    /* JADX INFO: renamed from: e */
    private final oju f25530e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f25531f;

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f25531f = i;
        this.f25526a = ojuVar;
        this.f25527b = ojuVar2;
        this.f25528c = ojuVar3;
        this.f25529d = ojuVar4;
        this.f25530e = ojuVar5;
    }

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f25531f = i;
        this.f25530e = ojuVar;
        this.f25526a = ojuVar2;
        this.f25529d = ojuVar3;
        this.f25528c = ojuVar4;
        this.f25527b = ojuVar5;
    }

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f25531f = i;
        this.f25527b = ojuVar;
        this.f25529d = ojuVar2;
        this.f25528c = ojuVar3;
        this.f25526a = ojuVar4;
        this.f25530e = ojuVar5;
    }

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[] iArr) {
        this.f25531f = i;
        this.f25530e = ojuVar;
        this.f25526a = ojuVar2;
        this.f25528c = ojuVar3;
        this.f25527b = ojuVar4;
        this.f25529d = ojuVar5;
    }

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f25531f = i;
        this.f25529d = ojuVar;
        this.f25526a = ojuVar2;
        this.f25528c = ojuVar3;
        this.f25530e = ojuVar4;
        this.f25527b = ojuVar5;
    }

    public glr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[] zArr) {
        this.f25531f = i;
        this.f25530e = ojuVar;
        this.f25526a = ojuVar2;
        this.f25529d = ojuVar3;
        this.f25528c = ojuVar4;
        this.f25527b = ojuVar5;
    }

    /* JADX INFO: renamed from: a */
    public static glr m9433a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 0);
    }

    /* JADX INFO: renamed from: b */
    public static glr m9434b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static glr m9435c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static glr m9436d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static glr m9437e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static glr m9438f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new glr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 5, (boolean[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object gmpVar;
        boolean z = false;
        switch (this.f25531f) {
            case 0:
                jwn jwnVar = (jwn) this.f25526a.get();
                jwn jwnVar2 = (jwn) this.f25527b.get();
                Map map = (Map) this.f25528c.get();
                jvb jvbVar = (jvb) this.f25529d.get();
                dhv dhvVar = (dhv) this.f25530e.get();
                kgg kggVar = (kgg) map.get(gnf.f25701c);
                kgg kggVar2 = (kgg) map.get(gnf.RAW_WIDE_UPPER);
                kgg kggVar3 = (kgg) map.get(gnf.RAW_WIDE_ZOOM);
                kgg kggVar4 = (kgg) map.get(gnf.RAW_WIDE_ZOOM_UPPER);
                if (dhvVar.mo6184l(dht.f11186n) && kggVar != null && kggVar2 != null && kggVar3 != null && kggVar4 != null) {
                    String str = kggVar.mo14193c().f36540a;
                    String str2 = kggVar4.mo14193c().f36540a;
                    final float fFloatValue = ((Float) dhvVar.mo6180h(dht.f11193u).orElse(Float.valueOf(2.45f))).floatValue();
                    final float fFloatValue2 = ((Float) dhvVar.mo6180h(dht.f11194v).orElse(Float.valueOf(4.9f))).floatValue();
                    final jwf jwfVar = new jwf(false);
                    jvbVar.m13537d(jwnVar2.mo3830a(new kbg() { // from class: glp
                        @Override // p000.kbg
                        /* JADX INFO: renamed from: bf */
                        public final void mo3415bf(Object obj) {
                            jwf jwfVar2 = jwfVar;
                            float f = fFloatValue;
                            float f2 = fFloatValue2;
                            Float f3 = (Float) obj;
                            boolean z2 = false;
                            if (f3.floatValue() >= f && f3.floatValue() <= f2) {
                                z2 = true;
                            }
                            jwfVar2.mo3415bf(Boolean.valueOf(z2));
                        }
                    }, not.INSTANCE));
                    jwf jwfVar2 = new jwf((String) jwnVar.mo3831be());
                    jvbVar.m13537d(jwr.m13632b(jwnVar, jwj.m13624c(jwfVar)).mo3830a(new glh(str, str2, jwnVar2, jwfVar2, 2), not.INSTANCE));
                    jwnVar = jwfVar2;
                }
                jwnVar.getClass();
                return jwnVar;
            case 1:
                kpa kpaVar = (kpa) this.f25530e.get();
                jwf jwfVar3 = (jwf) this.f25526a.get();
                Executor executor = (Executor) this.f25529d.get();
                fnj fnjVar = (fnj) this.f25528c.get();
                dhv dhvVar2 = (dhv) this.f25527b.get();
                jwfVar3.mo3415bf("");
                boolean z2 = kpaVar.f36760c;
                return mxk.m17136H(new glo(jwfVar3, fnjVar, dhvVar2.mo6184l(dil.f11637w), executor));
            case 2:
                mrm mrmVar = (mrm) this.f25527b.get();
                oju ojuVar = this.f25529d;
                mrm mrmVar2 = (mrm) this.f25528c.get();
                oju ojuVar2 = this.f25526a;
                lku.m15614I(((gck) this.f25530e).m9058b().booleanValue(), "No usable raw FrameStream present.");
                if (mrmVar.mo16813g()) {
                    gmpVar = new gmp((kho) mrmVar.mo16809c());
                } else if (mrmVar2.mo16813g()) {
                    gmpVar = new gmp((kho) mrmVar2.mo16809c());
                } else {
                    lku.m15614I(!((Map) ojuVar.get()).isEmpty(), "No physical FrameStream is present!");
                    gmpVar = ((Map) ojuVar.get()).size() == 1 ? new gmp((kho) ((Map) ojuVar.get()).values().iterator().next()) : (gmo) ojuVar2.get();
                }
                gmpVar.getClass();
                return gmpVar;
            case 3:
                Object obj = this.f25529d.get();
                kmd kmdVarM8922a = ((fxj) this.f25526a).m8922a();
                fuf fufVar = (fuf) this.f25528c.get();
                oju ojuVar3 = this.f25530e;
                int iIntValue = ((Integer) this.f25527b.get()).intValue();
                djm djmVar = (djm) obj;
                if (kmdVarM8922a.mo14544M() && kmdVarM8922a.mo14535D()) {
                    kmdVarM8922a = ((imu) ojuVar3.get()).m11491f();
                }
                kna knaVarM9591d = goy.m9591d(kmdVarM8922a, iIntValue);
                knaVarM9591d.getClass();
                int i = fufVar.f23585b;
                gmy gmyVarM6226G = djmVar.m6226G();
                gmyVarM6226G.f25660a = kmdVarM8922a.mo14556i();
                gmyVarM6226G.f25661b = knaVarM9591d;
                gmyVarM6226G.f25662c = i;
                gmyVarM6226G.f25663d = true;
                return gmyVarM6226G.m9532a();
            case 4:
                Object obj2 = this.f25530e.get();
                kmd kmdVar = (kmd) this.f25526a.get();
                fuf fufVar2 = (fuf) this.f25528c.get();
                mrm mrmVarM8495b = ((fjp) this.f25527b).m8495b();
                kpb kpbVar = (kpb) this.f25529d.get();
                djm djmVar2 = (djm) obj2;
                int i2 = fufVar2.f23585b;
                kna knaVarM9591d2 = goy.m9591d(kmdVar, 37, 38, 32);
                knaVarM9591d2.getClass();
                kmdVar.mo14556i();
                kmdVar.mo14565r();
                Long lValueOf = (Long) mrmVarM8495b.mo16811e(0L);
                if (kpbVar.f36768a) {
                    lValueOf = Long.valueOf(lValueOf.longValue() | 48);
                }
                gmy gmyVarM6226G2 = djmVar2.m6226G();
                gmyVarM6226G2.f25660a = kmdVar.mo14556i();
                gmyVarM6226G2.f25661b = knaVarM9591d2;
                gmyVarM6226G2.f25662c = i2;
                gmyVarM6226G2.f25663d = true;
                if (lValueOf.longValue() == 0) {
                    lValueOf = null;
                }
                gmyVarM6226G2.f25665f = lValueOf;
                return gmyVarM6226G2.m9532a();
            default:
                Object obj3 = this.f25530e.get();
                fvu fvuVarM8922a = ((fxj) this.f25526a).m8922a();
                fuf fufVar3 = (fuf) this.f25529d.get();
                imu imuVar = (imu) this.f25528c.get();
                mrm mrmVarM8495b2 = ((fjp) this.f25527b).m8495b();
                djm djmVar3 = (djm) obj3;
                if (fvuVarM8922a.mo14544M() && fvuVarM8922a.mo14535D()) {
                    z = true;
                }
                lku.m15669w(z);
                gmy gmyVarM6226G3 = djmVar3.m6226G();
                gmyVarM6226G3.f25662c = fufVar3.f23585b;
                kmd kmdVarM11491f = imuVar.m11491f();
                kmdVarM11491f.mo14556i();
                kmdVarM11491f.mo14565r();
                kna knaVarM9591d3 = goy.m9591d(kmdVarM11491f, 37, 38, 32);
                knaVarM9591d3.getClass();
                gmyVarM6226G3.f25660a = kmdVarM11491f.mo14556i();
                gmyVarM6226G3.f25661b = knaVarM9591d3;
                gmyVarM6226G3.f25663d = true;
                gmyVarM6226G3.f25665f = (Long) mrmVarM8495b2.mo16812f();
                return gmyVarM6226G3.m9532a();
        }
    }
}
