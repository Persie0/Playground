package p000;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzo implements jys {

    /* JADX INFO: renamed from: A */
    private final int f35316A;

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f35317a;

    /* JADX INFO: renamed from: b */
    public boolean f35318b;

    /* JADX INFO: renamed from: c */
    public boolean f35319c;

    /* JADX INFO: renamed from: d */
    public final jzh f35320d;

    /* JADX INFO: renamed from: e */
    private kqa f35321e;

    /* JADX INFO: renamed from: i */
    private final Handler f35325i;

    /* JADX INFO: renamed from: k */
    private final jyu f35327k;

    /* JADX INFO: renamed from: l */
    private final jyu f35328l;

    /* JADX INFO: renamed from: n */
    private final nqf f35330n;

    /* JADX INFO: renamed from: q */
    private final int f35333q;

    /* JADX INFO: renamed from: r */
    private final jyq f35334r;

    /* JADX INFO: renamed from: s */
    private final mrm f35335s;

    /* JADX INFO: renamed from: t */
    private final int f35336t;

    /* JADX INFO: renamed from: w */
    private final ExecutorService f35339w;

    /* JADX INFO: renamed from: x */
    private final long f35340x;

    /* JADX INFO: renamed from: f */
    private kqa f35322f = null;

    /* JADX INFO: renamed from: g */
    private List f35323g = new ArrayList();

    /* JADX INFO: renamed from: j */
    private volatile long f35326j = 0;

    /* JADX INFO: renamed from: m */
    private List f35329m = new ArrayList();

    /* JADX INFO: renamed from: o */
    private final jzi f35331o = new jzi();

    /* JADX INFO: renamed from: p */
    private jyo f35332p = new jyo(Long.MAX_VALUE, Long.MAX_VALUE);

    /* JADX INFO: renamed from: u */
    private long f35337u = 0;

    /* JADX INFO: renamed from: v */
    private boolean f35338v = false;

    /* JADX INFO: renamed from: y */
    private final Map f35341y = new HashMap();

    /* JADX INFO: renamed from: h */
    private final Object f35324h = new Object();

    /* JADX INFO: renamed from: z */
    private int f35342z = 1;

    public jzo(FileDescriptor fileDescriptor, int i, int i2, mrm mrmVar, nps npsVar, long j, long j2, int i3, int i4, int i5, jyq jyqVar, Handler handler, ExecutorService executorService, jzh jzhVar) {
        int i6 = 0;
        this.f35336t = i2;
        this.f35333q = i;
        this.f35335s = mrmVar;
        this.f35334r = jyqVar;
        this.f35320d = jzhVar;
        this.f35321e = m13843v(fileDescriptor, jyqVar, i, i2, mrmVar);
        if (i4 != 1) {
            throw new IllegalArgumentException("add least audio or video is required.");
        }
        this.f35327k = new jyu(i3);
        this.f35328l = new jyu(1);
        this.f35329m.add(new jyu(i5));
        this.f35316A = i5;
        this.f35325i = handler;
        this.f35330n = nqf.m17621g();
        this.f35317a = new ConcurrentLinkedQueue();
        this.f35318b = false;
        this.f35319c = false;
        this.f35339w = executorService;
        this.f35340x = j2 - 30000000;
        kxk.m14975U(nod.m17553i(npsVar, new jzm(j, i6), not.INSTANCE), new jwq(this, 4), not.INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    private final synchronized jyo m13839r() {
        return this.f35332p;
    }

    /* JADX INFO: renamed from: s */
    private final void m13840s() {
        synchronized (this.f35324h) {
            lku.m15669w(this.f35338v);
            kqa kqaVar = this.f35321e;
            kqa kqaVar2 = this.f35322f;
            kqaVar2.getClass();
            this.f35321e = kqaVar2;
            this.f35322f = null;
            this.f35329m = mkv.m16499G(this.f35323g);
            this.f35323g = new ArrayList();
            this.f35321e.mo14522f();
            this.f35338v = false;
            ((noa) this.f35339w).submit(new jpm(this, kqaVar, 16));
            this.f35325i.post(new juz(this, 19));
        }
    }

    /* JADX INFO: renamed from: u */
    private final boolean m13842u() {
        Iterator it = this.f35329m.iterator();
        while (it.hasNext()) {
            if (!((jyu) it.next()).m13740e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    private static kqa m13843v(FileDescriptor fileDescriptor, jyq jyqVar, int i, int i2, mrm mrmVar) {
        if (fileDescriptor == null) {
            throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
        }
        kqa kqaVarMo5570a = jyqVar.mo5570a(fileDescriptor, i);
        kqaVarMo5570a.mo14521e(i2);
        if (i == 0 && mrmVar.mo16813g()) {
            kqaVarMo5570a.mo14520d((float) ((Location) mrmVar.mo16809c()).getLatitude(), (float) ((Location) mrmVar.mo16809c()).getLongitude());
        }
        return kqaVarMo5570a;
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: a */
    public final mrm mo13720a(MediaFormat mediaFormat) {
        jyu jyuVar;
        synchronized (this.f35324h) {
            mediaFormat.getString("mime");
            int i = this.f35342z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.f35321e.mo14525i()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add metadata track.");
                    return mqu.f41450a;
                }
                if (this.f35316A == 3) {
                    Log.e("MediaMuxerMul", "Metadata track is forbidden and can't be added");
                    return mqu.f41450a;
                }
                String string = mediaFormat.getString("mime");
                string.getClass();
                for (jyu jyuVar2 : this.f35329m) {
                    MediaFormat mediaFormat2 = jyuVar2.f35203d;
                    if (mediaFormat2 != null && string.equals(mediaFormat2.getString("mime"))) {
                        Log.w("MediaMuxerMul", "Metadata track format " + string + xRFdVyfdeve.MKIwOeLnQGUM);
                        return mrm.m16829i(Integer.valueOf(jyuVar2.m13736a()));
                    }
                }
                if (((jyu) mkv.m16515W(this.f35329m)).f35200a) {
                    jyuVar = new jyu(this.f35316A);
                } else {
                    List list = this.f35329m;
                    jyuVar = (jyu) list.remove(list.size() - 1);
                }
                jyuVar.m13738c(this.f35321e.mo14517a(mediaFormat));
                jyuVar.f35203d = mediaFormat;
                this.f35329m.add(jyuVar);
                jyuVar.m13736a();
                return mrm.m16829i(Integer.valueOf(jyuVar.m13736a()));
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add metadata track.");
            return mqu.f41450a;
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: b */
    public final void mo13721b(MediaFormat mediaFormat) {
        synchronized (this.f35324h) {
            int i = this.f35342z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.f35321e.mo14525i()) {
                    Log.e("MediaMuxerMul", EArqVBjecl.EiwDkHZMwQwzaUU);
                    return;
                }
                jyu jyuVar = this.f35327k;
                if (jyuVar.m13739d()) {
                    Log.e("MediaMuxerMul", "Audio track is forbidden and can't be added");
                    return;
                }
                jyuVar.m13738c(this.f35321e.mo14517a(mediaFormat));
                jyu jyuVar2 = this.f35327k;
                jyuVar2.f35203d = mediaFormat;
                jyuVar2.m13736a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add audio track.");
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: c */
    public final void mo13722c(jyt jytVar) {
        this.f35317a.add(jytVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        mo13728i();
        this.f35339w.shutdown();
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: d */
    public final void mo13723d(long j) {
        if (j < 0) {
            Log.e("MediaMuxerMul", "The duration of record cannot be shorter than existing one.");
        } else {
            this.f35331o.f35292b += j;
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: e */
    public final void mo13724e(MediaFormat mediaFormat) {
        synchronized (this.f35324h) {
            int i = this.f35342z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.f35321e.mo14525i()) {
                    Log.e(aJFPpVSaoDO.AzFcBwd, "Already started, cannot add video track.");
                    return;
                }
                this.f35328l.m13738c(this.f35321e.mo14517a(mediaFormat));
                jyu jyuVar = this.f35328l;
                jyuVar.f35203d = mediaFormat;
                jyuVar.m13736a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add video track.");
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: f */
    public final void mo13725f() {
        synchronized (this.f35324h) {
            if (this.f35342z != 1) {
                Log.e("MediaMuxerMul", "Already started, cannot discard track.");
                return;
            }
            jyu jyuVar = this.f35327k;
            if (jyuVar.f35200a) {
                Log.w("TrackInf", "Track is already added");
            } else {
                jyuVar.f35201b = true;
            }
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: g */
    public final void mo13726g(jyt jytVar) {
        this.f35317a.remove(jytVar);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: h */
    public final void mo13727h(FileDescriptor fileDescriptor) {
        try {
            this.f35322f = m13843v(fileDescriptor, this.f35334r, this.f35333q, this.f35336t, this.f35335s);
            ArrayList arrayList = new ArrayList();
            jyu jyuVar = this.f35328l;
            if (jyuVar.f35200a) {
                arrayList.add(jyuVar);
            }
            jyu jyuVar2 = this.f35327k;
            if (jyuVar2.f35200a) {
                arrayList.add(jyuVar2);
            }
            for (jyu jyuVar3 : this.f35329m) {
                if (jyuVar3.f35200a) {
                    arrayList.add(jyuVar3);
                }
            }
            this.f35323g = mkv.m16499G(this.f35329m);
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= size) {
                    break;
                }
                jyu jyuVar4 = (jyu) arrayList.get(i);
                kqa kqaVar = this.f35322f;
                kqaVar.getClass();
                MediaFormat mediaFormat = jyuVar4.f35203d;
                mediaFormat.getClass();
                if (kqaVar.mo14517a(mediaFormat) != jyuVar4.m13736a()) {
                    z = false;
                }
                lku.m15669w(z);
                i++;
            }
            for (Map.Entry entry : this.f35341y.entrySet()) {
                kqa kqaVar2 = this.f35322f;
                kqaVar2.getClass();
                kqaVar2.mo14518b((String) entry.getKey(), entry.getValue());
            }
            this.f35338v = true;
        } catch (jyp e) {
            Log.e("MediaMuxerMul", "Fail to create next video file", e);
            throw new IllegalStateException("Fail to create next video file", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[Catch: all -> 0x009d, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0019, B:14:0x003d, B:15:0x0041, B:17:0x0047, B:18:0x004b, B:19:0x0053, B:23:0x0068, B:26:0x006e, B:30:0x008f, B:31:0x0091, B:33:0x0095, B:34:0x009b, B:29:0x0075, B:22:0x005a), top: B:43:0x0003, inners: #0, #1 }] */
    @Override // p000.jys
    /* JADX INFO: renamed from: i */
    public final void mo13728i() {
        kqa kqaVar;
        synchronized (this.f35324h) {
            int i = this.f35342z;
            try {
                if (i != 2) {
                    if (i == 4) {
                        kqaVar = this.f35322f;
                        if (kqaVar != null) {
                            kqaVar.mo14519c();
                            this.f35322f = null;
                        }
                    }
                    throw th;
                }
                if (this.f35328l.f35202c) {
                    jyu jyuVar = this.f35327k;
                    if (!jyuVar.f35200a || jyuVar.f35202c) {
                        Log.e("MediaMuxerMul", "All tracks empty; writing empty packet to avoid muxer hang");
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
                        byteBufferAllocateDirect.put((byte) 0);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        bufferInfo.set(0, 1, this.f35326j, 5);
                        if (this.f35328l.f35200a) {
                            mo13733n(byteBufferAllocateDirect, bufferInfo);
                        } else if (this.f35327k.f35200a) {
                            mo13731l(byteBufferAllocateDirect, bufferInfo);
                        } else {
                            Log.e(JrxsYuVZZqnFC.SKWbet, "Couldn't write out any empty packets.");
                        }
                    }
                }
                try {
                    this.f35321e.mo14523g();
                } catch (IllegalStateException e) {
                    Log.e("MediaMuxerMul", "Failed to stop mediamuxer ", e);
                    this.f35320d.m13792a(jzf.MUXER_STOP_ERROR);
                }
                this.f35342z = 3;
                this.f35321e.mo14519c();
            } catch (IllegalStateException e2) {
                Log.e("MediaMuxerMul", "Failed to release mediamuxer " + e2.toString());
            }
            this.f35342z = 4;
            kqaVar = this.f35322f;
            if (kqaVar != null) {
                kqaVar.mo14519c();
                this.f35322f = null;
            }
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: l */
    public final void mo13731l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        jyu jyuVar = this.f35327k;
        if (!jyuVar.f35200a) {
            Log.e("MediaMuxerMul", "Audio track is not supported");
            return;
        }
        m13841t(byteBuffer, bufferInfo, jyuVar.m13736a());
        if (bufferInfo.size > 0) {
            this.f35327k.m13737b();
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: m */
    public final void mo13732m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        jyu jyuVar;
        Iterator it = this.f35329m.iterator();
        while (true) {
            if (!it.hasNext()) {
                jyuVar = null;
                break;
            }
            jyuVar = (jyu) it.next();
            if (jyuVar.f35200a && jyuVar.m13736a() == i) {
                break;
            }
        }
        if (jyuVar == null) {
            Log.e("MediaMuxerMul", "Couldn't find metadata track: " + i);
            return;
        }
        if (!jyuVar.f35200a) {
            Log.e("MediaMuxerMul", "Metadata track is not supported");
            return;
        }
        m13841t(byteBuffer, bufferInfo, jyuVar.m13736a());
        if (bufferInfo.size > 0) {
            jyuVar.m13737b();
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: n */
    public final void mo13733n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        jyu jyuVar = this.f35328l;
        if (!jyuVar.f35200a) {
            Log.e("MediaMuxerMul", "Video track is not supported");
            return;
        }
        m13841t(byteBuffer, bufferInfo, jyuVar.m13736a());
        if (bufferInfo.size > 0) {
            this.f35328l.m13737b();
            this.f35325i.post(new jpm(this, bufferInfo, 17));
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: o */
    public final boolean mo13734o() {
        boolean z;
        synchronized (this.f35324h) {
            z = this.f35342z == 2;
        }
        return z;
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: p */
    public final void mo13735p(Object obj) {
        synchronized (this.f35324h) {
            int i = this.f35342z;
            if (i != 3 && i != 4) {
                this.f35341y.put("SpecialTypeID", obj);
                this.f35321e.mo14518b("SpecialTypeID", obj);
                return;
            }
            Log.e("MediaMuxerMul", "Failed to add metadata with state: " + jzn.m13813a(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m13844q(jyo jyoVar) {
        this.f35332p = jyoVar;
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: j */
    public final void mo13729j(long j) {
        try {
            this.f35330n.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (TimeoutException e3) {
            throw new RuntimeException(String.format("Wait for muxer to start timed out after %s milliseconds.audio-ready: %s, video-ready: %s, meta-ready: %s", Long.valueOf(j), Boolean.valueOf(this.f35327k.m13740e()), Boolean.valueOf(this.f35328l.m13740e()), Boolean.valueOf(m13842u())));
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: k */
    public final void mo13730k() {
        synchronized (this.f35324h) {
            int i = this.f35342z;
            if (i == 1) {
                if ((this.f35327k.m13740e() && this.f35328l.m13740e() && m13842u()) || this.f35321e.mo14525i()) {
                    this.f35321e.mo14522f();
                    this.f35342z = 2;
                    this.f35330n.mo14894e(null);
                    this.f35326j = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                }
            } else if (i == 3) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m13841t(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        jyo jyoVarM13839r = m13839r();
        synchronized (this.f35324h) {
            int i2 = this.f35342z;
            if (i2 != 2) {
                Log.e("MediaMuxerMul", "STARTED is expected, but we get " + jzn.m13813a(i2));
                return;
            }
            synchronized (this.f35324h) {
                if (this.f35337u >= this.f35340x) {
                    this.f35325i.post(new juz(this, 20));
                    this.f35337u = 0L;
                }
                if (this.f35338v) {
                    jyu jyuVar = this.f35328l;
                    if (jyuVar.m13739d()) {
                        m13840s();
                    } else if (i == jyuVar.m13736a() && (bufferInfo.flags & 1) != 0) {
                        long j = bufferInfo.presentationTimeUs;
                        m13840s();
                    }
                }
            }
            if (bufferInfo.presentationTimeUs < 0) {
                Log.e("MediaMuxerMul", "Tried to write negative presentationTimeUs " + bufferInfo.presentationTimeUs);
                return;
            }
            try {
                this.f35321e.mo14524h(i, byteBuffer, bufferInfo);
                this.f35331o.f35291a += (long) bufferInfo.size;
                this.f35337u += (long) bufferInfo.size;
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.e("MediaMuxerMul", "Fail to write data to muxer", e);
                this.f35325i.post(new juz(this, 16));
            }
            if (this.f35331o.f35291a >= jyoVarM13839r.f35198a) {
                this.f35325i.post(new juz(this, 17));
            }
            if (this.f35331o.f35292b >= jyoVarM13839r.f35199b) {
                this.f35325i.post(new juz(this, 18));
            }
        }
    }
}
