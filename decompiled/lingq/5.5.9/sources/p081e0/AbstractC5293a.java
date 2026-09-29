package p081e0;

import java.util.ArrayList;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5293a<T> implements InterfaceC5299c<T> {

    /* JADX INFO: renamed from: a */
    public final T f33563a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f33564b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public T f33565c;

    public AbstractC5293a(T t10) {
        this.f33563a = t10;
        this.f33565c = t10;
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: b */
    public final void mo11430b(T t10) {
        this.f33564b.add(this.f33565c);
        this.f33565c = t10;
    }

    @Override // p081e0.InterfaceC5299c
    public final void clear() {
        this.f33564b.clear();
        this.f33565c = this.f33563a;
        mo11433i();
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: e */
    public final void mo11431e() {
        ArrayList arrayList = this.f33564b;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f33565c = (T) arrayList.remove(arrayList.size() - 1);
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: h */
    public final T mo11432h() {
        return this.f33565c;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo11433i();
}
