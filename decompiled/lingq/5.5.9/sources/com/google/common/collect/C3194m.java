package com.google.common.collect;

import java.util.Iterator;
import p482xd.InterfaceC10173e;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3194m extends AbstractIterator<Object> {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Iterator f16163c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC10173e f16164d;

    public C3194m(Iterator it, InterfaceC10173e interfaceC10173e) {
        this.f16163c = it;
        this.f16164d = interfaceC10173e;
    }

    @Override // com.google.common.collect.AbstractIterator
    /* JADX INFO: renamed from: a */
    public final Object mo9017a() {
        Object next;
        do {
            Iterator it = this.f16163c;
            if (!it.hasNext()) {
                this.f15981a = AbstractIterator.State.DONE;
                return null;
            }
            next = it.next();
        } while (!this.f16164d.apply(next));
        return next;
    }
}
