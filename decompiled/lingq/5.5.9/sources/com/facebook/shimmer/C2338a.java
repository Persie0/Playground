package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: com.facebook.shimmer.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2338a {

    /* JADX INFO: renamed from: a */
    public final float[] f11712a = new float[4];

    /* JADX INFO: renamed from: b */
    public final int[] f11713b = new int[4];

    /* JADX INFO: renamed from: c */
    public int f11714c;

    /* JADX INFO: renamed from: d */
    public int f11715d;

    /* JADX INFO: renamed from: e */
    public int f11716e;

    /* JADX INFO: renamed from: f */
    public int f11717f;

    /* JADX INFO: renamed from: g */
    public int f11718g;

    /* JADX INFO: renamed from: h */
    public int f11719h;

    /* JADX INFO: renamed from: i */
    public float f11720i;

    /* JADX INFO: renamed from: j */
    public float f11721j;

    /* JADX INFO: renamed from: k */
    public float f11722k;

    /* JADX INFO: renamed from: l */
    public float f11723l;

    /* JADX INFO: renamed from: m */
    public float f11724m;

    /* JADX INFO: renamed from: n */
    public boolean f11725n;

    /* JADX INFO: renamed from: o */
    public boolean f11726o;

    /* JADX INFO: renamed from: p */
    public boolean f11727p;

    /* JADX INFO: renamed from: q */
    public int f11728q;

    /* JADX INFO: renamed from: r */
    public int f11729r;

    /* JADX INFO: renamed from: s */
    public long f11730s;

    /* JADX INFO: renamed from: t */
    public long f11731t;

    /* JADX INFO: renamed from: com.facebook.shimmer.a$a */
    public static class a extends b<a> {
        public a() {
            this.f11732a.f11727p = true;
        }

        @Override // com.facebook.shimmer.C2338a.b
        /* JADX INFO: renamed from: c */
        public final b mo6749c() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.facebook.shimmer.a$b */
    public static abstract class b<T extends b<T>> {

        /* JADX INFO: renamed from: a */
        public final C2338a f11732a = new C2338a();

        /* JADX INFO: renamed from: a */
        public final C2338a m6750a() {
            C2338a c2338a = this.f11732a;
            int i10 = c2338a.f11717f;
            int[] iArr = c2338a.f11713b;
            if (i10 != 1) {
                int i11 = c2338a.f11716e;
                iArr[0] = i11;
                int i12 = c2338a.f11715d;
                iArr[1] = i12;
                iArr[2] = i12;
                iArr[3] = i11;
            } else {
                int i13 = c2338a.f11715d;
                iArr[0] = i13;
                iArr[1] = i13;
                int i14 = c2338a.f11716e;
                iArr[2] = i14;
                iArr[3] = i14;
            }
            float[] fArr = c2338a.f11712a;
            if (i10 != 1) {
                fArr[0] = Math.max(((1.0f - c2338a.f11722k) - c2338a.f11723l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - c2338a.f11722k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((c2338a.f11722k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((c2338a.f11722k + 1.0f) + c2338a.f11723l) / 2.0f, 1.0f);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = Math.min(c2338a.f11722k, 1.0f);
                fArr[2] = Math.min(c2338a.f11722k + c2338a.f11723l, 1.0f);
                fArr[3] = 1.0f;
            }
            return c2338a;
        }

        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        /* JADX INFO: renamed from: b */
        public T mo6751b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            C2338a c2338a = this.f11732a;
            if (zHasValue) {
                c2338a.f11725n = typedArray.getBoolean(3, c2338a.f11725n);
                mo6749c();
            }
            if (typedArray.hasValue(0)) {
                c2338a.f11726o = typedArray.getBoolean(0, c2338a.f11726o);
                mo6749c();
            }
            if (typedArray.hasValue(1)) {
                c2338a.f11716e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (c2338a.f11716e & 16777215);
                mo6749c();
            }
            if (typedArray.hasValue(11)) {
                c2338a.f11715d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (c2338a.f11715d & 16777215);
                mo6749c();
            }
            if (typedArray.hasValue(7)) {
                long j10 = typedArray.getInt(7, (int) c2338a.f11730s);
                if (j10 < 0) {
                    throw new IllegalArgumentException(C0166e.m763i("Given a negative duration: ", j10));
                }
                c2338a.f11730s = j10;
                mo6749c();
            }
            if (typedArray.hasValue(14)) {
                c2338a.f11728q = typedArray.getInt(14, c2338a.f11728q);
                mo6749c();
            }
            if (typedArray.hasValue(15)) {
                long j11 = typedArray.getInt(15, (int) c2338a.f11731t);
                if (j11 < 0) {
                    throw new IllegalArgumentException(C0166e.m763i("Given a negative repeat delay: ", j11));
                }
                c2338a.f11731t = j11;
                mo6749c();
            }
            if (typedArray.hasValue(16)) {
                c2338a.f11729r = typedArray.getInt(16, c2338a.f11729r);
                mo6749c();
            }
            if (typedArray.hasValue(5)) {
                int i10 = typedArray.getInt(5, c2338a.f11714c);
                if (i10 == 1) {
                    c2338a.f11714c = 1;
                    mo6749c();
                } else if (i10 == 2) {
                    c2338a.f11714c = 2;
                    mo6749c();
                } else if (i10 != 3) {
                    c2338a.f11714c = 0;
                    mo6749c();
                } else {
                    c2338a.f11714c = 3;
                    mo6749c();
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, c2338a.f11717f) != 1) {
                    c2338a.f11717f = 0;
                    mo6749c();
                } else {
                    c2338a.f11717f = 1;
                    mo6749c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f3 = typedArray.getFloat(6, c2338a.f11723l);
                if (f3 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f3);
                }
                c2338a.f11723l = f3;
                mo6749c();
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, c2338a.f11718g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(C0166e.m761g("Given invalid width: ", dimensionPixelSize));
                }
                c2338a.f11718g = dimensionPixelSize;
                mo6749c();
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, c2338a.f11719h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(C0166e.m761g("Given invalid height: ", dimensionPixelSize2));
                }
                c2338a.f11719h = dimensionPixelSize2;
                mo6749c();
            }
            if (typedArray.hasValue(13)) {
                float f10 = typedArray.getFloat(13, c2338a.f11722k);
                if (f10 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f10);
                }
                c2338a.f11722k = f10;
                mo6749c();
            }
            if (typedArray.hasValue(19)) {
                float f11 = typedArray.getFloat(19, c2338a.f11720i);
                if (f11 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f11);
                }
                c2338a.f11720i = f11;
                mo6749c();
            }
            if (typedArray.hasValue(10)) {
                float f12 = typedArray.getFloat(10, c2338a.f11721j);
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f12);
                }
                c2338a.f11721j = f12;
                mo6749c();
            }
            if (typedArray.hasValue(18)) {
                c2338a.f11724m = typedArray.getFloat(18, c2338a.f11724m);
                mo6749c();
            }
            return (T) mo6749c();
        }

        /* JADX INFO: renamed from: c */
        public abstract T mo6749c();
    }

    /* JADX INFO: renamed from: com.facebook.shimmer.a$c */
    public static class c extends b<c> {
        public c() {
            this.f11732a.f11727p = false;
        }

        @Override // com.facebook.shimmer.C2338a.b
        /* JADX INFO: renamed from: b */
        public final b mo6751b(TypedArray typedArray) {
            super.mo6751b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            C2338a c2338a = this.f11732a;
            if (zHasValue) {
                c2338a.f11716e = (typedArray.getColor(2, c2338a.f11716e) & 16777215) | (c2338a.f11716e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                c2338a.f11715d = typedArray.getColor(12, c2338a.f11715d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.C2338a.b
        /* JADX INFO: renamed from: c */
        public final b mo6749c() {
            return this;
        }
    }

    public C2338a() {
        new RectF();
        this.f11714c = 0;
        this.f11715d = -1;
        this.f11716e = 1291845631;
        this.f11717f = 0;
        this.f11718g = 0;
        this.f11719h = 0;
        this.f11720i = 1.0f;
        this.f11721j = 1.0f;
        this.f11722k = 0.0f;
        this.f11723l = 0.5f;
        this.f11724m = 20.0f;
        this.f11725n = true;
        this.f11726o = true;
        this.f11727p = true;
        this.f11728q = -1;
        this.f11729r = 1;
        this.f11730s = 1000L;
    }
}
