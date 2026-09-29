package za;

import p479xa.C10129a;

/* JADX INFO: renamed from: za.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10469e {

    /* JADX INFO: renamed from: a */
    public final a f52347a;

    /* JADX INFO: renamed from: b */
    public final a f52348b;

    /* JADX INFO: renamed from: c */
    public final int f52349c;

    /* JADX INFO: renamed from: d */
    public final boolean f52350d;

    /* JADX INFO: renamed from: za.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final b[] f52351a;

        public a(b... bVarArr) {
            this.f52351a = bVarArr;
        }
    }

    /* JADX INFO: renamed from: za.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f52352a;

        /* JADX INFO: renamed from: b */
        public final int f52353b;

        /* JADX INFO: renamed from: c */
        public final float[] f52354c;

        /* JADX INFO: renamed from: d */
        public final float[] f52355d;

        public b(int i10, int i11, float[] fArr, float[] fArr2) {
            this.f52352a = i10;
            C10129a.m18990b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f52354c = fArr;
            this.f52355d = fArr2;
            this.f52353b = i11;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10469e() {
        throw null;
    }

    public C10469e(a aVar, a aVar2, int i10) {
        this.f52347a = aVar;
        this.f52348b = aVar2;
        this.f52349c = i10;
        this.f52350d = aVar == aVar2;
    }
}
