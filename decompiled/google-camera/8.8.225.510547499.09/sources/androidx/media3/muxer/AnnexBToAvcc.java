package androidx.media3.muxer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AnnexBToAvcc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1537a = 0;

    static {
        System.loadLibrary("annexbtoavcc");
    }

    public static native void processNative(ByteBuffer byteBuffer, int i);
}
