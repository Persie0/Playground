package p000;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dff implements dew {

    /* JADX INFO: renamed from: a */
    public static final dfe f10765a = new dfe() { // from class: dfc
        @Override // p000.dfe
        /* JADX INFO: renamed from: k */
        public final void mo6008k(des desVar) {
        }
    };

    /* JADX INFO: renamed from: b */
    public final det f10766b;

    /* JADX INFO: renamed from: c */
    public final dex f10767c;

    /* JADX INFO: renamed from: d */
    public final kcf f10768d;

    /* JADX INFO: renamed from: e */
    public final Map f10769e;

    /* JADX INFO: renamed from: g */
    public final Context f10771g;

    /* JADX INFO: renamed from: h */
    public final kbz f10772h;

    /* JADX INFO: renamed from: k */
    public final cwd f10775k;

    /* JADX INFO: renamed from: f */
    public dfe f10770f = f10765a;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f10773i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public final LruCache f10774j = new LruCache(20);

    public dff(det detVar, cwd cwdVar, dex dexVar, kcf kcfVar, dgn dgnVar, Context context, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f10766b = detVar;
        this.f10775k = cwdVar;
        this.f10767c = dexVar;
        this.f10768d = kcfVar;
        this.f10769e = dgnVar.mo6082br();
        this.f10771g = context;
        this.f10772h = kbzVar;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6050b(boolean z) {
        if (z) {
            Process.setThreadPriority(0);
        }
    }

    @Override // p000.dew
    /* JADX INFO: renamed from: a */
    public final void mo6027a(Long l) {
        dfe dfeVar = this.f10770f;
        der derVarM6021a = des.m6021a();
        derVarM6021a.m6020c(SystemClock.elapsedRealtimeNanos());
        dea deaVarM5974a = deb.m5974a();
        deaVarM5974a.m5972f(l.longValue());
        deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
        deaVarM5974a.f10622e = 4;
        derVarM6021a.m6019b(mws.m17097l(deaVarM5974a.m5967a()));
        dfeVar.mo6008k(derVarM6021a.m6018a());
    }
}
