package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e66 implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36758a;

    /* JADX INFO: renamed from: b */
    public final List f36759b;

    /* JADX INFO: renamed from: c */
    public int f36760c;

    public e66(int i, int i2, List list) {
        this.f36758a = i2;
        switch (i2) {
            case 1:
                this.f36759b = list;
                this.f36760c = i;
                break;
            default:
                this.f36759b = list;
                this.f36760c = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                int i2 = this.f36760c + 1;
                this.f36760c = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f36760c, obj);
                this.f36760c++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                return this.f36760c < list.size() - 1;
            default:
                return this.f36760c < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f36758a) {
            case 0:
                return this.f36760c >= 0;
            default:
                return this.f36760c > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                int i2 = this.f36760c + 1;
                this.f36760c = i2;
                return list.get(i2);
            default:
                int i3 = this.f36760c;
                this.f36760c = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f36758a) {
            case 0:
                return this.f36760c + 1;
            default:
                return this.f36760c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                int i2 = this.f36760c;
                this.f36760c = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f36760c - 1;
                this.f36760c = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f36758a) {
            case 0:
                return this.f36760c;
            default:
                return this.f36760c - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                list.remove(this.f36760c);
                this.f36760c--;
                break;
            default:
                int i2 = this.f36760c - 1;
                this.f36760c = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f36758a;
        List list = this.f36759b;
        switch (i) {
            case 0:
                list.set(this.f36760c, obj);
                break;
            default:
                list.set(this.f36760c, obj);
                break;
        }
    }
}
