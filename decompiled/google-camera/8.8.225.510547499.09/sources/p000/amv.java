package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amv implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final amw f735a;

    /* JADX INFO: renamed from: b */
    private final amt f736b;

    public amv(amw amwVar, amt amtVar) {
        this.f735a = amwVar;
        this.f736b = amtVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m973a(String str, Object obj) {
        this.f736b.f731c.put(str, obj);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m974b(float f) {
        this.f736b.f731c.put("com.android.capture.fps", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m975c(float f, float f2) {
        this.f736b.f730b = new amu(f, f2);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f735a.close();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m976d(long j) {
        this.f736b.f732d = j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m977e(int i) {
        this.f736b.f729a = i;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized amy m978f(int i, MediaFormat mediaFormat) {
        amy amyVar;
        amw amwVar = this.f735a;
        amyVar = new amy((amz) amwVar, mediaFormat, i);
        ((amz) amwVar).f767a.add(amyVar);
        Collections.sort(((amz) amwVar).f767a, amx.f737a);
        return amyVar;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m979g(amy amyVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        lku.m15613H(amyVar instanceof amy);
        if ((bufferInfo.flags & 1) > 0) {
            amyVar.f765g = true;
        }
        if ((amyVar.f765g || !acm.m205d(amyVar.f759a)) && bufferInfo.size != 0) {
            amyVar.f764f.addLast(Pair.create(bufferInfo, byteBuffer));
            amz amzVar = amyVar.f766h;
            for (int i = 0; i < amzVar.f767a.size(); i++) {
                amy amyVar2 = (amy) amzVar.f767a.get(i);
                if (amyVar2.f764f.size() > 2 && ((MediaCodec.BufferInfo) ((Pair) amyVar2.f764f.peekLast()).first).presentationTimeUs - ((MediaCodec.BufferInfo) ((Pair) amyVar2.f764f.peekFirst()).first).presentationTimeUs > 1000000) {
                    amzVar.m985a(amyVar2);
                }
            }
        }
    }
}
