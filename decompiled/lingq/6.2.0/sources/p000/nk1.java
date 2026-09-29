package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class nk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f52874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52876c;

    public nk1(Method method, Object obj, Object obj2) {
        this.f52874a = method;
        this.f52875b = obj;
        this.f52876c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final void m17478a() throws IllegalAccessException, InvocationTargetException {
        this.f52874a.invoke(this.f52875b, this.f52876c);
    }
}
