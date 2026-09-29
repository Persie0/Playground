package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: renamed from: oc */
/* JADX INFO: loaded from: classes2.dex */
public final class C3404oc implements fmb {

    /* JADX INFO: renamed from: c */
    public static final C3404oc f54156c;

    /* JADX INFO: renamed from: d */
    public static final C3404oc f54157d;

    /* JADX INFO: renamed from: e */
    public static final C3404oc f54158e;

    /* JADX INFO: renamed from: f */
    public static final C3404oc f54159f;

    /* JADX INFO: renamed from: g */
    public static final C3404oc f54160g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54161a;

    /* JADX INFO: renamed from: b */
    public String f54162b;

    static {
        int i = 0;
        f54156c = new C3404oc("TINK", i);
        f54157d = new C3404oc("CRUNCHY", i);
        f54158e = new C3404oc("NO_PREFIX", i);
        int i2 = 1;
        f54159f = new C3404oc("FLAT", i2);
        f54160g = new C3404oc("HALF_OPENED", i2);
    }

    public /* synthetic */ C3404oc(String str, int i) {
        this.f54161a = i;
        this.f54162b = str;
    }

    /* JADX INFO: renamed from: c */
    public static C3404oc m17906c(k47 k47Var) {
        String str;
        k47Var.m14819N(2);
        int iM14842z = k47Var.m14842z();
        int i = iM14842z >> 1;
        int i2 = 3;
        int iM14842z2 = ((k47Var.m14842z() >> 3) & 31) | ((iM14842z & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM22997t = ux5.m22997t(str);
        sbM22997t.append(i < 10 ? ".0" : ".");
        sbM22997t.append(i);
        return new C3404oc(wq1.m24124t(sbM22997t, iM14842z2 < 10 ? ".0" : ".", iM14842z2), i2);
    }

    @Override // p000.fmb
    /* JADX INFO: renamed from: a */
    public Object mo4555a() {
        Object obj;
        boolean zBooleanValue;
        String str = this.f54162b;
        ContentResolver contentResolver = aib.f714g.getContentResolver();
        Uri uri = xmd.f68367a;
        synchronized (xmd.class) {
            xmd.m24617c(contentResolver);
            obj = xmd.f68377k;
        }
        HashMap map = xmd.f68373g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) xmd.m24615a(map, str, bool);
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            String strM24616b = xmd.m24616b(contentResolver, str);
            boolean z = false;
            if (strM24616b == null || strM24616b.equals("")) {
                bool = bool2;
            } else if (xmd.f68369c.matcher(strM24616b).matches()) {
                bool = Boolean.TRUE;
                z = true;
            } else if (!xmd.f68370d.matcher(strM24616b).matches()) {
                Log.w("Gservices", ux5.m22991n("attempt to read gservices key ", str, " (value \"", strM24616b, "\") as boolean"));
                bool = bool2;
            }
            xmd.m24618d(obj, map, str, bool);
            zBooleanValue = z;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: b */
    public gp0 m17907b() {
        String str = this.f54162b;
        if (str == null) {
            C3386nv.m17626m("Purchase token must be set");
            return null;
        }
        gp0 gp0Var = new gp0(2);
        gp0Var.f41124b = str;
        return gp0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m17908d(String str) {
        this.f54162b = str;
    }

    public String toString() {
        switch (this.f54161a) {
            case 0:
                return this.f54162b;
            case 1:
                return this.f54162b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3404oc() {
        this.f54161a = 2;
    }
}
