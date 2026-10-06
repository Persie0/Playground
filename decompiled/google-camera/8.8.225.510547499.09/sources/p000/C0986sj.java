package p000;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.Arrays;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0986sj extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final String f47585a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0953rd f47587c;

    /* JADX INFO: renamed from: d */
    private final int f47588d;

    /* JADX INFO: renamed from: e */
    private final long f47589e;

    /* JADX INFO: renamed from: h */
    private boolean f47592h;

    /* JADX INFO: renamed from: i */
    private C0984sh f47593i;

    /* JADX INFO: renamed from: j */
    private final long f47594j;

    /* JADX INFO: renamed from: k */
    private C1069vl f47595k;

    /* JADX INFO: renamed from: f */
    private final int f47590f = C1042ul.f47752b.m18846b();

    /* JADX INFO: renamed from: g */
    private final Object f47591g = new Object();

    /* JADX INFO: renamed from: b */
    public final ovm f47586b = ovw.m19110a(C1022ts.f47695a);

    public C0986sj(String str, InterfaceC0953rd interfaceC0953rd, int i, long j) {
        this.f47585a = str;
        this.f47587c = interfaceC0953rd;
        this.f47588d = i;
        this.f47589e = j;
        StringBuilder sb = new StringBuilder();
        sb.append("Opening ");
        sb.append((Object) C0952rc.m19373b(str));
        this.f47594j = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    /* JADX INFO: renamed from: c */
    private final C1017tn m19396c(C0984sh c0984sh) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C1069vl c1069vl = this.f47595k;
        long j = c0984sh.f47580a;
        C1068vk c1068vkM19503a = c1069vl != null ? C1068vk.m19503a(c1069vl.f47850a - this.f47589e) : null;
        C1068vk c1068vkM19503a2 = c1069vl != null ? C1068vk.m19503a(c1069vl.f47850a - this.f47594j) : null;
        C1068vk c1068vkM19503a3 = c1069vl == null ? null : C1068vk.m19503a(j - c1069vl.f47850a);
        long j2 = jElapsedRealtimeNanos - j;
        return new C1017tn(this.f47585a, c0984sh.f47583d, Integer.valueOf(this.f47588d - 1), c1068vkM19503a, c0984sh.f47582c, c1068vkM19503a2, c1068vkM19503a3, C1068vk.m19503a(j2), c0984sh.f47581b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m19397a() {
        C0748jo c0748jo = (C0748jo) this.f47586b.mo19086c();
        C0947qy c0947qy = null;
        Object[] objArr = 0;
        InterfaceC1016tm interfaceC1016tm = c0748jo instanceof C1019tp ? ((C1019tp) c0748jo).f47686a : null;
        m19398b((CameraDevice) (interfaceC1016tm != null ? interfaceC1016tm.mo13866e(ooj.m18762a(CameraDevice.class)) : null), new C0984sh(1, c0947qy, objArr == true ? 1 : 0, 14));
    }

    /* JADX INFO: renamed from: b */
    public final void m19398b(CameraDevice cameraDevice, C0984sh c0984sh) {
        C0748jo c0748jo = (C0748jo) this.f47586b.mo19086c();
        InterfaceC1016tm interfaceC1016tm = c0748jo instanceof C1019tp ? ((C1019tp) c0748jo).f47686a : null;
        synchronized (this.f47591g) {
            if (this.f47593i == null) {
                this.f47593i = c0984sh;
                if (this.f47592h) {
                    c0984sh = null;
                }
            } else {
                c0984sh = null;
            }
        }
        if (c0984sh != null) {
            this.f47586b.mo19087d(new C1018to(c0984sh.f47581b));
            if (interfaceC1016tm != null) {
                C0746jm.m13348c((CameraDevice) interfaceC1016tm.mo13866e(ooj.m18762a(CameraDevice.class)));
                InterfaceC1014tk interfaceC1014tk = (InterfaceC1014tk) ((C0983sg) interfaceC1016tm).f47579d.m18853a(null);
                if (interfaceC1014tk != null) {
                    interfaceC1014tk.mo19449a();
                }
            }
            C0746jm.m13348c(cameraDevice);
            this.f47586b.mo19087d(m19396c(c0984sh));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!ooc.m18737c(cameraDevice.getId(), this.f47585a)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection("Camera-" + this.f47585a + "#onClosed");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) C0952rc.m19373b(this.f47585a));
        sb.append(": onClosed");
        m19398b(cameraDevice, new C0984sh(3, null, 0 == true ? 1 : 0, 14));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!ooc.m18737c(cameraDevice.getId(), this.f47585a)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection("Camera-" + this.f47585a + "#onDisconnected");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) C0952rc.m19373b(this.f47585a));
        sb.append(xRFdVyfdeve.vShQCiQYkFUR);
        m19398b(cameraDevice, new C0984sh(4, C0947qy.m19364a(6), null, 10));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        int i2;
        cameraDevice.getClass();
        if (!ooc.m18737c(cameraDevice.getId(), this.f47585a)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection("Camera-" + this.f47585a + "#onError-" + i);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) C0952rc.m19373b(this.f47585a));
        sb.append(": onError ");
        sb.append(i);
        int i3 = 5;
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            default:
                throw new IllegalArgumentException("Unexpected StateCallback error code:" + i);
        }
        m19398b(cameraDevice, new C0984sh(i3, C0947qy.m19364a(i2), null, 10));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        C0984sh c0984sh;
        cameraDevice.getClass();
        if (!ooc.m18737c(cameraDevice.getId(), this.f47585a)) {
            throw new IllegalStateException("Check failed.");
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f47595k = C1069vl.m19504a(jElapsedRealtimeNanos);
        Trace.beginSection("Camera-" + this.f47585a + "#onOpened");
        long j = jElapsedRealtimeNanos - this.f47594j;
        long j2 = jElapsedRealtimeNanos - this.f47589e;
        boolean z = true;
        if (this.f47588d == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Opened ");
            sb.append((Object) C0952rc.m19373b(this.f47585a));
            sb.append(" in ");
            double d = j;
            Double.isNaN(d);
            String str = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1));
            str.getClass();
            sb.append(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Opened ");
            sb2.append((Object) C0952rc.m19373b(this.f47585a));
            sb2.append(" in ");
            double d2 = j;
            Double.isNaN(d2);
            String str2 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000000.0d)}, 1));
            str2.getClass();
            sb2.append(str2);
            sb2.append(" (");
            double d3 = j2;
            Double.isNaN(d3);
            String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d3 / 1000000.0d)}, 1));
            str3.getClass();
            sb2.append(str3);
            sb2.append(" total) after ");
            sb2.append(this.f47588d);
            sb2.append(" attempts.");
        }
        synchronized (this.f47591g) {
            if (this.f47593i == null) {
                this.f47592h = true;
                z = false;
            }
        }
        if (z) {
            cameraDevice.close();
            return;
        }
        this.f47586b.mo19087d(new C1019tp(new C0983sg(this.f47587c, cameraDevice, this.f47585a)));
        synchronized (this.f47591g) {
            this.f47592h = false;
            c0984sh = this.f47593i;
        }
        if (c0984sh != null) {
            this.f47586b.mo19087d(new C1018to(c0984sh.f47581b));
            C0746jm.m13348c(cameraDevice);
            this.f47586b.mo19087d(m19396c(c0984sh));
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.f47590f;
    }
}
