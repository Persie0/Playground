package p000;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C0713b;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class vu5 implements InterfaceC3534rf {

    /* JADX INFO: renamed from: A */
    public int f65915A;

    /* JADX INFO: renamed from: B */
    public boolean f65916B;

    /* JADX INFO: renamed from: a */
    public final Context f65917a;

    /* JADX INFO: renamed from: c */
    public final r72 f65919c;

    /* JADX INFO: renamed from: d */
    public final PlaybackSession f65920d;

    /* JADX INFO: renamed from: j */
    public String f65926j;

    /* JADX INFO: renamed from: k */
    public PlaybackMetrics.Builder f65927k;

    /* JADX INFO: renamed from: l */
    public int f65928l;

    /* JADX INFO: renamed from: o */
    public PlaybackException f65931o;

    /* JADX INFO: renamed from: p */
    public p33 f65932p;

    /* JADX INFO: renamed from: q */
    public p33 f65933q;

    /* JADX INFO: renamed from: r */
    public p33 f65934r;

    /* JADX INFO: renamed from: s */
    public C0713b f65935s;

    /* JADX INFO: renamed from: t */
    public C0713b f65936t;

    /* JADX INFO: renamed from: u */
    public C0713b f65937u;

    /* JADX INFO: renamed from: v */
    public boolean f65938v;

    /* JADX INFO: renamed from: w */
    public int f65939w;

    /* JADX INFO: renamed from: x */
    public boolean f65940x;

    /* JADX INFO: renamed from: y */
    public int f65941y;

    /* JADX INFO: renamed from: z */
    public int f65942z;

    /* JADX INFO: renamed from: b */
    public final Executor f65918b = l70.m15956s();

    /* JADX INFO: renamed from: f */
    public final y0a f65922f = new y0a();

    /* JADX INFO: renamed from: g */
    public final x0a f65923g = new x0a();

    /* JADX INFO: renamed from: i */
    public final HashMap f65925i = new HashMap();

    /* JADX INFO: renamed from: h */
    public final HashMap f65924h = new HashMap();

    /* JADX INFO: renamed from: e */
    public final long f65921e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m */
    public int f65929m = 0;

    /* JADX INFO: renamed from: n */
    public int f65930n = 0;

    public vu5(Context context, PlaybackSession playbackSession) {
        this.f65917a = context.getApplicationContext();
        this.f65920d = playbackSession;
        r72 r72Var = new r72();
        this.f65919c = r72Var;
        r72Var.f58827d = this;
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: C */
    public final void mo20604C(C3496qf c3496qf, PlaybackException playbackException) {
        this.f65931o = playbackException;
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: F */
    public final void mo20607F(C3496qf c3496qf, l32 l32Var) {
        this.f65941y += l32Var.f48974g;
        this.f65942z += l32Var.f48972e;
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: G */
    public final void mo20608G(int i, C3496qf c3496qf, ca7 ca7Var, ca7 ca7Var2) {
        if (i == 1) {
            this.f65938v = true;
        }
        this.f65928l = i;
    }

    @Override // p000.InterfaceC3534rf
    /* JADX INFO: renamed from: H */
    public final void mo20609H(C3496qf c3496qf, ru5 ru5Var) {
        jv5 jv5Var = c3496qf.f57669d;
        if (jv5Var == null) {
            return;
        }
        C0713b c0713b = ru5Var.f59829b;
        c0713b.getClass();
        z0a z0aVar = c3496qf.f57667b;
        jv5Var.getClass();
        p33 p33Var = new p33((Object) c0713b, (Object) this.f65919c.m20427d(z0aVar, jv5Var), false, 10);
        int i = ru5Var.f59828a;
        if (i != 0) {
            if (i == 1) {
                this.f65933q = p33Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f65934r = p33Var;
                return;
            }
        }
        this.f65932p = p33Var;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m23548O(p33 p33Var) {
        String str;
        if (p33Var == null) {
            return false;
        }
        String str2 = (String) p33Var.f55513b;
        r72 r72Var = this.f65919c;
        synchronized (r72Var) {
            str = r72Var.f58829f;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: P */
    public final void m23549P() {
        PlaybackMetrics.Builder builder = this.f65927k;
        if (builder != null && this.f65916B) {
            builder.setAudioUnderrunCount(this.f65915A);
            this.f65927k.setVideoFramesDropped(this.f65941y);
            this.f65927k.setVideoFramesPlayed(this.f65942z);
            Long l = (Long) this.f65924h.get(this.f65926j);
            this.f65927k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f65925i.get(this.f65926j);
            this.f65927k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f65927k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f65918b.execute(new RunnableC0806bd(29, this, this.f65927k.build()));
        }
        this.f65927k = null;
        this.f65926j = null;
        this.f65915A = 0;
        this.f65941y = 0;
        this.f65942z = 0;
        this.f65935s = null;
        this.f65936t = null;
        this.f65937u = null;
        this.f65916B = false;
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX INFO: renamed from: Q */
    public final void m23550Q(z0a z0aVar, jv5 jv5Var) {
        Matcher matcher;
        String strGroup;
        int i;
        PlaybackMetrics.Builder builder = this.f65927k;
        if (jv5Var == null) {
            return;
        }
        int iMo17285b = z0aVar.mo17285b(jv5Var.f46226a);
        if (iMo17285b == -1) {
            return;
        }
        x0a x0aVar = this.f65923g;
        int i2 = 0;
        z0aVar.mo16393f(iMo17285b, x0aVar, false);
        int i3 = x0aVar.f67601c;
        y0a y0aVar = this.f65922f;
        z0aVar.m25397n(i3, y0aVar);
        mu5 mu5Var = y0aVar.f69065b.f56811b;
        if (mu5Var != null) {
            Uri uri = mu5Var.f51852a;
            String str = mu5Var.f51853b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        i2 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        i2 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        i2 = 3;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
            } else {
                String scheme = uri.getScheme();
                if (scheme == null || !(AbstractC3584sr.m21593D("rtsp", scheme) || AbstractC3584sr.m21593D("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        i2 = 4;
                    } else {
                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            String strM21625f0 = AbstractC3584sr.m21625f0(lastPathSegment.substring(iLastIndexOf + 1));
                            strM21625f0.getClass();
                            switch (strM21625f0.hashCode()) {
                                case 104579:
                                    if (strM21625f0.equals("ism")) {
                                    }
                                    break;
                                case 108321:
                                    if (strM21625f0.equals("mpd")) {
                                    }
                                    break;
                                case 3242057:
                                    if (strM21625f0.equals("isml")) {
                                    }
                                    break;
                                case 3299913:
                                    if (strM21625f0.equals("m3u8")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instruction units count: 392
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p000.vu5.m23550Q(z0a, jv5):void");
                        }

                        /* JADX INFO: renamed from: R */
                        public final void m23551R(C3496qf c3496qf, String str) {
                            jv5 jv5Var = c3496qf.f57669d;
                            if ((jv5Var == null || !jv5Var.m14690b()) && str.equals(this.f65926j)) {
                                m23549P();
                            }
                            this.f65924h.remove(str);
                            this.f65925i.remove(str);
                        }

                        /* JADX INFO: renamed from: S */
                        public final void m23552S(int i, long j, C0713b c0713b) {
                            TrackChangeEvent.Builder timeSinceCreatedMillis = xk1.m24582f(i).setTimeSinceCreatedMillis(j - this.f65921e);
                            if (c0713b != null) {
                                timeSinceCreatedMillis.setTrackState(1);
                                timeSinceCreatedMillis.setTrackChangeReason(2);
                                String str = c0713b.f6405n;
                                if (str != null) {
                                    timeSinceCreatedMillis.setContainerMimeType(str);
                                }
                                String str2 = c0713b.f6406o;
                                if (str2 != null) {
                                    timeSinceCreatedMillis.setSampleMimeType(str2);
                                }
                                String str3 = c0713b.f6402k;
                                if (str3 != null) {
                                    timeSinceCreatedMillis.setCodecName(str3);
                                }
                                int i2 = c0713b.f6401j;
                                if (i2 != -1) {
                                    timeSinceCreatedMillis.setBitrate(i2);
                                }
                                int i3 = c0713b.f6413v;
                                if (i3 != -1) {
                                    timeSinceCreatedMillis.setWidth(i3);
                                }
                                int i4 = c0713b.f6414w;
                                if (i4 != -1) {
                                    timeSinceCreatedMillis.setHeight(i4);
                                }
                                int i5 = c0713b.f6381G;
                                if (i5 != -1) {
                                    timeSinceCreatedMillis.setChannelCount(i5);
                                }
                                int i6 = c0713b.f6382H;
                                if (i6 != -1) {
                                    timeSinceCreatedMillis.setAudioSampleRate(i6);
                                }
                                String str4 = c0713b.f6395d;
                                if (str4 != null) {
                                    String str5 = uma.f64080a;
                                    String[] strArrSplit = str4.split("-", -1);
                                    Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                                    timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                                    Object obj = pairCreate.second;
                                    if (obj != null) {
                                        timeSinceCreatedMillis.setLanguageRegion((String) obj);
                                    }
                                }
                                float f = c0713b.f6417z;
                                if (f != -1.0f) {
                                    timeSinceCreatedMillis.setVideoFrameRate(f);
                                }
                            } else {
                                timeSinceCreatedMillis.setTrackState(0);
                            }
                            this.f65916B = true;
                            this.f65918b.execute(new RunnableC0806bd(28, this, timeSinceCreatedMillis.build()));
                        }

                        @Override // p000.InterfaceC3534rf
                        /* JADX INFO: renamed from: h */
                        public final void mo20623h(C3496qf c3496qf, ru5 ru5Var, IOException iOException) {
                            this.f65939w = 1;
                        }

                        @Override // p000.InterfaceC3534rf
                        /* JADX INFO: renamed from: n */
                        public final void mo20629n(C3496qf c3496qf, int i, long j) {
                            jv5 jv5Var = c3496qf.f57669d;
                            if (jv5Var != null) {
                                String strM20427d = this.f65919c.m20427d(c3496qf.f57667b, jv5Var);
                                HashMap map = this.f65925i;
                                Long l = (Long) map.get(strM20427d);
                                HashMap map2 = this.f65924h;
                                Long l2 = (Long) map2.get(strM20427d);
                                map.put(strM20427d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
                                map2.put(strM20427d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
                            }
                        }

                        @Override // p000.InterfaceC3534rf
                        /* JADX INFO: renamed from: q */
                        public final void mo20632q(C3496qf c3496qf, lsa lsaVar) {
                            p33 p33Var = this.f65932p;
                            if (p33Var != null) {
                                C0713b c0713b = (C0713b) p33Var.f55514c;
                                if (c0713b.f6414w == -1) {
                                    lc3 lc3VarM2520a = c0713b.m2520a();
                                    lc3VarM2520a.m16087t(lsaVar.f50085a);
                                    lc3VarM2520a.m16073f(lsaVar.f50086b);
                                    this.f65932p = new p33((Object) lc3VarM2520a.m16068a(), p33Var.f55513b, false, 10);
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:317:0x058e A[PHI: r9
                          0x058e: PHI (r9v2 int) = (r9v0 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:316:0x058c, B:328:0x05a4, B:329:0x05a6, B:330:0x05a8] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // p000.InterfaceC3534rf
                        /* JADX INFO: renamed from: t */
                        public final void mo20635t(da7 da7Var, b64 b64Var) {
                            boolean z;
                            int i;
                            int i2;
                            int i3;
                            int i4;
                            int i5;
                            int i6;
                            qg3 qg3Var;
                            int i7;
                            qg3 qg3Var2;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            qg3 qg3Var3;
                            int i13;
                            int i14;
                            int i15;
                            boolean z2;
                            vu5 vu5Var;
                            C0713b c0713b;
                            DrmInitData drmInitData;
                            int i16;
                            if (((t63) b64Var.f8006a).f61911a.size() == 0) {
                                return;
                            }
                            int i17 = 0;
                            while (true) {
                                boolean z3 = true;
                                if (i17 >= ((t63) b64Var.f8006a).f61911a.size()) {
                                    break;
                                }
                                SparseBooleanArray sparseBooleanArray = ((t63) b64Var.f8006a).f61911a;
                                bna.m3973s(i17, sparseBooleanArray.size());
                                int iKeyAt = sparseBooleanArray.keyAt(i17);
                                C3496qf c3496qf = (C3496qf) ((SparseArray) b64Var.f8007b).get(iKeyAt);
                                c3496qf.getClass();
                                r72 r72Var = this.f65919c;
                                if (iKeyAt == 0) {
                                    synchronized (r72Var) {
                                        try {
                                            r72Var.f58827d.getClass();
                                            z0a z0aVar = r72Var.f58828e;
                                            r72Var.f58828e = c3496qf.f57667b;
                                            Iterator it = r72Var.f58826c.values().iterator();
                                            while (it.hasNext()) {
                                                q72 q72Var = (q72) it.next();
                                                if (!q72Var.m19701l(z0aVar, r72Var.f58828e) || q72Var.m19699j(c3496qf)) {
                                                    it.remove();
                                                    if (q72Var.f57336a.equals(r72Var.f58829f)) {
                                                        r72Var.m20424a(q72Var);
                                                    }
                                                    if (q72Var.f57340e) {
                                                        r72Var.f58827d.m23551R(c3496qf, q72Var.f57336a);
                                                    }
                                                }
                                            }
                                            r72Var.m20428e(c3496qf);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else if (iKeyAt == 11) {
                                    int i18 = this.f65928l;
                                    synchronized (r72Var) {
                                        try {
                                            r72Var.f58827d.getClass();
                                            if (i18 != 0) {
                                                z3 = false;
                                            }
                                            Iterator it2 = r72Var.f58826c.values().iterator();
                                            while (it2.hasNext()) {
                                                q72 q72Var2 = (q72) it2.next();
                                                if (q72Var2.m19699j(c3496qf)) {
                                                    it2.remove();
                                                    boolean zEquals = q72Var2.f57336a.equals(r72Var.f58829f);
                                                    if (zEquals) {
                                                        r72Var.m20424a(q72Var2);
                                                    }
                                                    if (q72Var2.f57340e) {
                                                        if (z3 && zEquals) {
                                                            boolean unused = q72Var2.f57341f;
                                                        }
                                                        r72Var.f58827d.m23551R(c3496qf, q72Var2.f57336a);
                                                    }
                                                }
                                            }
                                            r72Var.m20428e(c3496qf);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    r72Var.m20429f(c3496qf);
                                }
                                i17++;
                            }
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (b64Var.m3352e(0)) {
                                C3496qf c3496qf2 = (C3496qf) ((SparseArray) b64Var.f8007b).get(0);
                                c3496qf2.getClass();
                                if (this.f65927k != null) {
                                    m23550Q(c3496qf2.f57667b, c3496qf2.f57669d);
                                }
                            }
                            if (b64Var.m3352e(2) && this.f65927k != null) {
                                jw2 jw2Var = (jw2) da7Var;
                                jw2Var.m14705K();
                                d14 d14VarListIterator = ((a9a) jw2Var.f46281a0.f46901i.f63596e).f389a.listIterator(0);
                                loop3: while (true) {
                                    if (!d14VarListIterator.hasNext()) {
                                        drmInitData = null;
                                        break;
                                    }
                                    z8a z8aVar = (z8a) d14VarListIterator.next();
                                    for (int i19 = 0; i19 < z8aVar.f71096a; i19++) {
                                        if (z8aVar.m25496f(i19) && (drmInitData = z8aVar.m25492b(i19).f6410s) != null) {
                                            break loop3;
                                        }
                                    }
                                }
                                if (drmInitData != null) {
                                    PlaybackMetrics.Builder builderM12612q = AbstractC3038gh.m12612q(this.f65927k);
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= drmInitData.f6365d) {
                                            i16 = 1;
                                            break;
                                        }
                                        UUID uuid = drmInitData.m2515b(i20).f6367b;
                                        if (uuid.equals(zk0.f71671d)) {
                                            i16 = 3;
                                            break;
                                        } else if (uuid.equals(zk0.f71672e)) {
                                            i16 = 2;
                                            break;
                                        } else {
                                            if (uuid.equals(zk0.f71670c)) {
                                                i16 = 6;
                                                break;
                                            }
                                            i20++;
                                        }
                                    }
                                    builderM12612q.setDrmType(i16);
                                }
                            }
                            if (b64Var.m3352e(1011)) {
                                this.f65915A++;
                            }
                            PlaybackException playbackException = this.f65931o;
                            int i21 = 27;
                            int i22 = 5;
                            if (playbackException == null) {
                                i13 = 2;
                                i6 = 13;
                                i2 = 8;
                                i3 = 7;
                                i4 = 6;
                                i5 = 9;
                            } else {
                                int i23 = playbackException.f6373a;
                                Context context = this.f65917a;
                                boolean z4 = this.f65939w == 4;
                                if (i23 == 1001) {
                                    qg3Var = new qg3(20, 0);
                                } else {
                                    if (playbackException instanceof ExoPlaybackException) {
                                        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                                        z = exoPlaybackException.f6439c == 1;
                                        i = exoPlaybackException.f6443g;
                                    } else {
                                        z = false;
                                        i = 0;
                                    }
                                    Throwable cause = playbackException.getCause();
                                    cause.getClass();
                                    if (cause instanceof IOException) {
                                        if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                                            qg3Var3 = new qg3(5, ((HttpDataSource$InvalidResponseCodeException) cause).f6438c);
                                        } else {
                                            if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                                                i8 = 8;
                                                i9 = 9;
                                                i10 = 6;
                                                i11 = 7;
                                                qg3Var = new qg3(z4 ? 10 : 11, 0);
                                            } else {
                                                boolean z5 = cause instanceof HttpDataSource$HttpDataSourceException;
                                                if (z5 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                                                    i9 = 9;
                                                    if (tk6.m22184a(context).m22185b() == 1) {
                                                        qg3Var = new qg3(3, 0);
                                                    } else {
                                                        Throwable cause2 = cause.getCause();
                                                        if (cause2 instanceof UnknownHostException) {
                                                            qg3Var = new qg3(6, 0);
                                                            i5 = 9;
                                                            i4 = 6;
                                                            i6 = 13;
                                                            i2 = 8;
                                                            i3 = 7;
                                                        } else {
                                                            i10 = 6;
                                                            if (cause2 instanceof SocketTimeoutException) {
                                                                i11 = 7;
                                                                qg3Var = new qg3(7, 0);
                                                            } else {
                                                                i11 = 7;
                                                                if (z5 && ((HttpDataSource$HttpDataSourceException) cause).f6437b == 1) {
                                                                    qg3Var = new qg3(4, 0);
                                                                } else {
                                                                    i8 = 8;
                                                                    qg3Var = new qg3(8, 0);
                                                                }
                                                            }
                                                            i5 = 9;
                                                            i4 = 6;
                                                            i3 = i11;
                                                            i6 = 13;
                                                            i2 = 8;
                                                        }
                                                    }
                                                } else if (i23 == 1002) {
                                                    qg3Var = new qg3(21, 0);
                                                } else if (cause instanceof DrmSession$DrmSessionException) {
                                                    Throwable cause3 = cause.getCause();
                                                    cause3.getClass();
                                                    if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                                        int iM22822q = uma.m22822q(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                                        switch (uma.m22821p(iM22822q)) {
                                                            case 6002:
                                                                i12 = 24;
                                                                break;
                                                            case 6003:
                                                                i12 = 28;
                                                                break;
                                                            case 6004:
                                                                i12 = 25;
                                                                break;
                                                            case 6005:
                                                                i12 = 26;
                                                                break;
                                                            default:
                                                                i12 = 27;
                                                                break;
                                                        }
                                                        qg3Var3 = new qg3(i12, iM22822q);
                                                    } else if (cause3 instanceof MediaDrmResetException) {
                                                        qg3Var = new qg3(27, 0);
                                                    } else if (cause3 instanceof NotProvisionedException) {
                                                        qg3Var = new qg3(24, 0);
                                                    } else if (cause3 instanceof DeniedByServerException) {
                                                        qg3Var = new qg3(29, 0);
                                                    } else if (cause3 instanceof UnsupportedDrmException) {
                                                        qg3Var = new qg3(23, 0);
                                                    } else {
                                                        qg3Var = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new qg3(28, 0) : new qg3(30, 0);
                                                    }
                                                } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                                    Throwable cause4 = cause.getCause();
                                                    cause4.getClass();
                                                    Throwable cause5 = cause4.getCause();
                                                    qg3Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new qg3(32, 0) : new qg3(31, 0);
                                                } else {
                                                    i9 = 9;
                                                    qg3Var = new qg3(9, 0);
                                                }
                                                i5 = i9;
                                                i6 = 13;
                                                i2 = 8;
                                                i3 = 7;
                                                i4 = 6;
                                            }
                                            i2 = i8;
                                            i5 = i9;
                                            i4 = i10;
                                            i3 = i11;
                                            i6 = 13;
                                        }
                                        qg3Var = qg3Var3;
                                    } else {
                                        i2 = 8;
                                        i3 = 7;
                                        i4 = 6;
                                        i5 = 9;
                                        if (z && (i == 0 || i == 1)) {
                                            qg3Var = new qg3(35, 0);
                                        } else if (z && i == 3) {
                                            qg3Var = new qg3(15, 0);
                                        } else if (z && i == 2) {
                                            qg3Var = new qg3(23, 0);
                                        } else {
                                            if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                                                i6 = 13;
                                                qg3Var2 = new qg3(13, uma.m22822q(((MediaCodecRenderer$DecoderInitializationException) cause).f6459d));
                                            } else {
                                                i6 = 13;
                                                if (cause instanceof MediaCodecDecoderException) {
                                                    qg3Var2 = new qg3(14, ((MediaCodecDecoderException) cause).f6455a);
                                                } else if (cause instanceof OutOfMemoryError) {
                                                    qg3Var = new qg3(14, 0);
                                                } else if (cause instanceof AudioSink$InitializationException) {
                                                    qg3Var = new qg3(17, 0);
                                                } else if (cause instanceof AudioSink$WriteException) {
                                                    qg3Var2 = new qg3(18, ((AudioSink$WriteException) cause).f6450a);
                                                } else if (cause instanceof MediaCodec.CryptoException) {
                                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                                    switch (uma.m22821p(errorCode)) {
                                                        case 6002:
                                                            i7 = 24;
                                                            break;
                                                        case 6003:
                                                            i7 = 28;
                                                            break;
                                                        case 6004:
                                                            i7 = 25;
                                                            break;
                                                        case 6005:
                                                            i7 = 26;
                                                            break;
                                                        default:
                                                            i7 = 27;
                                                            break;
                                                    }
                                                    qg3Var2 = new qg3(i7, errorCode);
                                                } else {
                                                    qg3Var = new qg3(22, 0);
                                                }
                                            }
                                            qg3Var = qg3Var2;
                                        }
                                        i6 = 13;
                                    }
                                    this.f65918b.execute(new RunnableC3470pr(26, this, AbstractC3038gh.m12607l().setTimeSinceCreatedMillis(jElapsedRealtime - this.f65921e).setErrorCode(qg3Var.f57750a).setSubErrorCode(qg3Var.f57751b).setException(playbackException).build()));
                                    this.f65916B = true;
                                    this.f65931o = null;
                                    i13 = 2;
                                }
                                i6 = 13;
                                i2 = 8;
                                i3 = 7;
                                i4 = 6;
                                i5 = 9;
                                this.f65918b.execute(new RunnableC3470pr(26, this, AbstractC3038gh.m12607l().setTimeSinceCreatedMillis(jElapsedRealtime - this.f65921e).setErrorCode(qg3Var.f57750a).setSubErrorCode(qg3Var.f57751b).setException(playbackException).build()));
                                this.f65916B = true;
                                this.f65931o = null;
                                i13 = 2;
                            }
                            if (b64Var.m3352e(i13)) {
                                jw2 jw2Var2 = (jw2) da7Var;
                                jw2Var2.m14705K();
                                a9a a9aVar = (a9a) jw2Var2.f46281a0.f46901i.f63596e;
                                boolean zM190a = a9aVar.m190a(i13);
                                boolean zM190a2 = a9aVar.m190a(1);
                                boolean zM190a3 = a9aVar.m190a(3);
                                if (zM190a || zM190a2 || zM190a3) {
                                    if (zM190a) {
                                        c0713b = null;
                                    } else {
                                        c0713b = null;
                                        if (!Objects.equals(this.f65935s, null)) {
                                            this.f65935s = null;
                                            m23552S(1, jElapsedRealtime, null);
                                        }
                                    }
                                    if (!zM190a2 && !Objects.equals(this.f65936t, c0713b)) {
                                        this.f65936t = c0713b;
                                        m23552S(0, jElapsedRealtime, c0713b);
                                    }
                                    if (!zM190a3 && !Objects.equals(this.f65937u, c0713b)) {
                                        this.f65937u = c0713b;
                                        m23552S(2, jElapsedRealtime, c0713b);
                                    }
                                }
                            }
                            if (m23548O(this.f65932p)) {
                                C0713b c0713b2 = (C0713b) this.f65932p.f55514c;
                                if (c0713b2.f6414w != -1) {
                                    if (!Objects.equals(this.f65935s, c0713b2)) {
                                        this.f65935s = c0713b2;
                                        m23552S(1, jElapsedRealtime, c0713b2);
                                    }
                                    this.f65932p = null;
                                }
                            }
                            if (m23548O(this.f65933q)) {
                                C0713b c0713b3 = (C0713b) this.f65933q.f55514c;
                                if (!Objects.equals(this.f65936t, c0713b3)) {
                                    this.f65936t = c0713b3;
                                    m23552S(0, jElapsedRealtime, c0713b3);
                                }
                                this.f65933q = null;
                            }
                            if (m23548O(this.f65934r)) {
                                C0713b c0713b4 = (C0713b) this.f65934r.f55514c;
                                if (!Objects.equals(this.f65937u, c0713b4)) {
                                    this.f65937u = c0713b4;
                                    m23552S(2, jElapsedRealtime, c0713b4);
                                }
                                this.f65934r = null;
                            }
                            switch (tk6.m22184a(this.f65917a).m22185b()) {
                                case 0:
                                    i14 = 0;
                                    break;
                                case 1:
                                    i14 = i5;
                                    break;
                                case 2:
                                    i14 = 2;
                                    break;
                                case 3:
                                    i14 = 4;
                                    break;
                                case 4:
                                    i14 = 5;
                                    break;
                                case 5:
                                    i14 = i4;
                                    break;
                                case 6:
                                case 8:
                                default:
                                    i14 = 1;
                                    break;
                                case 7:
                                    i14 = 3;
                                    break;
                                case 9:
                                    i14 = i2;
                                    break;
                                case 10:
                                    i14 = i3;
                                    break;
                            }
                            if (i14 != this.f65930n) {
                                this.f65930n = i14;
                                this.f65918b.execute(new RunnableC3470pr(25, this, AbstractC3038gh.m12603h().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - this.f65921e).build()));
                            }
                            jw2 jw2Var3 = (jw2) da7Var;
                            if (jw2Var3.m14721q() != 2) {
                                this.f65938v = false;
                            }
                            jw2Var3.m14705K();
                            if (jw2Var3.f46281a0.f46898f == null) {
                                this.f65940x = false;
                                i15 = 10;
                            } else {
                                i15 = 10;
                                if (b64Var.m3352e(10)) {
                                    this.f65940x = true;
                                }
                            }
                            int iM14721q = jw2Var3.m14721q();
                            if (this.f65938v) {
                                i15 = i22;
                                z2 = true;
                            } else {
                                if (this.f65940x) {
                                    i15 = i6;
                                } else if (iM14721q == 4) {
                                    i15 = 11;
                                } else {
                                    i22 = 2;
                                    if (iM14721q == 2) {
                                        int i24 = this.f65929m;
                                        if (i24 == 0 || i24 == 2 || i24 == 12) {
                                            i15 = i22;
                                        } else if (jw2Var3.m14719o()) {
                                            jw2Var3.m14705K();
                                            if (jw2Var3.f46281a0.f46906n == 0) {
                                                i15 = i4;
                                            }
                                        } else {
                                            i15 = i3;
                                        }
                                    } else {
                                        i15 = 3;
                                        if (iM14721q != 3) {
                                            z2 = true;
                                            i15 = (iM14721q != 1 || this.f65929m == 0) ? this.f65929m : 12;
                                        } else if (jw2Var3.m14719o()) {
                                            jw2Var3.m14705K();
                                            if (jw2Var3.f46281a0.f46906n != 0) {
                                                i15 = i5;
                                            }
                                        } else {
                                            i15 = 4;
                                        }
                                    }
                                }
                                z2 = true;
                            }
                            if (this.f65929m != i15) {
                                this.f65929m = i15;
                                this.f65916B = z2;
                                this.f65918b.execute(new RunnableC3470pr(i21, this, AbstractC3038gh.m12614s().setState(this.f65929m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f65921e).build()));
                            }
                            if (b64Var.m3352e(1028)) {
                                r72 r72Var2 = this.f65919c;
                                C3496qf c3496qf3 = (C3496qf) ((SparseArray) b64Var.f8007b).get(1028);
                                c3496qf3.getClass();
                                synchronized (r72Var2) {
                                    try {
                                        String str = r72Var2.f58829f;
                                        if (str != null) {
                                            q72 q72Var3 = (q72) r72Var2.f58826c.get(str);
                                            q72Var3.getClass();
                                            r72Var2.m20424a(q72Var3);
                                        }
                                        Iterator it3 = r72Var2.f58826c.values().iterator();
                                        while (it3.hasNext()) {
                                            q72 q72Var4 = (q72) it3.next();
                                            it3.remove();
                                            if (q72Var4.f57340e && (vu5Var = r72Var2.f58827d) != null) {
                                                vu5Var.m23551R(c3496qf3, q72Var4.f57336a);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }
