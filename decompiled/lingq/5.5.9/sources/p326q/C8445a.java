package p326q;

import java.util.Map;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8445a extends AbstractC8451g<Object, Object> {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8446b f45575d;

    public C8445a(C8446b c8446b) {
        this.f45575d = c8446b;
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: a */
    public final void mo16493a() {
        this.f45575d.clear();
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: b */
    public final Object mo16494b(int i10, int i11) {
        return this.f45575d.f45618b[(i10 << 1) + i11];
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: c */
    public final Map<Object, Object> mo16495c() {
        return this.f45575d;
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: d */
    public final int mo16496d() {
        return this.f45575d.f45619c;
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: e */
    public final int mo16497e(Object obj) {
        return this.f45575d.m16526e(obj);
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: f */
    public final int mo16498f(Object obj) {
        return this.f45575d.m16528g(obj);
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: g */
    public final void mo16499g(Object obj, Object obj2) {
        this.f45575d.put(obj, obj2);
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: h */
    public final void mo16500h(int i10) {
        this.f45575d.mo14869k(i10);
    }

    @Override // p326q.AbstractC8451g
    /* JADX INFO: renamed from: i */
    public final Object mo16501i(int i10, Object obj) {
        return this.f45575d.mo14870l(i10, obj);
    }
}
