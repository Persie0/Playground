package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class n74 {

    /* JADX INFO: renamed from: f */
    public static final C3723wi f52433f = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f52434a;

    /* JADX INFO: renamed from: b */
    public final lk6 f52435b;

    /* JADX INFO: renamed from: c */
    public long f52436c = -1;

    /* JADX INFO: renamed from: d */
    public long f52437d = -1;

    /* JADX INFO: renamed from: e */
    public final Timer f52438e;

    public n74(HttpURLConnection httpURLConnection, Timer timer, lk6 lk6Var) {
        this.f52434a = httpURLConnection;
        this.f52435b = lk6Var;
        this.f52438e = timer;
        lk6Var.m16324j(httpURLConnection.getURL().toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m17264a() {
        long j = this.f52436c;
        lk6 lk6Var = this.f52435b;
        Timer timer = this.f52438e;
        if (j == -1) {
            timer.m6744c();
            long j2 = timer.f13787a;
            this.f52436c = j2;
            lk6Var.m16320f(j2);
        }
        try {
            this.f52434a.connect();
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m17265b() throws IOException {
        Timer timer = this.f52438e;
        m17272i();
        HttpURLConnection httpURLConnection = this.f52434a;
        int responseCode = httpURLConnection.getResponseCode();
        lk6 lk6Var = this.f52435b;
        lk6Var.m16318d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                lk6Var.m16321g(httpURLConnection.getContentType());
                return new j74((InputStream) content, lk6Var, timer);
            }
            lk6Var.m16321g(httpURLConnection.getContentType());
            lk6Var.m16322h(httpURLConnection.getContentLength());
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16316b();
            return content;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m17266c(Class[] clsArr) throws IOException {
        Timer timer = this.f52438e;
        m17272i();
        HttpURLConnection httpURLConnection = this.f52434a;
        int responseCode = httpURLConnection.getResponseCode();
        lk6 lk6Var = this.f52435b;
        lk6Var.m16318d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                lk6Var.m16321g(httpURLConnection.getContentType());
                return new j74((InputStream) content, lk6Var, timer);
            }
            lk6Var.m16321g(httpURLConnection.getContentType());
            lk6Var.m16322h(httpURLConnection.getContentLength());
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16316b();
            return content;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputStream m17267d() {
        HttpURLConnection httpURLConnection = this.f52434a;
        lk6 lk6Var = this.f52435b;
        m17272i();
        try {
            lk6Var.m16318d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f52433f.m23971a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new j74(errorStream, lk6Var, this.f52438e) : errorStream;
    }

    /* JADX INFO: renamed from: e */
    public final InputStream m17268e() throws IOException {
        Timer timer = this.f52438e;
        m17272i();
        HttpURLConnection httpURLConnection = this.f52434a;
        int responseCode = httpURLConnection.getResponseCode();
        lk6 lk6Var = this.f52435b;
        lk6Var.m16318d(responseCode);
        lk6Var.m16321g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new j74(inputStream, lk6Var, timer) : inputStream;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f52434a.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final OutputStream m17269f() throws IOException {
        Timer timer = this.f52438e;
        lk6 lk6Var = this.f52435b;
        try {
            OutputStream outputStream = this.f52434a.getOutputStream();
            return outputStream != null ? new k74(outputStream, lk6Var, timer) : outputStream;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m17270g() throws IOException {
        m17272i();
        long j = this.f52437d;
        Timer timer = this.f52438e;
        lk6 lk6Var = this.f52435b;
        if (j == -1) {
            long jM6742a = timer.m6742a();
            this.f52437d = jM6742a;
            ik6 ik6Var = lk6Var.f49770d;
            ik6Var.m22767h();
            kk6.m15307z((kk6) ik6Var.f64019b, jM6742a);
        }
        try {
            int responseCode = this.f52434a.getResponseCode();
            lk6Var.m16318d(responseCode);
            return responseCode;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m17271h() throws IOException {
        HttpURLConnection httpURLConnection = this.f52434a;
        m17272i();
        long j = this.f52437d;
        Timer timer = this.f52438e;
        lk6 lk6Var = this.f52435b;
        if (j == -1) {
            long jM6742a = timer.m6742a();
            this.f52437d = jM6742a;
            ik6 ik6Var = lk6Var.f49770d;
            ik6Var.m22767h();
            kk6.m15307z((kk6) ik6Var.f64019b, jM6742a);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            lk6Var.m16318d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f52434a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m17272i() {
        long j = this.f52436c;
        lk6 lk6Var = this.f52435b;
        if (j == -1) {
            Timer timer = this.f52438e;
            timer.m6744c();
            long j2 = timer.f13787a;
            this.f52436c = j2;
            lk6Var.m16320f(j2);
        }
        HttpURLConnection httpURLConnection = this.f52434a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            lk6Var.m16317c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            lk6Var.m16317c("POST");
        } else {
            lk6Var.m16317c("GET");
        }
    }

    public final String toString() {
        return this.f52434a.toString();
    }
}
