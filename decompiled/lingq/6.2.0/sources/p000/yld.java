package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class yld extends old {

    /* JADX INFO: renamed from: g */
    public static final yld f70046g;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f70046g = new yld("<skip trace>", uuidRandomUUID, AbstractC0965i.m5415a(uuidRandomUUID), bmd.f8701e, qld.m20022c());
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: M */
    public final gmd mo12758M(String str, cmd cmdVar, fmd fmdVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: l */
    public final cmd mo12760l() {
        return bmd.f8701e;
    }
}
