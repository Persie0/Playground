package cc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.measurement.internal.zzah;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p176ib.C6272i;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1788c3 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: H */
    public String f9700H;

    /* JADX INFO: renamed from: I */
    public String f9701I;

    /* JADX INFO: renamed from: J */
    public long f9702J;

    /* JADX INFO: renamed from: K */
    public String f9703K;

    /* JADX INFO: renamed from: c */
    public String f9704c;

    /* JADX INFO: renamed from: d */
    public String f9705d;

    /* JADX INFO: renamed from: e */
    public int f9706e;

    /* JADX INFO: renamed from: f */
    public String f9707f;

    /* JADX INFO: renamed from: g */
    public long f9708g;

    /* JADX INFO: renamed from: h */
    public final long f9709h;

    /* JADX INFO: renamed from: i */
    public List f9710i;

    /* JADX INFO: renamed from: j */
    public String f9711j;

    /* JADX INFO: renamed from: k */
    public int f9712k;

    /* JADX INFO: renamed from: l */
    public String f9713l;

    public C1788c3(C1897o4 c1897o4, long j10) {
        super(c1897o4);
        this.f9702J = 0L;
        this.f9703K = null;
        this.f9709h = j10;
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x0260 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0275  */
    /* JADX WARN: Code duplicated, block: B:88:0x0276 A[Catch: NotFoundException -> 0x027c, TRY_LEAVE, TryCatch #3 {NotFoundException -> 0x027c, blocks: (B:85:0x0260, B:88:0x0276), top: B:118:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x028d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0290  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x029a  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ab  */
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* JADX INFO: renamed from: l */
    public final void m5529l() {
        String str;
        Integer numValueOf;
        String[] stringArray;
        Iterator it;
        String str2;
        C1900o7 c1900o7;
        String string;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        String packageName = c1897o4.f10076a.getPackageName();
        PackageManager packageManager = c1897o4.f10076a.getPackageManager();
        String str3 = "Unknown";
        int i10 = Integer.MIN_VALUE;
        String str4 = "";
        String str5 = "unknown";
        if (packageManager == null) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(C1860k3.m5700q(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            try {
                packageManager.getInstallerPackageName(packageName);
                str5 = "com.android.vending";
            } catch (IllegalArgumentException unused) {
                C1860k3 c1860k4 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(C1860k3.m5700q(packageName), "Error retrieving app installer package name. appId");
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = str4;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(((C1897o4) interfaceC1781b5).f10076a.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i10 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string2;
                        C1860k3 c1860k5 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9942f.m5625c(C1860k3.m5700q(packageName), str3, "Error retrieving package info. appId, appName");
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f9704c = packageName;
        this.f9707f = str5;
        this.f9705d = str3;
        this.f9706e = i10;
        this.f9708g = 0L;
        boolean z10 = !TextUtils.isEmpty(c1897o4.f10078b) && "am".equals(c1897o4.f10080c);
        int iM5781l = c1897o4.m5781l();
        switch (iM5781l) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1860k3 c1860k6 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k6);
                c1860k6.f9938I.m5623a("App measurement collection enabled");
                break;
            case 1:
                C1860k3 c1860k7 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k7);
                c1860k7.f9948l.m5623a("App measurement deactivated via the manifest");
                break;
            case 2:
                C1860k3 c1860k8 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k8);
                c1860k8.f9938I.m5623a("App measurement deactivated via the init parameters");
                break;
            case 3:
                C1860k3 c1860k9 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k9);
                c1860k9.f9948l.m5623a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                C1860k3 c1860k10 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k10);
                c1860k10.f9948l.m5623a("App measurement disabled via the manifest");
                break;
            case 5:
                C1860k3 c1860k11 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k11);
                c1860k11.f9938I.m5623a("App measurement disabled via the init parameters");
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C1860k3 c1860k12 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k12);
                c1860k12.f9947k.m5623a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C1860k3 c1860k13 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k13);
                c1860k13.f9948l.m5623a("App measurement disabled via the global data collection setting");
                break;
            default:
                C1860k3 c1860k14 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k14);
                c1860k14.f9948l.m5623a("App measurement disabled due to denied storage consent");
                break;
        }
        this.f9713l = str4;
        this.f9700H = str4;
        c1897o4.getClass();
        if (z10) {
            this.f9700H = c1897o4.f10078b;
        }
        List listAsList = null;
        try {
            String strM16757s1 = C8573r0.m16757s1(((C1897o4) interfaceC1781b5).f10076a, ((C1897o4) interfaceC1781b5).f10063N);
            if (!TextUtils.isEmpty(strM16757s1)) {
                str4 = strM16757s1;
            }
            this.f9713l = str4;
            if (!TextUtils.isEmpty(strM16757s1)) {
                Context context = ((C1897o4) interfaceC1781b5).f10076a;
                String strM5627a = ((C1897o4) interfaceC1781b5).f10063N;
                C6272i.m12915i(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strM5627a)) {
                    strM5627a = C1843i4.m5627a(context);
                }
                int identifier = resources.getIdentifier("admob_app_id", "string", strM5627a);
                if (identifier == 0) {
                    string = null;
                } else {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused4) {
                        string = null;
                    }
                }
                this.f9700H = string;
            }
            if (iM5781l == 0) {
                C1860k3 c1860k15 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k15);
                c1860k15.f9938I.m5625c(this.f9704c, TextUtils.isEmpty(this.f9713l) ? this.f9700H : this.f9713l, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e10) {
            C1860k3 c1860k16 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k16);
            c1860k16.f9942f.m5625c(C1860k3.m5700q(packageName), e10, "Fetching Google App Id failed with exception. appId");
        }
        this.f9710i = null;
        c1897o4.getClass();
        C1802e c1802e = c1897o4.f10084g;
        c1802e.getClass();
        C6272i.m12912f("analytics.safelisted_events");
        Bundle bundleM5580o = c1802e.m5580o();
        InterfaceC1781b5 interfaceC1781b6 = c1802e.f10430a;
        if (bundleM5580o != null) {
            if (bundleM5580o.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM5580o.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = ((C1897o4) interfaceC1781b6).f10076a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e11) {
                    C1860k3 c1860k17 = ((C1897o4) interfaceC1781b6).f10086i;
                    C1897o4.m5776k(c1860k17);
                    c1860k17.f9942f.m5624b(e11, "Failed to load string array from metadata: resource not found");
                }
            }
            if (listAsList != null) {
                if (listAsList.isEmpty()) {
                    C1860k3 c1860k18 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k18);
                    c1860k18.f9947k.m5623a("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            c1900o7 = c1897o4.f10089l;
                            C1897o4.m5774i(c1900o7);
                        }
                    } while (c1900o7.m5819O("safelisted event", str2));
                }
                if (packageManager != null) {
                    this.f9712k = InstantApps.isInstantApp(c1897o4.f10076a) ? 1 : 0;
                } else {
                    this.f9712k = 0;
                }
            }
            this.f9710i = listAsList;
            if (packageManager != null) {
                this.f9712k = InstantApps.isInstantApp(c1897o4.f10076a) ? 1 : 0;
            } else {
                this.f9712k = 0;
            }
        }
        C1860k3 c1860k19 = ((C1897o4) interfaceC1781b6).f10086i;
        C1897o4.m5776k(c1860k19);
        c1860k19.f9942f.m5623a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = ((C1897o4) interfaceC1781b6).f10076a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            if (listAsList.isEmpty()) {
                C1860k3 c1860k110 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k110);
                c1860k110.f9947k.m5623a("Safelisted event list is empty. Ignoring");
            } else {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        str2 = (String) it.next();
                        c1900o7 = c1897o4.f10089l;
                        C1897o4.m5774i(c1900o7);
                    }
                } while (c1900o7.m5819O("safelisted event", str2));
            }
            if (packageManager != null) {
                this.f9712k = InstantApps.isInstantApp(c1897o4.f10076a) ? 1 : 0;
            } else {
                this.f9712k = 0;
            }
        }
        this.f9710i = listAsList;
        if (packageManager != null) {
            this.f9712k = InstantApps.isInstantApp(c1897o4.f10076a) ? 1 : 0;
        } else {
            this.f9712k = 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m5530m() {
        m5851h();
        C6272i.m12915i(this.f9704c);
        return this.f9704c;
    }

    /* JADX INFO: renamed from: n */
    public final String m5531n() {
        mo5748g();
        m5851h();
        C6272i.m12915i(this.f9713l);
        return this.f9713l;
    }

    /* JADX INFO: renamed from: o */
    public final void m5532o() {
        String str;
        mo5748g();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        if (c1986y3.m5919n().m5597f(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            C1900o7 c1900o7 = c1897o4.f10089l;
            C1897o4.m5774i(c1900o7);
            c1900o7.m5841q().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9937H.m5623a("Analytics Storage consent is not granted");
            str = null;
        }
        C1860k3 c1860k4 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k4);
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        c1860k4.f9937H.m5623a(String.format("Resetting session stitching token to %s", objArr));
        this.f9701I = str;
        c1897o4.f10058I.getClass();
        this.f9702J = System.currentTimeMillis();
    }
}
