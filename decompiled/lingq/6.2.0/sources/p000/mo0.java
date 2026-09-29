package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class mo0 implements eba {

    /* JADX INFO: renamed from: a */
    public final cc4 f51613a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f51614b;

    /* JADX INFO: renamed from: c */
    public final Context f51615c;

    /* JADX INFO: renamed from: d */
    public final URL f51616d;

    /* JADX INFO: renamed from: e */
    public final a41 f51617e;

    /* JADX INFO: renamed from: f */
    public final a41 f51618f;

    /* JADX INFO: renamed from: g */
    public final int f51619g;

    public mo0(Context context, a41 a41Var, a41 a41Var2) {
        of4 of4Var = new of4();
        h00 h00Var = h00.f41588a;
        of4Var.mo12901e(vb0.class, h00Var);
        of4Var.mo12901e(t20.class, h00Var);
        o00 o00Var = o00.f53486a;
        of4Var.mo12901e(hj5.class, o00Var);
        of4Var.mo12901e(x40.class, o00Var);
        i00 i00Var = i00.f43270a;
        of4Var.mo12901e(q31.class, i00Var);
        of4Var.mo12901e(u20.class, i00Var);
        g00 g00Var = g00.f39980a;
        of4Var.mo12901e(AbstractC3573sg.class, g00Var);
        of4Var.mo12901e(r20.class, g00Var);
        n00 n00Var = n00.f52095a;
        of4Var.mo12901e(ej5.class, n00Var);
        of4Var.mo12901e(w40.class, n00Var);
        j00 j00Var = j00.f44826a;
        of4Var.mo12901e(ec1.class, j00Var);
        of4Var.mo12901e(v20.class, j00Var);
        m00 m00Var = m00.f50371a;
        of4Var.mo12901e(fy2.class, m00Var);
        of4Var.mo12901e(p40.class, m00Var);
        l00 l00Var = l00.f48835a;
        of4Var.mo12901e(ey2.class, l00Var);
        of4Var.mo12901e(o40.class, l00Var);
        p00 p00Var = p00.f55348a;
        of4Var.mo12901e(wj6.class, p00Var);
        of4Var.mo12901e(z40.class, p00Var);
        k00 k00Var = k00.f46450a;
        of4Var.mo12901e(uw2.class, k00Var);
        of4Var.mo12901e(n40.class, k00Var);
        of4Var.f54272d = true;
        this.f51613a = new cc4(of4Var);
        this.f51615c = context;
        this.f51614b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f51616d = m16947b(al0.f791c);
        this.f51617e = a41Var2;
        this.f51618f = a41Var;
        this.f51619g = 130000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m16947b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC3393o1.m17734i("Invalid url: ", str), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final l40 m16948a(l40 l40Var) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f51614b.getActiveNetworkInfo();
        k40 k40VarM15778c = l40Var.m15778c();
        int i = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) k40VarM15778c.f46681i;
        if (map == null) {
            C3386nv.m17633t("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("sdk-version", String.valueOf(i));
        k40VarM15778c.m14797b("model", Build.MODEL);
        k40VarM15778c.m14797b("hardware", Build.HARDWARE);
        k40VarM15778c.m14797b("device", Build.DEVICE);
        k40VarM15778c.m14797b("product", Build.PRODUCT);
        k40VarM15778c.m14797b("os-uild", Build.ID);
        k40VarM15778c.m14797b("manufacturer", Build.MANUFACTURER);
        k40VarM15778c.m14797b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / DescriptorProtos.Edition.EDITION_2023_VALUE;
        HashMap map2 = (HashMap) k40VarM15778c.f46681i;
        if (map2 == null) {
            C3386nv.m17633t("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? NetworkConnectionInfo$NetworkType.NONE.getValue() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) k40VarM15778c.f46681i;
        if (map3 == null) {
            C3386nv.m17633t("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("net-type", String.valueOf(value));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo$MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo$MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo$MobileSubtype.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) k40VarM15778c.f46681i;
        if (map4 == null) {
            C3386nv.m17633t("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        k40VarM15778c.m14797b("country", Locale.getDefault().getCountry());
        k40VarM15778c.m14797b("locale", Locale.getDefault().getLanguage());
        Context context = this.f51615c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        k40VarM15778c.m14797b("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            x74.m24359p("CctTransportBackend", "Unable to find version code for package", e);
        }
        k40VarM15778c.m14797b("application_build", Integer.toString(i2));
        return k40VarM15778c.m14798c();
    }
}
