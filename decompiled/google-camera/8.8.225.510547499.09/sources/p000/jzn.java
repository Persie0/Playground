package p000;

import android.R;
import android.content.Context;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.support.p001v8.renderscript.ScriptIntrinsicBLAS;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.IOException;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzn {
    /* JADX INFO: renamed from: A */
    public static int m13798A(View view) {
        return kxk.m15024q(view, C0100R.attr.colorOnTertiaryContainer);
    }

    /* JADX INFO: renamed from: B */
    public static int m13799B(View view) {
        return kxk.m15024q(view, R.attr.colorPrimary);
    }

    /* JADX INFO: renamed from: C */
    public static int m13800C(View view) {
        return kxk.m15024q(view, C0100R.attr.colorPrimaryContainer);
    }

    /* JADX INFO: renamed from: D */
    public static int m13801D(View view) {
        return kxk.m15024q(view, C0100R.attr.colorSecondary);
    }

    /* JADX INFO: renamed from: E */
    public static int m13802E(View view) {
        return kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level1, view.getContext());
    }

    /* JADX INFO: renamed from: F */
    public static int m13803F(View view) {
        return kxk.m15024q(view, C0100R.attr.colorTertiaryContainer);
    }

    /* JADX INFO: renamed from: G */
    public static int m13804G(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static double m13805H(long j) {
        double d = j;
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    /* JADX INFO: renamed from: I */
    public static float m13806I(long j) {
        return j / 1000.0f;
    }

    /* JADX INFO: renamed from: J */
    public static int m13807J(double d) {
        return (int) (d * 1000.0d);
    }

    /* JADX INFO: renamed from: K */
    public static int m13808K(long j) {
        return (int) (j / 1000);
    }

    /* JADX INFO: renamed from: L */
    public static int m13809L(int i) {
        return i * 1000;
    }

    /* JADX INFO: renamed from: M */
    public static long m13810M(int i) {
        return ((long) i) * 1000000;
    }

    /* JADX INFO: renamed from: N */
    public static long m13811N(long j) {
        return j / 1000000;
    }

    /* JADX INFO: renamed from: O */
    private static ThreadFactory m13812O(jvn jvnVar) {
        boolean z = jvnVar.f34900a == 1;
        boolean z2 = z || jvnVar.f34901b.length() <= 13;
        String str = jvnVar.f34901b;
        if (z2) {
            return new jvo(jvnVar, z);
        }
        throw new IllegalArgumentException(lku.m15665s("Thread name %s is too long, must be less than %s", str, 13));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m13813a(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "STOPPED";
            case 4:
                return "CLOSED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m13814b(int i) {
        switch (i) {
            case 1:
                return "AUDIO";
            default:
                return "VIDEO";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13815c(kmg kmgVar, jyb jybVar) {
        return CamcorderProfile.hasProfile(Integer.parseInt(kmgVar.f36540a), jybVar.f35128g);
    }

    /* JADX INFO: renamed from: d */
    public static final jyg m13816d(kmg kmgVar, jyb jybVar) {
        return jyg.m13715a(CamcorderProfile.get(Integer.parseInt(kmgVar.f36540a), jybVar.f35128g)).m13701a();
    }

    /* JADX INFO: renamed from: e */
    public static final jyg m13817e(kmg kmgVar, jyd jydVar) {
        return jyg.m13715a(CamcorderProfile.get(Integer.parseInt(kmgVar.f36540a), jydVar.f35143k)).m13701a();
    }

    /* JADX INFO: renamed from: f */
    public static final int m13818f(int i, jxp jxpVar, boolean z, mrm mrmVar, mrm mrmVar2) {
        if (jxpVar.equals(jxp.RES_2160P) && i < 48000000) {
            i = 48000000;
        }
        if (z) {
            i = Math.round(i * 0.9f);
        }
        if (mrmVar.mo16813g()) {
            i = Math.round(i * ((Float) mrmVar.mo16809c()).floatValue());
            mrmVar.mo16809c().toString();
        }
        return (!mrmVar2.mo16813g() || ((Integer) mrmVar2.mo16809c()).intValue() <= 0) ? i : ((Integer) mrmVar2.mo16809c()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public static final MediaCodec m13819g(jxy jxyVar) throws jxx {
        try {
            return MediaCodec.createEncoderByType(jxyVar.mo13672a());
        } catch (IOException e) {
            throw new jxx(jxyVar, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static jvx m13820h(Executor executor) {
        return new jvx(executor, new kat() { // from class: jvv
            @Override // p000.kat
            /* JADX INFO: renamed from: a */
            public final Object mo13589a(Object obj) {
                return (jvy) ((Deque) obj).pollLast();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static ExecutorService m13821i(String str) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(0);
        return m13822j(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: j */
    public static ExecutorService m13822j(jvn jvnVar) {
        lku.m15669w(true);
        ThreadFactory threadFactoryM13812O = m13812O(jvnVar);
        int i = jvnVar.f34900a;
        switch (i) {
            case 0:
                return Executors.newCachedThreadPool(threadFactoryM13812O);
            case 1:
                return Executors.newSingleThreadExecutor(threadFactoryM13812O);
            default:
                return Executors.newFixedThreadPool(i, threadFactoryM13812O);
        }
    }

    /* JADX INFO: renamed from: k */
    public static ExecutorService m13823k(String str, int i) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(i);
        return m13822j(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: l */
    public static ExecutorService m13824l(String str) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(1);
        return m13822j(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: m */
    public static RunnableScheduledFuture m13825m(RunnableScheduledFuture runnableScheduledFuture) {
        return new jvq(runnableScheduledFuture);
    }

    /* JADX INFO: renamed from: n */
    public static ScheduledExecutorService m13826n(jvn jvnVar) {
        lku.m15669w(jvnVar.f34900a > 0);
        ThreadFactory threadFactoryM13812O = m13812O(jvnVar);
        int i = jvnVar.f34900a;
        return !jvnVar.f34903d ? new ScheduledThreadPoolExecutor(i, threadFactoryM13812O) : new jvp(i, threadFactoryM13812O);
    }

    /* JADX INFO: renamed from: o */
    public static ScheduledExecutorService m13827o(String str, int i) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(i);
        return m13826n(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: p */
    public static ScheduledExecutorService m13828p(String str) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(1);
        return m13826n(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: q */
    public static ExecutorService m13829q(String str, int i) {
        jvm jvmVarM13583a = jvn.m13583a();
        jvmVarM13583a.f34893a = str;
        jvmVarM13583a.m13582c(2);
        jvmVarM13583a.m13581b(i);
        return m13822j(jvmVarM13583a.m13580a());
    }

    /* JADX INFO: renamed from: r */
    public static int m13830r(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
            case 46:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            case 61:
            case 62:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 73:
            case 75:
            case 80:
            case 81:
            case 83:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 101:
            case 109:
            case 112:
            case 114:
            case C0100R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 231:
            case 234:
            case 235:
            case 236:
            case 237:
            case 239:
            case 252:
            case 257:
            case 258:
            case 264:
            case 272:
            case 274:
            case 275:
            case 283:
            case 318:
            default:
                return 0;
            case 7:
                return 7;
            case 14:
                return 14;
            case 16:
                return 16;
            case 18:
                return 18;
            case 24:
                return 24;
            case 26:
                return 26;
            case 29:
                return 29;
            case 30:
                return 30;
            case 32:
                return 32;
            case 33:
                return 33;
            case 35:
                return 35;
            case 38:
                return 38;
            case 39:
                return 39;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 51:
                return 51;
            case 57:
                return 57;
            case 58:
                return 58;
            case 60:
                return 60;
            case 63:
                return 63;
            case 64:
                return 64;
            case 67:
                return 67;
            case 68:
                return 68;
            case 72:
                return 72;
            case 74:
                return 74;
            case 76:
                return 76;
            case 77:
                return 77;
            case 78:
                return 78;
            case 79:
                return 79;
            case 82:
                return 82;
            case 84:
                return 84;
            case 85:
                return 85;
            case 88:
                return 88;
            case 94:
                return 94;
            case 95:
                return 95;
            case 96:
                return 96;
            case 97:
                return 97;
            case 98:
                return 98;
            case 99:
                return 99;
            case 100:
                return 100;
            case 102:
                return 102;
            case 103:
                return 103;
            case 104:
                return 104;
            case 105:
                return 105;
            case 106:
                return 106;
            case 107:
                return 107;
            case 108:
                return 108;
            case 110:
                return 110;
            case 111:
                return 111;
            case 113:
                return 113;
            case 115:
                return 115;
            case 116:
                return 116;
            case 117:
                return 117;
            case 118:
                return 118;
            case 119:
                return 119;
            case 120:
                return 120;
            case 121:
                return 121;
            case 122:
                return 122;
            case 123:
                return 123;
            case C0100R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return C0100R.styleable.AppCompatTheme_windowNoTitle;
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                return ScriptIntrinsicBLAS.UNIT;
            case 133:
                return 133;
            case 134:
                return 134;
            case 135:
                return 135;
            case 136:
                return 136;
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                return ScriptIntrinsicBLAS.LEFT;
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                return ScriptIntrinsicBLAS.RIGHT;
            case 143:
                return 143;
            case 145:
                return 145;
            case 146:
                return 146;
            case 148:
                return 148;
            case 150:
                return 150;
            case 151:
                return 151;
            case 152:
                return 152;
            case 153:
                return 153;
            case 154:
                return 154;
            case 180:
                return 180;
            case 182:
                return 182;
            case 183:
                return 183;
            case 184:
                return 184;
            case 185:
                return 185;
            case 186:
                return 186;
            case 187:
                return 187;
            case 188:
                return 188;
            case 189:
                return 189;
            case 194:
                return 194;
            case 200:
                return 200;
            case 202:
                return 202;
            case 203:
                return 203;
            case 204:
                return 204;
            case 205:
                return 205;
            case 206:
                return 206;
            case 218:
                return 218;
            case 219:
                return 219;
            case 220:
                return 220;
            case 221:
                return 221;
            case 223:
                return 223;
            case 227:
                return 227;
            case 228:
                return 228;
            case 232:
                return 232;
            case 233:
                return 233;
            case 238:
                return 238;
            case 240:
                return 240;
            case 241:
                return 241;
            case 242:
                return 242;
            case 243:
                return 243;
            case 244:
                return 244;
            case 245:
                return 245;
            case 246:
                return 246;
            case 247:
                return 247;
            case 248:
                return 248;
            case 249:
                return 249;
            case 250:
                return 250;
            case 251:
                return 251;
            case 253:
                return 253;
            case 254:
                return 254;
            case 255:
                return 255;
            case 256:
                return 256;
            case 259:
                return 259;
            case 260:
                return 260;
            case 261:
                return 261;
            case 262:
                return 262;
            case 263:
                return 263;
            case 265:
                return 265;
            case 266:
                return 266;
            case 267:
                return 267;
            case 268:
                return 268;
            case 269:
                return 269;
            case 270:
                return 270;
            case 271:
                return 271;
            case 273:
                return 273;
            case 276:
                return 276;
            case 277:
                return 277;
            case 278:
                return 278;
            case 279:
                return 279;
            case 280:
                return 280;
            case 281:
                return 281;
            case 282:
                return 282;
            case 284:
                return 284;
            case 285:
                return 285;
            case 286:
                return 286;
            case 287:
                return 287;
            case 288:
                return 288;
            case 289:
                return 289;
            case 290:
                return 290;
            case 291:
                return 291;
            case 292:
                return 292;
            case 293:
                return 293;
            case 294:
                return 294;
            case 295:
                return 295;
            case 296:
                return 296;
            case 297:
                return 297;
            case 298:
                return 298;
            case 299:
                return 299;
            case 300:
                return 300;
            case 301:
                return 301;
            case 302:
                return 302;
            case 303:
                return 303;
            case 304:
                return 304;
            case 305:
                return 305;
            case 306:
                return 306;
            case 307:
                return 307;
            case 308:
                return 308;
            case 309:
                return 309;
            case 310:
                return 310;
            case 311:
                return 311;
            case 312:
                return 312;
            case 313:
                return 313;
            case 314:
                return 314;
            case 315:
                return 315;
            case 316:
                return 316;
            case 317:
                return 317;
            case 319:
                return 319;
            case 320:
                return 320;
            case 321:
                return 321;
            case 322:
                return 322;
            case 323:
                return 323;
            case 324:
                return 324;
            case 325:
                return 325;
            case 326:
                return 326;
            case 327:
                return 327;
            case 328:
                return 328;
            case 329:
                return 329;
        }
    }

    /* JADX INFO: renamed from: s */
    public static float m13831s(float f, float f2) {
        return (((f2 + 0.33f) * f) * f) - 0.33f;
    }

    /* JADX INFO: renamed from: t */
    public static float m13832t(float f, int i) {
        double d = i;
        double d2 = f;
        double dPow = Math.pow(10.0d, d);
        Double.isNaN(d2);
        return Math.round(d2 * dPow) / ((float) Math.pow(10.0d, d));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m13833u(dhv dhvVar) {
        return dhvVar.mo6184l(dib.f11279am) && dhvVar.mo6184l(dib.f11328bi);
    }

    /* JADX INFO: renamed from: w */
    public static String m13835w(long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        return hours > 0 ? String.format("%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%1d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    /* JADX INFO: renamed from: x */
    public static int m13836x(View view) {
        return kxk.m15024q(view, C0100R.attr.colorOnBackground);
    }

    /* JADX INFO: renamed from: y */
    public static int m13837y(View view) {
        return kxk.m15024q(view, C0100R.attr.colorOnPrimaryContainer);
    }

    /* JADX INFO: renamed from: z */
    public static int m13838z(View view) {
        return kxk.m15024q(view, C0100R.attr.colorOnSurfaceVariant);
    }
}
