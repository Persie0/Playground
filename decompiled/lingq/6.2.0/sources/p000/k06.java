package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle$Event;
import com.google.android.gms.internal.mlkit_vision_common.C0968a;
import com.google.android.gms.internal.mlkit_vision_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzio;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k06 implements Closeable, tb5 {

    /* JADX INFO: renamed from: e */
    public static final mp2 f46482e = new mp2("MobileVisionBase", "");

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f46483a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final kx9 f46484b;

    /* JADX INFO: renamed from: c */
    public final m58 f46485c;

    /* JADX INFO: renamed from: d */
    public final Executor f46486d;

    public k06(kx9 kx9Var, Executor executor) {
        this.f46484b = kx9Var;
        m58 m58Var = new m58(11);
        this.f46485c = m58Var;
        this.f46486d = executor;
        kx9Var.f48561b.incrementAndGet();
        kx9Var.m15712a(executor, dob.f35975b, (gw9) m58Var.f50618b).mo5961c(to2.f62633c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @ds6(Lifecycle$Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.f46483a.getAndSet(true)) {
            return;
        }
        this.f46485c.m16641d();
        kx9 kx9Var = this.f46484b;
        Executor executor = this.f46486d;
        if (kx9Var.f48561b.get() <= 0) {
            z = false;
        }
        lda.m16133s(z);
        kx9Var.f48560a.m17334m(new gvb(21, kx9Var, new wr9()), executor);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {, blocks: (B:27:0x00e5, B:29:0x00ed, B:34:0x00fe, B:36:0x0104, B:38:0x0108, B:41:0x011d), top: B:55:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {, blocks: (B:27:0x00e5, B:29:0x00ed, B:34:0x00fe, B:36:0x0104, B:38:0x0108, B:41:0x011d), top: B:55:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final tld m14758p(Bitmap bitmap) throws Throwable {
        C0968a c0968a;
        long jElapsedRealtime;
        zziv zzivVar;
        tld tldVar;
        long jElapsedRealtime2;
        HashMap map;
        String strM11703a;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        z54 z54Var = new z54(bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (q2d.class) {
            c0d c0dVar = new c0d();
            synchronized (q2d.class) {
                try {
                    int i = 0;
                    if (q2d.f57178a == null) {
                        q2d.f57178a = new m2d(i);
                    }
                    c0968a = (C0968a) q2d.f57178a.m21326o(c0dVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime3;
            zzivVar = zziv.INPUT_IMAGE_CONSTRUCTION;
            tldVar = c0968a.f11957e;
            jElapsedRealtime2 = SystemClock.elapsedRealtime();
            map = c0968a.f11961i;
            if (map.get(zzivVar) != null || jElapsedRealtime2 - ((Long) map.get(zzivVar)).longValue() > 30000) {
                map.put(zzivVar, Long.valueOf(jElapsedRealtime2));
                qn2 qn2Var = new qn2();
                qn2Var.f57964c = zzii.BITMAP;
                qn2Var.f57963b = zzio.BITMAP;
                qn2Var.f57965d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
                qn2Var.f57967f = Integer.valueOf(height & Integer.MAX_VALUE);
                qn2Var.f57966e = Integer.valueOf(width & Integer.MAX_VALUE);
                qn2Var.f57962a = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
                qn2Var.f57968g = 0;
                plc plcVar = new plc(qn2Var);
                mq7 mq7Var = new mq7(15, (boolean) (null == true ? 1 : 0));
                mq7Var.f51735d = plcVar;
                cdb cdbVar = new cdb(mq7Var);
                if (tldVar.mo5971m()) {
                    strM11703a = (String) tldVar.mo5967i();
                } else {
                    strM11703a = fb5.f38790c.m11703a(c0968a.f11959g);
                }
                C1172a.m6772c().execute(new jo0(c0968a, cdbVar, zzivVar, strM11703a, 7, false));
            }
            synchronized (this) {
                if (this.f46483a.get()) {
                    return Tasks.m5974b(new MlKitException("This detector is already closed!", 14));
                }
                if (z54Var.f70939b >= 32 || z54Var.f70940c < 32) {
                    return Tasks.m5974b(new MlKitException("InputImage width and height should be at least 32!", 3));
                }
                return this.f46484b.m15712a(this.f46486d, new ffb((int) (null == true ? 1 : 0), (Object) this, (Object) z54Var), (gw9) this.f46485c.f50618b);
            }
        }
        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime3;
        zzivVar = zziv.INPUT_IMAGE_CONSTRUCTION;
        tldVar = c0968a.f11957e;
        jElapsedRealtime2 = SystemClock.elapsedRealtime();
        map = c0968a.f11961i;
        if (map.get(zzivVar) != null) {
            map.put(zzivVar, Long.valueOf(jElapsedRealtime2));
            qn2 qn2Var2 = new qn2();
            qn2Var2.f57964c = zzii.BITMAP;
            qn2Var2.f57963b = zzio.BITMAP;
            qn2Var2.f57965d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
            qn2Var2.f57967f = Integer.valueOf(height & Integer.MAX_VALUE);
            qn2Var2.f57966e = Integer.valueOf(width & Integer.MAX_VALUE);
            qn2Var2.f57962a = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
            qn2Var2.f57968g = 0;
            plc plcVar2 = new plc(qn2Var2);
            mq7 mq7Var2 = new mq7(15, (boolean) (null == true ? 1 : 0));
            mq7Var2.f51735d = plcVar2;
            cdb cdbVar2 = new cdb(mq7Var2);
            if (tldVar.mo5971m()) {
                strM11703a = (String) tldVar.mo5967i();
            } else {
                strM11703a = fb5.f38790c.m11703a(c0968a.f11959g);
            }
            C1172a.m6772c().execute(new jo0(c0968a, cdbVar2, zzivVar, strM11703a, 7, false));
        } else {
            map.put(zzivVar, Long.valueOf(jElapsedRealtime2));
            qn2 qn2Var3 = new qn2();
            qn2Var3.f57964c = zzii.BITMAP;
            qn2Var3.f57963b = zzio.BITMAP;
            qn2Var3.f57965d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
            qn2Var3.f57967f = Integer.valueOf(height & Integer.MAX_VALUE);
            qn2Var3.f57966e = Integer.valueOf(width & Integer.MAX_VALUE);
            qn2Var3.f57962a = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
            qn2Var3.f57968g = 0;
            plc plcVar3 = new plc(qn2Var3);
            mq7 mq7Var3 = new mq7(15, (boolean) (null == true ? 1 : 0));
            mq7Var3.f51735d = plcVar3;
            cdb cdbVar3 = new cdb(mq7Var3);
            if (tldVar.mo5971m()) {
                strM11703a = (String) tldVar.mo5967i();
            } else {
                strM11703a = fb5.f38790c.m11703a(c0968a.f11959g);
            }
            C1172a.m6772c().execute(new jo0(c0968a, cdbVar3, zzivVar, strM11703a, 7, false));
        }
        synchronized (this) {
            if (this.f46483a.get()) {
                return Tasks.m5974b(new MlKitException("This detector is already closed!", 14));
            }
            if (z54Var.f70939b >= 32) {
            }
            return Tasks.m5974b(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
    }
}
