package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuq {

    /* JADX INFO: renamed from: a */
    public static final String f37246a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");

    /* JADX INFO: renamed from: b */
    public static final String f37247b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");

    /* JADX INFO: renamed from: h */
    private static final kvb f37248h;

    /* JADX INFO: renamed from: c */
    public final Context f37249c;

    /* JADX INFO: renamed from: d */
    public final PackageManager f37250d;

    /* JADX INFO: renamed from: e */
    public final List f37251e;

    /* JADX INFO: renamed from: f */
    public kvb f37252f;

    /* JADX INFO: renamed from: g */
    public boolean f37253g;

    static {
        nxl nxlVarM18137O = kvb.f37309f.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        kvb kvbVar = (kvb) nxqVar;
        kvbVar.f37311a = 1 | kvbVar.f37311a;
        kvbVar.f37312b = "1.2.1";
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        kvb kvbVar2 = (kvb) nxqVar2;
        kvbVar2.f37311a |= 2;
        kvbVar2.f37313c = "";
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        kvb kvbVar3 = (kvb) nxqVar3;
        kvbVar3.f37314d = -1;
        kvbVar3.f37311a |= 4;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        kvb kvbVar4 = (kvb) nxlVarM18137O.f44974b;
        kvbVar4.f37315e = -1;
        kvbVar4.f37311a |= 8;
        f37248h = (kvb) nxlVarM18137O.mo18103l();
    }

    public kuq(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f37251e = new ArrayList();
        this.f37249c = context;
        this.f37250d = packageManager;
        this.f37253g = false;
        kvb kvbVar = f37248h;
        this.f37252f = kvbVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                nxl nxlVar = (nxl) kvbVar.m18143ad(5);
                nxlVar.m18108s(kvbVar);
                String str = packageInfo.versionName;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                kvb kvbVar2 = (kvb) nxlVar.f44974b;
                kvb kvbVar3 = kvb.f37309f;
                str.getClass();
                kvbVar2.f37311a |= 2;
                kvbVar2.f37313c = str;
                this.f37252f = (kvb) nxlVar.mo18103l();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new kup(this).execute(new Void[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m14903a(kuo kuoVar) {
        if (this.f37253g) {
            kuoVar.mo14900a(this.f37252f);
        } else {
            this.f37251e.add(kuoVar);
        }
    }
}
