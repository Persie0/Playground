package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class gh2 implements Closeable, Flushable {

    /* JADX INFO: renamed from: O */
    public static final Regex f40794O = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: P */
    public static final String f40795P = "CLEAN";

    /* JADX INFO: renamed from: Q */
    public static final String f40796Q = "DIRTY";

    /* JADX INFO: renamed from: R */
    public static final String f40797R = "REMOVE";

    /* JADX INFO: renamed from: S */
    public static final String f40798S = "READ";

    /* JADX INFO: renamed from: H */
    public boolean f40799H;

    /* JADX INFO: renamed from: I */
    public boolean f40800I;

    /* JADX INFO: renamed from: J */
    public boolean f40801J;

    /* JADX INFO: renamed from: K */
    public boolean f40802K;

    /* JADX INFO: renamed from: L */
    public long f40803L;

    /* JADX INFO: renamed from: M */
    public final zr9 f40804M;

    /* JADX INFO: renamed from: N */
    public final dh2 f40805N;

    /* JADX INFO: renamed from: a */
    public final d57 f40806a;

    /* JADX INFO: renamed from: b */
    public final eh2 f40807b;

    /* JADX INFO: renamed from: c */
    public final long f40808c;

    /* JADX INFO: renamed from: d */
    public final d57 f40809d;

    /* JADX INFO: renamed from: e */
    public final d57 f40810e;

    /* JADX INFO: renamed from: f */
    public final d57 f40811f;

    /* JADX INFO: renamed from: g */
    public long f40812g;

    /* JADX INFO: renamed from: h */
    public d18 f40813h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f40814i;

    /* JADX INFO: renamed from: j */
    public int f40815j;

    /* JADX INFO: renamed from: k */
    public boolean f40816k;

    /* JADX INFO: renamed from: l */
    public boolean f40817l;

    public gh2(u33 u33Var, d57 d57Var, as9 as9Var) {
        u33Var.getClass();
        as9Var.getClass();
        this.f40806a = d57Var;
        this.f40807b = new eh2(u33Var);
        this.f40808c = 10485760L;
        this.f40814i = new LinkedHashMap(0, 0.75f, true);
        this.f40804M = as9Var.m3023d();
        this.f40805N = new dh2(AbstractC3393o1.m17738m(new StringBuilder(), kcb.f47052b, " Cache"), 0, this);
        this.f40809d = d57Var.m10107e("journal");
        this.f40810e = d57Var.m10107e("journal.tmp");
        this.f40811f = d57Var.m10107e("journal.bkp");
    }

    /* JADX INFO: renamed from: J */
    public static void m12642J(String str) {
        if (f40794O.m15427f(str)) {
            return;
        }
        C3386nv.m17624j(ux5.m22986i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX INFO: renamed from: A */
    public final void m12643A() {
        while (this.f40812g > this.f40808c) {
            for (Object obj : this.f40814i.values()) {
                obj.getClass();
                zg2 zg2Var = (zg2) obj;
                if (!zg2Var.f71526f) {
                    m12654z(zg2Var);
                }
            }
            return;
        }
        this.f40801J = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12644a() {
        if (this.f40800I) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12645b(C3552rx c3552rx, boolean z) {
        zg2 zg2Var = (zg2) c3552rx.f59987b;
        if (!fa4.m11650l(zg2Var.f71527g, c3552rx)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !zg2Var.f71525e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) c3552rx.f59988c;
                zArr.getClass();
                if (!zArr[i]) {
                    c3552rx.m20967a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f40807b.m22434q((d57) zg2Var.f71524d.get(i))) {
                    c3552rx.m20967a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            d57 d57Var = (d57) zg2Var.f71524d.get(i2);
            if (!z || zg2Var.f71526f) {
                icb.m13768d(this.f40807b, d57Var);
            } else if (this.f40807b.m22434q(d57Var)) {
                d57 d57Var2 = (d57) zg2Var.f71523c.get(i2);
                this.f40807b.mo263b(d57Var, d57Var2);
                long j = zg2Var.f71522b[i2];
                Long l = (Long) this.f40807b.m22435u(d57Var2).f60615e;
                long jLongValue = l != null ? l.longValue() : 0L;
                zg2Var.f71522b[i2] = jLongValue;
                this.f40812g = (this.f40812g - j) + jLongValue;
            }
        }
        zg2Var.f71527g = null;
        if (zg2Var.f71526f) {
            m12654z(zg2Var);
            return;
        }
        this.f40815j++;
        d18 d18Var = this.f40813h;
        d18Var.getClass();
        if (zg2Var.f71525e || z) {
            zg2Var.f71525e = true;
            d18Var.mo461H(f40795P);
            d18Var.writeByte(32);
            d18Var.mo461H(zg2Var.f71521a);
            for (long j2 : zg2Var.f71522b) {
                d18Var.writeByte(32);
                d18Var.mo477c0(j2);
            }
            d18Var.writeByte(10);
            if (z) {
                long j3 = this.f40803L;
                this.f40803L = 1 + j3;
                zg2Var.f71529i = j3;
            }
        } else {
            this.f40814i.remove(zg2Var.f71521a);
            d18Var.mo461H(f40797R);
            d18Var.writeByte(32);
            d18Var.mo461H(zg2Var.f71521a);
            d18Var.writeByte(10);
        }
        d18Var.flush();
        if (this.f40812g > this.f40808c || m12649p()) {
            this.f40804M.m25753c(this.f40805N, 0L);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C3552rx m12646c(String str, long j) {
        str.getClass();
        m12648n();
        m12644a();
        m12642J(str);
        zg2 zg2Var = (zg2) this.f40814i.get(str);
        if (j != -1 && (zg2Var == null || zg2Var.f71529i != j)) {
            return null;
        }
        if ((zg2Var != null ? zg2Var.f71527g : null) != null) {
            return null;
        }
        if (zg2Var != null && zg2Var.f71528h != 0) {
            return null;
        }
        if (!this.f40801J && !this.f40802K) {
            d18 d18Var = this.f40813h;
            d18Var.getClass();
            d18Var.mo461H(f40796Q);
            d18Var.writeByte(32);
            d18Var.mo461H(str);
            d18Var.writeByte(10);
            d18Var.flush();
            if (this.f40816k) {
                return null;
            }
            if (zg2Var == null) {
                zg2Var = new zg2(this, str);
                this.f40814i.put(str, zg2Var);
            }
            C3552rx c3552rx = new C3552rx(this, zg2Var);
            zg2Var.f71527g = c3552rx;
            return c3552rx;
        }
        this.f40804M.m25753c(this.f40805N, 0L);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f40799H && !this.f40800I) {
                Collection collectionValues = this.f40814i.values();
                collectionValues.getClass();
                for (zg2 zg2Var : (zg2[]) collectionValues.toArray(new zg2[0])) {
                    zg2Var.getClass();
                    C3552rx c3552rx = zg2Var.f71527g;
                    if (c3552rx != null) {
                        c3552rx.m20970e();
                    }
                }
                m12643A();
                d18 d18Var = this.f40813h;
                if (d18Var != null) {
                    icb.m13766b(d18Var);
                }
                this.f40813h = null;
                this.f40800I = true;
                return;
            }
            this.f40800I = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized bh2 m12647e(String str) {
        str.getClass();
        m12648n();
        m12644a();
        m12642J(str);
        zg2 zg2Var = (zg2) this.f40814i.get(str);
        if (zg2Var == null) {
            return null;
        }
        bh2 bh2VarM25600a = zg2Var.m25600a();
        if (bh2VarM25600a == null) {
            return null;
        }
        this.f40815j++;
        d18 d18Var = this.f40813h;
        d18Var.getClass();
        d18Var.mo461H(f40798S);
        d18Var.writeByte(32);
        d18Var.mo461H(str);
        d18Var.writeByte(10);
        if (m12649p()) {
            this.f40804M.m25753c(this.f40805N, 0L);
        }
        return bh2VarM25600a;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f40799H) {
            m12644a();
            m12643A();
            d18 d18Var = this.f40813h;
            d18Var.getClass();
            d18Var.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #2 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bf, B:44:0x0083, B:46:0x00b8, B:48:0x00bc, B:49:0x00be, B:37:0x0066, B:53:0x00c6, B:28:0x0055, B:25:0x0050, B:45:0x00ae, B:19:0x0041), top: B:59:0x0003, inners: #1, #3, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #2 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bf, B:44:0x0083, B:46:0x00b8, B:48:0x00bc, B:49:0x00be, B:37:0x0066, B:53:0x00c6, B:28:0x0055, B:25:0x0050, B:45:0x00ae, B:19:0x0041), top: B:59:0x0003, inners: #1, #3, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final synchronized void m12648n() {
        boolean z;
        try {
            TimeZone timeZone = kcb.f47051a;
            if (this.f40799H) {
                return;
            }
            if (this.f40807b.m22434q(this.f40811f)) {
                boolean zM22434q = this.f40807b.m22434q(this.f40809d);
                eh2 eh2Var = this.f40807b;
                d57 d57Var = this.f40811f;
                if (zM22434q) {
                    eh2Var.m22433p(d57Var);
                } else {
                    eh2Var.mo263b(d57Var, this.f40809d);
                }
            }
            eh2 eh2Var2 = this.f40807b;
            d57 d57Var2 = this.f40811f;
            byte[] bArr = icb.f43946a;
            eh2Var2.getClass();
            d57Var2.getClass();
            t89 t89VarMo260J = eh2Var2.mo260J(d57Var2);
            try {
                eh2Var2.f57562b.mo265n(d57Var2);
                if (t89VarMo260J != null) {
                    try {
                        t89VarMo260J.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (t89VarMo260J != null) {
                    try {
                        t89VarMo260J.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        eh2Var2.f57562b.mo265n(d57Var2);
                        z = false;
                        this.f40817l = z;
                        if (this.f40807b.m22434q(this.f40809d)) {
                            try {
                                m12651r();
                                m12650q();
                                this.f40799H = true;
                                return;
                            } catch (IOException e) {
                                C2927dg c2927dg = u87.f63590a;
                                C2927dg c2927dg2 = u87.f63590a;
                                String str = "DiskLruCache " + this.f40806a + " is corrupt: " + e.getMessage() + ", removing";
                                c2927dg2.getClass();
                                Log.w("OkHttp", str, e);
                                try {
                                    close();
                                    icb.m13767c(this.f40806a, this.f40807b);
                                    this.f40800I = false;
                                    m12653x();
                                    this.f40799H = true;
                                } catch (Throwable th2) {
                                    this.f40800I = false;
                                    throw th2;
                                }
                            }
                        }
                        m12653x();
                        this.f40799H = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                eh2Var2.f57562b.mo265n(d57Var2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (t89VarMo260J != null) {
                    try {
                        t89VarMo260J.close();
                    } catch (Throwable th4) {
                        lda.m16117c(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                eh2Var2.f57562b.mo265n(d57Var2);
                z = false;
                this.f40817l = z;
                if (this.f40807b.m22434q(this.f40809d)) {
                    m12651r();
                    m12650q();
                    this.f40799H = true;
                    return;
                }
                m12653x();
                this.f40799H = true;
            }
            this.f40817l = z;
            if (this.f40807b.m22434q(this.f40809d)) {
                m12651r();
                m12650q();
                this.f40799H = true;
                return;
            }
            m12653x();
            this.f40799H = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12649p() {
        int i = this.f40815j;
        return i >= 2000 && i >= this.f40814i.size();
    }

    /* JADX INFO: renamed from: q */
    public final void m12650q() {
        d57 d57Var = this.f40810e;
        eh2 eh2Var = this.f40807b;
        icb.m13768d(eh2Var, d57Var);
        Iterator it = this.f40814i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            zg2 zg2Var = (zg2) next;
            int i = 0;
            if (zg2Var.f71527g == null) {
                while (i < 2) {
                    this.f40812g += zg2Var.f71522b[i];
                    i++;
                }
            } else {
                zg2Var.f71527g = null;
                while (i < 2) {
                    icb.m13768d(eh2Var, (d57) zg2Var.f71523c.get(i));
                    icb.m13768d(eh2Var, (d57) zg2Var.f71524d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX INFO: renamed from: r */
    public final void m12651r() throws Throwable {
        eh2 eh2Var = this.f40807b;
        d57 d57Var = this.f40809d;
        e18 e18VarM20390p = r46.m20390p(eh2Var.mo261N(d57Var));
        try {
            String strMo457D = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D2 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D3 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D4 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            String strMo457D5 = e18VarM20390p.mo457D(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo457D) || !"1".equals(strMo457D2) || !fa4.m11650l(String.valueOf(201105), strMo457D3) || !fa4.m11650l(String.valueOf(2), strMo457D4) || strMo457D5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo457D + ", " + strMo457D2 + ", " + strMo457D4 + ", " + strMo457D5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m12652u(e18VarM20390p.mo457D(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f40815j = i - this.f40814i.size();
                    if (e18VarM20390p.m10787a()) {
                        d18 d18Var = this.f40813h;
                        if (d18Var != null) {
                            icb.m13766b(d18Var);
                        }
                        eh2Var.getClass();
                        d57Var.getClass();
                        this.f40813h = new d18(new d13(eh2Var.mo262a(d57Var), (vi3) new C0011a9(this, 11)));
                    } else {
                        m12653x();
                    }
                    try {
                        e18VarM20390p.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
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
            if (th == null) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12652u(String str) throws IOException {
        String strSubstring;
        int iM23388k0 = vk9.m23388k0(str, ' ', 0, 6);
        if (iM23388k0 == -1) {
            v63.m23133k("unexpected journal line: ".concat(str));
            return;
        }
        int i = iM23388k0 + 1;
        int iM23388k1 = vk9.m23388k0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f40814i;
        if (iM23388k1 == -1) {
            strSubstring = str.substring(i);
            String str2 = f40797R;
            if (iM23388k0 == str2.length() && cl9.m4842Y(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM23388k1);
        }
        zg2 zg2Var = (zg2) linkedHashMap.get(strSubstring);
        if (zg2Var == null) {
            zg2Var = new zg2(this, strSubstring);
            linkedHashMap.put(strSubstring, zg2Var);
        }
        if (iM23388k1 != -1) {
            String str3 = f40795P;
            if (iM23388k0 == str3.length() && cl9.m4842Y(str, str3, false)) {
                List listM23366B0 = vk9.m23366B0(str.substring(iM23388k1 + 1), new char[]{' '});
                zg2Var.f71525e = true;
                zg2Var.f71527g = null;
                int size = listM23366B0.size();
                zg2Var.f71530j.getClass();
                if (size != 2) {
                    uk9.m22774h(listM23366B0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listM23366B0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        zg2Var.f71522b[i2] = Long.parseLong((String) listM23366B0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    uk9.m22774h(listM23366B0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iM23388k1 == -1) {
            String str4 = f40796Q;
            if (iM23388k0 == str4.length() && cl9.m4842Y(str, str4, false)) {
                zg2Var.f71527g = new C3552rx(this, zg2Var);
                return;
            }
        }
        if (iM23388k1 == -1) {
            String str5 = f40798S;
            if (iM23388k0 == str5.length() && cl9.m4842Y(str, str5, false)) {
                return;
            }
        }
        v63.m23133k("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m12653x() {
        Throwable th;
        try {
            d18 d18Var = this.f40813h;
            if (d18Var != null) {
                d18Var.close();
            }
            d18 d18VarM20389o = r46.m20389o(this.f40807b.mo260J(this.f40810e));
            try {
                d18VarM20389o.mo461H("libcore.io.DiskLruCache");
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo461H("1");
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo477c0(201105L);
                d18VarM20389o.writeByte(10);
                d18VarM20389o.mo477c0(2L);
                d18VarM20389o.writeByte(10);
                d18VarM20389o.writeByte(10);
                for (Object obj : this.f40814i.values()) {
                    obj.getClass();
                    zg2 zg2Var = (zg2) obj;
                    if (zg2Var.f71527g != null) {
                        d18VarM20389o.mo461H(f40796Q);
                        d18VarM20389o.writeByte(32);
                        d18VarM20389o.mo461H(zg2Var.f71521a);
                        d18VarM20389o.writeByte(10);
                    } else {
                        d18VarM20389o.mo461H(f40795P);
                        d18VarM20389o.writeByte(32);
                        d18VarM20389o.mo461H(zg2Var.f71521a);
                        for (long j : zg2Var.f71522b) {
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
            boolean zM22434q = this.f40807b.m22434q(this.f40809d);
            eh2 eh2Var = this.f40807b;
            if (zM22434q) {
                eh2Var.mo263b(this.f40809d, this.f40811f);
                this.f40807b.mo263b(this.f40810e, this.f40809d);
                icb.m13768d(this.f40807b, this.f40811f);
            } else {
                eh2Var.mo263b(this.f40810e, this.f40809d);
            }
            d18 d18Var2 = this.f40813h;
            if (d18Var2 != null) {
                icb.m13766b(d18Var2);
            }
            eh2 eh2Var2 = this.f40807b;
            d57 d57Var = this.f40809d;
            eh2Var2.getClass();
            d57Var.getClass();
            this.f40813h = new d18(new d13(eh2Var2.mo262a(d57Var), (vi3) new C0011a9(this, 11)));
            this.f40816k = false;
            this.f40802K = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12654z(zg2 zg2Var) {
        d18 d18Var;
        String str = zg2Var.f71521a;
        if (!this.f40817l) {
            if (zg2Var.f71528h > 0 && (d18Var = this.f40813h) != null) {
                d18Var.mo461H(f40796Q);
                d18Var.writeByte(32);
                d18Var.mo461H(str);
                d18Var.writeByte(10);
                d18Var.flush();
            }
            if (zg2Var.f71528h > 0 || zg2Var.f71527g != null) {
                zg2Var.f71526f = true;
                return;
            }
        }
        C3552rx c3552rx = zg2Var.f71527g;
        if (c3552rx != null) {
            c3552rx.m20970e();
        }
        for (int i = 0; i < 2; i++) {
            icb.m13768d(this.f40807b, (d57) zg2Var.f71523c.get(i));
            long j = this.f40812g;
            long[] jArr = zg2Var.f71522b;
            this.f40812g = j - jArr[i];
            jArr[i] = 0;
        }
        this.f40815j++;
        d18 d18Var2 = this.f40813h;
        if (d18Var2 != null) {
            d18Var2.mo461H(f40797R);
            d18Var2.writeByte(32);
            d18Var2.mo461H(str);
            d18Var2.writeByte(10);
        }
        this.f40814i.remove(str);
        if (m12649p()) {
            this.f40804M.m25753c(this.f40805N, 0L);
        }
    }
}
