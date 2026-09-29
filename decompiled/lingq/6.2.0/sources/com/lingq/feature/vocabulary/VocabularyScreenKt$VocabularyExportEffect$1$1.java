package com.lingq.feature.vocabulary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aya;
import p000.c32;
import p000.fa4;
import p000.fya;
import p000.gm5;
import p000.gya;
import p000.hya;
import p000.iya;
import p000.jya;
import p000.kya;
import p000.ui3;
import p000.un1;
import p000.v33;
import p000.xfa;
import p000.yxa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyScreenKt$VocabularyExportEffect$1$1", m4291f = "VocabularyScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyScreenKt$VocabularyExportEffect$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kya f33489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f33490b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33491c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f33492d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f33493e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f33494f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ui3 f33495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyScreenKt$VocabularyExportEffect$1$1(kya kyaVar, Context context, String str, String str2, ui3 ui3Var, String str3, ui3 ui3Var2, Continuation continuation) {
        super(2, continuation);
        this.f33489a = kyaVar;
        this.f33490b = context;
        this.f33491c = str;
        this.f33492d = str2;
        this.f33493e = ui3Var;
        this.f33494f = str3;
        this.f33495g = ui3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyScreenKt$VocabularyExportEffect$1$1(this.f33489a, this.f33490b, this.f33491c, this.f33492d, this.f33493e, this.f33494f, this.f33495g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyScreenKt$VocabularyExportEffect$1$1 vocabularyScreenKt$VocabularyExportEffect$1$1 = (VocabularyScreenKt$VocabularyExportEffect$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyScreenKt$VocabularyExportEffect$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        hya hyaVar = hya.f43221a;
        kya kyaVar = this.f33489a;
        if (!fa4.m11650l(kyaVar, hyaVar) && !fa4.m11650l(kyaVar, gya.f41535a)) {
            boolean z = kyaVar instanceof iya;
            ui3 ui3Var = this.f33493e;
            Context context = this.f33490b;
            if (z) {
                try {
                    Uri uriM20278c = FileProvider.m1991c(0, context, context.getPackageName() + ".provider").m20278c(((iya) kyaVar).f44785a);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/".concat(v33.m23078T(((iya) kyaVar).f44785a)));
                    intent.putExtra("android.intent.extra.STREAM", uriM20278c);
                    intent.addFlags(1);
                    context.startActivity(Intent.createChooser(intent, this.f33491c));
                } catch (Exception unused) {
                    Toast.makeText(context, this.f33492d, 0).show();
                }
                ui3Var.mo0a();
            } else {
                if (!(kyaVar instanceof jya)) {
                    gm5.m12750e();
                    return null;
                }
                Toast.makeText(context, this.f33494f, 1).show();
                fya fyaVar = ((jya) kyaVar).f46411a;
                if (fyaVar.equals(aya.f7674a) || fyaVar.equals(yxa.f70622a)) {
                    this.f33495g.mo0a();
                }
                ui3Var.mo0a();
            }
        }
        return xfa.f68157a;
    }
}
