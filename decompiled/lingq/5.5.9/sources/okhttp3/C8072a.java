package okhttp3;

import cm.InterfaceC2041a;
import dm.C5206f;
import dm.C5207g;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.C7076b;
import mo.C7661i;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;
import p034bp.C1640h;
import p124fp.AbstractC5611h;
import p124fp.AbstractC5612i;
import p124fp.C5608e;
import p124fp.C5608e.a;
import p124fp.C5617n;
import p124fp.C5621r;
import p124fp.C5622s;
import p124fp.InterfaceC5610g;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import p422uo.InterfaceC9599c;
import p442vo.C9768d;
import p493xo.C10269i;
import sl.C9072e;
import so.AbstractC9107y;
import so.C9088f;
import so.C9095m;
import so.C9096n;
import so.C9098p;
import so.C9101s;
import so.C9106x;
import to.C9347b;

/* JADX INFO: renamed from: okhttp3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8072a implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final DiskLruCache f43782a;

    /* JADX INFO: renamed from: okhttp3.a$a */
    public static final class a extends AbstractC9107y {

        /* JADX INFO: renamed from: b */
        public final DiskLruCache.C8075b f43783b;

        /* JADX INFO: renamed from: c */
        public final String f43784c;

        /* JADX INFO: renamed from: d */
        public final String f43785d;

        /* JADX INFO: renamed from: e */
        public final C5622s f43786e;

        /* JADX INFO: renamed from: okhttp3.a$a$a, reason: collision with other inner class name */
        public static final class C10665a extends AbstractC5612i {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5627x f43787b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a f43788c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10665a(InterfaceC5627x interfaceC5627x, a aVar) {
                super(interfaceC5627x);
                this.f43787b = interfaceC5627x;
                this.f43788c = aVar;
            }

            @Override // p124fp.AbstractC5612i, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.f43788c.f43783b.close();
                super.close();
            }
        }

        public a(DiskLruCache.C8075b c8075b, String str, String str2) {
            this.f43783b = c8075b;
            this.f43784c = str;
            this.f43785d = str2;
            this.f43786e = C5617n.m11991c(new C10665a(c8075b.f43855c.get(1), this));
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: b */
        public final long mo13136b() {
            String str = this.f43785d;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = C9347b.f48082a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: l */
        public final C9098p mo13137l() {
            String str = this.f43784c;
            if (str == null) {
                return null;
            }
            Pattern pattern = C9098p.f47473d;
            try {
                return C9098p.a.m17339a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: q */
        public final InterfaceC5610g mo13138q() {
            return this.f43786e;
        }
    }

    /* JADX INFO: renamed from: okhttp3.a$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static String m15942a(C9096n c9096n) {
            C5207g.m11111f(c9096n, "url");
            ByteString byteString = ByteString.f43897d;
            return ByteString.C8082a.m16001c(c9096n.f47463i).mo15991l("MD5").mo15993s();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public static int m15943b(C5622s c5622s) throws IOException {
            try {
                long jM12000b = c5622s.m12000b();
                String strMo11938M0 = c5622s.mo11938M0();
                if (jM12000b >= 0 && jM12000b <= 2147483647L) {
                    if (!(strMo11938M0.length() > 0)) {
                        return (int) jM12000b;
                    }
                }
                throw new IOException("expected an int but was \"" + jM12000b + strMo11938M0 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public static Set m15944c(C9095m c9095m) {
            int length = c9095m.f47452a.length / 2;
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                if (C7661i.m15249O2("Vary", c9095m.m17306f(i10))) {
                    String strM17309l = c9095m.m17309l(i10);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        C5207g.m11110e(comparator, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = C7076b.m14298r3(strM17309l, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(C7076b.m14277B3((String) it.next()).toString());
                    }
                }
                i10 = i11;
            }
            return treeSet == null ? EmptySet.f38034a : treeSet;
        }
    }

    /* JADX INFO: renamed from: okhttp3.a$c */
    public static final class c {

        /* JADX INFO: renamed from: k */
        public static final String f43789k;

        /* JADX INFO: renamed from: l */
        public static final String f43790l;

        /* JADX INFO: renamed from: a */
        public final C9096n f43791a;

        /* JADX INFO: renamed from: b */
        public final C9095m f43792b;

        /* JADX INFO: renamed from: c */
        public final String f43793c;

        /* JADX INFO: renamed from: d */
        public final Protocol f43794d;

        /* JADX INFO: renamed from: e */
        public final int f43795e;

        /* JADX INFO: renamed from: f */
        public final String f43796f;

        /* JADX INFO: renamed from: g */
        public final C9095m f43797g;

        /* JADX INFO: renamed from: h */
        public final Handshake f43798h;

        /* JADX INFO: renamed from: i */
        public final long f43799i;

        /* JADX INFO: renamed from: j */
        public final long f43800j;

        static {
            C1640h c1640h = C1640h.f9199a;
            C1640h.f9199a.getClass();
            f43789k = C5207g.m11116k("-Sent-Millis", "OkHttp");
            C1640h.f9199a.getClass();
            f43790l = C5207g.m11116k("-Received-Millis", "OkHttp");
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public c(InterfaceC5627x interfaceC5627x) throws IOException {
            C9096n c9096nM17328a;
            TlsVersion tlsVersionM15940a;
            C5207g.m11111f(interfaceC5627x, "rawSource");
            try {
                C5622s c5622sM11991c = C5617n.m11991c(interfaceC5627x);
                String strMo11938M0 = c5622sM11991c.mo11938M0();
                try {
                    C9096n.a aVar = new C9096n.a();
                    aVar.m17331d(null, strMo11938M0);
                    c9096nM17328a = aVar.m17328a();
                } catch (IllegalArgumentException unused) {
                    c9096nM17328a = null;
                }
                if (c9096nM17328a == null) {
                    IOException iOException = new IOException(C5207g.m11116k(strMo11938M0, "Cache corruption for "));
                    C1640h c1640h = C1640h.f9199a;
                    C1640h.f9199a.getClass();
                    C1640h.m5333i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f43791a = c9096nM17328a;
                this.f43793c = c5622sM11991c.mo11938M0();
                C9095m.a aVar2 = new C9095m.a();
                int iM15943b = b.m15943b(c5622sM11991c);
                boolean z10 = false;
                int i10 = 0;
                while (i10 < iM15943b) {
                    i10++;
                    aVar2.m17312b(c5622sM11991c.mo11938M0());
                }
                this.f43792b = aVar2.m17314d();
                C10269i c10269iM19239a = C10269i.a.m19239a(c5622sM11991c.mo11938M0());
                this.f43794d = c10269iM19239a.f51710a;
                this.f43795e = c10269iM19239a.f51711b;
                this.f43796f = c10269iM19239a.f51712c;
                C9095m.a aVar3 = new C9095m.a();
                int iM15943b2 = b.m15943b(c5622sM11991c);
                int i11 = 0;
                while (i11 < iM15943b2) {
                    i11++;
                    aVar3.m17312b(c5622sM11991c.mo11938M0());
                }
                String str = f43789k;
                String strM17315e = aVar3.m17315e(str);
                String str2 = f43790l;
                String strM17315e2 = aVar3.m17315e(str2);
                aVar3.m17316f(str);
                aVar3.m17316f(str2);
                long j10 = 0;
                this.f43799i = strM17315e == null ? 0L : Long.parseLong(strM17315e);
                if (strM17315e2 != null) {
                    j10 = Long.parseLong(strM17315e2);
                }
                this.f43800j = j10;
                this.f43797g = aVar3.m17314d();
                if (C5207g.m11106a(this.f43791a.f47455a, "https")) {
                    String strMo11938M1 = c5622sM11991c.mo11938M0();
                    if (strMo11938M1.length() > 0 ? true : z10) {
                        throw new IOException("expected \"\" but was \"" + strMo11938M1 + '\"');
                    }
                    C9088f c9088fM17292b = C9088f.f47399b.m17292b(c5622sM11991c.mo11938M0());
                    List listM15945a = m15945a(c5622sM11991c);
                    List listM15945a2 = m15945a(c5622sM11991c);
                    if (c5622sM11991c.mo11936L()) {
                        tlsVersionM15940a = TlsVersion.SSL_3_0;
                    } else {
                        TlsVersion.Companion companion = TlsVersion.INSTANCE;
                        String strMo11938M2 = c5622sM11991c.mo11938M0();
                        companion.getClass();
                        tlsVersionM15940a = TlsVersion.Companion.m15940a(strMo11938M2);
                    }
                    C5207g.m11111f(tlsVersionM15940a, "tlsVersion");
                    C5207g.m11111f(listM15945a, "peerCertificates");
                    C5207g.m11111f(listM15945a2, "localCertificates");
                    final List listM17717x = C9347b.m17717x(listM15945a);
                    this.f43798h = new Handshake(tlsVersionM15940a, c9088fM17292b, C9347b.m17717x(listM15945a2), new InterfaceC2041a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final List<? extends Certificate> mo807E() {
                            return listM17717x;
                        }
                    });
                } else {
                    this.f43798h = null;
                }
                C9072e c9072e = C9072e.f47360a;
                C5206f.m11032z0(interfaceC5627x, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5206f.m11032z0(interfaceC5627x, th2);
                    throw th3;
                }
            }
        }

        public c(C9106x c9106x) {
            C9095m c9095mM17314d;
            C9101s c9101s = c9106x.f47563a;
            this.f43791a = c9101s.f47542a;
            C9106x c9106x2 = c9106x.f47570h;
            C5207g.m11108c(c9106x2);
            C9095m c9095m = c9106x2.f47563a.f47544c;
            C9095m c9095m2 = c9106x.f47568f;
            Set setM15944c = b.m15944c(c9095m2);
            if (setM15944c.isEmpty()) {
                c9095mM17314d = C9347b.f48083b;
            } else {
                C9095m.a aVar = new C9095m.a();
                int length = c9095m.f47452a.length / 2;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    String strM17306f = c9095m.m17306f(i10);
                    if (setM15944c.contains(strM17306f)) {
                        aVar.m17311a(strM17306f, c9095m.m17309l(i10));
                    }
                    i10 = i11;
                }
                c9095mM17314d = aVar.m17314d();
            }
            this.f43792b = c9095mM17314d;
            this.f43793c = c9101s.f47543b;
            this.f43794d = c9106x.f47564b;
            this.f43795e = c9106x.f47566d;
            this.f43796f = c9106x.f47565c;
            this.f43797g = c9095m2;
            this.f43798h = c9106x.f47567e;
            this.f43799i = c9106x.f47573k;
            this.f43800j = c9106x.f47574l;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static List m15945a(C5622s c5622s) throws IOException {
            int iM15943b = b.m15943b(c5622s);
            if (iM15943b == -1) {
                return EmptyList.f38032a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM15943b);
                int i10 = 0;
                while (i10 < iM15943b) {
                    i10++;
                    String strMo11938M0 = c5622s.mo11938M0();
                    C5608e c5608e = new C5608e();
                    ByteString byteString = ByteString.f43897d;
                    ByteString byteStringM15999a = ByteString.C8082a.m15999a(strMo11938M0);
                    C5207g.m11108c(byteStringM15999a);
                    c5608e.m11949X0(byteStringM15999a);
                    arrayList.add(certificateFactory.generateCertificate(c5608e.new a()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m15946b(C5621r c5621r, List list) throws IOException {
            try {
                c5621r.mo11967s1(list.size());
                c5621r.mo11937M(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    ByteString byteString = ByteString.f43897d;
                    C5207g.m11110e(encoded, "bytes");
                    c5621r.mo11957k0(ByteString.C8082a.m16002d(encoded).mo15990a());
                    c5621r.mo11937M(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15947c(DiskLruCache.Editor editor) throws IOException {
            C9096n c9096n = this.f43791a;
            Handshake handshake = this.f43798h;
            C9095m c9095m = this.f43797g;
            C9095m c9095m2 = this.f43792b;
            C5621r c5621rM11990b = C5617n.m11990b(editor.m15967d(0));
            try {
                c5621rM11990b.mo11957k0(c9096n.f47463i);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11957k0(this.f43793c);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11967s1(c9095m2.f47452a.length / 2);
                c5621rM11990b.mo11937M(10);
                int length = c9095m2.f47452a.length / 2;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    c5621rM11990b.mo11957k0(c9095m2.m17306f(i10));
                    c5621rM11990b.mo11957k0(": ");
                    c5621rM11990b.mo11957k0(c9095m2.m17309l(i10));
                    c5621rM11990b.mo11937M(10);
                    i10 = i11;
                }
                Protocol protocol = this.f43794d;
                int i12 = this.f43795e;
                String str = this.f43796f;
                C5207g.m11111f(protocol, "protocol");
                C5207g.m11111f(str, "message");
                StringBuilder sb2 = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i12);
                sb2.append(' ');
                sb2.append(str);
                String string = sb2.toString();
                C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
                c5621rM11990b.mo11957k0(string);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11967s1((c9095m.f47452a.length / 2) + 2);
                c5621rM11990b.mo11937M(10);
                int length2 = c9095m.f47452a.length / 2;
                for (int i13 = 0; i13 < length2; i13++) {
                    c5621rM11990b.mo11957k0(c9095m.m17306f(i13));
                    c5621rM11990b.mo11957k0(": ");
                    c5621rM11990b.mo11957k0(c9095m.m17309l(i13));
                    c5621rM11990b.mo11937M(10);
                }
                c5621rM11990b.mo11957k0(f43789k);
                c5621rM11990b.mo11957k0(": ");
                c5621rM11990b.mo11967s1(this.f43799i);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11957k0(f43790l);
                c5621rM11990b.mo11957k0(": ");
                c5621rM11990b.mo11967s1(this.f43800j);
                c5621rM11990b.mo11937M(10);
                if (C5207g.m11106a(c9096n.f47455a, "https")) {
                    c5621rM11990b.mo11937M(10);
                    C5207g.m11108c(handshake);
                    c5621rM11990b.mo11957k0(handshake.f43776b.f47419a);
                    c5621rM11990b.mo11937M(10);
                    m15946b(c5621rM11990b, handshake.m15937a());
                    m15946b(c5621rM11990b, handshake.f43777c);
                    c5621rM11990b.mo11957k0(handshake.f43775a.javaName());
                    c5621rM11990b.mo11937M(10);
                }
                C9072e c9072e = C9072e.f47360a;
                C5206f.m11032z0(c5621rM11990b, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5206f.m11032z0(c5621rM11990b, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.a$d */
    public final class d implements InterfaceC9599c {

        /* JADX INFO: renamed from: a */
        public final DiskLruCache.Editor f43801a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5625v f43802b;

        /* JADX INFO: renamed from: c */
        public final a f43803c;

        /* JADX INFO: renamed from: d */
        public boolean f43804d;

        /* JADX INFO: renamed from: okhttp3.a$d$a */
        public static final class a extends AbstractC5611h {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C8072a f43806b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ d f43807c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8072a c8072a, d dVar, InterfaceC5625v interfaceC5625v) {
                super(interfaceC5625v);
                this.f43806b = c8072a;
                this.f43807c = dVar;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                C8072a c8072a = this.f43806b;
                d dVar = this.f43807c;
                synchronized (c8072a) {
                    if (dVar.f43804d) {
                        return;
                    }
                    dVar.f43804d = true;
                    super.close();
                    this.f43807c.f43801a.m15965b();
                }
            }
        }

        public d(DiskLruCache.Editor editor) {
            this.f43801a = editor;
            InterfaceC5625v interfaceC5625vM15967d = editor.m15967d(1);
            this.f43802b = interfaceC5625vM15967d;
            this.f43803c = new a(C8072a.this, this, interfaceC5625vM15967d);
        }

        @Override // p422uo.InterfaceC9599c
        /* JADX INFO: renamed from: a */
        public final void mo15948a() {
            synchronized (C8072a.this) {
                try {
                    if (this.f43804d) {
                        return;
                    }
                    this.f43804d = true;
                    C9347b.m17697d(this.f43802b);
                    try {
                        this.f43801a.m15964a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C8072a(File file, long j10) {
        this.f43782a = new DiskLruCache(file, j10, C9768d.f49841i);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15941a(C9101s c9101s) throws IOException {
        C5207g.m11111f(c9101s, "request");
        DiskLruCache diskLruCache = this.f43782a;
        String strM15942a = b.m15942a(c9101s.f47542a);
        synchronized (diskLruCache) {
            try {
                C5207g.m11111f(strM15942a, "key");
                diskLruCache.m15962r();
                diskLruCache.m15958a();
                DiskLruCache.m15951d0(strM15942a);
                DiskLruCache.C8074a c8074a = diskLruCache.f43835k.get(strM15942a);
                if (c8074a == null) {
                    return;
                }
                diskLruCache.m15956Q(c8074a);
                if (diskLruCache.f43833i <= diskLruCache.f43829e) {
                    diskLruCache.f43820L = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43782a.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f43782a.flush();
    }
}
