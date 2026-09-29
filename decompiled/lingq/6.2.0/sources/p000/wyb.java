package p000;

import androidx.compose.runtime.internal.C0282a;
import com.google.common.util.concurrent.AbstractC1112b;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wyb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f67533a = new C0282a(-489887388, false, new ud1(3));

    /* JADX INFO: renamed from: b */
    public static final C0282a f67534b = new C0282a(1629163587, false, new ud1(4));

    /* JADX INFO: renamed from: c */
    public static final C0282a f67535c = new C0282a(-546752734, false, new ud1(5));

    /* JADX INFO: renamed from: d */
    public static final C0282a f67536d = new C0282a(1572298241, false, new ud1(6));

    /* JADX INFO: renamed from: a */
    public static void m24220a(AbstractC1112b abstractC1112b, long j) {
        LockSupport.parkNanos(abstractC1112b, Math.min(j, 2147483647999999999L));
    }
}
