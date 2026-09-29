package io;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: io.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6375b<T> implements Iterable<T>, InterfaceC5429a {
    /* JADX INFO: renamed from: a */
    public abstract int mo13006a();

    /* JADX INFO: renamed from: f */
    public abstract void mo13007f(int i10, T t10);

    public abstract T get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
