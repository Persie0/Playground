package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpm implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34554a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f34555b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f34556c;

    public /* synthetic */ jpm(String str, Throwable th, int i) {
        this.f34556c = i;
        this.f34555b = str;
        this.f34554a = th;
    }

    public jpm(jph jphVar, jpp jppVar, int i, byte[] bArr) {
        this.f34556c = i;
        this.f34555b = jphVar;
        this.f34554a = jppVar;
    }

    public jpm(jpn jpnVar, jpp jppVar, int i) {
        this.f34556c = i;
        this.f34555b = jpnVar;
        this.f34554a = jppVar;
    }

    public jpm(jrc jrcVar, jrs jrsVar, int i) {
        this.f34556c = i;
        this.f34555b = jrcVar;
        this.f34554a = jrsVar;
    }

    public jpm(jrc jrcVar, jtk jtkVar, int i) {
        this.f34556c = i;
        this.f34555b = jrcVar;
        this.f34554a = jtkVar;
    }

    public /* synthetic */ jpm(jtk jtkVar, jsx jsxVar, int i) {
        this.f34556c = i;
        this.f34554a = jtkVar;
        this.f34555b = jsxVar;
    }

    public /* synthetic */ jpm(juu juuVar, Object obj, int i) {
        this.f34556c = i;
        this.f34555b = juuVar;
        this.f34554a = obj;
    }

    public /* synthetic */ jpm(jwf jwfVar, Object obj, int i) {
        this.f34556c = i;
        this.f34555b = jwfVar;
        this.f34554a = obj;
    }

    public jpm(jwf jwfVar, juu juuVar, int i) {
        this.f34556c = i;
        this.f34554a = jwfVar;
        this.f34555b = juuVar;
    }

    public /* synthetic */ jpm(jwf jwfVar, ofb ofbVar, int i, byte[] bArr) {
        this.f34556c = i;
        this.f34555b = jwfVar;
        this.f34554a = ofbVar;
    }

    public /* synthetic */ jpm(jwk jwkVar, mws mwsVar, int i) {
        this.f34556c = i;
        this.f34555b = jwkVar;
        this.f34554a = mwsVar;
    }

    public /* synthetic */ jpm(jzd jzdVar, MediaFormat mediaFormat, int i) {
        this.f34556c = i;
        this.f34554a = jzdVar;
        this.f34555b = mediaFormat;
    }

    public /* synthetic */ jpm(jzh jzhVar, jzf jzfVar, int i) {
        this.f34556c = i;
        this.f34554a = jzhVar;
        this.f34555b = jzfVar;
    }

    public /* synthetic */ jpm(jzo jzoVar, MediaCodec.BufferInfo bufferInfo, int i) {
        this.f34556c = i;
        this.f34554a = jzoVar;
        this.f34555b = bufferInfo;
    }

    public /* synthetic */ jpm(jzo jzoVar, kqa kqaVar, int i) {
        this.f34556c = i;
        this.f34555b = jzoVar;
        this.f34554a = kqaVar;
    }

    public /* synthetic */ jpm(kbg kbgVar, Object obj, int i) {
        this.f34556c = i;
        this.f34555b = kbgVar;
        this.f34554a = obj;
    }

    public /* synthetic */ jpm(kcj kcjVar, kdr kdrVar, int i) {
        this.f34556c = i;
        this.f34555b = kcjVar;
        this.f34554a = kdrVar;
    }

    public /* synthetic */ jpm(nps npsVar, Runnable runnable, int i) {
        this.f34556c = i;
        this.f34555b = npsVar;
        this.f34554a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, jpl] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kqa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jpl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, jpk] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jpi] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.f34556c) {
            case 0:
                try {
                    jpp jppVarM13566n = jvh.m13566n(null);
                    jppVarM13566n.mo13458k(jps.f34562b, this.f34555b);
                    jppVarM13566n.mo13457j(jps.f34562b, this.f34555b);
                    jppVarM13566n.mo13453f(jps.f34562b, this.f34555b);
                    return;
                } catch (CancellationException e) {
                    ((jpn) this.f34555b).mo13447b();
                    return;
                } catch (jpo e2) {
                    if (e2.getCause() instanceof Exception) {
                        ((jpn) this.f34555b).mo11475c((Exception) e2.getCause());
                        return;
                    } else {
                        ((jpn) this.f34555b).mo11475c(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((jpn) this.f34555b).mo11475c(e3);
                    return;
                }
            case 1:
                synchronized (((jph) this.f34555b).f34550a) {
                    ?? r1 = ((jph) this.f34555b).f34551b;
                    if (r1 != 0) {
                        r1.mo4011d(((jpp) this.f34554a).mo13450c());
                    }
                    break;
                }
                return;
            case 2:
                Object obj = this.f34554a;
                Object obj2 = this.f34555b;
                jtk jtkVar = (jtk) obj;
                String str = jtkVar.f34780d;
                String str2 = jtkVar.f34778b;
                byte[] bArr = jtkVar.f34779c;
                try {
                    Parcel parcelM3398a = ((cbq) obj2).m3398a();
                    int i = cbs.f4964a;
                    parcelM3398a.writeInt(0);
                    parcelM3398a.writeByteArray(null);
                    ((cbq) obj2).m3397A(1, parcelM3398a);
                    return;
                } catch (RemoteException e4) {
                    Log.e("WearableLS", "Failed to send a response back", e4);
                    return;
                }
            case 3:
                ((jrc) this.f34555b).f34631a.mo4518a((jtk) this.f34554a);
                return;
            case 4:
                ((jrs) this.f34554a).m13492a(((jrc) this.f34555b).f34631a);
                ((jrs) this.f34554a).m13492a(((jrc) this.f34555b).f34631a.f34637e);
                return;
            case 5:
                ((juu) this.f34555b).f34862a.mo3415bf(this.f34554a);
                return;
            case 6:
                ?? r0 = this.f34555b;
                ?? r2 = this.f34554a;
                if (((Boolean) kxk.m14974T(r0)).booleanValue()) {
                    return;
                }
                r2.run();
                return;
            case 7:
                Object obj3 = this.f34555b;
                Object obj4 = this.f34554a;
                jxa jxaVar = (jxa) obj3;
                ((jwf) obj3).mo13622c(Long.valueOf(((Long) (jxaVar.f34979e != null ? jxaVar.f34979e : ((jwf) obj3).f34942d)).longValue() + ((ofb) obj4).f45827a));
                return;
            case 8:
                ((jwf) this.f34555b).mo13622c(this.f34554a);
                return;
            case 9:
                ((juu) this.f34555b).mo3415bf(((jwf) this.f34554a).f34942d);
                return;
            case 10:
                this.f34555b.mo3415bf(this.f34554a);
                return;
            case 11:
                ((jwk) this.f34555b).f34952a.f34956c.mo3415bf(this.f34554a);
                return;
            case 12:
                this.f34555b.mo3415bf(this.f34554a);
                return;
            case 13:
                this.f34555b.mo3415bf(this.f34554a);
                return;
            case 14:
                Object obj5 = this.f34554a;
                Object obj6 = this.f34555b;
                String.valueOf(obj6);
                jzd jzdVar = (jzd) obj5;
                jzdVar.f35249k.mo13721b((MediaFormat) obj6);
                jzdVar.f35249k.mo13730k();
                return;
            case 15:
                ((jzg) ((jzh) this.f34554a).f35282d.mo16809c()).mo5259a((jzf) this.f34555b);
                return;
            case 16:
                Object obj7 = this.f34555b;
                ?? r3 = this.f34554a;
                try {
                    r3.mo14523g();
                    z = false;
                } catch (IllegalStateException e5) {
                    Log.e("MediaMuxerMul", "Failed to stop previous media muxer", e5);
                }
                try {
                    r3.mo14519c();
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e6) {
                    Log.e("MediaMuxerMul", "Failed to release previous media muxer", e6);
                }
                ((jzo) obj7).f35320d.m13792a(jzf.MUXER_STOP_ERROR);
                return;
            case 17:
                Object obj8 = this.f34554a;
                Object obj9 = this.f34555b;
                Iterator it = Collections.unmodifiableCollection(((jzo) obj8).f35317a).iterator();
                while (it.hasNext()) {
                    MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj9;
                    ((jyt) it.next()).mo5353i(bufferInfo.presentationTimeUs, bufferInfo.size);
                }
                return;
            case 18:
                Object obj10 = this.f34555b;
                Object obj11 = this.f34554a;
                if (obj10 == null) {
                    throw new kbp((Throwable) obj11);
                }
                throw new kbp((String) obj10, (Throwable) obj11);
            case 19:
                Object obj12 = this.f34555b;
                Object obj13 = this.f34554a;
                kcj kcjVar = (kcj) obj12;
                kcjVar.f35570b.add(obj13);
                ((kdr) obj13).m14003a(kcjVar.f35571c);
                return;
            default:
                ((kcj) this.f34555b).f35570b.remove(this.f34554a);
                return;
        }
    }
}
