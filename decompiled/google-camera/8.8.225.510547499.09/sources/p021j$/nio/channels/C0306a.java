package p021j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: j$.nio.channels.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0306a extends AbstractC0308c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AsynchronousFileChannel f32809b;

    private /* synthetic */ C0306a(AsynchronousFileChannel asynchronousFileChannel) {
        this.f32809b = asynchronousFileChannel;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AbstractC0308c m12060k(AsynchronousFileChannel asynchronousFileChannel) {
        if (asynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannel instanceof C0307b ? ((C0307b) asynchronousFileChannel).f32810a : new C0306a(asynchronousFileChannel);
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo12061b(boolean z) throws IOException {
        this.f32809b.force(z);
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Future mo12062c(long j, long j2, boolean z) {
        return this.f32809b.lock(j, j2, z);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f32809b.close();
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo12063d(long j, long j2, boolean z, Object obj, InterfaceC0311f interfaceC0311f) {
        this.f32809b.lock(j, j2, z, obj, C0310e.m12074a(interfaceC0311f));
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Future mo12064e(ByteBuffer byteBuffer, long j) {
        return this.f32809b.read(byteBuffer, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0306a) {
            obj = ((C0306a) obj).f32809b;
        }
        return this.f32809b.equals(obj);
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo12065f(ByteBuffer byteBuffer, long j, Object obj, InterfaceC0311f interfaceC0311f) {
        this.f32809b.read(byteBuffer, j, obj, C0310e.m12074a(interfaceC0311f));
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0308c mo12066g(long j) {
        return m12060k(this.f32809b.truncate(j));
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FileLock mo12067h(long j, long j2, boolean z) {
        return this.f32809b.tryLock(j, j2, z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32809b.hashCode();
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Future mo12068i(ByteBuffer byteBuffer, long j) {
        return this.f32809b.write(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f32809b.isOpen();
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo12069j(ByteBuffer byteBuffer, long j, Object obj, InterfaceC0311f interfaceC0311f) {
        this.f32809b.write(byteBuffer, j, obj, C0310e.m12074a(interfaceC0311f));
    }

    @Override // p021j$.nio.channels.AbstractC0308c
    public final /* synthetic */ long size() {
        return this.f32809b.size();
    }
}
