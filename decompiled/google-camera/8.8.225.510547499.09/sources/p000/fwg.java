package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwg implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f23743a;

    /* JADX INFO: renamed from: b */
    private final Object f23744b;

    public fwg(fws fwsVar, int i) {
        this.f23743a = i;
        this.f23744b = fwsVar;
    }

    public fwg(oju ojuVar, int i) {
        this.f23743a = i;
        this.f23744b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static fwg m8879a(oju ojuVar) {
        return new fwg(ojuVar, 0);
    }

    /* JADX INFO: renamed from: b */
    public static fwg m8880b(oju ojuVar) {
        return new fwg(ojuVar, 1);
    }

    /* JADX INFO: renamed from: c */
    public static fwg m8881c(oju ojuVar) {
        return new fwg(ojuVar, 2);
    }

    /* JADX INFO: renamed from: d */
    public static fwg m8882d(oju ojuVar) {
        return new fwg(ojuVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static fwg m8883e(oju ojuVar) {
        return new fwg(ojuVar, 7);
    }

    /* JADX INFO: renamed from: f */
    public static fwg m8884f(oju ojuVar) {
        return new fwg(ojuVar, 8);
    }

    /* JADX INFO: renamed from: g */
    public static fwg m8885g(oju ojuVar) {
        return new fwg(ojuVar, 9);
    }

    /* JADX INFO: renamed from: h */
    public static fwg m8886h(oju ojuVar) {
        return new fwg(ojuVar, 10);
    }

    /* JADX INFO: renamed from: i */
    public static fwg m8887i(oju ojuVar) {
        return new fwg(ojuVar, 11);
    }

    /* JADX INFO: renamed from: j */
    public static fwg m8888j(oju ojuVar) {
        return new fwg(ojuVar, 12);
    }

    /* JADX INFO: renamed from: k */
    public static fwg m8889k(oju ojuVar) {
        return new fwg(ojuVar, 13);
    }

    /* JADX INFO: renamed from: l */
    public static fwg m8890l(oju ojuVar) {
        return new fwg(ojuVar, 14);
    }

    /* JADX INFO: renamed from: m */
    public static fwg m8891m(oju ojuVar) {
        return new fwg(ojuVar, 15);
    }

    /* JADX INFO: renamed from: n */
    public static fwg m8892n(oju ojuVar) {
        return new fwg(ojuVar, 16);
    }

    /* JADX INFO: renamed from: o */
    public static fwg m8893o(oju ojuVar) {
        return new fwg(ojuVar, 17);
    }

    /* JADX INFO: renamed from: p */
    public static fwg m8894p(oju ojuVar) {
        return new fwg(ojuVar, 18);
    }

    /* JADX INFO: renamed from: q */
    public static fwg m8895q(oju ojuVar) {
        return new fwg(ojuVar, 19);
    }

    /* JADX INFO: renamed from: r */
    public static fwg m8896r(oju ojuVar) {
        return new fwg(ojuVar, 20);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        int i;
        switch (this.f23743a) {
            case 0:
                ((fwr) this.f23744b).get();
                return fxo.m8931e();
            case 1:
                jwn jwnVarM8932f = fxo.m8932f(CaptureRequest.JPEG_ORIENTATION, ((cen) this.f23744b).get().m3565c());
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 2:
                dhv dhvVar = (dhv) this.f23744b.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                return fxo.m8931e();
            case 3:
                jwn jwnVarM8932f2 = fxo.m8932f(CaptureRequest.STATISTICS_FACE_DETECT_MODE, ((fxd) this.f23744b).get());
                jwnVarM8932f2.getClass();
                return jwnVarM8932f2;
            case 4:
                return ((fws) this.f23744b).f23775l;
            case 5:
                return nod.m17553i(((fws) this.f23744b).f23765b, fod.f22901f, not.INSTANCE);
            case 6:
                dhv dhvVar2 = (dhv) this.f23744b.get();
                if (dhvVar2.mo6184l(dil.f11625k)) {
                    i = 4098;
                } else {
                    i = dhvVar2.mo6184l(dil.f11626l) ? 4099 : 257;
                }
                return Integer.valueOf(i);
            case 7:
                return new fxx((fyl) this.f23744b.get());
            case 8:
                ((fzj) this.f23744b).get();
                return new fzl();
            case 9:
                return new fzm(((fzj) this.f23744b).get(), 1, null, null, null, null);
            case 10:
                return new fzm(((fzj) this.f23744b).get(), 0, null, null, null);
            case 11:
                return new fzm(((fzj) this.f23744b).get(), 3, null, null, null);
            case 12:
                return new fzm(((fzj) this.f23744b).get(), 2, null, null, null);
            case 13:
                return ((fze) this.f23744b).get();
            case 14:
                return new C1058va(((fzs) this.f23744b).get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 15:
                jvb jvbVar = (jvb) this.f23744b.get();
                jvb jvbVar2 = new jvb();
                jvb jvbVarM13536c = jvbVar.m13536c();
                jvbVarM13536c.m13537d(new fep(new cjd("DelLifetime", 2000), jvbVar2, 1));
                jvbVar2.m13537d(jvbVarM13536c);
                return jvbVar2;
            case 16:
                jvb jvbVar3 = (jvb) this.f23744b.get();
                jvbVar3.getClass();
                return new eam(jvbVar3, 4);
            case 17:
                return new gaj((kbg) this.f23744b.get());
            case 18:
                return new gal((kbg) this.f23744b.get());
            case 19:
                mrm mrmVar = (mrm) this.f23744b.get();
                Object objM17136H = mrmVar.mo16813g() ? mxk.m17136H((ech) mrmVar.mo16809c()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            default:
                Object objM17136H2 = !((Map) this.f23744b.get()).isEmpty() ? mxk.m17136H(gbv.f24144a) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
        }
    }
}
