package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: bz */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0828bz {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f9188a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: b */
    boolean mo4227b();

    /* JADX INFO: renamed from: c */
    boolean mo4228c();

    /* JADX INFO: renamed from: d */
    ByteBuffer mo4229d();

    /* JADX INFO: renamed from: e */
    void mo4230e(C0791az c0791az);

    /* JADX INFO: renamed from: f */
    void mo4231f(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: g */
    C3850zy mo4232g(C3850zy c3850zy);

    /* JADX INFO: renamed from: h */
    void mo4233h();

    /* JADX INFO: renamed from: i */
    default long mo4234i(long j) {
        return j;
    }

    void reset();
}
