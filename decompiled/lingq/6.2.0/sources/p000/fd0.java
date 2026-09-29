package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class fd0 implements a33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38880a;

    /* JADX INFO: renamed from: b */
    public final sz6 f38881b;

    /* JADX INFO: renamed from: c */
    public final Object f38882c;

    public /* synthetic */ fd0(Object obj, sz6 sz6Var, int i) {
        this.f38880a = i;
        this.f38882c = obj;
        this.f38881b = sz6Var;
    }

    @Override // p000.a33
    /* JADX INFO: renamed from: a */
    public final Object mo57a(Continuation continuation) {
        int i = this.f38880a;
        Object obj = this.f38882c;
        sz6 sz6Var = this.f38881b;
        switch (i) {
            case 0:
                return new sl2(new BitmapDrawable(sz6Var.f61659a.getResources(), (Bitmap) obj), false, DataSource.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    aj0 aj0Var = new aj0();
                    aj0Var.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = sz6Var.f61659a;
                    return new ee9(new ae9(aj0Var, null), null, DataSource.MEMORY);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof poa);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(sz6Var.f61659a.getResources(), sbd.m21208a(bitmapDrawable, sz6Var.f61660b, sz6Var.f61662d, sz6Var.f61663e, sz6Var.f61664f));
                }
                return new sl2(bitmapDrawable, z, DataSource.MEMORY);
        }
    }
}
