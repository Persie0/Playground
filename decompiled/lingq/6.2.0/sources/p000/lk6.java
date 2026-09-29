package p000;

import com.google.firebase.perf.p010v1.NetworkRequestMetric$HttpMethod;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lk6 extends AbstractC3696vs implements oy8 {

    /* JADX INFO: renamed from: h */
    public static final C3723wi f49766h = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final List f49767a;

    /* JADX INFO: renamed from: b */
    public final GaugeManager f49768b;

    /* JADX INFO: renamed from: c */
    public final mba f49769c;

    /* JADX INFO: renamed from: d */
    public final ik6 f49770d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f49771e;

    /* JADX INFO: renamed from: f */
    public String f49772f;

    /* JADX INFO: renamed from: g */
    public boolean f49773g;

    /* JADX WARN: Illegal instructions before constructor call */
    public lk6(mba mbaVar) {
        C3659us c3659usM22881a = C3659us.m22881a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(c3659usM22881a);
        this.f49770d = kk6.m15299Y();
        this.f49771e = new WeakReference(this);
        this.f49769c = mbaVar;
        this.f49768b = gaugeManager;
        this.f49767a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // p000.oy8
    /* JADX INFO: renamed from: a */
    public final void mo6730a(PerfSession perfSession) {
        if (perfSession == null) {
            f49766h.m23975f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        ik6 ik6Var = this.f49770d;
        if (!((kk6) ik6Var.f64019b).m15318Q() || ((kk6) ik6Var.f64019b).m15324W()) {
            return;
        }
        this.f49767a.add(perfSession);
    }

    /* JADX INFO: renamed from: b */
    public final void m16316b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f49771e);
        unregisterForAppState();
        synchronized (this.f49767a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f49767a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        c77[] c77VarArrM6733b = PerfSession.m6733b(listUnmodifiableList);
        if (c77VarArrM6733b != null) {
            ik6 ik6Var = this.f49770d;
            List listAsList = Arrays.asList(c77VarArrM6733b);
            ik6Var.m22767h();
            kk6.m15294B((kk6) ik6Var.f64019b, listAsList);
        }
        kk6 kk6Var = (kk6) this.f49770d.m22766g();
        String str = this.f49772f;
        if (str == null) {
            Pattern pattern = mk6.f51438a;
        } else if (mk6.f51438a.matcher(str).matches()) {
            f49766h.m23971a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.f49773g) {
            return;
        }
        mba mbaVar = this.f49769c;
        mbaVar.f50897i.execute(new yg1(mbaVar, kk6Var, getAppState(), 6));
        this.f49773g = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m16317c(String str) {
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod;
        if (str != null) {
            NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod2 = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.OPTIONS;
                    break;
                case "GET":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.GET;
                    break;
                case "PUT":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.PUT;
                    break;
                case "HEAD":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.HEAD;
                    break;
                case "POST":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.POST;
                    break;
                case "PATCH":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.PATCH;
                    break;
                case "TRACE":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.TRACE;
                    break;
                case "CONNECT":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.CONNECT;
                    break;
                case "DELETE":
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.DELETE;
                    break;
                default:
                    networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            ik6 ik6Var = this.f49770d;
            ik6Var.m22767h();
            kk6.m15295C((kk6) ik6Var.f64019b, networkRequestMetric$HttpMethod);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16318d(int i) {
        ik6 ik6Var = this.f49770d;
        ik6Var.m22767h();
        kk6.m15302u((kk6) ik6Var.f64019b, i);
    }

    /* JADX INFO: renamed from: e */
    public final void m16319e(long j) {
        ik6 ik6Var = this.f49770d;
        ik6Var.m22767h();
        kk6.m15296D((kk6) ik6Var.f64019b, j);
    }

    /* JADX INFO: renamed from: f */
    public final void m16320f(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f49771e);
        ik6 ik6Var = this.f49770d;
        ik6Var.m22767h();
        kk6.m15305x((kk6) ik6Var.f64019b, j);
        mo6730a(perfSession);
        if (perfSession.f13786c) {
            this.f49768b.collectGaugeMetricOnce(perfSession.f13785b);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16321g(String str) {
        ik6 ik6Var = this.f49770d;
        if (str == null) {
            ik6Var.m22767h();
            kk6.m15304w((kk6) ik6Var.f64019b);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            ik6Var.m22767h();
            kk6.m15303v((kk6) ik6Var.f64019b, str);
            return;
        }
        f49766h.m23975f("The content type of the response is not a valid content-type:".concat(str));
    }

    /* JADX INFO: renamed from: h */
    public final void m16322h(long j) {
        ik6 ik6Var = this.f49770d;
        ik6Var.m22767h();
        kk6.m15297E((kk6) ik6Var.f64019b, j);
    }

    /* JADX INFO: renamed from: i */
    public final void m16323i(long j) {
        ik6 ik6Var = this.f49770d;
        ik6Var.m22767h();
        kk6.m15293A((kk6) ik6Var.f64019b, j);
        if (SessionManager.getInstance().perfSession().f13786c) {
            this.f49768b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f13785b);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16324j(String str) {
        ex3 ex3VarM10734a;
        int iLastIndexOf;
        if (str != null) {
            ex3 ex3VarM10734a2 = null;
            try {
                dx3 dx3Var = new dx3();
                dx3Var.m10737d(null, str);
                ex3VarM10734a = dx3Var.m10734a();
            } catch (IllegalArgumentException unused) {
                ex3VarM10734a = null;
            }
            if (ex3VarM10734a != null) {
                dx3 dx3VarM11381g = ex3VarM10734a.m11381g();
                dx3VarM11381g.f36360b = xwc.m24770i("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
                dx3VarM11381g.f36361c = xwc.m24770i("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
                dx3VarM11381g.f36365g = null;
                dx3VarM11381g.f36366h = null;
                str = dx3VarM11381g.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        dx3 dx3Var2 = new dx3();
                        dx3Var2.m10737d(null, str);
                        ex3VarM10734a2 = dx3Var2.m10734a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (ex3VarM10734a2 != null && ex3VarM10734a2.m11376b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            ik6 ik6Var = this.f49770d;
            ik6Var.m22767h();
            kk6.m15300s((kk6) ik6Var.f64019b, str);
        }
    }
}
