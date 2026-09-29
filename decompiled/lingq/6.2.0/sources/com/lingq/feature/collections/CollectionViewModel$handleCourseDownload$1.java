package com.lingq.feature.collections;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.feature.collections.domain.C2038d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.i78;
import p000.j78;
import p000.k78;
import p000.q91;
import p000.un1;
import p000.v61;
import p000.w61;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$handleCourseDownload$1", m4291f = "CollectionViewModel.kt", m4292l = {300}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$handleCourseDownload$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25386b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryItem f25387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$handleCourseDownload$1(C2034d c2034d, LibraryItem libraryItem, Continuation continuation) {
        super(2, continuation);
        this.f25386b = c2034d;
        this.f25387c = libraryItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$handleCourseDownload$1(this.f25386b, this.f25387c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$handleCourseDownload$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8960a;
        Object value;
        j78 j78Var;
        Object value2;
        i78 i78Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25385a;
        LibraryItem libraryItem = this.f25387c;
        C2034d c2034d = this.f25386b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2038d c2038d = c2034d.f25573d;
            int i2 = libraryItem.f19423X;
            this.f25385a = 1;
            objM8960a = c2038d.m8960a(i2, this);
            if (objM8960a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM8960a = obj;
        }
        k78 k78Var = (k78) objM8960a;
        if (k78Var instanceof i78) {
            C3244l c3244l = c2034d.f25555N;
            do {
                value2 = c3244l.getValue();
                i78Var = (i78) k78Var;
            } while (!c3244l.m15570h(value2, q91.m19806a((q91) value2, null, false, null, new w61(i78Var.f43629a, i78Var.f43630b, libraryItem.f19426a), null, false, false, 239)));
        } else {
            if (!(k78Var instanceof j78)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l2 = c2034d.f25555N;
            do {
                value = c3244l2.getValue();
                j78Var = (j78) k78Var;
            } while (!c3244l2.m15570h(value, q91.m19806a((q91) value, null, false, null, new v61(j78Var.f45161a, j78Var.f45162b, true), null, false, false, 239)));
        }
        return xfa.f68157a;
    }
}
