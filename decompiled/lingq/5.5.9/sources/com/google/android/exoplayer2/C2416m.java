package com.google.android.exoplayer2;

import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import p057cp.C4991e;
import p150h9.C5903b;
import p402u0.C9362e;
import p479xa.C10134c0;
import p479xa.C10147p;
import p505ya.C10320b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2416m implements InterfaceC2409f {

    /* JADX INFO: renamed from: H */
    public final int f12451H;

    /* JADX INFO: renamed from: I */
    public final List<byte[]> f12452I;

    /* JADX INFO: renamed from: J */
    public final DrmInitData f12453J;

    /* JADX INFO: renamed from: K */
    public final long f12454K;

    /* JADX INFO: renamed from: L */
    public final int f12455L;

    /* JADX INFO: renamed from: M */
    public final int f12456M;

    /* JADX INFO: renamed from: N */
    public final float f12457N;

    /* JADX INFO: renamed from: O */
    public final int f12458O;

    /* JADX INFO: renamed from: P */
    public final float f12459P;

    /* JADX INFO: renamed from: Q */
    public final byte[] f12460Q;

    /* JADX INFO: renamed from: R */
    public final int f12461R;

    /* JADX INFO: renamed from: S */
    public final C10320b f12462S;

    /* JADX INFO: renamed from: T */
    public final int f12463T;

    /* JADX INFO: renamed from: U */
    public final int f12464U;

    /* JADX INFO: renamed from: V */
    public final int f12465V;

    /* JADX INFO: renamed from: W */
    public final int f12466W;

    /* JADX INFO: renamed from: X */
    public final int f12467X;

    /* JADX INFO: renamed from: Y */
    public final int f12468Y;

    /* JADX INFO: renamed from: Z */
    public final int f12469Z;

    /* JADX INFO: renamed from: a */
    public final String f12470a;

    /* JADX INFO: renamed from: a0 */
    public final int f12471a0;

    /* JADX INFO: renamed from: b */
    public final String f12472b;

    /* JADX INFO: renamed from: b0 */
    public final int f12473b0;

    /* JADX INFO: renamed from: c */
    public final String f12474c;

    /* JADX INFO: renamed from: c0 */
    public int f12475c0;

    /* JADX INFO: renamed from: d */
    public final int f12476d;

    /* JADX INFO: renamed from: e */
    public final int f12477e;

    /* JADX INFO: renamed from: f */
    public final int f12478f;

    /* JADX INFO: renamed from: g */
    public final int f12479g;

    /* JADX INFO: renamed from: h */
    public final int f12480h;

    /* JADX INFO: renamed from: i */
    public final String f12481i;

    /* JADX INFO: renamed from: j */
    public final Metadata f12482j;

    /* JADX INFO: renamed from: k */
    public final String f12483k;

    /* JADX INFO: renamed from: l */
    public final String f12484l;

    /* JADX INFO: renamed from: d0 */
    public static final C2416m f12428d0 = new C2416m(new a());

    /* JADX INFO: renamed from: e0 */
    public static final String f12429e0 = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: f0 */
    public static final String f12430f0 = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: g0 */
    public static final String f12431g0 = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: h0 */
    public static final String f12432h0 = C10134c0.m19021F(3);

    /* JADX INFO: renamed from: i0 */
    public static final String f12433i0 = C10134c0.m19021F(4);

    /* JADX INFO: renamed from: j0 */
    public static final String f12434j0 = C10134c0.m19021F(5);

    /* JADX INFO: renamed from: k0 */
    public static final String f12435k0 = C10134c0.m19021F(6);

    /* JADX INFO: renamed from: l0 */
    public static final String f12436l0 = C10134c0.m19021F(7);

    /* JADX INFO: renamed from: m0 */
    public static final String f12437m0 = C10134c0.m19021F(8);

    /* JADX INFO: renamed from: n0 */
    public static final String f12438n0 = C10134c0.m19021F(9);

    /* JADX INFO: renamed from: o0 */
    public static final String f12439o0 = C10134c0.m19021F(10);

    /* JADX INFO: renamed from: p0 */
    public static final String f12440p0 = C10134c0.m19021F(11);

    /* JADX INFO: renamed from: q0 */
    public static final String f12441q0 = C10134c0.m19021F(12);

    /* JADX INFO: renamed from: r0 */
    public static final String f12442r0 = C10134c0.m19021F(13);

    /* JADX INFO: renamed from: s0 */
    public static final String f12443s0 = C10134c0.m19021F(14);

    /* JADX INFO: renamed from: t0 */
    public static final String f12444t0 = C10134c0.m19021F(15);

    /* JADX INFO: renamed from: u0 */
    public static final String f12445u0 = C10134c0.m19021F(16);

    /* JADX INFO: renamed from: v0 */
    public static final String f12446v0 = C10134c0.m19021F(17);

    /* JADX INFO: renamed from: w0 */
    public static final String f12447w0 = C10134c0.m19021F(18);

    /* JADX INFO: renamed from: x0 */
    public static final String f12448x0 = C10134c0.m19021F(19);

    /* JADX INFO: renamed from: y0 */
    public static final String f12449y0 = C10134c0.m19021F(20);

    /* JADX INFO: renamed from: z0 */
    public static final String f12450z0 = C10134c0.m19021F(21);

    /* JADX INFO: renamed from: A0 */
    public static final String f12417A0 = C10134c0.m19021F(22);

    /* JADX INFO: renamed from: B0 */
    public static final String f12418B0 = C10134c0.m19021F(23);

    /* JADX INFO: renamed from: C0 */
    public static final String f12419C0 = C10134c0.m19021F(24);

    /* JADX INFO: renamed from: D0 */
    public static final String f12420D0 = C10134c0.m19021F(25);

    /* JADX INFO: renamed from: E0 */
    public static final String f12421E0 = C10134c0.m19021F(26);

    /* JADX INFO: renamed from: F0 */
    public static final String f12422F0 = C10134c0.m19021F(27);

    /* JADX INFO: renamed from: G0 */
    public static final String f12423G0 = C10134c0.m19021F(28);

    /* JADX INFO: renamed from: H0 */
    public static final String f12424H0 = C10134c0.m19021F(29);

    /* JADX INFO: renamed from: I0 */
    public static final String f12425I0 = C10134c0.m19021F(30);

    /* JADX INFO: renamed from: J0 */
    public static final String f12426J0 = C10134c0.m19021F(31);

    /* JADX INFO: renamed from: K0 */
    public static final C9362e f12427K0 = new C9362e(12);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.m$a */
    public static final class a {

        /* JADX INFO: renamed from: A */
        public int f12485A;

        /* JADX INFO: renamed from: B */
        public int f12486B;

        /* JADX INFO: renamed from: C */
        public int f12487C;

        /* JADX INFO: renamed from: D */
        public int f12488D;

        /* JADX INFO: renamed from: E */
        public int f12489E;

        /* JADX INFO: renamed from: F */
        public int f12490F;

        /* JADX INFO: renamed from: a */
        public String f12491a;

        /* JADX INFO: renamed from: b */
        public String f12492b;

        /* JADX INFO: renamed from: c */
        public String f12493c;

        /* JADX INFO: renamed from: d */
        public int f12494d;

        /* JADX INFO: renamed from: e */
        public int f12495e;

        /* JADX INFO: renamed from: f */
        public int f12496f;

        /* JADX INFO: renamed from: g */
        public int f12497g;

        /* JADX INFO: renamed from: h */
        public String f12498h;

        /* JADX INFO: renamed from: i */
        public Metadata f12499i;

        /* JADX INFO: renamed from: j */
        public String f12500j;

        /* JADX INFO: renamed from: k */
        public String f12501k;

        /* JADX INFO: renamed from: l */
        public int f12502l;

        /* JADX INFO: renamed from: m */
        public List<byte[]> f12503m;

        /* JADX INFO: renamed from: n */
        public DrmInitData f12504n;

        /* JADX INFO: renamed from: o */
        public long f12505o;

        /* JADX INFO: renamed from: p */
        public int f12506p;

        /* JADX INFO: renamed from: q */
        public int f12507q;

        /* JADX INFO: renamed from: r */
        public float f12508r;

        /* JADX INFO: renamed from: s */
        public int f12509s;

        /* JADX INFO: renamed from: t */
        public float f12510t;

        /* JADX INFO: renamed from: u */
        public byte[] f12511u;

        /* JADX INFO: renamed from: v */
        public int f12512v;

        /* JADX INFO: renamed from: w */
        public C10320b f12513w;

        /* JADX INFO: renamed from: x */
        public int f12514x;

        /* JADX INFO: renamed from: y */
        public int f12515y;

        /* JADX INFO: renamed from: z */
        public int f12516z;

        public a() {
            this.f12496f = -1;
            this.f12497g = -1;
            this.f12502l = -1;
            this.f12505o = Long.MAX_VALUE;
            this.f12506p = -1;
            this.f12507q = -1;
            this.f12508r = -1.0f;
            this.f12510t = 1.0f;
            this.f12512v = -1;
            this.f12514x = -1;
            this.f12515y = -1;
            this.f12516z = -1;
            this.f12487C = -1;
            this.f12488D = -1;
            this.f12489E = -1;
            this.f12490F = 0;
        }

        public a(C2416m c2416m) {
            this.f12491a = c2416m.f12470a;
            this.f12492b = c2416m.f12472b;
            this.f12493c = c2416m.f12474c;
            this.f12494d = c2416m.f12476d;
            this.f12495e = c2416m.f12477e;
            this.f12496f = c2416m.f12478f;
            this.f12497g = c2416m.f12479g;
            this.f12498h = c2416m.f12481i;
            this.f12499i = c2416m.f12482j;
            this.f12500j = c2416m.f12483k;
            this.f12501k = c2416m.f12484l;
            this.f12502l = c2416m.f12451H;
            this.f12503m = c2416m.f12452I;
            this.f12504n = c2416m.f12453J;
            this.f12505o = c2416m.f12454K;
            this.f12506p = c2416m.f12455L;
            this.f12507q = c2416m.f12456M;
            this.f12508r = c2416m.f12457N;
            this.f12509s = c2416m.f12458O;
            this.f12510t = c2416m.f12459P;
            this.f12511u = c2416m.f12460Q;
            this.f12512v = c2416m.f12461R;
            this.f12513w = c2416m.f12462S;
            this.f12514x = c2416m.f12463T;
            this.f12515y = c2416m.f12464U;
            this.f12516z = c2416m.f12465V;
            this.f12485A = c2416m.f12466W;
            this.f12486B = c2416m.f12467X;
            this.f12487C = c2416m.f12468Y;
            this.f12488D = c2416m.f12469Z;
            this.f12489E = c2416m.f12471a0;
            this.f12490F = c2416m.f12473b0;
        }

        /* JADX INFO: renamed from: a */
        public final C2416m m7128a() {
            return new C2416m(this);
        }

        /* JADX INFO: renamed from: b */
        public final void m7129b(int i10) {
            this.f12491a = Integer.toString(i10);
        }
    }

    public C2416m(a aVar) {
        this.f12470a = aVar.f12491a;
        this.f12472b = aVar.f12492b;
        this.f12474c = C10134c0.m19027L(aVar.f12493c);
        this.f12476d = aVar.f12494d;
        this.f12477e = aVar.f12495e;
        int i10 = aVar.f12496f;
        this.f12478f = i10;
        int i11 = aVar.f12497g;
        this.f12479g = i11;
        this.f12480h = i11 != -1 ? i11 : i10;
        this.f12481i = aVar.f12498h;
        this.f12482j = aVar.f12499i;
        this.f12483k = aVar.f12500j;
        this.f12484l = aVar.f12501k;
        this.f12451H = aVar.f12502l;
        List<byte[]> list = aVar.f12503m;
        this.f12452I = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = aVar.f12504n;
        this.f12453J = drmInitData;
        this.f12454K = aVar.f12505o;
        this.f12455L = aVar.f12506p;
        this.f12456M = aVar.f12507q;
        this.f12457N = aVar.f12508r;
        int i12 = aVar.f12509s;
        int i13 = 0;
        this.f12458O = i12 == -1 ? 0 : i12;
        float f3 = aVar.f12510t;
        this.f12459P = f3 == -1.0f ? 1.0f : f3;
        this.f12460Q = aVar.f12511u;
        this.f12461R = aVar.f12512v;
        this.f12462S = aVar.f12513w;
        this.f12463T = aVar.f12514x;
        this.f12464U = aVar.f12515y;
        this.f12465V = aVar.f12516z;
        int i14 = aVar.f12485A;
        this.f12466W = i14 == -1 ? 0 : i14;
        int i15 = aVar.f12486B;
        this.f12467X = i15 != -1 ? i15 : i13;
        this.f12468Y = aVar.f12487C;
        this.f12469Z = aVar.f12488D;
        this.f12471a0 = aVar.f12489E;
        int i16 = aVar.f12490F;
        if (i16 != 0 || drmInitData == null) {
            this.f12473b0 = i16;
        } else {
            this.f12473b0 = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m7123c(int i10) {
        return f12441q0 + "_" + Integer.toString(i10, 36);
    }

    /* JADX INFO: renamed from: d */
    public static String m7124d(C2416m c2416m) {
        int i10;
        if (c2416m == null) {
            return "null";
        }
        StringBuilder sbM771r = C0166e.m771r("id=");
        sbM771r.append(c2416m.f12470a);
        sbM771r.append(", mimeType=");
        sbM771r.append(c2416m.f12484l);
        int i11 = c2416m.f12480h;
        if (i11 != -1) {
            sbM771r.append(", bitrate=");
            sbM771r.append(i11);
        }
        String str = c2416m.f12481i;
        if (str != null) {
            sbM771r.append(", codecs=");
            sbM771r.append(str);
        }
        DrmInitData drmInitData = c2416m.f12453J;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < drmInitData.f12189d; i12++) {
                UUID uuid = drmInitData.f12186a[i12].f12191b;
                if (uuid.equals(C5903b.f35259b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C5903b.f35260c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C5903b.f35262e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C5903b.f35261d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C5903b.f35258a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbM771r.append(", drm=[");
            new C4991e(String.valueOf(',')).m10696c(sbM771r, linkedHashSet.iterator());
            sbM771r.append(']');
        }
        int i13 = c2416m.f12455L;
        if (i13 != -1 && (i10 = c2416m.f12456M) != -1) {
            sbM771r.append(", res=");
            sbM771r.append(i13);
            sbM771r.append("x");
            sbM771r.append(i10);
        }
        float f3 = c2416m.f12457N;
        if (f3 != -1.0f) {
            sbM771r.append(", fps=");
            sbM771r.append(f3);
        }
        int i14 = c2416m.f12463T;
        if (i14 != -1) {
            sbM771r.append(", channels=");
            sbM771r.append(i14);
        }
        int i15 = c2416m.f12464U;
        if (i15 != -1) {
            sbM771r.append(", sample_rate=");
            sbM771r.append(i15);
        }
        String str2 = c2416m.f12474c;
        if (str2 != null) {
            sbM771r.append(", language=");
            sbM771r.append(str2);
        }
        String str3 = c2416m.f12472b;
        if (str3 != null) {
            sbM771r.append(", label=");
            sbM771r.append(str3);
        }
        int i16 = c2416m.f12476d;
        if (i16 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i16 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i16 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i16 & 2) != 0) {
                arrayList.add("forced");
            }
            sbM771r.append(", selectionFlags=[");
            new C4991e(String.valueOf(',')).m10696c(sbM771r, arrayList.iterator());
            sbM771r.append("]");
        }
        int i17 = c2416m.f12477e;
        if (i17 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i17 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i17 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i17 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i17 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i17 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i17 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i17 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i17 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i17 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i17 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i17 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i17 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i17 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i17 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i17 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sbM771r.append(", roleFlags=[");
            new C4991e(String.valueOf(',')).m10696c(sbM771r, arrayList2.iterator());
            sbM771r.append("]");
        }
        return sbM771r.toString();
    }

    /* JADX INFO: renamed from: a */
    public final a m7125a() {
        return new a(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7126b(C2416m c2416m) {
        List<byte[]> list = this.f12452I;
        if (list.size() != c2416m.f12452I.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), c2416m.f12452I.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C2416m m7127e(C2416m c2416m) {
        String str;
        String str2;
        float f3;
        float f10;
        int i10;
        boolean z10;
        if (this == c2416m) {
            return this;
        }
        int iM19108h = C10147p.m19108h(this.f12484l);
        String str3 = c2416m.f12470a;
        String str4 = c2416m.f12472b;
        if (str4 == null) {
            str4 = this.f12472b;
        }
        if ((iM19108h != 3 && iM19108h != 1) || (str = c2416m.f12474c) == null) {
            str = this.f12474c;
        }
        int i11 = this.f12478f;
        if (i11 == -1) {
            i11 = c2416m.f12478f;
        }
        int i12 = this.f12479g;
        if (i12 == -1) {
            i12 = c2416m.f12479g;
        }
        String str5 = this.f12481i;
        if (str5 == null) {
            String strM19048o = C10134c0.m19048o(c2416m.f12481i, iM19108h);
            if (C10134c0.m19032Q(strM19048o).length == 1) {
                str5 = strM19048o;
            }
        }
        int i13 = 0;
        Metadata metadata = c2416m.f12482j;
        Metadata metadata2 = this.f12482j;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f12627a;
                if (entryArr.length != 0) {
                    int i14 = C10134c0.f51354a;
                    Metadata.Entry[] entryArr2 = metadata2.f12627a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata(metadata2.f12628b, (Metadata.Entry[]) objArrCopyOf);
                }
            }
            metadata = metadata2;
        }
        float f11 = this.f12457N;
        if (f11 == -1.0f && iM19108h == 2) {
            f11 = c2416m.f12457N;
        }
        int i15 = this.f12476d | c2416m.f12476d;
        int i16 = this.f12477e | c2416m.f12477e;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData = c2416m.f12453J;
        if (drmInitData != null) {
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.f12186a;
            int length = schemeDataArr.length;
            while (i13 < length) {
                int i17 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr[i13];
                DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                if (schemeData.f12194e != null) {
                    arrayList.add(schemeData);
                }
                i13++;
                length = i17;
                schemeDataArr = schemeDataArr2;
            }
            str2 = drmInitData.f12188c;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.f12453J;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f12188c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f12186a;
            int length2 = schemeDataArr3.length;
            String str6 = str2;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = length2;
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i18];
                DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                if (schemeData2.f12194e != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            f10 = f11;
                            i10 = size;
                            z10 = false;
                            break;
                        }
                        i10 = size;
                        f10 = f11;
                        if (((DrmInitData.SchemeData) arrayList.get(i20)).f12191b.equals(schemeData2.f12191b)) {
                            z10 = true;
                            break;
                        }
                        i20++;
                        f11 = f10;
                        size = i10;
                    }
                    if (!z10) {
                        arrayList.add(schemeData2);
                    }
                } else {
                    f10 = f11;
                    i10 = size;
                }
                i18++;
                length2 = i19;
                schemeDataArr3 = schemeDataArr4;
                f11 = f10;
                size = i10;
            }
            f3 = f11;
            str2 = str6;
        } else {
            f3 = f11;
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        a aVar = new a(this);
        aVar.f12491a = str3;
        aVar.f12492b = str4;
        aVar.f12493c = str;
        aVar.f12494d = i15;
        aVar.f12495e = i16;
        aVar.f12496f = i11;
        aVar.f12497g = i12;
        aVar.f12498h = str5;
        aVar.f12499i = metadata;
        aVar.f12504n = drmInitData3;
        aVar.f12508r = f3;
        return new C2416m(aVar);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2416m.class != obj.getClass()) {
            return false;
        }
        C2416m c2416m = (C2416m) obj;
        int i11 = this.f12475c0;
        if (i11 == 0 || (i10 = c2416m.f12475c0) == 0 || i11 == i10) {
            return this.f12476d == c2416m.f12476d && this.f12477e == c2416m.f12477e && this.f12478f == c2416m.f12478f && this.f12479g == c2416m.f12479g && this.f12451H == c2416m.f12451H && this.f12454K == c2416m.f12454K && this.f12455L == c2416m.f12455L && this.f12456M == c2416m.f12456M && this.f12458O == c2416m.f12458O && this.f12461R == c2416m.f12461R && this.f12463T == c2416m.f12463T && this.f12464U == c2416m.f12464U && this.f12465V == c2416m.f12465V && this.f12466W == c2416m.f12466W && this.f12467X == c2416m.f12467X && this.f12468Y == c2416m.f12468Y && this.f12469Z == c2416m.f12469Z && this.f12471a0 == c2416m.f12471a0 && this.f12473b0 == c2416m.f12473b0 && Float.compare(this.f12457N, c2416m.f12457N) == 0 && Float.compare(this.f12459P, c2416m.f12459P) == 0 && C10134c0.m19034a(this.f12470a, c2416m.f12470a) && C10134c0.m19034a(this.f12472b, c2416m.f12472b) && C10134c0.m19034a(this.f12481i, c2416m.f12481i) && C10134c0.m19034a(this.f12483k, c2416m.f12483k) && C10134c0.m19034a(this.f12484l, c2416m.f12484l) && C10134c0.m19034a(this.f12474c, c2416m.f12474c) && Arrays.equals(this.f12460Q, c2416m.f12460Q) && C10134c0.m19034a(this.f12482j, c2416m.f12482j) && C10134c0.m19034a(this.f12462S, c2416m.f12462S) && C10134c0.m19034a(this.f12453J, c2416m.f12453J) && m7126b(c2416m);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12475c0 == 0) {
            int iHashCode = 0;
            String str = this.f12470a;
            int iHashCode2 = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12472b;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f12474c;
            int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f12476d) * 31) + this.f12477e) * 31) + this.f12478f) * 31) + this.f12479g) * 31;
            String str4 = this.f12481i;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f12482j;
            int iHashCode6 = (iHashCode5 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f12483k;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f12484l;
            if (str6 != null) {
                iHashCode = str6.hashCode();
            }
            this.f12475c0 = ((((((((((((((((((((Float.floatToIntBits(this.f12459P) + ((((Float.floatToIntBits(this.f12457N) + ((((((((((iHashCode7 + iHashCode) * 31) + this.f12451H) * 31) + ((int) this.f12454K)) * 31) + this.f12455L) * 31) + this.f12456M) * 31)) * 31) + this.f12458O) * 31)) * 31) + this.f12461R) * 31) + this.f12463T) * 31) + this.f12464U) * 31) + this.f12465V) * 31) + this.f12466W) * 31) + this.f12467X) * 31) + this.f12468Y) * 31) + this.f12469Z) * 31) + this.f12471a0) * 31) + this.f12473b0;
        }
        return this.f12475c0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f12470a);
        sb2.append(", ");
        sb2.append(this.f12472b);
        sb2.append(", ");
        sb2.append(this.f12483k);
        sb2.append(", ");
        sb2.append(this.f12484l);
        sb2.append(", ");
        sb2.append(this.f12481i);
        sb2.append(", ");
        sb2.append(this.f12480h);
        sb2.append(", ");
        sb2.append(this.f12474c);
        sb2.append(", [");
        sb2.append(this.f12455L);
        sb2.append(", ");
        sb2.append(this.f12456M);
        sb2.append(", ");
        sb2.append(this.f12457N);
        sb2.append("], [");
        sb2.append(this.f12463T);
        sb2.append(", ");
        return C0166e.m768o(sb2, this.f12464U, "])");
    }
}
