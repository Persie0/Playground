package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.em6;
import p000.fa4;
import p000.ja5;
import p000.je2;
import p000.op7;
import p000.un1;
import p000.x58;
import p000.xfa;
import p000.y58;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onSaveLesson$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1065, 1090, 1119}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onSaveLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f26549a;

    /* JADX INFO: renamed from: b */
    public int f26550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryItem f26551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2146e f26552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onSaveLesson$1(LibraryItem libraryItem, C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26551c = libraryItem;
        this.f26552d = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onSaveLesson$1(this.f26551c, this.f26552d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onSaveLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r2 == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        if (r0 == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
    
        if (r0.f26686k.m9063b(r1, r2, r3, r23, true) == r6) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        String str;
        Object objM15541t2;
        Object value;
        ja5 ja5Var;
        Object value2;
        ja5 ja5Var2;
        Object value3;
        ja5 ja5Var3;
        Object value4;
        ja5 ja5Var4;
        C2146e c2146e = this.f26552d;
        C3244l c3244l = c2146e.f26658G;
        cma cmaVar = c2146e.f26677b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26550b;
        LibraryItem libraryItem = this.f26551c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (fa4.m11650l(libraryItem.f19418S, Boolean.TRUE)) {
                if (libraryItem.f19423X > 0) {
                    str = libraryItem.f19412M;
                    c83 c83VarMo4574C1 = cmaVar.mo4574C1();
                    this.f26549a = str;
                    this.f26550b = 1;
                    objM15541t2 = AbstractC3224d.m15541t(c83VarMo4574C1, this);
                } else {
                    do {
                        value = c3244l.getValue();
                        ja5Var = (ja5) value;
                    } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, new x58(true, new Integer(libraryItem.f19426a)), null, null, 447), null, null, false, false, false, 2015)));
                }
            } else if (libraryItem.m8087b()) {
                c83 c83VarMo4574C2 = cmaVar.mo4574C1();
                this.f26550b = 2;
                objM15541t = AbstractC3224d.m15541t(c83VarMo4574C2, this);
            } else {
                String strMo4589b2 = cmaVar.mo4589b2();
                Language language = (Language) cmaVar.mo4572B0().getValue();
                int i2 = language != null ? language.f19025b : 0;
                int i3 = libraryItem.f19426a;
                this.f26550b = 3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            str = this.f26549a;
            AbstractC3193b.m15359b(obj);
            objM15541t2 = obj;
            if (fa4.m11650l(str, ((Profile) objM15541t2).f19654c)) {
                do {
                    value = c3244l.getValue();
                    ja5Var = (ja5) value;
                } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, new x58(true, new Integer(libraryItem.f19426a)), null, null, 447), null, null, false, false, false, 2015)));
            } else {
                do {
                    value2 = c3244l.getValue();
                    ja5Var2 = (ja5) value2;
                } while (!c3244l.m15570h(value2, ja5.m14361a(ja5Var2, null, null, false, null, false, je2.m14414a(ja5Var2.f45341f, null, null, null, null, new y58(libraryItem, true), null, null, null, null, 495), null, null, false, false, false, 2015)));
            }
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
            objM15541t = obj;
            int i4 = ((Profile) objM15541t).f19671t;
            int i5 = libraryItem.f19423X;
            int i6 = libraryItem.f19423X;
            if (i4 < i5) {
                do {
                    value4 = c3244l.getValue();
                    ja5Var4 = (ja5) value4;
                } while (!c3244l.m15570h(value4, ja5.m14361a(ja5Var4, null, null, false, null, false, je2.m14414a(ja5Var4.f45341f, null, null, null, new em6(true, i6, i4, libraryItem), null, null, null, null, null, 503), null, null, false, false, false, 2015)));
            } else {
                do {
                    value3 = c3244l.getValue();
                    ja5Var3 = (ja5) value3;
                } while (!c3244l.m15570h(value3, ja5.m14361a(ja5Var3, null, null, false, null, false, je2.m14414a(ja5Var3.f45341f, null, null, new op7(true, i6, i4, libraryItem), null, null, null, null, null, null, 507), null, null, false, false, false, 2015)));
            }
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
