package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bzq {
    public bzq() {
    }

    public bzq(byte[] bArr) {
    }

    public bzq(byte[] bArr, byte[] bArr2) {
        new HashMap();
    }

    public bzq(char[] cArr) {
    }

    public bzq(float[] fArr) {
    }

    public bzq(int[] iArr) {
    }

    public bzq(short[] sArr) {
    }

    /* JADX INFO: renamed from: A */
    public static ImageHeaderParser$ImageType m3228A(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : m3230C(list, new bqi(byteBuffer, 0));
    }

    /* JADX INFO: renamed from: B */
    public static ImageHeaderParser$ImageType m3229B(List list, InputStream inputStream, btg btgVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bxm(inputStream, btgVar);
        }
        inputStream.mark(5242880);
        return m3230C(list, new bqi(inputStream, 1));
    }

    /* JADX INFO: renamed from: C */
    public static ImageHeaderParser$ImageType m3230C(List list, bqm bqmVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2920a = bqmVar.mo2920a((bqh) list.get(i));
            if (imageHeaderParser$ImageTypeMo2920a != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeMo2920a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m3231D(int i) {
        switch (i) {
            case 1:
                return wUzNh.CwMbJvXVVF;
            case 2:
                return "REMOTE";
            case 3:
                return "DATA_DISK_CACHE";
            case 4:
                return "RESOURCE_DISK_CACHE";
            case 5:
                return "MEMORY_CACHE";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m3232E() {
        if (Build.VERSION.CODENAME.equals("REL")) {
            return true;
        }
        return Build.VERSION.CODENAME.length() > 0 && Build.VERSION.CODENAME.toUpperCase().charAt(0) >= 'S' && Build.VERSION.CODENAME.toUpperCase().charAt(0) <= 'Z';
    }

    /* JADX INFO: renamed from: F */
    public static String m3233F(String str) {
        return str.toLowerCase(Locale.US).replaceAll("_", "-");
    }

    /* JADX INFO: renamed from: G */
    public static String m3234G(String str) {
        return str.toUpperCase(Locale.US).replaceAll("-", "_");
    }

    /* JADX INFO: renamed from: H */
    public static String m3235H(int i) {
        switch (i) {
            case 1:
                return "OPEN_CAMERA";
            case 2:
                return "RELEASE";
            case 3:
                return "RECONNECT";
            case 4:
                return "UNLOCK";
            case 5:
                return "LOCK";
            case 101:
                return "SET_PREVIEW_TEXTURE_ASYNC";
            case 102:
                return "START_PREVIEW_ASYNC";
            case 103:
                return wUzNh.tqMsTakLNvHn;
            case 104:
                return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
            case 105:
                return "ADD_CALLBACK_BUFFER";
            case 106:
                return "SET_PREVIEW_DISPLAY_ASYNC";
            case 107:
                return "SET_PREVIEW_CALLBACK";
            case 108:
                return "SET_ONE_SHOT_PREVIEW_CALLBACK";
            case 201:
                return "SET_PARAMETERS";
            case 202:
                return "GET_PARAMETERS";
            case 203:
                return "REFRESH_PARAMETERS";
            case 204:
                return "APPLY_SETTINGS";
            case 301:
                return "AUTO_FOCUS";
            case 302:
                return "CANCEL_AUTO_FOCUS";
            case 303:
                return PMZiHihxLGEy.fMBOMMYgRjSzAr;
            case 304:
                return "SET_ZOOM_CHANGE_LISTENER";
            case 305:
                return "CANCEL_AUTO_FOCUS_FINISH";
            case 461:
                return "SET_FACE_DETECTION_LISTENER";
            case 462:
                return "START_FACE_DETECTION";
            case 463:
                return "STOP_FACE_DETECTION";
            case 501:
                return "ENABLE_SHUTTER_SOUND";
            case 502:
                return "SET_DISPLAY_ORIENTATION";
            case 601:
                return "CAPTURE_PHOTO";
            default:
                return "UNKNOWN(" + i + ")";
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m3236I(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float fM3259ag = m3259ag(((i >> 16) & 255) / 255.0f);
        float fM3259ag2 = m3259ag(((i >> 8) & 255) / 255.0f);
        float fM3259ag3 = m3259ag((i & 255) / 255.0f);
        float fM3259ag4 = fM3259ag + ((m3259ag(((i2 >> 16) & 255) / 255.0f) - fM3259ag) * f);
        float fM3259ag5 = fM3259ag2 + ((m3259ag(((i2 >> 8) & 255) / 255.0f) - fM3259ag2) * f);
        float fM3259ag6 = fM3259ag3 + (f * (m3259ag((i2 & 255) / 255.0f) - fM3259ag3));
        float fM3260ah = m3260ah(fM3259ag4) * 255.0f;
        float fM3260ah2 = m3260ah(fM3259ag5) * 255.0f;
        float fM3260ah3 = m3260ah(fM3259ag6) * 255.0f;
        return (Math.round(fM3260ah) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(fM3260ah2) << 8) | Math.round(fM3260ah3);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ String m3237J(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    /* JADX INFO: renamed from: K */
    public static bja m3238K(blt bltVar, bgm bgmVar) {
        return new bja(m3245R(bltVar, bgmVar, bkv.f3663b));
    }

    /* JADX INFO: renamed from: L */
    public static bjb m3239L(blt bltVar, bgm bgmVar) {
        return m3240M(bltVar, bgmVar, true);
    }

    /* JADX INFO: renamed from: M */
    public static bjb m3240M(blt bltVar, bgm bgmVar, boolean z) {
        return new bjb(m3261ai(bltVar, z ? bme.m2701a() : 1.0f, bgmVar, bkv.f3662a));
    }

    /* JADX INFO: renamed from: N */
    public static bjc m3241N(blt bltVar, bgm bgmVar, int i) {
        return new bjc(m3245R(bltVar, bgmVar, new bky(i)));
    }

    /* JADX INFO: renamed from: O */
    public static bjd m3242O(blt bltVar, bgm bgmVar) {
        return new bjd(m3245R(bltVar, bgmVar, bkv.f3664c));
    }

    /* JADX INFO: renamed from: P */
    public static bjf m3243P(blt bltVar, bgm bgmVar) {
        return new bjf(bld.m2646a(bltVar, bgmVar, bme.m2701a(), bkv.f3666e, true));
    }

    /* JADX INFO: renamed from: Q */
    public static bjh m3244Q(blt bltVar, bgm bgmVar) {
        return new bjh(m3261ai(bltVar, bme.m2701a(), bgmVar, blk.f3698a));
    }

    /* JADX INFO: renamed from: R */
    public static List m3245R(blt bltVar, bgm bgmVar, blq blqVar) {
        return bld.m2646a(bltVar, bgmVar, 1.0f, blqVar, false);
    }

    /* JADX INFO: renamed from: S */
    public static int[] m3246S() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    /* JADX INFO: renamed from: T */
    public static Paint.Join m3247T(int i) {
        switch (i - 1) {
            case 0:
                return Paint.Join.MITER;
            case 1:
            default:
                return Paint.Join.ROUND;
            case 2:
                return Paint.Join.BEVEL;
        }
    }

    /* JADX INFO: renamed from: U */
    public static int[] m3248U() {
        return new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: V */
    public static Paint.Cap m3249V(int i) {
        switch (i - 1) {
            case 0:
                return Paint.Cap.BUTT;
            case 1:
                return Paint.Cap.ROUND;
            default:
                return Paint.Cap.SQUARE;
        }
    }

    /* JADX INFO: renamed from: W */
    public static int[] m3250W() {
        return new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: X */
    public static int[] m3251X() {
        return new int[]{1, 2, 3};
    }

    /* JADX INFO: renamed from: Y */
    public static String m3252Y(csn csnVar, cxk cxkVar, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(csnVar.f9339d.name());
        sb.append("/");
        sb.append(csnVar.f9338c.name());
        jxn jxnVar = csnVar.f9338c;
        if (jxnVar.m13657e()) {
            sb.append(jxnVar == jxn.FPS_120_HFR_4X ? " SlowMo4x" : " SlowMo8x");
        }
        sb.append(" FACING=");
        sb.append(csnVar.f9359x.name());
        if (cxkVar != null) {
            sb.append(" STAB=");
            sb.append(cxkVar.name());
        }
        sb.append(" ZOOM=");
        sb.append(f);
        return sb.toString();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m3253Z(hzj hzjVar, ilk ilkVar) {
        if (hzjVar.equals(hzj.TABLET_LAYOUT)) {
            return false;
        }
        return (hzjVar.equals(hzj.STARFISH_LAYOUT) && ilk.m11427e(ilkVar)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3254a(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }

    /* JADX INFO: renamed from: aa */
    public static /* synthetic */ String m3255aa(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "OK";
            case 3:
                return "ERROR";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: ab */
    public static /* synthetic */ String m3256ab(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_SOURCE";
            case 2:
                return "MODE_SWITCH";
            case 3:
                return "CAMERA_SWITCH";
            case 4:
                return "FPS_SWITCH";
            case 5:
                return "RESOLUTION_SWITCH";
            case 6:
                return "STABILIZATION_SWITCH";
            case 7:
                return "FALLBACK";
            case 8:
                return "AMETHYST";
            case 9:
                return "BOTTOM_SHEET";
            case 10:
                return "FOLD_STATE_CHANGED";
            case 11:
                return "JUPITER_SWITCH";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: ad */
    public static boolean m3258ad(int i, int i2, int i3) {
        return (i / i3) % 2 == 0 && (i2 / i3) % 2 == 0;
    }

    /* JADX INFO: renamed from: ag */
    private static float m3259ag(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: ah */
    private static float m3260ah(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: ai */
    private static List m3261ai(blt bltVar, float f, bgm bgmVar, blq blqVar) {
        return bld.m2646a(bltVar, bgmVar, f, blqVar, false);
    }

    /* JADX INFO: renamed from: b */
    public static bpp m3262b(box boxVar, byz byzVar, bzh bzhVar, Context context) {
        return new bpp(boxVar, byzVar, bzhVar, context);
    }

    /* JADX INFO: renamed from: c */
    public static int m3263c(int i, ByteBuffer byteBuffer) {
        if (m3254a(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static short m3264d(int i, ByteBuffer byteBuffer) {
        if (m3254a(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m3265e(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            default:
                return "FINISHED";
        }
    }

    /* JADX INFO: renamed from: f */
    public static Intent m3266f(boolean z, boolean z2, boolean z3, long[] jArr) {
        Intent intent;
        String str = BcwGDRhrTsnlj.heqN;
        if (z2) {
            if (z) {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW_SECURE");
                intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            } else {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW");
            }
            if (jArr.length != 0) {
                intent.putExtra(str, jArr);
            }
        } else if (z) {
            intent = new Intent("android.provider.action.REVIEW_SECURE");
            intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            if (jArr.length != 0) {
                intent.putExtra(str, jArr);
            }
        } else {
            intent = new Intent("android.provider.action.REVIEW");
        }
        if (z3) {
            intent.addFlags(268435456);
        }
        intent.setPackage("com.google.android.apps.photos");
        intent.addFlags(1);
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public static mrm m3267g(Context context) {
        mrm mrmVarM16828h = mrm.m16828h(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
        return (mrmVarM16828h.mo16813g() && !context.getPackageManager().queryIntentActivities((Intent) mrmVarM16828h.mo16809c(), 65536).isEmpty()) ? mrmVarM16828h : mqu.f41450a;
    }

    /* JADX INFO: renamed from: h */
    public static kge m3268h() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(4);
        kgdVarM14187a.m14183b(2);
        kgdVarM14187a.m14186e(1);
        return kgdVarM14187a.m14182a();
    }

    /* JADX INFO: renamed from: i */
    public static kge m3269i() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(1);
        kgdVarM14187a.m14183b(2);
        kgdVarM14187a.m14186e(1);
        return kgdVarM14187a.m14182a();
    }

    /* JADX INFO: renamed from: j */
    public static kge m3270j() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(4);
        kgdVarM14187a.m14183b(1);
        kgdVarM14187a.m14186e(1);
        return kgdVarM14187a.m14182a();
    }

    /* JADX INFO: renamed from: k */
    public static kge m3271k() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(3);
        kgdVarM14187a.m14183b(3);
        kgdVarM14187a.m14186e(1);
        return kgdVarM14187a.m14182a();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m3272l(int i) {
        switch (i) {
            case 1:
                return JrxsYuVZZqnFC.vxjLzsoHkJtUVBL;
            case 2:
                return "DEFAULT";
            case 3:
                return "TOUCH";
            case 4:
                return "FACE";
            case 5:
                return "TRACKING";
            case 6:
                return "SALIENCY";
            case 7:
                return "SMART_DEFAULT_ROI";
            case 8:
                return "EYES";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3273m(int i) {
        if (i == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3274n(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m3275o(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3276p(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3277q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m3278r(Object obj) {
        m3277q(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: s */
    public static cbc m3279s(cbc cbcVar) {
        return new cbb(cbcVar);
    }

    /* JADX INFO: renamed from: u */
    public static bzq m3281u() {
        return new bzq((int[]) null);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m3282v(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3283w(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m3284x(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* JADX INFO: renamed from: y */
    public static int m3285y(List list, InputStream inputStream, btg btgVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bxm(inputStream, btgVar);
        }
        inputStream.mark(5242880);
        return m3286z(list, new bqk(inputStream, btgVar, 0));
    }

    /* JADX INFO: renamed from: z */
    public static int m3286z(List list, bql bqlVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo2921a = bqlVar.mo2921a((bqh) list.get(i));
            if (iMo2921a != -1) {
                return iMo2921a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ae */
    public void mo3287ae() {
        throw null;
    }

    /* JADX INFO: renamed from: af */
    public void mo3288af() {
    }

    public bzq(boolean[] zArr) {
    }
}
