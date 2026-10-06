package p000;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exm implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public static final nbh f20743a = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/panorama/LightCycleController");

    /* JADX INFO: renamed from: A */
    public final exf f20744A;

    /* JADX INFO: renamed from: B */
    public eyp f20745B;

    /* JADX INFO: renamed from: J */
    public final cwd f20753J;

    /* JADX INFO: renamed from: K */
    private float f20754K;

    /* JADX INFO: renamed from: L */
    private final fca f20755L;

    /* JADX INFO: renamed from: M */
    private final LocalSessionStorage f20756M;

    /* JADX INFO: renamed from: b */
    public exp f20760b;

    /* JADX INFO: renamed from: c */
    public final ewt f20761c;

    /* JADX INFO: renamed from: d */
    public boolean f20762d;

    /* JADX INFO: renamed from: e */
    public float f20763e;

    /* JADX INFO: renamed from: f */
    public float f20764f;

    /* JADX INFO: renamed from: g */
    public final eyi f20765g;

    /* JADX INFO: renamed from: h */
    public double f20766h;

    /* JADX INFO: renamed from: i */
    public double f20767i;

    /* JADX INFO: renamed from: j */
    public boolean f20768j;

    /* JADX INFO: renamed from: k */
    public int f20769k;

    /* JADX INFO: renamed from: o */
    public FileWriter f20773o;

    /* JADX INFO: renamed from: p */
    public final Context f20774p;

    /* JADX INFO: renamed from: q */
    public final dhv f20775q;

    /* JADX INFO: renamed from: t */
    public eaj f20778t;

    /* JADX INFO: renamed from: v */
    public boolean f20780v;

    /* JADX INFO: renamed from: y */
    public final Handler f20783y;

    /* JADX INFO: renamed from: z */
    public final HandlerThread f20784z;

    /* JADX INFO: renamed from: l */
    public final Semaphore f20770l = new Semaphore(0);

    /* JADX INFO: renamed from: m */
    public final Vector f20771m = new Vector(100);

    /* JADX INFO: renamed from: n */
    public int f20772n = 0;

    /* JADX INFO: renamed from: r */
    public boolean f20776r = false;

    /* JADX INFO: renamed from: s */
    public boolean f20777s = false;

    /* JADX INFO: renamed from: u */
    public boolean f20779u = false;

    /* JADX INFO: renamed from: w */
    public eyp f20781w = null;

    /* JADX INFO: renamed from: x */
    public eyp f20782x = null;

    /* JADX INFO: renamed from: C */
    public final List f20746C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public final List f20747D = new ArrayList();

    /* JADX INFO: renamed from: E */
    public final List f20748E = new ArrayList();

    /* JADX INFO: renamed from: F */
    public final exr f20749F = new exr();

    /* JADX INFO: renamed from: G */
    public boolean f20750G = false;

    /* JADX INFO: renamed from: I */
    public final AmbientMode.AmbientController f20752I = new AmbientMode.AmbientController(this);

    /* JADX INFO: renamed from: N */
    private final bno f20757N = new exj();

    /* JADX INFO: renamed from: P */
    private final AmbientModeSupport.AmbientController f20759P = new AmbientModeSupport.AmbientController(this);

    /* JADX INFO: renamed from: O */
    private final bno f20758O = new exk(this);

    /* JADX INFO: renamed from: H */
    public final Handler f20751H = jvh.m13557e(Looper.getMainLooper());

    public exm(Context context, dhv dhvVar, ewt ewtVar, eyi eyiVar, LocalSessionStorage localSessionStorage, exf exfVar, exp expVar, fca fcaVar, cwd cwdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f20773o = null;
        this.f20780v = false;
        this.f20753J = cwdVar;
        this.f20774p = context;
        this.f20775q = dhvVar;
        this.f20765g = eyiVar;
        this.f20756M = localSessionStorage;
        this.f20744A = exfVar;
        this.f20755L = fcaVar;
        try {
            this.f20773o = new FileWriter(localSessionStorage.f6808i);
        } catch (IOException e) {
            ((nbe) ((nbe) f20743a.m17251b()).mo17276G(2043)).mo17293r("Could not create file writer for : %s", this.f20756M.f6808i);
        }
        HandlerThread handlerThread = new HandlerThread("FileHandlerThread");
        this.f20784z = handlerThread;
        handlerThread.start();
        this.f20783y = jvh.m13557e(handlerThread.getLooper());
        this.f20761c = ewtVar;
        if (ewtVar == null) {
            return;
        }
        this.f20760b = expVar;
        expVar.f20793F = this;
        this.f20753J.m5650I().getDefaultDisplay();
        exp expVar2 = this.f20760b;
        expVar2.f20792E = eyiVar;
        expVar2.f20861y = new exz();
        this.f20765g.f20975l = new fno(this, 1);
        this.f20749F.f20867c = Build.MODEL.startsWith("Nexus 5");
        this.f20780v = dhvVar.mo6184l(din.f11643c);
    }

    /* JADX INFO: renamed from: i */
    public static final float m8002i(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX INFO: renamed from: a */
    public final float m8003a() {
        float fM8004b = m8004b();
        if (fM8004b > 0.0f) {
            return fM8004b;
        }
        float f = this.f20754K;
        if (f > 75.0f) {
            return 55.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: b */
    public final float m8004b() {
        if (this.f20761c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        int iIntValue = ((Integer) this.f20775q.mo6173a(din.f11641a).get()).intValue();
        if (iIntValue > 0) {
            return iIntValue / 1000.0f;
        }
        exc excVar = exd.f20723a;
        return exd.m7977a(this.f20754K);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m8005c() {
        int i = this.f20772n;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        this.f20772n = i - 1;
        List list = this.f20746C;
        list.remove(list.size() - 1);
        try {
            this.f20773o.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f20756M.f6808i));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < this.f20772n; i3++) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(this.f20756M.f6808i);
            this.f20773o = fileWriter;
            fileWriter.write(sb.toString());
            this.f20773o.flush();
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f20743a.m17251b()).mo17283h(e)).mo17276G((char) 2041)).mo17290o("undo image exception:");
        }
        int i4 = this.f20772n;
        if (i4 == 0) {
            this.f20779u = false;
        } else {
            i2 = i4;
        }
        this.f20750G = true;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m8006d(bnq bnqVar) {
        bnqVar.mo2732q(this.f20751H, this.f20759P, this.f20757N, this.f20758O);
        mrm mrmVarMo8117c = this.f20755L.mo8117c();
        List list = this.f20746C;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Location location = (Location) mrmVarMo8117c.mo16812f();
        eyi eyiVar = this.f20765g;
        float[] fArr = new float[16];
        inh inhVar = eyiVar.f20966c;
        SensorManager.getRotationMatrix(fArr, null, new float[]{inhVar.f31591a, inhVar.f31592b, inhVar.f31593c}, eyiVar.f20968e);
        float[] fArr2 = new float[16];
        SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
        float[] fArr3 = new float[3];
        SensorManager.getOrientation(fArr2, fArr3);
        double d = fArr3[0] * 180.0f;
        Double.isNaN(d);
        list.add(new eys(jCurrentTimeMillis, location, (int) (d / 3.141592653589793d)));
        this.f20750G = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m8007e() {
        float[] fArrGetFrameGeometry;
        synchronized (exh.f20734a) {
            if (!exh.f20735b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            fArrGetFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
        }
        exs exsVar = this.f20760b.f20838b;
        exsVar.f20868f = 6;
        exsVar.f20697a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        exsVar.f20698b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i = exsVar.f20868f;
        exsVar.f20699c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        exsVar.f20871i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3++) {
            exsVar.f20697a.put(i3, fArrGetFrameGeometry[i3]);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < 2; i6++) {
                exsVar.f20698b.put(i4, i6);
                exsVar.f20698b.put(i4 + 1, i5);
                i4 += 2;
            }
        }
        int i7 = 0;
        for (char c = 0; c <= 0; c = 1) {
            int i8 = 0;
            int i9 = 2;
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                int i10 = i7 + 1;
                short s = (short) i8;
                exsVar.f20699c.put(i7, s);
                int i11 = i10 + 1;
                int i12 = i9 + 1;
                short s2 = (short) i12;
                exsVar.f20699c.put(i10, s2);
                int i13 = i11 + 1;
                exsVar.f20699c.put(i11, (short) i9);
                int i14 = i13 + 1;
                exsVar.f20699c.put(i13, s);
                int i15 = i14 + 1;
                i8++;
                exsVar.f20699c.put(i14, (short) i8);
                i7 = i15 + 1;
                exsVar.f20699c.put(i15, s2);
                i9 = i12;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < 2) {
            exsVar.f20871i.put(i17, (short) i16);
            i16++;
            i17++;
        }
        while (i2 < 2) {
            exsVar.f20871i.put(i17, (short) (i2 + i2 + 1));
            i2++;
            i17++;
        }
        int i18 = 1;
        while (i18 >= 0) {
            exsVar.f20871i.put(i17, (short) (i18 + 2));
            i18--;
            i17++;
        }
        int i19 = 1;
        while (i19 >= 0) {
            exsVar.f20871i.put(i17, (short) (i19 + i19));
            i19--;
            i17++;
        }
        exsVar.f20869g = i17 - 1;
        exsVar.f20870h = true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011e A[Catch: all -> 0x01aa, IOException -> 0x01ad, TryCatch #8 {IOException -> 0x01ad, all -> 0x01aa, blocks: (B:29:0x009f, B:31:0x011e, B:33:0x0128), top: B:75:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x01a2 A[LOOP:0: B:30:0x011c->B:35:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0128 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:52:0x01c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: f */
    public final synchronized void m8008f() {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.exm.m8008f():void");
    }

    /* JADX INFO: renamed from: g */
    public final void m8009g() {
        this.f20754K = this.f20761c.f20688b.mo2717b().getHorizontalViewAngle();
    }

    /* JADX INFO: renamed from: h */
    public final void m8010h(int i) {
        String str = this.f20756M.f6804e;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                exh.m8001b(str, m8003a());
                break;
            case 1:
                float fM8003a = m8003a();
                synchronized (exh.f20734a) {
                    LightCycleNative.ResetForHorizontalCapture(str, fM8003a);
                    exh.f20735b = true;
                    break;
                }
                break;
            case 2:
                float fM8003a2 = m8003a();
                synchronized (exh.f20734a) {
                    LightCycleNative.ResetForVerticalCapture(str, fM8003a2);
                    exh.f20735b = true;
                    break;
                }
                break;
            case 3:
                float fM8003a3 = m8003a();
                synchronized (exh.f20734a) {
                    LightCycleNative.ResetForWideCapture(str, fM8003a3);
                    exh.f20735b = true;
                    break;
                }
                break;
            case 4:
                float fM8003a4 = m8003a();
                synchronized (exh.f20734a) {
                    LightCycleNative.ResetForFisheyeCapture(str, fM8003a4);
                    exh.f20735b = true;
                    break;
                }
                break;
            default:
                exh.m8001b(str, m8003a());
                break;
        }
        exp expVar = this.f20760b;
        expVar.f20840d.m8034d();
        expVar.f20841e.m4201a();
        if (i == 6) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            exp expVar2 = this.f20760b;
            expVar2.f20840d.m8033b(fArr);
            if (expVar2.f20850n && expVar2.f20794G == 1) {
                expVar2.f20841e.m4203c(expVar2.f20860x);
            }
            expVar2.f20857u = true;
        }
        this.f20779u = false;
        this.f20772n = 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
