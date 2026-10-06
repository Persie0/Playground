package p021j$.util.stream;

import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.y0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0722y0 extends AbstractC0725z0 {

    /* JADX INFO: renamed from: h */
    private final Object[] f33531h;

    C0722y0(Spliterator spliterator, AbstractC0586F abstractC0586F, Object[] objArr) {
        super(objArr.length, spliterator, abstractC0586F);
        this.f33531h = objArr;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33538f;
        if (i >= this.f33539g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33538f));
        }
        Object[] objArr = this.f33531h;
        this.f33538f = i + 1;
        objArr[i] = obj;
    }

    @Override // p021j$.util.stream.AbstractC0725z0
    /* JADX INFO: renamed from: b */
    final AbstractC0725z0 mo12743b(Spliterator spliterator, long j, long j2) {
        return new C0722y0(this, spliterator, j, j2);
    }

    C0722y0(C0722y0 c0722y0, Spliterator spliterator, long j, long j2) {
        super(c0722y0, spliterator, j, j2, c0722y0.f33531h.length);
        this.f33531h = c0722y0.f33531h;
    }
}
