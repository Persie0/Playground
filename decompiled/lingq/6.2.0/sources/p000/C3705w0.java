package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: loaded from: classes.dex */
public class C3705w0 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66154a;

    /* JADX INFO: renamed from: b */
    public int f66155b;

    /* JADX INFO: renamed from: c */
    public final Object f66156c;

    public C3705w0(Object[] objArr) {
        this.f66154a = 1;
        objArr.getClass();
        this.f66156c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f66154a;
        Object obj = this.f66156c;
        switch (i) {
            case 0:
                return this.f66155b < ((AbstractC3816z0) obj).mo3718d();
            case 1:
                return this.f66155b < ((Object[]) obj).length;
            case 2:
                return ((Iterator) obj).hasNext();
            case 3:
                return this.f66155b < ((pe9) obj).m19081e();
            default:
                return this.f66155b < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f66154a;
        Object obj = this.f66156c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    uk9.m22784s();
                    return null;
                }
                int i2 = this.f66155b;
                this.f66155b = i2 + 1;
                return ((AbstractC3816z0) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f66155b;
                    this.f66155b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f66155b--;
                    uk9.m22775i(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.f66155b;
                this.f66155b = i4 + 1;
                if (i4 >= 0) {
                    return new r34(i4, ((Iterator) obj).next());
                }
                vz1.m23628e0();
                throw null;
            case 3:
                int i5 = this.f66155b;
                this.f66155b = i5 + 1;
                return ((pe9) obj).m19082f(i5);
            default:
                int i6 = this.f66155b;
                this.f66155b = i6 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i6);
                if (childAt != null) {
                    return childAt;
                }
                v63.m23128b();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f66154a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f66156c;
                int i = this.f66155b - 1;
                this.f66155b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ C3705w0(Object obj, int i) {
        this.f66154a = i;
        this.f66156c = obj;
    }

    public C3705w0(Iterator it) {
        this.f66154a = 2;
        it.getClass();
        this.f66156c = it;
    }
}
