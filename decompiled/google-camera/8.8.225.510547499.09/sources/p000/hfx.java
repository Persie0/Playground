package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfx {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f27636f = 0;

    /* JADX INFO: renamed from: g */
    private static final mxk f27637g = mxk.m17137I(hgu.f27747a.getPackageName(), hgu.f27748b.getPackageName());

    /* JADX INFO: renamed from: a */
    public final hgy f27638a;

    /* JADX INFO: renamed from: b */
    public final Context f27639b;

    /* JADX INFO: renamed from: c */
    public final chv f27640c;

    /* JADX INFO: renamed from: d */
    public final dhv f27641d;

    /* JADX INFO: renamed from: h */
    private final gvo f27643h;

    /* JADX INFO: renamed from: i */
    private final boolean f27644i;

    /* JADX INFO: renamed from: k */
    private final had f27646k;

    /* JADX INFO: renamed from: l */
    private final hah f27647l;

    /* JADX INFO: renamed from: m */
    private final hai f27648m;

    /* JADX INFO: renamed from: e */
    public final Map f27642e = new ArrayMap();

    /* JADX INFO: renamed from: j */
    private final Map f27645j = new ArrayMap();

    public hfx(hgy hgyVar, Context context, gvo gvoVar, boolean z, chv chvVar, dhv dhvVar, had hadVar, hah hahVar, hai haiVar) {
        this.f27638a = hgyVar;
        this.f27639b = context;
        this.f27643h = gvoVar;
        this.f27644i = z;
        this.f27640c = chvVar;
        this.f27641d = dhvVar;
        this.f27646k = hadVar;
        this.f27647l = hahVar;
        this.f27648m = haiVar;
    }

    /* JADX INFO: renamed from: a */
    public static String m10217a(chp chpVar) {
        String strNormalizeMimeType = Intent.normalizeMimeType(chpVar.mo3733b().mo3749i());
        if (!TextUtils.isEmpty(strNormalizeMimeType)) {
            return strNormalizeMimeType;
        }
        chr chrVar = chr.CAMERA_PREVIEW;
        switch (chpVar.mo3734c().ordinal()) {
            case 1:
            case 5:
                return "image/*";
            case 2:
                return NptsKnlVczSZ.JbWM;
            case 3:
            case 4:
            default:
                fes fesVarMo3735d = chpVar.mo3735d();
                return (fesVarMo3735d.f21570i || fesVarMo3735d.f21568g || fesVarMo3735d.f21567f) ? "image/*" : "*/*";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10218b(String str) {
        if (m10220d(str)) {
            return "image/*";
        }
        return m10221g(str) ? "video/*" : rmwTRjObXLGH.vTBHvlfpwtr;
    }

    /* JADX INFO: renamed from: c */
    public static Predicate m10219c(Function function) {
        return new gek(new ConcurrentHashMap(), function, 7);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10220d(String str) {
        return str.startsWith("image/") || krd.m14742a(str).m14743b();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10221g(String str) {
        return str.startsWith("video/") || krd.m14742a(str).m14744c();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10222e(ResolveInfo resolveInfo) {
        CharSequence string;
        if (!"com.google.android.gms".equals(resolveInfo.activityInfo.packageName)) {
            return false;
        }
        if ("com.google.android.gms.nearby.sharing.ShareSheetActivity".equals(resolveInfo.activityInfo.name)) {
            return true;
        }
        if (TextUtils.isEmpty(resolveInfo.activityInfo.nonLocalizedLabel)) {
            Configuration configuration = this.f27639b.getResources().getConfiguration();
            configuration.setLocale(Locale.ROOT);
            try {
                string = this.f27639b.createPackageContext(resolveInfo.activityInfo.packageName, 0).createConfigurationContext(configuration).getResources().getString(resolveInfo.activityInfo.labelRes);
            } catch (PackageManager.NameNotFoundException e) {
                string = "";
            }
        } else {
            string = resolveInfo.activityInfo.nonLocalizedLabel;
        }
        return "Nearby Share".contentEquals(string);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10223f(String str) {
        had hadVar = this.f27646k;
        hgt hgtVar = (hgt) this.f27638a.mo10264a().get(str);
        hgtVar.getClass();
        return hadVar.mo10046m(hgtVar.m10255a());
    }

    /* JADX INFO: renamed from: h */
    public final ResolveInfo m10224h(int i) {
        hfw hfwVar = new hfw(this, i);
        ((ResolveInfo) hfwVar).activityInfo = new ActivityInfo();
        ((ResolveInfo) hfwVar).activityInfo.packageName = this.f27639b.getPackageName();
        ActivityInfo activityInfo = ((ResolveInfo) hfwVar).activityInfo;
        dhv dhvVar = this.f27641d;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        activityInfo.name = "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity";
        return hfwVar;
    }

    /* JADX INFO: renamed from: i */
    public final int m10225i(chp chpVar) {
        boolean z = false;
        if (!((Boolean) this.f27647l.mo10031c(gzy.f27006R)).booleanValue() && !((Boolean) this.f27647l.mo10031c(gzy.f27007S)).booleanValue()) {
            Map map = this.f27645j;
            String str = IuyLAqNmW.xOd;
            mrm mrmVarM16828h = mrm.m16828h((Boolean) map.get(str));
            mrm mrmVarM16828h2 = mrm.m16828h((Boolean) this.f27645j.get("video/*"));
            if (!mrmVarM16828h.mo16813g()) {
                mrmVarM16828h = mrm.m16829i(Boolean.valueOf(this.f27638a.mo10273j(str)));
                this.f27645j.put(str, (Boolean) ((mrq) mrmVarM16828h).f41482a);
            }
            if (!mrmVarM16828h2.mo16813g()) {
                mrmVarM16828h2 = mrm.m16829i(Boolean.valueOf(this.f27638a.mo10273j("video/*")));
                this.f27645j.put("video/*", (Boolean) ((mrq) mrmVarM16828h2).f41482a);
            }
            if (((Boolean) mrmVarM16828h.mo16809c()).booleanValue() || ((Boolean) mrmVarM16828h2.mo16809c()).booleanValue()) {
                this.f27648m.mo10033e(gzy.f27004P, true);
                z = true;
            } else {
                this.f27648m.mo10033e(gzy.f27004P, false);
            }
        }
        if (!((Boolean) this.f27647l.mo10031c(gzy.f27004P)).booleanValue() || chpVar == null) {
            return 2;
        }
        if (!z) {
            String strM10218b = m10218b(m10217a(chpVar));
            Boolean boolValueOf = (Boolean) this.f27642e.get(strM10218b);
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(this.f27638a.mo10272i(strM10218b));
                this.f27642e.put(strM10218b, boolValueOf);
            }
            if (!boolValueOf.booleanValue()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5 A[Catch: ActivityNotFoundException -> 0x00ab, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x00ab, blocks: (B:20:0x0097, B:22:0x009b, B:23:0x00a5), top: B:29:0x0097 }] */
    /* JADX INFO: renamed from: j */
    final int m10226j(ResolveInfo resolveInfo, chp chpVar) {
        Uri uriMo3743c = chpVar.mo3733b().mo3743c();
        Context context = this.f27639b;
        dhv dhvVar = this.f27641d;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        boolean z = false;
        int i = 1;
        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) && "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity".equals(resolveInfo.activityInfo.name)) {
            z = true;
        }
        Intent intent = new Intent(VzWFSVj.JMVGzKJKGe);
        if (this.f27641d.mo6184l(dib.f11325bf) && f27637g.contains(resolveInfo.activityInfo.packageName) && this.f27639b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.internal.camera.imageobfuscator") != null) {
            intent.setClassName("com.google.android.apps.internal.camera.imageobfuscator", EArqVBjecl.ZzrnWMqvTSecmsr);
        } else {
            intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (z) {
            intent.putExtra(JrxsYuVZZqnFC.ikvH, "pref_category_social_share");
            intent.putExtra("pref_make_setting_page_root", true);
            i = 3;
        } else {
            intent.setType(m10218b(m10217a(chpVar)));
            intent.putExtra("android.intent.extra.STREAM", uriMo3743c);
            intent.addFlags(268435457);
        }
        if (z) {
            try {
                if (this.f27644i) {
                    this.f27643h.mo9799g(intent);
                } else {
                    ((Activity) this.f27639b).startActivityForResult(intent, 1000);
                }
            } catch (ActivityNotFoundException e) {
                return 2;
            }
        } else {
            this.f27643h.mo9799g(intent);
        }
        return i;
    }
}
