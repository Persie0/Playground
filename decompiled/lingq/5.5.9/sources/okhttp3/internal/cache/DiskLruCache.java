package okhttp3.internal.cache;

import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import p019ap.C1272a;
import p019ap.InterfaceC1273b;
import p034bp.C1640h;
import p124fp.C5607d;
import p124fp.C5617n;
import p124fp.C5620q;
import p124fp.C5621r;
import p124fp.C5622s;
import p124fp.InterfaceC5609f;
import p124fp.InterfaceC5625v;
import p124fp.InterfaceC5627x;
import p422uo.C9601e;
import p422uo.C9602f;
import p442vo.C9767c;
import p442vo.C9768d;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: Q */
    public static final Regex f43811Q = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: R */
    public static final String f43812R = "CLEAN";

    /* JADX INFO: renamed from: S */
    public static final String f43813S = "DIRTY";

    /* JADX INFO: renamed from: T */
    public static final String f43814T = "REMOVE";

    /* JADX INFO: renamed from: U */
    public static final String f43815U = "READ";

    /* JADX INFO: renamed from: H */
    public boolean f43816H;

    /* JADX INFO: renamed from: I */
    public boolean f43817I;

    /* JADX INFO: renamed from: J */
    public boolean f43818J;

    /* JADX INFO: renamed from: K */
    public boolean f43819K;

    /* JADX INFO: renamed from: L */
    public boolean f43820L;

    /* JADX INFO: renamed from: M */
    public boolean f43821M;

    /* JADX INFO: renamed from: N */
    public long f43822N;

    /* JADX INFO: renamed from: O */
    public final C9767c f43823O;

    /* JADX INFO: renamed from: P */
    public final C9601e f43824P;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1273b f43825a;

    /* JADX INFO: renamed from: b */
    public final File f43826b;

    /* JADX INFO: renamed from: c */
    public final int f43827c;

    /* JADX INFO: renamed from: d */
    public final int f43828d;

    /* JADX INFO: renamed from: e */
    public final long f43829e;

    /* JADX INFO: renamed from: f */
    public final File f43830f;

    /* JADX INFO: renamed from: g */
    public final File f43831g;

    /* JADX INFO: renamed from: h */
    public final File f43832h;

    /* JADX INFO: renamed from: i */
    public long f43833i;

    /* JADX INFO: renamed from: j */
    public InterfaceC5609f f43834j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, C8074a> f43835k;

    /* JADX INFO: renamed from: l */
    public int f43836l;

    public final class Editor {

        /* JADX INFO: renamed from: a */
        public final C8074a f43837a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f43838b;

        /* JADX INFO: renamed from: c */
        public boolean f43839c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DiskLruCache f43840d;

        public Editor(DiskLruCache diskLruCache, C8074a c8074a) {
            C5207g.m11111f(diskLruCache, "this$0");
            this.f43840d = diskLruCache;
            this.f43837a = c8074a;
            this.f43838b = c8074a.f43847e ? null : new boolean[diskLruCache.f43828d];
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m15964a() throws IOException {
            DiskLruCache diskLruCache = this.f43840d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f43839c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (C5207g.m11106a(this.f43837a.f43849g, this)) {
                        diskLruCache.m15959b(this, false);
                    }
                    this.f43839c = true;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m15965b() throws IOException {
            DiskLruCache diskLruCache = this.f43840d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f43839c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (C5207g.m11106a(this.f43837a.f43849g, this)) {
                        diskLruCache.m15959b(this, true);
                    }
                    this.f43839c = true;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15966c() throws IOException {
            C8074a c8074a = this.f43837a;
            if (C5207g.m11106a(c8074a.f43849g, this)) {
                DiskLruCache diskLruCache = this.f43840d;
                if (diskLruCache.f43817I) {
                    diskLruCache.m15959b(this, false);
                } else {
                    c8074a.f43848f = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC5625v m15967d(int i10) {
            final DiskLruCache diskLruCache = this.f43840d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f43839c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!C5207g.m11106a(this.f43837a.f43849g, this)) {
                        return new C5607d();
                    }
                    if (!this.f43837a.f43847e) {
                        boolean[] zArr = this.f43838b;
                        C5207g.m11108c(zArr);
                        zArr[i10] = true;
                    }
                    try {
                        return new C9602f(diskLruCache.f43825a.mo4773b((File) this.f43837a.f43846d.get(i10)), new InterfaceC2052l<IOException, C9072e>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(IOException iOException) {
                                C5207g.m11111f(iOException, "it");
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Editor editor = this;
                                synchronized (diskLruCache2) {
                                    editor.m15966c();
                                }
                                return C9072e.f47360a;
                            }
                        });
                    } catch (FileNotFoundException unused) {
                        return new C5607d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$a */
    public final class C8074a {

        /* JADX INFO: renamed from: a */
        public final String f43843a;

        /* JADX INFO: renamed from: b */
        public final long[] f43844b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f43845c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f43846d;

        /* JADX INFO: renamed from: e */
        public boolean f43847e;

        /* JADX INFO: renamed from: f */
        public boolean f43848f;

        /* JADX INFO: renamed from: g */
        public Editor f43849g;

        /* JADX INFO: renamed from: h */
        public int f43850h;

        /* JADX INFO: renamed from: i */
        public long f43851i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DiskLruCache f43852j;

        public C8074a(DiskLruCache diskLruCache, String str) {
            C5207g.m11111f(diskLruCache, "this$0");
            C5207g.m11111f(str, "key");
            this.f43852j = diskLruCache;
            this.f43843a = str;
            int i10 = diskLruCache.f43828d;
            this.f43844b = new long[i10];
            this.f43845c = new ArrayList();
            this.f43846d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f43845c.add(new File(this.f43852j.f43826b, sb2.toString()));
                sb2.append(".tmp");
                this.f43846d.add(new File(this.f43852j.f43826b, sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final C8075b m15968a() {
            byte[] bArr = C9347b.f48082a;
            if (!this.f43847e) {
                return null;
            }
            DiskLruCache diskLruCache = this.f43852j;
            if (diskLruCache.f43817I || (this.f43849g == null && !this.f43848f)) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.f43844b.clone();
                try {
                    int i10 = diskLruCache.f43828d;
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = i11 + 1;
                        InterfaceC5627x interfaceC5627xMo4772a = diskLruCache.f43825a.mo4772a((File) this.f43845c.get(i11));
                        if (!diskLruCache.f43817I) {
                            this.f43850h++;
                            interfaceC5627xMo4772a = new C8076a(interfaceC5627xMo4772a, diskLruCache, this);
                        }
                        arrayList.add(interfaceC5627xMo4772a);
                        i11 = i12;
                    }
                    return new C8075b(this.f43852j, this.f43843a, this.f43851i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C9347b.m17697d((InterfaceC5627x) it.next());
                    }
                    try {
                        diskLruCache.m15956Q(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$b */
    public final class C8075b implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f43853a;

        /* JADX INFO: renamed from: b */
        public final long f43854b;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC5627x> f43855c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DiskLruCache f43856d;

        public C8075b(DiskLruCache diskLruCache, String str, long j10, ArrayList arrayList, long[] jArr) {
            C5207g.m11111f(diskLruCache, "this$0");
            C5207g.m11111f(str, "key");
            C5207g.m11111f(jArr, "lengths");
            this.f43856d = diskLruCache;
            this.f43853a = str;
            this.f43854b = j10;
            this.f43855c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator<InterfaceC5627x> it = this.f43855c.iterator();
            while (it.hasNext()) {
                C9347b.m17697d(it.next());
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public DiskLruCache(File file, long j10, C9768d c9768d) {
        C1272a c1272a = InterfaceC1273b.f7953a;
        C5207g.m11111f(c9768d, "taskRunner");
        this.f43825a = c1272a;
        this.f43826b = file;
        this.f43827c = 201105;
        this.f43828d = 2;
        this.f43829e = j10;
        this.f43835k = new LinkedHashMap<>(0, 0.75f, true);
        this.f43823O = c9768d.m18266f();
        this.f43824P = new C9601e(this, C5207g.m11116k(" Cache", C9347b.f48088g));
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f43830f = new File(file, "journal");
        this.f43831g = new File(file, "journal.tmp");
        this.f43832h = new File(file, "journal.bkp");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m15951d0(String str) {
        if (f43811Q.m14271b(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: renamed from: C */
    public final void m15952C() throws IOException {
        File file = this.f43831g;
        InterfaceC1273b interfaceC1273b = this.f43825a;
        interfaceC1273b.mo4777f(file);
        Iterator<C8074a> it = this.f43835k.values().iterator();
        while (true) {
            while (it.hasNext()) {
                C8074a next = it.next();
                C5207g.m11110e(next, "i.next()");
                C8074a c8074a = next;
                Editor editor = c8074a.f43849g;
                int i10 = this.f43828d;
                int i11 = 0;
                if (editor == null) {
                    while (i11 < i10) {
                        this.f43833i += c8074a.f43844b[i11];
                        i11++;
                    }
                } else {
                    c8074a.f43849g = null;
                    while (i11 < i10) {
                        interfaceC1273b.mo4777f((File) c8074a.f43845c.get(i11));
                        interfaceC1273b.mo4777f((File) c8074a.f43846d.get(i11));
                        i11++;
                    }
                    it.remove();
                }
            }
            return;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: E */
    public final void m15953E() throws IOException {
        File file = this.f43830f;
        InterfaceC1273b interfaceC1273b = this.f43825a;
        C5622s c5622sM11991c = C5617n.m11991c(interfaceC1273b.mo4772a(file));
        try {
            String strMo11938M0 = c5622sM11991c.mo11938M0();
            String strMo11938M1 = c5622sM11991c.mo11938M0();
            String strMo11938M2 = c5622sM11991c.mo11938M0();
            String strMo11938M3 = c5622sM11991c.mo11938M0();
            String strMo11938M4 = c5622sM11991c.mo11938M0();
            if (C5207g.m11106a("libcore.io.DiskLruCache", strMo11938M0) && C5207g.m11106a("1", strMo11938M1) && C5207g.m11106a(String.valueOf(this.f43827c), strMo11938M2) && C5207g.m11106a(String.valueOf(this.f43828d), strMo11938M3)) {
                int i10 = 0;
                if (!(strMo11938M4.length() > 0)) {
                    while (true) {
                        try {
                            m15954G(c5622sM11991c.mo11938M0());
                            i10++;
                        } catch (EOFException unused) {
                            this.f43836l = i10 - this.f43835k.size();
                            if (c5622sM11991c.mo11936L()) {
                                this.f43834j = C5617n.m11990b(new C9602f(interfaceC1273b.mo4778g(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                            } else {
                                m15955H();
                            }
                            C9072e c9072e = C9072e.f47360a;
                            C5206f.m11032z0(c5622sM11991c, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strMo11938M0 + ", " + strMo11938M1 + ", " + strMo11938M3 + ", " + strMo11938M4 + ']');
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(c5622sM11991c, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: G */
    public final void m15954G(String str) throws IOException {
        String strSubstring;
        String str2;
        String str3;
        int i10 = 0;
        int iM14284d3 = C7076b.m14284d3(str, ' ', 0, false, 6);
        if (iM14284d3 == -1) {
            throw new IOException(C5207g.m11116k(str, "unexpected journal line: "));
        }
        int i11 = iM14284d3 + 1;
        int iM14284d4 = C7076b.m14284d3(str, ' ', i11, false, 4);
        LinkedHashMap<String, C8074a> linkedHashMap = this.f43835k;
        if (iM14284d4 == -1) {
            strSubstring = str.substring(i11);
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str4 = f43814T;
            if (iM14284d3 == str4.length() && C7661i.m15256V2(str, str4, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iM14284d4);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C8074a c8074a = linkedHashMap.get(strSubstring);
        if (c8074a == null) {
            c8074a = new C8074a(this, strSubstring);
            linkedHashMap.put(strSubstring, c8074a);
        }
        if (iM14284d4 == -1) {
            if (iM14284d4 == -1) {
                str3 = f43813S;
                if (iM14284d3 == str3.length()) {
                    c8074a.f43849g = new Editor(this, c8074a);
                    return;
                }
            }
            if (iM14284d4 == -1) {
                str2 = f43815U;
                if (iM14284d3 == str2.length()) {
                }
            }
            throw new IOException(C5207g.m11116k(str, "unexpected journal line: "));
        }
        String str5 = f43812R;
        if (iM14284d3 != str5.length() || !C7661i.m15256V2(str, str5, false)) {
            if (iM14284d4 == -1) {
                str3 = f43813S;
                if (iM14284d3 == str3.length() && C7661i.m15256V2(str, str3, false)) {
                    c8074a.f43849g = new Editor(this, c8074a);
                    return;
                }
            }
            if (iM14284d4 == -1) {
                str2 = f43815U;
                if (iM14284d3 == str2.length() && C7661i.m15256V2(str, str2, false)) {
                }
            }
            throw new IOException(C5207g.m11116k(str, "unexpected journal line: "));
        }
        String strSubstring2 = str.substring(iM14284d4 + 1);
        C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        List listM14298r3 = C7076b.m14298r3(strSubstring2, new char[]{' '});
        c8074a.f43847e = true;
        c8074a.f43849g = null;
        if (listM14298r3.size() != c8074a.f43852j.f43828d) {
            throw new IOException(C5207g.m11116k(listM14298r3, "unexpected journal line: "));
        }
        try {
            int size = listM14298r3.size();
            while (i10 < size) {
                int i12 = i10 + 1;
                c8074a.f43844b[i10] = Long.parseLong((String) listM14298r3.get(i10));
                i10 = i12;
            }
        } catch (NumberFormatException unused) {
            throw new IOException(C5207g.m11116k(listM14298r3, "unexpected journal line: "));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: H */
    public final synchronized void m15955H() throws IOException {
        try {
            InterfaceC5609f interfaceC5609f = this.f43834j;
            if (interfaceC5609f != null) {
                interfaceC5609f.close();
            }
            C5621r c5621rM11990b = C5617n.m11990b(this.f43825a.mo4773b(this.f43831g));
            try {
                c5621rM11990b.mo11957k0("libcore.io.DiskLruCache");
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11957k0("1");
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11967s1(this.f43827c);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11967s1(this.f43828d);
                c5621rM11990b.mo11937M(10);
                c5621rM11990b.mo11937M(10);
                Iterator<C8074a> it = this.f43835k.values().iterator();
                while (true) {
                    int i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C8074a next = it.next();
                    if (next.f43849g != null) {
                        c5621rM11990b.mo11957k0(f43813S);
                        c5621rM11990b.mo11937M(32);
                        c5621rM11990b.mo11957k0(next.f43843a);
                        c5621rM11990b.mo11937M(10);
                    } else {
                        c5621rM11990b.mo11957k0(f43812R);
                        c5621rM11990b.mo11937M(32);
                        c5621rM11990b.mo11957k0(next.f43843a);
                        long[] jArr = next.f43844b;
                        int length = jArr.length;
                        while (i10 < length) {
                            long j10 = jArr[i10];
                            i10++;
                            c5621rM11990b.mo11937M(32);
                            c5621rM11990b.mo11967s1(j10);
                        }
                        c5621rM11990b.mo11937M(10);
                    }
                    throw th;
                }
                C9072e c9072e = C9072e.f47360a;
                C5206f.m11032z0(c5621rM11990b, null);
                if (this.f43825a.mo4775d(this.f43830f)) {
                    this.f43825a.mo4776e(this.f43830f, this.f43832h);
                }
                this.f43825a.mo4776e(this.f43831g, this.f43830f);
                this.f43825a.mo4777f(this.f43832h);
                this.f43834j = C5617n.m11990b(new C9602f(this.f43825a.mo4778g(this.f43830f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.f43816H = false;
                this.f43821M = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5206f.m11032z0(c5621rM11990b, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m15956Q(C8074a c8074a) throws IOException {
        InterfaceC5609f interfaceC5609f;
        C5207g.m11111f(c8074a, "entry");
        boolean z10 = this.f43817I;
        String str = c8074a.f43843a;
        if (!z10) {
            if (c8074a.f43850h > 0 && (interfaceC5609f = this.f43834j) != null) {
                interfaceC5609f.mo11957k0(f43813S);
                interfaceC5609f.mo11937M(32);
                interfaceC5609f.mo11957k0(str);
                interfaceC5609f.mo11937M(10);
                interfaceC5609f.flush();
            }
            if (c8074a.f43850h > 0 || c8074a.f43849g != null) {
                c8074a.f43848f = true;
                return;
            }
        }
        Editor editor = c8074a.f43849g;
        if (editor != null) {
            editor.m15966c();
        }
        for (int i10 = 0; i10 < this.f43828d; i10++) {
            this.f43825a.mo4777f((File) c8074a.f43845c.get(i10));
            long j10 = this.f43833i;
            long[] jArr = c8074a.f43844b;
            this.f43833i = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f43836l++;
        InterfaceC5609f interfaceC5609f2 = this.f43834j;
        if (interfaceC5609f2 != null) {
            interfaceC5609f2.mo11957k0(f43814T);
            interfaceC5609f2.mo11937M(32);
            interfaceC5609f2.mo11957k0(str);
            interfaceC5609f2.mo11937M(10);
        }
        this.f43835k.remove(str);
        if (m15963w()) {
            this.f43823O.m18258c(this.f43824P, 0L);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m15957U() throws IOException {
        boolean z10;
        do {
            z10 = false;
            if (this.f43833i <= this.f43829e) {
                this.f43820L = false;
                return;
            }
            for (C8074a c8074a : this.f43835k.values()) {
                if (!c8074a.f43848f) {
                    m15956Q(c8074a);
                    z10 = true;
                    break;
                }
            }
        } while (z10);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m15958a() {
        if (!(!this.f43819K)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m15959b(Editor editor, boolean z10) throws IOException {
        C5207g.m11111f(editor, "editor");
        C8074a c8074a = editor.f43837a;
        if (!C5207g.m11106a(c8074a.f43849g, editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (z10 && !c8074a.f43847e) {
            int i11 = this.f43828d;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                boolean[] zArr = editor.f43838b;
                C5207g.m11108c(zArr);
                if (!zArr[i12]) {
                    editor.m15964a();
                    throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i12), "Newly created entry didn't create value for index "));
                }
                if (!this.f43825a.mo4775d((File) c8074a.f43846d.get(i12))) {
                    editor.m15964a();
                    return;
                }
                i12 = i13;
            }
        }
        int i14 = this.f43828d;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = i15 + 1;
            File file = (File) c8074a.f43846d.get(i15);
            if (!z10 || c8074a.f43848f) {
                this.f43825a.mo4777f(file);
            } else {
                if (this.f43825a.mo4775d(file)) {
                    File file2 = (File) c8074a.f43845c.get(i15);
                    this.f43825a.mo4776e(file, file2);
                    long j10 = c8074a.f43844b[i15];
                    long jMo4779h = this.f43825a.mo4779h(file2);
                    c8074a.f43844b[i15] = jMo4779h;
                    this.f43833i = (this.f43833i - j10) + jMo4779h;
                }
                i15 = i16;
            }
            i15 = i16;
        }
        c8074a.f43849g = null;
        if (c8074a.f43848f) {
            m15956Q(c8074a);
            return;
        }
        this.f43836l++;
        InterfaceC5609f interfaceC5609f = this.f43834j;
        C5207g.m11108c(interfaceC5609f);
        if (c8074a.f43847e || z10) {
            c8074a.f43847e = true;
            interfaceC5609f.mo11957k0(f43812R).mo11937M(32);
            interfaceC5609f.mo11957k0(c8074a.f43843a);
            long[] jArr = c8074a.f43844b;
            int length = jArr.length;
            while (i10 < length) {
                long j11 = jArr[i10];
                i10++;
                interfaceC5609f.mo11937M(32).mo11967s1(j11);
            }
            interfaceC5609f.mo11937M(10);
            if (z10) {
                long j12 = this.f43822N;
                this.f43822N = 1 + j12;
                c8074a.f43851i = j12;
            }
        } else {
            this.f43835k.remove(c8074a.f43843a);
            interfaceC5609f.mo11957k0(f43814T).mo11937M(32);
            interfaceC5609f.mo11957k0(c8074a.f43843a);
            interfaceC5609f.mo11937M(10);
        }
        interfaceC5609f.flush();
        if (this.f43833i > this.f43829e || m15963w()) {
            this.f43823O.m18258c(this.f43824P, 0L);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (!this.f43818J || this.f43819K) {
            this.f43819K = true;
            return;
        }
        Collection<C8074a> collectionValues = this.f43835k.values();
        C5207g.m11110e(collectionValues, "lruEntries.values");
        int i10 = 0;
        Object[] array = collectionValues.toArray(new C8074a[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C8074a[] c8074aArr = (C8074a[]) array;
        int length = c8074aArr.length;
        while (true) {
            while (true) {
                if (i10 >= length) {
                    m15957U();
                    InterfaceC5609f interfaceC5609f = this.f43834j;
                    C5207g.m11108c(interfaceC5609f);
                    interfaceC5609f.close();
                    this.f43834j = null;
                    this.f43819K = true;
                    return;
                }
                C8074a c8074a = c8074aArr[i10];
                i10++;
                Editor editor = c8074a.f43849g;
                if (editor != null) {
                    if (editor != null) {
                        editor.m15966c();
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        try {
            if (this.f43818J) {
                m15958a();
                m15957U();
                InterfaceC5609f interfaceC5609f = this.f43834j;
                C5207g.m11108c(interfaceC5609f);
                interfaceC5609f.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized Editor m15960l(String str, long j10) throws IOException {
        C5207g.m11111f(str, "key");
        m15962r();
        m15958a();
        m15951d0(str);
        C8074a c8074a = this.f43835k.get(str);
        if (j10 == -1 || (c8074a != null && c8074a.f43851i == j10)) {
            if ((c8074a == null ? null : c8074a.f43849g) != null) {
                return null;
            }
            if (c8074a != null && c8074a.f43850h != 0) {
                return null;
            }
            if (!this.f43820L && !this.f43821M) {
                InterfaceC5609f interfaceC5609f = this.f43834j;
                C5207g.m11108c(interfaceC5609f);
                interfaceC5609f.mo11957k0(f43813S).mo11937M(32).mo11957k0(str).mo11937M(10);
                interfaceC5609f.flush();
                if (this.f43816H) {
                    return null;
                }
                if (c8074a == null) {
                    c8074a = new C8074a(this, str);
                    this.f43835k.put(str, c8074a);
                }
                Editor editor = new Editor(this, c8074a);
                c8074a.f43849g = editor;
                return editor;
            }
            this.f43823O.m18258c(this.f43824P, 0L);
            return null;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized C8075b m15961q(String str) throws IOException {
        C5207g.m11111f(str, "key");
        m15962r();
        m15958a();
        m15951d0(str);
        C8074a c8074a = this.f43835k.get(str);
        if (c8074a == null) {
            return null;
        }
        C8075b c8075bM15968a = c8074a.m15968a();
        if (c8075bM15968a == null) {
            return null;
        }
        this.f43836l++;
        InterfaceC5609f interfaceC5609f = this.f43834j;
        C5207g.m11108c(interfaceC5609f);
        interfaceC5609f.mo11957k0(f43815U).mo11937M(32).mo11957k0(str).mo11937M(10);
        if (m15963w()) {
            this.f43823O.m18258c(this.f43824P, 0L);
        }
        return c8075bM15968a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final synchronized void m15962r() throws IOException {
        boolean z10;
        byte[] bArr = C9347b.f48082a;
        if (this.f43818J) {
            return;
        }
        if (this.f43825a.mo4775d(this.f43832h)) {
            if (this.f43825a.mo4775d(this.f43830f)) {
                this.f43825a.mo4777f(this.f43832h);
            } else {
                this.f43825a.mo4776e(this.f43832h, this.f43830f);
            }
        }
        InterfaceC1273b interfaceC1273b = this.f43825a;
        File file = this.f43832h;
        C5207g.m11111f(interfaceC1273b, "<this>");
        C5207g.m11111f(file, "file");
        C5620q c5620qMo4773b = interfaceC1273b.mo4773b(file);
        try {
            try {
                interfaceC1273b.mo4777f(file);
                C5206f.m11032z0(c5620qMo4773b, null);
                z10 = true;
            } catch (IOException unused) {
                C9072e c9072e = C9072e.f47360a;
                C5206f.m11032z0(c5620qMo4773b, null);
                interfaceC1273b.mo4777f(file);
                z10 = false;
            }
            this.f43817I = z10;
            if (this.f43825a.mo4775d(this.f43830f)) {
                try {
                    m15953E();
                    m15952C();
                    this.f43818J = true;
                    return;
                } catch (IOException e10) {
                    C1640h c1640h = C1640h.f9199a;
                    C1640h c1640h2 = C1640h.f9199a;
                    String str = "DiskLruCache " + this.f43826b + " is corrupt: " + ((Object) e10.getMessage()) + ", removing";
                    c1640h2.getClass();
                    C1640h.m5333i(5, str, e10);
                    try {
                        close();
                        this.f43825a.mo4774c(this.f43826b);
                        this.f43819K = false;
                        m15955H();
                        this.f43818J = true;
                    } catch (Throwable th2) {
                        this.f43819K = false;
                        throw th2;
                    }
                }
            }
            m15955H();
            this.f43818J = true;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C5206f.m11032z0(c5620qMo4773b, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15963w() {
        int i10 = this.f43836l;
        return i10 >= 2000 && i10 >= this.f43835k.size();
    }
}
