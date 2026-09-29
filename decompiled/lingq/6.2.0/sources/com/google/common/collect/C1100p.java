package com.google.common.collect;

import java.util.Iterator;
import p000.bga;
import p000.bna;
import p000.c09;
import p000.li7;
import p000.uk9;

/* JADX INFO: renamed from: com.google.common.collect.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1100p extends bga {

    /* JADX INFO: renamed from: b */
    public AbstractIterator$State f13477b;

    /* JADX INFO: renamed from: c */
    public Object f13478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f13479d;

    /* JADX INFO: renamed from: e */
    public final Iterator f13480e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f13481f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1100p(c09 c09Var) {
        this();
        this.f13479d = 1;
        this.f13481f = c09Var;
        this.f13480e = c09Var.f9291a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractIterator$State abstractIterator$State = this.f13477b;
        AbstractIterator$State abstractIterator$State2 = AbstractIterator$State.FAILED;
        bna.m3987z(abstractIterator$State != abstractIterator$State2);
        int iOrdinal = this.f13477b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f13477b = abstractIterator$State2;
            int i = this.f13479d;
            Object obj = null;
            Object obj2 = this.f13481f;
            Iterator it = this.f13480e;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.f13477b = AbstractIterator$State.DONE;
                            break;
                        } else {
                            next = it.next();
                            if (((li7) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.f13477b = AbstractIterator$State.DONE;
                            break;
                        } else {
                            next = it.next();
                            if (((c09) obj2).f9292b.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.f13478c = obj;
            if (this.f13477b != AbstractIterator$State.DONE) {
                this.f13477b = AbstractIterator$State.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        this.f13477b = AbstractIterator$State.NOT_READY;
        Object obj = this.f13478c;
        this.f13478c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1100p(Iterator it, li7 li7Var) {
        this();
        this.f13479d = 0;
        this.f13480e = it;
        this.f13481f = li7Var;
    }

    public C1100p() {
        super(0);
        this.f13477b = AbstractIterator$State.NOT_READY;
    }
}
