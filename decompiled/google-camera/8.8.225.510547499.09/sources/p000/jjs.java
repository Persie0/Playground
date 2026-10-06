package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjs extends jju {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jjx f34186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjs(jec jecVar, jjx jjxVar) {
        super(jecVar);
        this.f34186a = jjxVar;
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        String str;
        jkc jkcVar = (jkc) jdpVar;
        jjx jjxVar = this.f34186a;
        jmv.m13378e(jjxVar);
        nxl nxlVarM18137O = jks.f34256n.m18137O();
        String str2 = jjxVar.f34203g;
        if (TextUtils.isEmpty(str2)) {
            String packageName = jkcVar.f34229a.getApplicationContext().getPackageName();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar = (jks) nxlVarM18137O.f44974b;
            packageName.getClass();
            jksVar.f34258a |= 2;
            jksVar.f34260c = packageName;
        } else {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar2 = (jks) nxlVarM18137O.f44974b;
            str2.getClass();
            jksVar2.f34258a |= 2;
            jksVar2.f34260c = str2;
        }
        try {
            str = jkcVar.f34229a.getPackageManager().getPackageInfo(((jks) nxlVarM18137O.f44974b).f34260c, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str = null;
        }
        if (str != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar3 = (jks) nxlVarM18137O.f44974b;
            jksVar3.f34259b |= 2;
            jksVar3.f34267j = str;
        }
        String str3 = jjxVar.f34197a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String string = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar4 = (jks) nxlVarM18137O.f44974b;
            string.getClass();
            jksVar4.f34258a |= 4;
            jksVar4.f34261d = string;
        }
        String str4 = jjxVar.f34210n;
        if (str4 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar5 = (jks) nxlVarM18137O.f44974b;
            jksVar5.f34258a |= 64;
            jksVar5.f34263f = str4;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        jks jksVar6 = (jks) nxlVarM18137O.f44974b;
        jksVar6.f34258a |= 16;
        jksVar6.f34262e = "feedback.android";
        int i = jcy.f33767b;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        jks jksVar7 = (jks) nxlVarM18137O.f44974b;
        jksVar7.f34258a |= 1073741824;
        jksVar7.f34266i = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        jks jksVar8 = (jks) nxqVar;
        jksVar8.f34258a |= 16777216;
        jksVar8.f34265h = jCurrentTimeMillis;
        if (jjxVar.f34209m != null || jjxVar.f34202f != null) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar9 = (jks) nxlVarM18137O.f44974b;
            jksVar9.f34259b |= 16;
            jksVar9.f34270m = true;
        }
        Bundle bundle = jjxVar.f34198b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = jjxVar.f34198b.size();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar10 = (jks) nxlVarM18137O.f44974b;
            jksVar10.f34259b |= 4;
            jksVar10.f34268k = size;
        }
        List list = jjxVar.f34204h;
        if (list != null && !list.isEmpty()) {
            int size2 = jjxVar.f34204h.size();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            jks jksVar11 = (jks) nxlVarM18137O.f44974b;
            jksVar11.f34259b |= 8;
            jksVar11.f34269l = size2;
        }
        jks jksVar12 = (jks) nxlVarM18137O.mo18103l();
        nxl nxlVar = (nxl) jksVar12.m18143ad(5);
        nxlVar.m18108s(jksVar12);
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        jks jksVar13 = (jks) nxlVar.f44974b;
        jksVar13.f34264g = 164;
        jksVar13.f34258a |= 256;
        jks jksVar14 = (jks) nxlVar.mo18103l();
        Context context = jkcVar.f34229a;
        boolean zIsEmpty = jksVar14.f34260c.isEmpty();
        String str5 = hIAHJKEnGsNbz.qZdZpWbjXrT;
        if (zIsEmpty) {
            Log.e(str5, "MetricsData requires appPackageName to be set");
        }
        if (jksVar14.f34263f.isEmpty()) {
            Log.e(str5, "MetricsData requires sessionId to be set");
        }
        if (jksVar14.f34262e.isEmpty()) {
            Log.e(str5, "MetricsData requires flow to be set");
        }
        if (jksVar14.f34266i <= 0) {
            Log.e(str5, "MetricsData requires clientVersion to be set");
        }
        if (jksVar14.f34265h <= 0) {
            Log.e(str5, "MetricsData requires timestamp to be set");
        }
        int iM15406O = lij.m15406O(jksVar14.f34264g);
        if (iM15406O == 0 || iM15406O == 1) {
            Log.e(str5, "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", jksVar14.mo17760J()));
        jkd jkdVar = (jkd) jkcVar.m13169u();
        ErrorReport errorReport = new ErrorReport(jjxVar, jkcVar.f34229a.getCacheDir());
        Parcel parcelM3398a = jkdVar.m3398a();
        cbs.m3404c(parcelM3398a, errorReport);
        Parcel parcelM3399y = jkdVar.m3399y(1, parcelM3398a);
        cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        m4649i(Status.f7601a);
    }
}
