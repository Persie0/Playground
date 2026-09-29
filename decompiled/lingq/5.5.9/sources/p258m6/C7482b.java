package p258m6;

import p326q.C8446b;

/* JADX INFO: renamed from: m6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7482b<K, V> extends C8446b<K, V> {

    /* JADX INFO: renamed from: i */
    public int f41362i;

    @Override // p326q.C8452h, java.util.Map
    public final void clear() {
        this.f41362i = 0;
        super.clear();
    }

    @Override // p326q.C8452h, java.util.Map
    public final int hashCode() {
        if (this.f41362i == 0) {
            this.f41362i = super.hashCode();
        }
        return this.f41362i;
    }

    @Override // p326q.C8452h
    /* JADX INFO: renamed from: i */
    public final void mo14868i(C8446b c8446b) {
        this.f41362i = 0;
        super.mo14868i(c8446b);
    }

    @Override // p326q.C8452h
    /* JADX INFO: renamed from: k */
    public final V mo14869k(int i10) {
        this.f41362i = 0;
        return (V) super.mo14869k(i10);
    }

    @Override // p326q.C8452h
    /* JADX INFO: renamed from: l */
    public final V mo14870l(int i10, V v10) {
        this.f41362i = 0;
        return (V) super.mo14870l(i10, v10);
    }

    @Override // p326q.C8452h, java.util.Map
    public final V put(K k10, V v10) {
        this.f41362i = 0;
        return (V) super.put(k10, v10);
    }
}
