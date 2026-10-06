package p000;

import android.util.Log;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nvp implements PacketCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nvq f44768a;

    public nvp(nvq nvqVar) {
        this.f44768a = nvqVar;
    }

    @Override // com.google.mediapipe.framework.PacketCallback
    public final void process(Packet packet) {
        List list;
        synchronized (this) {
            Long l = (Long) this.f44768a.f44773e.poll();
            if (l == null || l.longValue() != packet.m5183a()) {
                Log.w("FrameProcessor", String.format("WARNING: output timestamp was %d, but expected %d. if output frames are skipped, in-flight accounting will break", Long.valueOf(packet.m5183a()), l));
            }
            list = this.f44768a.f44769a;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((nvr) it.next()).mo6646a(new GraphTextureFrame(PacketGetter.nativeGetGpuBuffer(packet.getNativeHandle(), true), packet.m5183a()));
        }
    }
}
