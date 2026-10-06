package p000;

import android.util.IntProperty;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwb extends IntProperty {
    public iwb() {
        super("alpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(Object obj) {
        return Integer.valueOf(((WearSnapshot) obj).getAlpha());
    }

    @Override // android.util.IntProperty
    public final /* synthetic */ void setValue(Object obj, int i) {
        ((WearSnapshot) obj).setAlpha(i);
    }
}
