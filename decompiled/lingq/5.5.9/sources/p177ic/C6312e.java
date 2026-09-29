package p177ic;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: ic.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6312e extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a */
    public final Matrix f36531a;

    public C6312e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f36531a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        Matrix matrix = this.f36531a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
