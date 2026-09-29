package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class t80 implements InterfaceC0828bz {

    /* JADX INFO: renamed from: b */
    public C3850zy f61967b;

    /* JADX INFO: renamed from: c */
    public C3850zy f61968c;

    /* JADX INFO: renamed from: d */
    public C3850zy f61969d;

    /* JADX INFO: renamed from: e */
    public C3850zy f61970e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f61971f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f61972g;

    /* JADX INFO: renamed from: h */
    public boolean f61973h;

    public t80() {
        ByteBuffer byteBuffer = InterfaceC0828bz.f9188a;
        this.f61971f = byteBuffer;
        this.f61972g = byteBuffer;
        C3850zy c3850zy = C3850zy.f72365e;
        this.f61969d = c3850zy;
        this.f61970e = c3850zy;
        this.f61967b = c3850zy;
        this.f61968c = c3850zy;
    }

    /* JADX INFO: renamed from: a */
    public abstract C3850zy mo11768a(C3850zy c3850zy);

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: b */
    public boolean mo4227b() {
        return this.f61970e != C3850zy.f72365e;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: c */
    public boolean mo4228c() {
        return this.f61973h && this.f61972g == InterfaceC0828bz.f9188a;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: d */
    public ByteBuffer mo4229d() {
        ByteBuffer byteBuffer = this.f61972g;
        this.f61972g = InterfaceC0828bz.f9188a;
        return byteBuffer;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: e */
    public final void mo4230e(C0791az c0791az) {
        this.f61972g = InterfaceC0828bz.f9188a;
        this.f61973h = false;
        this.f61967b = this.f61969d;
        this.f61968c = this.f61970e;
        mo11769j();
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: g */
    public final C3850zy mo4232g(C3850zy c3850zy) {
        this.f61969d = c3850zy;
        this.f61970e = mo11768a(c3850zy);
        return mo4227b() ? this.f61970e : C3850zy.f72365e;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: h */
    public final void mo4233h() {
        this.f61973h = true;
        mo11770k();
    }

    /* JADX INFO: renamed from: j */
    public void mo11769j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo11770k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo11771l() {
    }

    /* JADX INFO: renamed from: m */
    public final ByteBuffer m21900m(int i) {
        if (this.f61971f.capacity() < i) {
            this.f61971f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f61971f.clear();
        }
        ByteBuffer byteBuffer = this.f61971f;
        this.f61972g = byteBuffer;
        return byteBuffer;
    }

    @Override // p000.InterfaceC0828bz
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC0828bz.f9188a;
        this.f61972g = byteBuffer;
        this.f61973h = false;
        this.f61971f = byteBuffer;
        C3850zy c3850zy = C3850zy.f72365e;
        this.f61969d = c3850zy;
        this.f61970e = c3850zy;
        this.f61967b = c3850zy;
        this.f61968c = c3850zy;
        mo11771l();
    }
}
