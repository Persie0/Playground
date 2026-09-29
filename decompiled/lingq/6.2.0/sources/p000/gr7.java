package p000;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class gr7 implements pa3, s10, ns2, c94, bm7, pr1, dqb, zc1, iib {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41248a;

    /* JADX INFO: renamed from: b */
    public static final gr7 f41237b = new gr7(1);

    /* JADX INFO: renamed from: c */
    public static final gr7 f41238c = new gr7(2);

    /* JADX INFO: renamed from: d */
    public static final gr7 f41239d = new gr7(3);

    /* JADX INFO: renamed from: e */
    public static final gr7 f41240e = new gr7(4);

    /* JADX INFO: renamed from: f */
    public static final gr7 f41241f = new gr7(5);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ gr7 f41242g = new gr7(19);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ gr7 f41243h = new gr7(20);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ gr7 f41244i = new gr7(21);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ gr7 f41245j = new gr7(22);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ gr7 f41246k = new gr7(23);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ gr7 f41247l = new gr7(25);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ gr7 f41235H = new gr7(26);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ gr7 f41236I = new gr7(27);

    public /* synthetic */ gr7(int i) {
        this.f41248a = i;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m12851e(nt2 nt2Var, View view, View view2) {
        Bundle bundle = new Bundle();
        if (nt2Var != null) {
            for (l37 l37Var : nt2Var.m17614b()) {
                if (l37Var.m15774d() != null && l37Var.m15774d().length() > 0) {
                    bundle.putString(l37Var.m15771a(), l37Var.m15774d());
                } else if (l37Var.m15772b().size() > 0) {
                    for (u41 u41Var : fa4.m11650l(l37Var.m15773c(), "relative") ? AbstractC3695vr.m23498i(view2, l37Var.m15772b(), 0, -1, view2.getClass().getSimpleName()) : AbstractC3695vr.m23498i(view, l37Var.m15772b(), 0, -1, view.getClass().getSimpleName())) {
                        if (u41Var.m22444a() != null) {
                            String strM17042j = mta.m17042j(u41Var.m22444a());
                            if (strM17042j.length() > 0) {
                                bundle.putString(l37Var.m15771a(), strM17042j);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: h */
    public static void m12852h() {
        File[] fileArrListFiles;
        if (bna.m3941b0()) {
            return;
        }
        File fileM22058q = thb.m22058q();
        int i = 0;
        if (fileM22058q == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileM22058q.listFiles(new mp1(4));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(egd.m11102d(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((r74) obj).m20432c()) {
                arrayList2.add(obj);
            }
        }
        List listM22614f1 = u91.m22614f1(arrayList2, new C3835zj(1));
        JSONArray jSONArray = new JSONArray();
        Iterator it = l70.m15922M(0, Math.min(listM22614f1.size(), 5)).iterator();
        while (((h84) it).f41941c) {
            jSONArray.put(listM22614f1.get(((a84) it).nextInt()));
        }
        thb.m22037B("crash_reports", jSONArray, new jp1(listM22614f1, i));
    }

    /* JADX INFO: renamed from: k */
    public static final mib m12853k(Object obj, long j) {
        mib mibVar = (mib) tjb.m22161i(obj, j);
        if (((chb) mibVar).f10103a) {
            return mibVar;
        }
        int size = mibVar.size();
        mib mibVarMo10419Y = mibVar.mo10419Y(size == 0 ? 10 : size + size);
        tjb.m22162j(obj, j, mibVarMo10419Y);
        return mibVarMo10419Y;
    }

    /* JADX INFO: renamed from: a */
    public float mo12854a(float f) {
        return 1.0f;
    }

    @Override // p000.s10
    /* JADX INFO: renamed from: b */
    public void mo12439b(xg3 xg3Var) {
        xg3Var.getClass();
        xg3Var.m24498n("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            C3386nv.m17626m("Empty values");
            return;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(xg3.f68174b[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        ch3 ch3VarM24496c = xg3Var.m24496c(sb.toString());
        j3d.m14283a(ch3VarM24496c, objArr2);
        ch3VarM24496c.f10085b.executeUpdateDelete();
    }

    /* JADX INFO: renamed from: c */
    public synchronized w41 m12855c() {
        w41 w41Var;
        w41 w41Var2;
        try {
            w41Var = null;
            if (lp1.f49971a.contains(w41.class)) {
                w41Var2 = null;
            } else {
                try {
                    w41Var2 = w41.f66360g;
                } catch (Throwable th) {
                    lp1.m16420a(w41.class, th);
                    w41Var2 = null;
                }
            }
            if (w41Var2 == null) {
                w41 w41Var3 = new w41(0);
                if (!lp1.f49971a.contains(w41.class)) {
                    try {
                        w41.f66360g = w41Var3;
                    } catch (Throwable th2) {
                        lp1.m16420a(w41.class, th2);
                    }
                }
            }
            if (!lp1.f49971a.contains(w41.class)) {
                try {
                    w41Var = w41.f66360g;
                } catch (Throwable th3) {
                    lp1.m16420a(w41.class, th3);
                }
            }
            w41Var.getClass();
        } catch (Throwable th4) {
            throw th4;
        }
        return w41Var;
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    /* JADX INFO: renamed from: f */
    public void m12856f(String str) {
        C2927dg c2927dg = u87.f63590a;
        u87.f63590a.getClass();
        Log.i("OkHttp", str, null);
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: i */
    public void mo3877i() {
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: j */
    public void mo3878j(int i, Object obj) {
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f41248a) {
            case 24:
                e31 e31Var = new e31();
                ddb ddbVar = new ddb(1);
                ReferenceQueue referenceQueue = e31Var.f36635a;
                Set set = e31Var.f36636b;
                set.add(new awb(e31Var, referenceQueue, set, ddbVar));
                Thread thread = new Thread(new gvb(14, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return e31Var;
            default:
                gid.m12675b();
                return new g9c(0);
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f41248a) {
            case 19:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
            case 20:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.sgtm.service_upload_apps_list", 44, "").get();
            case 21:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.batch.long_queuing_threshold", 40, 240000L).get();
            case 22:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.config.url_scheme", 8, "https").get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list5 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                return (Long) alb.f818a.m19918r("measurement.test.long_flag", 4, -1L).get();
            case 24:
            default:
                List list6 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.enable_trigger_redaction", 7, true).get();
            case 25:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.rb.attribution.max_trigger_uris_queried_at_once", 25, 0L).get()).longValue());
            case 26:
                List list8 = z8c.f71153a;
                return Boolean.valueOf(vlb.m23409a());
        }
    }
}
