package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ob9 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54141a;

    /* JADX INFO: renamed from: b */
    public int f54142b;

    /* JADX INFO: renamed from: c */
    public boolean f54143c;

    /* JADX INFO: renamed from: d */
    public Iterator f54144d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractMap f54145e;

    public /* synthetic */ ob9(hjb hjbVar) {
        this.f54141a = 1;
        Objects.requireNonNull(hjbVar);
        this.f54145e = hjbVar;
        this.f54142b = -1;
    }

    /* JADX INFO: renamed from: a */
    public Iterator m17900a() {
        if (this.f54144d == null) {
            this.f54144d = ((kb9) this.f54145e).f46984c.entrySet().iterator();
        }
        return this.f54144d;
    }

    /* JADX INFO: renamed from: b */
    public Iterator m17901b() {
        if (this.f54144d == null) {
            this.f54144d = ((hjb) this.f54145e).f42509c.entrySet().iterator();
        }
        return this.f54144d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f54141a;
        AbstractMap abstractMap = this.f54145e;
        switch (i) {
            case 0:
                kb9 kb9Var = (kb9) abstractMap;
                if (this.f54142b + 1 >= kb9Var.f46983b.size()) {
                    return !kb9Var.f46984c.isEmpty() && m17900a().hasNext();
                }
                return true;
            default:
                hjb hjbVar = (hjb) abstractMap;
                if (this.f54142b + 1 >= hjbVar.f42508b) {
                    return !hjbVar.f42509c.isEmpty() && m17901b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f54141a;
        AbstractMap abstractMap = this.f54145e;
        switch (i) {
            case 0:
                this.f54143c = true;
                int i2 = this.f54142b + 1;
                this.f54142b = i2;
                kb9 kb9Var = (kb9) abstractMap;
                return i2 < kb9Var.f46983b.size() ? (Map.Entry) kb9Var.f46983b.get(this.f54142b) : (Map.Entry) m17900a().next();
            default:
                this.f54143c = true;
                int i3 = this.f54142b + 1;
                this.f54142b = i3;
                hjb hjbVar = (hjb) abstractMap;
                return i3 < hjbVar.f42508b ? (ijb) hjbVar.f42507a[i3] : (Map.Entry) m17901b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f54141a;
        AbstractMap abstractMap = this.f54145e;
        switch (i) {
            case 0:
                kb9 kb9Var = (kb9) abstractMap;
                if (!this.f54143c) {
                    C3386nv.m17633t("remove() was called before next()");
                } else {
                    this.f54143c = false;
                    int i2 = kb9.f46981g;
                    kb9Var.m15052b();
                    if (this.f54142b >= kb9Var.f46983b.size()) {
                        m17900a().remove();
                    } else {
                        int i3 = this.f54142b;
                        this.f54142b = i3 - 1;
                        kb9Var.m15057g(i3);
                    }
                }
                break;
            default:
                if (!this.f54143c) {
                    C3386nv.m17633t("remove() was called before next()");
                } else {
                    this.f54143c = false;
                    hjb hjbVar = (hjb) abstractMap;
                    hjbVar.m13300f();
                    int i4 = this.f54142b;
                    if (i4 >= hjbVar.f42508b) {
                        m17901b().remove();
                    } else {
                        this.f54142b = i4 - 1;
                        hjbVar.m13298d(i4);
                    }
                }
                break;
        }
    }

    public ob9(kb9 kb9Var) {
        this.f54141a = 0;
        this.f54145e = kb9Var;
        this.f54142b = -1;
    }
}
