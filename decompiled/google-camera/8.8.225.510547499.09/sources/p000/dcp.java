package p000;

import android.content.SharedPreferences;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dcp implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10514a;

    /* JADX INFO: renamed from: b */
    private final oju f10515b;

    /* JADX INFO: renamed from: c */
    private final oju f10516c;

    public dcp(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f10514a = ojuVar;
        this.f10515b = ojuVar2;
        this.f10516c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm((SharedPreferences) this.f10514a.get(), (CameraFatalErrorTrackerDatabase) this.f10515b.get(), ((dce) this.f10516c).get(), (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
