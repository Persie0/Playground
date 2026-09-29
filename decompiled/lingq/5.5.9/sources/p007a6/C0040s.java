package p007a6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import p258m6.C7481a;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: a6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0040s implements InterfaceC8736f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0027f f46a = new C0027f();

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(InputStream inputStream, int i10, int i11, C8735e c8735e) throws IOException {
        return this.f46a.m154c(ImageDecoder.createSource(C7481a.m14865b(inputStream)), i10, i11, c8735e);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(InputStream inputStream, C8735e c8735e) throws IOException {
        return true;
    }
}
