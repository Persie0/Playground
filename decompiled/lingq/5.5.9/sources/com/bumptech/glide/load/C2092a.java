package com.bumptech.glide.load;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p258m6.C7481a;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2092a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static int m6265a(InterfaceC9451b interfaceC9451b, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9451b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int iMo167c = ((ImageHeaderParser) list.get(i10)).mo167c(inputStream, interfaceC9451b);
                inputStream.reset();
                if (iMo167c != -1) {
                    return iMo167c;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static ImageHeaderParser.ImageType m6266b(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType imageTypeMo165a = list.get(i10).mo165a(byteBuffer);
                C7481a.m14866c(byteBuffer);
                if (imageTypeMo165a != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeMo165a;
                }
            } catch (Throwable th2) {
                C7481a.m14866c(byteBuffer);
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public static ImageHeaderParser.ImageType m6267c(InterfaceC9451b interfaceC9451b, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9451b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType imageTypeMo166b = ((ImageHeaderParser) list.get(i10)).mo166b(inputStream);
                inputStream.reset();
                if (imageTypeMo166b != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeMo166b;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
