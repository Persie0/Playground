package p075dh;

import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;

/* JADX INFO: renamed from: dh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5176d {

    /* JADX INFO: renamed from: a */
    public final PayloadType f33197a;

    /* JADX INFO: renamed from: b */
    public final PayloadMethod f33198b;

    /* JADX INFO: renamed from: c */
    public final long f33199c;

    /* JADX INFO: renamed from: d */
    public final long f33200d;

    /* JADX INFO: renamed from: e */
    public final long f33201e;

    /* JADX INFO: renamed from: f */
    public final long f33202f;

    /* JADX INFO: renamed from: g */
    public final boolean f33203g;

    /* JADX INFO: renamed from: h */
    public final int f33204h;

    public C5176d(PayloadType payloadType, PayloadMethod payloadMethod, long j10, long j11, long j12, long j13, boolean z10, int i10) {
        this.f33197a = payloadType;
        this.f33198b = payloadMethod;
        this.f33199c = j10;
        this.f33200d = j11;
        this.f33201e = j12;
        this.f33202f = j13;
        this.f33203g = z10;
        this.f33204h = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C5176d m10960a(PayloadType payloadType, PayloadMethod payloadMethod, long j10, long j11, long j12, long j13, boolean z10, int i10) {
        return new C5176d(payloadType, payloadMethod, j10, j11, j12, j13, z10, i10);
    }
}
