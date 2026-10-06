package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gry extends gsc {
    @Override // p000.gsc
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo9690a(Object obj) {
        return ByteBuffer.allocateDirect(((Integer) obj).intValue());
    }

    @Override // p000.gsc
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ Object mo9691b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.rewind();
        byteBuffer.limit(byteBuffer.capacity());
        return byteBuffer;
    }
}
