package p000;

import android.content.Context;
import android.util.Log;
import com.google.common.p019io.ByteStreams;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvq implements nvr {

    /* JADX INFO: renamed from: a */
    public List f44769a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Graph f44770b;

    /* JADX INFO: renamed from: c */
    public AndroidPacketCreator f44771c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f44772d;

    /* JADX INFO: renamed from: e */
    public final Queue f44773e;

    /* JADX INFO: renamed from: f */
    private String f44774f;

    /* JADX INFO: renamed from: g */
    private String f44775g;

    public nvq(Context context, long j, String str) {
        new ArrayList();
        this.f44772d = new AtomicBoolean(false);
        this.f44773e = new ArrayDeque();
        try {
            this.f44770b = new Graph();
            if (new File(str).isAbsolute()) {
                this.f44770b.m5178d(str);
            } else {
                Graph graph = this.f44770b;
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str);
                    byte[] byteArray = ByteStreams.toByteArray(inputStreamOpen);
                    inputStreamOpen.close();
                    graph.m5179e(byteArray);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            Graph graph2 = this.f44770b;
            this.f44771c = new AndroidPacketCreator(graph2);
            this.f44774f = "input_video";
            this.f44775g = "output_video";
            graph2.m5180f(j);
            String str2 = this.f44775g;
            if (str2 != null) {
                this.f44770b.m5177c(str2, new nvp(this));
                this.f44770b.m5182h(this.f44775g);
            }
        } catch (MediaPipeException e2) {
            Log.e("FrameProcessor", "MediaPipe error: ", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    @Override // p000.nvr
    /* JADX INFO: renamed from: a */
    public final void mo6646a(TextureFrame textureFrame) throws Throwable {
        long timestamp = textureFrame.getTimestamp();
        Packet packet = null;
        try {
            long timestamp2 = textureFrame.getTimestamp();
            if (!this.f44772d.getAndSet(true)) {
                m17747b();
            }
            synchronized (this) {
                if (this.f44773e.size() >= 2) {
                    String.format("%d frames already in flight and max is %d; dropping new frame ts %d", Integer.valueOf(this.f44773e.size()), 2, Long.valueOf(timestamp2));
                    if (textureFrame != null) {
                        textureFrame.release();
                        return;
                    }
                    return;
                }
                this.f44773e.add(Long.valueOf(timestamp2));
                AndroidPacketCreator androidPacketCreator = this.f44771c;
                Packet packetCreate = Packet.create(androidPacketCreator.nativeCreateGpuBuffer(androidPacketCreator.f8432a.m5175a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
                try {
                    try {
                        this.f44770b.m5176b(this.f44774f, packetCreate, timestamp);
                    } catch (MediaPipeException e) {
                        Log.e("FrameProcessor", "Mediapipe error: ", e);
                        packet = packetCreate;
                    }
                    if (packet != null) {
                        packet.release();
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    packet = packetCreate;
                    textureFrame = null;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (packet != null) {
                            packet.release();
                        }
                        if (textureFrame != null) {
                            textureFrame.release();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    packet = packetCreate;
                    textureFrame = null;
                    if (packet != null) {
                        packet.release();
                    }
                    if (textureFrame != null) {
                        textureFrame.release();
                    }
                    throw th;
                }
            }
        } catch (RuntimeException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17747b() {
        this.f44770b.m5181g();
    }
}
