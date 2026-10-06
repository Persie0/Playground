package p021j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: j$.nio.channels.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0307b extends AsynchronousFileChannel {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0308c f32810a;

    private /* synthetic */ C0307b(AbstractC0308c abstractC0308c) {
        this.f32810a = abstractC0308c;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AsynchronousFileChannel m12070b(AbstractC0308c abstractC0308c) {
        if (abstractC0308c == null) {
            return null;
        }
        return abstractC0308c instanceof C0306a ? ((C0306a) abstractC0308c).f32809b : new C0307b(abstractC0308c);
    }

    @Override // java.nio.channels.AsynchronousChannel, java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        ((C0306a) this.f32810a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0308c abstractC0308c = this.f32810a;
        if (obj instanceof C0307b) {
            obj = ((C0307b) obj).f32810a;
        }
        return abstractC0308c.equals(obj);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void force(boolean z) {
        this.f32810a.mo12061b(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32810a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return ((C0306a) this.f32810a).isOpen();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future lock(long j, long j2, boolean z) {
        return this.f32810a.mo12062c(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future read(ByteBuffer byteBuffer, long j) {
        return this.f32810a.mo12064e(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ long size() {
        return this.f32810a.size();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ AsynchronousFileChannel truncate(long j) {
        return m12070b(this.f32810a.mo12066g(j));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ FileLock tryLock(long j, long j2, boolean z) {
        return this.f32810a.mo12067h(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future write(ByteBuffer byteBuffer, long j) {
        return this.f32810a.mo12068i(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void lock(long j, long j2, boolean z, Object obj, CompletionHandler completionHandler) {
        this.f32810a.mo12063d(j, j2, z, obj, C0309d.m12071b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void read(ByteBuffer byteBuffer, long j, Object obj, CompletionHandler completionHandler) {
        this.f32810a.mo12065f(byteBuffer, j, obj, C0309d.m12071b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void write(ByteBuffer byteBuffer, long j, Object obj, CompletionHandler completionHandler) {
        this.f32810a.mo12069j(byteBuffer, j, obj, C0309d.m12071b(completionHandler));
    }
}
