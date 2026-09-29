package p479xa;

import android.os.SystemClock;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.common.collect.ImmutableList;
import ga.C5726i;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import p003a2.C0009a;
import p174i9.InterfaceC6208b;
import p218k9.C6635e;
import p505ya.C10332n;

/* JADX INFO: renamed from: xa.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10140i implements InterfaceC6208b {

    /* JADX INFO: renamed from: d */
    public static final NumberFormat f51376d;

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0.c f51377a = new AbstractC2382c0.c();

    /* JADX INFO: renamed from: b */
    public final AbstractC2382c0.b f51378b = new AbstractC2382c0.b();

    /* JADX INFO: renamed from: c */
    public final long f51379c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f51376d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* JADX INFO: renamed from: X */
    public static String m19064X(long j10) {
        if (j10 == -9223372036854775807L) {
            return "?";
        }
        return f51376d.format(j10 / 1000.0f);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: A */
    public final void mo12766A(InterfaceC6208b.a aVar, C2416m c2416m) {
        m19068Z(aVar, "videoInputFormat", C2416m.m7124d(c2416m));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: B */
    public final void mo12767B(InterfaceC6208b.a aVar, int i10) {
        String str;
        if (i10 == 1) {
            str = "IDLE";
        } else if (i10 == 2) {
            str = "BUFFERING";
        } else if (i10 != 3) {
            str = i10 != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        m19068Z(aVar, "state", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: C */
    public final void mo12768C(InterfaceC6208b.a aVar, String str) {
        m19068Z(aVar, "audioDecoderInitialized", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: D */
    public final void mo12769D(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "drmKeysLoaded");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: E */
    public final void mo12770E(InterfaceC6208b.a aVar, String str) {
        m19068Z(aVar, "audioDecoderReleased", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: F */
    public final void mo12771F(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "drmKeysRemoved");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: G */
    public final void mo12772G(InterfaceC6208b.a aVar, boolean z10) {
        m19068Z(aVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: H */
    public final void mo12773H(InterfaceC6208b.a aVar, boolean z10) {
        m19068Z(aVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: I */
    public final void mo12774I(InterfaceC6208b.a aVar, int i10, long j10, long j11) {
        C10145n.m19095c("EventLogger", m19065V(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11, null));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: J */
    public final void mo12775J(InterfaceC6208b.a aVar, boolean z10) {
        m19068Z(aVar, "loading", Boolean.toString(z10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: K */
    public final void mo12776K() {
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: L */
    public final void mo12777L(InterfaceC6208b.a aVar, int i10, int i11) {
        m19068Z(aVar, "surfaceSize", i10 + ", " + i11);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: M */
    public final void mo12778M(InterfaceC6208b.a aVar, int i10) {
        int iMo6905h = aVar.f36099b.mo6905h();
        AbstractC2382c0 abstractC2382c0 = aVar.f36099b;
        int iMo6909o = abstractC2382c0.mo6909o();
        StringBuilder sb2 = new StringBuilder("timeline [");
        sb2.append(m19066W(aVar));
        sb2.append(", periodCount=");
        sb2.append(iMo6905h);
        sb2.append(", windowCount=");
        sb2.append(iMo6909o);
        sb2.append(", reason=");
        sb2.append(i10 != 0 ? i10 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        m19069a0(sb2.toString());
        for (int i11 = 0; i11 < Math.min(iMo6905h, 3); i11++) {
            AbstractC2382c0.b bVar = this.f51378b;
            abstractC2382c0.mo6777f(i11, bVar, false);
            m19069a0("  period [" + m19064X(C10134c0.m19033R(bVar.f12066d)) + "]");
        }
        if (iMo6905h > 3) {
            m19069a0("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iMo6909o, 3); i12++) {
            AbstractC2382c0.c cVar = this.f51377a;
            abstractC2382c0.m6908m(i12, cVar);
            m19069a0("  window [" + m19064X(C10134c0.m19033R(cVar.f12087I)) + ", seekable=" + cVar.f12098h + ", dynamic=" + cVar.f12099i + "]");
        }
        if (iMo6909o > 3) {
            m19069a0("  ...");
        }
        m19069a0("]");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: N */
    public final void mo12779N(int i10, InterfaceC6208b.a aVar) {
        m19068Z(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: O */
    public final void mo12780O(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "drmSessionReleased");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: P */
    public final void mo12781P(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "drmKeysRestored");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: Q */
    public final void mo12782Q(InterfaceC6208b.a aVar, C5726i c5726i) {
        m19068Z(aVar, "downstreamFormat", C2416m.m7124d(c5726i.f34752c));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: R */
    public final void mo12783R(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "videoEnabled");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: S */
    public final void mo12784S(InterfaceC6208b.a aVar, C2384d0 c2384d0) {
        Metadata metadata;
        m19069a0("tracks [" + m19066W(aVar));
        ImmutableList<C2384d0.a> immutableList = c2384d0.f12105a;
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            C2384d0.a aVar2 = immutableList.get(i10);
            m19069a0("  group [");
            for (int i11 = 0; i11 < aVar2.f12110a; i11++) {
                String str = aVar2.f12114e[i11] ? "[X]" : "[ ]";
                m19069a0("    " + str + " Track:" + i11 + ", " + C2416m.m7124d(aVar2.f12111b.f34803d[i11]) + ", supported=" + C10134c0.m19052s(aVar2.f12113d[i11]));
            }
            m19069a0("  ]");
        }
        boolean z10 = false;
        for (int i12 = 0; !z10 && i12 < immutableList.size(); i12++) {
            C2384d0.a aVar3 = immutableList.get(i12);
            for (int i13 = 0; !z10 && i13 < aVar3.f12110a; i13++) {
                if (aVar3.f12114e[i13] && (metadata = aVar3.f12111b.f34803d[i13].f12482j) != null && metadata.f12627a.length > 0) {
                    m19069a0("  Metadata [");
                    m19070b0(metadata, "    ");
                    m19069a0("  ]");
                    z10 = true;
                }
            }
        }
        m19069a0("]");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: T */
    public final void mo12785T(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "audioDisabled");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: U */
    public final void mo12786U(InterfaceC6208b.a aVar, int i10, long j10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V */
    public final String m19065V(InterfaceC6208b.a aVar, String str, String str2, Throwable th2) {
        String str3;
        StringBuilder sbM26o = C0009a.m26o(str, " [");
        sbM26o.append(m19066W(aVar));
        String string = sbM26o.toString();
        if (th2 instanceof PlaybackException) {
            StringBuilder sbM26o2 = C0009a.m26o(string, ", errorCode=");
            int i10 = ((PlaybackException) th2).f11819a;
            if (i10 == 5001) {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i10 != 5002) {
                switch (i10) {
                    case 1000:
                        str3 = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str3 = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str3 = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i10) {
                            case 2000:
                                str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i10) {
                                    case 3001:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 4001:
                                                str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str3 = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 6000:
                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case 6001:
                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case 6002:
                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case 6003:
                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case 6004:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case 6005:
                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case 6006:
                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        str3 = i10 < 1000000 ? "invalid error code" : "custom error code";
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            }
            sbM26o2.append(str3);
            string = sbM26o2.toString();
        }
        if (str2 != null) {
            string = C0009a.m21i(string, ", ", str2);
        }
        String strM19097e = C10145n.m19097e(th2);
        if (!TextUtils.isEmpty(strM19097e)) {
            StringBuilder sbM26o3 = C0009a.m26o(string, "\n  ");
            sbM26o3.append(strM19097e.replace("\n", "\n  "));
            sbM26o3.append('\n');
            string = sbM26o3.toString();
        }
        return C0166e.m765k(string, "]");
    }

    /* JADX INFO: renamed from: W */
    public final String m19066W(InterfaceC6208b.a aVar) {
        String string = "window=" + aVar.f36100c;
        InterfaceC2492i.b bVar = aVar.f36101d;
        if (bVar != null) {
            StringBuilder sbM26o = C0009a.m26o(string, ", period=");
            sbM26o.append(aVar.f36099b.mo6774b(bVar.f34757a));
            string = sbM26o.toString();
            if (bVar.m12079a()) {
                StringBuilder sbM26o2 = C0009a.m26o(string, ", adGroup=");
                sbM26o2.append(bVar.f34758b);
                StringBuilder sbM26o3 = C0009a.m26o(sbM26o2.toString(), ", ad=");
                sbM26o3.append(bVar.f34759c);
                string = sbM26o3.toString();
            }
        }
        return "eventTime=" + m19064X(aVar.f36098a - this.f51379c) + ", mediaPos=" + m19064X(aVar.f36102e) + ", " + string;
    }

    /* JADX INFO: renamed from: Y */
    public final void m19067Y(InterfaceC6208b.a aVar, String str) {
        m19069a0(m19065V(aVar, str, null, null));
    }

    /* JADX INFO: renamed from: Z */
    public final void m19068Z(InterfaceC6208b.a aVar, String str, String str2) {
        m19069a0(m19065V(aVar, str, str2, null));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: a */
    public final void mo12787a(InterfaceC6208b.a aVar, Exception exc) {
        C10145n.m19095c("EventLogger", m19065V(aVar, "internalError", "drmSessionManagerError", exc));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m19069a0(String str) {
        C10145n.m19094b("EventLogger", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: b */
    public final void mo12788b(InterfaceC6208b.a aVar, C2505u c2505u) {
        m19068Z(aVar, "playbackParameters", c2505u.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m19070b0(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.f12627a.length; i10++) {
            StringBuilder sbM771r = C0166e.m771r(str);
            sbM771r.append(metadata.f12627a[i10]);
            m19069a0(sbM771r.toString());
        }
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: c */
    public final void mo12789c(InterfaceC6208b.a aVar, int i10) {
        m19068Z(aVar, "drmSessionAcquired", "state=" + i10);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: d */
    public final void mo12790d(InterfaceC6208b.a aVar, C10332n c10332n) {
        m19068Z(aVar, "videoSize", c10332n.f52016a + ", " + c10332n.f52017b);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: e */
    public final void mo12791e() {
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: f */
    public final void mo12792f(InterfaceC6208b.a aVar, PlaybackException playbackException) {
        C10145n.m19095c("EventLogger", m19065V(aVar, "playerFailed", null, playbackException));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: g */
    public final void mo12793g(InterfaceC6208b.a aVar, int i10) {
        String str;
        if (i10 == 0) {
            str = "OFF";
        } else if (i10 != 1) {
            str = i10 != 2 ? "?" : "ALL";
        } else {
            str = "ONE";
        }
        m19068Z(aVar, "repeatMode", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: h */
    public final void mo12794h() {
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: i */
    public final void mo12795i(InterfaceC6208b.a aVar, C6635e c6635e) {
        m19067Y(aVar, "videoDisabled");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: j */
    public final void mo12796j(InterfaceC6208b.a aVar, int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder("mediaItem [");
        sb2.append(m19066W(aVar));
        sb2.append(", reason=");
        if (i10 == 0) {
            str = "REPEAT";
        } else if (i10 == 1) {
            str = "AUTO";
        } else if (i10 != 2) {
            str = i10 != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        sb2.append(str);
        sb2.append("]");
        m19069a0(sb2.toString());
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: k */
    public final void mo12797k(int i10, InterfaceC2532v.d dVar, InterfaceC2532v.d dVar2, InterfaceC6208b.a aVar) {
        String str;
        StringBuilder sb2 = new StringBuilder("reason=");
        if (i10 == 0) {
            str = "AUTO_TRANSITION";
        } else if (i10 == 1) {
            str = "SEEK";
        } else if (i10 == 2) {
            str = "SEEK_ADJUSTMENT";
        } else if (i10 == 3) {
            str = "SKIP";
        } else if (i10 != 4) {
            str = i10 != 5 ? "?" : "INTERNAL";
        } else {
            str = "REMOVE";
        }
        sb2.append(str);
        sb2.append(", PositionInfo:old [mediaItem=");
        sb2.append(dVar.f13758b);
        sb2.append(", period=");
        sb2.append(dVar.f13761e);
        sb2.append(", pos=");
        sb2.append(dVar.f13762f);
        int i11 = dVar.f13764h;
        if (i11 != -1) {
            sb2.append(", contentPos=");
            sb2.append(dVar.f13763g);
            sb2.append(", adGroup=");
            sb2.append(i11);
            sb2.append(", ad=");
            sb2.append(dVar.f13765i);
        }
        sb2.append("], PositionInfo:new [mediaItem=");
        sb2.append(dVar2.f13758b);
        sb2.append(", period=");
        sb2.append(dVar2.f13761e);
        sb2.append(", pos=");
        sb2.append(dVar2.f13762f);
        int i12 = dVar2.f13764h;
        if (i12 != -1) {
            sb2.append(", contentPos=");
            sb2.append(dVar2.f13763g);
            sb2.append(", adGroup=");
            sb2.append(i12);
            sb2.append(", ad=");
            sb2.append(dVar2.f13765i);
        }
        sb2.append("]");
        m19068Z(aVar, "positionDiscontinuity", sb2.toString());
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: l */
    public final void mo12798l(InterfaceC6208b.a aVar, int i10) {
        String str;
        if (i10 != 0) {
            str = i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else {
            str = "NONE";
        }
        m19068Z(aVar, "playbackSuppressionReason", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: m */
    public final void mo12799m(int i10, InterfaceC6208b.a aVar, boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10);
        sb2.append(", ");
        if (i10 == 1) {
            str = "USER_REQUEST";
        } else if (i10 == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i10 == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i10 != 4) {
            str = i10 != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb2.append(str);
        m19068Z(aVar, "playWhenReady", sb2.toString());
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: n */
    public final void mo12800n(InterfaceC6208b.a aVar, C5726i c5726i) {
        m19068Z(aVar, "upstreamDiscarded", C2416m.m7124d(c5726i.f34752c));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: o */
    public final void mo12801o(InterfaceC6208b.a aVar, C5726i c5726i, IOException iOException) {
        C10145n.m19095c("EventLogger", m19065V(aVar, "internalError", "loadError", iOException));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: p */
    public final void mo12802p(InterfaceC6208b.a aVar, String str) {
        m19068Z(aVar, "videoDecoderInitialized", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: q */
    public final void mo12803q(InterfaceC6208b.a aVar, C2367a c2367a) {
        m19068Z(aVar, "audioAttributes", c2367a.f11938a + "," + c2367a.f11939b + "," + c2367a.f11940c + "," + c2367a.f11941d);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: r */
    public final void mo12804r(InterfaceC6208b.a aVar, int i10) {
        m19068Z(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: s */
    public final void mo12805s(InterfaceC6208b.a aVar, C2416m c2416m) {
        m19068Z(aVar, "audioInputFormat", C2416m.m7124d(c2416m));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: t */
    public final void mo12806t(InterfaceC6208b.a aVar, String str) {
        m19068Z(aVar, "videoDecoderReleased", str);
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: v */
    public final void mo12808v(InterfaceC6208b.a aVar, boolean z10) {
        m19068Z(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: w */
    public final void mo12809w(InterfaceC6208b.a aVar, float f3) {
        m19068Z(aVar, "volume", Float.toString(f3));
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: x */
    public final void mo12810x(InterfaceC6208b.a aVar) {
        m19067Y(aVar, "audioEnabled");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: y */
    public final void mo12811y(InterfaceC6208b.a aVar, Metadata metadata) {
        m19069a0("metadata [" + m19066W(aVar));
        m19070b0(metadata, "  ");
        m19069a0("]");
    }

    @Override // p174i9.InterfaceC6208b
    /* JADX INFO: renamed from: z */
    public final void mo12812z(InterfaceC6208b.a aVar, Object obj) {
        m19068Z(aVar, "renderedFirstFrame", String.valueOf(obj));
    }
}
