package p000;

import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5552a;

    public cfz(oju ojuVar) {
        this.f5552a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bko get() {
        bko bkoVar = (bko) this.f5552a.get();
        bko bkoVar2 = new bko((short[]) null);
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) bkoVar2.f3652a;
        GcamModuleJNI.DirtyLensHistory_max_photo_count__set(dirtyLensHistory.f8241a, dirtyLensHistory, 32);
        float f = ((cfq) bkoVar.f3652a).f5513a;
        DirtyLensHistory dirtyLensHistory2 = (DirtyLensHistory) bkoVar2.f3652a;
        GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__set(dirtyLensHistory2.f8241a, dirtyLensHistory2, f);
        float f2 = ((cfq) bkoVar.f3652a).f5515c;
        DirtyLensHistory dirtyLensHistory3 = (DirtyLensHistory) bkoVar2.f3652a;
        GcamModuleJNI.DirtyLensHistory_initial_score__set(dirtyLensHistory3.f8241a, dirtyLensHistory3, f2);
        float f3 = ((cfq) bkoVar.f3652a).f5514b;
        DirtyLensHistory dirtyLensHistory4 = (DirtyLensHistory) bkoVar2.f3652a;
        GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__set(dirtyLensHistory4.f8241a, dirtyLensHistory4, f3);
        return bkoVar2;
    }
}
