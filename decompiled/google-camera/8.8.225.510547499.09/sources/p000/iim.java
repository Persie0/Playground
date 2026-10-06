package p000;

import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iim implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f31110a;

    /* JADX INFO: renamed from: b */
    private final Object f31111b;

    public iim(iif iifVar, int i) {
        this.f31110a = i;
        this.f31111b = iifVar;
    }

    public iim(oju ojuVar, int i) {
        this.f31110a = i;
        this.f31111b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static iim m11382a(oju ojuVar) {
        return new iim(ojuVar, 13);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31110a) {
            case 0:
                return ((iig) this.f31111b).get().f31068e;
            case 1:
                return ((iif) this.f31111b).f31086b.f31066c;
            case 2:
                jww jwwVar = (jww) this.f31111b.get();
                jwwVar.getClass();
                return jwwVar;
            case 3:
                return ((hai) this.f31111b.get()).mo10030b(gzy.f27001M);
            case 4:
                return new ikf(this.f31111b);
            case 5:
                return new ijk(((ohm) this.f31111b).get());
            case 6:
                return new ijk(((ohm) this.f31111b).get());
            case 7:
                return new jwf(((ikv) this.f31111b).m11415a());
            case 8:
                jww jwwVar2 = (jww) this.f31111b.get();
                jwwVar2.getClass();
                return jwwVar2;
            case 9:
                return new jfs(((etm) this.f31111b).get());
            case 10:
                return new jfs((dhv) this.f31111b.get());
            case 11:
                dhv dhvVar = (dhv) this.f31111b.get();
                dhx dhxVar = dhh.f11074a;
                dhvVar.mo6175c();
                Object objM17136H = !dhvVar.mo6184l(dib.f11349cc) ? mzx.f41874a : mxk.m17136H(ipn.m11594a(new ipm() { // from class: ipr
                    @Override // p000.ipm
                    /* JADX INFO: renamed from: a */
                    public final ipk mo3626a(ipo ipoVar) {
                        return new ips();
                    }
                }, jwr.m13637g(true), ipl.FRAMERATE_LIMITER));
                objM17136H.getClass();
                return objM17136H;
            case 12:
                dhv dhvVar2 = (dhv) this.f31111b.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6178f();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 13:
                return new jfs((hst) this.f31111b.get());
            case 14:
                return new jwf(Float.valueOf(((Float) this.f31111b.get()).floatValue()));
            case 15:
                dhv dhvVar3 = (dhv) this.f31111b.get();
                return Float.valueOf(dhvVar3.mo6184l(dib.f11308bO) ? ((Float) dhvVar3.mo6180h(dib.f11309bP).orElse(Float.valueOf(1.0f))).floatValue() : 1.0f);
            case 16:
                return new jxu((khb) this.f31111b.get(), null);
            case 17:
                return new AmbientDelegate((kqj) this.f31111b.get(), (byte[]) null, (byte[]) null);
            case 18:
                return new juy((Handler) this.f31111b.get());
            case 19:
                mxk mxkVar = ((khc) this.f31111b).get().f35849m;
                mxkVar.getClass();
                return mxkVar;
            default:
                return new kon(((kbm) this.f31111b).get());
        }
    }
}
