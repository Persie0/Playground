package p000;

import com.google.googlex.gcam.InterleavedImageU16;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehr implements edx {

    /* JADX INFO: renamed from: b */
    public static final nbh f14086b = nbh.m17259h("com/google/android/apps/camera/hdrplus/portrait/PostProcessingPortraitImageSaverImpl");

    /* JADX INFO: renamed from: c */
    public final ehl f14087c;

    /* JADX INFO: renamed from: e */
    public final dhv f14089e;

    /* JADX INFO: renamed from: f */
    public final boolean f14090f;

    /* JADX INFO: renamed from: h */
    public final efa f14092h;

    /* JADX INFO: renamed from: i */
    public final dzr f14093i;

    /* JADX INFO: renamed from: j */
    public final fvu f14094j;

    /* JADX INFO: renamed from: k */
    private final mrm f14095k;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f14088d = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public final Map f14091g = new HashMap();

    public ehr(mrm mrmVar, fvu fvuVar, ehl ehlVar, dhv dhvVar, boolean z, efa efaVar, dzr dzrVar) {
        this.f14095k = mrmVar;
        this.f14094j = fvuVar;
        this.f14087c = ehlVar;
        this.f14089e = dhvVar;
        this.f14090f = z;
        this.f14092h = efaVar;
        this.f14093i = dzrVar;
    }

    /* JADX INFO: renamed from: e */
    public static InterleavedImageU16 m7331e(nps npsVar) {
        try {
            return (InterleavedImageU16) npsVar.get(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new InterleavedImageU16();
        } catch (CancellationException e2) {
            return new InterleavedImageU16();
        } catch (ExecutionException e3) {
            return new InterleavedImageU16();
        } catch (TimeoutException e4) {
            return new InterleavedImageU16();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gaw, java.lang.Object] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ehq mo3604b(glk glkVar) {
        String strMo9913s = glkVar.f25502c.mo9913s();
        ehq ehqVar = (ehq) this.f14091g.get(strMo9913s);
        if (ehqVar != null) {
            return ehqVar;
        }
        ?? r4 = glkVar.f25502c;
        ehq ehqVar2 = new ehq(this, r4, glkVar.f25500a, this.f14095k, UUID.randomUUID(), ((gxt) r4).f26755c);
        this.f14091g.put(strMo9913s, ehqVar2);
        return ehqVar2;
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        return mo3604b(glkVar);
    }

    @Override // p000.edw
    /* JADX INFO: renamed from: c */
    public final edy mo3604b(glk glkVar) {
        return mo3604b(glkVar);
    }

    @Override // p000.edw
    /* JADX INFO: renamed from: d */
    public final edy mo7185d(glk glkVar, egl eglVar) {
        return mo3604b(glkVar);
    }
}
