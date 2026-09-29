package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.bb0;
import p000.c32;
import p000.cd4;
import p000.ho8;
import p000.ii0;
import p000.ni0;
import p000.r60;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m4291f = "ContentInViewNode.kt", m4292l = {212}, m4293m = "invokeSuspend", m4294v = 1)
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1841a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0098f f1843c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0119y f1844d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ni0 f1845e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1846f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m4291f = "ContentInViewNode.kt", m4292l = {219}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f1847a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f1848b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0119y f1849c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0098f f1850d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ni0 f1851e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f1852f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ cd4 f1853g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00841(C0119y c0119y, C0098f c0098f, ni0 ni0Var, long j, cd4 cd4Var, Continuation continuation) {
            super(2, continuation);
            this.f1849c = c0119y;
            this.f1850d = c0098f;
            this.f1851e = ni0Var;
            this.f1852f = j;
            this.f1853g = cd4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00841 c00841 = new C00841(this.f1849c, this.f1850d, this.f1851e, this.f1852f, this.f1853g, continuation);
            c00841.f1848b = obj;
            return c00841;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00841) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1847a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                ho8 ho8Var = (ho8) this.f1848b;
                long j = this.f1852f;
                C0098f c0098f = this.f1850d;
                ni0 ni0Var = this.f1851e;
                float fM855Z0 = C0098f.m855Z0(c0098f, ni0Var, j);
                C0119y c0119y = this.f1849c;
                c0119y.f2381e = fM855Z0;
                bb0 bb0Var = new bb0(c0098f, c0119y, this.f1853g, ho8Var);
                r60 r60Var = new r60(c0098f, c0119y, ni0Var, 3);
                this.f1847a = 1;
                if (c0119y.m951a(bb0Var, r60Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(C0098f c0098f, C0119y c0119y, ni0 ni0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.f1843c = c0098f;
        this.f1844d = c0119y;
        this.f1845e = ni0Var;
        this.f1846f = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.f1843c, this.f1844d, this.f1845e, this.f1846f, continuation);
        contentInViewNode$launchAnimation$2.f1842b = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0098f c0098f = this.f1843c;
        ii0 ii0Var = c0098f.f2251O;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1841a;
        try {
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    cd4 cd4VarM15441h = AbstractC3208a.m15441h(((un1) this.f1842b).mo1309x());
                    c0098f.f2254R = true;
                    C0116v c0116v = c0098f.f2247K;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    C00841 c00841 = new C00841(this.f1844d, c0098f, this.f1845e, this.f1846f, cd4VarM15441h, null);
                    this.f1841a = 1;
                    if (c0116v.m934f(mutatePriority, c00841, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                ii0Var.m13937b();
                c0098f.f2254R = false;
                ii0Var.m13936a(null);
                c0098f.f2252P = false;
                return xfa.f68157a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            c0098f.f2254R = false;
            ii0Var.m13936a(null);
            c0098f.f2252P = false;
            throw th;
        }
    }
}
