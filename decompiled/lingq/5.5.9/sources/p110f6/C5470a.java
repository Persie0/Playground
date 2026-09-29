package p110f6;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p027b6.C1322b;
import p356r5.C8735e;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: f6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5470a implements InterfaceC5471b<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    public final Bitmap.CompressFormat f34057a = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: b */
    public final int f34058b = 100;

    @Override // p110f6.InterfaceC5471b
    /* JADX INFO: renamed from: b */
    public final InterfaceC9207m<byte[]> mo65b(InterfaceC9207m<Bitmap> interfaceC9207m, C8735e c8735e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC9207m.get().compress(this.f34057a, this.f34058b, byteArrayOutputStream);
        interfaceC9207m.mo157b();
        return new C1322b(byteArrayOutputStream.toByteArray());
    }
}
