package p000;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class leo implements leu {

    /* JADX INFO: renamed from: a */
    public long f38066a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteBuffer f38067b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f38068c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ les f38069d;

    public leo(les lesVar, ByteBuffer byteBuffer, int i) {
        this.f38069d = lesVar;
        this.f38067b = byteBuffer;
        this.f38068c = i;
    }

    @Override // p000.leu
    /* JADX INFO: renamed from: a */
    public final int mo15257a() {
        return this.f38068c;
    }

    @Override // p000.leu
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo15258b() {
        return this.f38067b;
    }

    @Override // p000.leu, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f38069d) {
            if (this.f38069d.f38089k.remove(this)) {
                try {
                    this.f38069d.f38079a.queueInputBuffer(this.f38068c, 0, this.f38067b.position(), this.f38066a, 0);
                } catch (MediaCodec.CodecException e) {
                    les lesVar = this.f38069d;
                    lesVar.f38088j.onError(lesVar.f38079a, e);
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception caught while attempting to queue input buffer.", th);
                }
            } else {
                Log.w("AsynchMediaCodec", "Trying to submit input buffer for timestamp " + this.f38066a + " but it has been closed already (... or the codec was stopped)");
            }
        }
    }
}
