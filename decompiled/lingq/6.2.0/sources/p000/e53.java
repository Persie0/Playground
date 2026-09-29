package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.p010v1.NetworkRequestMetric$HttpMethod;
import java.net.URI;

/* JADX INFO: loaded from: classes.dex */
public final class e53 extends z67 {

    /* JADX INFO: renamed from: d */
    public static final C3723wi f36721d = C3723wi.m23970d();

    /* JADX INFO: renamed from: b */
    public final kk6 f36722b;

    /* JADX INFO: renamed from: c */
    public final Context f36723c;

    public e53(kk6 kk6Var, Context context) {
        this.f36723c = context;
        this.f36722b = kk6Var;
    }

    @Override // p000.z67
    /* JADX INFO: renamed from: a */
    public final boolean mo3300a() {
        URI uriCreate;
        kk6 kk6Var = this.f36722b;
        String strM15317P = kk6Var.m15317P();
        boolean zIsEmpty = strM15317P == null ? true : strM15317P.trim().isEmpty();
        C3723wi c3723wi = f36721d;
        if (zIsEmpty) {
            c3723wi.m23975f("URL is missing:" + kk6Var.m15317P());
            return false;
        }
        String strM15317P2 = kk6Var.m15317P();
        if (strM15317P2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strM15317P2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                c3723wi.m23976g("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            c3723wi.m23975f("URL cannot be parsed");
            return false;
        }
        Context context = this.f36723c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            C3723wi.m23970d().m23971a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (uea.f63814a == null) {
                uea.f63814a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = uea.f63814a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        c3723wi.m23975f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            c3723wi.m23975f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            c3723wi.m23975f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            c3723wi.m23975f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            c3723wi.m23975f("URL port is less than or equal to 0");
            return false;
        }
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethodM15309H = kk6Var.m15319R() ? kk6Var.m15309H() : null;
        if (networkRequestMetric$HttpMethodM15309H == null || networkRequestMetric$HttpMethodM15309H == NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN) {
            c3723wi.m23975f("HTTP Method is null or invalid: " + kk6Var.m15309H());
            return false;
        }
        if (kk6Var.m15320S() && kk6Var.m15310I() <= 0) {
            c3723wi.m23975f("HTTP ResponseCode is a negative value:" + kk6Var.m15310I());
            return false;
        }
        if (kk6Var.m15321T() && kk6Var.m15312K() < 0) {
            c3723wi.m23975f("Request Payload is a negative value:" + kk6Var.m15312K());
            return false;
        }
        if (kk6Var.m15322U() && kk6Var.m15313L() < 0) {
            c3723wi.m23975f("Response Payload is a negative value:" + kk6Var.m15313L());
            return false;
        }
        if (!kk6Var.m15318Q() || kk6Var.m15308F() <= 0) {
            c3723wi.m23975f("Start time of the request is null, or zero, or a negative value:" + kk6Var.m15308F());
            return false;
        }
        if (kk6Var.m15323V() && kk6Var.m15314M() < 0) {
            c3723wi.m23975f("Time to complete the request is a negative value:" + kk6Var.m15314M());
            return false;
        }
        if (kk6Var.m15325X() && kk6Var.m15316O() < 0) {
            c3723wi.m23975f("Time from the start of the request to the start of the response is null or a negative value:" + kk6Var.m15316O());
            return false;
        }
        if (!kk6Var.m15324W() || kk6Var.m15315N() <= 0) {
            c3723wi.m23975f("Time from the start of the request to the end of the response is null, negative or zero:" + kk6Var.m15315N());
            return false;
        }
        if (kk6Var.m15320S()) {
            return true;
        }
        c3723wi.m23975f("Did not receive a HTTP Response Code");
        return false;
    }
}
