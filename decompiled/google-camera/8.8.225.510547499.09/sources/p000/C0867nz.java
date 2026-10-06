package p000;

import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: renamed from: nz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0867nz {

    /* JADX INFO: renamed from: a */
    public final int f45053a;

    /* JADX INFO: renamed from: b */
    public final Bundle f45054b;

    public C0867nz(int i) {
        this.f45053a = i;
        Bundle bundle = new Bundle();
        this.f45054b = bundle;
        if (i == 7 || i == 4) {
            ComplicationData.m1360j("IMAGE_STYLE", i);
            bundle.putInt("IMAGE_STYLE", 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ComplicationData m18257a() {
        for (String str : ComplicationData.f1310a[this.f45053a]) {
            if (!this.f45054b.containsKey(str)) {
                throw new IllegalStateException("Field " + str + " is required for type " + this.f45053a);
            }
            if (this.f45054b.containsKey("ICON_BURN_IN_PROTECTION") && !this.f45054b.containsKey("ICON")) {
                throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
            }
            if (this.f45054b.containsKey(PMZiHihxLGEy.ZEhpGgp) && !this.f45054b.containsKey("SMALL_IMAGE")) {
                throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.");
            }
        }
        return new ComplicationData(this);
    }
}
