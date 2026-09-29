package com.lingq.core.token.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.token.TokenPopupData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.an3;
import p000.ao0;
import p000.c32;
import p000.c83;
import p000.e05;
import p000.e83;
import p000.kk8;
import p000.nr2;
import p000.s7b;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetTokenDetailsUseCase$invoke$1", m4291f = "GetTokenDetailsUseCase.kt", m4292l = {24, 26, 28}, m4293m = "invokeSuspend", m4294v = 2)
final class GetTokenDetailsUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23825a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1904a f23827c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23828d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TokenPopupData f23829e;

    /* JADX INFO: renamed from: com.lingq.core.token.domain.GetTokenDetailsUseCase$invoke$1$1 */
    @c32(m4290c = "com.lingq.core.token.domain.GetTokenDetailsUseCase$invoke$1$1", m4291f = "GetTokenDetailsUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19031 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23830a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23831b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e83 f23832c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TokenPopupData f23833d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19031(String str, e83 e83Var, TokenPopupData tokenPopupData, Continuation continuation) {
            super(2, continuation);
            this.f23831b = str;
            this.f23832c = e83Var;
            this.f23833d = tokenPopupData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19031(this.f23831b, this.f23832c, this.f23833d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19031) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23830a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Locale localeForLanguageTag = Locale.forLanguageTag(this.f23831b);
                TokenPopupData tokenPopupData = this.f23833d;
                String str = tokenPopupData.f23446b;
                String value = WordStatus.New.getValue();
                List list = tokenPopupData.f23453i;
                List<String> listM23365A0 = vk9.m23365A0(tokenPopupData.f23445a, new String[]{" "}, 0, 6);
                ArrayList arrayList = new ArrayList(v91.m23189q0(listM23365A0, 10));
                for (String str2 : listM23365A0) {
                    localeForLanguageTag.getClass();
                    arrayList.add(vz1.m23610P(str2, localeForLanguageTag));
                }
                EmptyList emptyList = EmptyList.f47638a;
                e05 e05Var = new e05(str, list, emptyList, emptyList, "", "", value, arrayList);
                this.f23830a = 1;
                if (this.f23832c.emit(e05Var, this) == coroutineSingletons) {
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
    public GetTokenDetailsUseCase$invoke$1(C1904a c1904a, String str, TokenPopupData tokenPopupData, Continuation continuation) {
        super(2, continuation);
        this.f23827c = c1904a;
        this.f23828d = str;
        this.f23829e = tokenPopupData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetTokenDetailsUseCase$invoke$1 getTokenDetailsUseCase$invoke$1 = new GetTokenDetailsUseCase$invoke$1(this.f23827c, this.f23828d, this.f23829e, continuation);
        getTokenDetailsUseCase$invoke$1.f23826b = obj;
        return getTokenDetailsUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetTokenDetailsUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r2, r12, r11) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r2, r12, r11) == r3) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 c83VarM7427f;
        C1904a c1904a = this.f23827c;
        ao0 ao0Var = (ao0) c1904a.f23855a;
        e83 e83Var = (e83) this.f23826b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23825a;
        String str = this.f23828d;
        TokenPopupData tokenPopupData = this.f23829e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str2 = tokenPopupData.f23446b;
            this.f23826b = e83Var;
            this.f23825a = 1;
            obj = ((C1287c) ao0Var).m7116f(str, str2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2 && i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        if (((LessonCard) obj) != null) {
            c83 c83VarM7121k = ((C1287c) ao0Var).m7121k(str, tokenPopupData.f23446b);
            this.f23826b = null;
            this.f23825a = 2;
        } else {
            int i2 = an3.f875a[tokenPopupData.f23447c.ordinal()];
            if (i2 != 1) {
                c83VarM7427f = i2 != 2 ? nr2.f53163a : new kk8(new C19031(str, e83Var, tokenPopupData, null));
            } else {
                c83VarM7427f = ((C1310z) ((s7b) c1904a.f23856b)).m7427f(str, tokenPopupData.f23446b);
            }
            this.f23826b = null;
            this.f23825a = 3;
        }
    }
}
