package p000;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.WindowManager;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.image.ImageUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p021j$.time.Duration;
import p021j$.util.Collection$EL;
import p021j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwd {

    /* JADX INFO: renamed from: a */
    public final Object f9866a;

    public cwd() {
        this.f9866a = new HashMap();
    }

    public cwd(Context context) {
        this.f9866a = context;
    }

    public cwd(Context context, byte[] bArr) {
        this.f9866a = context;
    }

    public cwd(AudioManager audioManager) {
        this.f9866a = audioManager;
    }

    public cwd(DisplayMetrics displayMetrics) {
        this.f9866a = displayMetrics;
    }

    public cwd(crn crnVar) {
        this.f9866a = crnVar;
    }

    public cwd(cwd cwdVar, byte[] bArr) {
        this.f9866a = cwdVar;
    }

    public cwd(dhv dhvVar) {
        this.f9866a = dhvVar;
    }

    public cwd(fcp fcpVar) {
        this.f9866a = fcpVar;
    }

    public cwd(hht hhtVar) {
        this.f9866a = hhtVar;
    }

    public cwd(String str) {
        this.f9866a = str;
    }

    public cwd(jww jwwVar) {
        this.f9866a = jwwVar;
    }

    public cwd(kmd kmdVar) {
        EnumMap enumMap = new EnumMap(cxk.class);
        this.f9866a = enumMap;
        DesugarArrays.stream(cxk.values()).forEach(new cwu(this, kmdVar, 0, null, null, null, null));
        enumMap.put(cxk.LOCKED, Float.valueOf(2.0f));
    }

    public cwd(ohb ohbVar) {
        this.f9866a = ohbVar;
    }

    public cwd(byte[] bArr) {
        this.f9866a = new int[2];
    }

    public cwd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9866a = new ArrayList();
    }

    public cwd(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.f9866a = new jwf(1);
    }

    public cwd(byte[] bArr, char[] cArr) {
        this.f9866a = new AtomicBoolean(false);
    }

    public cwd(short[] sArr) {
        this.f9866a = new LruCache(20);
    }

    /* JADX INFO: renamed from: A */
    public static oju m5637A(oju ojuVar) {
        return new doy(ojuVar, 3);
    }

    /* JADX INFO: renamed from: D */
    public static final nix m5638D(ntz ntzVar) {
        nxl nxlVarM18137O = nix.f42818h.m18137O();
        int i = ntzVar.f44601a;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nix nixVar = (nix) nxqVar;
        nixVar.f42820a |= 1;
        nixVar.f42821b = i;
        int i2 = ntzVar.f44602b;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nix nixVar2 = (nix) nxqVar2;
        nixVar2.f42820a |= 2;
        nixVar2.f42822c = i2;
        int i3 = ntzVar.f44603c;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nix nixVar3 = (nix) nxqVar3;
        nixVar3.f42820a |= 4;
        nixVar3.f42823d = i3;
        int i4 = ntzVar.f44604d;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        nix nixVar4 = (nix) nxqVar4;
        nixVar4.f42820a |= 8;
        nixVar4.f42824e = i4;
        int i5 = ntzVar.f44605e;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        nix nixVar5 = (nix) nxqVar5;
        nixVar5.f42820a |= 16;
        nixVar5.f42825f = i5;
        int i6 = ntzVar.f44606f;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nix nixVar6 = (nix) nxlVarM18137O.f44974b;
        nixVar6.f42820a |= 32;
        nixVar6.f42826g = i6;
        return (nix) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: H */
    public static Object m5639H(Context context, String str) {
        Object systemService = context.getSystemService(str);
        systemService.getClass();
        return systemService;
    }

    /* JADX INFO: renamed from: N */
    public static cwd m5640N(ohb ohbVar) {
        return new cwd(ohbVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m5641c(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String.valueOf(audioDeviceInfo.getProductName());
            audioDeviceInfo.getType();
            audioDeviceInfo.getId();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final nkb m5642l(deb debVar) {
        int i;
        nxl nxlVarM18137O = nkb.f43161e.m18137O();
        int i2 = 12;
        int i3 = 3;
        switch (debVar.f10637g) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 8:
                i = 5;
                break;
            case 16:
                i = 6;
                break;
            case 32:
                i = 7;
                break;
            case 64:
                i = 8;
                break;
            case 128:
                i = 9;
                break;
            case 256:
                i = 10;
                break;
            case 512:
                i = 11;
                break;
            case 1024:
                i = 12;
                break;
            case 2048:
                i = 13;
                break;
            case 4096:
                i = 14;
                break;
            case 32768:
                i = 16;
                break;
            default:
                i = 1;
                break;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nkb nkbVar = (nkb) nxqVar;
        nkbVar.f43166d = i - 1;
        nkbVar.f43163a |= 4;
        switch (debVar.f10636f) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                break;
            case 12:
                i2 = 13;
                break;
            case 13:
                i2 = 14;
                break;
            default:
                i2 = 1;
                break;
        }
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nkb nkbVar2 = (nkb) nxqVar2;
        nkbVar2.f43165c = i2 - 1;
        nkbVar2.f43163a |= 2;
        int i4 = debVar.f10642l;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i5) {
            case 1:
                i3 = 2;
                break;
            case 2:
                break;
            default:
                i3 = 1;
                break;
        }
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkb nkbVar3 = (nkb) nxlVarM18137O.f44974b;
        nkbVar3.f43164b = i3 - 1;
        nkbVar3.f43163a |= 1;
        return (nkb) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m5643y(String str, int i, int i2) {
        Matcher matcher = Pattern.compile("^([0-9]+)\\.([0-9]+).*").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        int i3 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return i3 > i || (i3 == i && Integer.parseInt(strGroup2) >= i2);
    }

    /* JADX INFO: renamed from: z */
    public static oju m5644z(oju ojuVar) {
        return new doy(ojuVar, 4);
    }

    /* JADX INFO: renamed from: B */
    public final oju m5645B(final oju ojuVar) {
        final byte[] bArr = null;
        return new oju(ojuVar, bArr, bArr) { // from class: esa

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ oju f15299a;

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ohb] */
            @Override // p000.oju
            public final Object get() {
                cwd cwdVar = this.f15300b;
                return (Set) Collection$EL.stream(((ohm) this.f15299a).get()).map(new cwp((ckp) cwdVar.f9866a.get(), 11)).collect(muc.f41627b);
            }
        };
    }

    /* JADX INFO: renamed from: C */
    public final nkr m5646C() {
        return (nkr) ((nxl) this.f9866a).mo18103l();
    }

    /* JADX INFO: renamed from: E */
    public final KeyguardManager m5647E() {
        return (KeyguardManager) m5639H((Context) this.f9866a, "keyguard");
    }

    /* JADX INFO: renamed from: F */
    public final DevicePolicyManager m5648F() {
        return (DevicePolicyManager) m5639H((Context) this.f9866a, "device_policy");
    }

    /* JADX INFO: renamed from: G */
    public final SensorManager m5649G() {
        return (SensorManager) m5639H((Context) this.f9866a, "sensor");
    }

    /* JADX INFO: renamed from: I */
    public final WindowManager m5650I() {
        return (WindowManager) m5639H((Context) this.f9866a, "window");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ohb] */
    /* JADX INFO: renamed from: J */
    public final Object m5651J() {
        return ((mrm) this.f9866a.get()).mo16809c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ohb] */
    /* JADX INFO: renamed from: K */
    public final boolean m5652K() {
        return ((mrm) this.f9866a.get()).mo16813g();
    }

    /* JADX INFO: renamed from: L */
    public final void m5653L(float[] fArr) {
        System.arraycopy(fArr, 0, ((elb) this.f9866a).f14543e, 0, 16);
        GLES20.glClear(16384);
        elb elbVar = (elb) this.f9866a;
        Texture texture = elbVar.f14541c;
        if (texture == null) {
            return;
        }
        if (elbVar.f14544f == null) {
            elbVar.f14544f = new luq("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}" : "precision mediump float;uniform sampler2D texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}");
            elbVar.f14545g = elbVar.f14544f.m16025d("texture");
            elbVar.f14546h = elbVar.f14544f.m16025d("vertexTransform");
            elbVar.f14547i = elbVar.f14544f.m16025d("textureTransform");
            elbVar.f14548j = elbVar.f14544f.m16026e("vertexAttrib");
            elbVar.f14549k = elbVar.f14544f.m16026e("texCoordAttrib");
        }
        elbVar.f14544f.m16022a();
        elbVar.f14548j.m19201e();
        elbVar.f14548j.m19202f(elb.f14539a, 2);
        elbVar.f14549k.m19201e();
        elbVar.f14549k.m19202f(elb.f14540b, 2);
        elbVar.f14545g.m19199c(elbVar.f14541c);
        elbVar.f14546h.m19197a(elbVar.f14542d);
        elbVar.f14547i.m19197a(elbVar.f14543e);
        GLES20.glDrawArrays(5, 0, elb.f14539a.capacity() / 2);
        elbVar.f14549k.m19200d();
        elbVar.f14548j.m19200d();
        elbVar.f14544f.m16024c();
        elbVar.f14541c.unbind();
    }

    /* JADX INFO: renamed from: M */
    public final Bitmap m5654M(InterleavedImageU8 interleavedImageU8) {
        nrx nrxVar = nrx.f44313f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) this.f9866a, interleavedImageU8.m5004c(), interleavedImageU8.m5003b(), Bitmap.Config.ARGB_8888);
        nrs nrsVarM17633a = nrs.m17633a(bitmapCreateBitmap);
        try {
            InterleavedReadViewU8 interleavedReadViewU8M5005e = interleavedImageU8.m5005e();
            InterleavedWriteViewU8 interleavedWriteViewU8 = nrsVarM17633a.f44286a;
            long j = interleavedReadViewU8M5005e.f8300a;
            long jM5019a = InterleavedWriteViewU8.m5019a(interleavedWriteViewU8);
            lku.m15670x(j != 0, "src is null");
            lku.m15670x(jM5019a != 0, "dst is null");
            ImageUtils.simpleRgbToAnyRgbImpl(j, nrxVar.f44321l, jM5019a);
            nrsVarM17633a.close();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            try {
                nrsVarM17633a.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod(gBCSQzBeB.maWcLbaxhr, Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AudioDeviceInfo m5655a() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f9866a).getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                m5641c(audioDeviceInfo);
                return audioDeviceInfo;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final AudioDeviceInfo m5656b() {
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo audioDeviceInfo2 = null;
        for (AudioDeviceInfo audioDeviceInfo3 : ((AudioManager) this.f9866a).getDevices(1)) {
            if (audioDeviceInfo3.getType() == 11 || audioDeviceInfo3.getType() == 22) {
                m5641c(audioDeviceInfo3);
                if (audioDeviceInfo == null) {
                    audioDeviceInfo = audioDeviceInfo3;
                }
            }
            if (audioDeviceInfo3.getType() == 3) {
                m5641c(audioDeviceInfo3);
                if (audioDeviceInfo2 == null) {
                    audioDeviceInfo2 = audioDeviceInfo3;
                }
            }
        }
        return audioDeviceInfo != null ? audioDeviceInfo : audioDeviceInfo2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final jvb m5657d(cum cumVar) {
        if (this.f9866a.containsKey(cumVar)) {
            return (jvb) this.f9866a.get(cumVar);
        }
        jvb jvbVar = new jvb();
        this.f9866a.put(cumVar, jvbVar);
        return jvbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final void m5658e(cum cumVar) {
        jvb jvbVar = (jvb) this.f9866a.remove(cumVar);
        if (jvbVar != null) {
            jvbVar.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m5659f(int i) {
        return ((int[]) this.f9866a)[i - 1];
    }

    /* JADX INFO: renamed from: g */
    public final void m5660g(int i) {
        int[] iArr = (int[]) this.f9866a;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: h */
    public final void m5661h() {
        synchronized (this.f9866a) {
            for (dsx dsxVar : this.f9866a) {
                dsxVar.f12521a.mo3415bf(dsxVar.f12522b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    public final void m5662i(jww jwwVar) {
        synchronized (this.f9866a) {
            this.f9866a.add(new dsx(jwwVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public final String m5663j(String str) {
        return (String) this.f9866a.get("camera:".concat(str));
    }

    /* JADX INFO: renamed from: k */
    public final mrm m5664k(luz luzVar) {
        if (!((LruCache) this.f9866a).snapshot().containsKey(luzVar.mo16040c().f39376a)) {
            ((LruCache) this.f9866a).put(luzVar.mo16040c().f39376a, UUID.randomUUID());
        }
        UUID uuid = (UUID) ((LruCache) this.f9866a).get(luzVar.mo16040c().f39376a);
        return uuid == null ? mqu.f41450a : mrm.m16829i(Long.valueOf(uuid.getMostSignificantBits()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final int m5665m() {
        return ((Integer) this.f9866a.mo6173a(dib.f11222I).get()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final int m5666n() {
        return ((Integer) this.f9866a.mo6173a(dib.f11221H).get()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public final int m5667o() {
        return ((Integer) this.f9866a.mo6173a(dib.f11224K).get()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final int m5668p() {
        return ((Integer) this.f9866a.mo6173a(dib.f11223J).get()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: q */
    public final long m5669q() {
        return Duration.ofMillis(Math.max(((Integer) this.f9866a.mo6173a(dib.f11220G).get()).intValue(), ((Integer) this.f9866a.mo6173a(dib.f11219F).get()).intValue())).toNanos();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final String m5670r() {
        String strMo6182j = this.f9866a.mo6182j(dib.f11301bH);
        strMo6182j.getClass();
        return strMo6182j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: s */
    public final boolean m5671s() {
        return this.f9866a.mo6184l(dib.f11299bF);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: t */
    public final boolean m5672t() {
        ?? r0 = this.f9866a;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
        return this.f9866a.mo6184l(dib.f11300bG);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: u */
    public final float m5673u() {
        return 1.0f / ((Float) this.f9866a.get(cxk.ACTIVE)).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: v */
    public final float m5674v(cxk cxkVar) {
        Float f = (Float) this.f9866a.get(cxkVar);
        f.getClass();
        return f.floatValue();
    }

    /* JADX INFO: renamed from: w */
    public final String m5675w(String str) {
        try {
            return ((Context) this.f9866a).getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m5676x() {
        return m5675w("com.google.vr.apps.ornament");
    }

    public cwd(ContentResolver contentResolver) {
        this.f9866a = jum.m13515d(contentResolver, new String[]{"camera:"}, new juk(1));
    }

    public cwd(Texture texture, int i) {
        elb elbVar = new elb();
        this.f9866a = elbVar;
        elbVar.f14541c = texture;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, 1.0f);
        System.arraycopy(fArr, 0, elbVar.f14542d, 0, 16);
    }

    public cwd(byte[] bArr, byte[] bArr2) {
        this.f9866a = new ArrayList();
    }

    public cwd(char[] cArr) {
        this.f9866a = new ArrayList();
    }

    public cwd(oju ojuVar, byte[] bArr) {
        ojuVar.getClass();
        this.f9866a = ojuVar;
    }

    public cwd(oju ojuVar) {
        ojuVar.getClass();
        this.f9866a = ojuVar;
    }

    public cwd(int[] iArr) {
        this.f9866a = nkr.f43268x.m18137O();
    }
}
