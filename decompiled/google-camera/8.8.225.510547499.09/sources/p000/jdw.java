package p000;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdw extends Exception {

    /* JADX INFO: renamed from: a */
    private final C1109wy f33814a;

    public jdw(C1109wy c1109wy) {
        this.f33814a = c1109wy;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (jev jevVar : this.f33814a.keySet()) {
            jcu jcuVar = (jcu) this.f33814a.get(jevVar);
            jib.m13205j(jcuVar);
            z &= !jcuVar.m12895b();
            arrayList.add(jevVar.m12997a() + ": " + jcuVar.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
