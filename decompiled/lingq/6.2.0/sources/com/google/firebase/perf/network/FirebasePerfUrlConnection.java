package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p000.ck6;
import p000.l74;
import p000.lk6;
import p000.m74;
import p000.mba;
import p000.mk6;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) throws IOException {
        ck6 ck6Var = new ck6(url, 29);
        mba mbaVar = mba.f50883N;
        Timer timer = new Timer();
        timer.m6744c();
        long j = timer.f13787a;
        lk6 lk6Var = new lk6(mbaVar);
        try {
            URLConnection uRLConnectionM4792C = ck6Var.m4792C();
            if (uRLConnectionM4792C instanceof HttpsURLConnection) {
                return new m74((HttpsURLConnection) uRLConnectionM4792C, timer, lk6Var).f50709a.m17265b();
            }
            return uRLConnectionM4792C instanceof HttpURLConnection ? new l74((HttpURLConnection) uRLConnectionM4792C, timer, lk6Var).getContent() : uRLConnectionM4792C.getContent();
        } catch (IOException e) {
            lk6Var.m16320f(j);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16324j(ck6Var.toString());
            mk6.m16868c(lk6Var);
            throw e;
        }
    }

    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new m74((HttpsURLConnection) obj, new Timer(), new lk6(mba.f50883N));
        }
        return obj instanceof HttpURLConnection ? new l74((HttpURLConnection) obj, new Timer(), new lk6(mba.f50883N)) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        ck6 ck6Var = new ck6(url, 29);
        mba mbaVar = mba.f50883N;
        Timer timer = new Timer();
        if (!mbaVar.f50891c.get()) {
            return ck6Var.m4792C().getInputStream();
        }
        timer.m6744c();
        long j = timer.f13787a;
        lk6 lk6Var = new lk6(mbaVar);
        try {
            URLConnection uRLConnectionM4792C = ck6Var.m4792C();
            if (uRLConnectionM4792C instanceof HttpsURLConnection) {
                return new m74((HttpsURLConnection) uRLConnectionM4792C, timer, lk6Var).f50709a.m17268e();
            }
            return uRLConnectionM4792C instanceof HttpURLConnection ? new l74((HttpURLConnection) uRLConnectionM4792C, timer, lk6Var).getInputStream() : uRLConnectionM4792C.getInputStream();
        } catch (IOException e) {
            lk6Var.m16320f(j);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16324j(ck6Var.toString());
            mk6.m16868c(lk6Var);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        ck6 ck6Var = new ck6(url, 29);
        mba mbaVar = mba.f50883N;
        Timer timer = new Timer();
        timer.m6744c();
        long j = timer.f13787a;
        lk6 lk6Var = new lk6(mbaVar);
        try {
            URLConnection uRLConnectionM4792C = ck6Var.m4792C();
            if (uRLConnectionM4792C instanceof HttpsURLConnection) {
                return new m74((HttpsURLConnection) uRLConnectionM4792C, timer, lk6Var).f50709a.m17266c(clsArr);
            }
            if (uRLConnectionM4792C instanceof HttpURLConnection) {
                return new l74((HttpURLConnection) uRLConnectionM4792C, timer, lk6Var).getContent(clsArr);
            }
            return uRLConnectionM4792C.getContent(clsArr);
        } catch (IOException e) {
            lk6Var.m16320f(j);
            lk6Var.m16323i(timer.m6742a());
            lk6Var.m16324j(ck6Var.toString());
            mk6.m16868c(lk6Var);
            throw e;
        }
    }
}
