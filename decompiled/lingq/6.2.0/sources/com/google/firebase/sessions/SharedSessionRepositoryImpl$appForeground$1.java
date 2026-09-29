package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.al7;
import p000.c32;
import p000.fa4;
import p000.pb1;
import p000.un1;
import p000.uy8;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xk7;
import p000.zi3;
import p000.zk7;
import p000.zy8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", m4291f = "SharedSessionRepository.kt", m4292l = {142, 193}, m4293m = "invokeSuspend")
final class SharedSessionRepositoryImpl$appForeground$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1168d f13830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uy8 f13831c;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 */
    @c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", m4291f = "SharedSessionRepository.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C11631 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f13832a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1168d f13833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11631(C1168d c1168d, Continuation continuation) {
            super(2, continuation);
            this.f13833b = c1168d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C11631 c11631 = new C11631(this.f13833b, continuation);
            c11631.f13832a = obj;
            return c11631;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C11631) create((uy8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            uy8 uy8Var = (uy8) this.f13832a;
            C1168d c1168d = this.f13833b;
            zk7 zk7Var = c1168d.f13863f;
            boolean zM6760e = c1168d.m6760e(uy8Var);
            Map mapM25684b = uy8Var.f64545c;
            if (mapM25684b != null) {
                zk7Var.getClass();
                z = false;
                if (!zk7Var.f71686f) {
                    ArrayList<al7> arrayListM19052v = pb1.m19052v(zk7Var.f71681a);
                    ArrayList arrayList = new ArrayList();
                    for (al7 al7Var : arrayListM19052v) {
                        xk7 xk7Var = (xk7) mapM25684b.get(al7Var.f807a);
                        Pair pair = xk7Var != null ? new Pair(al7Var, xk7Var) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        z = true;
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        Pair pair2 = (Pair) it.next();
                        al7 al7Var2 = (al7) pair2.f47623a;
                        xk7 xk7Var2 = (xk7) pair2.f47624b;
                        boolean zM11650l = fa4.m11650l(zk7Var.m25683a(), al7Var2.f807a);
                        int i = al7Var2.f808b;
                        if (zM11650l) {
                            if (i == xk7Var2.f68316a && fa4.m11650l((String) zk7Var.f71684d.getValue(), xk7Var2.f68317b)) {
                                break;
                            }
                        } else {
                            if (i == xk7Var2.f68316a) {
                                break;
                            }
                        }
                    }
                }
                if (z) {
                    Log.d("FirebaseSessions", "Cold app start detected");
                }
            } else {
                Log.d("FirebaseSessions", "No process data map");
                z = true;
            }
            boolean zM6759d = c1168d.m6759d(uy8Var);
            if (z) {
                mapM25684b = zk7Var.m25684b(AbstractC3194a.m15360M());
            } else if (zM6759d) {
                mapM25684b = zk7Var.m25684b(mapM25684b);
            }
            zy8 zy8Var = z ? null : uy8Var.f64543a;
            if (!zM6760e && !z) {
                return zM6759d ? uy8.m23014a(uy8Var, null, null, zk7Var.m25684b(mapM25684b), 3) : uy8Var;
            }
            zy8 zy8VarM10759a = c1168d.f13859b.m10759a(zy8Var);
            C1167c c1167c = c1168d.f13860c;
            wfb.m23926u(vz1.m23619a(c1167c.f13857e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(c1167c, zy8VarM10759a, null), 3);
            zk7Var.f71686f = true;
            return new uy8(zy8VarM10759a, null, mapM25684b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(C1168d c1168d, uy8 uy8Var, Continuation continuation) {
        super(2, continuation);
        this.f13830b = c1168d;
        this.f13831c = uy8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.f13830b, this.f13831c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (com.google.firebase.sessions.C1168d.m6756a(r5, r8, r1, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13829a;
        C1168d c1168d = this.f13830b;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    this = this;
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            DataStore dataStore = c1168d.f13862e;
            C11631 c11631 = new C11631(c1168d, null);
            this.f13829a = 1;
            Object objUpdateData = dataStore.updateData(c11631, this);
            this = objUpdateData;
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e.getMessage());
            uy8 uy8Var = this.f13831c;
            if (c1168d.m6760e(uy8Var)) {
                zy8 zy8VarM10759a = c1168d.f13859b.m10759a(uy8Var.f64543a);
                c1168d.f13865h = uy8.m23014a(uy8Var, zy8VarM10759a, null, null, 4);
                C1167c c1167c = c1168d.f13860c;
                wfb.m23926u(vz1.m23619a(c1167c.f13857e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(c1167c, zy8VarM10759a, null), 3);
                String str = zy8VarM10759a.f72388a;
                SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = SharedSessionRepositoryImpl$NotificationType.FALLBACK;
                this.f13829a = 2;
            }
        }
        return xfa.f68157a;
    }
}
