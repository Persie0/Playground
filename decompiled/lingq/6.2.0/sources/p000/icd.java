package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public abstract class icd {
    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m13780a(ArrayList arrayList) {
        String str = d57.f35013b;
        d57 d57VarM12976h = gz8.m12976h("/", false);
        Pair[] pairArr = {new Pair(d57VarM12976h, new zbb(d57VarM12976h, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(1));
        AbstractC3194a.m15369V(linkedHashMap, pairArr);
        for (zbb zbbVar : u91.m22614f1(arrayList, new yd7(12))) {
            if (((zbb) linkedHashMap.put(zbbVar.f71322a, zbbVar)) == null) {
                while (true) {
                    d57 d57Var = zbbVar.f71322a;
                    d57 d57VarM10105c = d57Var.m10105c();
                    if (d57VarM10105c == null) {
                        break;
                    }
                    zbb zbbVar2 = (zbb) linkedHashMap.get(d57VarM10105c);
                    if (zbbVar2 != null) {
                        zbbVar2.f71338q.add(d57Var);
                        break;
                    }
                    zbb zbbVar3 = new zbb(d57VarM10105c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(d57VarM10105c, zbbVar3);
                    zbbVar3.f71338q.add(d57Var);
                    zbbVar = zbbVar3;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public static final Long m13781b(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* JADX INFO: renamed from: c */
    public static final long m13782c(long j) {
        return (j / 10000) - 11644473600000L;
    }

    /* JADX INFO: renamed from: d */
    public static Set m13783d() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m13784e(int i) {
        ci8.m4727l(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3 A[Catch: all -> 0x0147, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:66:0x0146, B:62:0x013f, B:69:0x014b, B:97:0x01a6, B:100:0x01b3, B:95:0x01a1, B:107:0x01bf, B:110:0x01cb, B:111:0x01d2, B:112:0x01d3, B:113:0x01d6, B:114:0x01d7, B:115:0x01ec, B:92:0x019c, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:50:0x0129, B:46:0x0122, B:53:0x012d, B:54:0x0132, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:104:0x01b7, B:105:0x01bc, B:59:0x013a), top: B:129:0x000a, inners: #0, #5, #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:66:0x0146, B:62:0x013f, B:69:0x014b, B:97:0x01a6, B:100:0x01b3, B:95:0x01a1, B:107:0x01bf, B:110:0x01cb, B:111:0x01d2, B:112:0x01d3, B:113:0x01d6, B:114:0x01d7, B:115:0x01ec, B:92:0x019c, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:50:0x0129, B:46:0x0122, B:53:0x012d, B:54:0x0132, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:104:0x01b7, B:105:0x01bc, B:59:0x013a), top: B:129:0x000a, inners: #0, #5, #9, #13 }] */
    /* JADX INFO: renamed from: f */
    public static final acb m13785f(d57 d57Var, u33 u33Var, qv7 qv7Var) {
        e18 e18Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        qg4 qg4VarMo268z = u33Var.mo268z(d57Var);
        try {
            long size = qg4VarMo268z.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + qg4VarMo268z.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                e18 e18Var2 = new e18(qg4VarMo268z.m19948b(j));
                try {
                    if (e18Var2.mo465Q() == 101010256) {
                        int iMo469V = e18Var2.mo469V() & 65535;
                        int iMo469V2 = e18Var2.mo469V() & 65535;
                        long jMo469V = e18Var2.mo469V() & 65535;
                        if (jMo469V != (e18Var2.mo469V() & 65535) || iMo469V != 0 || iMo469V2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        e18Var2.skip(4L);
                        long jMo465Q = ((long) e18Var2.mo465Q()) & 4294967295L;
                        int iMo469V3 = e18Var2.mo469V() & 65535;
                        at2 at2Var = new at2(iMo469V3, jMo469V, jMo465Q);
                        e18Var2.m10792p(iMo469V3);
                        e18Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            e18 e18Var3 = new e18(qg4VarMo268z.m19948b(j3));
                            try {
                                if (e18Var3.mo465Q() == 117853008) {
                                    int iMo465Q = e18Var3.mo465Q();
                                    long jM10791n = e18Var3.m10791n();
                                    if (e18Var3.mo465Q() != 1 || iMo465Q != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    e18 e18Var4 = new e18(qg4VarMo268z.m19948b(jM10791n));
                                    try {
                                        int iMo465Q2 = e18Var4.mo465Q();
                                        if (iMo465Q2 != 101075792) {
                                            throw new IOException("bad zip: expected " + m13784e(101075792) + " but was " + m13784e(iMo465Q2));
                                        }
                                        e18Var4.skip(12L);
                                        int iMo465Q3 = e18Var4.mo465Q();
                                        int iMo465Q4 = e18Var4.mo465Q();
                                        long jM10791n2 = e18Var4.m10791n();
                                        if (jM10791n2 != e18Var4.m10791n() || iMo465Q3 != 0 || iMo465Q4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        e18Var4.skip(8L);
                                        at2 at2Var2 = new at2(iMo469V3, jM10791n2, e18Var4.m10791n());
                                        try {
                                            e18Var4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        at2Var = at2Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            e18Var4.close();
                                        } catch (Throwable th6) {
                                            lda.m16117c(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    e18Var3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    e18Var3.close();
                                } catch (Throwable th9) {
                                    lda.m16117c(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        e18 e18Var5 = new e18(qg4VarMo268z.m19948b(at2Var.f7455b));
                        try {
                            long j4 = at2Var.f7454a;
                            while (j2 < j4) {
                                zbb zbbVarM13786g = m13786g(e18Var5);
                                e18Var = e18Var5;
                                try {
                                    if (zbbVarM13786g.f71329h >= at2Var.f7455b) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) qv7Var.invoke(zbbVarM13786g)).booleanValue()) {
                                        arrayList.add(zbbVarM13786g);
                                    }
                                    j2++;
                                    e18Var5 = e18Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        e18Var.close();
                                    } catch (Throwable th11) {
                                        lda.m16117c(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    acb acbVar = new acb(d57Var, u33Var, m13780a(arrayList));
                                    try {
                                        qg4VarMo268z.close();
                                    } catch (Throwable unused) {
                                    }
                                    return acbVar;
                                }
                            }
                            try {
                                e18Var5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            e18Var = e18Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        acb acbVar2 = new acb(d57Var, u33Var, m13780a(arrayList));
                        qg4VarMo268z.close();
                        return acbVar2;
                    }
                    e18Var2.close();
                    j--;
                } catch (Throwable th14) {
                    e18Var2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (qg4VarMo268z == null) {
                throw th15;
            }
            try {
                qg4VarMo268z.close();
                throw th15;
            } catch (Throwable th16) {
                lda.m16117c(th15, th16);
                throw th15;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final zbb m13786g(final e18 e18Var) throws IOException {
        int iMo465Q = e18Var.mo465Q();
        if (iMo465Q != 33639248) {
            throw new IOException("bad zip: expected " + m13784e(33639248) + " but was " + m13784e(iMo465Q));
        }
        e18Var.skip(4L);
        short sMo469V = e18Var.mo469V();
        int i = sMo469V & 65535;
        if ((sMo469V & 1) != 0) {
            v63.m23133k("unsupported zip: general purpose bit flag=".concat(m13784e(i)));
            return null;
        }
        int iMo469V = e18Var.mo469V() & 65535;
        int iMo469V2 = e18Var.mo469V() & 65535;
        int iMo469V3 = e18Var.mo469V() & 65535;
        long jMo465Q = ((long) e18Var.mo465Q()) & 4294967295L;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f47717a = ((long) e18Var.mo465Q()) & 4294967295L;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.f47717a = ((long) e18Var.mo465Q()) & 4294967295L;
        int iMo469V4 = e18Var.mo469V() & 65535;
        int iMo469V5 = e18Var.mo469V() & 65535;
        int iMo469V6 = e18Var.mo469V() & 65535;
        e18Var.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.f47717a = ((long) e18Var.mo465Q()) & 4294967295L;
        String strM10792p = e18Var.m10792p(iMo469V4);
        if (vk9.m23381d0(strM10792p, (char) 0)) {
            v63.m23133k("bad zip: filename contains 0x00");
            return null;
        }
        long j = ref$LongRef2.f47717a == 4294967295L ? 8L : 0L;
        if (ref$LongRef.f47717a == 4294967295L) {
            j += 8;
        }
        if (ref$LongRef3.f47717a == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        m13787h(e18Var, iMo469V5, new zi3() { // from class: bcb
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                e18 e18Var2 = e18Var;
                if (iIntValue == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.f47713a) {
                        v63.m23133k("bad zip: zip64 extra repeated");
                        return null;
                    }
                    ref$BooleanRef2.f47713a = true;
                    if (jLongValue < j2) {
                        v63.m23133k("bad zip: zip64 extra too short");
                        return null;
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long jM10791n = ref$LongRef4.f47717a;
                    if (jM10791n == 4294967295L) {
                        jM10791n = e18Var2.m10791n();
                    }
                    ref$LongRef4.f47717a = jM10791n;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.f47717a = ref$LongRef5.f47717a == 4294967295L ? e18Var2.m10791n() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.f47717a = ref$LongRef6.f47717a == 4294967295L ? e18Var2.m10791n() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        v63.m23133k("bad zip: NTFS extra too short");
                        return null;
                    }
                    e18Var2.skip(4L);
                    icd.m13787h(e18Var2, (int) (jLongValue - 4), new h39(ref$ObjectRef, e18Var2, ref$ObjectRef2, ref$ObjectRef3, 15));
                }
                return xfa.f68157a;
            }
        });
        if (j2 > 0 && !ref$BooleanRef.f47713a) {
            v63.m23133k("bad zip: zip64 extra required but absent");
            return null;
        }
        String strM10792p2 = e18Var.m10792p(iMo469V6);
        String str = d57.f35013b;
        return new zbb(gz8.m12976h("/", false).m10107e(strM10792p), cl9.m4833P(strM10792p, "/", false), strM10792p2, jMo465Q, ref$LongRef.f47717a, ref$LongRef2.f47717a, iMo469V, ref$LongRef3.f47717a, iMo469V3, iMo469V2, (Long) ref$ObjectRef.f47718a, (Long) ref$ObjectRef2.f47718a, (Long) ref$ObjectRef3.f47718a, 57344);
    }

    /* JADX INFO: renamed from: h */
    public static final void m13787h(hj0 hj0Var, int i, zi3 zi3Var) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                v63.m23133k("bad zip: truncated header in extra field");
                return;
            }
            int iMo469V = hj0Var.mo469V() & 65535;
            long jMo469V = ((long) hj0Var.mo469V()) & 65535;
            long j2 = j - 4;
            if (j2 < jMo469V) {
                v63.m23133k("bad zip: truncated value in extra field");
                return;
            }
            hj0Var.mo475b0(jMo469V);
            long j3 = hj0Var.mo482h().f723b;
            zi3Var.invoke(Integer.valueOf(iMo469V), Long.valueOf(jMo469V));
            long j4 = (hj0Var.mo482h().f723b + jMo469V) - j3;
            if (j4 < 0) {
                v63.m23133k(ux5.m22988k(iMo469V, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    hj0Var.mo482h().skip(j4);
                }
                j = j2 - jMo469V;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final zbb m13788i(e18 e18Var, zbb zbbVar) throws IOException {
        zbb zbbVarM13789j = m13789j(e18Var, zbbVar);
        zbbVarM13789j.getClass();
        return zbbVarM13789j;
    }

    /* JADX INFO: renamed from: j */
    public static final zbb m13789j(hj0 hj0Var, zbb zbbVar) throws IOException {
        int iMo465Q = hj0Var.mo465Q();
        if (iMo465Q != 67324752) {
            throw new IOException("bad zip: expected " + m13784e(67324752) + " but was " + m13784e(iMo465Q));
        }
        hj0Var.skip(2L);
        short sMo469V = hj0Var.mo469V();
        int i = sMo469V & 65535;
        if ((sMo469V & 1) != 0) {
            v63.m23133k("unsupported zip: general purpose bit flag=".concat(m13784e(i)));
            return null;
        }
        hj0Var.skip(18L);
        long jMo469V = ((long) hj0Var.mo469V()) & 65535;
        int iMo469V = hj0Var.mo469V() & 65535;
        hj0Var.skip(jMo469V);
        if (zbbVar == null) {
            hj0Var.skip(iMo469V);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        m13787h(hj0Var, iMo469V, new h39(hj0Var, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, 14));
        return new zbb(zbbVar.f71322a, zbbVar.f71323b, zbbVar.f71324c, zbbVar.f71325d, zbbVar.f71326e, zbbVar.f71327f, zbbVar.f71328g, zbbVar.f71329h, zbbVar.f71330i, zbbVar.f71331j, zbbVar.f71332k, zbbVar.f71333l, zbbVar.f71334m, (Integer) ref$ObjectRef.f47718a, (Integer) ref$ObjectRef2.f47718a, (Integer) ref$ObjectRef3.f47718a);
    }

    /* JADX INFO: renamed from: k */
    public static final void m13790k(e18 e18Var) {
        e18Var.getClass();
        m13789j(e18Var, null);
    }
}
