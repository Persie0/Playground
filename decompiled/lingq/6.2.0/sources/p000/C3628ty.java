package p000;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C0713b;

/* JADX INFO: renamed from: ty */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628ty {

    /* JADX INFO: renamed from: a */
    public final C0713b f63075a;

    /* JADX INFO: renamed from: b */
    public C3476px f63076b;

    /* JADX INFO: renamed from: c */
    public AudioDeviceInfo f63077c;

    /* JADX INFO: renamed from: d */
    public boolean f63078d;

    /* JADX INFO: renamed from: e */
    public int f63079e;

    /* JADX INFO: renamed from: f */
    public int f63080f;

    /* JADX INFO: renamed from: g */
    public boolean f63081g;

    /* JADX INFO: renamed from: h */
    public int f63082h;

    public C3628ty(C3628ty c3628ty) {
        this.f63075a = c3628ty.f63075a;
        this.f63076b = c3628ty.f63076b;
        this.f63077c = c3628ty.f63077c;
        this.f63078d = c3628ty.f63078d;
        this.f63079e = c3628ty.f63079e;
        this.f63080f = c3628ty.f63080f;
        this.f63081g = c3628ty.f63081g;
        this.f63082h = c3628ty.f63082h;
    }

    /* JADX INFO: renamed from: a */
    public C3628ty m22341a() {
        return new C3628ty(this);
    }

    /* JADX INFO: renamed from: b */
    public void m22342b(C3476px c3476px) {
        this.f63076b = c3476px;
    }

    /* JADX INFO: renamed from: c */
    public void m22343c(int i) {
        this.f63079e = i;
    }

    /* JADX INFO: renamed from: d */
    public void m22344d(boolean z) {
        this.f63078d = z;
    }

    /* JADX INFO: renamed from: e */
    public void m22345e(boolean z) {
        this.f63081g = z;
    }

    /* JADX INFO: renamed from: f */
    public void m22346f() {
        this.f63082h = -1;
    }

    /* JADX INFO: renamed from: g */
    public void m22347g(AudioDeviceInfo audioDeviceInfo) {
        this.f63077c = audioDeviceInfo;
    }

    /* JADX INFO: renamed from: h */
    public void m22348h(int i) {
        this.f63080f = i;
    }

    public C3628ty(C0713b c0713b) {
        this.f63075a = c0713b;
        this.f63076b = C3476px.f56934c;
        this.f63079e = 0;
        this.f63080f = -1;
        this.f63082h = -1;
    }
}
