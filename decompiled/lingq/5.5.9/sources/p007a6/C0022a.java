package p007a6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: a6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0022a<DataType> implements InterfaceC8736f<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8736f<DataType, Bitmap> f16a;

    /* JADX INFO: renamed from: b */
    public final Resources f17b;

    public C0022a(Resources resources, InterfaceC8736f<DataType, Bitmap> interfaceC8736f) {
        this.f17b = resources;
        this.f16a = interfaceC8736f;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<BitmapDrawable> mo68a(DataType datatype, int i10, int i11, C8735e c8735e) throws IOException {
        InterfaceC9207m<Bitmap> interfaceC9207mMo68a = this.f16a.mo68a(datatype, i10, i11, c8735e);
        if (interfaceC9207mMo68a == null) {
            return null;
        }
        return new C0028g(this.f17b, interfaceC9207mMo68a);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(DataType datatype, C8735e c8735e) throws IOException {
        return this.f16a.mo69b(datatype, c8735e);
    }
}
