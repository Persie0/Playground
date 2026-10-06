package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Arrays;

/* JADX INFO: renamed from: th */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1011th implements InterfaceC1012ti {

    /* JADX INFO: renamed from: a */
    private final Context f47669a;

    /* JADX INFO: renamed from: b */
    private final ArrayMap f47670b;

    /* JADX INFO: renamed from: c */
    private final lha f47671c;

    /* JADX INFO: renamed from: d */
    private final drj f47672d;

    /* JADX INFO: renamed from: e */
    private final bkn f47673e;

    public C1011th(Context context, drj drjVar, lha lhaVar, bkn bknVar, C0846ne c0846ne, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        drjVar.getClass();
        lhaVar.getClass();
        c0846ne.getClass();
        this.f47669a = context;
        this.f47672d = drjVar;
        this.f47671c = lhaVar;
        this.f47673e = bknVar;
        this.f47670b = new ArrayMap();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: c */
    private final C1005tb m19446c(String str, boolean z) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection("Camera-" + str + "#readCameraMetadata");
            try {
                Object systemService = this.f47669a.getSystemService("camera");
                systemService.getClass();
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                C1005tb c1005tb = new C1005tb(str, cameraCharacteristics, this.f47673e.f3651a);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                String str2 = !z ? "" : " (redacted)";
                StringBuilder sb = new StringBuilder();
                sb.append("Loaded metadata for ");
                sb.append((Object) C0952rc.m19373b(str));
                sb.append(" in ");
                String str3 = "%.3f ms";
                Object[] objArr = new Object[1];
                double d = jElapsedRealtimeNanos2;
                Double.isNaN(d);
                objArr[0] = Double.valueOf(d / 1000000.0d);
                String str4 = String.format(null, str3, Arrays.copyOf(objArr, 1));
                str4.getClass();
                sb.append(str4);
                sb.append(str2);
                Trace.endSection();
                return c1005tb;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load metadata for " + ((Object) C0952rc.m19373b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0953rd m19447a(String str) {
        InterfaceC0953rd interfaceC0953rdM19446c;
        str.getClass();
        try {
            Trace.beginSection("Camera-" + str + "#awaitMetadata");
            synchronized (this.f47670b) {
                interfaceC0953rdM19446c = (InterfaceC0953rd) this.f47670b.get(str);
                if (interfaceC0953rdM19446c == null) {
                    if (this.f47671c.m15330b()) {
                        interfaceC0953rdM19446c = m19446c(str, false);
                        this.f47670b.put(str, interfaceC0953rdM19446c);
                    } else {
                        interfaceC0953rdM19446c = m19446c(str, true);
                    }
                }
            }
            Trace.endSection();
            return interfaceC0953rdM19446c;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oly] */
    @Override // p000.InterfaceC1012ti
    /* JADX INFO: renamed from: b */
    public final Object mo19448b(String str, ols olsVar) {
        synchronized (this.f47670b) {
            InterfaceC0953rd interfaceC0953rd = (InterfaceC0953rd) this.f47670b.get(str);
            return interfaceC0953rd != null ? interfaceC0953rd : ook.m18774L(this.f47672d.f12396b, new C1010tg(this, str, null), olsVar);
        }
    }
}
