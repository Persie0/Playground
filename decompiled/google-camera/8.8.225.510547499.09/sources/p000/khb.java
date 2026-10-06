package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.hardware.HardwareBuffer;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khb {

    /* JADX INFO: renamed from: a */
    public final Object f36008a;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public khb() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.f36008a = new HashMap();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (supportedTypes.length <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                } else {
                    for (String str : supportedTypes) {
                        if (!this.f36008a.containsKey(str)) {
                            this.f36008a.put(str, mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }

    public khb(Context context) {
        this.f36008a = context;
    }

    public khb(HardwareBuffer hardwareBuffer) {
        this.f36008a = hardwareBuffer;
    }

    public khb(Object obj) {
        this.f36008a = obj;
    }

    public khb(jvd jvdVar) {
        this.f36008a = jvdVar;
    }

    public khb(kfn kfnVar) {
        this.f36008a = kfnVar;
    }

    public khb(koo kooVar) {
        this.f36008a = kooVar;
    }

    public khb(lej lejVar) {
        this.f36008a = lejVar;
    }

    public khb(oju ojuVar) {
        this.f36008a = ojuVar;
    }

    public khb(byte[] bArr) {
        this.f36008a = new HashMap();
    }

    public khb(byte[] bArr, byte[] bArr2) {
        this.f36008a = new jpt();
    }

    public khb(byte[] bArr, char[] cArr) {
        this.f36008a = new TreeMap();
    }

    public khb(char[] cArr) throws Throwable {
        Method method = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
            try {
                try {
                    cls.getMethod("set", String.class, String.class);
                    cls.getMethod("getInt", String.class, Integer.TYPE);
                    cls.getMethod("getLong", String.class, Long.TYPE);
                    this.f36008a = method;
                } catch (Exception e) {
                    e = e;
                    throw new IllegalStateException("Unable to reflect SystemProperties.", e);
                }
            } catch (Throwable th) {
                th = th;
                this.f36008a = method;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            this.f36008a = method;
            throw th;
        }
    }

    public khb(char[] cArr, byte[] bArr) {
        this.f36008a = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static void m14233e(Throwable th) {
        new khb(new jvd()).m14240f(th);
    }

    /* JADX INFO: renamed from: x */
    public static khb m14234x() {
        return new khb((Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: y */
    private final synchronized java.lang.Object m14235y(p000.kgg r12, p000.kar r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L49
            java.lang.Object r2 = r13.mo13886a()     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            amx r4 = p000.amx.f753q     // Catch: java.lang.Throwable -> L91
            java.util.Collections.sort(r3, r4)     // Catch: java.lang.Throwable -> L91
            r3 = 1
        L11:
            if (r2 != 0) goto L47
            if (r3 == 0) goto L47
            java.lang.Object r3 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L91
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L91
            r4 = 0
            r5 = 0
        L1f:
            if (r5 >= r3) goto L45
            java.lang.Object r6 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L91
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L91
            kgs r6 = (p000.kgs) r6     // Catch: java.lang.Throwable -> L91
            kho r7 = r6.f35958h     // Catch: java.lang.Throwable -> L91
            mxk r7 = r7.f36067c     // Catch: java.lang.Throwable -> L91
            boolean r7 = r7.contains(r12)     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L42
            boolean r6 = r6.m14222t()     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L42
            java.lang.Object r2 = r13.mo13886a()     // Catch: java.lang.Throwable -> L91
            if (r2 != 0) goto L47
            r4 = 1
        L42:
            int r5 = r5 + 1
            goto L1f
        L45:
            r3 = r4
            goto L11
        L47:
            monitor-exit(r11)
            return r2
        L49:
            java.lang.Object r12 = r13.mo13886a()     // Catch: java.lang.Throwable -> L91
            r2 = 1
        L4f:
            if (r12 != 0) goto L8f
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            ye r3 = p000.C1143ye.f48119c     // Catch: java.lang.Throwable -> L91
            java.util.Collections.sort(r2, r3)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L91
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L91
            r3 = 0
            r4 = 0
        L64:
            if (r4 >= r2) goto L8d
            java.lang.Object r5 = r11.f36008a     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L91
            kgs r5 = (p000.kgs) r5     // Catch: java.lang.Throwable -> L91
            long r6 = r5.m14220r()     // Catch: java.lang.Throwable -> L91
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L8a
            boolean r5 = r5.m14222t()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L8a
            java.lang.Object r12 = r13.mo13886a()     // Catch: java.lang.Throwable -> L91
            if (r12 != 0) goto L88
            r3 = 1
            goto L8a
        L88:
            monitor-exit(r11)
            return r12
        L8a:
            int r4 = r4 + 1
            goto L64
        L8d:
            r2 = r3
            goto L4f
        L8f:
            monitor-exit(r11)
            return r12
        L91:
            r12 = move-exception
            monitor-exit(r11)
            goto L95
        L94:
            throw r12
        L95:
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.khb.m14235y(kgg, kar):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final int m14236a() {
        return ((lej) this.f36008a).f38033b;
    }

    /* JADX INFO: renamed from: b */
    public final long m14237b() {
        return ((lej) this.f36008a).f38034c;
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m14238c() {
        return ((lej) this.f36008a).f38032a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final boolean m14239d() {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.f36008a.get("video/hevc");
        return mediaCodecInfo != null && mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: f */
    public final void m14240f(Throwable th) {
        ((jvd) this.f36008a).execute(new juz(th, 6));
    }

    /* JADX INFO: renamed from: h */
    public final void m14242h(Exception exc) {
        ((jpt) this.f36008a).m13462n(exc);
    }

    /* JADX INFO: renamed from: i */
    public final void m14243i(Object obj) {
        ((jpt) this.f36008a).m13463o(obj);
    }

    /* JADX INFO: renamed from: j */
    public final void m14244j(Exception exc) {
        Object obj = this.f36008a;
        jib.m13206k(exc, "Exception must not be null");
        jpt jptVar = (jpt) obj;
        synchronized (jptVar.f34563a) {
            if (((jpt) obj).f34564b) {
                return;
            }
            ((jpt) obj).f34564b = true;
            ((jpt) obj).f34567e = exc;
            jptVar.f34568f.m16722e((jpp) obj);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m14245k(Object obj) {
        Object obj2 = this.f36008a;
        jpt jptVar = (jpt) obj2;
        synchronized (jptVar.f34563a) {
            if (((jpt) obj2).f34564b) {
                return;
            }
            ((jpt) obj2).f34564b = true;
            ((jpt) obj2).f34566d = obj;
            jptVar.f34568f.m16722e((jpp) obj2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m14246l(String str) {
        return ((Context) this.f36008a).checkCallingOrSelfPermission(str);
    }

    /* JADX INFO: renamed from: m */
    public final ApplicationInfo m14247m(String str, int i) {
        return ((Context) this.f36008a).getPackageManager().getApplicationInfo(str, i);
    }

    /* JADX INFO: renamed from: n */
    public final PackageInfo m14248n(String str, int i) {
        return ((Context) this.f36008a).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: o */
    public final String m14249o(String str) {
        try {
            Object obj = this.f36008a;
            if (obj == null) {
                return null;
            }
            String str2 = (String) ((Method) obj).invoke(null, str, null);
            if ("".equals(str2)) {
                return null;
            }
            return str2;
        } catch (Exception e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14250p() {
        ((HardwareBuffer) this.f36008a).close();
    }

    /* JADX INFO: renamed from: q */
    public final void m14251q(byte[] bArr, int i, int i2, int i3) {
        ReadHardwareBufferJniFunctions.readHardwareBuffer((HardwareBuffer) this.f36008a, bArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: r */
    public final kba m14252r() {
        return ((AmbientDelegate) this.f36008a).m1593Y();
    }

    /* JADX INFO: renamed from: s */
    public final synchronized Object m14253s(kar karVar) {
        return m14235y(null, karVar);
    }

    /* JADX INFO: renamed from: t */
    public final synchronized Object m14254t(kgg kggVar, kar karVar) {
        return m14235y(kggVar, karVar);
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m14255u(kgs kgsVar) {
        ((ArrayList) this.f36008a).add(kgsVar);
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m14256v(kgs kgsVar) {
        ((ArrayList) this.f36008a).remove(kgsVar);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m14257w(kgg kggVar) {
        m14235y(kggVar, new kar() { // from class: khs
            @Override // p000.kar
            /* JADX INFO: renamed from: a */
            public final Object mo13886a() {
                return null;
            }
        });
    }

    public khb(int i) {
        this.f36008a = AmbientDelegate.m1572ad(new knx(i));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: g */
    public final void m14241g(IBinder iBinder) {
        jtd jtdVar;
        synchronized (this.f36008a) {
            if (iBinder == null) {
                jtdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                jtdVar = iInterfaceQueryLocalInterface instanceof jtd ? (jtd) iInterfaceQueryLocalInterface : new jtd(iBinder);
            }
            jud judVar = new jud();
            for (Map.Entry entry : this.f36008a.entrySet()) {
                jug jugVar = (jug) entry.getValue();
                try {
                    jtdVar.m13501e(judVar, new jre(jugVar));
                } catch (RemoteException e) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(jugVar));
                }
            }
        }
    }
}
