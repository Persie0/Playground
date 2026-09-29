package com.lingq.feature.chat.domain;

import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import p000.kk8;
import p000.si7;
import p000.sw0;
import p000.zw0;

/* JADX INFO: renamed from: com.lingq.feature.chat.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1996a {

    /* JADX INFO: renamed from: a */
    public final zw0 f25208a;

    /* JADX INFO: renamed from: b */
    public final si7 f25209b;

    public C1996a(zw0 zw0Var, si7 si7Var, int i) {
        zw0Var.getClass();
        si7Var.getClass();
        switch (i) {
            case 1:
                this.f25208a = zw0Var;
                this.f25209b = si7Var;
                break;
            case 2:
                this.f25208a = zw0Var;
                this.f25209b = si7Var;
                break;
            default:
                this.f25208a = zw0Var;
                this.f25209b = si7Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public kk8 m8857a(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new kk8(new AddChatMessageUseCase$invoke$1(this, str, str2, i, str3, null));
    }

    /* JADX INFO: renamed from: b */
    public kk8 m8858b(String str, String str2, sw0 sw0Var, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new kk8(new CreateChatUseCase$invoke$1(sw0Var, str3, this, str, str2, null));
    }

    /* JADX INFO: renamed from: c */
    public kk8 m8859c(String str, String str2, sw0 sw0Var, String str3, LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new kk8(new CreateConfiguredChatUseCase$invoke$1(sw0Var, str3, this, str, str2, lynxChatModel, lynxReasoningEffort, null));
    }
}
