package p000;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvp implements jzz {

    /* JADX INFO: renamed from: a */
    private final jzz f9812a;

    /* JADX INFO: renamed from: b */
    private final hli f9813b;

    public cvp(jzz jzzVar, hli hliVar) {
        this.f9812a = jzzVar;
        this.f9813b = hliVar;
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: A */
    public final synchronized void mo5583A(int i) {
        this.f9812a.mo5583A(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: B */
    public final synchronized void mo5584B(int i, int i2) {
        this.f9812a.mo5584B(i, i2);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: C */
    public final synchronized void mo5585C() {
        this.f9812a.mo5585C();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: D */
    public final synchronized void mo5586D() {
        this.f9812a.mo5586D();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: E */
    public final synchronized void mo5587E() {
        this.f9812a.mo5587E();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: a */
    public final MediaRecorder mo5588a() {
        return ((jzw) this.f9812a).f35432a;
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: b */
    public final synchronized Surface mo5589b() {
        return this.f9812a.mo5589b();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5590c() {
        this.f9812a.mo5590c();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: d */
    public final synchronized void mo5591d() {
        try {
            this.f9813b.m10437h(hlh.MEDIA_RECORDER_PREPARE_START);
            this.f9812a.mo5591d();
            this.f9813b.m10445c();
        } catch (Throwable th) {
            this.f9813b.m10445c();
            throw th;
        }
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: e */
    public final synchronized void mo5592e() {
        this.f9812a.mo5592e();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: f */
    public final synchronized void mo5593f() {
        this.f9812a.mo5593f();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: g */
    public final synchronized void mo5594g() {
        this.f9812a.mo5594g();
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: h */
    public final synchronized void mo5595h(int i) {
        this.f9812a.mo5595h(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5596i(int i) {
        this.f9812a.mo5596i(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: j */
    public final synchronized void mo5597j(int i) {
        this.f9812a.mo5597j(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: k */
    public final synchronized void mo5598k(int i) {
        this.f9812a.mo5598k(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: l */
    public final synchronized void mo5599l(int i) {
        this.f9812a.mo5599l(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: m */
    public final synchronized void mo5600m(double d) {
        this.f9812a.mo5600m(d);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: n */
    public final synchronized void mo5601n(Surface surface) {
        this.f9812a.mo5601n(surface);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: o */
    public final synchronized void mo5602o(float f, float f2) {
        this.f9812a.mo5602o(f, f2);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: p */
    public final synchronized void mo5603p(int i) {
        this.f9812a.mo5603p(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: q */
    public final synchronized void mo5604q(long j) {
        this.f9812a.mo5604q(j);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: r */
    public final void mo5605r(FileDescriptor fileDescriptor) {
        this.f9812a.mo5605r(fileDescriptor);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: s */
    public final synchronized void mo5606s(MediaRecorder.OnErrorListener onErrorListener) {
        this.f9812a.mo5606s(onErrorListener);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: t */
    public final synchronized void mo5607t(MediaRecorder.OnInfoListener onInfoListener) {
        this.f9812a.mo5607t(onInfoListener);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: u */
    public final synchronized void mo5608u(int i) {
        this.f9812a.mo5608u(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: v */
    public final synchronized void mo5609v(FileDescriptor fileDescriptor) {
        this.f9812a.mo5609v(fileDescriptor);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: w */
    public final synchronized void mo5610w(String str) {
        this.f9812a.mo5610w(str);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: x */
    public final synchronized void mo5611x(int i) {
        this.f9812a.mo5611x(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: y */
    public final synchronized void mo5612y(int i) {
        this.f9812a.mo5612y(i);
    }

    @Override // p000.jzz
    /* JADX INFO: renamed from: z */
    public final synchronized void mo5613z(int i) {
        this.f9812a.mo5613z(i);
    }
}
