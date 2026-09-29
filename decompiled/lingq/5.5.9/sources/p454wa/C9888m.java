package p454wa;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: wa.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9888m implements InterfaceC9882g {

    /* JADX INFO: renamed from: a */
    public final Context f50478a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f50479b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9882g f50480c;

    /* JADX INFO: renamed from: d */
    public FileDataSource f50481d;

    /* JADX INFO: renamed from: e */
    public AssetDataSource f50482e;

    /* JADX INFO: renamed from: f */
    public ContentDataSource f50483f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9882g f50484g;

    /* JADX INFO: renamed from: h */
    public UdpDataSource f50485h;

    /* JADX INFO: renamed from: i */
    public C9881f f50486i;

    /* JADX INFO: renamed from: j */
    public RawResourceDataSource f50487j;

    /* JADX INFO: renamed from: k */
    public InterfaceC9882g f50488k;

    /* JADX INFO: renamed from: wa.m$a */
    public static final class a implements InterfaceC9882g.a {

        /* JADX INFO: renamed from: a */
        public final Context f50489a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9882g.a f50490b;

        public a(Context context, C9889n.a aVar) {
            this.f50489a = context.getApplicationContext();
            this.f50490b = aVar;
        }

        @Override // p454wa.InterfaceC9882g.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9882g mo14771a() {
            return new C9888m(this.f50489a, this.f50490b.mo14771a());
        }
    }

    public C9888m(Context context, InterfaceC9882g interfaceC9882g) {
        this.f50478a = context.getApplicationContext();
        interfaceC9882g.getClass();
        this.f50480c = interfaceC9882g;
        this.f50479b = new ArrayList();
    }

    /* JADX INFO: renamed from: o */
    public static void m18390o(InterfaceC9882g interfaceC9882g, InterfaceC9894s interfaceC9894s) {
        if (interfaceC9882g != null) {
            interfaceC9882g.mo7274g(interfaceC9894s);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9882g
    public final void close() throws IOException {
        InterfaceC9882g interfaceC9882g = this.f50488k;
        if (interfaceC9882g != null) {
            try {
                interfaceC9882g.close();
                this.f50488k = null;
            } catch (Throwable th2) {
                this.f50488k = null;
                throw th2;
            }
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws IOException {
        boolean z10 = true;
        C10129a.m18992d(this.f50488k == null);
        String scheme = c9884i.f50436a.getScheme();
        int i10 = C10134c0.f51354a;
        Uri uri = c9884i.f50436a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2)) {
            z10 = "file".equals(scheme2);
        }
        Context context = this.f50478a;
        if (z10) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f50481d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f50481d = fileDataSource;
                    m18391n(fileDataSource);
                }
                this.f50488k = this.f50481d;
            } else {
                if (this.f50482e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f50482e = assetDataSource;
                    m18391n(assetDataSource);
                }
                this.f50488k = this.f50482e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f50482e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f50482e = assetDataSource2;
                m18391n(assetDataSource2);
            }
            this.f50488k = this.f50482e;
        } else if ("content".equals(scheme)) {
            if (this.f50483f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f50483f = contentDataSource;
                m18391n(contentDataSource);
            }
            this.f50488k = this.f50483f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC9882g interfaceC9882g = this.f50480c;
            if (zEquals) {
                if (this.f50484g == null) {
                    try {
                        InterfaceC9882g interfaceC9882g2 = (InterfaceC9882g) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f50484g = interfaceC9882g2;
                        m18391n(interfaceC9882g2);
                    } catch (ClassNotFoundException unused) {
                        C10145n.m19099g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f50484g == null) {
                        this.f50484g = interfaceC9882g;
                    }
                }
                this.f50488k = this.f50484g;
            } else if ("udp".equals(scheme)) {
                if (this.f50485h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f50485h = udpDataSource;
                    m18391n(udpDataSource);
                }
                this.f50488k = this.f50485h;
            } else if ("data".equals(scheme)) {
                if (this.f50486i == null) {
                    C9881f c9881f = new C9881f();
                    this.f50486i = c9881f;
                    m18391n(c9881f);
                }
                this.f50488k = this.f50486i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f50487j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f50487j = rawResourceDataSource;
                    m18391n(rawResourceDataSource);
                }
                this.f50488k = this.f50487j;
            } else {
                this.f50488k = interfaceC9882g;
            }
        }
        return this.f50488k.mo7273e(c9884i);
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: g */
    public final void mo7274g(InterfaceC9894s interfaceC9894s) {
        interfaceC9894s.getClass();
        this.f50480c.mo7274g(interfaceC9894s);
        this.f50479b.add(interfaceC9894s);
        m18390o(this.f50481d, interfaceC9894s);
        m18390o(this.f50482e, interfaceC9894s);
        m18390o(this.f50483f, interfaceC9894s);
        m18390o(this.f50484g, interfaceC9894s);
        m18390o(this.f50485h, interfaceC9894s);
        m18390o(this.f50486i, interfaceC9894s);
        m18390o(this.f50487j, interfaceC9894s);
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> mo7275h() {
        InterfaceC9882g interfaceC9882g = this.f50488k;
        return interfaceC9882g == null ? Collections.emptyMap() : interfaceC9882g.mo7275h();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        InterfaceC9882g interfaceC9882g = this.f50488k;
        if (interfaceC9882g == null) {
            return null;
        }
        return interfaceC9882g.mo7276k();
    }

    /* JADX INFO: renamed from: n */
    public final void m18391n(InterfaceC9882g interfaceC9882g) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50479b;
            if (i10 >= arrayList.size()) {
                return;
            }
            interfaceC9882g.mo7274g((InterfaceC9894s) arrayList.get(i10));
            i10++;
        }
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        InterfaceC9882g interfaceC9882g = this.f50488k;
        interfaceC9882g.getClass();
        return interfaceC9882g.read(bArr, i10, i11);
    }
}
