package p021j$.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;
import p021j$.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: j$.nio.channels.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0308c implements Channel {

    /* JADX INFO: renamed from: a */
    private static final FileAttribute[] f32811a = new FileAttribute[0];

    protected AbstractC0308c() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12061b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract Future mo12062c(long j, long j2, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo12063d(long j, long j2, boolean z, Object obj, InterfaceC0311f interfaceC0311f);

    /* JADX INFO: renamed from: e */
    public abstract Future mo12064e(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: f */
    public abstract void mo12065f(ByteBuffer byteBuffer, long j, Object obj, InterfaceC0311f interfaceC0311f);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC0308c mo12066g(long j);

    /* JADX INFO: renamed from: h */
    public abstract FileLock mo12067h(long j, long j2, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract Future mo12068i(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: j */
    public abstract void mo12069j(ByteBuffer byteBuffer, long j, Object obj, InterfaceC0311f interfaceC0311f);

    public abstract long size();
}
