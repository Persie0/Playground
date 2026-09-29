package com.google.android.exoplayer2;

import android.util.Pair;
import ga.InterfaceC5732o;
import p150h9.C5922k0;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2352a extends AbstractC2382c0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f11821e = 0;

    /* JADX INFO: renamed from: b */
    public final int f11822b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5732o f11823c;

    /* JADX INFO: renamed from: d */
    public final boolean f11824d = false;

    public AbstractC2352a(InterfaceC5732o interfaceC5732o) {
        this.f11823c = interfaceC5732o;
        this.f11822b = interfaceC5732o.mo12080a();
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: a */
    public final int mo6773a(boolean z10) {
        if (this.f11822b == 0) {
            return -1;
        }
        if (this.f11824d) {
            z10 = false;
        }
        int iMo12082c = z10 ? this.f11823c.mo12082c() : 0;
        do {
            C5922k0 c5922k0 = (C5922k0) this;
            AbstractC2382c0[] abstractC2382c0Arr = c5922k0.f35338j;
            if (!abstractC2382c0Arr[iMo12082c].m6910p()) {
                return abstractC2382c0Arr[iMo12082c].mo6773a(z10) + c5922k0.f35337i[iMo12082c];
            }
            iMo12082c = m6782q(iMo12082c, z10);
        } while (iMo12082c != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: b */
    public final int mo6774b(Object obj) {
        int iMo6774b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C5922k0 c5922k0 = (C5922k0) this;
        Integer num = c5922k0.f35340l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iMo6774b = c5922k0.f35338j[iIntValue].mo6774b(obj3)) == -1) {
            return -1;
        }
        return c5922k0.f35336h[iIntValue] + iMo6774b;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: c */
    public final int mo6775c(boolean z10) {
        int i10 = this.f11822b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f11824d) {
            z10 = false;
        }
        InterfaceC5732o interfaceC5732o = this.f11823c;
        int iMo12086g = z10 ? interfaceC5732o.mo12086g() : i10 - 1;
        do {
            C5922k0 c5922k0 = (C5922k0) this;
            AbstractC2382c0[] abstractC2382c0Arr = c5922k0.f35338j;
            if (!abstractC2382c0Arr[iMo12086g].m6910p()) {
                return abstractC2382c0Arr[iMo12086g].mo6775c(z10) + c5922k0.f35337i[iMo12086g];
            }
            if (z10) {
                iMo12086g = interfaceC5732o.mo12083d(iMo12086g);
            } else {
                iMo12086g = iMo12086g > 0 ? iMo12086g - 1 : -1;
            }
        } while (iMo12086g != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: e */
    public final int mo6776e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f11824d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        C5922k0 c5922k0 = (C5922k0) this;
        int[] iArr = c5922k0.f35337i;
        int iM19038e = C10134c0.m19038e(iArr, i10 + 1, false, false);
        int i13 = iArr[iM19038e];
        AbstractC2382c0[] abstractC2382c0Arr = c5922k0.f35338j;
        AbstractC2382c0 abstractC2382c0 = abstractC2382c0Arr[iM19038e];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int iMo6776e = abstractC2382c0.mo6776e(i14, i12, z10);
        if (iMo6776e != -1) {
            return i13 + iMo6776e;
        }
        int iM6782q = m6782q(iM19038e, z10);
        while (iM6782q != -1 && abstractC2382c0Arr[iM6782q].m6910p()) {
            iM6782q = m6782q(iM6782q, z10);
        }
        if (iM6782q != -1) {
            return abstractC2382c0Arr[iM6782q].mo6773a(z10) + iArr[iM6782q];
        }
        if (i11 == 2) {
            return mo6773a(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: f */
    public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
        C5922k0 c5922k0 = (C5922k0) this;
        int[] iArr = c5922k0.f35336h;
        int iM19038e = C10134c0.m19038e(iArr, i10 + 1, false, false);
        int i11 = c5922k0.f35337i[iM19038e];
        c5922k0.f35338j[iM19038e].mo6777f(i10 - iArr[iM19038e], bVar, z10);
        bVar.f12065c += i11;
        if (z10) {
            Object obj = c5922k0.f35339k[iM19038e];
            Object obj2 = bVar.f12064b;
            obj2.getClass();
            bVar.f12064b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: g */
    public final AbstractC2382c0.b mo6778g(Object obj, AbstractC2382c0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C5922k0 c5922k0 = (C5922k0) this;
        Integer num = c5922k0.f35340l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = c5922k0.f35337i[iIntValue];
        c5922k0.f35338j[iIntValue].mo6778g(obj3, bVar);
        bVar.f12065c += i10;
        bVar.f12064b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        r3 = -1;
     */
    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo6779k(int i10, int i11, boolean z10) {
        int iMo12083d;
        int i12 = 0;
        if (this.f11824d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        C5922k0 c5922k0 = (C5922k0) this;
        int[] iArr = c5922k0.f35337i;
        int iM19038e = C10134c0.m19038e(iArr, i10 + 1, false, false);
        int i13 = iArr[iM19038e];
        AbstractC2382c0[] abstractC2382c0Arr = c5922k0.f35338j;
        AbstractC2382c0 abstractC2382c0 = abstractC2382c0Arr[iM19038e];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int iMo6779k = abstractC2382c0.mo6779k(i14, i12, z10);
        if (iMo6779k != -1) {
            return i13 + iMo6779k;
        }
        InterfaceC5732o interfaceC5732o = this.f11823c;
        if (z10) {
            iMo12083d = interfaceC5732o.mo12083d(iM19038e);
        } else if (iM19038e > 0) {
            iMo12083d = iM19038e - 1;
        }
        while (iMo12083d != -1 && abstractC2382c0Arr[iMo12083d].m6910p()) {
            if (z10) {
                iMo12083d = interfaceC5732o.mo12083d(iMo12083d);
            } else {
                iMo12083d = iMo12083d > 0 ? iMo12083d - 1 : -1;
            }
        }
        if (iMo12083d != -1) {
            return abstractC2382c0Arr[iMo12083d].mo6775c(z10) + iArr[iMo12083d];
        }
        if (i11 == 2) {
            return mo6775c(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: l */
    public final Object mo6780l(int i10) {
        C5922k0 c5922k0 = (C5922k0) this;
        int[] iArr = c5922k0.f35336h;
        int iM19038e = C10134c0.m19038e(iArr, i10 + 1, false, false);
        return Pair.create(c5922k0.f35339k[iM19038e], c5922k0.f35338j[iM19038e].mo6780l(i10 - iArr[iM19038e]));
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: n */
    public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
        C5922k0 c5922k0 = (C5922k0) this;
        int[] iArr = c5922k0.f35337i;
        int iM19038e = C10134c0.m19038e(iArr, i10 + 1, false, false);
        int i11 = iArr[iM19038e];
        int i12 = c5922k0.f35336h[iM19038e];
        c5922k0.f35338j[iM19038e].mo6781n(i10 - i11, cVar, j10);
        Object objCreate = c5922k0.f35339k[iM19038e];
        if (!AbstractC2382c0.c.f12070M.equals(cVar.f12091a)) {
            objCreate = Pair.create(objCreate, cVar.f12091a);
        }
        cVar.f12091a = objCreate;
        cVar.f12088J += i12;
        cVar.f12089K += i12;
        return cVar;
    }

    /* JADX INFO: renamed from: q */
    public final int m6782q(int i10, boolean z10) {
        if (z10) {
            return this.f11823c.mo12084e(i10);
        }
        if (i10 < this.f11822b - 1) {
            return i10 + 1;
        }
        return -1;
    }
}
