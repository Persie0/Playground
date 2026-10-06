package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nye implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f45016a;

    public nye(Map.Entry entry) {
        this.f45016a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f45016a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((nyg) this.f45016a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof nyw)) {
            throw new IllegalArgumentException(xRFdVyfdeve.YCZPsgM);
        }
        nyg nygVar = (nyg) this.f45016a.getValue();
        nyw nywVar = nygVar.f45018a;
        nygVar.f45019b = null;
        nygVar.f45018a = (nyw) obj;
        return nywVar;
    }
}
