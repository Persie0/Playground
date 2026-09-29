package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1306v;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.un1;
import p000.w3a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$updateTokenCwt$1", m4291f = "ReaderPageViewModel.kt", m4292l = {707}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$updateTokenCwt$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28783c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28784d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f28785e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f28786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$updateTokenCwt$1(C2411m c2411m, String str, int i, int i2, String str2, Continuation continuation) {
        super(2, continuation);
        this.f28782b = c2411m;
        this.f28783c = str;
        this.f28784d = i;
        this.f28785e = i2;
        this.f28786f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$updateTokenCwt$1(this.f28782b, this.f28783c, this.f28784d, this.f28785e, this.f28786f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$updateTokenCwt$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.lingq.feature.reader.old.ReaderPageViewModel$updateTokenCwt$1] */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.lingq.feature.reader.old.ReaderPageViewModel$updateTokenCwt$1] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.lingq.core.data.repository.v] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        C2411m c2411m = this.f28782b;
        LinkedHashMap linkedHashMap = c2411m.f29257y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28781a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                w3a w3aVar = c2411m.f29239j;
                String strMo4589b2 = c2411m.f29223b.mo4589b2();
                int i2 = c2411m.f29248p;
                int i3 = this.f28784d;
                int i4 = this.f28785e;
                this.f28781a = 1;
                r13 = this;
                try {
                    Object objM7379e = ((C1306v) w3aVar).m7379e(strMo4589b2, i2, i3, i4, false, 0, r13);
                    this = objM7379e;
                    if (objM7379e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception unused) {
                    String str = r13.f28786f;
                    cd4 cd4Var = (cd4) linkedHashMap.get(str);
                    if (cd4Var != null) {
                        cd4Var.mo4537a(null);
                    }
                    linkedHashMap.remove(str);
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                this = this;
            }
        } catch (Exception unused2) {
            r13 = this;
        }
        return xfa.f68157a;
    }
}
