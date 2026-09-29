package p150h9;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2536y;
import p454wa.C9885j;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: h9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5905c implements InterfaceC5942y {

    /* JADX INFO: renamed from: a */
    public final C9885j f35263a;

    /* JADX INFO: renamed from: b */
    public final long f35264b;

    /* JADX INFO: renamed from: c */
    public final long f35265c;

    /* JADX INFO: renamed from: d */
    public final long f35266d;

    /* JADX INFO: renamed from: e */
    public final long f35267e;

    /* JADX INFO: renamed from: f */
    public final int f35268f;

    /* JADX INFO: renamed from: g */
    public final long f35269g;

    /* JADX INFO: renamed from: h */
    public int f35270h;

    /* JADX INFO: renamed from: i */
    public boolean f35271i;

    public C5905c() {
        C9885j c9885j = new C9885j();
        m12323j("bufferForPlaybackMs", 2500, 0, "0");
        m12323j("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        m12323j("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        m12323j("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        m12323j("maxBufferMs", 50000, 50000, "minBufferMs");
        m12323j("backBufferDurationMs", 0, 0, "0");
        this.f35263a = c9885j;
        long j10 = 50000;
        this.f35264b = C10134c0.m19026K(j10);
        this.f35265c = C10134c0.m19026K(j10);
        this.f35266d = C10134c0.m19026K(2500);
        this.f35267e = C10134c0.m19026K(5000);
        this.f35268f = -1;
        this.f35270h = 13107200;
        this.f35269g = C10134c0.m19026K(0);
    }

    /* JADX INFO: renamed from: j */
    public static void m12323j(String str, int i10, int i11, String str2) {
        C10129a.m18989a(str + " cannot be less than " + str2, i10 >= i11);
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: a */
    public final boolean mo12324a() {
        return false;
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: b */
    public final long mo12325b() {
        return this.f35269g;
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: c */
    public final void mo12326c() {
        m12333k(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: d */
    public final void mo12327d(InterfaceC2536y[] interfaceC2536yArr, InterfaceC9502k[] interfaceC9502kArr) {
        int iMax = this.f35268f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < interfaceC2536yArr.length) {
                    if (interfaceC9502kArr[i10] != null) {
                        switch (interfaceC2536yArr[i10].mo7008y()) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            default:
                                throw new IllegalArgumentException();
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        this.f35270h = iMax;
        C9885j c9885j = this.f35263a;
        synchronized (c9885j) {
            try {
                boolean z10 = iMax < c9885j.f50448c;
                c9885j.f50448c = iMax;
                if (z10) {
                    c9885j.m18381a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: e */
    public final boolean mo12328e(long j10, float f3) {
        int i10;
        C9885j c9885j = this.f35263a;
        synchronized (c9885j) {
            try {
                i10 = c9885j.f50449d * c9885j.f50447b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = i10 >= this.f35270h;
        long j11 = this.f35265c;
        long jMin = this.f35264b;
        if (f3 > 1.0f) {
            jMin = Math.min(C10134c0.m19053t(f3, jMin), j11);
        }
        if (j10 < Math.max(jMin, 500000L)) {
            boolean z11 = z10 ? false : true;
            this.f35271i = z11;
            if (!z11 && j10 < 500000) {
                C10145n.m19099g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f35271i = false;
        }
        return this.f35271i;
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: f */
    public final void mo12329f() {
        m12333k(true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: g */
    public final boolean mo12330g(long j10, float f3, boolean z10, long j11) {
        int i10;
        long jM19056w = C10134c0.m19056w(f3, j10);
        long jMin = z10 ? this.f35267e : this.f35266d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin > 0 && jM19056w < jMin) {
            C9885j c9885j = this.f35263a;
            synchronized (c9885j) {
                i10 = c9885j.f50449d * c9885j.f50447b;
            }
            if (i10 < this.f35270h) {
                return false;
            }
        }
        return true;
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: h */
    public final C9885j mo12331h() {
        return this.f35263a;
    }

    @Override // p150h9.InterfaceC5942y
    /* JADX INFO: renamed from: i */
    public final void mo12332i() {
        m12333k(true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final void m12333k(boolean z10) {
        int i10 = this.f35268f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f35270h = i10;
        this.f35271i = false;
        if (z10) {
            C9885j c9885j = this.f35263a;
            synchronized (c9885j) {
                if (c9885j.f50446a) {
                    synchronized (c9885j) {
                        boolean z11 = c9885j.f50448c > 0;
                        c9885j.f50448c = 0;
                        if (z11) {
                            c9885j.m18381a();
                        }
                    }
                }
            }
        }
    }
}
