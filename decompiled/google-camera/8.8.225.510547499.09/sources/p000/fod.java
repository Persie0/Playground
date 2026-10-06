package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.BurstSpec;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fod implements mrf {

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f22916u;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ fod f22915t = new fod(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ fod f22914s = new fod(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ fod f22913r = new fod(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ fod f22912q = new fod(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ fod f22911p = new fod(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ fod f22910o = new fod(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ fod f22909n = new fod(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ fod f22908m = new fod(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ fod f22907l = new fod(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ fod f22906k = new fod(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ fod f22905j = new fod(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ fod f22904i = new fod(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ fod f22903h = new fod(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ fod f22902g = new fod(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fod f22901f = new fod(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fod f22900e = new fod(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fod f22899d = new fod(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fod f22898c = new fod(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fod f22897b = new fod(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ fod f22896a = new fod(0);

    public /* synthetic */ fod(int i) {
        this.f22916u = i;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        byte b = 2;
        boolean z = false;
        switch (this.f22916u) {
            case 0:
                return true;
            case 1:
                return mrm.m16829i((obp) obj);
            case 2:
                return ((ipq) obj).mo11593a();
            case 3:
                return ((ipq) obj).mo11593a();
            case 4:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (!zBooleanValue) {
                    b = 0;
                } else if (!zBooleanValue2) {
                    b = 1;
                }
                return Byte.valueOf(b);
            case 5:
                return ((ihw) obj).f31016a;
            case 6:
                return fxo.m8927a((kfy) obj);
            case 7:
                return ckb.f5965h;
            case 8:
                Boolean bool = (Boolean) obj;
                gdb gdbVar = gcv.f24243a;
                return bool;
            case 9:
                Boolean bool2 = (Boolean) obj;
                gdb gdbVar2 = gcv.f24243a;
                return bool2;
            case 10:
                return gzk.m10013a(((Integer) obj).intValue());
            case 11:
                gef gefVar = (gef) obj;
                return fxo.m8930d(kgq.m14215e(CaptureRequest.SCALER_CROP_REGION, gefVar.f24363a), kgq.m14215e(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(gefVar.f24365c)));
            case 12:
                nbh nbhVar = gfy.f24631a;
                return jib.m13193B(((Integer) obj).intValue()) == 1 ? gfc.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE : gfc.VIDEO_ASPECT_RATIO_THREE_BY_FOUR;
            case 13:
                nbh nbhVar2 = gfy.f24631a;
                return gfc.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE.equals((gfc) obj) ? Integer.valueOf(jib.m13192A(1)) : Integer.valueOf(jib.m13192A(2));
            case 14:
                return ((BurstSpec) obj).m4911b();
            case 15:
                return ((BurstSpec) obj).m4911b();
            case 16:
                return ((cwd) obj).f9866a;
            case 17:
                ((nbe) ((nbe) hbs.f27164a.m17252c()).mo17276G(3422)).mo17292q("waitForCamerasAllAvailable timed out after %dms", 60000L);
                return false;
            case 18:
                ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17276G(3431)).mo17291p("HAL install did not complete within %d seconds! Terminating.", 70);
                return true;
            case 19:
                List list2 = (List) obj;
                Boolean boolValueOf = Boolean.valueOf(((Serializable) list2.get(1)).equals(Integer.valueOf(jeu.m12985i(2))));
                if (((Boolean) list2.get(0)).booleanValue() && boolValueOf.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                nbh nbhVar3 = hni.f28479a;
                hnp hnpVar = hnp.OFF;
                switch (((hnp) obj).ordinal()) {
                    case 0:
                        return hni.f28480b;
                    case 1:
                    default:
                        return hni.f28481c;
                    case 2:
                        return hni.f28482d;
                }
        }
    }
}
