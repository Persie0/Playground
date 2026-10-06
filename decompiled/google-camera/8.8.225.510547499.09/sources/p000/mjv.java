package p000;

import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjv extends Property {
    public mjv(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((mjw) obj).m16468c());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((mjw) obj).m16470e(((Float) obj2).floatValue());
    }
}
