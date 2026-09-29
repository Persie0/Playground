package com.lingq.core.token;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.token.domain.C1904a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$requestExplain$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {1192, 1203}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$requestExplain$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenPopupData f23668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f23669c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23670d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonCard f23671e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f23672f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$requestExplain$2(TokenPopupData tokenPopupData, C1909e c1909e, String str, LessonCard lessonCard, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f23668b = tokenPopupData;
        this.f23669c = c1909e;
        this.f23670d = str;
        this.f23671e = lessonCard;
        this.f23672f = i;
        this.f23673g = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$requestExplain$2(this.f23668b, this.f23669c, this.f23670d, this.f23671e, this.f23672f, this.f23673g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$requestExplain$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r0 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r0 == r10) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8711b;
        Object objM8711b2;
        String str;
        Object value;
        f5a f5aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23667a;
        C1909e c1909e = this.f23669c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TokenPopupData tokenPopupData = this.f23668b;
            int i2 = tokenPopupData.f23439M;
            LessonCard lessonCard = this.f23671e;
            if (i2 != -1) {
                C1904a c1904a = c1909e.f23904r;
                Integer num = new Integer(tokenPopupData.f23440N);
                String str2 = lessonCard.f19178a;
                String str3 = tokenPopupData.f23446b;
                boolean z = lessonCard.f19182e;
                this.f23667a = 1;
                objM8711b2 = c1904a.m8711b(this.f23670d, i2, num, str2, str3, this.f23672f, this.f23673g, z, this);
            } else {
                C1904a c1904a2 = c1909e.f23904r;
                int i3 = c1909e.f23880R;
                String str4 = lessonCard.f19178a;
                String str5 = tokenPopupData.f23446b;
                boolean z2 = lessonCard.f19182e;
                this.f23667a = 2;
                objM8711b = c1904a2.m8711b(this.f23670d, i3, null, str4, str5, this.f23672f, this.f23673g, z2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM8711b2 = obj;
            str = (String) objM8711b2;
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM8711b = obj;
            str = (String) objM8711b;
        }
        String str6 = str;
        C3244l c3244l = c1909e.f23885W;
        do {
            value = c3244l.getValue();
            f5aVar = (f5a) value;
        } while (!c3244l.m15570h(value, f5a.m11558a(f5aVar, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, str6 == null ? f5aVar.f38491w : str6, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, str6, null, -4194305, 1572861)));
        return xfa.f68157a;
    }
}
