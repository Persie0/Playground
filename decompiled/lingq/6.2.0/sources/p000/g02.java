package p000;

import android.content.Context;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g02 {

    /* JADX INFO: renamed from: a */
    public final e02 f39994a;

    /* JADX INFO: renamed from: b */
    public final d02 f39995b;

    /* JADX INFO: renamed from: c */
    public final f02 f39996c;

    /* JADX INFO: renamed from: d */
    public final c02 f39997d;

    /* JADX INFO: renamed from: e */
    public final HashMap f39998e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f39999f;

    /* JADX INFO: renamed from: g */
    public ArrayList f40000g;

    /* JADX INFO: renamed from: h */
    public ArrayList f40001h;

    /* JADX INFO: renamed from: i */
    public ArrayList f40002i;

    /* JADX INFO: renamed from: j */
    public ArrayList f40003j;

    /* JADX INFO: renamed from: k */
    public ArrayList f40004k;

    /* JADX INFO: renamed from: l */
    public boolean f40005l;

    /* JADX INFO: renamed from: m */
    public ArrayList f40006m;

    /* JADX INFO: renamed from: n */
    public List f40007n;

    /* JADX INFO: renamed from: o */
    public List f40008o;

    /* JADX INFO: renamed from: p */
    public boolean f40009p;

    /* JADX INFO: renamed from: q */
    public m67 f40010q;

    /* JADX INFO: renamed from: r */
    public long f40011r;

    /* JADX INFO: renamed from: s */
    public String f40012s;

    public g02() {
        new HashMap();
        this.f39999f = false;
        this.f40000g = new ArrayList();
        this.f40001h = new ArrayList();
        this.f40002i = new ArrayList();
        this.f40003j = new ArrayList();
        this.f40004k = new ArrayList();
        this.f40005l = false;
        this.f40006m = new ArrayList();
        this.f40007n = new ArrayList();
        this.f40008o = new ArrayList();
        this.f40009p = false;
        c02 c02Var = null;
        this.f40010q = null;
        this.f40011r = System.currentTimeMillis();
        this.f40012s = "" + this.f40011r;
        e02 e02Var = new e02();
        e02Var.f36485c = null;
        e02Var.f36486d = null;
        e02Var.f36487e = null;
        e02Var.f36488f = null;
        e02Var.f36489g = null;
        e02Var.f36490h = null;
        e02Var.f36491i = 0L;
        e02Var.f36492j = null;
        e02Var.f36493k = null;
        e02Var.f36494l = null;
        e02Var.f36495m = null;
        e02Var.f36496n = null;
        e02Var.f36497o = null;
        e02Var.f36498p = null;
        e02Var.f36499q = null;
        e02Var.f36500r = null;
        this.f39994a = e02Var;
        d02 d02Var = new d02();
        d02Var.f34757c = null;
        d02Var.f34758d = null;
        d02Var.f34759e = null;
        d02Var.f34760f = null;
        d02Var.f34761g = null;
        d02Var.f34762h = null;
        d02Var.f34763i = null;
        d02Var.f34764j = null;
        d02Var.f34765k = null;
        d02Var.f34766l = null;
        d02Var.f34767m = null;
        d02Var.f34768n = null;
        d02Var.f34769o = null;
        d02Var.f34770p = null;
        d02Var.f34771q = null;
        d02Var.f34772r = null;
        d02Var.f34773s = null;
        this.f39995b = d02Var;
        this.f39996c = new f02();
        try {
            Object objNewInstance = Class.forName("com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork").newInstance();
            if (!(objNewInstance instanceof c02)) {
                throw new Exception("DataPointCollection of invalid type");
            }
            c02Var = (c02) objNewInstance;
            this.f39997d = c02Var;
        } catch (Throwable unused) {
            c02.f9246b.m21555D("Unable to build data collection module com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12253a(List list, eg4 eg4Var, eg4 eg4Var2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.isEmpty()) {
                ((dg4) eg4Var2).m10350t(str);
                ((dg4) eg4Var).m10350t(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12254b(SdkTimingAction sdkTimingAction) {
        if (this.f39998e.containsKey(sdkTimingAction.key)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.f40011r;
        this.f40011r = jCurrentTimeMillis;
        this.f40012s += "," + sdkTimingAction.key + j;
        this.f39998e.put(sdkTimingAction.key, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m12255c(Context context, n67 n67Var, boolean z, eg4 eg4Var, eg4 eg4Var2) {
        eg4 eg4Var3;
        this.f39994a.m4250d(context, n67Var, z, this.f39999f, this.f40000g, this.f40001h, this.f40007n, this.f40006m, eg4Var, eg4Var2);
        this.f39995b.m4250d(context, n67Var, z, this.f39999f, this.f40000g, this.f40001h, this.f40007n, this.f40006m, eg4Var, eg4Var2);
        this.f39996c.m4250d(context, n67Var, z, this.f39999f, this.f40000g, this.f40001h, this.f40007n, this.f40006m, eg4Var, eg4Var2);
        c02 c02Var = this.f39997d;
        if (c02Var != null) {
            eg4Var3 = eg4Var2;
            c02Var.m4250d(context, n67Var, z, this.f39999f, this.f40000g, this.f40001h, this.f40007n, this.f40006m, eg4Var, eg4Var3);
        } else {
            eg4Var3 = eg4Var2;
        }
        if (z) {
            m12253a(this.f40001h, eg4Var, eg4Var3);
            if (n67Var.f52405a != PayloadType.Init) {
                m12253a(this.f40007n, eg4Var, eg4Var3);
            }
            if (n67Var.f52405a == PayloadType.Install) {
                ArrayList<String> arrayList = this.f40006m;
                dg4 dg4Var = (dg4) eg4Var3;
                eg4 eg4VarM10342l = dg4Var.m10342l("identity_link", false);
                if (eg4VarM10342l != null) {
                    for (String str : arrayList) {
                        if (!str.isEmpty()) {
                            ((dg4) eg4VarM10342l).m10350t(str);
                        }
                    }
                    if (((dg4) eg4VarM10342l).m10348r() == 0) {
                        dg4Var.m10350t("identity_link");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized d02 m12256d() {
        return this.f39995b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized e02 m12257e() {
        return this.f39994a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m12258f(String str) {
        if (this.f40005l && !this.f40004k.contains(str)) {
            return false;
        }
        return !this.f40003j.contains(str);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m12259g(PayloadType payloadType, String str) {
        if (this.f40001h.contains(str)) {
            return false;
        }
        return payloadType == PayloadType.Init || !this.f40007n.contains(str);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m12260h(boolean z) {
        this.f40009p = z;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m12261i(ArrayList arrayList) {
        this.f40000g = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m12262j(ArrayList arrayList) {
        this.f40001h = arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m12263k(ArrayList arrayList, boolean z) {
        this.f40004k = arrayList;
        this.f40005l = z;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m12264l(ArrayList arrayList) {
        this.f40003j = arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m12265m(boolean z) {
        this.f39999f = z;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m12266n(ArrayList arrayList) {
        this.f40006m = arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m12267o(m67 m67Var) {
        this.f40010q = m67Var;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m12268p(ArrayList arrayList) {
        this.f40002i = arrayList;
    }
}
