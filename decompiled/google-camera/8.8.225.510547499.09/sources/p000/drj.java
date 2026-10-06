package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drj {

    /* JADX INFO: renamed from: f */
    public static byte[] f12392f;

    /* JADX INFO: renamed from: g */
    public static float[] f12393g;

    /* JADX INFO: renamed from: h */
    public static float[] f12394h;

    /* JADX INFO: renamed from: a */
    public final Object f12395a;

    /* JADX INFO: renamed from: b */
    public final Object f12396b;

    /* JADX INFO: renamed from: c */
    public final Object f12397c;

    /* JADX INFO: renamed from: d */
    public final Object f12398d;

    /* JADX INFO: renamed from: e */
    public final Object f12399e;

    public drj() {
        this.f12398d = new jwf(false);
        this.f12397c = new jwf(0);
        Float fValueOf = Float.valueOf(-1.0f);
        this.f12396b = new jwf(fValueOf);
        this.f12395a = new jwf(fValueOf);
        this.f12399e = new jwf(false);
    }

    public drj(Context context, har harVar, djm djmVar, dhv dhvVar, fmz fmzVar, byte[] bArr, byte[] bArr2) {
        this.f12396b = context;
        this.f12399e = harVar;
        this.f12398d = djmVar;
        this.f12397c = dhvVar;
        this.f12395a = fmzVar;
    }

    public drj(SharedPreferences sharedPreferences, hah hahVar, jww jwwVar, jww jwwVar2, jww jwwVar3) {
        this.f12398d = sharedPreferences;
        this.f12397c = hahVar;
        this.f12399e = jwwVar;
        this.f12395a = jwwVar2;
        this.f12396b = jwwVar3;
    }

    public drj(Drawable.Callback callback) {
        this.f12399e = new biz();
        this.f12395a = new HashMap();
        this.f12396b = new HashMap();
        this.f12397c = ".ttf";
        if (callback instanceof View) {
            this.f12398d = ((View) callback).getContext().getAssets();
        } else {
            blx.m2680a("LottieDrawable must be inside of a view for images to work.");
            this.f12398d = null;
        }
    }

    public drj(View view, String str, asf asfVar, asz aszVar, asq asqVar) {
        this.f12398d = view;
        this.f12395a = str;
        this.f12397c = asqVar;
        this.f12396b = aszVar;
        this.f12399e = asfVar;
    }

    public drj(InterleavedImageU8 interleavedImageU8, drn drnVar, InterleavedImageU8 interleavedImageU9, hjy hjyVar, ShotMetadata shotMetadata) {
        this.f12395a = interleavedImageU8;
        this.f12396b = drnVar;
        this.f12397c = interleavedImageU9;
        this.f12398d = hjyVar;
        this.f12399e = shotMetadata;
    }

    public drj(dbr dbrVar, dnn dnnVar, dhv dhvVar, kms kmsVar, WindowManager windowManager) {
        this.f12398d = dbrVar;
        this.f12397c = dnnVar;
        this.f12396b = dhvVar;
        this.f12395a = kmsVar;
        this.f12399e = windowManager;
    }

    public drj(dhv dhvVar, kmd kmdVar, imu imuVar, end endVar, oju ojuVar, gdz gdzVar) {
        this.f12398d = kmdVar;
        this.f12397c = endVar;
        this.f12399e = ojuVar;
        this.f12396b = gdzVar;
        this.f12395a = (kmdVar.mo14544M() && kmdVar.mo14535D() && dhvVar.mo6184l(dib.f11273ag)) ? mrm.m16829i(imuVar.m11493h().mo14556i()) : mqu.f41450a;
    }

    public drj(hln hlnVar, mrm mrmVar, hjy hjyVar, byte[] bArr, gyj gyjVar) {
        this.f12397c = hlnVar;
        this.f12398d = mrmVar;
        this.f12399e = hjyVar;
        this.f12396b = bArr;
        this.f12395a = gyjVar;
    }

    public drj(jpd jpdVar, int i, int i2, goy goyVar, jay jayVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12399e = new ihk(jpdVar, i, i2, null, null, null);
        int i3 = i * i2;
        f12392f = new byte[i3];
        f12393g = new float[9];
        f12394h = new float[576];
        this.f12397c = goyVar;
        this.f12398d = jayVar;
        this.f12395a = ByteBuffer.allocateDirect(i3 * 3);
        this.f12396b = jpdVar;
    }

    public drj(jww jwwVar, jww jwwVar2, har harVar, djm djmVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12398d = jwwVar;
        this.f12397c = jwwVar2;
        this.f12395a = harVar;
        this.f12399e = djmVar;
        this.f12396b = hahVar;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, oqs] */
    public drj(lha lhaVar, C1039ui c1039ui, drj drjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        lhaVar.getClass();
        drjVar.getClass();
        this.f12397c = lhaVar;
        this.f12398d = c1039ui;
        this.f12396b = drjVar;
        this.f12395a = ooc.m18752r(8, 0, 6);
        this.f12399e = new LinkedHashSet();
        ooc.m18746l(drjVar.f12395a, new oqr("CXCP-VirtualCameraManager"), new C1043um(this, null, null, null, null), 2);
    }

    public drj(mrm mrmVar, bkn bknVar, fgy fgyVar, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12395a = new HashMap();
        this.f12397c = mrmVar;
        this.f12399e = bkoVar;
        this.f12396b = bknVar;
        this.f12398d = fgyVar;
    }

    public drj(ohb ohbVar, gva gvaVar, nsz nszVar, nta ntaVar, kbz kbzVar, byte[] bArr) {
        this.f12396b = ohbVar;
        this.f12395a = gvaVar;
        this.f12397c = nszVar;
        this.f12398d = ntaVar;
        this.f12399e = kbzVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final jxp m6621a(kmq kmqVar) {
        dhx dhxVar = kmqVar == kmq.f36557a ? dhh.f11093f : dhh.f11094g;
        mrm mrmVarM16828h = mrm.m16828h((Integer) this.f12397c.mo6173a(dhxVar).orElse(null));
        if (!mrmVarM16828h.mo16813g()) {
            if (!((djm) this.f12398d).m6238m((Context) this.f12396b, kmqVar) || ((gzr) ((jxd) this.f12399e).mo3831be()).equals(gzr.RES_1080P) || ((fmz) this.f12395a).m8598b()) {
                return ((fmz) this.f12395a).m8598b() ? jxp.RES_1080P_3X4 : jxp.RES_1080P;
            }
            return ((fmz) this.f12395a).m8598b() ? jxp.RES_2160P_3X4 : jxp.RES_2160P;
        }
        switch (((Integer) mrmVarM16828h.mo16809c()).intValue()) {
            case 144:
                return jxp.RES_QCIF;
            case 240:
                return jxp.RES_QVGA;
            case 288:
                return jxp.RES_CIF;
            case 480:
                return jxp.RES_480P;
            case 720:
                return jxp.RES_720P;
            case 1080:
                return jxp.RES_1080P;
            case 2160:
                return jxp.RES_2160P;
            case 108034:
                return jxp.RES_1080P_3X4;
            case 216034:
                return jxp.RES_2160P_3X4;
            default:
                throw new IllegalArgumentException("Value " + mrmVarM16828h.mo16809c().toString() + " for ADB flag " + dhxVar.f11210a + " not supported.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ojy] */
    /* JADX INFO: renamed from: b */
    public final Handler m6622b() {
        return (Handler) this.f12397c.mo18586a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ojy] */
    /* JADX INFO: renamed from: c */
    public final Executor m6623c() {
        return (Executor) this.f12398d.mo18586a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, ouh] */
    /* JADX INFO: renamed from: d */
    public final Object m6624d(String str, InterfaceC1082vy interfaceC1082vy, oqs oqsVar, ols olsVar) {
        C1047uq c1047uq;
        drj drjVar;
        if (olsVar instanceof C1047uq) {
            c1047uq = (C1047uq) olsVar;
            int i = c1047uq.f47763b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1047uq.f47763b = i - Integer.MIN_VALUE;
            } else {
                c1047uq = new C1047uq(this, olsVar, null, null, null);
            }
        } else {
            c1047uq = new C1047uq(this, olsVar, null, null, null);
        }
        Object objM19456a = c1047uq.f47762a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        int i2 = 1;
        switch (c1047uq.f47763b) {
            case 0:
                lkm.m15592s(objM19456a);
                if (!((lha) this.f12397c).m15330b()) {
                    throw new IllegalStateException("Missing camera permissions!");
                }
                Object obj = this.f12398d;
                c1047uq.f47766e = this;
                c1047uq.f47764c = oqsVar;
                c1047uq.f47763b = 1;
                objM19456a = ((C1039ui) obj).m19456a(str, interfaceC1082vy, c1047uq);
                if (objM19456a == omaVar) {
                    return omaVar;
                }
                drjVar = this;
                break;
                break;
            case 1:
                oqsVar = c1047uq.f47764c;
                drjVar = c1047uq.f47766e;
                lkm.m15592s(objM19456a);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1033uc c1033uc = (C1033uc) objM19456a;
        C0986sj c0986sj = c1033uc.f47723a;
        AmbientDelegate ambientDelegate = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (c0986sj == null) {
            return new C1046up(ambientDelegate, c1033uc.f47724b, i2, objArr3 == true ? 1 : 0);
        }
        return new C1046up(new AmbientDelegate(c0986sj, oqsVar, (ouh) drjVar.f12395a), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, otq] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, otq] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, otq] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:27:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m6625e(java.util.List r9, p000.ols r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000.C1048ur
            if (r0 == 0) goto L13
            r0 = r10
            ur r0 = (p000.C1048ur) r0
            int r1 = r0.f47768b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47768b = r1
            goto L1e
        L13:
            ur r0 = new ur
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r0
            r3 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L1e:
            java.lang.Object r10 = r0.f47767a
            oma r1 = p000.oma.COROUTINE_SUSPENDED
            int r2 = r0.f47768b
            switch(r2) {
                case 0: goto L43;
                case 1: goto L39;
                case 2: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            java.util.ArrayList r9 = r0.f47770d
            java.util.ArrayList r2 = r0.f47769c
            drj r3 = r0.f47772f
            p000.lkm.m15592s(r10)
            goto L86
        L39:
            java.util.ArrayList r9 = r0.f47770d
            java.util.ArrayList r2 = r0.f47769c
            drj r3 = r0.f47772f
            p000.lkm.m15592s(r10)
            goto L62
        L43:
            p000.lkm.m15592s(r10)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L68
            java.lang.Object r10 = r8.f12395a
            r0.f47772f = r8
            r2 = r9
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.f47769c = r2
            r0.f47770d = r2
            r2 = 1
            r0.f47768b = r2
            java.lang.Object r10 = r10.mo19037b(r0)
            if (r10 == r1) goto L67
            r3 = r8
            r2 = r9
        L62:
            r9.add(r10)
            r9 = r2
            goto L69
        L67:
            return r1
        L68:
            r3 = r8
        L69:
            java.lang.Object r10 = r3.f12395a
            boolean r10 = r10.mo19046k()
            if (r10 != 0) goto L8c
            java.lang.Object r10 = r3.f12395a
            r0.f47772f = r3
            r2 = r9
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.f47769c = r2
            r0.f47770d = r2
            r2 = 2
            r0.f47768b = r2
            java.lang.Object r10 = r10.mo19037b(r0)
            if (r10 == r1) goto L8b
            r2 = r9
        L86:
            r9.add(r10)
            r9 = r2
            goto L69
        L8b:
            return r1
        L8c:
            oki r9 = p000.oki.f46196a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.drj.m6625e(java.util.List, ols):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: f */
    public final void m6626f() {
        this.f12397c.mo3415bf(0);
        ?? r0 = this.f12396b;
        Float fValueOf = Float.valueOf(-1.0f);
        r0.mo3415bf(fValueOf);
        this.f12395a.mo3415bf(fValueOf);
        this.f12398d.mo3415bf(false);
        this.f12399e.mo3415bf(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: g */
    public final synchronized fku m6627g(final long j, final gyu gyuVar) {
        fku fkuVar;
        ?? r0 = this.f12395a;
        Long lValueOf = Long.valueOf(j);
        lku.m15614I(!r0.containsKey(lValueOf), "Current session exists; didn't clear last one?");
        lku.m15614I(((mrm) this.f12397c).mo16813g(), "Trying to create a tone map session with no microvideo API");
        een eenVarM2622p = ((bko) this.f12399e).m2622p(gyuVar);
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        fkuVar = new fku(this, new kba(j, gyuVar, bArr, bArr2, bArr3) { // from class: fkt

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f22407a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gyu f22408b;

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                drj drjVar = this.f22409c;
                long j2 = this.f22407a;
                gyu gyuVar2 = this.f22408b;
                ?? r4 = drjVar.f12395a;
                Long lValueOf2 = Long.valueOf(j2);
                lku.m15613H(r4.containsKey(lValueOf2));
                ((bko) drjVar.f12399e).m2623q(gyuVar2);
                drjVar.f12395a.remove(lValueOf2);
            }
        }, null, null, null);
        eenVarM2622p.m7221a(fkuVar);
        eenVarM2622p.m7223c(fkuVar);
        eenVarM2622p.m7226f(fkuVar);
        this.f12395a.put(lValueOf, fkuVar);
        return fkuVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ohb] */
    /* JADX INFO: renamed from: h */
    public final ntv m6628h(key keyVar) {
        this.f12399e.mo13961e("createHdrPlusFrame");
        try {
            kpp kppVarMo7042c = keyVar.mo7042c();
            FrameMetadata frameMetadata = new FrameMetadata();
            SpatialGainMap spatialGainMap = new SpatialGainMap();
            gmc gmcVarM9784a = ((gva) this.f12395a).m9784a(keyVar);
            kpw kpwVarM9496e = gmcVarM9784a.m9496e();
            if (kpwVarM9496e != null && kpwVarM9496e.mo7247c() > 0 && kpwVarM9496e.mo7246b() > 0) {
                RawWriteView rawWriteViewM17649b = ((nsz) this.f12397c).m17649b(kpwVarM9496e);
                if (kppVarMo7042c != null) {
                    frameMetadata = ((ecq) this.f12396b.get()).mo7141h(kppVarMo7042c, ((ecq) this.f12396b.get()).mo7142i(kppVarMo7042c), gmcVarM9784a.m9492a().mo14193c());
                    if (frameMetadata.m4953c() <= 0) {
                        kpwVarM9496e.close();
                    } else {
                        spatialGainMap = ((nta) this.f12398d).m17686o(kppVarMo7042c);
                    }
                }
                return ntv.m17691a(rawWriteViewM17649b, frameMetadata, spatialGainMap, new elu(kpwVarM9496e, 19));
            }
            if (kpwVarM9496e != null) {
                kpwVarM9496e.close();
            }
            return null;
        } finally {
            keyVar.close();
            this.f12399e.mo13962f();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m6629i() {
        return ((opl) this.f12399e).f46391b - ((opl) this.f12396b).f46391b;
    }

    /* JADX INFO: renamed from: j */
    public final oyn m6630j() {
        oyn oynVar = (oyn) ((opn) this.f12395a).m18853a(null);
        return oynVar == null ? m6631k() : oynVar;
    }

    /* JADX INFO: renamed from: k */
    public final oyn m6631k() {
        oyn oynVar;
        while (true) {
            int i = ((opl) this.f12396b).f46391b;
            if (i - ((opl) this.f12399e).f46391b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((opl) this.f12396b).m18847c(i, i + 1) && (oynVar = (oyn) ((AtomicReferenceArray) this.f12397c).getAndSet(i2, null)) != null) {
                if (oynVar.f46845h.f46847a == 1) {
                    ((opl) this.f12398d).m18848d();
                    boolean z = oqu.f46432a;
                }
                return oynVar;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final oyn m6632l(oyn oynVar) {
        oyn oynVar2 = (oyn) ((opn) this.f12395a).m18853a(oynVar);
        if (oynVar2 == null) {
            return null;
        }
        if (oynVar2.f46845h.f46847a == 1) {
            ((opl) this.f12398d).m18846b();
        }
        if (m6629i() == 127) {
            return oynVar2;
        }
        int i = ((opl) this.f12399e).f46391b & 127;
        while (((AtomicReferenceArray) this.f12397c).get(i) != null) {
            Thread.yield();
        }
        ((AtomicReferenceArray) this.f12397c).lazySet(i, oynVar2);
        ((opl) this.f12399e).m18846b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ksi] */
    /* JADX INFO: renamed from: m */
    public final Object m6633m(mcf mcfVar, String str, ols olsVar) {
        mcm mcmVar;
        drj drjVar;
        mcf mcfVar2;
        lxm lxmVar;
        mcf mcfVarM16308a;
        Object obj;
        oer oerVar;
        if (olsVar instanceof mcm) {
            mcm mcmVar2 = (mcm) olsVar;
            int i = mcmVar2.f39957c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcmVar2.f39957c = i - Integer.MIN_VALUE;
                mcmVar = mcmVar2;
            } else {
                mcmVar = new mcm(this, olsVar, null, null);
            }
        } else {
            mcmVar = new mcm(this, olsVar, null, null);
        }
        Object objM16230h = mcmVar.f39956b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mcmVar.f39957c) {
            case 0:
                lkm.m15592s(objM16230h);
                lzb lzbVar = mcfVar.f39935a;
                lxm lxmVar2 = mcfVar.f39936b;
                mcg mcgVar = new mcg(lzbVar, lxmVar2, lxmVar2.f39516f);
                lxm lxmVarM16117a = lxm.m16117a(lxmVar2, null, str, lxv.m16126a(lxmVar2.f39520j, null, lle.m15687g(this.f12398d), null, lwh.UPLOADED_TO_F250, 1.0d, 11), 1407);
                Object obj2 = this.f12396b;
                mcn mcnVar = new mcn(this, lzbVar, lxmVarM16117a, mcgVar, null, null, null);
                mcmVar.f39955a = this;
                mcmVar.f39958d = mcfVar;
                mcmVar.f39959e = lxmVarM16117a;
                mcmVar.f39957c = 1;
                objM16230h = lzd.m16230h((mav) obj2, mcfVar, mcnVar, mcmVar);
                if (objM16230h != omaVar) {
                    drjVar = this;
                    mcfVar2 = mcfVar;
                    lxmVar = lxmVarM16117a;
                    mcfVarM16308a = mcf.m16308a(mcfVar2, (lzb) objM16230h, lxmVar, 4);
                    obj = drjVar.f12396b;
                    oerVar = oer.SUCCESS_PARTIAL_UPLOAD_ATTACHMENT;
                    mcmVar.f39955a = mcfVarM16308a;
                    mcmVar.f39958d = null;
                    mcmVar.f39959e = null;
                    mcmVar.f39957c = 2;
                    if (lzd.m16229g((mav) obj, mcfVarM16308a, oerVar, null, mcmVar) != omaVar) {
                        return mcfVarM16308a;
                    }
                }
                return omaVar;
            case 1:
                lxmVar = mcmVar.f39959e;
                mcfVar2 = mcmVar.f39958d;
                drjVar = (drj) mcmVar.f39955a;
                lkm.m15592s(objM16230h);
                mcfVarM16308a = mcf.m16308a(mcfVar2, (lzb) objM16230h, lxmVar, 4);
                obj = drjVar.f12396b;
                oerVar = oer.SUCCESS_PARTIAL_UPLOAD_ATTACHMENT;
                mcmVar.f39955a = mcfVarM16308a;
                mcmVar.f39958d = null;
                mcmVar.f39959e = null;
                mcmVar.f39957c = 2;
                if (lzd.m16229g((mav) obj, mcfVarM16308a, oerVar, null, mcmVar) != omaVar) {
                    return mcfVarM16308a;
                }
                return omaVar;
            case 2:
                mcf mcfVar3 = (mcf) mcmVar.f39955a;
                lkm.m15592s(objM16230h);
                return mcfVar3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m6634n(mcf mcfVar, ols olsVar) {
        mco mcoVar;
        IllegalStateException illegalStateException;
        drj drjVar;
        if (olsVar instanceof mco) {
            mcoVar = (mco) olsVar;
            int i = mcoVar.f39968c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcoVar.f39968c = i - Integer.MIN_VALUE;
            } else {
                mcoVar = new mco(this, olsVar, null, null);
            }
        } else {
            mcoVar = new mco(this, olsVar, null, null);
        }
        Object obj = mcoVar.f39967b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mcoVar.f39968c) {
            case 0:
                lkm.m15592s(obj);
                illegalStateException = new IllegalStateException("UploadResourceComplete for attachment");
                Object obj2 = this.f12396b;
                oer oerVar = oer.ERROR_UPLOAD_SERVER_FAILURE;
                mcoVar.f39966a = this;
                mcoVar.f39969d = mcfVar;
                mcoVar.f39970e = illegalStateException;
                mcoVar.f39968c = 1;
                if (lzd.m16229g((mav) obj2, mcfVar, oerVar, illegalStateException, mcoVar) == omaVar) {
                    return omaVar;
                }
                drjVar = this;
                break;
                break;
            case 1:
                IllegalStateException illegalStateException2 = mcoVar.f39970e;
                mcf mcfVar2 = mcoVar.f39969d;
                drj drjVar2 = (drj) mcoVar.f39966a;
                lkm.m15592s(obj);
                illegalStateException = illegalStateException2;
                mcfVar = mcfVar2;
                drjVar = drjVar2;
                break;
            case 2:
                IllegalStateException illegalStateException3 = (IllegalStateException) mcoVar.f39966a;
                lkm.m15592s(obj);
                throw illegalStateException3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj3 = drjVar.f12396b;
        mcp mcpVar = new mcp(drjVar, mcfVar, null, null, null);
        mcoVar.f39966a = illegalStateException;
        mcoVar.f39969d = null;
        mcoVar.f39970e = null;
        mcoVar.f39968c = 2;
        if (lzd.m16230h((mav) obj3, mcfVar, mcpVar, mcoVar) == omaVar) {
            return omaVar;
        }
        throw illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: o */
    public final Object m6635o(mcf mcfVar, mec mecVar, ols olsVar) throws Throwable {
        mcq mcqVar;
        oer oerVar;
        Throwable th;
        drj drjVar;
        lxm lxmVar;
        lzb lzbVar;
        Object obj;
        mcs mcsVar;
        Object obj2;
        mcr mcrVar;
        Object obj3;
        mct mctVar;
        Object obj4;
        mcf mcfVar2 = mcfVar;
        if (olsVar instanceof mcq) {
            mcqVar = (mcq) olsVar;
            int i = mcqVar.f39977c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcqVar.f39977c = i - Integer.MIN_VALUE;
            } else {
                mcqVar = new mcq(this, olsVar, null, null);
            }
        } else {
            mcqVar = new mcq(this, olsVar, null, null);
        }
        Object obj5 = mcqVar.f39976b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mcqVar.f39977c) {
            case 0:
                lkm.m15592s(obj5);
                lzb lzbVar2 = mcfVar2.f39935a;
                lxm lxmVar2 = mcfVar2.f39936b;
                oerVar = mecVar.f40165a;
                th = mecVar.f40166b;
                Object obj6 = this.f12396b;
                mcqVar.f39975a = this;
                mcqVar.f39978d = mcfVar2;
                mcqVar.f39979e = lzbVar2;
                mcqVar.f39980f = lxmVar2;
                mcqVar.f39981g = oerVar;
                mcqVar.f39982h = (oeq) th;
                mcqVar.f39977c = 1;
                if (lzd.m16229g((mav) obj6, mcfVar2, oerVar, th, mcqVar) == omaVar) {
                    return omaVar;
                }
                drjVar = this;
                lxmVar = lxmVar2;
                lzbVar = lzbVar2;
                oer oerVar2 = oer.UNKNOWN_F250_LOG_REASON;
                switch (oerVar.ordinal()) {
                    case 24:
                        obj = drjVar.f12396b;
                        mcsVar = new mcs(drjVar, lzbVar, lxmVar, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 3;
                        if (lzd.m16230h((mav) obj, mcfVar2, mcsVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    case 25:
                    case 26:
                        lxm lxmVarM16117a = lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, null, lwh.UPLOAD_PENDING, 0.0d, 15), 1471);
                        mcg mcgVar = new mcg(lzbVar, lxmVar, 0L);
                        obj2 = drjVar.f12396b;
                        mcrVar = new mcr(drjVar, lzbVar, lxmVarM16117a, mcgVar, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 2;
                        if (lzd.m16230h((mav) obj2, mcfVar2, mcrVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    default:
                        obj3 = drjVar.f12396b;
                        mctVar = new mct(drjVar, lzbVar, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 4;
                        if (lzd.m16230h((mav) obj3, mcfVar2, mctVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                }
                throw th;
            case 1:
                oeq oeqVar = mcqVar.f39982h;
                oer oerVar3 = mcqVar.f39981g;
                lxm lxmVar3 = mcqVar.f39980f;
                lzb lzbVar3 = mcqVar.f39979e;
                mcf mcfVar3 = mcqVar.f39978d;
                drj drjVar2 = (drj) mcqVar.f39975a;
                lkm.m15592s(obj5);
                oerVar = oerVar3;
                lzbVar = lzbVar3;
                drjVar = drjVar2;
                th = oeqVar;
                lxmVar = lxmVar3;
                mcfVar2 = mcfVar3;
                oer oerVar4 = oer.UNKNOWN_F250_LOG_REASON;
                switch (oerVar.ordinal()) {
                    case 24:
                        obj = drjVar.f12396b;
                        mcsVar = new mcs(drjVar, lzbVar, lxmVar, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 3;
                        if (lzd.m16230h((mav) obj, mcfVar2, mcsVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    case 25:
                    case 26:
                        lxm lxmVarM16117a2 = lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, null, lwh.UPLOAD_PENDING, 0.0d, 15), 1471);
                        mcg mcgVar2 = new mcg(lzbVar, lxmVar, 0L);
                        obj2 = drjVar.f12396b;
                        mcrVar = new mcr(drjVar, lzbVar, lxmVarM16117a2, mcgVar2, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 2;
                        if (lzd.m16230h((mav) obj2, mcfVar2, mcrVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    default:
                        obj3 = drjVar.f12396b;
                        mctVar = new mct(drjVar, lzbVar, null, null, null);
                        mcqVar.f39975a = th;
                        mcqVar.f39978d = null;
                        mcqVar.f39979e = null;
                        mcqVar.f39980f = null;
                        mcqVar.f39981g = null;
                        mcqVar.f39982h = null;
                        mcqVar.f39977c = 4;
                        if (lzd.m16230h((mav) obj3, mcfVar2, mctVar, mcqVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                }
                throw th;
            case 2:
            case 4:
                obj4 = mcqVar.f39975a;
                Throwable th2 = (Throwable) obj4;
                lkm.m15592s(obj5);
                throw th2;
            case 3:
                obj4 = mcqVar.f39975a;
                Throwable th3 = (Throwable) obj4;
                lkm.m15592s(obj5);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m6636p(mcf mcfVar, String str, ols olsVar) {
        mcu mcuVar;
        lxm lxmVarM16117a;
        if (olsVar instanceof mcu) {
            mcuVar = (mcu) olsVar;
            int i = mcuVar.f39997b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcuVar.f39997b = i - Integer.MIN_VALUE;
            } else {
                mcuVar = new mcu(this, olsVar, null, null);
            }
        } else {
            mcuVar = new mcu(this, olsVar, null, null);
        }
        Object obj = mcuVar.f39996a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mcuVar.f39997b) {
            case 0:
                lkm.m15592s(obj);
                if (ooc.m18737c(str, mcfVar.f39936b.f39517g)) {
                    return mcfVar;
                }
                lxmVarM16117a = lxm.m16117a(mcfVar.f39936b, str, null, null, 1983);
                Object obj2 = this.f12396b;
                mcv mcvVar = new mcv(this, lxmVarM16117a, null, null, null);
                mcuVar.f39998c = mcfVar;
                mcuVar.f39999d = lxmVarM16117a;
                mcuVar.f39997b = 1;
                if (lzd.m16230h((mav) obj2, mcfVar, mcvVar, mcuVar) == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                lxm lxmVar = mcuVar.f39999d;
                mcf mcfVar2 = mcuVar.f39998c;
                lkm.m15592s(obj);
                lxmVarM16117a = lxmVar;
                mcfVar = mcfVar2;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return mcf.m16308a(mcfVar, null, lxmVarM16117a, 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: q */
    public final Object m6637q(mcf mcfVar, long j, ols olsVar) {
        mcw mcwVar;
        mcf mcfVar2;
        lxm lxmVar;
        if (olsVar instanceof mcw) {
            mcw mcwVar2 = (mcw) olsVar;
            int i = mcwVar2.f40005b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcwVar2.f40005b = i - Integer.MIN_VALUE;
                mcwVar = mcwVar2;
            } else {
                mcwVar = new mcw(this, olsVar, null, null);
            }
        } else {
            mcwVar = new mcw(this, olsVar, null, null);
        }
        Object objM16230h = mcwVar.f40004a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mcwVar.f40005b) {
            case 0:
                lkm.m15592s(objM16230h);
                lzb lzbVar = mcfVar.f39935a;
                lxm lxmVar2 = mcfVar.f39936b;
                mcg mcgVar = new mcg(lzbVar, lxmVar2, j);
                lxm lxmVarM16117a = lxm.m16117a(lxmVar2, null, null, lxv.m16126a(lxmVar2.f39520j, null, null, null, null, mcgVar.f39938a, 31), 1535);
                Object obj = this.f12396b;
                mcx mcxVar = new mcx(this, lzbVar, lxmVarM16117a, mcgVar, null, null, null);
                mcwVar.f40006c = mcfVar;
                mcwVar.f40007d = lxmVarM16117a;
                mcwVar.f40005b = 1;
                objM16230h = lzd.m16230h((mav) obj, mcfVar, mcxVar, mcwVar);
                if (objM16230h == omaVar) {
                    return omaVar;
                }
                mcfVar2 = mcfVar;
                lxmVar = lxmVarM16117a;
                break;
                break;
            case 1:
                lxmVar = mcwVar.f40007d;
                mcfVar2 = mcwVar.f40006c;
                lkm.m15592s(objM16230h);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return mcf.m16308a(mcfVar2, (lzb) objM16230h, lxmVar, 4);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: r */
    public final Object m6638r(mau mauVar, lzb lzbVar, lxm lxmVar, ols olsVar) throws Throwable {
        mda mdaVar;
        Object obj;
        oer oerVar;
        List listM18666F;
        List listM18668H;
        mau mauVar2;
        mau mauVar3;
        drj drjVar;
        lxm lxmVar2;
        lzb lzbVar2;
        lvo lvoVarM16280a;
        our ourVarM16244i;
        ooi ooiVar;
        mcz mczVar;
        ooi ooiVar2;
        if (olsVar instanceof mda) {
            mdaVar = (mda) olsVar;
            int i = mdaVar.f40030c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdaVar.f40030c = i - Integer.MIN_VALUE;
            } else {
                mdaVar = new mda(this, olsVar, null, null);
            }
        } else {
            mdaVar = new mda(this, olsVar, null, null);
        }
        Object obj2 = mdaVar.f40029b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdaVar.f40030c) {
            case 0:
                lkm.m15592s(obj2);
                lxm lxmVarM16117a = lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, null, lwh.UPLOAD_IN_PROGRESS, 0.0d, 47), 1535);
                obj = this.f12396b;
                oerVar = oer.ERROR_UPDATE;
                listM18666F = omn.m18666F(lxmVar);
                listM18668H = omn.m18668H(lzbVar);
                try {
                    Object obj3 = this.f12395a;
                    mdaVar.f40028a = this;
                    mauVar2 = mauVar;
                    try {
                        mdaVar.f40031d = mauVar2;
                        mdaVar.f40032e = lzbVar;
                        mdaVar.f40033f = lxmVarM16117a;
                        mdaVar.f40034g = oerVar;
                        mdaVar.f40035h = listM18666F;
                        mdaVar.f40036i = (mav) obj;
                        mdaVar.f40037j = listM18668H;
                        mdaVar.f40030c = 1;
                        if (((lzv) obj3).mo16260g(lxmVarM16117a, mdaVar) != omaVar) {
                            drjVar = this;
                            lxmVar2 = lxmVarM16117a;
                            mauVar3 = mauVar2;
                            lzbVar2 = lzbVar;
                            File fileM1646s = ((AmbientMode.AmbientController) drjVar.f12397c).m1646s(lxmVar2);
                            mcf mcfVar = new mcf(lzbVar2, lxmVar2, mauVar3);
                            Object obj4 = drjVar.f12399e;
                            lzd lzdVar = (lzd) obj4;
                            ourVarM16244i = lzdVar.m16244i(new oei(fileM1646s), lxmVar2.f39517g, "https://mobile-vision-f250-uploads.googleapis.com/upload/blob");
                            ooiVar = new ooi();
                            ooiVar.f46351a = mcfVar;
                            mczVar = new mcz(ooiVar, drjVar, 0, null, null);
                            mdaVar.f40028a = ooiVar;
                            mdaVar.f40031d = null;
                            mdaVar.f40032e = null;
                            mdaVar.f40033f = null;
                            mdaVar.f40034g = null;
                            mdaVar.f40035h = null;
                            mdaVar.f40036i = null;
                            mdaVar.f40037j = null;
                            mdaVar.f40030c = 3;
                            if (owg.m19113d((owg) ourVarM16244i, mczVar, mdaVar) != omaVar) {
                                ooiVar2 = ooiVar;
                                return ((mcf) ooiVar2.f46351a).f39936b;
                            }
                        }
                        return omaVar;
                    } catch (Throwable th) {
                        th = th;
                        mauVar3 = mauVar2;
                        if (!(th instanceof CancellationException)) {
                            throw th;
                        }
                        lvoVarM16280a = mauVar3.m16280a(listM18668H, listM18666F, oerVar, th);
                        mdaVar.f40028a = th;
                        mdaVar.f40031d = null;
                        mdaVar.f40032e = null;
                        mdaVar.f40033f = null;
                        mdaVar.f40034g = null;
                        mdaVar.f40035h = null;
                        mdaVar.f40036i = null;
                        mdaVar.f40037j = null;
                        mdaVar.f40030c = 2;
                        if (((mav) obj).m16285a(lvoVarM16280a, mdaVar) == omaVar) {
                            return omaVar;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mauVar2 = mauVar;
                }
                break;
            case 1:
                listM18668H = mdaVar.f40037j;
                obj = mdaVar.f40036i;
                listM18666F = mdaVar.f40035h;
                oerVar = mdaVar.f40034g;
                lxmVar2 = mdaVar.f40033f;
                lzbVar2 = mdaVar.f40032e;
                mauVar3 = mdaVar.f40031d;
                drj drjVar2 = (drj) mdaVar.f40028a;
                try {
                    lkm.m15592s(obj2);
                    drjVar = drjVar2;
                    File fileM1646s2 = ((AmbientMode.AmbientController) drjVar.f12397c).m1646s(lxmVar2);
                    mcf mcfVar2 = new mcf(lzbVar2, lxmVar2, mauVar3);
                    Object obj5 = drjVar.f12399e;
                    lzd lzdVar2 = (lzd) obj5;
                    ourVarM16244i = lzdVar2.m16244i(new oei(fileM1646s2), lxmVar2.f39517g, "https://mobile-vision-f250-uploads.googleapis.com/upload/blob");
                    ooiVar = new ooi();
                    ooiVar.f46351a = mcfVar2;
                    mczVar = new mcz(ooiVar, drjVar, 0, null, null);
                    mdaVar.f40028a = ooiVar;
                    mdaVar.f40031d = null;
                    mdaVar.f40032e = null;
                    mdaVar.f40033f = null;
                    mdaVar.f40034g = null;
                    mdaVar.f40035h = null;
                    mdaVar.f40036i = null;
                    mdaVar.f40037j = null;
                    mdaVar.f40030c = 3;
                    if (owg.m19113d((owg) ourVarM16244i, mczVar, mdaVar) != omaVar) {
                        ooiVar2 = ooiVar;
                        return ((mcf) ooiVar2.f46351a).f39936b;
                    }
                    return omaVar;
                } catch (Throwable th3) {
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar3.m16280a(listM18668H, listM18666F, oerVar, th);
                    mdaVar.f40028a = th;
                    mdaVar.f40031d = null;
                    mdaVar.f40032e = null;
                    mdaVar.f40033f = null;
                    mdaVar.f40034g = null;
                    mdaVar.f40035h = null;
                    mdaVar.f40036i = null;
                    mdaVar.f40037j = null;
                    mdaVar.f40030c = 2;
                    if (((mav) obj).m16285a(lvoVarM16280a, mdaVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mdaVar.f40028a;
                lkm.m15592s(obj2);
                throw th4;
            case 3:
                ooiVar2 = (ooi) mdaVar.f40028a;
                lkm.m15592s(obj2);
                return ((mcf) ooiVar2.f46351a).f39936b;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r9v9, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: s */
    public final hmh m6639s(hmq hmqVar) {
        float f;
        long j = hmqVar.f28352b;
        long j2 = true != "full".equals(this.f12397c.mo3831be()) ? 2000000L : 3500000L;
        if (((Integer) this.f12396b.mo10031c(gzy.f27040ax)).intValue() != 0) {
            j2 += 4300000;
        }
        if (((Boolean) this.f12398d.mo3831be()).booleanValue()) {
            j2 += 13000000;
        }
        long j3 = j / j2;
        long j4 = hmqVar.f28352b;
        if (((jxd) this.f12395a).mo3831be() == gzr.RES_1080P) {
            gzm gzmVar = (gzm) ((djm) this.f12399e).f11787a.mo3831be();
            f = 22.0f;
            if (gzmVar != gzm.FPS_AUTO && gzmVar != gzm.FPS_30) {
                f = 33.0f;
            }
        } else {
            f = ((gzm) ((djm) this.f12399e).f11789c.mo3831be()) == gzm.FPS_60 ? 72.0f : 48.0f;
        }
        if (((Boolean) this.f12396b.mo10031c(gzy.f26990B)).booleanValue()) {
            f *= 0.9f;
        }
        int i = (int) j3;
        int i2 = (int) ((j4 / ((long) ((int) ((f * 1000000.0f) / 8.0f)))) / 60);
        return new hmh(i, i2, i < 50, i2 < 6);
    }

    /* JADX INFO: renamed from: t */
    public final long m6640t(drj drjVar, boolean z) {
        oyn oynVar;
        do {
            oynVar = (oyn) ((opn) drjVar.f12395a).f46397a;
            if (oynVar == null) {
                return -2L;
            }
            if (z && oynVar.f46845h.f46847a != 1) {
                return -2L;
            }
            long j = oyq.f46849a;
            long jNanoTime = System.nanoTime() - oynVar.f46844g;
            long j2 = oyq.f46849a;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
        } while (!((opn) drjVar.f12395a).m18856d(oynVar, null));
        m6632l(oynVar);
        return -1L;
    }

    public drj(View view) {
        this.f12398d = (ViewGroup) view.findViewById(C0100R.id.item_framelayout_inner);
        this.f12395a = (TextView) view.findViewById(C0100R.id.item_title);
        this.f12399e = (TextView) view.findViewById(C0100R.id.item_description);
        this.f12397c = (ImageView) view.findViewById(C0100R.id.item_button_icon);
        this.f12396b = (ImageView) view.findViewById(C0100R.id.item_button_icon_second);
    }

    public drj(jvb jvbVar, ecq ecqVar, jwn jwnVar, jww jwwVar, eby ebyVar, kbo kboVar) {
        this.f12398d = jvbVar;
        this.f12396b = ecqVar;
        this.f12395a = jwnVar;
        this.f12399e = jwwVar;
        this.f12397c = ebyVar;
        kboVar.mo6314a("HdrPFlashDecider");
        jvbVar.m13537d(new dev(jwwVar, 19));
    }

    public drj(oqs oqsVar, oqo oqoVar, oqo oqoVar2, omx omxVar, omx omxVar2) {
        this.f12395a = oqsVar;
        this.f12396b = oqoVar;
        this.f12399e = oqoVar2;
        this.f12397c = lkm.m15593t(new C0910po(omxVar, 3));
        this.f12398d = lkm.m15593t(new C0910po(omxVar2, 2));
    }

    public drj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, byte[] bArr) {
        this.f12398d = ojuVar;
        this.f12396b = ojuVar2;
        ojuVar3.getClass();
        this.f12399e = ojuVar3;
        ojuVar4.getClass();
        this.f12397c = ojuVar4;
        ojuVar5.getClass();
        this.f12395a = ojuVar5;
    }

    public drj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, char[] cArr) {
        ojuVar.getClass();
        this.f12399e = ojuVar;
        ojuVar2.getClass();
        this.f12395a = ojuVar2;
        ojuVar3.getClass();
        this.f12396b = ojuVar3;
        ojuVar4.getClass();
        this.f12398d = ojuVar4;
        ojuVar5.getClass();
        this.f12397c = ojuVar5;
    }

    public drj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        ojuVar.getClass();
        this.f12399e = ojuVar;
        ojuVar2.getClass();
        this.f12395a = ojuVar2;
        ojuVar3.getClass();
        this.f12396b = ojuVar3;
        ojuVar4.getClass();
        this.f12398d = ojuVar4;
        ojuVar5.getClass();
        this.f12397c = ojuVar5;
    }

    public drj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, short[] sArr) {
        ojuVar.getClass();
        this.f12397c = ojuVar;
        ojuVar2.getClass();
        this.f12396b = ojuVar2;
        ojuVar3.getClass();
        this.f12398d = ojuVar3;
        ojuVar4.getClass();
        this.f12399e = ojuVar4;
        ojuVar5.getClass();
        this.f12395a = ojuVar5;
    }

    public drj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        this.f12397c = ojuVar;
        ojuVar2.getClass();
        this.f12398d = ojuVar2;
        ojuVar3.getClass();
        this.f12395a = ojuVar3;
        ojuVar4.getClass();
        this.f12399e = ojuVar4;
        ojuVar5.getClass();
        this.f12396b = ojuVar5;
    }

    public drj(mav mavVar, lzv lzvVar, AmbientMode.AmbientController ambientController, lzd lzdVar, ksi ksiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        mavVar.getClass();
        lzvVar.getClass();
        ambientController.getClass();
        lzdVar.getClass();
        ksiVar.getClass();
        this.f12396b = mavVar;
        this.f12395a = lzvVar;
        this.f12397c = ambientController;
        this.f12399e = lzdVar;
        this.f12398d = ksiVar;
    }

    public drj(byte[] bArr) {
        this.f12397c = new AtomicReferenceArray(128);
        this.f12395a = ook.m18796j(null);
        this.f12399e = ook.m18794h(0);
        this.f12396b = ook.m18794h(0);
        this.f12398d = ook.m18794h(0);
    }
}
