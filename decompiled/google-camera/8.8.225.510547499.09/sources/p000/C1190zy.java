package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.lens.sdk.LensApi;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: zy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1190zy {

    /* JADX INFO: renamed from: a */
    public static final int[] f48589a = {0, 4, 8};

    /* JADX INFO: renamed from: b */
    private static final SparseIntArray f48590b;

    /* JADX INFO: renamed from: c */
    private static final SparseIntArray f48591c;

    /* JADX INFO: renamed from: d */
    private final HashMap f48592d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final HashMap f48593e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f48590b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f48591c = sparseIntArray2;
        int[] iArr = aad.f1a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: a */
    public static int m19810a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: m */
    static void m19811m(Object obj, TypedArray typedArray, int i, int i2) {
        int iIndexOf;
        boolean z = true;
        int dimensionPixelSize = 0;
        switch (typedArray.peekValue(i).type) {
            case 3:
                String string = typedArray.getString(i);
                if (string != null && (iIndexOf = string.indexOf(61)) > 0 && iIndexOf < string.length() - 1) {
                    String strSubstring = string.substring(0, iIndexOf);
                    String strSubstring2 = string.substring(iIndexOf + 1);
                    if (strSubstring2.length() > 0) {
                        String strTrim = strSubstring.trim();
                        String strTrim2 = strSubstring2.trim();
                        if ("ratio".equalsIgnoreCase(strTrim)) {
                            if (obj instanceof C1178zm) {
                                C1178zm c1178zm = (C1178zm) obj;
                                if (i2 == 0) {
                                    c1178zm.width = 0;
                                } else {
                                    c1178zm.height = 0;
                                }
                                m19812n(c1178zm, strTrim2);
                                return;
                            }
                            if (obj instanceof C1186zu) {
                                ((C1186zu) obj).f48486A = strTrim2;
                                return;
                            } else {
                                if (obj instanceof C1184zs) {
                                    ((C1184zs) obj).m19807c(5, strTrim2);
                                    return;
                                }
                                return;
                            }
                        }
                        if ("weight".equalsIgnoreCase(strTrim)) {
                            try {
                                float f = Float.parseFloat(strTrim2);
                                if (obj instanceof C1178zm) {
                                    C1178zm c1178zm2 = (C1178zm) obj;
                                    if (i2 == 0) {
                                        c1178zm2.width = 0;
                                        c1178zm2.f48378L = f;
                                        return;
                                    } else {
                                        c1178zm2.height = 0;
                                        c1178zm2.f48379M = f;
                                        return;
                                    }
                                }
                                if (obj instanceof C1186zu) {
                                    C1186zu c1186zu = (C1186zu) obj;
                                    if (i2 == 0) {
                                        c1186zu.f48531d = 0;
                                        c1186zu.f48508W = f;
                                        return;
                                    } else {
                                        c1186zu.f48532e = 0;
                                        c1186zu.f48507V = f;
                                        return;
                                    }
                                }
                                if (obj instanceof C1184zs) {
                                    C1184zs c1184zs = (C1184zs) obj;
                                    if (i2 == 0) {
                                        c1184zs.m19806b(23, 0);
                                        c1184zs.m19805a(39, f);
                                        return;
                                    } else {
                                        c1184zs.m19806b(21, 0);
                                        c1184zs.m19805a(40, f);
                                        return;
                                    }
                                }
                                return;
                            } catch (NumberFormatException e) {
                                return;
                            }
                        }
                        if ("parent".equalsIgnoreCase(strTrim)) {
                            try {
                                float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                                if (obj instanceof C1178zm) {
                                    C1178zm c1178zm3 = (C1178zm) obj;
                                    if (i2 == 0) {
                                        c1178zm3.width = 0;
                                        c1178zm3.f48388V = fMax;
                                        c1178zm3.f48382P = 2;
                                        return;
                                    } else {
                                        c1178zm3.height = 0;
                                        c1178zm3.f48389W = fMax;
                                        c1178zm3.f48383Q = 2;
                                        return;
                                    }
                                }
                                if (obj instanceof C1186zu) {
                                    C1186zu c1186zu2 = (C1186zu) obj;
                                    if (i2 == 0) {
                                        c1186zu2.f48531d = 0;
                                        c1186zu2.f48517af = fMax;
                                        c1186zu2.f48511Z = 2;
                                        return;
                                    } else {
                                        c1186zu2.f48532e = 0;
                                        c1186zu2.f48518ag = fMax;
                                        c1186zu2.f48512aa = 2;
                                        return;
                                    }
                                }
                                if (obj instanceof C1184zs) {
                                    C1184zs c1184zs2 = (C1184zs) obj;
                                    if (i2 == 0) {
                                        c1184zs2.m19806b(23, 0);
                                        c1184zs2.m19806b(54, 2);
                                        return;
                                    } else {
                                        c1184zs2.m19806b(21, 0);
                                        c1184zs2.m19806b(55, 2);
                                        return;
                                    }
                                }
                                return;
                            } catch (NumberFormatException e2) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
            default:
                int i3 = typedArray.getInt(i, 0);
                switch (i3) {
                    case -4:
                        dimensionPixelSize = -2;
                        break;
                    case -2:
                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                        dimensionPixelSize = i3;
                    case -3:
                        z = false;
                        break;
                    default:
                        z = false;
                        break;
                }
                break;
            case 5:
                dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
                z = false;
                break;
        }
        if (obj instanceof C1178zm) {
            C1178zm c1178zm4 = (C1178zm) obj;
            if (i2 == 0) {
                c1178zm4.width = dimensionPixelSize;
                c1178zm4.f48394aa = z;
                return;
            } else {
                c1178zm4.height = dimensionPixelSize;
                c1178zm4.f48395ab = z;
                return;
            }
        }
        if (obj instanceof C1186zu) {
            C1186zu c1186zu3 = (C1186zu) obj;
            if (i2 == 0) {
                c1186zu3.f48531d = dimensionPixelSize;
                c1186zu3.f48525an = z;
                return;
            } else {
                c1186zu3.f48532e = dimensionPixelSize;
                c1186zu3.f48526ao = z;
                return;
            }
        }
        if (obj instanceof C1184zs) {
            C1184zs c1184zs3 = (C1184zs) obj;
            if (i2 == 0) {
                c1184zs3.m19806b(23, dimensionPixelSize);
                c1184zs3.m19808d(80, z);
            } else {
                c1184zs3.m19806b(21, dimensionPixelSize);
                c1184zs3.m19808d(81, z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[PHI: r1
      0x0076: PHI (r1v4 float) = (r1v0 float), (r1v0 float), (r1v0 float), (r1v0 float), (r1v5 float) binds: [B:22:0x004f, B:24:0x0055, B:26:0x0062, B:28:0x0066, B:31:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n */
    static void m19812n(C1178zm c1178zm, String str) {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            int i3 = 0;
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i3 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i4 = i3;
                i3 = iIndexOf + 1;
                i = i4;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i3);
                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : Float.NaN;
                    i2 = i;
                } else {
                    String strSubstring3 = str.substring(i3, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        i2 = i;
                    } else {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f <= 0.0f || f2 <= 0.0f) {
                            i2 = i;
                        } else if (i == 1) {
                            fAbs = Math.abs(f2 / f);
                            i2 = i;
                        } else {
                            fAbs = Math.abs(f / f2);
                            i2 = i;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                i2 = i;
            }
        }
        c1178zm.f48375I = str;
        c1178zm.f48376J = fAbs;
        c1178zm.f48377K = i2;
    }

    /* JADX INFO: renamed from: u */
    private static void m19813u(C1185zt c1185zt, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C1184zs c1184zs = new C1184zs();
        c1185zt.f48484g = c1184zs;
        c1185zt.f48480c.f48555b = false;
        c1185zt.f48481d.f48530c = false;
        c1185zt.f48479b.f48569a = false;
        c1185zt.f48482e.f48575b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f48591c.get(index)) {
                case 2:
                    c1184zs.m19806b(2, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48496K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f48590b.get(index));
                    break;
                case 5:
                    c1184zs.m19807c(5, typedArray.getString(index));
                    break;
                case 6:
                    c1184zs.m19806b(6, typedArray.getDimensionPixelOffset(index, c1185zt.f48481d.f48490E));
                    break;
                case 7:
                    c1184zs.m19806b(7, typedArray.getDimensionPixelOffset(index, c1185zt.f48481d.f48491F));
                    break;
                case 8:
                    c1184zs.m19806b(8, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48497L));
                    break;
                case 11:
                    c1184zs.m19806b(11, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48503R));
                    break;
                case 12:
                    c1184zs.m19806b(12, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48504S));
                    break;
                case 13:
                    c1184zs.m19806b(13, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48500O));
                    break;
                case 14:
                    c1184zs.m19806b(14, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48502Q));
                    break;
                case 15:
                    c1184zs.m19806b(15, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48505T));
                    break;
                case 16:
                    c1184zs.m19806b(16, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48501P));
                    break;
                case 17:
                    c1184zs.m19806b(17, typedArray.getDimensionPixelOffset(index, c1185zt.f48481d.f48533f));
                    break;
                case 18:
                    c1184zs.m19806b(18, typedArray.getDimensionPixelOffset(index, c1185zt.f48481d.f48534g));
                    break;
                case 19:
                    c1184zs.m19805a(19, typedArray.getFloat(index, c1185zt.f48481d.f48535h));
                    break;
                case 20:
                    c1184zs.m19805a(20, typedArray.getFloat(index, c1185zt.f48481d.f48552y));
                    break;
                case 21:
                    c1184zs.m19806b(21, typedArray.getLayoutDimension(index, c1185zt.f48481d.f48532e));
                    break;
                case 22:
                    c1184zs.m19806b(22, f48589a[typedArray.getInt(index, c1185zt.f48479b.f48570b)]);
                    break;
                case 23:
                    c1184zs.m19806b(23, typedArray.getLayoutDimension(index, c1185zt.f48481d.f48531d));
                    break;
                case 24:
                    c1184zs.m19806b(24, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48493H));
                    break;
                case 27:
                    c1184zs.m19806b(27, typedArray.getInt(index, c1185zt.f48481d.f48492G));
                    break;
                case 28:
                    c1184zs.m19806b(28, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48494I));
                    break;
                case 31:
                    c1184zs.m19806b(31, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48498M));
                    break;
                case 34:
                    c1184zs.m19806b(34, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48495J));
                    break;
                case 37:
                    c1184zs.m19805a(37, typedArray.getFloat(index, c1185zt.f48481d.f48553z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c1185zt.f48478a);
                    c1185zt.f48478a = resourceId;
                    c1184zs.m19806b(38, resourceId);
                    break;
                case 39:
                    c1184zs.m19805a(39, typedArray.getFloat(index, c1185zt.f48481d.f48508W));
                    break;
                case 40:
                    c1184zs.m19805a(40, typedArray.getFloat(index, c1185zt.f48481d.f48507V));
                    break;
                case 41:
                    c1184zs.m19806b(41, typedArray.getInt(index, c1185zt.f48481d.f48509X));
                    break;
                case 42:
                    c1184zs.m19806b(42, typedArray.getInt(index, c1185zt.f48481d.f48510Y));
                    break;
                case 43:
                    c1184zs.m19805a(43, typedArray.getFloat(index, c1185zt.f48479b.f48572d));
                    break;
                case 44:
                    c1184zs.m19808d(44, true);
                    c1184zs.m19805a(44, typedArray.getDimension(index, c1185zt.f48482e.f48588o));
                    break;
                case 45:
                    c1184zs.m19805a(45, typedArray.getFloat(index, c1185zt.f48482e.f48577d));
                    break;
                case 46:
                    c1184zs.m19805a(46, typedArray.getFloat(index, c1185zt.f48482e.f48578e));
                    break;
                case 47:
                    c1184zs.m19805a(47, typedArray.getFloat(index, c1185zt.f48482e.f48579f));
                    break;
                case 48:
                    c1184zs.m19805a(48, typedArray.getFloat(index, c1185zt.f48482e.f48580g));
                    break;
                case 49:
                    c1184zs.m19805a(49, typedArray.getDimension(index, c1185zt.f48482e.f48581h));
                    break;
                case 50:
                    c1184zs.m19805a(50, typedArray.getDimension(index, c1185zt.f48482e.f48582i));
                    break;
                case 51:
                    c1184zs.m19805a(51, typedArray.getDimension(index, c1185zt.f48482e.f48584k));
                    break;
                case 52:
                    c1184zs.m19805a(52, typedArray.getDimension(index, c1185zt.f48482e.f48585l));
                    break;
                case 53:
                    c1184zs.m19805a(53, typedArray.getDimension(index, c1185zt.f48482e.f48586m));
                    break;
                case 54:
                    c1184zs.m19806b(54, typedArray.getInt(index, c1185zt.f48481d.f48511Z));
                    break;
                case 55:
                    c1184zs.m19806b(55, typedArray.getInt(index, c1185zt.f48481d.f48512aa));
                    break;
                case 56:
                    c1184zs.m19806b(56, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48513ab));
                    break;
                case 57:
                    c1184zs.m19806b(57, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48514ac));
                    break;
                case 58:
                    c1184zs.m19806b(58, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48515ad));
                    break;
                case 59:
                    c1184zs.m19806b(59, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48516ae));
                    break;
                case 60:
                    c1184zs.m19805a(60, typedArray.getFloat(index, c1185zt.f48482e.f48576c));
                    break;
                case 62:
                    c1184zs.m19806b(62, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48488C));
                    break;
                case 63:
                    c1184zs.m19805a(63, typedArray.getFloat(index, c1185zt.f48481d.f48489D));
                    break;
                case 64:
                    c1184zs.m19806b(64, m19810a(typedArray, index, c1185zt.f48480c.f48556c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c1184zs.m19807c(65, typedArray.getString(index));
                    } else {
                        c1184zs.m19807c(65, C1147yi.f48141a[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c1184zs.m19806b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c1184zs.m19805a(67, typedArray.getFloat(index, c1185zt.f48480c.f48563j));
                    break;
                case 68:
                    c1184zs.m19805a(68, typedArray.getFloat(index, c1185zt.f48479b.f48573e));
                    break;
                case 69:
                    c1184zs.m19805a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c1184zs.m19805a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c1184zs.m19806b(72, typedArray.getInt(index, c1185zt.f48481d.f48519ah));
                    break;
                case 73:
                    c1184zs.m19806b(73, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48520ai));
                    break;
                case 74:
                    c1184zs.m19807c(74, typedArray.getString(index));
                    break;
                case 75:
                    c1184zs.m19808d(75, typedArray.getBoolean(index, c1185zt.f48481d.f48527ap));
                    break;
                case 76:
                    c1184zs.m19806b(76, typedArray.getInt(index, c1185zt.f48480c.f48559f));
                    break;
                case 77:
                    c1184zs.m19807c(77, typedArray.getString(index));
                    break;
                case 78:
                    c1184zs.m19806b(78, typedArray.getInt(index, c1185zt.f48479b.f48571c));
                    break;
                case 79:
                    c1184zs.m19805a(79, typedArray.getFloat(index, c1185zt.f48480c.f48561h));
                    break;
                case 80:
                    c1184zs.m19808d(80, typedArray.getBoolean(index, c1185zt.f48481d.f48525an));
                    break;
                case 81:
                    c1184zs.m19808d(81, typedArray.getBoolean(index, c1185zt.f48481d.f48526ao));
                    break;
                case 82:
                    c1184zs.m19806b(82, typedArray.getInteger(index, c1185zt.f48480c.f48557d));
                    break;
                case 83:
                    c1184zs.m19806b(83, m19810a(typedArray, index, c1185zt.f48482e.f48583j));
                    break;
                case 84:
                    c1184zs.m19806b(84, typedArray.getInteger(index, c1185zt.f48480c.f48565l));
                    break;
                case 85:
                    c1184zs.m19805a(85, typedArray.getFloat(index, c1185zt.f48480c.f48564k));
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        c1185zt.f48480c.f48568o = typedArray.getResourceId(index, -1);
                        c1184zs.m19806b(89, c1185zt.f48480c.f48568o);
                        C1187zv c1187zv = c1185zt.f48480c;
                        if (c1187zv.f48568o != -1) {
                            c1187zv.f48567n = -2;
                            c1184zs.m19806b(88, -2);
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        c1185zt.f48480c.f48566m = typedArray.getString(index);
                        c1184zs.m19807c(90, c1185zt.f48480c.f48566m);
                        if (c1185zt.f48480c.f48566m.indexOf("/") > 0) {
                            c1185zt.f48480c.f48568o = typedArray.getResourceId(index, -1);
                            c1184zs.m19806b(89, c1185zt.f48480c.f48568o);
                            c1185zt.f48480c.f48567n = -2;
                            c1184zs.m19806b(88, -2);
                        } else {
                            c1185zt.f48480c.f48567n = -1;
                            c1184zs.m19806b(88, -1);
                        }
                    } else {
                        C1187zv c1187zv2 = c1185zt.f48480c;
                        c1187zv2.f48567n = typedArray.getInteger(index, c1187zv2.f48568o);
                        c1184zs.m19806b(88, c1185zt.f48480c.f48567n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", PMZiHihxLGEy.KuNYcKOaOlFU + Integer.toHexString(index) + "   " + f48590b.get(index));
                    break;
                case 93:
                    c1184zs.m19806b(93, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48499N));
                    break;
                case 94:
                    c1184zs.m19806b(94, typedArray.getDimensionPixelSize(index, c1185zt.f48481d.f48506U));
                    break;
                case 95:
                    m19811m(c1184zs, typedArray, index, 0);
                    break;
                case 96:
                    m19811m(c1184zs, typedArray, index, 1);
                    break;
                case 97:
                    c1184zs.m19806b(97, typedArray.getInt(index, c1185zt.f48481d.f48528aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                    } else {
                        c1185zt.f48478a = typedArray.getResourceId(index, c1185zt.f48478a);
                    }
                    break;
                case 99:
                    c1184zs.m19808d(99, typedArray.getBoolean(index, c1185zt.f48481d.f48536i));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private static final int[] m19814v(View view, String str) {
        int length;
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = aac.class.getField(strTrim).getInt(null);
            } catch (Exception e) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) ? ((Integer) designInformation).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: w */
    private static final C1185zt m19815w(Context context, AttributeSet attributeSet, boolean z) {
        C1185zt c1185zt = new C1185zt();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? aad.f3c : aad.f1a);
        if (z) {
            m19813u(c1185zt, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    c1185zt.f48480c.f48555b = true;
                    c1185zt.f48481d.f48530c = true;
                    c1185zt.f48479b.f48569a = true;
                    c1185zt.f48482e.f48575b = true;
                }
                SparseIntArray sparseIntArray = f48590b;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        C1186zu c1186zu = c1185zt.f48481d;
                        c1186zu.f48545r = m19810a(typedArrayObtainStyledAttributes, index, c1186zu.f48545r);
                        break;
                    case 2:
                        C1186zu c1186zu2 = c1185zt.f48481d;
                        c1186zu2.f48496K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu2.f48496K);
                        break;
                    case 3:
                        C1186zu c1186zu3 = c1185zt.f48481d;
                        c1186zu3.f48544q = m19810a(typedArrayObtainStyledAttributes, index, c1186zu3.f48544q);
                        break;
                    case 4:
                        C1186zu c1186zu4 = c1185zt.f48481d;
                        c1186zu4.f48543p = m19810a(typedArrayObtainStyledAttributes, index, c1186zu4.f48543p);
                        break;
                    case 5:
                        c1185zt.f48481d.f48486A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        C1186zu c1186zu5 = c1185zt.f48481d;
                        c1186zu5.f48490E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1186zu5.f48490E);
                        break;
                    case 7:
                        C1186zu c1186zu6 = c1185zt.f48481d;
                        c1186zu6.f48491F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1186zu6.f48491F);
                        break;
                    case 8:
                        C1186zu c1186zu7 = c1185zt.f48481d;
                        c1186zu7.f48497L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu7.f48497L);
                        break;
                    case 9:
                        C1186zu c1186zu8 = c1185zt.f48481d;
                        c1186zu8.f48551x = m19810a(typedArrayObtainStyledAttributes, index, c1186zu8.f48551x);
                        break;
                    case 10:
                        C1186zu c1186zu9 = c1185zt.f48481d;
                        c1186zu9.f48550w = m19810a(typedArrayObtainStyledAttributes, index, c1186zu9.f48550w);
                        break;
                    case 11:
                        C1186zu c1186zu10 = c1185zt.f48481d;
                        c1186zu10.f48503R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu10.f48503R);
                        break;
                    case 12:
                        C1186zu c1186zu11 = c1185zt.f48481d;
                        c1186zu11.f48504S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu11.f48504S);
                        break;
                    case 13:
                        C1186zu c1186zu12 = c1185zt.f48481d;
                        c1186zu12.f48500O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu12.f48500O);
                        break;
                    case 14:
                        C1186zu c1186zu13 = c1185zt.f48481d;
                        c1186zu13.f48502Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu13.f48502Q);
                        break;
                    case 15:
                        C1186zu c1186zu14 = c1185zt.f48481d;
                        c1186zu14.f48505T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu14.f48505T);
                        break;
                    case 16:
                        C1186zu c1186zu15 = c1185zt.f48481d;
                        c1186zu15.f48501P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu15.f48501P);
                        break;
                    case 17:
                        C1186zu c1186zu16 = c1185zt.f48481d;
                        c1186zu16.f48533f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1186zu16.f48533f);
                        break;
                    case 18:
                        C1186zu c1186zu17 = c1185zt.f48481d;
                        c1186zu17.f48534g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1186zu17.f48534g);
                        break;
                    case 19:
                        C1186zu c1186zu18 = c1185zt.f48481d;
                        c1186zu18.f48535h = typedArrayObtainStyledAttributes.getFloat(index, c1186zu18.f48535h);
                        break;
                    case 20:
                        C1186zu c1186zu19 = c1185zt.f48481d;
                        c1186zu19.f48552y = typedArrayObtainStyledAttributes.getFloat(index, c1186zu19.f48552y);
                        break;
                    case 21:
                        C1186zu c1186zu20 = c1185zt.f48481d;
                        c1186zu20.f48532e = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1186zu20.f48532e);
                        break;
                    case 22:
                        C1188zw c1188zw = c1185zt.f48479b;
                        c1188zw.f48570b = typedArrayObtainStyledAttributes.getInt(index, c1188zw.f48570b);
                        C1188zw c1188zw2 = c1185zt.f48479b;
                        c1188zw2.f48570b = f48589a[c1188zw2.f48570b];
                        break;
                    case 23:
                        C1186zu c1186zu21 = c1185zt.f48481d;
                        c1186zu21.f48531d = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1186zu21.f48531d);
                        break;
                    case 24:
                        C1186zu c1186zu22 = c1185zt.f48481d;
                        c1186zu22.f48493H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu22.f48493H);
                        break;
                    case 25:
                        C1186zu c1186zu23 = c1185zt.f48481d;
                        c1186zu23.f48537j = m19810a(typedArrayObtainStyledAttributes, index, c1186zu23.f48537j);
                        break;
                    case 26:
                        C1186zu c1186zu24 = c1185zt.f48481d;
                        c1186zu24.f48538k = m19810a(typedArrayObtainStyledAttributes, index, c1186zu24.f48538k);
                        break;
                    case 27:
                        C1186zu c1186zu25 = c1185zt.f48481d;
                        c1186zu25.f48492G = typedArrayObtainStyledAttributes.getInt(index, c1186zu25.f48492G);
                        break;
                    case 28:
                        C1186zu c1186zu26 = c1185zt.f48481d;
                        c1186zu26.f48494I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu26.f48494I);
                        break;
                    case 29:
                        C1186zu c1186zu27 = c1185zt.f48481d;
                        c1186zu27.f48539l = m19810a(typedArrayObtainStyledAttributes, index, c1186zu27.f48539l);
                        break;
                    case 30:
                        C1186zu c1186zu28 = c1185zt.f48481d;
                        c1186zu28.f48540m = m19810a(typedArrayObtainStyledAttributes, index, c1186zu28.f48540m);
                        break;
                    case 31:
                        C1186zu c1186zu29 = c1185zt.f48481d;
                        c1186zu29.f48498M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu29.f48498M);
                        break;
                    case 32:
                        C1186zu c1186zu30 = c1185zt.f48481d;
                        c1186zu30.f48548u = m19810a(typedArrayObtainStyledAttributes, index, c1186zu30.f48548u);
                        break;
                    case 33:
                        C1186zu c1186zu31 = c1185zt.f48481d;
                        c1186zu31.f48549v = m19810a(typedArrayObtainStyledAttributes, index, c1186zu31.f48549v);
                        break;
                    case 34:
                        C1186zu c1186zu32 = c1185zt.f48481d;
                        c1186zu32.f48495J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu32.f48495J);
                        break;
                    case 35:
                        C1186zu c1186zu33 = c1185zt.f48481d;
                        c1186zu33.f48542o = m19810a(typedArrayObtainStyledAttributes, index, c1186zu33.f48542o);
                        break;
                    case 36:
                        C1186zu c1186zu34 = c1185zt.f48481d;
                        c1186zu34.f48541n = m19810a(typedArrayObtainStyledAttributes, index, c1186zu34.f48541n);
                        break;
                    case 37:
                        C1186zu c1186zu35 = c1185zt.f48481d;
                        c1186zu35.f48553z = typedArrayObtainStyledAttributes.getFloat(index, c1186zu35.f48553z);
                        break;
                    case 38:
                        c1185zt.f48478a = typedArrayObtainStyledAttributes.getResourceId(index, c1185zt.f48478a);
                        break;
                    case 39:
                        C1186zu c1186zu36 = c1185zt.f48481d;
                        c1186zu36.f48508W = typedArrayObtainStyledAttributes.getFloat(index, c1186zu36.f48508W);
                        break;
                    case 40:
                        C1186zu c1186zu37 = c1185zt.f48481d;
                        c1186zu37.f48507V = typedArrayObtainStyledAttributes.getFloat(index, c1186zu37.f48507V);
                        break;
                    case 41:
                        C1186zu c1186zu38 = c1185zt.f48481d;
                        c1186zu38.f48509X = typedArrayObtainStyledAttributes.getInt(index, c1186zu38.f48509X);
                        break;
                    case 42:
                        C1186zu c1186zu39 = c1185zt.f48481d;
                        c1186zu39.f48510Y = typedArrayObtainStyledAttributes.getInt(index, c1186zu39.f48510Y);
                        break;
                    case 43:
                        C1188zw c1188zw3 = c1185zt.f48479b;
                        c1188zw3.f48572d = typedArrayObtainStyledAttributes.getFloat(index, c1188zw3.f48572d);
                        break;
                    case 44:
                        C1189zx c1189zx = c1185zt.f48482e;
                        c1189zx.f48587n = true;
                        c1189zx.f48588o = typedArrayObtainStyledAttributes.getDimension(index, c1189zx.f48588o);
                        break;
                    case 45:
                        C1189zx c1189zx2 = c1185zt.f48482e;
                        c1189zx2.f48577d = typedArrayObtainStyledAttributes.getFloat(index, c1189zx2.f48577d);
                        break;
                    case 46:
                        C1189zx c1189zx3 = c1185zt.f48482e;
                        c1189zx3.f48578e = typedArrayObtainStyledAttributes.getFloat(index, c1189zx3.f48578e);
                        break;
                    case 47:
                        C1189zx c1189zx4 = c1185zt.f48482e;
                        c1189zx4.f48579f = typedArrayObtainStyledAttributes.getFloat(index, c1189zx4.f48579f);
                        break;
                    case 48:
                        C1189zx c1189zx5 = c1185zt.f48482e;
                        c1189zx5.f48580g = typedArrayObtainStyledAttributes.getFloat(index, c1189zx5.f48580g);
                        break;
                    case 49:
                        C1189zx c1189zx6 = c1185zt.f48482e;
                        c1189zx6.f48581h = typedArrayObtainStyledAttributes.getDimension(index, c1189zx6.f48581h);
                        break;
                    case 50:
                        C1189zx c1189zx7 = c1185zt.f48482e;
                        c1189zx7.f48582i = typedArrayObtainStyledAttributes.getDimension(index, c1189zx7.f48582i);
                        break;
                    case 51:
                        C1189zx c1189zx8 = c1185zt.f48482e;
                        c1189zx8.f48584k = typedArrayObtainStyledAttributes.getDimension(index, c1189zx8.f48584k);
                        break;
                    case 52:
                        C1189zx c1189zx9 = c1185zt.f48482e;
                        c1189zx9.f48585l = typedArrayObtainStyledAttributes.getDimension(index, c1189zx9.f48585l);
                        break;
                    case 53:
                        C1189zx c1189zx10 = c1185zt.f48482e;
                        c1189zx10.f48586m = typedArrayObtainStyledAttributes.getDimension(index, c1189zx10.f48586m);
                        break;
                    case 54:
                        C1186zu c1186zu40 = c1185zt.f48481d;
                        c1186zu40.f48511Z = typedArrayObtainStyledAttributes.getInt(index, c1186zu40.f48511Z);
                        break;
                    case 55:
                        C1186zu c1186zu41 = c1185zt.f48481d;
                        c1186zu41.f48512aa = typedArrayObtainStyledAttributes.getInt(index, c1186zu41.f48512aa);
                        break;
                    case 56:
                        C1186zu c1186zu42 = c1185zt.f48481d;
                        c1186zu42.f48513ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu42.f48513ab);
                        break;
                    case 57:
                        C1186zu c1186zu43 = c1185zt.f48481d;
                        c1186zu43.f48514ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu43.f48514ac);
                        break;
                    case 58:
                        C1186zu c1186zu44 = c1185zt.f48481d;
                        c1186zu44.f48515ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu44.f48515ad);
                        break;
                    case 59:
                        C1186zu c1186zu45 = c1185zt.f48481d;
                        c1186zu45.f48516ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu45.f48516ae);
                        break;
                    case 60:
                        C1189zx c1189zx11 = c1185zt.f48482e;
                        c1189zx11.f48576c = typedArrayObtainStyledAttributes.getFloat(index, c1189zx11.f48576c);
                        break;
                    case 61:
                        C1186zu c1186zu46 = c1185zt.f48481d;
                        c1186zu46.f48487B = m19810a(typedArrayObtainStyledAttributes, index, c1186zu46.f48487B);
                        break;
                    case 62:
                        C1186zu c1186zu47 = c1185zt.f48481d;
                        c1186zu47.f48488C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu47.f48488C);
                        break;
                    case 63:
                        C1186zu c1186zu48 = c1185zt.f48481d;
                        c1186zu48.f48489D = typedArrayObtainStyledAttributes.getFloat(index, c1186zu48.f48489D);
                        break;
                    case 64:
                        C1187zv c1187zv = c1185zt.f48480c;
                        c1187zv.f48556c = m19810a(typedArrayObtainStyledAttributes, index, c1187zv.f48556c);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1185zt.f48480c.f48558e = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1185zt.f48480c.f48558e = C1147yi.f48141a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 66:
                        c1185zt.f48480c.f48560g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        C1187zv c1187zv2 = c1185zt.f48480c;
                        c1187zv2.f48563j = typedArrayObtainStyledAttributes.getFloat(index, c1187zv2.f48563j);
                        break;
                    case 68:
                        C1188zw c1188zw4 = c1185zt.f48479b;
                        c1188zw4.f48573e = typedArrayObtainStyledAttributes.getFloat(index, c1188zw4.f48573e);
                        break;
                    case 69:
                        c1185zt.f48481d.f48517af = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        c1185zt.f48481d.f48518ag = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        C1186zu c1186zu49 = c1185zt.f48481d;
                        c1186zu49.f48519ah = typedArrayObtainStyledAttributes.getInt(index, c1186zu49.f48519ah);
                        break;
                    case 73:
                        C1186zu c1186zu50 = c1185zt.f48481d;
                        c1186zu50.f48520ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu50.f48520ai);
                        break;
                    case 74:
                        c1185zt.f48481d.f48523al = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        C1186zu c1186zu51 = c1185zt.f48481d;
                        c1186zu51.f48527ap = typedArrayObtainStyledAttributes.getBoolean(index, c1186zu51.f48527ap);
                        break;
                    case 76:
                        C1187zv c1187zv3 = c1185zt.f48480c;
                        c1187zv3.f48559f = typedArrayObtainStyledAttributes.getInt(index, c1187zv3.f48559f);
                        break;
                    case 77:
                        c1185zt.f48481d.f48524am = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        C1188zw c1188zw5 = c1185zt.f48479b;
                        c1188zw5.f48571c = typedArrayObtainStyledAttributes.getInt(index, c1188zw5.f48571c);
                        break;
                    case 79:
                        C1187zv c1187zv4 = c1185zt.f48480c;
                        c1187zv4.f48561h = typedArrayObtainStyledAttributes.getFloat(index, c1187zv4.f48561h);
                        break;
                    case 80:
                        C1186zu c1186zu52 = c1185zt.f48481d;
                        c1186zu52.f48525an = typedArrayObtainStyledAttributes.getBoolean(index, c1186zu52.f48525an);
                        break;
                    case 81:
                        C1186zu c1186zu53 = c1185zt.f48481d;
                        c1186zu53.f48526ao = typedArrayObtainStyledAttributes.getBoolean(index, c1186zu53.f48526ao);
                        break;
                    case 82:
                        C1187zv c1187zv5 = c1185zt.f48480c;
                        c1187zv5.f48557d = typedArrayObtainStyledAttributes.getInteger(index, c1187zv5.f48557d);
                        break;
                    case 83:
                        C1189zx c1189zx12 = c1185zt.f48482e;
                        c1189zx12.f48583j = m19810a(typedArrayObtainStyledAttributes, index, c1189zx12.f48583j);
                        break;
                    case 84:
                        C1187zv c1187zv6 = c1185zt.f48480c;
                        c1187zv6.f48565l = typedArrayObtainStyledAttributes.getInteger(index, c1187zv6.f48565l);
                        break;
                    case 85:
                        C1187zv c1187zv7 = c1185zt.f48480c;
                        c1187zv7.f48564k = typedArrayObtainStyledAttributes.getFloat(index, c1187zv7.f48564k);
                        break;
                    case 86:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            c1185zt.f48480c.f48568o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            C1187zv c1187zv8 = c1185zt.f48480c;
                            if (c1187zv8.f48568o != -1) {
                                c1187zv8.f48567n = -2;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            c1185zt.f48480c.f48566m = typedArrayObtainStyledAttributes.getString(index);
                            if (c1185zt.f48480c.f48566m.indexOf(BcwGDRhrTsnlj.ojJAmxpTlI) > 0) {
                                c1185zt.f48480c.f48568o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1185zt.f48480c.f48567n = -2;
                            } else {
                                c1185zt.f48480c.f48567n = -1;
                            }
                        } else {
                            C1187zv c1187zv9 = c1185zt.f48480c;
                            c1187zv9.f48567n = typedArrayObtainStyledAttributes.getInteger(index, c1187zv9.f48568o);
                        }
                        break;
                    case 87:
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 91:
                        C1186zu c1186zu54 = c1185zt.f48481d;
                        c1186zu54.f48546s = m19810a(typedArrayObtainStyledAttributes, index, c1186zu54.f48546s);
                        break;
                    case 92:
                        C1186zu c1186zu55 = c1185zt.f48481d;
                        c1186zu55.f48547t = m19810a(typedArrayObtainStyledAttributes, index, c1186zu55.f48547t);
                        break;
                    case 93:
                        C1186zu c1186zu56 = c1185zt.f48481d;
                        c1186zu56.f48499N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu56.f48499N);
                        break;
                    case 94:
                        C1186zu c1186zu57 = c1185zt.f48481d;
                        c1186zu57.f48506U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1186zu57.f48506U);
                        break;
                    case 95:
                        m19811m(c1185zt.f48481d, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m19811m(c1185zt.f48481d, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        C1186zu c1186zu58 = c1185zt.f48481d;
                        c1186zu58.f48528aq = typedArrayObtainStyledAttributes.getInt(index, c1186zu58.f48528aq);
                        break;
                }
            }
            C1186zu c1186zu59 = c1185zt.f48481d;
            if (c1186zu59.f48523al != null) {
                c1186zu59.f48522ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1185zt;
    }

    /* JADX INFO: renamed from: x */
    private static final String m19816x(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return rmwTRjObXLGH.XDNm;
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1185zt m19817b(int i) {
        HashMap map = this.f48593e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.f48593e.put(numValueOf, new C1185zt());
        }
        return (C1185zt) this.f48593e.get(numValueOf);
    }

    /* JADX INFO: renamed from: c */
    public final void m19818c(ConstraintLayout constraintLayout) {
        m19833t(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m19819d(int i, int i2) {
        C1185zt c1185zt;
        HashMap map = this.f48593e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (c1185zt = (C1185zt) this.f48593e.get(numValueOf)) == null) {
        }
        C1186zu c1186zu = c1185zt.f48481d;
        switch (i2) {
            case 3:
                c1186zu.f48542o = -1;
                c1186zu.f48541n = -1;
                c1186zu.f48495J = 0;
                c1186zu.f48501P = Integer.MIN_VALUE;
                break;
            case 4:
                c1186zu.f48543p = -1;
                c1186zu.f48544q = -1;
                c1186zu.f48496K = 0;
                c1186zu.f48503R = Integer.MIN_VALUE;
                break;
            case 5:
                c1186zu.f48545r = -1;
                c1186zu.f48546s = -1;
                c1186zu.f48547t = -1;
                c1186zu.f48499N = 0;
                c1186zu.f48506U = Integer.MIN_VALUE;
                break;
            case 6:
                c1186zu.f48548u = -1;
                c1186zu.f48549v = -1;
                c1186zu.f48498M = 0;
                c1186zu.f48505T = Integer.MIN_VALUE;
                break;
            default:
                c1186zu.f48550w = -1;
                c1186zu.f48551x = -1;
                c1186zu.f48497L = 0;
                c1186zu.f48504S = Integer.MIN_VALUE;
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19820e(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        C1190zy c1190zy = this;
        int childCount = constraintLayout.getChildCount();
        c1190zy.f48593e.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C1178zm c1178zm = (C1178zm) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap map = c1190zy.f48593e;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                c1190zy.f48593e.put(numValueOf, new C1185zt());
            }
            C1185zt c1185zt = (C1185zt) c1190zy.f48593e.get(numValueOf);
            if (c1185zt == null) {
                i = childCount;
            } else {
                HashMap map2 = c1190zy.f48592d;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C1175zj c1175zj = (C1175zj) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            i2 = childCount;
                            try {
                                map3.put(str, new C1175zj(c1175zj, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                childCount = i2;
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i2;
                            }
                        } else {
                            i2 = childCount;
                            try {
                                map3.put(str, new C1175zj(c1175zj, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                                childCount = i2;
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i2;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i2;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i2;
                            }
                        }
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        i2 = childCount;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        i2 = childCount;
                    } catch (InvocationTargetException e9) {
                        e = e9;
                        i2 = childCount;
                    }
                }
                i = childCount;
                c1185zt.f48483f = map3;
                c1185zt.f48478a = id;
                C1186zu c1186zu = c1185zt.f48481d;
                c1186zu.f48537j = c1178zm.f48420e;
                c1186zu.f48538k = c1178zm.f48421f;
                c1186zu.f48539l = c1178zm.f48422g;
                c1186zu.f48540m = c1178zm.f48423h;
                c1186zu.f48541n = c1178zm.f48424i;
                c1186zu.f48542o = c1178zm.f48425j;
                c1186zu.f48543p = c1178zm.f48426k;
                c1186zu.f48544q = c1178zm.f48427l;
                c1186zu.f48545r = c1178zm.f48428m;
                c1186zu.f48546s = c1178zm.f48429n;
                c1186zu.f48547t = c1178zm.f48430o;
                c1186zu.f48548u = c1178zm.f48434s;
                c1186zu.f48549v = c1178zm.f48435t;
                c1186zu.f48550w = c1178zm.f48436u;
                c1186zu.f48551x = c1178zm.f48437v;
                c1186zu.f48552y = c1178zm.f48373G;
                c1186zu.f48553z = c1178zm.f48374H;
                c1186zu.f48486A = c1178zm.f48375I;
                c1186zu.f48487B = c1178zm.f48431p;
                c1186zu.f48488C = c1178zm.f48432q;
                c1186zu.f48489D = c1178zm.f48433r;
                c1186zu.f48490E = c1178zm.f48390X;
                c1186zu.f48491F = c1178zm.f48391Y;
                c1186zu.f48492G = c1178zm.f48392Z;
                c1186zu.f48535h = c1178zm.f48418c;
                c1186zu.f48533f = c1178zm.f48393a;
                c1186zu.f48534g = c1178zm.f48417b;
                c1186zu.f48531d = c1178zm.width;
                c1185zt.f48481d.f48532e = c1178zm.height;
                c1185zt.f48481d.f48493H = c1178zm.leftMargin;
                c1185zt.f48481d.f48494I = c1178zm.rightMargin;
                c1185zt.f48481d.f48495J = c1178zm.topMargin;
                c1185zt.f48481d.f48496K = c1178zm.bottomMargin;
                C1186zu c1186zu2 = c1185zt.f48481d;
                c1186zu2.f48499N = c1178zm.f48370D;
                c1186zu2.f48507V = c1178zm.f48379M;
                c1186zu2.f48508W = c1178zm.f48378L;
                c1186zu2.f48510Y = c1178zm.f48381O;
                c1186zu2.f48509X = c1178zm.f48380N;
                c1186zu2.f48525an = c1178zm.f48394aa;
                c1186zu2.f48526ao = c1178zm.f48395ab;
                c1186zu2.f48511Z = c1178zm.f48382P;
                c1186zu2.f48512aa = c1178zm.f48383Q;
                c1186zu2.f48513ab = c1178zm.f48386T;
                c1186zu2.f48514ac = c1178zm.f48387U;
                c1186zu2.f48515ad = c1178zm.f48384R;
                c1186zu2.f48516ae = c1178zm.f48385S;
                c1186zu2.f48517af = c1178zm.f48388V;
                c1186zu2.f48518ag = c1178zm.f48389W;
                c1186zu2.f48524am = c1178zm.f48396ac;
                c1186zu2.f48501P = c1178zm.f48439x;
                c1186zu2.f48503R = c1178zm.f48441z;
                c1186zu2.f48500O = c1178zm.f48438w;
                c1186zu2.f48502Q = c1178zm.f48440y;
                c1186zu2.f48505T = c1178zm.f48367A;
                c1186zu2.f48504S = c1178zm.f48368B;
                c1186zu2.f48506U = c1178zm.f48369C;
                c1186zu2.f48528aq = c1178zm.f48397ad;
                c1186zu2.f48497L = c1178zm.getMarginEnd();
                c1185zt.f48481d.f48498M = c1178zm.getMarginStart();
                c1185zt.f48479b.f48570b = childAt.getVisibility();
                c1185zt.f48479b.f48572d = childAt.getAlpha();
                c1185zt.f48482e.f48576c = childAt.getRotation();
                c1185zt.f48482e.f48577d = childAt.getRotationX();
                c1185zt.f48482e.f48578e = childAt.getRotationY();
                c1185zt.f48482e.f48579f = childAt.getScaleX();
                c1185zt.f48482e.f48580g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C1189zx c1189zx = c1185zt.f48482e;
                    c1189zx.f48581h = pivotX;
                    c1189zx.f48582i = pivotY;
                }
                c1185zt.f48482e.f48584k = childAt.getTranslationX();
                c1185zt.f48482e.f48585l = childAt.getTranslationY();
                c1185zt.f48482e.f48586m = childAt.getTranslationZ();
                C1189zx c1189zx2 = c1185zt.f48482e;
                if (c1189zx2.f48587n) {
                    c1189zx2.f48588o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    C1186zu c1186zu3 = c1185zt.f48481d;
                    c1186zu3.f48527ap = barrier.f1444b.f48143b;
                    c1186zu3.f48522ak = Arrays.copyOf(barrier.f48359c, barrier.f48360d);
                    C1186zu c1186zu4 = c1185zt.f48481d;
                    c1186zu4.f48519ah = barrier.f1443a;
                    c1186zu4.f48520ai = barrier.f1444b.f48144c;
                }
            }
            i3++;
            c1190zy = this;
            childCount = i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19821f(Context context, int i) {
        m19820e((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: g */
    public final void m19822g(int i, int i2, int i3, int i4) {
        HashMap map = this.f48593e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.f48593e.put(numValueOf, new C1185zt());
        }
        C1185zt c1185zt = (C1185zt) this.f48593e.get(numValueOf);
        if (c1185zt == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C1186zu c1186zu = c1185zt.f48481d;
                    c1186zu.f48537j = i3;
                    c1186zu.f48538k = -1;
                    return;
                } else if (i4 == 2) {
                    C1186zu c1186zu2 = c1185zt.f48481d;
                    c1186zu2.f48538k = i3;
                    c1186zu2.f48537j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m19816x(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    C1186zu c1186zu3 = c1185zt.f48481d;
                    c1186zu3.f48539l = i3;
                    c1186zu3.f48540m = -1;
                    return;
                } else if (i4 == 2) {
                    C1186zu c1186zu4 = c1185zt.f48481d;
                    c1186zu4.f48540m = i3;
                    c1186zu4.f48539l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    C1186zu c1186zu5 = c1185zt.f48481d;
                    c1186zu5.f48541n = i3;
                    c1186zu5.f48542o = -1;
                    c1186zu5.f48545r = -1;
                    c1186zu5.f48546s = -1;
                    c1186zu5.f48547t = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
                C1186zu c1186zu6 = c1185zt.f48481d;
                c1186zu6.f48542o = i3;
                c1186zu6.f48541n = -1;
                c1186zu6.f48545r = -1;
                c1186zu6.f48546s = -1;
                c1186zu6.f48547t = -1;
                return;
            case 4:
                if (i4 == 4) {
                    C1186zu c1186zu7 = c1185zt.f48481d;
                    c1186zu7.f48544q = i3;
                    c1186zu7.f48543p = -1;
                    c1186zu7.f48545r = -1;
                    c1186zu7.f48546s = -1;
                    c1186zu7.f48547t = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
                C1186zu c1186zu8 = c1185zt.f48481d;
                c1186zu8.f48543p = i3;
                c1186zu8.f48544q = -1;
                c1186zu8.f48545r = -1;
                c1186zu8.f48546s = -1;
                c1186zu8.f48547t = -1;
                return;
            case 5:
                if (i4 == 5) {
                    C1186zu c1186zu9 = c1185zt.f48481d;
                    c1186zu9.f48545r = i3;
                    c1186zu9.f48544q = -1;
                    c1186zu9.f48543p = -1;
                    c1186zu9.f48541n = -1;
                    c1186zu9.f48542o = -1;
                    return;
                }
                if (i4 == 3) {
                    C1186zu c1186zu10 = c1185zt.f48481d;
                    c1186zu10.f48546s = i3;
                    c1186zu10.f48544q = -1;
                    c1186zu10.f48543p = -1;
                    c1186zu10.f48541n = -1;
                    c1186zu10.f48542o = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
                C1186zu c1186zu11 = c1185zt.f48481d;
                c1186zu11.f48547t = i3;
                c1186zu11.f48544q = -1;
                c1186zu11.f48543p = -1;
                c1186zu11.f48541n = -1;
                c1186zu11.f48542o = -1;
                return;
            case 6:
                if (i4 == 6) {
                    C1186zu c1186zu12 = c1185zt.f48481d;
                    c1186zu12.f48549v = i3;
                    c1186zu12.f48548u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
            default:
                if (i4 == 6) {
                    C1186zu c1186zu13 = c1185zt.f48481d;
                    c1186zu13.f48550w = i3;
                    c1186zu13.f48551x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m19816x(i4) + " undefined");
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m19823h(int i, int i2, int i3, int i4, int i5) {
        C1186zu c1186zu;
        HashMap map = this.f48593e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.f48593e.put(numValueOf, new C1185zt());
        }
        C1185zt c1185zt = (C1185zt) this.f48593e.get(numValueOf);
        if (c1185zt == null) {
            return;
        }
        String str = JrxsYuVZZqnFC.uoq;
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    c1186zu = c1185zt.f48481d;
                    c1186zu.f48541n = i3;
                    c1186zu.f48542o = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(str + m19816x(i4) + " undefined");
                    }
                    c1186zu = c1185zt.f48481d;
                    c1186zu.f48542o = i3;
                    c1186zu.f48541n = -1;
                }
                c1186zu.f48545r = -1;
                c1186zu.f48546s = -1;
                c1186zu.f48547t = -1;
                c1185zt.f48481d.f48495J = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C1186zu c1186zu2 = c1185zt.f48481d;
                    c1186zu2.f48544q = i3;
                    c1186zu2.f48543p = -1;
                    c1186zu2.f48545r = -1;
                    c1186zu2.f48546s = -1;
                    c1186zu2.f48547t = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException(str + m19816x(i4) + " undefined");
                    }
                    C1186zu c1186zu3 = c1185zt.f48481d;
                    c1186zu3.f48543p = i3;
                    c1186zu3.f48544q = -1;
                    c1186zu3.f48545r = -1;
                    c1186zu3.f48546s = -1;
                    c1186zu3.f48547t = -1;
                }
                c1185zt.f48481d.f48496K = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C1186zu c1186zu4 = c1185zt.f48481d;
                    c1186zu4.f48545r = i3;
                    c1186zu4.f48544q = -1;
                    c1186zu4.f48543p = -1;
                    c1186zu4.f48541n = -1;
                    c1186zu4.f48542o = -1;
                    return;
                }
                if (i4 == 3) {
                    C1186zu c1186zu5 = c1185zt.f48481d;
                    c1186zu5.f48546s = i3;
                    c1186zu5.f48544q = -1;
                    c1186zu5.f48543p = -1;
                    c1186zu5.f48541n = -1;
                    c1186zu5.f48542o = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException(str + m19816x(i4) + " undefined");
                }
                C1186zu c1186zu6 = c1185zt.f48481d;
                c1186zu6.f48547t = i3;
                c1186zu6.f48544q = -1;
                c1186zu6.f48543p = -1;
                c1186zu6.f48541n = -1;
                c1186zu6.f48542o = -1;
                return;
            case 6:
                if (i4 == 6) {
                    C1186zu c1186zu7 = c1185zt.f48481d;
                    c1186zu7.f48549v = i3;
                    c1186zu7.f48548u = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException(str + m19816x(i4) + " undefined");
                    }
                    C1186zu c1186zu8 = c1185zt.f48481d;
                    c1186zu8.f48548u = i3;
                    c1186zu8.f48549v = -1;
                }
                c1185zt.f48481d.f48498M = i5;
                return;
            default:
                if (i4 == 7) {
                    C1186zu c1186zu9 = c1185zt.f48481d;
                    c1186zu9.f48551x = i3;
                    c1186zu9.f48550w = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(str + m19816x(i4) + " undefined");
                    }
                    C1186zu c1186zu10 = c1185zt.f48481d;
                    c1186zu10.f48550w = i3;
                    c1186zu10.f48551x = -1;
                }
                c1185zt.f48481d.f48497L = i5;
                return;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m19824i(int i, int i2) {
        m19817b(i).f48481d.f48532e = i2;
    }

    /* JADX INFO: renamed from: j */
    public final void m19825j(int i, int i2) {
        m19817b(i).f48481d.f48531d = i2;
    }

    /* JADX INFO: renamed from: k */
    public final void m19826k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 2:
                        String name = xml.getName();
                        C1185zt c1185ztM19815w = m19815w(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            c1185ztM19815w.f48481d.f48529b = true;
                        }
                        this.f48593e.put(Integer.valueOf(c1185ztM19815w.f48478a), c1185ztM19815w);
                        break;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0026. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:297:0x0794 for B:25:0x0053 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: l */
    public final void m19827l(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        byte b;
        Object obj;
        String str = PMZiHihxLGEy.NDeLXZ;
        try {
            int eventType = xmlPullParser.getEventType();
            C1185zt c1185ztM19815w = null;
            while (true) {
                if (eventType != 1) {
                    switch (eventType) {
                        case 0:
                            xmlPullParser.getName();
                            try {
                                eventType = xmlPullParser.next();
                            } catch (IOException e) {
                                e = e;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                Log.e(str, "Error parsing XML resource", e);
                                return;
                            }
                            break;
                        case 1:
                        default:
                            eventType = xmlPullParser.next();
                            break;
                        case 2:
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        b = 6;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        b = 7;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals(CswIK.ZKiKlwD)) {
                                        b = 9;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        b = 8;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    c1185ztM19815w = m19815w(context, Xml.asAttributeSet(xmlPullParser), false);
                                    eventType = xmlPullParser.next();
                                    break;
                                case 1:
                                    c1185ztM19815w = m19815w(context, Xml.asAttributeSet(xmlPullParser), true);
                                    eventType = xmlPullParser.next();
                                    break;
                                case 2:
                                    c1185ztM19815w = m19815w(context, Xml.asAttributeSet(xmlPullParser), false);
                                    C1186zu c1186zu = c1185ztM19815w.f48481d;
                                    c1186zu.f48529b = true;
                                    c1186zu.f48530c = true;
                                    eventType = xmlPullParser.next();
                                    break;
                                case 3:
                                    c1185ztM19815w = m19815w(context, Xml.asAttributeSet(xmlPullParser), false);
                                    c1185ztM19815w.f48481d.f48521aj = 1;
                                    eventType = xmlPullParser.next();
                                    break;
                                case 4:
                                    if (c1185ztM19815w == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    C1188zw c1188zw = c1185ztM19815w.f48479b;
                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f7g);
                                    c1188zw.f48569a = true;
                                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    for (int i = 0; i < indexCount; i++) {
                                        int index = typedArrayObtainStyledAttributes.getIndex(i);
                                        if (index == 1) {
                                            c1188zw.f48572d = typedArrayObtainStyledAttributes.getFloat(1, c1188zw.f48572d);
                                        } else if (index == 0) {
                                            int i2 = typedArrayObtainStyledAttributes.getInt(0, c1188zw.f48570b);
                                            c1188zw.f48570b = i2;
                                            c1188zw.f48570b = f48589a[i2];
                                        } else if (index == 4) {
                                            c1188zw.f48571c = typedArrayObtainStyledAttributes.getInt(4, c1188zw.f48571c);
                                        } else if (index == 3) {
                                            c1188zw.f48573e = typedArrayObtainStyledAttributes.getFloat(3, c1188zw.f48573e);
                                        }
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case 5:
                                    if (c1185ztM19815w == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    C1189zx c1189zx = c1185ztM19815w.f48482e;
                                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f9i);
                                    c1189zx.f48575b = true;
                                    int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
                                    for (int i3 = 0; i3 < indexCount2; i3++) {
                                        int index2 = typedArrayObtainStyledAttributes2.getIndex(i3);
                                        switch (C1189zx.f48574a.get(index2)) {
                                            case 1:
                                                c1189zx.f48576c = typedArrayObtainStyledAttributes2.getFloat(index2, c1189zx.f48576c);
                                                break;
                                            case 2:
                                                c1189zx.f48577d = typedArrayObtainStyledAttributes2.getFloat(index2, c1189zx.f48577d);
                                                break;
                                            case 3:
                                                c1189zx.f48578e = typedArrayObtainStyledAttributes2.getFloat(index2, c1189zx.f48578e);
                                                break;
                                            case 4:
                                                c1189zx.f48579f = typedArrayObtainStyledAttributes2.getFloat(index2, c1189zx.f48579f);
                                                break;
                                            case 5:
                                                c1189zx.f48580g = typedArrayObtainStyledAttributes2.getFloat(index2, c1189zx.f48580g);
                                                break;
                                            case 6:
                                                c1189zx.f48581h = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48581h);
                                                break;
                                            case 7:
                                                c1189zx.f48582i = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48582i);
                                                break;
                                            case 8:
                                                c1189zx.f48584k = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48584k);
                                                break;
                                            case 9:
                                                c1189zx.f48585l = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48585l);
                                                break;
                                            case 10:
                                                c1189zx.f48586m = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48586m);
                                                break;
                                            case 11:
                                                c1189zx.f48587n = true;
                                                c1189zx.f48588o = typedArrayObtainStyledAttributes2.getDimension(index2, c1189zx.f48588o);
                                                break;
                                            case 12:
                                                c1189zx.f48583j = m19810a(typedArrayObtainStyledAttributes2, index2, c1189zx.f48583j);
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes2.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case 6:
                                    if (c1185ztM19815w == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    C1186zu c1186zu2 = c1185ztM19815w.f48481d;
                                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f5e);
                                    c1186zu2.f48530c = true;
                                    int indexCount3 = typedArrayObtainStyledAttributes3.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount3; i4++) {
                                        int index3 = typedArrayObtainStyledAttributes3.getIndex(i4);
                                        switch (C1186zu.f48485a.get(index3)) {
                                            case 1:
                                                c1186zu2.f48545r = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48545r);
                                                break;
                                            case 2:
                                                c1186zu2.f48496K = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48496K);
                                                break;
                                            case 3:
                                                c1186zu2.f48544q = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48544q);
                                                break;
                                            case 4:
                                                c1186zu2.f48543p = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48543p);
                                                break;
                                            case 5:
                                                c1186zu2.f48486A = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case 6:
                                                c1186zu2.f48490E = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, c1186zu2.f48490E);
                                                break;
                                            case 7:
                                                c1186zu2.f48491F = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, c1186zu2.f48491F);
                                                break;
                                            case 8:
                                                c1186zu2.f48497L = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48497L);
                                                break;
                                            case 9:
                                                c1186zu2.f48551x = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48551x);
                                                break;
                                            case 10:
                                                c1186zu2.f48550w = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48550w);
                                                break;
                                            case 11:
                                                c1186zu2.f48503R = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48503R);
                                                break;
                                            case 12:
                                                c1186zu2.f48504S = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48504S);
                                                break;
                                            case 13:
                                                c1186zu2.f48500O = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48500O);
                                                break;
                                            case 14:
                                                c1186zu2.f48502Q = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48502Q);
                                                break;
                                            case 15:
                                                c1186zu2.f48505T = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48505T);
                                                break;
                                            case 16:
                                                c1186zu2.f48501P = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48501P);
                                                break;
                                            case 17:
                                                c1186zu2.f48533f = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, c1186zu2.f48533f);
                                                break;
                                            case 18:
                                                c1186zu2.f48534g = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(index3, c1186zu2.f48534g);
                                                break;
                                            case 19:
                                                c1186zu2.f48535h = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48535h);
                                                break;
                                            case 20:
                                                c1186zu2.f48552y = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48552y);
                                                break;
                                            case 21:
                                                c1186zu2.f48532e = typedArrayObtainStyledAttributes3.getLayoutDimension(index3, c1186zu2.f48532e);
                                                break;
                                            case 22:
                                                c1186zu2.f48531d = typedArrayObtainStyledAttributes3.getLayoutDimension(index3, c1186zu2.f48531d);
                                                break;
                                            case 23:
                                                c1186zu2.f48493H = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48493H);
                                                break;
                                            case 24:
                                                c1186zu2.f48537j = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48537j);
                                                break;
                                            case 25:
                                                c1186zu2.f48538k = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48538k);
                                                break;
                                            case 26:
                                                c1186zu2.f48492G = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48492G);
                                                break;
                                            case 27:
                                                c1186zu2.f48494I = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48494I);
                                                break;
                                            case 28:
                                                c1186zu2.f48539l = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48539l);
                                                break;
                                            case 29:
                                                c1186zu2.f48540m = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48540m);
                                                break;
                                            case 30:
                                                c1186zu2.f48498M = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48498M);
                                                break;
                                            case 31:
                                                c1186zu2.f48548u = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48548u);
                                                break;
                                            case 32:
                                                c1186zu2.f48549v = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48549v);
                                                break;
                                            case 33:
                                                c1186zu2.f48495J = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48495J);
                                                break;
                                            case 34:
                                                c1186zu2.f48542o = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48542o);
                                                break;
                                            case 35:
                                                c1186zu2.f48541n = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48541n);
                                                break;
                                            case 36:
                                                c1186zu2.f48553z = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48553z);
                                                break;
                                            case 37:
                                                c1186zu2.f48508W = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48508W);
                                                break;
                                            case 38:
                                                c1186zu2.f48507V = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48507V);
                                                break;
                                            case 39:
                                                c1186zu2.f48509X = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48509X);
                                                break;
                                            case 40:
                                                c1186zu2.f48510Y = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48510Y);
                                                break;
                                            case 41:
                                                m19811m(c1186zu2, typedArrayObtainStyledAttributes3, index3, 0);
                                                break;
                                            case 42:
                                                m19811m(c1186zu2, typedArrayObtainStyledAttributes3, index3, 1);
                                                break;
                                            case 43:
                                            case 44:
                                            case 45:
                                            case 46:
                                            case 47:
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            default:
                                                Log.w(str, "Unknown attribute 0x" + Integer.toHexString(index3) + "   " + C1186zu.f48485a.get(index3));
                                                break;
                                            case 61:
                                                c1186zu2.f48487B = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48487B);
                                                break;
                                            case 62:
                                                c1186zu2.f48488C = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48488C);
                                                break;
                                            case 63:
                                                c1186zu2.f48489D = typedArrayObtainStyledAttributes3.getFloat(index3, c1186zu2.f48489D);
                                                break;
                                            case 69:
                                                c1186zu2.f48517af = typedArrayObtainStyledAttributes3.getFloat(index3, 1.0f);
                                                break;
                                            case 70:
                                                c1186zu2.f48518ag = typedArrayObtainStyledAttributes3.getFloat(index3, 1.0f);
                                                break;
                                            case 71:
                                                Log.e(str, "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                c1186zu2.f48519ah = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48519ah);
                                                break;
                                            case 73:
                                                c1186zu2.f48520ai = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48520ai);
                                                break;
                                            case 74:
                                                c1186zu2.f48523al = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case 75:
                                                c1186zu2.f48527ap = typedArrayObtainStyledAttributes3.getBoolean(index3, c1186zu2.f48527ap);
                                                break;
                                            case 76:
                                                c1186zu2.f48528aq = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48528aq);
                                                break;
                                            case 77:
                                                c1186zu2.f48546s = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48546s);
                                                break;
                                            case 78:
                                                c1186zu2.f48547t = m19810a(typedArrayObtainStyledAttributes3, index3, c1186zu2.f48547t);
                                                break;
                                            case 79:
                                                c1186zu2.f48506U = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48506U);
                                                break;
                                            case 80:
                                                c1186zu2.f48499N = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48499N);
                                                break;
                                            case 81:
                                                c1186zu2.f48511Z = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48511Z);
                                                break;
                                            case 82:
                                                c1186zu2.f48512aa = typedArrayObtainStyledAttributes3.getInt(index3, c1186zu2.f48512aa);
                                                break;
                                            case 83:
                                                c1186zu2.f48514ac = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48514ac);
                                                break;
                                            case 84:
                                                c1186zu2.f48513ab = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48513ab);
                                                break;
                                            case 85:
                                                c1186zu2.f48516ae = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48516ae);
                                                break;
                                            case 86:
                                                c1186zu2.f48515ad = typedArrayObtainStyledAttributes3.getDimensionPixelSize(index3, c1186zu2.f48515ad);
                                                break;
                                            case 87:
                                                c1186zu2.f48525an = typedArrayObtainStyledAttributes3.getBoolean(index3, c1186zu2.f48525an);
                                                break;
                                            case 88:
                                                c1186zu2.f48526ao = typedArrayObtainStyledAttributes3.getBoolean(index3, c1186zu2.f48526ao);
                                                break;
                                            case 89:
                                                c1186zu2.f48524am = typedArrayObtainStyledAttributes3.getString(index3);
                                                break;
                                            case 90:
                                                c1186zu2.f48536i = typedArrayObtainStyledAttributes3.getBoolean(index3, c1186zu2.f48536i);
                                                break;
                                            case 91:
                                                Log.w(str, "unused attribute 0x" + Integer.toHexString(index3) + "   " + C1186zu.f48485a.get(index3));
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes3.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case 7:
                                    if (c1185ztM19815w == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    C1187zv c1187zv = c1185ztM19815w.f48480c;
                                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f6f);
                                    c1187zv.f48555b = true;
                                    int indexCount4 = typedArrayObtainStyledAttributes4.getIndexCount();
                                    for (int i5 = 0; i5 < indexCount4; i5++) {
                                        int index4 = typedArrayObtainStyledAttributes4.getIndex(i5);
                                        switch (C1187zv.f48554a.get(index4)) {
                                            case 1:
                                                c1187zv.f48563j = typedArrayObtainStyledAttributes4.getFloat(index4, c1187zv.f48563j);
                                                break;
                                            case 2:
                                                c1187zv.f48559f = typedArrayObtainStyledAttributes4.getInt(index4, c1187zv.f48559f);
                                                break;
                                            case 3:
                                                if (typedArrayObtainStyledAttributes4.peekValue(index4).type == 3) {
                                                    c1187zv.f48558e = typedArrayObtainStyledAttributes4.getString(index4);
                                                } else {
                                                    c1187zv.f48558e = C1147yi.f48141a[typedArrayObtainStyledAttributes4.getInteger(index4, 0)];
                                                }
                                                break;
                                            case 4:
                                                c1187zv.f48560g = typedArrayObtainStyledAttributes4.getInt(index4, 0);
                                                break;
                                            case 5:
                                                c1187zv.f48556c = m19810a(typedArrayObtainStyledAttributes4, index4, c1187zv.f48556c);
                                                break;
                                            case 6:
                                                c1187zv.f48557d = typedArrayObtainStyledAttributes4.getInteger(index4, c1187zv.f48557d);
                                                break;
                                            case 7:
                                                c1187zv.f48561h = typedArrayObtainStyledAttributes4.getFloat(index4, c1187zv.f48561h);
                                                break;
                                            case 8:
                                                c1187zv.f48565l = typedArrayObtainStyledAttributes4.getInteger(index4, c1187zv.f48565l);
                                                break;
                                            case 9:
                                                c1187zv.f48564k = typedArrayObtainStyledAttributes4.getFloat(index4, c1187zv.f48564k);
                                                break;
                                            case 10:
                                                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(index4);
                                                if (typedValuePeekValue.type == 1) {
                                                    int resourceId = typedArrayObtainStyledAttributes4.getResourceId(index4, -1);
                                                    c1187zv.f48568o = resourceId;
                                                    if (resourceId != -1) {
                                                        c1187zv.f48567n = -2;
                                                    }
                                                } else if (typedValuePeekValue.type == 3) {
                                                    c1187zv.f48566m = typedArrayObtainStyledAttributes4.getString(index4);
                                                    if (c1187zv.f48566m.indexOf("/") > 0) {
                                                        c1187zv.f48568o = typedArrayObtainStyledAttributes4.getResourceId(index4, -1);
                                                        c1187zv.f48567n = -2;
                                                    } else {
                                                        c1187zv.f48567n = -1;
                                                    }
                                                } else {
                                                    c1187zv.f48567n = typedArrayObtainStyledAttributes4.getInteger(index4, c1187zv.f48568o);
                                                }
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes4.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                case 8:
                                case 9:
                                    if (c1185ztM19815w == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    HashMap map = c1185ztM19815w.f48483f;
                                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f4d);
                                    int indexCount5 = typedArrayObtainStyledAttributes5.getIndexCount();
                                    String string = null;
                                    Object objValueOf = null;
                                    int i6 = 0;
                                    boolean z = false;
                                    for (int i7 = 0; i7 < indexCount5; i7++) {
                                        int index5 = typedArrayObtainStyledAttributes5.getIndex(i7);
                                        if (index5 == 0) {
                                            String string2 = typedArrayObtainStyledAttributes5.getString(0);
                                            string = (string2 == null || string2.length() <= 0) ? string2 : Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                                        } else if (index5 == 10) {
                                            string = typedArrayObtainStyledAttributes5.getString(10);
                                            z = true;
                                        } else if (index5 == 1) {
                                            objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes5.getBoolean(1, false));
                                            i6 = 6;
                                        } else if (index5 == 3) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getColor(3, 0));
                                            i6 = 3;
                                        } else if (index5 == 2) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getColor(2, 0));
                                            i6 = 4;
                                        } else if (index5 == 7) {
                                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes5.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                            i6 = 7;
                                        } else if (index5 == 4) {
                                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes5.getDimension(4, 0.0f));
                                            i6 = 7;
                                        } else if (index5 == 5) {
                                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes5.getFloat(5, Float.NaN));
                                            i6 = 2;
                                        } else if (index5 == 6) {
                                            objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes5.getInteger(6, -1));
                                            i6 = 1;
                                        } else if (index5 == 9) {
                                            objValueOf = typedArrayObtainStyledAttributes5.getString(9);
                                            i6 = 5;
                                        } else if (index5 == 8) {
                                            int resourceId2 = typedArrayObtainStyledAttributes5.getResourceId(8, -1);
                                            if (resourceId2 == -1) {
                                                resourceId2 = typedArrayObtainStyledAttributes5.getInt(8, -1);
                                            }
                                            objValueOf = Integer.valueOf(resourceId2);
                                            i6 = 8;
                                        }
                                    }
                                    String str2 = string;
                                    if (str2 != null && (obj = objValueOf) != null) {
                                        map.put(str2, new C1175zj(str2, i6, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                    eventType = xmlPullParser.next();
                                    break;
                                    break;
                                default:
                                    eventType = xmlPullParser.next();
                                    break;
                            }
                            break;
                        case 3:
                            switch (xmlPullParser.getName().toLowerCase(Locale.ROOT)) {
                                case "constraintset":
                                    return;
                                case "constraint":
                                case "constraintoverride":
                                case "guideline":
                                    this.f48593e.put(Integer.valueOf(c1185ztM19815w.f48478a), c1185ztM19815w);
                                    c1185ztM19815w = null;
                                    eventType = xmlPullParser.next();
                                    break;
                                default:
                                    eventType = xmlPullParser.next();
                                    break;
                            }
                            break;
                    }
                } else {
                    return;
                }
                Log.e(str, "Error parsing XML resource", e);
                return;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m19828o(int i) {
        int i2;
        HashMap map = this.f48593e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            C1185zt c1185zt = (C1185zt) this.f48593e.get(numValueOf);
            if (c1185zt == null) {
                return;
            }
            C1186zu c1186zu = c1185zt.f48481d;
            int i3 = c1186zu.f48542o;
            int i4 = c1186zu.f48543p;
            if (i3 != -1) {
                i2 = i3;
            } else if (i4 != -1) {
                i2 = -1;
            }
            if (i2 == -1 || i4 == -1) {
                int i5 = c1186zu.f48544q;
                if (i5 != -1) {
                    m19823h(i2, 4, i5, 4, 0);
                } else {
                    int i6 = c1186zu.f48541n;
                    if (i6 != -1) {
                        m19823h(i4, 3, i6, 3, 0);
                    }
                }
            } else {
                m19823h(i2, 4, i4, 3, 0);
                m19823h(i4, 3, i2, 4, 0);
            }
        }
        m19819d(i, 3);
        m19819d(i, 4);
    }

    /* JADX INFO: renamed from: p */
    public final void m19829p(int i, int i2) {
        m19817b(i).f48481d.f48533f = i2;
        m19817b(i).f48481d.f48534g = -1;
        m19817b(i).f48481d.f48535h = -1.0f;
    }

    /* JADX INFO: renamed from: q */
    public final void m19830q(int i, int i2) {
        m19817b(i).f48481d.f48534g = i2;
        m19817b(i).f48481d.f48533f = -1;
        m19817b(i).f48481d.f48535h = -1.0f;
    }

    /* JADX INFO: renamed from: r */
    public final void m19831r(int i, float f) {
        m19817b(i).f48481d.f48552y = f;
    }

    /* JADX INFO: renamed from: s */
    public final void m19832s(int i, float f) {
        m19817b(i).f48481d.f48553z = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX INFO: renamed from: t */
    public final void m19833t(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        String resourceEntryName;
        int i;
        int i2;
        String str = YmzeHXaMYOLk.XGlBdLvbPrFBCp;
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f48593e.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            HashMap map = this.f48593e;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception e) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
                i = childCount;
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id == -1) {
                    i = childCount;
                } else if (this.f48593e.containsKey(numValueOf)) {
                    hashSet.remove(numValueOf);
                    C1185zt c1185zt = (C1185zt) this.f48593e.get(numValueOf);
                    if (c1185zt != null) {
                        if (childAt instanceof Barrier) {
                            c1185zt.f48481d.f48521aj = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            C1186zu c1186zu = c1185zt.f48481d;
                            barrier.f1443a = c1186zu.f48519ah;
                            barrier.m1405c(c1186zu.f48520ai);
                            C1186zu c1186zu2 = c1185zt.f48481d;
                            barrier.f1444b.f48143b = c1186zu2.f48527ap;
                            int[] iArr = c1186zu2.f48522ak;
                            if (iArr != null) {
                                barrier.m19795g(iArr);
                            } else {
                                String str2 = c1186zu2.f48523al;
                                if (str2 != null) {
                                    c1186zu2.f48522ak = m19814v(barrier, str2);
                                    barrier.m19795g(c1185zt.f48481d.f48522ak);
                                }
                            }
                        }
                        C1178zm c1178zm = (C1178zm) childAt.getLayoutParams();
                        c1178zm.m19797a();
                        c1185zt.m19809a(c1178zm);
                        HashMap map2 = c1185zt.f48483f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : map2.keySet()) {
                            C1175zj c1175zj = (C1175zj) map2.get(str3);
                            String strConcat = !c1175zj.f48351a ? "set".concat(String.valueOf(str3)) : str3;
                            try {
                                int i4 = c1175zj.f48358h;
                                int i5 = i4 - 1;
                                if (i4 == 0) {
                                    i2 = childCount;
                                    throw null;
                                }
                                switch (i5) {
                                    case 0:
                                        int i6 = childCount;
                                        Method method = cls.getMethod(strConcat, Integer.TYPE);
                                        Object[] objArr = new Object[1];
                                        objArr[0] = Integer.valueOf(c1175zj.f48353c);
                                        method.invoke(childAt, objArr);
                                        childCount = i6;
                                        break;
                                    case 1:
                                        int i7 = childCount;
                                        Method method2 = cls.getMethod(strConcat, Float.TYPE);
                                        Object[] objArr2 = new Object[1];
                                        objArr2[0] = Float.valueOf(c1175zj.f48354d);
                                        method2.invoke(childAt, objArr2);
                                        childCount = i7;
                                        break;
                                    case 2:
                                        int i8 = childCount;
                                        Method method3 = cls.getMethod(strConcat, Integer.TYPE);
                                        Object[] objArr3 = new Object[1];
                                        objArr3[0] = Integer.valueOf(c1175zj.f48357g);
                                        method3.invoke(childAt, objArr3);
                                        childCount = i8;
                                        break;
                                    case 3:
                                        int i9 = childCount;
                                        Method method4 = cls.getMethod(strConcat, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1175zj.f48357g);
                                        method4.invoke(childAt, colorDrawable);
                                        childCount = i9;
                                        break;
                                    case 4:
                                        int i10 = childCount;
                                        Method method5 = cls.getMethod(strConcat, CharSequence.class);
                                        Object[] objArr4 = new Object[1];
                                        objArr4[0] = c1175zj.f48355e;
                                        method5.invoke(childAt, objArr4);
                                        childCount = i10;
                                        break;
                                    case 5:
                                        int i11 = childCount;
                                        Method method6 = cls.getMethod(strConcat, Boolean.TYPE);
                                        Object[] objArr5 = new Object[1];
                                        objArr5[0] = Boolean.valueOf(c1175zj.f48356f);
                                        method6.invoke(childAt, objArr5);
                                        childCount = i11;
                                        break;
                                    case 6:
                                        i2 = childCount;
                                        Method method7 = cls.getMethod(strConcat, Float.TYPE);
                                        Object[] objArr6 = new Object[1];
                                        try {
                                            objArr6[0] = Float.valueOf(c1175zj.f48354d);
                                            method7.invoke(childAt, objArr6);
                                            childCount = i2;
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", str + str3 + "\" not found on " + cls.getName(), e);
                                            childCount = i2;
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            childCount = i2;
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", str + str3 + "\" not found on " + cls.getName(), e);
                                            childCount = i2;
                                        }
                                        break;
                                    case 7:
                                        i2 = childCount;
                                        try {
                                            cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(c1175zj.f48353c));
                                            childCount = i2;
                                            strConcat = 1;
                                        } catch (IllegalAccessException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", str + str3 + "\" not found on " + cls.getName(), e);
                                            childCount = i2;
                                        } catch (NoSuchMethodException e6) {
                                            e = e6;
                                            strConcat = strConcat;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            childCount = i2;
                                        } catch (InvocationTargetException e7) {
                                            e = e7;
                                            Log.e("TransitionLayout", str + str3 + "\" not found on " + cls.getName(), e);
                                            childCount = i2;
                                        }
                                        break;
                                    default:
                                        childCount = childCount;
                                        break;
                                }
                            } catch (IllegalAccessException e8) {
                                e = e8;
                                i2 = childCount;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                i2 = childCount;
                                strConcat = strConcat;
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                i2 = childCount;
                            }
                        }
                        i = childCount;
                        childAt.setLayoutParams(c1178zm);
                        C1188zw c1188zw = c1185zt.f48479b;
                        if (c1188zw.f48571c == 0) {
                            childAt.setVisibility(c1188zw.f48570b);
                        }
                        childAt.setAlpha(c1185zt.f48479b.f48572d);
                        childAt.setRotation(c1185zt.f48482e.f48576c);
                        childAt.setRotationX(c1185zt.f48482e.f48577d);
                        childAt.setRotationY(c1185zt.f48482e.f48578e);
                        childAt.setScaleX(c1185zt.f48482e.f48579f);
                        childAt.setScaleY(c1185zt.f48482e.f48580g);
                        C1189zx c1189zx = c1185zt.f48482e;
                        if (c1189zx.f48583j != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(c1185zt.f48482e.f48583j);
                            if (viewFindViewById != null) {
                                int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float f = left;
                                    float left2 = childAt.getLeft();
                                    float top2 = childAt.getTop();
                                    childAt.setPivotX((f / 2.0f) - left2);
                                    childAt.setPivotY((top / 2.0f) - top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(c1189zx.f48581h)) {
                                childAt.setPivotX(c1185zt.f48482e.f48581h);
                            }
                            if (!Float.isNaN(c1185zt.f48482e.f48582i)) {
                                childAt.setPivotY(c1185zt.f48482e.f48582i);
                            }
                        }
                        childAt.setTranslationX(c1185zt.f48482e.f48584k);
                        childAt.setTranslationY(c1185zt.f48482e.f48585l);
                        childAt.setTranslationZ(c1185zt.f48482e.f48586m);
                        C1189zx c1189zx2 = c1185zt.f48482e;
                        if (c1189zx2.f48587n) {
                            childAt.setElevation(c1189zx2.f48588o);
                        }
                    } else {
                        i = childCount;
                    }
                } else {
                    i = childCount;
                }
            }
            i3++;
            childCount = i;
        }
        int i12 = childCount;
        int i13 = 0;
        for (Integer num : hashSet) {
            C1185zt c1185zt2 = (C1185zt) this.f48593e.get(num);
            if (c1185zt2 != null) {
                if (c1185zt2.f48481d.f48521aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C1186zu c1186zu3 = c1185zt2.f48481d;
                    int[] iArr2 = c1186zu3.f48522ak;
                    if (iArr2 != null) {
                        barrier2.m19795g(iArr2);
                    } else {
                        String str4 = c1186zu3.f48523al;
                        if (str4 != null) {
                            c1186zu3.f48522ak = m19814v(barrier2, str4);
                            barrier2.m19795g(c1185zt2.f48481d.f48522ak);
                        }
                    }
                    C1186zu c1186zu4 = c1185zt2.f48481d;
                    barrier2.f1443a = c1186zu4.f48519ah;
                    barrier2.m1405c(c1186zu4.f48520ai);
                    C1178zm c1178zmGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m19796h();
                    c1185zt2.m19809a(c1178zmGenerateDefaultLayoutParams);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView(barrier2, c1178zmGenerateDefaultLayoutParams);
                } else {
                    constraintLayout2 = constraintLayout;
                }
                if (c1185zt2.f48481d.f48529b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1178zm c1178zmGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c1185zt2.m19809a(c1178zmGenerateDefaultLayoutParams2);
                    constraintLayout2.addView(guideline, c1178zmGenerateDefaultLayoutParams2);
                }
            }
        }
        while (true) {
            int i14 = i12;
            if (i13 >= i14) {
                return;
            }
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof C1176zk) {
            }
            i13++;
            i12 = i14;
        }
    }
}
