package p000;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class juz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f34868a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34869b;

    public /* synthetic */ juz(HandlerThread handlerThread, int i) {
        this.f34869b = i;
        this.f34868a = handlerThread;
    }

    public juz(Throwable th, int i) {
        this.f34869b = i;
        this.f34868a = th;
    }

    public /* synthetic */ juz(Throwable th, int i, byte[] bArr) {
        this.f34869b = i;
        this.f34868a = th;
    }

    public /* synthetic */ juz(ExecutionException executionException, int i) {
        this.f34869b = i;
        this.f34868a = executionException;
    }

    public juz(jut jutVar, int i) {
        this.f34869b = i;
        this.f34868a = jutVar;
    }

    public juz(jvt jvtVar, int i) {
        this.f34869b = i;
        this.f34868a = jvtVar;
    }

    public /* synthetic */ juz(jvx jvxVar, int i) {
        this.f34869b = i;
        this.f34868a = jvxVar;
    }

    public /* synthetic */ juz(jxa jxaVar, int i) {
        this.f34869b = i;
        this.f34868a = jxaVar;
    }

    public /* synthetic */ juz(jzb jzbVar, int i) {
        this.f34869b = i;
        this.f34868a = jzbVar;
    }

    public /* synthetic */ juz(jzd jzdVar, int i) {
        this.f34869b = i;
        this.f34868a = jzdVar;
    }

    public /* synthetic */ juz(jzh jzhVar, int i) {
        this.f34869b = i;
        this.f34868a = jzhVar;
    }

    public /* synthetic */ juz(jzo jzoVar, int i) {
        this.f34869b = i;
        this.f34868a = jzoVar;
    }

    public /* synthetic */ juz(kbg kbgVar, int i) {
        this.f34869b = i;
        this.f34868a = kbgVar;
    }

    public /* synthetic */ juz(kba[] kbaVarArr, int i) {
        this.f34869b = i;
        this.f34868a = kbaVarArr;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kbg] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        jvy jvyVar;
        int i = 0;
        switch (this.f34869b) {
            case 0:
                ((HandlerThread) this.f34868a).quitSafely();
                return;
            case 1:
                synchronized (((jut) this.f34868a).f34859d) {
                    Object obj = this.f34868a;
                    if (!((jut) obj).f34861f && ((jut) obj).f34857b == 0) {
                        i = 1;
                        ((jut) obj).f34861f = true;
                    }
                    break;
                }
                if (i != 0) {
                    ((jut) this.f34868a).f34856a.close();
                    return;
                }
                return;
            case 2:
                throw ((Throwable) this.f34868a);
            case 3:
                throw new jvj(((ExecutionException) this.f34868a).getCause());
            case 4:
                throw new jvj((Throwable) this.f34868a);
            case 5:
                synchronized (((jvt) this.f34868a).f34915a) {
                    Object obj2 = this.f34868a;
                    Runnable runnable = ((jvt) obj2).f34916b;
                    if (runnable == null) {
                        return;
                    }
                    ((jvt) obj2).f34916b = null;
                    runnable.run();
                    return;
                }
            case 6:
                throw new RuntimeException((Throwable) this.f34868a);
            case 7:
                Object obj3 = this.f34868a;
                while (i <= 0) {
                    kba kbaVar = ((kba[]) obj3)[i];
                    if (kbaVar != null) {
                        kbaVar.close();
                    }
                    i++;
                }
                return;
            case 8:
                Object obj4 = this.f34868a;
                jvx jvxVar = (jvx) obj4;
                synchronized (jvxVar.f34925a) {
                    jvyVar = (jvy) ((jvx) obj4).f34928d.pollFirst();
                    break;
                }
                if (jvyVar != null) {
                    try {
                        if (!jvyVar.f34931b.isCancelled()) {
                            jvyVar.f34930a.run();
                        }
                        synchronized (jvxVar.f34925a) {
                            ((jvx) obj4).f34926b--;
                            break;
                        }
                    } catch (Throwable th) {
                        try {
                            jvyVar.f34931b.mo8566a(th);
                        } finally {
                            synchronized (jvxVar.f34925a) {
                                ((jvx) obj4).f34926b--;
                                jvyVar.f34931b.mo14894e(true);
                            }
                        }
                    }
                    return;
                }
                return;
            case 9:
                this.f34868a.mo3415bf(Collections.emptyList());
                return;
            case 10:
                ((jxa) this.f34868a).f34978a++;
                return;
            case 11:
                Object obj5 = this.f34868a;
                jxa jxaVar = (jxa) obj5;
                int i2 = jxaVar.f34978a - 1;
                jxaVar.f34978a = i2;
                if (i2 != 0 || jxaVar.f34979e == null) {
                    return;
                }
                ((jwf) obj5).mo13622c(jxaVar.f34979e);
                jxaVar.f34979e = null;
                return;
            case 12:
                Object obj6 = this.f34868a;
                jzd jzdVar = (jzd) obj6;
                jzdVar.f35241c.shutdown();
                jzdVar.f35240b.shutdown();
                jzdVar.f35239a.shutdown();
                jzdVar.f35242d.shutdown();
                try {
                    ((jzd) obj6).f35241c.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    ((jzd) obj6).f35240b.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    ((jzd) obj6).f35239a.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    ((jzd) obj6).f35242d.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Log.e(KMNlNMe.FtsbenzFgRzVpD, "Interrupted while waiting for executors to terminate.", e);
                }
                try {
                    ((jzd) obj6).f35248j.stop();
                    return;
                } catch (RuntimeException e2) {
                    Log.w("AudioEncoder", "MediaCodec could not stop.", e2);
                    return;
                }
            case 13:
                ((jzd) this.f34868a).f35230N.quitSafely();
                return;
            case 14:
                ((jzb) this.f34868a).f35214a.f35231O.mo14894e(null);
                return;
            case 15:
                Object obj7 = this.f34868a;
                jzh jzhVar = (jzh) obj7;
                if (jzhVar.f35283e) {
                    return;
                }
                long j = 0;
                if (jzhVar.f35285g > 0) {
                    return;
                }
                synchronized (jzhVar.f35281c) {
                    long micros = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                    mwx mwxVarM17118m = mwx.m17118m(((jzh) obj7).f35279a);
                    for (jyv jyvVar : mwxVarM17118m.keySet()) {
                        if (((Boolean) mwxVarM17118m.get(jyvVar)).booleanValue()) {
                            synchronized (((jzh) obj7).f35281c) {
                                if (((jzh) obj7).f35279a.containsKey(jyvVar)) {
                                    if (((Boolean) ((jzh) obj7).f35279a.get(jyvVar)).booleanValue()) {
                                        AtomicLong atomicLong = (AtomicLong) ((jzh) obj7).f35280b.get(jyvVar);
                                        atomicLong.getClass();
                                        if (atomicLong.get() != j) {
                                            long j2 = (micros - ((jzh) obj7).f35286h) - atomicLong.get();
                                            if (j2 > 3000000) {
                                                Log.e("EncWatcher", String.format("Track %s is very delayed: %s us", jyvVar, Long.valueOf(j2)));
                                                ((jzh) obj7).m13792a(jzh.m13791e(jyvVar, 2));
                                            }
                                            j = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            synchronized (((jzh) obj7).f35281c) {
                                if (!((jzh) obj7).f35279a.containsKey(jyvVar)) {
                                    j = 0;
                                } else if (((Boolean) ((jzh) obj7).f35279a.get(jyvVar)).booleanValue()) {
                                    j = 0;
                                } else {
                                    long j3 = (micros - ((jzh) obj7).f35286h) - ((jzh) obj7).f35287i;
                                    if (jyvVar == jyv.AUDIO) {
                                        if (j3 > 1000000) {
                                            Log.e("EncWatcher", String.format("Audio track not started after %s us", Long.valueOf(j3)));
                                            ((jzh) obj7).m13792a(jzh.m13791e(jyv.AUDIO, 1));
                                        }
                                        j = 0;
                                    } else {
                                        if (j3 > 3000000) {
                                            Log.e("EncWatcher", String.format("%s track not started after %s us", jyvVar, Long.valueOf(j3)));
                                            ((jzh) obj7).m13792a(jzh.m13791e(jyvVar, 1));
                                        }
                                        j = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            case 16:
                jzo jzoVar = (jzo) this.f34868a;
                if (jzoVar.f35318b) {
                    return;
                }
                Iterator it = Collections.unmodifiableCollection(jzoVar.f35317a).iterator();
                while (it.hasNext()) {
                    ((jyt) it.next()).mo5351g();
                }
                jzoVar.f35318b = true;
                return;
            case 17:
                jzo jzoVar2 = (jzo) this.f34868a;
                if (jzoVar2.f35318b) {
                    return;
                }
                Iterator it2 = Collections.unmodifiableCollection(jzoVar2.f35317a).iterator();
                while (it2.hasNext()) {
                    ((jyt) it2.next()).mo5351g();
                }
                jzoVar2.f35318b = true;
                return;
            case 18:
                jzo jzoVar3 = (jzo) this.f34868a;
                if (jzoVar3.f35319c) {
                    return;
                }
                Iterator it3 = Collections.unmodifiableCollection(jzoVar3.f35317a).iterator();
                while (it3.hasNext()) {
                    ((jyt) it3.next()).mo5349e();
                }
                jzoVar3.f35319c = true;
                return;
            case 19:
                Iterator it4 = Collections.unmodifiableCollection(((jzo) this.f34868a).f35317a).iterator();
                while (it4.hasNext()) {
                    ((jyt) it4.next()).mo5352h();
                }
                return;
            default:
                Iterator it5 = Collections.unmodifiableCollection(((jzo) this.f34868a).f35317a).iterator();
                while (it5.hasNext()) {
                    ((jyt) it5.next()).mo5350f();
                }
                return;
        }
    }
}
