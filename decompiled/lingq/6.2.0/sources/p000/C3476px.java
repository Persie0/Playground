package p000;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: px */
/* JADX INFO: loaded from: classes.dex */
public final class C3476px {

    /* JADX INFO: renamed from: c */
    public static final C3476px f56934c = new C3476px(0);

    /* JADX INFO: renamed from: a */
    public final int f56935a;

    /* JADX INFO: renamed from: b */
    public AudioAttributes f56936b;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        uma.m22828w(5);
        uma.m22828w(6);
    }

    public C3476px(int i) {
        this.f56935a = i;
    }

    /* JADX INFO: renamed from: a */
    public final AudioAttributes m19557a() {
        if (this.f56936b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f56935a).setFlags(0).setUsage(1);
            u3d.m22443e(usage);
            u3d.m22442d(usage);
            if (Build.VERSION.SDK_INT >= 32) {
                v3d.m23094d(usage);
                v3d.m23093c(usage);
            }
            this.f56936b = usage.build();
        }
        return this.f56936b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3476px.class == obj.getClass() && this.f56935a == ((C3476px) obj).f56935a;
    }

    public final int hashCode() {
        return ((((((527 + this.f56935a) * 961) + 1) * 31) + 1) * 29791) + 1;
    }
}
