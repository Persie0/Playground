package p307oo;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import no.InterfaceC7878x;
import p464wl.AbstractC9966a;

/* JADX INFO: renamed from: oo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8098b extends AbstractC9966a implements InterfaceC7878x {
    private volatile Object _preHandler;

    public C8098b() {
        super(InterfaceC7878x.a.f42977a);
        this._preHandler = this;
    }

    @Override // no.InterfaceC7878x
    /* JADX INFO: renamed from: p1 */
    public void mo2598p1(CoroutineContext coroutineContext, Throwable th2) {
        Method declaredMethod;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj != this) {
                declaredMethod = (Method) obj;
            } else {
                try {
                    declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                    if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                        z10 = false;
                    }
                    if (!z10) {
                        declaredMethod = null;
                    }
                } catch (Throwable unused) {
                }
                this._preHandler = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, new Object[0]) : null;
            if (objInvoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) objInvoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
