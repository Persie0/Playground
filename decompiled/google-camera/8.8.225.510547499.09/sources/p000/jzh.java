package p000;

import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzh implements kba {

    /* JADX INFO: renamed from: j */
    public Future f35288j;

    /* JADX INFO: renamed from: l */
    private final Handler f35290l;

    /* JADX INFO: renamed from: k */
    private final npv f35289k = kxk.m14955A(jzn.m13827o("EncWatch", 1));

    /* JADX INFO: renamed from: c */
    public final Object f35281c = new Object();

    /* JADX INFO: renamed from: d */
    public mrm f35282d = mqu.f41450a;

    /* JADX INFO: renamed from: e */
    public volatile boolean f35283e = false;

    /* JADX INFO: renamed from: f */
    public volatile boolean f35284f = false;

    /* JADX INFO: renamed from: g */
    public volatile long f35285g = 0;

    /* JADX INFO: renamed from: h */
    public volatile long f35286h = 0;

    /* JADX INFO: renamed from: i */
    public volatile long f35287i = 0;

    /* JADX INFO: renamed from: b */
    public final Map f35280b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Map f35279a = new HashMap();

    public jzh(Set set, Handler handler) {
        this.f35290l = handler;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f35279a.put((jyv) it.next(), false);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final jzf m13791e(jyv jyvVar, int i) {
        jyv jyvVar2 = jyv.AUDIO;
        switch (i - 1) {
            case 0:
                switch (jyvVar) {
                    case AUDIO:
                        return jzf.AUDIO_TRACK_FAIL_TO_START;
                    case VIDEO:
                        return jzf.VIDEO_TRACK_FAIL_TO_START;
                    case METADATA:
                        return jzf.f35270e;
                }
            default:
                switch (jyvVar) {
                    case AUDIO:
                        return jzf.AUDIO_BUFFER_DELAY;
                    case VIDEO:
                        return jzf.VIDEO_BUFFER_DELAY;
                    case METADATA:
                        return jzf.f35270e;
                }
        }
        return jzf.OTHER;
    }

    /* JADX INFO: renamed from: a */
    public final void m13792a(jzf jzfVar) {
        Log.w("EncWatcher", "Found error: ".concat(String.valueOf(String.valueOf(jzfVar))));
        synchronized (this.f35281c) {
            if (jzfVar == jzf.AUDIO_TRACK_FAIL_TO_START) {
                this.f35279a.remove(jyv.AUDIO);
            }
        }
        if (this.f35282d.mo16813g()) {
            this.f35290l.post(new jpm(this, jzfVar, 15));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13793b(jyv jyvVar, AtomicLong atomicLong) {
        if (this.f35283e) {
            return;
        }
        synchronized (this.f35281c) {
            if (this.f35279a.containsKey(jyvVar)) {
                String.valueOf(jyvVar);
                atomicLong.get();
                this.f35279a.put(jyvVar, true);
                this.f35280b.put(jyvVar, atomicLong);
            } else {
                Log.w("EncWatcher", "Unexpected track was started: " + String.valueOf(jyvVar));
            }
            Iterator it = this.f35279a.entrySet().iterator();
            while (it.hasNext()) {
                ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13794c() {
        synchronized (this.f35281c) {
            if (this.f35288j == null) {
                String.valueOf(this.f35279a.keySet());
                this.f35288j = this.f35289k.scheduleAtFixedRate(new juz(this, 15), 0L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f35281c) {
            if (!this.f35283e) {
                this.f35283e = true;
                this.f35289k.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13795d(jyv jyvVar) {
        if (this.f35283e) {
            return false;
        }
        synchronized (this.f35281c) {
            if (!this.f35279a.containsKey(jyvVar)) {
                return false;
            }
            return ((Boolean) this.f35279a.get(jyvVar)).booleanValue();
        }
    }
}
