package com.lingq.feature.reader.old;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.ProfileSettings;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.yz7;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setReaderTheme$1", m4291f = "ReaderViewModel.kt", m4292l = {2862, 2865, 2868}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setReaderTheme$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yz7 f29041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setReaderTheme$1(C2412n c2412n, yz7 yz7Var, Continuation continuation) {
        super(2, continuation);
        this.f29040b = c2412n;
        this.f29041c = yz7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setReaderTheme$1(this.f29040b, this.f29041c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$setReaderTheme$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C2412n c2412n = this.f29040b;
        si7 si7Var = c2412n.f29271E;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29039a;
        xfa xfaVar = xfa.f68157a;
        yz7 yz7Var = this.f29041c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LqTheme lqTheme = yz7Var.f70708d;
            this.f29039a = 1;
            if (((C1368a) si7Var).m7882h0(lqTheme, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        str = yz7Var.f70705a;
        this.f29039a = 3;
        if (((C1368a) si7Var).m7859R(str, this) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        km7 km7Var = c2412n.f29418x;
        String lowerCase = yz7Var.f70708d.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 16777215);
        this.f29039a = 2;
        ((C1267a) km7Var).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            str = yz7Var.f70705a;
            this.f29039a = 3;
            if (((C1368a) si7Var).m7859R(str, this) != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
