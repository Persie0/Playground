package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.ParserException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ox1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f55119a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* JADX INFO: renamed from: b */
    public static final int[] f55120b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c */
    public static final int[] f55121c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: a */
    public static final String m18555a() {
        if (!lp1.f49971a.contains(ox1.class)) {
            try {
                Context contextM21766a = sy2.m21766a();
                List<ResolveInfo> listQueryIntentServices = contextM21766a.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                listQueryIntentServices.getClass();
                String[] strArr = f55119a;
                HashSet hashSet = new HashSet(AbstractC3194a.m15363P(3));
                AbstractC3550rv.m20848p0(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(ox1.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18556b() {
        if (lp1.f49971a.contains(ox1.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + sy2.m21766a().getPackageName();
        } catch (Throwable th) {
            lp1.m16420a(ox1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m18557c(so0 so0Var) throws ParserException {
        int iM21503g = so0Var.m21503g(4);
        if (iM21503g == 15) {
            if (so0Var.m21498b() >= 24) {
                return so0Var.m21503g(24);
            }
            throw ParserException.m2516a(null, "AAC header insufficient data");
        }
        if (iM21503g < 13) {
            return f55120b[iM21503g];
        }
        throw ParserException.m2516a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX INFO: renamed from: d */
    public static final String m18558d(String str) {
        if (lp1.f49971a.contains(ox1.class)) {
            return null;
        }
        try {
            if (eda.m11069a(sy2.m21766a(), str)) {
                return str;
            }
            return eda.m11069a(sy2.m21766a(), m18556b()) ? m18556b() : "";
        } catch (Throwable th) {
            lp1.m16420a(ox1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final e16 m18559e(e16 e16Var) {
        e16Var.getClass();
        return e16Var.mo3161g(c99.m4428u(b16.f7762a, 0.0f, 600.0f, 1));
    }

    /* JADX INFO: renamed from: f */
    public static C3354n m18560f(so0 so0Var, boolean z) {
        int iM21503g = so0Var.m21503g(5);
        if (iM21503g == 31) {
            iM21503g = so0Var.m21503g(6) + 32;
        }
        int iM18557c = m18557c(so0Var);
        int iM21503g2 = so0Var.m21503g(4);
        String strM22988k = ux5.m22988k(iM21503g, "mp4a.40.");
        if (iM21503g == 5 || iM21503g == 29) {
            iM18557c = m18557c(so0Var);
            int iM21503g3 = so0Var.m21503g(5);
            if (iM21503g3 == 31) {
                iM21503g3 = so0Var.m21503g(6) + 32;
            }
            iM21503g = iM21503g3;
            if (iM21503g == 22) {
                iM21503g2 = so0Var.m21503g(4);
            }
        }
        if (z) {
            if (iM21503g != 1 && iM21503g != 2 && iM21503g != 3 && iM21503g != 4 && iM21503g != 6 && iM21503g != 7 && iM21503g != 17) {
                switch (iM21503g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        throw ParserException.m2517b("Unsupported audio object type: " + iM21503g);
                }
            }
            if (so0Var.m21502f()) {
                ss5.m21707d0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (so0Var.m21502f()) {
                so0Var.m21511o(14);
            }
            boolean zM21502f = so0Var.m21502f();
            if (iM21503g2 == 0) {
                ij6.m13946b();
                return null;
            }
            if (iM21503g == 6 || iM21503g == 20) {
                so0Var.m21511o(3);
            }
            if (zM21502f) {
                if (iM21503g == 22) {
                    so0Var.m21511o(16);
                }
                if (iM21503g == 17 || iM21503g == 19 || iM21503g == 20 || iM21503g == 23) {
                    so0Var.m21511o(3);
                }
                so0Var.m21511o(1);
            }
            switch (iM21503g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    int iM21503g4 = so0Var.m21503g(2);
                    if (iM21503g4 == 2 || iM21503g4 == 3) {
                        throw ParserException.m2517b("Unsupported epConfig: " + iM21503g4);
                    }
                    break;
            }
        }
        int i = f55121c[iM21503g2];
        if (i != -1) {
            return new C3354n(iM18557c, strM22988k, i);
        }
        throw ParserException.m2516a(null, null);
    }
}
