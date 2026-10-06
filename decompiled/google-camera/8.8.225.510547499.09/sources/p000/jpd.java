package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.WorkSource;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Display;
import android.view.View;
import com.google.android.gms.location.LocationRequest;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpd {
    public jpd() {
    }

    public jpd(dhv dhvVar) {
        dhw dhwVar = diy.f11744a;
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13420a(int i, jon jonVar, String str, AtomicBoolean atomicBoolean, long j) {
        if (i <= 0) {
            Log.w(voNZjxiJou.AVdWORN, "No more attempts remaining, giving up for ".concat(str));
            return false;
        }
        job jobVarM13421b = m13421b(str, jonVar, j);
        if (jobVarM13421b == null) {
            if (!atomicBoolean.get() || i <= 1) {
                return false;
            }
            return m13420a(i - 1, jonVar, str, atomicBoolean, j);
        }
        String str2 = jobVarM13421b.f34441a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                jvh.m13567o(jonVar.m13409a(jobVarM13421b.f34441a), j, TimeUnit.MILLISECONDS);
                Uri uriM15821a = lph.m15821a(str);
                Map map = loz.f38869a;
                synchronized (loz.class) {
                    loz lozVar = (loz) loz.f38869a.get(uriM15821a);
                    if (lozVar != null) {
                        lozVar.m15795b();
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + str + " failed, retrying", e);
                return m13420a(i - 1, jonVar, str, atomicBoolean, j);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    protected static final job m13421b(String str, jon jonVar, long j) {
        try {
            return (job) jvh.m13567o(jonVar.m13410b(str, ""), j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + str + " failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13422c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m13423d(int i) {
        switch (i) {
            case 100:
                return "HIGH_ACCURACY";
            case 101:
            case 103:
            default:
                throw new IllegalArgumentException();
            case 102:
                return "BALANCED_POWER_ACCURACY";
            case 104:
                return "LOW_POWER";
            case 105:
                return "PASSIVE";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m13425f(int i) {
        switch (i) {
            case 0:
                return "GRANULARITY_PERMISSION_LEVEL";
            case 1:
                return "GRANULARITY_COARSE";
            case 2:
                return "GRANULARITY_FINE";
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final idb m13426g(boolean z, int i, View.OnClickListener onClickListener, ida idaVar, String str, Context context, boolean z2, int i2, int i3) {
        str.getClass();
        context.getClass();
        boolean z3 = true;
        if (i2 != -1 && i2 <= 0) {
            z3 = false;
        }
        lku.m15669w(z3);
        return new idc(context, str, i, i3, z, onClickListener, idaVar, z2, i2);
    }

    /* JADX INFO: renamed from: h */
    public static msi m13427h(AtomicReference atomicReference) {
        return new dfg(atomicReference, 5);
    }

    /* JADX INFO: renamed from: i */
    public static Size m13428i(Context context, Display display) {
        Display.Mode mode = display.getMode();
        return new Size(m13440u(context, mode.getPhysicalWidth()), m13440u(context, mode.getPhysicalHeight()));
    }

    /* JADX INFO: renamed from: j */
    public static hzj m13429j(Context context, Display display, dhv dhvVar, ikw ikwVar, hyd hydVar, kpb kpbVar) {
        if (((Activity) context).isInMultiWindowMode()) {
            if (kpbVar == null || !kpbVar.m14670j()) {
                return m13428i(context, display).getWidth() > 600 ? hzj.PHONE_LAYOUT : hzj.SIMPLIFIED_LAYOUT;
            }
            return hzj.TABLET_LAYOUT;
        }
        if (ikwVar != null && ikwVar.f31413v && dhvVar != null && dhvVar.mo6184l(dib.f11307bN) && hydVar != null && hydVar.f29901a.equals(hye.JARVIS)) {
            return hzj.f30014d;
        }
        Size sizeM13428i = m13428i(context, display);
        if (sizeM13428i.getHeight() < 600) {
            return hzj.SIMPLIFIED_LAYOUT;
        }
        if (sizeM13428i.getWidth() > 600) {
            return (kpbVar == null || !kpbVar.m14670j()) ? hzj.STARFISH_LAYOUT : hzj.TABLET_LAYOUT;
        }
        return hzj.PHONE_LAYOUT;
    }

    /* JADX INFO: renamed from: k */
    public static hzj m13430k(Context context, Display display, kpb kpbVar) {
        return m13429j(context, display, null, null, null, kpbVar);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m13431l(hzj hzjVar) {
        if (hzjVar != null) {
            return hzjVar.equals(hzj.f30014d) || hzjVar.equals(hzj.STARFISH_LAYOUT) || hzjVar.equals(hzj.TABLET_LAYOUT);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m13432m(Context context, Display display) {
        return m13430k(context, display, null).equals(hzj.SIMPLIFIED_LAYOUT);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m13434o(dhv dhvVar) {
        return dhvVar.mo6184l(diy.f11744a);
    }

    /* JADX INFO: renamed from: p */
    public static kfm m13435p(kmd kmdVar, jxn jxnVar, Set set) {
        kfy kfyVarM14215e = kgq.m14215e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(jxnVar.f35058i), Integer.valueOf(jxnVar.f35058i)));
        kfm kfmVarM14151a = kfn.m14151a();
        kfmVarM14151a.m14146g(kfx.NORMAL);
        kfmVarM14151a.f35821c = new kgb(1, mws.m17097l(kfyVarM14215e));
        kfmVarM14151a.m14148i(new kgb(3, mws.m17097l(kfyVarM14215e)));
        HashSet hashSet = new HashSet(set);
        hashSet.add(kfyVarM14215e);
        gls.m9442d(hashSet, kfmVarM14151a, kmdVar);
        return kfmVarM14151a;
    }

    /* JADX INFO: renamed from: q */
    public static kfy m13436q(int i) {
        return kgq.m14215e(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: r */
    public static kfy m13437r(int i) {
        return kgq.m14215e(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: s */
    public static Set m13438s(Rect rect, float f) {
        HashSet hashSet = new HashSet();
        hashSet.add(kgq.m14215e(CaptureRequest.SCALER_CROP_REGION, rect));
        hashSet.add(kgq.m14215e(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(f)));
        return hashSet;
    }

    /* JADX INFO: renamed from: t */
    public static jxp m13439t(dbr dbrVar, dhv dhvVar, djm djmVar, drj drjVar) {
        return dhvVar.mo6184l(dim.f11639b) ? drjVar.m6621a(dbrVar.mo5895d()) : djmVar.m6237l(dbrVar.mo5895d());
    }

    /* JADX INFO: renamed from: u */
    private static int m13440u(Context context, int i) {
        double d = i / context.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    /* JADX INFO: renamed from: e */
    public static final LocationRequest m13424e(int i, long j, long j2, long j3, long j4, int i2, float f, boolean z, long j5, int i3, int i4, String str, boolean z2, WorkSource workSource, jms jmsVar) {
        long jMin;
        if (j2 == -1) {
            jMin = j;
        } else {
            jMin = i == 105 ? j2 : Math.min(j2, j);
        }
        return new LocationRequest(i, j, jMin, Math.max(j3, j), Long.MAX_VALUE, j4, i2, f, z, j5 == -1 ? j : j5, i3, i4, str, z2, new WorkSource(workSource), jmsVar);
    }
}
