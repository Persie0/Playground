package p000;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.dirtylens.DirtyLens;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfv implements cff {

    /* JADX INFO: renamed from: a */
    public final cfx f5523a;

    /* JADX INFO: renamed from: c */
    public boolean f5525c;

    /* JADX INFO: renamed from: d */
    public final jww f5526d;

    /* JADX INFO: renamed from: f */
    public cfi f5528f;

    /* JADX INFO: renamed from: g */
    public int f5529g;

    /* JADX INFO: renamed from: h */
    public final AmbientDelegate f5530h;

    /* JADX INFO: renamed from: i */
    public final bko f5531i;

    /* JADX INFO: renamed from: j */
    private final Resources f5532j;

    /* JADX INFO: renamed from: k */
    private final jwn f5533k;

    /* JADX INFO: renamed from: l */
    private final Handler f5534l;

    /* JADX INFO: renamed from: m */
    private final Runnable f5535m;

    /* JADX INFO: renamed from: n */
    private final fcp f5536n;

    /* JADX INFO: renamed from: o */
    private final dhv f5537o;

    /* JADX INFO: renamed from: p */
    private final long f5538p;

    /* JADX INFO: renamed from: r */
    private final chx f5540r;

    /* JADX INFO: renamed from: s */
    private cfk f5541s;

    /* JADX INFO: renamed from: b */
    public final Map f5524b = new HashMap();

    /* JADX INFO: renamed from: t */
    private final bzq f5542t = new cfu(this);

    /* JADX INFO: renamed from: e */
    public AtomicInteger f5527e = new AtomicInteger(0);

    /* JADX INFO: renamed from: q */
    private mrm f5539q = mqu.f41450a;

    public cfv(bko bkoVar, cfx cfxVar, AmbientDelegate ambientDelegate, bzq bzqVar, Resources resources, fcp fcpVar, dhv dhvVar, chx chxVar, kme kmeVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        bkoVar.getClass();
        this.f5531i = bkoVar;
        this.f5530h = ambientDelegate;
        cfxVar.getClass();
        this.f5523a = cfxVar;
        bzqVar.getClass();
        this.f5532j = resources;
        jwn jwnVarMo10029a = hahVar.mo10029a(gzy.f27044c);
        this.f5533k = jwnVarMo10029a;
        this.f5536n = fcpVar;
        this.f5537o = dhvVar;
        this.f5540r = chxVar;
        dhx dhxVar = dhf.f11040a;
        dhvVar.mo6177e();
        this.f5538p = 5000L;
        this.f5534l = jvh.m13557e(Looper.getMainLooper());
        this.f5535m = new bey(this, cfxVar, 20);
        this.f5529g = 2;
        this.f5526d = cfxVar.f5546b;
        chxVar.f5767b.m13537d(jwnVarMo10029a.mo3830a(new kkp(kmeVar, cfxVar, ambientDelegate, 1, null), not.INSTANCE));
    }

    /* JADX INFO: renamed from: i */
    private final boolean m3606i() {
        cfi cfiVar = this.f5528f;
        if (cfiVar != null) {
            return cfiVar.mo3573c() == 1 || cfiVar.mo3573c() == 2;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
    /* JADX WARN: Type inference failed for: r6v11, types: [dhv, java.lang.Object] */
    @Override // p000.cff
    /* JADX INFO: renamed from: a */
    public final void mo3595a(grm grmVar) {
        mrm mrmVarM16829i;
        int i;
        cfk cfkVar;
        jvb jvbVar;
        if (!((Boolean) ((jwf) this.f5533k).f34942d).booleanValue()) {
            grmVar.f26152a.close();
            return;
        }
        kpw kpwVar = grmVar.f26152a;
        int i2 = 0;
        try {
            if (kpwVar.mo7245a() == 35) {
                int iMo7247c = kpwVar.mo7247c();
                int iMo7246b = kpwVar.mo7246b();
                int iMin = Math.min(iMo7247c / 640, iMo7246b / 480);
                if (iMin > 0) {
                    while (iMin > 1 && !bzq.m3258ad(iMo7247c, iMo7246b, iMin)) {
                        iMin--;
                    }
                } else {
                    iMin = -1;
                }
                if (iMin <= 0 && iMo7247c * iMo7246b >= 307200) {
                    iMin = 1;
                }
                if (iMin > 0) {
                    kpwVar.getClass();
                    ByteBuffer[] byteBufferArr = null;
                    if (kpwVar.mo7245a() == 35) {
                        int iMo7247c2 = kpwVar.mo7247c();
                        int iMo7246b2 = kpwVar.mo7246b();
                        if (bzq.m3258ad(iMo7247c2, iMo7246b2, iMin) && iMo7247c2 / iMin >= 640 && iMo7246b2 / iMin >= 480) {
                            List listMo7251g = kpwVar.mo7251g();
                            kpv kpvVar = (kpv) listMo7251g.get(0);
                            kpv kpvVar2 = (kpv) listMo7251g.get(1);
                            kpv kpvVar3 = (kpv) listMo7251g.get(2);
                            int i3 = (iMo7247c2 * iMo7246b2) / (iMin * iMin);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3);
                            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i3 / 2);
                            if (YuvUtilNative.downsampleYUV_420_888toNV21Native(iMo7247c2, iMo7246b2, kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), byteBufferAllocateDirect, byteBufferAllocateDirect2, iMin)) {
                                byteBufferArr = new ByteBuffer[]{byteBufferAllocateDirect, byteBufferAllocateDirect2};
                            }
                        }
                    }
                    if (byteBufferArr != null) {
                        int i4 = iMo7247c / iMin;
                        int i5 = iMo7246b / iMin;
                        ByteBuffer byteBuffer = byteBufferArr[0];
                        byteBuffer.getClass();
                        ByteBuffer byteBuffer2 = byteBufferArr[1];
                        byteBuffer2.getClass();
                        byteBuffer.getClass();
                        byteBuffer2.getClass();
                        YuvReadView yuvReadView = new YuvReadView(GcamModuleJNI.new_YuvReadView__SWIG_2(i4, i5, i4, nsd.m17642a(new nsd(BufferUtils.m4902a(byteBuffer))), i4 / 2, i5 / 2, i4, nsd.m17642a(new nsd(BufferUtils.m4902a(byteBuffer2))), nsh.f44395c.f44398d));
                        new DirtyLens();
                        long j = yuvReadView.f8391a;
                        if (j == 0) {
                            mrmVarM16829i = mqu.f41450a;
                        } else {
                            float[] fArr = new float[1];
                            mrmVarM16829i = DirtyLens.getDirtyLensRawScore(j, fArr) ? mrm.m16829i(Float.valueOf(fArr[0])) : mqu.f41450a;
                        }
                        if (mrmVarM16829i.mo16813g() && this.f5539q.mo16813g()) {
                            this.f5536n.mo8154aB(Float.valueOf(1.0f / (((float) Math.exp(-((Float) mrmVarM16829i.mo16809c()).floatValue())) + 1.0f)), ((kmd) this.f5539q.mo16809c()).mo14558k());
                        }
                        int iIncrementAndGet = this.f5527e.incrementAndGet();
                        AmbientDelegate ambientDelegate = this.f5530h;
                        if (mrmVarM16829i.mo16813g()) {
                            float fFloatValue = ((Float) mrmVarM16829i.mo16809c()).floatValue();
                            Object obj = ambientDelegate.f1685a;
                            if (obj == null) {
                                i = 2;
                            } else {
                                Object obj2 = ((bko) ambientDelegate.f1686b).f3652a;
                                boolean zDirtyLensHistory_AddRawScore = GcamModuleJNI.DirtyLensHistory_AddRawScore(((DirtyLensHistory) obj2).f8241a, (DirtyLensHistory) obj2, fFloatValue);
                                ((jxd) obj).mo3415bf(((bko) ambientDelegate.f1686b).m2610d());
                                ?? r6 = ambientDelegate.f1687c;
                                dhx dhxVar = dhf.f11040a;
                                r6.mo6178f();
                                if (zDirtyLensHistory_AddRawScore) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                            }
                        } else {
                            i = 2;
                        }
                        if (this.f5525c && i != this.f5529g) {
                            switch (i - 1) {
                                case 0:
                                    if (((Boolean) ((jwf) this.f5533k).f34942d).booleanValue() && !m3606i() && (cfkVar = this.f5541s) != null) {
                                        this.f5528f = cfkVar.m3601a(cep.m3570a(this.f5532j.getString(C0100R.string.advice_dirty_lens), this.f5532j.getString(C0100R.string.advice_dirty_lens_popup_text), this.f5542t, false, 7000));
                                        this.f5536n.mo8195o();
                                        chx chxVar = this.f5540r;
                                        synchronized (chxVar.f5766a) {
                                            jvbVar = chxVar.f5768c;
                                            break;
                                        }
                                        jvbVar.m13537d(new cft(this, i2));
                                    }
                                    m3607g();
                                    this.f5529g = i;
                                    break;
                                default:
                                    this.f5529g = i;
                                    break;
                            }
                        }
                        dhv dhvVar = this.f5537o;
                        dhx dhxVar2 = dhf.f11040a;
                        dhvVar.mo6178f();
                        if (iIncrementAndGet > 0) {
                            m3607g();
                        }
                        if (kpwVar == null) {
                            return;
                        }
                    } else if (kpwVar == null) {
                        return;
                    }
                } else if (kpwVar == null) {
                    return;
                }
            } else if (kpwVar == null) {
                return;
            }
            kpwVar.close();
        } catch (Throwable th) {
            if (kpwVar == null) {
                throw th;
            }
            try {
                kpwVar.close();
                throw th;
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                } catch (Exception e) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: b */
    public final cfc mo3596b() {
        return this.f5523a;
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: c */
    public final void mo3597c() {
        if (m3606i()) {
            m3607g();
            cfi cfiVar = this.f5528f;
            if (cfiVar != null) {
                cfiVar.mo3571a();
            }
        }
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: d */
    public final void mo3598d(kmg kmgVar) {
        this.f5530h.m1609l(this.f5523a.m3612d(kmgVar));
        this.f5529g = 2;
        this.f5527e = new AtomicInteger(0);
        this.f5526d.mo3415bf(15);
        m3608h();
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: e */
    public final void mo3599e(kmd kmdVar) {
        this.f5539q = mrm.m16829i(kmdVar);
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: f */
    public final void mo3600f(cfk cfkVar) {
        this.f5541s = cfkVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m3607g() {
        this.f5525c = false;
        this.f5534l.removeCallbacks(this.f5535m);
        cfx cfxVar = this.f5523a;
        cfxVar.f5547c.mo3415bf(false);
        cfxVar.f5546b.mo3415bf(0);
    }

    /* JADX INFO: renamed from: h */
    public final void m3608h() {
        this.f5534l.removeCallbacks(this.f5535m);
        this.f5534l.postDelayed(this.f5535m, this.f5538p);
    }
}
