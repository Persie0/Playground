package p505ya;

import ae.C0062b;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C2425b;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.InterfaceC2426c;
import com.google.android.exoplayer2.mediacodec.InterfaceC2428e;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableList;
import com.kochava.tracker.BuildConfig;
import ga.InterfaceC5731n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p080e.RunnableC5286r;
import p118fe.C5509a;
import p128g2.RunnableC5682t;
import p150h9.C5926m0;
import p150h9.InterfaceC5924l0;
import p195j9.RunnableC6430g;
import p213k4.RunnableC6590j;
import p218k9.C6635e;
import p218k9.C6637g;
import p274n8.RunnableC7716a;
import p286o2.RunnableC7907g;
import p290o6.C7968m;
import p402u0.C9369l;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p504y9.C10317j;

/* JADX INFO: renamed from: ya.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10324f extends MediaCodecRenderer {

    /* JADX INFO: renamed from: H1 */
    public static final int[] f51919H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: I1 */
    public static boolean f51920I1;

    /* JADX INFO: renamed from: J1 */
    public static boolean f51921J1;

    /* JADX INFO: renamed from: A1 */
    public int f51922A1;

    /* JADX INFO: renamed from: B1 */
    public float f51923B1;

    /* JADX INFO: renamed from: C1 */
    public C10332n f51924C1;

    /* JADX INFO: renamed from: D1 */
    public boolean f51925D1;

    /* JADX INFO: renamed from: E1 */
    public int f51926E1;

    /* JADX INFO: renamed from: F1 */
    public c f51927F1;

    /* JADX INFO: renamed from: G1 */
    public InterfaceC10327i f51928G1;

    /* JADX INFO: renamed from: X0 */
    public final Context f51929X0;

    /* JADX INFO: renamed from: Y0 */
    public final C10328j f51930Y0;

    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC10331m.a f51931Z0;

    /* JADX INFO: renamed from: a1 */
    public final long f51932a1;

    /* JADX INFO: renamed from: b1 */
    public final int f51933b1;

    /* JADX INFO: renamed from: c1 */
    public final boolean f51934c1;

    /* JADX INFO: renamed from: d1 */
    public b f51935d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f51936e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f51937f1;

    /* JADX INFO: renamed from: g1 */
    public Surface f51938g1;

    /* JADX INFO: renamed from: h1 */
    public PlaceholderSurface f51939h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f51940i1;

    /* JADX INFO: renamed from: j1 */
    public int f51941j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f51942k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f51943l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f51944m1;

    /* JADX INFO: renamed from: n1 */
    public long f51945n1;

    /* JADX INFO: renamed from: o1 */
    public long f51946o1;

    /* JADX INFO: renamed from: p1 */
    public long f51947p1;

    /* JADX INFO: renamed from: q1 */
    public int f51948q1;

    /* JADX INFO: renamed from: r1 */
    public int f51949r1;

    /* JADX INFO: renamed from: s1 */
    public int f51950s1;

    /* JADX INFO: renamed from: t1 */
    public long f51951t1;

    /* JADX INFO: renamed from: u1 */
    public long f51952u1;

    /* JADX INFO: renamed from: v1 */
    public long f51953v1;

    /* JADX INFO: renamed from: w1 */
    public int f51954w1;

    /* JADX INFO: renamed from: x1 */
    public long f51955x1;

    /* JADX INFO: renamed from: y1 */
    public int f51956y1;

    /* JADX INFO: renamed from: z1 */
    public int f51957z1;

    /* JADX INFO: renamed from: ya.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m19341a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ya.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f51958a;

        /* JADX INFO: renamed from: b */
        public final int f51959b;

        /* JADX INFO: renamed from: c */
        public final int f51960c;

        public b(int i10, int i11, int i12) {
            this.f51958a = i10;
            this.f51959b = i11;
            this.f51960c = i12;
        }
    }

    /* JADX INFO: renamed from: ya.f$c */
    public final class c implements InterfaceC2426c.c, Handler.Callback {

        /* JADX INFO: renamed from: a */
        public final Handler f51961a;

        public c(InterfaceC2426c interfaceC2426c) {
            Handler handlerM19044k = C10134c0.m19044k(this);
            this.f51961a = handlerM19044k;
            interfaceC2426c.mo7185h(this, handlerM19044k);
        }

        /* JADX INFO: renamed from: a */
        public final void m19342a(long j10) {
            C10324f c10324f = C10324f.this;
            if (this != c10324f.f51927F1 || c10324f.f12561b0 == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                c10324f.f12545Q0 = true;
                return;
            }
            try {
                c10324f.m7159z0(j10);
                c10324f.m19334I0();
                c10324f.f12549S0.f37608e++;
                c10324f.m19333H0();
                c10324f.mo7146i0(j10);
            } catch (ExoPlaybackException e10) {
                c10324f.f12547R0 = e10;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = C10134c0.f51354a;
            m19342a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
            return true;
        }
    }

    public C10324f(Context context, C2425b c2425b, Handler handler, C2413j.b bVar) {
        super(2, c2425b, 30.0f);
        this.f51932a1 = 5000L;
        this.f51933b1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f51929X0 = applicationContext;
        this.f51930Y0 = new C10328j(applicationContext);
        this.f51931Z0 = new InterfaceC10331m.a(handler, bVar);
        this.f51934c1 = "NVIDIA".equals(C10134c0.f51356c);
        this.f51946o1 = -9223372036854775807L;
        this.f51956y1 = -1;
        this.f51957z1 = -1;
        this.f51923B1 = -1.0f;
        this.f51941j1 = 1;
        this.f51926E1 = 0;
        this.f51924C1 = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B0 */
    public static boolean m19326B0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C10324f.class) {
            if (!f51920I1) {
                f51921J1 = m19327C0();
                f51920I1 = true;
            }
        }
        return f51921J1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: C0 */
    public static boolean m19327C0() {
        int i10 = C10134c0.f51354a;
        byte b10 = 7;
        if (i10 <= 28) {
            String str = C10134c0.f51355b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(C10134c0.f51355b)) {
            return true;
        }
        String str2 = C10134c0.f51357d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = C10134c0.f51355b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b10 = -1;
                            }
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
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
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case ModuleDescriptor.MODULE_VERSION /* 88 */:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX INFO: renamed from: D0 */
    public static int m19328D0(C2416m c2416m, C2427d c2427d) {
        int i10;
        int iIntValue;
        int i11 = c2416m.f12455L;
        if (i11 != -1 && (i10 = c2416m.f12456M) != -1) {
            String str = c2416m.f12484l;
            if ("video/dolby-vision".equals(str)) {
                Pair<Integer, Integer> pairM7164d = MediaCodecUtil.m7164d(c2416m);
                if (pairM7164d == null || !((iIntValue = ((Integer) pairM7164d.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) {
                    str = "video/hevc";
                } else {
                    str = "video/avc";
                }
            }
            str.getClass();
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i11 * i10) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i11 * i10) * 3) / 4);
                case "video/avc":
                    String str2 = C10134c0.f51357d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(C10134c0.f51356c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c2427d.f12620f)))) {
                        return (((((((i10 + 16) - 1) / 16) * (((i11 + 16) - 1) / 16)) * 16) * 16) * 3) / 4;
                    }
                    return -1;
                case "video/x-vnd.on2.vp9":
                    return ((i11 * i10) * 3) / 8;
                default:
                    return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E0 */
    public static ImmutableList m19329E0(Context context, InterfaceC2428e interfaceC2428e, C2416m c2416m, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        String str = c2416m.f12484l;
        if (str == null) {
            return ImmutableList.m9062Y();
        }
        List<C2427d> listMo33a = interfaceC2428e.mo33a(str, z10, z11);
        String strM7162b = MediaCodecUtil.m7162b(c2416m);
        if (strM7162b == null) {
            return ImmutableList.m9060Q(listMo33a);
        }
        List<C2427d> listMo33a2 = interfaceC2428e.mo33a(strM7162b, z10, z11);
        if (C10134c0.f51354a >= 26 && "video/dolby-vision".equals(c2416m.f12484l) && !listMo33a2.isEmpty() && !a.m19341a(context)) {
            return ImmutableList.m9060Q(listMo33a2);
        }
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        c3146a.m9067d(listMo33a);
        c3146a.m9067d(listMo33a2);
        return c3146a.m9068e();
    }

    /* JADX INFO: renamed from: F0 */
    public static int m19330F0(C2416m c2416m, C2427d c2427d) {
        if (c2416m.f12451H == -1) {
            return m19328D0(c2416m, c2427d);
        }
        List<byte[]> list = c2416m.f12452I;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += list.get(i10).length;
        }
        return c2416m.f12451H + length;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m19331A0() {
        InterfaceC2426c interfaceC2426c;
        this.f51942k1 = false;
        if (C10134c0.f51354a >= 23 && this.f51925D1 && (interfaceC2426c = this.f12561b0) != null) {
            this.f51927F1 = new c(interfaceC2426c);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public final void mo6864B() {
        InterfaceC10331m.a aVar = this.f51931Z0;
        this.f51924C1 = null;
        m19331A0();
        this.f51940i1 = false;
        this.f51927F1 = null;
        try {
            super.mo6864B();
            C6635e c6635e = this.f12549S0;
            aVar.getClass();
            synchronized (c6635e) {
            }
            Handler handler = aVar.f52009a;
            if (handler != null) {
                handler.post(new RunnableC5682t(aVar, 12, c6635e));
            }
        } catch (Throwable th2) {
            C6635e c6635e2 = this.f12549S0;
            aVar.getClass();
            synchronized (c6635e2) {
                Handler handler2 = aVar.f52009a;
                if (handler2 != null) {
                    handler2.post(new RunnableC5682t(aVar, 12, c6635e2));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: C */
    public final void mo6865C(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f12549S0 = new C6635e();
        C5926m0 c5926m0 = this.f12222c;
        c5926m0.getClass();
        boolean z12 = c5926m0.f35346a;
        C10129a.m18992d((z12 && this.f51926E1 == 0) ? false : true);
        if (this.f51925D1 != z12) {
            this.f51925D1 = z12;
            m7150o0();
        }
        C6635e c6635e = this.f12549S0;
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC7907g(aVar, 14, c6635e));
        }
        this.f51943l1 = z11;
        this.f51944m1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public final void mo6867D(boolean z10, long j10) throws ExoPlaybackException {
        super.mo6867D(z10, j10);
        m19331A0();
        C10328j c10328j = this.f51930Y0;
        c10328j.f51989m = 0L;
        c10328j.f51992p = -1L;
        c10328j.f51990n = -1L;
        this.f51951t1 = -9223372036854775807L;
        this.f51945n1 = -9223372036854775807L;
        this.f51949r1 = 0;
        if (!z10) {
            this.f51946o1 = -9223372036854775807L;
        } else {
            long j11 = this.f51932a1;
            this.f51946o1 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.AbstractC2406e
    @TargetApi(17)
    /* JADX INFO: renamed from: E */
    public final void mo6868E() {
        try {
            try {
                m7132M();
                m7150o0();
                DrmSession.m6958i(this.f12554V, null);
                this.f12554V = null;
                PlaceholderSurface placeholderSurface = this.f51939h1;
                if (placeholderSurface != null) {
                    if (this.f51938g1 == placeholderSurface) {
                        this.f51938g1 = null;
                    }
                    placeholderSurface.release();
                    this.f51939h1 = null;
                }
            } catch (Throwable th2) {
                DrmSession.m6958i(this.f12554V, null);
                this.f12554V = null;
                throw th2;
            }
        } catch (Throwable th3) {
            PlaceholderSurface placeholderSurface2 = this.f51939h1;
            if (placeholderSurface2 != null) {
                if (this.f51938g1 == placeholderSurface2) {
                    this.f51938g1 = null;
                }
                placeholderSurface2.release();
                this.f51939h1 = null;
            }
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: F */
    public final void mo6869F() {
        this.f51948q1 = 0;
        this.f51947p1 = SystemClock.elapsedRealtime();
        this.f51952u1 = SystemClock.elapsedRealtime() * 1000;
        this.f51953v1 = 0L;
        this.f51954w1 = 0;
        C10328j c10328j = this.f51930Y0;
        c10328j.f51980d = true;
        c10328j.f51989m = 0L;
        c10328j.f51992p = -1L;
        c10328j.f51990n = -1L;
        C10328j.b bVar = c10328j.f51978b;
        if (bVar != null) {
            C10328j.e eVar = c10328j.f51979c;
            eVar.getClass();
            eVar.f51999b.sendEmptyMessage(1);
            bVar.mo19348b(new C5509a(7, c10328j));
        }
        c10328j.m19345c(false);
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: G */
    public final void mo6870G() {
        this.f51946o1 = -9223372036854775807L;
        m19332G0();
        int i10 = this.f51954w1;
        if (i10 != 0) {
            long j10 = this.f51953v1;
            InterfaceC10331m.a aVar = this.f51931Z0;
            Handler handler = aVar.f52009a;
            if (handler != null) {
                handler.post(new RunnableC10329k(aVar, j10, i10));
            }
            this.f51953v1 = 0L;
            this.f51954w1 = 0;
        }
        C10328j c10328j = this.f51930Y0;
        c10328j.f51980d = false;
        C10328j.b bVar = c10328j.f51978b;
        if (bVar != null) {
            bVar.mo19347a();
            C10328j.e eVar = c10328j.f51979c;
            eVar.getClass();
            eVar.f51999b.sendEmptyMessage(2);
        }
        c10328j.m19343a();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m19332G0() {
        if (this.f51948q1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f51947p1;
            int i10 = this.f51948q1;
            InterfaceC10331m.a aVar = this.f51931Z0;
            Handler handler = aVar.f52009a;
            if (handler != null) {
                handler.post(new RunnableC10329k(aVar, i10, j10));
            }
            this.f51948q1 = 0;
            this.f51947p1 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m19333H0() {
        this.f51944m1 = true;
        if (this.f51942k1) {
            return;
        }
        this.f51942k1 = true;
        Surface surface = this.f51938g1;
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC10330l(aVar, surface, SystemClock.elapsedRealtime()));
        }
        this.f51940i1 = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m19334I0() {
        C10332n c10332n;
        int i10 = this.f51956y1;
        if ((i10 != -1 || this.f51957z1 != -1) && ((c10332n = this.f51924C1) == null || c10332n.f52016a != i10 || c10332n.f52017b != this.f51957z1 || c10332n.f52018c != this.f51922A1 || c10332n.f52019d != this.f51923B1)) {
            C10332n c10332n2 = new C10332n(this.f51923B1, this.f51956y1, this.f51957z1, this.f51922A1);
            this.f51924C1 = c10332n2;
            InterfaceC10331m.a aVar = this.f51931Z0;
            Handler handler = aVar.f52009a;
            if (handler != null) {
                handler.post(new RunnableC6590j(aVar, 13, c10332n2));
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m19335J0(InterfaceC2426c interfaceC2426c, int i10) {
        m19334I0();
        C0062b.m315V("releaseOutputBuffer");
        interfaceC2426c.mo7186i(i10, true);
        C0062b.m283K0();
        this.f51952u1 = SystemClock.elapsedRealtime() * 1000;
        this.f12549S0.f37608e++;
        this.f51949r1 = 0;
        m19333H0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: K */
    public final C6637g mo6871K(C2427d c2427d, C2416m c2416m, C2416m c2416m2) {
        C6637g c6637gM7196b = c2427d.m7196b(c2416m, c2416m2);
        b bVar = this.f51935d1;
        int i10 = bVar.f51958a;
        int i11 = c2416m2.f12455L;
        int i12 = c6637gM7196b.f37621e;
        if (i11 > i10 || c2416m2.f12456M > bVar.f51959b) {
            i12 |= 256;
        }
        if (m19330F0(c2416m2, c2427d) > this.f51935d1.f51960c) {
            i12 |= 64;
        }
        int i13 = i12;
        return new C6637g(c2427d.f12615a, c2416m, c2416m2, i13 != 0 ? 0 : c6637gM7196b.f37620d, i13);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m19336K0(InterfaceC2426c interfaceC2426c, int i10, long j10) {
        m19334I0();
        C0062b.m315V("releaseOutputBuffer");
        interfaceC2426c.mo7181d(i10, j10);
        C0062b.m283K0();
        this.f51952u1 = SystemClock.elapsedRealtime() * 1000;
        this.f12549S0.f37608e++;
        this.f51949r1 = 0;
        m19333H0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: L */
    public final MediaCodecDecoderException mo7131L(IllegalStateException illegalStateException, C2427d c2427d) {
        return new MediaCodecVideoDecoderException(illegalStateException, c2427d, this.f51938g1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L0 */
    public final boolean m19337L0(C2427d c2427d) {
        boolean z10;
        if (C10134c0.f51354a < 23 || this.f51925D1 || m19326B0(c2427d.f12615a)) {
            return false;
        }
        if (c2427d.f12620f) {
            Context context = this.f51929X0;
            int i10 = PlaceholderSurface.f13766d;
            synchronized (PlaceholderSurface.class) {
                try {
                    if (!PlaceholderSurface.f13767e) {
                        PlaceholderSurface.f13766d = PlaceholderSurface.m7511a(context);
                        PlaceholderSurface.f13767e = true;
                    }
                    z10 = PlaceholderSurface.f13766d != 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m19338M0(InterfaceC2426c interfaceC2426c, int i10) {
        C0062b.m315V("skipVideoBuffer");
        interfaceC2426c.mo7186i(i10, false);
        C0062b.m283K0();
        this.f12549S0.f37609f++;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m19339N0(int i10, int i11) {
        C6635e c6635e = this.f12549S0;
        c6635e.f37611h += i10;
        int i12 = i10 + i11;
        c6635e.f37610g += i12;
        this.f51948q1 += i12;
        int i13 = this.f51949r1 + i12;
        this.f51949r1 = i13;
        c6635e.f37612i = Math.max(i13, c6635e.f37612i);
        int i14 = this.f51933b1;
        if (i14 > 0 && this.f51948q1 >= i14) {
            m19332G0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m19340O0(long j10) {
        C6635e c6635e = this.f12549S0;
        c6635e.f37614k += j10;
        c6635e.f37615l++;
        this.f51953v1 += j10;
        this.f51954w1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: T */
    public final boolean mo7139T() {
        return this.f51925D1 && C10134c0.f51354a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: U */
    public final float mo6872U(float f3, C2416m[] c2416mArr) {
        float fMax = -1.0f;
        for (C2416m c2416m : c2416mArr) {
            float f10 = c2416m.f12457N;
            if (f10 != -1.0f) {
                fMax = Math.max(fMax, f10);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f3;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: V */
    public final ArrayList mo6873V(InterfaceC2428e interfaceC2428e, C2416m c2416m, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        ImmutableList immutableListM19329E0 = m19329E0(this.f51929X0, interfaceC2428e, c2416m, z10, this.f51925D1);
        Pattern pattern = MediaCodecUtil.f12594a;
        ArrayList arrayList = new ArrayList(immutableListM19329E0);
        Collections.sort(arrayList, new C10317j(0, new C9369l(14, c2416m)));
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    /* JADX INFO: renamed from: X */
    public final InterfaceC2426c.a mo6874X(C2427d c2427d, C2416m c2416m, MediaCrypto mediaCrypto, float f3) {
        String str;
        int i10;
        int i11;
        C10320b c10320b;
        b bVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z10;
        Pair<Integer, Integer> pairM7164d;
        int iM19328D0;
        PlaceholderSurface placeholderSurface = this.f51939h1;
        if (placeholderSurface != null && placeholderSurface.f13768a != c2427d.f12620f) {
            if (this.f51938g1 == placeholderSurface) {
                this.f51938g1 = null;
            }
            placeholderSurface.release();
            this.f51939h1 = null;
        }
        String str2 = c2427d.f12617c;
        C2416m[] c2416mArr = this.f12227h;
        c2416mArr.getClass();
        int iMax = c2416m.f12455L;
        int iM19330F0 = m19330F0(c2416m, c2427d);
        int length = c2416mArr.length;
        float f10 = c2416m.f12457N;
        int i12 = c2416m.f12455L;
        C10320b c10320b2 = c2416m.f12462S;
        int i13 = c2416m.f12456M;
        if (length == 1) {
            if (iM19330F0 != -1 && (iM19328D0 = m19328D0(c2416m, c2427d)) != -1) {
                iM19330F0 = Math.min((int) (iM19330F0 * 1.5f), iM19328D0);
            }
            bVar = new b(iMax, i13, iM19330F0);
            str = str2;
            i10 = i13;
            i11 = i12;
            c10320b = c10320b2;
        } else {
            int iMax2 = i13;
            int i14 = 0;
            boolean z11 = false;
            for (int length2 = c2416mArr.length; i14 < length2; length2 = length2) {
                C2416m c2416m2 = c2416mArr[i14];
                C2416m[] c2416mArr2 = c2416mArr;
                if (c10320b2 != null && c2416m2.f12462S == null) {
                    C2416m.a aVar = new C2416m.a(c2416m2);
                    aVar.f12513w = c10320b2;
                    c2416m2 = new C2416m(aVar);
                }
                if (c2427d.m7196b(c2416m, c2416m2).f37620d != 0) {
                    int i15 = c2416m2.f12456M;
                    int i16 = c2416m2.f12455L;
                    z11 |= i16 == -1 || i15 == -1;
                    int iMax3 = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i15);
                    iMax = iMax3;
                    iM19330F0 = Math.max(iM19330F0, m19330F0(c2416m2, c2427d));
                }
                i14++;
                c2416mArr = c2416mArr2;
            }
            if (z11) {
                C10145n.m19099g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i13 > i12;
                int i17 = z12 ? i13 : i12;
                int i18 = z12 ? i12 : i13;
                c10320b = c10320b2;
                i10 = i13;
                float f11 = i18 / i17;
                int[] iArr = f51919H1;
                str = str2;
                i11 = i12;
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        int i20 = iArr[i19];
                        int[] iArr2 = iArr;
                        int i21 = (int) (i20 * f11);
                        if (i20 > i17 && i21 > i18) {
                            int i22 = i17;
                            int i23 = i18;
                            if (C10134c0.f51354a < 21) {
                                f11 = f11;
                                try {
                                    int i24 = (((i20 + 16) - 1) / 16) * 16;
                                    int i25 = (((i21 + 16) - 1) / 16) * 16;
                                    if (i24 * i25 <= MediaCodecUtil.m7169i()) {
                                        int i26 = z12 ? i25 : i24;
                                        if (!z12) {
                                            i24 = i25;
                                        }
                                        point = new Point(i26, i24);
                                        break;
                                    }
                                    i19++;
                                    iArr = iArr2;
                                    i17 = i22;
                                    i18 = i23;
                                    f11 = f11;
                                } catch (MediaCodecUtil.DecoderQueryException unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i27 = z12 ? i21 : i20;
                                if (!z12) {
                                    i20 = i21;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = c2427d.f12618d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point((((i27 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i20 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                                }
                                if (c2427d.m7200f(point2.x, point2.y, f10)) {
                                    point = point2;
                                    break;
                                }
                                i19++;
                                iArr = iArr2;
                                i17 = i22;
                                i18 = i23;
                                f11 = f11;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C2416m.a aVar2 = new C2416m.a(c2416m);
                    aVar2.f12506p = iMax;
                    aVar2.f12507q = iMax2;
                    iM19330F0 = Math.max(iM19330F0, m19328D0(new C2416m(aVar2), c2427d));
                    C10145n.m19099g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                str = str2;
                i10 = i13;
                i11 = i12;
                c10320b = c10320b2;
            }
            bVar = new b(iMax, iMax2, iM19330F0);
        }
        this.f51935d1 = bVar;
        int i28 = this.f51925D1 ? this.f51926E1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        C10129a.m19002n(mediaFormat, c2416m.f12452I);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        C10129a.m19001m(mediaFormat, "rotation-degrees", c2416m.f12458O);
        if (c10320b != null) {
            C10320b c10320b3 = c10320b;
            C10129a.m19001m(mediaFormat, "color-transfer", c10320b3.f51898c);
            C10129a.m19001m(mediaFormat, "color-standard", c10320b3.f51896a);
            C10129a.m19001m(mediaFormat, "color-range", c10320b3.f51897b);
            byte[] bArr = c10320b3.f51899d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c2416m.f12484l) && (pairM7164d = MediaCodecUtil.m7164d(c2416m)) != null) {
            C10129a.m19001m(mediaFormat, "profile", ((Integer) pairM7164d.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f51958a);
        mediaFormat.setInteger("max-height", bVar.f51959b);
        C10129a.m19001m(mediaFormat, "max-input-size", bVar.f51960c);
        if (C10134c0.f51354a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f3 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f3);
            }
        }
        if (this.f51934c1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (this.f51938g1 == null) {
            if (!m19337L0(c2427d)) {
                throw new IllegalStateException();
            }
            if (this.f51939h1 == null) {
                this.f51939h1 = PlaceholderSurface.m7512b(this.f51929X0, c2427d.f12620f);
            }
            this.f51938g1 = this.f51939h1;
        }
        return new InterfaceC2426c.a(c2427d, mediaFormat, c2416m, this.f51938g1, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    /* JADX INFO: renamed from: Y */
    public final void mo7141Y(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f51937f1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f12119f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 != 0 && b12 != 1) {
                        return;
                    }
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    InterfaceC2426c interfaceC2426c = this.f12561b0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    interfaceC2426c.mo7180c(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: a */
    public final String mo6875a() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: c0 */
    public final void mo6876c0(Exception exc) {
        C10145n.m19096d("MediaCodecVideoRenderer", "Video codec error", exc);
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC5286r(aVar, 17, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: d0 */
    public final void mo6878d0(String str, long j10, long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC6430g(aVar, str, j10, j11, 1));
        }
        this.f51936e1 = m19326B0(str);
        C2427d c2427d = this.f12568i0;
        c2427d.getClass();
        boolean z10 = false;
        if (C10134c0.f51354a >= 29 && "video/x-vnd.on2.vp9".equals(c2427d.f12616b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c2427d.f12618d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f51937f1 = z10;
        if (C10134c0.f51354a < 23 || !this.f51925D1) {
            return;
        }
        InterfaceC2426c interfaceC2426c = this.f12561b0;
        interfaceC2426c.getClass();
        this.f51927F1 = new c(interfaceC2426c);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public final boolean mo6879e() {
        PlaceholderSurface placeholderSurface;
        if (super.mo6879e()) {
            if (!this.f51942k1 && ((placeholderSurface = this.f51939h1) == null || this.f51938g1 != placeholderSurface)) {
                if (this.f12561b0 != null) {
                    if (this.f51925D1) {
                    }
                }
            }
            this.f51946o1 = -9223372036854775807L;
            return true;
        }
        if (this.f51946o1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f51946o1) {
            return true;
        }
        this.f51946o1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: e0 */
    public final void mo6880e0(String str) {
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC5286r(aVar, 16, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: f0 */
    public final C6637g mo6881f0(C7968m c7968m) throws ExoPlaybackException {
        C6637g c6637gMo6881f0 = super.mo6881f0(c7968m);
        C2416m c2416m = (C2416m) c7968m.f43384b;
        InterfaceC10331m.a aVar = this.f51931Z0;
        Handler handler = aVar.f52009a;
        if (handler != null) {
            handler.post(new RunnableC7716a(3, aVar, c2416m, c6637gMo6881f0));
        }
        return c6637gMo6881f0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: g0 */
    public final void mo6882g0(C2416m c2416m, MediaFormat mediaFormat) {
        InterfaceC2426c interfaceC2426c = this.f12561b0;
        if (interfaceC2426c != null) {
            interfaceC2426c.setVideoScalingMode(this.f51941j1);
        }
        if (this.f51925D1) {
            this.f51956y1 = c2416m.f12455L;
            this.f51957z1 = c2416m.f12456M;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f51956y1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f51957z1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f3 = c2416m.f12459P;
        this.f51923B1 = f3;
        int i10 = C10134c0.f51354a;
        int i11 = c2416m.f12458O;
        if (i10 >= 21) {
            if (i11 == 90 || i11 == 270) {
                int i12 = this.f51956y1;
                this.f51956y1 = this.f51957z1;
                this.f51957z1 = i12;
                this.f51923B1 = 1.0f / f3;
            }
            C10328j c10328j = this.f51930Y0;
            c10328j.f51982f = c2416m.f12457N;
            C10322d c10322d = c10328j.f51977a;
            c10322d.f51902a.m19324c();
            c10322d.f51903b.m19324c();
            c10322d.f51904c = false;
            c10322d.f51905d = -9223372036854775807L;
            c10322d.f51906e = 0;
            c10328j.m19344b();
        }
        this.f51922A1 = i11;
        C10328j c10328j2 = this.f51930Y0;
        c10328j2.f51982f = c2416m.f12457N;
        C10322d c10322d2 = c10328j2.f51977a;
        c10322d2.f51902a.m19324c();
        c10322d2.f51903b.m19324c();
        c10322d2.f51904c = false;
        c10322d2.f51905d = -9223372036854775807L;
        c10322d2.f51906e = 0;
        c10328j2.m19344b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: i0 */
    public final void mo7146i0(long j10) {
        super.mo7146i0(j10);
        if (!this.f51925D1) {
            this.f51950s1--;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: j0 */
    public final void mo6884j0() {
        m19331A0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: k0 */
    public final void mo6885k0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z10 = this.f51925D1;
        if (!z10) {
            this.f51950s1++;
        }
        if (C10134c0.f51354a >= 23 || !z10) {
            return;
        }
        long j10 = decoderInputBuffer.f12118e;
        m7159z0(j10);
        m19334I0();
        this.f12549S0.f37608e++;
        m19333H0();
        mo7146i0(j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: m */
    public final void mo7148m(float f3, float f10) throws ExoPlaybackException {
        super.mo7148m(f3, f10);
        C10328j c10328j = this.f51930Y0;
        c10328j.f51985i = f3;
        c10328j.f51989m = 0L;
        c10328j.f51992p = -1L;
        c10328j.f51990n = -1L;
        c10328j.m19345c(false);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x021a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: m0 */
    public final boolean mo6887m0(long j10, long j11, InterfaceC2426c interfaceC2426c, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C2416m c2416m) throws ExoPlaybackException {
        boolean z12;
        long j13;
        boolean z13;
        boolean z14;
        long j14;
        long j15;
        boolean z15;
        interfaceC2426c.getClass();
        if (this.f51945n1 == -9223372036854775807L) {
            this.f51945n1 = j10;
        }
        if (j12 != this.f51951t1) {
            C10328j c10328j = this.f51930Y0;
            long j16 = c10328j.f51990n;
            if (j16 != -1) {
                c10328j.f51992p = j16;
                c10328j.f51993q = c10328j.f51991o;
            }
            c10328j.f51989m++;
            long j17 = j12 * 1000;
            C10322d c10322d = c10328j.f51977a;
            c10322d.f51902a.m19323b(j17);
            if (c10322d.f51902a.m19322a()) {
                c10322d.f51904c = false;
            } else if (c10322d.f51905d != -9223372036854775807L) {
                if (c10322d.f51904c) {
                    C10322d.a aVar = c10322d.f51903b;
                    long j18 = aVar.f51910d;
                    if (j18 == 0) {
                        z15 = false;
                    } else {
                        z15 = aVar.f51913g[(int) ((j18 - 1) % 15)];
                    }
                    if (z15) {
                        c10322d.f51903b.m19324c();
                        c10322d.f51903b.m19323b(c10322d.f51905d);
                    }
                } else {
                    c10322d.f51903b.m19324c();
                    c10322d.f51903b.m19323b(c10322d.f51905d);
                }
                c10322d.f51904c = true;
                c10322d.f51903b.m19323b(j17);
            }
            if (c10322d.f51904c && c10322d.f51903b.m19322a()) {
                C10322d.a aVar2 = c10322d.f51902a;
                c10322d.f51902a = c10322d.f51903b;
                c10322d.f51903b = aVar2;
                c10322d.f51904c = false;
            }
            c10322d.f51905d = j17;
            c10322d.f51906e = c10322d.f51902a.m19322a() ? 0 : c10322d.f51906e + 1;
            c10328j.m19344b();
            this.f51951t1 = j12;
        }
        long j19 = this.f12551T0.f12592b;
        long j20 = j12 - j19;
        if (z10 && !z11) {
            m19338M0(interfaceC2426c, i10);
            return true;
        }
        double d10 = this.f12559Z;
        boolean z16 = this.f12225f == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j21 = (long) ((j12 - j10) / d10);
        if (z16) {
            j21 -= jElapsedRealtime - j11;
        }
        if (this.f51938g1 == this.f51939h1) {
            if (!(j21 < -30000)) {
                return false;
            }
            m19338M0(interfaceC2426c, i10);
            m19340O0(j21);
            return true;
        }
        long j22 = jElapsedRealtime - this.f51952u1;
        boolean z17 = this.f51944m1 ? !this.f51942k1 : z16 || this.f51943l1;
        if (this.f51946o1 != -9223372036854775807L || j10 < j19) {
            z12 = false;
        } else {
            if (!z17) {
                if (z16) {
                    if (((j21 > (-30000L) ? 1 : (j21 == (-30000L) ? 0 : -1)) < 0) && j22 > 100000) {
                    }
                }
                z12 = false;
            }
            z12 = true;
        }
        if (z12) {
            long jNanoTime = System.nanoTime();
            InterfaceC10327i interfaceC10327i = this.f51928G1;
            if (interfaceC10327i != null) {
                interfaceC10327i.mo7059l(j20, jNanoTime, c2416m, this.f12563d0);
            }
            if (C10134c0.f51354a >= 21) {
                m19336K0(interfaceC2426c, i10, jNanoTime);
            } else {
                m19335J0(interfaceC2426c, i10);
            }
            m19340O0(j21);
            return true;
        }
        if (!z16 || j10 == this.f51945n1) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j23 = (j21 * 1000) + jNanoTime2;
        C10328j c10328j2 = this.f51930Y0;
        if (c10328j2.f51992p == -1 || !c10328j2.f51977a.m19321a()) {
            j13 = jNanoTime2;
        } else {
            C10322d c10322d2 = c10328j2.f51977a;
            if (c10322d2.m19321a()) {
                C10322d.a aVar3 = c10322d2.f51902a;
                long j24 = aVar3.f51911e;
                j15 = j24 == 0 ? 0L : aVar3.f51912f / j24;
            } else {
                j15 = -9223372036854775807L;
            }
            j13 = jNanoTime2;
            long j25 = c10328j2.f51993q + ((long) (((c10328j2.f51989m - c10328j2.f51992p) * j15) / c10328j2.f51985i));
            if (Math.abs(j23 - j25) <= 20000000) {
                j23 = j25;
            } else {
                c10328j2.f51989m = 0L;
                c10328j2.f51992p = -1L;
                c10328j2.f51990n = -1L;
            }
        }
        c10328j2.f51990n = c10328j2.f51989m;
        c10328j2.f51991o = j23;
        C10328j.e eVar = c10328j2.f51979c;
        if (eVar != null && c10328j2.f51987k != -9223372036854775807L) {
            long j26 = eVar.f51998a;
            if (j26 != -9223372036854775807L) {
                long j27 = c10328j2.f51987k;
                long j28 = (((j23 - j26) / j27) * j27) + j26;
                if (j23 <= j28) {
                    j14 = j28 - j27;
                } else {
                    j14 = j28;
                    j28 = j27 + j28;
                }
                if (j28 - j23 >= j23 - j14) {
                    j28 = j14;
                }
                j23 = j28 - c10328j2.f51988l;
            }
        }
        long j29 = (j23 - j13) / 1000;
        boolean z18 = this.f51946o1 != -9223372036854775807L;
        if (((j29 > (-500000L) ? 1 : (j29 == (-500000L) ? 0 : -1)) < 0) && !z11) {
            InterfaceC5731n interfaceC5731n = this.f12226g;
            interfaceC5731n.getClass();
            int iMo426d = interfaceC5731n.mo426d(j10 - this.f12228i);
            if (iMo426d == 0) {
                z14 = false;
            } else {
                if (z18) {
                    C6635e c6635e = this.f12549S0;
                    c6635e.f37607d += iMo426d;
                    c6635e.f37609f += this.f51950s1;
                } else {
                    this.f12549S0.f37613j++;
                    m19339N0(iMo426d, this.f51950s1);
                }
                if (m7137R()) {
                    m7143a0();
                }
                z14 = true;
            }
            if (z14) {
                return false;
            }
        }
        if (((j29 > (-30000L) ? 1 : (j29 == (-30000L) ? 0 : -1)) < 0) && !z11) {
            if (z18) {
                m19338M0(interfaceC2426c, i10);
                z13 = true;
            } else {
                C0062b.m315V("dropVideoBuffer");
                interfaceC2426c.mo7186i(i10, false);
                C0062b.m283K0();
                z13 = true;
                m19339N0(0, 1);
            }
            m19340O0(j29);
            return z13;
        }
        if (C10134c0.f51354a >= 21) {
            if (j29 >= 50000) {
                return false;
            }
            if (j23 == this.f51955x1) {
                m19338M0(interfaceC2426c, i10);
            } else {
                InterfaceC10327i interfaceC10327i2 = this.f51928G1;
                if (interfaceC10327i2 != null) {
                    interfaceC10327i2.mo7059l(j20, j23, c2416m, this.f12563d0);
                }
                m19336K0(interfaceC2426c, i10, j23);
            }
            m19340O0(j29);
            this.f51955x1 = j23;
            return true;
        }
        if (j29 >= 30000) {
            return false;
        }
        if (j29 > 11000) {
            try {
                Thread.sleep((j29 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        InterfaceC10327i interfaceC10327i3 = this.f51928G1;
        if (interfaceC10327i3 != null) {
            interfaceC10327i3.mo7059l(j20, j23, c2416m, this.f12563d0);
        }
        m19335J0(interfaceC2426c, i10);
        m19340O0(j29);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.mediacodec.c] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.Surface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.C2534w.b
    /* JADX INFO: renamed from: q */
    public final void mo6889q(int i10, Object obj) throws ExoPlaybackException {
        ?? M7512b;
        ?? r11;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        C10328j c10328j = this.f51930Y0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f51928G1 = (InterfaceC10327i) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f51926E1 != iIntValue2) {
                    this.f51926E1 = iIntValue2;
                    if (this.f51925D1) {
                        m7150o0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && c10328j.f51986j != (iIntValue = ((Integer) obj).intValue())) {
                    c10328j.f51986j = iIntValue;
                    c10328j.m19345c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f51941j1 = iIntValue3;
            InterfaceC2426c interfaceC2426c = this.f12561b0;
            if (interfaceC2426c != null) {
                interfaceC2426c.setVideoScalingMode(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M7512b = 0;
        }
        if (M7512b != 0) {
            M7512b = surface;
            M7512b = surface;
            M7512b = surface;
            r11 = M7512b;
        } else {
            PlaceholderSurface placeholderSurface = this.f51939h1;
            if (placeholderSurface != null) {
                M7512b = surface;
                r11 = placeholderSurface;
            } else {
                C2427d c2427d = this.f12568i0;
                if (c2427d != null && m19337L0(c2427d)) {
                    M7512b = surface;
                    M7512b = PlaceholderSurface.m7512b(this.f51929X0, c2427d.f12620f);
                    this.f51939h1 = M7512b;
                }
                M7512b = surface;
                M7512b = surface;
                M7512b = surface;
                r11 = M7512b;
            }
        }
        Surface surface2 = this.f51938g1;
        InterfaceC10331m.a aVar = this.f51931Z0;
        if (surface2 == r11) {
            if (r11 == 0 || r11 == this.f51939h1) {
                return;
            }
            C10332n c10332n = this.f51924C1;
            if (c10332n != null && (handler = aVar.f52009a) != null) {
                handler.post(new RunnableC6590j(aVar, 13, c10332n));
            }
            if (this.f51940i1) {
                Surface surface3 = this.f51938g1;
                Handler handler3 = aVar.f52009a;
                if (handler3 != null) {
                    handler3.post(new RunnableC10330l(aVar, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            return;
        }
        this.f51938g1 = r11;
        c10328j.getClass();
        ?? r10 = r11 instanceof PlaceholderSurface ? 0 : r11;
        if (c10328j.f51981e != r10) {
            c10328j.m19343a();
            c10328j.f51981e = r10;
            c10328j.m19345c(true);
        }
        this.f51940i1 = false;
        int i11 = this.f12225f;
        ?? r12 = this.f12561b0;
        if (r12 != 0) {
            if (C10134c0.f51354a < 23 || r11 == 0 || this.f51936e1) {
                m7150o0();
                m7143a0();
            } else {
                r12.mo7189l(r11);
            }
        }
        if (r11 == 0 || r11 == this.f51939h1) {
            this.f51924C1 = null;
            m19331A0();
            return;
        }
        C10332n c10332n2 = this.f51924C1;
        if (c10332n2 != null && (handler2 = aVar.f52009a) != null) {
            handler2.post(new RunnableC6590j(aVar, 13, c10332n2));
        }
        m19331A0();
        if (i11 == 2) {
            long j10 = this.f51932a1;
            this.f51946o1 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: q0 */
    public final void mo7152q0() {
        super.mo7152q0();
        this.f51950s1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: u0 */
    public final boolean mo7156u0(C2427d c2427d) {
        return this.f51938g1 != null || m19337L0(c2427d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: w0 */
    public final int mo6891w0(InterfaceC2428e interfaceC2428e, C2416m c2416m) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!C10147p.m19111k(c2416m.f12484l)) {
            return InterfaceC5924l0.m12343j(0, 0, 0);
        }
        boolean z11 = c2416m.f12453J != null;
        Context context = this.f51929X0;
        ImmutableList immutableListM19329E0 = m19329E0(context, interfaceC2428e, c2416m, z11, false);
        if (z11 && immutableListM19329E0.isEmpty()) {
            immutableListM19329E0 = m19329E0(context, interfaceC2428e, c2416m, false, false);
        }
        if (immutableListM19329E0.isEmpty()) {
            return InterfaceC5924l0.m12343j(1, 0, 0);
        }
        int i11 = c2416m.f12473b0;
        if (!(i11 == 0 || i11 == 2)) {
            return InterfaceC5924l0.m12343j(2, 0, 0);
        }
        C2427d c2427d = (C2427d) immutableListM19329E0.get(0);
        boolean zM7198d = c2427d.m7198d(c2416m);
        if (!zM7198d) {
            int i12 = 1;
            while (true) {
                if (i12 >= immutableListM19329E0.size()) {
                    z10 = true;
                    break;
                }
                C2427d c2427d2 = (C2427d) immutableListM19329E0.get(i12);
                if (c2427d2.m7198d(c2416m)) {
                    z10 = false;
                    zM7198d = true;
                    c2427d = c2427d2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = zM7198d ? 4 : 3;
        int i14 = c2427d.m7199e(c2416m) ? 16 : 8;
        int i15 = c2427d.f12621g ? 64 : 0;
        int i16 = z10 ? BuildConfig.SDK_TRUNCATE_LENGTH : 0;
        if (C10134c0.f51354a >= 26 && "video/dolby-vision".equals(c2416m.f12484l) && !a.m19341a(context)) {
            i16 = 256;
        }
        if (zM7198d) {
            ImmutableList immutableListM19329E1 = m19329E0(context, interfaceC2428e, c2416m, z11, true);
            if (!immutableListM19329E1.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f12594a;
                ArrayList arrayList = new ArrayList(immutableListM19329E1);
                Collections.sort(arrayList, new C10317j(0, new C9369l(14, c2416m)));
                C2427d c2427d3 = (C2427d) arrayList.get(0);
                if (c2427d3.m7198d(c2416m) && c2427d3.m7199e(c2416m)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }
}
