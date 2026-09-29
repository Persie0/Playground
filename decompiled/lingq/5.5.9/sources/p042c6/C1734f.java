package p042c6;

import android.graphics.drawable.Drawable;
import java.io.IOException;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: c6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1734f implements InterfaceC8736f<Drawable, Drawable> {
    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Drawable> mo68a(Drawable drawable, int i10, int i11, C8735e c8735e) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new C1732d(drawable2);
        }
        return null;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(Drawable drawable, C8735e c8735e) throws IOException {
        return true;
    }
}
