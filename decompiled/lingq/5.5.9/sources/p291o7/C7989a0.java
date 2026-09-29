package p291o7;

import android.os.Handler;
import com.facebook.GraphRequest;
import p067d8.C5056a0;

/* JADX INFO: renamed from: o7.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7989a0 {

    /* JADX INFO: renamed from: a */
    public final Handler f43483a;

    /* JADX INFO: renamed from: b */
    public final GraphRequest f43484b;

    /* JADX INFO: renamed from: c */
    public final long f43485c;

    /* JADX INFO: renamed from: d */
    public long f43486d;

    /* JADX INFO: renamed from: e */
    public long f43487e;

    /* JADX INFO: renamed from: f */
    public long f43488f;

    public C7989a0(Handler handler, GraphRequest graphRequest) {
        this.f43483a = handler;
        this.f43484b = graphRequest;
        C8004n c8004n = C8004n.f43550a;
        C5056a0.m10747e();
        this.f43485c = C8004n.f43558i.get();
    }

    /* JADX INFO: renamed from: a */
    public final void m15847a() {
        final long j10 = this.f43486d;
        if (j10 > this.f43487e) {
            final GraphRequest.InterfaceC2278b interfaceC2278b = this.f43484b.f11457g;
            final long j11 = this.f43488f;
            if (j11 <= 0 || !(interfaceC2278b instanceof GraphRequest.InterfaceC2281e)) {
                return;
            }
            Handler handler = this.f43483a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable(j10, j11) { // from class: o7.z
                @Override // java.lang.Runnable
                public final void run() {
                    ((GraphRequest.InterfaceC2281e) this.f43609a).m6632c();
                }
            }))) == null) {
                ((GraphRequest.InterfaceC2281e) interfaceC2278b).m6632c();
            }
            this.f43487e = this.f43486d;
        }
    }
}
