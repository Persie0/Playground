package com.lingq.core.domain.token;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ao0;
import p000.kk8;

/* JADX INFO: renamed from: com.lingq.core.domain.token.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1533a {

    /* JADX INFO: renamed from: a */
    public final ao0 f20096a;

    public C1533a(ao0 ao0Var, int i) {
        ao0Var.getClass();
        switch (i) {
            case 1:
                this.f20096a = ao0Var;
                break;
            default:
                this.f20096a = ao0Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public kk8 m8210a(String str, List list) {
        str.getClass();
        list.getClass();
        return new kk8(new GetCardsForTokensUseCase$invoke$1(list, this, str, Locale.forLanguageTag(str), null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r0).m7118h(r7, r14, r13, r12, r3, r11, r9, r1, r5) == r6) goto L24;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8211b(int i, String str, String str2, TokenMeaning tokenMeaning, int i2, String str3, boolean z, boolean z2, String str4, ContinuationImpl continuationImpl) throws Throwable {
        CreateCardOrUpdateMeaningUseCase$invoke$1 createCardOrUpdateMeaningUseCase$invoke$1;
        String str5;
        boolean z3;
        String str6;
        boolean z4;
        TokenMeaning tokenMeaning2;
        int i3;
        String str7;
        String str8;
        int i4;
        if (continuationImpl instanceof CreateCardOrUpdateMeaningUseCase$invoke$1) {
            createCardOrUpdateMeaningUseCase$invoke$1 = (CreateCardOrUpdateMeaningUseCase$invoke$1) continuationImpl;
            int i5 = createCardOrUpdateMeaningUseCase$invoke$1.f20008l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                createCardOrUpdateMeaningUseCase$invoke$1.f20008l = i5 - Integer.MIN_VALUE;
            } else {
                createCardOrUpdateMeaningUseCase$invoke$1 = new CreateCardOrUpdateMeaningUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createCardOrUpdateMeaningUseCase$invoke$1 = new CreateCardOrUpdateMeaningUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = createCardOrUpdateMeaningUseCase$invoke$1.f20006j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = createCardOrUpdateMeaningUseCase$invoke$1.f20008l;
        ao0 ao0Var = this.f20096a;
        if (i6 != 0) {
            if (i6 == 1) {
                z3 = createCardOrUpdateMeaningUseCase$invoke$1.f20005i;
                z4 = createCardOrUpdateMeaningUseCase$invoke$1.f20004h;
                i3 = createCardOrUpdateMeaningUseCase$invoke$1.f19998b;
                i4 = createCardOrUpdateMeaningUseCase$invoke$1.f19997a;
                str8 = createCardOrUpdateMeaningUseCase$invoke$1.f20003g;
                str7 = createCardOrUpdateMeaningUseCase$invoke$1.f20002f;
                tokenMeaning2 = createCardOrUpdateMeaningUseCase$invoke$1.f20001e;
                str6 = createCardOrUpdateMeaningUseCase$invoke$1.f20000d;
                str5 = createCardOrUpdateMeaningUseCase$invoke$1.f19999c;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i6 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return Boolean.TRUE;
        }
        AbstractC3193b.m15359b(obj);
        createCardOrUpdateMeaningUseCase$invoke$1.f19999c = str;
        createCardOrUpdateMeaningUseCase$invoke$1.f20000d = str2;
        createCardOrUpdateMeaningUseCase$invoke$1.f20001e = tokenMeaning;
        createCardOrUpdateMeaningUseCase$invoke$1.f20002f = str3;
        createCardOrUpdateMeaningUseCase$invoke$1.f20003g = str4;
        createCardOrUpdateMeaningUseCase$invoke$1.f19997a = i;
        createCardOrUpdateMeaningUseCase$invoke$1.f19998b = i2;
        createCardOrUpdateMeaningUseCase$invoke$1.f20004h = z;
        createCardOrUpdateMeaningUseCase$invoke$1.f20005i = z2;
        createCardOrUpdateMeaningUseCase$invoke$1.f20008l = 1;
        Object objM7120j = ((C1287c) ao0Var).m7120j(str, str2, tokenMeaning, createCardOrUpdateMeaningUseCase$invoke$1);
        if (objM7120j != coroutineSingletons) {
            str5 = str;
            z3 = z2;
            str6 = str2;
            z4 = z;
            tokenMeaning2 = tokenMeaning;
            i3 = i2;
            str7 = str3;
            obj = objM7120j;
            str8 = str4;
            i4 = i;
        }
        return coroutineSingletons;
        if (((Boolean) obj).booleanValue()) {
            return Boolean.FALSE;
        }
        createCardOrUpdateMeaningUseCase$invoke$1.f19999c = null;
        createCardOrUpdateMeaningUseCase$invoke$1.f20000d = null;
        createCardOrUpdateMeaningUseCase$invoke$1.f20001e = null;
        createCardOrUpdateMeaningUseCase$invoke$1.f20002f = null;
        createCardOrUpdateMeaningUseCase$invoke$1.f20003g = null;
        createCardOrUpdateMeaningUseCase$invoke$1.f19997a = i4;
        createCardOrUpdateMeaningUseCase$invoke$1.f19998b = i3;
        createCardOrUpdateMeaningUseCase$invoke$1.f20004h = z4;
        createCardOrUpdateMeaningUseCase$invoke$1.f20005i = z3;
        createCardOrUpdateMeaningUseCase$invoke$1.f20008l = 2;
    }
}
