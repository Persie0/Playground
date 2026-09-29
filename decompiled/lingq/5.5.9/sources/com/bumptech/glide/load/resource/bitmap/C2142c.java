package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p007a6.C0028g;
import p258m6.C7484d;
import p258m6.C7490j;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9451b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2142c implements InterfaceC8736f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C2140a f10846a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9451b f10847b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C2140a.b {

        /* JADX INFO: renamed from: a */
        public final RecyclableBufferedInputStream f10848a;

        /* JADX INFO: renamed from: b */
        public final C7484d f10849b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C7484d c7484d) {
            this.f10848a = recyclableBufferedInputStream;
            this.f10849b = c7484d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2140a.b
        /* JADX INFO: renamed from: a */
        public final void mo6355a(Bitmap bitmap, InterfaceC9452c interfaceC9452c) throws IOException {
            IOException iOException = this.f10849b.f41367b;
            if (iOException != null) {
                if (bitmap != null) {
                    interfaceC9452c.mo164d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2140a.b
        /* JADX INFO: renamed from: b */
        public final void mo6356b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10848a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f10811c = recyclableBufferedInputStream.f10809a.length;
            }
        }
    }

    public C2142c(C2140a c2140a, InterfaceC9451b interfaceC9451b) {
        this.f10846a = c2140a;
        this.f10847b = interfaceC9451b;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(InputStream inputStream, int i10, int i11, C8735e c8735e) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z10;
        C7484d c7484d;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            z10 = false;
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f10847b);
            z10 = true;
        }
        ArrayDeque arrayDeque = C7484d.f41365c;
        synchronized (arrayDeque) {
            c7484d = (C7484d) arrayDeque.poll();
        }
        if (c7484d == null) {
            c7484d = new C7484d();
        }
        C7484d c7484d2 = c7484d;
        c7484d2.f41366a = recyclableBufferedInputStream;
        C7490j c7490j = new C7490j(c7484d2);
        a aVar = new a(recyclableBufferedInputStream, c7484d2);
        try {
            C2140a c2140a = this.f10846a;
            C0028g c0028gM6353a = c2140a.m6353a(new InterfaceC2141b.b(c2140a.f10834c, c7490j, c2140a.f10835d), i10, i11, c8735e, aVar);
            c7484d2.f41367b = null;
            c7484d2.f41366a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(c7484d2);
            }
            return c0028gM6353a;
        } finally {
            c7484d2.f41367b = null;
            c7484d2.f41366a = null;
            ArrayDeque arrayDeque2 = C7484d.f41365c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(c7484d2);
                if (z10) {
                    recyclableBufferedInputStream.m6344b();
                }
            }
        }
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(InputStream inputStream, C8735e c8735e) throws IOException {
        this.f10846a.getClass();
        return true;
    }
}
