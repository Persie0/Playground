package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class ekd {

    /* JADX INFO: renamed from: a */
    public final aeb f37401a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f37402b;

    public ekd(Context context, int i) {
        b64 b64Var = aeb.f560l;
        switch (i) {
            case 1:
                this.f37402b = new AtomicLong(-1L);
                this.f37401a = new aeb(context, b64Var, new cs9("mlkit:vision"), mo3.f51630c);
                break;
            default:
                this.f37402b = new AtomicLong(-1L);
                this.f37401a = new aeb(context, b64Var, new cs9("mlkit:vision"), mo3.f51630c);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m11214a(int i, long j, long j2) {
        AtomicLong atomicLong = this.f37402b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.f37401a.m317d(new TelemetryData(0, Arrays.asList(new MethodInvocation(24335, i, 0, j, j2, null, null, 0, -1)))).mo5961c(new rr3(this, jElapsedRealtime, 4));
    }
}
