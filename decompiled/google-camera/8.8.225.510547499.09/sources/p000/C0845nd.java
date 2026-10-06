package p000;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* JADX INFO: renamed from: nd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0845nd extends Property {
    public C0845nd(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f1181a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).m1317f(((Float) obj2).floatValue());
    }
}
