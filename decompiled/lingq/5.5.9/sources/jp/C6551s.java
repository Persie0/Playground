package jp;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p124fp.InterfaceC5609f;
import so.AbstractC9105w;
import so.C9094l;
import so.C9095m;
import so.C9096n;
import so.C9098p;
import so.C9099q;
import so.C9101s;

/* JADX INFO: renamed from: jp.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C6551s {

    /* JADX INFO: renamed from: l */
    public static final char[] f37287l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f37288m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f37289a;

    /* JADX INFO: renamed from: b */
    public final C9096n f37290b;

    /* JADX INFO: renamed from: c */
    public String f37291c;

    /* JADX INFO: renamed from: d */
    public C9096n.a f37292d;

    /* JADX INFO: renamed from: e */
    public final C9101s.a f37293e = new C9101s.a();

    /* JADX INFO: renamed from: f */
    public final C9095m.a f37294f;

    /* JADX INFO: renamed from: g */
    public C9098p f37295g;

    /* JADX INFO: renamed from: h */
    public final boolean f37296h;

    /* JADX INFO: renamed from: i */
    public final C9099q.a f37297i;

    /* JADX INFO: renamed from: j */
    public final C9094l.a f37298j;

    /* JADX INFO: renamed from: k */
    public AbstractC9105w f37299k;

    /* JADX INFO: renamed from: jp.s$a */
    public static class a extends AbstractC9105w {

        /* JADX INFO: renamed from: a */
        public final AbstractC9105w f37300a;

        /* JADX INFO: renamed from: b */
        public final C9098p f37301b;

        public a(AbstractC9105w abstractC9105w, C9098p c9098p) {
            this.f37300a = abstractC9105w;
            this.f37301b = c9098p;
        }

        @Override // so.AbstractC9105w
        /* JADX INFO: renamed from: a */
        public final long mo13145a() throws IOException {
            return this.f37300a.mo13145a();
        }

        @Override // so.AbstractC9105w
        /* JADX INFO: renamed from: b */
        public final C9098p mo13146b() {
            return this.f37301b;
        }

        @Override // so.AbstractC9105w
        /* JADX INFO: renamed from: c */
        public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
            this.f37300a.mo13147c(interfaceC5609f);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6551s(String str, C9096n c9096n, String str2, C9095m c9095m, C9098p c9098p, boolean z10, boolean z11, boolean z12) {
        this.f37289a = str;
        this.f37290b = c9096n;
        this.f37291c = str2;
        this.f37295g = c9098p;
        this.f37296h = z10;
        if (c9095m != null) {
            this.f37294f = c9095m.m17307g();
        } else {
            this.f37294f = new C9095m.a();
        }
        if (z11) {
            this.f37298j = new C9094l.a();
            return;
        }
        if (z12) {
            C9099q.a aVar = new C9099q.a();
            this.f37297i = aVar;
            C9098p c9098p2 = C9099q.f47479f;
            C5207g.m11111f(c9098p2, "type");
            if (!C5207g.m11106a(c9098p2.f47476b, "multipart")) {
                throw new IllegalArgumentException(C5207g.m11116k(c9098p2, "multipart != ").toString());
            }
            aVar.f47488b = c9098p2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13142a(String str, String str2, boolean z10) {
        C9094l.a aVar = this.f37298j;
        if (z10) {
            aVar.getClass();
            C5207g.m11111f(str, "name");
            aVar.f47450b.add(C9096n.b.m17332a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f47449a, 83));
            aVar.f47451c.add(C9096n.b.m17332a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f47449a, 83));
            return;
        }
        aVar.getClass();
        C5207g.m11111f(str, "name");
        aVar.f47450b.add(C9096n.b.m17332a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f47449a, 91));
        aVar.f47451c.add(C9096n.b.m17332a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f47449a, 91));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m13143b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f37294f.m17311a(str, str2);
            return;
        }
        try {
            Pattern pattern = C9098p.f47473d;
            this.f37295g = C9098p.a.m17339a(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(C0204c.m852k("Malformed content type: ", str2), e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13144c(String str, String str2, boolean z10) {
        C9096n.a aVar;
        String str3 = this.f37291c;
        if (str3 != null) {
            C9096n c9096n = this.f37290b;
            c9096n.getClass();
            try {
                aVar = new C9096n.a();
                aVar.m17331d(c9096n, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f37292d = aVar;
            if (aVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c9096n + ", Relative: " + this.f37291c);
            }
            this.f37291c = null;
        }
        if (z10) {
            C9096n.a aVar2 = this.f37292d;
            aVar2.getClass();
            C5207g.m11111f(str, "encodedName");
            if (aVar2.f47471g == null) {
                aVar2.f47471g = new ArrayList();
            }
            List<String> list = aVar2.f47471g;
            C5207g.m11108c(list);
            list.add(C9096n.b.m17332a(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = aVar2.f47471g;
            C5207g.m11108c(list2);
            list2.add(str2 != null ? C9096n.b.m17332a(str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
            return;
        }
        C9096n.a aVar3 = this.f37292d;
        aVar3.getClass();
        C5207g.m11111f(str, "name");
        if (aVar3.f47471g == null) {
            aVar3.f47471g = new ArrayList();
        }
        List<String> list3 = aVar3.f47471g;
        C5207g.m11108c(list3);
        list3.add(C9096n.b.m17332a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        List<String> list4 = aVar3.f47471g;
        C5207g.m11108c(list4);
        list4.add(str2 != null ? C9096n.b.m17332a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }
}
