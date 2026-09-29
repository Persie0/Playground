package p000;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class o74 implements ResponseHandler {

    /* JADX INFO: renamed from: a */
    public final ResponseHandler f53930a;

    /* JADX INFO: renamed from: b */
    public final Timer f53931b;

    /* JADX INFO: renamed from: c */
    public final lk6 f53932c;

    public o74(ResponseHandler responseHandler, Timer timer, lk6 lk6Var) {
        this.f53930a = responseHandler;
        this.f53931b = timer;
        this.f53932c = lk6Var;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f53932c.m16323i(this.f53931b.m6742a());
        this.f53932c.m16318d(httpResponse.getStatusLine().getStatusCode());
        Long lM16866a = mk6.m16866a(httpResponse);
        if (lM16866a != null) {
            this.f53932c.m16322h(lM16866a.longValue());
        }
        String strM16867b = mk6.m16867b(httpResponse);
        if (strM16867b != null) {
            this.f53932c.m16321g(strM16867b);
        }
        this.f53932c.m16316b();
        return this.f53930a.handleResponse(httpResponse);
    }
}
