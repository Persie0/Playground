package ua;

import android.media.Spatializer;
import com.google.common.collect.AbstractC3177a0;

/* JADX INFO: renamed from: ua.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9501j implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9496e f48913a;

    public C9501j(C9496e c9496e) {
        this.f48913a = c9496e;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        C9496e c9496e = this.f48913a;
        AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
        c9496e.m17944j();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        C9496e c9496e = this.f48913a;
        AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
        c9496e.m17944j();
    }
}
