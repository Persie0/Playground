package gd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p117fd.C5507a;

/* JADX INFO: renamed from: gd.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5774m extends C5775n.f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f34932c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f34933d;

    public C5774m(ArrayList arrayList, Matrix matrix) {
        this.f34932c = arrayList;
        this.f34933d = matrix;
    }

    @Override // gd.C5775n.f
    /* JADX INFO: renamed from: a */
    public final void mo12163a(Matrix matrix, C5507a c5507a, int i10, Canvas canvas) {
        Iterator it = this.f34932c.iterator();
        while (it.hasNext()) {
            ((C5775n.f) it.next()).mo12163a(this.f34933d, c5507a, i10, canvas);
        }
    }
}
