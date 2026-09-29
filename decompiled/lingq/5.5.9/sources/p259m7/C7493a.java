package p259m7;

import android.support.v4.media.session.C0166e;
import com.downloader.Priority;
import com.downloader.Status;
import com.kochava.core.BuildConfig;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Future;
import p111f7.C5473a;
import p111f7.InterfaceC5474b;
import p111f7.InterfaceC5475c;
import p133g7.C5708a;
import p216k7.C6626a;
import p216k7.C6627b;
import p216k7.RunnableC6628c;

/* JADX INFO: renamed from: m7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7493a {

    /* JADX INFO: renamed from: a */
    public final Priority f41387a;

    /* JADX INFO: renamed from: b */
    public final Object f41388b;

    /* JADX INFO: renamed from: c */
    public String f41389c;

    /* JADX INFO: renamed from: d */
    public final String f41390d;

    /* JADX INFO: renamed from: e */
    public final String f41391e;

    /* JADX INFO: renamed from: f */
    public int f41392f;

    /* JADX INFO: renamed from: g */
    public Future f41393g;

    /* JADX INFO: renamed from: h */
    public long f41394h;

    /* JADX INFO: renamed from: i */
    public long f41395i;

    /* JADX INFO: renamed from: j */
    public final int f41396j;

    /* JADX INFO: renamed from: k */
    public final int f41397k;

    /* JADX INFO: renamed from: l */
    public String f41398l;

    /* JADX INFO: renamed from: m */
    public InterfaceC5475c f41399m;

    /* JADX INFO: renamed from: n */
    public InterfaceC5474b f41400n;

    /* JADX INFO: renamed from: o */
    public int f41401o;

    /* JADX INFO: renamed from: p */
    public Status f41402p;

    /* JADX INFO: renamed from: m7.a$a */
    public class a implements Runnable {
        public a(C5473a c5473a) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7493a c7493a = C7493a.this;
            InterfaceC5474b interfaceC5474b = c7493a.f41400n;
            if (interfaceC5474b != null) {
                interfaceC5474b.mo9443a();
            }
            c7493a.f41399m = null;
            c7493a.f41400n = null;
            C6627b.m13257b().f37573a.remove(Integer.valueOf(c7493a.f41401o));
        }
    }

    /* JADX INFO: renamed from: m7.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7493a.this.getClass();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C7493a(C7497e c7497e) {
        this.f41389c = c7497e.f41408a;
        this.f41390d = c7497e.f41409b;
        this.f41391e = c7497e.f41410c;
        this.f41387a = c7497e.f41411d;
        this.f41388b = c7497e.f41412e;
        C6626a c6626a = C6626a.f37566f;
        if (c6626a.f37567a == 0) {
            synchronized (C6626a.class) {
                if (c6626a.f37567a == 0) {
                    c6626a.f37567a = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;
                }
            }
        }
        this.f41396j = c6626a.f37567a;
        if (c6626a.f37568b == 0) {
            synchronized (C6626a.class) {
                if (c6626a.f37568b == 0) {
                    c6626a.f37568b = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;
                }
            }
        }
        this.f41397k = c6626a.f37568b;
        this.f41398l = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m14889a(C5473a c5473a) {
        if (this.f41402p != Status.CANCELLED) {
            this.f41402p = Status.FAILED;
            C5708a.m12072a().f34717a.f34721c.execute(new a(c5473a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14890b() {
        if (this.f41402p != Status.CANCELLED) {
            C5708a.m12072a().f34717a.f34721c.execute(new b());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m14891c(InterfaceC5474b interfaceC5474b) {
        this.f41400n = interfaceC5474b;
        StringBuilder sbM771r = C0166e.m771r(this.f41389c);
        String str = File.separator;
        sbM771r.append(str);
        sbM771r.append(this.f41390d);
        sbM771r.append(str);
        sbM771r.append(this.f41391e);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(sbM771r.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i10));
            }
            this.f41401o = sb2.toString().hashCode();
            C6627b c6627bM13257b = C6627b.m13257b();
            c6627bM13257b.f37573a.put(Integer.valueOf(this.f41401o), this);
            this.f41402p = Status.QUEUED;
            this.f41392f = c6627bM13257b.f37574b.incrementAndGet();
            this.f41393g = C5708a.m12072a().f34717a.f34719a.submit(new RunnableC6628c(this));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UnsupportedEncodingException", e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("NoSuchAlgorithmException", e11);
        }
    }
}
