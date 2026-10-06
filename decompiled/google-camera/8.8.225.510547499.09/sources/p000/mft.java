package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mft extends Property {

    /* JADX INFO: renamed from: a */
    private final Matrix f40388a;

    public mft() {
        super(Matrix.class, "imageMatrixProperty");
        this.f40388a = new Matrix();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        this.f40388a.set(((ImageView) obj).getImageMatrix());
        return this.f40388a;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
