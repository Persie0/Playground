package com.lingq.core.settings;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.settings.reader.C1879a;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e29;
import p000.sz7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$onSelectionItemSelected$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {340, 341, 346}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$onSelectionItemSelected$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22613a;

    /* JADX INFO: renamed from: b */
    public int f22614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1859b f22615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$onSelectionItemSelected$1(C1859b c1859b, Continuation continuation) {
        super(2, continuation);
        this.f22615c = c1859b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$onSelectionItemSelected$1(this.f22615c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$onSelectionItemSelected$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:1: B:28:0x008a->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        ArrayList arrayList;
        e29 e29Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f22614b;
        Object obj2 = null;
        xfa xfaVar = xfa.f68157a;
        C1859b c1859b = this.f22615c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C1879a c1879a = c1859b.f22722d;
            this.f22614b = 1;
            obj = AbstractC3224d.m15541t(((C1368a) c1879a.f23068a).f18371Q0, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i2 == 2) {
            i = this.f22613a;
            AbstractC3193b.m15359b(obj);
            List list = ((sz7) ((C3244l) c1859b.f22738t.f9311a).getValue()).f61674a;
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof e29) {
                    arrayList.add(obj3);
                }
            }
            for (Object obj4 : arrayList) {
                if (((e29) obj4).f36626c == ViewKeys.TTSVoice) {
                    obj2 = obj4;
                    break;
                }
            }
            e29Var = (e29) obj2;
            if (e29Var != null || (str = e29Var.f36627d) == null) {
                str = "";
            }
            ViewKeys viewKeys = ViewKeys.TTSVoice;
            this.f22613a = i;
            this.f22614b = 3;
            obj = C1859b.m8611W2(c1859b, viewKeys, str, this);
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c1859b.f22736r.m15571i((List) obj);
        return xfaVar;
        i = !((Boolean) obj).booleanValue();
        C1879a c1879a2 = c1859b.f22722d;
        this.f22613a = i;
        this.f22614b = 2;
        Object objM7906t0 = ((C1368a) c1879a2.f23068a).m7906t0(i, this);
        if (objM7906t0 != coroutineSingletons) {
            objM7906t0 = xfaVar;
        }
        if (objM7906t0 != coroutineSingletons) {
            List list2 = ((sz7) ((C3244l) c1859b.f22738t.f9311a).getValue()).f61674a;
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (obj3 instanceof e29) {
                    arrayList.add(obj3);
                }
            }
            while (r10.hasNext()) {
                if (((e29) obj4).f36626c == ViewKeys.TTSVoice) {
                    obj2 = obj4;
                    break;
                }
            }
            e29Var = (e29) obj2;
            if (e29Var != null) {
                str = "";
            } else {
                str = "";
            }
            ViewKeys viewKeys2 = ViewKeys.TTSVoice;
            this.f22613a = i;
            this.f22614b = 3;
            obj = C1859b.m8611W2(c1859b, viewKeys2, str, this);
        }
        return coroutineSingletons;
    }
}
