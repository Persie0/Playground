package com.google.android.exoplayer2;

import com.google.common.collect.ImmutableList;
import ga.C5735r;
import java.util.Arrays;
import p402u0.C9362e;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2384d0 implements InterfaceC2409f {

    /* JADX INFO: renamed from: b */
    public static final C2384d0 f12104b = new C2384d0(ImmutableList.m9062Y());

    /* JADX INFO: renamed from: a */
    public final ImmutableList<a> f12105a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.d0$a */
    public static final class a implements InterfaceC2409f {

        /* JADX INFO: renamed from: f */
        public static final String f12106f = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: g */
        public static final String f12107g = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: h */
        public static final String f12108h = C10134c0.m19021F(3);

        /* JADX INFO: renamed from: i */
        public static final String f12109i = C10134c0.m19021F(4);

        /* JADX INFO: renamed from: a */
        public final int f12110a;

        /* JADX INFO: renamed from: b */
        public final C5735r f12111b;

        /* JADX INFO: renamed from: c */
        public final boolean f12112c;

        /* JADX INFO: renamed from: d */
        public final int[] f12113d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f12114e;

        static {
            new C9362e(17);
        }

        public a(C5735r c5735r, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = c5735r.f34800a;
            this.f12110a = i10;
            boolean z11 = false;
            C10129a.m18990b(i10 == iArr.length && i10 == zArr.length);
            this.f12111b = c5735r;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f12112c = z11;
            this.f12113d = (int[]) iArr.clone();
            this.f12114e = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12112c == aVar.f12112c && this.f12111b.equals(aVar.f12111b) && Arrays.equals(this.f12113d, aVar.f12113d) && Arrays.equals(this.f12114e, aVar.f12114e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f12114e) + ((Arrays.hashCode(this.f12113d) + (((this.f12111b.hashCode() * 31) + (this.f12112c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        C10134c0.m19021F(0);
    }

    public C2384d0(ImmutableList immutableList) {
        this.f12105a = ImmutableList.m9060Q(immutableList);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6926a(int i10) {
        boolean z10;
        int i11 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f12105a;
            if (i11 >= immutableList.size()) {
                return false;
            }
            a aVar = immutableList.get(i11);
            boolean[] zArr = aVar.f12114e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z10 = false;
                    break;
                }
                if (zArr[i12]) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (z10 && aVar.f12111b.f34802c == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2384d0.class != obj.getClass()) {
            return false;
        }
        return this.f12105a.equals(((C2384d0) obj).f12105a);
    }

    public final int hashCode() {
        return this.f12105a.hashCode();
    }
}
