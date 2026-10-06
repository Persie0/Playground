package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awb implements awa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Method f2571a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2572b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f2573c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f2574d;

    public awb(Method method, Object obj, Object obj2, int i) {
        this.f2574d = i;
        this.f2571a = method;
        this.f2572b = obj;
        this.f2573c = obj2;
    }

    @Override // p000.awa
    /* JADX INFO: renamed from: a */
    public final void mo2068a() throws IllegalAccessException, InvocationTargetException {
        switch (this.f2574d) {
            case 0:
                this.f2571a.invoke(this.f2572b, this.f2573c);
                break;
            case 1:
                this.f2571a.invoke(this.f2572b, this.f2573c);
                break;
            default:
                this.f2571a.invoke(this.f2572b, this.f2573c);
                break;
        }
    }
}
