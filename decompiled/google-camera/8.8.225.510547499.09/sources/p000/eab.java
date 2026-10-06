package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.googlex.gcam.Gcam;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eab implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f13036a;

    /* JADX INFO: renamed from: b */
    private final Object f13037b;

    public eab(cwd cwdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13036a = i;
        this.f13037b = cwdVar;
    }

    public eab(oju ojuVar, int i) {
        this.f13036a = i;
        this.f13037b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static eab m6979a(oju ojuVar) {
        return new eab(ojuVar, 3);
    }

    /* JADX INFO: renamed from: b */
    public static eab m6980b(oju ojuVar) {
        return new eab(ojuVar, 4);
    }

    /* JADX INFO: renamed from: c */
    public static eab m6981c(oju ojuVar) {
        return new eab(ojuVar, 7);
    }

    /* JADX INFO: renamed from: d */
    public static eab m6982d(oju ojuVar) {
        return new eab(ojuVar, 10);
    }

    /* JADX INFO: renamed from: e */
    public static eab m6983e(oju ojuVar) {
        return new eab(ojuVar, 11);
    }

    /* JADX INFO: renamed from: f */
    public static eab m6984f(oju ojuVar) {
        return new eab(ojuVar, 12);
    }

    /* JADX INFO: renamed from: g */
    public static eab m6985g(oju ojuVar) {
        return new eab(ojuVar, 13);
    }

    /* JADX INFO: renamed from: h */
    public static eab m6986h(oju ojuVar) {
        return new eab(ojuVar, 14);
    }

    /* JADX INFO: renamed from: i */
    public static eab m6987i(oju ojuVar) {
        return new eab(ojuVar, 15);
    }

    /* JADX INFO: renamed from: j */
    public static eab m6988j(oju ojuVar) {
        return new eab(ojuVar, 16);
    }

    /* JADX INFO: renamed from: k */
    public static eab m6989k(oju ojuVar) {
        return new eab(ojuVar, 18);
    }

    /* JADX INFO: renamed from: l */
    public static eab m6990l(oju ojuVar) {
        return new eab(ojuVar, 19);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        final byte[] bArr = null;
        switch (this.f13036a) {
            case 0:
                dhv dhvVar = (dhv) this.f13037b.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                return mqu.f41450a;
            case 1:
                return !((dhv) this.f13037b.get()).mo6184l(dhs.f11167e) ? mqu.f41450a : mrm.m16829i(jzn.m13824l("ff-analysis"));
            case 2:
                return new bko((dhv) this.f13037b.get(), (byte[]) null);
            case 3:
                enj enjVar = (enj) this.f13037b.get();
                enjVar.getClass();
                return new fjs(enjVar, 1);
            case 4:
                enj enjVar2 = (enj) this.f13037b.get();
                enjVar2.getClass();
                return mxk.m17136H(new eam(enjVar2, 0));
            case 5:
                return new bko((ebv) this.f13037b.get());
            case 6:
                return new ebq((dhv) this.f13037b.get());
            case 7:
                jvb jvbVar = (jvb) this.f13037b.get();
                HandlerThread handlerThread = new HandlerThread("lastPslFrame");
                handlerThread.start();
                Handler handlerM13557e = jvh.m13557e(handlerThread.getLooper());
                Looper looper = handlerM13557e.getLooper();
                looper.getClass();
                jvbVar.m13537d(new eds(looper, 1));
                return handlerM13557e;
            case 8:
                bko bkoVar = (bko) enc.m7545a(this.f13037b);
                bkoVar.getClass();
                return bkoVar;
            case 9:
                Gcam gcam = (Gcam) enc.m7545a(this.f13037b);
                gcam.getClass();
                return gcam;
            case 10:
                return kfi.m14106a((edm) this.f13037b.get());
            case 11:
                return new edm((fwc) this.f13037b.get());
            case 12:
                return new gdw(((ebt) this.f13037b).get(), null, null, null);
            case 13:
                jwn jwnVarM13624c = jwj.m13624c((jwf) this.f13037b.get());
                jwnVarM13624c.getClass();
                return jwnVarM13624c;
            case 14:
                Set set = ((fxi) ((efm) this.f13037b).m7271b().mo3831be()).f23797a;
                set.getClass();
                return set;
            case 15:
                jwn jwnVarM13624c2 = jwj.m13624c((jwf) this.f13037b.get());
                jwnVarM13624c2.getClass();
                return jwnVarM13624c2;
            case 16:
                final gva gvaVar = (gva) this.f13037b.get();
                return new gol(bArr) { // from class: efj
                    @Override // p000.gol
                    /* JADX INFO: renamed from: a */
                    public final boolean mo7269a(key keyVar) {
                        return this.f13831a.m9784a(keyVar).m9493b() != null;
                    }
                };
            case 17:
                return (egc) ((mrq) ((etl) this.f13037b).m7866a()).f41482a;
            case 18:
                final Set set2 = (Set) this.f13037b.get();
                return new egy() { // from class: egz
                    @Override // p000.egy
                    /* JADX INFO: renamed from: a */
                    public final String mo7312a(String str) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            str = ((egy) it.next()).mo7312a(str);
                        }
                        return str;
                    }
                };
            case 19:
                nqf nqfVar = (nqf) this.f13037b.get();
                jwf jwfVar = new jwf(jwr.m13637g(false));
                kxk.m14975U(nqfVar, new jwq(jwfVar, 0), not.INSTANCE);
                jwn jwnVarM13623c = jwh.m13623c(jwfVar);
                jwnVarM13623c.getClass();
                return jwnVarM13623c;
            default:
                return ((cwd) this.f13037b).f9866a;
        }
    }
}
