package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.o66;
import p000.pf1;
import p000.t16;
import p000.xfa;
import p000.z36;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m4291f = "Recomposer.kt", m4292l = {615, 626}, m4293m = "invokeSuspend", m4294v = 1)
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public List f3680a;

    /* JADX INFO: renamed from: b */
    public List f3681b;

    /* JADX INFO: renamed from: c */
    public List f3682c;

    /* JADX INFO: renamed from: d */
    public o66 f3683d;

    /* JADX INFO: renamed from: e */
    public o66 f3684e;

    /* JADX INFO: renamed from: f */
    public o66 f3685f;

    /* JADX INFO: renamed from: g */
    public Set f3686g;

    /* JADX INFO: renamed from: h */
    public o66 f3687h;

    /* JADX INFO: renamed from: i */
    public int f3688i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ t16 f3689j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0281i f3690k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(C0281i c0281i, Continuation continuation) {
        super(3, continuation);
        this.f3690k = c0281i;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[Catch: all -> 0x002c, LOOP:1: B:12:0x0042->B:22:0x0078, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: all -> 0x002c, LOOP:3: B:27:0x0090->B:37:0x00bd, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: all -> 0x002c, LOOP:5: B:41:0x00d0->B:51:0x0100, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[EDGE_INSN: B:61:0x0083->B:24:0x0083 BREAK  A[LOOP:1: B:12:0x0042->B:22:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[EDGE_INSN: B:66:0x00c0->B:38:0x00c0 BREAK  A[LOOP:3: B:27:0x0090->B:37:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[EDGE_INSN: B:71:0x0103->B:52:0x0103 BREAK  A[LOOP:5: B:41:0x00d0->B:51:0x0100], SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m1220g(C0281i c0281i, List list, List list2, List list3, o66 o66Var, o66 o66Var2, o66 o66Var3, o66 o66Var4) {
        char c;
        long j;
        long j2;
        synchronized (c0281i.f3757d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    pf1 pf1Var = (pf1) list3.get(i);
                    pf1Var.m19086b();
                    c0281i.m1281M(pf1Var);
                }
                list3.clear();
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    pf1 pf1Var2 = (pf1) objArr[(i2 << 3) + i4];
                                    pf1Var2.m19086b();
                                    c0281i.m1281M(pf1Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                o66Var.m17812e();
                Object[] objArr2 = o66Var2.f1303b;
                long[] jArr2 = o66Var2.f1302a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((pf1) objArr2[(i5 << 3) + i7]).m19092h();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                o66Var2.m17812e();
                o66Var3.m17812e();
                Object[] objArr3 = o66Var4.f1303b;
                long[] jArr3 = o66Var4.f1302a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    pf1 pf1Var3 = (pf1) objArr3[(i8 << 3) + i10];
                                    pf1Var3.m19086b();
                                    c0281i.m1281M(pf1Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                o66Var4.m17812e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m1221k(List list, C0281i c0281i) {
        list.clear();
        synchronized (c0281i.f3757d) {
            try {
                ArrayList arrayList = c0281i.f3765l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((z36) arrayList.get(i));
                }
                c0281i.f3765l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f3690k, (Continuation) obj3);
        recomposer$runRecomposeAndApplyChanges$2.f3689j = (t16) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:2: B:18:0x00b7->B:86:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016a -> B:54:0x0172). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x021f -> B:12:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
