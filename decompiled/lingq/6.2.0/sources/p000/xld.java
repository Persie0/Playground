package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.android.gms.internal.measurement.zzvr;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class xld extends old implements nld {

    /* JADX INFO: renamed from: g */
    public final Exception f68337g;

    /* JADX INFO: renamed from: h */
    public final boolean f68338h;

    /* JADX WARN: Multi-variable type inference failed */
    public xld(String str, nld nldVar, cmd cmdVar, boolean z, fmd fmdVar) {
        super("<missing root>:".concat(str), (AbstractC0965i) nldVar, cmd.m4875a(cmdVar, bmd.f8702f), fmdVar);
        this.f68337g = nldVar.mo17493d();
        this.f68338h = z;
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: M */
    public final gmd mo12758M(String str, cmd cmdVar, fmd fmdVar) {
        AtomicReference atomicReference = qld.f57920a;
        return mo17492O(str, cmdVar, true, fmdVar);
    }

    @Override // p000.nld
    /* JADX INFO: renamed from: O */
    public final xld mo17492O(String str, cmd cmdVar, boolean z, fmd fmdVar) {
        boolean z2 = this.f68338h;
        if (z && !z2) {
            AtomicReference atomicReference = qld.f57920a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new xld(str, this, cmdVar, z3, fmdVar);
    }

    @Override // p000.nld
    /* JADX INFO: renamed from: d */
    public final Exception mo17493d() {
        return this.f68337g;
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: l */
    public final cmd mo12760l() {
        return bmd.f8701e;
    }

    public xld(UUID uuid, String str, String str2, cmd cmdVar, zzvr zzvrVar, fmd fmdVar) {
        super("<missing root>:".concat(str2), uuid, str, cmd.m4875a(cmdVar, bmd.f8702f), fmdVar);
        this.f68337g = zzvrVar;
        this.f68338h = false;
    }
}
