package p021j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.nio.file.r */
/* JADX INFO: loaded from: classes3.dex */
final class C0402r implements Iterator {

    /* JADX INFO: renamed from: a */
    private int f32887a = 0;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Path f32888b;

    C0402r(Path path) {
        this.f32888b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32887a < this.f32888b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f32887a;
        Path path = this.f32888b;
        if (i >= path.getNameCount()) {
            throw new NoSuchElementException();
        }
        Path name = path.getName(this.f32887a);
        this.f32887a++;
        return name;
    }
}
