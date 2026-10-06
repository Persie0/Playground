package p021j$.nio.channels;

import java.nio.channels.FileChannel;
import p021j$.adapter.AbstractC0284a;
import p021j$.desugar.sun.nio.p023fs.AbstractC0293g;

/* JADX INFO: loaded from: classes3.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        return AbstractC0284a.f32758a ? fileChannel : AbstractC0293g.m11984g(fileChannel);
    }
}
