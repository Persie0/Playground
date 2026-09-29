package coil.disk;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;
import p000.AbstractC3057h;
import p000.C0011a9;
import p000.C3386nv;
import p000.C3552rx;
import p000.ah2;
import p000.ch2;
import p000.cl9;
import p000.d13;
import p000.d18;
import p000.d57;
import p000.e18;
import p000.eh0;
import p000.fa4;
import p000.fh2;
import p000.lda;
import p000.nn1;
import p000.r46;
import p000.u33;
import p000.uk9;
import p000.ux5;
import p000.v63;
import p000.vk9;
import p000.vl1;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: coil.disk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0860a implements Closeable, Flushable {

    /* JADX INFO: renamed from: L */
    public static final Regex f10450L = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: H */
    public boolean f10451H;

    /* JADX INFO: renamed from: I */
    public boolean f10452I;

    /* JADX INFO: renamed from: J */
    public boolean f10453J;

    /* JADX INFO: renamed from: K */
    public final fh2 f10454K;

    /* JADX INFO: renamed from: a */
    public final d57 f10455a;

    /* JADX INFO: renamed from: b */
    public final long f10456b;

    /* JADX INFO: renamed from: c */
    public final d57 f10457c;

    /* JADX INFO: renamed from: d */
    public final d57 f10458d;

    /* JADX INFO: renamed from: e */
    public final d57 f10459e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f10460f;

    /* JADX INFO: renamed from: g */
    public final vl1 f10461g;

    /* JADX INFO: renamed from: h */
    public long f10462h;

    /* JADX INFO: renamed from: i */
    public int f10463i;

    /* JADX INFO: renamed from: j */
    public d18 f10464j;

    /* JADX INFO: renamed from: k */
    public boolean f10465k;

    /* JADX INFO: renamed from: l */
    public boolean f10466l;

    public C0860a(long j, nn1 nn1Var, u33 u33Var, d57 d57Var) {
        this.f10455a = d57Var;
        this.f10456b = j;
        if (j <= 0) {
            C3386nv.m17626m("maxSize <= 0");
            throw null;
        }
        this.f10457c = d57Var.m10107e("journal");
        this.f10458d = d57Var.m10107e("journal.tmp");
        this.f10459e = d57Var.m10107e("journal.bkp");
        this.f10460f = new LinkedHashMap(0, 0.75f, true);
        this.f10461g = vz1.m23619a(eh0.m11113J(r46.m20384i(), nn1Var.mo387Z(1)));
        this.f10454K = new fh2(u33Var);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0119 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c5, B:48:0x00ca, B:53:0x0105, B:55:0x0110, B:59:0x0119, B:49:0x00e2, B:51:0x00f7, B:52:0x0102, B:37:0x0098, B:62:0x011e, B:63:0x0125), top: B:66:0x0001 }] */
    /* JADX INFO: renamed from: a */
    public static final void m4956a(C0860a c0860a, C3552rx c3552rx, boolean z) {
        synchronized (c0860a) {
            ah2 ah2Var = (ah2) c3552rx.f59987b;
            if (!fa4.m11650l(ah2Var.f643g, c3552rx)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || ah2Var.f642f) {
                for (int i = 0; i < 2; i++) {
                    c0860a.f10454K.m22433p((d57) ah2Var.f640d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) c3552rx.f59988c)[i2] && !c0860a.f10454K.m22434q((d57) ah2Var.f640d.get(i2))) {
                        c3552rx.m20969d(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    d57 d57Var = (d57) ah2Var.f640d.get(i3);
                    d57 d57Var2 = (d57) ah2Var.f639c.get(i3);
                    boolean zM22434q = c0860a.f10454K.m22434q(d57Var);
                    fh2 fh2Var = c0860a.f10454K;
                    if (zM22434q) {
                        fh2Var.mo263b(d57Var, d57Var2);
                    } else {
                        d57 d57Var3 = (d57) ah2Var.f639c.get(i3);
                        if (!fh2Var.m22434q(d57Var3)) {
                            AbstractC3057h.m12986a(fh2Var.mo260J(d57Var3));
                        }
                    }
                    long j = ah2Var.f638b[i3];
                    Long l = (Long) c0860a.f10454K.m22435u(d57Var2).f60615e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    ah2Var.f638b[i3] = jLongValue;
                    c0860a.f10462h = (c0860a.f10462h - j) + jLongValue;
                }
            }
            ah2Var.f643g = null;
            if (ah2Var.f642f) {
                c0860a.m4966u(ah2Var);
                return;
            }
            c0860a.f10463i++;
            d18 d18Var = c0860a.f10464j;
            d18Var.getClass();
            if (z || ah2Var.f641e) {
                ah2Var.f641e = true;
                d18Var.mo461H("CLEAN");
                d18Var.writeByte(32);
                d18Var.mo461H(ah2Var.f637a);
                for (long j2 : ah2Var.f638b) {
                    d18Var.writeByte(32);
                    d18Var.mo477c0(j2);
                }
                d18Var.writeByte(10);
            } else {
                c0860a.f10460f.remove(ah2Var.f637a);
                d18Var.mo461H("REMOVE");
                d18Var.writeByte(32);
                d18Var.mo461H(ah2Var.f637a);
                d18Var.writeByte(10);
            }
            d18Var.flush();
            if (c0860a.f10462h > c0860a.f10456b) {
                c0860a.m4962n();
            } else if (c0860a.f10463i >= 2000) {
                c0860a.m4962n();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m4957z(String str) {
        if (f10450L.m15427f(str)) {
            return;
        }
        C3386nv.m17624j(ux5.m22986i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m4958A() {
        Throwable th;
        try {
            d18 d18Var = this.f10464j;
            if (d18Var != null) {
                d18Var.close();
            }
            d18 d18VarM20389o = r46.m20389o(this.f10454K.mo260J(this.f10458d));
            try {
                d18VarM20389o.mo461H("libcore.io.DiskLruCache");
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo461H("1");
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo477c0(1L);
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo477c0(2L);
                d18VarM20389o.writeByte(10);
                d18VarM20389o.writeByte(10);
                for (ah2 ah2Var : this.f10460f.values()) {
                    if (ah2Var.f643g != null) {
                        d18VarM20389o.mo461H("DIRTY");
                        d18VarM20389o.writeByte(32);
                        d18VarM20389o.mo461H(ah2Var.f637a);
                        d18VarM20389o.writeByte(10);
                    } else {
                        d18VarM20389o.mo461H("CLEAN");
                        d18VarM20389o.writeByte(32);
                        d18VarM20389o.mo461H(ah2Var.f637a);
                        for (long j : ah2Var.f638b) {
                            d18VarM20389o.writeByte(32);
                            d18VarM20389o.mo477c0(j);
                        }
                        d18VarM20389o.writeByte(10);
                    }
                }
                try {
                    d18VarM20389o.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    d18VarM20389o.close();
                } catch (Throwable th4) {
                    lda.m16117c(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zM22434q = this.f10454K.m22434q(this.f10457c);
            fh2 fh2Var = this.f10454K;
            if (zM22434q) {
                fh2Var.mo263b(this.f10457c, this.f10459e);
                this.f10454K.mo263b(this.f10458d, this.f10457c);
                this.f10454K.m22433p(this.f10459e);
            } else {
                fh2Var.mo263b(this.f10458d, this.f10457c);
            }
            fh2 fh2Var2 = this.f10454K;
            d57 d57Var = this.f10457c;
            fh2Var2.getClass();
            d57Var.getClass();
            this.f10464j = new d18(new d13(fh2Var2.mo262a(d57Var), new C0011a9(this, 12)));
            this.f10463i = 0;
            this.f10465k = false;
            this.f10453J = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C3552rx m4959b(String str) {
        if (this.f10451H) {
            throw new IllegalStateException("cache is closed");
        }
        m4957z(str);
        m4961e();
        ah2 ah2Var = (ah2) this.f10460f.get(str);
        if ((ah2Var != null ? ah2Var.f643g : null) != null) {
            return null;
        }
        if (ah2Var != null && ah2Var.f644h != 0) {
            return null;
        }
        if (!this.f10452I && !this.f10453J) {
            d18 d18Var = this.f10464j;
            d18Var.getClass();
            d18Var.mo461H("DIRTY");
            d18Var.writeByte(32);
            d18Var.mo461H(str);
            d18Var.writeByte(10);
            d18Var.flush();
            if (this.f10465k) {
                return null;
            }
            if (ah2Var == null) {
                ah2Var = new ah2(this, str);
                this.f10460f.put(str, ah2Var);
            }
            C3552rx c3552rx = new C3552rx(this, ah2Var);
            ah2Var.f643g = c3552rx;
            return c3552rx;
        }
        m4962n();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ch2 m4960c(String str) {
        ch2 ch2VarM396a;
        if (this.f10451H) {
            throw new IllegalStateException("cache is closed");
        }
        m4957z(str);
        m4961e();
        ah2 ah2Var = (ah2) this.f10460f.get(str);
        if (ah2Var != null && (ch2VarM396a = ah2Var.m396a()) != null) {
            boolean z = true;
            this.f10463i++;
            d18 d18Var = this.f10464j;
            d18Var.getClass();
            d18Var.mo461H("READ");
            d18Var.writeByte(32);
            d18Var.mo461H(str);
            d18Var.writeByte(10);
            if (this.f10463i < 2000) {
                z = false;
            }
            if (z) {
                m4962n();
            }
            return ch2VarM396a;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f10466l && !this.f10451H) {
                for (ah2 ah2Var : (ah2[]) this.f10460f.values().toArray(new ah2[0])) {
                    C3552rx c3552rx = ah2Var.f643g;
                    if (c3552rx != null) {
                        ah2 ah2Var2 = (ah2) c3552rx.f59987b;
                        if (fa4.m11650l(ah2Var2.f643g, c3552rx)) {
                            ah2Var2.f642f = true;
                        }
                    }
                }
                m4967x();
                vz1.m23637j(this.f10461g, null);
                d18 d18Var = this.f10464j;
                d18Var.getClass();
                d18Var.close();
                this.f10464j = null;
                this.f10451H = true;
                return;
            }
            this.f10451H = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m4961e() {
        try {
            if (this.f10466l) {
                return;
            }
            this.f10454K.m22433p(this.f10458d);
            if (this.f10454K.m22434q(this.f10459e)) {
                boolean zM22434q = this.f10454K.m22434q(this.f10457c);
                fh2 fh2Var = this.f10454K;
                d57 d57Var = this.f10459e;
                if (zM22434q) {
                    fh2Var.m22433p(d57Var);
                } else {
                    fh2Var.mo263b(d57Var, this.f10457c);
                }
            }
            if (this.f10454K.m22434q(this.f10457c)) {
                try {
                    m4964q();
                    m4963p();
                    this.f10466l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        eh0.m11134o(this.f10455a, this.f10454K);
                        this.f10451H = false;
                        m4958A();
                        this.f10466l = true;
                    } catch (Throwable th) {
                        this.f10451H = false;
                        throw th;
                    }
                }
            }
            m4958A();
            this.f10466l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f10466l) {
            if (this.f10451H) {
                throw new IllegalStateException("cache is closed");
            }
            m4967x();
            d18 d18Var = this.f10464j;
            d18Var.getClass();
            d18Var.flush();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4962n() {
        wfb.m23926u(this.f10461g, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    /* JADX INFO: renamed from: p */
    public final void m4963p() {
        Iterator it = this.f10460f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ah2 ah2Var = (ah2) it.next();
            int i = 0;
            if (ah2Var.f643g == null) {
                while (i < 2) {
                    j += ah2Var.f638b[i];
                    i++;
                }
            } else {
                ah2Var.f643g = null;
                while (i < 2) {
                    d57 d57Var = (d57) ah2Var.f639c.get(i);
                    fh2 fh2Var = this.f10454K;
                    fh2Var.m22433p(d57Var);
                    fh2Var.m22433p((d57) ah2Var.f640d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f10462h = j;
    }

    /* JADX INFO: renamed from: q */
    public final void m4964q() throws Throwable {
        fh2 fh2Var = this.f10454K;
        d57 d57Var = this.f10457c;
        e18 e18VarM20390p = r46.m20390p(fh2Var.mo261N(d57Var));
        try {
            String strMo457D = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D2 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D3 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D4 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D5 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo457D) || !"1".equals(strMo457D2) || !fa4.m11650l(String.valueOf(1), strMo457D3) || !fa4.m11650l(String.valueOf(2), strMo457D4) || strMo457D5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo457D + ", " + strMo457D2 + ", " + strMo457D3 + ", " + strMo457D4 + ", " + strMo457D5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m4965r(e18VarM20390p.mo457D(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f10463i = i - this.f10460f.size();
                    if (e18VarM20390p.m10787a()) {
                        fh2Var.getClass();
                        d57Var.getClass();
                        this.f10464j = new d18(new d13(fh2Var.mo262a(d57Var), new C0011a9(this, 12)));
                    } else {
                        m4958A();
                    }
                    try {
                        e18VarM20390p.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                e18VarM20390p.close();
            } catch (Throwable th3) {
                lda.m16117c(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4965r(String str) throws IOException {
        String strSubstring;
        int iM23388k0 = vk9.m23388k0(str, ' ', 0, 6);
        if (iM23388k0 == -1) {
            v63.m23133k("unexpected journal line: ".concat(str));
            return;
        }
        int i = iM23388k0 + 1;
        int iM23388k1 = vk9.m23388k0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f10460f;
        if (iM23388k1 == -1) {
            strSubstring = str.substring(i);
            if (iM23388k0 == 6 && cl9.m4842Y(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM23388k1);
        }
        Object ah2Var = linkedHashMap.get(strSubstring);
        if (ah2Var == null) {
            ah2Var = new ah2(this, strSubstring);
            linkedHashMap.put(strSubstring, ah2Var);
        }
        ah2 ah2Var2 = (ah2) ah2Var;
        if (iM23388k1 == -1 || iM23388k0 != 5 || !cl9.m4842Y(str, "CLEAN", false)) {
            if (iM23388k1 == -1 && iM23388k0 == 5 && cl9.m4842Y(str, "DIRTY", false)) {
                ah2Var2.f643g = new C3552rx(this, ah2Var2);
                return;
            } else {
                if (iM23388k1 == -1 && iM23388k0 == 4 && cl9.m4842Y(str, "READ", false)) {
                    return;
                }
                v63.m23133k("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listM23366B0 = vk9.m23366B0(str.substring(iM23388k1 + 1), new char[]{' '});
        ah2Var2.f641e = true;
        ah2Var2.f643g = null;
        if (listM23366B0.size() != 2) {
            uk9.m22774h(listM23366B0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listM23366B0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ah2Var2.f638b[i2] = Long.parseLong((String) listM23366B0.get(i2));
            }
        } catch (NumberFormatException unused) {
            uk9.m22774h(listM23366B0, "unexpected journal line: ");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4966u(ah2 ah2Var) {
        d18 d18Var;
        int i = ah2Var.f644h;
        String str = ah2Var.f637a;
        if (i > 0 && (d18Var = this.f10464j) != null) {
            d18Var.mo461H("DIRTY");
            d18Var.writeByte(32);
            d18Var.mo461H(str);
            d18Var.writeByte(10);
            d18Var.flush();
        }
        if (ah2Var.f644h > 0 || ah2Var.f643g != null) {
            ah2Var.f642f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f10454K.m22433p((d57) ah2Var.f639c.get(i2));
            long j = this.f10462h;
            long[] jArr = ah2Var.f638b;
            this.f10462h = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f10463i++;
        d18 d18Var2 = this.f10464j;
        if (d18Var2 != null) {
            d18Var2.mo461H("REMOVE");
            d18Var2.writeByte(32);
            d18Var2.mo461H(str);
            d18Var2.writeByte(10);
        }
        this.f10460f.remove(str);
        if (this.f10463i >= 2000) {
            m4962n();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4967x() {
        while (this.f10462h > this.f10456b) {
            for (ah2 ah2Var : this.f10460f.values()) {
                if (!ah2Var.f642f) {
                    m4966u(ah2Var);
                }
            }
            return;
        }
        this.f10452I = false;
    }
}
