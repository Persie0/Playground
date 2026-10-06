package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gih implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24887a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24888b;

    public gih(oju ojuVar, int i) {
        this.f24888b = i;
        this.f24887a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static gih m9277a(oju ojuVar) {
        return new gih(ojuVar, 0);
    }

    /* JADX INFO: renamed from: b */
    public static gih m9278b(oju ojuVar) {
        return new gih(ojuVar, 1);
    }

    /* JADX INFO: renamed from: c */
    public static gih m9279c(oju ojuVar) {
        return new gih(ojuVar, 2);
    }

    /* JADX INFO: renamed from: d */
    public static gih m9280d(oju ojuVar) {
        return new gih(ojuVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static gih m9281e(oju ojuVar) {
        return new gih(ojuVar, 5);
    }

    /* JADX INFO: renamed from: f */
    public static gih m9282f(oju ojuVar) {
        return new gih(ojuVar, 8);
    }

    /* JADX INFO: renamed from: g */
    public static gih m9283g(oju ojuVar) {
        return new gih(ojuVar, 9);
    }

    /* JADX INFO: renamed from: h */
    public static gih m9284h(oju ojuVar) {
        return new gih(ojuVar, 10);
    }

    /* JADX INFO: renamed from: i */
    public static gih m9285i(oju ojuVar) {
        return new gih(ojuVar, 11);
    }

    /* JADX INFO: renamed from: j */
    public static gih m9286j(oju ojuVar) {
        return new gih(ojuVar, 13);
    }

    /* JADX INFO: renamed from: k */
    public static gih m9287k(oju ojuVar) {
        return new gih(ojuVar, 14);
    }

    /* JADX INFO: renamed from: l */
    public static gih m9288l(oju ojuVar) {
        return new gih(ojuVar, 15);
    }

    /* JADX INFO: renamed from: m */
    public static gih m9289m(oju ojuVar) {
        return new gih(ojuVar, 16);
    }

    /* JADX INFO: renamed from: n */
    public static gih m9290n(oju ojuVar) {
        return new gih(ojuVar, 17);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        switch (this.f24888b) {
            case 0:
                return new bkn((ggs) this.f24887a.get());
            case 1:
                ((dnf) this.f24887a.get()).m6429b();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 2:
                jwn jwnVar = (jwn) this.f24887a.get();
                jwnVar.getClass();
                return jwnVar;
            case 3:
                return new bkn((dhv) this.f24887a.get());
            case 4:
                Iterator it = ((fxk) this.f24887a).get().mo14532A().iterator();
                while (it.hasNext()) {
                    if (((CaptureRequest.Key) it.next()).getName().equals(fvv.f23718b.getName())) {
                        objM17136H = mxk.m17136H(fxo.m8928b(fvv.f23718b, 1));
                        objM17136H.getClass();
                        return objM17136H;
                    }
                }
                objM17136H = mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 5:
                jvb jvbVar = (jvb) this.f24887a.get();
                fxs fxsVar = new fxs(1);
                jvbVar.m13537d(fxsVar);
                return new kya(fxsVar, jzn.m13824l("ActiveCamera"), 1);
            case 6:
                dhv dhvVar = (dhv) this.f24887a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6177e();
                return 35;
            case 7:
                return mrm.m16829i(new AmbientModeSupport.AmbientController((jwn) this.f24887a.get()));
            case 8:
                HashMap map = new HashMap((Map) this.f24887a.get());
                map.remove(gnf.PD);
                return new gva(map);
            case 9:
                return new gmz();
            case 10:
                return new gva((Map) this.f24887a.get());
            case 11:
                mrm mrmVar = (mrm) this.f24887a.get();
                return mrmVar.mo16813g() ? (mrm) mrmVar.mo16809c() : mqu.f41450a;
            case 12:
                mrm mrmVar2 = (mrm) this.f24887a.get();
                lku.m15669w(mrmVar2.mo16813g());
                return mrm.m16829i((kgg) mrmVar2.mo16809c());
            case 13:
                Set set = ((ohm) this.f24887a).get();
                mxi mxiVarM17132D = mxk.m17132D();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    mxiVarM17132D.m17129h(gmz.m9534b((fxi) it2.next()));
                }
                mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 14:
                return new HashSet(((Map) this.f24887a.get()).values());
            case 15:
                jwl jwlVar = (jwl) this.f24887a.get();
                jwf jwfVar = new jwf(false);
                jwlVar.m13626b(new gne(jwfVar, 0));
                return jwfVar;
            case 16:
                jwl jwlVar2 = (jwl) this.f24887a.get();
                jvb jvbVar2 = new jvb();
                jwlVar2.m13626b(new gne(jvbVar2, 1));
                return jvbVar2;
            default:
                jwl jwlVar3 = (jwl) this.f24887a.get();
                jwlVar3.getClass();
                return new eam(jwlVar3, 5, null);
        }
    }
}
