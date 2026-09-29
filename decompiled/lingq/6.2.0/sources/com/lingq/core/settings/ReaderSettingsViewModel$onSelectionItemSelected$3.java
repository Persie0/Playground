package com.lingq.core.settings;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.domain.C1862a;
import com.lingq.core.settings.domain.C1867f;
import com.lingq.core.settings.domain.C1869h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cl9;
import p000.e00;
import p000.oz8;
import p000.rm3;
import p000.un1;
import p000.uz7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$onSelectionItemSelected$3", m4291f = "ReaderSettingsViewModel.kt", m4292l = {374, 375, 376, 381, 386, 387}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$onSelectionItemSelected$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewKeys f22620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1859b f22621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f22622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$onSelectionItemSelected$3(C1859b c1859b, ViewKeys viewKeys, String str, Continuation continuation) {
        super(2, continuation);
        this.f22620b = viewKeys;
        this.f22621c = c1859b;
        this.f22622d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$onSelectionItemSelected$3(this.f22621c, this.f22620b, this.f22622d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$onSelectionItemSelected$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22619a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                int i2 = uz7.f64624a[this.f22620b.ordinal()];
                String str = this.f22622d;
                C1859b c1859b = this.f22621c;
                switch (i2) {
                    case 1:
                        oz8 oz8Var = c1859b.f22727i;
                        e00 e00Var = AudioUnderlineMode.Companion;
                        Integer numM4844a0 = cl9.m4844a0(str);
                        int iIntValue = numM4844a0 != null ? numM4844a0.intValue() : 0;
                        e00Var.getClass();
                        AudioUnderlineMode audioUnderlineModeM10764a = e00.m10764a(iIntValue);
                        this.f22619a = 1;
                        Object objM7873d = ((C1368a) oz8Var.f55331a).m7873d(audioUnderlineModeM10764a, this);
                        if (objM7873d != coroutineSingletons) {
                            objM7873d = xfaVar;
                        }
                        if (objM7873d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 2:
                        rm3 rm3Var = c1859b.f22728j;
                        this.f22619a = 2;
                        rm3Var.getClass();
                        Object objM7880g0 = ((C1368a) rm3Var.f59534a).m7880g0(TextHighlightStyle.valueOf(str), this);
                        if (objM7880g0 != coroutineSingletons) {
                            objM7880g0 = xfaVar;
                        }
                        if (objM7880g0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 3:
                        C1867f c1867f = c1859b.f22729k;
                        String strMo4589b2 = c1859b.f22720b.mo4589b2();
                        this.f22619a = 3;
                        if (c1867f.m8629b(str, strMo4589b2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        C1869h c1869h = c1859b.f22730l;
                        String strMo4589b3 = c1859b.f22720b.mo4589b2();
                        this.f22619a = 4;
                        if (c1869h.m8633b(strMo4589b3, str, false, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        C1869h c1869h2 = c1859b.f22730l;
                        String strMo4589b4 = c1859b.f22720b.mo4589b2();
                        this.f22619a = 5;
                        if (c1869h2.m8633b(strMo4589b4, str, true, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 14:
                        C1862a c1862a = c1859b.f22731m;
                        this.f22619a = 6;
                        if (c1862a.m8617c(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    default:
                        return xfaVar;
                }
            case 1:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 2:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 3:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 4:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
