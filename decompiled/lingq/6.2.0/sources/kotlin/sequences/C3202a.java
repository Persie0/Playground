package kotlin.sequences;

import java.util.Iterator;
import p000.tg4;
import p000.uk9;

/* JADX INFO: renamed from: kotlin.sequences.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3202a implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final Iterator f47721a;

    /* JADX INFO: renamed from: b */
    public Iterator f47722b;

    /* JADX INFO: renamed from: c */
    public int f47723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3203b f47724d;

    public C3202a(C3203b c3203b) {
        this.f47724d = c3203b;
        this.f47721a = ((Iterable) c3203b.f47725a.f71218b).iterator();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15412a() {
        Iterator it;
        Iterator it2 = this.f47722b;
        if (it2 != null && it2.hasNext()) {
            this.f47723c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f47721a;
            if (!it3.hasNext()) {
                this.f47723c = 2;
                this.f47722b = null;
                return false;
            }
            it = (Iterator) SequencesKt___SequencesKt$flatMap$2.f47720i.invoke(this.f47724d.f47726b.invoke(it3.next()));
        } while (!it.hasNext());
        this.f47722b = it;
        this.f47723c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f47723c;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return m15412a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f47723c;
        if (i == 2) {
            uk9.m22784s();
            return null;
        }
        if (i == 0 && !m15412a()) {
            uk9.m22784s();
            return null;
        }
        this.f47723c = 0;
        Iterator it = this.f47722b;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
