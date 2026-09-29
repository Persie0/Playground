package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nj0 implements fm1, jn1, sm9, gh0, z92, ad1, i29, d94, a41, dqb, xn2 {

    /* JADX INFO: renamed from: Q */
    public static String f52798Q;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52818a;

    /* JADX INFO: renamed from: b */
    public static final nj0 f52807b = new nj0(0);

    /* JADX INFO: renamed from: c */
    public static final gc0 f52808c = new gc0(-1.0f, -1.0f);

    /* JADX INFO: renamed from: d */
    public static final gc0 f52809d = new gc0(0.0f, -1.0f);

    /* JADX INFO: renamed from: e */
    public static final gc0 f52810e = new gc0(1.0f, -1.0f);

    /* JADX INFO: renamed from: f */
    public static final gc0 f52811f = new gc0(-1.0f, 0.0f);

    /* JADX INFO: renamed from: g */
    public static final gc0 f52812g = new gc0(0.0f, 0.0f);

    /* JADX INFO: renamed from: h */
    public static final gc0 f52813h = new gc0(1.0f, 0.0f);

    /* JADX INFO: renamed from: i */
    public static final gc0 f52814i = new gc0(-1.0f, 1.0f);

    /* JADX INFO: renamed from: j */
    public static final gc0 f52815j = new gc0(0.0f, 1.0f);

    /* JADX INFO: renamed from: k */
    public static final gc0 f52816k = new gc0(1.0f, 1.0f);

    /* JADX INFO: renamed from: l */
    public static final fc0 f52817l = new fc0(-1.0f);

    /* JADX INFO: renamed from: H */
    public static final fc0 f52789H = new fc0(0.0f);

    /* JADX INFO: renamed from: I */
    public static final fc0 f52790I = new fc0(1.0f);

    /* JADX INFO: renamed from: J */
    public static final ec0 f52791J = new ec0(-1.0f);

    /* JADX INFO: renamed from: K */
    public static final ec0 f52792K = new ec0(0.0f);

    /* JADX INFO: renamed from: L */
    public static final ec0 f52793L = new ec0(1.0f);

    /* JADX INFO: renamed from: M */
    public static final nj0 f52794M = new nj0(2);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ nj0 f52795N = new nj0(3);

    /* JADX INFO: renamed from: O */
    public static final nj0 f52796O = new nj0(4);

    /* JADX INFO: renamed from: P */
    public static final nj0 f52797P = new nj0(5);

    /* JADX INFO: renamed from: R */
    public static final /* synthetic */ nj0 f52799R = new nj0(20);

    /* JADX INFO: renamed from: S */
    public static final /* synthetic */ nj0 f52800S = new nj0(21);

    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ nj0 f52801T = new nj0(22);

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ nj0 f52802U = new nj0(23);

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ nj0 f52803V = new nj0(24);

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ nj0 f52804W = new nj0(25);

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ nj0 f52805X = new nj0(26);

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ nj0 f52806Y = new nj0(28);

    public /* synthetic */ nj0(int i) {
        this.f52818a = i;
    }

    /* JADX INFO: renamed from: j */
    public static URL m17449j(String str, Map map) {
        StringBuilder sb = new StringBuilder("https://api.web2wave.com/".concat(str));
        if (map != null) {
            sb.append("?");
            sb.append(u91.m22596N0(map.entrySet(), "&", null, null, new foa(8), 30));
        }
        return new URL(sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public static i09 m17450l(nj0 nj0Var) {
        return new i09(System.currentTimeMillis() + 3600000, new oj5(8), new g09(true, false, false), 10.0d, 1.2d, 60);
    }

    /* JADX INFO: renamed from: n */
    public static String m17451n() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        displayMetrics.getClass();
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        int i = (int) (f / f2);
        int i2 = (int) (displayMetrics.heightPixels / f2);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('x');
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m17452o() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60000;
        int i = offset / 60;
        return String.format("UTC%s%02d:%02d", Arrays.copyOf(new Object[]{i >= 0 ? "+" : "-", Integer.valueOf(Math.abs(i)), Integer.valueOf(Math.abs(offset % 60))}, 3));
    }

    /* JADX INFO: renamed from: p */
    public static String m17453p(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        uRLConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        String str = null;
        try {
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("api-key", f52798Q);
                httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
                httpURLConnection.setRequestProperty("Pragma", "no-cache");
                httpURLConnection.setRequestProperty("platform", "Android");
                httpURLConnection.setRequestProperty("screen_size", m17451n());
                httpURLConnection.setRequestProperty("timezone", m17452o());
                httpURLConnection.setRequestProperty("os_version", "Android " + Build.VERSION.RELEASE);
                if (httpURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, yu0.f70463a), 8192);
                    try {
                        String strM4066s0 = bq1.m4066s0(bufferedReader);
                        bufferedReader.close();
                        str = strM4066s0;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(bufferedReader, th);
                            throw th2;
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected response code: ");
                    sb.append(httpURLConnection.getResponseCode());
                    sb.append(", message: ");
                    sb.append(httpURLConnection.getResponseMessage());
                    sb.append(",  details: ");
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    errorStream.getClass();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream, yu0.f70463a), 8192);
                    try {
                        String strM4066s1 = bq1.m4066s0(bufferedReader2);
                        bufferedReader2.close();
                        sb.append(strM4066s1);
                        System.out.println((Object) sb.toString());
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC3584sr.m21646y(bufferedReader2, th3);
                            throw th4;
                        }
                    }
                }
                httpURLConnection.disconnect();
                return str;
            } catch (Throwable th5) {
                httpURLConnection.disconnect();
                throw th5;
            }
        } catch (Exception e) {
            System.out.println((Object) ("Request failed: " + e.getLocalizedMessage()));
            httpURLConnection.disconnect();
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final zzaew m17454q(Object obj, Object obj2) {
        zzaew zzaewVarM5436a = (zzaew) obj;
        zzaew zzaewVar = (zzaew) obj2;
        if (!zzaewVar.isEmpty()) {
            if (!zzaewVarM5436a.f11873a) {
                zzaewVarM5436a = zzaewVarM5436a.m5436a();
            }
            zzaewVarM5436a.m5437c();
            if (!zzaewVar.isEmpty()) {
                zzaewVarM5436a.putAll(zzaewVar);
            }
        }
        return zzaewVarM5436a;
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: a */
    public boolean mo10374a(SSLSocket sSLSocket) {
        return cl9.m4842Y(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p000.ad1
    /* JADX INFO: renamed from: b */
    public List mo275b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (hc1 hc1Var : componentRegistrar.getComponents()) {
            String str = hc1Var.f42153a;
            if (str != null) {
                hc1Var = new hc1(str, hc1Var.f42154b, hc1Var.f42155c, hc1Var.f42156d, hc1Var.f42157e, new r41(str, 1, hc1Var), hc1Var.f42159g);
            }
            arrayList.add(hc1Var);
        }
        return arrayList;
    }

    @Override // p000.xn2
    /* JADX INFO: renamed from: c */
    public int mo9833c(Context context, String str, boolean z) {
        return ao2.m2950d(context, str, z);
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        return obj.toString();
    }

    @Override // p000.sm9
    /* JADX INFO: renamed from: d */
    public void mo3848d(rm9 rm9Var) {
        rm9Var.clear();
    }

    @Override // p000.xn2
    /* JADX INFO: renamed from: e */
    public int mo9834e(Context context, String str) {
        return ao2.m2948a(context, str);
    }

    @Override // p000.gh0
    /* JADX INFO: renamed from: f */
    public long mo12442f(int i, pj3 pj3Var) {
        return ((rw9) pj3Var.f56314e).m20963j(i);
    }

    @Override // p000.a41
    /* JADX INFO: renamed from: g */
    public long mo100g() {
        return System.currentTimeMillis();
    }

    @Override // p000.sm9
    /* JADX INFO: renamed from: h */
    public boolean mo3852h(Object obj, Object obj2) {
        return false;
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: i */
    public jd9 mo10375i(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C3375nk(superclass);
    }

    @Override // p000.i29
    /* JADX INFO: renamed from: k */
    public i09 mo13408k(nj0 nj0Var, JSONObject jSONObject) {
        return m17450l(nj0Var);
    }

    /* JADX INFO: renamed from: m */
    public synchronized qy2 m17455m() {
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        if (w23VarM24854b == null) {
            return qy2.f58369d.m18972i();
        }
        return w23VarM24854b.f66256e;
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f52818a) {
            case 20:
                List list = z8c.f71153a;
                ((hkb) gkb.f40919b.f40920a.get()).getClass();
                return (String) hkb.f42551a.get();
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.upload.retry_interval", 51, 600000L).get();
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.backoff_period", 63, 43200000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.retry_count", 76, 6L).get()).longValue());
            case 24:
                List list5 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                return Integer.valueOf((int) ((Long) alb.f818a.m19918r("measurement.test.int_flag", 3, -2L).get()).longValue());
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
            case 26:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Boolean) xjb.f68306a.m19916p("measurement.config.bundle_for_all_apps_on_backgrounded", 2, true).get();
            default:
                List list8 = z8c.f71153a;
                return Boolean.valueOf(dlb.m10454a());
        }
    }
}
