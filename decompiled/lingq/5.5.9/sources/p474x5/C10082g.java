package p474x5;

import ae.C0062b;
import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: x5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10082g implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC10083h f51156b;

    /* JADX INFO: renamed from: c */
    public final URL f51157c;

    /* JADX INFO: renamed from: d */
    public final String f51158d;

    /* JADX INFO: renamed from: e */
    public String f51159e;

    /* JADX INFO: renamed from: f */
    public URL f51160f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f51161g;

    /* JADX INFO: renamed from: h */
    public int f51162h;

    public C10082g(String str) {
        C10085j c10085j = InterfaceC10083h.f51163a;
        this.f51157c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f51158d = str;
        C0062b.m345f0(c10085j);
        this.f51156b = c10085j;
    }

    public C10082g(URL url) {
        C10085j c10085j = InterfaceC10083h.f51163a;
        C0062b.m345f0(url);
        this.f51157c = url;
        this.f51158d = null;
        C0062b.m345f0(c10085j);
        this.f51156b = c10085j;
    }

    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        if (this.f51161g == null) {
            this.f51161g = m18932c().getBytes(InterfaceC8732b.f46324a);
        }
        messageDigest.update(this.f51161g);
    }

    /* JADX INFO: renamed from: c */
    public final String m18932c() {
        String str = this.f51158d;
        if (str != null) {
            return str;
        }
        URL url = this.f51157c;
        C0062b.m345f0(url);
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public final URL m18933d() throws MalformedURLException {
        if (this.f51160f == null) {
            if (TextUtils.isEmpty(this.f51159e)) {
                String string = this.f51158d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f51157c;
                    C0062b.m345f0(url);
                    string = url.toString();
                }
                this.f51159e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f51160f = new URL(this.f51159e);
        }
        return this.f51160f;
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C10082g)) {
            return false;
        }
        C10082g c10082g = (C10082g) obj;
        return m18932c().equals(c10082g.m18932c()) && this.f51156b.equals(c10082g.f51156b);
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        if (this.f51162h == 0) {
            int iHashCode = m18932c().hashCode();
            this.f51162h = iHashCode;
            this.f51162h = this.f51156b.hashCode() + (iHashCode * 31);
        }
        return this.f51162h;
    }

    public final String toString() {
        return m18932c();
    }
}
