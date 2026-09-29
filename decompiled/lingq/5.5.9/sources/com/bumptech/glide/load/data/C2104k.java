package com.bumptech.glide.load.data;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2104k implements InterfaceC2098e<InputStream> {

    /* JADX INFO: renamed from: a */
    public final RecyclableBufferedInputStream f10624a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC2098e.a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9451b f10625a;

        public a(InterfaceC9451b interfaceC9451b) {
            this.f10625a = interfaceC9451b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: a */
        public final Class<InputStream> mo4885a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2098e<InputStream> mo4886b(InputStream inputStream) {
            return new C2104k(inputStream, this.f10625a);
        }
    }

    public C2104k(InputStream inputStream, InterfaceC9451b interfaceC9451b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9451b);
        this.f10624a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: a */
    public final InputStream mo4883a() throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10624a;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: b */
    public final void mo4884b() {
        this.f10624a.m6344b();
    }
}
