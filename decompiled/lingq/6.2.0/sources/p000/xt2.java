package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C0713b;
import androidx.media3.common.PlaybackException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xt2 implements InterfaceC3534rf {

    /* JADX INFO: renamed from: d */
    public static final si4 f68693d = new si4(", ", 1);

    /* JADX INFO: renamed from: e */
    public static final NumberFormat f68694e;

    /* JADX INFO: renamed from: a */
    public final y0a f68695a = new y0a();

    /* JADX INFO: renamed from: b */
    public final x0a f68696b = new x0a();

    /* JADX INFO: renamed from: c */
    public final long f68697c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f68694e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* JADX INFO: renamed from: O */
    public static String m24664O(C3279kz c3279kz) {
        String str;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        int i = c3279kz.f48782a;
        if (i != -1) {
            StringBuilder sb = new StringBuilder("enc=");
            if (i == 30) {
                strValueOf = "dts-uhd-p2";
            } else if (i == 268435456) {
                strValueOf = "pcm-16be";
            } else if (i == 1073741824) {
                strValueOf = "aac-er-bsac";
            } else if (i == 1342177280) {
                strValueOf = "pcm-24be";
            } else if (i != 1610612736) {
                switch (i) {
                    case 2:
                        strValueOf = "pcm-16";
                        break;
                    case 3:
                        strValueOf = "pcm-8";
                        break;
                    case 4:
                        strValueOf = "pcm-float";
                        break;
                    case 5:
                        strValueOf = "ac3";
                        break;
                    case 6:
                        strValueOf = "eac3";
                        break;
                    case 7:
                        strValueOf = "dts";
                        break;
                    case 8:
                        strValueOf = "dts-hd";
                        break;
                    case 9:
                        strValueOf = "mp3";
                        break;
                    case 10:
                        strValueOf = "aac-lc";
                        break;
                    case 11:
                        strValueOf = "aac-he-v1";
                        break;
                    case 12:
                        strValueOf = "aac-he-v2";
                        break;
                    default:
                        switch (i) {
                            case 14:
                                strValueOf = "truehd";
                                break;
                            case 15:
                                strValueOf = "aac-eld";
                                break;
                            case 16:
                                strValueOf = "aac-xhe";
                                break;
                            case 17:
                                strValueOf = "ac4";
                                break;
                            case 18:
                                strValueOf = "eac3-joc";
                                break;
                            default:
                                switch (i) {
                                    case 20:
                                        strValueOf = "opus";
                                        break;
                                    case 21:
                                        strValueOf = "pcm-24";
                                        break;
                                    case 22:
                                        strValueOf = "pcm-32";
                                        break;
                                    default:
                                        strValueOf = String.valueOf(i);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                strValueOf = "pcm-32be";
            }
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        int i2 = c3279kz.f48784c;
        switch (i2) {
            case 4:
                str = "mono";
                break;
            case 12:
                str = "stereo";
                break;
            case 204:
                str = "quad";
                break;
            case 252:
                str = "5.1";
                break;
            case 6396:
                str = "7.1";
                break;
            case 737532:
                str = "5.1.4";
                break;
            case 743676:
                str = "7.1.4";
                break;
            case 3145980:
                str = "5.1.2";
                break;
            case 3152124:
                str = "7.1.2";
                break;
            case 202070268:
                str = "9.1.4";
                break;
            case 205215996:
                str = "9.1.6";
                break;
            default:
                str = "0x" + Integer.toHexString(i2);
                break;
        }
        arrayList.add("channelConf=".concat(str));
        arrayList.add("sampleRate=" + c3279kz.f48783b);
        arrayList.add("bufferSize=" + c3279kz.f48787f);
        if (c3279kz.f48785d) {
            arrayList.add("tunneling");
        }
        if (c3279kz.f48786e) {
            arrayList.add("offload");
        }
        return f68693d.m21395b(arrayList);
    }

    /* JADX INFO: renamed from: R */
    public static String m24665R(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return f68694e.format(j / 1000.0f);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: A */
    public final void mo20602A(C3496qf c3496qf, C0713b c0713b) {
        m24669T(c3496qf, "videoInputFormat", C0713b.m2519c(c0713b));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: B */
    public final void mo20603B(C3496qf c3496qf) {
        m24668S(c3496qf, "audioDisabled");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: C */
    public final void mo20604C(C3496qf c3496qf, PlaybackException playbackException) {
        ss5.m21723u("EventLogger", m24666P(c3496qf, "playerFailed", null, playbackException));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: D */
    public final void mo20605D(C3496qf c3496qf, float f) {
        m24669T(c3496qf, "volume", Float.toString(f));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: E */
    public final void mo20606E(C3496qf c3496qf, int i, long j, long j2) {
        ss5.m21723u("EventLogger", m24666P(c3496qf, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: F */
    public final void mo20607F(C3496qf c3496qf, l32 l32Var) {
        m24668S(c3496qf, "videoDisabled");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: G */
    public final void mo20608G(int i, C3496qf c3496qf, ca7 ca7Var, ca7 ca7Var2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(ca7Var);
        sb.append("], PositionInfo:new [");
        sb.append(ca7Var2);
        sb.append("]");
        m24669T(c3496qf, "positionDiscontinuity", sb.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: H */
    public final void mo20609H(C3496qf c3496qf, ru5 ru5Var) {
        m24669T(c3496qf, "downstreamFormat", C0713b.m2519c(ru5Var.f59829b));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: I */
    public final void mo20610I(C3496qf c3496qf, String str) {
        m24669T(c3496qf, "videoDecoderInitialized", str);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: J */
    public final void mo20611J(C3496qf c3496qf, boolean z) {
        m24669T(c3496qf, "loading", Boolean.toString(z));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: K */
    public final void mo20612K(C3496qf c3496qf, boolean z, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        if (i == 1) {
            str = "USER_REQUEST";
        } else if (i == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i != 4) {
            str = i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb.append(str);
        m24669T(c3496qf, "playWhenReady", sb.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: L */
    public final void mo20613L(C3496qf c3496qf, C0713b c0713b) {
        m24669T(c3496qf, "audioInputFormat", C0713b.m2519c(c0713b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: M */
    public final void mo20614M(C3496qf c3496qf, a9a a9aVar) {
        ey5 ey5Var;
        m24670U("tracks [".concat(m24667Q(c3496qf)));
        ImmutableList immutableList = a9aVar.f389a;
        for (int i = 0; i < immutableList.size(); i++) {
            z8a z8aVar = (z8a) immutableList.get(i);
            m24670U("  group [ id=" + z8aVar.m25491a().f45215b);
            for (int i2 = 0; i2 < z8aVar.f71096a; i2++) {
                String str = z8aVar.m25496f(i2) ? "[X]" : "[ ]";
                String strM22823r = uma.m22823r(z8aVar.m25493c(i2));
                StringBuilder sbM17741p = AbstractC3393o1.m17741p(i2, "    ", str, " Track:", ", ");
                sbM17741p.append(C0713b.m2519c(z8aVar.m25492b(i2)));
                sbM17741p.append(", supported=");
                sbM17741p.append(strM22823r);
                m24670U(sbM17741p.toString());
            }
            m24670U("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < immutableList.size(); i3++) {
            z8a z8aVar2 = (z8a) immutableList.get(i3);
            for (int i4 = 0; !z && i4 < z8aVar2.f71096a; i4++) {
                if (z8aVar2.m25496f(i4) && (ey5Var = z8aVar2.m25492b(i4).f6403l) != null && ey5Var.m11390e() > 0) {
                    m24670U("  Metadata [");
                    m24671V(ey5Var, "    ");
                    m24670U("  ]");
                    z = true;
                }
            }
        }
        m24670U("]");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: N */
    public final void mo20615N(C3496qf c3496qf, int i) {
        String str;
        if (i == 0) {
            str = "NONE";
        } else if (i == 1) {
            str = "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else if (i != 3) {
            str = i != 4 ? "?" : "SCRUBBING";
        } else {
            str = "UNSUITABLE_AUDIO_OUTPUT";
        }
        m24669T(c3496qf, "playbackSuppressionReason", str);
    }

    /* JADX INFO: renamed from: P */
    public final String m24666P(C3496qf c3496qf, String str, String str2, Throwable th) {
        StringBuilder sbM22999v = ux5.m22999v(str, " [");
        sbM22999v.append(m24667Q(c3496qf));
        String string = sbM22999v.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbM22999v2 = ux5.m22999v(string, ", errorCode=");
            sbM22999v2.append(((PlaybackException) th).m2518a());
            string = sbM22999v2.toString();
        }
        if (str2 != null) {
            string = AbstractC3393o1.m17735j(string, ", ", str2);
        }
        String strM21684I = ss5.m21684I(th);
        if (!TextUtils.isEmpty(strM21684I)) {
            StringBuilder sbM22999v3 = ux5.m22999v(string, "\n  ");
            sbM22999v3.append(strM21684I.replace("\n", "\n  "));
            sbM22999v3.append('\n');
            string = sbM22999v3.toString();
        }
        return string.concat("]");
    }

    /* JADX INFO: renamed from: Q */
    public final String m24667Q(C3496qf c3496qf) {
        String string = "window=" + c3496qf.f57668c;
        jv5 jv5Var = c3496qf.f57669d;
        if (jv5Var != null) {
            StringBuilder sbM22999v = ux5.m22999v(string, ", period=");
            sbM22999v.append(c3496qf.f57667b.mo17285b(jv5Var.f46226a));
            string = sbM22999v.toString();
            if (jv5Var.m14690b()) {
                StringBuilder sbM22999v2 = ux5.m22999v(string, ", adGroup=");
                sbM22999v2.append(jv5Var.f46227b);
                StringBuilder sbM22999v3 = ux5.m22999v(sbM22999v2.toString(), ", ad=");
                sbM22999v3.append(jv5Var.f46228c);
                string = sbM22999v3.toString();
            }
        }
        return "eventTime=" + m24665R(c3496qf.f57666a - this.f68697c) + ", mediaPos=" + m24665R(c3496qf.f57670e) + ", " + string;
    }

    /* JADX INFO: renamed from: S */
    public final void m24668S(C3496qf c3496qf, String str) {
        m24670U(m24666P(c3496qf, str, null, null));
    }

    /* JADX INFO: renamed from: T */
    public final void m24669T(C3496qf c3496qf, String str, String str2) {
        m24670U(m24666P(c3496qf, str, str2, null));
    }

    /* JADX INFO: renamed from: U */
    public final void m24670U(String str) {
        ss5.m21722t("EventLogger", str);
    }

    /* JADX INFO: renamed from: V */
    public final void m24671V(ey5 ey5Var, String str) {
        for (int i = 0; i < ey5Var.m11390e(); i++) {
            StringBuilder sbM22997t = ux5.m22997t(str);
            sbM22997t.append(ey5Var.m11389d(i));
            m24670U(sbM22997t.toString());
        }
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: a */
    public final void mo20616a(C3496qf c3496qf, boolean z) {
        m24669T(c3496qf, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: b */
    public final void mo20617b(C3496qf c3496qf, boolean z) {
        m24669T(c3496qf, "isPlaying", Boolean.toString(z));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: c */
    public final void mo20618c(C3496qf c3496qf, String str) {
        m24669T(c3496qf, "audioDecoderReleased", str);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: d */
    public final void mo20619d(C3496qf c3496qf, boolean z) {
        m24669T(c3496qf, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: e */
    public final void mo20620e(C3496qf c3496qf, n97 n97Var) {
        m24669T(c3496qf, "playbackParameters", n97Var.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: f */
    public final void mo20621f(C3496qf c3496qf, String str) {
        m24669T(c3496qf, "audioDecoderInitialized", str);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: g */
    public final void mo20622g(C3496qf c3496qf, ey5 ey5Var) {
        m24670U("metadata [".concat(m24667Q(c3496qf)));
        m24671V(ey5Var, "  ");
        m24670U("]");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: h */
    public final void mo20623h(C3496qf c3496qf, ru5 ru5Var, IOException iOException) {
        ss5.m21723u("EventLogger", m24666P(c3496qf, "internalError", "loadError", iOException));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: i */
    public final void mo20624i(C3496qf c3496qf, int i) {
        String str;
        if (i == 1) {
            str = "IDLE";
        } else if (i == 2) {
            str = "BUFFERING";
        } else if (i != 3) {
            str = i != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        m24669T(c3496qf, "state", str);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: j */
    public final void mo20625j(C3496qf c3496qf, Object obj) {
        m24669T(c3496qf, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: k */
    public final void mo20626k(C3496qf c3496qf, long j) {
        m24669T(c3496qf, "audioPositionAdvancing", "since " + m24665R((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.f68697c));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: l */
    public final void mo20627l(C3496qf c3496qf, int i) {
        m24669T(c3496qf, "droppedFrames", Integer.toString(i));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: m */
    public final void mo20628m(C3496qf c3496qf, int i, int i2) {
        m24669T(c3496qf, "surfaceSize", wq1.m24115k("w=", i, i2, ", h="));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: o */
    public final void mo20630o(C3496qf c3496qf, C3279kz c3279kz) {
        m24669T(c3496qf, "audioTrackInit", m24664O(c3279kz));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: p */
    public final void mo20631p(C3496qf c3496qf) {
        m24668S(c3496qf, "videoEnabled");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: q */
    public final void mo20632q(C3496qf c3496qf, lsa lsaVar) {
        StringBuilder sb = new StringBuilder("w=" + lsaVar.f50085a + ", h=" + lsaVar.f50086b);
        float f = lsaVar.f50087c;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        m24669T(c3496qf, "videoSize", sb.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: r */
    public final void mo20633r(C3496qf c3496qf, int i) {
        z0a z0aVar = c3496qf.f57667b;
        int iMo17286h = z0aVar.mo17286h();
        int iMo17288o = z0aVar.mo17288o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(m24667Q(c3496qf));
        sb.append(", periodCount=");
        sb.append(iMo17286h);
        sb.append(", windowCount=");
        sb.append(iMo17288o);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        m24670U(sb.toString());
        for (int i2 = 0; i2 < Math.min(iMo17286h, 3); i2++) {
            x0a x0aVar = this.f68696b;
            z0aVar.mo16393f(i2, x0aVar, false);
            m24670U("  period [" + m24665R(uma.m22805J(x0aVar.f67602d)) + "]");
        }
        if (iMo17286h > 3) {
            m24670U("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iMo17288o, 3); i3++) {
            y0a y0aVar = this.f68695a;
            z0aVar.m25397n(i3, y0aVar);
            m24670U("  window [" + m24665R(uma.m22805J(y0aVar.f69074k)) + ", seekable=" + y0aVar.f69069f + ", dynamic=" + y0aVar.f69070g + "]");
        }
        if (iMo17288o > 3) {
            m24670U("  ...");
        }
        m24670U("]");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: s */
    public final void mo20634s(C3496qf c3496qf, int i) {
        m24669T(c3496qf, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: u */
    public final void mo20636u(C3496qf c3496qf, int i) {
        String str;
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(m24667Q(c3496qf));
        sb.append(", reason=");
        if (i == 0) {
            str = "REPEAT";
        } else if (i == 1) {
            str = "AUTO";
        } else if (i != 2) {
            str = i != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        sb.append(str);
        sb.append("]");
        m24670U(sb.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: v */
    public final void mo20637v(C3496qf c3496qf, String str) {
        m24669T(c3496qf, "videoDecoderReleased", str);
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: w */
    public final void mo20638w(C3496qf c3496qf, C3279kz c3279kz) {
        m24669T(c3496qf, "audioTrackReleased", m24664O(c3279kz));
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: x */
    public final void mo20639x(C3496qf c3496qf, int i, int i2, boolean z) {
        StringBuilder sbM22998u = ux5.m22998u("rendererIndex=", i, ", ");
        sbM22998u.append(uma.m22826u(i2));
        sbM22998u.append(", ");
        sbM22998u.append(z);
        m24669T(c3496qf, "rendererReady", sbM22998u.toString());
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: y */
    public final void mo20640y(C3496qf c3496qf) {
        m24668S(c3496qf, "audioEnabled");
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: z */
    public final void mo20641z(C3496qf c3496qf, int i) {
        m24669T(c3496qf, "audioSessionId", Integer.toString(i));
    }
}
