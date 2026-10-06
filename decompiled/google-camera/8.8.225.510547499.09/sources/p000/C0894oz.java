package p000;

import android.util.Property;

/* JADX INFO: renamed from: oz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0894oz extends Property {
    public C0894oz(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((C0896pa) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C0896pa c0896pa = (C0896pa) obj;
        c0896pa.setLevel(((Integer) obj2).intValue());
        c0896pa.invalidateSelf();
    }
}
