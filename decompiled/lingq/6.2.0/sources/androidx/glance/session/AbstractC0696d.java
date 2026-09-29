package androidx.glance.session;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p000.C3386nv;
import p000.do7;
import p000.ej0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.glance.session.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0696d {

    /* JADX INFO: renamed from: a */
    public final String f6261a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f6262b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f6263c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final C3211a f6264d = do7.m10525a(Integer.MAX_VALUE, 6, null);

    public AbstractC0696d(String str) {
        this.f6261a = str;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: ClosedReceiveChannelException -> 0x0084, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x0084, blocks: (B:13:0x002c, B:22:0x0051, B:26:0x0063, B:28:0x006b, B:18:0x0040, B:21:0x0047), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (androidx.glance.appwidget.C0656d.m2224e((androidx.glance.appwidget.C0656d) r7, r2, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2492a(Context context, C0699g c0699g, ContinuationImpl continuationImpl) throws Throwable {
        Session$receiveEvents$1 session$receiveEvents$1;
        ej0 ej0Var;
        vi3 vi3Var;
        ej0 ej0Var2;
        Context context2;
        vi3 vi3Var2;
        vi3 vi3Var3;
        if (continuationImpl instanceof Session$receiveEvents$1) {
            session$receiveEvents$1 = (Session$receiveEvents$1) continuationImpl;
            int i = session$receiveEvents$1.f6140f;
            if ((i & Integer.MIN_VALUE) != 0) {
                session$receiveEvents$1.f6140f = i - Integer.MIN_VALUE;
            } else {
                session$receiveEvents$1 = new Session$receiveEvents$1(this, continuationImpl);
            }
        } else {
            session$receiveEvents$1 = new Session$receiveEvents$1(this, continuationImpl);
        }
        Object objM11164b = session$receiveEvents$1.f6138d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = session$receiveEvents$1.f6140f;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM11164b);
                C3211a c3211a = this.f6264d;
                c3211a.getClass();
                ej0Var = new ej0(c3211a);
                vi3Var2 = c0699g;
                session$receiveEvents$1.f6135a = context;
                session$receiveEvents$1.f6136b = vi3Var2;
                session$receiveEvents$1.f6137c = ej0Var;
                session$receiveEvents$1.f6140f = 1;
                objM11164b = ej0Var.m11164b(session$receiveEvents$1);
                if (objM11164b == coroutineSingletons) {
                    ej0 ej0Var3 = ej0Var;
                    context2 = context;
                    ej0Var2 = ej0Var3;
                    vi3Var = vi3Var2;
                    if (((Boolean) objM11164b).booleanValue()) {
                        Object objM11165c = ej0Var2.m11165c();
                        vi3Var.invoke(objM11165c);
                        session$receiveEvents$1.f6135a = context2;
                        session$receiveEvents$1.f6136b = vi3Var;
                        session$receiveEvents$1.f6137c = ej0Var2;
                        session$receiveEvents$1.f6140f = 2;
                    }
                    return xfa.f68157a;
                }
                vi3Var3 = vi3Var;
                return coroutineSingletons;
            }
            if (i2 == 1) {
                ej0Var2 = session$receiveEvents$1.f6137c;
                vi3 vi3Var4 = session$receiveEvents$1.f6136b;
                context2 = session$receiveEvents$1.f6135a;
                AbstractC3193b.m15359b(objM11164b);
                vi3Var = vi3Var4;
                if (((Boolean) objM11164b).booleanValue()) {
                    Object objM11165c2 = ej0Var2.m11165c();
                    vi3Var.invoke(objM11165c2);
                    session$receiveEvents$1.f6135a = context2;
                    session$receiveEvents$1.f6136b = vi3Var;
                    session$receiveEvents$1.f6137c = ej0Var2;
                    session$receiveEvents$1.f6140f = 2;
                }
                return xfa.f68157a;
            }
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ej0Var2 = session$receiveEvents$1.f6137c;
            vi3 vi3Var5 = session$receiveEvents$1.f6136b;
            context2 = session$receiveEvents$1.f6135a;
            AbstractC3193b.m15359b(objM11164b);
            vi3Var3 = vi3Var5;
            vi3Var3 = vi3Var;
            Context context3 = context2;
            ej0Var = ej0Var2;
            context = context3;
            vi3Var2 = vi3Var3;
            session$receiveEvents$1.f6135a = context;
            session$receiveEvents$1.f6136b = vi3Var2;
            session$receiveEvents$1.f6137c = ej0Var;
            session$receiveEvents$1.f6140f = 1;
            objM11164b = ej0Var.m11164b(session$receiveEvents$1);
            if (objM11164b == coroutineSingletons) {
                ej0 ej0Var4 = ej0Var;
                context2 = context;
                ej0Var2 = ej0Var4;
                vi3Var = vi3Var2;
                if (((Boolean) objM11164b).booleanValue()) {
                    Object objM11165c3 = ej0Var2.m11165c();
                    vi3Var.invoke(objM11165c3);
                    session$receiveEvents$1.f6135a = context2;
                    session$receiveEvents$1.f6136b = vi3Var;
                    session$receiveEvents$1.f6137c = ej0Var2;
                    session$receiveEvents$1.f6140f = 2;
                }
                return xfa.f68157a;
            }
            vi3Var3 = vi3Var;
            return coroutineSingletons;
        } catch (ClosedReceiveChannelException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2493b(Object obj, ContinuationImpl continuationImpl) {
        Object objMo4678m = this.f6264d.mo4678m(obj, continuationImpl);
        return objMo4678m == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4678m : xfa.f68157a;
    }
}
