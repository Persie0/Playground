package p000;

import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;

/* JADX INFO: loaded from: classes.dex */
public final class n67 {

    /* JADX INFO: renamed from: a */
    public final PayloadType f52405a;

    /* JADX INFO: renamed from: b */
    public final PayloadMethod f52406b;

    /* JADX INFO: renamed from: c */
    public final long f52407c;

    /* JADX INFO: renamed from: d */
    public final long f52408d;

    /* JADX INFO: renamed from: e */
    public final long f52409e;

    /* JADX INFO: renamed from: f */
    public final long f52410f;

    /* JADX INFO: renamed from: g */
    public final boolean f52411g;

    /* JADX INFO: renamed from: h */
    public final int f52412h;

    public n67(PayloadType payloadType, PayloadMethod payloadMethod, long j, long j2, long j3, long j4, boolean z, int i) {
        this.f52405a = payloadType;
        this.f52406b = payloadMethod;
        this.f52407c = j;
        this.f52408d = j2;
        this.f52409e = j3;
        this.f52410f = j4;
        this.f52411g = z;
        this.f52412h = i;
    }

    /* JADX INFO: renamed from: a */
    public final dg4 m17262a() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10331B("payload_type", this.f52405a.getKey());
        dg4VarM10328c.m10331B("payload_method", this.f52406b.key);
        dg4VarM10328c.m10330A("creation_start_time_millis", this.f52407c);
        dg4VarM10328c.m10330A("creation_start_count", this.f52408d);
        dg4VarM10328c.m10330A("creation_time_millis", this.f52409e);
        dg4VarM10328c.m10330A("uptime_millis", this.f52410f);
        dg4VarM10328c.m10351u("state_active", this.f52411g);
        dg4VarM10328c.m10353w(this.f52412h, "state_active_count");
        return dg4VarM10328c;
    }
}
