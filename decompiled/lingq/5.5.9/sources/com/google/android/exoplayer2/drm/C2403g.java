package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.support.v4.media.C0141b;
import android.text.TextUtils;
import androidx.compose.p017ui.platform.C0639l;
import com.google.android.exoplayer2.drm.C2403g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.InterfaceC2402f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150h9.C5903b;
import p174i9.C6215e0;
import p218k9.InterfaceC6632b;
import p239l9.C7291f;
import p411u9.C9485h;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2403g implements InterfaceC2402f {

    /* JADX INFO: renamed from: d */
    public static final C0141b f12212d = new C0141b();

    /* JADX INFO: renamed from: a */
    public final UUID f12213a;

    /* JADX INFO: renamed from: b */
    public final MediaDrm f12214b;

    /* JADX INFO: renamed from: c */
    public int f12215c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m6986a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m6987b(MediaDrm mediaDrm, byte[] bArr, C6215e0 c6215e0) {
            C6215e0.a aVar = c6215e0.f36164a;
            aVar.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.f36166a;
            if (!logSessionId2.equals(logSessionId)) {
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                C0639l.m2401c(playbackComponent).setLogSessionId(logSessionId2);
            }
        }
    }

    public C2403g(UUID uuid) throws UnsupportedSchemeException {
        uuid.getClass();
        UUID uuid2 = C5903b.f35259b;
        C10129a.m18989a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f12213a = uuid;
        if (C10134c0.f51354a >= 27 || !C5903b.f35260c.equals(uuid)) {
            uuid2 = uuid;
        }
        MediaDrm mediaDrm = new MediaDrm(uuid2);
        this.f12214b = mediaDrm;
        this.f12215c = 1;
        if (C5903b.f35261d.equals(uuid) && "ASUS_Z00AD".equals(C10134c0.f51357d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo6973a(byte[] bArr) {
        return this.f12214b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: b */
    public final InterfaceC2402f.d mo6974b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f12214b.getProvisionRequest();
        return new InterfaceC2402f.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: c */
    public final void mo6985c(byte[] bArr, C6215e0 c6215e0) {
        if (C10134c0.f51354a >= 31) {
            try {
                a.m6987b(this.f12214b, bArr, c6215e0);
            } catch (UnsupportedOperationException unused) {
                C10145n.m19099g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: d */
    public final InterfaceC6632b mo6975d(byte[] bArr) throws MediaCryptoException {
        int i10 = C10134c0.f51354a;
        UUID uuid = this.f12213a;
        boolean z10 = i10 < 21 && C5903b.f35261d.equals(uuid) && "L3".equals(this.f12214b.getPropertyString("securityLevel"));
        if (i10 < 27 && C5903b.f35260c.equals(uuid)) {
            uuid = C5903b.f35259b;
        }
        return new C7291f(uuid, bArr, z10);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: e */
    public final byte[] mo6976e() throws MediaDrmException {
        return this.f12214b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: f */
    public final void mo6977f(byte[] bArr, byte[] bArr2) {
        this.f12214b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: g */
    public final void mo6978g(byte[] bArr) {
        this.f12214b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: h */
    public final byte[] mo6979h(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C5903b.f35260c.equals(this.f12213a) && C10134c0.f51354a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, C10170b.f51477c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = C10134c0.m19018C(sb2.toString());
            } catch (JSONException e10) {
                C10145n.m19096d("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, C10170b.f51477c)), e10);
            }
        }
        return this.f12214b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: i */
    public final void mo6980i(byte[] bArr) throws DeniedByServerException {
        this.f12214b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: j */
    public final void mo6981j(final DefaultDrmSessionManager.C2390a c2390a) {
        this.f12214b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l9.g
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                C2403g c2403g = this.f40809a;
                InterfaceC2402f.b bVar = c2390a;
                c2403g.getClass();
                DefaultDrmSessionManager.HandlerC2391b handlerC2391b = DefaultDrmSessionManager.this.f12176y;
                handlerC2391b.getClass();
                handlerC2391b.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:127:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final InterfaceC2402f.a mo6982k(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        int i11;
        C9485h.a aVarM17928b;
        int i12;
        int i13;
        boolean z10;
        byte[] bArrM17929c;
        UUID uuid = this.f12213a;
        if (list != null) {
            if (C5903b.f35261d.equals(uuid)) {
                if (C10134c0.f51354a < 28 || list.size() <= 1) {
                    i11 = 0;
                    while (true) {
                        if (i11 < list.size()) {
                            schemeData = list.get(0);
                            break;
                        }
                        DrmInitData.SchemeData schemeData2 = list.get(i11);
                        byte[] bArr3 = schemeData2.f12194e;
                        bArr3.getClass();
                        aVarM17928b = C9485h.m17928b(bArr3);
                        if (aVarM17928b == null) {
                            i12 = -1;
                        } else {
                            i12 = aVarM17928b.f48719b;
                        }
                        i13 = C10134c0.f51354a;
                        if ((i13 >= 23 && i12 == 0) || (i13 >= 23 && i12 == 1)) {
                            schemeData = schemeData2;
                            break;
                        }
                    }
                } else {
                    DrmInitData.SchemeData schemeData3 = list.get(0);
                    int i14 = 0;
                    int length = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = true;
                            break;
                        }
                        DrmInitData.SchemeData schemeData4 = list.get(i14);
                        byte[] bArr4 = schemeData4.f12194e;
                        bArr4.getClass();
                        if (C10134c0.m19034a(schemeData4.f12193d, schemeData3.f12193d) && C10134c0.m19034a(schemeData4.f12192c, schemeData3.f12192c)) {
                            if (C9485h.m17928b(bArr4) != null) {
                                length += bArr4.length;
                                i14++;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        i11 = 0;
                        while (true) {
                            if (i11 < list.size()) {
                                schemeData = list.get(0);
                                break;
                            }
                            DrmInitData.SchemeData schemeData5 = list.get(i11);
                            byte[] bArr5 = schemeData5.f12194e;
                            bArr5.getClass();
                            aVarM17928b = C9485h.m17928b(bArr5);
                            if (aVarM17928b == null) {
                                i12 = -1;
                            } else {
                                i12 = aVarM17928b.f48719b;
                            }
                            i13 = C10134c0.f51354a;
                            i11 = i13 >= 23 ? i11 + 1 : i11 + 1;
                            schemeData = schemeData5;
                            break;
                        }
                    }
                    byte[] bArr6 = new byte[length];
                    int i15 = 0;
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        byte[] bArr7 = list.get(i16).f12194e;
                        bArr7.getClass();
                        int length2 = bArr7.length;
                        System.arraycopy(bArr7, 0, bArr6, i15, length2);
                        i15 += length2;
                    }
                    schemeData = new DrmInitData.SchemeData(schemeData3.f12191b, schemeData3.f12192c, schemeData3.f12193d, bArr6);
                }
            } else {
                schemeData = list.get(0);
            }
            byte[] bArrM17927a = schemeData.f12194e;
            bArrM17927a.getClass();
            UUID uuid2 = C5903b.f35262e;
            if (uuid2.equals(uuid)) {
                byte[] bArrM17929c2 = C9485h.m17929c(uuid, bArrM17927a);
                if (bArrM17929c2 != null) {
                    bArrM17927a = bArrM17929c2;
                }
                C10151t c10151t = new C10151t(bArrM17927a);
                int iM19132g = c10151t.m19132g();
                short sM19134i = c10151t.m19134i();
                short sM19134i2 = c10151t.m19134i();
                if (sM19134i == 1 && sM19134i2 == 1) {
                    short sM19134i3 = c10151t.m19134i();
                    Charset charset = C10170b.f51479e;
                    String strM19143r = c10151t.m19143r(sM19134i3, charset);
                    if (!strM19143r.contains("<LA_URL>")) {
                        int iIndexOf = strM19143r.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            C10145n.m19099g("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strM19143r.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM19143r.substring(iIndexOf);
                        int i17 = iM19132g + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i17);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i17);
                        byteBufferAllocate.putShort(sM19134i);
                        byteBufferAllocate.putShort(sM19134i2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrM17927a = byteBufferAllocate.array();
                    }
                } else {
                    C10145n.m19098f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM17927a = C9485h.m17927a(uuid2, bArrM17927a);
            }
            int i18 = C10134c0.f51354a;
            if (i18 < 23 && C5903b.f35261d.equals(uuid)) {
                bArrM17929c = C9485h.m17929c(uuid, bArrM17927a);
                if (bArrM17929c != null) {
                    bArrM17927a = bArrM17929c;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(C10134c0.f51356c)) {
                String str3 = C10134c0.f51357d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrM17929c = C9485h.m17929c(uuid, bArrM17927a);
                    if (bArrM17929c != null) {
                        bArrM17927a = bArrM17929c;
                    }
                }
            }
            str = schemeData.f12193d;
            if (i18 < 26 && C5903b.f35260c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
                str = "cenc";
            }
            bArr2 = bArrM17927a;
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f12214b.getKeyRequest(bArr, bArr2, str, i10, map);
        byte[] data = keyRequest.getData();
        if (C5903b.f35260c.equals(uuid) && C10134c0.f51354a < 27) {
            data = C10134c0.m19018C(new String(data, C10170b.f51477c).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (C10134c0.f51354a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null) {
            String str4 = schemeData.f12192c;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (C10134c0.f51354a >= 23) {
            keyRequest.getRequestType();
        }
        return new InterfaceC2402f.a(defaultUrl, data);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: l */
    public final int mo6983l() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: m */
    public final boolean mo6984m(String str, byte[] bArr) {
        if (C10134c0.f51354a >= 31) {
            return a.m6986a(this.f12214b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f12213a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    public final synchronized void release() {
        try {
            int i10 = this.f12215c - 1;
            this.f12215c = i10;
            if (i10 == 0) {
                this.f12214b.release();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
