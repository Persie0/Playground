package p007a6;

import android.graphics.Bitmap;
import java.io.IOException;
import p258m6.C7492l;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: a6.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0044w implements InterfaceC8736f<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: a6.w$a */
    public static final class a implements InterfaceC9207m<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final Bitmap f55a;

        public a(Bitmap bitmap) {
            this.f55a = bitmap;
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: b */
        public final void mo157b() {
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: c */
        public final int mo158c() {
            return C7492l.m14882c(this.f55a);
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: d */
        public final Class<Bitmap> mo159d() {
            return Bitmap.class;
        }

        @Override // p392t5.InterfaceC9207m
        public final Bitmap get() {
            return this.f55a;
        }
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(Bitmap bitmap, int i10, int i11, C8735e c8735e) throws IOException {
        return new a(bitmap);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(Bitmap bitmap, C8735e c8735e) throws IOException {
        return true;
    }
}
