package kotlin.coroutines.jvm.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.C10225d;
import p490xl.InterfaceC10223b;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lwl/c;", "", "Lxl/b;", "Ljava/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class BaseContinuationImpl implements InterfaceC9968c<Object>, InterfaceC10223b, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<Object> f38104a;

    public BaseContinuationImpl(InterfaceC9968c<Object> interfaceC9968c) {
        this.f38104a = interfaceC9968c;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        C5207g.m11111f(interfaceC9968c, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public InterfaceC10223b mo13473d() {
        InterfaceC9968c<Object> interfaceC9968c = this.f38104a;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        C5207g.m11111f(interfaceC9968c, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object objMo13474w = mo13474w();
        if (objMo13474w == null) {
            objMo13474w = getClass().getName();
        }
        sb2.append(objMo13474w);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public StackTraceElement mo13474w() {
        int iIntValue;
        String strM19205c;
        InterfaceC10224c interfaceC10224c = (InterfaceC10224c) getClass().getAnnotation(InterfaceC10224c.class);
        String str = null;
        if (interfaceC10224c == null) {
            return null;
        }
        int iM19209v = interfaceC10224c.m19209v();
        if (iM19209v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM19209v + ". Please update the Kotlin standard library.").toString());
        }
        int i10 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        if (iIntValue >= 0) {
            i10 = interfaceC10224c.m19207l()[iIntValue];
        }
        C10225d.a aVar = C10225d.f51643b;
        C10225d.a aVar2 = C10225d.f51642a;
        if (aVar == null) {
            try {
                C10225d.a aVar3 = new C10225d.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                C10225d.f51643b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                C10225d.f51643b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2) {
            Method method = aVar.f51644a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = aVar.f51645b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = aVar.f51646c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strM19205c = interfaceC10224c.m19205c();
        } else {
            strM19205c = str + '/' + interfaceC10224c.m19205c();
        }
        return new StackTraceElement(strM19205c, interfaceC10224c.m19208m(), interfaceC10224c.m19206f(), i10);
    }

    /* JADX INFO: renamed from: x */
    public abstract Object mo1338x(Object obj);

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        InterfaceC9968c<Object> interfaceC9968c = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) interfaceC9968c;
            InterfaceC9968c<Object> interfaceC9968c2 = baseContinuationImpl.f38104a;
            C5207g.m11108c(interfaceC9968c2);
            try {
                obj = baseContinuationImpl.mo1338x(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = C7499b.m14967u(th2);
            }
            baseContinuationImpl.mo13475z();
            if (!(interfaceC9968c2 instanceof BaseContinuationImpl)) {
                interfaceC9968c2.mo2031y(obj);
                return;
            }
            interfaceC9968c = interfaceC9968c2;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo13475z() {
    }
}
