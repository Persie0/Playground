package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kja {

    /* JADX INFO: renamed from: a */
    public final ktz f36235a;

    /* JADX INFO: renamed from: b */
    public final ktz f36236b;

    /* JADX INFO: renamed from: c */
    public final ktz f36237c;

    /* JADX INFO: renamed from: d */
    public final ktz f36238d;

    /* JADX INFO: renamed from: e */
    public final ktz f36239e;

    /* JADX INFO: renamed from: f */
    public final ktz f36240f;

    /* JADX INFO: renamed from: g */
    public final ktz f36241g;

    /* JADX INFO: renamed from: h */
    public final ktz f36242h;

    /* JADX INFO: renamed from: i */
    public final ktz f36243i;

    /* JADX INFO: renamed from: j */
    public final ktz f36244j;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ lpe f36245k;

    public kja(lpe lpeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f36245k = lpeVar;
        Object obj = lpeVar.f38883b;
        String str = KMNlNMe.xpu;
        this.f36235a = ((kol) obj).m14623b("/pck/frameserver/frameserver_count", koc.m14617b(str));
        this.f36236b = ((kol) lpeVar.f38883b).m14624c("/pck/frameserver/frameserver_open_durations_ns", koc.m14617b(str));
        this.f36237c = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/frame_stream_count", koc.m14617b(str), koc.m14616a("stream_count"), koc.m14616a("parameter_count"));
        this.f36238d = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/framebuffer_acquire_count", new koc[0]);
        this.f36239e = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/framebuffer_release_count", new koc[0]);
        this.f36240f = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/request_submit_count", koc.m14616a("burst_size"), new koc("repeating", Boolean.class));
        this.f36241g = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/request_abort", new koc[0]);
        this.f36242h = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/stream_count", koc.m14617b(str), koc.m14617b("type"), koc.m14616a("format"), koc.m14616a("width"), koc.m14616a("height"), koc.m14616a("capacity"));
        this.f36243i = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/image_acquire_count", koc.m14616a("width"), koc.m14616a("height"), koc.m14616a("format"));
        this.f36244j = ((kol) lpeVar.f38883b).m14623b("/pck/frameserver/image_release_count", koc.m14616a("width"), koc.m14616a("height"), koc.m14616a("format"));
    }
}
