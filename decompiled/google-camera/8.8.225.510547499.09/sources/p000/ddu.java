package p000;

import android.location.Location;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ddu implements mrf {

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f10604u;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ ddu f10603t = new ddu(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ ddu f10602s = new ddu(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ ddu f10601r = new ddu(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ ddu f10600q = new ddu(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ ddu f10599p = new ddu(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ ddu f10598o = new ddu(15);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ ddu f10597n = new ddu(14);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ ddu f10596m = new ddu(13);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ ddu f10595l = new ddu(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ ddu f10594k = new ddu(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ ddu f10593j = new ddu(10);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ ddu f10592i = new ddu(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ddu f10591h = new ddu(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ddu f10590g = new ddu(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ddu f10589f = new ddu(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ddu f10588e = new ddu(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ddu f10587d = new ddu(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ddu f10586c = new ddu(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ddu f10585b = new ddu(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ddu f10584a = new ddu(0);

    public /* synthetic */ ddu(int i) {
        this.f10604u = i;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        gzk gzkVar;
        int i;
        switch (this.f10604u) {
            case 0:
                return false;
            case 1:
                return Boolean.valueOf(((hzw) obj).f30099a);
            case 2:
                return ((mfo) obj).f40371a;
            case 3:
                return Boolean.valueOf(gyw.LONG_SHOT.equals(((gyh) obj).mo9903i()));
            case 4:
                return jbx.m12872q(2) == ((Integer) obj).intValue() ? gfc.MAKEUP_ON : gfc.MAKEUP_OFF;
            case 5:
                return Integer.valueOf(gfc.MAKEUP_ON.equals((gfc) obj) ? jbx.m12872q(2) : jbx.m12872q(1));
            case 6:
                ((nbe) ((nbe) ((nbe) dwc.f12703a.m17252c()).mo17283h((CancellationException) obj)).mo17276G(1154)).mo17290o("Photos launch was cancelled");
                return Boolean.FALSE;
            case 7:
                return ((cwd) obj).f9866a;
            case 8:
                return ((cwd) obj).f9866a;
            case 9:
                List list = (List) obj;
                Boolean bool = (Boolean) list.get(0);
                if (!((Boolean) list.get(1)).booleanValue()) {
                    ((nbe) ((nbe) efk.f13832a.m17252c().mo17282g(nch.f41987a, "FalconModule")).mo17276G((char) 1380)).mo17290o("Turning off due to thermals.");
                    return 2;
                }
                bool.booleanValue();
                nbz nbzVar = nch.f41987a;
                return 1;
            case 10:
                return ((cwd) obj).f9866a;
            case 11:
                List list2 = (List) obj;
                boolean zBooleanValue = ((Boolean) list2.get(0)).booleanValue();
                if (((Boolean) list2.get(1)).booleanValue()) {
                    return egl.ZOOM;
                }
                return zBooleanValue ? egl.DEBLUR : egl.NONE;
            case 12:
                return (efx) obj;
            case 13:
                return ((Boolean) obj).booleanValue() ? gfc.IMAX_AUDIO_ON : gfc.IMAX_AUDIO_OFF;
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() - 2);
            case 15:
                return true;
            case 16:
                return ckb.f5960c;
            case 17:
                int iIntValue = ((Integer) obj).intValue();
                gzk gzkVar2 = gzk.ON;
                gfc gfcVar = gfc.UNKNOWN;
                switch (gzk.m10013a(iIntValue).ordinal()) {
                    case 1:
                    default:
                        return gfc.AF_ON;
                    case 2:
                        return gfc.AF_OFF_NEAR;
                    case 3:
                        return gfc.AF_OFF_FAR;
                    case 4:
                        return gfc.AF_OFF_INFINITY;
                }
            case 18:
                gzk gzkVar3 = gzk.ON;
                gfc gfcVar2 = gfc.UNKNOWN;
                switch (((gfc) obj).ordinal()) {
                    case 53:
                        gzkVar = gzk.ON_LOCKED;
                        i = gzkVar.f26932f;
                        break;
                    case 54:
                        gzkVar = gzk.OFF_NEAR;
                        i = gzkVar.f26932f;
                        break;
                    case 55:
                        gzkVar = gzk.OFF_FAR;
                        i = gzkVar.f26932f;
                        break;
                    case 56:
                        gzkVar = gzk.OFF_INFINITY;
                        i = gzkVar.f26932f;
                        break;
                    default:
                        i = gzk.ON.f26932f;
                        break;
                }
                return Integer.valueOf(i);
            case 19:
                return Boolean.valueOf(((gyh) obj).mo9903i().equals(gyw.LONG_SHOT));
            default:
                return (Location) ((mrm) obj).mo16812f();
        }
    }
}
