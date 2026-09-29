package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C0973d;
import com.google.android.gms.internal.mlkit_vision_text_common.C0974e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class dib implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35694a = 0;

    /* JADX INFO: renamed from: b */
    public final Iterator f35695b;

    /* JADX INFO: renamed from: c */
    public Object f35696c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractCollection f35697d;

    public dib(C0974e c0974e) {
        this.f35697d = c0974e;
        Collection collection = c0974e.f12029b;
        this.f35696c = collection;
        this.f35695b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m10407a() {
        C0974e c0974e = (C0974e) this.f35697d;
        c0974e.zzb();
        if (c0974e.f12029b == ((Collection) this.f35696c)) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35694a) {
            case 0:
                break;
            default:
                m10407a();
                break;
        }
        return this.f35695b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35694a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f35695b.next();
                this.f35696c = entry;
                return entry.getKey();
            default:
                m10407a();
                return this.f35695b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f35694a;
        AbstractCollection abstractCollection = this.f35697d;
        Iterator it = this.f35695b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f35696c;
                if (!(entry != null)) {
                    C3386nv.m17633t("no calls to next() since the last call to remove()");
                } else {
                    Collection collection = (Collection) entry.getValue();
                    it.remove();
                    ((C0973d) abstractCollection).f12027b.getClass();
                    collection.size();
                    collection.clear();
                    this.f35696c = null;
                }
                break;
            default:
                it.remove();
                ((C0974e) abstractCollection).m5472f();
                break;
        }
    }

    public dib(C0974e c0974e, ListIterator listIterator) {
        this.f35697d = c0974e;
        this.f35696c = c0974e.f12029b;
        this.f35695b = listIterator;
    }

    public dib(C0973d c0973d, Iterator it) {
        this.f35695b = it;
        this.f35697d = c0973d;
    }
}
