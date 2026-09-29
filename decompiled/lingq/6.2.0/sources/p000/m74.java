package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class m74 extends HttpsURLConnection {

    /* JADX INFO: renamed from: a */
    public final n74 f50709a;

    /* JADX INFO: renamed from: b */
    public final HttpsURLConnection f50710b;

    public m74(HttpsURLConnection httpsURLConnection, Timer timer, lk6 lk6Var) {
        super(httpsURLConnection.getURL());
        this.f50710b = httpsURLConnection;
        this.f50709a = new n74(httpsURLConnection, timer, lk6Var);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f50709a.f52434a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f50709a.m17264a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        n74 n74Var = this.f50709a;
        lk6 lk6Var = n74Var.f52435b;
        lk6Var.m16323i(n74Var.f52438e.m6742a());
        lk6Var.m16316b();
        n74Var.f52434a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f50709a.f52434a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f50709a.f52434a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f50710b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f50709a.f52434a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f50709a.m17265b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f50709a.f52434a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f50709a.f52434a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f50709a.f52434a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f50709a.m17267d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f50710b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f50709a.f52434a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f50709a.m17268e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f50709a.f52434a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f50710b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f50710b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f50709a.m17269f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f50710b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        n74 n74Var = this.f50709a;
        lk6 lk6Var = n74Var.f52435b;
        try {
            return n74Var.f52434a.getPermission();
        } catch (IOException e) {
            wq1.m24129y(n74Var.f52438e, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f50709a.f52434a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f50709a.f52434a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f50709a.f52434a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f50709a.f52434a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f50709a.m17270g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f50709a.m17271h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f50710b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f50710b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f50709a.f52434a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f50709a.f52434a.getUseCaches();
    }

    public final int hashCode() {
        return this.f50709a.f52434a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f50709a.f52434a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f50709a.f52434a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f50709a.f52434a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f50709a.f52434a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f50709a.f52434a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f50709a.f52434a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f50709a.f52434a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f50710b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f50709a.f52434a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f50709a.f52434a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f50709a.f52434a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f50709a.f52434a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        n74 n74Var = this.f50709a;
        n74Var.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            n74Var.f52435b.f49772f = str2;
        }
        n74Var.f52434a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f50710b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f50709a.f52434a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f50709a.f52434a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f50709a.f52434a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f50709a.m17266c(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f50709a.f52434a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        n74 n74Var = this.f50709a;
        n74Var.m17272i();
        return n74Var.f52434a.getHeaderField(str);
    }
}
