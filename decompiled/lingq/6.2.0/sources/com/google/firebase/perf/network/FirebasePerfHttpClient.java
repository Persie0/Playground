package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p000.lk6;
import p000.mba;
import p000.mk6;
import p000.o74;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            lk6Var.m16317c(httpRequest.getRequestLine().getMethod());
            Long lM16866a = mk6.m16866a(httpRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16318d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM16866a2 = mk6.m16866a(httpResponseExecute);
            if (lM16866a2 != null) {
                lk6Var.m16322h(lM16866a2.longValue());
            }
            String strM16867b = mk6.m16867b(httpResponseExecute);
            if (strM16867b != null) {
                lk6Var.m16321g(strM16867b);
            }
            lk6Var.m16316b();
            return httpResponseExecute;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpUriRequest.getURI().toString());
            lk6Var.m16317c(httpUriRequest.getMethod());
            Long lM16866a = mk6.m16866a(httpUriRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16318d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM16866a2 = mk6.m16866a(httpResponseExecute);
            if (lM16866a2 != null) {
                lk6Var.m16322h(lM16866a2.longValue());
            }
            String strM16867b = mk6.m16867b(httpResponseExecute);
            if (strM16867b != null) {
                lk6Var.m16321g(strM16867b);
            }
            lk6Var.m16316b();
            return httpResponseExecute;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpUriRequest.getURI().toString());
            lk6Var.m16317c(httpUriRequest.getMethod());
            Long lM16866a = mk6.m16866a(httpUriRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            return (T) httpClient.execute(httpUriRequest, new o74(responseHandler, timer, lk6Var));
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpUriRequest.getURI().toString());
            lk6Var.m16317c(httpUriRequest.getMethod());
            Long lM16866a = mk6.m16866a(httpUriRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            return (T) httpClient.execute(httpUriRequest, new o74(responseHandler, timer, lk6Var), httpContext);
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpUriRequest.getURI().toString());
            lk6Var.m16317c(httpUriRequest.getMethod());
            Long lM16866a = mk6.m16866a(httpUriRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16318d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM16866a2 = mk6.m16866a(httpResponseExecute);
            if (lM16866a2 != null) {
                lk6Var.m16322h(lM16866a2.longValue());
            }
            String strM16867b = mk6.m16867b(httpResponseExecute);
            if (strM16867b != null) {
                lk6Var.m16321g(strM16867b);
            }
            lk6Var.m16316b();
            return httpResponseExecute;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            lk6Var.m16317c(httpRequest.getRequestLine().getMethod());
            Long lM16866a = mk6.m16866a(httpRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16318d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM16866a2 = mk6.m16866a(httpResponseExecute);
            if (lM16866a2 != null) {
                lk6Var.m16322h(lM16866a2.longValue());
            }
            String strM16867b = mk6.m16867b(httpResponseExecute);
            if (strM16867b != null) {
                lk6Var.m16321g(strM16867b);
            }
            lk6Var.m16316b();
            return httpResponseExecute;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            lk6Var.m16317c(httpRequest.getRequestLine().getMethod());
            Long lM16866a = mk6.m16866a(httpRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            return (T) httpClient.execute(httpHost, httpRequest, new o74(responseHandler, timer, lk6Var));
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        lk6 lk6Var = new lk6(mba.f50883N);
        try {
            lk6Var.m16324j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            lk6Var.m16317c(httpRequest.getRequestLine().getMethod());
            Long lM16866a = mk6.m16866a(httpRequest);
            if (lM16866a != null) {
                lk6Var.m16319e(lM16866a.longValue());
            }
            timer.m6744c();
            lk6Var.m16320f(timer.f13787a);
            return (T) httpClient.execute(httpHost, httpRequest, new o74(responseHandler, timer, lk6Var), httpContext);
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }
}
