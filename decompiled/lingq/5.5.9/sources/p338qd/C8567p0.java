package p338qd;

import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3118i;
import java.util.Arrays;
import java.util.Map;
import p289o5.C7940t;

/* JADX INFO: renamed from: qd.p0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8567p0 implements InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3118i f45939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f45940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45941c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f45942d;

    public /* synthetic */ C8567p0(C3118i c3118i, String str, int i10, long j10) {
        this.f45939a = c3118i;
        this.f45940b = str;
        this.f45941c = i10;
        this.f45942d = j10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        C3118i c3118i = this.f45939a;
        c3118i.getClass();
        String str = this.f45940b;
        C8579t0 c8579t0 = (C8579t0) ((Map) c3118i.m8991d(new C7940t(c3118i, Arrays.asList(str)))).get(str);
        if (c8579t0 == null) {
            C3118i.f15933g.m15812m(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        } else {
            int i10 = c8579t0.f46010c.f45995d;
            if (i10 == 5 || i10 == 6 || i10 == 4) {
                C3118i.f15933g.m15812m(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
            }
        }
        C3112c c3112c = c3118i.f15934a;
        int i11 = this.f45941c;
        long j10 = this.f45942d;
        if (c3112c.m8969c(str, i11, j10).exists()) {
            C3112c.m8967g(c3112c.m8969c(str, i11, j10));
        }
        c8579t0.f46010c.f45995d = 4;
        return null;
    }
}
