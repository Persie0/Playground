package p000;

import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13840a;

    /* JADX INFO: renamed from: b */
    private final oju f13841b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f13842c;

    public efo(oju ojuVar, oju ojuVar2, int i) {
        this.f13842c = i;
        this.f13840a = ojuVar;
        this.f13841b = ojuVar2;
    }

    public efo(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f13842c = i;
        this.f13841b = ojuVar;
        this.f13840a = ojuVar2;
    }

    public efo(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f13842c = i;
        this.f13841b = ojuVar;
        this.f13840a = ojuVar2;
    }

    public efo(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f13842c = i;
        this.f13841b = ojuVar;
        this.f13840a = ojuVar2;
    }

    public efo(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f13842c = i;
        this.f13841b = ojuVar;
        this.f13840a = ojuVar2;
    }

    public efo(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f13842c = i;
        this.f13841b = ojuVar;
        this.f13840a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static efo m7272a(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 0);
    }

    /* JADX INFO: renamed from: b */
    public static efo m7273b(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 1);
    }

    /* JADX INFO: renamed from: c */
    public static efo m7274c(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 2);
    }

    /* JADX INFO: renamed from: d */
    public static efo m7275d(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 4);
    }

    /* JADX INFO: renamed from: e */
    public static efo m7276e(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 7);
    }

    /* JADX INFO: renamed from: f */
    public static efo m7277f(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 8);
    }

    /* JADX INFO: renamed from: g */
    public static efo m7278g(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 9, (byte[]) null);
    }

    /* JADX INFO: renamed from: h */
    public static efo m7279h(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 10, (char[]) null);
    }

    /* JADX INFO: renamed from: i */
    public static efo m7280i(oju ojuVar, oju ojuVar2) {
        return new efo(ojuVar, ojuVar2, 11);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        dic dicVar;
        int[] iArr;
        jwn jwnVarM13637g;
        final float f;
        CaptureRequest.Key key;
        switch (this.f13842c) {
            case 0:
                kfv kfvVar = ((egx) this.f13840a).m7318b().booleanValue() ? (kfv) this.f13841b.get() : kfi.f35818a;
                kfvVar.getClass();
                return kfvVar;
            case 1:
                return (((egx) this.f13840a).m7318b().booleanValue() && ivw.f32428n != null && ((dhv) this.f13841b.get()).mo6184l(dht.f11183k)) ? fxo.m8928b(ivw.f32428n, true) : fxo.m8931e();
            case 2:
                Object objM17136H = ((dhv) this.f13841b.get()).mo6173a(did.f11416a).isPresent() ? mxk.m17136H((ech) this.f13840a.get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 3:
                dhv dhvVar = (dhv) this.f13840a.get();
                ((dna) this.f13841b).get();
                try {
                    dicVar = (dic) dhvVar.mo6173a(did.f11416a).map(cqk.f8930q).orElseThrow();
                    break;
                } catch (RuntimeException e) {
                    ((nbe) ((nbe) ega.f13909a.m17252c()).mo17276G((char) 1421)).mo17293r("In getFlagValue caught %s", e);
                    dicVar = dic.OFF;
                }
                return (dicVar == dic.OFF || !fdh.m8268h()) ? new egb() : new efz(dhvVar);
            case 4:
                jwn jwnVarM13640j = jwr.m13640j(jwr.m13632b((jwn) this.f13840a.get(), ((egw) this.f13841b).get()), ddu.f10594k);
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 5:
                return new kcf(kxk.m14956B((Executor) this.f13840a.get()), (kbz) this.f13841b.get(), "FusionZoomProcess");
            case 6:
                return ((dhv) this.f13841b.get()).mo6184l(dht.f11186n) ? mrm.m16829i((egk) this.f13840a.get()) : mqu.f41450a;
            case 7:
                return ((Boolean) ((jww) this.f13841b.get()).mo3831be()).booleanValue() ? mrm.m16829i(((fyj) this.f13840a).get()) : mqu.f41450a;
            case 8:
                jwn jwnVarM13637g2 = (!((dhv) this.f13840a.get()).mo6184l(did.f11414Y) || ivu.f32382j == null) ? jwr.m13637g(fxo.m8931e()) : fxo.m8932f(ivu.f32382j, (jwn) this.f13841b.get());
                jwnVarM13637g2.getClass();
                return jwnVarM13637g2;
            case 9:
                oju ojuVar = this.f13841b;
                kmd kmdVar = ((fxk) this.f13840a).get();
                Integer num = null;
                if (ivu.f32376d != null) {
                    try {
                        iArr = (int[]) kmdVar.mo14559l(ivu.f32376d);
                    } catch (IllegalArgumentException e2) {
                        e2.getMessage();
                        iArr = null;
                    }
                    if (iArr != null) {
                        for (int i : iArr) {
                            if (i == 1) {
                                num = 1;
                            }
                        }
                    }
                    break;
                }
                jwn jwnVarM8932f = num != null ? fxo.m8932f(ivu.f32377e, (jwn) ojuVar.get()) : jwr.m13637g(fxo.m8931e());
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 10:
                oju ojuVar2 = this.f13841b;
                dhv dhvVar2 = (dhv) this.f13840a.get();
                if (ivw.f32422h != null) {
                    if (dhvVar2.mo6184l(did.f11407R)) {
                        dhvVar2.mo6175c();
                        f = 1.5f;
                    } else {
                        dhvVar2.mo6175c();
                        f = 1.2f;
                    }
                    jwnVarM13637g = fxo.m8932f(ivw.f32422h, jwr.m13640j((jwn) ojuVar2.get(), new mrf() { // from class: ehe
                        @Override // p000.mrf
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(((Float) obj).floatValue() >= f);
                        }
                    }));
                } else {
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                }
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            case 11:
                ebq ebqVar = (ebq) this.f13840a.get();
                edk edkVar = (edk) this.f13841b.get();
                mxi mxiVarM17132D = mxk.m17132D();
                if (ebqVar.m7074f(edkVar) && (key = ivt.f32365s) != null) {
                    mxiVarM17132D.mo17072d(kgq.m14215e(key, true));
                }
                mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 12:
                return new ekd(((kak) this.f13840a).get(), (dhv) this.f13841b.get());
            case 13:
                return new eib(mws.m17098m((eks) this.f13840a.get(), (eiw) this.f13841b.get()));
            case 14:
                Context contextM6830a = ((dws) this.f13840a).m6830a();
                ekd ekdVar = (ekd) this.f13841b.get();
                SensorManager sensorManager = (SensorManager) contextM6830a.getSystemService("sensor");
                lku.m15662p(sensorManager);
                return new ekt(sensorManager, ekdVar.f14454b.mo14553f());
            case 15:
                return new eno((jvd) this.f13841b.get(), (jww) this.f13840a.get());
            case 16:
                return new ens(((ema) this.f13840a).get(), gtd.m9735q(), ((Integer) ((dhv) this.f13841b.get()).mo6173a(dib.f11370l).get()).intValue());
            case 17:
                dhv dhvVar3 = (dhv) this.f13840a.get();
                Object obj = (dhvVar3.mo6184l(dib.f11248aH) && dhvVar3.mo6184l(dib.f11249aI)) ? (hjk) ohh.m18485a(this.f13841b).get() : cdw.f5365f;
                obj.getClass();
                return obj;
            case 18:
                return new gtd((dhv) this.f13840a.get(), ((emu) this.f13841b).get());
            case 19:
                return new gtd(((dws) this.f13841b).m6830a(), (gtd) this.f13840a.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            default:
                return new hjl(((emi) this.f13841b).get(), (ent) this.f13840a.get(), 1);
        }
    }
}
