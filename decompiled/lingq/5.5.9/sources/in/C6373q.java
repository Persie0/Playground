package in;

import com.kochava.tracker.BuildConfig;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: in.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C6373q {

    /* JADX INFO: renamed from: k */
    public static final C6373q f36761k = new C6373q(false, false, false, false, false, new C6373q(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);

    /* JADX INFO: renamed from: a */
    public final boolean f36762a;

    /* JADX INFO: renamed from: b */
    public final boolean f36763b;

    /* JADX INFO: renamed from: c */
    public final boolean f36764c;

    /* JADX INFO: renamed from: d */
    public final boolean f36765d;

    /* JADX INFO: renamed from: e */
    public final boolean f36766e;

    /* JADX INFO: renamed from: f */
    public final C6373q f36767f;

    /* JADX INFO: renamed from: g */
    public final boolean f36768g;

    /* JADX INFO: renamed from: h */
    public final C6373q f36769h;

    /* JADX INFO: renamed from: i */
    public final C6373q f36770i;

    /* JADX INFO: renamed from: j */
    public final boolean f36771j;

    /* JADX INFO: renamed from: in.q$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36772a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr[Variance.INVARIANT.ordinal()] = 2;
            f36772a = iArr;
        }
    }

    public C6373q(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C6373q c6373q, boolean z15, C6373q c6373q2, C6373q c6373q3, boolean z16, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        c6373q = (i10 & 32) != 0 ? null : c6373q;
        z15 = (i10 & 64) != 0 ? true : z15;
        c6373q2 = (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? c6373q : c6373q2;
        c6373q3 = (i10 & 256) != 0 ? c6373q : c6373q3;
        z16 = (i10 & 512) != 0 ? false : z16;
        this.f36762a = z10;
        this.f36763b = z11;
        this.f36764c = z12;
        this.f36765d = z13;
        this.f36766e = z14;
        this.f36767f = c6373q;
        this.f36768g = z15;
        this.f36769h = c6373q2;
        this.f36770i = c6373q3;
        this.f36771j = z16;
    }
}
