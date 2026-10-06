package p000;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lbr implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lby f37888a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f37889b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ByteBuffer f37890c;

    public lbr(lby lbyVar, int i, ByteBuffer byteBuffer) {
        this.f37888a = lbyVar;
        this.f37889b = i;
        this.f37890c = byteBuffer;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f37888a.mo15153e();
        int i = this.f37889b;
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        ldh ldhVar = new ldh(iArr[0], i);
        ByteBuffer byteBuffer = this.f37890c;
        ldhVar.m15201b();
        GLES20.glBufferData(ldhVar.f37980a, byteBuffer.limit(), byteBuffer, 35044);
        return ldhVar;
    }

    public final String toString() {
        return "createBufferWithStaticData(" + this.f37889b + "," + this.f37890c.remaining() + ")";
    }
}
