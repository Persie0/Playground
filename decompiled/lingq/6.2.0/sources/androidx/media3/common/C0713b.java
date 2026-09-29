package androidx.media3.common;

import android.text.TextUtils;
import com.google.common.collect.AbstractC1102r;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.al4;
import p000.bna;
import p000.cj2;
import p000.ey5;
import p000.ga1;
import p000.lc3;
import p000.si4;
import p000.tj0;
import p000.uma;
import p000.ux5;
import p000.wq1;
import p000.zk0;

/* JADX INFO: renamed from: androidx.media3.common.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0713b {

    /* JADX INFO: renamed from: A */
    public final int f6375A;

    /* JADX INFO: renamed from: B */
    public final float f6376B;

    /* JADX INFO: renamed from: C */
    public final byte[] f6377C;

    /* JADX INFO: renamed from: D */
    public final int f6378D;

    /* JADX INFO: renamed from: E */
    public final ga1 f6379E;

    /* JADX INFO: renamed from: F */
    public final int f6380F;

    /* JADX INFO: renamed from: G */
    public final int f6381G;

    /* JADX INFO: renamed from: H */
    public final int f6382H;

    /* JADX INFO: renamed from: I */
    public final int f6383I;

    /* JADX INFO: renamed from: J */
    public final int f6384J;

    /* JADX INFO: renamed from: K */
    public final int f6385K;

    /* JADX INFO: renamed from: L */
    public final int f6386L;

    /* JADX INFO: renamed from: M */
    public final int f6387M;

    /* JADX INFO: renamed from: N */
    public final int f6388N;

    /* JADX INFO: renamed from: O */
    public final int f6389O;

    /* JADX INFO: renamed from: P */
    public final int f6390P;

    /* JADX INFO: renamed from: Q */
    public int f6391Q;

    /* JADX INFO: renamed from: a */
    public final String f6392a;

    /* JADX INFO: renamed from: b */
    public final String f6393b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList f6394c;

    /* JADX INFO: renamed from: d */
    public final String f6395d;

    /* JADX INFO: renamed from: e */
    public final int f6396e;

    /* JADX INFO: renamed from: f */
    public final int f6397f;

    /* JADX INFO: renamed from: g */
    public final int f6398g;

    /* JADX INFO: renamed from: h */
    public final int f6399h;

    /* JADX INFO: renamed from: i */
    public final int f6400i;

    /* JADX INFO: renamed from: j */
    public final int f6401j;

    /* JADX INFO: renamed from: k */
    public final String f6402k;

    /* JADX INFO: renamed from: l */
    public final ey5 f6403l;

    /* JADX INFO: renamed from: m */
    public final String f6404m;

    /* JADX INFO: renamed from: n */
    public final String f6405n;

    /* JADX INFO: renamed from: o */
    public final String f6406o;

    /* JADX INFO: renamed from: p */
    public final int f6407p;

    /* JADX INFO: renamed from: q */
    public final int f6408q;

    /* JADX INFO: renamed from: r */
    public final List f6409r;

    /* JADX INFO: renamed from: s */
    public final DrmInitData f6410s;

    /* JADX INFO: renamed from: t */
    public final long f6411t;

    /* JADX INFO: renamed from: u */
    public final boolean f6412u;

    /* JADX INFO: renamed from: v */
    public final int f6413v;

    /* JADX INFO: renamed from: w */
    public final int f6414w;

    /* JADX INFO: renamed from: x */
    public final int f6415x;

    /* JADX INFO: renamed from: y */
    public final int f6416y;

    /* JADX INFO: renamed from: z */
    public final float f6417z;

    static {
        new lc3().m16068a();
        uma.m22828w(0);
        uma.m22828w(1);
        uma.m22828w(2);
        uma.m22828w(3);
        uma.m22828w(4);
        AbstractC3393o1.m17746u(5, 6, 7, 8, 9);
        AbstractC3393o1.m17746u(10, 11, 12, 13, 14);
        AbstractC3393o1.m17746u(15, 16, 17, 18, 19);
        AbstractC3393o1.m17746u(20, 21, 22, 23, 24);
        AbstractC3393o1.m17746u(25, 26, 27, 28, 29);
        AbstractC3393o1.m17746u(30, 31, 32, 33, 34);
        uma.m22828w(35);
        uma.m22828w(36);
        uma.m22828w(37);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0713b(lc3 lc3Var) {
        boolean z;
        String str;
        this.f6392a = lc3Var.f49440a;
        String strM22798C = uma.m22798C(lc3Var.f49443d);
        this.f6395d = strM22798C;
        if (lc3Var.f49442c.isEmpty() && lc3Var.f49441b != null) {
            this.f6394c = ImmutableList.m6291y(new al4(strM22798C, lc3Var.f49441b));
            this.f6393b = lc3Var.f49441b;
        } else if (lc3Var.f49442c.isEmpty() || lc3Var.f49441b != null) {
            if (!lc3Var.f49442c.isEmpty() || lc3Var.f49441b != null) {
                int i = 0;
                while (true) {
                    if (i >= lc3Var.f49442c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((al4) lc3Var.f49442c.get(i)).f802b.equals(lc3Var.f49441b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            bna.m3987z(z);
            this.f6394c = lc3Var.f49442c;
            this.f6393b = lc3Var.f49441b;
        } else {
            ImmutableList immutableList = lc3Var.f49442c;
            this.f6394c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((al4) immutableList.get(0)).f802b;
                    break;
                }
                al4 al4Var = (al4) it.next();
                if (TextUtils.equals(al4Var.f801a, strM22798C)) {
                    str = al4Var.f802b;
                    break;
                }
            }
            this.f6393b = str;
        }
        this.f6396e = lc3Var.f49444e;
        bna.m3985y("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", lc3Var.f49446g == 0 || (lc3Var.f49445f & 32768) != 0);
        this.f6397f = lc3Var.f49445f;
        this.f6398g = lc3Var.f49446g;
        int i2 = lc3Var.f49447h;
        this.f6399h = i2;
        int i3 = lc3Var.f49448i;
        this.f6400i = i3;
        this.f6401j = i3 != -1 ? i3 : i2;
        this.f6402k = lc3Var.f49449j;
        this.f6403l = lc3Var.f49450k;
        this.f6404m = lc3Var.f49451l;
        this.f6405n = lc3Var.f49452m;
        this.f6406o = lc3Var.f49453n;
        this.f6407p = lc3Var.f49454o;
        this.f6408q = lc3Var.f49455p;
        List list = lc3Var.f49456q;
        this.f6409r = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = lc3Var.f49457r;
        this.f6410s = drmInitData;
        this.f6411t = lc3Var.f49458s;
        this.f6412u = lc3Var.f49459t;
        this.f6413v = lc3Var.f49460u;
        this.f6414w = lc3Var.f49461v;
        this.f6415x = lc3Var.f49462w;
        this.f6416y = lc3Var.f49463x;
        this.f6417z = lc3Var.f49464y;
        int i4 = lc3Var.f49465z;
        this.f6375A = i4 == -1 ? 0 : i4;
        float f = lc3Var.f49425A;
        this.f6376B = f == -1.0f ? 1.0f : f;
        this.f6377C = lc3Var.f49426B;
        this.f6378D = lc3Var.f49427C;
        this.f6379E = lc3Var.f49428D;
        this.f6380F = lc3Var.f49429E;
        this.f6381G = lc3Var.f49430F;
        this.f6382H = lc3Var.f49431G;
        this.f6383I = lc3Var.f49432H;
        int i5 = lc3Var.f49433I;
        this.f6384J = i5 == -1 ? 0 : i5;
        int i6 = lc3Var.f49434J;
        this.f6385K = i6 != -1 ? i6 : 0;
        this.f6386L = lc3Var.f49435K;
        this.f6387M = lc3Var.f49436L;
        this.f6388N = lc3Var.f49437M;
        this.f6389O = lc3Var.f49438N;
        int i7 = lc3Var.f49439O;
        if (i7 != 0 || drmInitData == null) {
            this.f6390P = i7;
        } else {
            this.f6390P = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2519c(C0713b c0713b) {
        int i;
        String str;
        String str2;
        if (c0713b == null) {
            return "null";
        }
        int i2 = c0713b.f6396e;
        ImmutableList immutableList = c0713b.f6394c;
        String str3 = c0713b.f6395d;
        int i3 = c0713b.f6382H;
        int i4 = c0713b.f6381G;
        int i5 = c0713b.f6380F;
        float f = c0713b.f6417z;
        ga1 ga1Var = c0713b.f6379E;
        float f2 = c0713b.f6376B;
        int i6 = c0713b.f6416y;
        int i7 = c0713b.f6415x;
        int i8 = c0713b.f6414w;
        int i9 = c0713b.f6413v;
        DrmInitData drmInitData = c0713b.f6410s;
        String str4 = c0713b.f6402k;
        int i10 = c0713b.f6401j;
        String str5 = c0713b.f6404m;
        String str6 = c0713b.f6405n;
        int i11 = c0713b.f6397f;
        si4 si4Var = new si4(String.valueOf(','), 1);
        StringBuilder sbM22997t = ux5.m22997t("id=");
        sbM22997t.append(c0713b.f6392a);
        sbM22997t.append(", mimeType=");
        sbM22997t.append(c0713b.f6406o);
        if (str6 != null) {
            sbM22997t.append(", container=");
            sbM22997t.append(str6);
        }
        if (str5 != null) {
            sbM22997t.append(", primaryGroupId=");
            sbM22997t.append(str5);
        }
        if (i10 != -1) {
            sbM22997t.append(", bitrate=");
            sbM22997t.append(i10);
        }
        if (str4 != null) {
            sbM22997t.append(", codecs=");
            sbM22997t.append(str4);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < drmInitData.f6365d; i12++) {
                UUID uuid = drmInitData.f6362a[i12].f6367b;
                if (uuid.equals(zk0.f71669b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zk0.f71670c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zk0.f71672e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zk0.f71671d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zk0.f71668a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbM22997t.append(", drm=[");
            si4Var.m21394a(sbM22997t, linkedHashSet.iterator());
            sbM22997t.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            wq1.m24127w(i9, i8, ", res=", "x", sbM22997t);
        }
        if (i7 != -1 && i6 != -1) {
            wq1.m24127w(i7, i6, ", decRes=", "x", sbM22997t);
        }
        double d = f2;
        int i13 = cj2.f10167a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM22997t.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = uma.f64080a;
            sbM22997t.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (ga1Var != null) {
            int i14 = ga1Var.f40449f;
            int i15 = ga1Var.f40448e;
            if ((i15 != -1 && i14 != -1) || ga1Var.m12452d()) {
                sbM22997t.append(", color=");
                if (ga1Var.m12452d()) {
                    String strM12447b = ga1.m12447b(ga1Var.f40444a);
                    String strM12446a = ga1.m12446a(ga1Var.f40445b);
                    String strM12448c = ga1.m12448c(ga1Var.f40446c);
                    Locale locale = Locale.US;
                    str2 = strM12447b + "/" + strM12446a + "/" + strM12448c;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbM22997t.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            sbM22997t.append(", fps=");
            sbM22997t.append(f);
        }
        if (i5 != -1) {
            sbM22997t.append(", maxSubLayers=");
            sbM22997t.append(i5);
        }
        if (i4 != -1) {
            sbM22997t.append(", channels=");
            sbM22997t.append(i4);
        }
        if (i3 != -1) {
            sbM22997t.append(", sample_rate=");
            sbM22997t.append(i3);
        }
        if (str3 != null) {
            sbM22997t.append(", language=");
            sbM22997t.append(str3);
        }
        boolean zIsEmpty = immutableList.isEmpty();
        int i16 = 4;
        if (!zIsEmpty) {
            sbM22997t.append(", labels=[");
            si4Var.m21394a(sbM22997t, AbstractC1102r.m6347b(immutableList, new tj0(i16)).iterator());
            sbM22997t.append("]");
        }
        if (i2 != 0) {
            sbM22997t.append(", selectionFlags=[");
            String str8 = uma.f64080a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            si4Var.m21394a(sbM22997t, arrayList.iterator());
            sbM22997t.append("]");
        }
        if (i11 != 0) {
            sbM22997t.append(", roleFlags=[");
            String str9 = uma.f64080a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            si4Var.m21394a(sbM22997t, arrayList2.iterator());
            sbM22997t.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbM22997t.append(", auxiliaryTrackType=");
            int i17 = c0713b.f6398g;
            String str10 = uma.f64080a;
            if (i17 == 0) {
                str = "undefined";
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    C3386nv.m17633t("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbM22997t.append(str);
        }
        return sbM22997t.toString();
    }

    /* JADX INFO: renamed from: a */
    public final lc3 m2520a() {
        lc3 lc3Var = new lc3();
        lc3Var.f49440a = this.f6392a;
        lc3Var.f49441b = this.f6393b;
        lc3Var.f49442c = this.f6394c;
        lc3Var.f49443d = this.f6395d;
        lc3Var.f49444e = this.f6396e;
        lc3Var.f49445f = this.f6397f;
        lc3Var.f49447h = this.f6399h;
        lc3Var.f49448i = this.f6400i;
        lc3Var.f49449j = this.f6402k;
        lc3Var.f49450k = this.f6403l;
        lc3Var.f49451l = this.f6404m;
        lc3Var.f49452m = this.f6405n;
        lc3Var.f49453n = this.f6406o;
        lc3Var.f49454o = this.f6407p;
        lc3Var.f49455p = this.f6408q;
        lc3Var.f49456q = this.f6409r;
        lc3Var.f49457r = this.f6410s;
        lc3Var.f49458s = this.f6411t;
        lc3Var.f49459t = this.f6412u;
        lc3Var.f49460u = this.f6413v;
        lc3Var.f49461v = this.f6414w;
        lc3Var.f49462w = this.f6415x;
        lc3Var.f49463x = this.f6416y;
        lc3Var.f49464y = this.f6417z;
        lc3Var.f49465z = this.f6375A;
        lc3Var.f49425A = this.f6376B;
        lc3Var.f49426B = this.f6377C;
        lc3Var.f49427C = this.f6378D;
        lc3Var.f49428D = this.f6379E;
        lc3Var.f49429E = this.f6380F;
        lc3Var.f49430F = this.f6381G;
        lc3Var.f49431G = this.f6382H;
        lc3Var.f49432H = this.f6383I;
        lc3Var.f49433I = this.f6384J;
        lc3Var.f49434J = this.f6385K;
        lc3Var.f49435K = this.f6386L;
        lc3Var.f49436L = this.f6387M;
        lc3Var.f49437M = this.f6388N;
        lc3Var.f49438N = this.f6389O;
        lc3Var.f49439O = this.f6390P;
        return lc3Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2521b(C0713b c0713b) {
        List list = this.f6409r;
        if (list.size() != c0713b.f6409r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c0713b.f6409r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0713b.class != obj.getClass()) {
            return false;
        }
        C0713b c0713b = (C0713b) obj;
        int i2 = this.f6391Q;
        return (i2 == 0 || (i = c0713b.f6391Q) == 0 || i2 == i) && this.f6396e == c0713b.f6396e && this.f6397f == c0713b.f6397f && this.f6398g == c0713b.f6398g && this.f6399h == c0713b.f6399h && this.f6400i == c0713b.f6400i && this.f6407p == c0713b.f6407p && this.f6411t == c0713b.f6411t && this.f6413v == c0713b.f6413v && this.f6414w == c0713b.f6414w && this.f6415x == c0713b.f6415x && this.f6416y == c0713b.f6416y && this.f6375A == c0713b.f6375A && this.f6378D == c0713b.f6378D && this.f6380F == c0713b.f6380F && this.f6381G == c0713b.f6381G && this.f6382H == c0713b.f6382H && this.f6383I == c0713b.f6383I && this.f6384J == c0713b.f6384J && this.f6385K == c0713b.f6385K && this.f6386L == c0713b.f6386L && this.f6388N == c0713b.f6388N && this.f6389O == c0713b.f6389O && this.f6390P == c0713b.f6390P && Float.compare(this.f6417z, c0713b.f6417z) == 0 && Float.compare(this.f6376B, c0713b.f6376B) == 0 && Objects.equals(this.f6392a, c0713b.f6392a) && Objects.equals(this.f6393b, c0713b.f6393b) && this.f6394c.equals(c0713b.f6394c) && Objects.equals(this.f6402k, c0713b.f6402k) && Objects.equals(this.f6404m, c0713b.f6404m) && Objects.equals(this.f6405n, c0713b.f6405n) && Objects.equals(this.f6406o, c0713b.f6406o) && Objects.equals(this.f6395d, c0713b.f6395d) && Arrays.equals(this.f6377C, c0713b.f6377C) && Objects.equals(this.f6403l, c0713b.f6403l) && Objects.equals(this.f6379E, c0713b.f6379E) && Objects.equals(this.f6410s, c0713b.f6410s) && m2521b(c0713b);
    }

    public final int hashCode() {
        if (this.f6391Q == 0) {
            String str = this.f6392a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6393b;
            int iHashCode2 = (this.f6394c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f6395d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f6396e) * 31) + this.f6397f) * 31) + this.f6398g) * 31) + this.f6399h) * 31) + this.f6400i) * 31;
            String str4 = this.f6402k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ey5 ey5Var = this.f6403l;
            int iHashCode5 = (iHashCode4 + (ey5Var == null ? 0 : ey5Var.hashCode())) * 961;
            String str5 = this.f6404m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f6405n;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f6406o;
            this.f6391Q = ((((((((((((((((((((((Float.floatToIntBits(this.f6376B) + ((((Float.floatToIntBits(this.f6417z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f6407p) * 31) + ((int) this.f6411t)) * 31) + this.f6413v) * 31) + this.f6414w) * 31) + this.f6415x) * 31) + this.f6416y) * 31)) * 31) + this.f6375A) * 31)) * 31) + this.f6378D) * 31) + this.f6380F) * 31) + this.f6381G) * 31) + this.f6382H) * 31) + this.f6383I) * 31) + this.f6384J) * 31) + this.f6385K) * 31) + this.f6386L) * 31) + this.f6388N) * 31) + this.f6389O) * 31) + this.f6390P;
        }
        return this.f6391Q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f6392a);
        sb.append(", ");
        sb.append(this.f6393b);
        sb.append(", ");
        sb.append(this.f6405n);
        sb.append(", ");
        sb.append(this.f6406o);
        sb.append(", ");
        sb.append(this.f6402k);
        sb.append(", ");
        sb.append(this.f6401j);
        sb.append(", ");
        sb.append(this.f6395d);
        sb.append(", [");
        sb.append(this.f6413v);
        sb.append(", ");
        sb.append(this.f6414w);
        sb.append(", ");
        sb.append(this.f6417z);
        sb.append(", ");
        sb.append(this.f6379E);
        sb.append("], [");
        sb.append(this.f6381G);
        sb.append(", ");
        return wq1.m24123s(sb, this.f6382H, "])");
    }
}
