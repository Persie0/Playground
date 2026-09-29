package com.bumptech.glide.load.resource.bitmap;

import ae.C0062b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2092a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2104k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p258m6.C7481a;
import p258m6.C7490j;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2141b {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC2141b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f10837a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f10838b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC9451b f10839c;

        public a(InterfaceC9451b interfaceC9451b, ByteBuffer byteBuffer, List list) {
            this.f10837a = byteBuffer;
            this.f10838b = list;
            this.f10839c = interfaceC9451b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: a */
        public final int mo6357a() throws IOException {
            ByteBuffer byteBufferM14866c = C7481a.m14866c(this.f10837a);
            InterfaceC9451b interfaceC9451b = this.f10839c;
            if (byteBufferM14866c == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.f10838b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int iMo168d = list.get(i10).mo168d(byteBufferM14866c, interfaceC9451b);
                    C7481a.m14866c(byteBufferM14866c);
                    if (iMo168d != -1) {
                        return iMo168d;
                    }
                } catch (Throwable th2) {
                    C7481a.m14866c(byteBufferM14866c);
                    throw th2;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: b */
        public final Bitmap mo6358b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new C7481a.a(C7481a.m14866c(this.f10837a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: c */
        public final void mo6359c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: d */
        public final ImageHeaderParser.ImageType mo6360d() throws IOException {
            return C2092a.m6266b(this.f10838b, C7481a.m14866c(this.f10837a));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC2141b {

        /* JADX INFO: renamed from: a */
        public final C2104k f10840a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9451b f10841b;

        /* JADX INFO: renamed from: c */
        public final List<ImageHeaderParser> f10842c;

        public b(InterfaceC9451b interfaceC9451b, C7490j c7490j, List list) {
            C0062b.m345f0(interfaceC9451b);
            this.f10841b = interfaceC9451b;
            C0062b.m345f0(list);
            this.f10842c = list;
            this.f10840a = new C2104k(c7490j, interfaceC9451b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: a */
        public final int mo6357a() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10840a.f10624a;
            recyclableBufferedInputStream.reset();
            return C2092a.m6265a(this.f10841b, recyclableBufferedInputStream, this.f10842c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: b */
        public final Bitmap mo6358b(BitmapFactory.Options options) throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10840a.f10624a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: c */
        public final void mo6359c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10840a.f10624a;
            synchronized (recyclableBufferedInputStream) {
                try {
                    recyclableBufferedInputStream.f10811c = recyclableBufferedInputStream.f10809a.length;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: d */
        public final ImageHeaderParser.ImageType mo6360d() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f10840a.f10624a;
            recyclableBufferedInputStream.reset();
            return C2092a.m6267c(this.f10841b, recyclableBufferedInputStream, this.f10842c);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class c implements InterfaceC2141b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9451b f10843a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f10844b;

        /* JADX INFO: renamed from: c */
        public final ParcelFileDescriptorRewinder f10845c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC9451b interfaceC9451b) {
            C0062b.m345f0(interfaceC9451b);
            this.f10843a = interfaceC9451b;
            C0062b.m345f0(list);
            this.f10844b = list;
            this.f10845c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: a */
        public final int mo6357a() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f10845c;
            InterfaceC9451b interfaceC9451b = this.f10843a;
            List<ImageHeaderParser> list = this.f10844b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.mo4883a().getFileDescriptor()), interfaceC9451b);
                    try {
                        int iMo167c = imageHeaderParser.mo167c(recyclableBufferedInputStream, interfaceC9451b);
                        recyclableBufferedInputStream.m6344b();
                        parcelFileDescriptorRewinder.mo4883a();
                        if (iMo167c != -1) {
                            return iMo167c;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.m6344b();
                        }
                        parcelFileDescriptorRewinder.mo4883a();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    recyclableBufferedInputStream = null;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: b */
        public final Bitmap mo6358b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f10845c.mo4883a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: c */
        public final void mo6359c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2141b
        /* JADX INFO: renamed from: d */
        public final ImageHeaderParser.ImageType mo6360d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f10845c;
            InterfaceC9451b interfaceC9451b = this.f10843a;
            List<ImageHeaderParser> list = this.f10844b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.mo4883a().getFileDescriptor()), interfaceC9451b);
                    try {
                        ImageHeaderParser.ImageType imageTypeMo166b = imageHeaderParser.mo166b(recyclableBufferedInputStream);
                        recyclableBufferedInputStream.m6344b();
                        parcelFileDescriptorRewinder.mo4883a();
                        if (imageTypeMo166b != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeMo166b;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.m6344b();
                        }
                        parcelFileDescriptorRewinder.mo4883a();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    recyclableBufferedInputStream = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo6357a() throws IOException;

    /* JADX INFO: renamed from: b */
    Bitmap mo6358b(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo6359c();

    /* JADX INFO: renamed from: d */
    ImageHeaderParser.ImageType mo6360d() throws IOException;
}
