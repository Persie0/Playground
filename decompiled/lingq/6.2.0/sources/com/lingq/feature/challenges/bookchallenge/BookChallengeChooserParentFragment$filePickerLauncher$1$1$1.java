package com.lingq.feature.challenges.bookchallenge;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.df0;
import p000.idd;
import p000.ph2;
import p000.t62;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$filePickerLauncher$1$1$1", m4291f = "BookChallengeChooserParentFragment.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
public final class BookChallengeChooserParentFragment$filePickerLauncher$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BookChallengeChooserParentFragment f24515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f24516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookChallengeChooserParentFragment$filePickerLauncher$1$1$1(BookChallengeChooserParentFragment bookChallengeChooserParentFragment, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f24515b = bookChallengeChooserParentFragment;
        this.f24516c = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BookChallengeChooserParentFragment$filePickerLauncher$1$1$1(this.f24515b, this.f24516c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BookChallengeChooserParentFragment$filePickerLauncher$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24514a;
        Uri uri = this.f24516c;
        BookChallengeChooserParentFragment bookChallengeChooserParentFragment = this.f24515b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            C1963x39d53f6e c1963x39d53f6e = new C1963x39d53f6e(bookChallengeChooserParentFragment, uri, null);
            this.f24514a = 1;
            obj = wfb.m23905G(c1963x39d53f6e, t62Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C1972c c1972cM8811A0 = bookChallengeChooserParentFragment.m8811A0();
            String strM13801a = idd.m13801a(bookChallengeChooserParentFragment.m2090R(), uri);
            if (strM13801a == null) {
                strM13801a = "";
            }
            String str = strM13801a;
            c1972cM8811A0.f24551k = bArr;
            C3244l c3244l = c1972cM8811A0.f24549i;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, df0.m10318a((df0) value, null, null, null, null, str, false, null, 0, 999)));
        }
        return xfa.f68157a;
    }
}
