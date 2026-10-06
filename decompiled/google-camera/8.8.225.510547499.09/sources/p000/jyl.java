package p000;

import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyl implements jyq {
    @Override // p000.jyq
    /* JADX INFO: renamed from: a */
    public final kqa mo5570a(FileDescriptor fileDescriptor, int i) throws jyp {
        String.valueOf(fileDescriptor);
        try {
            return new kly(new MediaMuxer(fileDescriptor, i));
        } catch (IOException e) {
            throw new jyp(i, e);
        }
    }
}
