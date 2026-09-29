package mk;

import il.InterfaceC6355a;
import ml.C7637d;
import p346ql.C8642a;
import p371rl.InterfaceC8825a;

/* JADX INFO: renamed from: mk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7581d extends AbstractC7589f1 {

    /* JADX INFO: renamed from: a */
    public final C7633z0 f41848a;

    /* JADX INFO: renamed from: b */
    public final C7581d f41849b = this;

    /* JADX INFO: renamed from: c */
    public InterfaceC8825a<InterfaceC6355a> f41850c = C8642a.m16861a(new a());

    /* JADX INFO: renamed from: mk.d$a */
    public static final class a<T> implements InterfaceC8825a<T> {
        @Override // p371rl.InterfaceC8825a
        public final T get() {
            return (T) new C7637d();
        }
    }

    public C7581d(C7633z0 c7633z0) {
        this.f41848a = c7633z0;
    }

    @Override // dagger.hilt.android.internal.managers.C5116c.c
    /* JADX INFO: renamed from: a */
    public final InterfaceC6355a mo10896a() {
        return this.f41850c.get();
    }

    @Override // dagger.hilt.android.internal.managers.C5114a.a
    /* JADX INFO: renamed from: b */
    public final C7572a mo10894b() {
        return new C7572a(this.f41848a, this.f41849b);
    }
}
