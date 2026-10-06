package com.google.mediapipe.framework;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PacketCreator {

    /* JADX INFO: renamed from: a */
    public final Graph f8432a;

    public PacketCreator(Graph graph) {
        this.f8432a = graph;
    }

    private void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(j));
    }

    public native long nativeCreateGpuBuffer(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    public native long nativeCreateProto(long j, ProtoUtil$SerializedMessage protoUtil$SerializedMessage);
}
