package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f15052a;

    /* JADX INFO: renamed from: b */
    private final oju f15053b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f15054c;

    public epv(oju ojuVar, oju ojuVar2, int i) {
        this.f15054c = i;
        this.f15052a = ojuVar;
        this.f15053b = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    public epv(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f15054c = i;
        this.f15053b = ojuVar;
        this.f15052a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static epv m7648a(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 12);
    }

    /* JADX INFO: renamed from: b */
    public static epv m7649b(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 13);
    }

    /* JADX INFO: renamed from: c */
    public static epv m7650c(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 14);
    }

    /* JADX INFO: renamed from: d */
    public static epv m7651d(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 15);
    }

    /* JADX INFO: renamed from: e */
    public static epv m7652e(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 17, (char[][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static epv m7653f(oju ojuVar, oju ojuVar2) {
        return new epv(ojuVar, ojuVar2, 18);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f15054c) {
            case 0:
                return new iax((dhv) this.f15052a.get(), ((dws) this.f15053b).m6830a());
            case 1:
                Object objM17136H = ((dhv) this.f15053b.get()).mo6184l(dik.f11607e) ? mxk.m17136H((ech) this.f15052a.get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 2:
                return ((dhv) this.f15053b.get()).mo6184l(dik.f11607e) ? ((etl) this.f15052a).m7866a() : mqu.f41450a;
            case 3:
                return ((dhv) this.f15053b.get()).mo6184l(dik.f11608f) ? ((etl) this.f15052a).m7866a() : mqu.f41450a;
            case 4:
                Map map = ((ohk) this.f15053b).get();
                kbz kbzVar = (kbz) this.f15052a.get();
                kbzVar.mo13961e("ModuleManager#provide");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    if (((mrm) entry.getValue()).mo16813g()) {
                        arrayList.add((gtd) ((mrm) entry.getValue()).mo16809c());
                    }
                }
                bkn bknVar = new bkn(arrayList, ikw.PHOTO);
                kbzVar.mo13962f();
                return bknVar;
            case 5:
                return new ets((glk) this.f15052a.get(), (fvs) this.f15053b.get(), 2, null, null, null);
            case 6:
                return new ets((glk) this.f15052a.get(), (fvs) this.f15053b.get(), 0, null, null, null);
            case 7:
                dhv dhvVar = (dhv) this.f15053b.get();
                kbz kbzVar2 = (kbz) this.f15052a.get();
                kbzVar2.mo13961e("OneFeatureConfig#provide");
                fuf fufVar = new fuf(((Integer) dhvVar.mo6173a(dil.f11618d).get()).intValue(), ((Integer) dhvVar.mo6173a(dil.f11616b).get()).intValue());
                kbzVar2.mo13962f();
                return fufVar;
            case 8:
                return new kcf(kxk.m14956B((Executor) this.f15053b.get()), (kbz) this.f15052a.get(), "OneCameraCreator");
            case 9:
                ((cde) this.f15053b).m3490a().booleanValue();
                ohh.m18485a(this.f15052a);
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 10:
                Application application = ((emi) this.f15053b).get();
                dhv dhvVar2 = (dhv) this.f15052a.get();
                ActivityManager activityManager = (ActivityManager) application.getSystemService(ActivityManager.class);
                if (activityManager == null) {
                    return new knx(134217728L);
                }
                int iIntValue = ((Integer) dhvVar2.mo6173a(dib.f11372n).get()).intValue();
                if (iIntValue > 0) {
                    return new knx(((long) iIntValue) * 1048576);
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return new knx(Math.max(134217728L, (memoryInfo.totalMem - (memoryInfo.threshold + 805306368)) / 3));
            case 11:
                dhv dhvVar3 = (dhv) this.f15052a.get();
                return new lbn(dhvVar3);
            case 12:
                return new fie((fgy) this.f15052a.get(), (mrm) this.f15053b.get());
            case 13:
                return !((mrm) this.f15053b.get()).mo16813g() ? mqu.f41450a : mrm.m16829i((fhh) this.f15052a.get());
            case 14:
                mrm mrmVarM8495b = ((fjp) this.f15052a).m8495b();
                mrm mrmVarM8495b2 = ((fjp) this.f15053b).m8495b();
                return (mrmVarM8495b.mo16813g() && mrmVarM8495b2.mo16813g()) ? new ffe((kgg) mrmVarM8495b.mo16809c(), (kfc) mrmVarM8495b2.mo16809c()) : new fgl();
            case 15:
                dhv dhvVar4 = (dhv) this.f15052a.get();
                MediaFormat mediaFormat = ((fjt) this.f15053b).get();
                return dhvVar4.mo6184l(dii.f11545u) ? new fhn(mediaFormat) : new fin(mediaFormat);
            case 16:
                oju ojuVar = this.f15052a;
                dhv dhvVar5 = (dhv) this.f15053b.get();
                HashSet hashSet = new HashSet();
                dhx dhxVar = dii.f11525a;
                dhvVar5.mo6175c();
                if (dhvVar5.mo6184l(dii.f11549y)) {
                    hashSet.add((hjk) ojuVar.get());
                }
                return hashSet;
            case 17:
                return ((mrm) this.f15052a.get()).mo16808b(new etx((kfk) this.f15053b.get(), 3));
            case 18:
                return new C1058va((eat) this.f15052a.get(), (kbc) this.f15053b.get());
            case 19:
                return ((dhv) this.f15053b.get()).mo6183k(dii.f11531g) ? mrm.m16829i((drj) this.f15052a.get()) : mqu.f41450a;
            default:
                return new jpd();
        }
    }
}
