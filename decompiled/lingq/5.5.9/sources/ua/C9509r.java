package ua;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;

/* JADX INFO: renamed from: ua.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9509r {
    /* JADX INFO: renamed from: a */
    public static InterfaceC2528b.a m17975a(InterfaceC9502k interfaceC9502k) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC9502k.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC9502k.mo7343e(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new InterfaceC2528b.a(length, i10);
    }
}
