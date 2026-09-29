package com.bumptech.glide.load.resource.bitmap;

import p356r5.C8734d;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a */
    public static final C2131e f10802a;

    /* JADX INFO: renamed from: b */
    public static final C2129c f10803b;

    /* JADX INFO: renamed from: c */
    public static final C2130d f10804c;

    /* JADX INFO: renamed from: d */
    public static final C2132f f10805d;

    /* JADX INFO: renamed from: e */
    public static final C2130d f10806e;

    /* JADX INFO: renamed from: f */
    public static final C8734d<DownsampleStrategy> f10807f;

    /* JADX INFO: renamed from: g */
    public static final boolean f10808g;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C2127a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C2128b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int i14 = 1;
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            if (iMax >= iCeil) {
                i14 = 0;
            }
            return 1.0f / (iMax << i14);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C2129c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return mo6341b(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f10802a.mo6340a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f10802a.mo6341b(i10, i11, i12, i13));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C2130d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C2131e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f10808g ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f10808g) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C2132f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public final SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public final float mo6341b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        new C2127a();
        new C2128b();
        f10802a = new C2131e();
        f10803b = new C2129c();
        C2130d c2130d = new C2130d();
        f10804c = c2130d;
        f10805d = new C2132f();
        f10806e = c2130d;
        f10807f = C8734d.m16962a(c2130d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f10808g = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract SampleSizeRounding mo6340a(int i10, int i11, int i12, int i13);

    /* JADX INFO: renamed from: b */
    public abstract float mo6341b(int i10, int i11, int i12, int i13);
}
