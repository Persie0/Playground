package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.android.gms.internal.measurement.zzvr;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wld extends AbstractC0965i implements nld {

    /* JADX INFO: renamed from: g */
    public static final zzvr f67030g = new zzvr();

    /* JADX INFO: renamed from: f */
    public final Exception f67031f;

    public wld(UUID uuid, String str, zzvr zzvrVar, fmd fmdVar) {
        super("<missing root>", uuid, str, fmdVar);
        this.f67031f = zzvrVar;
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
        if (z) {
            AtomicReference atomicReference = qld.f57920a;
        }
        return new xld(str, this, cmdVar, z, fmdVar);
    }

    @Override // p000.nld
    /* JADX INFO: renamed from: d */
    public final Exception mo17493d() {
        return this.f67031f;
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: f */
    public final cmd mo12759f() {
        return bmd.f8701e;
    }
}
