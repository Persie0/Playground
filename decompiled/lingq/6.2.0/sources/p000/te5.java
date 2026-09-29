package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class te5 implements g60 {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f62192a;

    /* JADX INFO: renamed from: b */
    public final int f62193b;

    public te5(int i, ImmutableList immutableList) {
        this.f62193b = i;
        this.f62192a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static te5 m22013b(int i, k47 k47Var) {
        String str;
        g60 gk9Var;
        String str2;
        int i2 = 4;
        AbstractC3489q9.m19779i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = k47Var.f46702c;
        int iM14879a = -2;
        int i4 = 0;
        while (k47Var.m14820a() > 8) {
            int iM14831o = k47Var.m14831o();
            int iM14831o2 = k47Var.f46701b + k47Var.m14831o();
            k47Var.m14817L(iM14831o2);
            if (iM14831o != 1414744396) {
                k60 k60Var = null;
                switch (iM14831o) {
                    case 1718776947:
                        if (iM14879a != 2) {
                            if (iM14879a == 1) {
                                int iM14835s = k47Var.m14835s();
                                if (iM14835s == 1) {
                                    str = "audio/raw";
                                } else if (iM14835s == 85) {
                                    str = "audio/mpeg";
                                } else if (iM14835s == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM14835s != 8192) {
                                    str = iM14835s != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM14835s2 = k47Var.m14835s();
                                    int iM14831o3 = k47Var.m14831o();
                                    k47Var.m14819N(6);
                                    int iM14835s3 = k47Var.m14835s();
                                    String str3 = uma.f64080a;
                                    int iM22825t = uma.m22825t(iM14835s3, ByteOrder.LITTLE_ENDIAN);
                                    int iM14835s4 = k47Var.m14820a() > 0 ? k47Var.m14835s() : 0;
                                    lc3 lc3Var = new lc3();
                                    lc3Var.f49453n = ez5.m11402l(str);
                                    lc3Var.f49430F = iM14835s2;
                                    lc3Var.f49431G = iM14831o3;
                                    if (str.equals("audio/raw") && iM22825t != 0) {
                                        lc3Var.f49432H = iM22825t;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM14835s4 > 0) {
                                        byte[] bArr = new byte[iM14835s4];
                                        k47Var.m14827k(bArr, 0, iM14835s4);
                                        lc3Var.f49456q = ImmutableList.m6291y(bArr);
                                    }
                                    gk9Var = new gk9(new C0713b(lc3Var));
                                } else {
                                    hn1.m13364n("Ignoring track with unsupported format tag ", iM14835s, "StreamFormatChunk");
                                }
                            } else {
                                ss5.m21707d0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(uma.m22826u(iM14879a)));
                            }
                            gk9Var = k60Var;
                            break;
                        } else {
                            k47Var.m14819N(i2);
                            int iM14831o4 = k47Var.m14831o();
                            int iM14831o5 = k47Var.m14831o();
                            k47Var.m14819N(i2);
                            int iM14831o6 = k47Var.m14831o();
                            switch (iM14831o6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                lc3 lc3Var2 = new lc3();
                                lc3Var2.f49460u = iM14831o4;
                                lc3Var2.f49461v = iM14831o5;
                                lc3Var2.m16083p(str2);
                                gk9Var = new gk9(new C0713b(lc3Var2));
                            } else {
                                hn1.m13364n("Ignoring track with unsupported compression ", iM14831o6, "StreamFormatChunk");
                                gk9Var = k60Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iM14831o7 = k47Var.m14831o();
                        k47Var.m14819N(8);
                        int iM14831o8 = k47Var.m14831o();
                        int iM14831o9 = k47Var.m14831o();
                        k47Var.m14819N(i2);
                        k47Var.m14831o();
                        k47Var.m14819N(12);
                        gk9Var = new j60(iM14831o7, iM14831o8, iM14831o9);
                        break;
                    case 1752331379:
                        int iM14831o10 = k47Var.m14831o();
                        k47Var.m14819N(12);
                        k47Var.m14831o();
                        int iM14831o11 = k47Var.m14831o();
                        int iM14831o12 = k47Var.m14831o();
                        k47Var.m14819N(i2);
                        int iM14831o13 = k47Var.m14831o();
                        int iM14831o14 = k47Var.m14831o();
                        k47Var.m14819N(i2);
                        k60Var = new k60(iM14831o10, iM14831o11, iM14831o12, iM14831o13, iM14831o14, k47Var.m14831o());
                        gk9Var = k60Var;
                        break;
                    case 1852994675:
                        gk9Var = new hk9(k47Var.m14840x(k47Var.m14820a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gk9Var = k60Var;
                        break;
                }
            } else {
                gk9Var = m22013b(k47Var.m14831o(), k47Var);
            }
            if (gk9Var != null) {
                if (gk9Var.getType() == 1752331379) {
                    iM14879a = ((k60) gk9Var).m14879a();
                }
                int i5 = i4 + 1;
                int iM3155f = b14.m3155f(objArrCopyOf.length, i5);
                if (iM3155f > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM3155f);
                }
                objArrCopyOf[i4] = gk9Var;
                i4 = i5;
            }
            k47Var.m14818M(iM14831o2);
            k47Var.m14817L(i3);
            i2 = 4;
        }
        return new te5(i, ImmutableList.m6283l(objArrCopyOf, i4));
    }

    /* JADX INFO: renamed from: a */
    public final g60 m22014a(Class cls) {
        d14 d14VarListIterator = this.f62192a.listIterator(0);
        while (d14VarListIterator.hasNext()) {
            g60 g60Var = (g60) d14VarListIterator.next();
            if (g60Var.getClass() == cls) {
                return g60Var;
            }
        }
        return null;
    }

    @Override // p000.g60
    public final int getType() {
        return this.f62193b;
    }
}
