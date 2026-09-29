package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e49 extends k49 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f36703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f36704d;

    public e49(ArrayList arrayList, Matrix matrix) {
        this.f36703c = arrayList;
        this.f36704d = matrix;
    }

    @Override // p000.k49
    /* JADX INFO: renamed from: b */
    public final void mo10846b(Matrix matrix, m39 m39Var, int i, Canvas canvas) {
        Iterator it = this.f36703c.iterator();
        while (it.hasNext()) {
            ((k49) it.next()).mo10846b(this.f36704d, m39Var, i, canvas);
        }
    }
}
