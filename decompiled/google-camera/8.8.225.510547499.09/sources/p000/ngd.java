package p000;

import com.google.common.p019io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngd {
    /* JADX INFO: renamed from: a */
    public static final byte[] m17461a(File file) throws Throwable {
        ngb ngbVar = new ngb(ngb.f42208a);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ngbVar.f42210c.addFirst(fileInputStream);
            byte[] byteArray = ByteStreams.toByteArray(fileInputStream, DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size());
            ngbVar.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                ngbVar.f42211d = th;
                msm.m16868c(th, IOException.class);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                ngbVar.close();
                throw th2;
            }
        }
    }
}
