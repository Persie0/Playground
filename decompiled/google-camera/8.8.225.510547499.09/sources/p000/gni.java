package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.material.behavior.iWN.zuAgeeF;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gni implements ech, ecy, ecz, edi {

    /* JADX INFO: renamed from: e */
    private static final nbh f25724e = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/DynamicDepthProcessor");

    /* JADX INFO: renamed from: a */
    protected final DynamicDepthUtils f25725a;

    /* JADX INFO: renamed from: b */
    protected final kbz f25726b;

    /* JADX INFO: renamed from: c */
    protected final gkz f25727c;

    /* JADX INFO: renamed from: d */
    protected final djm f25728d;

    /* JADX INFO: renamed from: f */
    private final cem f25729f;

    /* JADX INFO: renamed from: g */
    private final kbc f25730g;

    /* JADX INFO: renamed from: h */
    private final Executor f25731h;

    /* JADX INFO: renamed from: i */
    private final HashMap f25732i = new HashMap();

    /* JADX INFO: renamed from: j */
    private final dsx f25733j;

    /* JADX INFO: renamed from: k */
    private final gva f25734k;

    /* JADX INFO: renamed from: l */
    private final bko f25735l;

    public gni(dsx dsxVar, DynamicDepthUtils dynamicDepthUtils, gva gvaVar, gkz gkzVar, cem cemVar, gdz gdzVar, djm djmVar, Executor executor, kbz kbzVar, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f25733j = dsxVar;
        this.f25725a = dynamicDepthUtils;
        this.f25734k = gvaVar;
        this.f25727c = gkzVar;
        this.f25729f = cemVar;
        this.f25730g = gdzVar.f24348b;
        this.f25728d = djmVar;
        this.f25731h = executor;
        this.f25726b = kbzVar;
        this.f25735l = bkoVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    private final void m9550l(gnj gnjVar, DynamicDepthResult dynamicDepthResult) {
        if (gnjVar.f25742q && dynamicDepthResult != null) {
            dynamicDepthResult.close();
            dynamicDepthResult = null;
        }
        try {
            try {
                this.f25733j.m6688c(gnjVar.f25745t.f25502c.mo9902h(), mrm.m16828h(dynamicDepthResult));
            } catch (NoSuchElementException e) {
                ((nbe) ((nbe) ((nbe) f25724e.m17252c()).mo17283h(e)).mo17276G(3036)).mo17290o("Trying to set a result for an already aborted shot.");
            }
        } finally {
            gnjVar.m9554g();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gyh, java.lang.Object] */
    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        eemVar.f13675v.f25502c.mo9902h();
        gnj gnjVar = (gnj) this.f25732i.get(eemVar);
        if (gnjVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        gnjVar.f25737l.mo14894e(Integer.valueOf(i));
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final void mo7111d(gyu gyuVar) {
        eem eemVar;
        gnj gnjVar;
        ((nbe) ((nbe) f25724e.m17252c()).mo17276G((char) 3030)).mo17293r("Shot has been aborted %s", gyuVar);
        Iterator it = this.f25732i.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar == null || (gnjVar = (gnj) this.f25732i.remove(eemVar)) == null) {
            return;
        }
        this.f25733j.m6688c(gnjVar.f25745t.f25502c.mo9902h(), mqu.f41450a);
        gnjVar.mo7643b();
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final void mo7112e(eem eemVar, key keyVar) {
        kpw kpwVarM9495d;
        gnj gnjVar = (gnj) this.f25732i.get(eemVar);
        if (gnjVar == null) {
            keyVar.close();
            return;
        }
        gnjVar.mo7644c(keyVar);
        int i = gnjVar.f25743r - 1;
        mrm mrmVarMo9907m = gnjVar.f25745t.f25502c.mo9907m();
        if (mrmVarMo9907m.mo16813g()) {
            mrm mrmVarMo16808b = mrmVarMo9907m.mo16808b(fod.f22912q);
            if (!mrmVarMo16808b.mo16813g() || ((String) mrmVarMo16808b.mo16809c()).isEmpty() || (kpwVarM9495d = this.f25734k.m9784a(keyVar).m9495d()) == null) {
                return;
            }
            File file = new File((String) mrmVarMo16808b.mo16809c(), String.format(Locale.ROOT, "%s_%02d.pd", "payload_depth", Integer.valueOf(i)));
            nbz nbzVar = nch.f41987a;
            file.getName();
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        for (kpv kpvVar : kpwVarM9495d.mo7251g()) {
                            ByteBuffer buffer = kpvVar.getBuffer();
                            int iLimit = buffer.limit();
                            byte[] bArr = new byte[iLimit];
                            buffer.get(bArr);
                            int rowStride = kpwVarM9495d.mo7245a() == 4099 ? kpvVar.getRowStride() : kpwVarM9495d.mo7247c() * kpvVar.getPixelStride();
                            for (int rowStride2 = 0; rowStride2 < iLimit; rowStride2 += kpvVar.getRowStride()) {
                                fileOutputStream.write(bArr, rowStride2, rowStride);
                            }
                            buffer.clear();
                        }
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    ((nbe) ((nbe) ((nbe) DynamicDepthUtils.f6630a.m17251b().mo17282g(nch.f41987a, IuyLAqNmW.LokjFebLgZ)).mo17283h(e2)).mo17276G(1041)).mo17293r("IOException while saving Depth debug image %s", file.getName());
                }
                kpwVarM9495d.close();
            } catch (Throwable th3) {
                kpwVarM9495d.close();
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        lku.m15613H(!this.f25732i.containsKey(eemVar));
        this.f25732i.put(eemVar, new gnj(eemVar.f13675v, this.f25727c.m9396a(), burstSpec, kppVar, null, null));
        this.f25733j.m6687b(eemVar.f13675v.f25502c.mo9902h());
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        een eenVarM2622p = this.f25735l.m2622p(gyuVar);
        eenVarM2622p.m7223c(this);
        eenVarM2622p.m7221a(new gnw(this, 1));
        eenVarM2622p.m7226f(this);
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
        gnj gnjVar = (gnj) this.f25732i.get(eemVar);
        if (gnjVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        this.f25731h.execute(new ghc(this, gnjVar, eemVar, 3));
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: j */
    protected DynamicDepthResult mo9551j(gmc gmcVar, gnj gnjVar) {
        kbz kbzVar;
        kpw kpwVarM9498g = gmcVar.m9498g();
        kpw kpwVarM9495d = gmcVar.m9495d();
        gnjVar.m9554g();
        gnjVar.f25745t.f25502c.mo9902h();
        if (kpwVarM9498g == null || kpwVarM9495d == null) {
            if (kpwVarM9498g != null) {
                kpwVarM9498g.close();
            }
            if (kpwVarM9495d == null) {
                return null;
            }
            kpwVarM9495d.close();
            return null;
        }
        this.f25728d.m6223D();
        try {
            ShotMetadata shotMetadata = (ShotMetadata) gnjVar.f25738m.get();
            this.f25726b.mo13961e("ddepth#process");
            DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.f25730g, this.f25729f.m3566d().ordinal(), false, gnjVar.f25744s.f13251f, gmcVar.f25581a.mo7042c());
            if (this.f25725a.m4097b(kpwVarM9495d, kpwVarM9498g, dynamicDepthResult, shotMetadata)) {
                this.f25726b.mo13962f();
                kpwVarM9495d.close();
                kpwVarM9498g.close();
                return dynamicDepthResult;
            }
            dynamicDepthResult.close();
            kbzVar = this.f25726b;
        } catch (Exception e) {
            kbzVar = this.f25726b;
        } catch (Throwable th) {
            this.f25726b.mo13962f();
            kpwVarM9495d.close();
            kpwVarM9498g.close();
            throw th;
        }
        kbzVar.mo13962f();
        kpwVarM9495d.close();
        kpwVarM9498g.close();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [gni] */
    /* JADX WARN: Type inference failed for: r6v0, types: [gnj] */
    /* JADX WARN: Type inference failed for: r6v1, types: [gnj] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kbz] */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9552k(gnj gnjVar, eem eemVar) {
        List listM9553f = gnjVar.m9553f();
        if (listM9553f.isEmpty()) {
            gnjVar.mo7643b();
            return;
        }
        DynamicDepthResult dynamicDepthResultMo9551j = null;
        try {
            try {
                this.f25726b.mo13961e(zuAgeeF.usGRZJAdYGIHe);
                key keyVar = (key) listM9553f.get(((Integer) gnjVar.f25737l.get()).intValue());
                if (keyVar != null) {
                    dynamicDepthResultMo9551j = mo9551j(this.f25734k.m9784a(keyVar), gnjVar);
                }
            } catch (IndexOutOfBoundsException e) {
                e = e;
                gnjVar.mo7643b();
                ((nbe) ((nbe) ((nbe) f25724e.m17251b()).mo17283h(e)).mo17276G(3032)).mo17290o("Error retrieving the base frame index.");
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((nbe) ((nbe) ((nbe) f25724e.m17251b()).mo17283h(e2)).mo17276G(3031)).mo17290o("Error retrieving the base frame index.");
            } catch (CancellationException e3) {
                e = e3;
                gnjVar.mo7643b();
                ((nbe) ((nbe) ((nbe) f25724e.m17251b()).mo17283h(e)).mo17276G(3032)).mo17290o("Error retrieving the base frame index.");
            } catch (ExecutionException e4) {
                e = e4;
                gnjVar.mo7643b();
                ((nbe) ((nbe) ((nbe) f25724e.m17251b()).mo17283h(e)).mo17276G(3032)).mo17290o("Error retrieving the base frame index.");
            }
        } finally {
            m9550l(gnjVar, dynamicDepthResultMo9551j);
            this.f25732i.remove(eemVar);
            this.f25726b.mo13962f();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gyh, java.lang.Object] */
    @Override // p000.ecz
    /* JADX INFO: renamed from: o */
    public final void mo7053o(eem eemVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        gyu gyuVarMo9902h = eemVar.f13675v.f25502c.mo9902h();
        gnj gnjVar = (gnj) this.f25732i.get(eemVar);
        if (gnjVar != null) {
            gnjVar.f25738m.mo14894e(shotMetadata);
        } else {
            ((nbe) ((nbe) f25724e.m17252c()).mo17276G((char) 3035)).mo17293r("Couldn't find inflight shot, already processed? %s", gyuVarMo9902h);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }
}
