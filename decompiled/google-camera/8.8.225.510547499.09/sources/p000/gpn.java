package p000;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Trace;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import com.google.android.apps.camera.processing.ProcessingService;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gpn implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25981a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25982b;

    public /* synthetic */ gpn(Context context, int i) {
        this.f25982b = i;
        this.f25981a = context;
    }

    public /* synthetic */ gpn(NoOpPrewarmService noOpPrewarmService, int i) {
        this.f25982b = i;
        this.f25981a = noOpPrewarmService;
    }

    public /* synthetic */ gpn(ProcessingService processingService, int i) {
        this.f25982b = i;
        this.f25981a = processingService;
    }

    public /* synthetic */ gpn(gpo gpoVar, int i) {
        this.f25982b = i;
        this.f25981a = gpoVar;
    }

    public /* synthetic */ gpn(gpq gpqVar, int i) {
        this.f25982b = i;
        this.f25981a = gpqVar;
    }

    public /* synthetic */ gpn(gpr gprVar, int i) {
        this.f25982b = i;
        this.f25981a = gprVar;
    }

    public /* synthetic */ gpn(gqa gqaVar, int i) {
        this.f25982b = i;
        this.f25981a = gqaVar;
    }

    public gpn(grg grgVar, int i) {
        this.f25982b = i;
        this.f25981a = grgVar;
    }

    public /* synthetic */ gpn(grj grjVar, int i) {
        this.f25982b = i;
        this.f25981a = grjVar;
    }

    public /* synthetic */ gpn(gsm gsmVar, int i) {
        this.f25982b = i;
        this.f25981a = gsmVar;
    }

    public /* synthetic */ gpn(gwr gwrVar, int i) {
        this.f25982b = i;
        this.f25981a = gwrVar;
    }

    public /* synthetic */ gpn(gwu gwuVar, int i) {
        this.f25982b = i;
        this.f25981a = gwuVar;
    }

    public /* synthetic */ gpn(gxu gxuVar, int i) {
        this.f25982b = i;
        this.f25981a = gxuVar;
    }

    public /* synthetic */ gpn(File file, int i) {
        this.f25982b = i;
        this.f25981a = file;
    }

    public /* synthetic */ gpn(Throwable th, int i) {
        this.f25982b = i;
        this.f25981a = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [android.hardware.SensorEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        byte[] bArr;
        byte[] bArrM9614f;
        byte[] bArrM9614f2;
        byte[] bArrM9614f3;
        switch (this.f25982b) {
            case 0:
                Object obj = this.f25981a;
                gpo gpoVar = (gpo) obj;
                gpoVar.f25991h.lock();
                try {
                    if (((gpo) obj).f25990g) {
                        ((gpo) obj).f25989f.unload();
                        break;
                    }
                    return;
                } finally {
                    gpoVar.f25991h.unlock();
                }
            case 1:
                Object obj2 = this.f25981a;
                gpo gpoVar2 = (gpo) obj2;
                gpoVar2.f25991h.lock();
                try {
                    if (((gpo) obj2).f25990g) {
                        ((gpo) obj2).f25989f.reload();
                        break;
                    }
                    return;
                } finally {
                    gpoVar2.f25991h.unlock();
                }
            case 2:
                Object obj3 = this.f25981a;
                gpo gpoVar3 = (gpo) obj3;
                gpoVar3.f25991h.lock();
                try {
                    if (((gpo) obj3).f25990g) {
                        reentrantLock = gpoVar3.f25991h;
                    } else {
                        mrm mrmVarM8495b = ((fjp) ((gpo) obj3).f25988e).m8495b();
                        byte[] bArrM9614f4 = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "facedetector-front.tflite.enc", "F25FB5752634BA2183D9A16FA878F60A");
                        byte[] bArrM9614f5 = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "face_model_468.xnft.enc", "DB22B14BAADB4BEB2FF3FE1205232CB2");
                        boolean zMo6184l = ((gpo) obj3).f25986c.mo6184l(dio.f11679u);
                        boolean zMo6184l2 = ((gpo) obj3).f25986c.mo6184l(dio.f11680v);
                        String strMo6182j = ((gpo) obj3).f25986c.mo6182j(dio.f11681w);
                        if (!zMo6184l2) {
                            byte[] bArrM9614f6 = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "face_light_256_256.tflite.enc", "5BE6E9624DF061E5416D4D1D6215D6E6");
                            bArr = bArrM9614f6;
                            bArrM9614f = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "facemesh-full.tflite.enc", "606B34134C93CF8298025B58B6846736");
                            bArrM9614f2 = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "ffv6_holo040820_normals_net_mixed_fp16_256_256.tflite.enc", "8EE4D0F472BB7FF0B259F3841B1EE273");
                            bArrM9614f3 = ((gpo) obj3).m9614f(((gpo) obj3).f25985b, "ffv6_holo040820_relighting_net_mixed_fp16_256_256.tflite.enc", "E6BE4D7010D31926961DE0E45705C754");
                        } else if (mro.m16832b(strMo6182j)) {
                            ((nbe) ((nbe) gpo.f25983a.m17251b()).mo17276G(3160)).mo17290o("Darwinn offline compilation was enabled, but product class was not configured. Portrait Relighting cannot be initialized.");
                            reentrantLock = gpoVar3.f25991h;
                        } else if (zMo6184l) {
                            ((nbe) ((nbe) gpo.f25983a.m17251b()).mo17276G(3159)).mo17290o("Darwinn offline compilation was enabled, but it cannot be combined with XenoJetCL inference (invalid configuration). Portrait Relighting cannot be initialized.");
                            reentrantLock = gpoVar3.f25991h;
                        } else {
                            byte[] bArrM9615g = ((gpo) obj3).m9615g(((gpo) obj3).f25985b, "face_light_256_256", strMo6182j);
                            byte[] bArrM9615g2 = ((gpo) obj3).m9615g(((gpo) obj3).f25985b, "facemesh-full", strMo6182j);
                            byte[] bArrM9615g3 = ((gpo) obj3).m9615g(((gpo) obj3).f25985b, "ffv6_holo040820_normals_net_mixed_fp16_256_256", strMo6182j);
                            bArrM9614f3 = ((gpo) obj3).m9615g(((gpo) obj3).f25985b, "ffv6_holo040820_relighting_net_mixed_fp16_256_256", strMo6182j);
                            bArr = bArrM9615g;
                            bArrM9614f = bArrM9615g2;
                            bArrM9614f2 = bArrM9615g3;
                        }
                        if (((gpo) obj3).f25989f.initPortraitRelightingProcessor(mrmVarM8495b.mo16813g() ? ((File) mrmVarM8495b.mo16809c()).getAbsolutePath() : "", ((gpo) obj3).f25987d, zMo6184l, zMo6184l2, bArr, bArrM9614f5, bArrM9614f4, bArrM9614f, bArrM9614f2, bArrM9614f3)) {
                            ((gpo) obj3).f25990g = true;
                            reentrantLock = gpoVar3.f25991h;
                        } else {
                            ((nbe) ((nbe) gpo.f25983a.m17251b()).mo17276G(3158)).mo17290o("Unable to initialize Firefly Processor.");
                            reentrantLock = gpoVar3.f25991h;
                        }
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    gpoVar3.f25991h.unlock();
                    throw th;
                }
            case 3:
                ((gpq) this.f25981a).f26007a.mo8564b(ikw.PORTRAIT);
                return;
            case 4:
                ((gpq) this.f25981a).f26008b.mo3953f(ikw.PORTRAIT);
                return;
            case 5:
                gps gpsVar = ((gpr) this.f25981a).f26012a;
                if (gpsVar.f26017e.booleanValue()) {
                    gpsVar.m9621c(300L);
                    return;
                } else {
                    gpsVar.m9619a();
                    return;
                }
            case 6:
                Object obj4 = this.f25981a;
                ((nbe) ((nbe) NoOpPrewarmService.f6849a.m17251b()).mo17276G((char) 3178)).mo17290o("Prewarm timed out! This should not happen.");
                ((NoOpPrewarmService) obj4).f6850b.mo8134I();
                return;
            case 7:
                ((gqa) this.f25981a).f26056a.f6854a.m7087a();
                return;
            case 8:
                Context context = (Context) this.f25981a;
                context.startService(new Intent(context, (Class<?>) ProcessingService.class));
                return;
            case 9:
                Object obj5 = this.f25981a;
                synchronized (((ProcessingService) obj5).f6863f) {
                    ((ProcessingService) obj5).f6864g = true;
                    if (((ProcessingService) obj5).f6865h) {
                        ((ProcessingService) obj5).m4252c();
                    }
                    break;
                }
                return;
            case 10:
                throw new RuntimeException((Throwable) this.f25981a);
            case 11:
                if (((grg) this.f25981a).f26129a.decrementAndGet() == 0) {
                    synchronized (((grg) this.f25981a).f26131c) {
                        ((grg) this.f25981a).m9666a();
                        break;
                    }
                    return;
                }
                return;
            case 12:
                try {
                    ((grj) this.f25981a).f26140b.m9639c();
                    return;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((nbe) ((nbe) ((nbe) grj.f26138a.m17252c()).mo17283h(e)).mo17276G((char) 3205)).mo17290o("ImageShadowTask failed because it was interrupted.");
                    return;
                }
            case 13:
                ((gsi) this.f25981a).mo9700b();
                return;
            case 14:
                ?? r0 = this.f25981a;
                gwr gwrVar = (gwr) r0;
                Sensor sensor = gwrVar.f26626c;
                if (sensor != null) {
                    gwrVar.f26625b.unregisterListener((SensorEventListener) r0, sensor);
                }
                Sensor sensor2 = gwrVar.f26627d;
                if (sensor2 != null) {
                    gwrVar.f26625b.unregisterListener((SensorEventListener) r0, sensor2);
                    return;
                }
                return;
            case 15:
                ?? r1 = this.f25981a;
                Trace.beginSection("HeadingSensor.RegisterAccelerometer");
                gwr gwrVar2 = (gwr) r1;
                Sensor sensor3 = gwrVar2.f26626c;
                if (sensor3 != null) {
                    gwrVar2.f26625b.registerListener((SensorEventListener) r1, sensor3, 3);
                }
                Trace.endSection();
                Trace.beginSection("HeadingSensor.RegisterMagneticSensor");
                Sensor sensor4 = gwrVar2.f26627d;
                if (sensor4 != null) {
                    gwrVar2.f26625b.registerListener((SensorEventListener) r1, sensor4, 3);
                }
                Trace.endSection();
                return;
            case 16:
                gwu gwuVar = (gwu) this.f25981a;
                gwuVar.f26635a.registerListener(gwuVar.f26644j, gwuVar.f26637c, 3);
                return;
            case 17:
                gwu gwuVar2 = (gwu) this.f25981a;
                gwuVar2.f26635a.unregisterListener(gwuVar2.f26644j, gwuVar2.f26637c);
                return;
            case 18:
                ((File) this.f25981a).delete();
                return;
            case 19:
                ((File) this.f25981a).delete();
                return;
            default:
                gxu gxuVar = (gxu) this.f25981a;
                if (gxuVar.f26758c.mo16813g()) {
                    ((fgv) gxuVar.f26758c.mo16809c()).mo8372c();
                    gxuVar.f26758c = mqu.f41450a;
                    return;
                }
                return;
        }
    }
}
