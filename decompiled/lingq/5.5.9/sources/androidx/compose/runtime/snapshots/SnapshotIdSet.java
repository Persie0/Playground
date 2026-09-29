package androidx.compose.runtime.snapshots;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p100em.InterfaceC5429a;
import p249lo.AbstractC7417j;
import p249lo.C7416i;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9322j;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, InterfaceC5429a {

    /* JADX INFO: renamed from: e */
    public static final SnapshotIdSet f3249e = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public final long f3250a;

    /* JADX INFO: renamed from: b */
    public final long f3251b;

    /* JADX INFO: renamed from: c */
    public final int f3252c;

    /* JADX INFO: renamed from: d */
    public final int[] f3253d;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Llo/j;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m19206f = "SnapshotIdSet.kt", m19207l = {295, 300, 307}, m19208m = "invokeSuspend")
    public static final class C04901 extends RestrictedSuspendLambda implements InterfaceC2056p<AbstractC7417j<? super Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: c */
        public int[] f3254c;

        /* JADX INFO: renamed from: d */
        public int f3255d;

        /* JADX INFO: renamed from: e */
        public int f3256e;

        /* JADX INFO: renamed from: f */
        public int f3257f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f3258g;

        public C04901(InterfaceC9968c<? super C04901> interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C04901 c04901 = SnapshotIdSet.this.new C04901(interfaceC9968c);
            c04901.f3258g = obj;
            return c04901;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC7417j<? super Integer> abstractC7417j, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04901) mo1336a(abstractC7417j, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0092  */
        /* JADX WARN: Code duplicated, block: B:28:0x009e  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:32:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:32:0x00b8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final java.lang.Object mo1338x(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.C04901.mo1338x(java.lang.Object):java.lang.Object");
        }
    }

    public SnapshotIdSet(long j10, long j11, int i10, int[] iArr) {
        this.f3250a = j10;
        this.f3251b = j11;
        this.f3252c = i10;
        this.f3253d = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final SnapshotIdSet m1877a(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C5207g.m11111f(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f3249e;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i10 = this.f3252c;
        if (snapshotIdSet.f3252c == i10 && snapshotIdSet.f3253d == (iArr = this.f3253d)) {
            return new SnapshotIdSet(this.f3250a & (~snapshotIdSet.f3250a), (~snapshotIdSet.f3251b) & this.f3251b, i10, iArr);
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSetM1878f = this;
        while (it.hasNext()) {
            snapshotIdSetM1878f = snapshotIdSetM1878f.m1878f(it.next().intValue());
        }
        return snapshotIdSetM1878f;
    }

    /* JADX INFO: renamed from: f */
    public final SnapshotIdSet m1878f(int i10) {
        int[] iArr;
        int iM321X;
        int i11 = this.f3252c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f3251b;
            if ((j11 & j10) != 0) {
                return new SnapshotIdSet(this.f3250a, j11 & (~j10), i11, this.f3253d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f3250a;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(j13 & (~j12), this.f3251b, i11, this.f3253d);
            }
        } else if (i12 < 0 && (iArr = this.f3253d) != null && (iM321X = C0062b.m321X(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f3250a, this.f3251b, this.f3252c, null);
            }
            int[] iArr2 = new int[length];
            if (iM321X > 0) {
                C9322j.m17672Z(0, 0, iM321X, iArr, iArr2);
            }
            if (iM321X < length) {
                C9322j.m17672Z(iM321X, iM321X + 1, length + 1, iArr, iArr2);
            }
            return new SnapshotIdSet(this.f3250a, this.f3251b, this.f3252c, iArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1879g(int i10) {
        int[] iArr;
        int i11 = i10 - this.f3252c;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f3251b) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f3250a) != 0;
        }
        if (i11 > 0 || (iArr = this.f3253d) == null) {
            return false;
        }
        if (C0062b.m321X(iArr, i10) < 0) {
            z10 = false;
        }
        return z10;
    }

    /* JADX INFO: renamed from: i */
    public final SnapshotIdSet m1880i(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C5207g.m11111f(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f3249e;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i10 = this.f3252c;
        if (snapshotIdSet.f3252c == i10 && snapshotIdSet.f3253d == (iArr = this.f3253d)) {
            return new SnapshotIdSet(this.f3250a | snapshotIdSet.f3250a, this.f3251b | snapshotIdSet.f3251b, i10, iArr);
        }
        if (this.f3253d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.m1881l(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSetM1881l = this;
        while (it2.hasNext()) {
            snapshotIdSetM1881l = snapshotIdSetM1881l.m1881l(it2.next().intValue());
        }
        return snapshotIdSetM1881l;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        C04901 c04901 = new C04901(null);
        C7416i c7416i = new C7416i();
        c7416i.f41257d = C8656b.m16908p(c04901, c7416i, c7416i);
        return c7416i;
    }

    /* JADX INFO: renamed from: l */
    public final SnapshotIdSet m1881l(int i10) {
        long j10;
        int i11;
        int i12 = this.f3252c;
        int i13 = i10 - i12;
        long j11 = this.f3251b;
        if (i13 < 0 || i13 >= 64) {
            long j12 = this.f3250a;
            if (i13 < 64 || i13 >= 128) {
                int[] iArrM13452t0 = this.f3253d;
                if (i13 < 128) {
                    if (iArrM13452t0 == null) {
                        return new SnapshotIdSet(j12, j11, i12, new int[]{i10});
                    }
                    int iM321X = C0062b.m321X(iArrM13452t0, i10);
                    if (iM321X < 0) {
                        int i14 = -(iM321X + 1);
                        int length = iArrM13452t0.length + 1;
                        int[] iArr = new int[length];
                        C9322j.m17672Z(0, 0, i14, iArrM13452t0, iArr);
                        C9322j.m17672Z(i14 + 1, i14, length - 1, iArrM13452t0, iArr);
                        iArr[i14] = i10;
                        return new SnapshotIdSet(this.f3250a, this.f3251b, this.f3252c, iArr);
                    }
                } else if (!m1879g(i10)) {
                    int i15 = ((i10 + 1) / 64) * 64;
                    int i16 = this.f3252c;
                    ArrayList arrayList = null;
                    long j13 = j12;
                    while (true) {
                        if (i16 >= i15) {
                            j10 = j11;
                            i11 = i16;
                            break;
                        }
                        if (j11 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrM13452t0 != null) {
                                    for (int i17 : iArrM13452t0) {
                                        arrayList.add(Integer.valueOf(i17));
                                    }
                                }
                            }
                            for (int i18 = 0; i18 < 64; i18++) {
                                if (((1 << i18) & j11) != 0) {
                                    arrayList.add(Integer.valueOf(i18 + i16));
                                }
                            }
                        }
                        if (j13 == 0) {
                            i11 = i15;
                            j10 = 0;
                            break;
                        }
                        i16 += 64;
                        j11 = j13;
                        j13 = 0;
                    }
                    if (arrayList != null) {
                        iArrM13452t0 = C6752c.m13452t0(arrayList);
                    }
                    return new SnapshotIdSet(j13, j10, i11, iArrM13452t0).m1881l(i10);
                }
            } else {
                long j14 = 1 << (i13 - 64);
                if ((j12 & j14) == 0) {
                    return new SnapshotIdSet(j12 | j14, j11, i12, this.f3253d);
                }
            }
        } else {
            long j15 = 1 << i13;
            if ((j11 & j15) == 0) {
                return new SnapshotIdSet(this.f3250a, j11 | j15, i12, this.f3253d);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        String string = sb3.toString();
        C5207g.m11110e(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
