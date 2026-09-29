package com.iterable.iterableapi;

import kotlin.jvm.internal.Lambda;
import p000.eh0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class IterableKeychain$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1213i f13975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IterableKeychain$1(C1213i c1213i) {
        super(1);
        this.f13975b = c1213i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            eh0.m11122S("IterableKeychain", "Migration failed", th);
            new Exception(th);
            this.f13975b.m6941a();
        }
        return xfa.f68157a;
    }
}
