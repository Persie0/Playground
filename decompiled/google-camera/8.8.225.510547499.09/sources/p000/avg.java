package p000;

import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avg extends Property {
    public avg(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((avh) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        avh avhVar = (avh) obj;
        avhVar.setLevel(((Integer) obj2).intValue());
        avhVar.invalidateSelf();
    }
}
