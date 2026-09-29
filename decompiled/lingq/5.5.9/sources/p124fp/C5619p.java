package p124fp;

import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import okio.ByteString;
import p385sf.C9000b;
import tl.AbstractC9313a;
import tl.C9319g;

/* JADX INFO: renamed from: fp.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C5619p extends AbstractC9313a<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final ByteString[] f34452a;

    /* JADX INFO: renamed from: b */
    public final int[] f34453b;

    /* JADX INFO: renamed from: fp.p$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m11997a(long j10, C5608e c5608e, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(((ByteString) arrayList.get(i18)).mo15992q() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i11);
            ByteString byteString2 = (ByteString) arrayList.get(i12 - 1);
            int i19 = -1;
            if (i17 == byteString.mo15992q()) {
                int iIntValue = ((Number) arrayList2.get(i11)).intValue();
                int i20 = i11 + 1;
                ByteString byteString3 = (ByteString) arrayList.get(i20);
                i13 = i20;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.mo15995w(i17) == byteString2.mo15995w(i17)) {
                int iMin = Math.min(byteString.mo15992q(), byteString2.mo15992q());
                int i21 = 0;
                for (int i22 = i17; i22 < iMin && byteString.mo15995w(i22) == byteString2.mo15995w(i22); i22++) {
                    i21++;
                }
                long j11 = 4;
                long j12 = (c5608e.f34435b / j11) + j10 + ((long) 2) + ((long) i21) + 1;
                c5608e.m11963q1(-i21);
                c5608e.m11963q1(i14);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    c5608e.m11963q1(byteString.mo15995w(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i23 == ((ByteString) arrayList.get(i13)).mo15992q())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c5608e.m11963q1(((Number) arrayList2.get(i13)).intValue());
                    return;
                } else {
                    C5608e c5608e2 = new C5608e();
                    c5608e.m11963q1(((int) ((c5608e2.f34435b / j11) + j12)) * (-1));
                    m11997a(j12, c5608e2, i23, arrayList, i13, i12, arrayList2);
                    c5608e.mo11940O0(c5608e2);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (((ByteString) arrayList.get(i25 - 1)).mo15995w(i17) != ((ByteString) arrayList.get(i25)).mo15995w(i17)) {
                    i24++;
                }
            }
            long j13 = 4;
            long j14 = ((long) (i24 * 2)) + (c5608e.f34435b / j13) + j10 + ((long) 2);
            c5608e.m11963q1(i24);
            c5608e.m11963q1(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                int iMo15995w = ((ByteString) arrayList.get(i26)).mo15995w(i17);
                if (i26 == i13 || iMo15995w != ((ByteString) arrayList.get(i26 - 1)).mo15995w(i17)) {
                    c5608e.m11963q1(iMo15995w & 255);
                }
            }
            C5608e c5608e3 = new C5608e();
            while (i13 < i12) {
                byte bMo15995w = ((ByteString) arrayList.get(i13)).mo15995w(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bMo15995w != ((ByteString) arrayList.get(i28)).mo15995w(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == ((ByteString) arrayList.get(i13)).mo15992q()) {
                    c5608e.m11963q1(((Number) arrayList2.get(i13)).intValue());
                    i16 = i15;
                } else {
                    c5608e.m11963q1(((int) ((c5608e3.f34435b / j13) + j14)) * i19);
                    i16 = i15;
                    m11997a(j14, c5608e3, i17 + 1, arrayList, i13, i16, arrayList2);
                }
                c5608e3 = c5608e3;
                i13 = i16;
                j13 = j13;
                i19 = -1;
            }
            c5608e.mo11940O0(c5608e3);
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: b */
        public static C5619p m11998b(ByteString... byteStringArr) throws IOException {
            int i10 = 0;
            if (byteStringArr.length == 0) {
                return new C5619p(new ByteString[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new C9319g(byteStringArr, false));
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(byteStringArr.length);
            for (ByteString byteString : byteStringArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Integer[] numArr = (Integer[]) array;
            ArrayList arrayListM17254t = C9000b.m17254t(Arrays.copyOf(numArr, numArr.length));
            int length = byteStringArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayListM17254t.set(C9000b.m17238d(arrayList, byteStringArr[i11]), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (!(((ByteString) arrayList.get(0)).mo15992q() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ByteString byteString2 = (ByteString) arrayList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    ByteString byteString3 = (ByteString) arrayList.get(i15);
                    byteString3.getClass();
                    C5207g.m11111f(byteString2, "prefix");
                    if (!byteString3.mo15997y(byteString2, byteString2.mo15992q())) {
                        break;
                    }
                    if (!(byteString3.mo15992q() != byteString2.mo15992q())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) arrayListM17254t.get(i15)).intValue() > ((Number) arrayListM17254t.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        arrayListM17254t.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C5608e c5608e = new C5608e();
            m11997a(0L, c5608e, 0, arrayList, 0, arrayList.size(), arrayListM17254t);
            int[] iArr = new int[(int) (c5608e.f34435b / ((long) 4))];
            while (!c5608e.mo11936L()) {
                iArr[i10] = c5608e.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
            return new C5619p((ByteString[]) objArrCopyOf, iArr);
        }
    }

    public C5619p(ByteString[] byteStringArr, int[] iArr) {
        this.f34452a = byteStringArr;
        this.f34453b = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f34452a.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f34452a[i10];
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
