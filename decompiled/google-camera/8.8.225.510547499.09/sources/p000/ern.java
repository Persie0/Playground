package p000;

import android.app.Activity;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ern implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f15252a;

    /* JADX INFO: renamed from: b */
    private final Object f15253b;

    public ern(cwd cwdVar, int i, byte[] bArr, byte[] bArr2) {
        this.f15252a = i;
        this.f15253b = cwdVar;
    }

    public ern(cwd cwdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f15252a = i;
        this.f15253b = cwdVar;
    }

    public ern(oju ojuVar, int i) {
        this.f15252a = i;
        this.f15253b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static ern m7733a(oju ojuVar) {
        return new ern(ojuVar, 13);
    }

    /* JADX INFO: renamed from: b */
    public static ern m7734b(oju ojuVar) {
        return new ern(ojuVar, 14);
    }

    /* JADX INFO: renamed from: c */
    public static ern m7735c(oju ojuVar) {
        return new ern(ojuVar, 15);
    }

    /* JADX INFO: renamed from: d */
    public static ern m7736d(oju ojuVar) {
        return new ern(ojuVar, 20);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v69, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhv, java.lang.Object] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        boolean z = false;
        switch (this.f15252a) {
            case 0:
                return new erm((oju) this.f15253b, 0);
            case 1:
                return new jwf(eqz.m7711a(((Integer) ((dhv) this.f15253b.get()).mo6173a(dik.f11606d).get()).intValue()));
            case 2:
                return new cwd(ohh.m18485a(this.f15253b));
            case 3:
                hku hkuVar = ((esl) this.f15253b.get()).f15415s;
                hkuVar.getClass();
                return hkuVar;
            case 4:
                return new evq((gps) this.f15253b.get());
            case 5:
                return (chw) ((fjp) this.f15253b).m8495b().mo16809c();
            case 6:
                return ((cwd) this.f15253b).f9866a;
            case 7:
                Object obj = ((cwd) this.f15253b).f9866a;
                Object fbaVar = obj instanceof ero ? ((ero) obj).f21197x : new fba();
                fbaVar.getClass();
                return fbaVar;
            case 8:
                Activity activity = (Activity) ((cwd) this.f15253b).f9866a;
                activity.getClass();
                return activity;
            case 9:
                Object obj2 = ((cwd) this.f15253b).f9866a;
                Object fbaVar2 = obj2 instanceof ero ? ((ero) obj2).f21197x : new fba();
                fbaVar2.getClass();
                return fbaVar2;
            case 10:
                glk glkVar = (glk) this.f15253b.get();
                glkVar.getClass();
                return glkVar;
            case 11:
                return new fci(((dws) this.f15253b).m6830a());
            case 12:
                return new feq((lbn) this.f15253b.get(), new jvd(), null);
            case 13:
                return new bkn(((crv) this.f15253b).m5442a(), (byte[]) null);
            case 14:
                mrm mrmVar = (mrm) this.f15253b.get();
                Object objM17136H = !mrmVar.mo16813g() ? mzx.f41874a : mxk.m17136H(new fjs((fhq) mrmVar.mo16809c(), 0));
                objM17136H.getClass();
                return objM17136H;
            case 15:
                dsx dsxVar = ((dms) this.f15253b).get();
                if (dsxVar.f12521a.mo6184l(dii.f11535k) || dsxVar.f12521a.mo6184l(dii.f11542r)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                ExecutorService executorServiceM13824l = jzn.m13824l("mv-gyro-exec");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 17:
                return Boolean.valueOf(((dms) this.f15253b).get().m6692g());
            case 18:
                ExecutorService executorServiceM13823k = jzn.m13823k("mv-writer", 4);
                executorServiceM13823k.getClass();
                return executorServiceM13823k;
            case 19:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("mv-ctrl-exec");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
            default:
                ((dms) this.f15253b).get().m6696k();
                return false;
        }
    }
}
