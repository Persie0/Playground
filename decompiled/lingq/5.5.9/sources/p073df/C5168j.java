package p073df;

import android.text.TextUtils;
import com.google.firebase.installations.local.C3220a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p338qd.C8573r0;

/* JADX INFO: renamed from: df.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5168j {

    /* JADX INFO: renamed from: b */
    public static final long f33167b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    public static final Pattern f33168c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    public static C5168j f33169d;

    /* JADX INFO: renamed from: a */
    public final C8573r0 f33170a;

    public C5168j(C8573r0 c8573r0) {
        this.f33170a = c8573r0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10944a(C3220a c3220a) {
        if (TextUtils.isEmpty(c3220a.f16271d)) {
            return true;
        }
        long j10 = c3220a.f16273f + c3220a.f16274g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f33170a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f33167b;
    }
}
