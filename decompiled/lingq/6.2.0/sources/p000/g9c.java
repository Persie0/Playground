package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g9c implements jn1, gh0, dj9, s10, pr1, c94, d94, bm7, xh2, vib, dqb, zc1, zn2 {

    /* JADX INFO: renamed from: g */
    public static g9c f40433g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40439a;

    /* JADX INFO: renamed from: b */
    public static final g9c f40428b = new g9c(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ g9c f40429c = new g9c(2);

    /* JADX INFO: renamed from: d */
    public static final g9c f40430d = new g9c(3);

    /* JADX INFO: renamed from: e */
    public static final g9c f40431e = new g9c(4);

    /* JADX INFO: renamed from: f */
    public static final uk9 f40432f = new uk9(20);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ g9c f40434h = new g9c(19);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ g9c f40435i = new g9c(20);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ g9c f40436j = new g9c(21);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ g9c f40437k = new g9c(22);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ g9c f40438l = new g9c(23);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ g9c f40425H = new g9c(24);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ g9c f40426I = new g9c(25);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ g9c f40427J = new g9c(27);

    public /* synthetic */ g9c(int i) {
        this.f40439a = i;
    }

    @Override // p000.vib
    /* JADX INFO: renamed from: a */
    public boolean mo12438a(Class cls) {
        return false;
    }

    @Override // p000.s10
    /* JADX INFO: renamed from: b */
    public void mo12439b(xg3 xg3Var) {
        xg3Var.getClass();
        xg3Var.m24498n("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // p000.vib
    /* JADX INFO: renamed from: c */
    public ejb mo12440c(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    /* JADX INFO: renamed from: d */
    public synchronized k16 m12441d() {
        return new k16();
    }

    @Override // p000.dj9
    /* JADX INFO: renamed from: e */
    public C0898b mo10416e(AbstractC0903a abstractC0903a) {
        C0880b c0880b = abstractC0903a.f11016a;
        SharedPreferences sharedPreferences = c0880b.f10789b.getSharedPreferences("amplitude-identify-intercept-" + c0880b.f10792e, 0);
        String str = c0880b.f10792e;
        pj5 pj5VarM5104a = c0880b.f10794g.m5104a(abstractC0903a);
        sharedPreferences.getClass();
        return new C0898b(str, pj5VarM5104a, sharedPreferences, new File(c0880b.m5061a(), "identify-intercept"), abstractC0903a.f11028m, new C0020ai(abstractC0903a, 1));
    }

    @Override // p000.gh0
    /* JADX INFO: renamed from: f */
    public long mo12442f(int i, pj3 pj3Var) {
        String str = ((rw9) pj3Var.f56314e).f59975a.f58295a.f54604b;
        return eh0.m11127g(l70.m15954q(str, i), l70.m15953p(str, i));
    }

    @Override // p000.zn2
    /* JADX INFO: renamed from: h */
    public yn2 mo12443h(Context context, String str, xn2 xn2Var) {
        yn2 yn2Var = new yn2();
        int iMo9833c = xn2Var.mo9833c(context, str, true);
        yn2Var.f70102b = iMo9833c;
        if (iMo9833c != 0) {
            yn2Var.f70103c = 1;
            return yn2Var;
        }
        int iMo9834e = xn2Var.mo9834e(context, str);
        yn2Var.f70101a = iMo9834e;
        if (iMo9834e != 0) {
            yn2Var.f70103c = -1;
        }
        return yn2Var;
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: i */
    public void mo3877i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: j */
    public void mo3878j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f40439a) {
            case 26:
                return new e41(0);
            default:
                return new e59((Context) co7Var.mo4926a(Context.class));
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f40439a) {
            case 19:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
            case 20:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.sgtm.upload.backoff_http_codes", 45, "404,429,503,504").get();
            case 21:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.config.cache_time", 5, 86400000L).get();
            case 22:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.retry_time", 77, 1800000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list5 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                return (Long) alb.f818a.m19918r("measurement.test.cached_long_flag", 1, -1L).get();
            case 24:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.uri_scheme", 60, "https").get();
            case 25:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.rb.max_trigger_registrations_per_day", 24, 1000L).get()).longValue());
            default:
                List list8 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 4, true).get();
        }
    }
}
