package p457wd;

/* JADX INFO: renamed from: wd.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9907h {

    /* JADX INFO: renamed from: a */
    public final C9910k f50541a = new C9910k();

    /* JADX INFO: renamed from: a */
    public final void m18407a(Exception exc) {
        C9910k c9910k = this.f50541a;
        synchronized (c9910k.f50543a) {
            if (c9910k.f50545c) {
                return;
            }
            c9910k.f50545c = true;
            c9910k.f50547e = exc;
            c9910k.f50544b.m12895c(c9910k);
        }
    }
}
