package p289o5;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import cc.C1846i7;
import cc.C1847j;
import cc.C1860k3;
import cc.C1897o4;
import cc.C1905p3;
import cc.C1959v3;
import cc.InterfaceC1878m3;
import com.google.android.play.core.assetpacks.C3118i;
import dm.C5207g;
import gn.InterfaceC5827g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7646c;
import p016an.InterfaceC0130d;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.InterfaceC5747c;
import p152hb.C5998p;
import p176ib.C6272i;
import p260m8.C7499b;
import p290o6.CallableC7948c;
import p291o7.C8004n;
import p291o7.CallableC8001k;
import p299of.C8039a;
import p299of.C8040b;
import p338qd.C8579t0;
import p338qd.InterfaceC8585v0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;

/* JADX INFO: renamed from: o5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7940t implements InterfaceC5747c, InterfaceC1878m3, InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public Object f43256a;

    /* JADX INFO: renamed from: b */
    public final Object f43257b;

    public C7940t(int i10) {
        if (i10 == 2) {
            this.f43256a = Boolean.TRUE;
            this.f43257b = new Object();
        } else if (i10 != 8) {
            this.f43256a = new HashMap();
            this.f43257b = new HashMap();
        } else {
            this.f43256a = new AtomicInteger();
            this.f43257b = new AtomicInteger();
        }
    }

    public /* synthetic */ C7940t(Object obj, Object obj2) {
        this.f43256a = obj2;
        this.f43257b = obj;
    }

    public C7940t(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        InterfaceC0130d.a aVar = InterfaceC0130d.f337a;
        this.f43256a = lazyJavaPackageFragmentProvider;
        this.f43257b = aVar;
    }

    public C7940t(CallableC8001k callableC8001k) {
        this.f43257b = new CountDownLatch(1);
        C8004n.m15873c().execute(new FutureTask(new CallableC7948c(this, 1, callableC8001k)));
    }

    public C7940t(C8039a c8039a) {
        this.f43257b = c8039a;
        ArrayList arrayList = new ArrayList();
        this.f43256a = arrayList;
        arrayList.add(new C8040b(c8039a, new int[]{1}));
    }

    /* JADX INFO: renamed from: a */
    public final void m15750a(int[] iArr, int i10) {
        int[] iArr2;
        C8040b c8040b;
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        int size = ((List) this.f43256a).size();
        int i11 = 0;
        int i12 = 1;
        Object obj = this.f43257b;
        if (i10 >= size) {
            List list = (List) this.f43256a;
            C8040b c8040b2 = (C8040b) list.get(list.size() - 1);
            int size2 = ((List) this.f43256a).size();
            while (size2 <= i10) {
                C8039a c8039a = (C8039a) obj;
                int[] iArr3 = new int[2];
                iArr3[i11] = i12;
                iArr3[i12] = c8039a.f43697a[(size2 - 1) + c8039a.f43702f];
                C8040b c8040b3 = new C8040b(c8039a, iArr3);
                c8040b2.getClass();
                C8039a c8039a2 = c8040b2.f43703a;
                if (!c8039a2.equals(c8039a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (c8040b2.m15924b() || c8040b3.m15924b()) {
                    c8040b2 = c8039a2.f43699c;
                } else {
                    int[] iArr4 = c8040b2.f43704b;
                    int length2 = iArr4.length;
                    int[] iArr5 = c8040b3.f43704b;
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[(length2 + length3) - 1];
                    int i13 = i11;
                    while (i13 < length2) {
                        int i14 = iArr4[i13];
                        while (i11 < length3) {
                            int i15 = i13 + i11;
                            iArr6[i15] = c8039a2.m15922a(i14, iArr5[i11]) ^ iArr6[i15];
                            i11++;
                            iArr4 = iArr4;
                        }
                        i13++;
                        i11 = 0;
                    }
                    c8040b2 = new C8040b(c8039a2, iArr6);
                }
                ((List) this.f43256a).add(c8040b2);
                size2++;
                i11 = 0;
                i12 = 1;
            }
        }
        C8040b c8040b4 = (C8040b) ((List) this.f43256a).get(i10);
        int[] iArr7 = new int[length];
        System.arraycopy(iArr, 0, iArr7, 0, length);
        C8040b c8040bM15925c = new C8040b((C8039a) obj, iArr7).m15925c(i10, 1);
        c8040bM15925c.getClass();
        C8039a c8039a3 = c8040b4.f43703a;
        C8039a c8039a4 = c8040bM15925c.f43703a;
        if (!c8039a4.equals(c8039a3)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c8040b4.m15924b()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int[] iArr8 = c8040b4.f43704b;
        int i16 = iArr8[(iArr8.length - 1) - (iArr8.length - 1)];
        if (i16 == 0) {
            throw new ArithmeticException();
        }
        int i17 = c8039a4.f43697a[(c8039a4.f43700d - c8039a4.f43698b[i16]) - 1];
        C8040b c8040b5 = c8039a4.f43699c;
        C8040b c8040bM15923a = c8040b5;
        while (true) {
            iArr2 = c8040bM15925c.f43704b;
            if (iArr2.length - 1 < iArr8.length - 1 || c8040bM15925c.m15924b()) {
                break;
            }
            int length4 = (iArr2.length - 1) - (iArr8.length - 1);
            int length5 = iArr2.length - 1;
            int[] iArr9 = c8040bM15925c.f43704b;
            int iM15922a = c8039a4.m15922a(iArr9[(iArr9.length - 1) - length5], i17);
            C8040b c8040bM15925c2 = c8040b4.m15925c(length4, iM15922a);
            if (length4 < 0) {
                throw new IllegalArgumentException();
            }
            if (iM15922a == 0) {
                c8040b = c8040b5;
            } else {
                int[] iArr10 = new int[length4 + 1];
                iArr10[0] = iM15922a;
                c8040b = new C8040b(c8039a4, iArr10);
            }
            c8040bM15923a = c8040bM15923a.m15923a(c8040b);
            c8040bM15925c = c8040bM15925c.m15923a(c8040bM15925c2);
        }
        int length6 = i10 - iArr2.length;
        for (int i18 = 0; i18 < length6; i18++) {
            iArr[length + i18] = 0;
        }
        System.arraycopy(iArr2, 0, iArr, length + length6, iArr2.length);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #2 {all -> 0x012d, blocks: (B:14:0x007b, B:15:0x007f, B:17:0x0086, B:18:0x008e, B:19:0x00af, B:22:0x00bd, B:23:0x00c4, B:25:0x00c6, B:26:0x00da, B:28:0x00dc, B:30:0x00e2, B:34:0x00eb, B:36:0x00ed), top: B:66:0x007b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x011f A[Catch: SQLiteException -> 0x012b, all -> 0x01cd, TryCatch #3 {SQLiteException -> 0x012b, blocks: (B:13:0x0033, B:37:0x00f8, B:39:0x0114, B:41:0x011b, B:43:0x0127, B:42:0x011f, B:47:0x012e, B:48:0x0138), top: B:67:0x0033, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x016b A[Catch: all -> 0x01cd, PHI: r11
      0x016b: PHI (r11v18 int) = (r11v1 int), (r11v0 int) binds: [B:12:0x0031, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x01cd, blocks: (B:5:0x0016, B:6:0x0018, B:50:0x016b, B:56:0x01b7, B:55:0x01a0, B:13:0x0033, B:37:0x00f8, B:39:0x0114, B:41:0x011b, B:43:0x0127, B:42:0x011f, B:47:0x012e, B:48:0x0138, B:49:0x0139), top: B:68:0x0016, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0 A[Catch: all -> 0x01cd, TryCatch #4 {all -> 0x01cd, blocks: (B:5:0x0016, B:6:0x0018, B:50:0x016b, B:56:0x01b7, B:55:0x01a0, B:13:0x0033, B:37:0x00f8, B:39:0x0114, B:41:0x011b, B:43:0x0127, B:42:0x011f, B:47:0x012e, B:48:0x0138, B:49:0x0139), top: B:68:0x0016, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1878m3
    /* JADX INFO: renamed from: b */
    public final void mo5573b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        C1905p3 c1905p3;
        C1847j c1847j;
        long jLongValue;
        C1846i7 c1846i7 = (C1846i7) this.f43257b;
        c1846i7.mo5518f().mo5748g();
        c1846i7.m5648g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                c1846i7.f9879O = false;
                c1846i7.m5633A();
                throw th3;
            }
        }
        ArrayList<Long> arrayList = c1846i7.f9883S;
        C6272i.m12915i(arrayList);
        c1846i7.f9883S = null;
        if (i10 == 200) {
            if (th2 == null) {
                try {
                    C1959v3 c1959v3 = c1846i7.f9899i.f10096g;
                    ((C7499b) c1846i7.mo5514b()).getClass();
                    c1959v3.m5898b(System.currentTimeMillis());
                    c1846i7.f9899i.f10097h.m5898b(0L);
                    c1846i7.m5635C();
                    c1846i7.mo5517e().f9938I.m5625c(Integer.valueOf(i10), Integer.valueOf(bArr.length), "Successful upload. Got network response. code, size");
                    C1847j c1847j2 = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j2);
                    c1847j2.m5680N();
                    try {
                        for (Long l10 : arrayList) {
                            try {
                                c1847j = c1846i7.f9893c;
                                C1846i7.m5629H(c1847j);
                                jLongValue = l10.longValue();
                                c1847j.mo5748g();
                                c1847j.m5494h();
                                try {
                                    if (c1847j.m5667A().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e10) {
                                    C1860k3 c1860k3 = ((C1897o4) c1847j.f10430a).f10086i;
                                    C1897o4.m5776k(c1860k3);
                                    c1860k3.f9942f.m5624b(e10, "Failed to delete a bundle in a queue table");
                                    throw e10;
                                }
                            } catch (SQLiteException e11) {
                                ArrayList arrayList2 = c1846i7.f9884T;
                                if (arrayList2 == null || !arrayList2.contains(l10)) {
                                    throw e11;
                                }
                            }
                        }
                        C1847j c1847j3 = c1846i7.f9893c;
                        C1846i7.m5629H(c1847j3);
                        c1847j3.m5685m();
                        C1847j c1847j4 = c1846i7.f9893c;
                        C1846i7.m5629H(c1847j4);
                        c1847j4.m5681O();
                        c1846i7.f9884T = null;
                        c1905p3 = c1846i7.f9892b;
                        C1846i7.m5629H(c1905p3);
                        if (c1905p3.m5850l() || !c1846i7.m5637E()) {
                            c1846i7.f9885U = -1L;
                            c1846i7.m5635C();
                        } else {
                            c1846i7.m5661t();
                        }
                        c1846i7.f9874J = 0L;
                    } catch (Throwable th4) {
                        C1847j c1847j5 = c1846i7.f9893c;
                        C1846i7.m5629H(c1847j5);
                        c1847j5.m5681O();
                        throw th4;
                    }
                } catch (SQLiteException e12) {
                    c1846i7.mo5517e().f9942f.m5624b(e12, "Database error while trying to delete uploaded bundles");
                    ((C7499b) c1846i7.mo5514b()).getClass();
                    c1846i7.f9874J = SystemClock.elapsedRealtime();
                    c1846i7.mo5517e().f9938I.m5624b(Long.valueOf(c1846i7.f9874J), "Disable upload, time");
                }
            } else {
                c1846i7.mo5517e().f9938I.m5625c(Integer.valueOf(i10), th2, "Network upload failed. Will retry later. code, error");
                C1959v3 c1959v4 = c1846i7.f9899i.f10097h;
                ((C7499b) c1846i7.mo5514b()).getClass();
                c1959v4.m5898b(System.currentTimeMillis());
                if (i10 != 503 || i10 == 429) {
                    C1959v3 c1959v5 = c1846i7.f9899i.f10095f;
                    ((C7499b) c1846i7.mo5514b()).getClass();
                    c1959v5.m5898b(System.currentTimeMillis());
                }
                C1847j c1847j6 = c1846i7.f9893c;
                C1846i7.m5629H(c1847j6);
                c1847j6.m5682P(arrayList);
                c1846i7.m5635C();
            }
        } else if (i10 == 204) {
            i10 = 204;
            if (th2 == null) {
                C1959v3 c1959v6 = c1846i7.f9899i.f10096g;
                ((C7499b) c1846i7.mo5514b()).getClass();
                c1959v6.m5898b(System.currentTimeMillis());
                c1846i7.f9899i.f10097h.m5898b(0L);
                c1846i7.m5635C();
                c1846i7.mo5517e().f9938I.m5625c(Integer.valueOf(i10), Integer.valueOf(bArr.length), "Successful upload. Got network response. code, size");
                C1847j c1847j7 = c1846i7.f9893c;
                C1846i7.m5629H(c1847j7);
                c1847j7.m5680N();
                while (r11.hasNext()) {
                    c1847j = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j);
                    jLongValue = l10.longValue();
                    c1847j.mo5748g();
                    c1847j.m5494h();
                    if (c1847j.m5667A().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                C1847j c1847j8 = c1846i7.f9893c;
                C1846i7.m5629H(c1847j8);
                c1847j8.m5685m();
                C1847j c1847j9 = c1846i7.f9893c;
                C1846i7.m5629H(c1847j9);
                c1847j9.m5681O();
                c1846i7.f9884T = null;
                c1905p3 = c1846i7.f9892b;
                C1846i7.m5629H(c1905p3);
                if (c1905p3.m5850l()) {
                    c1846i7.f9885U = -1L;
                    c1846i7.m5635C();
                } else {
                    c1846i7.f9885U = -1L;
                    c1846i7.m5635C();
                }
                c1846i7.f9874J = 0L;
            } else {
                c1846i7.mo5517e().f9938I.m5625c(Integer.valueOf(i10), th2, "Network upload failed. Will retry later. code, error");
                C1959v3 c1959v7 = c1846i7.f9899i.f10097h;
                ((C7499b) c1846i7.mo5514b()).getClass();
                c1959v7.m5898b(System.currentTimeMillis());
                if (i10 != 503) {
                    C1959v3 c1959v8 = c1846i7.f9899i.f10095f;
                    ((C7499b) c1846i7.mo5514b()).getClass();
                    c1959v8.m5898b(System.currentTimeMillis());
                } else {
                    C1959v3 c1959v9 = c1846i7.f9899i.f10095f;
                    ((C7499b) c1846i7.mo5514b()).getClass();
                    c1959v9.m5898b(System.currentTimeMillis());
                }
                C1847j c1847j10 = c1846i7.f9893c;
                C1846i7.m5629H(c1847j10);
                c1847j10.m5682P(arrayList);
                c1846i7.m5635C();
            }
        } else {
            c1846i7.mo5517e().f9938I.m5625c(Integer.valueOf(i10), th2, "Network upload failed. Will retry later. code, error");
            C1959v3 c1959v10 = c1846i7.f9899i.f10097h;
            ((C7499b) c1846i7.mo5514b()).getClass();
            c1959v10.m5898b(System.currentTimeMillis());
            if (i10 != 503) {
                C1959v3 c1959v11 = c1846i7.f9899i.f10095f;
                ((C7499b) c1846i7.mo5514b()).getClass();
                c1959v11.m5898b(System.currentTimeMillis());
            } else {
                C1959v3 c1959v12 = c1846i7.f9899i.f10095f;
                ((C7499b) c1846i7.mo5514b()).getClass();
                c1959v12.m5898b(System.currentTimeMillis());
            }
            C1847j c1847j11 = c1846i7.f9893c;
            C1846i7.m5629H(c1847j11);
            c1847j11.m5682P(arrayList);
            c1846i7.m5635C();
        }
        c1846i7.f9879O = false;
        c1846i7.m5633A();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8830c m15751c(InterfaceC5827g interfaceC5827g) {
        C7646c c7646cMo12252e = interfaceC5827g.mo12252e();
        InterfaceC8830c interfaceC8830cM13719v = null;
        if (c7646cMo12252e != null) {
            interfaceC5827g.mo12249Q();
            if (LightClassOriginKind.SOURCE == null) {
                ((InterfaceC0130d.a) ((InterfaceC0130d) this.f43257b)).getClass();
                return null;
            }
        }
        C6831a c6831aMo12257u = interfaceC5827g.mo12257u();
        if (c6831aMo12257u != null) {
            InterfaceC8830c interfaceC8830cM15751c = m15751c(c6831aMo12257u);
            MemberScope memberScopeMo13687H0 = interfaceC8830cM15751c != null ? interfaceC8830cM15751c.mo13687H0() : null;
            InterfaceC8834e interfaceC8834eMo5304g = memberScopeMo13687H0 != null ? memberScopeMo13687H0.mo5304g(interfaceC5827g.mo12280a(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (interfaceC8834eMo5304g instanceof InterfaceC8830c) {
                return (InterfaceC8830c) interfaceC8834eMo5304g;
            }
            return null;
        }
        if (c7646cMo12252e == null) {
            return null;
        }
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = (LazyJavaPackageFragmentProvider) this.f43256a;
        C7646c c7646cM15217e = c7646cMo12252e.m15217e();
        C5207g.m11110e(c7646cM15217e, "fqName.parent()");
        LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) C6752c.m13425S(lazyJavaPackageFragmentProvider.mo13606b(c7646cM15217e));
        if (lazyJavaPackageFragment != null) {
            LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.f38750j.f38689d;
            lazyJavaPackageScope.getClass();
            interfaceC8830cM13719v = lazyJavaPackageScope.m13719v(interfaceC5827g.mo12280a(), interfaceC5827g);
        }
        return interfaceC8830cM13719v;
    }

    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public final void mo205e(AbstractC5751g abstractC5751g) {
        ((C5998p) this.f43257b).f35568b.remove((C5752h) this.f43256a);
    }

    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        C3118i c3118i = (C3118i) this.f43257b;
        List list = (List) this.f43256a;
        c3118i.getClass();
        HashMap map = new HashMap();
        for (C8579t0 c8579t0 : c3118i.f15938e.values()) {
            String str = c8579t0.f46010c.f45992a;
            if (list.contains(str)) {
                C8579t0 c8579t1 = (C8579t0) map.get(str);
                if ((c8579t1 == null ? -1 : c8579t1.f46008a) < c8579t0.f46008a) {
                    map.put(str, c8579t0);
                }
            }
        }
        return map;
    }
}
