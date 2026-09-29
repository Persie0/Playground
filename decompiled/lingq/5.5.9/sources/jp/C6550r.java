package jp;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: jp.r */
/* JADX INFO: loaded from: classes2.dex */
public class C6550r {

    /* JADX INFO: renamed from: c */
    public static final C6550r f37283c;

    /* JADX INFO: renamed from: a */
    public final boolean f37284a = true;

    /* JADX INFO: renamed from: b */
    public final Constructor<MethodHandles.Lookup> f37285b;

    /* JADX INFO: renamed from: jp.r$a */
    public static final class a extends C6550r {

        /* JADX INFO: renamed from: jp.r$a$a, reason: collision with other inner class name */
        public static final class ExecutorC10644a implements Executor {

            /* JADX INFO: renamed from: a */
            public final Handler f37286a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f37286a.post(runnable);
            }
        }

        @Override // jp.C6550r
        /* JADX INFO: renamed from: a */
        public final Executor mo13140a() {
            return new ExecutorC10644a();
        }

        @Override // jp.C6550r
        /* JADX INFO: renamed from: b */
        public final Object mo13141b(Class cls, Object obj, Method method, Object... objArr) throws Throwable {
            return super.mo13141b(cls, obj, method, objArr);
        }
    }

    static {
        f37283c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C6550r();
    }

    public C6550r() {
        Constructor<MethodHandles.Lookup> declaredConstructor;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            try {
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            declaredConstructor = null;
        }
        this.f37285b = declaredConstructor;
    }

    /* JADX INFO: renamed from: a */
    public Executor mo13140a() {
        return null;
    }

    @IgnoreJRERequirement
    /* JADX INFO: renamed from: b */
    public Object mo13141b(Class cls, Object obj, Method method, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f37285b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
