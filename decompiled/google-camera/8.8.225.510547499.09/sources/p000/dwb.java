package p000;

import android.app.SharedElementCallback;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dwb extends SharedElementCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bitmap f12702a;

    public dwb(Bitmap bitmap) {
        this.f12702a = bitmap;
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        return this.f12702a;
    }
}
