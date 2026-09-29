package jp;

import dm.C5207g;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import no.C7843k;
import no.InterfaceC7840j;
import p260m8.C7499b;
import retrofit2.HttpException;
import so.C9101s;

/* JADX INFO: renamed from: jp.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6542j implements InterfaceC6536d<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7840j f37221a;

    public C6542j(C7843k c7843k) {
        this.f37221a = c7843k;
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: a */
    public final void mo13129a(InterfaceC6534b<Object> interfaceC6534b, Throwable th2) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(th2, "t");
        this.f37221a.mo2031y(C7499b.m14967u(th2));
    }

    @Override // jp.InterfaceC6536d
    /* JADX INFO: renamed from: b */
    public final void mo13130b(InterfaceC6534b<Object> interfaceC6534b, C6553u<Object> c6553u) {
        C5207g.m11112g(interfaceC6534b, "call");
        C5207g.m11112g(c6553u, "response");
        boolean zM17350l = c6553u.f37338a.m17350l();
        InterfaceC7840j interfaceC7840j = this.f37221a;
        if (!zM17350l) {
            interfaceC7840j.mo2031y(C7499b.m14967u(new HttpException(c6553u)));
            return;
        }
        Object obj = c6553u.f37339b;
        if (obj != null) {
            interfaceC7840j.mo2031y(obj);
            return;
        }
        C9101s c9101sMo13125q = interfaceC6534b.mo13125q();
        c9101sMo13125q.getClass();
        Object objCast = C6541i.class.cast(c9101sMo13125q.f47546e.get(C6541i.class));
        if (objCast == null) {
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            C5207g.m11115j(C5207g.class.getName(), kotlinNullPointerException);
            throw kotlinNullPointerException;
        }
        StringBuilder sb2 = new StringBuilder("Response from ");
        Method method = ((C6541i) objCast).f37219a;
        C5207g.m11107b(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        C5207g.m11107b(declaringClass, "method.declaringClass");
        sb2.append(declaringClass.getName());
        sb2.append('.');
        sb2.append(method.getName());
        sb2.append(" was null but response body type was declared as non-null");
        interfaceC7840j.mo2031y(C7499b.m14967u(new KotlinNullPointerException(sb2.toString())));
    }
}
