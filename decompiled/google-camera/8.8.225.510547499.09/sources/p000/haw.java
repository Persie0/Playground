package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class haw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27108a;

    /* JADX INFO: renamed from: b */
    private final oju f27109b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f27110c;

    public haw(oju ojuVar, oju ojuVar2, int i) {
        this.f27110c = i;
        this.f27108a = ojuVar;
        this.f27109b = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    public haw(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f27110c = i;
        this.f27109b = ojuVar;
        this.f27108a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static haw m10052a(oju ojuVar, oju ojuVar2) {
        return new haw(ojuVar, ojuVar2, 17);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27110c) {
            case 0:
                return new cjx((jwn) this.f27108a.get(), (Executor) this.f27109b.get());
            case 1:
                dhv dhvVar = (dhv) this.f27109b.get();
                return (dhvVar.mo6184l(dib.f11337br) || dhvVar.mo6184l(dib.f11338bs)) ? ((haj) this.f27108a).get().m11349q("pref_camera_dynamic_depth_enabled_key", false) : jwv.m13644a(Boolean.FALSE);
            case 2:
                return !((dhv) this.f27109b.get()).mo6184l(dhs.f11164b) ? jwv.m13644a(false) : ((haj) this.f27108a).get().m11349q("key_ff_opt_in", false);
            case 3:
                return ((dhv) this.f27109b.get()).mo6184l(did.f11414Y) ? jwv.m13644a(false) : ((haj) this.f27108a).get().m11349q("pref_camera_hdrplus_option_available_key", false);
            case 4:
                return ((dhv) this.f27109b.get()).mo6184l(did.f11434am) ? ((haj) this.f27108a).get().m11349q("pref_camera_kepler_enabled_key", true) : jwv.m13644a(Boolean.FALSE);
            case 5:
                return ((haj) this.f27108a).get().m11350r("pref_mode_vesperad_option", ((cmv) this.f27109b).m3973a().intValue());
            case 6:
                return !((dhv) this.f27109b.get()).mo6184l(dil.f11632r) ? jwv.m13644a(Boolean.FALSE) : ((haj) this.f27108a).get().m11349q("pref_camera_raw_output_option_available_key", false);
            case 7:
                return ((haj) this.f27108a).get().m11349q("pref_camera_selfie_mirror_key", ((dhv) this.f27109b.get()).mo6184l(dib.f11321bb));
            case 8:
                Context contextM6830a = ((dws) this.f27109b).m6830a();
                return new fcm(new HashMap(), new fcl(new fcm(new elz(contextM6830a), (fcp) this.f27108a.get(), 0), TimeUnit.MILLISECONDS), 1);
            case 9:
                return new har(((haj) this.f27108a).get().m11351s("pref_video_resolution", ((gzr) this.f27109b.get()).name()));
            case 10:
                return ((dhv) this.f27109b.get()).mo6184l(diz.f11753a) ? ((haj) this.f27108a).get().m11349q("pref_chameleon_control_key", true) : jwv.m13644a(Boolean.FALSE);
            case 11:
                return new cjx((jwn) this.f27108a.get(), (Executor) this.f27109b.get());
            case 12:
                return new cjx((jwn) this.f27108a.get(), (Executor) this.f27109b.get());
            case 13:
                return ((dhv) this.f27109b.get()).mo6184l(dio.f11649F) ? mrm.m16829i((gkf) this.f27108a.get()) : mqu.f41450a;
            case 14:
                return ((dhv) this.f27109b.get()).mo6184l(did.f11401L) ? mrm.m16829i((gkf) this.f27108a.get()) : mqu.f41450a;
            case 15:
                return new djm(((dws) this.f27108a).m6830a(), ((dli) this.f27109b).get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 16:
                nps npsVar = (nps) this.f27108a.get();
                ((dms) this.f27109b).get().m6695j();
                return mxk.m17136H(new hdg(npsVar));
            case 17:
                Object obj = this.f27108a.get();
                ((dms) this.f27109b).get().m6695j();
                return mxk.m17136H(new hcs((htb) obj, null));
            case 18:
                return new hdw((htb) this.f27109b.get(), (fsz) this.f27108a.get(), null);
            case 19:
                return ((dhv) this.f27109b.get()).mo6184l(dib.f11322bc) ? ((etl) this.f27108a).m7866a() : mqu.f41450a;
            default:
                return new hhw((hht) this.f27109b.get(), (kbz) this.f27108a.get());
        }
    }
}
