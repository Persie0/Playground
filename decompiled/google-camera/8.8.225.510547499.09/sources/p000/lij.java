package p000;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.provider.Settings;
import android.support.p001v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lij {

    /* JADX INFO: renamed from: a */
    private static Thread f38307a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f38308b;

    public lij() {
    }

    public lij(byte[] bArr) {
    }

    public lij(char[] cArr) {
    }

    /* JADX INFO: renamed from: A */
    public static int m15393A(Context context, int i, int i2) {
        TypedValue typedValueM15394B = m15394B(context, i);
        return (typedValueM15394B == null || typedValueM15394B.type != 16) ? i2 : typedValueM15394B.data;
    }

    /* JADX INFO: renamed from: B */
    public static TypedValue m15394B(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static TypedValue m15395C(Context context, int i, String str) {
        TypedValue typedValueM15394B = m15394B(context, i);
        if (typedValueM15394B != null) {
            return typedValueM15394B;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m15396D(Context context, int i, boolean z) {
        TypedValue typedValueM15394B = m15394B(context, i);
        if (typedValueM15394B == null || typedValueM15394B.type != 18) {
            return z;
        }
        return typedValueM15394B.data != 0;
    }

    /* JADX INFO: renamed from: E */
    public static float m15397E(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: F */
    public static TimeInterpolator m15398F(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m15434d(strValueOf, "cubic-bezier") && !m15434d(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m15434d(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = m15432b(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return ahd.m657c(m15418a(strArrSplit, 0), m15418a(strArrSplit, 1), m15418a(strArrSplit, 2), m15418a(strArrSplit, 3));
            }
            throw new IllegalArgumentException(JrxsYuVZZqnFC.SiS + length);
        }
        if (!m15434d(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String strM15432b = m15432b(strValueOf, "path");
        Path path = new Path();
        acs[] acsVarArrM56e = aau.m56e(strM15432b);
        if (acsVarArrM56e != null) {
            try {
                acs.m223a(acsVarArrM56e, path);
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing ".concat(String.valueOf(strM15432b)), e);
            }
        } else {
            path = null;
        }
        return ahd.m655a(path);
    }

    /* JADX INFO: renamed from: G */
    public static float m15399G(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: H */
    public static PorterDuff.Mode m15400H(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m15401I(View view) {
        return afc.m442c(view) == 1;
    }

    /* JADX INFO: renamed from: J */
    public static float m15402J(ofv ofvVar) {
        if (ofvVar == null || (ofvVar.f45885a & 4) == 0) {
            return 0.003f;
        }
        return ofvVar.f45888d;
    }

    /* JADX INFO: renamed from: K */
    public static DisplayMetrics m15403K(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    /* JADX INFO: renamed from: L */
    public static Display m15404L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX INFO: renamed from: N */
    public static oeo m15405N(String str, String str2, oej oejVar, oeh oehVar) {
        try {
            return new oek((HttpURLConnection) new URL(str).openConnection(), str2, oejVar, oehVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m15406O(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return C0100R.styleable.AppCompatTheme_windowMinWidthMajor;
            case C0100R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return C0100R.styleable.AppCompatTheme_windowMinWidthMinor;
            case C0100R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return C0100R.styleable.AppCompatTheme_windowNoTitle;
            case C0100R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return ScriptIntrinsicBLAS.NON_UNIT;
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
                return ScriptIntrinsicBLAS.UNIT;
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return ScriptIntrinsicBLAS.LEFT;
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                return ScriptIntrinsicBLAS.RIGHT;
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: P */
    public static int m15407P(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX INFO: renamed from: Q */
    public static int m15408Q(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: R */
    public static String m15409R(ByteBuffer byteBuffer, int i, int i2) throws nyb {
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!m15417Z(b)) {
                break;
            }
            i++;
            m15414W(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (m15417Z(b2)) {
                m15414W(b2, cArr, i5);
                i = i6;
                i5++;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (!m15417Z(b3)) {
                        break;
                    }
                    i++;
                    m15414W(b3, cArr, i5);
                    i5++;
                }
            } else if (m15420ab(b2)) {
                if (i6 >= i3) {
                    throw nyb.m18162d();
                }
                m15416Y(b2, byteBuffer.get(i6), cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (m15419aa(b2)) {
                if (i6 >= i3 - 1) {
                    throw nyb.m18162d();
                }
                int i7 = i6 + 1;
                m15415X(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i = i7 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw nyb.m18162d();
                }
                int i8 = i6 + 1;
                byte b4 = byteBuffer.get(i6);
                int i9 = i8 + 1;
                m15413V(b2, b4, byteBuffer.get(i8), byteBuffer.get(i9), cArr, i5);
                i5 += 2;
                i = i9 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: S */
    public static String m15410S(byte[] bArr, int i, int i2) throws nyb {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!m15417Z(b)) {
                break;
            }
            i++;
            m15414W(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (m15417Z(b2)) {
                m15414W(b2, cArr, i4);
                i = i5;
                i4++;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!m15417Z(b3)) {
                        break;
                    }
                    i++;
                    m15414W(b3, cArr, i4);
                    i4++;
                }
            } else if (m15420ab(b2)) {
                if (i5 >= i3) {
                    throw nyb.m18162d();
                }
                m15416Y(b2, bArr[i5], cArr, i4);
                i = i5 + 1;
                i4++;
            } else if (m15419aa(b2)) {
                if (i5 >= i3 - 1) {
                    throw nyb.m18162d();
                }
                int i6 = i5 + 1;
                m15415X(b2, bArr[i5], bArr[i6], cArr, i4);
                i = i6 + 1;
                i4++;
            } else {
                if (i5 >= i3 - 2) {
                    throw nyb.m18162d();
                }
                int i7 = i5 + 1;
                byte b4 = bArr[i5];
                int i8 = i7 + 1;
                m15413V(b2, b4, bArr[i7], bArr[i8], cArr, i4);
                i4 += 2;
                i = i8 + 1;
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: T */
    public static int m15411T(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    int i5 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i5;
                    }
                }
                return -1;
            }
            if (b < -16) {
                byte b2 = (byte) ((i >> 8) ^ (-1));
                if (b2 == 0) {
                    int i6 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i6 >= i3) {
                        return oai.m18381c(b, b3);
                    }
                    i2 = i6;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    int i7 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i7;
                    }
                }
                return -1;
            }
            byte b4 = (byte) ((i >> 8) ^ (-1));
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    return oai.m18381c(b, b4);
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    return oai.m18382d(b, b4, b5);
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && i4 <= -65) {
                int i10 = i2 + 1;
                if (bArr[i2] <= -65) {
                    i2 = i10;
                }
            }
            return -1;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i11 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i11 >= i3) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i2 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i11 >= i3 - 2) {
                        return oai.m18383e(bArr, i11, i3);
                    }
                    int i12 = i11 + 1;
                    byte b7 = bArr[i11];
                    if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                        int i13 = i12 + 1;
                        if (bArr[i12] <= -65) {
                            i2 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i3 - 1) {
                    return oai.m18383e(bArr, i11, i3);
                }
                int i14 = i11 + 1;
                byte b8 = bArr[i11];
                if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                    i2 = i14 + 1;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            }
            i2 = i11;
        }
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m15412U(byte[] bArr, int i, int i2) {
        return m15411T(0, bArr, i, i2) == 0;
    }

    /* JADX INFO: renamed from: V */
    public static void m15413V(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws nyb {
        if (m15430am(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m15430am(b3) || m15430am(b4)) {
            throw nyb.m18162d();
        }
        int iM15429al = ((b & 7) << 18) | (m15429al(b2) << 12) | (m15429al(b3) << 6) | m15429al(b4);
        cArr[i] = (char) ((iM15429al >>> 10) + 55232);
        cArr[i + 1] = (char) ((iM15429al & 1023) + 56320);
    }

    /* JADX INFO: renamed from: W */
    public static void m15414W(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: renamed from: Y */
    public static void m15416Y(byte b, byte b2, char[] cArr, int i) throws nyb {
        if (b < -62 || m15430am(b2)) {
            throw nyb.m18162d();
        }
        cArr[i] = (char) (((b & 31) << 6) | m15429al(b2));
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m15417Z(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: a */
    private static float m15418a(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException(WIxTIdUIdfb.jPl + f);
    }

    /* JADX INFO: renamed from: aa */
    public static boolean m15419aa(byte b) {
        return b < -16;
    }

    /* JADX INFO: renamed from: ab */
    public static boolean m15420ab(byte b) {
        return b < -32;
    }

    /* JADX INFO: renamed from: ad */
    public static /* bridge */ /* synthetic */ void m15421ad(Object obj, int i, nwr nwrVar) {
        ((nzy) obj).m18334f(oal.m18388c(i, 2), nwrVar);
    }

    /* JADX INFO: renamed from: ae */
    public static /* bridge */ /* synthetic */ void m15422ae(Object obj, int i, long j) {
        ((nzy) obj).m18334f(oal.m18388c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: af */
    public static nzy m15423af(Object obj) {
        return ((nxq) obj).f44981aJ;
    }

    /* JADX INFO: renamed from: ag */
    public static void m15424ag(Object obj, nzy nzyVar) {
        ((nxq) obj).f44981aJ = nzyVar;
    }

    /* JADX INFO: renamed from: ah */
    public static /* bridge */ /* synthetic */ Object m15425ah(Object obj) {
        nzy nzyVarM15423af = m15423af(obj);
        if (nzyVarM15423af != nzy.f45105a) {
            return nzyVarM15423af;
        }
        nzy nzyVarM18329b = nzy.m18329b();
        m15424ag(obj, nzyVarM18329b);
        return nzyVarM18329b;
    }

    /* JADX INFO: renamed from: ai */
    public static void m15426ai(Object obj) {
        m15423af(obj).m18333e();
    }

    /* JADX INFO: renamed from: aj */
    public static String m15427aj(nwr nwrVar) {
        StringBuilder sb = new StringBuilder(nwrVar.mo17783d());
        for (int i = 0; i < nwrVar.mo17783d(); i++) {
            byte bMo17780a = nwrVar.mo17780a(i);
            switch (bMo17780a) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append(VCYBIzY.nzHYohwquCn);
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (bMo17780a < 32 || bMo17780a > 126) {
                        sb.append('\\');
                        sb.append((char) (((bMo17780a >>> 6) & 3) + 48));
                        sb.append((char) (((bMo17780a >>> 3) & 7) + 48));
                        sb.append((char) ((bMo17780a & 7) + 48));
                    } else {
                        sb.append((char) bMo17780a);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ak */
    public static void m15428ak(nwr nwrVar, ArrayDeque arrayDeque) {
        if (!nwrVar.mo17787h()) {
            if (!(nwrVar instanceof nzl)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(nwrVar.getClass()))));
            }
            nzl nzlVar = (nzl) nwrVar;
            int[] iArr = nzl.f45075a;
            m15428ak(nzlVar.f45077e, arrayDeque);
            m15428ak(nzlVar.f45078f, arrayDeque);
            return;
        }
        int iM15431an = m15431an(nwrVar.mo17783d());
        int iM18266c = nzl.m18266c(iM15431an + 1);
        if (arrayDeque.isEmpty() || ((nwr) arrayDeque.peek()).mo17783d() >= iM18266c) {
            arrayDeque.push(nwrVar);
            return;
        }
        int iM18266c2 = nzl.m18266c(iM15431an);
        nwr nzlVar2 = (nwr) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((nwr) arrayDeque.peek()).mo17783d() < iM18266c2) {
            nzlVar2 = new nzl((nwr) arrayDeque.pop(), nzlVar2);
        }
        nzl nzlVar3 = new nzl(nzlVar2, nwrVar);
        while (!arrayDeque.isEmpty()) {
            if (((nwr) arrayDeque.peek()).mo17783d() >= nzl.m18266c(m15431an(nzlVar3.f45076d) + 1)) {
                break;
            } else {
                nzlVar3 = new nzl((nwr) arrayDeque.pop(), nzlVar3);
            }
        }
        arrayDeque.push(nzlVar3);
    }

    /* JADX INFO: renamed from: al */
    private static int m15429al(byte b) {
        return b & 63;
    }

    /* JADX INFO: renamed from: am */
    private static boolean m15430am(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: an */
    private static int m15431an(int i) {
        int iBinarySearch = Arrays.binarySearch(nzl.f45075a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX INFO: renamed from: b */
    private static String m15432b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* JADX INFO: renamed from: c */
    static liu m15433c(Long l, Long l2, HealthStats healthStats, oyz oyzVar, lie lieVar) {
        Object obj = lieVar.f38294a;
        nxl nxlVarM18137O = ozj.f46959an.m18137O();
        long jM15436f = m15436f(healthStats, 10001);
        if (jM15436f != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar = (ozj) nxlVarM18137O.f44974b;
            ozjVar.f46987a |= 1;
            ozjVar.f47002c = jM15436f;
        }
        long jM15436f2 = m15436f(healthStats, 10002);
        if (jM15436f2 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar2 = (ozj) nxlVarM18137O.f44974b;
            ozjVar2.f46987a |= 2;
            ozjVar2.f47003d = jM15436f2;
        }
        long jM15436f3 = m15436f(healthStats, 10003);
        if (jM15436f3 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar3 = (ozj) nxlVarM18137O.f44974b;
            ozjVar3.f46987a |= 4;
            ozjVar3.f47004e = jM15436f3;
        }
        long jM15436f4 = m15436f(healthStats, 10004);
        if (jM15436f4 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar4 = (ozj) nxlVarM18137O.f44974b;
            ozjVar4.f46987a |= 8;
            ozjVar4.f47005f = jM15436f4;
        }
        nxlVarM18137O.m18079ai(m15437g(healthStats, 10005));
        nxlVarM18137O.m18080aj(m15437g(healthStats, 10006));
        nxlVarM18137O.m18081ak(m15437g(healthStats, 10007));
        nxlVarM18137O.m18078ah(m15437g(healthStats, 10008));
        nxlVarM18137O.m18077ag(m15437g(healthStats, 10009));
        nxlVarM18137O.m18073ac(m15437g(healthStats, 10010));
        ozi oziVarM15440j = m15440j(healthStats, 10011);
        if (oziVarM15440j != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar5 = (ozj) nxlVarM18137O.f44974b;
            ozjVar5.f47012m = oziVarM15440j;
            ozjVar5.f46987a |= 16;
        }
        nxlVarM18137O.m18074ad(m15437g(healthStats, 10012));
        nxlVarM18137O.m18076af(lip.f38325a.m15470d(m15438h(healthStats, 10014)));
        nxlVarM18137O.m18075ae(lio.f38324a.m15470d(m15438h(healthStats, 10015)));
        long jM15436f5 = m15436f(healthStats, 10016);
        if (jM15436f5 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar6 = (ozj) nxlVarM18137O.f44974b;
            ozjVar6.f46987a |= 32;
            ozjVar6.f47017r = jM15436f5;
        }
        long jM15436f6 = m15436f(healthStats, 10017);
        if (jM15436f6 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar7 = (ozj) nxlVarM18137O.f44974b;
            ozjVar7.f46987a |= 64;
            ozjVar7.f47018s = jM15436f6;
        }
        long jM15436f7 = m15436f(healthStats, 10018);
        if (jM15436f7 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar8 = (ozj) nxlVarM18137O.f44974b;
            ozjVar8.f46987a |= 128;
            ozjVar8.f47019t = jM15436f7;
        }
        long jM15436f8 = m15436f(healthStats, 10019);
        if (jM15436f8 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar9 = (ozj) nxlVarM18137O.f44974b;
            ozjVar9.f46987a |= 256;
            ozjVar9.f47020u = jM15436f8;
        }
        long jM15436f9 = m15436f(healthStats, 10020);
        if (jM15436f9 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar10 = (ozj) nxlVarM18137O.f44974b;
            ozjVar10.f46987a |= 512;
            ozjVar10.f47021v = jM15436f9;
        }
        long jM15436f10 = m15436f(healthStats, 10021);
        if (jM15436f10 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar11 = (ozj) nxlVarM18137O.f44974b;
            ozjVar11.f46987a |= 1024;
            ozjVar11.f47022w = jM15436f10;
        }
        long jM15436f11 = m15436f(healthStats, 10022);
        if (jM15436f11 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar12 = (ozj) nxlVarM18137O.f44974b;
            ozjVar12.f46987a |= 2048;
            ozjVar12.f47023x = jM15436f11;
        }
        long jM15436f12 = m15436f(healthStats, 10023);
        if (jM15436f12 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar13 = (ozj) nxlVarM18137O.f44974b;
            ozjVar13.f46987a |= 4096;
            ozjVar13.f47024y = jM15436f12;
        }
        long jM15436f13 = m15436f(healthStats, 10024);
        if (jM15436f13 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar14 = (ozj) nxlVarM18137O.f44974b;
            ozjVar14.f46987a |= 8192;
            ozjVar14.f47025z = jM15436f13;
        }
        long jM15436f14 = m15436f(healthStats, 10025);
        if (jM15436f14 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar15 = (ozj) nxlVarM18137O.f44974b;
            ozjVar15.f46987a |= 16384;
            ozjVar15.f46961A = jM15436f14;
        }
        long jM15436f15 = m15436f(healthStats, 10026);
        if (jM15436f15 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar16 = (ozj) nxlVarM18137O.f44974b;
            ozjVar16.f46987a |= 32768;
            ozjVar16.f46962B = jM15436f15;
        }
        long jM15436f16 = m15436f(healthStats, 10027);
        if (jM15436f16 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar17 = (ozj) nxlVarM18137O.f44974b;
            ozjVar17.f46987a |= 65536;
            ozjVar17.f46963C = jM15436f16;
        }
        long jM15436f17 = m15436f(healthStats, 10028);
        if (jM15436f17 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar18 = (ozj) nxlVarM18137O.f44974b;
            ozjVar18.f46987a |= 131072;
            ozjVar18.f46964D = jM15436f17;
        }
        long jM15436f18 = m15436f(healthStats, 10029);
        if (jM15436f18 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar19 = (ozj) nxlVarM18137O.f44974b;
            ozjVar19.f46987a |= 262144;
            ozjVar19.f46965E = jM15436f18;
        }
        ozi oziVarM15440j2 = m15440j(healthStats, 10030);
        if (oziVarM15440j2 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar20 = (ozj) nxlVarM18137O.f44974b;
            ozjVar20.f46966F = oziVarM15440j2;
            ozjVar20.f46987a |= 524288;
        }
        long jM15436f19 = m15436f(healthStats, 10031);
        if (jM15436f19 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar21 = (ozj) nxlVarM18137O.f44974b;
            ozjVar21.f46987a |= 1048576;
            ozjVar21.f46967G = jM15436f19;
        }
        ozi oziVarM15440j3 = m15440j(healthStats, 10032);
        if (oziVarM15440j3 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar22 = (ozj) nxlVarM18137O.f44974b;
            ozjVar22.f46968H = oziVarM15440j3;
            ozjVar22.f46987a |= 2097152;
        }
        ozi oziVarM15440j4 = m15440j(healthStats, 10033);
        if (oziVarM15440j4 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar23 = (ozj) nxlVarM18137O.f44974b;
            ozjVar23.f46969I = oziVarM15440j4;
            ozjVar23.f46987a |= 4194304;
        }
        ozi oziVarM15440j5 = m15440j(healthStats, 10034);
        if (oziVarM15440j5 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar24 = (ozj) nxlVarM18137O.f44974b;
            ozjVar24.f46970J = oziVarM15440j5;
            ozjVar24.f46987a |= 8388608;
        }
        ozi oziVarM15440j6 = m15440j(healthStats, 10035);
        if (oziVarM15440j6 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar25 = (ozj) nxlVarM18137O.f44974b;
            ozjVar25.f46971K = oziVarM15440j6;
            ozjVar25.f46987a |= 16777216;
        }
        ozi oziVarM15440j7 = m15440j(healthStats, 10036);
        if (oziVarM15440j7 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar26 = (ozj) nxlVarM18137O.f44974b;
            ozjVar26.f46972L = oziVarM15440j7;
            ozjVar26.f46987a |= 33554432;
        }
        ozi oziVarM15440j8 = m15440j(healthStats, 10037);
        if (oziVarM15440j8 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar27 = (ozj) nxlVarM18137O.f44974b;
            ozjVar27.f46973M = oziVarM15440j8;
            ozjVar27.f46987a |= 67108864;
        }
        ozi oziVarM15440j9 = m15440j(healthStats, 10038);
        if (oziVarM15440j9 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar28 = (ozj) nxlVarM18137O.f44974b;
            ozjVar28.f46974N = oziVarM15440j9;
            ozjVar28.f46987a |= 134217728;
        }
        ozi oziVarM15440j10 = m15440j(healthStats, 10039);
        if (oziVarM15440j10 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar29 = (ozj) nxlVarM18137O.f44974b;
            ozjVar29.f46975O = oziVarM15440j10;
            ozjVar29.f46987a |= 268435456;
        }
        ozi oziVarM15440j11 = m15440j(healthStats, 10040);
        if (oziVarM15440j11 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar30 = (ozj) nxlVarM18137O.f44974b;
            ozjVar30.f46976P = oziVarM15440j11;
            ozjVar30.f46987a |= 536870912;
        }
        ozi oziVarM15440j12 = m15440j(healthStats, 10041);
        if (oziVarM15440j12 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar31 = (ozj) nxlVarM18137O.f44974b;
            ozjVar31.f46977Q = oziVarM15440j12;
            ozjVar31.f46987a |= 1073741824;
        }
        ozi oziVarM15440j13 = m15440j(healthStats, 10042);
        if (oziVarM15440j13 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar32 = (ozj) nxlVarM18137O.f44974b;
            ozjVar32.f46978R = oziVarM15440j13;
            ozjVar32.f46987a |= Integer.MIN_VALUE;
        }
        ozi oziVarM15440j14 = m15440j(healthStats, 10043);
        if (oziVarM15440j14 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar33 = (ozj) nxlVarM18137O.f44974b;
            ozjVar33.f46979S = oziVarM15440j14;
            ozjVar33.f47001b |= 1;
        }
        ozi oziVarM15440j15 = m15440j(healthStats, 10044);
        if (oziVarM15440j15 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar34 = (ozj) nxlVarM18137O.f44974b;
            ozjVar34.f46980T = oziVarM15440j15;
            ozjVar34.f47001b |= 2;
        }
        long jM15436f20 = m15436f(healthStats, 10045);
        if (jM15436f20 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar35 = (ozj) nxlVarM18137O.f44974b;
            ozjVar35.f47001b |= 4;
            ozjVar35.f46981U = jM15436f20;
        }
        long jM15436f21 = m15436f(healthStats, 10046);
        if (jM15436f21 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar36 = (ozj) nxlVarM18137O.f44974b;
            ozjVar36.f47001b |= 8;
            ozjVar36.f46982V = jM15436f21;
        }
        long jM15436f22 = m15436f(healthStats, 10047);
        if (jM15436f22 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar37 = (ozj) nxlVarM18137O.f44974b;
            ozjVar37.f47001b |= 16;
            ozjVar37.f46983W = jM15436f22;
        }
        long jM15436f23 = m15436f(healthStats, 10048);
        if (jM15436f23 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar38 = (ozj) nxlVarM18137O.f44974b;
            ozjVar38.f47001b |= 32;
            ozjVar38.f46984X = jM15436f23;
        }
        long jM15436f24 = m15436f(healthStats, 10049);
        if (jM15436f24 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar39 = (ozj) nxlVarM18137O.f44974b;
            ozjVar39.f47001b |= 64;
            ozjVar39.f46985Y = jM15436f24;
        }
        long jM15436f25 = m15436f(healthStats, 10050);
        if (jM15436f25 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar40 = (ozj) nxlVarM18137O.f44974b;
            ozjVar40.f47001b |= 128;
            ozjVar40.f46986Z = jM15436f25;
        }
        long jM15436f26 = m15436f(healthStats, 10051);
        if (jM15436f26 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar41 = (ozj) nxlVarM18137O.f44974b;
            ozjVar41.f47001b |= 256;
            ozjVar41.f46988aa = jM15436f26;
        }
        long jM15436f27 = m15436f(healthStats, 10052);
        if (jM15436f27 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar42 = (ozj) nxlVarM18137O.f44974b;
            ozjVar42.f47001b |= 512;
            ozjVar42.f46989ab = jM15436f27;
        }
        long jM15436f28 = m15436f(healthStats, 10053);
        if (jM15436f28 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar43 = (ozj) nxlVarM18137O.f44974b;
            ozjVar43.f47001b |= 1024;
            ozjVar43.f46990ac = jM15436f28;
        }
        long jM15436f29 = m15436f(healthStats, 10054);
        if (jM15436f29 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar44 = (ozj) nxlVarM18137O.f44974b;
            ozjVar44.f47001b |= 2048;
            ozjVar44.f46991ad = jM15436f29;
        }
        long jM15436f30 = m15436f(healthStats, 10055);
        if (jM15436f30 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar45 = (ozj) nxlVarM18137O.f44974b;
            ozjVar45.f47001b |= 4096;
            ozjVar45.f46992ae = jM15436f30;
        }
        long jM15436f31 = m15436f(healthStats, 10056);
        if (jM15436f31 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar46 = (ozj) nxlVarM18137O.f44974b;
            ozjVar46.f47001b |= 8192;
            ozjVar46.f46993af = jM15436f31;
        }
        long jM15436f32 = m15436f(healthStats, 10057);
        if (jM15436f32 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar47 = (ozj) nxlVarM18137O.f44974b;
            ozjVar47.f47001b |= 16384;
            ozjVar47.f46994ag = jM15436f32;
        }
        long jM15436f33 = m15436f(healthStats, 10058);
        if (jM15436f33 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar48 = (ozj) nxlVarM18137O.f44974b;
            ozjVar48.f47001b = 32768 | ozjVar48.f47001b;
            ozjVar48.f46995ah = jM15436f33;
        }
        long jM15436f34 = m15436f(healthStats, 10059);
        if (jM15436f34 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar49 = (ozj) nxlVarM18137O.f44974b;
            ozjVar49.f47001b |= 65536;
            ozjVar49.f46996ai = jM15436f34;
        }
        ozi oziVarM15440j16 = m15440j(healthStats, 10061);
        if (oziVarM15440j16 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar50 = (ozj) nxlVarM18137O.f44974b;
            ozjVar50.f46997aj = oziVarM15440j16;
            ozjVar50.f47001b |= 131072;
        }
        long jM15436f35 = m15436f(healthStats, 10062);
        if (jM15436f35 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar51 = (ozj) nxlVarM18137O.f44974b;
            ozjVar51.f47001b |= 262144;
            ozjVar51.f46998ak = jM15436f35;
        }
        long jM15436f36 = m15436f(healthStats, 10063);
        if (jM15436f36 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar52 = (ozj) nxlVarM18137O.f44974b;
            ozjVar52.f47001b = 524288 | ozjVar52.f47001b;
            ozjVar52.f46999al = jM15436f36;
        }
        long jM15436f37 = m15436f(healthStats, 10064);
        if (jM15436f37 != 0) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar53 = (ozj) nxlVarM18137O.f44974b;
            ozjVar53.f47001b |= 1048576;
            ozjVar53.f47000am = jM15436f37;
        }
        ozj ozjVar54 = (ozj) nxlVarM18137O.mo18103l();
        nxl nxlVar = (nxl) ozjVar54.m18143ad(5);
        nxlVar.m18108s(ozjVar54);
        Object obj2 = ((lpe) obj).f38883b;
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47006g);
        for (int i = 0; i < ((ozj) nxlVar.f44974b).f47006g.size(); i++) {
            nxlVar.m18091au(i, ((lim) obj2).m15466c(1, nxlVar.m18059V(i)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47007h);
        for (int i2 = 0; i2 < ((ozj) nxlVar.f44974b).f47007h.size(); i2++) {
            nxlVar.m18092av(i2, ((lim) obj2).m15466c(1, nxlVar.m18060W(i2)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47008i);
        for (int i3 = 0; i3 < ((ozj) nxlVar.f44974b).f47008i.size(); i3++) {
            nxlVar.m18093aw(i3, ((lim) obj2).m15466c(1, nxlVar.m18061X(i3)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47009j);
        for (int i4 = 0; i4 < ((ozj) nxlVar.f44974b).f47009j.size(); i4++) {
            nxlVar.m18090at(i4, ((lim) obj2).m15466c(1, nxlVar.m18062Y(i4)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47010k);
        for (int i5 = 0; i5 < ((ozj) nxlVar.f44974b).f47010k.size(); i5++) {
            nxlVar.m18087aq(i5, ((lim) obj2).m15466c(2, nxlVar.m18063Z(i5)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47011l);
        for (int i6 = 0; i6 < ((ozj) nxlVar.f44974b).f47011l.size(); i6++) {
            nxlVar.m18084an(i6, ((lim) obj2).m15466c(3, nxlVar.m18071aa(i6)));
        }
        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47013n);
        for (int i7 = 0; i7 < ((ozj) nxlVar.f44974b).f47013n.size(); i7++) {
            nxlVar.m18086ap(i7, ((lim) obj2).m15466c(5, nxlVar.m18072ab(i7)));
        }
        ozj ozjVar55 = (ozj) nxlVar.mo18103l();
        Object obj3 = lieVar.f38296c;
        return new liu(ozjVar55, l, l2, 506730610L, Long.valueOf(obj3 != null ? ((String) obj3).hashCode() : 0L), oyzVar, null, null);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m15434d(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: f */
    public static long m15436f(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    /* JADX INFO: renamed from: g */
    public static List m15437g(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.emptyList() : lis.f38327a.m15470d(healthStats.getTimers(i));
    }

    /* JADX INFO: renamed from: h */
    public static Map m15438h(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    /* JADX INFO: renamed from: i */
    public static ozd m15439i(String str) {
        nxl nxlVarM18137O = ozd.f46924d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozd ozdVar = (ozd) nxlVarM18137O.f44974b;
        ozdVar.f46926a |= 2;
        ozdVar.f46928c = str;
        return (ozd) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: j */
    public static ozi m15440j(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return m15442l(null, healthStats.getTimer(i));
    }

    /* JADX INFO: renamed from: k */
    public static ozi m15441k(ozi oziVar, ozi oziVar2) {
        if (oziVar == null || oziVar2 == null) {
            return oziVar;
        }
        int i = oziVar.f46956b - oziVar2.f46956b;
        long j = oziVar.f46957c - oziVar2.f46957c;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        nxl nxlVarM18137O = ozi.f46953e.m18137O();
        if ((oziVar.f46955a & 4) != 0) {
            ozd ozdVar = oziVar.f46958d;
            if (ozdVar == null) {
                ozdVar = ozd.f46924d;
            }
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozi oziVar3 = (ozi) nxlVarM18137O.f44974b;
            ozdVar.getClass();
            oziVar3.f46958d = ozdVar;
            oziVar3.f46955a |= 4;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ozi oziVar4 = (ozi) nxqVar;
        oziVar4.f46955a |= 1;
        oziVar4.f46956b = i;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozi oziVar5 = (ozi) nxlVarM18137O.f44974b;
        oziVar5.f46955a |= 2;
        oziVar5.f46957c = j;
        return (ozi) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: l */
    public static ozi m15442l(String str, TimerStat timerStat) {
        nxl nxlVarM18137O = ozi.f46953e.m18137O();
        int count = timerStat.getCount();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozi oziVar = (ozi) nxlVarM18137O.f44974b;
        oziVar.f46955a |= 1;
        oziVar.f46956b = count;
        long time = timerStat.getTime();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ozi oziVar2 = (ozi) nxqVar;
        oziVar2.f46955a |= 2;
        oziVar2.f46957c = time;
        if (oziVar2.f46956b < 0) {
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozi oziVar3 = (ozi) nxlVarM18137O.f44974b;
            oziVar3.f46955a |= 1;
            oziVar3.f46956b = 0;
        }
        if (str != null) {
            ozd ozdVarM15439i = m15439i(str);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozi oziVar4 = (ozi) nxlVarM18137O.f44974b;
            ozdVarM15439i.getClass();
            oziVar4.f46958d = ozdVarM15439i;
            oziVar4.f46955a |= 4;
        }
        ozi oziVar5 = (ozi) nxlVarM18137O.f44974b;
        if (oziVar5.f46956b == 0 && oziVar5.f46957c == 0) {
            return null;
        }
        return (ozi) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: m */
    public static ozj m15443m(ozj ozjVar, ozj ozjVar2) {
        ozi oziVar;
        ozi oziVar2;
        ozi oziVar3;
        ozi oziVar4;
        ozi oziVar5;
        ozi oziVar6;
        ozi oziVar7;
        ozi oziVar8;
        ozi oziVar9;
        ozi oziVar10;
        ozi oziVar11;
        ozi oziVar12;
        ozi oziVar13;
        ozi oziVar14;
        ozi oziVar15;
        ozi oziVar16;
        ozi oziVar17;
        ozi oziVar18;
        ozi oziVar19;
        ozi oziVar20;
        ozi oziVar21;
        ozi oziVar22;
        ozi oziVar23;
        ozi oziVar24;
        ozi oziVar25;
        ozi oziVar26;
        ozi oziVar27;
        ozi oziVar28;
        ozi oziVar29;
        ozi oziVar30;
        if (ozjVar == null || ozjVar2 == null) {
            return ozjVar;
        }
        nxl nxlVarM18137O = ozj.f46959an.m18137O();
        if ((ozjVar.f46987a & 1) != 0) {
            long j = ozjVar.f47002c - ozjVar2.f47002c;
            if (j != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar3 = (ozj) nxlVarM18137O.f44974b;
                ozjVar3.f46987a |= 1;
                ozjVar3.f47002c = j;
            }
        }
        if ((ozjVar.f46987a & 2) != 0) {
            long j2 = ozjVar.f47003d - ozjVar2.f47003d;
            if (j2 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar4 = (ozj) nxlVarM18137O.f44974b;
                ozjVar4.f46987a |= 2;
                ozjVar4.f47003d = j2;
            }
        }
        if ((ozjVar.f46987a & 4) != 0) {
            long j3 = ozjVar.f47004e - ozjVar2.f47004e;
            if (j3 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar5 = (ozj) nxlVarM18137O.f44974b;
                ozjVar5.f46987a |= 4;
                ozjVar5.f47004e = j3;
            }
        }
        if ((ozjVar.f46987a & 8) != 0) {
            long j4 = ozjVar.f47005f - ozjVar2.f47005f;
            if (j4 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar6 = (ozj) nxlVarM18137O.f44974b;
                ozjVar6.f46987a |= 8;
                ozjVar6.f47005f = j4;
            }
        }
        nxlVarM18137O.m18079ai(lis.f38327a.m15471e(ozjVar.f47006g, ozjVar2.f47006g));
        nxlVarM18137O.m18080aj(lis.f38327a.m15471e(ozjVar.f47007h, ozjVar2.f47007h));
        nxlVarM18137O.m18081ak(lis.f38327a.m15471e(ozjVar.f47008i, ozjVar2.f47008i));
        nxlVarM18137O.m18078ah(lis.f38327a.m15471e(ozjVar.f47009j, ozjVar2.f47009j));
        nxlVarM18137O.m18077ag(lis.f38327a.m15471e(ozjVar.f47010k, ozjVar2.f47010k));
        nxlVarM18137O.m18073ac(lis.f38327a.m15471e(ozjVar.f47011l, ozjVar2.f47011l));
        if ((ozjVar.f46987a & 16) != 0) {
            oziVar = ozjVar.f47012m;
            if (oziVar == null) {
                oziVar = ozi.f46953e;
            }
        } else {
            oziVar = null;
        }
        if ((ozjVar2.f46987a & 16) != 0) {
            oziVar2 = ozjVar2.f47012m;
            if (oziVar2 == null) {
                oziVar2 = ozi.f46953e;
            }
        } else {
            oziVar2 = null;
        }
        ozi oziVarM15441k = m15441k(oziVar, oziVar2);
        if (oziVarM15441k != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozj ozjVar7 = (ozj) nxlVarM18137O.f44974b;
            ozjVar7.f47012m = oziVarM15441k;
            ozjVar7.f46987a |= 16;
        }
        nxlVarM18137O.m18074ad(lis.f38327a.m15471e(ozjVar.f47013n, ozjVar2.f47013n));
        nxlVarM18137O.m18076af(lip.f38325a.m15471e(ozjVar.f47015p, ozjVar2.f47015p));
        nxlVarM18137O.m18075ae(lio.f38324a.m15471e(ozjVar.f47016q, ozjVar2.f47016q));
        if ((ozjVar.f46987a & 32) != 0) {
            long j5 = ozjVar.f47017r - ozjVar2.f47017r;
            if (j5 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar8 = (ozj) nxlVarM18137O.f44974b;
                ozjVar8.f46987a |= 32;
                ozjVar8.f47017r = j5;
            }
        }
        if ((ozjVar.f46987a & 64) != 0) {
            long j6 = ozjVar.f47018s - ozjVar2.f47018s;
            if (j6 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar9 = (ozj) nxlVarM18137O.f44974b;
                ozjVar9.f46987a |= 64;
                ozjVar9.f47018s = j6;
            }
        }
        if ((ozjVar.f46987a & 128) != 0) {
            long j7 = ozjVar.f47019t - ozjVar2.f47019t;
            if (j7 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar10 = (ozj) nxlVarM18137O.f44974b;
                ozjVar10.f46987a |= 128;
                ozjVar10.f47019t = j7;
            }
        }
        if ((ozjVar.f46987a & 256) != 0) {
            long j8 = ozjVar.f47020u - ozjVar2.f47020u;
            if (j8 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar11 = (ozj) nxlVarM18137O.f44974b;
                ozjVar11.f46987a |= 256;
                ozjVar11.f47020u = j8;
            }
        }
        if ((ozjVar.f46987a & 512) != 0) {
            long j9 = ozjVar.f47021v - ozjVar2.f47021v;
            if (j9 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar12 = (ozj) nxlVarM18137O.f44974b;
                ozjVar12.f46987a |= 512;
                ozjVar12.f47021v = j9;
            }
        }
        if ((ozjVar.f46987a & 1024) != 0) {
            long j10 = ozjVar.f47022w - ozjVar2.f47022w;
            if (j10 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar13 = (ozj) nxlVarM18137O.f44974b;
                ozjVar13.f46987a |= 1024;
                ozjVar13.f47022w = j10;
            }
        }
        if ((ozjVar.f46987a & 2048) != 0) {
            long j11 = ozjVar.f47023x - ozjVar2.f47023x;
            if (j11 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19242k(j11);
            }
        }
        if ((ozjVar.f46987a & 4096) != 0) {
            long j12 = ozjVar.f47024y - ozjVar2.f47024y;
            if (j12 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19243l(j12);
            }
        }
        if ((ozjVar.f46987a & 8192) != 0) {
            long j13 = ozjVar.f47025z - ozjVar2.f47025z;
            if (j13 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19244m(j13);
            }
        }
        if ((ozjVar.f46987a & 16384) != 0) {
            long j14 = ozjVar.f46961A - ozjVar2.f46961A;
            if (j14 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19245o(j14);
            }
        }
        if ((ozjVar.f46987a & 32768) != 0) {
            long j15 = ozjVar.f46962B - ozjVar2.f46962B;
            if (j15 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19246p(j15);
            }
        }
        if ((ozjVar.f46987a & 65536) != 0) {
            long j16 = ozjVar.f46963C - ozjVar2.f46963C;
            if (j16 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19247r(j16);
            }
        }
        if ((ozjVar.f46987a & 131072) != 0) {
            long j17 = ozjVar.f46964D - ozjVar2.f46964D;
            if (j17 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19248s(j17);
            }
        }
        if ((ozjVar.f46987a & 262144) != 0) {
            long j18 = ozjVar.f46965E - ozjVar2.f46965E;
            if (j18 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19249t(j18);
            }
        }
        if ((ozjVar.f46987a & 524288) != 0) {
            oziVar3 = ozjVar.f46966F;
            if (oziVar3 == null) {
                oziVar3 = ozi.f46953e;
            }
        } else {
            oziVar3 = null;
        }
        if ((524288 & ozjVar2.f46987a) != 0) {
            oziVar4 = ozjVar2.f46966F;
            if (oziVar4 == null) {
                oziVar4 = ozi.f46953e;
            }
        } else {
            oziVar4 = null;
        }
        ozi oziVarM15441k2 = m15441k(oziVar3, oziVar4);
        if (oziVarM15441k2 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19250u(oziVarM15441k2);
        }
        if ((ozjVar.f46987a & 1048576) != 0) {
            long j19 = ozjVar.f46967G - ozjVar2.f46967G;
            if (j19 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19251v(j19);
            }
        }
        if ((ozjVar.f46987a & 2097152) != 0) {
            oziVar5 = ozjVar.f46968H;
            if (oziVar5 == null) {
                oziVar5 = ozi.f46953e;
            }
        } else {
            oziVar5 = null;
        }
        if ((2097152 & ozjVar2.f46987a) != 0) {
            oziVar6 = ozjVar2.f46968H;
            if (oziVar6 == null) {
                oziVar6 = ozi.f46953e;
            }
        } else {
            oziVar6 = null;
        }
        ozi oziVarM15441k3 = m15441k(oziVar5, oziVar6);
        if (oziVarM15441k3 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19252w(oziVarM15441k3);
        }
        if ((ozjVar.f46987a & 4194304) != 0) {
            oziVar7 = ozjVar.f46969I;
            if (oziVar7 == null) {
                oziVar7 = ozi.f46953e;
            }
        } else {
            oziVar7 = null;
        }
        if ((4194304 & ozjVar2.f46987a) != 0) {
            oziVar8 = ozjVar2.f46969I;
            if (oziVar8 == null) {
                oziVar8 = ozi.f46953e;
            }
        } else {
            oziVar8 = null;
        }
        ozi oziVarM15441k4 = m15441k(oziVar7, oziVar8);
        if (oziVarM15441k4 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19253x(oziVarM15441k4);
        }
        if ((ozjVar.f46987a & 8388608) != 0) {
            oziVar9 = ozjVar.f46970J;
            if (oziVar9 == null) {
                oziVar9 = ozi.f46953e;
            }
        } else {
            oziVar9 = null;
        }
        if ((ozjVar2.f46987a & 8388608) != 0) {
            oziVar10 = ozjVar2.f46970J;
            if (oziVar10 == null) {
                oziVar10 = ozi.f46953e;
            }
        } else {
            oziVar10 = null;
        }
        ozi oziVarM15441k5 = m15441k(oziVar9, oziVar10);
        if (oziVarM15441k5 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19254y(oziVarM15441k5);
        }
        if ((ozjVar.f46987a & 16777216) != 0) {
            oziVar11 = ozjVar.f46971K;
            if (oziVar11 == null) {
                oziVar11 = ozi.f46953e;
            }
        } else {
            oziVar11 = null;
        }
        if ((ozjVar2.f46987a & 16777216) != 0) {
            oziVar12 = ozjVar2.f46971K;
            if (oziVar12 == null) {
                oziVar12 = ozi.f46953e;
            }
        } else {
            oziVar12 = null;
        }
        ozi oziVarM15441k6 = m15441k(oziVar11, oziVar12);
        if (oziVarM15441k6 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19255z(oziVarM15441k6);
        }
        if ((ozjVar.f46987a & 33554432) != 0) {
            oziVar13 = ozjVar.f46972L;
            if (oziVar13 == null) {
                oziVar13 = ozi.f46953e;
            }
        } else {
            oziVar13 = null;
        }
        if ((ozjVar2.f46987a & 33554432) != 0) {
            oziVar14 = ozjVar2.f46972L;
            if (oziVar14 == null) {
                oziVar14 = ozi.f46953e;
            }
        } else {
            oziVar14 = null;
        }
        ozi oziVarM15441k7 = m15441k(oziVar13, oziVar14);
        if (oziVarM15441k7 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19211A(oziVarM15441k7);
        }
        if ((ozjVar.f46987a & 67108864) != 0) {
            oziVar15 = ozjVar.f46973M;
            if (oziVar15 == null) {
                oziVar15 = ozi.f46953e;
            }
        } else {
            oziVar15 = null;
        }
        if ((ozjVar2.f46987a & 67108864) != 0) {
            oziVar16 = ozjVar2.f46973M;
            if (oziVar16 == null) {
                oziVar16 = ozi.f46953e;
            }
        } else {
            oziVar16 = null;
        }
        ozi oziVarM15441k8 = m15441k(oziVar15, oziVar16);
        if (oziVarM15441k8 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19212B(oziVarM15441k8);
        }
        if ((ozjVar.f46987a & 134217728) != 0) {
            oziVar17 = ozjVar.f46974N;
            if (oziVar17 == null) {
                oziVar17 = ozi.f46953e;
            }
        } else {
            oziVar17 = null;
        }
        if ((ozjVar2.f46987a & 134217728) != 0) {
            oziVar18 = ozjVar2.f46974N;
            if (oziVar18 == null) {
                oziVar18 = ozi.f46953e;
            }
        } else {
            oziVar18 = null;
        }
        ozi oziVarM15441k9 = m15441k(oziVar17, oziVar18);
        if (oziVarM15441k9 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19213C(oziVarM15441k9);
        }
        if ((ozjVar.f46987a & 268435456) != 0) {
            oziVar19 = ozjVar.f46975O;
            if (oziVar19 == null) {
                oziVar19 = ozi.f46953e;
            }
        } else {
            oziVar19 = null;
        }
        if ((ozjVar2.f46987a & 268435456) != 0) {
            oziVar20 = ozjVar2.f46975O;
            if (oziVar20 == null) {
                oziVar20 = ozi.f46953e;
            }
        } else {
            oziVar20 = null;
        }
        ozi oziVarM15441k10 = m15441k(oziVar19, oziVar20);
        if (oziVarM15441k10 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19214D(oziVarM15441k10);
        }
        if ((ozjVar.f46987a & 536870912) != 0) {
            oziVar21 = ozjVar.f46976P;
            if (oziVar21 == null) {
                oziVar21 = ozi.f46953e;
            }
        } else {
            oziVar21 = null;
        }
        if ((ozjVar2.f46987a & 536870912) != 0) {
            oziVar22 = ozjVar2.f46976P;
            if (oziVar22 == null) {
                oziVar22 = ozi.f46953e;
            }
        } else {
            oziVar22 = null;
        }
        ozi oziVarM15441k11 = m15441k(oziVar21, oziVar22);
        if (oziVarM15441k11 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19215E(oziVarM15441k11);
        }
        if ((ozjVar.f46987a & 1073741824) != 0) {
            oziVar23 = ozjVar.f46977Q;
            if (oziVar23 == null) {
                oziVar23 = ozi.f46953e;
            }
        } else {
            oziVar23 = null;
        }
        if ((ozjVar2.f46987a & 1073741824) != 0) {
            oziVar24 = ozjVar2.f46977Q;
            if (oziVar24 == null) {
                oziVar24 = ozi.f46953e;
            }
        } else {
            oziVar24 = null;
        }
        ozi oziVarM15441k12 = m15441k(oziVar23, oziVar24);
        if (oziVarM15441k12 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19216F(oziVarM15441k12);
        }
        if ((ozjVar.f46987a & Integer.MIN_VALUE) != 0) {
            oziVar25 = ozjVar.f46978R;
            if (oziVar25 == null) {
                oziVar25 = ozi.f46953e;
            }
        } else {
            oziVar25 = null;
        }
        if ((ozjVar2.f46987a & Integer.MIN_VALUE) != 0) {
            oziVar26 = ozjVar2.f46978R;
            if (oziVar26 == null) {
                oziVar26 = ozi.f46953e;
            }
        } else {
            oziVar26 = null;
        }
        ozi oziVarM15441k13 = m15441k(oziVar25, oziVar26);
        if (oziVarM15441k13 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19217ag(oziVarM15441k13);
        }
        if ((ozjVar.f47001b & 1) != 0) {
            oziVar27 = ozjVar.f46979S;
            if (oziVar27 == null) {
                oziVar27 = ozi.f46953e;
            }
        } else {
            oziVar27 = null;
        }
        if ((ozjVar2.f47001b & 1) != 0) {
            oziVar28 = ozjVar2.f46979S;
            if (oziVar28 == null) {
                oziVar28 = ozi.f46953e;
            }
        } else {
            oziVar28 = null;
        }
        ozi oziVarM15441k14 = m15441k(oziVar27, oziVar28);
        if (oziVarM15441k14 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19218ah(oziVarM15441k14);
        }
        if ((ozjVar.f47001b & 2) != 0) {
            oziVar29 = ozjVar.f46980T;
            if (oziVar29 == null) {
                oziVar29 = ozi.f46953e;
            }
        } else {
            oziVar29 = null;
        }
        if ((ozjVar2.f47001b & 2) != 0) {
            oziVar30 = ozjVar2.f46980T;
            if (oziVar30 == null) {
                oziVar30 = ozi.f46953e;
            }
        } else {
            oziVar30 = null;
        }
        ozi oziVarM15441k15 = m15441k(oziVar29, oziVar30);
        if (oziVarM15441k15 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((ozj) nxlVarM18137O.f44974b).m19219ai(oziVarM15441k15);
        }
        if ((ozjVar.f47001b & 4) != 0) {
            long j20 = ozjVar.f46981U - ozjVar2.f46981U;
            if (j20 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19220aj(j20);
            }
        }
        if ((ozjVar.f47001b & 8) != 0) {
            long j21 = ozjVar.f46982V - ozjVar2.f46982V;
            if (j21 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19221ak(j21);
            }
        }
        if ((ozjVar.f47001b & 16) != 0) {
            long j22 = ozjVar.f46983W - ozjVar2.f46983W;
            if (j22 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19222al(j22);
            }
        }
        if ((ozjVar.f47001b & 32) != 0) {
            long j23 = ozjVar.f46984X - ozjVar2.f46984X;
            if (j23 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19223am(j23);
            }
        }
        if ((ozjVar.f47001b & 64) != 0) {
            long j24 = ozjVar.f46985Y - ozjVar2.f46985Y;
            if (j24 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19224an(j24);
            }
        }
        if ((ozjVar.f47001b & 128) != 0) {
            long j25 = ozjVar.f46986Z - ozjVar2.f46986Z;
            if (j25 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19225ao(j25);
            }
        }
        if ((ozjVar.f47001b & 256) != 0) {
            long j26 = ozjVar.f46988aa - ozjVar2.f46988aa;
            if (j26 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19226ap(j26);
            }
        }
        if ((ozjVar.f47001b & 512) != 0) {
            long j27 = ozjVar.f46989ab - ozjVar2.f46989ab;
            if (j27 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19227aq(j27);
            }
        }
        if ((ozjVar.f47001b & 1024) != 0) {
            long j28 = ozjVar.f46990ac - ozjVar2.f46990ac;
            if (j28 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19228ar(j28);
            }
        }
        if ((ozjVar.f47001b & 2048) != 0) {
            long j29 = ozjVar.f46991ad - ozjVar2.f46991ad;
            if (j29 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((ozj) nxlVarM18137O.f44974b).m19229as(j29);
            }
        }
        if ((ozjVar.f47001b & 4096) != 0) {
            long j30 = ozjVar.f46992ae - ozjVar2.f46992ae;
            if (j30 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar14 = (ozj) nxlVarM18137O.f44974b;
                ozjVar14.f47001b |= 4096;
                ozjVar14.f46992ae = j30;
            }
        }
        if ((ozjVar.f47001b & 8192) != 0) {
            long j31 = ozjVar.f46993af - ozjVar2.f46993af;
            if (j31 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar15 = (ozj) nxlVarM18137O.f44974b;
                ozjVar15.f47001b |= 8192;
                ozjVar15.f46993af = j31;
            }
        }
        if ((ozjVar.f47001b & 16384) != 0) {
            long j32 = ozjVar.f46994ag - ozjVar2.f46994ag;
            if (j32 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar16 = (ozj) nxlVarM18137O.f44974b;
                ozjVar16.f47001b |= 16384;
                ozjVar16.f46994ag = j32;
            }
        }
        if ((ozjVar.f47001b & 32768) != 0) {
            long j33 = ozjVar.f46995ah - ozjVar2.f46995ah;
            if (j33 != 0) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozj ozjVar17 = (ozj) nxlVarM18137O.f44974b;
                ozjVar17.f47001b = 32768 | ozjVar17.f47001b;
                ozjVar17.f46995ah = j33;
            }
        }
        if ((ozjVar.f47001b & 65536) != 0) {
            long j34 = ozjVar.f46996ai - ozjVar2.f46996ai;
            if (j34 != 0) {
                nxlVarM18137O.m18082al(j34);
            }
        }
        ozi oziVarM15441k16 = m15441k(ozjVar.m19230at() ? ozjVar.m19231au() : null, ozjVar2.m19230at() ? ozjVar2.m19231au() : null);
        if (oziVarM15441k16 != null) {
            nxlVarM18137O.m18085ao(oziVarM15441k16);
        }
        if (ozjVar.m19232av()) {
            long j35 = ozjVar.f46998ak - ozjVar2.f46998ak;
            if (j35 != 0) {
                nxlVarM18137O.m18089as(j35);
            }
        }
        if (ozjVar.m19233aw()) {
            long j36 = ozjVar.f46999al - ozjVar2.f46999al;
            if (j36 != 0) {
                nxlVarM18137O.m18088ar(j36);
            }
        }
        if (ozjVar.m19234ax()) {
            long j37 = ozjVar.f47000am - ozjVar2.f47000am;
            if (j37 != 0) {
                nxlVarM18137O.m18083am(j37);
            }
        }
        ozj ozjVar18 = (ozj) nxlVarM18137O.mo18103l();
        if (m15447q(ozjVar18)) {
            return null;
        }
        return ozjVar18;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m15444n(oze ozeVar) {
        if (ozeVar != null) {
            return ozeVar.f46932b.size() == 0 && ozeVar.f46933c.size() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m15445o(ozg ozgVar) {
        if (ozgVar != null) {
            return ozgVar.f46940b <= 0 && ozgVar.f46941c <= 0 && ozgVar.f46942d <= 0 && ozgVar.f46943e <= 0 && ozgVar.f46944f <= 0 && ozgVar.f46945g <= 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m15446p(ozh ozhVar) {
        if (ozhVar != null) {
            return ((long) ozhVar.f46950b) <= 0 && ((long) ozhVar.f46951c) <= 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    static boolean m15447q(ozj ozjVar) {
        if (ozjVar != null) {
            return ozjVar.f47002c <= 0 && ozjVar.f47003d <= 0 && ozjVar.f47004e <= 0 && ozjVar.f47005f <= 0 && ozjVar.f47006g.size() == 0 && ozjVar.f47007h.size() == 0 && ozjVar.f47008i.size() == 0 && ozjVar.f47009j.size() == 0 && ozjVar.f47010k.size() == 0 && ozjVar.f47011l.size() == 0 && ozjVar.f47013n.size() == 0 && ozjVar.f47014o.size() == 0 && ozjVar.f47015p.size() == 0 && ozjVar.f47016q.size() == 0 && ozjVar.f47017r <= 0 && ozjVar.f47018s <= 0 && ozjVar.f47019t <= 0 && ozjVar.f47020u <= 0 && ozjVar.f47021v <= 0 && ozjVar.f47022w <= 0 && ozjVar.f47023x <= 0 && ozjVar.f47024y <= 0 && ozjVar.f47025z <= 0 && ozjVar.f46961A <= 0 && ozjVar.f46962B <= 0 && ozjVar.f46963C <= 0 && ozjVar.f46964D <= 0 && ozjVar.f46965E <= 0 && ozjVar.f46967G <= 0 && ozjVar.f46981U <= 0 && ozjVar.f46982V <= 0 && ozjVar.f46983W <= 0 && ozjVar.f46984X <= 0 && ozjVar.f46985Y <= 0 && ozjVar.f46986Z <= 0 && ozjVar.f46988aa <= 0 && ozjVar.f46989ab <= 0 && ozjVar.f46990ac <= 0 && ozjVar.f46991ad <= 0 && ozjVar.f46992ae <= 0 && ozjVar.f46993af <= 0 && ozjVar.f46994ag <= 0 && ozjVar.f46995ah <= 0 && ozjVar.f46996ai <= 0 && ozjVar.f46998ak <= 0 && ozjVar.f46999al <= 0 && ozjVar.f47000am <= 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static void m15448r(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: s */
    public static File m15449s(Uri uri) throws lsj {
        if (!uri.getScheme().equals("file")) {
            throw new lsj("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new lsj("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new lsj("Did not expect uri to have authority");
    }

    /* JADX INFO: renamed from: t */
    public static File m15450t(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    /* JADX INFO: renamed from: u */
    public static Handler m15451u() {
        if (f38308b == null) {
            f38308b = new Handler(Looper.getMainLooper());
        }
        return f38308b;
    }

    /* JADX INFO: renamed from: v */
    public static void m15452v() {
        if (m15455y()) {
            throw new lrw("Must be called on a background thread");
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m15453w() {
        if (!m15455y()) {
            throw new lrw("Must be called on the main thread");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m15454x(Runnable runnable) {
        m15451u().post(runnable);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m15455y() {
        return m15456z(Thread.currentThread());
    }

    /* JADX INFO: renamed from: z */
    public static boolean m15456z(Thread thread) {
        if (f38307a == null) {
            f38307a = Looper.getMainLooper().getThread();
        }
        return thread == f38307a;
    }

    /* JADX INFO: renamed from: M */
    public void mo15457M(oeo oeoVar) {
    }

    /* JADX INFO: renamed from: ac */
    public final boolean m15458ac(Object obj, nzi nziVar) throws nyb {
        nwx nwxVar = (nwx) nziVar;
        int i = nwxVar.f44881b;
        int iM18386a = oal.m18386a(i);
        switch (oal.m18387b(i)) {
            case 0:
                m15422ae(obj, iM18386a, nziVar.mo17912k());
                return true;
            case 1:
                nzy nzyVar = (nzy) obj;
                nzyVar.m18334f(oal.m18388c(iM18386a, 1), Long.valueOf(nziVar.mo17911j()));
                return true;
            case 2:
                m15421ad(obj, iM18386a, nziVar.mo17916o());
                return true;
            case 3:
                int iM18388c = oal.m18388c(iM18386a, 4);
                nzy nzyVarM18329b = nzy.m18329b();
                while (nziVar.mo17904c() != Integer.MAX_VALUE && m15458ac(nzyVarM18329b, nziVar)) {
                }
                if (iM18388c != nwxVar.f44881b) {
                    throw nyb.m18160b();
                }
                nzyVarM18329b.m18333e();
                ((nzy) obj).m18334f(oal.m18388c(iM18386a, 3), nzyVarM18329b);
                return true;
            case 4:
                return false;
            case 5:
                nzy nzyVar2 = (nzy) obj;
                nzyVar2.m18334f(oal.m18388c(iM18386a, 5), Integer.valueOf(nziVar.mo17906e()));
                return true;
            default:
                throw nyb.m18159a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[PHI: r2
      0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX INFO: renamed from: X */
    public static void m15415X(byte b, byte b2, byte b3, char[] cArr, int i) throws nyb {
        if (!m15430am(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m15430am(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (m15429al(b2) << 6) | m15429al(b3));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m15430am(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (m15429al(b2) << 6) | m15429al(b3));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m15430am(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (m15429al(b2) << 6) | m15429al(b3));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m15430am(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (m15429al(b2) << 6) | m15429al(b3));
                        return;
                    }
                }
            }
        }
        throw nyb.m18162d();
    }
}
