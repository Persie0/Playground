package tl;

import java.util.Iterator;
import p100em.InterfaceC5429a;
import p260m8.C7499b;

/* JADX INFO: renamed from: tl.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C9323k implements Iterable<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object[] f48063a;

    public C9323k(Object[] objArr) {
        this.f48063a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return C7499b.m14931b0(this.f48063a);
    }
}
