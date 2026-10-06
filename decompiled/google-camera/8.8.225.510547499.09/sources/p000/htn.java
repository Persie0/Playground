package p000;

import android.app.DownloadManager;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htn implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f29534a;

    /* JADX INFO: renamed from: b */
    private final oju f29535b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f29536c;

    public htn(oju ojuVar, oju ojuVar2, int i) {
        this.f29536c = i;
        this.f29534a = ojuVar;
        this.f29535b = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, int[][] iArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    public htn(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f29536c = i;
        this.f29535b = ojuVar;
        this.f29534a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static htn m10748a(oju ojuVar, oju ojuVar2) {
        return new htn(ojuVar, ojuVar2, 5);
    }

    /* JADX INFO: renamed from: b */
    public static htn m10749b(oju ojuVar, oju ojuVar2) {
        return new htn(ojuVar, ojuVar2, 6);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f29536c) {
            case 0:
                return cds.m3517p(((ers) this.f29535b).get()) ? new htm() : ((hti) this.f29534a).get();
            case 1:
                return new kcf(kxk.m14956B((Executor) this.f29534a.get()), (kbz) this.f29535b.get(), "IndicatorUpdate");
            case 2:
                return new htl(ohh.m18485a(this.f29534a), (hto) this.f29535b.get(), 0);
            case 3:
                return new hwa((hwo) this.f29535b.get(), (hua) this.f29534a.get());
            case 4:
                return new hxk((hah) this.f29535b.get(), (npk) this.f29534a.get(), null);
            case 5:
                return ((dhv) this.f29535b.get()).mo6184l(dib.f11357ck) ? ((etl) this.f29534a).m7866a() : mqu.f41450a;
            case 6:
                return new hyq((hst) this.f29534a.get(), (jfs) this.f29535b.get(), null, null, null);
            case 7:
                return new idl(((dws) this.f29534a).m6830a(), (elx) this.f29535b.get());
            case 8:
                return new iex(((dws) this.f29534a).m6830a(), (guk) this.f29535b.get());
            case 9:
                return new ijl((cmg) this.f29534a.get(), this.f29535b, 1);
            case 10:
                return new ijl((htb) this.f29535b.get(), this.f29534a, 0);
            case 11:
                return new ijl((hyo) this.f29535b.get(), this.f29534a, 2);
            case 12:
                return new ijl((mrm) this.f29535b.get(), this.f29534a, 3);
            case 13:
                return new ijl((dac) this.f29535b.get(), this.f29534a, 4);
            case 14:
                return new ijl((icf) this.f29535b.get(), this.f29534a, 5);
            case 15:
                return new ijl((gsh) this.f29535b.get(), this.f29534a, 6);
            case 16:
                return new ijl(((fjp) this.f29535b).m8495b(), this.f29534a, 7, null);
            case 17:
                return new ilo(((emb) this.f29535b).get(), ((ilc) this.f29534a).get(), (byte[]) null);
            case 18:
                Context contextM6830a = ((dws) this.f29534a).m6830a();
                Executor executor = (Executor) this.f29535b.get();
                Object systemService = contextM6830a.getSystemService("download");
                systemService.getClass();
                return new ihk(new ind((DownloadManager) systemService, contextM6830a, contextM6830a.getSharedPreferences("PersistSimpleDownloadManager.pref", 0)), executor);
            case 19:
                return new npk(((dws) this.f29534a).m6830a(), (dhv) this.f29535b.get());
            default:
                dhv dhvVar = (dhv) this.f29534a.get();
                ((ctc) this.f29535b).get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
        }
    }
}
