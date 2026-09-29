package p000;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class k16 {

    /* JADX INFO: renamed from: a */
    public final boolean f46552a;

    /* JADX INFO: renamed from: b */
    public final String f46553b;

    /* JADX INFO: renamed from: c */
    public final String f46554c;

    /* JADX INFO: renamed from: d */
    public final String f46555d;

    /* JADX INFO: renamed from: e */
    public final List f46556e;

    /* JADX INFO: renamed from: f */
    public final List f46557f;

    /* JADX INFO: renamed from: g */
    public final List f46558g;

    public k16() {
        this.f46552a = false;
        this.f46553b = "";
        this.f46554c = "";
        this.f46555d = "";
        List list = Collections.EMPTY_LIST;
        this.f46556e = list;
        this.f46557f = list;
        this.f46558g = list;
    }

    /* JADX INFO: renamed from: a */
    public static k16 m14771a(Context context, String str) {
        Integer numM3211F;
        if (!thb.m22063v(str)) {
            return new k16();
        }
        try {
            Class<?> cls = Class.forName(str);
            String strM3217L = b34.m3217L(thb.m22057p(cls, "SDK_MODULE_NAME"));
            String str2 = strM3217L != null ? strM3217L : "";
            String strM3217L2 = b34.m3217L(thb.m22057p(cls, "SDK_VERSION"));
            String str3 = strM3217L2 != null ? strM3217L2 : "";
            Date date = new Date(b34.m3216K(thb.m22057p(cls, "SDK_BUILD_TIME_MILLIS"), 0L).longValue());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str4 = simpleDateFormat.format(date);
            ff4 ff4VarM3213H = b34.m3213H(thb.m22057p(cls, "SDK_CAPABILITIES"), true);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (true) {
                ef4 ef4Var = (ef4) ff4VarM3213H;
                if (i2 >= ef4Var.m11093f()) {
                    break;
                }
                synchronized (ef4Var) {
                    numM3211F = b34.m3211F(ef4Var.m11089a(i2));
                    if (numM3211F == null) {
                        numM3211F = null;
                    }
                }
                if (numM3211F != null) {
                    arrayList.add(numM3211F);
                }
                i2++;
            }
            ff4 ff4VarM3213H2 = b34.m3213H(thb.m22057p(cls, "SDK_PERMISSIONS"), true);
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (true) {
                ef4 ef4Var2 = (ef4) ff4VarM3213H2;
                if (i3 >= ef4Var2.m11093f()) {
                    break;
                }
                eg4 eg4VarM11092e = ef4Var2.m11092e(i3);
                if (eg4VarM11092e != null) {
                    dg4 dg4Var = (dg4) eg4VarM11092e;
                    arrayList2.add(new m16(dg4Var.m10344n("name", ""), context.getPackageManager().checkPermission(dg4Var.m10344n("path", ""), context.getPackageName()) == 0));
                }
                i3++;
            }
            ff4 ff4VarM3213H3 = b34.m3213H(thb.m22057p(cls, "SDK_DEPENDENCIES"), true);
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                ef4 ef4Var3 = (ef4) ff4VarM3213H3;
                if (i >= ef4Var3.m11093f()) {
                    break;
                }
                eg4 eg4VarM11092e2 = ef4Var3.m11092e(i);
                if (eg4VarM11092e2 != null) {
                    dg4 dg4Var2 = (dg4) eg4VarM11092e2;
                    arrayList3.add(new l16(dg4Var2.m10344n("name", ""), thb.m22063v(dg4Var2.m10344n("path", ""))));
                }
                i++;
            }
            if (!str2.isEmpty() && !str3.isEmpty() && !str4.isEmpty()) {
                return new k16(str2, str3, str4, arrayList, arrayList2, arrayList3);
            }
            return new k16();
        } catch (Throwable unused) {
            return new k16();
        }
    }

    /* JADX INFO: renamed from: b */
    public final dg4 m14772b() {
        List list = this.f46556e;
        String str = this.f46555d;
        String str2 = this.f46554c;
        dg4 dg4VarM10328c = dg4.m10328c();
        String str3 = this.f46553b;
        if (!b34.m3255w(str3)) {
            dg4VarM10328c.m10331B("name", str3);
        }
        if (!b34.m3255w(str2)) {
            dg4VarM10328c.m10331B("version", str2);
        }
        if (!b34.m3255w(str)) {
            dg4VarM10328c.m10331B("buildDate", str);
        }
        if (!list.isEmpty()) {
            dg4VarM10328c.m10331B("capabilities", r46.m20391q(list));
        }
        ef4 ef4VarM11088d = ef4.m11088d();
        for (m16 m16Var : this.f46557f) {
            if (m16Var.f50434b) {
                String str4 = m16Var.f50433a;
                synchronized (ef4VarM11088d) {
                    ef4VarM11088d.m11090b(str4);
                }
            }
        }
        if (ef4VarM11088d.m11093f() > 0) {
            dg4VarM10328c.m10354x("permissions", ef4VarM11088d);
        }
        ef4 ef4VarM11088d2 = ef4.m11088d();
        for (l16 l16Var : this.f46558g) {
            if (l16Var.f48897b) {
                String str5 = l16Var.f48896a;
                synchronized (ef4VarM11088d2) {
                    ef4VarM11088d2.m11090b(str5);
                }
            }
        }
        if (ef4VarM11088d2.m11093f() > 0) {
            dg4VarM10328c.m10354x("dependencies", ef4VarM11088d2);
        }
        return dg4VarM10328c;
    }

    public k16(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f46552a = true;
        this.f46553b = str;
        this.f46554c = str2;
        this.f46555d = str3;
        this.f46556e = arrayList;
        this.f46557f = arrayList2;
        this.f46558g = arrayList3;
    }
}
